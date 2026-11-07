package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes24.dex */
public class CPDouble extends CPConstant<CPDouble> {
    private final double theDouble;

    public CPDouble(double theDouble) {
        this.theDouble = theDouble;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPDouble obj) {
        return Double.compare(this.theDouble, obj.theDouble);
    }

    public double getDouble() {
        return this.theDouble;
    }
}
