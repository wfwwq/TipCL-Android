package kotlin.time;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Clocks.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0080\u0004b\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\bb\u0010\b\t\u0012\f\b\n\u0012\b\b\fJ\u0004\b\t0\u000bb\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\u0002\b\u0005¨\u0006\u000e"}, d2 = {"asClock", "Lkotlin/time/Clock;", "Lkotlin/time/TimeSource;", "origin", "Lkotlin/time/Instant;", "fromTimeSource", "Lkotlin/SinceKotlin;", "version", "2.3", "Lkotlin/WasExperimental;", "markerClass", "Lkotlin/time/ExperimentalTime;", "Lkotlin/jvm/JvmName;", HintConstants.AUTOFILL_HINT_NAME, "kotlin-stdlib"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class ClocksKt {
    public static final Clock fromTimeSource(final TimeSource $this$asClock, final Instant origin) {
        Intrinsics.checkNotNullParameter($this$asClock, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new Clock($this$asClock, origin) { // from class: kotlin.time.ClocksKt$asClock$1
            final /* synthetic */ Instant $origin;
            private final TimeMark startMark;

            {
                this.$origin = origin;
                this.startMark = $this$asClock.markNow();
            }

            @Override // kotlin.time.Clock
            public Instant now() {
                return this.$origin.m9600plusLRDsOJo(this.startMark.mo9483elapsedNowUwyO8pc());
            }
        };
    }
}
