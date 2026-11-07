package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: SecureTextField.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aô\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aô\u0001\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"DefaultObfuscationCharacter", "", "SecureTextFieldKeyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "OutlinedSecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "keyboardOptions", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "OutlinedSecureTextField-0vce7ms", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;ICLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SecureTextField", "SecureTextField-0vce7ms", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final KeyboardOptions SecureTextFieldKeyboardOptions = new KeyboardOptions(0, (Boolean) false, KeyboardType.INSTANCE.m6698getPasswordPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 121, (DefaultConstructorMarker) null);

    /* renamed from: SecureTextField-0vce7ms, reason: not valid java name */
    public static final void m1776SecureTextField0vce7ms(final TextFieldState state, Modifier modifier, boolean enabled, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, InputTransformation inputTransformation, int textObfuscationMode, char textObfuscationCharacter, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean enabled2;
        TextStyle textStyle2;
        Function2 function25;
        Function2 placeholder;
        Function2 leadingIcon;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int $dirty1;
        MutableInteractionSource interactionSource2;
        Composer $composer2;
        final boolean isError2;
        final KeyboardOptions keyboardOptions2;
        final Shape shape2;
        final TextFieldColors colors2;
        final boolean enabled3;
        final TextStyle textStyle3;
        final Function2 label;
        final Function2 placeholder2;
        final Modifier modifier3;
        final Function2 leadingIcon2;
        final Function2 trailingIcon;
        final InputTransformation inputTransformation2;
        final int textObfuscationMode2;
        final char textObfuscationCharacter2;
        final KeyboardActionHandler onKeyboardAction2;
        final MutableInteractionSource interactionSource3;
        TextStyle textStyle4;
        int $dirty;
        Function2 label2;
        Function2 trailingIcon2;
        boolean isError3;
        InputTransformation inputTransformation3;
        int textObfuscationMode3;
        char textObfuscationCharacter3;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler onKeyboardAction3;
        Shape shape3;
        int $dirty12;
        Composer $composer3;
        TextFieldColors colors3;
        int $dirty2;
        int $dirty13;
        MutableInteractionSource interactionSource4;
        int $dirty14;
        int i7;
        int i8;
        Composer $composer4 = $composer.startRestartGroup(-454549898);
        ComposerKt.sourceInformation($composer4, "C(SecureTextField)P(12,8,1,15,6,10,7,16,4,2,14:c#foundation.text.input.TextObfuscationMode,13,5,9,11)134@7753L38,141@8068L20,129@7544L1522:SecureTextField.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty15 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changed(state) ? 4 : 2;
        }
        int i9 = i & 2;
        if (i9 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer4.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 4;
        if (i10 != 0) {
            $dirty3 |= 384;
            enabled2 = enabled;
        } else if (($changed & 384) == 0) {
            enabled2 = enabled;
            $dirty3 |= $composer4.changed(enabled2) ? 256 : 128;
        } else {
            enabled2 = enabled;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                textStyle2 = textStyle;
                if ($composer4.changed(textStyle2)) {
                    i8 = 2048;
                }
                $dirty3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            i8 = 1024;
            $dirty3 |= i8;
        } else {
            textStyle2 = textStyle;
        }
        int i11 = i & 16;
        int i12 = 8192;
        if (i11 != 0) {
            $dirty3 |= 24576;
            function25 = function2;
        } else if (($changed & 24576) == 0) {
            function25 = function2;
            $dirty3 |= $composer4.changedInstance(function25) ? 16384 : 8192;
        } else {
            function25 = function2;
        }
        int i13 = i & 32;
        if (i13 != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            placeholder = function22;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            placeholder = function22;
            $dirty3 |= $composer4.changedInstance(placeholder) ? 131072 : 65536;
        } else {
            placeholder = function22;
        }
        int i14 = i & 64;
        if (i14 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            leadingIcon = function23;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            leadingIcon = function23;
            $dirty3 |= $composer4.changedInstance(leadingIcon) ? 1048576 : 524288;
        } else {
            leadingIcon = function23;
        }
        int i15 = i & 128;
        if (i15 != 0) {
            $dirty3 |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty3 |= $composer4.changedInstance(function24) ? 8388608 : 4194304;
        }
        int i16 = i & 256;
        if (i16 != 0) {
            $dirty3 |= 100663296;
            i2 = i16;
        } else if (($changed & 100663296) == 0) {
            i2 = i16;
            $dirty3 |= $composer4.changed(isError) ? 67108864 : 33554432;
        } else {
            i2 = i16;
        }
        int i17 = i & 512;
        if (i17 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i17;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i17;
            $dirty3 |= $composer4.changed(inputTransformation) ? 536870912 : 268435456;
        } else {
            i3 = i17;
        }
        if (($changed1 & 6) == 0) {
            $dirty15 |= ((i & 1024) == 0 && $composer4.changed(textObfuscationMode)) ? 4 : 2;
        }
        int i18 = i & 2048;
        if (i18 != 0) {
            $dirty15 |= 48;
            i4 = i18;
        } else if (($changed1 & 48) == 0) {
            i4 = i18;
            $dirty15 |= $composer4.changed(textObfuscationCharacter) ? 32 : 16;
        } else {
            i4 = i18;
        }
        int i19 = i & 4096;
        if (i19 != 0) {
            $dirty15 |= 384;
            i5 = i19;
        } else {
            i5 = i19;
            if (($changed1 & 384) == 0) {
                $dirty15 |= $composer4.changed(keyboardOptions) ? 256 : 128;
            }
        }
        int i20 = i & 8192;
        if (i20 != 0) {
            $dirty15 |= 3072;
            i6 = i20;
        } else {
            i6 = i20;
            if (($changed1 & 3072) == 0) {
                $dirty15 |= $composer4.changed(onKeyboardAction) ? 2048 : 1024;
            }
        }
        if (($changed1 & 24576) == 0) {
            if ((i & 16384) == 0 && $composer4.changed(shape)) {
                i12 = 16384;
            }
            $dirty15 |= i12;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32768) == 0) {
                $dirty14 = $dirty15;
                if ($composer4.changed(colors)) {
                    i7 = 131072;
                }
                $dirty1 = $dirty14 | i7;
            } else {
                $dirty14 = $dirty15;
            }
            i7 = 65536;
            $dirty1 = $dirty14 | i7;
        } else {
            $dirty1 = $dirty15;
        }
        int i21 = i & 65536;
        if (i21 != 0) {
            $dirty1 |= JNINativeInterface.JNI_VERSION_24;
            interactionSource2 = interactionSource;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            interactionSource2 = interactionSource;
            $dirty1 |= $composer4.changed(interactionSource2) ? 1048576 : 524288;
        } else {
            interactionSource2 = interactionSource;
        }
        if ($composer4.shouldExecute((($dirty3 & 306783379) == 306783378 && ($dirty1 & 599187) == 599186) ? false : true, $dirty3 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "107@6390L7,118@6993L14,119@7057L17");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                if ((i & 8) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer4.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty3 & (-7169);
                } else {
                    textStyle4 = textStyle2;
                    $dirty = $dirty3;
                }
                label2 = i11 != 0 ? null : function25;
                Function2 placeholder3 = i13 != 0 ? null : placeholder;
                Function2 leadingIcon3 = i14 != 0 ? null : leadingIcon;
                trailingIcon2 = i15 != 0 ? null : function24;
                isError3 = i2 != 0 ? false : isError;
                inputTransformation3 = i3 != 0 ? null : inputTransformation;
                if ((i & 1024) != 0) {
                    $dirty1 &= -15;
                    textObfuscationMode3 = TextObfuscationMode.INSTANCE.m1226getRevealLastTypedvTwcZD0();
                } else {
                    textObfuscationMode3 = textObfuscationMode;
                }
                textObfuscationCharacter3 = i4 != 0 ? (char) 8226 : textObfuscationCharacter;
                keyboardOptions3 = i5 != 0 ? SecureTextFieldKeyboardOptions : keyboardOptions;
                onKeyboardAction3 = i6 != 0 ? null : onKeyboardAction;
                if ((i & 16384) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer4, 6);
                    $dirty12 = $dirty1 & (-57345);
                } else {
                    shape3 = shape;
                    $dirty12 = $dirty1;
                }
                if ((i & 32768) != 0) {
                    colors3 = TextFieldDefaults.INSTANCE.m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, 48, 2097151);
                    $composer3 = $composer4;
                    $dirty12 &= -458753;
                } else {
                    $composer3 = $composer4;
                    colors3 = colors;
                }
                if (i21 != 0) {
                    interactionSource2 = null;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    $dirty2 = $dirty;
                    placeholder = placeholder3;
                    leadingIcon = leadingIcon3;
                    $dirty13 = $dirty12;
                } else {
                    interactionSource2 = interactionSource;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    $dirty2 = $dirty;
                    placeholder = placeholder3;
                    leadingIcon = leadingIcon3;
                    $dirty13 = $dirty12;
                }
            } else {
                $composer4.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty3 &= -7169;
                }
                if ((i & 1024) != 0) {
                    $dirty1 &= -15;
                }
                if ((i & 16384) != 0) {
                    $dirty1 &= -57345;
                }
                if ((i & 32768) != 0) {
                    trailingIcon2 = function24;
                    isError3 = isError;
                    inputTransformation3 = inputTransformation;
                    textObfuscationMode3 = textObfuscationMode;
                    textObfuscationCharacter3 = textObfuscationCharacter;
                    keyboardOptions3 = keyboardOptions;
                    onKeyboardAction3 = onKeyboardAction;
                    shape3 = shape;
                    $dirty13 = $dirty1 & (-458753);
                    $dirty2 = $dirty3;
                    textStyle4 = textStyle2;
                    label2 = function25;
                    $composer3 = $composer4;
                    colors3 = colors;
                } else {
                    trailingIcon2 = function24;
                    isError3 = isError;
                    inputTransformation3 = inputTransformation;
                    textObfuscationMode3 = textObfuscationMode;
                    textObfuscationCharacter3 = textObfuscationCharacter;
                    keyboardOptions3 = keyboardOptions;
                    onKeyboardAction3 = onKeyboardAction;
                    shape3 = shape;
                    $dirty2 = $dirty3;
                    textStyle4 = textStyle2;
                    label2 = function25;
                    $dirty13 = $dirty1;
                    $composer3 = $composer4;
                    colors3 = colors;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454549898, $dirty2, $dirty13, "androidx.compose.material.SecureTextField (SecureTextField.kt:121)");
            }
            if (interactionSource2 == null) {
                $composer3.startReplaceGroup(-86676725);
                ComposerKt.sourceInformation($composer3, "123@7218L39");
                ComposerKt.sourceInformationMarkerStart($composer3, -1665364009, "CC(remember):SecureTextField.kt#9igjgp");
                Composer $this$cache$iv = $composer3;
                Object it$iv = $this$cache$iv.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = InteractionSourceKt.MutableInteractionSource();
                    $this$cache$iv.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                interactionSource4 = (MutableInteractionSource) it$iv;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-1665364660);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource2;
            }
            $composer3.startReplaceGroup(-1665358914);
            ComposerKt.sourceInformation($composer3, "*125@7397L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle4.m6489getColor0d7_KjU();
            if (!($this$takeOrElse_u2dDxMtmZc$iv != 16)) {
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 6) & 14) | (($dirty13 >> 12) & 112)).getValue().m4400unboximpl();
            }
            $composer3.endReplaceGroup();
            long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
            TextStyle mergedTextStyle = textStyle4.merge(new TextStyle(textColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final TextFieldColors colors4 = colors3;
            final boolean enabled5 = enabled2;
            final boolean isError4 = isError3;
            Modifier modifierM769defaultMinSizeVpY3zN4 = SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1837indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier2, enabled5, isError4, interactionSource4, colors4, 0.0f, 0.0f, 48, null), isError4, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM());
            TextStyle textStyle5 = textStyle4;
            SolidColor solidColor = new SolidColor(colors4.cursorColor(isError4, $composer3, (($dirty2 >> 24) & 14) | (($dirty13 >> 12) & 112)).getValue().m4400unboximpl(), null);
            final Function2 placeholder4 = placeholder;
            final MutableInteractionSource interactionSource5 = interactionSource4;
            final Function2 leadingIcon4 = leadingIcon;
            final Function2 label3 = label2;
            final Function2 trailingIcon3 = trailingIcon2;
            final Shape shape4 = shape3;
            Composer $composer5 = $composer3;
            BasicSecureTextFieldKt.m1039BasicSecureTextFieldJb9bMDk(state, modifierM769defaultMinSizeVpY3zN4, enabled5, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, null, interactionSource4, solidColor, new TextFieldDecorator() { // from class: androidx.compose.material.SecureTextFieldKt$SecureTextField$1
                @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                public final void Decoration(Function2<? super Composer, ? super Integer, Unit> function26, Composer $composer6, int $changed2) {
                    $composer6.startReplaceGroup(-1548786338);
                    ComposerKt.sourceInformation($composer6, "C(Decoration)149@8465L585:SecureTextField.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1548786338, $changed2, -1, "androidx.compose.material.SecureTextField.<no name provided>.Decoration (SecureTextField.kt:149)");
                    }
                    TextFieldDefaults.INSTANCE.TextFieldDecorationBox(state.getText().toString(), function26, enabled5, true, VisualTransformation.INSTANCE.getNone(), interactionSource5, isError4, label3, placeholder4, leadingIcon4, trailingIcon3, shape4, colors4, null, $composer6, (($changed2 << 3) & 112) | 27648, 24576, 8192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    $composer6.endReplaceGroup();
                }
            }, textObfuscationMode3, textObfuscationCharacter3, $composer5, ($dirty2 & 14) | ($dirty2 & User32.WM_PENWINFIRST) | (($dirty2 >> 18) & GL11.GL_RENDER) | (($dirty13 << 9) & 458752) | (($dirty13 << 9) & 3670016), (($dirty13 << 3) & User32.WM_PENWINFIRST) | (($dirty13 << 3) & 112), 128);
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            interactionSource3 = interactionSource2;
            colors2 = colors4;
            isError2 = isError4;
            placeholder2 = placeholder;
            modifier3 = modifier2;
            leadingIcon2 = leadingIcon;
            textStyle3 = textStyle5;
            enabled3 = enabled5;
            label = label2;
            trailingIcon = trailingIcon2;
            inputTransformation2 = inputTransformation3;
            textObfuscationMode2 = textObfuscationMode3;
            textObfuscationCharacter2 = textObfuscationCharacter3;
            keyboardOptions2 = keyboardOptions3;
            onKeyboardAction2 = onKeyboardAction3;
            shape2 = shape3;
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            isError2 = isError;
            keyboardOptions2 = keyboardOptions;
            shape2 = shape;
            colors2 = colors;
            enabled3 = enabled2;
            textStyle3 = textStyle2;
            label = function25;
            placeholder2 = placeholder;
            modifier3 = modifier2;
            leadingIcon2 = leadingIcon;
            trailingIcon = function24;
            inputTransformation2 = inputTransformation;
            textObfuscationMode2 = textObfuscationMode;
            textObfuscationCharacter2 = textObfuscationCharacter;
            onKeyboardAction2 = onKeyboardAction;
            interactionSource3 = interactionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$SecureTextField$2
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

                public final void invoke(Composer composer, int i22) {
                    SecureTextFieldKt.m1776SecureTextField0vce7ms(state, modifier3, enabled3, textStyle3, label, placeholder2, leadingIcon2, trailingIcon, isError2, inputTransformation2, textObfuscationMode2, textObfuscationCharacter2, keyboardOptions2, onKeyboardAction2, shape2, colors2, interactionSource3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    /* renamed from: OutlinedSecureTextField-0vce7ms, reason: not valid java name */
    public static final void m1775OutlinedSecureTextField0vce7ms(final TextFieldState state, Modifier modifier, boolean enabled, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, InputTransformation inputTransformation, int textObfuscationMode, char textObfuscationCharacter, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean enabled2;
        TextStyle textStyle2;
        Function2 function25;
        Function2 placeholder;
        Function2 leadingIcon;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int $dirty1;
        Composer $composer2;
        final boolean isError2;
        final KeyboardOptions keyboardOptions2;
        final Shape shape2;
        final TextFieldColors colors2;
        final boolean enabled3;
        final TextStyle textStyle3;
        final Function2 label;
        final Function2 placeholder2;
        final Modifier modifier3;
        final Function2 leadingIcon2;
        final Function2 trailingIcon;
        final InputTransformation inputTransformation2;
        final int textObfuscationMode2;
        final char textObfuscationCharacter2;
        final KeyboardActionHandler onKeyboardAction2;
        final MutableInteractionSource interactionSource2;
        TextStyle textStyle4;
        int $dirty;
        Function2 label2;
        Function2 trailingIcon2;
        InputTransformation inputTransformation3;
        int textObfuscationMode3;
        char textObfuscationCharacter3;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler onKeyboardAction3;
        Shape shape3;
        int $dirty12;
        Composer $composer3;
        TextFieldColors colors3;
        MutableInteractionSource interactionSource3;
        int $dirty2;
        boolean isError3;
        int $dirty13;
        MutableInteractionSource interactionSource4;
        final MutableInteractionSource interactionSource5;
        int $dirty14;
        int i7;
        int i8;
        Composer $composer4 = $composer.startRestartGroup(-1990728840);
        ComposerKt.sourceInformation($composer4, "C(OutlinedSecureTextField)P(12,8,1,15,6,10,7,16,4,2,14:c#foundation.text.input.TextObfuscationMode,13,5,9,11)251@14680L7,269@15405L38,276@15720L20,254@14736L2135:SecureTextField.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty15 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changed(state) ? 4 : 2;
        }
        int i9 = i & 2;
        if (i9 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer4.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 4;
        if (i10 != 0) {
            $dirty3 |= 384;
            enabled2 = enabled;
        } else if (($changed & 384) == 0) {
            enabled2 = enabled;
            $dirty3 |= $composer4.changed(enabled2) ? 256 : 128;
        } else {
            enabled2 = enabled;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                textStyle2 = textStyle;
                if ($composer4.changed(textStyle2)) {
                    i8 = 2048;
                }
                $dirty3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            i8 = 1024;
            $dirty3 |= i8;
        } else {
            textStyle2 = textStyle;
        }
        int i11 = i & 16;
        int i12 = 8192;
        if (i11 != 0) {
            $dirty3 |= 24576;
            function25 = function2;
        } else if (($changed & 24576) == 0) {
            function25 = function2;
            $dirty3 |= $composer4.changedInstance(function25) ? 16384 : 8192;
        } else {
            function25 = function2;
        }
        int i13 = i & 32;
        if (i13 != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            placeholder = function22;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            placeholder = function22;
            $dirty3 |= $composer4.changedInstance(placeholder) ? 131072 : 65536;
        } else {
            placeholder = function22;
        }
        int i14 = i & 64;
        if (i14 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            leadingIcon = function23;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            leadingIcon = function23;
            $dirty3 |= $composer4.changedInstance(leadingIcon) ? 1048576 : 524288;
        } else {
            leadingIcon = function23;
        }
        int i15 = i & 128;
        if (i15 != 0) {
            $dirty3 |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty3 |= $composer4.changedInstance(function24) ? 8388608 : 4194304;
        }
        int i16 = i & 256;
        if (i16 != 0) {
            $dirty3 |= 100663296;
            i2 = i16;
        } else if (($changed & 100663296) == 0) {
            i2 = i16;
            $dirty3 |= $composer4.changed(isError) ? 67108864 : 33554432;
        } else {
            i2 = i16;
        }
        int i17 = i & 512;
        if (i17 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i17;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i17;
            $dirty3 |= $composer4.changed(inputTransformation) ? 536870912 : 268435456;
        } else {
            i3 = i17;
        }
        if (($changed1 & 6) == 0) {
            $dirty15 |= ((i & 1024) == 0 && $composer4.changed(textObfuscationMode)) ? 4 : 2;
        }
        int i18 = i & 2048;
        if (i18 != 0) {
            $dirty15 |= 48;
            i4 = i18;
        } else if (($changed1 & 48) == 0) {
            i4 = i18;
            $dirty15 |= $composer4.changed(textObfuscationCharacter) ? 32 : 16;
        } else {
            i4 = i18;
        }
        int i19 = i & 4096;
        if (i19 != 0) {
            $dirty15 |= 384;
            i5 = i19;
        } else {
            i5 = i19;
            if (($changed1 & 384) == 0) {
                $dirty15 |= $composer4.changed(keyboardOptions) ? 256 : 128;
            }
        }
        int i20 = i & 8192;
        if (i20 != 0) {
            $dirty15 |= 3072;
            i6 = i20;
        } else {
            i6 = i20;
            if (($changed1 & 3072) == 0) {
                $dirty15 |= $composer4.changed(onKeyboardAction) ? 2048 : 1024;
            }
        }
        if (($changed1 & 24576) == 0) {
            if ((i & 16384) == 0 && $composer4.changed(shape)) {
                i12 = 16384;
            }
            $dirty15 |= i12;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32768) == 0) {
                $dirty14 = $dirty15;
                if ($composer4.changed(colors)) {
                    i7 = 131072;
                }
                $dirty1 = $dirty14 | i7;
            } else {
                $dirty14 = $dirty15;
            }
            i7 = 65536;
            $dirty1 = $dirty14 | i7;
        } else {
            $dirty1 = $dirty15;
        }
        int i21 = i & 65536;
        if (i21 != 0) {
            $dirty1 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty1 |= $composer4.changed(interactionSource) ? 1048576 : 524288;
        }
        if ($composer4.shouldExecute((($dirty3 & 306783379) == 306783378 && ($dirty1 & 599187) == 599186) ? false : true, $dirty3 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "230@13526L7,241@14129L22,242@14201L25");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                if ((i & 8) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer4.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty3 & (-7169);
                } else {
                    textStyle4 = textStyle2;
                    $dirty = $dirty3;
                }
                label2 = i11 != 0 ? null : function25;
                Function2 placeholder3 = i13 != 0 ? null : placeholder;
                Function2 leadingIcon3 = i14 != 0 ? null : leadingIcon;
                trailingIcon2 = i15 != 0 ? null : function24;
                boolean isError4 = i2 != 0 ? false : isError;
                inputTransformation3 = i3 != 0 ? null : inputTransformation;
                if ((i & 1024) != 0) {
                    $dirty1 &= -15;
                    textObfuscationMode3 = TextObfuscationMode.INSTANCE.m1226getRevealLastTypedvTwcZD0();
                } else {
                    textObfuscationMode3 = textObfuscationMode;
                }
                textObfuscationCharacter3 = i4 != 0 ? (char) 8226 : textObfuscationCharacter;
                keyboardOptions3 = i5 != 0 ? SecureTextFieldKeyboardOptions : keyboardOptions;
                onKeyboardAction3 = i6 != 0 ? null : onKeyboardAction;
                if ((i & 16384) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer4, 6);
                    $dirty12 = $dirty1 & (-57345);
                } else {
                    shape3 = shape;
                    $dirty12 = $dirty1;
                }
                if ((i & 32768) != 0) {
                    colors3 = TextFieldDefaults.INSTANCE.m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, 48, 2097151);
                    $composer3 = $composer4;
                    $dirty12 &= -458753;
                } else {
                    $composer3 = $composer4;
                    colors3 = colors;
                }
                if (i21 != 0) {
                    interactionSource3 = null;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    textStyle2 = textStyle4;
                    $dirty2 = $dirty;
                    placeholder = placeholder3;
                    leadingIcon = leadingIcon3;
                    isError3 = isError4;
                    $dirty13 = $dirty12;
                } else {
                    interactionSource3 = interactionSource;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    textStyle2 = textStyle4;
                    $dirty2 = $dirty;
                    placeholder = placeholder3;
                    leadingIcon = leadingIcon3;
                    isError3 = isError4;
                    $dirty13 = $dirty12;
                }
            } else {
                $composer4.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty3 &= -7169;
                }
                if ((i & 1024) != 0) {
                    $dirty1 &= -15;
                }
                if ((i & 16384) != 0) {
                    $dirty1 &= -57345;
                }
                if ((i & 32768) != 0) {
                    trailingIcon2 = function24;
                    inputTransformation3 = inputTransformation;
                    textObfuscationMode3 = textObfuscationMode;
                    textObfuscationCharacter3 = textObfuscationCharacter;
                    keyboardOptions3 = keyboardOptions;
                    onKeyboardAction3 = onKeyboardAction;
                    shape3 = shape;
                    interactionSource3 = interactionSource;
                    $composer3 = $composer4;
                    $dirty2 = $dirty3;
                    label2 = function25;
                    colors3 = colors;
                    $dirty13 = $dirty1 & (-458753);
                    isError3 = isError;
                } else {
                    trailingIcon2 = function24;
                    isError3 = isError;
                    inputTransformation3 = inputTransformation;
                    textObfuscationMode3 = textObfuscationMode;
                    textObfuscationCharacter3 = textObfuscationCharacter;
                    keyboardOptions3 = keyboardOptions;
                    onKeyboardAction3 = onKeyboardAction;
                    shape3 = shape;
                    interactionSource3 = interactionSource;
                    $composer3 = $composer4;
                    $dirty2 = $dirty3;
                    label2 = function25;
                    $dirty13 = $dirty1;
                    colors3 = colors;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1990728840, $dirty2, $dirty13, "androidx.compose.material.OutlinedSecureTextField (SecureTextField.kt:244)");
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(345378573);
                ComposerKt.sourceInformation($composer3, "246@14370L39");
                ComposerKt.sourceInformationMarkerStart($composer3, 842425237, "CC(remember):SecureTextField.kt#9igjgp");
                Composer $this$cache$iv = $composer3;
                Object it$iv = $this$cache$iv.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = InteractionSourceKt.MutableInteractionSource();
                    $this$cache$iv.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                interactionSource4 = (MutableInteractionSource) it$iv;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(842424586);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            $composer3.startReplaceGroup(842430332);
            ComposerKt.sourceInformation($composer3, "*248@14549L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle2.m6489getColor0d7_KjU();
            if ($this$takeOrElse_u2dDxMtmZc$iv != 16) {
                interactionSource5 = interactionSource4;
            } else {
                interactionSource5 = interactionSource4;
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 6) & 14) | (($dirty13 >> 12) & 112)).getValue().m4400unboximpl();
            }
            $composer3.endReplaceGroup();
            long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
            TextStyle mergedTextStyle = textStyle2.merge(new TextStyle(textColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density density = (Density) objConsume2;
            final boolean isError5 = isError3;
            final TextFieldColors colors4 = colors3;
            final boolean enabled5 = enabled2;
            final Function2 placeholder4 = placeholder;
            final Function2 leadingIcon4 = leadingIcon;
            final Function2 label3 = label2;
            final Function2 trailingIcon3 = trailingIcon2;
            final Shape shape4 = shape3;
            Composer $composer5 = $composer3;
            BasicSecureTextFieldKt.m1039BasicSecureTextFieldJb9bMDk(state, SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2.then(label2 != null ? PaddingKt.m742paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                }
            }), 0.0f, density.mo384toDpGaN1DYA(OutlinedTextFieldKt.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE), isError3, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM()), enabled5, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, null, interactionSource5, new SolidColor(colors3.cursorColor(isError3, $composer3, (($dirty2 >> 24) & 14) | (($dirty13 >> 12) & 112)).getValue().m4400unboximpl(), null), new TextFieldDecorator() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3
                @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                public final void Decoration(Function2<? super Composer, ? super Integer, Unit> function26, Composer $composer6, int $changed2) {
                    $composer6.startReplaceGroup(-1518484896);
                    ComposerKt.sourceInformation($composer6, "C(Decoration)298@16722L119,284@16117L738:SecureTextField.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1518484896, $changed2, -1, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration (SecureTextField.kt:284)");
                    }
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    String string = state.getText().toString();
                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                    boolean z = enabled5;
                    MutableInteractionSource mutableInteractionSource = interactionSource5;
                    boolean z2 = isError5;
                    Function2<Composer, Integer, Unit> function27 = label3;
                    Function2<Composer, Integer, Unit> function28 = placeholder4;
                    Function2<Composer, Integer, Unit> function29 = leadingIcon4;
                    Function2<Composer, Integer, Unit> function210 = trailingIcon3;
                    Shape shape5 = shape4;
                    TextFieldColors textFieldColors = colors4;
                    final boolean z3 = enabled5;
                    final boolean z4 = isError5;
                    final MutableInteractionSource mutableInteractionSource2 = interactionSource5;
                    final TextFieldColors textFieldColors2 = colors4;
                    final Shape shape6 = shape4;
                    textFieldDefaults.OutlinedTextFieldDecorationBox(string, function26, z, true, none, mutableInteractionSource, z2, function27, function28, function29, function210, shape5, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(-1223036728, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3$Decoration$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer $composer7, int $changed3) {
                            ComposerKt.sourceInformation($composer7, "C299@16762L61:SecureTextField.kt#jmzs0o");
                            if (!$composer7.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                $composer7.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1223036728, $changed3, -1, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration.<anonymous> (SecureTextField.kt:299)");
                            }
                            TextFieldDefaults.INSTANCE.m1841BorderBoxnbWgWpA(z3, z4, mutableInteractionSource2, textFieldColors2, shape6, 0.0f, 0.0f, $composer7, User32.WS_CAPTION, 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, $composer6, 54), $composer6, (($changed2 << 3) & 112) | 27648, 221184, 8192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    $composer6.endReplaceGroup();
                }
            }, textObfuscationMode3, textObfuscationCharacter3, $composer5, ($dirty2 & 14) | ($dirty2 & User32.WM_PENWINFIRST) | (($dirty2 >> 18) & GL11.GL_RENDER) | (($dirty13 << 9) & 458752) | (($dirty13 << 9) & 3670016), (($dirty13 << 3) & 112) | (($dirty13 << 3) & User32.WM_PENWINFIRST), 128);
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            colors2 = colors3;
            interactionSource2 = interactionSource3;
            textStyle3 = textStyle2;
            placeholder2 = placeholder;
            modifier3 = modifier2;
            leadingIcon2 = leadingIcon;
            enabled3 = enabled5;
            label = label2;
            trailingIcon = trailingIcon2;
            isError2 = isError5;
            inputTransformation2 = inputTransformation3;
            textObfuscationMode2 = textObfuscationMode3;
            textObfuscationCharacter2 = textObfuscationCharacter3;
            keyboardOptions2 = keyboardOptions3;
            onKeyboardAction2 = onKeyboardAction3;
            shape2 = shape3;
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            isError2 = isError;
            keyboardOptions2 = keyboardOptions;
            shape2 = shape;
            colors2 = colors;
            enabled3 = enabled2;
            textStyle3 = textStyle2;
            label = function25;
            placeholder2 = placeholder;
            modifier3 = modifier2;
            leadingIcon2 = leadingIcon;
            trailingIcon = function24;
            inputTransformation2 = inputTransformation;
            textObfuscationMode2 = textObfuscationMode;
            textObfuscationCharacter2 = textObfuscationCharacter;
            onKeyboardAction2 = onKeyboardAction;
            interactionSource2 = interactionSource;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$4
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

                public final void invoke(Composer composer, int i22) {
                    SecureTextFieldKt.m1775OutlinedSecureTextField0vce7ms(state, modifier3, enabled3, textStyle3, label, placeholder2, leadingIcon2, trailingIcon, isError2, inputTransformation2, textObfuscationMode2, textObfuscationCharacter2, keyboardOptions2, onKeyboardAction2, shape2, colors2, interactionSource2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }
}
