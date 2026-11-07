/* openal_shim.h — OpenAL 风格最小 shim 的类型与导出面。
 *
 * 类型定义按 OpenAL 1.1 规范（openal-soft 的 AL/alc.h 同名类型子集），
 * 自带最小 typedef，不 include 上游头（本模块不携带 openal-soft 源码，
 * 只动态链接其发布产物）。
 */
#ifndef TIPCL_OPENAL_SHIM_H
#define TIPCL_OPENAL_SHIM_H

#include <stdint.h>

#if defined(_WIN32) && !defined(TIPCL_AUDIO_STATIC)
#define TIPCL_AUDIO_API __declspec(dllexport)
#else
#define TIPCL_AUDIO_API __attribute__((visibility("default")))
#endif

/* ---- AL/ALC 基础类型（OpenAL 1.1 规范子集） ---- */
typedef int ALint;
typedef unsigned int ALuint;
typedef int ALsizei;
typedef unsigned int ALenum;
typedef float ALfloat;
typedef char ALboolean;
typedef char ALchar;
typedef int ALCint;
typedef unsigned int ALCuint;
typedef int ALCsizei;
typedef unsigned int ALCenum;
typedef char ALCboolean;
typedef char ALCchar;
typedef void ALvoid;

typedef struct ALCcontext ALCcontext;
typedef struct ALCdevice ALCdevice;

/* ---- 常量（openal-soft AL/alc.h 同名值） ---- */
#define AL_FALSE 0
#define AL_TRUE 1
#define AL_NO_ERROR 0
#define AL_INVALID_NAME 0xA001
#define AL_INVALID_ENUM 0xA002
#define AL_INVALID_VALUE 0xA003
#define AL_INVALID_OPERATION 0xA004
#define AL_OUT_OF_MEMORY 0xA005
/* 真库语义：AL_VENDOR=0xB001 / AL_VERSION=0xB002 / AL_RENDERER=0xB003 /
 * AL_EXTENSIONS=0xB004（openal-soft AL/al.h 同名值；0xB3xx 段不是这些枚举）。 */
#define AL_VERSION 0xB002
#define AL_RENDERER 0xB003
#define AL_VENDOR 0xB001
#define AL_EXTENSIONS 0xB004
#define AL_SOURCE_RELATIVE 0x202

#define AL_FORMAT_MONO8 0x1100
#define AL_FORMAT_MONO16 0x1101
#define AL_FORMAT_STEREO8 0x1102
#define AL_FORMAT_STEREO16 0x1103
#define AL_FORMAT_MONO_FLOAT32 0x1104
#define AL_FORMAT_STEREO_FLOAT32 0x1105
#define AL_FORMAT_QUAD8 0x1204
#define AL_FORMAT_QUAD16 0x1205
#define AL_FORMAT_51CHN8 0x120A
#define AL_FORMAT_51CHN16 0x120B

#define ALC_FALSE 0
#define ALC_TRUE 1
#define ALC_NO_ERROR 0
#define ALC_INVALID_DEVICE 0xA001
#define ALC_INVALID_CONTEXT 0xA002
#define ALC_INVALID_ENUM 0xA003
#define ALC_INVALID_VALUE 0xA004
#define ALC_OUT_OF_MEMORY 0xA005
#define ALC_DEVICE_SPECIFIER 0x1005
#define ALC_DEFAULT_DEVICE_SPECIFIER 0x1004

#ifndef AL_APIENTRY
#if defined(_WIN32)
#define AL_APIENTRY __cdecl
#else
#define AL_APIENTRY
#endif
#endif

