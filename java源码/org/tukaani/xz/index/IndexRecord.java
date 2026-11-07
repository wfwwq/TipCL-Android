package org.tukaani.xz.index;

/* loaded from: classes24.dex */
class IndexRecord {
    final long uncompressed;
    final long unpadded;

    IndexRecord(long j, long j2) {
        this.unpadded = j;
        this.uncompressed = j2;
    }
}
