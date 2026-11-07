package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: BasicSecureTextField.kt */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÊ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001328\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0002\b\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aÔ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001328\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0002\b\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u00052\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b-H\u0003¢\u0006\u0002\u0010.\u001a\u001a\u0010/\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"DefaultObfuscationCharacter", "", "LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "", "BasicSecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "BasicSecureTextField-Jb9bMDk", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "readOnly", "BasicSecureTextField-egD4TGM", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "DisableCutCopy", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "then", "next", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* renamed from: BasicSecureTextField-egD4TGM, reason: not valid java name */
    public static final void m1040BasicSecureTextFieldegD4TGM(final TextFieldState state, Modifier modifier, boolean enabled, boolean readOnly, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource interactionSource, Brush cursorBrush, TextFieldDecorator decorator, int textObfuscationMode, char textObfuscationCharacter, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean z;
        boolean z2;
        InputTransformation inputTransformation2;
        TextStyle textStyle2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        final KeyboardOptions keyboardOptions2;
        final MutableInteractionSource interactionSource2;
        final char textObfuscationCharacter2;
        Composer $composer2;
        int $dirty1;
        final TextStyle textStyle3;
        final boolean enabled2;
        final boolean readOnly2;
        final InputTransformation inputTransformation3;
        final Modifier modifier3;
        final KeyboardActionHandler onKeyboardAction2;
        final Function2 onTextLayout;
        final Brush cursorBrush2;
        final TextFieldDecorator decorator2;
        final int textObfuscationMode2;
        Modifier.Companion modifier4;
        final boolean enabled3;
        final boolean readOnly3;
        final InputTransformation inputTransformation4;
        final TextStyle textStyle4;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler onKeyboardAction3;
        final Function2 onTextLayout2;
        int i8;
        final MutableInteractionSource interactionSource3;
        final Brush cursorBrush3;
        final TextFieldDecorator decorator3;
        int textObfuscationMode3;
        char textObfuscationCharacter3;
        Object value$iv;
        Modifier.Companion focusChangeModifier;
        Composer $composer3 = $composer.startRestartGroup(-817513499);
        ComposerKt.sourceInformation($composer3, "C(BasicSecureTextField)P(10,6,2,9,3,13,5,7,8,4!2,12:c#foundation.text.input.TextObfuscationMode)134@7973L46,135@8056L60,136@8163L130,136@8121L172,147@8671L129,147@8632L168,154@8844L424,183@9940L852,183@9925L867:BasicSecureTextField.kt#423gt5");
        int $dirty = $changed;
        int $dirty12 = $changed1;
        if ((i & 1) != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(state) ? 4 : 2;
        }
        int i9 = i & 2;
        if (i9 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 4;
        if (i10 != 0) {
            $dirty |= 384;
            z = enabled;
        } else if (($changed & 384) == 0) {
            z = enabled;
            $dirty |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = enabled;
        }
        int i11 = i & 8;
        if (i11 != 0) {
            $dirty |= 3072;
            z2 = readOnly;
        } else if (($changed & 3072) == 0) {
            z2 = readOnly;
            $dirty |= $composer3.changed(z2) ? 2048 : 1024;
        } else {
            z2 = readOnly;
        }
        int i12 = i & 16;
        if (i12 != 0) {
            $dirty |= 24576;
            inputTransformation2 = inputTransformation;
        } else if (($changed & 24576) == 0) {
            inputTransformation2 = inputTransformation;
            $dirty |= $composer3.changed(inputTransformation2) ? 16384 : 8192;
        } else {
            inputTransformation2 = inputTransformation;
        }
        int i13 = i & 32;
        if (i13 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            textStyle2 = textStyle;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            textStyle2 = textStyle;
            $dirty |= $composer3.changed(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        int i14 = i & 64;
        if (i14 != 0) {
            $dirty |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty |= $composer3.changed(keyboardOptions) ? 1048576 : 524288;
        }
        int i15 = i & 128;
        if (i15 != 0) {
            $dirty |= User32.WS_CAPTION;
            i2 = i15;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            i2 = i15;
            $dirty |= $composer3.changed(onKeyboardAction) ? 8388608 : 4194304;
        } else {
            i2 = i15;
        }
        int i16 = i & 256;
        if (i16 != 0) {
            $dirty |= 100663296;
            i3 = i16;
        } else if (($changed & 100663296) == 0) {
            i3 = i16;
            $dirty |= $composer3.changedInstance(function2) ? 67108864 : 33554432;
        } else {
            i3 = i16;
        }
        int i17 = i & 512;
        if (i17 != 0) {
            $dirty |= LZMA2Options.DICT_SIZE_MAX;
            i4 = i17;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i4 = i17;
            $dirty |= $composer3.changed(interactionSource) ? 536870912 : 268435456;
        } else {
            i4 = i17;
        }
        int i18 = i & 1024;
        if (i18 != 0) {
            $dirty12 |= 6;
            i5 = i18;
        } else if (($changed1 & 6) == 0) {
            i5 = i18;
            $dirty12 |= $composer3.changed(cursorBrush) ? 4 : 2;
        } else {
            i5 = i18;
        }
        int i19 = i & 2048;
        if (i19 != 0) {
            $dirty12 |= 48;
        } else if (($changed1 & 48) == 0) {
            $dirty12 |= ($changed1 & 64) == 0 ? $composer3.changed(decorator) : $composer3.changedInstance(decorator) ? 32 : 16;
        }
        int i20 = i & 4096;
        if (i20 != 0) {
            $dirty12 |= 384;
            i6 = i20;
        } else {
            i6 = i20;
            if (($changed1 & 384) == 0) {
                $dirty12 |= $composer3.changed(textObfuscationMode) ? 256 : 128;
            }
        }
        int i21 = i & 8192;
        if (i21 != 0) {
            $dirty12 |= 3072;
            i7 = i21;
        } else {
            i7 = i21;
            if (($changed1 & 3072) == 0) {
                $dirty12 |= $composer3.changed(textObfuscationCharacter) ? 2048 : 1024;
            }
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty12 & 1171) == 1170) ? false : true, $dirty & 1)) {
            if (i9 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i10 == 0) {
                enabled3 = z;
            } else {
                enabled3 = true;
            }
            if (i11 == 0) {
                readOnly3 = z2;
            } else {
                readOnly3 = false;
            }
            if (i12 == 0) {
                inputTransformation4 = inputTransformation2;
            } else {
                inputTransformation4 = null;
            }
            if (i13 == 0) {
                textStyle4 = textStyle2;
            } else {
                textStyle4 = TextStyle.INSTANCE.getDefault();
            }
            if (i14 == 0) {
                keyboardOptions3 = keyboardOptions;
            } else {
                keyboardOptions3 = KeyboardOptions.INSTANCE.getSecureTextField$foundation_release();
            }
            if (i2 == 0) {
                onKeyboardAction3 = onKeyboardAction;
            } else {
                onKeyboardAction3 = null;
            }
            if (i3 == 0) {
                onTextLayout2 = function2;
                i8 = -817513499;
            } else {
                onTextLayout2 = null;
                i8 = -817513499;
            }
            if (i4 == 0) {
                interactionSource3 = interactionSource;
            } else {
                interactionSource3 = null;
            }
            if (i5 == 0) {
                cursorBrush3 = cursorBrush;
            } else {
                cursorBrush3 = new SolidColor(Color.INSTANCE.m4416getBlack0d7_KjU(), null);
            }
            if (i19 == 0) {
                decorator3 = decorator;
            } else {
                decorator3 = null;
            }
            if (i6 == 0) {
                textObfuscationMode3 = textObfuscationMode;
            } else {
                textObfuscationMode3 = TextObfuscationMode.INSTANCE.m1226getRevealLastTypedvTwcZD0();
            }
            if (i7 == 0) {
                textObfuscationCharacter3 = textObfuscationCharacter;
            } else {
                textObfuscationCharacter3 = 8226;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i8, $dirty, $dirty12, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:133)");
            }
            final State obfuscationMaskState = SnapshotStateKt.rememberUpdatedState(Character.valueOf(textObfuscationCharacter3), $composer3, ($dirty12 >> 9) & 14);
            ComposerKt.sourceInformationMarkerStart($composer3, 120990987, "CC(remember):BasicSecureTextField.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new SecureTextFieldController(obfuscationMaskState);
                $composer3.updateRememberedValue(value$iv2);
                it$iv = value$iv2;
            }
            final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 120994481, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean invalid$iv = $composer3.changedInstance(secureTextFieldController);
            Object it$iv2 = $composer3.rememberedValue();
            if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = (Function2) new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                $composer3.updateRememberedValue(value$iv3);
                it$iv2 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv2, $composer3, 0);
            final boolean revealLastTypedEnabled = TextObfuscationMode.m1221equalsimpl0(textObfuscationMode3, TextObfuscationMode.INSTANCE.m1226getRevealLastTypedvTwcZD0());
            Boolean boolValueOf = Boolean.valueOf(revealLastTypedEnabled);
            ComposerKt.sourceInformationMarkerStart($composer3, 121010736, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean invalid$iv2 = $composer3.changed(revealLastTypedEnabled) | $composer3.changedInstance(secureTextFieldController);
            Object it$iv3 = $composer3.rememberedValue();
            if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = (Function2) new BasicSecureTextFieldKt$BasicSecureTextField$2$1(revealLastTypedEnabled, secureTextFieldController, null);
                $composer3.updateRememberedValue(value$iv4);
                it$iv3 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv3, $composer3, 0);
            ComposerKt.sourceInformationMarkerStart($composer3, 121016567, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean invalid$iv3 = ($dirty12 & User32.WM_PENWINFIRST) == 256;
            Object it$iv4 = $composer3.rememberedValue();
            if (invalid$iv3 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                if (TextObfuscationMode.m1221equalsimpl0(textObfuscationMode3, TextObfuscationMode.INSTANCE.m1226getRevealLastTypedvTwcZD0())) {
                    value$iv = secureTextFieldController.getCodepointTransformation();
                } else if (TextObfuscationMode.m1221equalsimpl0(textObfuscationMode3, TextObfuscationMode.INSTANCE.m1225getHiddenvTwcZD0())) {
                    value$iv = new CodepointTransformation() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$$ExternalSyntheticLambda0
                        @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
                        public final int transform(int i22, int i23) {
                            return BasicSecureTextFieldKt.BasicSecureTextField_egD4TGM$lambda$4$lambda$3(obfuscationMaskState, i22, i23);
                        }
                    };
                } else {
                    value$iv = null;
                }
                $composer3.updateRememberedValue(value$iv);
                it$iv4 = value$iv;
            }
            final CodepointTransformation codepointTransformation = (CodepointTransformation) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(SemanticsModifierKt.semantics$default(modifier4, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                    SemanticsPropertiesKt.setContentType($this$semantics, ContentType.INSTANCE.getPassword());
                }
            }, 1, null), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m1041invokeZmokQxo(keyEvent.m5470unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m1041invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    KeyCommand command = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo1066mapZmokQxo(keyEvent);
                    return Boolean.valueOf(command == KeyCommand.COPY || command == KeyCommand.CUT);
                }
            });
            if (revealLastTypedEnabled) {
                focusChangeModifier = secureTextFieldController.getFocusChangeModifier();
            } else {
                focusChangeModifier = Modifier.INSTANCE;
            }
            final Modifier secureTextFieldModifier = modifierOnPreviewKeyEvent.then(focusChangeModifier);
            DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(252521481, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                public final void invoke(Composer $composer4, int $changed2) {
                    InputTransformation inputTransformationThen;
                    ComposerKt.sourceInformation($composer4, "C184@9950L836:BasicSecureTextField.kt#423gt5");
                    if ($composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(252521481, $changed2, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:184)");
                        }
                        TextFieldState textFieldState = state;
                        Modifier modifier5 = secureTextFieldModifier;
                        boolean z3 = enabled3;
                        boolean z4 = readOnly3;
                        if (revealLastTypedEnabled) {
                            inputTransformationThen = BasicSecureTextFieldKt.then(inputTransformation4, secureTextFieldController.getPasswordInputTransformation());
                        } else {
                            inputTransformationThen = inputTransformation4;
                        }
                        BasicTextFieldKt.BasicTextField(textFieldState, modifier5, z3, z4, inputTransformationThen, textStyle4, keyboardOptions3, onKeyboardAction3, TextFieldLineLimits.SingleLine.INSTANCE, onTextLayout2, interactionSource3, cursorBrush3, codepointTransformation, null, decorator3, null, true, $composer4, 100663296, JNINativeInterface.JNI_VERSION_24, 40960);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer4.skipToGroupEnd();
                }
            }, $composer3, 54), $composer3, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            textObfuscationMode2 = textObfuscationMode3;
            $composer2 = $composer3;
            $dirty1 = $dirty12;
            textObfuscationCharacter2 = textObfuscationCharacter3;
            enabled2 = enabled3;
            readOnly2 = readOnly3;
            inputTransformation3 = inputTransformation4;
            textStyle3 = textStyle4;
            keyboardOptions2 = keyboardOptions3;
            onKeyboardAction2 = onKeyboardAction3;
            onTextLayout = onTextLayout2;
            interactionSource2 = interactionSource3;
            cursorBrush2 = cursorBrush3;
            decorator2 = decorator3;
        } else {
            $composer3.skipToGroupEnd();
            keyboardOptions2 = keyboardOptions;
            interactionSource2 = interactionSource;
            textObfuscationCharacter2 = textObfuscationCharacter;
            $composer2 = $composer3;
            $dirty1 = $dirty12;
            textStyle3 = textStyle2;
            enabled2 = z;
            readOnly2 = z2;
            inputTransformation3 = inputTransformation2;
            modifier3 = modifier2;
            onKeyboardAction2 = onKeyboardAction;
            onTextLayout = function2;
            cursorBrush2 = cursorBrush;
            decorator2 = decorator;
            textObfuscationMode2 = textObfuscationMode;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4
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
                    BasicSecureTextFieldKt.m1040BasicSecureTextFieldegD4TGM(state, modifier3, enabled2, readOnly2, inputTransformation3, textStyle3, keyboardOptions2, onKeyboardAction2, onTextLayout, interactionSource2, cursorBrush2, decorator2, textObfuscationMode2, textObfuscationCharacter2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_egD4TGM$lambda$4$lambda$3(State $obfuscationMaskState, int i, int i2) {
        return ((Character) $obfuscationMaskState.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation then(InputTransformation $this$then, InputTransformation next) {
        return $this$then == null ? next : next == null ? $this$then : InputTransformationKt.then($this$then, next);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1085555050);
        ComposerKt.sourceInformation($composer2, "C(DisableCutCopy)306@14490L7,308@14536L875,329@15416L80:BasicSecureTextField.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, $dirty, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:305)");
            }
            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localTextToolbar);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final TextToolbar currentToolbar = (TextToolbar) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, -1202758015, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean invalid$iv = $composer2.changed(currentToolbar);
            Object it$iv = $composer2.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested) {
                        this.$$delegate_0.showMenu(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested);
                    }

                    {
                        this.$$delegate_0 = this.$currentToolbar;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested, Function0<Unit> onAutofillRequested) {
                        this.$currentToolbar.showMenu(rect, null, onPasteRequested, null, onSelectAllRequested, onAutofillRequested);
                    }
                };
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1 copyDisabledToolbar = (BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides(copyDisabledToolbar), function2, $composer2, ProvidedValue.$stable | (($dirty << 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1
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
                    BasicSecureTextFieldKt.DisableCutCopy(function2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the overload that takes in readOnly parameter.")
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    public static final /* synthetic */ void m1039BasicSecureTextFieldJb9bMDk(final TextFieldState state, Modifier modifier, boolean enabled, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, Function2 onTextLayout, MutableInteractionSource interactionSource, Brush cursorBrush, TextFieldDecorator decorator, int textObfuscationMode, char textObfuscationCharacter, Composer $composer, final int $changed, final int $changed1, final int i) {
        TextFieldState textFieldState;
        Modifier modifier2;
        boolean z;
        InputTransformation inputTransformation2;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer $composer2;
        final MutableInteractionSource interactionSource2;
        final char textObfuscationCharacter2;
        int $dirty;
        int $dirty1;
        final boolean enabled2;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final Modifier modifier3;
        final KeyboardActionHandler onKeyboardAction2;
        final Function2 onTextLayout2;
        final Brush cursorBrush2;
        final TextFieldDecorator decorator2;
        final int textObfuscationMode2;
        Modifier modifier4;
        int i7;
        boolean enabled3;
        int i8;
        InputTransformation inputTransformation4;
        int i9;
        TextStyle textStyle4;
        KeyboardOptions keyboardOptions4;
        KeyboardActionHandler onKeyboardAction3;
        Function2 onTextLayout3;
        MutableInteractionSource interactionSource3;
        int i10;
        Brush cursorBrush3;
        TextFieldDecorator decorator3;
        int textObfuscationMode3;
        char textObfuscationCharacter3;
        Composer $composer3 = $composer.startRestartGroup(1399310985);
        ComposerKt.sourceInformation($composer3, "C(BasicSecureTextField)P(9,6,2,3,12,5,7,8,4!2,11:c#foundation.text.input.TextObfuscationMode)355@16532L563:BasicSecureTextField.kt#423gt5");
        int $dirty2 = $changed;
        int $dirty12 = $changed1;
        if ((i & 1) != 0) {
            $dirty2 |= 6;
            textFieldState = state;
        } else if (($changed & 6) == 0) {
            textFieldState = state;
            $dirty2 |= $composer3.changed(textFieldState) ? 4 : 2;
        } else {
            textFieldState = state;
        }
        int i11 = i & 2;
        if (i11 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i12 = i & 4;
        if (i12 != 0) {
            $dirty2 |= 384;
            z = enabled;
        } else if (($changed & 384) == 0) {
            z = enabled;
            $dirty2 |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = enabled;
        }
        int i13 = i & 8;
        if (i13 != 0) {
            $dirty2 |= 3072;
            inputTransformation2 = inputTransformation;
        } else if (($changed & 3072) == 0) {
            inputTransformation2 = inputTransformation;
            $dirty2 |= $composer3.changed(inputTransformation2) ? 2048 : 1024;
        } else {
            inputTransformation2 = inputTransformation;
        }
        int i14 = i & 16;
        if (i14 != 0) {
            $dirty2 |= 24576;
            textStyle2 = textStyle;
        } else if (($changed & 24576) == 0) {
            textStyle2 = textStyle;
            $dirty2 |= $composer3.changed(textStyle2) ? 16384 : 8192;
        } else {
            textStyle2 = textStyle;
        }
        int i15 = i & 32;
        if (i15 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            keyboardOptions2 = keyboardOptions;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            keyboardOptions2 = keyboardOptions;
            $dirty2 |= $composer3.changed(keyboardOptions2) ? 131072 : 65536;
        } else {
            keyboardOptions2 = keyboardOptions;
        }
        int i16 = i & 64;
        if (i16 != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty2 |= $composer3.changed(onKeyboardAction) ? 1048576 : 524288;
        }
        int i17 = i & 128;
        if (i17 != 0) {
            $dirty2 |= User32.WS_CAPTION;
            i2 = i17;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            i2 = i17;
            $dirty2 |= $composer3.changedInstance(onTextLayout) ? 8388608 : 4194304;
        } else {
            i2 = i17;
        }
        int i18 = i & 256;
        if (i18 != 0) {
            $dirty2 |= 100663296;
            i3 = i18;
        } else if (($changed & 100663296) == 0) {
            i3 = i18;
            $dirty2 |= $composer3.changed(interactionSource) ? 67108864 : 33554432;
        } else {
            i3 = i18;
        }
        int i19 = i & 512;
        if (i19 != 0) {
            $dirty2 |= LZMA2Options.DICT_SIZE_MAX;
            i4 = i19;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i4 = i19;
            $dirty2 |= $composer3.changed(cursorBrush) ? 536870912 : 268435456;
        } else {
            i4 = i19;
        }
        int i20 = i & 1024;
        if (i20 != 0) {
            $dirty12 |= 6;
        } else if (($changed1 & 6) == 0) {
            $dirty12 |= ($changed1 & 8) == 0 ? $composer3.changed(decorator) : $composer3.changedInstance(decorator) ? 4 : 2;
        }
        int i21 = i & 2048;
        if (i21 != 0) {
            $dirty12 |= 48;
            i5 = i21;
        } else if (($changed1 & 48) == 0) {
            i5 = i21;
            $dirty12 |= $composer3.changed(textObfuscationMode) ? 32 : 16;
        } else {
            i5 = i21;
        }
        int i22 = i & 4096;
        if (i22 != 0) {
            $dirty12 |= 384;
            i6 = i22;
        } else {
            i6 = i22;
            if (($changed1 & 384) == 0) {
                $dirty12 |= $composer3.changed(textObfuscationCharacter) ? 256 : 128;
            }
        }
        if ($composer3.shouldExecute((($dirty2 & 306783379) == 306783378 && ($dirty12 & 147) == 146) ? false : true, $dirty2 & 1)) {
            if (i11 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i12 == 0) {
                i7 = i13;
                enabled3 = z;
            } else {
                enabled3 = true;
                i7 = i13;
            }
            if (i7 == 0) {
                i8 = i14;
                inputTransformation4 = inputTransformation2;
            } else {
                inputTransformation4 = null;
                i8 = i14;
            }
            if (i8 == 0) {
                i9 = i6;
                textStyle4 = textStyle2;
            } else {
                int i23 = i6;
                textStyle4 = TextStyle.INSTANCE.getDefault();
                i9 = i23;
            }
            if (i15 == 0) {
                keyboardOptions4 = keyboardOptions2;
            } else {
                keyboardOptions4 = KeyboardOptions.INSTANCE.getSecureTextField$foundation_release();
            }
            if (i16 == 0) {
                onKeyboardAction3 = onKeyboardAction;
            } else {
                onKeyboardAction3 = null;
            }
            if (i2 == 0) {
                onTextLayout3 = onTextLayout;
            } else {
                onTextLayout3 = null;
            }
            if (i3 == 0) {
                interactionSource3 = interactionSource;
                i10 = 1399310985;
            } else {
                interactionSource3 = null;
                i10 = 1399310985;
            }
            if (i4 == 0) {
                cursorBrush3 = cursorBrush;
            } else {
                cursorBrush3 = new SolidColor(Color.INSTANCE.m4416getBlack0d7_KjU(), null);
            }
            if (i20 == 0) {
                decorator3 = decorator;
            } else {
                decorator3 = null;
            }
            if (i5 == 0) {
                textObfuscationMode3 = textObfuscationMode;
            } else {
                textObfuscationMode3 = TextObfuscationMode.INSTANCE.m1226getRevealLastTypedvTwcZD0();
            }
            if (i9 == 0) {
                textObfuscationCharacter3 = textObfuscationCharacter;
            } else {
                textObfuscationCharacter3 = 8226;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i10, $dirty2, $dirty12, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:354)");
            }
            $composer2 = $composer3;
            m1040BasicSecureTextFieldegD4TGM(textFieldState, modifier4, enabled3, false, inputTransformation4, textStyle4, keyboardOptions4, onKeyboardAction3, onTextLayout3, interactionSource3, cursorBrush3, decorator3, textObfuscationMode3, textObfuscationCharacter3, $composer2, ($dirty2 & 14) | 3072 | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST) | (($dirty2 << 3) & 57344) | (($dirty2 << 3) & 458752) | (($dirty2 << 3) & 3670016) | (($dirty2 << 3) & 29360128) | (($dirty2 << 3) & 234881024) | (($dirty2 << 3) & 1879048192), (($dirty2 >> 27) & 14) | (($dirty12 << 3) & 112) | (($dirty12 << 3) & User32.WM_PENWINFIRST) | (($dirty12 << 3) & GL11.GL_RENDER), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty = $dirty2;
            $dirty1 = $dirty12;
            modifier3 = modifier4;
            enabled2 = enabled3;
            inputTransformation3 = inputTransformation4;
            textStyle3 = textStyle4;
            keyboardOptions3 = keyboardOptions4;
            onKeyboardAction2 = onKeyboardAction3;
            onTextLayout2 = onTextLayout3;
            interactionSource2 = interactionSource3;
            cursorBrush2 = cursorBrush3;
            decorator2 = decorator3;
            textObfuscationMode2 = textObfuscationMode3;
            textObfuscationCharacter2 = textObfuscationCharacter3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            interactionSource2 = interactionSource;
            textObfuscationCharacter2 = textObfuscationCharacter;
            $dirty = $dirty2;
            $dirty1 = $dirty12;
            enabled2 = z;
            inputTransformation3 = inputTransformation2;
            textStyle3 = textStyle2;
            keyboardOptions3 = keyboardOptions2;
            modifier3 = modifier2;
            onKeyboardAction2 = onKeyboardAction;
            onTextLayout2 = onTextLayout;
            cursorBrush2 = cursorBrush;
            decorator2 = decorator;
            textObfuscationMode2 = textObfuscationMode;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$5
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

                public final void invoke(Composer composer, int i24) {
                    BasicSecureTextFieldKt.m1039BasicSecureTextFieldJb9bMDk(state, modifier3, enabled2, inputTransformation3, textStyle3, keyboardOptions3, onKeyboardAction2, onTextLayout2, interactionSource2, cursorBrush2, decorator2, textObfuscationMode2, textObfuscationCharacter2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }
}
