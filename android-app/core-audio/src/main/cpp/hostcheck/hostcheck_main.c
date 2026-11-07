/* hostcheck_main.c — openal_shim host 自检（两种模式）。
 *
 * 默认（无参数）：STUB 模式，在无真 OpenAL Soft 的 host 上跑纯逻辑自检：
 * - 对象生成/删除/判活计数（alGenSources/alGenBuffers/alIsSource/alIsBuffer）
 * - alBufferData 格式/参数校验（错误码语义）
 * - ALC 伪设备/伪上下文生命周期
 * - 错误码 get-and-clear 语义
 * - format 辅助表
 *
 * --with-real-lib：真库直通模式。hostcheck.exe 运行时 PATH 上须能找到
 * soft_oal.dll（openal-soft 官方 Windows 预编译，见 tools/openal-cache/），
 * shim 会 LoadLibraryA 挂上真库，逐入口验证转发语义（错误码、对象判活、
 * 播放状态均来自真库而非 STUB 计数）。
 */
#include <assert.h>
#include <stdio.h>
#include <string.h>
#if defined(_WIN32)
#include <windows.h>
#endif

#include "../openal_shim.h"

/* 本测试自用的常量（避免为此扩充公共头） */
#define HC_AL_STOPPED 0x1012
#define HC_AL_PLAYING 0x1013
#define HC_AL_BUFFERS_QUEUED 0x1015
#define HC_AL_BUFFERS_PROCESSED 0x1016

