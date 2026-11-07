package org.apache.commons.io.input;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes24.dex */
public class CountingInputStream extends ProxyInputStream {
    private long count;

    public CountingInputStream(InputStream in) {
        super(in);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    protected synchronized void afterRead(int n) {
        if (n != -1) {
            this.count += n;
        }
    }

    public synchronized long getByteCount() {
        return this.count;
    }

    public int getCount() {
        long result = getByteCount();
        if (result > SieveCacheKt.NodeLinkMask) {
            throw new ArithmeticException("The byte count " + result + " is too large to be converted to an int");
        }
        return (int) result;
    }

    public synchronized long resetByteCount() {
        long tmp;
        tmp = this.count;
        this.count = 0L;
        return tmp;
    }

    public int resetCount() {
        long result = resetByteCount();
        if (result > SieveCacheKt.NodeLinkMask) {
            throw new ArithmeticException("The byte count " + result + " is too large to be converted to an int");
        }
        return (int) result;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long length) throws IOException {
        long skip;
        skip = super.skip(length);
        this.count += skip;
        return skip;
    }
}
