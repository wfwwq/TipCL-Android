package org.lwjgl.system;

import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/LibraryResource.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/LibraryResource.class */
public final class LibraryResource {
    static {
        Library.initialize();
    }

    private LibraryResource() {
    }

    public static Path load(String module, String name) {
        return load(LibraryResource.class, module, name);
    }

    public static Path load(Class<?> context, String module, String name) {
        return load(context, module, name, false, true);
    }

    public static Path load(Class<?> context, String module, String name, boolean bundledWithLWJGL) {
        return load(context, module, name, bundledWithLWJGL, true);
    }

    private static Path load(Class<?> context, String module, String name, boolean bundledWithLWJGL, boolean printError) {
        Path path;
        if (Checks.DEBUG) {
            APIUtil.DEBUG_STREAM.print("[LWJGL] Loading library resource: " + name + "\n\tModule: " + module + StringUtils.LF);
        }
        Path path2 = Paths.get(name, new String[0]);
        if (path2.isAbsolute()) {
            if (!Files.exists(path2, new LinkOption[0])) {
                if (printError) {
                    printError();
                }
                throw new IllegalStateException("Failed to locate library resource: " + name);
            }
            APIUtil.apiLogMore("Success");
            return path2;
        }
        URL resourceURL = Library.findResource(context, module, name, bundledWithLWJGL);
        if (resourceURL == null) {
            Path path3 = loadFromLibraryPath(module, name, bundledWithLWJGL);
            if (path3 != null) {
                return path3;
            }
        } else {
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false).booleanValue();
            try {
                String regular = Library.getRegularFilePath(resourceURL);
                if (regular != null) {
                    APIUtil.apiLogMore("Loaded from classpath: " + regular);
                    return Paths.get(regular, new String[0]);
                }
                if (debugLoader) {
                    APIUtil.apiLogMore("Using SharedLibraryLoader...");
                }
                FileChannel ignored = SharedLibraryLoader.load(name, name, resourceURL, null);
                try {
                    Path path4 = loadFromLibraryPath(module, name, bundledWithLWJGL);
                    if (path4 != null) {
                        if (ignored != null) {
                            ignored.close();
                        }
                        return path4;
                    }
                    if (ignored != null) {
                        ignored.close();
                    }
                } finally {
                }
            } catch (Exception e) {
                if (debugLoader) {
                    e.printStackTrace(APIUtil.DEBUG_STREAM);
                }
            }
        }
        String paths = System.getProperty(SystemProperties.JAVA_LIBRARY_PATH);
        if (paths != null && (path = load(module, name, bundledWithLWJGL, SystemProperties.JAVA_LIBRARY_PATH, paths)) != null) {
            return path;
        }
        if (printError) {
            printError();
        }
        throw new IllegalStateException("Failed to locate library resource: " + name);
    }

    private static Path loadFromLibraryPath(String module, String libName, boolean bundledWithLWJGL) {
        String paths = Configuration.LIBRARY_PATH.get();
        if (paths == null) {
            return null;
        }
        return load(module, libName, bundledWithLWJGL, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    private static Path load(String module, String name, boolean bundledWithLWJGL, String property, String paths) {
        Path resource = Library.findFile(paths, module, name, bundledWithLWJGL);
        if (resource == null) {
            APIUtil.apiLogMore(name + " not found in " + property + "=" + paths);
            return null;
        }
        APIUtil.apiLogMore("Loaded from " + property + ": " + resource);
        return resource;
    }

    public static Path load(Class<?> context, String module, Configuration<String> name, String... defaultNames) {
        return load(context, module, name, (Supplier<Path>) null, defaultNames);
    }

    public static Path load(Class<?> context, String module, Configuration<String> name, Supplier<Path> fallback, String... defaultNames) {
        if (defaultNames.length == 0) {
            throw new IllegalArgumentException("No default names specified.");
        }
        String resourceName = name.get();
        if (resourceName != null) {
            return load(context, module, resourceName);
        }
        if (fallback == null && defaultNames.length <= 1) {
            return load(context, module, defaultNames[0]);
        }
        try {
            return load(context, module, defaultNames[0], false, false);
        } catch (Throwable t) {
            int i = 1;
            while (i < defaultNames.length) {
                try {
                    return load(context, module, defaultNames[i], false, fallback == null && i == defaultNames.length - 1);
                } catch (Throwable th) {
                    i++;
                }
            }
            if (fallback != null) {
                return fallback.get();
            }
            throw t;
        }
    }

    private static void printError() {
        Library.printError("[LWJGL] Failed to load a library resource. Possible solutions:\n\ta) Add the directory that contains the resource to -Djava.library.path or -Dorg.lwjgl.librarypath.\n\tb) Add the JAR that contains the resource to the classpath.");
    }
}
