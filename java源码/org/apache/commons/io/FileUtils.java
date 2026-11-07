package org.apache.commons.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.file.AccumulatorPathVisitor;
import org.apache.commons.io.file.Counters;
import org.apache.commons.io.file.PathFilter;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.file.StandardDeleteOption;
import org.apache.commons.io.filefilter.FileEqualsFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.function.IOBiFunction;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.function.Uncheck;

/* loaded from: classes24.dex */
public class FileUtils {
    public static final long ONE_EB = 1152921504606846976L;
    public static final long ONE_GB = 1073741824;
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = 1048576;
    public static final long ONE_PB = 1125899906842624L;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_KB_BI = BigInteger.valueOf(1024);
    public static final BigInteger ONE_MB_BI = ONE_KB_BI.multiply(ONE_KB_BI);
    public static final BigInteger ONE_GB_BI = ONE_KB_BI.multiply(ONE_MB_BI);
    public static final BigInteger ONE_TB_BI = ONE_KB_BI.multiply(ONE_GB_BI);
    public static final BigInteger ONE_PB_BI = ONE_KB_BI.multiply(ONE_TB_BI);
    public static final BigInteger ONE_EB_BI = ONE_KB_BI.multiply(ONE_PB_BI);
    public static final BigInteger ONE_ZB = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));
    public static final BigInteger ONE_YB = ONE_KB_BI.multiply(ONE_ZB);
    public static final File[] EMPTY_FILE_ARRAY = new File[0];

    public static String byteCountToDisplaySize(BigInteger size) {
        Objects.requireNonNull(size, "size");
        if (size.divide(ONE_EB_BI).compareTo(BigInteger.ZERO) > 0) {
            String displaySize = size.divide(ONE_EB_BI) + " EB";
            return displaySize;
        }
        if (size.divide(ONE_PB_BI).compareTo(BigInteger.ZERO) > 0) {
            String displaySize2 = size.divide(ONE_PB_BI) + " PB";
            return displaySize2;
        }
        if (size.divide(ONE_TB_BI).compareTo(BigInteger.ZERO) > 0) {
            String displaySize3 = size.divide(ONE_TB_BI) + " TB";
            return displaySize3;
        }
        if (size.divide(ONE_GB_BI).compareTo(BigInteger.ZERO) > 0) {
            String displaySize4 = size.divide(ONE_GB_BI) + " GB";
            return displaySize4;
        }
        if (size.divide(ONE_MB_BI).compareTo(BigInteger.ZERO) > 0) {
            String displaySize5 = size.divide(ONE_MB_BI) + " MB";
            return displaySize5;
        }
        if (size.divide(ONE_KB_BI).compareTo(BigInteger.ZERO) > 0) {
            String displaySize6 = size.divide(ONE_KB_BI) + " KB";
            return displaySize6;
        }
        String displaySize7 = size + " bytes";
        return displaySize7;
    }

    public static String byteCountToDisplaySize(long size) {
        return byteCountToDisplaySize(BigInteger.valueOf(size));
    }

    public static String byteCountToDisplaySize(Number size) {
        return byteCountToDisplaySize(size.longValue());
    }

    public static Checksum checksum(File file, Checksum checksum) throws IOException {
        requireExistsChecked(file, "file");
        requireFile(file, "file");
        Objects.requireNonNull(checksum, "checksum");
        InputStream inputStream = new CheckedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]), checksum);
        try {
            IOUtils.consume(inputStream);
            inputStream.close();
            return checksum;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long checksumCRC32(File file) throws IOException {
        return checksum(file, new CRC32()).getValue();
    }

    public static void cleanDirectory(File directory) throws IOException {
        IOConsumer.forAll(new IOConsumer() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda15
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                FileUtils.forceDelete((File) obj);
            }
        }, listFiles(directory, null));
    }

    private static void cleanDirectoryOnExit(File directory) throws IOException {
        IOConsumer.forAll(new IOConsumer() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda8
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) throws IOException {
                FileUtils.forceDeleteOnExit((File) obj);
            }
        }, listFiles(directory, null));
    }

    public static boolean contentEquals(File file1, File file2) throws IOException {
        boolean file1Exists;
        if (file1 == null && file2 == null) {
            return true;
        }
        if (file1 == null || file2 == null || (file1Exists = file1.exists()) != file2.exists()) {
            return false;
        }
        if (!file1Exists) {
            return true;
        }
        requireFile(file1, "file1");
        requireFile(file2, "file2");
        if (file1.length() != file2.length()) {
            return false;
        }
        if (file1.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        return PathUtils.fileContentEquals(file1.toPath(), file2.toPath());
    }

    public static boolean contentEqualsIgnoreEOL(File file1, File file2, String charsetName) throws IOException, UnsupportedCharsetException {
        boolean file1Exists;
        if (file1 == null && file2 == null) {
            return true;
        }
        if (file1 == null || file2 == null || (file1Exists = file1.exists()) != file2.exists()) {
            return false;
        }
        if (!file1Exists) {
            return true;
        }
        requireFile(file1, "file1");
        requireFile(file2, "file2");
        if (file1.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        Charset charset = Charsets.toCharset(charsetName);
        Reader input1 = new InputStreamReader(Files.newInputStream(file1.toPath(), new OpenOption[0]), charset);
        try {
            Reader input2 = new InputStreamReader(Files.newInputStream(file2.toPath(), new OpenOption[0]), charset);
            try {
                boolean zContentEqualsIgnoreEOL = IOUtils.contentEqualsIgnoreEOL(input1, input2);
                input2.close();
                input1.close();
                return zContentEqualsIgnoreEOL;
            } finally {
            }
        } catch (Throwable th) {
            try {
                input1.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> files) {
        return (File[]) files.toArray(EMPTY_FILE_ARRAY);
    }

    public static void copyDirectory(File srcDir, File destDir) throws IOException {
        copyDirectory(srcDir, destDir, true);
    }

    public static void copyDirectory(File srcDir, File destDir, boolean preserveFileDate) throws IOException {
        copyDirectory(srcDir, destDir, null, preserveFileDate);
    }

    public static void copyDirectory(File srcDir, File destDir, FileFilter filter) throws IOException {
        copyDirectory(srcDir, destDir, filter, true);
    }

    public static void copyDirectory(File srcDir, File destDir, FileFilter filter, boolean preserveFileDate) throws IOException {
        copyDirectory(srcDir, destDir, filter, preserveFileDate, StandardCopyOption.REPLACE_EXISTING);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void copyDirectory(java.io.File r11, java.io.File r12, java.io.FileFilter r13, boolean r14, java.nio.file.CopyOption... r15) throws java.io.IOException {
        /*
            requireFileCopy(r11, r12)
            java.lang.String r1 = "srcDir"
            requireDirectory(r11, r1)
            requireCanonicalPathsNotEquals(r11, r12)
            r1 = 0
            java.lang.String r6 = r11.getCanonicalPath()
            java.lang.String r7 = r12.getCanonicalPath()
            boolean r2 = r7.startsWith(r6)
            if (r2 == 0) goto L44
            java.io.File[] r3 = listFiles(r11, r13)
            int r4 = r3.length
            if (r4 <= 0) goto L44
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.length
            r4.<init>(r5)
            r1 = r4
            int r4 = r3.length
            r5 = 0
        L2b:
            if (r5 >= r4) goto L42
            r8 = r3[r5]
            java.io.File r9 = new java.io.File
            java.lang.String r10 = r8.getName()
            r9.<init>(r12, r10)
            java.lang.String r9 = r9.getCanonicalPath()
            r1.add(r9)
            int r5 = r5 + 1
            goto L2b
        L42:
            r3 = r1
            goto L45
        L44:
            r3 = r1
        L45:
            r0 = r11
            r1 = r12
            r2 = r13
            r4 = r14
            r5 = r15
            doCopyDirectory(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.FileUtils.copyDirectory(java.io.File, java.io.File, java.io.FileFilter, boolean, java.nio.file.CopyOption[]):void");
    }

    public static void copyDirectoryToDirectory(File sourceDir, File destinationDir) throws IOException {
        requireDirectoryIfExists(sourceDir, "sourceDir");
        requireDirectoryIfExists(destinationDir, "destinationDir");
        copyDirectory(sourceDir, new File(destinationDir, sourceDir.getName()), true);
    }

    public static void copyFile(File srcFile, File destFile) throws IOException {
        copyFile(srcFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFile(File srcFile, File destFile, boolean preserveFileDate) throws IOException {
        copyFile(srcFile, destFile, preserveFileDate, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFile(File srcFile, File destFile, boolean preserveFileDate, CopyOption... copyOptions) throws IOException {
        requireFileCopy(srcFile, destFile);
        requireFile(srcFile, "srcFile");
        requireCanonicalPathsNotEquals(srcFile, destFile);
        createParentDirectories(destFile);
        requireFileIfExists(destFile, "destFile");
        if (destFile.exists()) {
            requireCanWrite(destFile, "destFile");
        }
        Files.copy(srcFile.toPath(), destFile.toPath(), copyOptions);
        if (preserveFileDate && !setTimes(srcFile, destFile)) {
            throw new IOException("Cannot set the file time.");
        }
    }

    public static void copyFile(File srcFile, File destFile, CopyOption... copyOptions) throws IOException {
        copyFile(srcFile, destFile, true, copyOptions);
    }

    public static long copyFile(File input, OutputStream output) throws IOException {
        InputStream fis = Files.newInputStream(input.toPath(), new OpenOption[0]);
        try {
            long jCopyLarge = IOUtils.copyLarge(fis, output);
            if (fis != null) {
                fis.close();
            }
            return jCopyLarge;
        } catch (Throwable th) {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void copyFileToDirectory(File srcFile, File destDir) throws IOException {
        copyFileToDirectory(srcFile, destDir, true);
    }

    public static void copyFileToDirectory(File sourceFile, File destinationDir, boolean preserveFileDate) throws IOException {
        Objects.requireNonNull(sourceFile, "sourceFile");
        requireDirectoryIfExists(destinationDir, "destinationDir");
        copyFile(sourceFile, new File(destinationDir, sourceFile.getName()), preserveFileDate);
    }

    public static void copyInputStreamToFile(InputStream source, File destination) throws IOException {
        try {
            copyToFile(source, destination);
            if (source != null) {
                source.close();
            }
        } catch (Throwable th) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void copyToDirectory(File sourceFile, File destinationDir) throws IOException {
        Objects.requireNonNull(sourceFile, "sourceFile");
        if (sourceFile.isFile()) {
            copyFileToDirectory(sourceFile, destinationDir);
        } else {
            if (sourceFile.isDirectory()) {
                copyDirectoryToDirectory(sourceFile, destinationDir);
                return;
            }
            throw new FileNotFoundException("The source " + sourceFile + " does not exist");
        }
    }

    public static void copyToDirectory(Iterable<File> sourceIterable, File destinationDir) throws IOException {
        Objects.requireNonNull(sourceIterable, "sourceIterable");
        for (File src : sourceIterable) {
            copyFileToDirectory(src, destinationDir);
        }
    }

    public static void copyToFile(InputStream inputStream, File file) throws IOException {
        OutputStream out = newOutputStream(file, false);
        try {
            IOUtils.copy(inputStream, out);
            if (out != null) {
                out.close();
            }
        } catch (Throwable th) {
            if (out != null) {
                try {
                    out.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void copyURLToFile(final URL source, File destination) throws IOException {
        Path path = destination.toPath();
        PathUtils.createParentDirectories(path, new FileAttribute[0]);
        Objects.requireNonNull(source);
        PathUtils.copy(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda7
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return source.openStream();
            }
        }, path, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyURLToFile(URL source, File destination, int connectionTimeoutMillis, int readTimeoutMillis) throws IOException {
        CloseableURLConnection urlConnection = CloseableURLConnection.open(source);
        try {
            urlConnection.setConnectTimeout(connectionTimeoutMillis);
            urlConnection.setReadTimeout(readTimeoutMillis);
            InputStream stream = urlConnection.getInputStream();
            try {
                copyInputStreamToFile(stream, destination);
                if (stream != null) {
                    stream.close();
                }
                if (urlConnection != null) {
                    urlConnection.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (urlConnection != null) {
                try {
                    urlConnection.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static File createParentDirectories(File file) throws IOException {
        return mkdirs(getParentFile(file));
    }

    public static File current() {
        return PathUtils.current().toFile();
    }

    static String decodeUrl(String url) {
        if (url == null || url.indexOf(37) < 0) {
            return url;
        }
        int n = url.length();
        StringBuilder builder = new StringBuilder();
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        int i = 0;
        while (i < n) {
            if (url.charAt(i) == '%') {
                do {
                    try {
                        byte octet = (byte) Integer.parseInt(url.substring(i + 1, i + 3), 16);
                        byteBuffer.put(octet);
                        i += 3;
                        if (i >= n) {
                            break;
                        }
                    } catch (RuntimeException e) {
                        if (byteBuffer.position() > 0) {
                            byteBuffer.flip();
                            builder.append(StandardCharsets.UTF_8.decode(byteBuffer).toString());
                            byteBuffer.clear();
                        }
                    } catch (Throwable th) {
                        if (byteBuffer.position() > 0) {
                            byteBuffer.flip();
                            builder.append(StandardCharsets.UTF_8.decode(byteBuffer).toString());
                            byteBuffer.clear();
                        }
                        throw th;
                    }
                } while (url.charAt(i) == '%');
                if (byteBuffer.position() > 0) {
                    byteBuffer.flip();
                    builder.append(StandardCharsets.UTF_8.decode(byteBuffer).toString());
                    byteBuffer.clear();
                }
            }
            builder.append(url.charAt(i));
            i++;
        }
        String decoded = builder.toString();
        return decoded;
    }

    public static File delete(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        Files.delete(file.toPath());
        return file;
    }

    public static void deleteDirectory(File directory) throws IOException {
        Objects.requireNonNull(directory, "directory");
        if (!directory.exists()) {
            return;
        }
        if (!isSymlink(directory)) {
            cleanDirectory(directory);
        }
        delete(directory);
    }

    private static void deleteDirectoryOnExit(File directory) throws IOException {
        if (!directory.exists()) {
            return;
        }
        directory.deleteOnExit();
        if (!isSymlink(directory)) {
            cleanDirectoryOnExit(directory);
        }
    }

    public static boolean deleteQuietly(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (Exception e) {
        }
        try {
            return file.delete();
        } catch (Exception e2) {
            return false;
        }
    }

    public static boolean directoryContains(File directory, File child) throws IOException {
        requireDirectoryExists(directory, "directory");
        if (child == null || !directory.exists() || !child.exists()) {
            return false;
        }
        return FilenameUtils.directoryContains(directory.getCanonicalPath(), child.getCanonicalPath());
    }

    private static void doCopyDirectory(File srcDir, File destDir, FileFilter fileFilter, List<String> exclusionList, boolean preserveDirDate, CopyOption... copyOptions) throws IOException {
        FileFilter fileFilter2;
        List<String> exclusionList2;
        boolean preserveDirDate2;
        CopyOption[] copyOptions2;
        File[] srcFiles = listFiles(srcDir, fileFilter);
        requireDirectoryIfExists(destDir, "destDir");
        mkdirs(destDir);
        requireCanWrite(destDir, "destDir");
        int length = srcFiles.length;
        int i = 0;
        while (i < length) {
            File srcFile = srcFiles[i];
            File dstFile = new File(destDir, srcFile.getName());
            if (exclusionList != null && exclusionList.contains(srcFile.getCanonicalPath())) {
                fileFilter2 = fileFilter;
                exclusionList2 = exclusionList;
                preserveDirDate2 = preserveDirDate;
                copyOptions2 = copyOptions;
            } else if (srcFile.isDirectory()) {
                fileFilter2 = fileFilter;
                exclusionList2 = exclusionList;
                preserveDirDate2 = preserveDirDate;
                copyOptions2 = copyOptions;
                doCopyDirectory(srcFile, dstFile, fileFilter2, exclusionList2, preserveDirDate2, copyOptions2);
            } else {
                fileFilter2 = fileFilter;
                exclusionList2 = exclusionList;
                preserveDirDate2 = preserveDirDate;
                copyOptions2 = copyOptions;
                copyFile(srcFile, dstFile, preserveDirDate2, copyOptions2);
            }
            i++;
            fileFilter = fileFilter2;
            exclusionList = exclusionList2;
            preserveDirDate = preserveDirDate2;
            copyOptions = copyOptions2;
        }
        if (preserveDirDate) {
            setTimes(srcDir, destDir);
        }
    }

    public static void forceDelete(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        try {
            Counters.PathCounters deleteCounters = PathUtils.delete(file.toPath(), PathUtils.EMPTY_LINK_OPTION_ARRAY, StandardDeleteOption.OVERRIDE_READ_ONLY);
            if (deleteCounters.getFileCounter().get() < 1 && deleteCounters.getDirectoryCounter().get() < 1) {
                throw new FileNotFoundException("File does not exist: " + file);
            }
        } catch (IOException e) {
            throw new IOException("Cannot delete file: " + file, e);
        }
    }

    public static void forceDeleteOnExit(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        if (file.isDirectory()) {
            deleteDirectoryOnExit(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void forceMkdir(File directory) throws IOException {
        mkdirs(directory);
    }

    public static void forceMkdirParent(File file) throws IOException {
        forceMkdir(getParentFile((File) Objects.requireNonNull(file, "file")));
    }

    public static File getFile(File directory, String... names) {
        Objects.requireNonNull(directory, "directory");
        Objects.requireNonNull(names, "names");
        File file = directory;
        for (String name : names) {
            file = new File(file, name);
        }
        return file;
    }

    public static File getFile(String... names) {
        File file;
        Objects.requireNonNull(names, "names");
        File file2 = null;
        for (String name : names) {
            if (file2 == null) {
                file = new File(name);
            } else {
                file = new File(file2, name);
            }
            file2 = file;
        }
        return file2;
    }

    private static File getParentFile(File file) {
        if (file == null) {
            return null;
        }
        return file.getParentFile();
    }

    public static File getTempDirectory() {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory() {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath() {
        return System.getProperty("user.home");
    }

    public static boolean isDirectory(File file, LinkOption... options) {
        return file != null && Files.isDirectory(file.toPath(), options);
    }

    public static boolean isEmptyDirectory(File directory) throws IOException {
        return PathUtils.isEmptyDirectory(directory.toPath());
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate) {
        return isFileNewer(file, chronoLocalDate, LocalTime.MAX);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return isFileNewer(file, chronoLocalDate.atTime(localTime));
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        return isFileNewer(file, chronoLocalDate.atTime(offsetTime.toLocalTime()));
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return isFileNewer(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return isFileNewer(file, (ChronoZonedDateTime<?>) chronoLocalDateTime.atZone(zoneId));
    }

    public static boolean isFileNewer(final File file, final ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(file, "file");
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda10
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(PathUtils.isNewer(file.toPath(), (ChronoZonedDateTime<?>) chronoZonedDateTime, new LinkOption[0]));
            }
        })).booleanValue();
    }

    public static boolean isFileNewer(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileNewer(file, date.getTime());
    }

    public static boolean isFileNewer(final File file, final File reference) {
        requireExists(reference, "reference");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda24
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(PathUtils.isNewer(file.toPath(), reference.toPath()));
            }
        })).booleanValue();
    }

    public static boolean isFileNewer(File file, FileTime fileTime) throws IOException {
        Objects.requireNonNull(file, "file");
        return PathUtils.isNewer(file.toPath(), fileTime, new LinkOption[0]);
    }

    public static boolean isFileNewer(final File file, final Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda13
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(PathUtils.isNewer(file.toPath(), instant, new LinkOption[0]));
            }
        })).booleanValue();
    }

    public static boolean isFileNewer(final File file, final long timeMillis) {
        Objects.requireNonNull(file, "file");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda21
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(PathUtils.isNewer(file.toPath(), timeMillis, new LinkOption[0]));
            }
        })).booleanValue();
    }

    public static boolean isFileNewer(File file, OffsetDateTime offsetDateTime) {
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        return isFileNewer(file, offsetDateTime.toInstant());
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate) {
        return isFileOlder(file, chronoLocalDate, LocalTime.MAX);
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return isFileOlder(file, chronoLocalDate.atTime(localTime));
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, OffsetTime offsetTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(offsetTime, "offsetTime");
        return isFileOlder(file, chronoLocalDate.atTime(offsetTime.toLocalTime()));
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return isFileOlder(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return isFileOlder(file, (ChronoZonedDateTime<?>) chronoLocalDateTime.atZone(zoneId));
    }

    public static boolean isFileOlder(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return isFileOlder(file, chronoZonedDateTime.toInstant());
    }

    public static boolean isFileOlder(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileOlder(file, date.getTime());
    }

    public static boolean isFileOlder(final File file, final File reference) {
        requireExists(reference, "reference");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda9
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(PathUtils.isOlder(file.toPath(), reference.toPath()));
            }
        })).booleanValue();
    }

    public static boolean isFileOlder(File file, FileTime fileTime) throws IOException {
        Objects.requireNonNull(file, "file");
        return PathUtils.isOlder(file.toPath(), fileTime, new LinkOption[0]);
    }

    public static boolean isFileOlder(final File file, final Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda6
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(PathUtils.isOlder(file.toPath(), instant, new LinkOption[0]));
            }
        })).booleanValue();
    }

    public static boolean isFileOlder(final File file, final long timeMillis) {
        Objects.requireNonNull(file, "file");
        return ((Boolean) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda14
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Boolean.valueOf(PathUtils.isOlder(file.toPath(), timeMillis, new LinkOption[0]));
            }
        })).booleanValue();
    }

    public static boolean isFileOlder(File file, OffsetDateTime offsetDateTime) {
        Objects.requireNonNull(offsetDateTime, "offsetDateTime");
        return isFileOlder(file, offsetDateTime.toInstant());
    }

    public static boolean isRegularFile(File file, LinkOption... options) {
        return file != null && Files.isRegularFile(file.toPath(), options);
    }

    public static boolean isSymlink(File file) {
        return file != null && Files.isSymbolicLink(file.toPath());
    }

    public static Iterator<File> iterateFiles(File directory, IOFileFilter fileFilter, IOFileFilter dirFilter) {
        return listFiles(directory, fileFilter, dirFilter).iterator();
    }

    public static Iterator<File> iterateFiles(final File directory, final String[] extensions, final boolean recursive) {
        return StreamIterator.iterator((Stream) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda20
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return FileUtils.streamFiles(directory, recursive, extensions);
            }
        }));
    }

    public static Iterator<File> iterateFilesAndDirs(File directory, IOFileFilter fileFilter, IOFileFilter dirFilter) {
        return listFilesAndDirs(directory, fileFilter, dirFilter).iterator();
    }

    public static long lastModified(File file) throws IOException {
        return lastModifiedFileTime(file).toMillis();
    }

    public static FileTime lastModifiedFileTime(File file) throws IOException {
        return Files.getLastModifiedTime((Path) Objects.requireNonNull(file.toPath(), "file"), new LinkOption[0]);
    }

    public static long lastModifiedUnchecked(File file) {
        return ((Long) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda3
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return Long.valueOf(FileUtils.lastModified((File) obj));
            }
        }, file)).longValue();
    }

    public static LineIterator lineIterator(File file) throws IOException {
        return lineIterator(file, null);
    }

    public static LineIterator lineIterator(File file, String charsetName) throws Exception {
        InputStream inputStream = null;
        try {
            inputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            return IOUtils.lineIterator(inputStream, charsetName);
        } catch (IOException | RuntimeException ex) {
            Objects.requireNonNull(ex);
            IOUtils.closeQuietly(inputStream, new Consumer() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda16
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ex.addSuppressed((IOException) obj);
                }
            });
            throw ex;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AccumulatorPathVisitor listAccumulate(File directory, IOFileFilter fileFilter, IOFileFilter dirFilter, FileVisitOption... options) throws IOException {
        boolean isDirFilterSet = dirFilter != null;
        FileEqualsFileFilter rootDirFilter = new FileEqualsFileFilter(directory);
        PathFilter dirPathFilter = isDirFilterSet ? rootDirFilter.or(dirFilter) : rootDirFilter;
        AccumulatorPathVisitor visitor = new AccumulatorPathVisitor(Counters.noopPathCounters(), fileFilter, dirPathFilter, new IOBiFunction() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda2
            @Override // org.apache.commons.io.function.IOBiFunction
            public final Object apply(Object obj, Object obj2) {
                return FileVisitResult.CONTINUE;
            }
        });
        Set<FileVisitOption> optionSet = new HashSet<>();
        Collections.addAll(optionSet, options);
        Files.walkFileTree(directory.toPath(), optionSet, toMaxDepth(isDirFilterSet), visitor);
        return visitor;
    }

    private static File[] listFiles(File directory, FileFilter fileFilter) throws IOException {
        requireDirectoryExists(directory, "directory");
        File[] files = fileFilter == null ? directory.listFiles() : directory.listFiles(fileFilter);
        if (files == null) {
            throw new IOException("Unknown I/O error listing contents of directory: " + directory);
        }
        return files;
    }

    public static Collection<File> listFiles(File directory, final IOFileFilter fileFilter, final IOFileFilter dirFilter) {
        AccumulatorPathVisitor visitor = (AccumulatorPathVisitor) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda18
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return FileUtils.listAccumulate((File) obj, FileFileFilter.INSTANCE.and(fileFilter), dirFilter, FileVisitOption.FOLLOW_LINKS);
            }
        }, directory);
        return toList(visitor.getFileList().stream().map(new FileUtils$$ExternalSyntheticLambda19()));
    }

    public static Collection<File> listFiles(final File directory, final String[] extensions, final boolean recursive) {
        Stream<File> fileStream = (Stream) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return FileUtils.streamFiles(directory, recursive, extensions);
            }
        });
        try {
            List<File> list = toList(fileStream);
            if (fileStream != null) {
                fileStream.close();
            }
            return list;
        } catch (Throwable th) {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Collection<File> listFilesAndDirs(File directory, final IOFileFilter fileFilter, final IOFileFilter dirFilter) {
        AccumulatorPathVisitor visitor = (AccumulatorPathVisitor) Uncheck.apply(new IOFunction() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda23
            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                return FileUtils.listAccumulate((File) obj, fileFilter, dirFilter, FileVisitOption.FOLLOW_LINKS);
            }
        }, directory);
        List<Path> list = visitor.getFileList();
        list.addAll(visitor.getDirList());
        return toList(list.stream().map(new FileUtils$$ExternalSyntheticLambda19()));
    }

    private static File mkdirs(File directory) throws IOException {
        if (directory != null && !directory.mkdirs() && !directory.isDirectory()) {
            throw new IOException("Cannot create directory '" + directory + "'.");
        }
        return directory;
    }

    public static void moveDirectory(File srcDir, File destDir) throws IOException {
        validateMoveParameters(srcDir, destDir);
        requireDirectory(srcDir, "srcDir");
        requireAbsent(destDir, "destDir");
        if (!srcDir.renameTo(destDir)) {
            if (destDir.getCanonicalPath().startsWith(srcDir.getCanonicalPath() + File.separator)) {
                throw new IOException("Cannot move directory: " + srcDir + " to a subdirectory of itself: " + destDir);
            }
            copyDirectory(srcDir, destDir);
            deleteDirectory(srcDir);
            if (srcDir.exists()) {
                throw new IOException("Failed to delete original directory '" + srcDir + "' after copy to '" + destDir + "'");
            }
        }
    }

    public static void moveDirectoryToDirectory(File source, File destDir, boolean createDestDir) throws IOException {
        validateMoveParameters(source, destDir);
        if (!destDir.isDirectory()) {
            if (destDir.exists()) {
                throw new IOException("Destination '" + destDir + "' is not a directory");
            }
            if (!createDestDir) {
                throw new FileNotFoundException("Destination directory '" + destDir + "' does not exist [createDestDir=false]");
            }
            mkdirs(destDir);
        }
        moveDirectory(source, new File(destDir, source.getName()));
    }

    public static void moveFile(File srcFile, File destFile) throws IOException {
        moveFile(srcFile, destFile, StandardCopyOption.COPY_ATTRIBUTES);
    }

    public static void moveFile(File srcFile, File destFile, CopyOption... copyOptions) throws IOException {
        validateMoveParameters(srcFile, destFile);
        requireFile(srcFile, "srcFile");
        requireAbsent(destFile, "destFile");
        boolean rename = srcFile.renameTo(destFile);
        if (!rename) {
            copyFile(srcFile, destFile, false, copyOptions);
            if (!srcFile.delete()) {
                deleteQuietly(destFile);
                throw new IOException("Failed to delete original file '" + srcFile + "' after copy to '" + destFile + "'");
            }
        }
    }

    public static void moveFileToDirectory(File srcFile, File destDir, boolean createDestDir) throws IOException {
        validateMoveParameters(srcFile, destDir);
        if (!destDir.exists() && createDestDir) {
            mkdirs(destDir);
        }
        requireExistsChecked(destDir, "destDir");
        requireDirectory(destDir, "destDir");
        moveFile(srcFile, new File(destDir, srcFile.getName()));
    }

    public static void moveToDirectory(File src, File destDir, boolean createDestDir) throws IOException {
        validateMoveParameters(src, destDir);
        if (src.isDirectory()) {
            moveDirectoryToDirectory(src, destDir, createDestDir);
        } else {
            moveFileToDirectory(src, destDir, createDestDir);
        }
    }

    public static OutputStream newOutputStream(File file, boolean append) throws IOException {
        return PathUtils.newOutputStream(((File) Objects.requireNonNull(file, "file")).toPath(), append);
    }

    public static FileInputStream openInputStream(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        return new FileInputStream(file);
    }

    public static FileOutputStream openOutputStream(File file) throws IOException {
        return openOutputStream(file, false);
    }

    public static FileOutputStream openOutputStream(File file, boolean append) throws IOException {
        Objects.requireNonNull(file, "file");
        if (file.exists()) {
            requireFile(file, "file");
            requireCanWrite(file, "file");
        } else {
            createParentDirectories(file);
        }
        return new FileOutputStream(file, append);
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        Objects.requireNonNull(file, "file");
        return Files.readAllBytes(file.toPath());
    }

    @Deprecated
    public static String readFileToString(File file) throws IOException {
        return readFileToString(file, Charset.defaultCharset());
    }

    public static String readFileToString(final File file, Charset charsetName) throws IOException {
        return IOUtils.toString((IOSupplier<InputStream>) new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda11
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Files.newInputStream(file.toPath(), new OpenOption[0]);
            }
        }, Charsets.toCharset(charsetName));
    }

    public static String readFileToString(File file, String charsetName) throws IOException {
        return readFileToString(file, Charsets.toCharset(charsetName));
    }

    @Deprecated
    public static List<String> readLines(File file) throws IOException {
        return readLines(file, Charset.defaultCharset());
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        return Files.readAllLines(file.toPath(), charset);
    }

    public static List<String> readLines(File file, String charsetName) throws IOException {
        return readLines(file, Charsets.toCharset(charsetName));
    }

    private static void requireAbsent(File file, String name) throws FileExistsException {
        if (file.exists()) {
            throw new FileExistsException(String.format("File element in parameter '%s' already exists: '%s'", name, file));
        }
    }

    private static void requireCanonicalPathsNotEquals(File file1, File file2) throws IOException {
        String canonicalPath = file1.getCanonicalPath();
        if (canonicalPath.equals(file2.getCanonicalPath())) {
            throw new IllegalArgumentException(String.format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", canonicalPath, file1, file2));
        }
    }

    private static void requireCanWrite(File file, String name) {
        Objects.requireNonNull(file, "file");
        if (!file.canWrite()) {
            throw new IllegalArgumentException("File parameter '" + name + " is not writable: '" + file + "'");
        }
    }

    private static File requireDirectory(File directory, String name) {
        Objects.requireNonNull(directory, name);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Parameter '" + name + "' is not a directory: '" + directory + "'");
        }
        return directory;
    }

    private static File requireDirectoryExists(File directory, String name) {
        requireExists(directory, name);
        requireDirectory(directory, name);
        return directory;
    }

    private static File requireDirectoryIfExists(File directory, String name) {
        Objects.requireNonNull(directory, name);
        if (directory.exists()) {
            requireDirectory(directory, name);
        }
        return directory;
    }

    private static File requireExists(File file, String fileParamName) {
        Objects.requireNonNull(file, fileParamName);
        if (!file.exists()) {
            throw new IllegalArgumentException("File system element for parameter '" + fileParamName + "' does not exist: '" + file + "'");
        }
        return file;
    }

    private static File requireExistsChecked(File file, String fileParamName) throws FileNotFoundException {
        Objects.requireNonNull(file, fileParamName);
        if (!file.exists()) {
            throw new FileNotFoundException("File system element for parameter '" + fileParamName + "' does not exist: '" + file + "'");
        }
        return file;
    }

    private static File requireFile(File file, String name) {
        Objects.requireNonNull(file, name);
        if (!file.isFile()) {
            throw new IllegalArgumentException("Parameter '" + name + "' is not a file: " + file);
        }
        return file;
    }

    private static void requireFileCopy(File source, File destination) throws FileNotFoundException {
        requireExistsChecked(source, "source");
        Objects.requireNonNull(destination, "destination");
    }

    private static File requireFileIfExists(File file, String name) {
        Objects.requireNonNull(file, name);
        return file.exists() ? requireFile(file, name) : file;
    }

    private static boolean setTimes(File sourceFile, File targetFile) throws IOException {
        Objects.requireNonNull(sourceFile, "sourceFile");
        Objects.requireNonNull(targetFile, "targetFile");
        try {
            BasicFileAttributes srcAttr = Files.readAttributes(sourceFile.toPath(), (Class<BasicFileAttributes>) BasicFileAttributes.class, new LinkOption[0]);
            BasicFileAttributeView destAttrView = (BasicFileAttributeView) Files.getFileAttributeView(targetFile.toPath(), BasicFileAttributeView.class, new LinkOption[0]);
            destAttrView.setTimes(srcAttr.lastModifiedTime(), srcAttr.lastAccessTime(), srcAttr.creationTime());
            return true;
        } catch (IOException e) {
            return targetFile.setLastModified(sourceFile.lastModified());
        }
    }

    public static long sizeOf(final File file) {
        requireExists(file, "file");
        return ((Long) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda17
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Long.valueOf(PathUtils.sizeOf(file.toPath()));
            }
        })).longValue();
    }

    public static BigInteger sizeOfAsBigInteger(final File file) {
        requireExists(file, "file");
        return (BigInteger) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda12
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return PathUtils.sizeOfAsBigInteger(file.toPath());
            }
        });
    }

    public static long sizeOfDirectory(final File directory) {
        requireDirectoryExists(directory, "directory");
        return ((Long) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda1
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return Long.valueOf(PathUtils.sizeOfDirectory(directory.toPath()));
            }
        })).longValue();
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(final File directory) {
        requireDirectoryExists(directory, "directory");
        return (BigInteger) Uncheck.get(new IOSupplier() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda22
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                return PathUtils.sizeOfDirectoryAsBigInteger(directory.toPath());
            }
        });
    }

    public static Stream<File> streamFiles(File directory, boolean recursive, String... extensions) throws IOException {
        IOFileFilter filter;
        if (extensions == null) {
            filter = FileFileFilter.INSTANCE;
        } else {
            filter = FileFileFilter.INSTANCE.and(new SuffixFileFilter(toSuffixes(extensions)));
        }
        return PathUtils.walk(directory.toPath(), filter, toMaxDepth(recursive), false, FileVisitOption.FOLLOW_LINKS).map(new FileUtils$$ExternalSyntheticLambda19());
    }

    public static File toFile(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        String fileName = url.getFile().replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar);
        return new File(decodeUrl(fileName));
    }

    public static File[] toFiles(URL... urls) {
        if (IOUtils.length(urls) == 0) {
            return EMPTY_FILE_ARRAY;
        }
        File[] files = new File[urls.length];
        for (int i = 0; i < urls.length; i++) {
            URL url = urls[i];
            if (url != null) {
                if (!"file".equalsIgnoreCase(url.getProtocol())) {
                    throw new IllegalArgumentException("Can only convert file URL to a File: " + url);
                }
                files[i] = toFile(url);
            }
        }
        return files;
    }

    private static List<File> toList(Stream<File> stream) {
        return (List) stream.collect(Collectors.toList());
    }

    private static int toMaxDepth(boolean recursive) {
        return recursive ? Integer.MAX_VALUE : 1;
    }

    static /* synthetic */ String lambda$toSuffixes$17(String e) {
        return "." + e;
    }

    static /* synthetic */ String[] lambda$toSuffixes$18(int x$0) {
        return new String[x$0];
    }

    private static String[] toSuffixes(String... extensions) {
        return (String[]) Stream.of((Object[]) Objects.requireNonNull(extensions, "extensions")).map(new Function() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FileUtils.lambda$toSuffixes$17((String) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.commons.io.FileUtils$$ExternalSyntheticLambda5
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return FileUtils.lambda$toSuffixes$18(i);
            }
        });
    }

    public static void touch(File file) throws IOException {
        PathUtils.touch(((File) Objects.requireNonNull(file, "file")).toPath());
    }

    public static URL[] toURLs(File... files) throws IOException {
        Objects.requireNonNull(files, "files");
        URL[] urls = new URL[files.length];
        for (int i = 0; i < urls.length; i++) {
            urls[i] = files[i].toURI().toURL();
        }
        return urls;
    }

    private static void validateMoveParameters(File source, File destination) throws FileNotFoundException {
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(destination, "destination");
        if (!source.exists()) {
            throw new FileNotFoundException("Source '" + source + "' does not exist");
        }
    }

    public static boolean waitFor(File file, int seconds) {
        Objects.requireNonNull(file, "file");
        return PathUtils.waitFor(file.toPath(), Duration.ofSeconds(seconds), PathUtils.EMPTY_LINK_OPTION_ARRAY);
    }

    @Deprecated
    public static void write(File file, CharSequence data) throws IOException {
        write(file, data, Charset.defaultCharset(), false);
    }

    @Deprecated
    public static void write(File file, CharSequence data, boolean append) throws IOException {
        write(file, data, Charset.defaultCharset(), append);
    }

    public static void write(File file, CharSequence data, Charset charset) throws IOException {
        write(file, data, charset, false);
    }

    public static void write(File file, CharSequence data, Charset charset, boolean append) throws IOException {
        writeStringToFile(file, Objects.toString(data, null), charset, append);
    }

    public static void write(File file, CharSequence data, String charsetName) throws IOException {
        write(file, data, charsetName, false);
    }

    public static void write(File file, CharSequence data, String charsetName, boolean append) throws IOException {
        write(file, data, Charsets.toCharset(charsetName), append);
    }

    public static void writeByteArrayToFile(File file, byte[] data) throws IOException {
        writeByteArrayToFile(file, data, false);
    }

    public static void writeByteArrayToFile(File file, byte[] data, boolean append) throws IOException {
        writeByteArrayToFile(file, data, 0, data.length, append);
    }

    public static void writeByteArrayToFile(File file, byte[] data, int off, int len) throws IOException {
        writeByteArrayToFile(file, data, off, len, false);
    }

    public static void writeByteArrayToFile(File file, byte[] data, int off, int len, boolean append) throws IOException {
        OutputStream out = newOutputStream(file, append);
        try {
            out.write(data, off, len);
            if (out != null) {
                out.close();
            }
        } catch (Throwable th) {
            if (out != null) {
                try {
                    out.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void writeLines(File file, Collection<?> lines) throws IOException {
        writeLines(file, null, lines, null, false);
    }

    public static void writeLines(File file, Collection<?> lines, boolean append) throws IOException {
        writeLines(file, null, lines, null, append);
    }

    public static void writeLines(File file, Collection<?> lines, String lineEnding) throws IOException {
        writeLines(file, null, lines, lineEnding, false);
    }

    public static void writeLines(File file, Collection<?> lines, String lineEnding, boolean append) throws IOException {
        writeLines(file, null, lines, lineEnding, append);
    }

    public static void writeLines(File file, String charsetName, Collection<?> lines) throws IOException {
        writeLines(file, charsetName, lines, null, false);
    }

    public static void writeLines(File file, String charsetName, Collection<?> lines, boolean append) throws IOException {
        writeLines(file, charsetName, lines, null, append);
    }

    public static void writeLines(File file, String charsetName, Collection<?> lines, String lineEnding) throws IOException {
        writeLines(file, charsetName, lines, lineEnding, false);
    }

    public static void writeLines(File file, String charsetName, Collection<?> lines, String lineEnding, boolean append) throws IOException {
        OutputStream out = new BufferedOutputStream(newOutputStream(file, append));
        try {
            IOUtils.writeLines(lines, lineEnding, out, charsetName);
            out.close();
        } catch (Throwable th) {
            try {
                out.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public static void writeStringToFile(File file, String data) throws IOException {
        writeStringToFile(file, data, Charset.defaultCharset(), false);
    }

    @Deprecated
    public static void writeStringToFile(File file, String data, boolean append) throws IOException {
        writeStringToFile(file, data, Charset.defaultCharset(), append);
    }

    public static void writeStringToFile(File file, String data, Charset charset) throws IOException {
        writeStringToFile(file, data, charset, false);
    }

    public static void writeStringToFile(File file, String data, Charset charset, boolean append) throws IOException {
        OutputStream out = newOutputStream(file, append);
        try {
            IOUtils.write(data, out, charset);
            if (out != null) {
                out.close();
            }
        } catch (Throwable th) {
            if (out != null) {
                try {
                    out.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void writeStringToFile(File file, String data, String charsetName) throws IOException {
        writeStringToFile(file, data, charsetName, false);
    }

    public static void writeStringToFile(File file, String data, String charsetName, boolean append) throws IOException {
        writeStringToFile(file, data, Charsets.toCharset(charsetName), append);
    }

    @Deprecated
    public FileUtils() {
    }
}
