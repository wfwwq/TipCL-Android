package org.apache.commons.compress.compressors.pack200;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.jar.JarInputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.java.util.jar.Pack200;

/* loaded from: classes24.dex */
public class Pack200CompressorOutputStream extends CompressorOutputStream {
    private final AbstractStreamBridge abstractStreamBridge;
    private boolean finished;
    private final OutputStream originalOutput;
    private final Map<String, String> properties;

    public Pack200CompressorOutputStream(OutputStream out) throws IOException {
        this(out, Pack200Strategy.IN_MEMORY);
    }

    public Pack200CompressorOutputStream(OutputStream out, Map<String, String> props) throws IOException {
        this(out, Pack200Strategy.IN_MEMORY, props);
    }

    public Pack200CompressorOutputStream(OutputStream out, Pack200Strategy mode) throws IOException {
        this(out, mode, null);
    }

    public Pack200CompressorOutputStream(OutputStream out, Pack200Strategy mode, Map<String, String> props) throws IOException {
        this.originalOutput = out;
        this.abstractStreamBridge = mode.newStreamBridge();
        this.properties = props;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            finish();
            try {
                this.abstractStreamBridge.stop();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.abstractStreamBridge.stop();
                throw th;
            } finally {
            }
        }
    }

    public void finish() throws IOException {
        if (!this.finished) {
            this.finished = true;
            Pack200.Packer p = Pack200.newPacker();
            if (this.properties != null) {
                p.properties().putAll(this.properties);
            }
            JarInputStream ji = new JarInputStream(this.abstractStreamBridge.getInputStream());
            try {
                p.pack(ji, this.originalOutput);
                ji.close();
            } catch (Throwable th) {
                try {
                    ji.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b) throws IOException {
        this.abstractStreamBridge.write(b);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int from, int length) throws IOException {
        this.abstractStreamBridge.write(b, from, length);
    }

    @Override // java.io.OutputStream
    public void write(int b) throws IOException {
        this.abstractStreamBridge.write(b);
    }
}
