package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.sdl.SDL_DialogFileFilter;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLDialog.class */
public class SDLDialog {
    public static final String SDL_PROP_FILE_DIALOG_FILTERS_POINTER = "SDL.filedialog.filters";
    public static final String SDL_PROP_FILE_DIALOG_NFILTERS_NUMBER = "SDL.filedialog.nfilters";
    public static final String SDL_PROP_FILE_DIALOG_WINDOW_POINTER = "SDL.filedialog.window";
    public static final String SDL_PROP_FILE_DIALOG_LOCATION_STRING = "SDL.filedialog.location";
    public static final String SDL_PROP_FILE_DIALOG_MANY_BOOLEAN = "SDL.filedialog.many";
    public static final String SDL_PROP_FILE_DIALOG_TITLE_STRING = "SDL.filedialog.title";
    public static final String SDL_PROP_FILE_DIALOG_ACCEPT_STRING = "SDL.filedialog.accept";
    public static final String SDL_PROP_FILE_DIALOG_CANCEL_STRING = "SDL.filedialog.cancel";
    public static final int SDL_FILEDIALOG_OPENFILE = 0;
    public static final int SDL_FILEDIALOG_SAVEFILE = 1;
    public static final int SDL_FILEDIALOG_OPENFOLDER = 2;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLDialog$Functions.class */
    public static final class Functions {
        public static final long ShowOpenFileDialog = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowOpenFileDialog");
        public static final long ShowSaveFileDialog = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowSaveFileDialog");
        public static final long ShowOpenFolderDialog = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowOpenFolderDialog");
        public static final long ShowFileDialogWithProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowFileDialogWithProperties");

        private Functions() {
        }
    }

    protected SDLDialog() {
        throw new UnsupportedOperationException();
    }

    public static void nSDL_ShowOpenFileDialog(long callback, long userdata, long window, long filters, int nfilters, long default_location, boolean allow_many) {
        long __functionAddress = Functions.ShowOpenFileDialog;
        if (Checks.CHECKS && filters != 0) {
            Struct.validate(filters, nfilters, SDL_DialogFileFilter.SIZEOF, SDL_DialogFileFilter::validate);
        }
        JNI.invokePPPPPV(callback, userdata, window, filters, nfilters, default_location, allow_many, __functionAddress);
    }

    public static void SDL_ShowOpenFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.Buffer filters, @NativeType("char const *") ByteBuffer default_location, @NativeType("bool") boolean allow_many) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(default_location);
        }
        nSDL_ShowOpenFileDialog(callback.address(), userdata, window, MemoryUtil.memAddressSafe(filters), Checks.remainingSafe(filters), MemoryUtil.memAddressSafe(default_location), allow_many);
    }

    public static void SDL_ShowOpenFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.Buffer filters, @NativeType("char const *") CharSequence default_location, @NativeType("bool") boolean allow_many) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? 0L : stack.getPointerAddress();
            nSDL_ShowOpenFileDialog(callback.address(), userdata, window, MemoryUtil.memAddressSafe(filters), Checks.remainingSafe(filters), default_locationEncoded, allow_many);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_ShowSaveFileDialog(long callback, long userdata, long window, long filters, int nfilters, long default_location) {
        long __functionAddress = Functions.ShowSaveFileDialog;
        if (Checks.CHECKS && filters != 0) {
            Struct.validate(filters, nfilters, SDL_DialogFileFilter.SIZEOF, SDL_DialogFileFilter::validate);
        }
        JNI.invokePPPPPV(callback, userdata, window, filters, nfilters, default_location, __functionAddress);
    }

    public static void SDL_ShowSaveFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.Buffer filters, @NativeType("char const *") ByteBuffer default_location) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(default_location);
        }
        nSDL_ShowSaveFileDialog(callback.address(), userdata, window, MemoryUtil.memAddressSafe(filters), Checks.remainingSafe(filters), MemoryUtil.memAddressSafe(default_location));
    }

    public static void SDL_ShowSaveFileDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("SDL_DialogFileFilter const *") SDL_DialogFileFilter.Buffer filters, @NativeType("char const *") CharSequence default_location) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? 0L : stack.getPointerAddress();
            nSDL_ShowSaveFileDialog(callback.address(), userdata, window, MemoryUtil.memAddressSafe(filters), Checks.remainingSafe(filters), default_locationEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_ShowOpenFolderDialog(long callback, long userdata, long window, long default_location, boolean allow_many) {
        long __functionAddress = Functions.ShowOpenFolderDialog;
        JNI.invokePPPPV(callback, userdata, window, default_location, allow_many, __functionAddress);
    }

    public static void SDL_ShowOpenFolderDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("char const *") ByteBuffer default_location, @NativeType("bool") boolean allow_many) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(default_location);
        }
        nSDL_ShowOpenFolderDialog(callback.address(), userdata, window, MemoryUtil.memAddressSafe(default_location), allow_many);
    }

    public static void SDL_ShowOpenFolderDialog(@NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_Window *") long window, @NativeType("char const *") CharSequence default_location, @NativeType("bool") boolean allow_many) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(default_location, true);
            long default_locationEncoded = default_location == null ? 0L : stack.getPointerAddress();
            nSDL_ShowOpenFolderDialog(callback.address(), userdata, window, default_locationEncoded, allow_many);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_ShowFileDialogWithProperties(int type, long callback, long userdata, int props) {
        long __functionAddress = Functions.ShowFileDialogWithProperties;
        JNI.invokePPV(type, callback, userdata, props, __functionAddress);
    }

    public static void SDL_ShowFileDialogWithProperties(@NativeType("SDL_FileDialogType") int type, @NativeType("SDL_DialogFileCallback") SDL_DialogFileCallbackI callback, @NativeType("void *") long userdata, @NativeType("SDL_PropertiesID") int props) {
        nSDL_ShowFileDialogWithProperties(type, callback.address(), userdata, props);
    }
}
