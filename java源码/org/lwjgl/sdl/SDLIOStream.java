package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLIOStream.class */
public class SDLIOStream {
    public static final int SDL_IO_STATUS_READY = 0;
    public static final int SDL_IO_STATUS_ERROR = 1;
    public static final int SDL_IO_STATUS_EOF = 2;
    public static final int SDL_IO_STATUS_NOT_READY = 3;
    public static final int SDL_IO_STATUS_READONLY = 4;
    public static final int SDL_IO_STATUS_WRITEONLY = 5;
    public static final int SDL_IO_SEEK_SET = 0;
    public static final int SDL_IO_SEEK_CUR = 1;
    public static final int SDL_IO_SEEK_END = 2;
    public static final String SDL_PROP_IOSTREAM_WINDOWS_HANDLE_POINTER = "SDL.iostream.windows.handle";
    public static final String SDL_PROP_IOSTREAM_STDIO_FILE_POINTER = "SDL.iostream.stdio.file";
    public static final String SDL_PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER = "SDL.iostream.file_descriptor";
    public static final String SDL_PROP_IOSTREAM_ANDROID_AASSET_POINTER = "SDL.iostream.android.aasset";
    public static final String SDL_PROP_IOSTREAM_MEMORY_POINTER = "SDL.iostream.memory.base";
    public static final String SDL_PROP_IOSTREAM_MEMORY_SIZE_NUMBER = "SDL.iostream.memory.size";
    public static final String SDL_PROP_IOSTREAM_MEMORY_FREE_FUNC_POINTER = "SDL.iostream.memory.free";
    public static final String SDL_PROP_IOSTREAM_DYNAMIC_MEMORY_POINTER = "SDL.iostream.dynamic.memory";
    public static final String SDL_PROP_IOSTREAM_DYNAMIC_CHUNKSIZE_NUMBER = "SDL.iostream.dynamic.chunksize";

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLIOStream$Functions.class */
    public static final class Functions {
        public static final long IOFromFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromFile");
        public static final long IOFromMem = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromMem");
        public static final long IOFromConstMem = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromConstMem");
        public static final long IOFromDynamicMem = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOFromDynamicMem");
        public static final long OpenIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenIO");
        public static final long CloseIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseIO");
        public static final long GetIOProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetIOProperties");
        public static final long GetIOStatus = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetIOStatus");
        public static final long GetIOSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetIOSize");
        public static final long SeekIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SeekIO");
        public static final long TellIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_TellIO");
        public static final long ReadIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadIO");
        public static final long WriteIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteIO");
        public static final long IOprintf = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOprintf");
        public static final long IOvprintf = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_IOvprintf");
        public static final long FlushIO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushIO");
        public static final long LoadFile_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFile_IO");
        public static final long LoadFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFile");
        public static final long SaveFile_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveFile_IO");
        public static final long SaveFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveFile");
        public static final long ReadU8 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU8");
        public static final long ReadS8 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS8");
        public static final long ReadU16LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU16LE");
        public static final long ReadS16LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS16LE");
        public static final long ReadU16BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU16BE");
        public static final long ReadS16BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS16BE");
        public static final long ReadU32LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU32LE");
        public static final long ReadS32LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS32LE");
        public static final long ReadU32BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU32BE");
        public static final long ReadS32BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS32BE");
        public static final long ReadU64LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU64LE");
        public static final long ReadS64LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS64LE");
        public static final long ReadU64BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadU64BE");
        public static final long ReadS64BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadS64BE");
        public static final long WriteU8 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU8");
        public static final long WriteS8 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS8");
        public static final long WriteU16LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU16LE");
        public static final long WriteS16LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS16LE");
        public static final long WriteU16BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU16BE");
        public static final long WriteS16BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS16BE");
        public static final long WriteU32LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU32LE");
        public static final long WriteS32LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS32LE");
        public static final long WriteU32BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU32BE");
        public static final long WriteS32BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS32BE");
        public static final long WriteU64LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU64LE");
        public static final long WriteS64LE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS64LE");
        public static final long WriteU64BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteU64BE");
        public static final long WriteS64BE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteS64BE");