/* ---- 真库函数指针类型（转发用） ---- */
typedef void (AL_APIENTRY *PFN_ALGENBUFFERS)(ALsizei, ALuint*);
typedef void (AL_APIENTRY *PFN_ALDELETEBUFFERS)(ALsizei, const ALuint*);
typedef ALboolean (AL_APIENTRY *PFN_ALISBUFFER)(ALuint);
typedef void (AL_APIENTRY *PFN_ALGENSOURCES)(ALsizei, ALuint*);
typedef void (AL_APIENTRY *PFN_ALDELETESOURCES)(ALsizei, const ALuint*);
typedef ALboolean (AL_APIENTRY *PFN_ALISSOURCE)(ALuint);
typedef void (AL_APIENTRY *PFN_ALBUFFERDATA)(ALuint, ALenum, const ALvoid*, ALsizei, ALsizei);
typedef void (AL_APIENTRY *PFN_ALSOURCEPLAY)(ALuint);
typedef void (AL_APIENTRY *PFN_ALSOURCESTOP)(ALuint);
typedef void (AL_APIENTRY *PFN_ALSOURCEPAUSE)(ALuint);
typedef void (AL_APIENTRY *PFN_ALSOURCEREWIND)(ALuint);
typedef void (AL_APIENTRY *PFN_ALSOURCEQUEUEBUFFERS)(ALuint, ALsizei, const ALuint*);
typedef void (AL_APIENTRY *PFN_ALSOURCEUNQUEUEBUFFERS)(ALuint, ALsizei, ALuint*);
typedef void (AL_APIENTRY *PFN_ALSOURCEI)(ALuint, ALenum, ALint);
typedef void (AL_APIENTRY *PFN_ALSOURCEF)(ALuint, ALenum, ALfloat);
typedef void (AL_APIENTRY *PFN_ALSOURCE3F)(ALuint, ALenum, ALfloat, ALfloat, ALfloat);
typedef void (AL_APIENTRY *PFN_ALGETSOURCEI)(ALuint, ALenum, ALint*);
typedef void (AL_APIENTRY *PFN_ALGETSOURCEF)(ALuint, ALenum, ALfloat*);
typedef void (AL_APIENTRY *PFN_ALLISTENERF)(ALenum, ALfloat);
typedef void (AL_APIENTRY *PFN_ALLISTENER3F)(ALenum, ALfloat, ALfloat, ALfloat);
typedef void (AL_APIENTRY *PFN_ALLISTENERFV)(ALenum, const ALfloat*);
typedef ALenum (AL_APIENTRY *PFN_ALGETERROR)(void);
typedef const ALchar* (AL_APIENTRY *PFN_ALGETSTRING)(ALenum);
typedef ALboolean (AL_APIENTRY *PFN_ALISEXTENSIONPRESENT)(const ALchar*);
typedef void* (AL_APIENTRY *PFN_ALGETPROCADDRESS)(const ALchar*);
typedef void (AL_APIENTRY *PFN_ALDOPPLERFACTOR)(ALfloat);
typedef void (AL_APIENTRY *PFN_ALDISTANCEMODEL)(ALenum);
typedef void (AL_APIENTRY *PFN_ALGETBUFFERI)(ALuint, ALenum, ALint*);
typedef ALCcontext* (AL_APIENTRY *PFN_ALCCREATECONTEXT)(ALCdevice*, const ALCint*);
typedef ALCboolean (AL_APIENTRY *PFN_ALCMAKECONTEXTCURRENT)(ALCcontext*);
typedef void (AL_APIENTRY *PFN_ALCDESTROYCONTEXT)(ALCcontext*);
typedef ALCdevice* (AL_APIENTRY *PFN_ALCOPENDEVICE)(const ALCchar*);
typedef ALCboolean (AL_APIENTRY *PFN_ALCCLOSEDEVICE)(ALCdevice*);
typedef ALCenum (AL_APIENTRY *PFN_ALCGETERROR)(ALCdevice*);
typedef const ALCchar* (AL_APIENTRY *PFN_ALCGETSTRING)(ALCdevice*, ALCenum);
typedef void (AL_APIENTRY *PFN_ALCGETINTEGERV)(ALCdevice*, ALCenum, ALCsizei, ALCint*);
typedef void (AL_APIENTRY *PFN_ALCPROCESSCONTEXT)(ALCcontext*);
typedef void (AL_APIENTRY *PFN_ALCSUSPENDCONTEXT)(ALCcontext*);

