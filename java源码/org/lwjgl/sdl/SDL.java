package org.lwjgl.sdl;

import org.lwjgl.system.Configuration;
import org.lwjgl.system.Library;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL.class */
public final class SDL {
    private static final SharedLibrary SDL = Library.loadNative((Class<?>) SDL.class, "org.lwjgl.sdl", Configuration.SDL_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("SDL3")), true);

    public static SharedLibrary getLibrary() {
        return SDL;
    }

    private SDL() {
        throw new UnsupportedOperationException();
    }
}
