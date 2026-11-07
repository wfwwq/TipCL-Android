package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLAudio.class */
public class SDLAudio {
    public static final int SDL_AUDIO_MASK_BITSIZE = 255;
    public static final int SDL_AUDIO_MASK_FLOAT = 256;
    public static final int SDL_AUDIO_MASK_BIG_ENDIAN = 4096;
    public static final int SDL_AUDIO_MASK_SIGNED = 32768;
    public static final int SDL_AUDIO_UNKNOWN = 0;
    public static final int SDL_AUDIO_U8 = 8;
    public static final int SDL_AUDIO_S8 = 32776;
    public static final int SDL_AUDIO_S16LE = 32784;
    public static final int SDL_AUDIO_S16BE = 36880;
    public static final int SDL_AUDIO_S32LE = 32800;
    public static final int SDL_AUDIO_S32BE = 36896;
    public static final int SDL_AUDIO_F32LE = 33056;
    public static final int SDL_AUDIO_F32BE = 37152;
    public static final int SDL_AUDIO_S16;
    public static final int SDL_AUDIO_S32;
    public static final int SDL_AUDIO_F32;
    public static final int SDL_AUDIO_DEVICE_DEFAULT_PLAYBACK = -1;
    public static final int SDL_AUDIO_DEVICE_DEFAULT_RECORDING = -2;
    public static final String SDL_PROP_AUDIOSTREAM_AUTO_CLEANUP_BOOLEAN = "SDL.audiostream.auto_cleanup";

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLAudio$Functions.class */
    public static final class Functions {
        public static final long GetNumAudioDrivers = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumAudioDrivers");
        public static final long GetAudioDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDriver");
        public static final long GetCurrentAudioDriver = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentAudioDriver");
        public static final long GetAudioPlaybackDevices = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioPlaybackDevices");
        public static final long GetAudioRecordingDevices = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioRecordingDevices");
        public static final long GetAudioDeviceName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceName");
        public static final long GetAudioDeviceFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceFormat");
        public static final long GetAudioDeviceChannelMap = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceChannelMap");
        public static final long OpenAudioDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenAudioDevice");
        public static final long IsAudioDevicePhysical = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsAudioDevicePhysical");
        public static final long IsAudioDevicePlayback = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsAudioDevicePlayback");
        public static final long PauseAudioDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PauseAudioDevice");
        public static final long ResumeAudioDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResumeAudioDevice");
        public static final long AudioDevicePaused = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AudioDevicePaused");
        public static final long GetAudioDeviceGain = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioDeviceGain");
        public static final long SetAudioDeviceGain = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioDeviceGain");
        public static final long CloseAudioDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseAudioDevice");
        public static final long BindAudioStreams = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindAudioStreams");
        public static final long BindAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BindAudioStream");
        public static final long UnbindAudioStreams = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnbindAudioStreams");
        public static final long UnbindAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnbindAudioStream");
        public static final long GetAudioStreamDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamDevice");
        public static final long CreateAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateAudioStream");
        public static final long GetAudioStreamProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamProperties");
        public static final long GetAudioStreamFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamFormat");
        public static final long SetAudioStreamFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamFormat");
        public static final long GetAudioStreamFrequencyRatio = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamFrequencyRatio");
        public static final long SetAudioStreamFrequencyRatio = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamFrequencyRatio");
        public static final long GetAudioStreamGain = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamGain");
        public static final long SetAudioStreamGain = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamGain");
        public static final long GetAudioStreamInputChannelMap = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamInputChannelMap");
        public static final long GetAudioStreamOutputChannelMap = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamOutputChannelMap");
        public static final long SetAudioStreamInputChannelMap = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamInputChannelMap");
        public static final long SetAudioStreamOutputChannelMap = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamOutputChannelMap");
        public static final long PutAudioStreamData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PutAudioStreamData");
        public static final long PutAudioStreamDataNoCopy = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PutAudioStreamDataNoCopy");
        public static final long PutAudioStreamPlanarData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PutAudioStreamPlanarData");
        public static final long GetAudioStreamData = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamData");
        public static final long GetAudioStreamAvailable = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamAvailable");
        public static final long GetAudioStreamQueued = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioStreamQueued");
        public static final long FlushAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushAudioStream");
        public static final long ClearAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearAudioStream");
        public static final long PauseAudioStreamDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PauseAudioStreamDevice");
        public static final long ResumeAudioStreamDevice = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResumeAudioStreamDevice");
        public static final long AudioStreamDevicePaused = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AudioStreamDevicePaused");
        public static final long LockAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockAudioStream");
        public static final long UnlockAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockAudioStream");
        public static final long SetAudioStreamGetCallback = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamGetCallback");
        public static final long SetAudioStreamPutCallback = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioStreamPutCallback");
        public static final long DestroyAudioStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyAudioStream");
        public static final long OpenAudioDeviceStream = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenAudioDeviceStream");
        public static final long SetAudioPostmixCallback = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetAudioPostmixCallback");
        public static final long LoadWAV_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadWAV_IO");
        public static final long LoadWAV = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadWAV");
        public static final long MixAudio = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MixAudio");
        public static final long ConvertAudioSamples = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertAudioSamples");
        public static final long GetAudioFormatName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAudioFormatName");
        public static final long GetSilenceValueForFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSilenceValueForFormat");

