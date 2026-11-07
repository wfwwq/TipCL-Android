package com.pymcl.android.ui.components;

import androidx.autofill.HintConstants;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.github.caciocavallosilano.cacio.peer.CacioChoicePeer;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.theme.Py;
import com.pymcl.android.ui.theme.PyColors;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.awt.event.ItemListener;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.MutableComboBoxModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* compiled from: Ui.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010\u0010\u001a'\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d\u001aO\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0004\b!\u0010\"\u001aW\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0004\b#\u0010$\u001ae\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020'2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u0011¢\u0006\u0002\b+H\u0007b\u0002\b\u0011b\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\u0004\b,\u0010-\u001aS\u00101\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020'2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u0011¢\u0006\u0002\b+H\u0007b\u0002\b\u0011b\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\u0004\b2\u00103\u001a;\u00104\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u00105\u001a;\u00106\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u00105\u001a;\u00107\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u00105\u001aQ\u00108\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\u00162\b\b\u0002\u0010:\u001a\u00020;H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0004\b<\u0010=\u001aE\u0010>\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020;H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010?\u001a;\u0010@\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u00105\u001a;\u0010A\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010:\u001a\u00020;H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010B\u001a;\u0010C\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020E2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010F\u001ag\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\u001e\b\u0002\u0010J\u001a\u0018\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u0011¢\u0006\u0002\b+H\u0007b\u0002\b\u0011b\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\u0002\u0010L\u001a\\\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010P\u001a\u00020'2\b\b\u0002\u0010\r\u001a\u00020\t2\u0011\u0010Q\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0007b\u0002\b\u0011b\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\u0004\bR\u0010S\u001aE\u0010T\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010U\u001aÉ\u0001\u0010V\u001a\u00020\u00012\u0006\u0010W\u001a\u00020\u00032\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)2\b\b\u0002\u0010Y\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020\t2\b\b\u0002\u0010[\u001a\u00020\t2\b\b\u0002\u0010\\\u001a\u00020;2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010]\u001a\u00020^2\b\b\u0002\u0010_\u001a\u00020`2\u0010\b\u0002\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010c\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0004\bd\u0010e\u001a \u0010f\u001a\u00020\f*\u00020\f2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010)H\u0002\u001aE\u0010h\u001a\u00020\u00012\u0006\u0010i\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010)H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010j\u001aY\u0010k\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\t2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010)H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010l\u001aM\u0010m\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010)H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010n\u001ag\u0010o\u001a\u00020\u00012\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030q2\u0006\u0010\n\u001a\u00020;2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00010)2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010s\u001ag\u0010t\u001a\u00020\u00012\u0006\u0010W\u001a\u00020\u001d2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010)2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001d0v2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010w\u001a\u00020;2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0002\u0010x\u001a?\u0010y\u001a\u00020\u00012\b\u0010z\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u00109\u001a\u00020\u0016H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0004\b{\u0010|\u001aC\u0010}\u001a\u00020\u00012\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00030q2\b\b\u0002\u0010\u000b\u001a\u00020\f2\t\b\u0002\u0010\u007f\u001a\u00030\u0080\u0001H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0003\u0010\u0081\u0001\u001ae\u0010\u0082\u0001\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u0011¢\u0006\u0002\b+H\u0007b\u0002\b\u0011b\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\u0003\u0010\u0083\u0001\u001aB\u0010\u0084\u0001\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\t\b\u0002\u0010\u0085\u0001\u001a\u00020'2\t\b\u0002\u0010\u0086\u0001\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001aI\u0010\u0089\u0001\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u0011¢\u0006\u0002\b+H\u0007b\u0002\b\u0011b\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\u0003\u0010\u008a\u0001\u001a7\u0010\u008b\u0001\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u00162\t\b\u0002\u0010\u0085\u0001\u001a\u00020'H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a>\u0010\u008e\u0001\u001a\u00020\u00012\u0007\u0010\u008f\u0001\u001a\u00020\t2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0007b\u0002\b\u0011b\r\b.\u0012\t\b/\u0012\u0005\b\b(\u0091\u0001¢\u0006\u0003\u0010\u0090\u0001\u001aU\u0010\u0092\u0001\u001a\u00020\u00012\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030q2\u0006\u0010\n\u001a\u00020;2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00010)2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0003\u0010\u0093\u0001\u001a!\u0010\u0094\u0001\u001a\u00020\u0001H\u0007b\u0002\b\u0011b\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\u0003\u0010\u0095\u0001\u001a4\u0010\u0096\u0001\u001a\u00020\u00012\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0007b\u0002\b\u0011b\f\b.\u0012\b\b/\u0012\u0004\b\b(0¢\u0006\u0003\u0010\u0097\u0001\"\u0018\u0010\u0098\u0001\u001a\u00030\u0099\u0001X\u0082\u0004¢\u0006\n\n\u0000\u0012\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0018\u0010\u009c\u0001\u001a\u00030\u009d\u0001X\u0082\u0004¢\u0006\n\n\u0000\u0012\u0006\b\u009e\u0001\u0010\u009b\u0001¨\u0006\u009f\u0001²\u0006\n\u0010\u0018\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u000b\u0010 \u0001\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\u000b\u0010¡\u0001\u001a\u00020\tX\u008a\u008e\u0002²\u0006\u000b\u0010¢\u0001\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\u000b\u0010£\u0001\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\u000b\u0010¤\u0001\u001a\u00020\tX\u008a\u008e\u0002²\u0006\u000b\u0010¥\u0001\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\u000b\u0010¥\u0001\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"Btn", "", TerracottaVpnService.EXTRA_TEXT, "", "kind", "Lcom/pymcl/android/ui/components/BtnKind;", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "enabled", "", "selected", "modifier", "Landroidx/compose/ui/Modifier;", "raw", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/pymcl/android/ui/components/BtnKind;Landroidx/compose/ui/graphics/vector/ImageVector;ZZLandroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "lerpPress", "Landroidx/compose/ui/graphics/Color;", "bg", "pressed", "lerpPress-jxsXWHM", "(JJLcom/pymcl/android/ui/components/BtnKind;)J", "alpha", "a", "", "IconBtn", "desc", "tint", "IconBtn-drOMvmE", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "IconBtn-et4H-rQ", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Card", "padding", "Landroidx/compose/ui/unit/Dp;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Card-DzVHIIc", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]", "Pane", "Pane-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "H1", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "H2", "H3", "Txt", "color", "maxLines", "", "Txt-uDo3WH8", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZJILandroidx/compose/runtime/Composer;II)V", "Muted", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZILandroidx/compose/runtime/Composer;II)V", "Small", "Mono", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "Tag", "tone", "Lcom/pymcl/android/ui/components/TagTone;", "(Ljava/lang/String;Lcom/pymcl/android/ui/components/TagTone;ZLandroidx/compose/runtime/Composer;II)V", "Section", "title", "sub", "right", "Landroidx/compose/foundation/layout/RowScope;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Field", "label", "hint", "labelWidth", "control", "Field-TN_CM5M", "(Ljava/lang/String;Ljava/lang/String;FZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Empty", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Input", "value", "onChange", "placeholder", HintConstants.AUTOFILL_HINT_PASSWORD, "singleLine", "minLines", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction", "leading", "mono", "Input-xAketlw", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZIIIILkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/vector/ImageVector;ZZZLandroidx/compose/runtime/Composer;III)V", "onFocus", "cb", "PySwitch", "checked", "(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SwitchRow", "(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Check", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Combo", "options", "", "onSelect", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "Sld", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "(FLkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/ui/Modifier;IZLandroidx/compose/runtime/Composer;II)V", "Prog", NotificationCompat.CATEGORY_PROGRESS, "Prog-FNF3uiM", "(Ljava/lang/Float;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "LogBox", "lines", "scroll", "Landroidx/compose/foundation/ScrollState;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "RowCard", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "LetterTile", "size", "brush", "LetterTile-uFdPcIQ", "(Ljava/lang/String;FZLandroidx/compose/runtime/Composer;II)V", "ScrollBody", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Dot", "Dot-iPRSM58", "(JFLandroidx/compose/runtime/Composer;II)V", "PopIn", "visible", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "[0[0]]", "Segmented", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "Divider", "(Landroidx/compose/runtime/Composer;I)V", "HoverLift", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "_unusedBorder", "Landroidx/compose/foundation/BorderStroke;", "get_unusedBorder$annotations", "()V", "_unusedStyle", "Landroidx/compose/ui/text/TextStyle;", "get_unusedStyle$annotations", "PyMCL-Android:app_debug", "bgA", "focused", OutlinedTextFieldKt.BorderId, "x", AbstractCircuitBreaker.PROPERTY_NAME, "p"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class UiKt {
    private static final BorderStroke _unusedBorder;
    private static final TextStyle _unusedStyle;

    /* compiled from: Ui.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BtnKind.values().length];
            try {
                iArr[BtnKind.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[BtnKind.Soft.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[BtnKind.Normal.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[BtnKind.Ghost.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[BtnKind.Icon.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[BtnKind.Danger.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[BtnKind.Chip.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BtnKind.OnBanner.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TagTone.values().length];
            try {
                iArr2[TagTone.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[TagTone.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[TagTone.Warn.ordinal()] = 3;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[TagTone.Danger.ordinal()] = 4;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[TagTone.Info.ordinal()] = 5;
            } catch (NoSuchFieldError e13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Btn$lambda$5(String str, BtnKind btnKind, ImageVector imageVector, boolean z, boolean z2, Modifier modifier, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        Btn(str, btnKind, imageVector, z, z2, modifier, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Card_DzVHIIc$lambda$0(Modifier modifier, float f, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        m7594CardDzVHIIc(modifier, f, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Check$lambda$2(String str, boolean z, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        Check(str, z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Combo$lambda$4(List list, int i, Function1 function1, Modifier modifier, boolean z, boolean z2, int i2, int i3, Composer composer, int i4) {
        Combo(list, i, function1, modifier, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Divider$lambda$0(int i, Composer composer, int i2) {
        Divider(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dot_iPRSM58$lambda$0(long j, float f, int i, int i2, Composer composer, int i3) {
        m7595DotiPRSM58(j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Empty$lambda$1(ImageVector imageVector, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Empty(imageVector, str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Field_TN_CM5M$lambda$1(String str, String str2, float f, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        m7596FieldTN_CM5M(str, str2, f, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1$lambda$0(String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        H1(str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2$lambda$0(String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        H2(str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H3$lambda$0(String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        H3(str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoverLift$lambda$4(Function2 function2, int i, Composer composer, int i2) {
        HoverLift(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconBtn_drOMvmE$lambda$1(ImageVector imageVector, String str, Color color, Function0 function0, int i, int i2, Composer composer, int i3) {
        m7597IconBtndrOMvmE(imageVector, str, color, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconBtn_et4H_rQ$lambda$2(ImageVector imageVector, String str, Color color, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        m7598IconBtnet4HrQ(imageVector, str, color, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input_xAketlw$lambda$7(String str, Function1 function1, String str2, Modifier modifier, boolean z, boolean z2, int i, int i2, int i3, int i4, Function0 function0, ImageVector imageVector, boolean z3, boolean z4, boolean z5, int i5, int i6, int i7, Composer composer, int i8) {
        m7599InputxAketlw(str, function1, str2, modifier, z, z2, i, i2, i3, i4, function0, imageVector, z3, z4, z5, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LetterTile_uFdPcIQ$lambda$1(String str, float f, boolean z, int i, int i2, Composer composer, int i3) {
        m7600LetterTileuFdPcIQ(str, f, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LogBox$lambda$2(List list, Modifier modifier, ScrollState scrollState, int i, int i2, Composer composer, int i3) {
        LogBox(list, modifier, scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mono$lambda$0(String str, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        Mono(str, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Muted$lambda$0(String str, Modifier modifier, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        Muted(str, modifier, z, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Pane_uFdPcIQ$lambda$0(Modifier modifier, float f, Function3 function3, int i, int i2, Composer composer, int i3) {
        m7601PaneuFdPcIQ(modifier, f, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PopIn$lambda$1(boolean z, Function2 function2, int i, Composer composer, int i2) {
        PopIn(z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Prog_FNF3uiM$lambda$3(Float f, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m7602ProgFNF3uiM(f, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PySwitch$lambda$3(boolean z, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        PySwitch(z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowCard$lambda$0(Modifier modifier, boolean z, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        RowCard(modifier, z, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollBody$lambda$0(Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        ScrollBody(modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$1(String str, String str2, Modifier modifier, boolean z, Function3 function3, int i, int i2, Composer composer, int i3) {
        Section(str, str2, modifier, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Segmented$lambda$1(List list, int i, Function1 function1, boolean z, int i2, int i3, Composer composer, int i4) {
        Segmented(list, i, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Sld$lambda$0(float f, Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, Modifier modifier, int i, boolean z, int i2, int i3, Composer composer, int i4) {
        Sld(f, function1, closedFloatingPointRange, modifier, i, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Small$lambda$0(String str, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        Small(str, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchRow$lambda$1(String str, boolean z, String str2, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        SwitchRow(str, z, str2, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tag$lambda$0(String str, TagTone tagTone, boolean z, int i, int i2, Composer composer, int i3) {
        Tag(str, tagTone, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Txt_uDo3WH8$lambda$0(String str, Modifier modifier, boolean z, long j, int i, int i2, int i3, Composer composer, int i4) {
        m7603TxtuDo3WH8(str, modifier, z, j, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void get_unusedBorder$annotations() {
    }

    private static /* synthetic */ void get_unusedStyle$annotations() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v22 ??, still in use, count: 1, list:
          (r3v22 ?? I:??[OBJECT, ARRAY]) from 0x0354: CHECK_CAST (r3v23 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r3v22 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void Btn(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v22 ??, still in use, count: 1, list:
          (r3v22 ?? I:??[OBJECT, ARRAY]) from 0x0354: CHECK_CAST (r3v23 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r3v22 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r74v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    private static final boolean Btn$lambda$2(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final long Btn$lambda$3(State<Color> state) {
        return ((Color) state.getValue()).m4400unboximpl();
    }

    /* renamed from: lerpPress-jxsXWHM, reason: not valid java name */
    private static final long m7604lerpPressjxsXWHM(long bg, long pressed, BtnKind kind) {
        if (kind == BtnKind.Primary) {
            return Color.m4388copywmQWz5c(bg, (14 & 1) != 0 ? Color.m4392getAlphaimpl(bg) : 0.86f, (14 & 2) != 0 ? Color.m4396getRedimpl(bg) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(bg) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(bg) : 0.0f);
        }
        return Color.m4391equalsimpl0(bg, Color.INSTANCE.m4425getTransparent0d7_KjU()) ? pressed : ColorKt.m4441lerpjxsXWHM(bg, pressed, 0.5f);
    }

    public static final Modifier alpha(Modifier $this$alpha, float a) {
        Intrinsics.checkNotNullParameter($this$alpha, "<this>");
        return $this$alpha.then(GraphicsLayerModifierKt.m4551graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null));
    }

    /* renamed from: IconBtn-drOMvmE, reason: not valid java name */
    public static final void m7597IconBtndrOMvmE(final ImageVector icon, String desc, Color tint, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        String str;
        Color color;
        Function0 function02;
        Composer $composer2;
        final String desc2;
        final Color tint2;
        final Function0 onClick;
        String desc3;
        Color tint3;
        String desc4;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer $composer3 = $composer.startRestartGroup(462434998);
        ComposerKt.sourceInformation($composer3, "C(IconBtn)P(1!1,3:c#ui.graphics.Color)114@5459L2,114@5465L40:Ui.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(icon) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            str = desc;
        } else if (($changed & 48) == 0) {
            str = desc;
            $dirty |= $composer3.changed(str) ? 32 : 16;
        } else {
            str = desc;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            color = tint;
        } else if (($changed & 384) == 0) {
            color = tint;
            $dirty |= $composer3.changed(color) ? 256 : 128;
        } else {
            color = tint;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            function02 = function0;
        } else if (($changed & 3072) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            String desc5 = i2 != 0 ? "" : str;
            if (i3 != 0) {
                desc3 = desc5;
                tint3 = null;
            } else {
                desc3 = desc5;
                tint3 = color;
            }
            if (i4 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 2018404568, "CC(remember):Ui.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 onClick2 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                String str2 = desc3;
                onClick = onClick2;
                desc4 = str2;
            } else {
                desc4 = desc3;
                onClick = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(462434998, $dirty2, -1, "com.pymcl.android.ui.components.IconBtn (Ui.kt:114)");
            }
            String desc6 = desc4;
            m7598IconBtnet4HrQ(icon, desc6, tint3, true, onClick, $composer3, (($dirty2 << 3) & 57344) | ($dirty2 & 14) | 3072 | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST), 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            tint2 = tint3;
            desc2 = desc6;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            desc2 = str;
            tint2 = color;
            onClick = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UiKt.IconBtn_drOMvmE$lambda$1(icon, desc2, tint2, onClick, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a9  */
    /* renamed from: IconBtn-et4H-rQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7598IconBtnet4HrQ(final androidx.compose.ui.graphics.vector.ImageVector r39, java.lang.String r40, androidx.compose.ui.graphics.Color r41, final boolean r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.m7598IconBtnet4HrQ(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.graphics.Color, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: Card-DzVHIIc, reason: not valid java name */
    public static final void m7594CardDzVHIIc(Modifier modifier, float padding, Function0<Unit> function0, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        float f;
        Function0 onClick;
        final Modifier modifier3;
        final float padding2;
        final Function0 onClick2;
        Function0 onClick3;
        Modifier.Companion companionM281clickableXHw0xAI$default;
        Function0 function02;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(2106734628);
        ComposerKt.sourceInformation($composer2, "C(Card)P(1,3:c#ui.unit.Dp,2)128@6205L6,129@6231L6,130@6247L419:Ui.kt#uiq9q5");
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
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            f = padding;
        } else if (($changed & 48) == 0) {
            f = padding;
            $dirty |= $composer2.changed(f) ? 32 : 16;
        } else {
            f = padding;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            onClick = function0;
        } else if (($changed & 384) == 0) {
            onClick = function0;
            $dirty |= $composer2.changedInstance(onClick) ? 256 : 128;
        } else {
            onClick = function0;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            Modifier modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            float padding3 = i3 != 0 ? Dp.m7018constructorimpl(16) : f;
            if (i4 != 0) {
                onClick = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106734628, $dirty2, -1, "com.pymcl.android.ui.components.Card (Ui.kt:127)");
            }
            PyColors c = Py.INSTANCE.getColors($composer2, 6);
            Shape shape = Py.INSTANCE.getShapes($composer2, 6).getCard();
            float fM7018constructorimpl = c.getDark() ? Dp.m7018constructorimpl(0) : Dp.m7018constructorimpl(2);
            long jM7985getShadow0d7_KjU = c.m7985getShadow0d7_KjU();
            long jM4388copywmQWz5c = Color.m4388copywmQWz5c(jM7985getShadow0d7_KjU, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM7985getShadow0d7_KjU) : 0.1f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM7985getShadow0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM7985getShadow0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM7985getShadow0d7_KjU) : 0.0f);
            long jM7985getShadow0d7_KjU2 = c.m7985getShadow0d7_KjU();
            Modifier modifier5 = modifier4;
            Modifier modifierM258borderxT4_qwU = BorderKt.m258borderxT4_qwU(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(ShadowKt.m4025shadows4CzXII$default(modifier4, fM7018constructorimpl, shape, false, jM4388copywmQWz5c, Color.m4388copywmQWz5c(jM7985getShadow0d7_KjU2, (14 & 1) != 0 ? Color.m4392getAlphaimpl(jM7985getShadow0d7_KjU2) : 0.1f, (14 & 2) != 0 ? Color.m4396getRedimpl(jM7985getShadow0d7_KjU2) : 0.0f, (14 & 4) != 0 ? Color.m4395getGreenimpl(jM7985getShadow0d7_KjU2) : 0.0f, (14 & 8) != 0 ? Color.m4393getBlueimpl(jM7985getShadow0d7_KjU2) : 0.0f), 4, null), shape), c.m7980getPaper0d7_KjU(), null, 2, null), Dp.m7018constructorimpl(1), c.m7971getLine0d7_KjU(), shape);
            if (onClick != null) {
                onClick3 = onClick;
                companionM281clickableXHw0xAI$default = ClickableKt.m281clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, onClick3, 7, null);
            } else {
                onClick3 = onClick;
                companionM281clickableXHw0xAI$default = Modifier.INSTANCE;
            }
            Modifier modifierM738padding3ABfNKs = PaddingKt.m738padding3ABfNKs(modifierM258borderxT4_qwU.then(companionM281clickableXHw0xAI$default), padding3);
            int i5 = $dirty2 & GL11.GL_RENDER;
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((i5 >> 3) & 14) | ((i5 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            float padding4 = padding3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM738padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((i5 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor;
                $composer2.createNode(function02);
            } else {
                function02 = constructor;
                $composer2.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer2);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            content.invoke(ColumnScopeInstance.INSTANCE, $composer2, Integer.valueOf(((i5 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            padding2 = padding4;
            onClick2 = onClick3;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            padding2 = f;
            onClick2 = onClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Card_DzVHIIc$lambda$0(modifier3, padding2, onClick2, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
    /* renamed from: Pane-uFdPcIQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7601PaneuFdPcIQ(androidx.compose.ui.Modifier r27, float r28, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.m7601PaneuFdPcIQ(androidx.compose.ui.Modifier, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void H1(final String text, Modifier modifier, boolean raw, Composer $composer, final int $changed, final int $dirty) {
        Modifier modifier2;
        boolean z;
        Composer $composer2;
        int $dirty2;
        final boolean raw2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-1220640258);
        ComposerKt.sourceInformation($composer3, "C(H1)P(2)149@7092L4,149@7112L6,149@7037L86:Ui.kt#uiq9q5");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(text) ? 4 : 2;
        }
        int i = $dirty & 2;
        if (i != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i2 = $dirty & 4;
        if (i2 != 0) {
            $dirty3 |= 384;
            z = raw;
        } else if (($changed & 384) == 0) {
            z = raw;
            $dirty3 |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = raw;
        }
        if ($composer3.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            if (i != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            boolean raw3 = i2 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1220640258, $dirty3, -1, "com.pymcl.android.ui.components.H1 (Ui.kt:149)");
            }
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(raw3 ? text : I18nKt.tr(text, new Object[0]), modifier2, Py.INSTANCE.getColors($composer3, 6).m7967getInk0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer3, 6).getH1(), $composer2, $dirty3 & 112, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty2 = $dirty3;
            raw2 = raw3;
            modifier3 = modifier2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            $dirty2 = $dirty3;
            raw2 = z;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.H1$lambda$0(text, modifier3, raw2, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void H2(final String text, Modifier modifier, boolean raw, Composer $composer, final int $changed, final int $dirty) {
        Modifier modifier2;
        boolean z;
        Composer $composer2;
        int $dirty2;
        final boolean raw2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-1207107457);
        ComposerKt.sourceInformation($composer3, "C(H2)P(2)151@7267L4,151@7287L6,151@7212L134:Ui.kt#uiq9q5");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(text) ? 4 : 2;
        }
        int i = $dirty & 2;
        if (i != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i2 = $dirty & 4;
        if (i2 != 0) {
            $dirty3 |= 384;
            z = raw;
        } else if (($changed & 384) == 0) {
            z = raw;
            $dirty3 |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = raw;
        }
        if ($composer3.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            if (i != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            boolean raw3 = i2 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1207107457, $dirty3, -1, "com.pymcl.android.ui.components.H2 (Ui.kt:151)");
            }
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(raw3 ? text : I18nKt.tr(text, new Object[0]), modifier2, Py.INSTANCE.getColors($composer3, 6).m7967getInk0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer3, 6).getH2(), $composer2, $dirty3 & 112, GL11.GL_INDEX_MODE, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty2 = $dirty3;
            raw2 = raw3;
            modifier3 = modifier2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            $dirty2 = $dirty3;
            raw2 = z;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.H2$lambda$0(text, modifier3, raw2, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void H3(final String text, Modifier modifier, boolean raw, Composer $composer, final int $changed, final int $dirty) {
        Modifier modifier2;
        boolean z;
        Composer $composer2;
        int $dirty2;
        final boolean raw2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-1193574656);
        ComposerKt.sourceInformation($composer3, "C(H3)P(2)153@7490L4,153@7510L6,153@7435L134:Ui.kt#uiq9q5");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(text) ? 4 : 2;
        }
        int i = $dirty & 2;
        if (i != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i2 = $dirty & 4;
        if (i2 != 0) {
            $dirty3 |= 384;
            z = raw;
        } else if (($changed & 384) == 0) {
            z = raw;
            $dirty3 |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = raw;
        }
        if ($composer3.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            if (i != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            boolean raw3 = i2 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1193574656, $dirty3, -1, "com.pymcl.android.ui.components.H3 (Ui.kt:153)");
            }
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(raw3 ? text : I18nKt.tr(text, new Object[0]), modifier2, Py.INSTANCE.getColors($composer3, 6).m7967getInk0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer3, 6).getH3(), $composer2, $dirty3 & 112, GL11.GL_INDEX_MODE, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty2 = $dirty3;
            raw2 = raw3;
            modifier3 = modifier2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            $dirty2 = $dirty3;
            raw2 = z;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.H3$lambda$0(text, modifier3, raw2, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: Txt-uDo3WH8, reason: not valid java name */
    public static final void m7603TxtuDo3WH8(final String text, Modifier modifier, boolean raw, long color, int maxLines, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean raw2;
        long color2;
        int i2;
        Composer $composer2;
        final Modifier modifier3;
        final long color3;
        final int maxLines2;
        final boolean raw3;
        long color4;
        int maxLines3;
        Modifier modifier4;
        int $dirty;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(1334745795);
        ComposerKt.sourceInformation($composer3, "C(Txt)P(4,2,3,0:c#ui.graphics.Color)156@7779L4,156@7724L135:Ui.kt#uiq9q5");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(text) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty2 |= 384;
            raw2 = raw;
        } else if (($changed & 384) == 0) {
            raw2 = raw;
            $dirty2 |= $composer3.changed(raw2) ? 256 : 128;
        } else {
            raw2 = raw;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                color2 = color;
                int i5 = $composer3.changed(color2) ? 2048 : 1024;
                $dirty2 |= i5;
            } else {
                color2 = color;
            }
            $dirty2 |= i5;
        } else {
            color2 = color;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty2 |= 24576;
            i2 = maxLines;
        } else if (($changed & 24576) == 0) {
            i2 = maxLines;
            $dirty2 |= $composer3.changed(i2) ? 16384 : 8192;
        } else {
            i2 = maxLines;
        }
        if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "155@7675L6");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier5 = i3 != 0 ? Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    raw2 = false;
                }
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                    color2 = Py.INSTANCE.getColors($composer3, 6).m7967getInk0d7_KjU();
                }
                if (i6 != 0) {
                    maxLines3 = Integer.MAX_VALUE;
                    color4 = color2;
                    modifier4 = modifier5;
                    $dirty = $dirty2;
                    raw3 = raw2;
                } else {
                    color4 = color2;
                    maxLines3 = i2;
                    modifier4 = modifier5;
                    $dirty = $dirty2;
                    raw3 = raw2;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty2 &= -7169;
                }
                $dirty = $dirty2;
                raw3 = raw2;
                color4 = color2;
                maxLines3 = i2;
                modifier4 = modifier2;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1334745795, $dirty, -1, "com.pymcl.android.ui.components.Txt (Ui.kt:156)");
            }
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(raw3 ? text : I18nKt.tr(text, new Object[0]), modifier4, color4, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8(), false, maxLines3, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer3, 6).getBody(), $composer2, ($dirty & 112) | (($dirty >> 3) & User32.WM_PENWINFIRST), (($dirty >> 3) & GL11.GL_RENDER) | 48, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            maxLines2 = maxLines3;
            color3 = color4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            color3 = color2;
            maxLines2 = i2;
            raw3 = raw2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Txt_uDo3WH8$lambda$0(text, modifier3, raw3, color3, maxLines2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Muted(final String text, Modifier modifier, boolean raw, int maxLines, Composer $composer, final int $changed, final int $dirty) {
        Modifier modifier2;
        boolean z;
        int i;
        Composer $composer2;
        int $dirty2;
        final Modifier modifier3;
        final boolean raw2;
        final int maxLines2;
        int i2;
        Modifier modifier4;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-111522905);
        ComposerKt.sourceInformation($composer3, "C(Muted)P(3,1,2)159@8041L4,159@8064L6,159@7986L149:Ui.kt#uiq9q5");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(text) ? 4 : 2;
        }
        int i3 = $dirty & 2;
        if (i3 != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i4 = $dirty & 4;
        if (i4 != 0) {
            $dirty3 |= 384;
            z = raw;
        } else if (($changed & 384) == 0) {
            z = raw;
            $dirty3 |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = raw;
        }
        int i5 = $dirty & 8;
        if (i5 != 0) {
            $dirty3 |= 3072;
            i = maxLines;
        } else if (($changed & 3072) == 0) {
            i = maxLines;
            $dirty3 |= $composer3.changed(i) ? 2048 : 1024;
        } else {
            i = maxLines;
        }
        if ($composer3.shouldExecute(($dirty3 & 1171) != 1170, $dirty3 & 1)) {
            if (i3 != 0) {
                modifier4 = Modifier.INSTANCE;
                i2 = i4;
            } else {
                i2 = i4;
                modifier4 = modifier2;
            }
            boolean raw3 = i2 != 0 ? false : z;
            int maxLines3 = i5 != 0 ? Integer.MAX_VALUE : i;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111522905, $dirty3, -1, "com.pymcl.android.ui.components.Muted (Ui.kt:159)");
            }
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(raw3 ? text : I18nKt.tr(text, new Object[0]), modifier4, Py.INSTANCE.getColors($composer3, 6).m7969getInkMuted0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8(), false, maxLines3, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer3, 6).getMuted(), $composer2, $dirty3 & 112, ($dirty3 & GL11.GL_RENDER) | 48, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty2 = $dirty3;
            raw2 = raw3;
            modifier3 = modifier4;
            maxLines2 = maxLines3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            $dirty2 = $dirty3;
            modifier3 = modifier2;
            raw2 = z;
            maxLines2 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Muted$lambda$0(text, modifier3, raw2, maxLines2, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Small(final String text, Modifier modifier, boolean raw, Composer $composer, final int $changed, final int $dirty) {
        Modifier modifier2;
        boolean z;
        Composer $composer2;
        int $dirty2;
        final boolean raw2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-220005856);
        ComposerKt.sourceInformation($composer3, "C(Small)P(2)162@8286L4,162@8309L6,162@8231L142:Ui.kt#uiq9q5");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(text) ? 4 : 2;
        }
        int i = $dirty & 2;
        if (i != 0) {
            $dirty3 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i2 = $dirty & 4;
        if (i2 != 0) {
            $dirty3 |= 384;
            z = raw;
        } else if (($changed & 384) == 0) {
            z = raw;
            $dirty3 |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = raw;
        }
        if (!$composer3.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            $dirty2 = $dirty3;
            raw2 = z;
            modifier3 = modifier2;
        } else {
            if (i != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            boolean raw3 = i2 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-220005856, $dirty3, -1, "com.pymcl.android.ui.components.Small (Ui.kt:162)");
            }
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(raw3 ? text : I18nKt.tr(text, new Object[0]), modifier2, Py.INSTANCE.getColors($composer3, 6).m7968getInkFaint0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer3, 6).getSmall(), $composer2, $dirty3 & 112, GL11.GL_INDEX_MODE, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty2 = $dirty3;
            raw2 = raw3;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Small$lambda$0(text, modifier3, raw2, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void Mono(final String text, Modifier modifier, int maxLines, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        int i2;
        Composer $composer2;
        final Modifier modifier3;
        final int maxLines2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(1030245215);
        ComposerKt.sourceInformation($composer3, "C(Mono)P(2,1)165@8509L4,165@8531L6,165@8477L124:Ui.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            i2 = maxLines;
        } else if (($changed & 384) == 0) {
            i2 = maxLines;
            $dirty |= $composer3.changed(i2) ? 256 : 128;
        } else {
            i2 = maxLines;
        }
        if ($composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            Modifier modifier4 = i3 != 0 ? Modifier.INSTANCE : modifier2;
            int maxLines3 = i4 != 0 ? Integer.MAX_VALUE : i2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1030245215, $dirty, -1, "com.pymcl.android.ui.components.Mono (Ui.kt:165)");
            }
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(text, modifier4, Py.INSTANCE.getColors($composer3, 6).m7970getInkSoft0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8(), false, maxLines3, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer3, 6).getMono(), $composer2, ($dirty & 14) | ($dirty & 112), (($dirty << 3) & GL11.GL_RENDER) | 48, 55288);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            maxLines2 = maxLines3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            maxLines2 = i2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Mono$lambda$0(text, modifier3, maxLines2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier, void] */
    public static final void Tag(final String text, TagTone tone, boolean raw, Composer $composer, final int $changed, final int $dirty) {
        boolean z;
        Composer $composer2;
        final TagTone tone2;
        int $dirty2;
        final boolean raw2;
        Pair pair;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(1960167722);
        ComposerKt.sourceInformation($composer3, "C(Tag)P(1,2)171@8768L6,180@9122L6,179@9062L190:Ui.kt#uiq9q5");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changed(text) ? 4 : 2;
        }
        int i = $dirty & 2;
        if (i != 0) {
            $dirty3 |= 48;
        } else if (($changed & 48) == 0) {
            $dirty3 |= $composer3.changed(tone == null ? -1 : tone.ordinal()) ? 32 : 16;
        }
        int i2 = $dirty & 4;
        if (i2 != 0) {
            $dirty3 |= 384;
            z = raw;
        } else if (($changed & 384) == 0) {
            z = raw;
            $dirty3 |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = raw;
        }
        if (!$composer3.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            tone2 = tone;
            $dirty2 = $dirty3;
            raw2 = z;
        } else {
            TagTone tone3 = i != 0 ? TagTone.Accent : tone;
            boolean raw3 = i2 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1960167722, $dirty3, -1, "com.pymcl.android.ui.components.Tag (Ui.kt:170)");
            }
            PyColors c = Py.INSTANCE.getColors($composer3, 6);
            switch (WhenMappings.$EnumSwitchMapping$1[tone3.ordinal()]) {
                case 1:
                    pair = TuplesKt.to(Color.m4380boximpl(c.m7952getAccentSoft0d7_KjU()), Color.m4380boximpl(c.m7955getAccentText0d7_KjU()));
                    break;
                case 2:
                    pair = TuplesKt.to(Color.m4380boximpl(c.m7964getHover0d7_KjU()), Color.m4380boximpl(c.m7970getInkSoft0d7_KjU()));
                    break;
                case 3:
                    pair = TuplesKt.to(Color.m4380boximpl(c.m7988getWarnSoft0d7_KjU()), Color.m4380boximpl(c.m7987getWarn0d7_KjU()));
                    break;
                case 4:
                    pair = TuplesKt.to(Color.m4380boximpl(c.m7960getDangerSoft0d7_KjU()), Color.m4380boximpl(c.m7959getDanger0d7_KjU()));
                    break;
                case 5:
                    pair = TuplesKt.to(Color.m4380boximpl(c.m7966getInfoSoft0d7_KjU()), Color.m4380boximpl(c.m7965getInfo0d7_KjU()));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            long bg = ((Color) pair.component1()).m4400unboximpl();
            long fg = ((Color) pair.component2()).m4400unboximpl();
            String strTr = raw3 ? text : I18nKt.tr(text, new Object[0]);
            ?? M247backgroundbw27NRU$default = BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, Py.INSTANCE.getShapes($composer3, 6).getPill()), bg, null, 2, null);
            Dp.m7018constructorimpl(8);
            Dp.m7018constructorimpl(2);
            $composer2 = $composer3;
            TextKt.m2843Text4IGK_g(strTr, (Modifier) MutableComboBoxModel.removeElementAt((int) M247backgroundbw27NRU$default), fg, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 3072, 3072, 122864);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty2 = $dirty3;
            tone2 = tone3;
            raw2 = raw3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Tag$lambda$0(text, tone2, raw2, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b1  */
    /* JADX WARN: Type inference failed for: r35v1, types: [androidx.compose.ui.Modifier, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Section(final java.lang.String r64, java.lang.String r65, androidx.compose.ui.Modifier r66, boolean r67, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r68, androidx.compose.runtime.Composer r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.Section(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: Field-TN_CM5M, reason: not valid java name */
    public static final void m7596FieldTN_CM5M(final String label, String hint, float labelWidth, boolean raw, final Function2<? super Composer, ? super Integer, Unit> control, Composer $composer, final int $changed, final int i) {
        final String hint2;
        float f;
        boolean z;
        final String hint3;
        final float labelWidth2;
        final boolean raw2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(control, "control");
        Composer $composer2 = $composer.startRestartGroup(-2043645180);
        ComposerKt.sourceInformation($composer2, "C(Field)P(2,1,3:c#ui.unit.Dp,4)201@10260L606,201@10191L675:Ui.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(label) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            hint2 = hint;
        } else if (($changed & 48) == 0) {
            hint2 = hint;
            $dirty |= $composer2.changed(hint2) ? 32 : 16;
        } else {
            hint2 = hint;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            f = labelWidth;
        } else if (($changed & 384) == 0) {
            f = labelWidth;
            $dirty |= $composer2.changed(f) ? 256 : 128;
        } else {
            f = labelWidth;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            z = raw;
        } else if (($changed & 3072) == 0) {
            z = raw;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = raw;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(control) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (i2 != 0) {
                hint2 = null;
            }
            final float labelWidth3 = i3 != 0 ? Dp.m7018constructorimpl(170) : f;
            final boolean raw3 = i4 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2043645180, $dirty2, -1, "com.pymcl.android.ui.components.Field (Ui.kt:200)");
            }
            Modifier modifierM740paddingVpY3zN4$default = PaddingKt.m740paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7018constructorimpl(6), 1, null);
            ComposableLambdaKt.rememberComposableLambda(1172306542, true, new Function3() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UiKt.Field_TN_CM5M$lambda$0(label, raw3, control, hint2, labelWidth3, (BoxWithConstraintsScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54);
            MutableComboBoxModel.insertElementAt(modifierM740paddingVpY3zN4$default, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            String str = hint2;
            raw2 = raw3;
            hint3 = str;
            labelWidth2 = labelWidth3;
        } else {
            $composer2.skipToGroupEnd();
            hint3 = hint2;
            labelWidth2 = f;
            raw2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Field_TN_CM5M$lambda$1(label, hint3, labelWidth2, raw2, control, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04d3  */
    /* JADX WARN: Type inference failed for: r1v60, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r1v61, types: [androidx.compose.ui.Modifier, void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit Field_TN_CM5M$lambda$0(java.lang.String r58, boolean r59, kotlin.jvm.functions.Function2 r60, java.lang.String r61, float r62, androidx.compose.foundation.layout.BoxWithConstraintsScope r63, androidx.compose.runtime.Composer r64, int r65) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.Field_TN_CM5M$lambda$0(java.lang.String, boolean, kotlin.jvm.functions.Function2, java.lang.String, float, androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03ed  */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.ui.Modifier, void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Empty(final androidx.compose.ui.graphics.vector.ImageVector r62, final java.lang.String r63, java.lang.String r64, androidx.compose.ui.Modifier r65, androidx.compose.runtime.Composer r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.Empty(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v13 ??, still in use, count: 1, list:
          (r1v13 ?? I:??[OBJECT, ARRAY]) from 0x0345: CHECK_CAST (r1v14 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r1v13 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: Input-xAketlw, reason: not valid java name */
    public static final void m7599InputxAketlw(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v13 ??, still in use, count: 1, list:
          (r1v13 ?? I:??[OBJECT, ARRAY]) from 0x0345: CHECK_CAST (r1v14 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r1v13 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r62v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    private static final boolean Input_xAketlw$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void Input_xAketlw$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final long Input_xAketlw$lambda$3(State<Color> state) {
        return ((Color) state.getValue()).m4400unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input_xAketlw$lambda$4$0(MutableState $focused$delegate, boolean it) {
        Input_xAketlw$lambda$2($focused$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input_xAketlw$lambda$5$0(Function0 $onImeAction, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if ($onImeAction != null) {
            $onImeAction.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03d7  */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit Input_xAketlw$lambda$6(com.pymcl.android.ui.theme.PyColors r78, boolean r79, androidx.compose.runtime.State r80, androidx.compose.ui.graphics.vector.ImageVector r81, java.lang.String r82, java.lang.String r83, boolean r84, kotlin.jvm.functions.Function2 r85, androidx.compose.runtime.Composer r86, int r87) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.Input_xAketlw$lambda$6(com.pymcl.android.ui.theme.PyColors, boolean, androidx.compose.runtime.State, androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final Modifier onFocus(Modifier $this$onFocus, final Function1<? super Boolean, Unit> function1) {
        return $this$onFocus.then(FocusChangedModifierKt.onFocusChanged(Modifier.INSTANCE, new Function1() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiKt.onFocus$lambda$0(function1, (FocusState) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFocus$lambda$0(Function1 $cb, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $cb.invoke(Boolean.valueOf(it.isFocused()));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v5 ??, still in use, count: 1, list:
          (r8v5 ?? I:??[OBJECT, ARRAY]) from 0x00a1: CHECK_CAST (r8v6 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r8v5 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void PySwitch(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v5 ??, still in use, count: 1, list:
          (r8v5 ?? I:??[OBJECT, ARRAY]) from 0x00a1: CHECK_CAST (r8v6 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r8v5 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    private static final float PySwitch$lambda$0(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PySwitch$lambda$1$0(Function1 $onChange, boolean $checked) {
        $onChange.invoke(Boolean.valueOf(!$checked));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SwitchRow(final java.lang.String r67, final boolean r68, java.lang.String r69, boolean r70, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r71, androidx.compose.runtime.Composer r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.SwitchRow(java.lang.String, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Check(final java.lang.String r62, final boolean r63, boolean r64, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r65, androidx.compose.runtime.Composer r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.Check(java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Check$lambda$0$0(Function1 $onChange, boolean $checked) {
        $onChange.invoke(Boolean.valueOf(!$checked));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0551  */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.compose.ui.Modifier, void] */
    /* JADX WARN: Type inference failed for: r63v0, types: [androidx.compose.ui.Modifier, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Combo(final java.util.List<java.lang.String> r88, final int r89, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r90, androidx.compose.ui.Modifier r91, boolean r92, boolean r93, androidx.compose.runtime.Composer r94, final int r95, final int r96) {
        /*
            Method dump skipped, instructions count: 1403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.Combo(java.util.List, int, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean Combo$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void Combo$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Combo$lambda$3$0$0(MutableState $open$delegate) {
        Combo$lambda$2($open$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Combo$lambda$3$2$0(MutableState $open$delegate) {
        Combo$lambda$2($open$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Combo$lambda$3$3(List $options, final Function1 $onSelect, final boolean $raw, final int $selected, final PyColors $c, final MutableState $open$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*327@16892L105,327@17009L29,327@16875L164:Ui.kt#uiq9q5");
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(396837393, $changed, -1, "com.pymcl.android.ui.components.Combo.<anonymous>.<anonymous> (Ui.kt:326)");
            }
            final int i = 0;
            for (Object obj : $options) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                final int i3 = i;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2106413669, true, new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return UiKt.Combo$lambda$3$3$0$0($raw, str, i3, $selected, $c, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1756773176, "CC(remember):Ui.kt#9igjgp");
                boolean zChanged = composer.changed($onSelect) | composer.changed(i);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda39
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UiKt.Combo$lambda$3$3$0$1$0($onSelect, i, $open$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer, 6, TarConstants.XSTAR_MAGIC_OFFSET);
                composer = $composer;
                i = i2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Combo$lambda$3$3$0$0(boolean $raw, String $o, int $i, int $selected, PyColors $c, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C327@16933L4,327@16894L101:Ui.kt#uiq9q5");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2106413669, $changed, -1, "com.pymcl.android.ui.components.Combo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Ui.kt:327)");
            }
            TextKt.m2843Text4IGK_g($raw ? $o : I18nKt.tr($o, new Object[0]), (Modifier) null, $i == $selected ? $c.m7955getAccentText0d7_KjU() : $c.m7967getInk0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, Py.INSTANCE.getType($composer, 6).getBody(), $composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Combo$lambda$3$3$0$1$0(Function1 $onSelect, int $i, MutableState $open$delegate) {
        Combo$lambda$2($open$delegate, false);
        $onSelect.invoke(Integer.valueOf($i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.Modifier, void] */
    public static final void Sld(final float f, final Function1<? super Float, Unit> onChange, final ClosedFloatingPointRange<Float> range, Modifier modifier, int i, boolean z, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z2;
        Composer composer2;
        final Modifier modifier3;
        final int i5;
        final boolean z3;
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Intrinsics.checkNotNullParameter(range, "range");
        Composer composerStartRestartGroup = composer.startRestartGroup(-411536490);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Sld)P(5,2,3,1,4)335@17263L6,337@17483L169,336@17274L379:Ui.kt#uiq9q5");
        int i6 = i2;
        if ((i2 & 6) == 0) {
            i6 |= composerStartRestartGroup.changed(f) ? 4 : 2;
        }
        if ((i2 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onChange) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(range) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i6 |= 3072;
            modifier2 = modifier;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i6 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i6 |= 24576;
            i4 = i;
        } else if ((i2 & 24576) == 0) {
            i4 = i;
            i6 |= composerStartRestartGroup.changed(i4) ? 16384 : 8192;
        } else {
            i4 = i;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
        } else if ((196608 & i2) == 0) {
            z2 = z;
            i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
            ?? r6 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            int i10 = i8 != 0 ? 0 : i4;
            boolean z4 = i9 != 0 ? true : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-411536490, i6, -1, "com.pymcl.android.ui.components.Sld (Ui.kt:334)");
            }
            PyColors colors = Py.INSTANCE.getColors(composerStartRestartGroup, 6);
            float fCoerceIn = RangesKt.coerceIn(f, range.getStart().floatValue(), range.getEndInclusive().floatValue());
            Dp.m7018constructorimpl(28);
            Modifier modifierAlpha = alpha(JComboBox.setSelectedIndex((int) r6), z4 ? 1.0f : 0.45f);
            int i11 = i6;
            Modifier modifier4 = r6;
            composer2 = composerStartRestartGroup;
            SliderColors sliderColorsM2645colorsq0g_0yA = SliderDefaults.INSTANCE.m2645colorsq0g_0yA(colors.m7954getAccentStrong0d7_KjU(), colors.m7949getAccent0d7_KjU(), Color.INSTANCE.m4425getTransparent0d7_KjU(), colors.m7971getLine0d7_KjU(), Color.INSTANCE.m4425getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, composer2, 24960, 6, 992);
            int i12 = (i11 & 112) | ((i11 >> 6) & GL11.GL_RENDER) | ((i11 << 6) & 57344) | ((i11 << 3) & 458752);
            int i13 = i10;
            boolean z5 = z4;
            SliderKt.Slider(fCoerceIn, onChange, modifierAlpha, z5, range, i13, null, sliderColorsM2645colorsq0g_0yA, null, composer2, i12, 320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z5;
            i5 = i13;
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            i5 = i4;
            z3 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Sld$lambda$0(f, onChange, range, modifier3, i5, z3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v10 ??, still in use, count: 1, list:
          (r6v10 ?? I:??[OBJECT, ARRAY]) from 0x012e: CHECK_CAST (r7v11 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r6v10 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: Prog-FNF3uiM, reason: not valid java name */
    public static final void m7602ProgFNF3uiM(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v10 ??, still in use, count: 1, list:
          (r6v10 ?? I:??[OBJECT, ARRAY]) from 0x012e: CHECK_CAST (r7v11 ?? I:androidx.compose.animation.core.AnimationSpec) = (androidx.compose.animation.core.AnimationSpec) (r6v10 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Prog_FNF3uiM$lambda$0(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Prog_FNF3uiM$lambda$2$0(DrawScope LinearProgressIndicator) {
        Intrinsics.checkNotNullParameter(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return Unit.INSTANCE;
    }

    public static final void LogBox(final List<String> lines, Modifier modifier, ScrollState scroll, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        ScrollState scrollState;
        final Modifier modifier3;
        final ScrollState scroll2;
        Modifier.Companion modifier4;
        ScrollState scroll3;
        Function0 function0;
        Intrinsics.checkNotNullParameter(lines, "lines");
        Composer $composer2 = $composer.startRestartGroup(-831654773);
        ComposerKt.sourceInformation($composer2, "C(LogBox)353@18328L6,354@18366L43,354@18339L70,356@18447L6,356@18509L6,355@18414L183:Ui.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(lines) : $composer2.changedInstance(lines) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                scrollState = scroll;
                int i3 = $composer2.changed(scrollState) ? 256 : 128;
                $dirty |= i3;
            } else {
                scrollState = scroll;
            }
            $dirty |= i3;
        } else {
            scrollState = scroll;
        }
        boolean z = true;
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            scroll2 = scrollState;
        } else {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "352@18288L21");
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i & 4) != 0) {
                    $dirty &= -897;
                    scroll3 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
                } else {
                    scroll3 = scrollState;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty &= -897;
                    modifier4 = modifier2;
                    scroll3 = scrollState;
                } else {
                    modifier4 = modifier2;
                    scroll3 = scrollState;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-831654773, $dirty, -1, "com.pymcl.android.ui.components.LogBox (Ui.kt:352)");
            }
            PyColors c = Py.INSTANCE.getColors($composer2, 6);
            Integer numValueOf = Integer.valueOf(lines.size());
            ComposerKt.sourceInformationMarkerStart($composer2, -356314538, "CC(remember):Ui.kt#9igjgp");
            if (((($dirty & User32.WM_PENWINFIRST) ^ 384) <= 256 || !$composer2.changed(scroll3)) && ($dirty & 384) != 256) {
                z = false;
            }
            Object objRememberedValue = $composer2.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new UiKt$LogBox$1$1(scroll3, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer2, 0);
            Modifier modifierM738padding3ABfNKs = PaddingKt.m738padding3ABfNKs(ScrollKt.verticalScroll$default(BorderKt.m258borderxT4_qwU(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(modifier4, Py.INSTANCE.getShapes($composer2, 6).getPane()), c.m7981getPaper20d7_KjU(), null, 2, null), Dp.m7018constructorimpl(1), c.m7972getLineSoft0d7_KjU(), Py.INSTANCE.getShapes($composer2, 6).getPane()), scroll3, false, null, false, 14, null), Dp.m7018constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM738padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            Modifier modifier5 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer2);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1353856396, "C:Ui.kt#uiq9q5");
            $composer2.startReplaceGroup(-2121882583);
            ComposerKt.sourceInformation($composer2, "*357@18585L8");
            Iterator it = lines.iterator();
            while (it.hasNext()) {
                Mono((String) it.next(), null, 0, $composer2, 0, 6);
            }
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scroll2 = scroll3;
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UiKt.LogBox$lambda$2(lines, modifier3, scroll2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.compose.ui.Modifier, void] */
    public static final void RowCard(Modifier modifier, boolean selected, Function0<Unit> function0, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        Function0 function02;
        final Modifier modifier3;
        final boolean selected2;
        final Function0 onClick;
        Function0 function03;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-1532628372);
        ComposerKt.sourceInformation($composer2, "C(RowCard)P(1,3,2)363@18796L6,364@18822L6,365@18838L460:Ui.kt#uiq9q5");
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
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            z = selected;
        } else if (($changed & 48) == 0) {
            z = selected;
            $dirty |= $composer2.changed(z) ? 32 : 16;
        } else {
            z = selected;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            function02 = function0;
        } else if (($changed & 384) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            boolean selected3 = i3 != 0 ? false : z;
            Function0 onClick2 = i4 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1532628372, $dirty2, -1, "com.pymcl.android.ui.components.RowCard (Ui.kt:362)");
            }
            PyColors c = Py.INSTANCE.getColors($composer2, 6);
            Shape shape = Py.INSTANCE.getShapes($composer2, 6).getCard();
            Modifier modifierM258borderxT4_qwU = BorderKt.m258borderxT4_qwU(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), shape), selected3 ? c.m7956getAccentTint0d7_KjU() : c.m7980getPaper0d7_KjU(), null, 2, null), Dp.m7018constructorimpl(1), selected3 ? c.m7953getAccentSoft20d7_KjU() : c.m7971getLine0d7_KjU(), shape);
            Modifier.Companion companion = Modifier.INSTANCE;
            ?? Then = modifierM258borderxT4_qwU.then(onClick2 != null ? ClickableKt.m281clickableXHw0xAI$default(companion, false, null, null, onClick2, 7, null) : companion);
            Dp.m7018constructorimpl(14);
            Dp.m7018constructorimpl(10);
            ?? RemoveElementAt = MutableComboBoxModel.removeElementAt((int) Then);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(10));
            int i5 = ($dirty2 & GL11.GL_RENDER) | 432;
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, centerVertically, $composer2, ((i5 >> 3) & 14) | ((i5 >> 3) & 112));
            Modifier modifier5 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            boolean selected4 = selected3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, RemoveElementAt);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((i5 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function03 = constructor;
                $composer2.createNode(function03);
            } else {
                function03 = constructor;
                $composer2.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer2);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            content.invoke(RowScopeInstance.INSTANCE, $composer2, Integer.valueOf(((i5 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            selected2 = selected4;
            modifier3 = modifier5;
            onClick = onClick2;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            selected2 = z;
            onClick = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.RowCard$lambda$0(modifier3, selected2, onClick, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: LetterTile-uFdPcIQ, reason: not valid java name */
    public static final void m7600LetterTileuFdPcIQ(final String text, float size, boolean brush, Composer $composer, final int $changed, final int i) {
        float f;
        boolean z;
        final float size2;
        final boolean brush2;
        Function0 function0;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer2 = $composer.startRestartGroup(-982696290);
        ComposerKt.sourceInformation($composer2, "C(LetterTile)P(2,1:c#ui.unit.Dp)377@19434L6,378@19445L355:Ui.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(text) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            f = size;
        } else if (($changed & 48) == 0) {
            f = size;
            $dirty |= $composer2.changed(f) ? 32 : 16;
        } else {
            f = size;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            z = brush;
        } else if (($changed & 384) == 0) {
            z = brush;
            $dirty |= $composer2.changed(z) ? 256 : 128;
        } else {
            z = brush;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            float size3 = i2 != 0 ? Dp.m7018constructorimpl(36) : f;
            boolean brush3 = i3 != 0 ? false : z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-982696290, $dirty2, -1, "com.pymcl.android.ui.components.LetterTile (Ui.kt:376)");
            }
            PyColors c = Py.INSTANCE.getColors($composer2, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierClip = ClipKt.clip(CacioChoicePeer.mo7501initSwingComponent(), RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(Dp.m7018constructorimpl(size3 / 4)));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierThen = modifierClip.then(brush3 ? BackgroundKt.background$default(companion2, c.getLogoBrush(), null, 0.0f, 6, null) : BackgroundKt.m247backgroundbw27NRU$default(companion2, c.m7952getAccentSoft0d7_KjU(), null, 2, null));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            float size4 = size3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierThen);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((48 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            boolean brush4 = brush3;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer2);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1873802269, "C381@19656L142:Ui.kt#uiq9q5");
            String upperCase = StringsKt.take(text, 1).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            TextKt.m2843Text4IGK_g(upperCase, (Modifier) null, brush4 ? c.m7978getOnLogo0d7_KjU() : c.m7955getAccentText0d7_KjU(), TextUnitKt.getSp(0.42f * size4), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            size2 = size4;
            brush2 = brush4;
        } else {
            $composer2.skipToGroupEnd();
            size2 = f;
            brush2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.LetterTile_uFdPcIQ$lambda$1(text, size2, brush2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca  */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier, void] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ScrollBody(androidx.compose.ui.Modifier r28, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.ScrollBody(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: Dot-iPRSM58, reason: not valid java name */
    public static final void m7595DotiPRSM58(final long color, float size, Composer $composer, final int $changed, final int i) {
        final float size2;
        float size3;
        Composer $composer2 = $composer.startRestartGroup(1944336291);
        ComposerKt.sourceInformation($composer2, "C(Dot)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)394@20226L60:Ui.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(color) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(size) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (i2 == 0) {
                size3 = size;
            } else {
                size3 = Dp.m7018constructorimpl(6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1944336291, $dirty, -1, "com.pymcl.android.ui.components.Dot (Ui.kt:394)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BoxKt.Box(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(CacioChoicePeer.mo7501initSwingComponent(), RoundedCornerShapeKt.getCircleShape()), color, null, 2, null), $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            size2 = size3;
        } else {
            $composer2.skipToGroupEnd();
            size2 = size;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Dot_iPRSM58$lambda$0(color, size2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 ??, still in use, count: 1, list:
          (r1v6 ?? I:??[OBJECT, ARRAY]) from 0x006c: CHECK_CAST (r1v7 ?? I:androidx.compose.animation.core.FiniteAnimationSpec) = (androidx.compose.animation.core.FiniteAnimationSpec) (r1v6 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void PopIn(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 ??, still in use, count: 1, list:
          (r1v6 ?? I:??[OBJECT, ARRAY]) from 0x006c: CHECK_CAST (r1v7 ?? I:androidx.compose.animation.core.FiniteAnimationSpec) = (androidx.compose.animation.core.FiniteAnimationSpec) (r1v6 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PopIn$lambda$0(Function2 $content, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C398@20566L9:Ui.kt#uiq9q5");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834131232, $changed, -1, "com.pymcl.android.ui.components.PopIn.<anonymous> (Ui.kt:398)");
            }
            $content.invoke($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r33v4, types: [androidx.compose.ui.Modifier, void] */
    public static final void Segmented(final List<String> options, final int selected, final Function1<? super Integer, Unit> onSelect, boolean raw, Composer $composer, final int $changed, final int i) {
        boolean raw2;
        final boolean raw3;
        Function0 function0;
        int i2;
        String strTr;
        int i3;
        MeasurePolicy measurePolicy;
        boolean raw4;
        int i4;
        Modifier.Companion companionM258borderxT4_qwU;
        int i5 = selected;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer $composer2 = $composer.startRestartGroup(-148241329);
        ComposerKt.sourceInformation($composer2, "C(Segmented)P(1,3)404@20736L6,405@20768L6,405@20825L6,405@20747L737:Ui.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(options) : $composer2.changedInstance(options) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(i5) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onSelect) ? 256 : 128;
        }
        int i6 = i & 8;
        if (i6 != 0) {
            $dirty |= 3072;
            raw2 = raw;
        } else if (($changed & 3072) == 0) {
            raw2 = raw;
            $dirty |= $composer2.changed(raw2) ? 2048 : 1024;
        } else {
            raw2 = raw;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (i6 != 0) {
                raw2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-148241329, $dirty2, -1, "com.pymcl.android.ui.components.Segmented (Ui.kt:403)");
            }
            PyColors c = Py.INSTANCE.getColors($composer2, 6);
            Modifier modifierM738padding3ABfNKs = PaddingKt.m738padding3ABfNKs(BorderKt.m258borderxT4_qwU(BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, Py.INSTANCE.getShapes($composer2, 6).getCtl()), c.m7981getPaper20d7_KjU(), null, 2, null), Dp.m7018constructorimpl(1), c.m7971getLine0d7_KjU(), Py.INSTANCE.getShapes($composer2, 6).getCtl()), Dp.m7018constructorimpl(3));
            int i7 = 0;
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM738padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer2);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = (i8 >> 6) & 14;
            int i10 = 0;
            ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i11 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1305541616, "C:Ui.kt#uiq9q5");
            $composer2.startReplaceGroup(789169995);
            ComposerKt.sourceInformation($composer2, "*412@21233L15,408@20943L525");
            List<String> list = options;
            int i12 = 0;
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Iterable iterable = list;
                String str = (String) obj;
                final int i15 = i13;
                int i16 = i12;
                boolean z = i15 == i5;
                if (raw2) {
                    strTr = str;
                    i2 = i10;
                } else {
                    i2 = i10;
                    strTr = I18nKt.tr(str, new Object[0]);
                }
                Modifier modifierM247backgroundbw27NRU$default = BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(Dp.m7018constructorimpl(6))), z ? c.m7980getPaper0d7_KjU() : Color.INSTANCE.m4425getTransparent0d7_KjU(), null, 2, null);
                if (z) {
                    i3 = i11;
                    measurePolicy = measurePolicyRowMeasurePolicy;
                    raw4 = raw2;
                    i4 = i7;
                    companionM258borderxT4_qwU = BorderKt.m258borderxT4_qwU(Modifier.INSTANCE, Dp.m7018constructorimpl(1), c.m7971getLine0d7_KjU(), RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(Dp.m7018constructorimpl(6)));
                } else {
                    i3 = i11;
                    measurePolicy = measurePolicyRowMeasurePolicy;
                    raw4 = raw2;
                    i4 = i7;
                    companionM258borderxT4_qwU = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifierM247backgroundbw27NRU$default.then(companionM258borderxT4_qwU);
                ComposerKt.sourceInformationMarkerStart($composer2, 1518987028, "CC(remember):Ui.kt#9igjgp");
                boolean zChanged = (($dirty2 & User32.WM_PENWINFIRST) == 256) | $composer2.changed(i15);
                Object objRememberedValue = $composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UiKt.Segmented$lambda$0$0$0$0(onSelect, i15);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ?? M281clickableXHw0xAI$default = ClickableKt.m281clickableXHw0xAI$default(modifierThen, false, null, null, (Function0) objRememberedValue, 7, null);
                Dp.m7018constructorimpl(12);
                Dp.m7018constructorimpl(5);
                ?? RemoveElementAt = MutableComboBoxModel.removeElementAt((int) M281clickableXHw0xAI$default);
                long sp = TextUnitKt.getSp(13);
                long jM7955getAccentText0d7_KjU = z ? c.m7955getAccentText0d7_KjU() : c.m7970getInkSoft0d7_KjU();
                FontWeight.Companion companion = FontWeight.INSTANCE;
                TextKt.m2843Text4IGK_g(strTr, (Modifier) RemoveElementAt, jM7955getAccentText0d7_KjU, sp, (FontStyle) null, z ? companion.getSemiBold() : companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 3072, 3072, 122832);
                i5 = selected;
                i10 = i2;
                i13 = i14;
                list = iterable;
                i12 = i16;
                i11 = i3;
                measurePolicyRowMeasurePolicy = measurePolicy;
                raw2 = raw4;
                i7 = i4;
            }
            boolean raw5 = raw2;
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            raw3 = raw5;
        } else {
            $composer2.skipToGroupEnd();
            raw3 = raw2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return UiKt.Segmented$lambda$1(options, selected, onSelect, raw3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Segmented$lambda$0$0$0$0(Function1 $onSelect, int $i) {
        $onSelect.invoke(Integer.valueOf($i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.Modifier, int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier, void] */
    public static final void Divider(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1802346142);
        ComposerKt.sourceInformation($composer2, "C(Divider)420@21571L6,420@21516L72:Ui.kt#uiq9q5");
        if ($composer2.shouldExecute($changed != 0, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1802346142, $changed, -1, "com.pymcl.android.ui.components.Divider (Ui.kt:420)");
            }
            ?? FillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Dp.m7018constructorimpl(1);
            BoxKt.Box(BackgroundKt.m247backgroundbw27NRU$default(JComboBox.setSelectedIndex((int) FillMaxWidth$default), Py.INSTANCE.getColors($composer2, 6).m7972getLineSoft0d7_KjU(), null, 2, null), $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.UiKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UiKt.Divider$lambda$0($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HoverLift(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.UiKt.HoverLift(kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    private static final boolean HoverLift$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [float, java.awt.event.ItemListener] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.BorderStroke, void] */
    static {
        ?? M7018constructorimpl = Dp.m7018constructorimpl(1);
        Color.INSTANCE.m4425getTransparent0d7_KjU();
        _unusedBorder = JComboBox.addItemListener((ItemListener) M7018constructorimpl);
        _unusedStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (DefaultConstructorMarker) null);
    }
}
