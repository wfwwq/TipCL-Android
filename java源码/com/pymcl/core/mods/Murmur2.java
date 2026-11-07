package com.pymcl.core.mods;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;

/* compiled from: ModTools.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\r\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\u0012"}, d2 = {"Lcom/pymcl/core/mods/Murmur2;", "", "<init>", "()V", "ws", "", "b", "", "normalizedLength", "", AbstractCircuitBreaker.PROPERTY_NAME, "Lkotlin/Function0;", "Ljava/io/InputStream;", "hash", "bytes", "", "f", "Ljava/io/File;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Murmur2 {
    public static final Murmur2 INSTANCE = new Murmur2();

    private Murmur2() {
    }

    private final boolean ws(int b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    public final long normalizedLength(Function0<? extends InputStream> open) {
        Intrinsics.checkNotNullParameter(open, "open");
        long n = 0;
        InputStream inputStreamInvoke = open.invoke();
        try {
            InputStream ins = inputStreamInvoke;
            byte[] buf = new byte[65536];
            while (true) {
                int r = ins.read(buf);
                if (r < 0) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStreamInvoke, null);
                    return n;
                }
                for (int i = 0; i < r; i++) {
                    if (!INSTANCE.ws(buf[i] & UByte.MAX_VALUE)) {
                        n++;
                    }
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream hash$lambda$0(byte[] $bytes) {
        return new ByteArrayInputStream($bytes);
    }

    public final long hash(final byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return hash(new Function0() { // from class: com.pymcl.core.mods.Murmur2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Murmur2.hash$lambda$0(bytes);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream hash$lambda$1(File $f) {
        return new BufferedInputStream(new FileInputStream($f));
    }

    public final long hash(final File f) {
        Intrinsics.checkNotNullParameter(f, "f");
        return hash(new Function0() { // from class: com.pymcl.core.mods.Murmur2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Murmur2.hash$lambda$1(f);
            }
        });
    }

    public final long hash(Function0<? extends InputStream> open) {
        Intrinsics.checkNotNullParameter(open, "open");
        long len = normalizedLength(open);
        int h = ((int) len) ^ 1;
        int k = 0;
        int shift = 0;
        InputStream inputStreamInvoke = open.invoke();
        try {
            InputStream ins = inputStreamInvoke;
            byte[] buf = new byte[65536];
            while (true) {
                int r = ins.read(buf);
                if (r < 0) {
                    break;
                }
                for (int i = 0; i < r; i++) {
                    int b = buf[i] & UByte.MAX_VALUE;
                    if (!INSTANCE.ws(b)) {
                        k |= b << shift;
                        shift += 8;
                        if (shift == 32) {
                            int k2 = k * 1540483477;
                            h = (h * 1540483477) ^ ((k2 ^ (k2 >>> 24)) * 1540483477);
                            k = 0;
                            shift = 0;
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(inputStreamInvoke, null);
            if (shift > 0) {
                h = (h ^ k) * 1540483477;
            }
            int h2 = (h ^ (h >>> 13)) * 1540483477;
            return (h2 ^ (h2 >>> 15)) & 4294967295L;
        } finally {
        }
    }
}
