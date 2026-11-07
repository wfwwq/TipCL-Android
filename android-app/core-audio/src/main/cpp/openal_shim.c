/* openal_shim.c — OpenAL 风格导出的最小转发 shim（自研，M3 骨架）。
 *
 * 目标：给游戏（LWJGL3 openal）提供一个可以稳定命中的 libopenal.so 入口层，
 * 转发到真 OpenAL Soft（openal-soft 官方安卓预编译产物，动态链接，
 * LGPL-2.1 合规见 ../NOTES.md）。
 *
 * 设计：
 * - 惰性加载：首次调用任一入口时 dlopen("libopenal.so")（Android）/
 *   LoadLibraryA("soft_oal.dll" 或 "openal32.dll")（host 自检），
 *   dlsym 解析每个函数指针，之后调用直通。
 * - 降级：真库不可用时进入 STUB 模式——每个入口落到 no-op 实现 +
 *   纯逻辑状态（对象计数、错误码），保证游戏不崩溃、host 自检可跑。
 *   STUB 模式的 alGetString 返回可辨识标识，便于真机日志判定走了哪条路。
 * - 平台隔离：Android 用 dlfcn（-DTIPCL_AUDIO_ANDROID），host（w64devkit）
 *   用 LoadLibraryA/GetProcAddress，其余代码完全共用。
 *
 * TODO(M3): 覆盖面当前为核心 20 函数 + ALC 10 函数；LWJGL openal 实际探活
 *   用到的 alcGetProcAddress/alGetString(AL_EXTENSIONS) 路径需真机联调后补全
 *   （含 ALC_ENUMERATION_EXT、alcGetStringi 设备枚举）。
 */
#include "openal_shim.h"

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#if defined(TIPCL_AUDIO_ANDROID)
#include <dlfcn.h>
#define TIPCL_LIB_HANDLE void*
#define TIPCL_LIB_NULL NULL
#define TIPCL_LIB_OPEN(name) dlopen(name, RTLD_NOW | RTLD_GLOBAL)
#define TIPCL_LIB_SYM(h, name) dlsym(h, name)
#define TIPCL_LIB_CLOSE(h) dlclose(h)
#else
#include <windows.h>
#define TIPCL_LIB_HANDLE HMODULE
#define TIPCL_LIB_NULL NULL
#define TIPCL_LIB_OPEN(name) LoadLibraryA(name)
#define TIPCL_LIB_SYM(h, name) (void*)GetProcAddress(h, name)
#define TIPCL_LIB_CLOSE(h) FreeLibrary(h)
#endif

/* ---------------------------------------------------------------- 状态 */

typedef struct {
    unsigned int gen_sources;   /* STUB 模式累计 alGenSources 计数 */
    unsigned int gen_buffers;   /* STUB 模式累计 alGenBuffers 计数 */
    unsigned int live_sources;
    unsigned int live_buffers;
    ALenum al_error;
    ALCenum alc_error;
    int contexts_alive;
} shim_state;

static shim_state g_shim = { 0, 0, 0, 0, AL_NO_ERROR, ALC_NO_ERROR, 0 };

static TIPCL_LIB_HANDLE g_real_lib = TIPCL_LIB_NULL;
static int g_load_attempted = 0;
static int g_forwarding = 0; /* 1 = 已挂上真 OpenAL Soft，0 = STUB 模式 */

#define SHIM_MAX_OBJECTS 64

/* STUB 模式伪句柄（非 NULL，可辨识，绝不与真库指针混淆）。 */
#define SHIM_STUB_CTX ((ALCcontext*)(uintptr_t)0xC0DEC01)
#define SHIM_STUB_DEV ((ALCdevice*)(uintptr_t)0xC0DEBAD)

static unsigned int g_stub_sources[SHIM_MAX_OBJECTS];
static unsigned int g_stub_buffers[SHIM_MAX_OBJECTS];

static int shim_is_source(ALuint s);

/* ---------------------------------------------------------------- 转发加载 */

