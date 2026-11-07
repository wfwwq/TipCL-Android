package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: TextUnit.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0015\u001a\"\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a*\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a*\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\fH\u0001¢\u0006\u0002\u00107\u001a%\u00108\u001a\u00020\u0006*\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u00072\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010#\u001a\u001f\u0010=\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000¢\u0006\u0004\b?\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\u001f\u0010\u0012\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001f\u0010\u0018\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000e\"\u001e\u0010\u001b\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", SettingsProtocol.EXTRA_VALUE, "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static /* synthetic */ void getSp$annotations(double d) {
    }

    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static /* synthetic */ void getSp$annotations(int i) {
    }

    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7229isSpecifiedR2X_6o$annotations(long j) {
    }

    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7231isUnspecifiedR2X_6o$annotations(long j) {
    }

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m7224TextUnitanM5pPY(float value, long type) {
        return pack(type, value);
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m7228isSpecifiedR2X_6o(long $this$isSpecified) {
        return !(TextUnit.m7210getRawTypeimpl($this$isSpecified) == 0);
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m7230isUnspecifiedR2X_6o(long $this$isUnspecified) {
        return TextUnit.m7210getRawTypeimpl($this$isUnspecified) == 0;
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m7233takeOrElseeAf_CNQ(long $this$takeOrElse_u2deAf_CNQ, Function0<TextUnit> function0) {
        return !((TextUnit.m7210getRawTypeimpl($this$takeOrElse_u2deAf_CNQ) > 0L ? 1 : (TextUnit.m7210getRawTypeimpl($this$takeOrElse_u2deAf_CNQ) == 0L ? 0 : -1)) == 0) ? $this$takeOrElse_u2deAf_CNQ : function0.invoke().getPackedValue();
    }

    public static final long getSp(float $this$sp) {
        return pack(4294967296L, $this$sp);
    }

    public static final long getEm(float $this$em) {
        return pack(8589934592L, $this$em);
    }

    public static final long getSp(double $this$sp) {
        return pack(4294967296L, (float) $this$sp);
    }

    public static final long getEm(double $this$em) {
        return pack(8589934592L, (float) $this$em);
    }

    public static final long getSp(int $this$sp) {
        return pack(4294967296L, $this$sp);
    }

    public static final long getEm(int $this$em) {
        return pack(8589934592L, $this$em);
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7235timesmpE4wyQ(float $this$times_u2dmpE4wyQ, long other) {
        m7225checkArithmeticR2X_6o(other);
        return pack(TextUnit.m7210getRawTypeimpl(other), TextUnit.m7212getValueimpl(other) * $this$times_u2dmpE4wyQ);
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7234timesmpE4wyQ(double $this$times_u2dmpE4wyQ, long other) {
        m7225checkArithmeticR2X_6o(other);
        return pack(TextUnit.m7210getRawTypeimpl(other), ((float) $this$times_u2dmpE4wyQ) * TextUnit.m7212getValueimpl(other));
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7236timesmpE4wyQ(int $this$times_u2dmpE4wyQ, long other) {
        m7225checkArithmeticR2X_6o(other);
        return pack(TextUnit.m7210getRawTypeimpl(other), $this$times_u2dmpE4wyQ * TextUnit.m7212getValueimpl(other));
    }

    public static final long pack(long unitType, float v) {
        return TextUnit.m7204constructorimpl((Float.floatToRawIntBits(v) & 4294967295L) | unitType);
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m7225checkArithmeticR2X_6o(long a) {
        boolean value$iv = !(TextUnit.m7210getRawTypeimpl(a) == 0);
        if (value$iv) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7226checkArithmeticNB67dxo(long r10, long r12) {
        /*
            r0 = r10
            r2 = 0
            long r3 = androidx.compose.ui.unit.TextUnit.m7210getRawTypeimpl(r0)
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            r7 = 0
            if (r3 != 0) goto L10
            r0 = r4
            goto L11
        L10:
            r0 = r7
        L11:
            if (r0 != 0) goto L23
            r0 = r12
            r2 = 0
            long r8 = androidx.compose.ui.unit.TextUnit.m7210getRawTypeimpl(r0)
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L1f
            r0 = r4
            goto L20
        L1f:
            r0 = r7
        L20:
            if (r0 != 0) goto L23
            goto L24
        L23:
            r4 = r7
        L24:
            r0 = 0
            if (r4 != 0) goto L2f
            r1 = 0
            java.lang.String r1 = "Cannot perform operation for Unspecified type."
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException(r1)
        L2f:
            long r0 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r10)
            long r2 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r12)
            boolean r0 = androidx.compose.ui.unit.TextUnitType.m7240equalsimpl0(r0, r2)
            r1 = 0
            if (r0 != 0) goto L71
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot perform operation for "
            java.lang.StringBuilder r3 = r3.append(r4)
            long r4 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r10)
            java.lang.String r4 = androidx.compose.ui.unit.TextUnitType.m7242toStringimpl(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " and "
            java.lang.StringBuilder r3 = r3.append(r4)
            long r4 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r12)
            java.lang.String r4 = androidx.compose.ui.unit.TextUnitType.m7242toStringimpl(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r2 = r3.toString()
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException(r2)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.unit.TextUnitKt.m7226checkArithmeticNB67dxo(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7227checkArithmeticvU0ePk(long r10, long r12, long r14) {
        /*
            r0 = r10
            r2 = 0
            long r3 = androidx.compose.ui.unit.TextUnit.m7210getRawTypeimpl(r0)
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            r7 = 0
            if (r3 != 0) goto L10
            r0 = r4
            goto L11
        L10:
            r0 = r7
        L11:
            if (r0 != 0) goto L33
            r0 = r12
            r2 = 0
            long r8 = androidx.compose.ui.unit.TextUnit.m7210getRawTypeimpl(r0)
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L1f
            r0 = r4
            goto L20
        L1f:
            r0 = r7
        L20:
            if (r0 != 0) goto L33
            r0 = r14
            r2 = 0
            long r8 = androidx.compose.ui.unit.TextUnit.m7210getRawTypeimpl(r0)
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L2e
            r0 = r4
            goto L2f
        L2e:
            r0 = r7
        L2f:
            if (r0 != 0) goto L33
            r0 = r4
            goto L34
        L33:
            r0 = r7
        L34:
            r1 = 0
            if (r0 != 0) goto L3f
            r2 = 0
            java.lang.String r2 = "Cannot perform operation for Unspecified type."
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException(r2)
        L3f:
            long r0 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r10)
            long r2 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r12)
            boolean r0 = androidx.compose.ui.unit.TextUnitType.m7240equalsimpl0(r0, r2)
            if (r0 == 0) goto L5d
            long r0 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r12)
            long r2 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r14)
            boolean r0 = androidx.compose.ui.unit.TextUnitType.m7240equalsimpl0(r0, r2)
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r4 = r7
        L5e:
            r0 = 0
            if (r4 != 0) goto L93
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot perform operation for "
            java.lang.StringBuilder r2 = r2.append(r3)
            long r5 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r10)
            java.lang.String r3 = androidx.compose.ui.unit.TextUnitType.m7242toStringimpl(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " and "
            java.lang.StringBuilder r2 = r2.append(r3)
            long r5 = androidx.compose.ui.unit.TextUnit.m7211getTypeUIouoOA(r12)
            java.lang.String r3 = androidx.compose.ui.unit.TextUnitType.m7242toStringimpl(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            androidx.compose.ui.unit.InlineClassHelperKt.throwIllegalArgumentException(r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.unit.TextUnitKt.m7227checkArithmeticvU0ePk(long, long, long):void");
    }

    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m7232lerpC3pnCVY(long start, long stop, float fraction) {
        m7226checkArithmeticNB67dxo(start, stop);
        return pack(TextUnit.m7210getRawTypeimpl(start), MathHelpersKt.lerp(TextUnit.m7212getValueimpl(start), TextUnit.m7212getValueimpl(stop), fraction));
    }
}