static int run_real_suite(void)
{
    setvbuf(stdout, NULL, _IONBF, 0); /* 断言中止时不丢已打印的诊断 */
    /* 0. 确认 shim 真的挂上了真库（diag 本身不触发惰性加载，须先有 AL 调用） */
    alDopplerFactor(1.0f); /* 触发 shim 惰性加载真库 */
    {
        unsigned int gs = 0, gb = 0;
        int fwd = -1, ca = -1;
        openal_shim_diag(&gs, &gb, &fwd, &ca);
        if (fwd != 1) {
            printf("[hostcheck] real-lib mode: soft_oal.dll NOT loaded "
                   "(fwd=%d). Put openal-cache\\...\\bin\\Win64 on PATH.\n", fwd);
            return 2;
        }
    }

    /* 2. ALC：真设备/真上下文（真库 alGetString 需先有 current context，
     *    无上下文时返回 NULL——这是规范行为，STUB 则恒有值，本身即差异点） */
    ALCdevice* dev = alcOpenDevice(NULL);
    assert(dev != NULL);
    assert(alcGetError(dev) == ALC_NO_ERROR);
    const ALCchar* devname = alcGetString(dev, ALC_DEVICE_SPECIFIER);
    printf("[hostcheck][real] ALC device = %s\n", devname ? devname : "(null)");
    assert(devname && !strstr(devname, "STUB"));
    ALCcontext* ctx = alcCreateContext(dev, NULL);
    assert(ctx != NULL);
    assert(alcMakeContextCurrent(ctx) == ALC_TRUE);
    alcProcessContext(ctx);
    assert(alGetError() == AL_NO_ERROR);

    /* 1. 版本串来自真库：不含 STUB 标识 */
    const char* ver = alGetString(AL_VERSION);
    printf("[hostcheck][real] AL_VERSION = %s (alErr=0x%04X)\n",
           ver ? ver : "(null)", (unsigned)alGetError());
    assert(ver && (strstr(ver, "ALSOFT") || strstr(ver, "OpenAL")));
    assert(!strstr(ver, "TipCL openal_shim STUB"));
    const char* vendor = alGetString(AL_VENDOR);
    printf("[hostcheck][real] AL_VENDOR  = %s\n", vendor ? vendor : "(null)");
    assert(vendor && strstr(vendor, "OpenAL"));

    /* 3. 生成 16 个 buffer，真库不报错；填充数据后回读真库语义 */
    ALuint buf[16];
    int i;
    alGenBuffers(16, buf);
    assert(alGetError() == AL_NO_ERROR);
    for (i = 0; i < 16; i++) assert(buf[i] != 0);
    for (i = 0; i < 16; i++) assert(alIsBuffer(buf[i]) == AL_TRUE);
    /* 未生成句柄来自真库的判活 */
    assert(alIsBuffer(0xDEADBEEF) == AL_FALSE);
    short pcm[64];
    memset(pcm, 0, sizeof(pcm));
    alBufferData(buf[0], AL_FORMAT_MONO16, pcm, (ALsizei)sizeof(pcm), 22050);
    assert(alGetError() == AL_NO_ERROR);
    alBufferData(buf[0], 0x9999 /* 未知 format */, pcm, (ALsizei)sizeof(pcm), 22050);
    /* 真库语义差异：未知 format 报 AL_INVALID_ENUM（0xA002）；
     * STUB 降级实现报 AL_INVALID_VALUE——已在 NOTES.md 记为直通差异点。 */
    assert(alGetError() == AL_INVALID_ENUM); /* 来自真库 */
    alGetBufferi(buf[0], 0x2004 /* AL_SIZE */, &i);
    assert(alGetError() == AL_NO_ERROR);
    assert(i == (int)sizeof(pcm)); /* 真库记录了真实数据大小 */
    alDeleteBuffers(16, buf);
    assert(alGetError() == AL_NO_ERROR);
    alDeleteBuffers(1, buf); /* 重复删除 */
    assert(alGetError() == AL_INVALID_NAME); /* 真库语义 */
    assert(alIsBuffer(buf[0]) == AL_FALSE);

    /* 4. 源：生成/播放/状态/队列，全部走真库 */
    ALuint src = 0;
    alGenSources(1, &src);
    assert(alGetError() == AL_NO_ERROR);
    assert(src != 0);
    assert(alIsSource(src) == AL_TRUE);
    alSourcei(src, AL_SOURCE_RELATIVE, 1);
    assert(alGetError() == AL_NO_ERROR);
    alSourcef(src, 0x100D /* AL_GAIN */, 1.0f);
    assert(alGetError() == AL_NO_ERROR);

    ALuint b1 = 0, b2 = 0;
    ALint q = 0;
    ALint state = -1;
    alGenBuffers(1, &b1);
    alBufferData(b1, AL_FORMAT_MONO16, pcm, (ALsizei)sizeof(pcm), 22050);
    assert(alGetError() == AL_NO_ERROR);
    alSourceQueueBuffers(src, 1, &b1);
    assert(alGetError() == AL_NO_ERROR);
    alGetSourcei(src, HC_AL_BUFFERS_QUEUED, &q);
    assert(q == 1); /* 真库队列状态机（STUB 恒 0） */
    alSourcePlay(src);
    assert(alGetError() == AL_NO_ERROR);
    alGetSourcei(src, 0x1010 /* AL_SOURCE_STATE */, &state);
    assert(alGetError() == AL_NO_ERROR);
    printf("[hostcheck][real] AL_SOURCE_STATE after play = 0x%04X\n", state);
    assert(state == HC_AL_PLAYING || state == HC_AL_STOPPED || state == 0x1011 /* AL_INITIAL */);
    alSourceStop(src);
    alSourceUnqueueBuffers(src, 1, &b2);
    assert(alGetError() == AL_NO_ERROR);
    assert(b2 == b1); /* 真库回吐了队列里的 buffer */
    alGetSourcei(src, HC_AL_BUFFERS_PROCESSED, &q);
    assert(alGetError() == AL_NO_ERROR);
    /* 未生成源上的操作 -> 真库 AL_INVALID_NAME */
    alSourcePlay(0xDEAD);
    assert(alGetError() == AL_INVALID_NAME);
    alDeleteSources(1, &src);
    assert(alGetError() == AL_NO_ERROR);
    assert(alIsSource(src) == AL_FALSE);

    /* 5. 扩展探活走真库（真库宣称的扩展远多于 STUB 的空集） */
    assert(alIsExtensionPresent("AL_EXT_float32") == AL_TRUE);
    assert(alGetProcAddress("alBufferDataStatic") != NULL);

    /* 6. 诊断面板：forwarding==1，STUB 计数不再增长 */
    {
        unsigned int gs = 0, gb = 0;
        int fwd = -1, ca = -1;
        openal_shim_diag(&gs, &gb, &fwd, &ca);
        assert(fwd == 1);
        assert(gs == 0 && gb == 0); /* 转发模式下 STUB 计数不动 */
    }

    alcSuspendContext(ctx);
    alcDestroyContext(ctx);
    assert(alcCloseDevice(dev) == ALC_TRUE);
    printf("[hostcheck] openal_shim real-lib pass-through: ALL PASSED\n");
    return 0;
}