#if !defined(TIPCL_AUDIO_ANDROID)
static const char* const HOST_LIB_CANDIDATES[] = { "soft_oal.dll", "openal32.dll" };
#endif

/* 一次性尝试加载真库。返回 1 表示转发模式可用。 */
static int shim_try_load_real(void)
{
    if (g_load_attempted) return g_forwarding;
    g_load_attempted = 1;
#if defined(TIPCL_AUDIO_ANDROID)
    g_real_lib = TIPCL_LIB_OPEN("libopenal.so");
#else
    {
        int i;
        for (i = 0; i < (int)(sizeof(HOST_LIB_CANDIDATES) / sizeof(HOST_LIB_CANDIDATES[0])); i++) {
            g_real_lib = TIPCL_LIB_OPEN(HOST_LIB_CANDIDATES[i]);
            if (g_real_lib != TIPCL_LIB_NULL) break;
        }
    }
#endif
    if (g_real_lib == TIPCL_LIB_NULL) {
        fprintf(stderr, "[openal_shim] real OpenAL Soft not found, entering STUB mode\n");
        return 0;
    }
    g_forwarding = 1;
    return 1;
}

/* 取真库符号；取不到（异常情况）返回 NULL，调用点降级 STUB。 */
static void* shim_real_sym(const char* name)
{
    if (!shim_try_load_real()) return NULL;
    return TIPCL_LIB_SYM(g_real_lib, name);
}

/* ---------------------------------------------------------------- 生成/删除 */

TIPCL_AUDIO_API void AL_APIENTRY alGenBuffers(ALsizei n, ALuint* buffers)
{
    void* fn = shim_real_sym("alGenBuffers");
    if (fn) { ((PFN_ALGENBUFFERS)fn)(n, buffers); return; }
    int i;
    for (i = 0; i < n && g_shim.gen_buffers < SHIM_MAX_OBJECTS; i++) {
        unsigned int name = (unsigned int)(g_shim.gen_buffers + 1);
        g_stub_buffers[g_shim.gen_buffers++] = name;
        if (buffers) buffers[i] = (ALuint)name;
    }
    g_shim.live_buffers += (unsigned int)i;
    if (i < n) g_shim.al_error = AL_OUT_OF_MEMORY;
}

TIPCL_AUDIO_API void AL_APIENTRY alDeleteBuffers(ALsizei n, const ALuint* buffers)
{
    void* fn = shim_real_sym("alDeleteBuffers");
    if (fn) { ((PFN_ALDELETEBUFFERS)fn)(n, buffers); return; }
    (void)n; (void)buffers;
    /* STUB：只做计数递减，不做名册核对（核对留 M3 收尾）。 */
    if (g_shim.live_buffers >= (unsigned int)(n > 0 ? n : 0)) g_shim.live_buffers -= (unsigned int)(n > 0 ? n : 0);
    else g_shim.al_error = AL_INVALID_NAME;
}

TIPCL_AUDIO_API ALboolean AL_APIENTRY alIsBuffer(ALuint buffer)
{
    void* fn = shim_real_sym("alIsBuffer");
    if (fn) return ((PFN_ALISBUFFER)fn)(buffer);
    int i;
    for (i = 0; i < (int)g_shim.gen_buffers; i++)
        if (g_stub_buffers[i] == buffer) return AL_TRUE;
    return AL_FALSE;
}

TIPCL_AUDIO_API void AL_APIENTRY alGenSources(ALsizei n, ALuint* sources)
{
    void* fn = shim_real_sym("alGenSources");
    if (fn) { ((PFN_ALGENSOURCES)fn)(n, sources); return; }
    int i;
    for (i = 0; i < n && g_shim.gen_sources < SHIM_MAX_OBJECTS; i++) {
        unsigned int name = (unsigned int)(g_shim.gen_sources + 1);
        g_stub_sources[g_shim.gen_sources++] = name;
        if (sources) sources[i] = (ALuint)name;
    }
    g_shim.live_sources += (unsigned int)i;
    if (i < n) g_shim.al_error = AL_OUT_OF_MEMORY;
}

