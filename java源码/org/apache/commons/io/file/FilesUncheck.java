package org.apache.commons.io.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Stream;
import org.apache.commons.io.function.IOBiFunction;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOQuadFunction;
import org.apache.commons.io.function.IOTriFunction;
import org.apache.commons.io.function.Uncheck;

/* loaded from: classes24.dex */
public final class FilesUncheck {
    public static long copy(InputStream in, Path target, CopyOption... options) {
        return ((Long) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda55
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Long.valueOf(Files.copy((InputStream) obj, (Path) obj2, (CopyOption[]) obj3));
            }
        }, in, target, options)).longValue();
    }

    public static long copy(Path source, OutputStream out) {
        return ((Long) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda8
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Long.valueOf(Files.copy((Path) obj, (OutputStream) obj2));
            }
        }, source, out)).longValue();
    }

    public static Path copy(Path source, Path target, CopyOption... options) {
        return (Path) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda22
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.copy((Path) obj, (Path) obj2, (CopyOption[]) obj3);
            }
        }, source, target, options);
    }

    public static Path createDirectories(Path dir, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda2
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.createDirectories((Path) obj, (FileAttribute[]) obj2);
            }
        }, dir, attrs);
    }

    public static Path createDirectory(Path dir, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda33
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.createDirectory((Path) obj, (FileAttribute[]) obj2);
            }
        }, dir, attrs);
    }

    public static Path createFile(Path path, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda37
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.createFile((Path) obj, (FileAttribute[]) obj2);
            }
        }, path, attrs);
    }

    public static Path createLink(Path link, Path existing) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda3
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.createLink((Path) obj, (Path) obj2);
            }
        }, link, existing);
    }

    public static Path createSymbolicLink(Path link, Path target, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda39
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.createSymbolicLink((Path) obj, (Path) obj2, (FileAttribute[]) obj3);
            }
        }, link, target, attrs);
    }

    public static Path createTempDirectory(Path dir, String prefix, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda54
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.createTempDirectory((Path) obj, (String) obj2, (FileAttribute[]) obj3);
            }
        }, dir, prefix, attrs);
    }

    public static Path createTempDirectory(String prefix, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda46
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.createTempDirectory((String) obj, (FileAttribute[]) obj2);
            }
        }, prefix, attrs);
    }

    public static Path createTempFile(Path dir, String prefix, String suffix, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOQuadFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda30
            @Override // org.apache.commons.io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                return Files.createTempFile((Path) obj, (String) obj2, (String) obj3, (FileAttribute[]) obj4);
            }
        }, dir, prefix, suffix, attrs);
    }

    public static Path createTempFile(String prefix, String suffix, FileAttribute<?>... attrs) {
        return (Path) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda16
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.createTempFile((String) obj, (String) obj2, (FileAttribute[]) obj3);
            }
        }, prefix, suffix, attrs);
    }

    public static void delete(Path path) {
        Uncheck.accept(new IOConsumer() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda23
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                Files.delete((Path) obj);
            }
        }, path);
    }

    public static boolean deleteIfExists(Path path) {
        return ((Boolean) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda40
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Boolean.valueOf(Files.deleteIfExists((Path) obj));
            }
        }, path)).booleanValue();
    }

    public static Stream<Path> find(Path start, int maxDepth, BiPredicate<Path, BasicFileAttributes> matcher, FileVisitOption... options) {
        return (Stream) Uncheck.apply(new IOQuadFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda18
            @Override // org.apache.commons.io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                return Files.find((Path) obj, ((Integer) obj2).intValue(), (BiPredicate) obj3, (FileVisitOption[]) obj4);
            }
        }, start, Integer.valueOf(maxDepth), matcher, options);
    }

    public static Object getAttribute(Path path, String attribute, LinkOption... options) {
        return Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda7
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.getAttribute((Path) obj, (String) obj2, (LinkOption[]) obj3);
            }
        }, path, attribute, options);
    }

    public static FileStore getFileStore(Path path) {
        return (FileStore) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda44
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.getFileStore((Path) obj);
            }
        }, path);
    }

    public static FileTime getLastModifiedTime(Path path, LinkOption... options) {
        return (FileTime) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda49
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.getLastModifiedTime((Path) obj, (LinkOption[]) obj2);
            }
        }, path, options);
    }

    public static UserPrincipal getOwner(Path path, LinkOption... options) {
        return (UserPrincipal) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda21
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.getOwner((Path) obj, (LinkOption[]) obj2);
            }
        }, path, options);
    }

    public static Set<PosixFilePermission> getPosixFilePermissions(Path path, LinkOption... options) {
        return (Set) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda14
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.getPosixFilePermissions((Path) obj, (LinkOption[]) obj2);
            }
        }, path, options);
    }

    public static boolean isHidden(Path path) {
        return ((Boolean) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda38
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Boolean.valueOf(Files.isHidden((Path) obj));
            }
        }, path)).booleanValue();
    }

    public static boolean isSameFile(Path path, Path path2) {
        return ((Boolean) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda47
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Boolean.valueOf(Files.isSameFile((Path) obj, (Path) obj2));
            }
        }, path, path2)).booleanValue();
    }

    public static Stream<String> lines(Path path) {
        return (Stream) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda45
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.lines((Path) obj);
            }
        }, path);
    }

    public static Stream<String> lines(Path path, Charset cs) {
        return (Stream) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda31
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.lines((Path) obj, (Charset) obj2);
            }
        }, path, cs);
    }

    public static Stream<Path> list(Path dir) {
        return (Stream) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda4
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.list((Path) obj);
            }
        }, dir);
    }

    public static Path move(Path source, Path target, CopyOption... options) {
        return (Path) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda9
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.move((Path) obj, (Path) obj2, (CopyOption[]) obj3);
            }
        }, source, target, options);
    }

    public static BufferedReader newBufferedReader(Path path) {
        return (BufferedReader) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda24
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.newBufferedReader((Path) obj);
            }
        }, path);
    }

    public static BufferedReader newBufferedReader(Path path, Charset cs) {
        return (BufferedReader) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda10
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.newBufferedReader((Path) obj, (Charset) obj2);
            }
        }, path, cs);
    }

    public static BufferedWriter newBufferedWriter(Path path, Charset cs, OpenOption... options) {
        return (BufferedWriter) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda17
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.newBufferedWriter((Path) obj, (Charset) obj2, (OpenOption[]) obj3);
            }
        }, path, cs, options);
    }

    public static BufferedWriter newBufferedWriter(Path path, OpenOption... options) {
        return (BufferedWriter) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda50
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.newBufferedWriter((Path) obj, (OpenOption[]) obj2);
            }
        }, path, options);
    }

    public static SeekableByteChannel newByteChannel(Path path, OpenOption... options) {
        return (SeekableByteChannel) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda32
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.newByteChannel((Path) obj, (OpenOption[]) obj2);
            }
        }, path, options);
    }

    public static SeekableByteChannel newByteChannel(Path path, Set<? extends OpenOption> options, FileAttribute<?>... attrs) {
        return (SeekableByteChannel) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda35
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.newByteChannel((Path) obj, (Set) obj2, (FileAttribute[]) obj3);
            }
        }, path, options, attrs);
    }

    public static DirectoryStream<Path> newDirectoryStream(Path dir) {
        return (DirectoryStream) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda48
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.newDirectoryStream((Path) obj);
            }
        }, dir);
    }

    public static DirectoryStream<Path> newDirectoryStream(Path dir, DirectoryStream.Filter<? super Path> filter) {
        return (DirectoryStream) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda13
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.newDirectoryStream((Path) obj, (DirectoryStream.Filter<? super Path>) obj2);
            }
        }, dir, filter);
    }

    public static DirectoryStream<Path> newDirectoryStream(Path dir, String glob) {
        return (DirectoryStream) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda19
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.newDirectoryStream((Path) obj, (String) obj2);
            }
        }, dir, glob);
    }

    public static InputStream newInputStream(Path path, OpenOption... options) {
        return (InputStream) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda42
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.newInputStream((Path) obj, (OpenOption[]) obj2);
            }
        }, path, options);
    }

    public static OutputStream newOutputStream(Path path, OpenOption... options) {
        return (OutputStream) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda51
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.newOutputStream((Path) obj, (OpenOption[]) obj2);
            }
        }, path, options);
    }

    public static String probeContentType(Path path) {
        return (String) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda29
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.probeContentType((Path) obj);
            }
        }, path);
    }

    public static byte[] readAllBytes(Path path) {
        return (byte[]) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda6
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.readAllBytes((Path) obj);
            }
        }, path);
    }

    public static List<String> readAllLines(Path path) {
        return (List) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda11
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.readAllLines((Path) obj);
            }
        }, path);
    }

    public static List<String> readAllLines(Path path, Charset cs) {
        return (List) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda27
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.readAllLines((Path) obj, (Charset) obj2);
            }
        }, path, cs);
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption... options) {
        return (A) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda12
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.readAttributes((Path) obj, (Class) obj2, (LinkOption[]) obj3);
            }
        }, path, type, options);
    }

    public static Map<String, Object> readAttributes(Path path, String attributes, LinkOption... options) {
        return (Map) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda52
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.readAttributes((Path) obj, (String) obj2, (LinkOption[]) obj3);
            }
        }, path, attributes, options);
    }

    public static Path readSymbolicLink(Path link) {
        return (Path) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda26
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Files.readSymbolicLink((Path) obj);
            }
        }, link);
    }

    public static Path setAttribute(Path path, String attribute, Object value, LinkOption... options) {
        return (Path) Uncheck.apply(new IOQuadFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda25
            @Override // org.apache.commons.io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                return Files.setAttribute((Path) obj, (String) obj2, obj3, (LinkOption[]) obj4);
            }
        }, path, attribute, value, options);
    }

    public static Path setLastModifiedTime(Path path, FileTime time) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda20
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.setLastModifiedTime((Path) obj, (FileTime) obj2);
            }
        }, path, time);
    }

    public static Path setOwner(Path path, UserPrincipal owner) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.setOwner((Path) obj, (UserPrincipal) obj2);
            }
        }, path, owner);
    }

    public static Path setPosixFilePermissions(Path path, Set<PosixFilePermission> perms) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda36
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.setPosixFilePermissions((Path) obj, (Set) obj2);
            }
        }, path, perms);
    }

    public static long size(Path path) {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda15
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Long.valueOf(Files.size((Path) obj));
            }
        }, path)).longValue();
    }

    public static Stream<Path> walk(Path start, FileVisitOption... options) {
        return (Stream) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda43
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.walk((Path) obj, (FileVisitOption[]) obj2);
            }
        }, start, options);
    }

    public static Stream<Path> walk(Path start, int maxDepth, FileVisitOption... options) {
        return (Stream) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda5
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.walk((Path) obj, ((Integer) obj2).intValue(), (FileVisitOption[]) obj3);
            }
        }, start, Integer.valueOf(maxDepth), options);
    }

    public static Path walkFileTree(Path start, FileVisitor<? super Path> visitor) {
        return (Path) Uncheck.apply(new IOBiFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda53
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return Files.walkFileTree((Path) obj, (FileVisitor) obj2);
            }
        }, start, visitor);
    }

    public static Path walkFileTree(Path start, Set<FileVisitOption> options, int maxDepth, FileVisitor<? super Path> visitor) {
        return (Path) Uncheck.apply(new IOQuadFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda41
            @Override // org.apache.commons.io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                return Files.walkFileTree((Path) obj, (Set) obj2, ((Integer) obj3).intValue(), (FileVisitor) obj4);
            }
        }, start, options, Integer.valueOf(maxDepth), visitor);
    }

    public static Path write(Path path, byte[] bytes, OpenOption... options) {
        return (Path) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda1
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.write((Path) obj, (byte[]) obj2, (OpenOption[]) obj3);
            }
        }, path, bytes, options);
    }

    public static Path write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options) {
        return (Path) Uncheck.apply(new IOQuadFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda28
            @Override // org.apache.commons.io.function.IOQuadFunction
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
                return Files.write((Path) obj, (Iterable) obj2, (Charset) obj3, (OpenOption[]) obj4);
            }
        }, path, lines, cs, options);
    }

    public static Path write(Path path, Iterable<? extends CharSequence> lines, OpenOption... options) {
        return (Path) Uncheck.apply(new IOTriFunction() { // from class: org.apache.commons.io.file.FilesUncheck$$ExternalSyntheticLambda34
            @Override // org.apache.commons.io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Files.write((Path) obj, (Iterable<? extends CharSequence>) obj2, (OpenOption[]) obj3);
            }
        }, path, lines, options);
    }

    private FilesUncheck() {
    }
}
