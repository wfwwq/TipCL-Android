package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;
import org.tukaani.xz.LZMA2Options;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J×\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00106Já\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00107JÂ\u0001\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00109JÌ\u0001\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u0010:Jä\u0001\u0010;\u001a\u00020 2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020=2\b\b\u0002\u0010B\u001a\u00020=2\b\b\u0002\u0010C\u001a\u00020=2\b\b\u0002\u0010D\u001a\u00020=2\b\b\u0002\u0010E\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020=2\b\b\u0002\u0010H\u001a\u00020=2\b\b\u0002\u0010I\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020=2\b\b\u0002\u0010K\u001a\u00020=2\b\b\u0002\u0010L\u001a\u00020=2\b\b\u0002\u0010M\u001a\u00020=2\b\b\u0002\u0010N\u001a\u00020=2\b\b\u0002\u0010O\u001a\u00020=2\b\b\u0002\u0010P\u001a\u00020=2\b\b\u0002\u0010Q\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ:\u0010T\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJä\u0001\u0010[\u001a\u00020 2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020=2\b\b\u0002\u0010\\\u001a\u00020=2\b\b\u0002\u0010]\u001a\u00020=2\b\b\u0002\u0010^\u001a\u00020=2\b\b\u0002\u0010_\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020=2\b\b\u0002\u0010H\u001a\u00020=2\b\b\u0002\u0010I\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020=2\b\b\u0002\u0010K\u001a\u00020=2\b\b\u0002\u0010L\u001a\u00020=2\b\b\u0002\u0010M\u001a\u00020=2\b\b\u0002\u0010N\u001a\u00020=2\b\b\u0002\u0010O\u001a\u00020=2\b\b\u0002\u0010P\u001a\u00020=2\b\b\u0002\u0010Q\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\b`\u0010SJ:\u0010a\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bb\u0010ZJ:\u0010c\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bd\u0010ZJJ\u0010e\u001a\u00020f*\u00020f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010g\u001a\u00020\u00062\b\b\u0002\u0010h\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bi\u0010jR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\f\u0010\bR\u0019\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "IconOpacity", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedTextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getOutlinedTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "BorderBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OutlinedTextFieldKt.BorderId, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldPadding", "start", "top", "end", "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m7018constructorimpl(56);
    private static final float MinWidth = Dp.m7018constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m7018constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m7018constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1843getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1844getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getTextFieldShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1117199624, "C(<get-TextFieldShape>)220@8352L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, $changed, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:220)");
        }
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return cornerBasedShapeCopy$default;
    }

    public final Shape getOutlinedTextFieldShape(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1899109048, "C(<get-OutlinedTextFieldShape>)227@8659L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, $changed, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:227)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes($composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return small;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1845getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1842getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1837indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 16) == 0) {
            f3 = f;
        } else {
            f3 = FocusedBorderThickness;
        }
        if ((i & 32) == 0) {
            f4 = f2;
        } else {
            f4 = UnfocusedBorderThickness;
        }
        return textFieldDefaults.m1846indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f3, f4);
    }

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1846indicatorLinegv0btCI(Modifier $this$indicatorLine_u2dgv0btCI, final boolean enabled, final boolean isError, final InteractionSource interactionSource, final TextFieldColors colors, final float focusedIndicatorLineThickness, final float unfocusedIndicatorLineThickness) {
        return ComposedModifierKt.composed($this$indicatorLine_u2dgv0btCI, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo $this$null) {
                $this$null.setName("indicatorLine");
                $this$null.getProperties().set("enabled", Boolean.valueOf(enabled));
                $this$null.getProperties().set("isError", Boolean.valueOf(isError));
                $this$null.getProperties().set("interactionSource", interactionSource);
                $this$null.getProperties().set("colors", colors);
                $this$null.getProperties().set("focusedIndicatorLineThickness", Dp.m7016boximpl(focusedIndicatorLineThickness));
                $this$null.getProperties().set("unfocusedIndicatorLineThickness", Dp.m7016boximpl(unfocusedIndicatorLineThickness));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
                $composer.startReplaceGroup(1398930845);
                ComposerKt.sourceInformation($composer, "C289@11231L273:TextFieldDefaults.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398930845, $changed, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
                }
                State stroke = TextFieldDefaultsKt.m1853animateBorderStrokeAsStateNuRrP5Q(enabled, isError, interactionSource, colors, focusedIndicatorLineThickness, unfocusedIndicatorLineThickness, $composer, 0);
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) stroke.getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                $composer.endReplaceGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    public final void m1841BorderBoxnbWgWpA(final boolean enabled, final boolean isError, final InteractionSource interactionSource, final TextFieldColors colors, Shape shape, float focusedBorderThickness, float unfocusedBorderThickness, Composer $composer, final int $changed, final int i) {
        boolean z;
        boolean z2;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors;
        Shape shape2;
        float focusedBorderThickness2;
        float f;
        Composer $composer2;
        final float unfocusedBorderThickness2;
        final float focusedBorderThickness3;
        final Shape shape3;
        float focusedBorderThickness4;
        int i2;
        float unfocusedBorderThickness3;
        Composer $composer3 = $composer.startRestartGroup(943754022);
        ComposerKt.sourceInformation($composer3, "C(BorderBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)327@12851L231,335@13091L47:TextFieldDefaults.kt#jmzs0o");
        int $dirty = $changed;
        if ((i & 1) != 0) {
            $dirty |= 6;
            z = enabled;
        } else if (($changed & 6) == 0) {
            z = enabled;
            $dirty |= $composer3.changed(z) ? 4 : 2;
        } else {
            z = enabled;
        }
        if ((i & 2) != 0) {
            $dirty |= 48;
            z2 = isError;
        } else if (($changed & 48) == 0) {
            z2 = isError;
            $dirty |= $composer3.changed(z2) ? 32 : 16;
        } else {
            z2 = isError;
        }
        if ((i & 4) != 0) {
            $dirty |= 384;
            interactionSource2 = interactionSource;
        } else if (($changed & 384) == 0) {
            interactionSource2 = interactionSource;
            $dirty |= $composer3.changed(interactionSource2) ? 256 : 128;
        } else {
            interactionSource2 = interactionSource;
        }
        if ((i & 8) != 0) {
            $dirty |= 3072;
            textFieldColors = colors;
        } else if (($changed & 3072) == 0) {
            textFieldColors = colors;
            $dirty |= $composer3.changed(textFieldColors) ? 2048 : 1024;
        } else {
            textFieldColors = colors;
        }
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                shape2 = shape;
                int i3 = $composer3.changed(shape2) ? 16384 : 8192;
                $dirty |= i3;
            } else {
                shape2 = shape;
            }
            $dirty |= i3;
        } else {
            shape2 = shape;
        }
        if ((196608 & $changed) == 0) {
            if ((i & 32) == 0) {
                focusedBorderThickness2 = focusedBorderThickness;
                int i4 = $composer3.changed(focusedBorderThickness2) ? 131072 : 65536;
                $dirty |= i4;
            } else {
                focusedBorderThickness2 = focusedBorderThickness;
            }
            $dirty |= i4;
        } else {
            focusedBorderThickness2 = focusedBorderThickness;
        }
        if ((1572864 & $changed) == 0) {
            if ((i & 64) == 0) {
                f = unfocusedBorderThickness;
                int i5 = $composer3.changed(f) ? 1048576 : 524288;
                $dirty |= i5;
            } else {
                f = unfocusedBorderThickness;
            }
            $dirty |= i5;
        } else {
            f = unfocusedBorderThickness;
        }
        if ((i & 128) != 0) {
            $dirty |= User32.WS_CAPTION;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            $dirty |= $composer3.changed(this) ? 8388608 : 4194304;
        }
        if ($composer3.shouldExecute((4793491 & $dirty) != 4793490, $dirty & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "322@12655L22");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 16) != 0) {
                    $dirty &= -57345;
                }
                if ((i & 32) != 0) {
                    $dirty &= -458753;
                }
                if ((i & 64) != 0) {
                    $dirty &= -3670017;
                    focusedBorderThickness4 = focusedBorderThickness2;
                    i2 = 0;
                    unfocusedBorderThickness3 = f;
                } else {
                    focusedBorderThickness4 = focusedBorderThickness2;
                    i2 = 0;
                    unfocusedBorderThickness3 = f;
                }
            } else {
                if ((i & 16) != 0) {
                    shape2 = getOutlinedTextFieldShape($composer3, ($dirty >> 21) & 14);
                    $dirty &= -57345;
                }
                if ((i & 32) != 0) {
                    focusedBorderThickness2 = FocusedBorderThickness;
                    $dirty &= -458753;
                }
                if ((i & 64) == 0) {
                    focusedBorderThickness4 = focusedBorderThickness2;
                    i2 = 0;
                    unfocusedBorderThickness3 = f;
                } else {
                    $dirty &= -3670017;
                    focusedBorderThickness4 = focusedBorderThickness2;
                    i2 = 0;
                    unfocusedBorderThickness3 = UnfocusedBorderThickness;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943754022, $dirty, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:325)");
            }
            State borderStroke = TextFieldDefaultsKt.m1853animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource2, textFieldColors, focusedBorderThickness4, unfocusedBorderThickness3, $composer3, ($dirty & 14) | ($dirty & 112) | ($dirty & User32.WM_PENWINFIRST) | ($dirty & GL11.GL_RENDER) | (($dirty >> 3) & 57344) | (458752 & ($dirty >> 3)));
            $composer2 = $composer3;
            BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) borderStroke.getValue(), shape2), $composer2, i2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            focusedBorderThickness3 = focusedBorderThickness4;
            unfocusedBorderThickness2 = unfocusedBorderThickness3;
            shape3 = shape2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            unfocusedBorderThickness2 = f;
            focusedBorderThickness3 = focusedBorderThickness2;
            shape3 = shape2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$BorderBox$1
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
                    this.$tmp0_rcvr.m1841BorderBoxnbWgWpA(enabled, isError, interactionSource, colors, shape3, focusedBorderThickness3, unfocusedBorderThickness2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1839textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1850textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1850textFieldWithLabelPaddinga9UjIt4(float start, float end, float top2, float bottom) {
        return PaddingKt.m734PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1840textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1851textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1851textFieldWithoutLabelPaddinga9UjIt4(float start, float top2, float end, float bottom) {
        return PaddingKt.m734PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1838outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1848outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1848outlinedTextFieldPaddinga9UjIt4(float start, float top2, float end, float bottom) {
        return PaddingKt.m734PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1849textFieldColorsdx8h9Zs(long textColor, long disabledTextColor, long backgroundColor, long cursorColor, long errorCursorColor, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int i) {
        long textColor2;
        long backgroundColor2;
        long focusedIndicatorColor2;
        long unfocusedIndicatorColor2;
        long unfocusedIndicatorColor3;
        long disabledIndicatorColor2;
        long leadingIconColor2;
        long leadingIconColor3;
        long leadingIconColor4;
        long trailingIconColor2;
        long trailingIconColor3;
        long trailingIconColor4;
        long focusedLabelColor2;
        long unfocusedLabelColor2;
        long unfocusedLabelColor3;
        long unfocusedLabelColor4;
        long placeholderColor2;
        long disabledPlaceholderColor2;
        ComposerKt.sourceInformationMarkerStart($composer, 231892599, "C(textFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)385@15008L7,385@15039L7,386@15112L8,387@15170L6,388@15263L6,389@15327L6,390@15394L6,390@15435L4,392@15509L6,393@15661L8,394@15723L6,395@15785L6,396@15914L8,398@16031L6,399@16162L8,400@16227L6,401@16290L6,401@16331L4,402@16389L6,402@16424L6,403@16507L8,404@16565L6,405@16627L6,405@16662L6,406@16748L8:TextFieldDefaults.kt#jmzs0o");
        if ((i & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd($composer);
            long jM4400unboximpl = ((Color) objConsume).m4400unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd($composer);
            textColor2 = Color.m4388copywmQWz5c(jM4400unboximpl, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM4400unboximpl) : ((Number) objConsume2).floatValue(), (14 & 2) != 0 ? Color.m4396getRedimpl(jM4400unboximpl) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM4400unboximpl) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM4400unboximpl) : 0.0f);
        } else {
            textColor2 = textColor;
        }
        long disabledTextColor2 = (i & 2) != 0 ? Color.m4388copywmQWz5c(textColor2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(textColor2) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(textColor2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(textColor2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(textColor2) : 0.0f) : disabledTextColor;
        if ((i & 4) != 0) {
            long jM1618getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            backgroundColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU) : 0.12f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU) : 0.0f);
        } else {
            backgroundColor2 = backgroundColor;
        }
        long cursorColor2 = (i & 8) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1619getPrimary0d7_KjU() : cursorColor;
        long errorCursorColor2 = (i & 16) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorCursorColor;
        if ((i & 32) != 0) {
            long jM1619getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors($composer, 6).m1619getPrimary0d7_KjU();
            focusedIndicatorColor2 = Color.m4388copywmQWz5c(jM1619getPrimary0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1619getPrimary0d7_KjU) : ContentAlpha.INSTANCE.getHigh($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1619getPrimary0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1619getPrimary0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1619getPrimary0d7_KjU) : 0.0f);
        } else {
            focusedIndicatorColor2 = focusedIndicatorColor;
        }
        if ((i & 64) != 0) {
            long jM1618getOnSurface0d7_KjU2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            unfocusedIndicatorColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU2) : 0.42f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU2) : 0.0f);
        } else {
            unfocusedIndicatorColor2 = unfocusedIndicatorColor;
        }
        if ((i & 128) != 0) {
            long unfocusedIndicatorColor4 = unfocusedIndicatorColor2;
            unfocusedIndicatorColor3 = unfocusedIndicatorColor4;
            disabledIndicatorColor2 = Color.m4388copywmQWz5c(unfocusedIndicatorColor4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(unfocusedIndicatorColor4) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(unfocusedIndicatorColor4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(unfocusedIndicatorColor4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(unfocusedIndicatorColor4) : 0.0f);
        } else {
            unfocusedIndicatorColor3 = unfocusedIndicatorColor2;
            disabledIndicatorColor2 = disabledIndicatorColor;
        }
        long errorIndicatorColor2 = (i & 256) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorIndicatorColor;
        if ((i & 512) != 0) {
            long jM1618getOnSurface0d7_KjU3 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            leadingIconColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU3) : 0.54f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU3) : 0.0f);
        } else {
            leadingIconColor2 = leadingIconColor;
        }
        if ((i & 1024) != 0) {
            long leadingIconColor5 = leadingIconColor2;
            leadingIconColor4 = Color.m4388copywmQWz5c(leadingIconColor5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(leadingIconColor5) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(leadingIconColor5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(leadingIconColor5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(leadingIconColor5) : 0.0f);
            leadingIconColor3 = leadingIconColor5;
        } else {
            leadingIconColor3 = leadingIconColor2;
            leadingIconColor4 = disabledLeadingIconColor;
        }
        long errorLeadingIconColor2 = (i & 2048) != 0 ? leadingIconColor3 : errorLeadingIconColor;
        if ((i & 4096) != 0) {
            long jM1618getOnSurface0d7_KjU4 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            trailingIconColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU4) : 0.54f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU4) : 0.0f);
        } else {
            trailingIconColor2 = trailingIconColor;
        }
        if ((i & 8192) != 0) {
            long trailingIconColor5 = trailingIconColor2;
            trailingIconColor4 = Color.m4388copywmQWz5c(trailingIconColor5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(trailingIconColor5) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(trailingIconColor5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(trailingIconColor5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(trailingIconColor5) : 0.0f);
            trailingIconColor3 = trailingIconColor5;
        } else {
            trailingIconColor3 = trailingIconColor2;
            trailingIconColor4 = disabledTrailingIconColor;
        }
        long errorTrailingIconColor2 = (i & 16384) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorTrailingIconColor;
        if ((32768 & i) != 0) {
            long jM1619getPrimary0d7_KjU2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1619getPrimary0d7_KjU();
            focusedLabelColor2 = Color.m4388copywmQWz5c(jM1619getPrimary0d7_KjU2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1619getPrimary0d7_KjU2) : ContentAlpha.INSTANCE.getHigh($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1619getPrimary0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1619getPrimary0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1619getPrimary0d7_KjU2) : 0.0f);
        } else {
            focusedLabelColor2 = focusedLabelColor;
        }
        if ((65536 & i) != 0) {
            long jM1618getOnSurface0d7_KjU5 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            unfocusedLabelColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU5) : ContentAlpha.INSTANCE.getMedium($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU5) : 0.0f);
        } else {
            unfocusedLabelColor2 = unfocusedLabelColor;
        }
        if ((131072 & i) != 0) {
            long unfocusedLabelColor5 = unfocusedLabelColor2;
            unfocusedLabelColor4 = Color.m4388copywmQWz5c(unfocusedLabelColor5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(unfocusedLabelColor5) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(unfocusedLabelColor5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(unfocusedLabelColor5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(unfocusedLabelColor5) : 0.0f);
            unfocusedLabelColor3 = unfocusedLabelColor5;
        } else {
            unfocusedLabelColor3 = unfocusedLabelColor2;
            unfocusedLabelColor4 = disabledLabelColor;
        }
        long errorLabelColor2 = (262144 & i) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorLabelColor;
        if ((524288 & i) != 0) {
            long jM1618getOnSurface0d7_KjU6 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            placeholderColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU6, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU6) : ContentAlpha.INSTANCE.getMedium($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU6) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU6) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU6) : 0.0f);
        } else {
            placeholderColor2 = placeholderColor;
        }
        if ((i & 1048576) != 0) {
            long placeholderColor3 = placeholderColor2;
            disabledPlaceholderColor2 = Color.m4388copywmQWz5c(placeholderColor3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(placeholderColor3) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(placeholderColor3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(placeholderColor3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(placeholderColor3) : 0.0f);
        } else {
            disabledPlaceholderColor2 = disabledPlaceholderColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, $changed, $changed1, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:408)");
        }
        long unfocusedIndicatorColor5 = unfocusedIndicatorColor3;
        long unfocusedIndicatorColor6 = errorIndicatorColor2;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(textColor2, disabledTextColor2, cursorColor2, errorCursorColor2, focusedIndicatorColor2, unfocusedIndicatorColor5, unfocusedIndicatorColor6, disabledIndicatorColor2, leadingIconColor3, leadingIconColor4, errorLeadingIconColor2, trailingIconColor3, trailingIconColor4, errorTrailingIconColor2, backgroundColor2, focusedLabelColor2, unfocusedLabelColor3, unfocusedLabelColor4, errorLabelColor2, placeholderColor2, disabledPlaceholderColor2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return defaultTextFieldColors;
    }

    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1847outlinedTextFieldColorsdx8h9Zs(long textColor, long disabledTextColor, long backgroundColor, long cursorColor, long errorCursorColor, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long placeholderColor, long disabledPlaceholderColor, Composer $composer, int $changed, int $changed1, int $changed2, int i) {
        long textColor2;
        long focusedBorderColor2;
        long unfocusedBorderColor2;
        long unfocusedBorderColor3;
        long disabledBorderColor2;
        long leadingIconColor2;
        long leadingIconColor3;
        long leadingIconColor4;
        long trailingIconColor2;
        long trailingIconColor3;
        long trailingIconColor4;
        long focusedLabelColor2;
        long unfocusedLabelColor2;
        long unfocusedLabelColor3;
        long unfocusedLabelColor4;
        long placeholderColor2;
        long disabledPlaceholderColor2;
        ComposerKt.sourceInformationMarkerStart($composer, 1762667317, "C(outlinedTextFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)439@18276L7,439@18307L7,440@18380L8,442@18486L6,443@18550L6,444@18614L6,444@18655L4,446@18726L6,446@18769L8,447@18864L8,448@18923L6,449@18985L6,450@19114L8,452@19231L6,453@19362L8,454@19427L6,455@19490L6,455@19531L4,456@19589L6,456@19624L6,457@19707L8,458@19765L6,459@19827L6,459@19862L6,460@19948L8:TextFieldDefaults.kt#jmzs0o");
        if ((i & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd($composer);
            long jM4400unboximpl = ((Color) objConsume).m4400unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd($composer);
            textColor2 = Color.m4388copywmQWz5c(jM4400unboximpl, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM4400unboximpl) : ((Number) objConsume2).floatValue(), (14 & 2) != 0 ? Color.m4396getRedimpl(jM4400unboximpl) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM4400unboximpl) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM4400unboximpl) : 0.0f);
        } else {
            textColor2 = textColor;
        }
        long disabledTextColor2 = (i & 2) != 0 ? Color.m4388copywmQWz5c(textColor2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(textColor2) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(textColor2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(textColor2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(textColor2) : 0.0f) : disabledTextColor;
        long backgroundColor2 = (i & 4) != 0 ? Color.INSTANCE.m4425getTransparent0d7_KjU() : backgroundColor;
        long cursorColor2 = (i & 8) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1619getPrimary0d7_KjU() : cursorColor;
        long errorCursorColor2 = (i & 16) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorCursorColor;
        if ((i & 32) != 0) {
            long jM1619getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors($composer, 6).m1619getPrimary0d7_KjU();
            focusedBorderColor2 = Color.m4388copywmQWz5c(jM1619getPrimary0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1619getPrimary0d7_KjU) : ContentAlpha.INSTANCE.getHigh($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1619getPrimary0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1619getPrimary0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1619getPrimary0d7_KjU) : 0.0f);
        } else {
            focusedBorderColor2 = focusedBorderColor;
        }
        if ((i & 64) != 0) {
            long jM1618getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            unfocusedBorderColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU) : 0.0f);
        } else {
            unfocusedBorderColor2 = unfocusedBorderColor;
        }
        if ((i & 128) != 0) {
            long unfocusedBorderColor4 = unfocusedBorderColor2;
            unfocusedBorderColor3 = unfocusedBorderColor4;
            disabledBorderColor2 = Color.m4388copywmQWz5c(unfocusedBorderColor4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(unfocusedBorderColor4) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(unfocusedBorderColor4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(unfocusedBorderColor4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(unfocusedBorderColor4) : 0.0f);
        } else {
            unfocusedBorderColor3 = unfocusedBorderColor2;
            disabledBorderColor2 = disabledBorderColor;
        }
        long errorBorderColor2 = (i & 256) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorBorderColor;
        if ((i & 512) != 0) {
            long jM1618getOnSurface0d7_KjU2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            leadingIconColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU2) : 0.54f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU2) : 0.0f);
        } else {
            leadingIconColor2 = leadingIconColor;
        }
        if ((i & 1024) != 0) {
            long leadingIconColor5 = leadingIconColor2;
            leadingIconColor4 = Color.m4388copywmQWz5c(leadingIconColor5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(leadingIconColor5) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(leadingIconColor5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(leadingIconColor5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(leadingIconColor5) : 0.0f);
            leadingIconColor3 = leadingIconColor5;
        } else {
            leadingIconColor3 = leadingIconColor2;
            leadingIconColor4 = disabledLeadingIconColor;
        }
        long errorLeadingIconColor2 = (i & 2048) != 0 ? leadingIconColor3 : errorLeadingIconColor;
        if ((i & 4096) != 0) {
            long jM1618getOnSurface0d7_KjU3 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            trailingIconColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU3) : 0.54f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU3) : 0.0f);
        } else {
            trailingIconColor2 = trailingIconColor;
        }
        if ((i & 8192) != 0) {
            long trailingIconColor5 = trailingIconColor2;
            trailingIconColor4 = Color.m4388copywmQWz5c(trailingIconColor5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(trailingIconColor5) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(trailingIconColor5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(trailingIconColor5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(trailingIconColor5) : 0.0f);
            trailingIconColor3 = trailingIconColor5;
        } else {
            trailingIconColor3 = trailingIconColor2;
            trailingIconColor4 = disabledTrailingIconColor;
        }
        long errorTrailingIconColor2 = (i & 16384) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorTrailingIconColor;
        if ((32768 & i) != 0) {
            long jM1619getPrimary0d7_KjU2 = MaterialTheme.INSTANCE.getColors($composer, 6).m1619getPrimary0d7_KjU();
            focusedLabelColor2 = Color.m4388copywmQWz5c(jM1619getPrimary0d7_KjU2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1619getPrimary0d7_KjU2) : ContentAlpha.INSTANCE.getHigh($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1619getPrimary0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1619getPrimary0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1619getPrimary0d7_KjU2) : 0.0f);
        } else {
            focusedLabelColor2 = focusedLabelColor;
        }
        if ((65536 & i) != 0) {
            long jM1618getOnSurface0d7_KjU4 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            unfocusedLabelColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU4, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU4) : ContentAlpha.INSTANCE.getMedium($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU4) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU4) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU4) : 0.0f);
        } else {
            unfocusedLabelColor2 = unfocusedLabelColor;
        }
        if ((131072 & i) != 0) {
            long unfocusedLabelColor5 = unfocusedLabelColor2;
            unfocusedLabelColor4 = Color.m4388copywmQWz5c(unfocusedLabelColor5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(unfocusedLabelColor5) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(unfocusedLabelColor5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(unfocusedLabelColor5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(unfocusedLabelColor5) : 0.0f);
            unfocusedLabelColor3 = unfocusedLabelColor5;
        } else {
            unfocusedLabelColor3 = unfocusedLabelColor2;
            unfocusedLabelColor4 = disabledLabelColor;
        }
        long errorLabelColor2 = (262144 & i) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1613getError0d7_KjU() : errorLabelColor;
        if ((524288 & i) != 0) {
            long jM1618getOnSurface0d7_KjU5 = MaterialTheme.INSTANCE.getColors($composer, 6).m1618getOnSurface0d7_KjU();
            placeholderColor2 = Color.m4388copywmQWz5c(jM1618getOnSurface0d7_KjU5, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM1618getOnSurface0d7_KjU5) : ContentAlpha.INSTANCE.getMedium($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(jM1618getOnSurface0d7_KjU5) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM1618getOnSurface0d7_KjU5) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM1618getOnSurface0d7_KjU5) : 0.0f);
        } else {
            placeholderColor2 = placeholderColor;
        }
        if ((i & 1048576) != 0) {
            long placeholderColor3 = placeholderColor2;
            disabledPlaceholderColor2 = Color.m4388copywmQWz5c(placeholderColor3, (14 & 1) != 0 ? Color.m4392getAlphaimpl(placeholderColor3) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (14 & 2) != 0 ? Color.m4396getRedimpl(placeholderColor3) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(placeholderColor3) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(placeholderColor3) : 0.0f);
        } else {
            disabledPlaceholderColor2 = disabledPlaceholderColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, $changed, $changed1, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:462)");
        }
        long unfocusedBorderColor5 = unfocusedBorderColor3;
        long unfocusedBorderColor6 = errorBorderColor2;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(textColor2, disabledTextColor2, cursorColor2, errorCursorColor2, focusedBorderColor2, unfocusedBorderColor5, unfocusedBorderColor6, disabledBorderColor2, leadingIconColor3, leadingIconColor4, errorLeadingIconColor2, trailingIconColor3, trailingIconColor4, errorTrailingIconColor2, backgroundColor2, focusedLabelColor2, unfocusedLabelColor3, unfocusedLabelColor4, errorLabelColor2, placeholderColor2, disabledPlaceholderColor2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return defaultTextFieldColors;
    }

    public final void TextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, TextFieldColors colors, PaddingValues contentPadding, Composer $composer, final int $changed, final int $changed1, int i) {
        boolean z;
        Function2 function26;
        int i2;
        int i3;
        Composer $composer2;
        int $dirty;
        final Function2 leadingIcon;
        final Function2 trailingIcon;
        final TextFieldColors colors2;
        final PaddingValues contentPadding2;
        final boolean isError2;
        final Function2 label;
        final Function2 placeholder;
        final Shape shape2;
        Shape shape3;
        boolean isError3;
        int $dirty2;
        TextFieldColors colors3;
        PaddingValues contentPadding3;
        boolean isError4;
        TextFieldColors colors4;
        int $dirty1;
        Shape shape4;
        int i4 = i;
        Composer $composer3 = $composer.startRestartGroup(-1391531252);
        ComposerKt.sourceInformation($composer3, "C(TextFieldDecorationBox)P(12,3,2,10,13,4,5,6,8,7,11,9)566@26239L624:TextFieldDefaults.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty12 = $changed1;
        if ((i4 & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(value) ? 4 : 2;
        }
        if ((i4 & 2) != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer3.changedInstance(function2) ? 32 : 16;
        }
        int i5 = 128;
        if ((i4 & 4) != 0) {
            $dirty3 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty3 |= $composer3.changed(enabled) ? 256 : 128;
        }
        int i6 = 1024;
        if ((i4 & 8) != 0) {
            $dirty3 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty3 |= $composer3.changed(singleLine) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            $dirty3 |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty3 |= $composer3.changed(visualTransformation) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty3 |= $composer3.changed(interactionSource) ? 131072 : 65536;
        }
        int i7 = i4 & 64;
        if (i7 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            z = isError;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            z = isError;
            $dirty3 |= $composer3.changed(z) ? 1048576 : 524288;
        } else {
            z = isError;
        }
        int i8 = i4 & 128;
        if (i8 != 0) {
            $dirty3 |= User32.WS_CAPTION;
            function26 = function22;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function26 = function22;
            $dirty3 |= $composer3.changedInstance(function26) ? 8388608 : 4194304;
        } else {
            function26 = function22;
        }
        int i9 = i4 & 256;
        if (i9 != 0) {
            $dirty3 |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty3 |= $composer3.changedInstance(function23) ? 67108864 : 33554432;
        }
        int i10 = i4 & 512;
        if (i10 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i2 = i10;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i2 = i10;
            $dirty3 |= $composer3.changedInstance(function24) ? 536870912 : 268435456;
        } else {
            i2 = i10;
        }
        int i11 = i4 & 1024;
        if (i11 != 0) {
            $dirty12 |= 6;
            i3 = i11;
        } else if (($changed1 & 6) == 0) {
            i3 = i11;
            $dirty12 |= $composer3.changedInstance(function25) ? 4 : 2;
        } else {
            i3 = i11;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= ((i4 & 2048) == 0 && $composer3.changed(shape)) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            if ((i4 & 4096) == 0 && $composer3.changed(colors)) {
                i5 = 256;
            }
            $dirty12 |= i5;
        }
        if (($changed1 & 3072) == 0) {
            if ((i4 & 8192) == 0 && $composer3.changed(contentPadding)) {
                i6 = 2048;
            }
            $dirty12 |= i6;
        }
        if ((i4 & 16384) != 0) {
            $dirty12 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty12 |= $composer3.changed(this) ? 16384 : 8192;
        }
        if ($composer3.shouldExecute(((306783379 & $dirty3) == 306783378 && ($dirty12 & 9363) == 9362) ? false : true, $dirty3 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "557@25955L14,558@26005L17");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                boolean isError5 = i7 != 0 ? false : z;
                Function2 label2 = i8 != 0 ? null : function26;
                Function2 placeholder2 = i9 != 0 ? null : function23;
                Function2 leadingIcon2 = i2 != 0 ? null : function24;
                Function2 trailingIcon2 = i3 != 0 ? null : function25;
                if ((i4 & 2048) != 0) {
                    Shape shape5 = getTextFieldShape($composer3, ($dirty12 >> 12) & 14);
                    $dirty12 &= -113;
                    shape3 = shape5;
                } else {
                    shape3 = shape;
                }
                if ((i4 & 4096) != 0) {
                    isError3 = isError5;
                    $dirty2 = $dirty3;
                    colors3 = m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 0, 0, ($dirty12 >> 9) & 112, 2097151);
                    $composer2 = $composer3;
                    $dirty12 &= -897;
                } else {
                    isError3 = isError5;
                    $composer2 = $composer3;
                    $dirty2 = $dirty3;
                    colors3 = colors;
                }
                i4 = i;
                if ((i4 & 8192) != 0) {
                    isError4 = isError3;
                    contentPadding3 = label2 == null ? m1840textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : m1839textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    $dirty1 = $dirty12 & (-7169);
                    colors4 = colors3;
                    label = label2;
                    placeholder = placeholder2;
                    leadingIcon = leadingIcon2;
                    trailingIcon = trailingIcon2;
                    shape4 = shape3;
                } else {
                    contentPadding3 = contentPadding;
                    isError4 = isError3;
                    colors4 = colors3;
                    $dirty1 = $dirty12;
                    label = label2;
                    placeholder = placeholder2;
                    leadingIcon = leadingIcon2;
                    trailingIcon = trailingIcon2;
                    shape4 = shape3;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i4 & 2048) != 0) {
                    $dirty12 &= -113;
                }
                if ((i4 & 4096) != 0) {
                    $dirty12 &= -897;
                }
                if ((i4 & 8192) != 0) {
                    $dirty1 = $dirty12 & (-7169);
                    leadingIcon = function24;
                    trailingIcon = function25;
                    shape4 = shape;
                    colors4 = colors;
                    contentPadding3 = contentPadding;
                    $composer2 = $composer3;
                    $dirty2 = $dirty3;
                    isError4 = z;
                    label = function26;
                    placeholder = function23;
                } else {
                    leadingIcon = function24;
                    trailingIcon = function25;
                    shape4 = shape;
                    colors4 = colors;
                    contentPadding3 = contentPadding;
                    $composer2 = $composer3;
                    $dirty2 = $dirty3;
                    $dirty1 = $dirty12;
                    isError4 = z;
                    label = function26;
                    placeholder = function23;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                $dirty = $dirty2;
                ComposerKt.traceEventStart(-1391531252, $dirty, $dirty1, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:565)");
            } else {
                $dirty = $dirty2;
            }
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, function2, visualTransformation, label, placeholder, leadingIcon, trailingIcon, singleLine, enabled, isError4, interactionSource, contentPadding3, shape4, colors4, null, $composer2, (($dirty << 3) & 112) | 6 | (($dirty << 3) & User32.WM_PENWINFIRST) | (($dirty >> 3) & GL11.GL_RENDER) | (($dirty >> 9) & 57344) | (($dirty >> 9) & 458752) | (($dirty >> 9) & 3670016) | (($dirty1 << 21) & 29360128) | (($dirty << 15) & 234881024) | (($dirty << 21) & 1879048192), (($dirty >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (($dirty >> 12) & 112) | (($dirty1 >> 3) & User32.WM_PENWINFIRST) | (($dirty1 << 6) & GL11.GL_RENDER) | (($dirty1 << 6) & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isError2 = isError4;
            contentPadding2 = contentPadding3;
            shape2 = shape4;
            colors2 = colors4;
        } else {
            $composer2 = $composer3;
            $dirty = $dirty3;
            $composer2.skipToGroupEnd();
            leadingIcon = function24;
            trailingIcon = function25;
            colors2 = colors;
            contentPadding2 = contentPadding;
            isError2 = z;
            label = function26;
            placeholder = function23;
            shape2 = shape;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i12 = i4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox.1
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

                public final void invoke(Composer composer, int i13) {
                    TextFieldDefaults.this.TextFieldDecorationBox(value, function2, enabled, singleLine, visualTransformation, interactionSource, isError2, label, placeholder, leadingIcon, trailingIcon, shape2, colors2, contentPadding2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i12);
                }
            });
        }
    }

    public final void OutlinedTextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, TextFieldColors colors, PaddingValues contentPadding, Function2<? super Composer, ? super Integer, Unit> function26, Composer $composer, final int $changed, final int $changed1, int i) {
        boolean z;
        Function2 function27;
        int i2;
        int i3;
        Composer $composer2;
        int $dirty;
        final Function2 leadingIcon;
        final Function2 trailingIcon;
        final TextFieldColors colors2;
        final PaddingValues contentPadding2;
        final Function2 border;
        final boolean isError2;
        final Function2 label;
        final Function2 placeholder;
        final Shape shape2;
        Shape shape3;
        boolean isError3;
        Composer $composer3;
        int $dirty2;
        int i4;
        TextFieldColors colors3;
        PaddingValues contentPadding3;
        Function2 border2;
        PaddingValues contentPadding4;
        TextFieldColors colors4;
        Shape shape4;
        int $dirty1;
        boolean isError4;
        int i5 = i;
        Composer $composer4 = $composer.startRestartGroup(-920823490);
        ComposerKt.sourceInformation($composer4, "C(OutlinedTextFieldDecorationBox)P(13,4,3,11,14,5,6,7,9,8,12,10,1,2)662@31811L628:TextFieldDefaults.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty12 = $changed1;
        if ((i5 & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer4.changed(value) ? 4 : 2;
        }
        if ((i5 & 2) != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer4.changedInstance(function2) ? 32 : 16;
        }
        int i6 = 128;
        if ((i5 & 4) != 0) {
            $dirty3 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty3 |= $composer4.changed(enabled) ? 256 : 128;
        }
        int i7 = 1024;
        if ((i5 & 8) != 0) {
            $dirty3 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty3 |= $composer4.changed(singleLine) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            $dirty3 |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty3 |= $composer4.changed(visualTransformation) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty3 |= $composer4.changed(interactionSource) ? 131072 : 65536;
        }
        int i8 = i5 & 64;
        if (i8 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            z = isError;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            z = isError;
            $dirty3 |= $composer4.changed(z) ? 1048576 : 524288;
        } else {
            z = isError;
        }
        int i9 = i5 & 128;
        if (i9 != 0) {
            $dirty3 |= User32.WS_CAPTION;
            function27 = function22;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function27 = function22;
            $dirty3 |= $composer4.changedInstance(function27) ? 8388608 : 4194304;
        } else {
            function27 = function22;
        }
        int i10 = i5 & 256;
        if (i10 != 0) {
            $dirty3 |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty3 |= $composer4.changedInstance(function23) ? 67108864 : 33554432;
        }
        int i11 = i5 & 512;
        if (i11 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i2 = i11;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i2 = i11;
            $dirty3 |= $composer4.changedInstance(function24) ? 536870912 : 268435456;
        } else {
            i2 = i11;
        }
        int i12 = i5 & 1024;
        if (i12 != 0) {
            $dirty12 |= 6;
            i3 = i12;
        } else if (($changed1 & 6) == 0) {
            i3 = i12;
            $dirty12 |= $composer4.changedInstance(function25) ? 4 : 2;
        } else {
            i3 = i12;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= ((i5 & 2048) == 0 && $composer4.changed(shape)) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            if ((i5 & 4096) == 0 && $composer4.changed(colors)) {
                i6 = 256;
            }
            $dirty12 |= i6;
        }
        if (($changed1 & 3072) == 0) {
            if ((i5 & 8192) == 0 && $composer4.changed(contentPadding)) {
                i7 = 2048;
            }
            $dirty12 |= i7;
        }
        int i13 = i5 & 16384;
        if (i13 != 0) {
            $dirty12 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty12 |= $composer4.changedInstance(function26) ? 16384 : 8192;
        }
        if ((i5 & 32768) != 0) {
            $dirty12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty12 |= $composer4.changed(this) ? 131072 : 65536;
        }
        if ($composer4.shouldExecute((($dirty3 & 306783379) == 306783378 && (74899 & $dirty12) == 74898) ? false : true, $dirty3 & 1)) {
            $composer4.startDefaults();
            ComposerKt.sourceInformation($composer4, "655@31515L22,656@31573L25,658@31709L85");
            if (($changed & 1) == 0 || $composer4.getDefaultsInvalid()) {
                boolean isError5 = i8 != 0 ? false : z;
                Function2 label2 = i9 != 0 ? null : function27;
                Function2 placeholder2 = i10 != 0 ? null : function23;
                Function2 leadingIcon2 = i2 != 0 ? null : function24;
                Function2 trailingIcon2 = i3 != 0 ? null : function25;
                if ((i5 & 2048) != 0) {
                    Shape shape5 = getOutlinedTextFieldShape($composer4, ($dirty12 >> 15) & 14);
                    $dirty12 &= -113;
                    shape3 = shape5;
                } else {
                    shape3 = shape;
                }
                if ((i5 & 4096) != 0) {
                    i4 = i13;
                    isError3 = isError5;
                    $dirty2 = $dirty3;
                    colors3 = m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer4, 0, 0, ($dirty12 >> 12) & 112, 2097151);
                    $composer3 = $composer4;
                    $dirty12 &= -897;
                } else {
                    isError3 = isError5;
                    $composer3 = $composer4;
                    $dirty2 = $dirty3;
                    i4 = i13;
                    colors3 = colors;
                }
                i5 = i;
                if ((i5 & 8192) != 0) {
                    contentPadding3 = m1838outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    $dirty12 &= -7169;
                } else {
                    contentPadding3 = contentPadding;
                }
                if (i4 != 0) {
                    final boolean isError6 = isError3;
                    final TextFieldColors colors5 = colors3;
                    final Shape shape6 = shape3;
                    contentPadding4 = contentPadding3;
                    border2 = ComposableLambdaKt.rememberComposableLambda(2147252344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer $composer5, int $changed2) {
                            ComposerKt.sourceInformation($composer5, "C659@31723L61:TextFieldDefaults.kt#jmzs0o");
                            if (!$composer5.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                                $composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2147252344, $changed2, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:659)");
                            }
                            TextFieldDefaults.INSTANCE.m1841BorderBoxnbWgWpA(enabled, isError6, interactionSource, colors5, shape6, 0.0f, 0.0f, $composer5, User32.WS_CAPTION, 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, $composer3, 54);
                    colors4 = colors5;
                    shape4 = shape6;
                    $dirty1 = $dirty12;
                    isError4 = isError6;
                    label = label2;
                    placeholder = placeholder2;
                    leadingIcon = leadingIcon2;
                    trailingIcon = trailingIcon2;
                } else {
                    border2 = function26;
                    contentPadding4 = contentPadding3;
                    colors4 = colors3;
                    shape4 = shape3;
                    $dirty1 = $dirty12;
                    isError4 = isError3;
                    label = label2;
                    placeholder = placeholder2;
                    leadingIcon = leadingIcon2;
                    trailingIcon = trailingIcon2;
                }
            } else {
                $composer4.skipToGroupEnd();
                if ((i5 & 2048) != 0) {
                    $dirty12 &= -113;
                }
                if ((i5 & 4096) != 0) {
                    $dirty12 &= -897;
                }
                if ((i5 & 8192) != 0) {
                    $dirty1 = $dirty12 & (-7169);
                    leadingIcon = function24;
                    trailingIcon = function25;
                    shape4 = shape;
                    colors4 = colors;
                    contentPadding4 = contentPadding;
                    border2 = function26;
                    $composer3 = $composer4;
                    $dirty2 = $dirty3;
                    isError4 = z;
                    label = function27;
                    placeholder = function23;
                } else {
                    leadingIcon = function24;
                    trailingIcon = function25;
                    shape4 = shape;
                    colors4 = colors;
                    contentPadding4 = contentPadding;
                    border2 = function26;
                    $composer3 = $composer4;
                    $dirty2 = $dirty3;
                    $dirty1 = $dirty12;
                    isError4 = z;
                    label = function27;
                    placeholder = function23;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                $dirty = $dirty2;
                ComposerKt.traceEventStart(-920823490, $dirty, $dirty1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:661)");
            } else {
                $dirty = $dirty2;
            }
            Composer $composer5 = $composer3;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, function2, visualTransformation, label, placeholder, leadingIcon, trailingIcon, singleLine, enabled, isError4, interactionSource, contentPadding4, shape4, colors4, border2, $composer5, (($dirty << 3) & 112) | 6 | (($dirty << 3) & User32.WM_PENWINFIRST) | (($dirty >> 3) & GL11.GL_RENDER) | (($dirty >> 9) & 57344) | (($dirty >> 9) & 458752) | (3670016 & ($dirty >> 9)) | (($dirty1 << 21) & 29360128) | (($dirty << 15) & 234881024) | (($dirty << 21) & 1879048192), (($dirty >> 18) & 14) | (($dirty >> 12) & 112) | (($dirty1 >> 3) & User32.WM_PENWINFIRST) | (($dirty1 << 6) & GL11.GL_RENDER) | (($dirty1 << 6) & 57344) | (458752 & ($dirty1 << 3)));
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isError2 = isError4;
            contentPadding2 = contentPadding4;
            shape2 = shape4;
            colors2 = colors4;
            border = border2;
        } else {
            $composer2 = $composer4;
            $dirty = $dirty3;
            $composer2.skipToGroupEnd();
            leadingIcon = function24;
            trailingIcon = function25;
            colors2 = colors;
            contentPadding2 = contentPadding;
            border = function26;
            isError2 = z;
            label = function27;
            placeholder = function23;
            shape2 = shape;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i14 = i5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.2
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

                public final void invoke(Composer composer, int i15) {
                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(value, function2, enabled, singleLine, visualTransformation, interactionSource, isError2, label, placeholder, leadingIcon, trailingIcon, shape2, colors2, contentPadding2, border, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i14);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    public final /* synthetic */ void TextFieldDecorationBox(final String value, final Function2 innerTextField, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, TextFieldColors colors, PaddingValues contentPadding, Composer $composer, final int $changed, final int $changed1, final int i) {
        boolean z;
        Function2 function2;
        int i2;
        int i3;
        Composer $composer2;
        final Function2 leadingIcon2;
        final Function2 trailingIcon2;
        final TextFieldColors colors2;
        final PaddingValues contentPadding2;
        final boolean isError2;
        final Function2 placeholder2;
        final Function2 trailingIcon3;
        int $dirty;
        int $dirty2;
        TextFieldColors colors3;
        int $dirty1;
        TextFieldDefaults textFieldDefaults;
        boolean isError3;
        Function2 label2;
        Function2 placeholder3;
        Function2 leadingIcon3;
        Function2 trailingIcon4;
        PaddingValues contentPadding3;
        int $dirty3;
        Composer $composer3 = $composer.startRestartGroup(1171040065);
        ComposerKt.sourceInformation($composer3, "C(TextFieldDecorationBox)P(11,3,2,9,12,4,5,6,8,7,10)720@33892L14,708@33423L568:TextFieldDefaults.kt#jmzs0o");
        int $dirty4 = $changed;
        int $dirty12 = $changed1;
        if ((i & 1) != 0) {
            $dirty4 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty4 |= $composer3.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty4 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty4 |= $composer3.changedInstance(innerTextField) ? 32 : 16;
        }
        int i4 = 128;
        if ((i & 4) != 0) {
            $dirty4 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty4 |= $composer3.changed(enabled) ? 256 : 128;
        }
        if ((i & 8) != 0) {
            $dirty4 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty4 |= $composer3.changed(singleLine) ? 2048 : 1024;
        }
        if ((i & 16) != 0) {
            $dirty4 |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty4 |= $composer3.changed(visualTransformation) ? 16384 : 8192;
        }
        if ((i & 32) != 0) {
            $dirty4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty4 |= $composer3.changed(interactionSource) ? 131072 : 65536;
        }
        int i5 = i & 64;
        if (i5 != 0) {
            $dirty4 |= JNINativeInterface.JNI_VERSION_24;
            z = isError;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            z = isError;
            $dirty4 |= $composer3.changed(z) ? 1048576 : 524288;
        } else {
            z = isError;
        }
        int i6 = i & 128;
        if (i6 != 0) {
            $dirty4 |= User32.WS_CAPTION;
            function2 = label;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function2 = label;
            $dirty4 |= $composer3.changedInstance(function2) ? 8388608 : 4194304;
        } else {
            function2 = label;
        }
        int i7 = i & 256;
        if (i7 != 0) {
            $dirty4 |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty4 |= $composer3.changedInstance(placeholder) ? 67108864 : 33554432;
        }
        int i8 = i & 512;
        if (i8 != 0) {
            $dirty4 |= LZMA2Options.DICT_SIZE_MAX;
            i2 = i8;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i2 = i8;
            $dirty4 |= $composer3.changedInstance(leadingIcon) ? 536870912 : 268435456;
        } else {
            i2 = i8;
        }
        int i9 = i & 1024;
        if (i9 != 0) {
            $dirty12 |= 6;
            i3 = i9;
        } else if (($changed1 & 6) == 0) {
            i3 = i9;
            $dirty12 |= $composer3.changedInstance(trailingIcon) ? 4 : 2;
        } else {
            i3 = i9;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= ((i & 2048) == 0 && $composer3.changed(colors)) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            if ((i & 4096) == 0 && $composer3.changed(contentPadding)) {
                i4 = 256;
            }
            $dirty12 |= i4;
        }
        if ((i & 8192) != 0) {
            $dirty12 |= 3072;
        } else if (($changed1 & 3072) == 0) {
            $dirty12 |= $composer3.changed(this) ? 2048 : 1024;
        }
        int $dirty13 = $dirty12;
        if ($composer3.shouldExecute(((306783379 & $dirty4) == 306783378 && ($dirty13 & 1171) == 1170) ? false : true, $dirty4 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "700@33189L17");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                boolean isError4 = i5 != 0 ? false : z;
                Function2 label3 = i6 != 0 ? null : function2;
                Function2 placeholder4 = i7 != 0 ? null : placeholder;
                Function2 leadingIcon4 = i2 != 0 ? null : leadingIcon;
                Function2 trailingIcon5 = i3 != 0 ? null : trailingIcon;
                if ((i & 2048) != 0) {
                    $dirty2 = $dirty4;
                    $dirty = i;
                    TextFieldColors colors4 = m1849textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 0, 0, ($dirty13 >> 6) & 112, 2097151);
                    $composer3 = $composer3;
                    $dirty1 = $dirty13 & (-113);
                    colors3 = colors4;
                } else {
                    $dirty = i;
                    $dirty2 = $dirty4;
                    colors3 = colors;
                    $dirty1 = $dirty13;
                }
                if (($dirty & 4096) != 0) {
                    if (label3 == null) {
                        textFieldDefaults = this;
                        contentPadding3 = m1840textFieldWithoutLabelPaddinga9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        textFieldDefaults = this;
                        contentPadding3 = m1839textFieldWithLabelPaddinga9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    contentPadding2 = contentPadding3;
                    $dirty13 = $dirty1 & (-897);
                    colors2 = colors3;
                    isError3 = isError4;
                    label2 = label3;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon4 = trailingIcon5;
                } else {
                    textFieldDefaults = this;
                    contentPadding2 = contentPadding;
                    colors2 = colors3;
                    $dirty13 = $dirty1;
                    isError3 = isError4;
                    label2 = label3;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon4 = trailingIcon5;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 2048) != 0) {
                    $dirty13 &= -113;
                }
                if ((i & 4096) != 0) {
                    leadingIcon3 = leadingIcon;
                    trailingIcon4 = trailingIcon;
                    colors2 = colors;
                    contentPadding2 = contentPadding;
                    $dirty13 &= -897;
                    $dirty2 = $dirty4;
                    isError3 = z;
                    label2 = function2;
                    textFieldDefaults = this;
                    placeholder3 = placeholder;
                } else {
                    textFieldDefaults = this;
                    leadingIcon3 = leadingIcon;
                    trailingIcon4 = trailingIcon;
                    colors2 = colors;
                    contentPadding2 = contentPadding;
                    $dirty2 = $dirty4;
                    isError3 = z;
                    label2 = function2;
                    placeholder3 = placeholder;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                $dirty3 = $dirty2;
                ComposerKt.traceEventStart(1171040065, $dirty3, $dirty13, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:708)");
            } else {
                $dirty3 = $dirty2;
            }
            textFieldDefaults.TextFieldDecorationBox(value, innerTextField, enabled, singleLine, visualTransformation, interactionSource, isError3, label2, placeholder3, leadingIcon3, trailingIcon4, textFieldDefaults.getTextFieldShape($composer3, ($dirty13 >> 9) & 14), colors2, contentPadding2, $composer3, ($dirty3 & 14) | ($dirty3 & 112) | ($dirty3 & User32.WM_PENWINFIRST) | ($dirty3 & GL11.GL_RENDER) | (57344 & $dirty3) | (458752 & $dirty3) | (3670016 & $dirty3) | (29360128 & $dirty3) | (234881024 & $dirty3) | (1879048192 & $dirty3), ($dirty13 & 14) | (($dirty13 << 3) & User32.WM_PENWINFIRST) | (($dirty13 << 3) & GL11.GL_RENDER) | (57344 & ($dirty13 << 3)), 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            trailingIcon3 = trailingIcon4;
            trailingIcon2 = leadingIcon3;
            leadingIcon2 = placeholder3;
            placeholder2 = label2;
            isError2 = isError3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            leadingIcon2 = placeholder;
            trailingIcon2 = leadingIcon;
            colors2 = colors;
            contentPadding2 = contentPadding;
            isError2 = z;
            placeholder2 = function2;
            trailingIcon3 = trailingIcon;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox.2
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
                    TextFieldDefaults.this.TextFieldDecorationBox(value, innerTextField, enabled, singleLine, visualTransformation, interactionSource, isError2, placeholder2, leadingIcon2, trailingIcon2, trailingIcon3, colors2, contentPadding2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(final String value, final Function2 innerTextField, final boolean enabled, final boolean singleLine, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean isError, Function2 label, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, TextFieldColors colors, PaddingValues contentPadding, Function2 border, Composer $composer, final int $changed, final int $changed1, final int i) {
        final boolean isError2;
        Function2 function2;
        int i2;
        int i3;
        int i4;
        Composer $composer2;
        final Function2 leadingIcon2;
        final Function2 trailingIcon2;
        final TextFieldColors colors2;
        final PaddingValues contentPadding2;
        final boolean isError3;
        final Function2 placeholder2;
        final Function2 trailingIcon3;
        final Function2 border2;
        boolean isError4;
        int i5;
        int $dirty;
        int i6;
        final TextFieldColors colors3;
        int $dirty1;
        TextFieldDefaults textFieldDefaults;
        PaddingValues contentPadding3;
        final boolean z;
        final InteractionSource interactionSource2;
        Function2 label2;
        Function2 placeholder3;
        Function2 leadingIcon3;
        Function2 trailingIcon4;
        int $dirty2;
        Composer $composer3 = $composer.startRestartGroup(-1280721485);
        ComposerKt.sourceInformation($composer3, "C(OutlinedTextFieldDecorationBox)P(12,4,3,10,13,5,6,7,9,8,11,1,2)759@35431L22,747@34954L613:TextFieldDefaults.kt#jmzs0o");
        int $dirty3 = $changed;
        int $dirty12 = $changed1;
        if ((i & 1) != 0) {
            $dirty3 |= 6;
        } else if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(value) ? 4 : 2;
        }
        if ((i & 2) != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer3.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i & 4) != 0) {
            $dirty3 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty3 |= $composer3.changed(enabled) ? 256 : 128;
        }
        if ((i & 8) != 0) {
            $dirty3 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty3 |= $composer3.changed(singleLine) ? 2048 : 1024;
        }
        if ((i & 16) != 0) {
            $dirty3 |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty3 |= $composer3.changed(visualTransformation) ? 16384 : 8192;
        }
        if ((i & 32) != 0) {
            $dirty3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty3 |= $composer3.changed(interactionSource) ? 131072 : 65536;
        }
        int i7 = i & 64;
        if (i7 != 0) {
            $dirty3 |= JNINativeInterface.JNI_VERSION_24;
            isError2 = isError;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            isError2 = isError;
            $dirty3 |= $composer3.changed(isError2) ? 1048576 : 524288;
        } else {
            isError2 = isError;
        }
        int i8 = i & 128;
        if (i8 != 0) {
            $dirty3 |= User32.WS_CAPTION;
            function2 = label;
        } else if (($changed & User32.WS_CAPTION) == 0) {
            function2 = label;
            $dirty3 |= $composer3.changedInstance(function2) ? 8388608 : 4194304;
        } else {
            function2 = label;
        }
        int i9 = i & 256;
        if (i9 != 0) {
            $dirty3 |= 100663296;
            i2 = i9;
        } else if (($changed & 100663296) == 0) {
            i2 = i9;
            $dirty3 |= $composer3.changedInstance(placeholder) ? 67108864 : 33554432;
        } else {
            i2 = i9;
        }
        int i10 = i & 512;
        if (i10 != 0) {
            $dirty3 |= LZMA2Options.DICT_SIZE_MAX;
            i3 = i10;
        } else if (($changed & LZMA2Options.DICT_SIZE_MAX) == 0) {
            i3 = i10;
            $dirty3 |= $composer3.changedInstance(leadingIcon) ? 536870912 : 268435456;
        } else {
            i3 = i10;
        }
        int i11 = i & 1024;
        if (i11 != 0) {
            $dirty12 |= 6;
            i4 = i11;
        } else if (($changed1 & 6) == 0) {
            i4 = i11;
            $dirty12 |= $composer3.changedInstance(trailingIcon) ? 4 : 2;
        } else {
            i4 = i11;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= ((i & 2048) == 0 && $composer3.changed(colors)) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            $dirty12 |= ((i & 4096) == 0 && $composer3.changed(contentPadding)) ? 256 : 128;
        }
        int i12 = i & 8192;
        if (i12 != 0) {
            $dirty12 |= 3072;
        } else if (($changed1 & 3072) == 0) {
            $dirty12 |= $composer3.changedInstance(border) ? 2048 : 1024;
        }
        if ((i & 16384) != 0) {
            $dirty12 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty12 |= $composer3.changed(this) ? 16384 : 8192;
        }
        int $dirty13 = $dirty12;
        if ($composer3.shouldExecute(((306783379 & $dirty3) == 306783378 && ($dirty13 & 9363) == 9362) ? false : true, $dirty3 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "743@34743L25,745@34879L58");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                boolean isError5 = i7 != 0 ? false : isError2;
                Function2 label3 = i8 != 0 ? null : function2;
                Function2 placeholder4 = i2 != 0 ? null : placeholder;
                Function2 leadingIcon4 = i3 != 0 ? null : leadingIcon;
                Function2 trailingIcon5 = i4 != 0 ? null : trailingIcon;
                if ((i & 2048) != 0) {
                    i6 = i12;
                    isError4 = isError5;
                    $dirty = $dirty3;
                    i5 = i;
                    TextFieldColors colors4 = m1847outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 0, 0, ($dirty13 >> 9) & 112, 2097151);
                    $composer3 = $composer3;
                    $dirty1 = $dirty13 & (-113);
                    colors3 = colors4;
                } else {
                    isError4 = isError5;
                    i5 = i;
                    $dirty = $dirty3;
                    i6 = i12;
                    colors3 = colors;
                    $dirty1 = $dirty13;
                }
                if ((i5 & 4096) != 0) {
                    textFieldDefaults = this;
                    isError2 = isError4;
                    contentPadding3 = m1838outlinedTextFieldPaddinga9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    $dirty1 &= -897;
                } else {
                    textFieldDefaults = this;
                    isError2 = isError4;
                    contentPadding3 = contentPadding;
                }
                if (i6 != 0) {
                    z = enabled;
                    interactionSource2 = interactionSource;
                    contentPadding2 = contentPadding3;
                    border2 = ComposableLambdaKt.rememberComposableLambda(1261916269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer $composer4, int $changed2) {
                            ComposerKt.sourceInformation($composer4, "C745@34881L54:TextFieldDefaults.kt#jmzs0o");
                            if (!$composer4.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                                $composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1261916269, $changed2, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:745)");
                            }
                            TextFieldDefaults.INSTANCE.m1841BorderBoxnbWgWpA(z, isError2, interactionSource2, colors3, null, 0.0f, 0.0f, $composer4, User32.WS_CAPTION, 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, $composer3, 54);
                    colors2 = colors3;
                    $dirty13 = $dirty1;
                    label2 = label3;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon4 = trailingIcon5;
                } else {
                    z = enabled;
                    interactionSource2 = interactionSource;
                    border2 = border;
                    contentPadding2 = contentPadding3;
                    colors2 = colors3;
                    $dirty13 = $dirty1;
                    label2 = label3;
                    placeholder3 = placeholder4;
                    leadingIcon3 = leadingIcon4;
                    trailingIcon4 = trailingIcon5;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 2048) != 0) {
                    $dirty13 &= -113;
                }
                if ((i & 4096) != 0) {
                    z = enabled;
                    interactionSource2 = interactionSource;
                    placeholder3 = placeholder;
                    leadingIcon3 = leadingIcon;
                    trailingIcon4 = trailingIcon;
                    colors2 = colors;
                    contentPadding2 = contentPadding;
                    $dirty13 &= -897;
                    $dirty = $dirty3;
                    label2 = function2;
                    textFieldDefaults = this;
                    border2 = border;
                } else {
                    textFieldDefaults = this;
                    z = enabled;
                    interactionSource2 = interactionSource;
                    placeholder3 = placeholder;
                    leadingIcon3 = leadingIcon;
                    trailingIcon4 = trailingIcon;
                    colors2 = colors;
                    contentPadding2 = contentPadding;
                    $dirty = $dirty3;
                    label2 = function2;
                    border2 = border;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                $dirty2 = $dirty;
                ComposerKt.traceEventStart(-1280721485, $dirty2, $dirty13, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:747)");
            } else {
                $dirty2 = $dirty;
            }
            Composer $composer4 = $composer3;
            boolean isError6 = isError2;
            OutlinedTextFieldDecorationBox(value, innerTextField, z, singleLine, visualTransformation, interactionSource2, isError6, label2, placeholder3, leadingIcon3, trailingIcon4, textFieldDefaults.getOutlinedTextFieldShape($composer3, ($dirty13 >> 12) & 14), colors2, contentPadding2, border2, $composer4, ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (458752 & $dirty2) | (3670016 & $dirty2) | (29360128 & $dirty2) | (234881024 & $dirty2) | (1879048192 & $dirty2), ($dirty13 & 14) | (($dirty13 << 3) & User32.WM_PENWINFIRST) | (($dirty13 << 3) & GL11.GL_RENDER) | (($dirty13 << 3) & 57344) | (($dirty13 << 3) & 458752), 0);
            $composer2 = $composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            trailingIcon3 = trailingIcon4;
            trailingIcon2 = leadingIcon3;
            leadingIcon2 = placeholder3;
            placeholder2 = label2;
            isError3 = isError6;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            leadingIcon2 = placeholder;
            trailingIcon2 = leadingIcon;
            colors2 = colors;
            contentPadding2 = contentPadding;
            isError3 = isError2;
            placeholder2 = function2;
            trailingIcon3 = trailingIcon;
            border2 = border;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.4
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

                public final void invoke(Composer composer, int i13) {
                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(value, innerTextField, enabled, singleLine, visualTransformation, interactionSource, isError3, placeholder2, leadingIcon2, trailingIcon2, trailingIcon3, colors2, contentPadding2, border2, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), RecomposeScopeImplKt.updateChangedFlags($changed1), i);
                }
            });
        }
    }
}
