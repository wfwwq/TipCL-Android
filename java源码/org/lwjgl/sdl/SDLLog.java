package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLLog.class */
public class SDLLog {
    public static final int SDL_LOG_CATEGORY_APPLICATION = 0;
    public static final int SDL_LOG_CATEGORY_ERROR = 1;
    public static final int SDL_LOG_CATEGORY_ASSERT = 2;
    public static final int SDL_LOG_CATEGORY_SYSTEM = 3;
    public static final int SDL_LOG_CATEGORY_AUDIO = 4;
    public static final int SDL_LOG_CATEGORY_VIDEO = 5;
    public static final int SDL_LOG_CATEGORY_RENDER = 6;
    public static final int SDL_LOG_CATEGORY_INPUT = 7;
    public static final int SDL_LOG_CATEGORY_TEST = 8;
    public static final int SDL_LOG_CATEGORY_GPU = 9;
    public static final int SDL_LOG_CATEGORY_RESERVED2 = 10;
    public static final int SDL_LOG_CATEGORY_RESERVED3 = 11;
    public static final int SDL_LOG_CATEGORY_RESERVED4 = 12;
    public static final int SDL_LOG_CATEGORY_RESERVED5 = 13;
    public static final int SDL_LOG_CATEGORY_RESERVED6 = 14;
    public static final int SDL_LOG_CATEGORY_RESERVED7 = 15;
    public static final int SDL_LOG_CATEGORY_RESERVED8 = 16;
    public static final int SDL_LOG_CATEGORY_RESERVED9 = 17;
    public static final int SDL_LOG_CATEGORY_RESERVED10 = 18;
    public static final int SDL_LOG_CATEGORY_CUSTOM = 19;
    public static final int SDL_LOG_PRIORITY_INVALID = 0;
    public static final int SDL_LOG_PRIORITY_TRACE = 1;
    public static final int SDL_LOG_PRIORITY_VERBOSE = 2;
    public static final int SDL_LOG_PRIORITY_DEBUG = 3;
    public static final int SDL_LOG_PRIORITY_INFO = 4;
    public static final int SDL_LOG_PRIORITY_WARN = 5;
    public static final int SDL_LOG_PRIORITY_ERROR = 6;
    public static final int SDL_LOG_PRIORITY_CRITICAL = 7;
    public static final int SDL_LOG_PRIORITY_COUNT = 8;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLLog$Functions.class */
    public static final class Functions {
        public static final long SetLogPriorities = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogPriorities");
        public static final long SetLogPriority = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogPriority");
        public static final long GetLogPriority = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetLogPriority");
        public static final long ResetLogPriorities = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResetLogPriorities");
        public static final long SetLogPriorityPrefix = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogPriorityPrefix");
        public static final long Log = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_Log");
        public static final long LogTrace = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogTrace");
        public static final long LogVerbose = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogVerbose");
        public static final long LogDebug = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogDebug");
        public static final long LogInfo = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogInfo");
        public static final long LogWarn = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogWarn");
        public static final long LogError = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogError");
        public static final long LogCritical = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogCritical");
        public static final long LogMessage = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogMessage");
        public static final long LogMessageV = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LogMessageV");
        public static final long GetDefaultLogOutputFunction = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDefaultLogOutputFunction");
        public static final long GetLogOutputFunction = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetLogOutputFunction");
        public static final long SetLogOutputFunction = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetLogOutputFunction");

        private Functions() {
        }
    }

    protected SDLLog() {
        throw new UnsupportedOperationException();
    }

    public static void SDL_SetLogPriorities(@NativeType("SDL_LogPriority") int priority) {
        long __functionAddress = Functions.SetLogPriorities;
        JNI.invokeV(priority, __functionAddress);
    }

    public static void SDL_SetLogPriority(int category, @NativeType("SDL_LogPriority") int priority) {
        long __functionAddress = Functions.SetLogPriority;
        JNI.invokeV(category, priority, __functionAddress);
    }

    @NativeType("SDL_LogPriority")
    public static int SDL_GetLogPriority(int category) {
        long __functionAddress = Functions.GetLogPriority;
        return JNI.invokeI(category, __functionAddress);
    }

    public static void SDL_ResetLogPriorities() {
        long __functionAddress = Functions.ResetLogPriorities;
        JNI.invokeV(__functionAddress);
    }

    public static boolean nSDL_SetLogPriorityPrefix(int priority, long prefix) {
        long __functionAddress = Functions.SetLogPriorityPrefix;
        return JNI.invokePZ(priority, prefix, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetLogPriorityPrefix(@NativeType("SDL_LogPriority") int priority, @NativeType("char const *") ByteBuffer prefix) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(prefix);
        }
        return nSDL_SetLogPriorityPrefix(priority, MemoryUtil.memAddressSafe(prefix));
    }

