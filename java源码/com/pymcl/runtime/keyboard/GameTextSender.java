package com.pymcl.runtime.keyboard;

import android.os.Handler;
import android.os.Looper;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.input.InputSink;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GameTextSender.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/pymcl/runtime/keyboard/GameTextSender;", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "cursorVisible", "Lkotlin/Function0;", "", "schedule", "Lkotlin/Function2;", "", "", "chatKey", "", "chatOpenDelayMs", "<init>", "(Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IJ)V", "getChatKey", "()I", "setChatKey", "(I)V", "getChatOpenDelayMs", "()J", "setChatOpenDelayMs", "(J)V", "send", TerracottaVpnService.EXTRA_TEXT, "", "pressEnter", "commit", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GameTextSender {
    private int chatKey;
    private long chatOpenDelayMs;
    private final Function0<Boolean> cursorVisible;
    private final Function2<Long, Function0<Unit>, Unit> schedule;
    private final InputSink sink;

    /* JADX WARN: Multi-variable type inference failed */
    public GameTextSender(InputSink sink, Function0<Boolean> cursorVisible, Function2<? super Long, ? super Function0<Unit>, Unit> schedule, int chatKey, long chatOpenDelayMs) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(cursorVisible, "cursorVisible");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        this.sink = sink;
        this.cursorVisible = cursorVisible;
        this.schedule = schedule;
        this.chatKey = chatKey;
        this.chatOpenDelayMs = chatOpenDelayMs;
    }

    public /* synthetic */ GameTextSender(InputSink inputSink, Function0 function0, Function2 function2, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputSink, function0, (i2 & 4) != 0 ? new Function2() { // from class: com.pymcl.runtime.keyboard.GameTextSender$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GameTextSender._init_$lambda$0(((Long) obj).longValue(), (Function0) obj2);
            }
        } : function2, (i2 & 8) != 0 ? 20 : i, (i2 & 16) != 0 ? 150L : j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(long d, final Function0 r) {
        Intrinsics.checkNotNullParameter(r, "r");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.pymcl.runtime.keyboard.GameTextSender$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                r.invoke();
            }
        }, d);
        return Unit.INSTANCE;
    }

    public final int getChatKey() {
        return this.chatKey;
    }

    public final void setChatKey(int i) {
        this.chatKey = i;
    }

    public final long getChatOpenDelayMs() {
        return this.chatOpenDelayMs;
    }

    public final void setChatOpenDelayMs(long j) {
        this.chatOpenDelayMs = j;
    }

    public static /* synthetic */ void send$default(GameTextSender gameTextSender, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gameTextSender.send(str, z);
    }

    public final void send(final String text, final boolean pressEnter) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.cursorVisible.invoke().booleanValue()) {
            commit(text);
        } else {
            this.sink.tapKey(this.chatKey);
            this.schedule.invoke(Long.valueOf(this.chatOpenDelayMs), new Function0() { // from class: com.pymcl.runtime.keyboard.GameTextSender$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GameTextSender.send$lambda$0(this.f$0, text, pressEnter);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit send$lambda$0(GameTextSender this$0, String $text, boolean $pressEnter) {
        this$0.commit($text);
        if ($pressEnter) {
            this$0.sink.tapKey(28);
        }
        return Unit.INSTANCE;
    }

    private final void commit(String text) {
        List parts = StringsKt.split$default((CharSequence) text, new char[]{'\n'}, false, 0, 6, (Object) null);
        List $this$forEachIndexed$iv = parts;
        int i = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String seg = (String) item$iv;
            if (seg.length() > 0) {
                this.sink.text(seg);
            }
            if (i < parts.size() - 1) {
                this.sink.tapKey(28);
            }
            i = index$iv;
        }
    }
}
