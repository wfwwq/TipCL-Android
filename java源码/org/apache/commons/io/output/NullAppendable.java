package org.apache.commons.io.output;

import java.io.IOException;

/* loaded from: classes24.dex */
public class NullAppendable implements Appendable {
    public static final NullAppendable INSTANCE = new NullAppendable();

    private NullAppendable() {
    }

    @Override // java.lang.Appendable
    public Appendable append(char c) throws IOException {
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence csq) throws IOException {
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        return this;
    }
}
