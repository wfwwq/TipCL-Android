package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLStorage.class */
public class SDLStorage {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLStorage$Functions.class */
    public static final class Functions {
        public static final long OpenTitleStorage = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenTitleStorage");
        public static final long OpenUserStorage = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenUserStorage");
        public static final long OpenFileStorage = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenFileStorage");
        public static final long OpenStorage = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenStorage");
        public static final long CloseStorage = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseStorage");
        public static final long StorageReady = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_StorageReady");
        public static final long GetStorageFileSize = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStorageFileSize");
        public static final long ReadStorageFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadStorageFile");
        public static final long WriteStorageFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteStorageFile");
        public static final long CreateStorageDirectory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateStorageDirectory");
        public static final long EnumerateStorageDirectory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnumerateStorageDirectory");
        public static final long RemoveStoragePath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveStoragePath");
        public static final long RenameStoragePath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenameStoragePath");
        public static final long CopyStorageFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyStorageFile");
        public static final long GetStoragePathInfo = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStoragePathInfo");
        public static final long GetStorageSpaceRemaining = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetStorageSpaceRemaining");
        public static final long GlobStorageDirectory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GlobStorageDirectory");

        private Functions() {
        }
    }

    protected SDLStorage() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_OpenTitleStorage(long override, int props) {
        long __functionAddress = Functions.OpenTitleStorage;
        return JNI.invokePP(override, props, __functionAddress);
    }

