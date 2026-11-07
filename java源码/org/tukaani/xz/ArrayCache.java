package org.tukaani.xz;

/* loaded from: classes24.dex */
public class ArrayCache {
    private static final ArrayCache dummyCache = new ArrayCache();
    private static volatile ArrayCache defaultCache = dummyCache;

    public static ArrayCache getDefaultCache() {
        return defaultCache;
    }

    public static ArrayCache getDummyCache() {
        return dummyCache;
    }

    public static void setDefaultCache(ArrayCache arrayCache) {
        if (arrayCache == null) {
            throw new NullPointerException();
        }
        defaultCache = arrayCache;
    }

    public byte[] getByteArray(int i, boolean z) {
        return new byte[i];
    }

    public int[] getIntArray(int i, boolean z) {
        return new int[i];
    }

    public void putArray(byte[] bArr) {
    }

    public void putArray(int[] iArr) {
    }
}
