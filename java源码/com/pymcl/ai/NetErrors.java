package com.pymcl.ai;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: AiClient.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lcom/pymcl/ai/NetErrors;", "", "<init>", "()V", "chain", "Lkotlin/sequences/Sequence;", "", "e", "isTls", "", "isCleartextBlocked", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetErrors {
    public static final NetErrors INSTANCE = new NetErrors();

    private NetErrors() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable chain$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Throwable c = it.getCause();
        if (c != null) {
            if (c != it) {
                return c;
            }
        }
        return null;
    }

    public final Sequence<Throwable> chain(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return SequencesKt.take(SequencesKt.generateSequence(e, (Function1<? super Throwable, ? extends Throwable>) new Function1() { // from class: com.pymcl.ai.NetErrors$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetErrors.chain$lambda$0((Throwable) obj);
            }
        }), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isTls(java.lang.Throwable r15) {
        /*
            r14 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            kotlin.sequences.Sequence r0 = r14.chain(r15)
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Le:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r2.next()
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r6 = 0
            boolean r7 = r5 instanceof javax.net.ssl.SSLException
            r8 = 1
            if (r7 != 0) goto L67
            java.lang.String r7 = r5.getMessage()
            if (r7 != 0) goto L2a
            java.lang.String r7 = ""
        L2a:
            r9 = 0
            r10 = r7
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r11 = "unrecognized_name"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r10 = kotlin.text.StringsKt.contains(r10, r11, r8)
            if (r10 != 0) goto L64
            r10 = r7
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r11 = "UNRECOGNIZED_NAME"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r12 = 2
            r13 = 0
            boolean r10 = kotlin.text.StringsKt.contains$default(r10, r11, r4, r12, r13)
            if (r10 != 0) goto L64
            r10 = r7
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r11 = "handshake"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r10 = kotlin.text.StringsKt.contains(r10, r11, r8)
            if (r10 == 0) goto L62
            r10 = r7
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r11 = "ssl"
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r10 = kotlin.text.StringsKt.contains(r10, r11, r8)
            if (r10 == 0) goto L62
            goto L64
        L62:
            r7 = r4
            goto L65
        L64:
            r7 = r8
        L65:
            if (r7 == 0) goto L68
        L67:
            r4 = r8
        L68:
            if (r4 == 0) goto Le
            r4 = r8
            goto L6d
        L6c:
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.NetErrors.isTls(java.lang.Throwable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isCleartextBlocked(java.lang.Throwable r11) {
        /*
            r10 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.sequences.Sequence r0 = r10.chain(r11)
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Le:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            r5 = r3
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r6 = 0
            boolean r7 = r5 instanceof java.net.UnknownServiceException
            r8 = 1
            if (r7 != 0) goto L36
            java.lang.String r7 = r5.getMessage()
            if (r7 != 0) goto L2a
            java.lang.String r7 = ""
        L2a:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r9 = "CLEARTEXT"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r7 = kotlin.text.StringsKt.contains(r7, r9, r8)
            if (r7 == 0) goto L37
        L36:
            r4 = r8
        L37:
            if (r4 == 0) goto Le
            r4 = r8
            goto L3c
        L3b:
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.NetErrors.isCleartextBlocked(java.lang.Throwable):boolean");
    }
}
