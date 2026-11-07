package org.apache.commons.compress.harmony.unpack200.bytecode;

/* loaded from: classes24.dex */
public abstract class CPConstantNumber extends CPConstant {
    public CPConstantNumber(byte tag, Object value, int globalIndex) {
        super(tag, value, globalIndex);
    }

    protected Number getNumber() {
        return (Number) getValue();
    }
}