        private Functions() {
        }
    }

    protected SDLIOStream() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_IOFromFile(long file, long mode) {
        long __functionAddress = Functions.IOFromFile;
        return JNI.invokePPP(file, mode, __functionAddress);
    }

    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromFile(@NativeType("char const *") ByteBuffer file, @NativeType("char const *") ByteBuffer mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
            Checks.checkNT1(mode);
        }
        return nSDL_IOFromFile(MemoryUtil.memAddress(file), MemoryUtil.memAddress(mode));
    }

    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromFile(@NativeType("char const *") CharSequence file, @NativeType("char const *") CharSequence mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            stack.nASCII(mode, true);
            long modeEncoded = stack.getPointerAddress();
            long jNSDL_IOFromFile = nSDL_IOFromFile(fileEncoded, modeEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_IOFromFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_IOFromMem(long mem, long size) {
        long __functionAddress = Functions.IOFromMem;
        return JNI.invokePPP(mem, size, __functionAddress);
    }

    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromMem(@NativeType("void *") ByteBuffer mem) {
        return nSDL_IOFromMem(MemoryUtil.memAddress(mem), mem.remaining());
    }

    public static long nSDL_IOFromConstMem(long mem, long size) {
        long __functionAddress = Functions.IOFromConstMem;
        return JNI.invokePPP(mem, size, __functionAddress);
    }

    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromConstMem(@NativeType("void const *") ByteBuffer mem) {
        return nSDL_IOFromConstMem(MemoryUtil.memAddress(mem), mem.remaining());
    }

    @NativeType("SDL_IOStream *")
    public static long SDL_IOFromDynamicMem() {
        long __functionAddress = Functions.IOFromDynamicMem;
        return JNI.invokeP(__functionAddress);
    }

    public static long nSDL_OpenIO(long iface, long userdata) {
        long __functionAddress = Functions.OpenIO;
        if (Checks.CHECKS) {
            SDL_IOStreamInterface.validate(iface);
        }
        return JNI.invokePPP(iface, userdata, __functionAddress);
    }

    @NativeType("SDL_IOStream *")
    public static long SDL_OpenIO(@NativeType("SDL_IOStreamInterface const *") SDL_IOStreamInterface iface, @NativeType("void *") long userdata) {
        return nSDL_OpenIO(iface.address(), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_CloseIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.CloseIO;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePZ(context, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetIOProperties(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOProperties;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePI(context, __functionAddress);
    }

    @NativeType("SDL_IOStatus")
    public static int SDL_GetIOStatus(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOStatus;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePI(context, __functionAddress);
    }

    @NativeType("Sint64")
    public static long SDL_GetIOSize(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.GetIOSize;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePJ(context, __functionAddress);
    }

    @NativeType("Sint64")
    public static long SDL_SeekIO(@NativeType("SDL_IOStream *") long context, @NativeType("Sint64") long offset, @NativeType("SDL_IOWhence") int whence) {
        long __functionAddress = Functions.SeekIO;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePJJ(context, offset, whence, __functionAddress);
    }

    @NativeType("Sint64")
    public static long SDL_TellIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.TellIO;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePJ(context, __functionAddress);
    }

    public static long nSDL_ReadIO(long context, long ptr, long size) {
        long __functionAddress = Functions.ReadIO;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPP(context, ptr, size, __functionAddress);
    }

    @NativeType("size_t")
    public static long SDL_ReadIO(@NativeType("SDL_IOStream *") long context, @NativeType("void *") ByteBuffer ptr) {
        return nSDL_ReadIO(context, MemoryUtil.memAddress(ptr), ptr.remaining());
    }

    public static long nSDL_WriteIO(long context, long ptr, long size) {
        long __functionAddress = Functions.WriteIO;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPP(context, ptr, size, __functionAddress);
    }

    @NativeType("size_t")
    public static long SDL_WriteIO(@NativeType("SDL_IOStream *") long context, @NativeType("void const *") ByteBuffer ptr) {
        return nSDL_WriteIO(context, MemoryUtil.memAddress(ptr), ptr.remaining());
    }

    public static long nSDL_IOprintf(long context, long fmt) {
        long __functionAddress = Functions.IOprintf;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPP(context, fmt, __functionAddress);
    }

    @NativeType("size_t")
    public static long SDL_IOprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") ByteBuffer fmt) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        return nSDL_IOprintf(context, MemoryUtil.memAddress(fmt));
    }

    @NativeType("size_t")
    public static long SDL_IOprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            long jNSDL_IOprintf = nSDL_IOprintf(context, fmtEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_IOprintf;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_IOvprintf(long context, long fmt, long ap) {
        long __functionAddress = Functions.IOvprintf;
        if (Checks.CHECKS) {
            Checks.check(context);
            Checks.check(ap);
        }
        return JNI.invokePPPP(context, fmt, ap, __functionAddress);
    }

    @NativeType("size_t")
    public static long SDL_IOvprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (Checks.CHECKS) {
            Checks.checkNT1(fmt);
        }
        return nSDL_IOvprintf(context, MemoryUtil.memAddress(fmt), ap);
    }

    @NativeType("size_t")
    public static long SDL_IOvprintf(@NativeType("SDL_IOStream *") long context, @NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            long jNSDL_IOvprintf = nSDL_IOvprintf(context, fmtEncoded, ap);
            stack.setPointer(stackPointer);
            return jNSDL_IOvprintf;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("bool")
    public static boolean SDL_FlushIO(@NativeType("SDL_IOStream *") long context) {
        long __functionAddress = Functions.FlushIO;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePZ(context, __functionAddress);
    }

    public static long nSDL_LoadFile_IO(long src, long datasize, boolean closeio) {
        long __functionAddress = Functions.LoadFile_IO;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPP(src, datasize, closeio, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_LoadFile_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        PointerBuffer datasize = stack.callocPointer(1);
        try {
            long __result = nSDL_LoadFile_IO(src, MemoryUtil.memAddress(datasize), closeio);
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, (int) datasize.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_LoadFile(long file, long datasize) {
        long __functionAddress = Functions.LoadFile;
        return JNI.invokePPP(file, datasize, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_LoadFile(@NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        PointerBuffer datasize = stack.callocPointer(1);
        try {
            long __result = nSDL_LoadFile(MemoryUtil.memAddress(file), MemoryUtil.memAddress(datasize));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, (int) datasize.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void *")
    public static ByteBuffer SDL_LoadFile(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer datasize = stack.callocPointer(1);
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadFile(fileEncoded, MemoryUtil.memAddress(datasize));
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, (int) datasize.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SaveFile_IO(long src, long data, long datasize, boolean closeio) {
        long __functionAddress = Functions.SaveFile_IO;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPPZ(src, data, datasize, closeio, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SaveFile_IO(@NativeType("SDL_IOStream *") long src, @NativeType("void const *") ByteBuffer data, @NativeType("bool") boolean closeio) {
        return nSDL_SaveFile_IO(src, MemoryUtil.memAddress(data), data.remaining(), closeio);
    }

    public static boolean nSDL_SaveFile(long file, long data, long datasize) {
        long __functionAddress = Functions.SaveFile;
        return JNI.invokePPPZ(file, data, datasize, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SaveFile(@NativeType("char const *") ByteBuffer file, @NativeType("void const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        return nSDL_SaveFile(MemoryUtil.memAddress(file), MemoryUtil.memAddress(data), data.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_SaveFile(@NativeType("char const *") CharSequence file, @NativeType("void const *") ByteBuffer data) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            boolean zNSDL_SaveFile = nSDL_SaveFile(fileEncoded, MemoryUtil.memAddress(data), data.remaining());
            stack.setPointer(stackPointer);
            return zNSDL_SaveFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_ReadU8(long src, long value) {
        long __functionAddress = Functions.ReadU8;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadU8(@NativeType("SDL_IOStream *") long src, @NativeType("Uint8 *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadU8(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadS8(long src, long value) {
        long __functionAddress = Functions.ReadS8;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadS8(@NativeType("SDL_IOStream *") long src, @NativeType("Sint8 *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadS8(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadU16LE(long src, long value) {
        long __functionAddress = Functions.ReadU16LE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadU16LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint16 *") ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadU16LE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadS16LE(long src, long value) {
        long __functionAddress = Functions.ReadS16LE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadS16LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint16 *") ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadS16LE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadU16BE(long src, long value) {
        long __functionAddress = Functions.ReadU16BE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadU16BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint16 *") ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadU16BE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadS16BE(long src, long value) {
        long __functionAddress = Functions.ReadS16BE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadS16BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint16 *") ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadS16BE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadU32LE(long src, long value) {
        long __functionAddress = Functions.ReadU32LE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadU32LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint32 *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadU32LE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadS32LE(long src, long value) {
        long __functionAddress = Functions.ReadS32LE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadS32LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint32 *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadS32LE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadU32BE(long src, long value) {
        long __functionAddress = Functions.ReadU32BE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadU32BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint32 *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadU32BE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadS32BE(long src, long value) {
        long __functionAddress = Functions.ReadS32BE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadS32BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint32 *") IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadS32BE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadU64LE(long src, long value) {
        long __functionAddress = Functions.ReadU64LE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadU64LE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint64 *") LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadU64LE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadS64LE(long src, long value) {
        long __functionAddress = Functions.ReadS64LE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadS64LE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint64 *") LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadS64LE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadU64BE(long src, long value) {
        long __functionAddress = Functions.ReadU64BE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadU64BE(@NativeType("SDL_IOStream *") long src, @NativeType("Uint64 *") LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadU64BE(src, MemoryUtil.memAddress(value));
    }

    public static boolean nSDL_ReadS64BE(long src, long value) {
        long __functionAddress = Functions.ReadS64BE;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePPZ(src, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadS64BE(@NativeType("SDL_IOStream *") long src, @NativeType("Sint64 *") LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) value, 1);
        }
        return nSDL_ReadS64BE(src, MemoryUtil.memAddress(value));
    }

    @NativeType("bool")
    public static boolean SDL_WriteU8(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint8") byte value) {
        long __functionAddress = Functions.WriteU8;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePUZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteS8(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint8") byte value) {
        long __functionAddress = Functions.WriteS8;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePBZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteU16LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint16") short value) {
        long __functionAddress = Functions.WriteU16LE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePCZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteS16LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.WriteS16LE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePSZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteU16BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint16") short value) {
        long __functionAddress = Functions.WriteU16BE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePCZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteS16BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.WriteS16BE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePSZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteU32LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint32") int value) {
        long __functionAddress = Functions.WriteU32LE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteS32LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint32") int value) {
        long __functionAddress = Functions.WriteS32LE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteU32BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint32") int value) {
        long __functionAddress = Functions.WriteU32BE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteS32BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint32") int value) {
        long __functionAddress = Functions.WriteS32BE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteU64LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint64") long value) {
        long __functionAddress = Functions.WriteU64LE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePJZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteS64LE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint64") long value) {
        long __functionAddress = Functions.WriteS64LE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePJZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteU64BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Uint64") long value) {
        long __functionAddress = Functions.WriteU64BE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePJZ(dst, value, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteS64BE(@NativeType("SDL_IOStream *") long dst, @NativeType("Sint64") long value) {
        long __functionAddress = Functions.WriteS64BE;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePJZ(dst, value, __functionAddress);
    }

    public static void SDL_INIT_INTERFACE(SDL_IOStreamInterface iface) {
        iface.clear();
        iface.version(SDL_IOStreamInterface.SIZEOF);
    }
}