    @NativeType("bool")
    public static boolean SDL_SetLogPriorityPrefix(@NativeType("SDL_LogPriority") int priority, @NativeType("char const *") CharSequence prefix) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(prefix, true);
            long prefixEncoded = prefix == null ? 0L : stack.getPointerAddress();
            boolean zNSDL_SetLogPriorityPrefix = nSDL_SetLogPriorityPrefix(priority, prefixEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SetLogPriorityPrefix;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_Log(long fmt) {
        long __functionAddress = Functions.Log;
        JNI.invokePV(fmt, __functionAddress);
    }

    public static void SDL_Log(@NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_Log(MemoryUtil.memAddress(fmt));
    }

    public static void SDL_Log(@NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_Log(fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogTrace(int category, long fmt) {
        long __functionAddress = Functions.LogTrace;
        JNI.invokePV(category, fmt, __functionAddress);
    }

    public static void SDL_LogTrace(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogTrace(category, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogTrace(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogTrace(category, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogVerbose(int category, long fmt) {
        long __functionAddress = Functions.LogVerbose;
        JNI.invokePV(category, fmt, __functionAddress);
    }

    public static void SDL_LogVerbose(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogVerbose(category, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogVerbose(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogVerbose(category, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogDebug(int category, long fmt) {
        long __functionAddress = Functions.LogDebug;
        JNI.invokePV(category, fmt, __functionAddress);
    }

    public static void SDL_LogDebug(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogDebug(category, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogDebug(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogDebug(category, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogInfo(int category, long fmt) {
        long __functionAddress = Functions.LogInfo;
        JNI.invokePV(category, fmt, __functionAddress);
    }

    public static void SDL_LogInfo(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogInfo(category, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogInfo(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogInfo(category, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogWarn(int category, long fmt) {
        long __functionAddress = Functions.LogWarn;
        JNI.invokePV(category, fmt, __functionAddress);
    }

    public static void SDL_LogWarn(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogWarn(category, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogWarn(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogWarn(category, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogError(int category, long fmt) {
        long __functionAddress = Functions.LogError;
        JNI.invokePV(category, fmt, __functionAddress);
    }

    public static void SDL_LogError(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogError(category, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogError(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogError(category, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogCritical(int category, long fmt) {
        long __functionAddress = Functions.LogCritical;
        JNI.invokePV(category, fmt, __functionAddress);
    }

    public static void SDL_LogCritical(int category, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogCritical(category, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogCritical(int category, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogCritical(category, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogMessage(int category, int priority, long fmt) {
        long __functionAddress = Functions.LogMessage;
        JNI.invokePV(category, priority, fmt, __functionAddress);
    }

    public static void SDL_LogMessage(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogMessage(category, priority, MemoryUtil.memAddress(fmt));
    }

    public static void SDL_LogMessage(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogMessage(category, priority, fmtEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_LogMessageV(int category, int priority, long fmt, long ap) {
        long __functionAddress = Functions.LogMessageV;
        if (Checks.CHECKS) {
            Checks.check(ap);
        }
        JNI.invokePPV(category, priority, fmt, ap, __functionAddress);
    }

    public static void SDL_LogMessageV(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        nSDL_LogMessageV(category, priority, MemoryUtil.memAddress(fmt), ap);
    }

    public static void SDL_LogMessageV(int category, @NativeType("SDL_LogPriority") int priority, @NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            nSDL_LogMessageV(category, priority, fmtEncoded, ap);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetDefaultLogOutputFunction() {
        long __functionAddress = Functions.GetDefaultLogOutputFunction;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("SDL_LogOutputFunction")
    public static SDL_LogOutputFunction SDL_GetDefaultLogOutputFunction() {
        return SDL_LogOutputFunction.createSafe(nSDL_GetDefaultLogOutputFunction());
    }

    public static void nSDL_GetLogOutputFunction(long callback, long userdata) {
        long __functionAddress = Functions.GetLogOutputFunction;
        JNI.invokePPV(callback, userdata, __functionAddress);
    }

    public static void SDL_GetLogOutputFunction(@NativeType("SDL_LogOutputFunction *") PointerBuffer callback, @NativeType("void **") PointerBuffer userdata) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) callback, 1);
            Checks.checkSafe((CustomBuffer<?>) userdata, 1);
        }
        nSDL_GetLogOutputFunction(MemoryUtil.memAddressSafe(callback), MemoryUtil.memAddressSafe(userdata));
    }

    public static void nSDL_SetLogOutputFunction(long callback, long userdata) {
        long __functionAddress = Functions.SetLogOutputFunction;
        JNI.invokePPV(callback, userdata, __functionAddress);
    }

    public static void SDL_SetLogOutputFunction(@NativeType("SDL_LogOutputFunction") SDL_LogOutputFunctionI callback, @NativeType("void *") long userdata) {
        nSDL_SetLogOutputFunction(MemoryUtil.memAddressSafe(callback), userdata);
    }
}