TIPCL_AUDIO_API void AL_APIENTRY alDeleteSources(ALsizei n, const ALuint* sources)
{
    void* fn = shim_real_sym("alDeleteSources");
    if (fn) { ((PFN_ALDELETESOURCES)fn)(n, sources); return; }
    (void)n; (void)sources;
    if (g_shim.live_sources >= (unsigned int)(n > 0 ? n : 0)) g_shim.live_sources -= (unsigned int)(n > 0 ? n : 0);
    else g_shim.al_error = AL_INVALID_NAME;
}

TIPCL_AUDIO_API ALboolean AL_APIENTRY alIsSource(ALuint source)
{
    void* fn = shim_real_sym("alIsSource");
    if (fn) return ((PFN_ALISSOURCE)fn)(source);
    int i;
    for (i = 0; i < (int)g_shim.gen_sources; i++)
        if (g_stub_sources[i] == source) return AL_TRUE;
    return AL_FALSE;
}

/* ---------------------------------------------------------------- 缓冲数据 */

TIPCL_AUDIO_API void AL_APIENTRY alBufferData(ALuint buffer, ALenum format,
                                              const ALvoid* data, ALsizei size, ALsizei freq)
{
    void* fn = shim_real_sym("alBufferData");
    if (fn) { ((PFN_ALBUFFERDATA)fn)(buffer, format, data, size, freq); return; }
    /* STUB：校验 format/size 一致性（纯逻辑，host 自检覆盖点）。 */
    int channels = shim_format_channels(format);
    if (channels <= 0) { g_shim.al_error = AL_INVALID_VALUE; return; }
    int bytes_per = shim_format_bytes_per_sample(format);
    ALsizei expect = size / (bytes_per * channels); /* 即帧数，仅做除法合法性校验 */
    (void)expect;
    if (size < 0 || freq <= 0) { g_shim.al_error = AL_INVALID_VALUE; return; }
}

/* ---------------------------------------------------------------- 源播放/队列 */

TIPCL_AUDIO_API void AL_APIENTRY alSourcePlay(ALuint source)
{
    void* fn = shim_real_sym("alSourcePlay");
    if (fn) { ((PFN_ALSOURCEPLAY)fn)(source); return; }
    if (!shim_is_source(source)) { g_shim.al_error = AL_INVALID_NAME; }
}

TIPCL_AUDIO_API void AL_APIENTRY alSourceStop(ALuint source)
{
    void* fn = shim_real_sym("alSourceStop");
    if (fn) { ((PFN_ALSOURCESTOP)fn)(source); return; }
    if (!shim_is_source(source)) g_shim.al_error = AL_INVALID_NAME;
}

TIPCL_AUDIO_API void AL_APIENTRY alSourcePause(ALuint source)
{
    void* fn = shim_real_sym("alSourcePause");
    if (fn) { ((PFN_ALSOURCEPAUSE)fn)(source); return; }
}

TIPCL_AUDIO_API void AL_APIENTRY alSourceRewind(ALuint source)
{
    void* fn = shim_real_sym("alSourceRewind");
    if (fn) { ((PFN_ALSOURCEREWIND)fn)(source); return; }
}

TIPCL_AUDIO_API void AL_APIENTRY alSourceQueueBuffers(ALuint source, ALsizei n, const ALuint* buffers)
{
    void* fn = shim_real_sym("alSourceQueueBuffers");
    if (fn) { ((PFN_ALSOURCEQUEUEBUFFERS)fn)(source, n, buffers); return; }
    /* STUB：流式播放路径占位；队列状态机（processed 计数）留 M3 收尾。 */
    (void)source; (void)n; (void)buffers;
}

