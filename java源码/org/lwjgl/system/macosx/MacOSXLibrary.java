package org.lwjgl.system.macosx;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/MacOSXLibrary.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/MacOSXLibrary.class */
public abstract class MacOSXLibrary extends SharedLibrary.Default {
    protected MacOSXLibrary(String name, long handle) {
        super(name, handle);
    }

    public static MacOSXLibrary getWithIdentifier(String bundleID) {
        APIUtil.apiLog("Loading library: " + bundleID);
        MacOSXLibraryBundle lib = MacOSXLibraryBundle.getWithIdentifier(bundleID);
        APIUtil.apiLogMore("Success");
        return lib;
    }

    public static MacOSXLibrary create(String name) {
        if (name.endsWith(".framework")) {
            return MacOSXLibraryBundle.create(name);
        }
        return new MacOSXLibraryDL(name);
    }
}
