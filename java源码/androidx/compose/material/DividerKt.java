package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"DividerAlpha", "", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DividerKt {
    private static final float DividerAlpha = 0.12f;

    /* renamed from: Divider-oMI9zvI, reason: not valid java name */
    public static final void m1662DivideroMI9zvI(Modifier modifier, long color, float thickness, float startIndent, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        long j;
        float thickness2;
        float f;
        final Modifier modifier3;
        final long color2;
        final float thickness3;
        final float startIndent2;
        Modifier.Companion modifier4;
        long color3;
        float startIndent3;
        float targetThickness;
        Composer $composer2 = $composer.startRestartGroup(-1249392198);
        ComposerKt.sourceInformation($composer2, "C(Divider)P(1,0:c#ui.graphics.Color,3:c#ui.unit.Dp,2:c#ui.unit.Dp)64@2318L94:Divider.kt#jmzs0o");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 48) == 0) {
            if ((i & 2) == 0) {
                j = color;
                int i3 = $composer2.changed(j) ? 32 : 16;
                $dirty |= i3;
            } else {
                j = color;
            }
            $dirty |= i3;
        } else {
            j = color;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            thickness2 = thickness;
        } else if (($changed & 384) == 0) {
            thickness2 = thickness;
            $dirty |= $composer2.changed(thickness2) ? 256 : 128;
        } else {
            thickness2 = thickness;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty |= 3072;
            f = startIndent;
        } else if (($changed & 3072) == 0) {
            f = startIndent;
            $dirty |= $composer2.changed(f) ? 2048 : 1024;
        } else {
            f = startIndent;
        }
        if ($composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "48@1889L6");
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i & 2) != 0) {
                    long jM1618getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors($composer2, 6).m1618getOnSurface0d7_KjU();
                    color3 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU) : 0.12f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU) : 0.0f);
                    $dirty &= -113;
                } else {
                    color3 = j;
                }
                if (i4 != 0) {
                    thickness2 = Dp.m7018constructorimpl(1);
                }
                startIndent3 = i5 != 0 ? Dp.m7018constructorimpl(0) : f;
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 2) != 0) {
                    $dirty &= -113;
                }
                modifier4 = modifier2;
                color3 = j;
                startIndent3 = f;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249392198, $dirty, -1, "androidx.compose.material.Divider (Divider.kt:51)");
            }
            Modifier.Companion indentMod = !((startIndent3 > 0.0f ? 1 : (startIndent3 == 0.0f ? 0 : -1)) == 0) ? PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, startIndent3, 0.0f, 0.0f, 0.0f, 14, null) : Modifier.INSTANCE;
            if (Dp.m7023equalsimpl0(thickness2, Dp.INSTANCE.m7036getHairlineD9Ej5fM())) {
                $composer2.startReplaceGroup(-129273423);
                ComposerKt.sourceInformation($composer2, "*60@2245L7");
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = $composer2.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                float $this$dp$iv = 1.0f / ((Density) objConsume).getDensity();
                targetThickness = Dp.m7018constructorimpl($this$dp$iv);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-129206866);
                $composer2.endReplaceGroup();
                targetThickness = thickness2;
            }
            BoxKt.Box(BackgroundKt.m247backgroundbw27NRU$default(SizeKt.m771height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4.then(indentMod), 0.0f, 1, null), targetThickness), color3, null, 2, null), $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            color2 = color3;
            thickness3 = thickness2;
            startIndent2 = startIndent3;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            color2 = j;
            thickness3 = thickness2;
            startIndent2 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i6) {
                    DividerKt.m1662DivideroMI9zvI(modifier3, color2, thickness3, startIndent2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }
}
