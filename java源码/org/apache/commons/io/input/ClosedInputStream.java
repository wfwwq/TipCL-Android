package org.apache.commons.io.input;

import java.io.InputStream;

/* loaded from: classes24.dex */
public class ClosedInputStream extends InputStream {
    public static final ClosedInputStream INSTANCE = new ClosedInputStream();

    @Deprecated
    public static final ClosedInputStream CLOSED_INPUT_STREAM = INSTANCE;

    @Override // java.io.InputStream
    public int read() {
        return -1;
    }
}