        private Functions() {
        }
    }

    static {
        SDL_AUDIO_S16 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? 32784 : 36880;
        SDL_AUDIO_S32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? 32800 : SDL_AUDIO_S32BE;
        SDL_AUDIO_F32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_AUDIO_F32LE : 37152;
    }

    protected SDLAudio() {
        throw new UnsupportedOperationException();
    }

    @NativeType("uint32_t")
    public static int SDL_DEFINE_AUDIO_FORMAT(@NativeType("uint32_t") int signed, @NativeType("uint32_t") int bigendian, @NativeType("uint32_t") int flt, @NativeType("uint32_t") int size) {
        return ((signed & 1) << 15) | ((bigendian & 1) << 12) | ((flt & 1) << 8) | (size & 255);
    }

    @NativeType("uint32_t")
    public static int SDL_AUDIO_BITSIZE(@NativeType("SDL_AudioFormat") int x) {
        return x & 255;
    }

    @NativeType("uint32_t")
    public static int SDL_AUDIO_BYTESIZE(@NativeType("SDL_AudioFormat") int x) {
        return SDL_AUDIO_BITSIZE(x) / 8;
    }

    @NativeType("bool")
    public static boolean SDL_AUDIO_ISFLOAT(@NativeType("SDL_AudioFormat") int x) {
        return (x & 256) != 0;
    }

    @NativeType("bool")
    public static boolean SDL_AUDIO_ISBIGENDIAN(@NativeType("SDL_AudioFormat") int x) {
        return (x & 4096) != 0;
    }

    @NativeType("bool")
    public static boolean SDL_AUDIO_ISLITTLEENDIAN(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISBIGENDIAN(x);
    }

    @NativeType("bool")
    public static boolean SDL_AUDIO_ISSIGNED(@NativeType("SDL_AudioFormat") int x) {
        return (x & 32768) != 0;
    }

    @NativeType("bool")
    public static boolean SDL_AUDIO_ISINT(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISFLOAT(x);
    }

    @NativeType("bool")
    public static boolean SDL_AUDIO_ISUNSIGNED(@NativeType("SDL_AudioFormat") int x) {
        return !SDL_AUDIO_ISSIGNED(x);
    }

    @NativeType("uint32_t")
    public static int SDL_AUDIO_FRAMESIZE(SDL_AudioSpec x) {
        return SDL_AUDIO_BYTESIZE(x.format()) * x.channels();
    }

    public static int SDL_GetNumAudioDrivers() {
        long __functionAddress = Functions.GetNumAudioDrivers;
        return JNI.invokeI(__functionAddress);
    }

