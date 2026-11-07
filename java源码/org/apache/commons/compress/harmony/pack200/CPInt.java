package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes24.dex */
public class CPInt extends CPConstant<CPInt> {
    private final int theInt;

    public CPInt(int theInt) {
        this.theInt = theInt;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPInt obj) {
        return Integer.compare(this.theInt, obj.theInt);
    }

    public int getInt() {
        return this.theInt;
    }
}