TIPCL_AUDIO_API void AL_APIENTRY alSourceUnqueueBuffers(ALuint source, ALsizei n, ALuint* buffers)
{
    void* fn = shim_real_sym("alSourceUnqueueBuffers");
    if (fn) { ((PFN_ALSOURCEUNQUEUEBUFFERS)fn)(source, n, buffers); return; }
    (void)source; (void)n; (void)buffers;
}

/* ---------------------------------------------------------------- 源/听者属性 */

TIPCL_AUDIO_API void AL_APIENTRY alSourcei(ALuint source, ALenum param, ALint value)
{
    void* fn = shim_real_sym("alSourcei");
    if (fn) { ((PFN_ALSOURCEI)fn)(source, param, value); return; }
    (void)param; (void)value;
    if (!shim_is_source(source)) g_shim.al_error = AL_INVALID_NAME;
}

TIPCL_AUDIO_API void AL_APIENTRY alSourcef(ALuint source, ALenum param, ALfloat value)
{
    void* fn = shim_real_sym("alSourcef");
    if (fn) { ((PFN_ALSOURCEF)fn)(source, param, value); return; }
    (void)param; (void)value;
    if (!shim_is_source(source)) g_shim.al_error = AL_INVALID_NAME;
}

TIPCL_AUDIO_API void AL_APIENTRY alSource3f(ALuint source, ALenum param, ALfloat v1, ALfloat v2, ALfloat v3)
{
    void* fn = shim_real_sym("alSource3f");
    if (fn) { ((PFN_ALSOURCE3F)fn)(source, param, v1, v2, v3); return; }
    (void)param; (void)v1; (void)v2; (void)v3;
}

TIPCL_AUDIO_API void AL_APIENTRY alGetSourcei(ALuint source, ALenum param, ALint* value)
{
    void* fn = shim_real_sym("alGetSourcei");
    if (fn) { ((PFN_ALGETSOURCEI)fn)(source, param, value); return; }
    if (!shim_is_source(source)) { g_shim.al_error = AL_INVALID_NAME; return; }
    if (value) *value = 0; /* STUB：SOURCE_STATE 一律 0（待 M3 状态机） */
}

TIPCL_AUDIO_API void AL_APIENTRY alGetSourcef(ALuint source, ALenum param, ALfloat* value)
{
    void* fn = shim_real_sym("alGetSourcef");
    if (fn) { ((PFN_ALGETSOURCEF)fn)(source, param, value); return; }
    if (value) *value = 0.0f;
}

TIPCL_AUDIO_API void AL_APIENTRY alListenerf(ALenum param, ALfloat value)
{
    void* fn = shim_real_sym("alListenerf");
    if (fn) { ((PFN_ALLISTENERF)fn)(param, value); return; }
    (void)param; (void)value;
}

TIPCL_AUDIO_API void AL_APIENTRY alListener3f(ALenum param, ALfloat v1, ALfloat v2, ALfloat v3)
{
    void* fn = shim_real_sym("alListener3f");
    if (fn) { ((PFN_ALLISTENER3F)fn)(param, v1, v2, v3); return; }
    (void)param; (void)v1; (void)v2; (void)v3;
}

TIPCL_AUDIO_API void AL_APIENTRY alListenerfv(ALenum param, const ALfloat* values)
{
    void* fn = shim_real_sym("alListenerfv");
    if (fn) { ((PFN_ALLISTENERFV)fn)(param, values); return; }
    (void)param; (void)values;
}

/* ---------------------------------------------------------------- 全局/查询 */

TIPCL_AUDIO_API ALenum AL_APIENTRY alGetError(void)
{
    void* fn = shim_real_sym("alGetError");
    if (fn) return ((PFN_ALGETERROR)fn)();
    ALenum e = g_shim.al_error;
    g_shim.al_error = AL_NO_ERROR;
    return e;
}

TIPCL_AUDIO_API const ALchar* AL_APIENTRY alGetString(ALenum param)
{
    void* fn = shim_real_sym("alGetString");
    if (fn) return ((PFN_ALGETSTRING)fn)(param);
    if (param == AL_VERSION) return "TipCL openal_shim STUB 0.1 (no real OpenAL Soft)";
    if (param == AL_RENDERER) return "TipCL openal_shim";
    if (param == AL_VENDOR) return "TipCL Project";
    if (param == AL_EXTENSIONS) return "";
    return NULL;
}

