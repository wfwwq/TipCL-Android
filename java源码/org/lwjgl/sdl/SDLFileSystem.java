package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLFileSystem.class */
public class SDLFileSystem {
    public static final int SDL_FOLDER_HOME = 0;
    public static final int SDL_FOLDER_DESKTOP = 1;
    public static final int SDL_FOLDER_DOCUMENTS = 2;
    public static final int SDL_FOLDER_DOWNLOADS = 3;
    public static final int SDL_FOLDER_MUSIC = 4;
    public static final int SDL_FOLDER_PICTURES = 5;
    public static final int SDL_FOLDER_PUBLICSHARE = 6;
    public static final int SDL_FOLDER_SAVEDGAMES = 7;
    public static final int SDL_FOLDER_SCREENSHOTS = 8;
    public static final int SDL_FOLDER_TEMPLATES = 9;
    public static final int SDL_FOLDER_VIDEOS = 10;
    public static final int SDL_FOLDER_COUNT = 11;
    public static final int SDL_PATHTYPE_NONE = 0;
    public static final int SDL_PATHTYPE_FILE = 1;
    public static final int SDL_PATHTYPE_DIRECTORY = 2;
    public static final int SDL_PATHTYPE_OTHER = 3;
    public static final int SDL_ENUM_CONTINUE = 0;
    public static final int SDL_ENUM_SUCCESS = 1;
    public static final int SDL_ENUM_FAILURE = 2;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLFileSystem$Functions.class */
    public static final class Functions {
        public static final long GetBasePath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetBasePath");
        public static final long GetPrefPath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPrefPath");
        public static final long GetUserFolder = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetUserFolder");
        public static final long CreateDirectory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateDirectory");
        public static final long EnumerateDirectory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnumerateDirectory");
        public static final long RemovePath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemovePath");
        public static final long RenamePath = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RenamePath");
        public static final long CopyFile = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CopyFile");
        public static final long GetPathInfo = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPathInfo");
        public static final long GlobDirectory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GlobDirectory");
        public static final long GetCurrentDirectory = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentDirectory");

        private Functions() {
        }
    }

