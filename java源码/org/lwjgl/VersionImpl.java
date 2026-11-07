package org.lwjgl;

import java.io.IOException;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/VersionImpl.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/VersionImpl.class */
final class VersionImpl {
    VersionImpl() {
    }

    static String find() throws IOException {
        Package org_lwjgl = Version.class.getPackage();
        String specVersion = org_lwjgl.getSpecificationVersion();
        String implVersion = org_lwjgl.getImplementationVersion();
        if (specVersion != null && implVersion != null) {
            return Version.createImplementation(specVersion, implVersion);
        }
        String version = Version.findImplementationFromManifest();
        if (version != null) {
            return version;
        }
        return "-snapshot";
    }
}
