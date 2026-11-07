package org.lwjgl.system;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemProperties;
import org.lwjgl.Version;
import org.lwjgl.system.linux.LinuxLibrary;
import org.lwjgl.system.windows.WindowsLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Library.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Library.class */
public final class Library {
    static final String JAVA_LIBRARY_PATH = "java.library.path";
    public static final String JNI_LIBRARY_NAME = Configuration.LIBRARY_NAME.get(Platform.mapLibraryNameBundled("lwjgl"));
    private static final Pattern PATH_SEPARATOR = Pattern.compile(File.pathSeparator);
    private static final Pattern NATIVES_JAR = Pattern.compile("/[\\w-]+?-natives-\\w+.jar!/");
    private static final String EXPECTED_MANIFEST_PLATFORM = Platform.get().name().toLowerCase() + IOUtils.DIR_SEPARATOR_UNIX + Platform.getArchitecture().name().toLowerCase();

    static {
        if (Checks.DEBUG) {
            APIUtil.DEBUG_STREAM.print("[LWJGL] Version: " + Version.getVersion() + "\n\t OS: " + System.getProperty(SystemProperties.OS_NAME) + " v" + System.getProperty(SystemProperties.OS_VERSION) + "\n\tJRE: " + Platform.get().getName() + StringUtils.SPACE + System.getProperty(SystemProperties.OS_ARCH) + StringUtils.SPACE + System.getProperty(SystemProperties.JAVA_VERSION) + "\n\tJVM: " + System.getProperty(SystemProperties.JAVA_VM_NAME) + " v" + System.getProperty(SystemProperties.JAVA_VM_VERSION) + " by " + System.getProperty(SystemProperties.JAVA_VM_VENDOR) + StringUtils.LF);
        }
        try {
            if (Platform.get() == Platform.MACOSX) {
                System.load(System.getenv("BUNDLE_PATH") + "/AngelAuraAmethyst");
            } else if (Platform.get() == Platform.LINUX) {
                System.loadLibrary("pojavexec");
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        loadSystem("org.lwjgl", JNI_LIBRARY_NAME);
    }

    private Library() {
    }

    public static void initialize() {
    }

    public static void loadSystem(String module, String name) throws UnsatisfiedLinkError {
        loadSystem(System::load, System::loadLibrary, Library.class, module, name);
    }

    public static void loadSystem(Consumer<String> load, Consumer<String> loadLibrary, Class<?> context, String module, String name) throws UnsatisfiedLinkError {
        String regular;
        if (Checks.DEBUG) {
            APIUtil.DEBUG_STREAM.print("[LWJGL] Loading JNI library: " + name + "\n\tModule: " + module + StringUtils.LF);
        }
        if (Paths.get(name, new String[0]).isAbsolute()) {
            load.accept(name);
            APIUtil.apiLogMore("Success");
            return;
        }
        String libName = Platform.get().mapLibraryName(name);
        boolean bundledWithLWJGL = name.contains("lwjgl");
        URL libURL = findResource(context, module, libName, bundledWithLWJGL);
        if (libURL == null) {
            if (loadSystemFromLibraryPath(load, context, module, libName, bundledWithLWJGL)) {
                return;
            }
        } else {
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false).booleanValue();
            try {
                if (!Configuration.SHARED_LIBRARY_EXTRACT_FORCE.get(false).booleanValue() && (regular = getRegularFilePath(libURL)) != null) {
                    load.accept(regular);
                    APIUtil.apiLogMore("Loaded from classpath: " + regular);
                    return;
                }
                if (debugLoader) {
                    APIUtil.apiLogMore("Using SharedLibraryLoader...");
                }
                FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL, load);
                try {
                    if (loadSystemFromLibraryPath(load, context, module, libName, bundledWithLWJGL)) {
                        if (ignored != null) {
                            ignored.close();
                            return;
                        }
                        return;
                    } else if (ignored != null) {
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
        String javaLibraryPath = System.getProperty("java.library.path");
        if (bundledWithLWJGL && javaLibraryPath != null && loadSystem(load, context, module, getBundledPath(module, libName), false, "java.library.path", javaLibraryPath)) {
            return;
        }
        try {
            loadLibrary.accept(name);
            Path libFile = javaLibraryPath == null ? null : findFile(javaLibraryPath, module, libName, bundledWithLWJGL);
            if (libFile != null) {
                APIUtil.apiLogMore(String.format("Loaded from %s: %s", "java.library.path", libFile));
                if (bundledWithLWJGL) {
                    checkHash(context, libFile, module, libName);
                    return;
                }
                return;
            }
            APIUtil.apiLogMore("Loaded from a ClassLoader provided path.");
        } catch (Throwable th) {
            APIUtil.apiLogMore(libName + " not found in java.library.path");
            detectPlatformMismatch(context, module);
            printError(true);
            throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
        }
    }

    private static boolean loadSystemFromLibraryPath(Consumer<String> load, Class<?> context, String module, String libName, boolean bundledWithLWJGL) {
        String paths = Configuration.LIBRARY_PATH.get();
        return paths != null && loadSystem(load, context, module, libName, bundledWithLWJGL, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    private static boolean loadSystem(Consumer<String> load, Class<?> context, String module, String libName, boolean bundledWithLWJGL, String property, String paths) {
        Path libFile = findFile(paths, module, libName, bundledWithLWJGL);
        if (libFile == null) {
            APIUtil.apiLogMore(libName + " not found in " + property + "=" + paths);
            return false;
        }
        load.accept(libFile.toAbsolutePath().toString());
        APIUtil.apiLogMore("Loaded from " + property + ": " + libFile);
        if (bundledWithLWJGL) {
            checkHash(context, libFile, module, libName);
            return true;
        }
        return true;
    }

    public static SharedLibrary loadNative(String module, String name) {
        return loadNative(Library.class, module, name);
    }

    public static SharedLibrary loadNative(Class<?> context, String module, String name) {
        return loadNative(context, module, name, false);
    }

    public static SharedLibrary loadNative(Class<?> context, String module, String name, boolean bundledWithLWJGL) {
        return loadNative(context, module, name, bundledWithLWJGL, true);
    }

    private static SharedLibrary loadNative(Class<?> context, String module, String name, boolean bundledWithLWJGL, boolean printError) throws NoSuchMethodException, IOException, SecurityException {
        String regular;
        SharedLibrary lib;
        SharedLibrary lib2;
        SharedLibrary lib3;
        if (Checks.DEBUG) {
            APIUtil.DEBUG_STREAM.print("[LWJGL] Loading library: " + name + "\n\tModule: " + module + StringUtils.LF);
        }
        if (Paths.get(name, new String[0]).isAbsolute()) {
            SharedLibrary lib4 = APIUtil.apiCreateLibrary(name);
            APIUtil.apiLogMore("Success");
            return lib4;
        }
        String libName = Platform.get().mapLibraryName(name);
        URL libURL = findResource(context, module, libName, bundledWithLWJGL);
        if (libURL == null) {
            SharedLibrary lib5 = loadNativeFromLibraryPath(context, module, libName, bundledWithLWJGL);
            if (lib5 != null) {
                return lib5;
            }
        } else {
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false).booleanValue();
            try {
                if (!Configuration.SHARED_LIBRARY_EXTRACT_FORCE.get(false).booleanValue() && (regular = getRegularFilePath(libURL)) != null) {
                    SharedLibrary lib6 = APIUtil.apiCreateLibrary(regular);
                    APIUtil.apiLogMore("Loaded from classpath: " + regular);
                    return lib6;
                }
                if (debugLoader) {
                    APIUtil.apiLogMore("Using SharedLibraryLoader...");
                }
                FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL, null);
                try {
                    SharedLibrary lib7 = loadNativeFromLibraryPath(context, module, libName, bundledWithLWJGL);
                    if (lib7 != null) {
                        if (ignored != null) {
                            ignored.close();
                        }
                        return lib7;
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
        if (!bundledWithLWJGL && (lib3 = loadNativeFromSystem(libName)) != null) {
            return lib3;
        }
        if (Configuration.EMULATE_SYSTEM_LOADLIBRARY.get(false).booleanValue()) {
            try {
                Method findLibrary = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                findLibrary.setAccessible(true);
                String libPath = (String) findLibrary.invoke(context.getClassLoader(), name);
                if (libPath != null) {
                    SharedLibrary lib8 = APIUtil.apiCreateLibrary(libPath);
                    APIUtil.apiLogMore("Loaded from ClassLoader provided path: " + libPath);
                    return lib8;
                }
            } catch (Exception e2) {
            }
        }
        String paths = System.getProperty("java.library.path");
        if (paths != null && (lib2 = loadNative(context, module, libName, bundledWithLWJGL, "java.library.path", paths)) != null) {
            return lib2;
        }
        if (bundledWithLWJGL && (lib = loadNativeFromSystem(libName)) != null) {
            return lib;
        }
        if (printError) {
            detectPlatformMismatch(context, module);
            printError(bundledWithLWJGL);
        }
        throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
    }

    private static SharedLibrary loadNativeFromSystem(String libName) {
        SharedLibrary lib;
        String str;
        try {
            lib = APIUtil.apiCreateLibrary(libName);
            String path = lib.getPath();
            if (path == null) {
                str = "Loaded from system paths";
            } else {
                str = "Loaded from system paths: " + path;
            }
            APIUtil.apiLogMore(str);
        } catch (UnsatisfiedLinkError e) {
            lib = null;
            APIUtil.apiLogMore(libName + " not found in system paths");
        }
        return lib;
    }

    private static SharedLibrary loadNativeFromLibraryPath(Class<?> context, String module, String libName, boolean bundledWithLWJGL) {
        String paths = Configuration.LIBRARY_PATH.get();
        if (paths == null) {
            return null;
        }
        return loadNative(context, module, libName, bundledWithLWJGL, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    private static SharedLibrary loadNative(Class<?> context, String module, String libName, boolean bundledWithLWJGL, String property, String paths) {
        Path libFile = findFile(paths, module, libName, bundledWithLWJGL);
        if (libFile == null) {
            APIUtil.apiLogMore(libName + " not found in " + property + "=" + paths);
            return null;
        }
        SharedLibrary lib = APIUtil.apiCreateLibrary(libFile.toAbsolutePath().toString());
        APIUtil.apiLogMore("Loaded from " + property + ": " + libFile);
        if (bundledWithLWJGL) {
            checkHash(context, libFile, module, libName);
        }
        return lib;
    }

    public static SharedLibrary loadNative(Class<?> context, String module, Configuration<String> name, String... defaultNames) {
        return loadNative(context, module, name, (Supplier<SharedLibrary>) null, defaultNames);
    }

    public static SharedLibrary loadNative(Class<?> context, String module, Configuration<String> name, Supplier<SharedLibrary> fallback, String... defaultNames) {
        String libraryName;
        if (name != null && (libraryName = name.get()) != null) {
            return loadNative(context, module, libraryName, false);
        }
        if (defaultNames.length == 0) {
            if (fallback == null) {
                throw new IllegalArgumentException("No fallback library supplier specified.");
            }
            return fallback.get();
        }
        if (fallback == null && defaultNames.length == 1) {
            return loadNative(context, module, defaultNames[0], false);
        }
        try {
            return loadNative(context, module, defaultNames[0], false, false);
        } catch (Throwable t) {
            int i = 1;
            while (i < defaultNames.length) {
                try {
                    return loadNative(context, module, defaultNames[i], false, fallback == null && i == defaultNames.length - 1);
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

    public static SharedLibrary createFromHandle(String name, long handle) {
        switch (Platform.get()) {
            case WINDOWS:
                return new WindowsLibrary(name, handle);
            case LINUX:
                return new LinuxLibrary(name, handle);
            default:
                throw new IllegalStateException();
        }
    }

    private static String getBundledPath(String module, String resource) {
        return Platform.mapLibraryPathBundled(module.replace('.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + resource);
    }

    static URL findResource(Class<?> context, String module, String resource, boolean bundledWithLWJGL) {
        URL url = null;
        if (bundledWithLWJGL) {
            String bundledResource = getBundledPath(module, resource);
            if (!bundledResource.equals(resource)) {
                url = context.getClassLoader().getResource(bundledResource);
            }
        }
        return url == null ? context.getClassLoader().getResource(resource) : url;
    }

    static String getRegularFilePath(URL url) {
        if (url.getProtocol().equals("file")) {
            try {
                Path path = Paths.get(url.toURI());
                if (path.isAbsolute() && Files.isReadable(path)) {
                    return path.toString();
                }
                return null;
            } catch (URISyntaxException e) {
                return null;
            }
        }
        return null;
    }

    static Path findFile(String path, String module, String file, boolean bundledWithLWJGL) {
        Path p;
        if (bundledWithLWJGL) {
            String bundledFile = getBundledPath(module, file);
            if (!bundledFile.equals(file) && (p = findFile(path, bundledFile)) != null) {
                return p;
            }
        }
        return findFile(path, file);
    }

    private static Path findFile(String path, String file) {
        for (String directory : PATH_SEPARATOR.split(path)) {
            Path p = Paths.get(directory, file);
            if (Files.isReadable(p)) {
                return p;
            }
        }
        return null;
    }

    private static void detectPlatformMismatch(Class<?> context, String module) throws IOException {
        String jarPlatform;
        if (!module.startsWith("org.lwjgl")) {
            return;
        }
        String moduleTitle = module.equals("org.lwjgl") ? "lwjgl" : "lwjgl-" + module.substring("org.lwjgl.".length());
        List<String> platforms = new ArrayList<>(8);
        try {
            Enumeration<URL> manifests = context.getClassLoader().getResources("META-INF/MANIFEST.MF");
            while (manifests.hasMoreElements()) {
                InputStream is = manifests.nextElement().openStream();
                try {
                    Manifest manifest = new Manifest(is);
                    Attributes attribs = manifest.getMainAttributes();
                    if (moduleTitle.equals(attribs.getValue("Implementation-Title")) && (jarPlatform = attribs.getValue("LWJGL-Platform")) != null && !EXPECTED_MANIFEST_PLATFORM.equals(jarPlatform)) {
                        platforms.add(jarPlatform);
                    }
                    if (is != null) {
                        is.close();
                    }
                } catch (Throwable th) {
                    if (is != null) {
                        try {
                            is.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e) {
        }
        if (!platforms.isEmpty()) {
            APIUtil.DEBUG_STREAM.print("[LWJGL] Platform/architecture mismatch detected for module: " + module + "\n\tJVM platform:\t\t" + Platform.get().getName() + StringUtils.SPACE + System.getProperty(SystemProperties.OS_ARCH) + StringUtils.SPACE + System.getProperty(SystemProperties.JAVA_VERSION) + "\n\t\t" + System.getProperty(SystemProperties.JAVA_VM_NAME) + " v" + System.getProperty(SystemProperties.JAVA_VM_VERSION) + " by " + System.getProperty(SystemProperties.JAVA_VM_VENDOR) + "\n\tPlatform" + (platforms.size() == 1 ? "" : "s") + " available on classpath:\n\t\t" + String.join("\n\t\t", platforms) + StringUtils.LF);
        }
    }

    private static void printError(boolean bundledWithLWJGL) {
        String str;
        StringBuilder sbAppend = new StringBuilder().append("[LWJGL] Failed to load a library. Possible solutions:\n");
        if (bundledWithLWJGL) {
            str = "\ta) Add the directory that contains the shared library to -Djava.library.path or -Dorg.lwjgl.librarypath.\n\tb) Add the JAR that contains the shared library to the classpath.";
        } else {
            str = "\ta) Install the library or the driver that provides the library.\n\tb) Ensure that the library is accessible from the system library paths.";
        }
        printError(sbAppend.append(str).toString());
    }

    static void printError(String message) {
        StringBuilder sb = new StringBuilder(message);
        sb.append(StringUtils.LF);
        if (!Checks.DEBUG) {
            sb.append("[LWJGL] Enable debug mode with -Dorg.lwjgl.util.Debug=true for better diagnostics.\n");
            if (!Configuration.DEBUG_LOADER.get(false).booleanValue()) {
                sb.append("[LWJGL] Enable the SharedLibraryLoader debug mode with -Dorg.lwjgl.util.DebugLoader=true for better diagnostics.\n");
            }
        }
        APIUtil.DEBUG_STREAM.print(sb);
    }

    private static void checkHash(Class<?> context, Path libFile, String module, String libName) {
        byte[] sha1;
        if (Configuration.DISABLE_HASH_CHECKS.get(Boolean.valueOf(!Checks.CHECKS)).booleanValue()) {
            return;
        }
        try {
            URL classesURL = null;
            URL nativesURL = null;
            Enumeration<URL> resources = context.getClassLoader().getResources("META-INF/" + getBundledPath(module, libName) + ".sha1");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                if (NATIVES_JAR.matcher(url.toExternalForm()).find()) {
                    nativesURL = url;
                } else {
                    classesURL = url;
                }
            }
            if (classesURL == null) {
                return;
            }
            byte[] expected = getSHA1(classesURL);
            if (Checks.DEBUG || nativesURL == null) {
                sha1 = getSHA1(libFile);
            } else {
                sha1 = getSHA1(nativesURL);
            }
            byte[] actual = sha1;
            if (!Arrays.equals(expected, actual)) {
                APIUtil.DEBUG_STREAM.println("[LWJGL] [ERROR] Incompatible Java and native library versions detected.\nPossible reasons:\n\ta) -Djava.library.path is set to a folder containing shared libraries of an older LWJGL version.\n\tb) The classpath contains jar files of an older LWJGL version.\nPossible solutions:\n\ta) Make sure to not set -Djava.library.path (it is not needed for developing with LWJGL 3) or make\n\t   sure the folder it points to contains the shared libraries of the correct LWJGL version.\n\tb) Check the classpath and make sure to only have jar files of the same LWJGL version in it.");
            }
        } catch (Throwable t) {
            if (Checks.DEBUG) {
                APIUtil.apiLog("Failed to verify native library.");
                t.printStackTrace();
            }
        }
    }

    private static byte[] getSHA1(URL hashURL) throws IOException {
        byte[] hash = new byte[20];
        InputStream sha1 = hashURL.openStream();
        for (int i = 0; i < 20; i++) {
            try {
                hash[i] = (byte) ((Character.digit(sha1.read(), 16) << 4) | Character.digit(sha1.read(), 16));
            } catch (Throwable th) {
                if (sha1 != null) {
                    try {
                        sha1.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (sha1 != null) {
            sha1.close();
        }
        return hash;
    }

    private static byte[] getSHA1(Path libFile) throws NoSuchAlgorithmException, IOException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        InputStream input = Files.newInputStream(libFile, new OpenOption[0]);
        try {
            byte[] buffer = new byte[8192];
            while (true) {
                int n = input.read(buffer);
                if (n == -1) {
                    break;
                }
                digest.update(buffer, 0, n);
            }
            if (input != null) {
                input.close();
            }
            return digest.digest();
        } catch (Throwable th) {
            if (input != null) {
                try {
                    input.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
