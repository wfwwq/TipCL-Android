package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemProperties;
import org.lwjgl.LWJGLUtil;

@Deprecated
/* loaded from: classes24.dex */
public class FileSystemUtils {
    private static final String DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();
    private static final int OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    static {
        String osName;
        int os = 0;
        String dfPath = "df";
        try {
            osName = System.getProperty(SystemProperties.OS_NAME);
        } catch (Exception e) {
            os = -1;
        }
        if (osName == null) {
            throw new IOException("os.name not found");
        }
        String osName2 = osName.toLowerCase(Locale.ENGLISH);
        if (osName2.contains(LWJGLUtil.PLATFORM_WINDOWS_NAME)) {
            os = 1;
        } else if (osName2.contains(LWJGLUtil.PLATFORM_LINUX_NAME) || osName2.contains("mpe/ix") || osName2.contains("freebsd") || osName2.contains("openbsd") || osName2.contains("irix") || osName2.contains("digital unix") || osName2.contains("unix") || osName2.contains("mac os x")) {
            os = 2;
        } else if (osName2.contains("sun os") || osName2.contains("sunos") || osName2.contains("solaris")) {
            os = 3;
            dfPath = "/usr/xpg4/bin/df";
        } else if (osName2.contains("hp-ux") || osName2.contains("aix")) {
            os = 3;
        }
        OS = os;
        DF = dfPath;
    }

    @Deprecated
    public static long freeSpace(String path) throws IOException {
        return INSTANCE.freeSpaceOS(path, OS, false, Duration.ofMillis(-1L));
    }

