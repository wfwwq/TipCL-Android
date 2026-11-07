package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: TextFieldSize.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"textFieldMinSize", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    public static final Modifier textFieldMinSize(Modifier $this$textFieldMinSize, final TextStyle style) {
        return ComposedModifierKt.composed$default($this$textFieldMinSize, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
                TextStyle resolvedStyle;
                $composer.startReplaceGroup(1582736677);
                ComposerKt.sourceInformation($composer, "C37@1534L7,38@1595L7,39@1650L7,41@1683L76,43@1788L340,52@2153L101,58@2372L487:TextFieldSize.kt#423gt5");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582736677, $changed, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = $composer.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Density density = (Density) objConsume;
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume2 = $composer.consume(localFontFamilyResolver);
                ComposerKt.sourceInformationMarkerEnd($composer);
                FontFamily.Resolver fontFamilyResolver = (FontFamily.Resolver) objConsume2;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume3 = $composer.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd($composer);
                LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
                ComposerKt.sourceInformationMarkerStart($composer, 979653560, "CC(remember):TextFieldSize.kt#9igjgp");
                boolean invalid$iv = $composer.changed(style) | $composer.changed(layoutDirection);
                TextStyle textStyle = style;
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                TextStyle resolvedStyle2 = (TextStyle) it$iv;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 979657184, "CC(remember):TextFieldSize.kt#9igjgp");
                boolean invalid$iv2 = $composer.changed(fontFamilyResolver) | $composer.changed(resolvedStyle2);
                Object it$iv2 = $composer.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = resolvedStyle2.getFontFamily();
                    FontWeight fontWeight = resolvedStyle2.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM6491getFontStyle4Lr2A7w = resolvedStyle2.m6491getFontStyle4Lr2A7w();
                    resolvedStyle = resolvedStyle2;
                    int iM6574unboximpl = fontStyleM6491getFontStyle4Lr2A7w != null ? fontStyleM6491getFontStyle4Lr2A7w.m6574unboximpl() : FontStyle.INSTANCE.m6578getNormal_LCdwA();
                    FontSynthesis fontSynthesisM6492getFontSynthesisZQGJjVo = resolvedStyle.m6492getFontSynthesisZQGJjVo();
                    Object value$iv2 = fontFamilyResolver.mo6544resolveDPcqOEQ(fontFamily, fontWeight, iM6574unboximpl, fontSynthesisM6492getFontSynthesisZQGJjVo != null ? fontSynthesisM6492getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m6588getAllGVVA2EU());
                    $composer.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                } else {
                    resolvedStyle = resolvedStyle2;
                }
                State typeface$delegate = (State) it$iv2;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 979668625, "CC(remember):TextFieldSize.kt#9igjgp");
                TextStyle textStyle2 = style;
                Object it$iv3 = $composer.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new TextFieldSize(layoutDirection, density, fontFamilyResolver, textStyle2, typeface$delegate.getValue());
                    $composer.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                }
                final TextFieldSize minSizeState = (TextFieldSize) it$iv3;
                ComposerKt.sourceInformationMarkerEnd($composer);
                minSizeState.update(layoutDirection, density, fontFamilyResolver, resolvedStyle, typeface$delegate.getValue());
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 979676019, "CC(remember):TextFieldSize.kt#9igjgp");
                boolean invalid$iv3 = $composer.changedInstance(minSizeState);
                Object it$iv4 = $composer.rememberedValue();
                if (invalid$iv3 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv4 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m1175invoke3p2s80s(measureScope, measurable, constraints.getValue());
                        }

                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m1175invoke3p2s80s(MeasureScope $this$layout, Measurable measurable, long constraints) {
                            long minSize = minSizeState.getMinSize();
                            long childConstraints = Constraints.m6960copyZbe2FdA(constraints, (11 & 1) != 0 ? Constraints.m6973getMinWidthimpl(constraints) : RangesKt.coerceIn((int) (minSize >> 32), Constraints.m6973getMinWidthimpl(constraints), Constraints.m6971getMaxWidthimpl(constraints)), (11 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(constraints) : 0, (11 & 4) != 0 ? Constraints.m6972getMinHeightimpl(constraints) : RangesKt.coerceIn((int) (4294967295L & minSize), Constraints.m6972getMinHeightimpl(constraints), Constraints.m6970getMaxHeightimpl(constraints)), (11 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(constraints) : 0);
                            final Placeable measured = measurable.mo5750measureBRTryo0(childConstraints);
                            return MeasureScope.layout$default($this$layout, measured.getWidth(), measured.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope $this$layout2) {
                                    Placeable.PlacementScope.placeRelative$default($this$layout2, measured, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    $composer.updateRememberedValue(value$iv4);
                    it$iv4 = value$iv4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifierLayout = LayoutModifierKt.layout(companion, (Function3) it$iv4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer.endReplaceGroup();
                return modifierLayout;
            }
        }, 1, null);
    }
}