static int run_stub_suite(void)
{
    /* 1. STUB 模式下 alGetString 版本串可辨识 */
    const char* ver = alGetString(AL_VERSION);
    assert(ver && strstr(ver, "TipCL openal_shim STUB"));

    /* 2. ALC 伪设备/上下文生命周期 */
    ALCdevice* dev = alcOpenDevice(NULL);
    assert(dev != NULL);
    assert(alcGetError(dev) == ALC_NO_ERROR);
    ALCcontext* ctx = alcCreateContext(dev, NULL);
    assert(ctx != NULL);
    assert(alcMakeContextCurrent(ctx) == ALC_TRUE);
    alcProcessContext(ctx);
    alcDestroyContext(ctx);
    assert(alcCloseDevice(dev) == ALC_TRUE);

    /* 3. 源生成/判活/删除 */
    ALuint src[4] = { 0, 0, 0, 0 };
    alGenSources(4, src);
    for (int i = 0; i < 4; i++) assert(src[i] != 0);
    assert(alIsSource(src[0]) == AL_TRUE);
    assert(alIsSource(0xDEAD) == AL_FALSE);
    alSourcePlay(src[0]);
    alSourcei(src[0], AL_SOURCE_RELATIVE, 1);
    alSourcef(src[0], 0x100D /* AL_GAIN */, 1.0f);
    ALint v = -1;
    alGetSourcei(src[0], 0x1010 /* AL_SOURCE_STATE */, &v);
    assert(v == 0);
    /* 未生成源上的操作 -> AL_INVALID_NAME */
    alSourcePlay(0xDEAD);
    assert(alGetError() == AL_INVALID_NAME);
    alDeleteSources(4, src);

    /* 4. 缓冲生成/判活 */
    ALuint buf[2] = { 0, 0 };
    alGenBuffers(2, buf);
    assert(buf[0] != 0 && buf[1] != 0);
    assert(alIsBuffer(buf[1]) == AL_TRUE);
    assert(alIsBuffer(0xBEEF) == AL_FALSE);

    /* 5. alBufferData 参数校验 */
    short pcm[64];
    memset(pcm, 0, sizeof(pcm));
    alBufferData(buf[0], AL_FORMAT_MONO16, pcm, (ALsizei)sizeof(pcm), 22050);
    assert(alGetError() == AL_NO_ERROR);
    alBufferData(buf[0], 0x9999 /* 未知格式 */, pcm, (ALsizei)sizeof(pcm), 22050);
    assert(alGetError() == AL_INVALID_VALUE);
    alBufferData(buf[0], AL_FORMAT_STEREO16, pcm, (ALsizei)sizeof(pcm), 0);
    assert(alGetError() == AL_INVALID_VALUE);
    alDeleteBuffers(2, buf);

    /* 6. format 辅助表 */
    assert(shim_format_channels(AL_FORMAT_MONO16) == 1);
    assert(shim_format_channels(AL_FORMAT_STEREO8) == 2);
    assert(shim_format_channels(AL_FORMAT_QUAD16) == 4);
    assert(shim_format_channels(AL_FORMAT_51CHN16) == 6);
    assert(shim_format_channels(0x9999) == -1);
    assert(shim_format_bytes_per_sample(AL_FORMAT_MONO_FLOAT32) == 4);
    assert(shim_format_bytes_per_sample(AL_FORMAT_STEREO16) == 2);

    /* 7. 流式路径入口不崩 */
    alSourceQueueBuffers(src[0], 0, NULL);
    alSourceUnqueueBuffers(src[0], 0, NULL);
    alListener3f(0x1004 /* AL_POSITION */, 0.0f, 0.0f, 0.0f);
    alDopplerFactor(1.0f);
    alDistanceModel(0xD003 /* AL_LINEAR_DISTANCE_CLAMPED */);
    assert(alIsExtensionPresent("ALC_ENUMERATION_EXT") == AL_FALSE);
    assert(alGetProcAddress("alBufferSubDataSOFT") == NULL);

    /* 8. 诊断面板 */
    unsigned int gs = 0, gb = 0;
    int fwd = -1, ca = -1;
    openal_shim_diag(&gs, &gb, &fwd, &ca);
    assert(gs == 4 && gb == 2);
    assert(fwd == 0); /* host 无真库 -> STUB 模式 */

    printf("[hostcheck] openal_shim STUB-mode pure logic: ALL PASSED\n");
    return 0;
}

int main(int argc, char** argv)
{
    if (argc > 1 && strcmp(argv[1], "--with-real-lib") == 0)
        return run_real_suite();
    return run_stub_suite();
}
