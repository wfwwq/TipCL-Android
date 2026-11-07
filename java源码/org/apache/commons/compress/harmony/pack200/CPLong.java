package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes24.dex */
public class CPLong extends CPConstant<CPLong> {
    private final long theLong;

    public CPLong(long theLong) {
        this.theLong = theLong;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPLong obj) {
        return Long.compare(this.theLong, obj.theLong);
    }

    public long getLong() {
        return this.theLong;
    }

    public String toString() {
        return "" + this.theLong;
    }
}
