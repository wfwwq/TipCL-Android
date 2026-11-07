package org.tukaani.xz;

/* loaded from: classes24.dex */
abstract class LZMA2Coder implements FilterCoder {
    public static final long FILTER_ID = 33;

    LZMA2Coder() {
    }

    @Override // org.tukaani.xz.FilterCoder
    public boolean changesSize() {
        return true;
    }

    @Override // org.tukaani.xz.FilterCoder
    public boolean lastOK() {
        return true;
    }

    @Override // org.tukaani.xz.FilterCoder
    public boolean nonLastOK() {
        return false;
    }
}
