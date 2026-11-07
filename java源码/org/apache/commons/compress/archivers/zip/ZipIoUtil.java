package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;

/* loaded from: classes24.dex */
class ZipIoUtil {
    static void writeFully(SeekableByteChannel channel, ByteBuffer buf) throws IOException {
        while (buf.hasRemaining()) {
            int remaining = buf.remaining();
            int written = channel.write(buf);
            if (written <= 0) {
                throw new IOException("Failed to fully write: channel=" + channel + " length=" + remaining + " written=" + written);
            }
        }
    }

    static void writeFullyAt(FileChannel channel, ByteBuffer buf, long position) throws IOException {
        long currentPosition = position;
        while (buf.hasRemaining()) {
            int remaining = buf.remaining();
            int written = channel.write(buf, currentPosition);
            if (written <= 0) {
                throw new IOException("Failed to fully write: channel=" + channel + " length=" + remaining + " written=" + written);
            }
            currentPosition += written;
        }
    }

    private ZipIoUtil() {
    }
}
