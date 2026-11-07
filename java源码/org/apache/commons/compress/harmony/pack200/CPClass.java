package org.apache.commons.compress.harmony.pack200;

/* loaded from: classes24.dex */
public class CPClass extends CPConstant<CPClass> {
    private final String className;
    private final boolean isInnerClass;
    private final CPUTF8 utf8;

    public CPClass(CPUTF8 utf8) {
        this.utf8 = utf8;
        this.className = utf8.getUnderlyingString();
        char[] chars = this.className.toCharArray();
        for (char element : chars) {
            if (element <= '-') {
                this.isInnerClass = true;
                return;
            }
        }
        this.isInnerClass = false;
    }

    @Override // java.lang.Comparable
    public int compareTo(CPClass arg0) {
        return this.className.compareTo(arg0.className);
    }

    public int getIndexInCpUtf8() {
        return this.utf8.getIndex();
    }

    public boolean isInnerClass() {
        return this.isInnerClass;
    }

    public String toString() {
        return this.className;
    }
}
