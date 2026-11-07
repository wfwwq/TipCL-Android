package org.apache.commons.lang3.function;

import java.util.function.Function;

/* loaded from: classes24.dex */
public final class Functions {
    public static <T, R> Function<T, R> function(Function<T, R> function) {
        return function;
    }

    private Functions() {
    }
}