TIPCL_AUDIO_API ALboolean AL_APIENTRY alIsExtensionPresent(const ALchar* extname)
{
    void* fn = shim_real_sym("alIsExtensionPresent");
    if (fn) return ((PFN_ALISEXTENSIONPRESENT)fn)(extname);
    (void)extname;
    return AL_FALSE; /* STUB：不宣称任何扩展 */
}

TIPCL_AUDIO_API void* AL_APIENTRY alGetProcAddress(const ALchar* fname)
{
    void* fn = shim_real_sym("alGetProcAddress");
    if (fn) return ((PFN_ALGETPROCADDRESS)fn)(fname);
    (void)fname;
    return NULL; /* STUB：扩展入口一律不可取 */
}

TIPCL_AUDIO_API void AL_APIENTRY alDopplerFactor(ALfloat value)
{
    void* fn = shim_real_sym("alDopplerFactor");
    if (fn) { ((PFN_ALDOPPLERFACTOR)fn)(value); return; }
    (void)value;
}

TIPCL_AUDIO_API void AL_APIENTRY alDistanceModel(ALenum model)
{
    void* fn = shim_real_sym("alDistanceModel");
    if (fn) { ((PFN_ALDISTANCEMODEL)fn)(model); return; }
    (void)model;
}

TIPCL_AUDIO_API void AL_APIENTRY alGetBufferi(ALuint buffer, ALenum param, ALint* value)
{
    void* fn = shim_real_sym("alGetBufferi");
    if (fn) { ((PFN_ALGETBUFFERI)fn)(buffer, param, value); return; }
    if (value) *value = 0;
}

/* ---------------------------------------------------------------- ALC 设备/上下文 */

TIPCL_AUDIO_API ALCcontext* AL_APIENTRY alcCreateContext(ALCdevice* device, const ALCint* attrlist)
{
    void* fn = shim_real_sym("alcCreateContext");
    if (fn) return ((PFN_ALCCREATECONTEXT)fn)(device, attrlist);
    (void)device; (void)attrlist;
    g_shim.contexts_alive++;
    /* STUB：返回非 NULL 伪句柄，让上层"成功"走完初始化路径。 */
    return SHIM_STUB_CTX;
}

TIPCL_AUDIO_API ALCboolean AL_APIENTRY alcMakeContextCurrent(ALCcontext* context)
{
    void* fn = shim_real_sym("alcMakeContextCurrent");
    if (fn) return ((PFN_ALCMAKECONTEXTCURRENT)fn)(context);
    return context != NULL ? ALC_TRUE : ALC_FALSE;
}

TIPCL_AUDIO_API void AL_APIENTRY alcDestroyContext(ALCcontext* context)
{
    void* fn = shim_real_sym("alcDestroyContext");
    if (fn) { ((PFN_ALCDESTROYCONTEXT)fn)(context); return; }
    if (g_shim.contexts_alive > 0) g_shim.contexts_alive--;
}

TIPCL_AUDIO_API ALCdevice* AL_APIENTRY alcOpenDevice(const ALCchar* devicename)
{
    void* fn = shim_real_sym("alcOpenDevice");
    if (fn) return ((PFN_ALCOPENDEVICE)fn)(devicename);
    (void)devicename;
    /* STUB：返回伪设备句柄（真机联调时 STUB 应被真库取代）。 */
    return SHIM_STUB_DEV;
}

TIPCL_AUDIO_API ALCboolean AL_APIENTRY alcCloseDevice(ALCdevice* device)
{
    void* fn = shim_real_sym("alcCloseDevice");
    if (fn) return ((PFN_ALCCLOSEDEVICE)fn)(device);
    return ALC_TRUE;
}

