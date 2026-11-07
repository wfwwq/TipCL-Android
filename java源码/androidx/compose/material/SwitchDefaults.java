package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1815colorsSQMK_m0(long checkedThumbColor, long checkedTrackColor, float checkedTrackAlpha, long uncheckedThumbColor, long uncheckedTrackColor, float uncheckedTrackAlpha, long disabledCheckedThumbColor, long disabledCheckedTrackColor, long disabledUncheckedThumbColor, long disabledUncheckedTrackColor, Composer $composer, int $changed, int $changed1, int i) {
        float checkedTrackAlpha2;
        long checkedThumbColor2;
        long disabledCheckedThumbColor2;
        long disabledCheckedThumbColor3;
        long disabledCheckedTrackColor2;
        long disabledCheckedTrackColor3;
        long disabledUncheckedThumbColor2;
        long disabledUncheckedTrackColor2;
        long disabledUncheckedTrackColor3;
        ComposerKt.sourceInformationMarkerStart($composer, -1032127534, "C(colors)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color!1,7:c#ui.graphics.Color,9:c#ui.graphics.Color,8,3:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color)319@13206L6,322@13378L6,323@13445L6,327@13623L8,328@13678L6,331@13811L8,332@13866L6,335@14003L8,336@14058L6,339@14195L8,340@14250L6:Switch.kt#jmzs0o");
        long checkedThumbColor3 = (i & 1) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1622getSecondaryVariant0d7_KjU() : checkedThumbColor;
        long checkedTrackColor2 = (i & 2) != 0 ? checkedThumbColor3 : checkedTrackColor;
        float checkedTrackAlpha3 = (i & 4) != 0 ? 0.54f : checkedTrackAlpha;
        long uncheckedThumbColor2 = (i & 8) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1623getSurface0d7_KjU() : uncheckedThumbColor;
        long uncheckedTrackColor2 = (i & 16) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU() : uncheckedTrackColor;
        float uncheckedTrackAlpha2 = (i & 32) != 0 ? 0.38f : uncheckedTrackAlpha;
        if ((i & 64) != 0) {
            long checkedThumbColor4 = checkedThumbColor3;
            checkedThumbColor2 = checkedThumbColor4;
            checkedTrackAlpha2 = checkedTrackAlpha3;
            disabledCheckedThumbColor2 = ColorKt.m4435compositeOverOWjLjI(Color.m4388copywmQWz5c(checkedThumbColor4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(checkedThumbColor4) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(checkedThumbColor4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(checkedThumbColor4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(checkedThumbColor4) : 0.0f), MaterialTheme.INSTANCE.getColors($composer, 6).m1623getSurface0d7_KjU());
        } else {
            checkedTrackAlpha2 = checkedTrackAlpha3;
            checkedThumbColor2 = checkedThumbColor3;
            disabledCheckedThumbColor2 = disabledCheckedThumbColor;
        }
        if ((i & 128) != 0) {
            long checkedTrackColor3 = checkedTrackColor2;
            disabledCheckedThumbColor3 = disabledCheckedThumbColor2;
            disabledCheckedTrackColor2 = ColorKt.m4435compositeOverOWjLjI(Color.m4388copywmQWz5c(checkedTrackColor3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(checkedTrackColor3) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(checkedTrackColor3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(checkedTrackColor3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(checkedTrackColor3) : 0.0f), MaterialTheme.INSTANCE.getColors($composer, 6).m1623getSurface0d7_KjU());
        } else {
            disabledCheckedThumbColor3 = disabledCheckedThumbColor2;
            disabledCheckedTrackColor2 = disabledCheckedTrackColor;
        }
        if ((i & 256) != 0) {
            long uncheckedThumbColor3 = uncheckedThumbColor2;
            disabledCheckedTrackColor3 = disabledCheckedTrackColor2;
            disabledUncheckedThumbColor2 = ColorKt.m4435compositeOverOWjLjI(Color.m4388copywmQWz5c(uncheckedThumbColor3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(uncheckedThumbColor3) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(uncheckedThumbColor3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(uncheckedThumbColor3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(uncheckedThumbColor3) : 0.0f), MaterialTheme.INSTANCE.getColors($composer, 6).m1623getSurface0d7_KjU());
        } else {
            disabledCheckedTrackColor3 = disabledCheckedTrackColor2;
            disabledUncheckedThumbColor2 = disabledUncheckedThumbColor;
        }
        if ((i & 512) != 0) {
            long uncheckedTrackColor3 = uncheckedTrackColor2;
            disabledUncheckedTrackColor2 = ColorKt.m4435compositeOverOWjLjI(Color.m4388copywmQWz5c(uncheckedTrackColor3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(uncheckedTrackColor3) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(uncheckedTrackColor3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(uncheckedTrackColor3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(uncheckedTrackColor3) : 0.0f), MaterialTheme.INSTANCE.getColors($composer, 6).m1623getSurface0d7_KjU());
        } else {
            disabledUncheckedTrackColor2 = disabledUncheckedTrackColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            disabledUncheckedTrackColor3 = disabledUncheckedTrackColor2;
            ComposerKt.traceEventStart(-1032127534, $changed, $changed1, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:342)");
        } else {
            disabledUncheckedTrackColor3 = disabledUncheckedTrackColor2;
        }
        long checkedTrackColor4 = checkedTrackColor2;
        float checkedTrackAlpha4 = checkedTrackAlpha2;
        long checkedTrackColor5 = Color.m4388copywmQWz5c(checkedTrackColor4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(checkedTrackColor4) : checkedTrackAlpha4, (14 & 2) != 0 ? Color.m4396getRedimpl(checkedTrackColor4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(checkedTrackColor4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(checkedTrackColor4) : 0.0f);
        long uncheckedTrackColor4 = uncheckedTrackColor2;
        long uncheckedTrackColor5 = Color.m4388copywmQWz5c(uncheckedTrackColor4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(uncheckedTrackColor4) : uncheckedTrackAlpha2, (14 & 2) != 0 ? Color.m4396getRedimpl(uncheckedTrackColor4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(uncheckedTrackColor4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(uncheckedTrackColor4) : 0.0f);
        long disabledCheckedTrackColor4 = disabledCheckedTrackColor3;
        long jM4388copywmQWz5c = Color.m4388copywmQWz5c(disabledCheckedTrackColor4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(disabledCheckedTrackColor4) : checkedTrackAlpha4, (14 & 2) != 0 ? Color.m4396getRedimpl(disabledCheckedTrackColor4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(disabledCheckedTrackColor4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(disabledCheckedTrackColor4) : 0.0f);
        long disabledUncheckedTrackColor4 = disabledUncheckedTrackColor3;
        long checkedThumbColor5 = checkedThumbColor2;
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(checkedThumbColor5, checkedTrackColor5, uncheckedThumbColor2, uncheckedTrackColor5, disabledCheckedThumbColor3, jM4388copywmQWz5c, disabledUncheckedThumbColor2, Color.m4388copywmQWz5c(disabledUncheckedTrackColor4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(disabledUncheckedTrackColor4) : uncheckedTrackAlpha2, (14 & 2) != 0 ? Color.m4396getRedimpl(disabledUncheckedTrackColor4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(disabledUncheckedTrackColor4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(disabledUncheckedTrackColor4) : 0.0f), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return defaultSwitchColors;
    }
}
