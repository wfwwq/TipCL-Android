package org.apache.commons.lang3;

/* loaded from: classes24.dex */
public final class IntegerRange extends NumberRange<Integer> {
    private static final long serialVersionUID = 1;

    public static IntegerRange of(int fromInclusive, int toInclusive) {
        return of(Integer.valueOf(fromInclusive), Integer.valueOf(toInclusive));
    }

    public static IntegerRange of(Integer fromInclusive, Integer toInclusive) {
        return new IntegerRange(fromInclusive, toInclusive);
    }

    private IntegerRange(Integer number1, Integer number2) {
        super(number1, number2, null);
    }
}