    protected SDLFileSystem() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetBasePath() {
        long __functionAddress = Functions.GetBasePath;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetBasePath() {
        long __result = nSDL_GetBasePath();
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nSDL_GetPrefPath(long org2, long app) {
        long __functionAddress = Functions.GetPrefPath;
        return JNI.invokePPP(org2, app, __functionAddress);
    }

    @NativeType("char *")
    public static String SDL_GetPrefPath(@NativeType("char const *") ByteBuffer org2, @NativeType("char const *") ByteBuffer app) {
        if (Checks.CHECKS) {
            Checks.checkNT1(org2);
            Checks.checkNT1(app);
        }
        long __result = 0;
        try {
            __result = nSDL_GetPrefPath(MemoryUtil.memAddress(org2), MemoryUtil.memAddress(app));
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            throw th;
        }
    }

    @NativeType("char *")
    public static String SDL_GetPrefPath(@NativeType("char const *") CharSequence org2, @NativeType("char const *") CharSequence app) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        long __result = 0;
        try {
            stack.nUTF8(org2, true);
            long orgEncoded = stack.getPointerAddress();
            stack.nUTF8(app, true);
            long appEncoded = stack.getPointerAddress();
            __result = nSDL_GetPrefPath(orgEncoded, appEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetUserFolder(int folder) {
        long __functionAddress = Functions.GetUserFolder;
        return JNI.invokeP(folder, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetUserFolder(@NativeType("SDL_Folder") int folder) {
        long __result = nSDL_GetUserFolder(folder);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static boolean nSDL_CreateDirectory(long path) {
        long __functionAddress = Functions.CreateDirectory;
        return JNI.invokePZ(path, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_CreateDirectory(@NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_CreateDirectory(MemoryUtil.memAddress(path));
    }

    @NativeType("bool")
    public static boolean SDL_CreateDirectory(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_CreateDirectory = nSDL_CreateDirectory(pathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_CreateDirectory;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_EnumerateDirectory(long path, long callback, long userdata) {
        long __functionAddress = Functions.EnumerateDirectory;
        return JNI.invokePPPZ(path, callback, userdata, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_EnumerateDirectory(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_EnumerateDirectory(MemoryUtil.memAddress(path), callback.address(), userdata);
    }

    @NativeType("bool")
    public static boolean SDL_EnumerateDirectory(@NativeType("char const *") CharSequence path, @NativeType("SDL_EnumerateDirectoryCallback") SDL_EnumerateDirectoryCallbackI callback, @NativeType("void *") long userdata) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_EnumerateDirectory = nSDL_EnumerateDirectory(pathEncoded, callback.address(), userdata);
            stack.setPointer(stackPointer);
            return zNSDL_EnumerateDirectory;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_RemovePath(long path) {
        long __functionAddress = Functions.RemovePath;
        return JNI.invokePZ(path, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RemovePath(@NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_RemovePath(MemoryUtil.memAddress(path));
    }

    @NativeType("bool")
    public static boolean SDL_RemovePath(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_RemovePath = nSDL_RemovePath(pathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_RemovePath;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_RenamePath(long oldpath, long newpath) {
        long __functionAddress = Functions.RenamePath;
        return JNI.invokePPZ(oldpath, newpath, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_RenamePath(@NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        return nSDL_RenamePath(MemoryUtil.memAddress(oldpath), MemoryUtil.memAddress(newpath));
    }

    @NativeType("bool")
    public static boolean SDL_RenamePath(@NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            boolean zNSDL_RenamePath = nSDL_RenamePath(oldpathEncoded, newpathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_RenamePath;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_CopyFile(long oldpath, long newpath) {
        long __functionAddress = Functions.CopyFile;
        return JNI.invokePPZ(oldpath, newpath, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_CopyFile(@NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        return nSDL_CopyFile(MemoryUtil.memAddress(oldpath), MemoryUtil.memAddress(newpath));
    }

    @NativeType("bool")
    public static boolean SDL_CopyFile(@NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            boolean zNSDL_CopyFile = nSDL_CopyFile(oldpathEncoded, newpathEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_CopyFile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_GetPathInfo(long path, long info) {
        long __functionAddress = Functions.GetPathInfo;
        return JNI.invokePPZ(path, info, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetPathInfo(@NativeType("char const *") ByteBuffer path, @NativeType("SDL_PathInfo *") SDL_PathInfo info) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        return nSDL_GetPathInfo(MemoryUtil.memAddress(path), MemoryUtil.memAddressSafe(info));
    }

    @NativeType("bool")
    public static boolean SDL_GetPathInfo(@NativeType("char const *") CharSequence path, @NativeType("SDL_PathInfo *") SDL_PathInfo info) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            boolean zNSDL_GetPathInfo = nSDL_GetPathInfo(pathEncoded, MemoryUtil.memAddressSafe(info));
            stack.setPointer(stackPointer);
            return zNSDL_GetPathInfo;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GlobDirectory(long path, long pattern, int flags, long count) {
        long __functionAddress = Functions.GlobDirectory;
        return JNI.invokePPPP(path, pattern, flags, count, __functionAddress);
    }

    @NativeType("char **")
    public static PointerBuffer SDL_GlobDirectory(@NativeType("char const *") ByteBuffer path, @NativeType("char const *") ByteBuffer pattern, @NativeType("SDL_GlobFlags") int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
            Checks.checkNT1Safe(pattern);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GlobDirectory(MemoryUtil.memAddress(path), MemoryUtil.memAddressSafe(pattern), flags, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char **")
    public static PointerBuffer SDL_GlobDirectory(@NativeType("char const *") CharSequence path, @NativeType("char const *") CharSequence pattern, @NativeType("SDL_GlobFlags") int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer count = stack.callocInt(1);
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(pattern, true);
            long patternEncoded = pattern == null ? 0L : stack.getPointerAddress();
            long __result = nSDL_GlobDirectory(pathEncoded, patternEncoded, flags, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetCurrentDirectory() {
        long __functionAddress = Functions.GetCurrentDirectory;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char *")
    public static String SDL_GetCurrentDirectory() {
        long __result = 0;
        try {
            __result = nSDL_GetCurrentDirectory();
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            SDLStdinc.nSDL_free(__result);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            SDLStdinc.nSDL_free(__result);
            throw th;
        }
    }
}
