package com.pymcl.multiplayer;

import java.math.BigInteger;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RoomCode.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/pymcl/multiplayer/RoomCode;", "", "<init>", "()V", "ALPHABET", "", "WIDTH", "", "B34", "Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "B7", "lookup", "c", "", "(C)Ljava/lang/Integer;", "parse", TerracottaVpnService.EXTRA_TEXT, "format", "value", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoomCode {
    public static final String ALPHABET = "0123456789ABCDEFGHJKLMNPQRSTUVWXYZ";
    private static final int WIDTH = 21;
    public static final RoomCode INSTANCE = new RoomCode();
    private static final BigInteger B34 = BigInteger.valueOf(34);
    private static final BigInteger B7 = BigInteger.valueOf(7);

    private RoomCode() {
    }

    private final Integer lookup(char c) {
        int i;
        switch (c) {
            case 'I':
                i = 1;
                break;
            case 'O':
                i = 0;
                break;
            default:
                Integer numValueOf = Integer.valueOf(StringsKt.indexOf$default((CharSequence) ALPHABET, c, 0, false, 6, (Object) null));
                int it = numValueOf.intValue();
                if (it >= 0) {
                    return numValueOf;
                }
                return null;
        }
        return i;
    }

    public final String parse(String text) {
        String s = (text == null ? "" : text).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toUpperCase(...)");
        int i = 0;
        int length = s.length() - 21;
        if (0 > length) {
            return null;
        }
        while (true) {
            if (s.charAt(i) == 'U' && s.charAt(i + 1) == '/') {
                String body = s.substring(i + 2, i + 21);
                Intrinsics.checkNotNullExpressionValue(body, "substring(...)");
                BigInteger v = BigInteger.ZERO;
                boolean ok = true;
                int k = body.length();
                while (true) {
                    k--;
                    if (-1 < k) {
                        switch (k) {
                            case 4:
                            case 9:
                            case 14:
                                if (body.charAt(k) != '-') {
                                    ok = false;
                                    break;
                                }
                            default:
                                Integer numLookup = lookup(body.charAt(k));
                                if (numLookup == null) {
                                    ok = false;
                                    break;
                                } else {
                                    int d = numLookup.intValue();
                                    v = v.multiply(B34).add(BigInteger.valueOf(d));
                                }
                        }
                    }
                }
                if (ok && Intrinsics.areEqual(v.mod(B7), BigInteger.ZERO)) {
                    Intrinsics.checkNotNull(v);
                    return format(v);
                }
            }
            if (i == length) {
                return null;
            }
            i++;
        }
    }

    public final String format(BigInteger value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BigInteger v = value;
        StringBuilder sb = new StringBuilder("U/");
        for (int i = 0; i < 16; i++) {
            switch (i) {
                case 4:
                case 8:
                case 12:
                    sb.append('-');
                    break;
            }
            BigInteger[] bigIntegerArrDivideAndRemainder = v.divideAndRemainder(B34);
            Intrinsics.checkNotNull(bigIntegerArrDivideAndRemainder);
            BigInteger q = bigIntegerArrDivideAndRemainder[0];
            BigInteger r = bigIntegerArrDivideAndRemainder[1];
            sb.append(ALPHABET.charAt(r.intValue()));
            Intrinsics.checkNotNull(q);
            v = q;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
