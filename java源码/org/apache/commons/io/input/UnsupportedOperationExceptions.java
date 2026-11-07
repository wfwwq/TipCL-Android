package org.apache.commons.io.input;

/* loaded from: classes24.dex */
final class UnsupportedOperationExceptions {
    private static final String MARK_RESET = "mark/reset";

    UnsupportedOperationExceptions() {
    }

    static UnsupportedOperationException mark() {
        return method(MARK_RESET);
    }

    static UnsupportedOperationException method(String method) {
        return new UnsupportedOperationException(method + " not supported");
    }

    static UnsupportedOperationException reset() {
        return method(MARK_RESET);
    }
}
