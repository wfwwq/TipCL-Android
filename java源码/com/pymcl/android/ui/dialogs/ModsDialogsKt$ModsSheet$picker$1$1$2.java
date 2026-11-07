package com.pymcl.android.ui.dialogs;

import android.content.Context;
import android.net.Uri;
import com.pymcl.android.ui.state.AppState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "p", "Lkotlin/Function2;", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$picker$1$1$2", f = "ModsDialogs.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {106, 111}, m = "invokeSuspend", n = {"p", "p", "files", "out", "$this$forEachIndexed\\6", "item\\6", "f\\7", "index\\6", "i\\7"}, nl = {107, 112}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$8", "L$9", "I$0", "I$1"}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$ModsSheet$picker$1$1$2 extends SuspendLambda implements Function2<Function2<? super Float, ? super String, ? extends Unit>, Continuation<? super String>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ String $inst;
    final /* synthetic */ AppState $state;
    final /* synthetic */ List<Uri> $uris;
    final /* synthetic */ String $v;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$ModsSheet$picker$1$1$2(List<Uri> list, Context context, AppState appState, String str, String str2, Continuation<? super ModsDialogsKt$ModsSheet$picker$1$1$2> continuation) {
        super(2, continuation);
        this.$uris = list;
        this.$ctx = context;
        this.$state = appState;
        this.$inst = str;
        this.$v = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModsDialogsKt$ModsSheet$picker$1$1$2 modsDialogsKt$ModsSheet$picker$1$1$2 = new ModsDialogsKt$ModsSheet$picker$1$1$2(this.$uris, this.$ctx, this.$state, this.$inst, this.$v, continuation);
        modsDialogsKt$ModsSheet$picker$1$1$2.L$0 = obj;
        return modsDialogsKt$ModsSheet$picker$1$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function2<? super Float, ? super String, ? extends Unit> function2, Continuation<? super String> continuation) {
        return invoke2((Function2<? super Float, ? super String, Unit>) function2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return ((ModsDialogsKt$ModsSheet$picker$1$1$2) create(function2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1 A[LOOP:0: B:12:0x009b->B:14:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x016f -> B:29:0x0184). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$picker$1$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
