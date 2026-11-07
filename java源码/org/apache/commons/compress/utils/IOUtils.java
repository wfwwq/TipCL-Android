package org.apache.commons.compress.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import org.apache.commons.io.FileUtils;

/* loaded from: classes24.dex */
public final class IOUtils {
    private static final int COPY_BUF_SIZE = 8024;
    public static final LinkOption[] EMPTY_LINK_OPTIONS = new LinkOption[0];

    @Deprecated
    public static void closeQuietly(Closeable c) {
        org.apache.commons.io.IOUtils.closeQuietly(c);
    }

    @Deprecated
    public static void copy(File sourceFile, OutputStream outputStream) throws IOException {
        FileUtils.copyFile(sourceFile, outputStream);
    }

    @Deprecated
    public static long copy(InputStream input, OutputStream output) throws IOException {
        return org.apache.commons.io.IOUtils.copy(input, output);
    }

    @Deprecated
    public static long copy(InputStream input, OutputStream output, int bufferSize) throws IOException {
        return org.apache.commons.io.IOUtils.copy(input, output, bufferSize);
    }

    @Deprecated
    public static long copyRange(InputStream input, long len, OutputStream output) throws IOException {
        return org.apache.commons.io.IOUtils.copyLarge(input, output, 0L, len);
    }

    @Deprecated
    public static long copyRange(InputStream input, long length, OutputStream output, int bufferSize) throws IOException {
        int n;
        if (bufferSize < 1) {
            throw new IllegalArgumentException("bufferSize must be bigger than 0");
        }
        byte[] buffer = new byte[(int) Math.min(bufferSize, Math.max(0L, length))];
        long count = 0;
        while (count < length && -1 != (n = input.read(buffer, 0, (int) Math.min(length - count, buffer.length)))) {
            if (output != null) {
                output.write(buffer, 0, n);
            }
            count += n;
        }
        return count;
    }

    @Deprecated
    public static int read(File file, byte[] array) throws IOException {
        InputStream inputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            int fully = readFully(inputStream, array, 0, array.length);
            if (inputStream != null) {
                inputStream.close();
            }
            return fully;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static int readFully(InputStream input, byte[] array) throws IOException {
        return readFully(input, array, 0, array.length);
    }

    public static int readFully(InputStream input, byte[] array, int offset, int length) throws IOException {
        if (length < 0 || offset < 0 || length + offset > array.length || length + offset < 0) {
            throw new IndexOutOfBoundsException();
        }
        return org.apache.commons.io.IOUtils.read(input, array, offset, length);
    }

    public static void readFully(ReadableByteChannel channel, ByteBuffer byteBuffer) throws IOException {
        int expectedLength = byteBuffer.remaining();
        int read = org.apache.commons.io.IOUtils.read(channel, byteBuffer);
        if (read < expectedLength) {
            throw new EOFException();
        }
    }

    public static byte[] readRange(InputStream input, int length) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        org.apache.commons.io.IOUtils.copyLarge(input, output, 0L, length);
        return output.toByteArray();
    }

    public static byte[] readRange(ReadableByteChannel input, int length) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ByteBuffer b = ByteBuffer.allocate(Math.min(length, COPY_BUF_SIZE));
        int read = 0;
        while (read < length) {
            b.limit(Math.min(length - read, b.capacity()));
            int readNow = input.read(b);
            if (readNow <= 0) {
                break;
            }
            output.write(b.array(), 0, readNow);
            b.rewind();
            read += readNow;
        }
        return output.toByteArray();
    }

    @Deprecated
    public static long skip(InputStream input, long numToSkip) throws IOException {
        return org.apache.commons.io.IOUtils.skip(input, numToSkip);
    }

    @Deprecated
    public static byte[] toByteArray(InputStream input) throws IOException {
        return org.apache.commons.io.IOUtils.toByteArray(input);
    }

    private IOUtils() {
    }
}
