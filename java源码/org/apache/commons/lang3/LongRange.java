package org.apache.commons.lang3;

/* loaded from: classes24.dex */
public final class LongRange extends NumberRange<Long> {
    private static final long serialVersionUID = 1;

    public static LongRange of(long fromInclusive, long toInclusive) {
        return of(Long.valueOf(fromInclusive), Long.valueOf(toInclusive));
    }

    public static LongRange of(Long fromInclusive, Long toInclusive) {
        return new LongRange(fromInclusive, toInclusive);
    }

    private LongRange(Long number1, Long number2) {
        super(number1, number2, null);
    }
}