    @Deprecated
    public static long freeSpaceKb() throws IOException {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(long timeout) throws IOException {
        return freeSpaceKb(FileUtils.current().getAbsolutePath(), timeout);
    }

    @Deprecated
    public static long freeSpaceKb(String path) throws IOException {
        return freeSpaceKb(path, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String path, long timeout) throws IOException {
        return INSTANCE.freeSpaceOS(path, OS, true, Duration.ofMillis(timeout));
    }

    long freeSpaceOS(String path, int os, boolean kb, Duration timeout) throws IOException {
        Objects.requireNonNull(path, "path");
        switch (os) {
            case 0:
                throw new IllegalStateException("Unsupported operating system");
            case 1:
                long jFreeSpaceWindows = freeSpaceWindows(path, timeout);
                return kb ? jFreeSpaceWindows / 1024 : jFreeSpaceWindows;
            case 2:
                return freeSpaceUnix(path, kb, false, timeout);
            case 3:
                return freeSpaceUnix(path, kb, true, timeout);
            default:
                throw new IllegalStateException("Exception caught when determining operating system");
        }
    }

    long freeSpaceUnix(String path, boolean kb, boolean posix, Duration timeout) throws IOException {
        if (path.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String flags = kb ? "-k" : "-";
        if (posix) {
            flags = flags + "P";
        }
        String[] cmdAttribs = flags.length() > 1 ? new String[]{DF, flags, path} : new String[]{DF, path};
        List<String> lines = performCommand(cmdAttribs, 3, timeout);
        if (lines.size() < 2) {
            throw new IOException("Command line '" + DF + "' did not return info as expected for path '" + path + "'- response was " + lines);
        }
        String line2 = lines.get(1);
        StringTokenizer tok = new StringTokenizer(line2, StringUtils.SPACE);
        if (tok.countTokens() < 4) {
            if (tok.countTokens() != 1 || lines.size() < 3) {
                throw new IOException("Command line '" + DF + "' did not return data as expected for path '" + path + "'- check path is valid");
            }
            String line3 = lines.get(2);
            tok = new StringTokenizer(line3, StringUtils.SPACE);
        } else {
            tok.nextToken();
        }
        tok.nextToken();
        tok.nextToken();
        String freeSpace = tok.nextToken();
        return parseBytes(freeSpace, path);
    }

    long freeSpaceWindows(String path, Duration timeout) throws IOException {
        String normPath = FilenameUtils.normalize(path, false);
        if (normPath == null) {
            throw new IllegalArgumentException(path);
        }
        if (!normPath.isEmpty() && normPath.charAt(0) != '\"') {
            normPath = "\"" + normPath + "\"";
        }
        String[] cmdAttribs = {"cmd.exe", "/C", "dir /a /-c " + normPath};
        List<String> lines = performCommand(cmdAttribs, Integer.MAX_VALUE, timeout);
        for (int i = lines.size() - 1; i >= 0; i--) {
            String line = lines.get(i);
            if (!line.isEmpty()) {
                return parseDir(line, normPath);
            }
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + normPath + "'");
    }

    Process openProcess(String[] cmdAttribs) throws IOException {
        return Runtime.getRuntime().exec(cmdAttribs);
    }

    long parseBytes(String freeSpace, String path) throws NumberFormatException, IOException {
        try {
            long bytes = Long.parseLong(freeSpace);
            if (bytes < 0) {
                throw new IOException("Command line '" + DF + "' did not find free space in response for path '" + path + "'- check path is valid");
            }
            return bytes;
        } catch (NumberFormatException ex) {
            throw new IOException("Command line '" + DF + "' did not return numeric data as expected for path '" + path + "'- check path is valid", ex);
        }
    }

    long parseDir(String line, String path) throws IOException {
        int bytesStart = 0;
        int bytesEnd = 0;
        int j = line.length() - 1;
        while (true) {
            if (j < 0) {
                break;
            }
            if (Character.isDigit(line.charAt(j))) {
                bytesEnd = j + 1;
                break;
            }
            j--;
        }
        while (true) {
            if (j < 0) {
                break;
            }
            char c = line.charAt(j);
            if (!Character.isDigit(c) && c != ',' && c != '.') {
                bytesStart = j + 1;
                break;
            }
            j--;
        }
        if (j < 0) {
            throw new IOException("Command line 'dir /-c' did not return valid info for path '" + path + "'");
        }
        StringBuilder buf = new StringBuilder(line.substring(bytesStart, bytesEnd));
        int k = 0;
        while (k < buf.length()) {
            if (buf.charAt(k) == ',' || buf.charAt(k) == '.') {
                buf.deleteCharAt(k);
                k--;
            }
            k++;
        }
        return parseBytes(buf.toString(), path);
    }

    List<String> performCommand(String[] cmdAttribs, int max, Duration timeout) throws IOException {
        Process proc = openProcess(cmdAttribs);
        Thread monitor = ThreadMonitor.start(timeout);
        try {
            try {
                InputStream in = proc.getInputStream();
                try {
                    OutputStream out = proc.getOutputStream();
                    try {
                        InputStream err = proc.getErrorStream();
                        try {
                            BufferedReader inr = new BufferedReader(new InputStreamReader(in, Charset.defaultCharset()));
                            try {
                                List<String> lines = (List) inr.lines().limit(max).map(new Function() { // from class: org.apache.commons.io.FileSystemUtils$$ExternalSyntheticLambda0
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((String) obj).toLowerCase(Locale.getDefault()).trim();
                                    }
                                }).collect(Collectors.toList());
                                proc.waitFor();
                                ThreadMonitor.stop(monitor);
                                if (proc.exitValue() != 0) {
                                    throw new IOException("Command line returned OS error code '" + proc.exitValue() + "' for command " + Arrays.asList(cmdAttribs));
                                }
                                if (lines.isEmpty()) {
                                    throw new IOException("Command line did not return any info for command " + Arrays.asList(cmdAttribs));
                                }
                                inr.close();
                                if (err != null) {
                                    err.close();
                                }
                                if (out != null) {
                                    out.close();
                                }
                                if (in != null) {
                                    in.close();
                                }
                                return lines;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (InterruptedException ex) {
                throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(cmdAttribs) + " timeout=" + timeout, ex);
            }
        } finally {
            if (proc != null) {
                proc.destroy();
            }
        }
    }
}
