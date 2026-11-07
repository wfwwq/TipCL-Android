package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLAsyncIO.class */
public class SDLAsyncIO {
    public static final int SDL_ASYNCIO_TASK_READ = 0;
    public static final int SDL_ASYNCIO_TASK_WRITE = 1;
    public static final int SDL_ASYNCIO_TASK_CLOSE = 2;
    public static final int SDL_ASYNCIO_COMPLETE = 0;
    public static final int SDL_ASYNCIO_FAILURE = 1;
    public static final int SDL_ASYNCIO_CANCELED = 2;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLAsyncIO$Functions.class */
    public static final class Functions {
        public static final long AsyncIOFromFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AsyncIOFromFile");
        public static final long GetAsyncIOSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAsyncIOSize");
        public static final long ReadAsyncIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadAsyncIO");
        public static final long WriteAsyncIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteAsyncIO");
        public static final long CloseAsyncIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseAsyncIO");
        public static final long CreateAsyncIOQueue = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateAsyncIOQueue");
        public static final long DestroyAsyncIOQueue = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyAsyncIOQueue");
        public static final long GetAsyncIOResult = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetAsyncIOResult");
        public static final long WaitAsyncIOResult = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitAsyncIOResult");
        public static final long SignalAsyncIOQueue = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SignalAsyncIOQueue");
        public static final long LoadFileAsync = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFileAsync");

        private Functions() {
        }
    }

    protected SDLAsyncIO() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_AsyncIOFromFile(long file, long mode) {
        long __functionAddress = Functions.AsyncIOFromFile;
        return JNI.invokePPP(file, mode, __functionAddress);
    }

    @NativeType("SDL_AsyncIO *")
    public static long SDL_AsyncIOFromFile(@NativeType("char const *") ByteBuffer file, @NativeType("char const *") ByteBuffer mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
            Checks.checkNT1(mode);
        }
        return nSDL_AsyncIOFromFile(MemoryUtil.memAddress(file), MemoryUtil.memAddress(mode));
    }

    @NativeType("SDL_AsyncIO *")
    public static long SDL_AsyncIOFromFile(@NativeType("char const *") CharSequence file, @NativeType("char const *") CharSequence mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            stack.nASCII(mode, true);
            long modeEncoded = stack.getPointerAddress();
            long jNSDL_AsyncIOFromFile = nSDL_AsyncIOFromFile(fileEncoded, modeEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_AsyncIOFromFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("Sint64")
    public static long SDL_GetAsyncIOSize(@NativeType("SDL_AsyncIO *") long asyncio) {
        long __functionAddress = Functions.GetAsyncIOSize;
        if (Checks.CHECKS) {
            Checks.check(asyncio);
        }
        return JNI.invokePJ(asyncio, __functionAddress);
    }

    public static boolean nSDL_ReadAsyncIO(long asyncio, long ptr, long offset, long size, long queue, long userdata) {
        long __functionAddress = Functions.ReadAsyncIO;
        if (Checks.CHECKS) {
            Checks.check(asyncio);
            Checks.check(queue);
        }
        return JNI.invokePPJJPPZ(asyncio, ptr, offset, size, queue, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("void *") ByteBuffer ptr, @NativeType("Uint64") long offset, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        return nSDL_ReadAsyncIO(asyncio, MemoryUtil.memAddress(ptr), offset, ptr.remaining(), queue, userdata);
    }

    public static boolean nSDL_WriteAsyncIO(long asyncio, long ptr, long offset, long size, long queue, long userdata) {
        long __functionAddress = Functions.WriteAsyncIO;
        if (Checks.CHECKS) {
            Checks.check(asyncio);
            Checks.check(queue);
        }
        return JNI.invokePPJJPPZ(asyncio, ptr, offset, size, queue, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("void *") ByteBuffer ptr, @NativeType("Uint64") long offset, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        return nSDL_WriteAsyncIO(asyncio, MemoryUtil.memAddress(ptr), offset, ptr.remaining(), queue, userdata);
    }

    @NativeType("bool")
    public static boolean SDL_CloseAsyncIO(@NativeType("SDL_AsyncIO *") long asyncio, @NativeType("bool") boolean flush, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        long __functionAddress = Functions.CloseAsyncIO;
        if (Checks.CHECKS) {
            Checks.check(asyncio);
            Checks.check(queue);
        }
        return JNI.invokePPPZ(asyncio, flush, queue, userdata, __functionAddress);
    }

    @NativeType("SDL_AsyncIOQueue *")
    public static long SDL_CreateAsyncIOQueue() {
        long __functionAddress = Functions.CreateAsyncIOQueue;
        return JNI.invokeP(__functionAddress);
    }

    public static void SDL_DestroyAsyncIOQueue(@NativeType("SDL_AsyncIOQueue *") long queue) {
        long __functionAddress = Functions.DestroyAsyncIOQueue;
        if (Checks.CHECKS) {
            Checks.check(queue);
        }
        JNI.invokePV(queue, __functionAddress);
    }

    public static boolean nSDL_GetAsyncIOResult(long queue, long outcome) {
        long __functionAddress = Functions.GetAsyncIOResult;
        if (Checks.CHECKS) {
            Checks.check(queue);
        }
        return JNI.invokePPZ(queue, outcome, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetAsyncIOResult(@NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("SDL_AsyncIOOutcome *") SDL_AsyncIOOutcome outcome) {
        return nSDL_GetAsyncIOResult(queue, outcome.address());
    }

    public static boolean nSDL_WaitAsyncIOResult(long queue, long outcome, int timeoutMS) {
        long __functionAddress = Functions.WaitAsyncIOResult;
        if (Checks.CHECKS) {
            Checks.check(queue);
        }
        return JNI.invokePPZ(queue, outcome, timeoutMS, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WaitAsyncIOResult(@NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("SDL_AsyncIOOutcome *") SDL_AsyncIOOutcome outcome, @NativeType("Sint32") int timeoutMS) {
        return nSDL_WaitAsyncIOResult(queue, outcome.address(), timeoutMS);
    }

    public static void SDL_SignalAsyncIOQueue(@NativeType("SDL_AsyncIOQueue *") long queue) {
        long __functionAddress = Functions.SignalAsyncIOQueue;
        if (Checks.CHECKS) {
            Checks.check(queue);
        }
        JNI.invokePV(queue, __functionAddress);
    }

    public static boolean nSDL_LoadFileAsync(long file, long queue, long userdata) {
        long __functionAddress = Functions.LoadFileAsync;
        if (Checks.CHECKS) {
            Checks.check(queue);
        }
        return JNI.invokePPPZ(file, queue, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LoadFileAsync(@NativeType("char const *") ByteBuffer file, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        return nSDL_LoadFileAsync(MemoryUtil.memAddress(file), queue, userdata);
    }

    @NativeType("bool")
    public static boolean SDL_LoadFileAsync(@NativeType("char const *") CharSequence file, @NativeType("SDL_AsyncIOQueue *") long queue, @NativeType("void *") long userdata) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            boolean zNSDL_LoadFileAsync = nSDL_LoadFileAsync(fileEncoded, queue, userdata);
            stack.setPointer(stackPointer);
            return zNSDL_LoadFileAsync;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
