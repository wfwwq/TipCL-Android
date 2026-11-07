package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.profileinstaller.ProfileVerifier;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", TerracottaVpnService.EXTRA_TEXT, "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TypographyKt.getDefaultTextStyle();
        }
    });

    /* renamed from: Text--4IGK_g, reason: not valid java name */
    public static final void m1864Text4IGK_g(final String text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, int minLines, Function1<? super TextLayoutResult, Unit> function1, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int i) {
        String str;
        Modifier modifier2;
        int i2;
        long color2;
        long fontSize2;
        final FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        int $dirty;
        int $dirty1;
        int i3;
        int i4;
        int i5;
        int $dirty12;
        int $dirty13;
        int $dirty2;
        Composer $composer2;
        final TextAlign textAlign2;
        final int overflow2;
        final boolean softWrap2;
        final int maxLines2;
        final int minLines2;
        final Function1 onTextLayout;
        final TextStyle style2;
        final long color3;
        final long fontSize3;
        final Modifier modifier3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long letterSpacing2;
        final TextDecoration textDecoration2;
        final long lineHeight2;
        int overflow3;
        boolean softWrap3;
        int minLines3;
        Function1 onTextLayout2;
        TextDecoration textDecoration3;
        FontStyle fontStyle3;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long letterSpacing3;
        long lineHeight3;
        TextStyle style3;
        long fontSize4;
        final long overrideColorOrUnspecified;
        Composer $composer3 = $composer.startRestartGroup(1028090691);
        ComposerKt.sourceInformation($composer3, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)128@6955L7,129@7009L7,158@7912L30,139@7268L680:Text.kt#jmzs0o");
        int $dirty3 = $changed;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
            str = text;
        } else if (($changed & 6) == 0) {
            str = text;
            $dirty3 |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = text;
        }
        int i6 = i & 2;
        if (i6 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty3 |= 384;
            i2 = i6;
            color2 = color;
        } else if (($changed & 384) == 0) {
            i2 = i6;
            color2 = color;
            $dirty3 |= $composer3.changed(color2) ? 256 : 128;
        } else {
            i2 = i6;
            color2 = color;
        }
        int i8 = i & 8;
        if (i8 != 0) {
            $dirty3 |= 3072;
            fontSize2 = fontSize;
        } else if (($changed & 3072) == 0) {
            fontSize2 = fontSize;
            $dirty3 |= $composer3.changed(fontSize2) ? 2048 : 1024;
        } else {
            fontSize2 = fontSize;
        }
        int i9 = i & 16;
        if (i9 != 0) {
            $dirty3 |= 24576;
            fontStyle2 = fontStyle;
        } else if (($changed & 24576) == 0) {
            fontStyle2 = fontStyle;
            $dirty3 |= $composer3.changed(fontStyle2) ? 16384 : 8192;
        } else {
            fontStyle2 = fontStyle;
        }
        int i10 = i & 32;
        if (i10 != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            fontWeight2 = fontWeight;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            fontWeight2 = fontWeight;
            $dirty3 |= $composer3.changed(fontWeight2) ? 131072 : 65536;
        } else {
            fontWeight2 = fontWeight;
        }
        int i11 = i & 64;
        if (i11 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            fontFamily2 = fontFamily;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            fontFamily2 = fontFamily;
            $dirty3 |= $composer3.changed(fontFamily2) ? 1048576 : 524288;
        } else {
            fontFamily2 = fontFamily;
        }
        int $dirty4 = i & 128;
        if ($dirty4 != 0) {
            $dirty = $dirty3 | User32.WS_CAPTION;
            $dirty1 = $changed1;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty1 = $changed1;
            $dirty = $dirty3 | ($composer3.changed(letterSpacing) ? 8388608 : 4194304);
        } else {
            $dirty = $dirty3;
            $dirty1 = $changed1;
        }
        int i12 = i & 256;
        if (i12 != 0) {
            $dirty |= 100663296;
            i3 = i12;
        } else if (($changed & 100663296) == 0) {
            i3 = i12;
            $dirty |= $composer3.changed(textDecoration) ? 67108864 : 33554432;
        } else {
            i3 = i12;
        }
        int i13 = i & 512;
        if (i13 != 0) {
            $dirty |= LZMA2Options.DICT_SIZE_MAX;
            i4 = i13;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i4 = i13;
            $dirty |= $composer3.changed(textAlign) ? 536870912 : 268435456;
        } else {
            i4 = i13;
        }
        int $dirty5 = $dirty;
        int i14 = i & 1024;
        if (i14 != 0) {
            i5 = i14;
            $dirty1 |= 6;
        } else {
            int $dirty14 = $changed1 & 6;
            if ($dirty14 == 0) {
                i5 = i14;
                $dirty1 |= $composer3.changed(lineHeight) ? 4 : 2;
            } else {
                i5 = i14;
            }
        }
        int $dirty15 = i & 2048;
        if ($dirty15 != 0) {
            $dirty1 |= 48;
        } else if (($changed1 & 48) == 0) {
            $dirty1 |= $composer3.changed(overflow) ? 32 : 16;
        }
        int $dirty16 = $dirty1;
        int i15 = i & 4096;
        if (i15 != 0) {
            $dirty12 = $dirty16 | 384;
        } else {
            int $dirty17 = $dirty16;
            int $dirty18 = $changed1 & 384;
            if ($dirty18 == 0) {
                $dirty17 |= $composer3.changed(softWrap) ? 256 : 128;
            }
            $dirty12 = $dirty17;
        }
        int i16 = i & 8192;
        if (i16 != 0) {
            $dirty13 = $dirty12 | 3072;
        } else {
            int $dirty19 = $dirty12;
            int $dirty110 = $changed1 & 3072;
            if ($dirty110 == 0) {
                $dirty13 = $dirty19 | ($composer3.changed(maxLines) ? 2048 : 1024);
            } else {
                $dirty13 = $dirty19;
            }
        }
        int i17 = i & 16384;
        if (i17 != 0) {
            $dirty13 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty13 |= $composer3.changed(minLines) ? 16384 : 8192;
        }
        int i18 = i & 32768;
        if (i18 != 0) {
            $dirty13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty13 |= $composer3.changedInstance(function1) ? 131072 : 65536;
        }
        if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty13 |= ((i & 65536) == 0 && $composer3.changed(style)) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute((($dirty5 & 306783379) == 306783378 && (599187 & $dirty13) == 599186) ? false : true, $dirty5 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "109@5743L7");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i7 != 0) {
                    color2 = Color.INSTANCE.m4426getUnspecified0d7_KjU();
                }
                if (i8 != 0) {
                    fontSize2 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i9 != 0) {
                    fontStyle2 = null;
                }
                if (i10 != 0) {
                    fontWeight2 = null;
                }
                if (i11 != 0) {
                    fontFamily2 = null;
                }
                long letterSpacing4 = $dirty4 != 0 ? TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE() : letterSpacing;
                TextDecoration textDecoration4 = i3 != 0 ? null : textDecoration;
                textAlign2 = i4 != 0 ? null : textAlign;
                long lineHeight4 = i5 != 0 ? TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE() : lineHeight;
                overflow3 = $dirty15 != 0 ? TextOverflow.INSTANCE.m6931getClipgIe3tQ8() : overflow;
                softWrap3 = i15 != 0 ? true : softWrap;
                maxLines2 = i16 != 0 ? Integer.MAX_VALUE : maxLines;
                minLines3 = i17 != 0 ? 1 : minLines;
                onTextLayout2 = i18 != 0 ? null : function1;
                if ((i & 65536) != 0) {
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    TextDecoration textDecoration5 = textDecoration4;
                    ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer3.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    textDecoration3 = textDecoration5;
                    $dirty13 &= -3670017;
                    fontStyle3 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                    letterSpacing3 = letterSpacing4;
                    lineHeight3 = lineHeight4;
                    style3 = (TextStyle) objConsume;
                } else {
                    textDecoration3 = textDecoration4;
                    fontStyle3 = fontStyle2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                    letterSpacing3 = letterSpacing4;
                    lineHeight3 = lineHeight4;
                    style3 = style;
                    fontSize4 = fontSize2;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 65536) != 0) {
                    letterSpacing3 = letterSpacing;
                    textDecoration3 = textDecoration;
                    textAlign2 = textAlign;
                    lineHeight3 = lineHeight;
                    overflow3 = overflow;
                    softWrap3 = softWrap;
                    maxLines2 = maxLines;
                    minLines3 = minLines;
                    onTextLayout2 = function1;
                    style3 = style;
                    $dirty13 = (-3670017) & $dirty13;
                    fontStyle3 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                } else {
                    letterSpacing3 = letterSpacing;
                    textDecoration3 = textDecoration;
                    textAlign2 = textAlign;
                    lineHeight3 = lineHeight;
                    overflow3 = overflow;
                    softWrap3 = softWrap;
                    maxLines2 = maxLines;
                    minLines3 = minLines;
                    onTextLayout2 = function1;
                    style3 = style;
                    fontStyle3 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028090691, $dirty5, $dirty13, "androidx.compose.material.Text (Text.kt:110)");
            }
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            long localContentColor2 = ((Color) objConsume2).m4400unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume3 = $composer3.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            float localContentAlpha2 = ((Number) objConsume3).floatValue();
            long $this$isSpecified$iv = color2;
            if ($this$isSpecified$iv != 16) {
                overrideColorOrUnspecified = color2;
            } else {
                long $this$isSpecified$iv2 = style3.m6489getColor0d7_KjU();
                overrideColorOrUnspecified = $this$isSpecified$iv2 != 16 ? style3.m6489getColor0d7_KjU() : Color.m4388copywmQWz5c(localContentColor2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(localContentColor2) : localContentAlpha2, (14 & 2) != 0 ? Color.m4396getRedimpl(localContentColor2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(localContentColor2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(localContentColor2) : 0.0f);
            }
            TextStyle textStyleM6479mergedA7vx0o$default = TextStyle.m6479mergedA7vx0o$default(style3, 0L, fontSize4, fontWeight4, fontStyle3, null, fontFamily4, null, letterSpacing3, null, null, null, 0L, textDecoration3, null, null, textAlign2 != null ? textAlign2.getValue() : TextAlign.INSTANCE.m6886getUnspecifiede0LSkKk(), 0, lineHeight3, null, null, 0, 0, null, null, 16609105, null);
            $dirty2 = $dirty5;
            ComposerKt.sourceInformationMarkerStart($composer3, 1041445489, "CC(remember):Text.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(overrideColorOrUnspecified);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (ColorProducer) new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$1$1
                    @Override // androidx.compose.ui.graphics.ColorProducer
                    /* renamed from: invoke-0d7_KjU */
                    public final long mo1661invoke0d7_KjU() {
                        return overrideColorOrUnspecified;
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            BasicTextKt.m1050BasicTextVhcvRP8(str, modifier2, textStyleM6479mergedA7vx0o$default, onTextLayout2, overflow3, softWrap3, maxLines2, minLines3, (ColorProducer) it$iv, $composer3, ($dirty2 & 14) | ($dirty2 & 112) | (($dirty13 >> 6) & GL11.GL_RENDER) | (($dirty13 << 9) & 57344) | (($dirty13 << 9) & 458752) | (($dirty13 << 9) & 3670016) | (29360128 & ($dirty13 << 9)), 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            overflow2 = overflow3;
            softWrap2 = softWrap3;
            style2 = style3;
            fontStyle2 = fontStyle3;
            letterSpacing2 = letterSpacing3;
            textDecoration2 = textDecoration3;
            lineHeight2 = lineHeight3;
            onTextLayout = onTextLayout2;
            minLines2 = minLines3;
            fontSize3 = fontSize4;
            color3 = color2;
            fontWeight3 = fontWeight4;
            fontFamily3 = fontFamily4;
        } else {
            $dirty2 = $dirty5;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            textAlign2 = textAlign;
            overflow2 = overflow;
            softWrap2 = softWrap;
            maxLines2 = maxLines;
            minLines2 = minLines;
            onTextLayout = function1;
            style2 = style;
            color3 = color2;
            fontSize3 = fontSize2;
            modifier3 = modifier2;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily2;
            letterSpacing2 = letterSpacing;
            textDecoration2 = textDecoration;
            lineHeight2 = lineHeight;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i19) {
                    TextKt.m1864Text4IGK_g(text, modifier3, color3, fontSize3, fontStyle2, fontWeight3, fontFamily3, letterSpacing2, textDecoration2, textAlign2, lineHeight2, overflow2, softWrap2, maxLines2, minLines2, onTextLayout, style2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    public static final /* synthetic */ void m1866TextfLXpl1I(final String text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Function1 onTextLayout, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        int i2;
        long color2;
        long fontSize2;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        int $dirty;
        int $dirty1;
        int i3;
        int i4;
        int $dirty12;
        int i5;
        boolean softWrap2;
        int $dirty13;
        Composer $composer2;
        final int overflow2;
        final int maxLines2;
        final Function1 onTextLayout2;
        final TextStyle style2;
        final boolean softWrap3;
        final FontStyle fontStyle3;
        final long color3;
        final long fontSize3;
        final Modifier modifier3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily2;
        final long letterSpacing2;
        final TextDecoration textDecoration2;
        final TextAlign textAlign2;
        final long lineHeight2;
        FontFamily fontFamily3;
        long letterSpacing3;
        TextDecoration textDecoration3;
        TextAlign textAlign3;
        long lineHeight3;
        int overflow3;
        int maxLines3;
        TextKt$Text$3 onTextLayout3;
        TextStyle style3;
        int maxLines4;
        int overflow4;
        boolean softWrap4;
        long color4;
        TextAlign textAlign4;
        FontStyle fontStyle4;
        long fontSize4;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        TextDecoration textDecoration4;
        Function1 onTextLayout4;
        Modifier modifier4;
        long letterSpacing4;
        long letterSpacing5;
        Composer $composer3 = $composer.startRestartGroup(-366126944);
        ComposerKt.sourceInformation($composer3, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)185@8744L322:Text.kt#jmzs0o");
        int $dirty2 = $changed;
        if ((i & 1) != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(text) ? 4 : 2;
        }
        int i6 = i & 2;
        if (i6 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty2 |= 384;
            i2 = i6;
            color2 = color;
        } else if (($changed & 384) == 0) {
            i2 = i6;
            color2 = color;
            $dirty2 |= $composer3.changed(color2) ? 256 : 128;
        } else {
            i2 = i6;
            color2 = color;
        }
        int i8 = i & 8;
        if (i8 != 0) {
            $dirty2 |= 3072;
            fontSize2 = fontSize;
        } else if (($changed & 3072) == 0) {
            fontSize2 = fontSize;
            $dirty2 |= $composer3.changed(fontSize2) ? 2048 : 1024;
        } else {
            fontSize2 = fontSize;
        }
        int i9 = i & 16;
        if (i9 != 0) {
            $dirty2 |= 24576;
            fontStyle2 = fontStyle;
        } else if (($changed & 24576) == 0) {
            fontStyle2 = fontStyle;
            $dirty2 |= $composer3.changed(fontStyle2) ? 16384 : 8192;
        } else {
            fontStyle2 = fontStyle;
        }
        int i10 = i & 32;
        if (i10 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            fontWeight2 = fontWeight;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            fontWeight2 = fontWeight;
            $dirty2 |= $composer3.changed(fontWeight2) ? 131072 : 65536;
        } else {
            fontWeight2 = fontWeight;
        }
        int i11 = i & 64;
        if (i11 != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty2 |= $composer3.changed(fontFamily) ? 1048576 : 524288;
        }
        int $dirty3 = i & 128;
        if ($dirty3 != 0) {
            $dirty = $dirty2 | User32.WS_CAPTION;
            $dirty1 = $changed1;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty1 = $changed1;
            $dirty = $dirty2 | ($composer3.changed(letterSpacing) ? 8388608 : 4194304);
        } else {
            $dirty = $dirty2;
            $dirty1 = $changed1;
        }
        int i12 = i & 256;
        if (i12 != 0) {
            $dirty |= 100663296;
            i3 = i12;
        } else if (($changed & 100663296) == 0) {
            i3 = i12;
            $dirty |= $composer3.changed(textDecoration) ? 67108864 : 33554432;
        } else {
            i3 = i12;
        }
        int i13 = i & 512;
        if (i13 != 0) {
            $dirty |= LZMA2Options.DICT_SIZE_MAX;
            i4 = i13;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i4 = i13;
            $dirty |= $composer3.changed(textAlign) ? 536870912 : 268435456;
        } else {
            i4 = i13;
        }
        int $dirty4 = $dirty;
        int $dirty14 = i & 1024;
        if ($dirty14 != 0) {
            $dirty12 = $dirty1 | 6;
        } else if (($changed1 & 6) == 0) {
            $dirty12 = $dirty1 | ($composer3.changed(lineHeight) ? 4 : 2);
        } else {
            $dirty12 = $dirty1;
        }
        int i14 = i & 2048;
        if (i14 != 0) {
            $dirty12 |= 48;
            i5 = i14;
        } else if (($changed1 & 48) == 0) {
            i5 = i14;
            $dirty12 |= $composer3.changed(overflow) ? 32 : 16;
        } else {
            i5 = i14;
        }
        int $dirty15 = $dirty12;
        int i15 = i & 4096;
        if (i15 != 0) {
            $dirty15 |= 384;
            softWrap2 = softWrap;
        } else if (($changed1 & 384) == 0) {
            softWrap2 = softWrap;
            $dirty15 |= $composer3.changed(softWrap2) ? 256 : 128;
        } else {
            softWrap2 = softWrap;
        }
        int i16 = i & 8192;
        if (i16 != 0) {
            $dirty13 = $dirty15 | 3072;
        } else {
            int $dirty16 = $dirty15;
            int $dirty17 = $changed1 & 3072;
            if ($dirty17 == 0) {
                $dirty13 = $dirty16 | ($composer3.changed(maxLines) ? 2048 : 1024);
            } else {
                $dirty13 = $dirty16;
            }
        }
        int i17 = i & 16384;
        if (i17 != 0) {
            $dirty13 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty13 |= $composer3.changedInstance(onTextLayout) ? 16384 : 8192;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty13 |= ((i & 32768) == 0 && $composer3.changed(style)) ? 131072 : 65536;
        }
        if ($composer3.shouldExecute((($dirty4 & 306783379) == 306783378 && (74899 & $dirty13) == 74898) ? false : true, $dirty4 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "183@8728L7");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i7 != 0) {
                    color2 = Color.INSTANCE.m4426getUnspecified0d7_KjU();
                }
                if (i8 != 0) {
                    fontSize2 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i9 != 0) {
                    fontStyle2 = null;
                }
                if (i10 != 0) {
                    fontWeight2 = null;
                }
                if (i11 == 0) {
                    fontFamily3 = fontFamily;
                } else {
                    fontFamily3 = null;
                }
                if ($dirty3 == 0) {
                    letterSpacing3 = letterSpacing;
                } else {
                    letterSpacing3 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i3 == 0) {
                    textDecoration3 = textDecoration;
                } else {
                    textDecoration3 = null;
                }
                if (i4 == 0) {
                    textAlign3 = textAlign;
                } else {
                    textAlign3 = null;
                }
                if ($dirty14 == 0) {
                    lineHeight3 = lineHeight;
                } else {
                    lineHeight3 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i5 == 0) {
                    overflow3 = overflow;
                } else {
                    overflow3 = TextOverflow.INSTANCE.m6931getClipgIe3tQ8();
                }
                if (i15 != 0) {
                    softWrap2 = true;
                }
                if (i16 == 0) {
                    maxLines3 = maxLines;
                } else {
                    maxLines3 = Integer.MAX_VALUE;
                }
                if (i17 == 0) {
                    onTextLayout3 = onTextLayout;
                } else {
                    onTextLayout3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult it) {
                        }
                    };
                }
                if ((i & 32768) == 0) {
                    style3 = style;
                    maxLines4 = maxLines3;
                    overflow4 = overflow3;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    textAlign4 = textAlign3;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily3;
                    textDecoration4 = textDecoration3;
                    onTextLayout4 = onTextLayout3;
                    modifier4 = modifier2;
                    letterSpacing4 = letterSpacing3;
                    letterSpacing5 = lineHeight3;
                } else {
                    FontFamily fontFamily5 = fontFamily3;
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    TextDecoration textDecoration5 = textDecoration3;
                    ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer3.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    style3 = (TextStyle) objConsume;
                    $dirty13 &= -458753;
                    maxLines4 = maxLines3;
                    overflow4 = overflow3;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    textAlign4 = textAlign3;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily5;
                    textDecoration4 = textDecoration5;
                    onTextLayout4 = onTextLayout3;
                    modifier4 = modifier2;
                    letterSpacing4 = letterSpacing3;
                    letterSpacing5 = lineHeight3;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 32768) != 0) {
                    textAlign4 = textAlign;
                    letterSpacing5 = lineHeight;
                    overflow4 = overflow;
                    maxLines4 = maxLines;
                    onTextLayout4 = onTextLayout;
                    style3 = style;
                    $dirty13 = (-458753) & $dirty13;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    modifier4 = modifier2;
                    letterSpacing4 = letterSpacing;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily;
                    textDecoration4 = textDecoration;
                } else {
                    textAlign4 = textAlign;
                    letterSpacing5 = lineHeight;
                    overflow4 = overflow;
                    maxLines4 = maxLines;
                    onTextLayout4 = onTextLayout;
                    style3 = style;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    modifier4 = modifier2;
                    letterSpacing4 = letterSpacing;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily;
                    textDecoration4 = textDecoration;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366126944, $dirty4, $dirty13, "androidx.compose.material.Text (Text.kt:184)");
            }
            $composer2 = $composer3;
            m1864Text4IGK_g(text, modifier4, color4, fontSize4, fontStyle4, fontWeight4, fontFamily4, letterSpacing4, textDecoration4, textAlign4, letterSpacing5, overflow4, softWrap4, maxLines4, 1, (Function1<? super TextLayoutResult, Unit>) onTextLayout4, style3, $composer2, ($dirty4 & 14) | ($dirty4 & 112) | ($dirty4 & User32.WM_PENWINFIRST) | ($dirty4 & GL11.GL_RENDER) | (57344 & $dirty4) | (458752 & $dirty4) | (3670016 & $dirty4) | (29360128 & $dirty4) | (234881024 & $dirty4) | (1879048192 & $dirty4), ($dirty13 & 14) | 24576 | ($dirty13 & 112) | ($dirty13 & User32.WM_PENWINFIRST) | ($dirty13 & GL11.GL_RENDER) | (($dirty13 << 3) & 458752) | (($dirty13 << 3) & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            color3 = color4;
            fontSize3 = fontSize4;
            fontStyle3 = fontStyle4;
            fontWeight3 = fontWeight4;
            fontFamily2 = fontFamily4;
            letterSpacing2 = letterSpacing4;
            textDecoration2 = textDecoration4;
            textAlign2 = textAlign4;
            lineHeight2 = letterSpacing5;
            overflow2 = overflow4;
            softWrap3 = softWrap4;
            maxLines2 = maxLines4;
            onTextLayout2 = onTextLayout4;
            style2 = style3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            overflow2 = overflow;
            maxLines2 = maxLines;
            onTextLayout2 = onTextLayout;
            style2 = style;
            softWrap3 = softWrap2;
            fontStyle3 = fontStyle2;
            color3 = color2;
            fontSize3 = fontSize2;
            modifier3 = modifier2;
            fontWeight3 = fontWeight2;
            fontFamily2 = fontFamily;
            letterSpacing2 = letterSpacing;
            textDecoration2 = textDecoration;
            textAlign2 = textAlign;
            lineHeight2 = lineHeight;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i18) {
                    TextKt.m1866TextfLXpl1I(text, modifier3, color3, fontSize3, fontStyle3, fontWeight3, fontFamily2, letterSpacing2, textDecoration2, textAlign2, lineHeight2, overflow2, softWrap3, maxLines2, onTextLayout2, style2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    public static final void m1865TextIbK3jfQ(final AnnotatedString text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, int minLines, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int i) {
        AnnotatedString annotatedString;
        Modifier modifier2;
        int i2;
        long color2;
        long fontSize2;
        final FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        int $dirty;
        int $dirty1;
        int i3;
        int i4;
        int i5;
        int $dirty12;
        int $dirty13;
        int $dirty2;
        Composer $composer2;
        final TextAlign textAlign2;
        final int overflow2;
        final boolean softWrap2;
        final int maxLines2;
        final int minLines2;
        final Map inlineContent;
        final Function1 onTextLayout;
        final TextStyle style2;
        final long color3;
        final long fontSize3;
        final Modifier modifier3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long letterSpacing2;
        final TextDecoration textDecoration2;
        final long lineHeight2;
        TextAlign textAlign3;
        int overflow3;
        boolean softWrap3;
        int minLines3;
        Map inlineContent2;
        long letterSpacing3;
        FontStyle fontStyle3;
        long fontSize4;
        TextDecoration textDecoration3;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long lineHeight3;
        TextStyle style3;
        final long overrideColorOrUnspecified;
        Composer $composer3 = $composer.startRestartGroup(744129681);
        ComposerKt.sourceInformation($composer3, "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)301@14827L7,302@14881L7,332@15816L30,312@15133L719:Text.kt#jmzs0o");
        int $dirty3 = $changed;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
            annotatedString = text;
        } else if (($changed & 6) == 0) {
            annotatedString = text;
            $dirty3 |= $composer3.changed(annotatedString) ? 4 : 2;
        } else {
            annotatedString = text;
        }
        int i6 = i & 2;
        if (i6 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty3 |= 384;
            i2 = i6;
            color2 = color;
        } else if (($changed & 384) == 0) {
            i2 = i6;
            color2 = color;
            $dirty3 |= $composer3.changed(color2) ? 256 : 128;
        } else {
            i2 = i6;
            color2 = color;
        }
        int i8 = i & 8;
        if (i8 != 0) {
            $dirty3 |= 3072;
            fontSize2 = fontSize;
        } else if (($changed & 3072) == 0) {
            fontSize2 = fontSize;
            $dirty3 |= $composer3.changed(fontSize2) ? 2048 : 1024;
        } else {
            fontSize2 = fontSize;
        }
        int i9 = i & 16;
        if (i9 != 0) {
            $dirty3 |= 24576;
            fontStyle2 = fontStyle;
        } else if (($changed & 24576) == 0) {
            fontStyle2 = fontStyle;
            $dirty3 |= $composer3.changed(fontStyle2) ? 16384 : 8192;
        } else {
            fontStyle2 = fontStyle;
        }
        int i10 = i & 32;
        if (i10 != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            fontWeight2 = fontWeight;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            fontWeight2 = fontWeight;
            $dirty3 |= $composer3.changed(fontWeight2) ? 131072 : 65536;
        } else {
            fontWeight2 = fontWeight;
        }
        int i11 = i & 64;
        if (i11 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            fontFamily2 = fontFamily;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            fontFamily2 = fontFamily;
            $dirty3 |= $composer3.changed(fontFamily2) ? 1048576 : 524288;
        } else {
            fontFamily2 = fontFamily;
        }
        int $dirty4 = i & 128;
        if ($dirty4 != 0) {
            $dirty = $dirty3 | User32.WS_CAPTION;
            $dirty1 = $changed1;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty1 = $changed1;
            $dirty = $dirty3 | ($composer3.changed(letterSpacing) ? 8388608 : 4194304);
        } else {
            $dirty = $dirty3;
            $dirty1 = $changed1;
        }
        int i12 = i & 256;
        if (i12 != 0) {
            $dirty |= 100663296;
            i3 = i12;
        } else if (($changed & 100663296) == 0) {
            i3 = i12;
            $dirty |= $composer3.changed(textDecoration) ? 67108864 : 33554432;
        } else {
            i3 = i12;
        }
        int i13 = i & 512;
        if (i13 != 0) {
            $dirty |= LZMA2Options.DICT_SIZE_MAX;
            i4 = i13;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i4 = i13;
            $dirty |= $composer3.changed(textAlign) ? 536870912 : 268435456;
        } else {
            i4 = i13;
        }
        int $dirty5 = $dirty;
        int i14 = i & 1024;
        if (i14 != 0) {
            i5 = i14;
            $dirty1 |= 6;
        } else {
            int $dirty14 = $changed1 & 6;
            if ($dirty14 == 0) {
                i5 = i14;
                $dirty1 |= $composer3.changed(lineHeight) ? 4 : 2;
            } else {
                i5 = i14;
            }
        }
        int $dirty15 = i & 2048;
        if ($dirty15 != 0) {
            $dirty1 |= 48;
        } else if (($changed1 & 48) == 0) {
            $dirty1 |= $composer3.changed(overflow) ? 32 : 16;
        }
        int $dirty16 = $dirty1;
        int i15 = i & 4096;
        if (i15 != 0) {
            $dirty12 = $dirty16 | 384;
        } else {
            int $dirty17 = $dirty16;
            int $dirty18 = $changed1 & 384;
            if ($dirty18 == 0) {
                $dirty17 |= $composer3.changed(softWrap) ? 256 : 128;
            }
            $dirty12 = $dirty17;
        }
        int i16 = i & 8192;
        if (i16 != 0) {
            $dirty13 = $dirty12 | 3072;
        } else {
            int $dirty19 = $dirty12;
            int $dirty110 = $changed1 & 3072;
            if ($dirty110 == 0) {
                $dirty13 = $dirty19 | ($composer3.changed(maxLines) ? 2048 : 1024);
            } else {
                $dirty13 = $dirty19;
            }
        }
        int i17 = i & 16384;
        if (i17 != 0) {
            $dirty13 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty13 |= $composer3.changed(minLines) ? 16384 : 8192;
        }
        int i18 = i & 32768;
        if (i18 != 0) {
            $dirty13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty13 |= $composer3.changedInstance(map) ? 131072 : 65536;
        }
        int i19 = i & 65536;
        if (i19 != 0) {
            $dirty13 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty13 |= $composer3.changedInstance(function1) ? 1048576 : 524288;
        }
        if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty13 |= ((i & 131072) == 0 && $composer3.changed(style)) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute((($dirty5 & 306783379) == 306783378 && (4793491 & $dirty13) == 4793490) ? false : true, $dirty5 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "282@13615L7");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i7 != 0) {
                    color2 = Color.INSTANCE.m4426getUnspecified0d7_KjU();
                }
                if (i8 != 0) {
                    fontSize2 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i9 != 0) {
                    fontStyle2 = null;
                }
                if (i10 != 0) {
                    fontWeight2 = null;
                }
                if (i11 != 0) {
                    fontFamily2 = null;
                }
                long letterSpacing4 = $dirty4 != 0 ? TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE() : letterSpacing;
                TextDecoration textDecoration4 = i3 != 0 ? null : textDecoration;
                textAlign3 = i4 != 0 ? null : textAlign;
                long lineHeight4 = i5 != 0 ? TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE() : lineHeight;
                overflow3 = $dirty15 != 0 ? TextOverflow.INSTANCE.m6931getClipgIe3tQ8() : overflow;
                softWrap3 = i15 != 0 ? true : softWrap;
                maxLines2 = i16 != 0 ? Integer.MAX_VALUE : maxLines;
                minLines3 = i17 != 0 ? 1 : minLines;
                inlineContent2 = i18 != 0 ? MapsKt.emptyMap() : map;
                onTextLayout = i19 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$5
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult it) {
                    }
                } : function1;
                if ((i & 131072) != 0) {
                    long letterSpacing5 = letterSpacing4;
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer3.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    letterSpacing3 = letterSpacing5;
                    $dirty13 &= -29360129;
                    fontStyle3 = fontStyle2;
                    fontSize4 = fontSize2;
                    textDecoration3 = textDecoration4;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                    lineHeight3 = lineHeight4;
                    style3 = (TextStyle) objConsume;
                } else {
                    letterSpacing3 = letterSpacing4;
                    fontStyle3 = fontStyle2;
                    fontSize4 = fontSize2;
                    textDecoration3 = textDecoration4;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                    lineHeight3 = lineHeight4;
                    style3 = style;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 131072) != 0) {
                    letterSpacing3 = letterSpacing;
                    textDecoration3 = textDecoration;
                    textAlign3 = textAlign;
                    lineHeight3 = lineHeight;
                    overflow3 = overflow;
                    softWrap3 = softWrap;
                    maxLines2 = maxLines;
                    minLines3 = minLines;
                    inlineContent2 = map;
                    onTextLayout = function1;
                    style3 = style;
                    $dirty13 = (-29360129) & $dirty13;
                    fontStyle3 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                } else {
                    letterSpacing3 = letterSpacing;
                    textDecoration3 = textDecoration;
                    textAlign3 = textAlign;
                    lineHeight3 = lineHeight;
                    overflow3 = overflow;
                    softWrap3 = softWrap;
                    maxLines2 = maxLines;
                    minLines3 = minLines;
                    inlineContent2 = map;
                    onTextLayout = function1;
                    style3 = style;
                    fontStyle3 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily2;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(744129681, $dirty5, $dirty13, "androidx.compose.material.Text (Text.kt:283)");
            }
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            long localContentColor2 = ((Color) objConsume2).m4400unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume3 = $composer3.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            float localContentAlpha2 = ((Number) objConsume3).floatValue();
            long $this$isSpecified$iv = color2;
            if ($this$isSpecified$iv != 16) {
                overrideColorOrUnspecified = color2;
            } else {
                long $this$isSpecified$iv2 = style3.m6489getColor0d7_KjU();
                overrideColorOrUnspecified = $this$isSpecified$iv2 != 16 ? style3.m6489getColor0d7_KjU() : Color.m4388copywmQWz5c(localContentColor2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(localContentColor2) : localContentAlpha2, (14 & 2) != 0 ? Color.m4396getRedimpl(localContentColor2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(localContentColor2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(localContentColor2) : 0.0f);
            }
            TextStyle textStyleM6479mergedA7vx0o$default = TextStyle.m6479mergedA7vx0o$default(style3, 0L, fontSize4, fontWeight4, fontStyle3, null, fontFamily4, null, letterSpacing3, null, null, null, 0L, textDecoration3, null, null, textAlign3 != null ? textAlign3.getValue() : TextAlign.INSTANCE.m6886getUnspecifiede0LSkKk(), 0, lineHeight3, null, null, 0, 0, null, null, 16609105, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1041698417, "CC(remember):Text.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(overrideColorOrUnspecified);
            $dirty2 = $dirty5;
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (ColorProducer) new ColorProducer() { // from class: androidx.compose.material.TextKt$Text$6$1
                    @Override // androidx.compose.ui.graphics.ColorProducer
                    /* renamed from: invoke-0d7_KjU */
                    public final long mo1661invoke0d7_KjU() {
                        return overrideColorOrUnspecified;
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            BasicTextKt.m1047BasicTextRWo7tUw(annotatedString, modifier2, textStyleM6479mergedA7vx0o$default, onTextLayout, overflow3, softWrap3, maxLines2, minLines3, inlineContent2, (ColorProducer) it$iv, $composer3, ($dirty2 & 14) | ($dirty2 & 112) | (($dirty13 >> 9) & GL11.GL_RENDER) | (($dirty13 << 9) & 57344) | (($dirty13 << 9) & 458752) | (($dirty13 << 9) & 3670016) | (($dirty13 << 9) & 29360128) | (234881024 & ($dirty13 << 9)), 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            color3 = color2;
            modifier3 = modifier2;
            textAlign2 = textAlign3;
            overflow2 = overflow3;
            softWrap2 = softWrap3;
            style2 = style3;
            fontWeight3 = fontWeight4;
            fontStyle2 = fontStyle3;
            fontFamily3 = fontFamily4;
            letterSpacing2 = letterSpacing3;
            textDecoration2 = textDecoration3;
            lineHeight2 = lineHeight3;
            inlineContent = inlineContent2;
            minLines2 = minLines3;
            fontSize3 = fontSize4;
        } else {
            $dirty2 = $dirty5;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            textAlign2 = textAlign;
            overflow2 = overflow;
            softWrap2 = softWrap;
            maxLines2 = maxLines;
            minLines2 = minLines;
            inlineContent = map;
            onTextLayout = function1;
            style2 = style;
            color3 = color2;
            fontSize3 = fontSize2;
            modifier3 = modifier2;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily2;
            letterSpacing2 = letterSpacing;
            textDecoration2 = textDecoration;
            lineHeight2 = lineHeight;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i20) {
                    TextKt.m1865TextIbK3jfQ(text, modifier3, color3, fontSize3, fontStyle2, fontWeight3, fontFamily3, letterSpacing2, textDecoration2, textAlign2, lineHeight2, overflow2, softWrap2, maxLines2, minLines2, inlineContent, onTextLayout, style2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    public static final /* synthetic */ void m1863Text4IGK_g(final AnnotatedString text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Map inlineContent, Function1 onTextLayout, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        int i2;
        long color2;
        long fontSize2;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        int $dirty;
        int $dirty1;
        int i3;
        int i4;
        int $dirty12;
        int i5;
        boolean softWrap2;
        int $dirty13;
        Composer $composer2;
        final int overflow2;
        final int maxLines2;
        final Map inlineContent2;
        final Function1 onTextLayout2;
        final TextStyle style2;
        final boolean softWrap3;
        final FontStyle fontStyle3;
        final long color3;
        final long fontSize3;
        final Modifier modifier3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily2;
        final long letterSpacing2;
        final TextDecoration textDecoration2;
        final TextAlign textAlign2;
        final long lineHeight2;
        FontFamily fontFamily3;
        long letterSpacing3;
        TextDecoration textDecoration3;
        TextAlign textAlign3;
        long lineHeight3;
        int overflow3;
        int maxLines3;
        Map inlineContent3;
        TextKt$Text$8 onTextLayout3;
        TextStyle style3;
        boolean softWrap4;
        long color4;
        Function1 onTextLayout4;
        int overflow4;
        Map inlineContent4;
        FontStyle fontStyle4;
        long fontSize4;
        Modifier modifier4;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        TextDecoration textDecoration4;
        TextAlign textAlign4;
        long letterSpacing4;
        long letterSpacing5;
        int maxLines4;
        Composer $composer3 = $composer.startRestartGroup(-422393234);
        ComposerKt.sourceInformation($composer3, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)360@16718L345:Text.kt#jmzs0o");
        int $dirty2 = $changed;
        if ((i & 1) != 0) {
            $dirty2 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(text) ? 4 : 2;
        }
        int i6 = i & 2;
        if (i6 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty2 |= 384;
            i2 = i6;
            color2 = color;
        } else if (($changed & 384) == 0) {
            i2 = i6;
            color2 = color;
            $dirty2 |= $composer3.changed(color2) ? 256 : 128;
        } else {
            i2 = i6;
            color2 = color;
        }
        int i8 = i & 8;
        if (i8 != 0) {
            $dirty2 |= 3072;
            fontSize2 = fontSize;
        } else if (($changed & 3072) == 0) {
            fontSize2 = fontSize;
            $dirty2 |= $composer3.changed(fontSize2) ? 2048 : 1024;
        } else {
            fontSize2 = fontSize;
        }
        int i9 = i & 16;
        if (i9 != 0) {
            $dirty2 |= 24576;
            fontStyle2 = fontStyle;
        } else if (($changed & 24576) == 0) {
            fontStyle2 = fontStyle;
            $dirty2 |= $composer3.changed(fontStyle2) ? 16384 : 8192;
        } else {
            fontStyle2 = fontStyle;
        }
        int i10 = i & 32;
        if (i10 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            fontWeight2 = fontWeight;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            fontWeight2 = fontWeight;
            $dirty2 |= $composer3.changed(fontWeight2) ? 131072 : 65536;
        } else {
            fontWeight2 = fontWeight;
        }
        int i11 = i & 64;
        if (i11 != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty2 |= $composer3.changed(fontFamily) ? 1048576 : 524288;
        }
        int $dirty3 = i & 128;
        if ($dirty3 != 0) {
            $dirty = $dirty2 | User32.WS_CAPTION;
            $dirty1 = $changed1;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty1 = $changed1;
            $dirty = $dirty2 | ($composer3.changed(letterSpacing) ? 8388608 : 4194304);
        } else {
            $dirty = $dirty2;
            $dirty1 = $changed1;
        }
        int i12 = i & 256;
        if (i12 != 0) {
            $dirty |= 100663296;
            i3 = i12;
        } else if (($changed & 100663296) == 0) {
            i3 = i12;
            $dirty |= $composer3.changed(textDecoration) ? 67108864 : 33554432;
        } else {
            i3 = i12;
        }
        int i13 = i & 512;
        if (i13 != 0) {
            $dirty |= LZMA2Options.DICT_SIZE_MAX;
            i4 = i13;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i4 = i13;
            $dirty |= $composer3.changed(textAlign) ? 536870912 : 268435456;
        } else {
            i4 = i13;
        }
        int $dirty4 = $dirty;
        int $dirty14 = i & 1024;
        if ($dirty14 != 0) {
            $dirty12 = $dirty1 | 6;
        } else if (($changed1 & 6) == 0) {
            $dirty12 = $dirty1 | ($composer3.changed(lineHeight) ? 4 : 2);
        } else {
            $dirty12 = $dirty1;
        }
        int i14 = i & 2048;
        if (i14 != 0) {
            $dirty12 |= 48;
            i5 = i14;
        } else if (($changed1 & 48) == 0) {
            i5 = i14;
            $dirty12 |= $composer3.changed(overflow) ? 32 : 16;
        } else {
            i5 = i14;
        }
        int $dirty15 = $dirty12;
        int i15 = i & 4096;
        if (i15 != 0) {
            $dirty15 |= 384;
            softWrap2 = softWrap;
        } else if (($changed1 & 384) == 0) {
            softWrap2 = softWrap;
            $dirty15 |= $composer3.changed(softWrap2) ? 256 : 128;
        } else {
            softWrap2 = softWrap;
        }
        int i16 = i & 8192;
        if (i16 != 0) {
            $dirty13 = $dirty15 | 3072;
        } else {
            int $dirty16 = $dirty15;
            int $dirty17 = $changed1 & 3072;
            if ($dirty17 == 0) {
                $dirty13 = $dirty16 | ($composer3.changed(maxLines) ? 2048 : 1024);
            } else {
                $dirty13 = $dirty16;
            }
        }
        int i17 = i & 16384;
        if (i17 != 0) {
            $dirty13 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty13 |= $composer3.changedInstance(inlineContent) ? 16384 : 8192;
        }
        int i18 = i & 32768;
        if (i18 != 0) {
            $dirty13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty13 |= $composer3.changedInstance(onTextLayout) ? 131072 : 65536;
        }
        if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty13 |= ((i & 65536) == 0 && $composer3.changed(style)) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute((($dirty4 & 306783379) == 306783378 && (599187 & $dirty13) == 599186) ? false : true, $dirty4 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "358@16702L7");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i7 != 0) {
                    color2 = Color.INSTANCE.m4426getUnspecified0d7_KjU();
                }
                if (i8 != 0) {
                    fontSize2 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i9 != 0) {
                    fontStyle2 = null;
                }
                if (i10 != 0) {
                    fontWeight2 = null;
                }
                if (i11 == 0) {
                    fontFamily3 = fontFamily;
                } else {
                    fontFamily3 = null;
                }
                if ($dirty3 == 0) {
                    letterSpacing3 = letterSpacing;
                } else {
                    letterSpacing3 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i3 == 0) {
                    textDecoration3 = textDecoration;
                } else {
                    textDecoration3 = null;
                }
                if (i4 == 0) {
                    textAlign3 = textAlign;
                } else {
                    textAlign3 = null;
                }
                if ($dirty14 == 0) {
                    lineHeight3 = lineHeight;
                } else {
                    lineHeight3 = TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE();
                }
                if (i5 == 0) {
                    overflow3 = overflow;
                } else {
                    overflow3 = TextOverflow.INSTANCE.m6931getClipgIe3tQ8();
                }
                if (i15 != 0) {
                    softWrap2 = true;
                }
                if (i16 == 0) {
                    maxLines3 = maxLines;
                } else {
                    maxLines3 = Integer.MAX_VALUE;
                }
                if (i17 == 0) {
                    inlineContent3 = inlineContent;
                } else {
                    inlineContent3 = MapsKt.emptyMap();
                }
                if (i18 == 0) {
                    onTextLayout3 = onTextLayout;
                } else {
                    onTextLayout3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$8
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult it) {
                        }
                    };
                }
                if ((i & 65536) == 0) {
                    style3 = style;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    onTextLayout4 = onTextLayout3;
                    overflow4 = overflow3;
                    inlineContent4 = inlineContent3;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    modifier4 = modifier2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily3;
                    textDecoration4 = textDecoration3;
                    int i19 = maxLines3;
                    textAlign4 = textAlign3;
                    letterSpacing4 = letterSpacing3;
                    letterSpacing5 = lineHeight3;
                    maxLines4 = i19;
                } else {
                    FontFamily fontFamily5 = fontFamily3;
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    TextDecoration textDecoration5 = textDecoration3;
                    ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer3.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    style3 = (TextStyle) objConsume;
                    $dirty13 &= -3670017;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    onTextLayout4 = onTextLayout3;
                    overflow4 = overflow3;
                    inlineContent4 = inlineContent3;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    modifier4 = modifier2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily5;
                    textDecoration4 = textDecoration5;
                    int i20 = maxLines3;
                    textAlign4 = textAlign3;
                    letterSpacing4 = letterSpacing3;
                    letterSpacing5 = lineHeight3;
                    maxLines4 = i20;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 65536) != 0) {
                    textAlign4 = textAlign;
                    letterSpacing5 = lineHeight;
                    overflow4 = overflow;
                    maxLines4 = maxLines;
                    inlineContent4 = inlineContent;
                    onTextLayout4 = onTextLayout;
                    style3 = style;
                    $dirty13 = (-3670017) & $dirty13;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    modifier4 = modifier2;
                    letterSpacing4 = letterSpacing;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily;
                    textDecoration4 = textDecoration;
                } else {
                    textAlign4 = textAlign;
                    letterSpacing5 = lineHeight;
                    overflow4 = overflow;
                    maxLines4 = maxLines;
                    inlineContent4 = inlineContent;
                    onTextLayout4 = onTextLayout;
                    style3 = style;
                    softWrap4 = softWrap2;
                    color4 = color2;
                    modifier4 = modifier2;
                    letterSpacing4 = letterSpacing;
                    fontStyle4 = fontStyle2;
                    fontSize4 = fontSize2;
                    fontWeight4 = fontWeight2;
                    fontFamily4 = fontFamily;
                    textDecoration4 = textDecoration;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-422393234, $dirty4, $dirty13, "androidx.compose.material.Text (Text.kt:359)");
            }
            $composer2 = $composer3;
            m1865TextIbK3jfQ(text, modifier4, color4, fontSize4, fontStyle4, fontWeight4, fontFamily4, letterSpacing4, textDecoration4, textAlign4, letterSpacing5, overflow4, softWrap4, maxLines4, 1, inlineContent4, onTextLayout4, style3, $composer2, ($dirty4 & 14) | ($dirty4 & 112) | ($dirty4 & User32.WM_PENWINFIRST) | ($dirty4 & GL11.GL_RENDER) | (57344 & $dirty4) | (458752 & $dirty4) | (3670016 & $dirty4) | (29360128 & $dirty4) | (234881024 & $dirty4) | (1879048192 & $dirty4), ($dirty13 & 14) | 24576 | ($dirty13 & 112) | ($dirty13 & User32.WM_PENWINFIRST) | ($dirty13 & GL11.GL_RENDER) | (($dirty13 << 3) & 458752) | (($dirty13 << 3) & 3670016) | (($dirty13 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            color3 = color4;
            fontSize3 = fontSize4;
            fontStyle3 = fontStyle4;
            fontWeight3 = fontWeight4;
            fontFamily2 = fontFamily4;
            letterSpacing2 = letterSpacing4;
            textDecoration2 = textDecoration4;
            textAlign2 = textAlign4;
            lineHeight2 = letterSpacing5;
            overflow2 = overflow4;
            softWrap3 = softWrap4;
            maxLines2 = maxLines4;
            inlineContent2 = inlineContent4;
            onTextLayout2 = onTextLayout4;
            style2 = style3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            overflow2 = overflow;
            maxLines2 = maxLines;
            inlineContent2 = inlineContent;
            onTextLayout2 = onTextLayout;
            style2 = style;
            softWrap3 = softWrap2;
            fontStyle3 = fontStyle2;
            color3 = color2;
            fontSize3 = fontSize2;
            modifier3 = modifier2;
            fontWeight3 = fontWeight2;
            fontFamily2 = fontFamily;
            letterSpacing2 = letterSpacing;
            textDecoration2 = textDecoration;
            textAlign2 = textAlign;
            lineHeight2 = lineHeight;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i21) {
                    TextKt.m1863Text4IGK_g(text, modifier3, color3, fontSize3, fontStyle3, fontWeight3, fontFamily2, letterSpacing2, textDecoration2, textAlign2, lineHeight2, overflow2, softWrap3, maxLines2, inlineContent2, onTextLayout2, style2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle value, final Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1772272796);
        ComposerKt.sourceInformation($composer2, "C(ProvideTextStyle)P(1)401@18018L7,402@18043L80:Text.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(value) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, $dirty, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:400)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            TextStyle mergedStyle = ((TextStyle) objConsume).merge(value);
            CompositionLocalKt.CompositionLocalProvider(LocalTextStyle.provides(mergedStyle), function2, $composer2, ProvidedValue.$stable | ($dirty & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt.ProvideTextStyle.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    TextKt.ProvideTextStyle(value, function2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }
            });
        }
    }
}
