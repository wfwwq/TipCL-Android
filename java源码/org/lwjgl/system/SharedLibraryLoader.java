package org.lwjgl.system;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import org.lwjgl.Version;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/SharedLibraryLoader.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/SharedLibraryLoader.class */
final class SharedLibraryLoader {
    private static Path extractPath;
    private static boolean checkedLoad;
    private static final Lock EXTRACT_PATH_LOCK = new ReentrantLock();
    private static HashSet<Path> extractPaths = new HashSet<>(4);

    private SharedLibraryLoader() {
    }

    static FileChannel load(String name, String filename, URL resource, Consumer<String> load) {
        Path extractedFile;
        try {
            EXTRACT_PATH_LOCK.lock();
            try {
                if (extractPath != null) {
                    extractedFile = extractPath.resolve(filename);
                } else {
                    extractedFile = getExtractPath(filename, resource, load);
                    Path parent = extractedFile.getParent();
                    if (checkedLoad) {
                        extractPath = parent;
                    }
                    initExtractPath(parent);
                }
                EXTRACT_PATH_LOCK.unlock();
                return extract(extractedFile, resource);
            } catch (Throwable th) {
                EXTRACT_PATH_LOCK.unlock();
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException("\tFailed to extract " + name + " library", e);
        }
    }

    private static void initExtractPath(Path extractPath2) {
        if (extractPaths.contains(extractPath2)) {
            return;
        }
        extractPaths.add(extractPath2);
        String newLibPath = extractPath2.toAbsolutePath().toString();
        String libPath = Configuration.LIBRARY_PATH.get();
        if (libPath != null && !libPath.isEmpty()) {
            newLibPath = newLibPath + File.pathSeparator + libPath;
        }
        System.setProperty(Configuration.LIBRARY_PATH.getProperty(), newLibPath);
        Configuration.LIBRARY_PATH.set(newLibPath);
    }

    private static Path getExtractPath(String filename, URL resource, Consumer<String> load) throws IOException {
        String override = Configuration.SHARED_LIBRARY_EXTRACT_PATH.get();
        if (override != null) {
            Path root = Paths.get(override, new String[0]);
            Path file = root.resolve(filename);
            if (canWrite(root, file, resource, load)) {
                return file;
            }
            APIUtil.apiLogMore("The path " + override + " is not accessible. Trying other paths.");
        }
        String version = Version.getVersion().replace(' ', '-');
        String arch = Platform.getArchitecture().name().toLowerCase();
        Path root2 = Paths.get(System.getProperty("java.io.tmpdir"), new String[0]);
        Path file2 = root2.resolve(Paths.get(Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get("lwjgl_" + System.getProperty("user.name").trim()), version, arch, filename));
        if (canWrite(root2, file2, resource, load)) {
            return file2;
        }
        Path lwjgl_version_filename = Paths.get("." + Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get("lwjgl"), version, arch, filename);
        Path root3 = Paths.get("", new String[0]).toAbsolutePath();
        Path file3 = root3.resolve(lwjgl_version_filename);
        if (canWrite(root3, file3, resource, load)) {
            return file3;
        }
        Path root4 = Paths.get(System.getProperty("user.home"), new String[0]);
        Path file4 = root4.resolve(lwjgl_version_filename);
        if (canWrite(root4, file4, resource, load)) {
            return file4;
        }
        if (Platform.get() == Platform.WINDOWS) {
            String env = System.getenv("SystemRoot");
            if (env != null) {
                Path root5 = Paths.get(env, "Temp");
                Path file5 = root5.resolve(lwjgl_version_filename);
                if (canWrite(root5, file5, resource, load)) {
                    return file5;
                }
            }
            String env2 = System.getenv("SystemDrive");
            if (env2 != null) {
                Path root6 = Paths.get(env2 + "/", new String[0]);
                Path file6 = root6.resolve(Paths.get("Temp", new String[0]).resolve(lwjgl_version_filename));
                if (canWrite(root6, file6, resource, load)) {
                    return file6;
                }
            }
        }
        try {
            Path file7 = Files.createTempDirectory("lwjgl", new FileAttribute[0]);
            Path root7 = file7.getParent();
            Path file8 = file7.resolve(filename);
            if (canWrite(root7, file8, resource, load)) {
                return file8;
            }
        } catch (IOException e) {
        }
        throw new RuntimeException("Failed to find an appropriate directory to extract the native library");
    }

    private static FileChannel extract(Path file, URL resource) throws IOException {
        InputStream source;
        if (Files.exists(file, new LinkOption[0])) {
            source = resource.openStream();
            try {
                InputStream target = Files.newInputStream(file, new OpenOption[0]);
                try {
                    if (crc(source) == crc(target)) {
                        if (Configuration.DEBUG_LOADER.get(false).booleanValue()) {
                            APIUtil.apiLogMore("Found at: " + file);
                        }
                        FileChannel fileChannelLock = lock(file);
                        if (target != null) {
                            target.close();
                        }
                        if (source != null) {
                            source.close();
                        }
                        return fileChannelLock;
                    }
                    if (target != null) {
                        target.close();
                    }
                    if (source != null) {
                        source.close();
                    }
                } finally {
                }
            } finally {
                if (source != null) {
                    try {
                        source.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        APIUtil.apiLogMore("Extracting: " + resource.getPath());
        if (extractPath == null) {
            APIUtil.apiLogMore("        to: " + file);
        }
        Files.createDirectories(file.getParent(), new FileAttribute[0]);
        source = resource.openStream();
        try {
            Files.copy(source, file, StandardCopyOption.REPLACE_EXISTING);
            if (source != null) {
                source.close();
            }
            return lock(file);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static FileChannel lock(Path file) throws IOException {
        try {
            FileChannel fc = FileChannel.open(file, new OpenOption[0]);
            if (fc.tryLock(0L, Long.MAX_VALUE, true) == null) {
                if (Configuration.DEBUG_LOADER.get(false).booleanValue()) {
                    APIUtil.apiLogMore("File is locked by another process, waiting...");
                }
                fc.lock(0L, Long.MAX_VALUE, true);
            }
            return fc;
        } catch (Exception e) {
            throw new RuntimeException("Failed to lock file.", e);
        }
    }

    private static long crc(InputStream input) throws IOException {
        CRC32 crc = new CRC32();
        byte[] buffer = new byte[8192];
        while (true) {
            int n = input.read(buffer);
            if (n != -1) {
                crc.update(buffer, 0, n);
            } else {
                return crc.getValue();
            }
        }
    }

    private static boolean canWrite(Path root, Path file, URL resource, Consumer<String> load) throws IOException {
        Path testFile;
        if (Files.exists(file, new LinkOption[0])) {
            if (!Files.isWritable(file)) {
                return false;
            }
            testFile = file.getParent().resolve(".lwjgl.test");
        } else {
            try {
                Files.createDirectories(file.getParent(), new FileAttribute[0]);
                testFile = file;
            } catch (IOException e) {
                return false;
            }
        }
        try {
            Files.write(testFile, new byte[0], new OpenOption[0]);
            Files.delete(testFile);
            if (load != null) {
                FileChannel ignored = extract(file, resource);
                try {
                    load.accept(file.toAbsolutePath().toString());
                    if (ignored != null) {
                        ignored.close();
                    }
                    checkedLoad = true;
                    return true;
                } finally {
                }
            }
            return true;
        } catch (Throwable th) {
            if (file == testFile) {
                canWriteCleanup(root, file);
                return false;
            }
            return false;
        }
    }

    private static void canWriteCleanup(Path root, Path file) throws IOException {
        try {
            Files.deleteIfExists(file);
            Path parent = file.getParent();
            while (true) {
                if (Files.isSameFile(parent, root)) {
                    break;
                }
                Stream<Path> dir = Files.list(parent);
                try {
                    if (dir.findAny().isPresent()) {
                        if (dir != null) {
                            dir.close();
                        }
                    } else {
                        if (dir != null) {
                            dir.close();
                        }
                        Files.delete(parent);
                        parent = parent.getParent();
                    }
                } finally {
                }
            }
        } catch (IOException e) {
        }
    }
}