    public static long nSDL_GetAudioDriver(int index) {
        long __functionAddress = Functions.GetAudioDriver;
        return JNI.invokeP(index, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetAudioDriver(int index) {
        long __result = nSDL_GetAudioDriver(index);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nSDL_GetCurrentAudioDriver() {
        long __functionAddress = Functions.GetCurrentAudioDriver;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetCurrentAudioDriver() {
        long __result = nSDL_GetCurrentAudioDriver();
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nSDL_GetAudioPlaybackDevices(long count) {
        long __functionAddress = Functions.GetAudioPlaybackDevices;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_AudioDeviceID *")
    public static IntBuffer SDL_GetAudioPlaybackDevices() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioPlaybackDevices(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetAudioRecordingDevices(long count) {
        long __functionAddress = Functions.GetAudioRecordingDevices;
        return JNI.invokePP(count, __functionAddress);
    }

    @NativeType("SDL_AudioDeviceID *")
    public static IntBuffer SDL_GetAudioRecordingDevices() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioRecordingDevices(MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetAudioDeviceName(int devid) {
        long __functionAddress = Functions.GetAudioDeviceName;
        return JNI.invokeP(devid, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetAudioDeviceName(@NativeType("SDL_AudioDeviceID") int devid) {
        long __result = nSDL_GetAudioDeviceName(devid);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static boolean nSDL_GetAudioDeviceFormat(int devid, long spec, long sample_frames) {
        long __functionAddress = Functions.GetAudioDeviceFormat;
        return JNI.invokePPZ(devid, spec, sample_frames, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetAudioDeviceFormat(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("int *") IntBuffer sample_frames) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) sample_frames, 1);
        }
        return nSDL_GetAudioDeviceFormat(devid, spec.address(), MemoryUtil.memAddress(sample_frames));
    }

    public static long nSDL_GetAudioDeviceChannelMap(int devid, long count) {
        long __functionAddress = Functions.GetAudioDeviceChannelMap;
        return JNI.invokePP(devid, count, __functionAddress);
    }

    @NativeType("int *")
    public static IntBuffer SDL_GetAudioDeviceChannelMap(@NativeType("SDL_AudioDeviceID") int devid) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioDeviceChannelMap(devid, MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nSDL_OpenAudioDevice(int devid, long spec) {
        long __functionAddress = Functions.OpenAudioDevice;
        return JNI.invokePI(devid, spec, __functionAddress);
    }

    @NativeType("SDL_AudioDeviceID")
    public static int SDL_OpenAudioDevice(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec spec) {
        return nSDL_OpenAudioDevice(devid, MemoryUtil.memAddressSafe(spec));
    }

    @NativeType("bool")
    public static boolean SDL_IsAudioDevicePhysical(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.IsAudioDevicePhysical;
        return JNI.invokeZ(devid, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_IsAudioDevicePlayback(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.IsAudioDevicePlayback;
        return JNI.invokeZ(devid, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PauseAudioDevice(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.PauseAudioDevice;
        return JNI.invokeZ(devid, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ResumeAudioDevice(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.ResumeAudioDevice;
        return JNI.invokeZ(devid, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_AudioDevicePaused(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.AudioDevicePaused;
        return JNI.invokeZ(devid, __functionAddress);
    }

    public static float SDL_GetAudioDeviceGain(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.GetAudioDeviceGain;
        return JNI.invokeF(devid, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioDeviceGain(@NativeType("SDL_AudioDeviceID") int devid, float gain) {
        long __functionAddress = Functions.SetAudioDeviceGain;
        return JNI.invokeZ(devid, gain, __functionAddress);
    }

    public static void SDL_CloseAudioDevice(@NativeType("SDL_AudioDeviceID") int devid) {
        long __functionAddress = Functions.CloseAudioDevice;
        JNI.invokeV(devid, __functionAddress);
    }

    public static boolean nSDL_BindAudioStreams(int devid, long streams, int num_streams) {
        long __functionAddress = Functions.BindAudioStreams;
        return JNI.invokePZ(devid, streams, num_streams, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BindAudioStreams(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioStream * const *") PointerBuffer streams) {
        return nSDL_BindAudioStreams(devid, MemoryUtil.memAddress(streams), streams.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_BindAudioStream(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.BindAudioStream;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(devid, stream, __functionAddress);
    }

    public static void nSDL_UnbindAudioStreams(long streams, int num_streams) {
        long __functionAddress = Functions.UnbindAudioStreams;
        JNI.invokePV(streams, num_streams, __functionAddress);
    }

    public static void SDL_UnbindAudioStreams(@NativeType("SDL_AudioStream * const *") PointerBuffer streams) {
        nSDL_UnbindAudioStreams(MemoryUtil.memAddressSafe(streams), Checks.remainingSafe(streams));
    }

    public static void SDL_UnbindAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.UnbindAudioStream;
        JNI.invokePV(stream, __functionAddress);
    }

    @NativeType("SDL_AudioDeviceID")
    public static int SDL_GetAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamDevice;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePI(stream, __functionAddress);
    }

    public static long nSDL_CreateAudioStream(long src_spec, long dst_spec) {
        long __functionAddress = Functions.CreateAudioStream;
        return JNI.invokePPP(src_spec, dst_spec, __functionAddress);
    }

    @NativeType("SDL_AudioStream *")
    public static long SDL_CreateAudioStream(@NativeType("SDL_AudioSpec const *") SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec dst_spec) {
        return nSDL_CreateAudioStream(MemoryUtil.memAddressSafe(src_spec), MemoryUtil.memAddressSafe(dst_spec));
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetAudioStreamProperties(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamProperties;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePI(stream, __functionAddress);
    }

    public static boolean nSDL_GetAudioStreamFormat(long stream, long src_spec, long dst_spec) {
        long __functionAddress = Functions.GetAudioStreamFormat;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPPZ(stream, src_spec, dst_spec, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetAudioStreamFormat(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioSpec *") SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec *") SDL_AudioSpec dst_spec) {
        return nSDL_GetAudioStreamFormat(stream, MemoryUtil.memAddressSafe(src_spec), MemoryUtil.memAddressSafe(dst_spec));
    }

    public static boolean nSDL_SetAudioStreamFormat(long stream, long src_spec, long dst_spec) {
        long __functionAddress = Functions.SetAudioStreamFormat;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPPZ(stream, src_spec, dst_spec, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioStreamFormat(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec src_spec, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec dst_spec) {
        return nSDL_SetAudioStreamFormat(stream, MemoryUtil.memAddressSafe(src_spec), MemoryUtil.memAddressSafe(dst_spec));
    }

    public static float SDL_GetAudioStreamFrequencyRatio(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamFrequencyRatio;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePF(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioStreamFrequencyRatio(@NativeType("SDL_AudioStream *") long stream, float ratio) {
        long __functionAddress = Functions.SetAudioStreamFrequencyRatio;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, ratio, __functionAddress);
    }

    public static float SDL_GetAudioStreamGain(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamGain;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePF(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioStreamGain(@NativeType("SDL_AudioStream *") long stream, float gain) {
        long __functionAddress = Functions.SetAudioStreamGain;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, gain, __functionAddress);
    }

    public static long nSDL_GetAudioStreamInputChannelMap(long stream, long count) {
        long __functionAddress = Functions.GetAudioStreamInputChannelMap;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPP(stream, count, __functionAddress);
    }

    @NativeType("int *")
    public static IntBuffer SDL_GetAudioStreamInputChannelMap(@NativeType("SDL_AudioStream *") long stream) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioStreamInputChannelMap(stream, MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetAudioStreamOutputChannelMap(long stream, long count) {
        long __functionAddress = Functions.GetAudioStreamOutputChannelMap;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPP(stream, count, __functionAddress);
    }

    @NativeType("int *")
    public static IntBuffer SDL_GetAudioStreamOutputChannelMap(@NativeType("SDL_AudioStream *") long stream) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetAudioStreamOutputChannelMap(stream, MemoryUtil.memAddress(count));
            IntBuffer intBufferMemIntBufferSafe = MemoryUtil.memIntBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return intBufferMemIntBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetAudioStreamInputChannelMap(long stream, long chmap, int count) {
        long __functionAddress = Functions.SetAudioStreamInputChannelMap;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPZ(stream, chmap, count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioStreamInputChannelMap(@NativeType("SDL_AudioStream *") long stream, @NativeType("int const *") IntBuffer chmap) {
        return nSDL_SetAudioStreamInputChannelMap(stream, MemoryUtil.memAddressSafe(chmap), Checks.remainingSafe(chmap));
    }

    public static boolean nSDL_SetAudioStreamOutputChannelMap(long stream, long chmap, int count) {
        long __functionAddress = Functions.SetAudioStreamOutputChannelMap;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPZ(stream, chmap, count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioStreamOutputChannelMap(@NativeType("SDL_AudioStream *") long stream, @NativeType("int const *") IntBuffer chmap) {
        return nSDL_SetAudioStreamOutputChannelMap(stream, MemoryUtil.memAddressSafe(chmap), Checks.remainingSafe(chmap));
    }

    public static boolean nSDL_PutAudioStreamData(long stream, long buf, int len) {
        long __functionAddress = Functions.PutAudioStreamData;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPZ(stream, buf, len, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PutAudioStreamData(@NativeType("SDL_AudioStream *") long stream, @NativeType("void const *") ByteBuffer buf) {
        return nSDL_PutAudioStreamData(stream, MemoryUtil.memAddress(buf), buf.remaining());
    }

    public static boolean nSDL_PutAudioStreamDataNoCopy(long stream, long buf, int len, long callback, long userdata) {
        long __functionAddress = Functions.PutAudioStreamDataNoCopy;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPPPZ(stream, buf, len, callback, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PutAudioStreamDataNoCopy(@NativeType("SDL_AudioStream *") long stream, @NativeType("void const *") ByteBuffer buf, @NativeType("SDL_AudioStreamDataCompleteCallback") SDL_AudioStreamDataCompleteCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_PutAudioStreamDataNoCopy(stream, MemoryUtil.memAddress(buf), buf.remaining(), MemoryUtil.memAddressSafe(callback), userdata);
    }

    public static boolean nSDL_PutAudioStreamPlanarData(long stream, long channel_buffers, int num_channels, int num_samples) {
        long __functionAddress = Functions.PutAudioStreamPlanarData;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPZ(stream, channel_buffers, num_channels, num_samples, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PutAudioStreamPlanarData(@NativeType("SDL_AudioStream *") long stream, @NativeType("void const * const *") PointerBuffer channel_buffers, int num_channels, int num_samples) {
        return nSDL_PutAudioStreamPlanarData(stream, MemoryUtil.memAddress(channel_buffers), num_channels, num_samples);
    }

    public static int nSDL_GetAudioStreamData(long stream, long buf, int len) {
        long __functionAddress = Functions.GetAudioStreamData;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPI(stream, buf, len, __functionAddress);
    }

    public static int SDL_GetAudioStreamData(@NativeType("SDL_AudioStream *") long stream, @NativeType("void *") ByteBuffer buf) {
        return nSDL_GetAudioStreamData(stream, MemoryUtil.memAddress(buf), buf.remaining());
    }

    public static int SDL_GetAudioStreamAvailable(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamAvailable;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePI(stream, __functionAddress);
    }

    public static int SDL_GetAudioStreamQueued(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.GetAudioStreamQueued;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePI(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_FlushAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.FlushAudioStream;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ClearAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.ClearAudioStream;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PauseAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.PauseAudioStreamDevice;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ResumeAudioStreamDevice(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.ResumeAudioStreamDevice;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_AudioStreamDevicePaused(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.AudioStreamDevicePaused;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LockAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.LockAudioStream;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_UnlockAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.UnlockAudioStream;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePZ(stream, __functionAddress);
    }

    public static boolean nSDL_SetAudioStreamGetCallback(long stream, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioStreamGetCallback;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPPZ(stream, callback, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioStreamGetCallback(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioStreamCallback") SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioStreamGetCallback(stream, MemoryUtil.memAddressSafe(callback), userdata);
    }

    public static boolean nSDL_SetAudioStreamPutCallback(long stream, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioStreamPutCallback;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        return JNI.invokePPPZ(stream, callback, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioStreamPutCallback(@NativeType("SDL_AudioStream *") long stream, @NativeType("SDL_AudioStreamCallback") SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioStreamPutCallback(stream, MemoryUtil.memAddressSafe(callback), userdata);
    }

    public static void SDL_DestroyAudioStream(@NativeType("SDL_AudioStream *") long stream) {
        long __functionAddress = Functions.DestroyAudioStream;
        if (Checks.CHECKS) {
            Checks.check(stream);
        }
        JNI.invokePV(stream, __functionAddress);
    }

    public static long nSDL_OpenAudioDeviceStream(int devid, long spec, long callback, long userdata) {
        long __functionAddress = Functions.OpenAudioDeviceStream;
        return JNI.invokePPPP(devid, spec, callback, userdata, __functionAddress);
    }

    @NativeType("SDL_AudioStream *")
    public static long SDL_OpenAudioDeviceStream(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec spec, @NativeType("SDL_AudioStreamCallback") SDL_AudioStreamCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_OpenAudioDeviceStream(devid, MemoryUtil.memAddressSafe(spec), MemoryUtil.memAddressSafe(callback), userdata);
    }

    public static boolean nSDL_SetAudioPostmixCallback(int devid, long callback, long userdata) {
        long __functionAddress = Functions.SetAudioPostmixCallback;
        return JNI.invokePPZ(devid, callback, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetAudioPostmixCallback(@NativeType("SDL_AudioDeviceID") int devid, @NativeType("SDL_AudioPostmixCallback") SDL_AudioPostmixCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_SetAudioPostmixCallback(devid, MemoryUtil.memAddressSafe(callback), userdata);
    }

    public static boolean nSDL_LoadWAV_IO(long src, boolean closeio, long spec, long audio_buf, long audio_len) {
        long __functionAddress = Functions.LoadWAV_IO;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPPPZ(src, closeio, spec, audio_buf, audio_len, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LoadWAV_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) audio_buf, 1);
            Checks.check((Buffer) audio_len, 1);
        }
        return nSDL_LoadWAV_IO(src, closeio, spec.address(), MemoryUtil.memAddress(audio_buf), MemoryUtil.memAddress(audio_len));
    }

    public static boolean nSDL_LoadWAV(long path, long spec, long audio_buf, long audio_len) {
        long __functionAddress = Functions.LoadWAV;
        return JNI.invokePPPPZ(path, spec, audio_buf, audio_len, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LoadWAV(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
            Checks.check((CustomBuffer<?>) audio_buf, 1);
            Checks.check((Buffer) audio_len, 1);
        }
        return nSDL_LoadWAV(MemoryUtil.memAddress(path), spec.address(), MemoryUtil.memAddress(audio_buf), MemoryUtil.memAddress(audio_len));
    }

    @NativeType("bool")
    public static boolean SDL_LoadWAV(@NativeType("char const *") CharSequence path, @NativeType("SDL_AudioSpec *") SDL_AudioSpec spec, @NativeType("Uint8 **") PointerBuffer audio_buf, @NativeType("Uint32 *") IntBuffer audio_len) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) audio_buf, 1);
            Checks.check((Buffer) audio_len, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_LoadWAV = nSDL_LoadWAV(pathEncoded, spec.address(), MemoryUtil.memAddress(audio_buf), MemoryUtil.memAddress(audio_len));
            stack.setPointer(stackPointer);
            return zNSDL_LoadWAV;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_MixAudio(long dst, long src, int format, int len, float volume) {
        long __functionAddress = Functions.MixAudio;
        return JNI.invokePPZ(dst, src, format, len, volume, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_MixAudio(@NativeType("Uint8 *") ByteBuffer dst, @NativeType("Uint8 const *") ByteBuffer src, @NativeType("SDL_AudioFormat") int format, float volume) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) dst, src.remaining());
        }
        return nSDL_MixAudio(MemoryUtil.memAddress(dst), MemoryUtil.memAddress(src), format, src.remaining(), volume);
    }

    public static boolean nSDL_ConvertAudioSamples(long src_spec, long src_data, int src_len, long dst_spec, long dst_data, long dst_len) {
        long __functionAddress = Functions.ConvertAudioSamples;
        return JNI.invokePPPPPZ(src_spec, src_data, src_len, dst_spec, dst_data, dst_len, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ConvertAudioSamples(@NativeType("SDL_AudioSpec const *") SDL_AudioSpec src_spec, @NativeType("Uint8 const *") ByteBuffer src_data, @NativeType("SDL_AudioSpec const *") SDL_AudioSpec dst_spec, @NativeType("Uint8 **") PointerBuffer dst_data, @NativeType("int *") IntBuffer dst_len) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) dst_data, 1);
            Checks.check((Buffer) dst_len, 1);
        }
        return nSDL_ConvertAudioSamples(MemoryUtil.memAddressSafe(src_spec), MemoryUtil.memAddress(src_data), src_data.remaining(), MemoryUtil.memAddressSafe(dst_spec), MemoryUtil.memAddress(dst_data), MemoryUtil.memAddress(dst_len));
    }

    public static long nSDL_GetAudioFormatName(int format) {
        long __functionAddress = Functions.GetAudioFormatName;
        return JNI.invokeP(format, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetAudioFormatName(@NativeType("SDL_AudioFormat") int format) {
        long __result = nSDL_GetAudioFormatName(format);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static int SDL_GetSilenceValueForFormat(@NativeType("SDL_AudioFormat") int format) {
        long __functionAddress = Functions.GetSilenceValueForFormat;
        return JNI.invokeI(format, __functionAddress);
    }
}