TIPCL_AUDIO_API ALCenum AL_APIENTRY alcGetError(ALCdevice* device)
{
    void* fn = shim_real_sym("alcGetError");
    if (fn) return ((PFN_ALCGETERROR)fn)(device);
    ALCenum e = g_shim.alc_error;
    g_shim.alc_error = ALC_NO_ERROR;
    return e;
}

TIPCL_AUDIO_API const ALCchar* AL_APIENTRY alcGetString(ALCdevice* device, ALCenum param)
{
    void* fn = shim_real_sym("alcGetString");
    if (fn) return ((PFN_ALCGETSTRING)fn)(device, param);
    if (param == ALC_DEVICE_SPECIFIER) return "TipCL openal_shim STUB Device";
    return NULL;
}

TIPCL_AUDIO_API void AL_APIENTRY alcGetIntegerv(ALCdevice* device, ALCenum param, ALCsizei size, ALCint* values)
{
    void* fn = shim_real_sym("alcGetIntegerv");
    if (fn) { ((PFN_ALCGETINTEGERV)fn)(device, param, size, values); return; }
    (void)device; (void)param;
    if (values && size > 0) memset(values, 0, (size_t)size * sizeof(ALCint));
}

TIPCL_AUDIO_API void AL_APIENTRY alcProcessContext(ALCcontext* context)
{
    void* fn = shim_real_sym("alcProcessContext");
    if (fn) { ((PFN_ALCPROCESSCONTEXT)fn)(context); return; }
}

TIPCL_AUDIO_API void AL_APIENTRY alcSuspendContext(ALCcontext* context)
{
    void* fn = shim_real_sym("alcSuspendContext");
    if (fn) { ((PFN_ALCSUSPENDCONTEXT)fn)(context); return; }
}

/* ---------------------------------------------------------------- 内部辅助 */

/* 此处起为内部辅助：format 表 + 伪句柄判定（host 自检覆盖点）。 */

int shim_format_channels(ALenum format)
{
    switch (format) {
    case AL_FORMAT_MONO8: case AL_FORMAT_MONO16: case AL_FORMAT_MONO_FLOAT32:
        return 1;
    case AL_FORMAT_STEREO8: case AL_FORMAT_STEREO16: case AL_FORMAT_STEREO_FLOAT32:
        return 2;
    case AL_FORMAT_QUAD8: case AL_FORMAT_QUAD16:
        return 4;
    case AL_FORMAT_51CHN8: case AL_FORMAT_51CHN16:
        return 6;
    default:
        return -1; /* 未知格式：调用点报 AL_INVALID_VALUE */
    }
}

int shim_format_bytes_per_sample(ALenum format)
{
    switch (format) {
    case AL_FORMAT_MONO8: case AL_FORMAT_STEREO8: case AL_FORMAT_QUAD8: case AL_FORMAT_51CHN8:
        return 1;
    case AL_FORMAT_MONO16: case AL_FORMAT_STEREO16: case AL_FORMAT_QUAD16: case AL_FORMAT_51CHN16:
        return 2;
    case AL_FORMAT_MONO_FLOAT32: case AL_FORMAT_STEREO_FLOAT32:
        return 4;
    default:
        return 1;
    }
}

static int shim_is_source(ALuint s)
{
    int i;
    for (i = 0; i < (int)g_shim.gen_sources; i++)
        if (g_stub_sources[i] == s) return 1;
    return 0;
}

/* 供 host 自检穿透 STUB 计数（非导出面，头文件有原型）。 */

/* 诊断面板：host 自检 / 真机日志用（非 OpenAL 导出）。 */
void openal_shim_diag(unsigned int* gen_sources, unsigned int* gen_buffers,
                      int* forwarding, int* contexts_alive)
{
    if (gen_sources) *gen_sources = g_shim.gen_sources;
    if (gen_buffers) *gen_buffers = g_shim.gen_buffers;
    if (forwarding) *forwarding = g_forwarding;
    if (contexts_alive) *contexts_alive = g_shim.contexts_alive;
}