#ifdef __cplusplus
extern "C" {
#endif

/* ---- ALC 侧导出（先于 AL 声明，设备/上下文是入口） ---- */
TIPCL_AUDIO_API ALCcontext* AL_APIENTRY alcCreateContext(ALCdevice* device, const ALCint* attrlist);
TIPCL_AUDIO_API ALCboolean AL_APIENTRY alcMakeContextCurrent(ALCcontext* context);
TIPCL_AUDIO_API void AL_APIENTRY alcDestroyContext(ALCcontext* context);
TIPCL_AUDIO_API ALCdevice* AL_APIENTRY alcOpenDevice(const ALCchar* devicename);
TIPCL_AUDIO_API ALCboolean AL_APIENTRY alcCloseDevice(ALCdevice* device);
TIPCL_AUDIO_API ALCenum AL_APIENTRY alcGetError(ALCdevice* device);
TIPCL_AUDIO_API const ALCchar* AL_APIENTRY alcGetString(ALCdevice* device, ALCenum param);
TIPCL_AUDIO_API void AL_APIENTRY alcGetIntegerv(ALCdevice* device, ALCenum param, ALCsizei size, ALCint* values);
TIPCL_AUDIO_API void AL_APIENTRY alcProcessContext(ALCcontext* context);
TIPCL_AUDIO_API void AL_APIENTRY alcSuspendContext(ALCcontext* context);

/* ---- AL 侧导出 ---- */
TIPCL_AUDIO_API void AL_APIENTRY alGenBuffers(ALsizei n, ALuint* buffers);
TIPCL_AUDIO_API void AL_APIENTRY alDeleteBuffers(ALsizei n, const ALuint* buffers);
TIPCL_AUDIO_API ALboolean AL_APIENTRY alIsBuffer(ALuint buffer);
TIPCL_AUDIO_API void AL_APIENTRY alBufferData(ALuint buffer, ALenum format,
                                              const ALvoid* data, ALsizei size, ALsizei freq);
TIPCL_AUDIO_API void AL_APIENTRY alBufferData(ALuint buffer, ALenum format,
                                              const ALvoid* data, ALsizei size, ALsizei freq);
TIPCL_AUDIO_API void AL_APIENTRY alGenSources(ALsizei n, ALuint* sources);
TIPCL_AUDIO_API void AL_APIENTRY alDeleteSources(ALsizei n, const ALuint* sources);
TIPCL_AUDIO_API ALboolean AL_APIENTRY alIsSource(ALuint source);
TIPCL_AUDIO_API void AL_APIENTRY alSourcePlay(ALuint source);
TIPCL_AUDIO_API void AL_APIENTRY alSourceStop(ALuint source);
TIPCL_AUDIO_API void AL_APIENTRY alSourcePause(ALuint source);
TIPCL_AUDIO_API void AL_APIENTRY alSourceRewind(ALuint source);
TIPCL_AUDIO_API void AL_APIENTRY alSourceQueueBuffers(ALuint source, ALsizei n, const ALuint* buffers);
TIPCL_AUDIO_API void AL_APIENTRY alSourceUnqueueBuffers(ALuint source, ALsizei n, ALuint* buffers);
TIPCL_AUDIO_API void AL_APIENTRY alSourcei(ALuint source, ALenum param, ALint value);
TIPCL_AUDIO_API void AL_APIENTRY alSourcef(ALuint source, ALenum param, ALfloat value);
TIPCL_AUDIO_API void AL_APIENTRY alSource3f(ALuint source, ALenum param, ALfloat v1, ALfloat v2, ALfloat v3);
TIPCL_AUDIO_API void AL_APIENTRY alGetSourcei(ALuint source, ALenum param, ALint* value);
TIPCL_AUDIO_API void AL_APIENTRY alGetSourcef(ALuint source, ALenum param, ALfloat* value);
TIPCL_AUDIO_API void AL_APIENTRY alListenerf(ALenum param, ALfloat value);
TIPCL_AUDIO_API void AL_APIENTRY alListener3f(ALenum param, ALfloat v1, ALfloat v2, ALfloat v3);
TIPCL_AUDIO_API void AL_APIENTRY alListenerfv(ALenum param, const ALfloat* values);
TIPCL_AUDIO_API ALenum AL_APIENTRY alGetError(void);
TIPCL_AUDIO_API const ALchar* AL_APIENTRY alGetString(ALenum param);
TIPCL_AUDIO_API ALboolean AL_APIENTRY alIsExtensionPresent(const ALchar* extname);
TIPCL_AUDIO_API void* AL_APIENTRY alGetProcAddress(const ALchar* fname);
TIPCL_AUDIO_API void AL_APIENTRY alDopplerFactor(ALfloat value);
TIPCL_AUDIO_API void AL_APIENTRY alDistanceModel(ALenum model);
TIPCL_AUDIO_API void AL_APIENTRY alGetBufferi(ALuint buffer, ALenum param, ALint* value);

/* ---- 内部辅助（host 自检覆盖点，非 OpenAL 导出） ---- */
int shim_format_channels(ALenum format);
int shim_format_bytes_per_sample(ALenum format);
void openal_shim_diag(unsigned int* gen_sources, unsigned int* gen_buffers,
                      int* forwarding, int* contexts_alive);

#ifdef __cplusplus
}
#endif

#endif /* TIPCL_OPENAL_SHIM_H */
