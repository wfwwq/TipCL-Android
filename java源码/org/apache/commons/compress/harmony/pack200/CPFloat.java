package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes24.dex */
public class CPFloat extends CPConstant<CPFloat> {
    private final float theFloat;

    public CPFloat(float theFloat) {
        this.theFloat = theFloat;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPFloat obj) {
        return Float.compare(this.theFloat, obj.theFloat);
    }

    public float getFloat() {
        return this.theFloat;
    }
}
