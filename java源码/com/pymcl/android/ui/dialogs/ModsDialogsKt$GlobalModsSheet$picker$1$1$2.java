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
import org.lwjgl.sdl.SDLScancode;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Function2;", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$GlobalModsSheet$picker$1$1$2", f = "ModsDialogs.kt", i = {1, 1, 1, 1, 1, 1}, l = {214, SDLScancode.SDL_SCANCODE_KP_CLEAR}, m = "invokeSuspend", n = {"files", "$this$map\\6", "$this$mapTo\\7", "destination\\7", "item\\7", "it\\8"}, nl = {215, 314}, s = {"L$0", "L$1", "L$3", "L$4", "L$6", "L$7"}, v = 2)
/* loaded from: classes18.dex */
final class ModsDialogsKt$GlobalModsSheet$picker$1$1$2 extends SuspendLambda implements Function2<Function2<? super Float, ? super String, ? extends Unit>, Continuation<? super String>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ AppState $state;
    final /* synthetic */ List<Uri> $uris;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModsDialogsKt$GlobalModsSheet$picker$1$1$2(List<Uri> list, Context context, AppState appState, Continuation<? super ModsDialogsKt$GlobalModsSheet$picker$1$1$2> continuation) {
        super(2, continuation);
        this.$uris = list;
        this.$ctx = context;
        this.$state = appState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModsDialogsKt$GlobalModsSheet$picker$1$1$2(this.$uris, this.$ctx, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Function2<? super Float, ? super String, ? extends Unit> function2, Continuation<? super String> continuation) {
        return invoke2((Function2<? super Float, ? super String, Unit>) function2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return ((ModsDialogsKt$GlobalModsSheet$picker$1$1$2) create(function2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[LOOP:0: B:12:0x0092->B:14:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0134 -> B:26:0x0141). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt$GlobalModsSheet$picker$1$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
