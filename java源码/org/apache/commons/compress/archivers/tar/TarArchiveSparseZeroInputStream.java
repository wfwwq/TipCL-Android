package org.apache.commons.compress.archivers.tar;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes24.dex */
final class TarArchiveSparseZeroInputStream extends InputStream {
    TarArchiveSparseZeroInputStream() {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long n) {
        return n;
    }
}
