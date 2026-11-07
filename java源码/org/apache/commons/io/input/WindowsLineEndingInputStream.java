package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes24.dex */
public class WindowsLineEndingInputStream extends InputStream {
    private boolean atEos;
    private boolean atSlashCr;
    private boolean atSlashLf;
    private final InputStream in;
    private boolean injectSlashLf;
    private final boolean lineFeedAtEndOfFile;

    public WindowsLineEndingInputStream(InputStream in, boolean ensureLineFeedAtEndOfFile) {
        this.in = in;
        this.lineFeedAtEndOfFile = ensureLineFeedAtEndOfFile;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.in.close();
    }

    private int handleEos() {
        if (!this.lineFeedAtEndOfFile) {
            return -1;
        }
        if (!this.atSlashLf && !this.atSlashCr) {
            this.atSlashCr = true;
            return 13;
        }
        if (this.atSlashLf) {
            return -1;
        }
        this.atSlashCr = false;
        this.atSlashLf = true;
        return 10;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int readLimit) {
        throw UnsupportedOperationExceptions.mark();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.atEos) {
            return handleEos();
        }
        if (this.injectSlashLf) {
            this.injectSlashLf = false;
            return 10;
        }
        boolean prevWasSlashR = this.atSlashCr;
        int target = readWithUpdate();
        if (this.atEos) {
            return handleEos();
        }
        if (target == 10 && !prevWasSlashR) {
            this.injectSlashLf = true;
            return 13;
        }
        return target;
    }

    private int readWithUpdate() throws IOException {
        int target = this.in.read();
        this.atEos = target == -1;
        if (this.atEos) {
            return target;
        }
        this.atSlashCr = target == 13;
        this.atSlashLf = target == 10;
        return target;
    }
}
