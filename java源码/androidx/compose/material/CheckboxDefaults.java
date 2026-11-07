package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m1597colorszjMxDiM(long checkedColor, long uncheckedColor, long checkmarkColor, long disabledColor, long disabledIndeterminateColor, Composer $composer, int $changed, int i) {
        long uncheckedColor2;
        long disabledColor2;
        long checkedColor2;
        long checkedColor3;
        ComposerKt.sourceInformationMarkerStart($composer, 469524104, "C(colors)P(0:c#ui.graphics.Color,4:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)222@9455L6,223@9519L6,224@9602L6,225@9663L6,225@9706L8,226@9800L8,228@9849L922:Checkbox.kt#jmzs0o");
        long checkedColor4 = (i & 1) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1621getSecondary0d7_KjU() : checkedColor;
        if ((i & 2) != 0) {
            long jM1618getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            uncheckedColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU) : 0.6f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU) : 0.0f);
        } else {
            uncheckedColor2 = uncheckedColor;
        }
        long checkmarkColor2 = (i & 4) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1623getSurface0d7_KjU() : checkmarkColor;
        if ((i & 8) != 0) {
            long jM1618getOnSurface0d7_KjU2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            disabledColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU2) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU2) : 0.0f);
        } else {
            disabledColor2 = disabledColor;
        }
        if ((i & 16) != 0) {
            long checkedColor5 = checkedColor4;
            checkedColor3 = Color.m4388copywmQWz5c(checkedColor5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(checkedColor5) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(checkedColor5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(checkedColor5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(checkedColor5) : 0.0f);
            checkedColor2 = checkedColor5;
        } else {
            checkedColor2 = checkedColor4;
            checkedColor3 = disabledIndeterminateColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, $changed, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:227)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 654677405, "CC(remember):Checkbox.kt#9igjgp");
        boolean invalid$iv = (((($changed & 14) ^ 6) > 4 && $composer.changed(checkedColor2)) || ($changed & 6) == 4) | (((($changed & 112) ^ 48) > 32 && $composer.changed(uncheckedColor2)) || ($changed & 48) == 32) | (((($changed & User32.WM_PENWINFIRST) ^ 384) > 256 && $composer.changed(checkmarkColor2)) || ($changed & 384) == 256) | (((($changed & GL11.GL_RENDER) ^ 3072) > 2048 && $composer.changed(disabledColor2)) || ($changed & 3072) == 2048) | ((((57344 & $changed) ^ 24576) > 16384 && $composer.changed(checkedColor3)) || ($changed & 24576) == 16384);
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
            long checkmarkColor3 = checkmarkColor2;
            long checkmarkColor4 = Color.m4388copywmQWz5c(checkmarkColor3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(checkmarkColor3) : 0.0f, (14 & 2) != 0 ? Color.m4396getRedimpl(checkmarkColor3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(checkmarkColor3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(checkmarkColor3) : 0.0f);
            long checkedColor6 = checkedColor2;
            long checkedColor7 = Color.m4388copywmQWz5c(checkedColor6, (14 & 1) != 0 ? Color.m4392getAlphaimpl(checkedColor6) : 0.0f, (14 & 2) != 0 ? Color.m4396getRedimpl(checkedColor6) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(checkedColor6) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(checkedColor6) : 0.0f);
            long disabledColor3 = disabledColor2;
            long checkedColor8 = Color.m4388copywmQWz5c(disabledColor3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(disabledColor3) : 0.0f, (14 & 2) != 0 ? Color.m4396getRedimpl(disabledColor3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(disabledColor3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(disabledColor3) : 0.0f);
            long disabledColor4 = checkedColor3;
            value$iv = new DefaultCheckboxColors(checkmarkColor3, checkmarkColor4, checkedColor6, checkedColor7, disabledColor3, checkedColor8, disabledColor4, checkedColor6, uncheckedColor2, disabledColor3, checkedColor3, null);
            $composer.updateRememberedValue(value$iv);
        }
        DefaultCheckboxColors defaultCheckboxColors = (DefaultCheckboxColors) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return defaultCheckboxColors;
    }
}
