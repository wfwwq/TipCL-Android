package org.lwjgl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Objects;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/Version.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/Version.class */
public final class Version {
    public static final int VERSION_MAJOR = 3;
    public static final int VERSION_MINOR = 4;
    public static final int VERSION_REVISION = 1;
    public static final BuildType BUILD_TYPE = BuildType.STABLE;
    private static final String versionPlain = String.valueOf(3) + ".4.1" + BUILD_TYPE.postfix;
    private static final String version = versionPlain + VersionImpl.find();

    private Version() {
    }

    public static void main(String[] args) {
        System.out.println(version);
        System.err.println(versionPlain);
    }

    public static String getVersion() {
        return version;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/Version$BuildType.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/Version$BuildType.class */
    public enum BuildType {
        ALPHA("a"),
        BETA("b"),
        STABLE("");

        public final String postfix;

        BuildType(String postfix) {
            this.postfix = postfix;
        }
    }

    static String createImplementation(String specVersion, String implVersion) {
        String build = "+" + ((!implVersion.startsWith("build ") || 6 >= implVersion.length()) ? implVersion : implVersion.substring(6));
        if (specVersion.contains("SNAPSHOT") || specVersion.contains("snapshot")) {
            return "-snapshot" + build;
        }
        return build;
    }

    static String findImplementationFromManifest() throws IOException {
        ClassLoader classLoader = Version.class.getClassLoader();
        URL url = classLoader.getResource("org/lwjgl/Version.class");
        if (url != null) {
            String classURL = url.toString();
            try {
                if (classURL.startsWith("jar:")) {
                    URL manifest = Version.class.getResource("/META-INF/MANIFEST.MF");
                    String version2 = readImplementationFromManifest((URL) Objects.requireNonNull(manifest));
                    if (version2 != null) {
                        return version2;
                    }
                } else if (classURL.startsWith("resource:")) {
                    Enumeration<URL> e = classLoader.getResources("META-INF/MANIFEST.MF");
                    while (e.hasMoreElements()) {
                        String version3 = readImplementationFromManifest(e.nextElement());
                        if (version3 != null) {
                            return version3;
                        }
                    }
                }
                return null;
            } catch (Exception e2) {
                return null;
            }
        }
        return null;
    }

    private static String readImplementationFromManifest(URL url) throws IOException {
        try {
            InputStream stream = url.openStream();
            try {
                Attributes attribs = new Manifest(stream).getMainAttributes();
                if (!"lwjgl".equals(attribs.getValue(Attributes.Name.IMPLEMENTATION_TITLE))) {
                    if (stream != null) {
                        stream.close();
                    }
                    return null;
                }
                if (!"lwjgl.org".equals(attribs.getValue(Attributes.Name.IMPLEMENTATION_VENDOR))) {
                    if (stream != null) {
                        stream.close();
                    }
                    return null;
                }
                String specVersion = attribs.getValue(Attributes.Name.SPECIFICATION_VERSION);
                String implVersion = attribs.getValue(Attributes.Name.IMPLEMENTATION_VERSION);
                if (specVersion == null || implVersion == null) {
                    if (stream != null) {
                        stream.close();
                    }
                    return null;
                }
                String strCreateImplementation = createImplementation(specVersion, implVersion);
                if (stream != null) {
                    stream.close();
                }
                return strCreateImplementation;
            } catch (Throwable th) {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
