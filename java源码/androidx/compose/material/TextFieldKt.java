package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.Placeable;
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
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0085\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0002\u0010-\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u00109\u001a\u0093\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010;\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020<2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010=\u001a\u0093\u0002\u0010\t\u001a\u00020\n2\u0006\u0010.\u001a\u00020<2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\n012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010>\u001a\u009a\u0001\u0010?\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u000101¢\u0006\u0002\b\u00162\u0013\u0010A\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0013\u0010B\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0006\u00106\u001a\u00020\u00102\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001¢\u0006\u0002\u0010G\u001aZ\u0010H\u001a\u0002082\u0006\u0010I\u001a\u0002082\u0006\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u0002082\u0006\u0010L\u001a\u0002082\u0006\u0010M\u001a\u0002082\u0006\u0010N\u001a\u0002082\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001aB\u0010T\u001a\u0002082\u0006\u0010U\u001a\u0002082\u0006\u0010V\u001a\u0002082\u0006\u0010W\u001a\u0002082\u0006\u0010X\u001a\u0002082\u0006\u0010Y\u001a\u0002082\u0006\u0010O\u001a\u00020PH\u0002ø\u0001\u0000¢\u0006\u0004\bZ\u0010[\u001a\u0014\u0010\\\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010]\u001a\u00020^H\u0000\u001at\u0010_\u001a\u00020\n*\u00020`2\u0006\u0010a\u001a\u0002082\u0006\u0010b\u001a\u0002082\u0006\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010d2\b\u0010f\u001a\u0004\u0018\u00010d2\b\u0010g\u001a\u0004\u0018\u00010d2\b\u0010h\u001a\u0004\u0018\u00010d2\u0006\u00106\u001a\u00020\u00102\u0006\u0010i\u001a\u0002082\u0006\u0010j\u001a\u0002082\u0006\u0010C\u001a\u00020D2\u0006\u0010Q\u001a\u00020DH\u0002\u001aZ\u0010k\u001a\u00020\n*\u00020`2\u0006\u0010a\u001a\u0002082\u0006\u0010b\u001a\u0002082\u0006\u0010l\u001a\u00020d2\b\u0010f\u001a\u0004\u0018\u00010d2\b\u0010g\u001a\u0004\u0018\u00010d2\b\u0010h\u001a\u0004\u0018\u00010d2\u0006\u00106\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002\u001a\u0014\u0010m\u001a\u000208*\u0002082\u0006\u0010n\u001a\u000208H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "TextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", "from", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m7018constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m7018constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m7018constructorimpl(2);

    public static final void TextField(final TextFieldState state, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler onKeyboardAction, TextFieldLineLimits lineLimits, ScrollState scrollState, Shape shape, TextFieldColors colors, MutableInteractionSource interactionSource, Composer $composer, final int $changed, final int $changed1, final int i) {
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
        boolean isError3;
        InputTransformation inputTransformation3;
        OutputTransformation outputTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler onKeyboardAction3;
        TextFieldLineLimits lineLimits3;
        ScrollState scrollState3;
        Shape shape3;
        int $dirty12;
        Composer $composer3;
        boolean z2;
        TextFieldColors colors3;
        MutableInteractionSource interactionSource3;
        int $dirty2;
        int $dirty13;
        MutableInteractionSource interactionSource4;
        int $dirty14;
        int i8;
        Composer $composer4 = $composer.startRestartGroup(-1967634894);
        ComposerKt.sourceInformation($composer4, "C(TextField)P(16,9,1,13,17,6,12,7,18,4,2,11,5,10,8,14,15)209@11167L38,217@11511L20,204@10964L2201:TextField.kt#jmzs0o");
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
        int i11 = i & 8;
        if (i11 != 0) {
            $dirty3 |= 3072;
            z = readOnly;
        } else if (($changed & 3072) == 0) {
            z = readOnly;
            $dirty3 |= $composer4.changed(z) ? 2048 : 1024;
        } else {
            z = readOnly;
        }
        int i12 = 8192;
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                textStyle2 = textStyle;
                if ($composer4.changed(textStyle2)) {
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
            $dirty3 |= $composer4.changedInstance(function25) ? 131072 : 65536;
        } else {
            function25 = function2;
        }
        int i14 = i & 64;
        if (i14 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            function26 = function22;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function26 = function22;
            $dirty3 |= $composer4.changedInstance(function26) ? 1048576 : 524288;
        } else {
            function26 = function22;
        }
        int i15 = i & 128;
        if (i15 != 0) {
            $dirty3 |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty3 |= $composer4.changedInstance(function23) ? 8388608 : 4194304;
        }
        int i16 = i & 256;
        if (i16 != 0) {
            $dirty3 |= 100663296;
            i2 = i16;
        } else if (($changed & 100663296) == 0) {
            i2 = i16;
            $dirty3 |= $composer4.changedInstance(function24) ? 67108864 : 33554432;
        } else {
            i2 = i16;
        }
        int i17 = i & 512;
        if (i17 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i17;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i17;
            $dirty3 |= $composer4.changed(isError) ? 536870912 : 268435456;
        } else {
            i3 = i17;
        }
        int i18 = i & 1024;
        if (i18 != 0) {
            $dirty15 |= 6;
            i4 = i18;
        } else if (($changed1 & 6) == 0) {
            i4 = i18;
            $dirty15 |= $composer4.changed(inputTransformation) ? 4 : 2;
        } else {
            i4 = i18;
        }
        int i19 = i & 2048;
        if (i19 != 0) {
            $dirty15 |= 48;
            i5 = i19;
        } else if (($changed1 & 48) == 0) {
            i5 = i19;
            $dirty15 |= $composer4.changed(outputTransformation) ? 32 : 16;
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
                $dirty15 |= $composer4.changed(keyboardOptions) ? 256 : 128;
            }
        }
        int i21 = i & 8192;
        if (i21 != 0) {
            $dirty15 |= 3072;
            i7 = i21;
        } else {
            i7 = i21;
            if (($changed1 & 3072) == 0) {
                $dirty15 |= $composer4.changed(onKeyboardAction) ? 2048 : 1024;
            }
        }
        if (($changed1 & 24576) == 0) {
            if ((i & 16384) == 0 && $composer4.changed(lineLimits)) {
                i12 = 16384;
            }
            $dirty15 |= i12;
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty15 |= ((i & 32768) == 0 && $composer4.changed(scrollState)) ? 131072 : 65536;
        }
        if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty15 |= ((i & 65536) == 0 && $composer4.changed(shape)) ? 1048576 : 524288;
        }
        if (($changed1 & User32.WS_CAPTION) == 0) {
            if ((i & 131072) == 0) {
                $dirty14 = $dirty15;
                int i22 = $composer4.changed(colors) ? 8388608 : 4194304;
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
            $dirty1 |= $composer4.changed(interactionSource) ? 67108864 : 33554432;
        }
        if ($composer4.shouldExecute((($dirty3 & 306783379) == 306783378 && ($dirty1 & 38347923) == 38347922) ? false : true, $dirty3 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "181@9790L7,192@10353L21,193@10413L14,194@10477L17");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                readOnly3 = i11 != 0 ? false : z;
                if ((i & 16) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer4.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
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
                isError3 = i3 != 0 ? false : isError;
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
                    scrollState3 = ScrollKt.rememberScrollState(0, $composer4, 0, 1);
                } else {
                    scrollState3 = scrollState;
                }
                if ((i & 65536) != 0) {
                    shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer4, 6);
                    $dirty12 = $dirty1 & (-3670017);
                } else {
                    shape3 = shape;
                    $dirty12 = $dirty1;
                }
                if ((i & 131072) != 0) {
                    z2 = true;
                    colors3 = TextFieldDefaults.INSTANCE.m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, 48, 2097151);
                    $composer3 = $composer4;
                    $dirty12 &= -29360129;
                } else {
                    $composer3 = $composer4;
                    z2 = true;
                    colors3 = colors;
                }
                if (i23 != 0) {
                    interactionSource3 = null;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    textStyle2 = textStyle4;
                    $dirty2 = $dirty;
                    $dirty13 = $dirty12;
                } else {
                    interactionSource3 = interactionSource;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    textStyle2 = textStyle4;
                    $dirty2 = $dirty;
                    $dirty13 = $dirty12;
                }
            } else {
                $composer4.skipToGroupEnd();
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
                    $composer3 = $composer4;
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
                    z2 = true;
                    readOnly3 = z;
                    label2 = function25;
                    placeholder2 = function26;
                    interactionSource3 = interactionSource;
                    $dirty13 = $dirty1 & (-29360129);
                    $dirty2 = $dirty3;
                    colors3 = colors;
                } else {
                    $composer3 = $composer4;
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
                    $dirty2 = $dirty3;
                    z2 = true;
                    readOnly3 = z;
                    label2 = function25;
                    placeholder2 = function26;
                    $dirty13 = $dirty1;
                    colors3 = colors;
                    interactionSource3 = interactionSource;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1967634894, $dirty2, $dirty13, "androidx.compose.material.TextField (TextField.kt:196)");
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(-1673838860);
                ComposerKt.sourceInformation($composer3, "198@10638L39");
                ComposerKt.sourceInformationMarkerStart($composer3, -53994802, "CC(remember):TextField.kt#9igjgp");
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
                $composer3.startReplaceGroup(-53995453);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            $composer3.startReplaceGroup(-53989707);
            ComposerKt.sourceInformation($composer3, "*200@10817L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle2.m6489getColor0d7_KjU();
            if (!($this$takeOrElse_u2dDxMtmZc$iv != 16 ? z2 : false)) {
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 6) & 14) | (($dirty13 >> 18) & 112)).getValue().m4400unboximpl();
            }
            $composer3.endReplaceGroup();
            long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
            TextStyle mergedTextStyle = textStyle2.merge(new TextStyle(textColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final TextFieldColors colors4 = colors3;
            final boolean enabled5 = enabled2;
            final boolean isError4 = isError3;
            Modifier modifierM769defaultMinSizeVpY3zN4 = SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1837indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier2, enabled5, isError4, interactionSource4, colors4, 0.0f, 0.0f, 48, null), isError4, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM());
            SolidColor solidColor = new SolidColor(colors4.cursorColor(isError4, $composer3, (($dirty2 >> 27) & 14) | (($dirty13 >> 18) & 112)).getValue().m4400unboximpl(), null);
            final MutableInteractionSource interactionSource5 = interactionSource4;
            final Function2 label3 = label2;
            final Function2 placeholder3 = placeholder2;
            final Function2 leadingIcon3 = leadingIcon2;
            final Function2 trailingIcon3 = trailingIcon2;
            final OutputTransformation outputTransformation4 = outputTransformation3;
            final TextFieldLineLimits lineLimits4 = lineLimits3;
            final Shape shape4 = shape3;
            Composer $composer5 = $composer3;
            BasicTextFieldKt.BasicTextField(state, modifierM769defaultMinSizeVpY3zN4, enabled5, readOnly3, inputTransformation3, mergedTextStyle, keyboardOptions3, onKeyboardAction3, lineLimits3, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) null, interactionSource4, solidColor, outputTransformation3, new TextFieldDecorator() { // from class: androidx.compose.material.TextFieldKt.TextField.1
                @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                public final void Decoration(Function2<? super Composer, ? super Integer, Unit> function27, Composer $composer6, int $changed2) {
                    TextFieldBuffer textFieldBuffer;
                    String textPostTransformation;
                    $composer6.startReplaceGroup(626218266);
                    ComposerKt.sourceInformation($composer6, "C(Decoration)239@12543L606:TextField.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(626218266, $changed2, -1, "androidx.compose.material.TextField.<no name provided>.Decoration (TextField.kt:226)");
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
                    String textPostTransformation2 = textPostTransformation;
                    textFieldDefaults.TextFieldDecorationBox(textPostTransformation2, function27, enabled5, Intrinsics.areEqual(lineLimits4, TextFieldLineLimits.SingleLine.INSTANCE), none, interactionSource5, isError4, label3, placeholder3, leadingIcon3, trailingIcon3, shape4, colors4, null, $composer6, (($changed2 << 3) & 112) | 24576, 24576, 8192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    $composer6.endReplaceGroup();
                }
            }, scrollState3, $composer5, ($dirty2 & 14) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (($dirty13 << 12) & 57344) | (($dirty13 << 12) & 3670016) | (($dirty13 << 12) & 29360128) | (234881024 & ($dirty13 << 12)), (($dirty13 << 3) & User32.WM_PENWINFIRST) | (($dirty13 >> 3) & 57344), 512);
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            interactionSource2 = interactionSource3;
            colors2 = colors4;
            textStyle3 = textStyle2;
            modifier3 = modifier2;
            enabled3 = enabled5;
            readOnly2 = readOnly3;
            label = label2;
            placeholder = placeholder2;
            leadingIcon = leadingIcon2;
            inputTransformation2 = inputTransformation3;
            outputTransformation2 = outputTransformation3;
            keyboardOptions2 = keyboardOptions3;
            onKeyboardAction2 = onKeyboardAction3;
            lineLimits2 = lineLimits3;
            scrollState2 = scrollState3;
            shape2 = shape3;
            isError2 = isError4;
            trailingIcon = trailingIcon2;
        } else {
            $composer2 = $composer4;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.2
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
                    TextFieldKt.TextField(state, modifier3, enabled3, readOnly2, textStyle3, label, placeholder, leadingIcon, trailingIcon, isError2, inputTransformation2, outputTransformation2, keyboardOptions2, onKeyboardAction2, lineLimits2, scrollState2, shape2, colors2, interactionSource2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    public static final void TextField(final String value, final Function1<? super String, Unit> function1, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
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
        int i8;
        int $dirty;
        TextStyle textStyle4;
        Function2 label2;
        Function2 placeholder2;
        Function2 leadingIcon2;
        Function2 trailingIcon2;
        boolean isError3;
        VisualTransformation visualTransformation3;
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
        KeyboardOptions keyboardOptions3;
        boolean singleLine3;
        int maxLines4;
        int minLines3;
        int $dirty3;
        int $dirty14;
        MutableInteractionSource interactionSource4;
        MutableInteractionSource interactionSource5;
        int $dirty15;
        Composer $composer4 = $composer.startRestartGroup(-1504264404);
        ComposerKt.sourceInformation($composer4, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)357@19267L38,366@19650L20,375@20004L787,352@19064L1733:TextField.kt#jmzs0o");
        int $dirty4 = $changed;
        int $dirty16 = $changed1;
        if ((i & 1) != 0) {
            $dirty4 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty4 |= $composer4.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty4 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty4 |= $composer4.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i & 4;
        if (i9 != 0) {
            $dirty4 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty4 |= $composer4.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 8;
        if (i10 != 0) {
            $dirty4 |= 3072;
            enabled2 = enabled;
        } else if (($changed & 3072) == 0) {
            enabled2 = enabled;
            $dirty4 |= $composer4.changed(enabled2) ? 2048 : 1024;
        } else {
            enabled2 = enabled;
        }
        int i11 = i & 16;
        if (i11 != 0) {
            $dirty4 |= 24576;
            readOnly2 = readOnly;
        } else if (($changed & 24576) == 0) {
            readOnly2 = readOnly;
            $dirty4 |= $composer4.changed(readOnly2) ? 16384 : 8192;
        } else {
            readOnly2 = readOnly;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32) == 0) {
                textStyle2 = textStyle;
                int i12 = $composer4.changed(textStyle2) ? 131072 : 65536;
                $dirty4 |= i12;
            } else {
                textStyle2 = textStyle;
            }
            $dirty4 |= i12;
        } else {
            textStyle2 = textStyle;
        }
        int i13 = i & 64;
        if (i13 != 0) {
            $dirty4 |= JNINativeInterface.JNI_VERSION_24;
            function25 = function2;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function25 = function2;
            $dirty4 |= $composer4.changedInstance(function25) ? 1048576 : 524288;
        } else {
            function25 = function2;
        }
        int i14 = i & 128;
        if (i14 != 0) {
            $dirty4 |= User32.WS_CAPTION;
            function26 = function22;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function26 = function22;
            $dirty4 |= $composer4.changedInstance(function26) ? 8388608 : 4194304;
        } else {
            function26 = function22;
        }
        int i15 = i & 256;
        if (i15 != 0) {
            $dirty4 |= 100663296;
            i2 = i15;
        } else if (($changed & 100663296) == 0) {
            i2 = i15;
            $dirty4 |= $composer4.changedInstance(function23) ? 67108864 : 33554432;
        } else {
            i2 = i15;
        }
        int i16 = i & 512;
        if (i16 != 0) {
            $dirty4 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i16;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i16;
            $dirty4 |= $composer4.changedInstance(function24) ? 536870912 : 268435456;
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
        if (($changed1 & 3072) == 0) {
            $dirty16 |= ((i & 8192) == 0 && $composer4.changed(keyboardActions)) ? 2048 : 1024;
        }
        int i20 = i & 16384;
        if (i20 != 0) {
            $dirty16 |= 24576;
            i7 = i20;
        } else {
            i7 = i20;
            if (($changed1 & 24576) == 0) {
                $dirty16 |= $composer4.changed(singleLine) ? 16384 : 8192;
            }
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty16 |= ((i & 32768) == 0 && $composer4.changed(maxLines)) ? 131072 : 65536;
        }
        int i21 = i & 65536;
        if (i21 != 0) {
            $dirty16 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty16 |= $composer4.changed(minLines) ? 1048576 : 524288;
        }
        int i22 = i & 131072;
        if (i22 != 0) {
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
                int i23 = $composer4.changed(colors) ? 536870912 : 268435456;
                $dirty1 = $dirty15 | i23;
            } else {
                $dirty15 = $dirty16;
            }
            $dirty1 = $dirty15 | i23;
        } else {
            $dirty1 = $dirty16;
        }
        int $dirty5 = $dirty4;
        if ($composer4.shouldExecute((($dirty4 & 306783379) == 306783378 && (306783379 & $dirty1) == 306783378) ? false : true, $dirty5 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "329@17927L7,342@18571L14,343@18635L17");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                boolean readOnly4 = i11 != 0 ? false : readOnly2;
                if ((i & 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    i8 = -458753;
                    ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer4.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty5 & (-458753);
                } else {
                    i8 = -458753;
                    $dirty = $dirty5;
                    textStyle4 = textStyle2;
                }
                label2 = i13 != 0 ? null : function25;
                placeholder2 = i14 != 0 ? null : function26;
                leadingIcon2 = i2 != 0 ? null : function23;
                trailingIcon2 = i3 != 0 ? null : function24;
                isError3 = i4 != 0 ? false : isError;
                visualTransformation3 = i5 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
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
                    shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer4, 6);
                    $dirty13 = $dirty12 & (-234881025);
                } else {
                    shape3 = shape;
                    $dirty13 = $dirty12;
                }
                if ((i & 524288) != 0) {
                    colors3 = TextFieldDefaults.INSTANCE.m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, 48, 2097151);
                    $composer3 = $composer4;
                    keyboardActions4 = keyboardActions3;
                    modifier2 = modifier4;
                    $dirty3 = $dirty13 & (-1879048193);
                    enabled2 = enabled4;
                    readOnly2 = readOnly4;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                } else {
                    $composer3 = $composer4;
                    colors3 = colors;
                    keyboardActions4 = keyboardActions3;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    readOnly2 = readOnly4;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                    $dirty3 = $dirty13;
                }
            } else {
                $composer4.skipToGroupEnd();
                int $dirty6 = (i & 32) != 0 ? $dirty5 & (-458753) : $dirty5;
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
                $composer3 = $composer4;
                leadingIcon2 = function23;
                trailingIcon2 = function24;
                isError3 = isError;
                visualTransformation3 = visualTransformation;
                singleLine3 = singleLine;
                maxLines4 = maxLines;
                interactionSource3 = interactionSource;
                shape3 = shape;
                colors3 = colors;
                $dirty2 = $dirty6;
                label2 = function25;
                placeholder2 = function26;
                keyboardActions4 = keyboardActions;
                minLines3 = minLines;
                $dirty3 = $dirty1;
                textStyle5 = textStyle2;
                keyboardOptions3 = keyboardOptions;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1504264404, $dirty2, $dirty3, "androidx.compose.material.TextField (TextField.kt:344)");
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(-1665803660);
                ComposerKt.sourceInformation($composer3, "346@18738L39");
                ComposerKt.sourceInformationMarkerStart($composer3, -53735602, "CC(remember):TextField.kt#9igjgp");
                Composer $this$cache$iv = $composer3;
                $dirty14 = $dirty3;
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
                $dirty14 = $dirty3;
                $composer3.startReplaceGroup(-53736253);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            $composer3.startReplaceGroup(-53730507);
            ComposerKt.sourceInformation($composer3, "*348@18917L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle5.m6489getColor0d7_KjU();
            if ($this$takeOrElse_u2dDxMtmZc$iv != 16) {
                interactionSource5 = interactionSource4;
            } else {
                interactionSource5 = interactionSource4;
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 9) & 14) | (($dirty14 >> 24) & 112)).getValue().m4400unboximpl();
            }
            $composer3.endReplaceGroup();
            long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
            TextStyle mergedTextStyle = textStyle5.merge(new TextStyle(textColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final boolean enabled5 = enabled2;
            Modifier modifier5 = modifier2;
            final boolean isError4 = isError3;
            TextStyle textStyle6 = textStyle5;
            Modifier modifierM769defaultMinSizeVpY3zN4 = SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1837indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier5, enabled5, isError4, interactionSource5, colors3, 0.0f, 0.0f, 48, null), isError4, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM());
            SolidColor solidColor = new SolidColor(colors3.cursorColor(isError4, $composer3, ($dirty14 & 14) | (($dirty14 >> 24) & 112)).getValue().m4400unboximpl(), null);
            final MutableInteractionSource interactionSource6 = interactionSource5;
            final TextFieldColors colors4 = colors3;
            final boolean isError5 = singleLine3;
            final Function2 label3 = label2;
            final Function2 placeholder3 = placeholder2;
            final Function2 leadingIcon3 = leadingIcon2;
            final Function2 trailingIcon3 = trailingIcon2;
            final VisualTransformation visualTransformation4 = visualTransformation3;
            final Shape shape4 = shape3;
            Composer $composer5 = $composer3;
            BasicTextFieldKt.BasicTextField(value, function1, modifierM769defaultMinSizeVpY3zN4, enabled2, readOnly2, mergedTextStyle, keyboardOptions3, keyboardActions4, singleLine3, maxLines4, minLines3, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, interactionSource6, solidColor, ComposableLambdaKt.rememberComposableLambda(989834338, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.3
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
                    Function2<? super Composer, ? super Integer, Unit> function28;
                    ComposerKt.sourceInformation($composer6, "C377@20151L626:TextField.kt#jmzs0o");
                    int $dirty7 = $changed2;
                    if (($changed2 & 6) == 0) {
                        function28 = function27;
                        $dirty7 |= $composer6.changedInstance(function28) ? 4 : 2;
                    } else {
                        function28 = function27;
                    }
                    if ($composer6.shouldExecute(($dirty7 & 19) != 18, $dirty7 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(989834338, $dirty7, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:377)");
                        }
                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(value, function28, enabled5, isError5, visualTransformation4, interactionSource6, isError4, label3, placeholder3, leadingIcon3, trailingIcon3, shape4, colors4, null, $composer6, ($dirty7 << 3) & 112, 24576, 8192);
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
            singleLine2 = singleLine3;
            visualTransformation2 = visualTransformation4;
            colors2 = colors4;
            textStyle3 = textStyle6;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            maxLines2 = maxLines4;
            minLines2 = minLines3;
            label = label2;
            placeholder = placeholder2;
            leadingIcon = leadingIcon2;
            interactionSource2 = interactionSource3;
            shape2 = shape3;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions4;
            trailingIcon = trailingIcon2;
            isError2 = isError4;
            modifier3 = modifier5;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.4
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
                    TextFieldKt.TextField(value, function1, modifier3, enabled3, readOnly3, textStyle3, label, placeholder, leadingIcon, trailingIcon, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, minLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final /* synthetic */ void TextField(final String value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
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
        Composer $composer3 = $composer.startRestartGroup(-1690895095);
        ComposerKt.sourceInformation($composer3, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)423@21937L408:TextField.kt#jmzs0o");
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
            ComposerKt.sourceInformation($composer3, "407@21150L7,418@21704L39,420@21786L6,421@21911L17");
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
                    ComposerKt.sourceInformationMarkerStart($composer3, -53640690, "CC(remember):TextField.kt#9igjgp");
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
                    shape3 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes($composer3, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                    $dirty13 = $dirty12 & (-29360129);
                } else {
                    shape3 = shape;
                    $dirty13 = $dirty12;
                }
                if ((262144 & i) != 0) {
                    $composer2 = $composer3;
                    keyboardActions4 = keyboardActions3;
                    modifier4 = modifier5;
                    colors3 = TextFieldDefaults.INSTANCE.m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer2, 0, 0, 48, 2097151);
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
                ComposerKt.traceEventStart(-1690895095, $dirty2, $dirty1, "androidx.compose.material.TextField (TextField.kt:422)");
            }
            TextField(value, (Function1<? super String, Unit>) onValueChange, modifier4, enabled2, readOnly2, textStyle5, (Function2<? super Composer, ? super Integer, Unit>) label4, (Function2<? super Composer, ? super Integer, Unit>) placeholder3, (Function2<? super Composer, ? super Integer, Unit>) leadingIcon3, (Function2<? super Composer, ? super Integer, Unit>) trailingIcon2, isError3, visualTransformation3, keyboardOptions3, keyboardActions4, singleLine3, maxLines3, 1, interactionSource4, shape4, colors3, $composer2, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (458752 & $dirty2) | (3670016 & $dirty2) | (29360128 & $dirty2) | (234881024 & $dirty2) | (1879048192 & $dirty2), ($dirty1 & 14) | JNINativeInterface.JNI_VERSION_24 | ($dirty1 & 112) | ($dirty1 & User32.WM_PENWINFIRST) | ($dirty1 & GL11.GL_RENDER) | (57344 & $dirty1) | (458752 & $dirty1) | (($dirty1 << 3) & 29360128) | (($dirty1 << 3) & 234881024) | (($dirty1 << 3) & 1879048192), 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.6
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
                    TextFieldKt.TextField(value, onValueChange, modifier3, enabled3, readOnly3, textStyle3, label2, placeholder2, leadingIcon2, label3, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    public static final void TextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, int minLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
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
        int i8;
        int $dirty;
        TextStyle textStyle4;
        Function2 label2;
        Function2 placeholder2;
        Function2 leadingIcon2;
        Function2 trailingIcon2;
        boolean isError3;
        VisualTransformation visualTransformation3;
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
        KeyboardOptions keyboardOptions3;
        boolean singleLine3;
        int maxLines4;
        int minLines3;
        int $dirty3;
        int $dirty14;
        MutableInteractionSource interactionSource4;
        MutableInteractionSource interactionSource5;
        int $dirty15;
        Composer $composer4 = $composer.startRestartGroup(-359119489);
        ComposerKt.sourceInformation($composer4, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)548@28650L38,557@29033L20,566@29387L792,543@28447L1738:TextField.kt#jmzs0o");
        int $dirty4 = $changed;
        int $dirty16 = $changed1;
        if ((i & 1) != 0) {
            $dirty4 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty4 |= $composer4.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty4 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty4 |= $composer4.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i & 4;
        if (i9 != 0) {
            $dirty4 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty4 |= $composer4.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 8;
        if (i10 != 0) {
            $dirty4 |= 3072;
            enabled2 = enabled;
        } else if (($changed & 3072) == 0) {
            enabled2 = enabled;
            $dirty4 |= $composer4.changed(enabled2) ? 2048 : 1024;
        } else {
            enabled2 = enabled;
        }
        int i11 = i & 16;
        if (i11 != 0) {
            $dirty4 |= 24576;
            readOnly2 = readOnly;
        } else if (($changed & 24576) == 0) {
            readOnly2 = readOnly;
            $dirty4 |= $composer4.changed(readOnly2) ? 16384 : 8192;
        } else {
            readOnly2 = readOnly;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if ((i & 32) == 0) {
                textStyle2 = textStyle;
                int i12 = $composer4.changed(textStyle2) ? 131072 : 65536;
                $dirty4 |= i12;
            } else {
                textStyle2 = textStyle;
            }
            $dirty4 |= i12;
        } else {
            textStyle2 = textStyle;
        }
        int i13 = i & 64;
        if (i13 != 0) {
            $dirty4 |= JNINativeInterface.JNI_VERSION_24;
            function25 = function2;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            function25 = function2;
            $dirty4 |= $composer4.changedInstance(function25) ? 1048576 : 524288;
        } else {
            function25 = function2;
        }
        int i14 = i & 128;
        if (i14 != 0) {
            $dirty4 |= User32.WS_CAPTION;
            function26 = function22;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function26 = function22;
            $dirty4 |= $composer4.changedInstance(function26) ? 8388608 : 4194304;
        } else {
            function26 = function22;
        }
        int i15 = i & 256;
        if (i15 != 0) {
            $dirty4 |= 100663296;
            i2 = i15;
        } else if (($changed & 100663296) == 0) {
            i2 = i15;
            $dirty4 |= $composer4.changedInstance(function23) ? 67108864 : 33554432;
        } else {
            i2 = i15;
        }
        int i16 = i & 512;
        if (i16 != 0) {
            $dirty4 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i16;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i16;
            $dirty4 |= $composer4.changedInstance(function24) ? 536870912 : 268435456;
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
        if (($changed1 & 3072) == 0) {
            $dirty16 |= ((i & 8192) == 0 && $composer4.changed(keyboardActions)) ? 2048 : 1024;
        }
        int i20 = i & 16384;
        if (i20 != 0) {
            $dirty16 |= 24576;
            i7 = i20;
        } else {
            i7 = i20;
            if (($changed1 & 24576) == 0) {
                $dirty16 |= $composer4.changed(singleLine) ? 16384 : 8192;
            }
        }
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty16 |= ((i & 32768) == 0 && $composer4.changed(maxLines)) ? 131072 : 65536;
        }
        int i21 = i & 65536;
        if (i21 != 0) {
            $dirty16 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed1 & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty16 |= $composer4.changed(minLines) ? 1048576 : 524288;
        }
        int i22 = i & 131072;
        if (i22 != 0) {
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
                int i23 = $composer4.changed(colors) ? 536870912 : 268435456;
                $dirty1 = $dirty15 | i23;
            } else {
                $dirty15 = $dirty16;
            }
            $dirty1 = $dirty15 | i23;
        } else {
            $dirty1 = $dirty16;
        }
        int $dirty5 = $dirty4;
        if ($composer4.shouldExecute((($dirty4 & 306783379) == 306783378 && (306783379 & $dirty1) == 306783378) ? false : true, $dirty5 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "520@27310L7,533@27954L14,534@28018L17");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                boolean enabled4 = i10 != 0 ? true : enabled2;
                boolean readOnly4 = i11 != 0 ? false : readOnly2;
                if ((i & 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    i8 = -458753;
                    ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume = $composer4.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd($composer4);
                    textStyle4 = (TextStyle) objConsume;
                    $dirty = $dirty5 & (-458753);
                } else {
                    i8 = -458753;
                    $dirty = $dirty5;
                    textStyle4 = textStyle2;
                }
                label2 = i13 != 0 ? null : function25;
                placeholder2 = i14 != 0 ? null : function26;
                leadingIcon2 = i2 != 0 ? null : function23;
                trailingIcon2 = i3 != 0 ? null : function24;
                isError3 = i4 != 0 ? false : isError;
                visualTransformation3 = i5 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
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
                    shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer4, 6);
                    $dirty13 = $dirty12 & (-234881025);
                } else {
                    shape3 = shape;
                    $dirty13 = $dirty12;
                }
                if ((i & 524288) != 0) {
                    colors3 = TextFieldDefaults.INSTANCE.m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, 48, 2097151);
                    $composer3 = $composer4;
                    keyboardActions4 = keyboardActions3;
                    modifier2 = modifier4;
                    $dirty3 = $dirty13 & (-1879048193);
                    enabled2 = enabled4;
                    readOnly2 = readOnly4;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                } else {
                    $composer3 = $composer4;
                    colors3 = colors;
                    keyboardActions4 = keyboardActions3;
                    modifier2 = modifier4;
                    enabled2 = enabled4;
                    readOnly2 = readOnly4;
                    textStyle5 = textStyle4;
                    $dirty2 = $dirty;
                    keyboardOptions3 = keyboardOptions4;
                    singleLine3 = singleLine4;
                    maxLines4 = maxLines3;
                    minLines3 = minLines4;
                    $dirty3 = $dirty13;
                }
            } else {
                $composer4.skipToGroupEnd();
                int $dirty6 = (i & 32) != 0 ? $dirty5 & (-458753) : $dirty5;
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
                $composer3 = $composer4;
                leadingIcon2 = function23;
                trailingIcon2 = function24;
                isError3 = isError;
                visualTransformation3 = visualTransformation;
                singleLine3 = singleLine;
                maxLines4 = maxLines;
                interactionSource3 = interactionSource;
                shape3 = shape;
                colors3 = colors;
                $dirty2 = $dirty6;
                label2 = function25;
                placeholder2 = function26;
                keyboardActions4 = keyboardActions;
                minLines3 = minLines;
                $dirty3 = $dirty1;
                textStyle5 = textStyle2;
                keyboardOptions3 = keyboardOptions;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359119489, $dirty2, $dirty3, "androidx.compose.material.TextField (TextField.kt:535)");
            }
            if (interactionSource3 == null) {
                $composer3.startReplaceGroup(-1656495724);
                ComposerKt.sourceInformation($composer3, "537@28121L39");
                ComposerKt.sourceInformationMarkerStart($composer3, -53435346, "CC(remember):TextField.kt#9igjgp");
                Composer $this$cache$iv = $composer3;
                $dirty14 = $dirty3;
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
                $dirty14 = $dirty3;
                $composer3.startReplaceGroup(-53435997);
                $composer3.endReplaceGroup();
                interactionSource4 = interactionSource3;
            }
            $composer3.startReplaceGroup(-53430251);
            ComposerKt.sourceInformation($composer3, "*539@28300L18");
            long $this$takeOrElse_u2dDxMtmZc$iv = textStyle5.m6489getColor0d7_KjU();
            if ($this$takeOrElse_u2dDxMtmZc$iv != 16) {
                interactionSource5 = interactionSource4;
            } else {
                interactionSource5 = interactionSource4;
                $this$takeOrElse_u2dDxMtmZc$iv = colors3.textColor(enabled2, $composer3, (($dirty2 >> 9) & 14) | (($dirty14 >> 24) & 112)).getValue().m4400unboximpl();
            }
            $composer3.endReplaceGroup();
            long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
            TextStyle mergedTextStyle = textStyle5.merge(new TextStyle(textColor, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final boolean enabled5 = enabled2;
            Modifier modifier5 = modifier2;
            final boolean isError4 = isError3;
            TextStyle textStyle6 = textStyle5;
            Modifier modifierM769defaultMinSizeVpY3zN4 = SizeKt.m769defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m1837indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier5, enabled5, isError4, interactionSource5, colors3, 0.0f, 0.0f, 48, null), isError4, Strings_androidKt.m1802getString4foXLRw(Strings.INSTANCE.m1796getDefaultErrorMessageUdPEhr4(), $composer3, 6)), TextFieldDefaults.INSTANCE.m1844getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1843getMinHeightD9Ej5fM());
            SolidColor solidColor = new SolidColor(colors3.cursorColor(isError4, $composer3, ($dirty14 & 14) | (($dirty14 >> 24) & 112)).getValue().m4400unboximpl(), null);
            final MutableInteractionSource interactionSource6 = interactionSource5;
            final TextFieldColors colors4 = colors3;
            final boolean isError5 = singleLine3;
            final Function2 label3 = label2;
            final Function2 placeholder3 = placeholder2;
            final Function2 leadingIcon3 = leadingIcon2;
            final Function2 trailingIcon3 = trailingIcon2;
            final VisualTransformation visualTransformation4 = visualTransformation3;
            final Shape shape4 = shape3;
            Composer $composer5 = $composer3;
            BasicTextFieldKt.BasicTextField(value, function1, modifierM769defaultMinSizeVpY3zN4, enabled2, readOnly2, mergedTextStyle, keyboardOptions3, keyboardActions4, singleLine3, maxLines4, minLines3, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, interactionSource6, solidColor, ComposableLambdaKt.rememberComposableLambda(-126640971, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.7
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
                    Function2<? super Composer, ? super Integer, Unit> function28;
                    ComposerKt.sourceInformation($composer6, "C568@29534L631:TextField.kt#jmzs0o");
                    int $dirty7 = $changed2;
                    if (($changed2 & 6) == 0) {
                        function28 = function27;
                        $dirty7 |= $composer6.changedInstance(function28) ? 4 : 2;
                    } else {
                        function28 = function27;
                    }
                    if ($composer6.shouldExecute(($dirty7 & 19) != 18, $dirty7 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-126640971, $dirty7, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:568)");
                        }
                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(value.getText(), function28, enabled5, isError5, visualTransformation4, interactionSource6, isError4, label3, placeholder3, leadingIcon3, trailingIcon3, shape4, colors4, null, $composer6, ($dirty7 << 3) & 112, 24576, 8192);
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
            singleLine2 = singleLine3;
            visualTransformation2 = visualTransformation4;
            colors2 = colors4;
            textStyle3 = textStyle6;
            enabled3 = enabled2;
            readOnly3 = readOnly2;
            maxLines2 = maxLines4;
            minLines2 = minLines3;
            label = label2;
            placeholder = placeholder2;
            leadingIcon = leadingIcon2;
            interactionSource2 = interactionSource3;
            shape2 = shape3;
            keyboardOptions2 = keyboardOptions3;
            keyboardActions2 = keyboardActions4;
            trailingIcon = trailingIcon2;
            isError2 = isError4;
            modifier3 = modifier5;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.8
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
                    TextFieldKt.TextField(value, function1, modifier3, enabled3, readOnly3, textStyle3, label, placeholder, leadingIcon, trailingIcon, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, minLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final /* synthetic */ void TextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, boolean enabled, boolean readOnly, TextStyle textStyle, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, boolean isError, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean singleLine, int maxLines, MutableInteractionSource interactionSource, Shape shape, TextFieldColors colors, Composer $composer, final int $changed, final int $changed1, final int i) {
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
        Composer $composer3 = $composer.startRestartGroup(-1576622884);
        ComposerKt.sourceInformation($composer3, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)613@31276L408:TextField.kt#jmzs0o");
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
            ComposerKt.sourceInformation($composer3, "598@30554L7,609@31108L39,610@31186L14,611@31250L17");
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
                    ComposerKt.sourceInformationMarkerStart($composer3, -53339762, "CC(remember):TextField.kt#9igjgp");
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
                    shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape($composer3, 6);
                    $dirty13 = $dirty12 & (-29360129);
                } else {
                    shape3 = shape;
                    $dirty13 = $dirty12;
                }
                if ((262144 & i) != 0) {
                    $composer2 = $composer3;
                    keyboardActions4 = keyboardActions3;
                    modifier4 = modifier5;
                    colors3 = TextFieldDefaults.INSTANCE.m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer2, 0, 0, 48, 2097151);
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
                ComposerKt.traceEventStart(-1576622884, $dirty2, $dirty1, "androidx.compose.material.TextField (TextField.kt:612)");
            }
            TextField(value, (Function1<? super TextFieldValue, Unit>) onValueChange, modifier4, enabled2, readOnly2, textStyle5, (Function2<? super Composer, ? super Integer, Unit>) label4, (Function2<? super Composer, ? super Integer, Unit>) placeholder3, (Function2<? super Composer, ? super Integer, Unit>) leadingIcon3, (Function2<? super Composer, ? super Integer, Unit>) trailingIcon2, isError3, visualTransformation3, keyboardOptions3, keyboardActions4, singleLine3, maxLines3, 1, interactionSource4, shape4, colors3, $composer2, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (458752 & $dirty2) | (3670016 & $dirty2) | (29360128 & $dirty2) | (234881024 & $dirty2) | (1879048192 & $dirty2), ($dirty1 & 14) | JNINativeInterface.JNI_VERSION_24 | ($dirty1 & 112) | ($dirty1 & User32.WM_PENWINFIRST) | ($dirty1 & GL11.GL_RENDER) | (57344 & $dirty1) | (458752 & $dirty1) | (($dirty1 << 3) & 29360128) | (($dirty1 << 3) & 234881024) | (($dirty1 << 3) & 1879048192), 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.10
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
                    TextFieldKt.TextField(value, onValueChange, modifier3, enabled3, readOnly3, textStyle3, label2, placeholder2, leadingIcon2, label3, isError2, visualTransformation2, keyboardOptions2, keyboardActions2, singleLine2, maxLines2, interactionSource2, shape2, colors2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextFieldLayout(final androidx.compose.ui.Modifier r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, final kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, final boolean r60, final float r61, final androidx.compose.foundation.layout.PaddingValues r62, androidx.compose.runtime.Composer r63, final int r64) {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextFieldLayout(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int $this$substractConstraintSafely, int from) {
        if ($this$substractConstraintSafely == Integer.MAX_VALUE) {
            return $this$substractConstraintSafely;
        }
        return $this$substractConstraintSafely - from;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1861calculateWidthVsPV1Ek(int leadingWidth, int trailingWidth, int textFieldWidth, int labelWidth, int placeholderWidth, long constraints) {
        int middleSection = Math.max(textFieldWidth, Math.max(labelWidth, placeholderWidth));
        int wrappedWidth = leadingWidth + middleSection + trailingWidth;
        return ConstraintsKt.m6988constrainWidthK40F9xA(constraints, wrappedWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1860calculateHeightO3s9Psw(int textFieldHeight, boolean hasLabel, int labelBaseline, int leadingHeight, int trailingHeight, int placeholderHeight, long constraints, float density, PaddingValues paddingValues) {
        float middleSectionHeight;
        float paddingToLabel = TextFieldTopPadding * density;
        float topPaddingValue = paddingValues.getTop() * density;
        float bottomPaddingValue = paddingValues.getBottom() * density;
        int inputFieldHeight = Math.max(textFieldHeight, placeholderHeight);
        if (hasLabel) {
            middleSectionHeight = labelBaseline + paddingToLabel + inputFieldHeight + bottomPaddingValue;
        } else {
            middleSectionHeight = inputFieldHeight + topPaddingValue + bottomPaddingValue;
        }
        return ConstraintsKt.m6987constrainHeightK40F9xA(constraints, Math.max(MathKt.roundToInt(middleSectionHeight), Math.max(leadingHeight, trailingHeight)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope $this$placeWithLabel, int width, int height, Placeable textfieldPlaceable, Placeable labelPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, boolean singleLine, int labelEndPosition, int textPosition, float animationProgress, float density) {
        int startPosition;
        if (leadingPlaceable != null) {
            Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, leadingPlaceable, 0, Alignment.INSTANCE.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
        }
        if (trailingPlaceable != null) {
            Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.INSTANCE.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
        }
        if (labelPlaceable != null) {
            if (singleLine) {
                startPosition = Alignment.INSTANCE.getCenterVertically().align(labelPlaceable.getHeight(), height);
            } else {
                startPosition = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * density);
            }
            int distance = startPosition - labelEndPosition;
            int positionY = startPosition - MathKt.roundToInt(distance * animationProgress);
            Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, labelPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), positionY, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, textfieldPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textPosition, 0.0f, 4, null);
        if (placeholderPlaceable != null) {
            Placeable.PlacementScope.placeRelative$default($this$placeWithLabel, placeholderPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textPosition, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope $this$placeWithoutLabel, int width, int height, Placeable textPlaceable, Placeable placeholderPlaceable, Placeable leadingPlaceable, Placeable trailingPlaceable, boolean singleLine, float density, PaddingValues paddingValues) {
        int textVerticalPosition;
        int placeholderVerticalPosition;
        int topPadding = MathKt.roundToInt(paddingValues.getTop() * density);
        if (leadingPlaceable != null) {
            Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, leadingPlaceable, 0, Alignment.INSTANCE.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0f, 4, null);
        }
        if (trailingPlaceable != null) {
            Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.INSTANCE.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0f, 4, null);
        }
        if (singleLine) {
            textVerticalPosition = Alignment.INSTANCE.getCenterVertically().align(textPlaceable.getHeight(), height);
        } else {
            textVerticalPosition = topPadding;
        }
        Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, textPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), textVerticalPosition, 0.0f, 4, null);
        if (placeholderPlaceable != null) {
            if (singleLine) {
                placeholderVerticalPosition = Alignment.INSTANCE.getCenterVertically().align(placeholderPlaceable.getHeight(), height);
            } else {
                placeholderVerticalPosition = topPadding;
            }
            Placeable.PlacementScope.placeRelative$default($this$placeWithoutLabel, placeholderPlaceable, TextFieldImplKt.widthOrZero(leadingPlaceable), placeholderVerticalPosition, 0.0f, 4, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier $this$drawIndicatorLine, final BorderStroke indicatorBorder) {
        final float strokeWidthDp = indicatorBorder.getWidth();
        return DrawModifierKt.drawWithContent($this$drawIndicatorLine, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt.drawIndicatorLine.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope $this$drawWithContent) {
                $this$drawWithContent.drawContent();
                if (Dp.m7023equalsimpl0(strokeWidthDp, Dp.INSTANCE.m7036getHairlineD9Ej5fM())) {
                    return;
                }
                float strokeWidth = strokeWidthDp * $this$drawWithContent.getDensity();
                float y = Size.m4215getHeightimpl($this$drawWithContent.mo4952getSizeNHjbRc()) - (strokeWidth / 2);
                DrawScope.m4937drawLine1RTmtNc$default($this$drawWithContent, indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, y), OffsetKt.Offset(Size.m4218getWidthimpl($this$drawWithContent.mo4952getSizeNHjbRc()), y), strokeWidth, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }
}
