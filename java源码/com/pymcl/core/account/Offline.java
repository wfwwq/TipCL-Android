package com.pymcl.core.account;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.input.InputSettings;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* compiled from: Accounts.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/pymcl/core/account/Offline;", "", "<init>", "()V", "STEVE", "", "ALEX", "uuidFor", HintConstants.AUTOFILL_HINT_NAME, "create", "Lcom/pymcl/core/account/Account;", "skin", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Offline {
    public static final String ALEX = "ec561538-f3fd-461d-a7c9-7aa354f5bba9";
    public static final Offline INSTANCE = new Offline();
    public static final String STEVE = "8667ba71-b85a-4004-af54-457a9734eed7";

    private Offline() {
    }

    public final String uuidFor(String name) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = ("OfflinePlayer:" + name).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] a = messageDigest.digest(bytes);
        a[6] = (byte) ((a[6] & 15) | 48);
        a[8] = (byte) ((a[8] & 63) | 128);
        Intrinsics.checkNotNull(a);
        String h = ArraysKt.joinToString$default(a, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.pymcl.core.account.Offline$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Offline.uuidFor$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
        String strSubstring = h.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = h.substring(8, 12);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = h.substring(12, 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        String strSubstring4 = h.substring(16, 20);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        String strSubstring5 = h.substring(20);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        return strSubstring + "-" + strSubstring2 + "-" + strSubstring3 + "-" + strSubstring4 + "-" + strSubstring5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence uuidFor$lambda$0(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ Account create$default(Offline offline, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = InputSettings.DEFAULT_LAYOUT;
        }
        return offline.create(str, str2);
    }

    public final Account create(String name, String skin) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(skin, "skin");
        if (!new Regex("^[A-Za-z0-9_]{3,16}$").matches(name)) {
            throw new IllegalArgumentException("离线用户名需为 3-16 位字母、数字或下划线".toString());
        }
        String uuid = Intrinsics.areEqual(skin, "steve") ? STEVE : Intrinsics.areEqual(skin, "alex") ? ALEX : uuidFor(name);
        return new Account(JsonKt.jobj(TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "offline"), TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, name), TuplesKt.to("uuid", uuid), TuplesKt.to("skin", skin)));
    }
}
