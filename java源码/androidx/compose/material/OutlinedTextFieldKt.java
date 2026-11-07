package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0085\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0002\u0010.\u001a\u0087\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010:\u001a\u0093\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010<\u001a\u0087\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010=\u001a\u0093\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00012\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010>\u001aÁ\u0001\u0010?\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u000102¢\u0006\u0002\b\u00172\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010A\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010B\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u00107\u001a\u00020\u00112\u0006\u0010C\u001a\u00020D2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u000b022\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\u00172\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\u0010J\u001aZ\u0010K\u001a\u0002092\u0006\u0010L\u001a\u0002092\u0006\u0010M\u001a\u0002092\u0006\u0010N\u001a\u0002092\u0006\u0010O\u001a\u0002092\u0006\u0010P\u001a\u0002092\u0006\u0010C\u001a\u00020D2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020D2\u0006\u0010H\u001a\u00020IH\u0002ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001aZ\u0010V\u001a\u0002092\u0006\u0010W\u001a\u0002092\u0006\u0010X\u001a\u0002092\u0006\u0010Y\u001a\u0002092\u0006\u0010Z\u001a\u0002092\u0006\u0010[\u001a\u0002092\u0006\u0010C\u001a\u00020D2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020D2\u0006\u0010H\u001a\u00020IH\u0002ø\u0001\u0000¢\u0006\u0004\b\\\u0010U\u001a&\u0010]\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010^\u001a\u00020F2\u0006\u0010H\u001a\u00020IH\u0000ø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a|\u0010a\u001a\u00020\u000b*\u00020b2\u0006\u0010c\u001a\u0002092\u0006\u0010d\u001a\u0002092\b\u0010e\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010h\u001a\u00020f2\b\u0010i\u001a\u0004\u0018\u00010f2\b\u0010j\u001a\u0004\u0018\u00010f2\u0006\u0010k\u001a\u00020f2\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u00112\u0006\u0010S\u001a\u00020D2\u0006\u0010l\u001a\u00020m2\u0006\u0010H\u001a\u00020IH\u0002\u001a\u0014\u0010n\u001a\u000209*\u0002092\u0006\u0010o\u001a\u000209H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/TextUnit;", "getOutlinedTextFieldTopPadding", "()J", "J", "OutlinedTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-O3s9Psw", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "substractConstraintSafely", "from", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m7018constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding = TextUnitKt.getSp(8);

    public static final void OutlinedTextField(final TextFieldState state, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, TextFieldLineLimits lineLimits, ScrollState scrollState, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean enabled2;
        boolean z;
        TextStyle textStyle2;
        Function2 function25;
        Function2 function26;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int $dirty1;
        Composer $composer2;
        final Function2 trailingIcon;
        final KeyboardOptions keyboardOptions2;
        final TextFieldLineLimits lineLimits2;
        final ScrollState scrollState2;
        final TextFieldColors colors2;
        final MutableInteractionSource interactionSource2;
        final boolean enabled3;
        final boolean readOnly2;
        final TextStyle textStyle3;
        final Function2 label;
        final Modifier modifier3;
        final Function2 placeholder;
        final Function2 leadingIcon;
        final boolean isError2;
        final InputTransformation inputTransformation2;
        final OutputTransformation outputTransformation2;
        final KeyboardActionHandler onKeyboardAction2;
        final Shape shape2;
        boolean readOnly3;
        TextStyle textStyle4;
        int $dirty;
        Function2 label2;
        Function2 placeholder2;
        Function2 leadingIcon2;
        Function2 trailingIcon2;
        InputTransformation inputTransformation3;
        OutputTransformation outputTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler onKeyboardAction3;
        TextFieldLineLimits lineLimits3;
        ScrollState scrollState3;
        Shape shape3;
        int $dirty12;
        Composer $composer3;
        Composer $composer4;
        TextFieldColors colors3;
        MutableInteractionSource interactionSource3;
        int $dirty2;
        boolean isError3;
        int $dirty13;
        MutableInteractionSource interactionSource4;
        int $dirty14;
        int i8;
        Composer $composer5 = $composer.startRestartGroup(-1115632458);
        ComposerKt.sourceInformation($composer5, "C(OutlinedTextField)P(16,9,1,13,17,6,12,7,18,4,2,11,5,10,8,14,15)184@10481L7,202@11200L38,210@11544L20,187@10537L2814:OutlinedTextField.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty15 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer5.changed(state) ? 4 : 2;
        }
        int i9 = i & 2;
        if (i9 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer5.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 4;
        if (i10 != 0) {
            $dirty3 |= 384;
            enabled2 = enabled;
        } else if (($changed & 384) == 0) {
            enabled2 = enabled;
            $dirty3 |= $composer5.changed(enabled2) ? 256 : 128;
        } else {
            enabled2 = enabled;
        }
        int i11 = i & 8;
        if (i11 != 0) {
            $dirty3 |= 3072;
            z = readOnly;
        } else if (($changed & 3072) == 0) {
            z = readOnly;
            $dirty3 |= $composer5.changed(z) ? 2048 : 1024;
        } else {
            z = readOnly;
        }
        int i12 = 8192;
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                textStyle2 = textStyle;
                if ($composer5.changed(textStyle2)) {
                    i8 = 16384;
                }
                $dirty3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            i8 = 8192;
            $dirty3 |= i8;
        } else {
            textStyle2 = textStyle;
        }
        int i13 = i & 32;
        if (i13 != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function25 = function2;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            function25 = function2;
            $dirty3 |= $composer5.changedInstance(function25) ? 131072 : 65536;
        } else {
            function25 = function2;
        }
        int i14 = i & 64;
        if (i14 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            function26 = function22;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function26 = function22;
            $dirty3 |= $composer5.changedInstance(function26) ? 1048576 : 524288;
        } else {
            function26 = function22;
        }
        int i15 = i & 128;
        if (i15 != 0) {
            $dirty3 |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty3 |= $composer5.changedInstance(function23) ? 8388608 : 4194304;
        }
        int i16 = i & 256;
        if (i16 != 0) {
            $dirty3 |= 100663296;
            i2 = i16;
        } else if (($changed & 100663296) == 0) {
            i2 = i16;
            $dirty3 |= $composer5.changedInstance(function24) ? 67108864 : 33554432;
        } else {
            i2 = i16;
        }
        int i17 = i & 512;
        if (i17 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i17;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i17;
            $dirty3 |= $composer5.changed(isError) ? 536870912 : 268435456;
        } else {
            i3 = i17;
        }
        int i18 = i & 1024;
        if (i18 != 0) {
            $dirty15 |= 6;
            i4 = i18;
        } else if (($changed1 & 6) == 0) {
            i4 = i18;
            $dirty15 |= $composer5.changed(inputTransformation) ? 4 : 2;
        } else {
            i4 = i18;
        }
        int i19 = i & 2048;
        if (i19 != 0) {
            $dirty15 |= 48;
            i5 = i19;
        } else if (($changed1 & 48) == 0) {
            i5 = i19;
            $dirty15 |= $composer5.changed(outputTransformation) ? 32 : 16;
        } else {
            i5 = i19;
        }
        int i20 = i & 4096;
        if (i20 != 0) {
            $dirty15 |= 384;
            i6 = i20;
        } else {
            i6 = i20;
            if (($changed1 & 384) == 0) {
                $dirty15 |= $composer5.changed(keyboardOptions) ? 256 : 128;
            }
        }
        int i21 = i & 8192;
        if (i21 != 0) {
            $dirty15 |= 3072;
            i7 = i21;
        } else {
            i7 = i21;
            if (($changed1 & 3072) == 0) {
                $dirty15 |= $composer5.changed(onKeyboardAction) ? 2048 : 1024;
            }
        }
        if (($changed1 & 24576) == 0) {
            if ((i & 16384) == 0 && $composer5.changed(lineLimits)) {
                i12 = 16384;
            }
            $dirty15 |= i12;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty15 |= ((i & 32768) == 0 && $composer5.changed(scrollState)) ? 131072 : 65536;
        }
        if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty15 |= ((i & 65536) == 0 && $composer5.changed(shape)) ? 1048576 : 524288;
        }
        if (($changed1 & User32.WS_CAPTION) == 0) {
            if ((i & 131072) == 0) {
                $dirty14 = $dirty15;
                int i22 = $composer5.changed(colors) ? 8388608 : 4194304;
                $dirty1 = $dirty14 | i22;
            } else {
                $dirty14 = $dirty15;
            }
            $dirty1 = $dirty14 | i22;
        } else {
            $dirty1 = $dirty15;
        }
        int i23 = i & 262144;
        if (i23 != 0) {
            $dirty1 |= 100663296;
        } else if (($changed1 & 100663296) == 0) {
            $dirty1 |= $composer5.changed(interactionSource) ? 67108864 : 33554432;
        }
        if ($composer5.shouldExecute((($dirty3 & 306783379) == 306783378 && ($dirty1 & 38347923) == 38347922) ? false : true, $dirty3 & 1)) {
            $composer5.startDefaults();
            ComposerKt.sourceInformation($composer5, "162@9307L7,173@9870L21,174@9930L22,175@10002L25");
            if (($changed & 1) == 0 || $composer5.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                readOnly3 = i11 != 0 ? false : z;
                if ((i & 16) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart($composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer5.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer5);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty3 & (-57345);
                } else {
                    textStyle4 = textStyle2;
                    $dirty = $dirty3;
                }
                label2 = i13 != 0 ? null : function25;
                placeholder2 = i14 != 0 ? null : function26;
                leadingIcon2 = i15 != 0 ? null : function23;
                trailingIcon2 = i2 != 0 ? null : function24;
                boolean isError4 = i3 != 0 ? false : isError;
                inputTransformation3 = i4 != 0 ? null : inputTransformation;
                outputTransformation3 = i5 != 0 ? null : outputTransformation;
                keyboardOptions3 = i6 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                onKeyboardAction3 = i7 != 0 ? null : onKeyboardAction;
                if ((i & 16384) != 0) {
                    $dirty1 &= -57345;
                    lineLimits3 = TextFieldLineLimits.INSTANCE.getDefault();
                } else {
                    lineLimits3 = lineLimits;
                }
                if ((32768 & i) != 0) {
                    $dirty1 &= -458753;
                    scrollState3 = ScrollKt.rememberScrollState(0, $composer5, 0, 1);
                } else {
                    scrollState3 = scrollState;
                }
                if ((i & 65536) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer5, 6);
                    $dirty12 = $dirty1 & (-3670017);
                } else {
                    shape3 = shape;
                    $dirty12 = $dirty1;
                }
                if ((i & 131072) != 0) {
                    $composer4 = 1;
                    colors3 = TextFieldDefaults.INSTANCE.m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer5, 0, 0, 48, 2097151);
                    $composer3 = $composer5;
                    $dirty12 &= -29360129;
                } else {
                    $composer3 = $composer5;
                    $composer4 = 1;
                    colors3 = colors;
                }
                if (i23 != 0) {
                    interactionSource3 = null;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    textStyle2 = textStyle4;
                    $dirty2 = $dirty;
                    isError3 = isError4;
                    $dirty13 = $dirty12;
                } else {
                    interactionSource3 = interactionSource;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    textStyle2 = textStyle4;
                    $dirty2 = $dirty;
                    isError3 = isError4;
                    $dirty13 = $dirty12;
                }
            } else {
                $composer5.skipToGroupEnd();
                if ((i & 16) != 0) {
                    $dirty3 &= -57345;
                }
                if ((i & 16384) != 0) {
                    $dirty1 &= -57345;
                }
                if ((32768 & i) != 0) {
                    $dirty1 &= -458753;
                }
                if ((i & 65536) != 0) {
                    $dirty1 &= -3670017;
                }
                if ((i & 131072) != 0) {
                    leadingIcon2 = function23;
                    trailingIcon2 = function24;
                    inputTransformation3 = inputTransformation;
                    outputTransformation3 = outputTransformation;
                    keyboardOptions3 = keyboardOptions;
                    onKeyboardAction3 = onKeyboardAction;
                    lineLimits3 = lineLimits;
                    scrollState3 = scrollState;
                    shape3 = shape;
                    $dirty13 = $dirty1 & (-29360129);
                    $composer3 = $composer5;
                    $composer4 = 1;
                    readOnly3 = z;
                    label2 = function25;
                    placeholder2 = function26;
                    isError3 = isError;
                    interactionSource3 = interactionSource;
                    $dirty2 = $dirty3;
                    colors3 = colors;
                } else {
                    leadingIcon2 = function23;
                    trailingIcon2 = function24;
                    isError3 = isError;
                    inputTransformation3 = inputTransformation;
                    outputTransformation3 = outputTransformation;
                    keyboardOptions3 = keyboardOptions;
                    onKeyboardAction3 = onKeyboardAction;
                    lineLimits3 = lineLimits;
                    scrollState3 = scrollState;
                    shape3 = shape;
                    $composer3 = $composer5;
                    $composer4 = 1;
                    readOnly3 = z;
                    label2 = function25;
                    placeholder2 = function26;
                    $dirty13 = $dirty1;
                    interactionSource3 = interactionSource;
                    $dirty2 = $dirty3;
                    colors3 = colors;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1115632458, $dirty2, $dirty13, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:177)");
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(-588072746);
                ComposerKt.sourceInformation($composer3, "179@10171L39");
                ComposerKt.sourceInformationMarkerStart($composer3, 673766572, "CC(remember):OutlinedTextField.kt#9igjgp");
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
                $composer3.startReplaceGroup(673765921);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            $composer3.startReplaceGroup(673771667);
            ComposerKt.sourceInformation($composer3, "*181@10350L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle2.m6489getColor0d7_KjU();
            if (($this$takeOrElse_u2dDxMtmZc$iv != 16 ? $composer4 : null) == null) {
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 6) & 14) | (($dirty13 >> 18) & 112)).getValue().m4400unboximpl();
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
            final MutableInteractionSource interactionSource5 = interactionSource4;
            final Function2 label3 = label2;
            final Function2 placeholder3 = placeholder2;
            final Function2 leadingIcon3 = leadingIcon2;
            final Function2 trailingIcon3 = trailingIcon2;
            final OutputTransformation outputTransformation4 = outputTransformation3;
            final TextFieldLineLimits lineLimits4 = lineLimits3;
            final Shape shape4 = shape3;
            Composer $composer6 = $composer3;
            BasicTextFieldKt.BasicTextField(state, SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2.then(label2 != null ? PaddingKt.m742paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                }
            }), 0.0f, density.mo384toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE), isError3, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM()), enabled5, readOnly3, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, lineLimits3, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) null, interactionSource4, new SolidColor(colors3.cursorColor(isError3, $composer3, (($dirty2 >> 27) & 14) | (($dirty13 >> 18) & 112)).getValue().m4400unboximpl(), null), outputTransformation3, new TextFieldDecorator() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3
                @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                public final void Decoration(Function2<? super Composer, ? super Integer, Unit> function27, Composer $composer7, int $changed2) {
                    TextFieldBuffer textFieldBuffer;
                    String textPostTransformation;
                    $composer7.startReplaceGroup(640748446);
                    ComposerKt.sourceInformation($composer7, "C(Decoration)246@13202L119,232@12576L759:OutlinedTextField.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(640748446, $changed2, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration (OutlinedTextField.kt:219)");
                    }
                    if (outputTransformation4 == null) {
                        textPostTransformation = state.getText().toString();
                    } else {
                        TextFieldState this_$iv = state;
                        TextFieldBuffer mutableValue$iv = this_$iv.startEdit();
                        try {
                            this_$iv.commitEdit(mutableValue$iv);
                            this_$iv.finishEditing();
                            OutputTransformation $this$Decoration_u24lambda_u241 = outputTransformation4;
                            if (mutableValue$iv == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("buffer");
                                textFieldBuffer = null;
                            } else {
                                textFieldBuffer = mutableValue$iv;
                            }
                            $this$Decoration_u24lambda_u241.transformOutput(textFieldBuffer);
                            textPostTransformation = mutableValue$iv.asCharSequence().toString();
                        } catch (Throwable th) {
                            this_$iv.finishEditing();
                            throw th;
                        }
                    }
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                    boolean zAreEqual = Intrinsics.areEqual(lineLimits4, TextFieldLineLimits.SingleLine.INSTANCE);
                    boolean z2 = enabled5;
                    MutableInteractionSource mutableInteractionSource = interactionSource5;
                    boolean z3 = isError5;
                    Function2<Composer, Integer, Unit> function28 = label3;
                    Function2<Composer, Integer, Unit> function29 = placeholder3;
                    Function2<Composer, Integer, Unit> function210 = leadingIcon3;
                    Function2<Composer, Integer, Unit> function211 = trailingIcon3;
                    Shape shape5 = shape4;
                    TextFieldColors textFieldColors = colors4;
                    String textPostTransformation2 = textPostTransformation;
                    final boolean z4 = enabled5;
                    final boolean z5 = isError5;
                    final MutableInteractionSource mutableInteractionSource2 = interactionSource5;
                    final TextFieldColors textFieldColors2 = colors4;
                    final Shape shape6 = shape4;
                    textFieldDefaults.OutlinedTextFieldDecorationBox(textPostTransformation2, function27, z2, zAreEqual, none, mutableInteractionSource, z3, function28, function29, function210, function211, shape5, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(-1422288378, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$Decoration$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer $composer8, int $changed3) {
                            ComposerKt.sourceInformation($composer8, "C247@13242L61:OutlinedTextField.kt#jmzs0o");
                            if (!$composer8.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                $composer8.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1422288378, $changed3, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration.<anonymous> (OutlinedTextField.kt:247)");
                            }
                            TextFieldDefaults.INSTANCE.m1841BorderBoxnbWgWpA(z4, z5, mutableInteractionSource2, textFieldColors2, shape6, 0.0f, 0.0f, $composer8, User32.WS_CAPTION, 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, $composer7, 54), $composer7, (($changed2 << 3) & 112) | 24576, 221184, 8192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    $composer7.endReplaceGroup();
                }
            }, scrollState3, $composer6, ($dirty2 & 14) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (($dirty13 << 12) & 57344) | (($dirty13 << 12) & 3670016) | (($dirty13 << 12) & 29360128) | (234881024 & ($dirty13 << 12)), (($dirty13 << 3) & User32.WM_PENWINFIRST) | (($dirty13 >> 3) & 57344), 512);
            $composer2 = $composer6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            colors2 = colors3;
            interactionSource2 = interactionSource3;
            textStyle3 = textStyle2;
            modifier3 = modifier2;
            enabled3 = enabled5;
            readOnly2 = readOnly3;
            label = label2;
            placeholder = placeholder2;
            leadingIcon = leadingIcon2;
            trailingIcon = trailingIcon2;
            isError2 = isError5;
            inputTransformation2 = inputTransformation3;
            outputTransformation2 = outputTransformation3;
            keyboardOptions2 = keyboardOptions3;
            onKeyboardAction2 = onKeyboardAction3;
            lineLimits2 = lineLimits3;
            scrollState2 = scrollState3;
            shape2 = shape3;
        } else {
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
            trailingIcon = function24;
            keyboardOptions2 = keyboardOptions;
            lineLimits2 = lineLimits;
            scrollState2 = scrollState;
            colors2 = colors;
            interactionSource2 = interactionSource;
            enabled3 = enabled2;
            readOnly2 = z;
            textStyle3 = textStyle2;
            label = function25;
            modifier3 = modifier2;
            placeholder = function26;
            leadingIcon = function23;
            isError2 = isError;
            inputTransformation2 = inputTransformation;
            outputTransformation2 = outputTransformation;
            onKeyboardAction2 = onKeyboardAction;
            shape2 = shape;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.4
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
                    OutlinedTextFieldKt.OutlinedTextField(state, modifier3, enabled3, readOnly2, textStyle3, label, placeholder, leadingIcon, trailingIcon, isError2, inputTransformation2, outputTransformation2, keyboardOptions2, onKeyboardAction2, lineLimits2, scrollState2, shape2, colors2, interactionSource2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    public static final void OutlinedTextField(final String value, final Function1<? super String, Unit> function1, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean enabled2;
        boolean readOnly2;
        TextStyle textStyle2;
        Function2 function25;
        Function2 function26;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int $dirty1;
        Composer $composer2;
        final Function2 leadingIcon;
        final VisualTransformation visualTransformation2;
        final KeyboardOptions keyboardOptions2;
        final int maxLines2;
        final int minLines2;
        final MutableInteractionSource interactionSource2;
        final Shape shape2;
        final TextFieldColors colors2;
        final boolean enabled3;
        final boolean readOnly3;
        final TextStyle textStyle3;
        final Function2 label;
        final Function2 placeholder;
        final Modifier modifier3;
        final Function2 trailingIcon;
        final boolean isError2;
        final KeyboardActions keyboardActions2;
        final boolean singleLine2;
        Modifier.Companion modifier4;
        TextStyle textStyle4;
        int $dirty;
        Function2 label2;
        Function2 placeholder2;
        Function2 leadingIcon2;
        Function2 trailingIcon2;
        int maxLines3;
        MutableInteractionSource interactionSource3;
        Shape shape3;
        int $dirty12;
        Composer $composer3;
        TextFieldColors colors3;
        TextStyle textStyle5;
        int $dirty2;
        boolean isError3;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean singleLine3;
        int maxLines4;
        int minLines3;
        int $dirty13;
        boolean readOnly4;
        int $dirty14;
        MutableInteractionSource interactionSource4;
        int $dirty15;
        Composer $composer4 = $composer.startRestartGroup(-621914704);
        ComposerKt.sourceInformation($composer4, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)346@19268L7,364@19987L38,373@20370L20,382@20724L1025,349@19324L2431:OutlinedTextField.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty16 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer4.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i & 4;
        if (i9 != 0) {
            $dirty3 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer4.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 8;
        if (i10 != 0) {
            $dirty3 |= 3072;
            enabled2 = enabled;
        } else if (($changed & 3072) == 0) {
            enabled2 = enabled;
            $dirty3 |= $composer4.changed(enabled2) ? 2048 : 1024;
        } else {
            enabled2 = enabled;
        }
        int i11 = i & 16;
        if (i11 != 0) {
            $dirty3 |= 24576;
            readOnly2 = readOnly;
        } else if (($changed & 24576) == 0) {
            readOnly2 = readOnly;
            $dirty3 |= $composer4.changed(readOnly2) ? 16384 : 8192;
        } else {
            readOnly2 = readOnly;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32) == 0) {
                textStyle2 = textStyle;
                int i12 = $composer4.changed(textStyle2) ? 131072 : 65536;
                $dirty3 |= i12;
            } else {
                textStyle2 = textStyle;
            }
            $dirty3 |= i12;
        } else {
            textStyle2 = textStyle;
        }
        int i13 = i & 64;
        if (i13 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            function25 = function2;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function25 = function2;
            $dirty3 |= $composer4.changedInstance(function25) ? 1048576 : 524288;
        } else {
            function25 = function2;
        }
        int i14 = i & 128;
        if (i14 != 0) {
            $dirty3 |= User32.WS_CAPTION;
            function26 = function22;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function26 = function22;
            $dirty3 |= $composer4.changedInstance(function26) ? 8388608 : 4194304;
        } else {
            function26 = function22;
        }
        int i15 = i & 256;
        if (i15 != 0) {
            $dirty3 |= 100663296;
            i2 = i15;
        } else if (($changed & 100663296) == 0) {
            i2 = i15;
            $dirty3 |= $composer4.changedInstance(function23) ? 67108864 : 33554432;
        } else {
            i2 = i15;
        }
        int i16 = i & 512;
        if (i16 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i16;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i16;
            $dirty3 |= $composer4.changedInstance(function24) ? 536870912 : 268435456;
        } else {
            i3 = i16;
        }
        int i17 = i & 1024;
        if (i17 != 0) {
            $dirty16 |= 6;
            i4 = i17;
        } else if (($changed1 & 6) == 0) {
            i4 = i17;
            $dirty16 |= $composer4.changed(isError) ? 4 : 2;
        } else {
            i4 = i17;
        }
        int i18 = i & 2048;
        if (i18 != 0) {
            $dirty16 |= 48;
            i5 = i18;
        } else if (($changed1 & 48) == 0) {
            i5 = i18;
            $dirty16 |= $composer4.changed(visualTransformation) ? 32 : 16;
        } else {
            i5 = i18;
        }
        int i19 = i & 4096;
        if (i19 != 0) {
            $dirty16 |= 384;
            i6 = i19;
        } else {
            i6 = i19;
            if (($changed1 & 384) == 0) {
                $dirty16 |= $composer4.changed(keyboardOptions) ? 256 : 128;
            }
        }
        int i20 = i & 8192;
        if (i20 != 0) {
            $dirty16 |= 3072;
            i7 = i20;
        } else {
            i7 = i20;
            if (($changed1 & 3072) == 0) {
                $dirty16 |= $composer4.changed(keyboardActions) ? 2048 : 1024;
            }
        }
        int i21 = i & 16384;
        if (i21 != 0) {
            $dirty16 |= 24576;
            i8 = i21;
        } else {
            i8 = i21;
            if (($changed1 & 24576) == 0) {
                $dirty16 |= $composer4.changed(singleLine) ? 16384 : 8192;
            }
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty16 |= ((i & 32768) == 0 && $composer4.changed(maxLines)) ? 131072 : 65536;
        }
        int i22 = i & 65536;
        if (i22 != 0) {
            $dirty16 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty16 |= $composer4.changed(minLines) ? 1048576 : 524288;
        }
        int i23 = i & 131072;
        if (i23 != 0) {
            $dirty16 |= User32.WS_CAPTION;
        } else if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty16 |= $composer4.changed(interactionSource) ? 8388608 : 4194304;
        }
        if (($changed1 & 100663296) == 0) {
            $dirty16 |= ((i & 262144) == 0 && $composer4.changed(shape)) ? 67108864 : 33554432;
        }
        if (($changed1 & LZMA2Options.DICT_SIZE_MAX) == 0) {
            if ((i & 524288) == 0) {
                $dirty15 = $dirty16;
                int i24 = $composer4.changed(colors) ? 536870912 : 268435456;
                $dirty1 = $dirty15 | i24;
            } else {
                $dirty15 = $dirty16;
            }
            $dirty1 = $dirty15 | i24;
        } else {
            $dirty1 = $dirty16;
        }
        if ($composer4.shouldExecute((($dirty3 & 306783379) == 306783378 && ($dirty1 & 306783379) == 306783378) ? false : true, $dirty3 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "324@18125L7,337@18775L22,338@18847L25");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                boolean readOnly5 = i11 != 0 ? false : readOnly2;
                if ((i & 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer4.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty3 & (-458753);
                } else {
                    textStyle4 = textStyle2;
                    $dirty = $dirty3;
                }
                label2 = i13 != 0 ? null : function25;
                placeholder2 = i14 != 0 ? null : function26;
                leadingIcon2 = i2 != 0 ? null : function23;
                trailingIcon2 = i3 != 0 ? null : function24;
                boolean isError4 = i4 != 0 ? false : isError;
                VisualTransformation visualTransformation4 = i5 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                KeyboardOptions keyboardOptions4 = i6 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                KeyboardActions keyboardActions4 = i7 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                boolean singleLine4 = i8 != 0 ? false : singleLine;
                if ((32768 & i) != 0) {
                    $dirty1 &= -458753;
                    maxLines3 = singleLine4 ? 1 : Integer.MAX_VALUE;
                } else {
                    maxLines3 = maxLines;
                }
                int minLines4 = i22 != 0 ? 1 : minLines;
                interactionSource3 = i23 != 0 ? null : interactionSource;
                if ((262144 & i) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer4, 6);
                    $dirty12 = $dirty1 & (-234881025);
                } else {
                    shape3 = shape;
                    $dirty12 = $dirty1;
                }
                if ((i & 524288) != 0) {
                    $composer3 = $composer4;
                    colors3 = TextFieldDefaults.INSTANCE.m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, 48, 2097151);
                    $dirty13 = $dirty12 & (-1879048193);
                    enabled2 = enabled4;
                    readOnly2 = readOnly5;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    isError3 = isError4;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    keyboardActions3 = keyboardActions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                } else {
                    $composer3 = $composer4;
                    colors3 = colors;
                    enabled2 = enabled4;
                    readOnly2 = readOnly5;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    isError3 = isError4;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    keyboardActions3 = keyboardActions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                    $dirty13 = $dirty12;
                }
            } else {
                $composer4.skipToGroupEnd();
                if ((i & 32) != 0) {
                    $dirty3 &= -458753;
                }
                if ((32768 & i) != 0) {
                    $dirty1 &= -458753;
                }
                if ((262144 & i) != 0) {
                    $dirty1 &= -234881025;
                }
                if ((i & 524288) != 0) {
                    leadingIcon2 = function23;
                    trailingIcon2 = function24;
                    isError3 = isError;
                    singleLine3 = singleLine;
                    maxLines4 = maxLines;
                    interactionSource3 = interactionSource;
                    shape3 = shape;
                    colors3 = colors;
                    $composer3 = $composer4;
                    $dirty2 = $dirty3;
                    textStyle5 = textStyle2;
                    label2 = function25;
                    placeholder2 = function26;
                    keyboardOptions3 = keyboardOptions;
                    keyboardActions3 = keyboardActions;
                    minLines3 = minLines;
                    $dirty13 = $dirty1 & (-1879048193);
                    modifier4 = modifier2;
                    visualTransformation3 = visualTransformation;
                } else {
                    leadingIcon2 = function23;
                    trailingIcon2 = function24;
                    isError3 = isError;
                    singleLine3 = singleLine;
                    maxLines4 = maxLines;
                    interactionSource3 = interactionSource;
                    shape3 = shape;
                    colors3 = colors;
                    $composer3 = $composer4;
                    $dirty2 = $dirty3;
                    textStyle5 = textStyle2;
                    label2 = function25;
                    placeholder2 = function26;
                    modifier4 = modifier2;
                    $dirty13 = $dirty1;
                    visualTransformation3 = visualTransformation;
                    keyboardOptions3 = keyboardOptions;
                    keyboardActions3 = keyboardActions;
                    minLines3 = minLines;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                readOnly4 = readOnly2;
                ComposerKt.traceEventStart(-621914704, $dirty2, $dirty13, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:339)");
            } else {
                readOnly4 = readOnly2;
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(-579356042);
                ComposerKt.sourceInformation($composer3, "341@18958L39");
                ComposerKt.sourceInformationMarkerStart($composer3, 674047756, "CC(remember):OutlinedTextField.kt#9igjgp");
                Composer $this$cache$iv = $composer3;
                Object it$iv = $this$cache$iv.rememberedValue();
                $dirty14 = $dirty13;
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = InteractionSourceKt.MutableInteractionSource();
                    $this$cache$iv.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                interactionSource4 = (MutableInteractionSource) it$iv;
            } else {
                $dirty14 = $dirty13;
                $composer3.startReplaceGroup(674047105);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            $composer3.startReplaceGroup(674052851);
            ComposerKt.sourceInformation($composer3, "*343@19137L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle5.m6489getColor0d7_KjU();
            if (!($this$takeOrElse_u2dDxMtmZc$iv != 16)) {
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 9) & 14) | (($dirty14 >> 24) & 112)).getValue().m4400unboximpl();
            }
            $composer3.endReplaceGroup();
            long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
            TextStyle mergedTextStyle = textStyle5.merge(new TextStyle(textColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            TextStyle textStyle6 = textStyle5;
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density density = (Density) objConsume2;
            final boolean isError5 = isError3;
            final boolean enabled5 = enabled2;
            final TextFieldColors colors4 = colors3;
            final boolean singleLine5 = singleLine3;
            final VisualTransformation visualTransformation5 = visualTransformation3;
            final MutableInteractionSource interactionSource5 = interactionSource4;
            final Function2 label3 = label2;
            final Function2 placeholder3 = placeholder2;
            final Function2 leadingIcon3 = leadingIcon2;
            final Function2 trailingIcon3 = trailingIcon2;
            final Shape shape4 = shape3;
            boolean readOnly6 = readOnly4;
            Composer $composer5 = $composer3;
            BasicTextFieldKt.BasicTextField(value, function1, SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier4.then(label2 != null ? PaddingKt.m742paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                }
            }), 0.0f, density.mo384toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE), isError3, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM()), enabled5, readOnly6, mergedTextStyle, keyboardOptions3, keyboardActions3, singleLine3, maxLines4, minLines3, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) null, interactionSource4, new SolidColor(colors3.cursorColor(isError3, $composer3, ($dirty14 & 14) | (($dirty14 >> 24) & 112)).getValue().m4400unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(1710364390, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function27, Composer composer, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function27, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function27, Composer $composer6, int $changed2) {
                    ComposerKt.sourceInformation($composer6, "C397@21424L293,383@20778L957:OutlinedTextField.kt#jmzs0o");
                    int $dirty4 = $changed2;
                    if (($changed2 & 6) == 0) {
                        $dirty4 |= $composer6.changedInstance(function27) ? 4 : 2;
                    }
                    if ($composer6.shouldExecute(($dirty4 & 19) != 18, $dirty4 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1710364390, $dirty4, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:383)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        int $dirty5 = $dirty4;
                        String str = value;
                        boolean z = enabled5;
                        boolean z2 = singleLine5;
                        VisualTransformation visualTransformation6 = visualTransformation5;
                        MutableInteractionSource mutableInteractionSource = interactionSource5;
                        boolean z3 = isError5;
                        Function2<Composer, Integer, Unit> function28 = label3;
                        Function2<Composer, Integer, Unit> function29 = placeholder3;
                        Function2<Composer, Integer, Unit> function210 = leadingIcon3;
                        Function2<Composer, Integer, Unit> function211 = trailingIcon3;
                        Shape shape5 = shape4;
                        TextFieldColors textFieldColors = colors4;
                        final boolean z4 = enabled5;
                        final boolean z5 = isError5;
                        final MutableInteractionSource mutableInteractionSource2 = interactionSource5;
                        final TextFieldColors textFieldColors2 = colors4;
                        final Shape shape6 = shape4;
                        textFieldDefaults.OutlinedTextFieldDecorationBox(str, function27, z, z2, visualTransformation6, mutableInteractionSource, z3, function28, function29, function210, function211, shape5, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(1757478222, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.7.1
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
                                ComposerKt.sourceInformation($composer7, "C398@21468L227:OutlinedTextField.kt#jmzs0o");
                                if ($composer7.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1757478222, $changed3, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:398)");
                                    }
                                    TextFieldDefaults.INSTANCE.m1841BorderBoxnbWgWpA(z4, z5, mutableInteractionSource2, textFieldColors2, shape6, 0.0f, 0.0f, $composer7, User32.WS_CAPTION, 96);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                $composer7.skipToGroupEnd();
                            }
                        }, $composer6, 54), $composer6, ($dirty5 << 3) & 112, 221184, 8192);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer6.skipToGroupEnd();
                }
            }, $composer3, 54), $composer5, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (($dirty14 << 12) & 3670016) | (($dirty14 << 12) & 29360128) | (($dirty14 << 12) & 234881024) | (1879048192 & ($dirty14 << 12)), (($dirty14 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ($dirty14 & 112), 4096);
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            VisualTransformation visualTransformation6 = visualTransformation3;
            singleLine2 = singleLine3;
            visualTransformation2 = visualTransformation6;
            colors2 = colors4;
            enabled3 = enabled5;
            readOnly3 = readOnly6;
            maxLines2 = maxLines4;
            minLines2 = minLines3;
            textStyle3 = textStyle6;
            label = label2;
            placeholder = placeholder2;
            leadingIcon = leadingIcon2;
            interactionSource2 = interactionSource3;
            shape2 = shape3;
            modifier3 = modifier4;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions3;
            trailingIcon = trailingIcon2;
            isError2 = isError5;
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            leadingIcon = function23;
            visualTransformation2 = visualTransformation;
            keyboardOptions2 = keyboardOptions;
            maxLines2 = maxLines;
            minLines2 = minLines;
            interactionSource2 = interactionSource;
            shape2 = shape;
            colors2 = colors;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            textStyle3 = textStyle2;
            label = function25;
            placeholder = function26;
            modifier3 = modifier2;
            trailingIcon = function24;
            isError2 = isError;
            keyboardActions2 = keyboardActions;
            singleLine2 = singleLine;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.8
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

                public final void invoke(Composer composer, int i25) {
                    OutlinedTextFieldKt.OutlinedTextField(value, function1, modifier3, enabled3, readOnly3, textStyle3, label, placeholder, leadingIcon, trailingIcon, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, minLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final /* synthetic */ void OutlinedTextField(final String value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean enabled2;
        boolean readOnly2;
        TextStyle textStyle2;
        Function2 function2;
        Function2 function22;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextFieldColors textFieldColors;
        int $dirty1;
        Composer $composer2;
        final Function2 leadingIcon2;
        final VisualTransformation visualTransformation2;
        final KeyboardOptions keyboardOptions2;
        final int maxLines2;
        final MutableInteractionSource interactionSource2;
        final Shape shape2;
        final TextFieldColors colors2;
        final boolean enabled3;
        final boolean readOnly3;
        final TextStyle textStyle3;
        final Function2 label2;
        final Function2 placeholder2;
        final Modifier modifier3;
        final Function2 label3;
        final boolean isError2;
        final KeyboardActions keyboardActions2;
        final boolean singleLine2;
        Modifier modifier4;
        TextStyle textStyle4;
        int $dirty;
        MutableInteractionSource interactionSource3;
        Shape shape3;
        int $dirty12;
        Modifier modifier5;
        TextFieldColors colors3;
        TextStyle textStyle5;
        int $dirty2;
        Function2 label4;
        Function2 placeholder3;
        Function2 leadingIcon3;
        Function2 trailingIcon2;
        boolean isError3;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean singleLine3;
        int maxLines3;
        MutableInteractionSource interactionSource4;
        Shape shape4;
        int $dirty13;
        int $dirty14;
        int i9;
        Composer $composer3 = $composer.startRestartGroup(-2099955827);
        ComposerKt.sourceInformation($composer3, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)437@22860L416:OutlinedTextField.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty15 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer3.changedInstance(onValueChange) ? 32 : 16;
        }
        int i10 = i & 4;
        if (i10 != 0) {
            $dirty3 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i11 = i & 8;
        if (i11 != 0) {
            $dirty3 |= 3072;
            enabled2 = enabled;
        } else if (($changed & 3072) == 0) {
            enabled2 = enabled;
            $dirty3 |= $composer3.changed(enabled2) ? 2048 : 1024;
        } else {
            enabled2 = enabled;
        }
        int i12 = i & 16;
        if (i12 != 0) {
            $dirty3 |= 24576;
            readOnly2 = readOnly;
        } else if (($changed & 24576) == 0) {
            readOnly2 = readOnly;
            $dirty3 |= $composer3.changed(readOnly2) ? 16384 : 8192;
        } else {
            readOnly2 = readOnly;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32) == 0) {
                textStyle2 = textStyle;
                if ($composer3.changed(textStyle2)) {
                    i9 = 131072;
                }
                $dirty3 |= i9;
            } else {
                textStyle2 = textStyle;
            }
            i9 = 65536;
            $dirty3 |= i9;
        } else {
            textStyle2 = textStyle;
        }
        int i13 = i & 64;
        if (i13 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            function2 = label;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function2 = label;
            $dirty3 |= $composer3.changedInstance(function2) ? 1048576 : 524288;
        } else {
            function2 = label;
        }
        int i14 = i & 128;
        if (i14 != 0) {
            $dirty3 |= User32.WS_CAPTION;
            function22 = placeholder;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function22 = placeholder;
            $dirty3 |= $composer3.changedInstance(function22) ? 8388608 : 4194304;
        } else {
            function22 = placeholder;
        }
        int i15 = i & 256;
        if (i15 != 0) {
            $dirty3 |= 100663296;
            i2 = i15;
        } else if (($changed & 100663296) == 0) {
            i2 = i15;
            $dirty3 |= $composer3.changedInstance(leadingIcon) ? 67108864 : 33554432;
        } else {
            i2 = i15;
        }
        int i16 = i & 512;
        if (i16 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i16;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i16;
            $dirty3 |= $composer3.changedInstance(trailingIcon) ? 536870912 : 268435456;
        } else {
            i3 = i16;
        }
        int i17 = i & 1024;
        if (i17 != 0) {
            $dirty15 |= 6;
            i4 = i17;
        } else if (($changed1 & 6) == 0) {
            i4 = i17;
            $dirty15 |= $composer3.changed(isError) ? 4 : 2;
        } else {
            i4 = i17;
        }
        int i18 = i & 2048;
        if (i18 != 0) {
            $dirty15 |= 48;
            i5 = i18;
        } else if (($changed1 & 48) == 0) {
            i5 = i18;
            $dirty15 |= $composer3.changed(visualTransformation) ? 32 : 16;
        } else {
            i5 = i18;
        }
        int i19 = i & 4096;
        if (i19 != 0) {
            $dirty15 |= 384;
            i6 = i19;
        } else {
            i6 = i19;
            if (($changed1 & 384) == 0) {
                $dirty15 |= $composer3.changed(keyboardOptions) ? 256 : 128;
            }
        }
        int i20 = i & 8192;
        if (i20 != 0) {
            $dirty15 |= 3072;
            i7 = i20;
        } else {
            i7 = i20;
            if (($changed1 & 3072) == 0) {
                $dirty15 |= $composer3.changed(keyboardActions) ? 2048 : 1024;
            }
        }
        int i21 = i & 16384;
        if (i21 != 0) {
            $dirty15 |= 24576;
            i8 = i21;
        } else {
            i8 = i21;
            if (($changed1 & 24576) == 0) {
                $dirty15 |= $composer3.changed(singleLine) ? 16384 : 8192;
            }
        }
        int i22 = i & 32768;
        if (i22 != 0) {
            $dirty15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty15 |= $composer3.changed(maxLines) ? 131072 : 65536;
        }
        int i23 = i & 65536;
        if (i23 != 0) {
            $dirty15 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty15 |= $composer3.changed(interactionSource) ? 1048576 : 524288;
        }
        if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty15 |= ((i & 131072) == 0 && $composer3.changed(shape)) ? 8388608 : 4194304;
        }
        if (($changed1 & 100663296) == 0) {
            if ((i & 262144) == 0) {
                $dirty14 = $dirty15;
                textFieldColors = colors;
                int i24 = $composer3.changed(textFieldColors) ? 67108864 : 33554432;
                $dirty1 = $dirty14 | i24;
            } else {
                $dirty14 = $dirty15;
                textFieldColors = colors;
            }
            $dirty1 = $dirty14 | i24;
        } else {
            int $dirty16 = $dirty15;
            textFieldColors = colors;
            $dirty1 = $dirty16;
        }
        if ($composer3.shouldExecute((($dirty3 & 306783379) == 306783378 && ($dirty1 & 38347923) == 38347922) ? false : true, $dirty3 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "422@22116L7,433@22676L39,434@22754L22,435@22826L25");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier6 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i11 != 0 ? true : enabled2;
                boolean readOnly4 = i12 != 0 ? false : readOnly2;
                if ((i & 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    modifier4 = modifier6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer3.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty3 & (-458753);
                } else {
                    modifier4 = modifier6;
                    textStyle4 = textStyle2;
                    $dirty = $dirty3;
                }
                Function2 label5 = i13 != 0 ? null : function2;
                Function2 placeholder4 = i14 != 0 ? null : function22;
                Function2 leadingIcon4 = i2 != 0 ? null : leadingIcon;
                Function2 trailingIcon3 = i3 != 0 ? null : trailingIcon;
                boolean isError4 = i4 != 0 ? false : isError;
                VisualTransformation visualTransformation4 = i5 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                KeyboardOptions keyboardOptions4 = i6 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                KeyboardActions keyboardActions4 = i7 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                boolean singleLine4 = i8 != 0 ? false : singleLine;
                int maxLines4 = i22 != 0 ? Integer.MAX_VALUE : maxLines;
                if (i23 != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 674166732, "CC(remember):OutlinedTextField.kt#9igjgp");
                    Object it$iv = $composer3.rememberedValue();
                    if (it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv = InteractionSourceKt.MutableInteractionSource();
                        $composer3.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    interactionSource3 = (MutableInteractionSource) it$iv;
                } else {
                    interactionSource3 = interactionSource;
                }
                if ((i & 131072) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer3, 6);
                    $dirty12 = $dirty1 & (-29360129);
                } else {
                    shape3 = shape;
                    $dirty12 = $dirty1;
                }
                if ((262144 & i) != 0) {
                    $composer2 = $composer3;
                    modifier5 = modifier4;
                    textStyle5 = textStyle4;
                    enabled2 = enabled4;
                    colors3 = TextFieldDefaults.INSTANCE.m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer2, 0, 0, 48, 2097151);
                    $dirty13 = $dirty12 & (-234881025);
                    readOnly2 = readOnly4;
                    $dirty2 = $dirty;
                    label4 = label5;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon2 = trailingIcon3;
                    isError3 = isError4;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    keyboardActions3 = keyboardActions4;
                    singleLine3 = singleLine4;
                    maxLines3 = maxLines4;
                    interactionSource4 = interactionSource3;
                    shape4 = shape3;
                } else {
                    $composer2 = $composer3;
                    modifier5 = modifier4;
                    colors3 = colors;
                    textStyle5 = textStyle4;
                    enabled2 = enabled4;
                    readOnly2 = readOnly4;
                    $dirty2 = $dirty;
                    label4 = label5;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon2 = trailingIcon3;
                    isError3 = isError4;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    keyboardActions3 = keyboardActions4;
                    singleLine3 = singleLine4;
                    maxLines3 = maxLines4;
                    interactionSource4 = interactionSource3;
                    shape4 = shape3;
                    $dirty13 = $dirty12;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 32) != 0) {
                    $dirty3 &= -458753;
                }
                if ((i & 131072) != 0) {
                    $dirty1 &= -29360129;
                }
                if ((262144 & i) != 0) {
                    int i25 = $dirty1 & (-234881025);
                    leadingIcon3 = leadingIcon;
                    trailingIcon2 = trailingIcon;
                    keyboardOptions3 = keyboardOptions;
                    keyboardActions3 = keyboardActions;
                    singleLine3 = singleLine;
                    maxLines3 = maxLines;
                    interactionSource4 = interactionSource;
                    shape4 = shape;
                    $dirty13 = i25;
                    $composer2 = $composer3;
                    $dirty2 = $dirty3;
                    colors3 = textFieldColors;
                    textStyle5 = textStyle2;
                    label4 = function2;
                    placeholder3 = function22;
                    modifier5 = modifier2;
                    isError3 = isError;
                    visualTransformation3 = visualTransformation;
                } else {
                    leadingIcon3 = leadingIcon;
                    trailingIcon2 = trailingIcon;
                    keyboardOptions3 = keyboardOptions;
                    keyboardActions3 = keyboardActions;
                    singleLine3 = singleLine;
                    maxLines3 = maxLines;
                    shape4 = shape;
                    $composer2 = $composer3;
                    $dirty2 = $dirty3;
                    colors3 = textFieldColors;
                    textStyle5 = textStyle2;
                    label4 = function2;
                    placeholder3 = function22;
                    modifier5 = modifier2;
                    $dirty13 = $dirty1;
                    isError3 = isError;
                    visualTransformation3 = visualTransformation;
                    interactionSource4 = interactionSource;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2099955827, $dirty2, $dirty13, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:436)");
            }
            OutlinedTextField(value, (Function1<? super String, Unit>) onValueChange, modifier5, enabled2, readOnly2, textStyle5, (Function2<? super Composer, ? super Integer, Unit>) label4, (Function2<? super Composer, ? super Integer, Unit>) placeholder3, (Function2<? super Composer, ? super Integer, Unit>) leadingIcon3, (Function2<? super Composer, ? super Integer, Unit>) trailingIcon2, isError3, visualTransformation3, keyboardOptions3, keyboardActions3, singleLine3, maxLines3, 1, interactionSource4, shape4, colors3, $composer2, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (458752 & $dirty2) | (3670016 & $dirty2) | (29360128 & $dirty2) | (234881024 & $dirty2) | (1879048192 & $dirty2), ($dirty13 & 14) | JNINativeInterface.JNI_VERSION_24 | ($dirty13 & 112) | ($dirty13 & User32.WM_PENWINFIRST) | ($dirty13 & GL11.GL_RENDER) | (57344 & $dirty13) | (458752 & $dirty13) | (($dirty13 << 3) & 29360128) | (($dirty13 << 3) & 234881024) | (($dirty13 << 3) & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            textStyle3 = textStyle5;
            label2 = label4;
            placeholder2 = placeholder3;
            leadingIcon2 = leadingIcon3;
            label3 = trailingIcon2;
            isError2 = isError3;
            visualTransformation2 = visualTransformation3;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions3;
            singleLine2 = singleLine3;
            maxLines2 = maxLines3;
            interactionSource2 = interactionSource4;
            shape2 = shape4;
            colors2 = colors3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            leadingIcon2 = leadingIcon;
            visualTransformation2 = visualTransformation;
            keyboardOptions2 = keyboardOptions;
            maxLines2 = maxLines;
            interactionSource2 = interactionSource;
            shape2 = shape;
            colors2 = colors;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            textStyle3 = textStyle2;
            label2 = function2;
            placeholder2 = function22;
            modifier3 = modifier2;
            label3 = trailingIcon;
            isError2 = isError;
            keyboardActions2 = keyboardActions;
            singleLine2 = singleLine;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.10
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

                public final void invoke(Composer composer, int i26) {
                    OutlinedTextFieldKt.OutlinedTextField(value, onValueChange, modifier3, enabled3, readOnly3, textStyle3, label2, placeholder2, leadingIcon2, label3, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    public static final void OutlinedTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean enabled2;
        boolean readOnly2;
        TextStyle textStyle2;
        Function2 function25;
        Function2 function26;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int $dirty1;
        Composer $composer2;
        final Function2 leadingIcon;
        final VisualTransformation visualTransformation2;
        final KeyboardOptions keyboardOptions2;
        final int maxLines2;
        final int minLines2;
        final MutableInteractionSource interactionSource2;
        final Shape shape2;
        final TextFieldColors colors2;
        final boolean enabled3;
        final boolean readOnly3;
        final TextStyle textStyle3;
        final Function2 label;
        final Function2 placeholder;
        final Modifier modifier3;
        final Function2 trailingIcon;
        final boolean isError2;
        final KeyboardActions keyboardActions2;
        final boolean singleLine2;
        Modifier.Companion modifier4;
        int i8;
        int $dirty;
        TextStyle textStyle4;
        Function2 label2;
        Function2 placeholder2;
        Function2 leadingIcon2;
        Function2 trailingIcon2;
        int $dirty12;
        KeyboardActions keyboardActions3;
        int maxLines3;
        MutableInteractionSource interactionSource3;
        Shape shape3;
        int $dirty13;
        Composer $composer3;
        TextFieldColors colors3;
        KeyboardActions keyboardActions4;
        TextStyle textStyle5;
        int $dirty2;
        boolean isError3;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean singleLine3;
        int maxLines4;
        int minLines3;
        int $dirty14;
        boolean readOnly4;
        int $dirty15;
        MutableInteractionSource interactionSource4;
        TextStyle mergedTextStyle;
        Modifier.Companion companionM742paddingqDBjuR0$default;
        int $dirty16;
        Composer $composer4 = $composer.startRestartGroup(237745923);
        ComposerKt.sourceInformation($composer4, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)554@29288L7,572@30007L38,581@30390L20,590@30744L1030,557@29344L2436:OutlinedTextField.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty17 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer4.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i & 4;
        if (i9 != 0) {
            $dirty3 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer4.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 8;
        if (i10 != 0) {
            $dirty3 |= 3072;
            enabled2 = enabled;
        } else if (($changed & 3072) == 0) {
            enabled2 = enabled;
            $dirty3 |= $composer4.changed(enabled2) ? 2048 : 1024;
        } else {
            enabled2 = enabled;
        }
        int i11 = i & 16;
        if (i11 != 0) {
            $dirty3 |= 24576;
            readOnly2 = readOnly;
        } else if (($changed & 24576) == 0) {
            readOnly2 = readOnly;
            $dirty3 |= $composer4.changed(readOnly2) ? 16384 : 8192;
        } else {
            readOnly2 = readOnly;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32) == 0) {
                textStyle2 = textStyle;
                int i12 = $composer4.changed(textStyle2) ? 131072 : 65536;
                $dirty3 |= i12;
            } else {
                textStyle2 = textStyle;
            }
            $dirty3 |= i12;
        } else {
            textStyle2 = textStyle;
        }
        int i13 = i & 64;
        if (i13 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            function25 = function2;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function25 = function2;
            $dirty3 |= $composer4.changedInstance(function25) ? 1048576 : 524288;
        } else {
            function25 = function2;
        }
        int i14 = i & 128;
        if (i14 != 0) {
            $dirty3 |= User32.WS_CAPTION;
            function26 = function22;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function26 = function22;
            $dirty3 |= $composer4.changedInstance(function26) ? 8388608 : 4194304;
        } else {
            function26 = function22;
        }
        int i15 = i & 256;
        if (i15 != 0) {
            $dirty3 |= 100663296;
            i2 = i15;
        } else if (($changed & 100663296) == 0) {
            i2 = i15;
            $dirty3 |= $composer4.changedInstance(function23) ? 67108864 : 33554432;
        } else {
            i2 = i15;
        }
        int i16 = i & 512;
        if (i16 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i16;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i16;
            $dirty3 |= $composer4.changedInstance(function24) ? 536870912 : 268435456;
        } else {
            i3 = i16;
        }
        int i17 = i & 1024;
        if (i17 != 0) {
            $dirty17 |= 6;
            i4 = i17;
        } else if (($changed1 & 6) == 0) {
            i4 = i17;
            $dirty17 |= $composer4.changed(isError) ? 4 : 2;
        } else {
            i4 = i17;
        }
        int i18 = i & 2048;
        if (i18 != 0) {
            $dirty17 |= 48;
            i5 = i18;
        } else if (($changed1 & 48) == 0) {
            i5 = i18;
            $dirty17 |= $composer4.changed(visualTransformation) ? 32 : 16;
        } else {
            i5 = i18;
        }
        int i19 = i & 4096;
        if (i19 != 0) {
            $dirty17 |= 384;
            i6 = i19;
        } else {
            i6 = i19;
            if (($changed1 & 384) == 0) {
                $dirty17 |= $composer4.changed(keyboardOptions) ? 256 : 128;
            }
        }
        if (($changed1 & 3072) == 0) {
            $dirty17 |= ((i & 8192) == 0 && $composer4.changed(keyboardActions)) ? 2048 : 1024;
        }
        int i20 = i & 16384;
        if (i20 != 0) {
            $dirty17 |= 24576;
            i7 = i20;
        } else {
            i7 = i20;
            if (($changed1 & 24576) == 0) {
                $dirty17 |= $composer4.changed(singleLine) ? 16384 : 8192;
            }
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty17 |= ((i & 32768) == 0 && $composer4.changed(maxLines)) ? 131072 : 65536;
        }
        int i21 = i & 65536;
        if (i21 != 0) {
            $dirty17 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty17 |= $composer4.changed(minLines) ? 1048576 : 524288;
        }
        int i22 = i & 131072;
        if (i22 != 0) {
            $dirty17 |= User32.WS_CAPTION;
        } else if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty17 |= $composer4.changed(interactionSource) ? 8388608 : 4194304;
        }
        if (($changed1 & 100663296) == 0) {
            $dirty17 |= ((i & 262144) == 0 && $composer4.changed(shape)) ? 67108864 : 33554432;
        }
        if (($changed1 & LZMA2Options.DICT_SIZE_MAX) == 0) {
            if ((i & 524288) == 0) {
                $dirty16 = $dirty17;
                int i23 = $composer4.changed(colors) ? 536870912 : 268435456;
                $dirty1 = $dirty16 | i23;
            } else {
                $dirty16 = $dirty17;
            }
            $dirty1 = $dirty16 | i23;
        } else {
            $dirty1 = $dirty17;
        }
        int $dirty4 = $dirty3;
        if ($composer4.shouldExecute((($dirty3 & 306783379) == 306783378 && (306783379 & $dirty1) == 306783378) ? false : true, $dirty4 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "532@28151L7,545@28795L22,546@28867L25");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                boolean readOnly5 = i11 != 0 ? false : readOnly2;
                if ((i & 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    i8 = -458753;
                    ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer4.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty4 & (-458753);
                } else {
                    i8 = -458753;
                    $dirty = $dirty4;
                    textStyle4 = textStyle2;
                }
                label2 = i13 != 0 ? null : function25;
                placeholder2 = i14 != 0 ? null : function26;
                leadingIcon2 = i2 != 0 ? null : function23;
                trailingIcon2 = i3 != 0 ? null : function24;
                boolean isError4 = i4 != 0 ? false : isError;
                VisualTransformation visualTransformation4 = i5 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                KeyboardOptions keyboardOptions4 = i6 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                if ((i & 8192) != 0) {
                    $dirty12 = $dirty1 & (-7169);
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                } else {
                    $dirty12 = $dirty1;
                    keyboardActions3 = keyboardActions;
                }
                boolean singleLine4 = i7 != 0 ? false : singleLine;
                if ((32768 & i) != 0) {
                    $dirty12 &= i8;
                    maxLines3 = singleLine4 ? 1 : Integer.MAX_VALUE;
                } else {
                    maxLines3 = maxLines;
                }
                int minLines4 = i21 != 0 ? 1 : minLines;
                interactionSource3 = i22 != 0 ? null : interactionSource;
                if ((262144 & i) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer4, 6);
                    $dirty13 = $dirty12 & (-234881025);
                } else {
                    shape3 = shape;
                    $dirty13 = $dirty12;
                }
                if ((i & 524288) != 0) {
                    TextFieldColors colors4 = TextFieldDefaults.INSTANCE.m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, 48, 2097151);
                    $composer3 = $composer4;
                    keyboardActions4 = keyboardActions3;
                    $dirty14 = $dirty13 & (-1879048193);
                    enabled2 = enabled4;
                    readOnly2 = readOnly5;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                    colors3 = colors4;
                    isError3 = isError4;
                } else {
                    $composer3 = $composer4;
                    colors3 = colors;
                    keyboardActions4 = keyboardActions3;
                    enabled2 = enabled4;
                    readOnly2 = readOnly5;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    isError3 = isError4;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                    $dirty14 = $dirty13;
                }
            } else {
                $composer4.skipToGroupEnd();
                int $dirty5 = (i & 32) != 0 ? $dirty4 & (-458753) : $dirty4;
                if ((i & 8192) != 0) {
                    $dirty1 &= -7169;
                }
                if ((32768 & i) != 0) {
                    $dirty1 &= -458753;
                }
                if ((262144 & i) != 0) {
                    $dirty1 &= -234881025;
                }
                if ((i & 524288) != 0) {
                    $dirty1 &= -1879048193;
                }
                leadingIcon2 = function23;
                trailingIcon2 = function24;
                isError3 = isError;
                singleLine3 = singleLine;
                maxLines4 = maxLines;
                interactionSource3 = interactionSource;
                shape3 = shape;
                colors3 = colors;
                $dirty14 = $dirty1;
                $composer3 = $composer4;
                textStyle5 = textStyle2;
                label2 = function25;
                placeholder2 = function26;
                keyboardOptions3 = keyboardOptions;
                keyboardActions4 = keyboardActions;
                minLines3 = minLines;
                $dirty2 = $dirty5;
                modifier4 = modifier2;
                visualTransformation3 = visualTransformation;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                readOnly4 = readOnly2;
                ComposerKt.traceEventStart(237745923, $dirty2, $dirty14, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:547)");
            } else {
                readOnly4 = readOnly2;
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(-569416202);
                ComposerKt.sourceInformation($composer3, "549@28978L39");
                ComposerKt.sourceInformationMarkerStart($composer3, 674368396, "CC(remember):OutlinedTextField.kt#9igjgp");
                Composer $this$cache$iv = $composer3;
                Object it$iv = $this$cache$iv.rememberedValue();
                $dirty15 = $dirty14;
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = InteractionSourceKt.MutableInteractionSource();
                    $this$cache$iv.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                interactionSource4 = (MutableInteractionSource) it$iv;
            } else {
                $dirty15 = $dirty14;
                $composer3.startReplaceGroup(674367745);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            $composer3.startReplaceGroup(674373491);
            ComposerKt.sourceInformation($composer3, "*551@29157L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle5.m6489getColor0d7_KjU();
            if (!($this$takeOrElse_u2dDxMtmZc$iv != 16)) {
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 9) & 14) | (($dirty15 >> 24) & 112)).getValue().m4400unboximpl();
            }
            $composer3.endReplaceGroup();
            long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
            TextStyle mergedTextStyle2 = textStyle5.merge(new TextStyle(textColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            TextStyle textStyle6 = textStyle5;
            final boolean enabled5 = enabled2;
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density density = (Density) objConsume2;
            if (label2 != null) {
                mergedTextStyle = mergedTextStyle2;
                companionM742paddingqDBjuR0$default = PaddingKt.m742paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.11
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver $this$semantics) {
                    }
                }), 0.0f, density.mo384toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
            } else {
                mergedTextStyle = mergedTextStyle2;
                companionM742paddingqDBjuR0$default = Modifier.INSTANCE;
            }
            final boolean isError5 = isError3;
            final TextFieldColors colors5 = colors3;
            final boolean singleLine5 = singleLine3;
            final VisualTransformation visualTransformation5 = visualTransformation3;
            final MutableInteractionSource interactionSource5 = interactionSource4;
            final Function2 label3 = label2;
            final Function2 placeholder3 = placeholder2;
            final Function2 leadingIcon3 = leadingIcon2;
            final Function2 trailingIcon3 = trailingIcon2;
            final Shape shape4 = shape3;
            boolean readOnly6 = readOnly4;
            Composer $composer5 = $composer3;
            BasicTextFieldKt.BasicTextField(value, function1, SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier4.then(companionM742paddingqDBjuR0$default), isError3, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM()), enabled5, readOnly6, mergedTextStyle, keyboardOptions3, keyboardActions4, singleLine3, maxLines4, minLines3, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) null, interactionSource4, new SolidColor(colors3.cursorColor(isError3, $composer3, ($dirty15 & 14) | (($dirty15 >> 24) & 112)).getValue().m4400unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-1001528775, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function27, Composer composer, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function27, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function27, Composer $composer6, int $changed2) {
                    ComposerKt.sourceInformation($composer6, "C605@31449L293,591@30798L962:OutlinedTextField.kt#jmzs0o");
                    int $dirty6 = $changed2;
                    if (($changed2 & 6) == 0) {
                        $dirty6 |= $composer6.changedInstance(function27) ? 4 : 2;
                    }
                    if ($composer6.shouldExecute(($dirty6 & 19) != 18, $dirty6 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1001528775, $dirty6, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:591)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String text = value.getText();
                        boolean z = enabled5;
                        int $dirty7 = $dirty6;
                        boolean z2 = singleLine5;
                        VisualTransformation visualTransformation6 = visualTransformation5;
                        MutableInteractionSource mutableInteractionSource = interactionSource5;
                        boolean z3 = isError5;
                        Function2<Composer, Integer, Unit> function28 = label3;
                        Function2<Composer, Integer, Unit> function29 = placeholder3;
                        Function2<Composer, Integer, Unit> function210 = leadingIcon3;
                        Function2<Composer, Integer, Unit> function211 = trailingIcon3;
                        Shape shape5 = shape4;
                        TextFieldColors textFieldColors = colors5;
                        final boolean z4 = enabled5;
                        final boolean z5 = isError5;
                        final MutableInteractionSource mutableInteractionSource2 = interactionSource5;
                        final TextFieldColors textFieldColors2 = colors5;
                        final Shape shape6 = shape4;
                        textFieldDefaults.OutlinedTextFieldDecorationBox(text, function27, z, z2, visualTransformation6, mutableInteractionSource, z3, function28, function29, function210, function211, shape5, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(-794566495, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.13.1
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
                                ComposerKt.sourceInformation($composer7, "C606@31493L227:OutlinedTextField.kt#jmzs0o");
                                if ($composer7.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-794566495, $changed3, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:606)");
                                    }
                                    TextFieldDefaults.INSTANCE.m1841BorderBoxnbWgWpA(z4, z5, mutableInteractionSource2, textFieldColors2, shape6, 0.0f, 0.0f, $composer7, User32.WS_CAPTION, 96);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                $composer7.skipToGroupEnd();
                            }
                        }, $composer6, 54), $composer6, ($dirty7 << 3) & 112, 221184, 8192);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer6.skipToGroupEnd();
                }
            }, $composer3, 54), $composer5, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (($dirty15 << 12) & 3670016) | (($dirty15 << 12) & 29360128) | (($dirty15 << 12) & 234881024) | (1879048192 & ($dirty15 << 12)), (($dirty15 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ($dirty15 & 112), 4096);
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            VisualTransformation visualTransformation6 = visualTransformation3;
            singleLine2 = singleLine3;
            visualTransformation2 = visualTransformation6;
            textStyle3 = textStyle6;
            colors2 = colors5;
            enabled3 = enabled5;
            readOnly3 = readOnly6;
            maxLines2 = maxLines4;
            minLines2 = minLines3;
            label = label2;
            placeholder = placeholder2;
            leadingIcon = leadingIcon2;
            interactionSource2 = interactionSource3;
            shape2 = shape3;
            modifier3 = modifier4;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions4;
            trailingIcon = trailingIcon2;
            isError2 = isError5;
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            leadingIcon = function23;
            visualTransformation2 = visualTransformation;
            keyboardOptions2 = keyboardOptions;
            maxLines2 = maxLines;
            minLines2 = minLines;
            interactionSource2 = interactionSource;
            shape2 = shape;
            colors2 = colors;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            textStyle3 = textStyle2;
            label = function25;
            placeholder = function26;
            modifier3 = modifier2;
            trailingIcon = function24;
            isError2 = isError;
            keyboardActions2 = keyboardActions;
            singleLine2 = singleLine;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.14
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
                    OutlinedTextFieldKt.OutlinedTextField(value, function1, modifier3, enabled3, readOnly3, textStyle3, label, placeholder, leadingIcon, trailingIcon, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, minLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final /* synthetic */ void OutlinedTextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
        Modifier modifier2;
        boolean enabled2;
        boolean readOnly2;
        TextStyle textStyle2;
        Function2 function2;
        Function2 function22;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TextFieldColors textFieldColors;
        int $dirty1;
        Composer $composer2;
        final Function2 leadingIcon2;
        final VisualTransformation visualTransformation2;
        final KeyboardOptions keyboardOptions2;
        final int maxLines2;
        final MutableInteractionSource interactionSource2;
        final Shape shape2;
        final TextFieldColors colors2;
        final boolean enabled3;
        final boolean readOnly3;
        final TextStyle textStyle3;
        final Function2 label2;
        final Function2 placeholder2;
        final Modifier modifier3;
        final Function2 label3;
        final boolean isError2;
        final KeyboardActions keyboardActions2;
        final boolean singleLine2;
        int $dirty;
        TextStyle textStyle4;
        int $dirty12;
        KeyboardActions keyboardActions3;
        MutableInteractionSource interactionSource3;
        Shape shape3;
        int $dirty13;
        TextFieldColors colors3;
        KeyboardActions keyboardActions4;
        Modifier modifier4;
        TextStyle textStyle5;
        int $dirty2;
        Function2 label4;
        Function2 placeholder3;
        Function2 leadingIcon3;
        Function2 trailingIcon2;
        boolean isError3;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean singleLine3;
        int maxLines3;
        MutableInteractionSource interactionSource4;
        Shape shape4;
        int $dirty14;
        int i8;
        Composer $composer3 = $composer.startRestartGroup(-288998816);
        ComposerKt.sourceInformation($composer3, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)645@32895L416:OutlinedTextField.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty15 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer3.changedInstance(onValueChange) ? 32 : 16;
        }
        int i9 = i & 4;
        if (i9 != 0) {
            $dirty3 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 8;
        if (i10 != 0) {
            $dirty3 |= 3072;
            enabled2 = enabled;
        } else if (($changed & 3072) == 0) {
            enabled2 = enabled;
            $dirty3 |= $composer3.changed(enabled2) ? 2048 : 1024;
        } else {
            enabled2 = enabled;
        }
        int i11 = i & 16;
        if (i11 != 0) {
            $dirty3 |= 24576;
            readOnly2 = readOnly;
        } else if (($changed & 24576) == 0) {
            readOnly2 = readOnly;
            $dirty3 |= $composer3.changed(readOnly2) ? 16384 : 8192;
        } else {
            readOnly2 = readOnly;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32) == 0) {
                textStyle2 = textStyle;
                if ($composer3.changed(textStyle2)) {
                    i8 = 131072;
                }
                $dirty3 |= i8;
            } else {
                textStyle2 = textStyle;
            }
            i8 = 65536;
            $dirty3 |= i8;
        } else {
            textStyle2 = textStyle;
        }
        int i12 = i & 64;
        if (i12 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            function2 = label;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function2 = label;
            $dirty3 |= $composer3.changedInstance(function2) ? 1048576 : 524288;
        } else {
            function2 = label;
        }
        int i13 = i & 128;
        if (i13 != 0) {
            $dirty3 |= User32.WS_CAPTION;
            function22 = placeholder;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function22 = placeholder;
            $dirty3 |= $composer3.changedInstance(function22) ? 8388608 : 4194304;
        } else {
            function22 = placeholder;
        }
        int i14 = i & 256;
        if (i14 != 0) {
            $dirty3 |= 100663296;
            i2 = i14;
        } else if (($changed & 100663296) == 0) {
            i2 = i14;
            $dirty3 |= $composer3.changedInstance(leadingIcon) ? 67108864 : 33554432;
        } else {
            i2 = i14;
        }
        int i15 = i & 512;
        if (i15 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i15;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i15;
            $dirty3 |= $composer3.changedInstance(trailingIcon) ? 536870912 : 268435456;
        } else {
            i3 = i15;
        }
        int i16 = i & 1024;
        if (i16 != 0) {
            $dirty15 |= 6;
            i4 = i16;
        } else if (($changed1 & 6) == 0) {
            i4 = i16;
            $dirty15 |= $composer3.changed(isError) ? 4 : 2;
        } else {
            i4 = i16;
        }
        int i17 = i & 2048;
        if (i17 != 0) {
            $dirty15 |= 48;
            i5 = i17;
        } else if (($changed1 & 48) == 0) {
            i5 = i17;
            $dirty15 |= $composer3.changed(visualTransformation) ? 32 : 16;
        } else {
            i5 = i17;
        }
        int i18 = i & 4096;
        if (i18 != 0) {
            $dirty15 |= 384;
            i6 = i18;
        } else {
            i6 = i18;
            if (($changed1 & 384) == 0) {
                $dirty15 |= $composer3.changed(keyboardOptions) ? 256 : 128;
            }
        }
        if (($changed1 & 3072) == 0) {
            $dirty15 |= ((i & 8192) == 0 && $composer3.changed(keyboardActions)) ? 2048 : 1024;
        }
        int i19 = i & 16384;
        if (i19 != 0) {
            $dirty15 |= 24576;
            i7 = i19;
        } else {
            i7 = i19;
            if (($changed1 & 24576) == 0) {
                $dirty15 |= $composer3.changed(singleLine) ? 16384 : 8192;
            }
        }
        int i20 = i & 32768;
        if (i20 != 0) {
            $dirty15 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty15 |= $composer3.changed(maxLines) ? 131072 : 65536;
        }
        int i21 = i & 65536;
        if (i21 != 0) {
            $dirty15 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty15 |= $composer3.changed(interactionSource) ? 1048576 : 524288;
        }
        if (($changed1 & User32.WS_CAPTION) == 0) {
            $dirty15 |= ((i & 131072) == 0 && $composer3.changed(shape)) ? 8388608 : 4194304;
        }
        if (($changed1 & 100663296) == 0) {
            if ((i & 262144) == 0) {
                $dirty14 = $dirty15;
                textFieldColors = colors;
                int i22 = $composer3.changed(textFieldColors) ? 67108864 : 33554432;
                $dirty1 = $dirty14 | i22;
            } else {
                $dirty14 = $dirty15;
                textFieldColors = colors;
            }
            $dirty1 = $dirty14 | i22;
        } else {
            int $dirty16 = $dirty15;
            textFieldColors = colors;
            $dirty1 = $dirty16;
        }
        int $dirty4 = $dirty3;
        if ($composer3.shouldExecute((($dirty3 & 306783379) == 306783378 && (38347923 & $dirty1) == 38347922) ? false : true, $dirty4 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "630@32157L7,641@32711L39,642@32789L22,643@32861L25");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier5 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                boolean readOnly4 = i11 != 0 ? false : readOnly2;
                if ((i & 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer3.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty4 & (-458753);
                } else {
                    $dirty = $dirty4;
                    textStyle4 = textStyle2;
                }
                Function2 label5 = i12 != 0 ? null : function2;
                Function2 placeholder4 = i13 != 0 ? null : function22;
                Function2 leadingIcon4 = i2 != 0 ? null : leadingIcon;
                Function2 trailingIcon3 = i3 != 0 ? null : trailingIcon;
                boolean isError4 = i4 != 0 ? false : isError;
                VisualTransformation visualTransformation4 = i5 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                KeyboardOptions keyboardOptions4 = i6 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                if ((i & 8192) != 0) {
                    $dirty12 = $dirty1 & (-7169);
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                } else {
                    $dirty12 = $dirty1;
                    keyboardActions3 = keyboardActions;
                }
                boolean singleLine4 = i7 != 0 ? false : singleLine;
                int maxLines4 = i20 != 0 ? Integer.MAX_VALUE : maxLines;
                if (i21 != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 674487852, "CC(remember):OutlinedTextField.kt#9igjgp");
                    Object it$iv = $composer3.rememberedValue();
                    if (it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv = InteractionSourceKt.MutableInteractionSource();
                        $composer3.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    interactionSource3 = (MutableInteractionSource) it$iv;
                } else {
                    interactionSource3 = interactionSource;
                }
                if ((i & 131072) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape($composer3, 6);
                    $dirty13 = $dirty12 & (-29360129);
                } else {
                    shape3 = shape;
                    $dirty13 = $dirty12;
                }
                if ((262144 & i) != 0) {
                    $composer2 = $composer3;
                    keyboardActions4 = keyboardActions3;
                    modifier4 = modifier5;
                    colors3 = TextFieldDefaults.INSTANCE.m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer2, 0, 0, 48, 2097151);
                    $dirty1 = $dirty13 & (-234881025);
                    enabled2 = enabled4;
                    readOnly2 = readOnly4;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    label4 = label5;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon2 = trailingIcon3;
                    isError3 = isError4;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines3 = maxLines4;
                    interactionSource4 = interactionSource3;
                    shape4 = shape3;
                } else {
                    $composer2 = $composer3;
                    colors3 = colors;
                    keyboardActions4 = keyboardActions3;
                    modifier4 = modifier5;
                    enabled2 = enabled4;
                    readOnly2 = readOnly4;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    label4 = label5;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon2 = trailingIcon3;
                    isError3 = isError4;
                    visualTransformation3 = visualTransformation4;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines3 = maxLines4;
                    interactionSource4 = interactionSource3;
                    shape4 = shape3;
                    $dirty1 = $dirty13;
                }
            } else {
                $composer3.skipToGroupEnd();
                int $dirty5 = (i & 32) != 0 ? $dirty4 & (-458753) : $dirty4;
                if ((i & 8192) != 0) {
                    $dirty1 &= -7169;
                }
                if ((i & 131072) != 0) {
                    $dirty1 &= -29360129;
                }
                if ((262144 & i) != 0) {
                    $dirty1 &= -234881025;
                }
                leadingIcon3 = leadingIcon;
                trailingIcon2 = trailingIcon;
                keyboardOptions3 = keyboardOptions;
                keyboardActions4 = keyboardActions;
                singleLine3 = singleLine;
                maxLines3 = maxLines;
                interactionSource4 = interactionSource;
                shape4 = shape;
                $composer2 = $composer3;
                $dirty2 = $dirty5;
                colors3 = textFieldColors;
                textStyle5 = textStyle2;
                label4 = function2;
                placeholder3 = function22;
                modifier4 = modifier2;
                isError3 = isError;
                visualTransformation3 = visualTransformation;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288998816, $dirty2, $dirty1, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:644)");
            }
            OutlinedTextField(value, (Function1<? super TextFieldValue, Unit>) onValueChange, modifier4, enabled2, readOnly2, textStyle5, (Function2<? super Composer, ? super Integer, Unit>) label4, (Function2<? super Composer, ? super Integer, Unit>) placeholder3, (Function2<? super Composer, ? super Integer, Unit>) leadingIcon3, (Function2<? super Composer, ? super Integer, Unit>) trailingIcon2, isError3, visualTransformation3, keyboardOptions3, keyboardActions4, singleLine3, maxLines3, 1, interactionSource4, shape4, colors3, $composer2, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (458752 & $dirty2) | (3670016 & $dirty2) | (29360128 & $dirty2) | (234881024 & $dirty2) | (1879048192 & $dirty2), ($dirty1 & 14) | JNINativeInterface.JNI_VERSION_24 | ($dirty1 & 112) | ($dirty1 & User32.WM_PENWINFIRST) | ($dirty1 & GL11.GL_RENDER) | (57344 & $dirty1) | (458752 & $dirty1) | (($dirty1 << 3) & 29360128) | (($dirty1 << 3) & 234881024) | (($dirty1 << 3) & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            textStyle3 = textStyle5;
            label2 = label4;
            placeholder2 = placeholder3;
            leadingIcon2 = leadingIcon3;
            label3 = trailingIcon2;
            isError2 = isError3;
            visualTransformation2 = visualTransformation3;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions4;
            singleLine2 = singleLine3;
            maxLines2 = maxLines3;
            interactionSource2 = interactionSource4;
            shape2 = shape4;
            colors2 = colors3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            leadingIcon2 = leadingIcon;
            visualTransformation2 = visualTransformation;
            keyboardOptions2 = keyboardOptions;
            maxLines2 = maxLines;
            interactionSource2 = interactionSource;
            shape2 = shape;
            colors2 = colors;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            textStyle3 = textStyle2;
            label2 = function2;
            placeholder2 = function22;
            modifier3 = modifier2;
            label3 = trailingIcon;
            isError2 = isError;
            keyboardActions2 = keyboardActions;
            singleLine2 = singleLine;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.16
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

                public final void invoke(Composer composer, int i23) {
                    OutlinedTextFieldKt.OutlinedTextField(value, onValueChange, modifier3, enabled3, readOnly3, textStyle3, label2, placeholder2, leadingIcon2, label3, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean singleLine, final float animationProgress, final Function1<? super Size, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function25, final PaddingValues paddingValues, Composer $composer, final int $changed, final int $changed1) {
        Function2<? super Composer, ? super Integer, Unit> function26;
        Composer $composer2;
        Function0 factory$iv$iv;
        float f;
        float f2;
        Function0 factory$iv$iv$iv;
        Function0 factory$iv$iv$iv2;
        int $changed$iv;
        Function0 factory$iv$iv$iv3;
        Function0 factory$iv$iv$iv4;
        Composer $composer3 = $composer.startRestartGroup(-2049536174);
        ComposerKt.sourceInformation($composer3, "C(OutlinedTextFieldLayout)P(4,9,7,2,3,10,8!1,5)689@34038L267,697@34353L7,698@34365L2410:OutlinedTextField.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(modifier) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function2) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function3) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function22) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changed(singleLine) ? 1048576 : 524288;
        }
        if (($changed & User32.WS_CAPTION) == 0) {
            $dirty |= $composer3.changed(animationProgress) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 67108864 : 33554432;
        }
        if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            $dirty |= $composer3.changedInstance(function25) ? 536870912 : 268435456;
        }
        if (($changed1 & 6) == 0) {
            $dirty1 |= $composer3.changed(paddingValues) ? 4 : 2;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty1 & 3) == 2) ? false : true, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, $dirty, $dirty1, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:687)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1860267526, "CC(remember):OutlinedTextField.kt#9igjgp");
            boolean invalid$iv = ((234881024 & $dirty) == 67108864) | ((3670016 & $dirty) == 1048576) | ((29360128 & $dirty) == 8388608) | (($dirty1 & 14) == 4);
            Object value$iv = $composer3.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new OutlinedTextFieldMeasurePolicy(function1, singleLine, animationProgress, paddingValues);
                $composer3.updateRememberedValue(value$iv);
            }
            OutlinedTextFieldMeasurePolicy measurePolicy = (OutlinedTextFieldMeasurePolicy) value$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume;
            int $changed$iv2 = ($dirty << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap localMap$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer3, modifier);
            Function0 factory$iv$iv2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv = (($changed$iv2 << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                factory$iv$iv = factory$iv$iv2;
                $composer3.createNode(factory$iv$iv);
            } else {
                factory$iv$iv = factory$iv$iv2;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv = Updater.m3832constructorimpl($composer3);
            int $dirty2 = $dirty;
            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 block$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if ($this$Layout_u24lambda_u240$iv.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv))) {
                $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
                $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), block$iv$iv);
            }
            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -978125414, "C706@34869L8,746@36419L182:OutlinedTextField.kt#jmzs0o");
            function25.invoke($composer3, Integer.valueOf(($dirty2 >> 27) & 14));
            if (function23 != null) {
                $composer3.startReplaceGroup(-978132235);
                ComposerKt.sourceInformation($composer3, "709@34930L223");
                Modifier modifier$iv = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading"));
                Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                $composer2 = $composer3;
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                int $changed$iv$iv2 = (48 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
                Function0 factory$iv$iv$iv5 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv = (($changed$iv$iv2 << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    factory$iv$iv$iv4 = factory$iv$iv$iv5;
                    $composer3.createNode(factory$iv$iv$iv4);
                } else {
                    factory$iv$iv$iv4 = factory$iv$iv$iv5;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3832constructorimpl($composer3);
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 block$iv$iv$iv = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if ($this$Layout_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
                    $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
                    $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
                }
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i3 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 1899197773, "C713@35126L9:OutlinedTextField.kt#jmzs0o");
                function23.invoke($composer3, Integer.valueOf(($dirty2 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer2 = $composer3;
                $composer3.startReplaceGroup(-977887180);
                $composer3.endReplaceGroup();
            }
            if (function24 != null) {
                $composer3.startReplaceGroup(-977844493);
                ComposerKt.sourceInformation($composer3, "717@35220L225");
                Modifier modifier$iv2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing"));
                Alignment contentAlignment$iv2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
                int $changed$iv$iv3 = (48 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
                Function0 factory$iv$iv$iv6 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = (($changed$iv$iv3 << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    factory$iv$iv$iv3 = factory$iv$iv$iv6;
                    $composer3.createNode(factory$iv$iv$iv3);
                } else {
                    factory$iv$iv$iv3 = factory$iv$iv$iv6;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3832constructorimpl($composer3);
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 block$iv$iv$iv2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2))) {
                    $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
                    $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), block$iv$iv$iv2);
                }
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                int i4 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i5 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 1899486476, "C721@35417L10:OutlinedTextField.kt#jmzs0o");
                function24.invoke($composer3, Integer.valueOf(($dirty2 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-977597516);
                $composer3.endReplaceGroup();
            }
            float startTextFieldPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float endTextFieldPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (function23 != null) {
                float other$iv = TextFieldImplKt.getHorizontalIconPadding();
                float other$iv2 = Dp.m7018constructorimpl(startTextFieldPadding - other$iv);
                float minimumValue$iv = Dp.m7018constructorimpl(0);
                float $this$coerceAtLeast_u2dYgX7TsA$iv = Dp.m7018constructorimpl(RangesKt.coerceAtLeast(other$iv2, minimumValue$iv));
                f = $this$coerceAtLeast_u2dYgX7TsA$iv;
            } else {
                f = startTextFieldPadding;
            }
            if (function24 != null) {
                float other$iv3 = TextFieldImplKt.getHorizontalIconPadding();
                float other$iv4 = Dp.m7018constructorimpl(endTextFieldPadding - other$iv3);
                float minimumValue$iv2 = Dp.m7018constructorimpl(0);
                float $this$coerceAtLeast_u2dYgX7TsA$iv2 = Dp.m7018constructorimpl(RangesKt.coerceAtLeast(other$iv4, minimumValue$iv2));
                f2 = $this$coerceAtLeast_u2dYgX7TsA$iv2;
            } else {
                f2 = endTextFieldPadding;
            }
            Modifier padding = PaddingKt.m742paddingqDBjuR0$default(companion, f, 0.0f, f2, 0.0f, 10, null);
            if (function3 != null) {
                $composer3.startReplaceGroup(-976746535);
                ComposerKt.sourceInformation($composer3, "743@36332L59");
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, "Hint").then(padding), $composer3, Integer.valueOf(($dirty2 >> 3) & 112));
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-976659084);
                $composer3.endReplaceGroup();
            }
            Modifier modifier$iv3 = LayoutIdKt.layoutId(Modifier.INSTANCE, "TextField").then(padding);
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Alignment contentAlignment$iv3 = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, true);
            int $changed$iv$iv4 = (384 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
            Function0 factory$iv$iv$iv7 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv4 << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                factory$iv$iv$iv = factory$iv$iv$iv7;
                $composer3.createNode(factory$iv$iv$iv);
            } else {
                factory$iv$iv$iv = factory$iv$iv$iv7;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3832constructorimpl($composer3);
            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 block$iv$iv$iv3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() || !Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3))) {
                $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
                $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), block$iv$iv$iv3);
            }
            Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i6 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            int i7 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1900636235, "C750@36576L11:OutlinedTextField.kt#jmzs0o");
            function2.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (function22 != null) {
                $composer3.startReplaceGroup(-976429250);
                ComposerKt.sourceInformation($composer3, "754@36652L54");
                Modifier modifier$iv4 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Label");
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Alignment contentAlignment$iv4 = Alignment.INSTANCE.getTopStart();
                MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv4, false);
                int $changed$iv$iv5 = (6 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
                Function0 factory$iv$iv$iv8 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv4 = (($changed$iv$iv5 << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    factory$iv$iv$iv2 = factory$iv$iv$iv8;
                    $composer3.createNode(factory$iv$iv$iv2);
                } else {
                    factory$iv$iv$iv2 = factory$iv$iv$iv8;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m3832constructorimpl($composer3);
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 block$iv$iv$iv4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if ($this$Layout_u24lambda_u240$iv$iv4.getInserting()) {
                    $changed$iv = 6;
                } else {
                    $changed$iv = 6;
                    if (!Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv4.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv4))) {
                    }
                    Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8 = ($changed$iv$iv$iv4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    int i9 = (($changed$iv >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1900756143, "C754@36697L7:OutlinedTextField.kt#jmzs0o");
                    function26 = function22;
                    function26.invoke($composer3, Integer.valueOf(($dirty2 >> 9) & 14));
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                }
                $this$Layout_u24lambda_u240$iv$iv4.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv4));
                $this$Layout_u24lambda_u240$iv$iv4.apply(Integer.valueOf(compositeKeyHash$iv$iv4), block$iv$iv$iv4);
                Updater.m3839setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i82 = ($changed$iv$iv$iv4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                int i92 = (($changed$iv >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 1900756143, "C754@36697L7:OutlinedTextField.kt#jmzs0o");
                function26 = function22;
                function26.invoke($composer3, Integer.valueOf(($dirty2 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                function26 = function22;
                $composer3.startReplaceGroup(-976346604);
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function26 = function22;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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

                public final void invoke(Composer composer, int i10) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function27, function23, function24, singleLine, animationProgress, function1, function25, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int $this$substractConstraintSafely, int from) {
        if ($this$substractConstraintSafely == Integer.MAX_VALUE) {
            return $this$substractConstraintSafely;
        }
        return $this$substractConstraintSafely - from;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1739calculateWidthO3s9Psw(int leadingPlaceableWidth, int trailingPlaceableWidth, int textFieldPlaceableWidth, int labelPlaceableWidth, int placeholderPlaceableWidth, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        int middleSection = Math.max(textFieldPlaceableWidth, Math.max(MathHelpersKt.lerp(labelPlaceableWidth, 0, animationProgress), placeholderPlaceableWidth));
        int wrappedWidth = leadingPlaceableWidth + middleSection + trailingPlaceableWidth;
        float arg0$iv = paddingValues.mo688calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr);
        float other$iv = paddingValues.mo689calculateRightPaddingu2uoSUM(LayoutDirection.Ltr);
        float labelHorizontalPadding = Dp.m7018constructorimpl(arg0$iv + other$iv) * density;
        int focusedLabelWidth = MathKt.roundToInt((labelPlaceableWidth + labelHorizontalPadding) * animationProgress);
        return ConstraintsKt.m6988constrainWidthK40F9xA(constraints, Math.max(wrappedWidth, focusedLabelWidth));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1738calculateHeightO3s9Psw(int leadingPlaceableHeight, int trailingPlaceableHeight, int textFieldPlaceableHeight, int labelPlaceableHeight, int placeholderPlaceableHeight, float animationProgress, long constraints, float density, PaddingValues paddingValues) {
        int inputFieldHeight = Math.max(textFieldPlaceableHeight, Math.max(placeholderPlaceableHeight, MathHelpersKt.lerp(labelPlaceableHeight, 0, animationProgress)));
        float topPadding = paddingValues.getTop() * density;
        float actualTopPadding = MathHelpersKt.lerp(topPadding, Math.max(topPadding, labelPlaceableHeight / 2.0f), animationProgress);
        float bottomPadding = paddingValues.getBottom() * density;
        float middleSectionHeight = inputFieldHeight + actualTopPadding + bottomPadding;
        return ConstraintsKt.m6987constrainHeightK40F9xA(constraints, Math.max(leadingPlaceableHeight, Math.max(trailingPlaceableHeight, MathKt.roundToInt(middleSectionHeight))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope $this$place, int height, int width, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable textFieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable borderPlaceable, float animationProgress, boolean singleLine, float density, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int iAlign;
        int iAlign2;
        int startPositionY;
        float fWidthOrZero;
        int topPadding = MathKt.roundToInt(paddingValues.getTop() * density);
        int startPadding = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * density);
        float iconPadding = TextFieldImplKt.getHorizontalIconPadding() * density;
        if (leadingPlaceable != null) {
            Placeable.PlacementScope.placeRelative$default($this$place, leadingPlaceable, 0, Alignment.INSTANCE.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
        }
        if (trailingPlaceable != null) {
            Placeable.PlacementScope.placeRelative$default($this$place, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.INSTANCE.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
        }
        if (labelPlaceable != null) {
            if (singleLine) {
                startPositionY = Alignment.INSTANCE.getCenterVertically().align(labelPlaceable.getHeight(), height);
            } else {
                startPositionY = topPadding;
            }
            int positionY = MathHelpersKt.lerp(startPositionY, -(labelPlaceable.getHeight() / 2), animationProgress);
            if (leadingPlaceable == null) {
                fWidthOrZero = 0.0f;
            } else {
                fWidthOrZero = (TextFieldImplKt.widthOrZero(leadingPlaceable) - iconPadding) * (1 - animationProgress);
            }
            int positionX = MathKt.roundToInt(fWidthOrZero) + startPadding;
            Placeable.PlacementScope.placeRelative$default($this$place, labelPlaceable, positionX, positionY, 0.0f, 4, null);
        }
        if (singleLine) {
            iAlign = Alignment.INSTANCE.getCenterVertically().align(textFieldPlaceable.getHeight(), height);
        } else {
            iAlign = topPadding;
        }
        int textVerticalPosition = Math.max(iAlign, TextFieldImplKt.heightOrZero(labelPlaceable) / 2);
        Placeable.PlacementScope.placeRelative$default($this$place, textFieldPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textVerticalPosition, 0.0f, 4, null);
        if (placeholderPlaceable != null) {
            if (singleLine) {
                iAlign2 = Alignment.INSTANCE.getCenterVertically().align(placeholderPlaceable.getHeight(), height);
            } else {
                iAlign2 = topPadding;
            }
            int placeholderVerticalPosition = Math.max(iAlign2, TextFieldImplKt.heightOrZero(labelPlaceable) / 2);
            Placeable.PlacementScope.placeRelative$default($this$place, placeholderPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), placeholderVerticalPosition, 0.0f, 4, null);
        }
        Placeable.PlacementScope.m5814place70tqf50$default($this$place, borderPlaceable, IntOffset.INSTANCE.m7157getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1740outlineCutout12SF9DM(Modifier $this$outlineCutout_u2d12SF9DM, final long labelSize, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent($this$outlineCutout_u2d12SF9DM, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError e) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) throws Throwable {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope $this$drawWithContent) throws Throwable {
                float right;
                DrawTransform $this$clipRect_rOu3jXo_u24lambda_u244$iv;
                float labelWidth = Size.m4218getWidthimpl(labelSize);
                if (labelWidth > 0.0f) {
                    float innerPadding = $this$drawWithContent.mo389toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                    float leftLtr = $this$drawWithContent.mo389toPx0680j_4(paddingValues.mo688calculateLeftPaddingu2uoSUM($this$drawWithContent.getLayoutDirection())) - innerPadding;
                    float f = 2;
                    float rightLtr = leftLtr + labelWidth + (f * innerPadding);
                    float left = WhenMappings.$EnumSwitchMapping$0[$this$drawWithContent.getLayoutDirection().ordinal()] == 1 ? Size.m4218getWidthimpl($this$drawWithContent.mo4952getSizeNHjbRc()) - rightLtr : RangesKt.coerceAtLeast(leftLtr, 0.0f);
                    if (WhenMappings.$EnumSwitchMapping$0[$this$drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        right = Size.m4218getWidthimpl($this$drawWithContent.mo4952getSizeNHjbRc()) - RangesKt.coerceAtLeast(leftLtr, 0.0f);
                    } else {
                        right = rightLtr;
                    }
                    float labelHeight = Size.m4215getHeightimpl(labelSize);
                    ContentDrawScope $this$clipRect_u2drOu3jXo$iv = $this$drawWithContent;
                    float top$iv = (-labelHeight) / f;
                    float bottom$iv = labelHeight / f;
                    int clipOp$iv = ClipOp.INSTANCE.m4378getDifferencertfAjoo();
                    DrawContext $this$withTransform_u24lambda_u246$iv$iv = $this$clipRect_u2drOu3jXo$iv.getDrawContext();
                    long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4873getSizeNHjbRc();
                    $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
                    try {
                        $this$clipRect_rOu3jXo_u24lambda_u244$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        $this$clipRect_rOu3jXo_u24lambda_u244$iv.mo4876clipRectN_I0leg(left, top$iv, right, bottom$iv, clipOp$iv);
                        $this$drawWithContent.drawContent();
                        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
                        $this$withTransform_u24lambda_u246$iv$iv.mo4874setSizeuvyYCjk(previousSize$iv$iv);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        $this$withTransform_u24lambda_u246$iv$iv = $this$withTransform_u24lambda_u246$iv$iv;
                        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
                        $this$withTransform_u24lambda_u246$iv$iv.mo4874setSizeuvyYCjk(previousSize$iv$iv);
                        throw th;
                    }
                }
                $this$drawWithContent.drawContent();
            }
        });
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