    @NativeType("SDL_Storage *")
    public static long SDL_OpenTitleStorage(@NativeType("char const *") ByteBuffer override, @NativeType("SDL_PropertiesID") int props) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(override);
        }
        return nSDL_OpenTitleStorage(MemoryUtil.memAddressSafe(override), props);
    }

    @NativeType("SDL_Storage *")
    public static long SDL_OpenTitleStorage(@NativeType("char const *") CharSequence override, @NativeType("SDL_PropertiesID") int props) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(override, true);
            long overrideEncoded = override == null ? 0L : stack.getPointerAddress();
            long jNSDL_OpenTitleStorage = nSDL_OpenTitleStorage(overrideEncoded, props);
            stack.setPointer(stackPointer);
            return jNSDL_OpenTitleStorage;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_OpenUserStorage(long org2, long app, int props) {
        long __functionAddress = Functions.OpenUserStorage;
        return JNI.invokePPP(org2, app, props, __functionAddress);
    }

    @NativeType("SDL_Storage *")
    public static long SDL_OpenUserStorage(@NativeType("char const *") ByteBuffer org2, @NativeType("char const *") ByteBuffer app, @NativeType("SDL_PropertiesID") int props) {
        if (Checks.CHECKS) {
            Checks.checkNT1(org2);
            Checks.checkNT1(app);
        }
        return nSDL_OpenUserStorage(MemoryUtil.memAddress(org2), MemoryUtil.memAddress(app), props);
    }

    @NativeType("SDL_Storage *")
    public static long SDL_OpenUserStorage(@NativeType("char const *") CharSequence org2, @NativeType("char const *") CharSequence app, @NativeType("SDL_PropertiesID") int props) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(org2, true);
            long orgEncoded = stack.getPointerAddress();
            stack.nUTF8(app, true);
            long appEncoded = stack.getPointerAddress();
            long jNSDL_OpenUserStorage = nSDL_OpenUserStorage(orgEncoded, appEncoded, props);
            stack.setPointer(stackPointer);
            return jNSDL_OpenUserStorage;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_OpenFileStorage(long path) {
        long __functionAddress = Functions.OpenFileStorage;
        return JNI.invokePP(path, __functionAddress);
    }

    @NativeType("SDL_Storage *")
    public static long SDL_OpenFileStorage(@NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_OpenFileStorage(MemoryUtil.memAddress(path));
    }

    @NativeType("SDL_Storage *")
    public static long SDL_OpenFileStorage(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            long jNSDL_OpenFileStorage = nSDL_OpenFileStorage(pathEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_OpenFileStorage;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_OpenStorage(long iface, long userdata) {
        long __functionAddress = Functions.OpenStorage;
        return JNI.invokePPP(iface, userdata, __functionAddress);
    }

    @NativeType("SDL_Storage *")
    public static long SDL_OpenStorage(@NativeType("SDL_StorageInterface const *") SDL_StorageInterface iface, @NativeType("void *") long userdata) {
        return nSDL_OpenStorage(iface.address(), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_CloseStorage(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.CloseStorage;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePZ(storage, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_StorageReady(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.StorageReady;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePZ(storage, __functionAddress);
    }

    public static boolean nSDL_GetStorageFileSize(long storage, long path, long length) {
        long __functionAddress = Functions.GetStorageFileSize;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPZ(storage, path, length, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetStorageFileSize(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("Uint64 *") LongBuffer length) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
            Checks.checkSafe((Buffer) length, 1);
        }
        return nSDL_GetStorageFileSize(storage, MemoryUtil.memAddress(path), MemoryUtil.memAddressSafe(length));
    }

    @NativeType("bool")
    public static boolean SDL_GetStorageFileSize(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("Uint64 *") LongBuffer length) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_GetStorageFileSize = nSDL_GetStorageFileSize(storage, pathEncoded, MemoryUtil.memAddressSafe(length));
            stack.setPointer(stackPointer);
            return zNSDL_GetStorageFileSize;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_ReadStorageFile(long storage, long path, long destination, long length) {
        long __functionAddress = Functions.ReadStorageFile;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPJZ(storage, path, destination, length, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("void *") ByteBuffer destination) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_ReadStorageFile(storage, MemoryUtil.memAddress(path), MemoryUtil.memAddress(destination), destination.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_ReadStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("void *") ByteBuffer destination) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_ReadStorageFile = nSDL_ReadStorageFile(storage, pathEncoded, MemoryUtil.memAddress(destination), destination.remaining());
            stack.setPointer(stackPointer);
            return zNSDL_ReadStorageFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_WriteStorageFile(long storage, long path, long source, long length) {
        long __functionAddress = Functions.WriteStorageFile;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPJZ(storage, path, source, length, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("void const *") ByteBuffer source) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_WriteStorageFile(storage, MemoryUtil.memAddress(path), MemoryUtil.memAddress(source), source.remaining());
    }

    @NativeType("bool")
    public static boolean SDL_WriteStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("void const *") ByteBuffer source) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_WriteStorageFile = nSDL_WriteStorageFile(storage, pathEncoded, MemoryUtil.memAddress(source), source.remaining());
            stack.setPointer(stackPointer);
            return zNSDL_WriteStorageFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_CreateStorageDirectory(long storage, long path) {
        long __functionAddress = Functions.CreateStorageDirectory;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPZ(storage, path, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_CreateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_CreateStorageDirectory(storage, MemoryUtil.memAddress(path));
    }

    @NativeType("bool")
    public static boolean SDL_CreateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_CreateStorageDirectory = nSDL_CreateStorageDirectory(storage, pathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_CreateStorageDirectory;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_EnumerateStorageDirectory(long storage, long path, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateStorageDirectory;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPPZ(storage, path, callback, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_EnumerateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(path);
        }
        return nSDL_EnumerateStorageDirectory(storage, MemoryUtil.memAddressSafe(path), callback.address(), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_EnumerateStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? 0L : stack.getPointerAddress();
            boolean zNSDL_EnumerateStorageDirectory = nSDL_EnumerateStorageDirectory(storage, pathEncoded, callback.address(), userdata);
            stack.setPointer(stackPointer);
            return zNSDL_EnumerateStorageDirectory;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_RemoveStoragePath(long storage, long path) {
        long __functionAddress = Functions.RemoveStoragePath;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPZ(storage, path, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RemoveStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_RemoveStoragePath(storage, MemoryUtil.memAddress(path));
    }

    @NativeType("bool")
    public static boolean SDL_RemoveStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_RemoveStoragePath = nSDL_RemoveStoragePath(storage, pathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_RemoveStoragePath;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_RenameStoragePath(long storage, long oldpath, long newpath) {
        long __functionAddress = Functions.RenameStoragePath;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPZ(storage, oldpath, newpath, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenameStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        return nSDL_RenameStoragePath(storage, MemoryUtil.memAddress(oldpath), MemoryUtil.memAddress(newpath));
    }

    @NativeType("bool")
    public static boolean SDL_RenameStoragePath(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            boolean zNSDL_RenameStoragePath = nSDL_RenameStoragePath(storage, oldpathEncoded, newpathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_RenameStoragePath;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_CopyStorageFile(long storage, long oldpath, long newpath) {
        long __functionAddress = Functions.CopyStorageFile;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPZ(storage, oldpath, newpath, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_CopyStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        return nSDL_CopyStorageFile(storage, MemoryUtil.memAddress(oldpath), MemoryUtil.memAddress(newpath));
    }

    @NativeType("bool")
    public static boolean SDL_CopyStorageFile(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            boolean zNSDL_CopyStorageFile = nSDL_CopyStorageFile(storage, oldpathEncoded, newpathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_CopyStorageFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_GetStoragePathInfo(long storage, long path, long info) {
        long __functionAddress = Functions.GetStoragePathInfo;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPZ(storage, path, info, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetStoragePathInfo(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("SDL_PathInfo *") SDL_PathInfo info) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_GetStoragePathInfo(storage, MemoryUtil.memAddress(path), MemoryUtil.memAddressSafe(info));
    }

    @NativeType("bool")
    public static boolean SDL_GetStoragePathInfo(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("SDL_PathInfo *") SDL_PathInfo info) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_GetStoragePathInfo = nSDL_GetStoragePathInfo(storage, pathEncoded, MemoryUtil.memAddressSafe(info));
            stack.setPointer(stackPointer);
            return zNSDL_GetStoragePathInfo;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("Uint64")
    public static long SDL_GetStorageSpaceRemaining(@NativeType("SDL_Storage *") long storage) {
        long __functionAddress = Functions.GetStorageSpaceRemaining;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePJ(storage, __functionAddress);
    }

    public static long nSDL_GlobStorageDirectory(long storage, long path, long pattern, int flags, long count) {
        long __functionAddress = Functions.GlobStorageDirectory;
        if (Checks.CHECKS) {
            Checks.check(storage);
        }
        return JNI.invokePPPPP(storage, path, pattern, flags, count, __functionAddress);
    }

    @NativeType("char **")
    public static PointerBuffer SDL_GlobStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") ByteBuffer path, @NativeType("char const *") ByteBuffer pattern, @NativeType("SDL_GlobFlags") int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(path);
            Checks.checkNT1Safe(pattern);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GlobStorageDirectory(storage, MemoryUtil.memAddressSafe(path), MemoryUtil.memAddressSafe(pattern), flags, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char **")
    public static PointerBuffer SDL_GlobStorageDirectory(@NativeType("SDL_Storage *") long storage, @NativeType("char const *") CharSequence path, @NativeType("char const *") CharSequence pattern, @NativeType("SDL_GlobFlags") int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer count = stack.callocInt(1);
            stack.nUTF8Safe(path, true);
            long pathEncoded = path == null ? 0L : stack.getPointerAddress();
            stack.nUTF8Safe(pattern, true);
            long patternEncoded = pattern == null ? 0L : stack.getPointerAddress();
            long __result = nSDL_GlobStorageDirectory(storage, pathEncoded, patternEncoded, flags, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_INIT_INTERFACE(SDL_StorageInterface iface) {
        iface.clear();
        iface.version(SDL_StorageInterface.SIZEOF);
    }
}
