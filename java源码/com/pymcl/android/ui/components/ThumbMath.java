package com.pymcl.android.ui.components;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: NetImage.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nÊ\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/components/ThumbMath;", "", "<init>", "()V", "sampleSize", "", "w", "h", "targetPx", "cacheKey", "", "url", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class ThumbMath {
    public static final int $stable = 0;
    public static final ThumbMath INSTANCE = new ThumbMath();

    private ThumbMath() {
    }

    public final int sampleSize(int w, int h, int targetPx) {
        int s = 1;
        if (targetPx <= 0) {
            return 1;
        }
        while (w / (s * 2) >= targetPx && h / (s * 2) >= targetPx) {
            s *= 2;
        }
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence cacheKey$lambda$0(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final String cacheKey(String url) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(url, "url");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.pymcl.android.ui.components.ThumbMath$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThumbMath.cacheKey$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }
}
