package com.pymcl.android.ui.theme;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TileMode;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010 \n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050,\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050,¢\u0006\u0004\b1\u00102J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\u0010\u0010l\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bm\u00106J\u0010\u0010n\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bo\u00106J\u0010\u0010p\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bq\u00106J\u0010\u0010r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bs\u00106J\u0010\u0010t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bu\u00106J\u0010\u0010v\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bw\u00106J\u0010\u0010x\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\by\u00106J\u0010\u0010z\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b{\u00106J\u0010\u0010|\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b}\u00106J\u0010\u0010~\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u007f\u00106J\u0012\u0010\u0080\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u00106J\u0012\u0010\u0082\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u00106J\u0012\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u00106J\u0012\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u00106J\u0012\u0010\u0088\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0089\u0001\u00106J\u0012\u0010\u008a\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u008b\u0001\u00106J\u0012\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u008d\u0001\u00106J\u0012\u0010\u008e\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u008f\u0001\u00106J\u0012\u0010\u0090\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0091\u0001\u00106J\u0012\u0010\u0092\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0093\u0001\u00106J\u0012\u0010\u0094\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0095\u0001\u00106J\u0012\u0010\u0096\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0097\u0001\u00106J\u0012\u0010\u0098\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0099\u0001\u00106J\u0012\u0010\u009a\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u009b\u0001\u00106J\u0012\u0010\u009c\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u009d\u0001\u00106J\u0012\u0010\u009e\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u009f\u0001\u00106J\u0012\u0010 \u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b¡\u0001\u00106J\u0012\u0010¢\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b£\u0001\u00106J\u0012\u0010¤\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b¥\u0001\u00106J\u0012\u0010¦\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b§\u0001\u00106J\u0012\u0010¨\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b©\u0001\u00106J\u0012\u0010ª\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b«\u0001\u00106J\u0012\u0010¬\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u00ad\u0001\u00106J\u0012\u0010®\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b¯\u0001\u00106J\u0012\u0010°\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b±\u0001\u00106J\u0012\u0010²\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b³\u0001\u00106J\u0012\u0010´\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\bµ\u0001\u00106J\u0012\u0010¶\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b·\u0001\u00106J\u0010\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050,HÆ\u0003J\u0012\u0010¹\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\bº\u0001\u00106J\u0010\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050,HÆ\u0003J\u0012\u0010¼\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b½\u0001\u00106J\u0010\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050,HÆ\u0003JÝ\u0003\u0010¿\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050,2\b\b\u0002\u0010-\u001a\u00020\u00052\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050,2\b\b\u0002\u0010/\u001a\u00020\u00052\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050,HÆ\u0001¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0016\u0010Â\u0001\u001a\u00020\u00032\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\f\u0010Ä\u0001\u001a\u00030Å\u0001HÖ\u0081\u0004J\f\u0010Æ\u0001\u001a\u00030Ç\u0001HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b8\u00106R\u0013\u0010\u0007\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b9\u00106R\u0013\u0010\b\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b:\u00106R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b;\u00106R\u0013\u0010\n\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b<\u00106R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b=\u00106R\u0013\u0010\f\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b>\u00106R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b?\u00106R\u0013\u0010\u000e\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b@\u00106R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bA\u00106R\u0013\u0010\u0010\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bB\u00106R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bC\u00106R\u0013\u0010\u0012\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bD\u00106R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bE\u00106R\u0013\u0010\u0014\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bF\u00106R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bG\u00106R\u0013\u0010\u0016\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bH\u00106R\u0013\u0010\u0017\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bI\u00106R\u0013\u0010\u0018\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bJ\u00106R\u0013\u0010\u0019\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bK\u00106R\u0013\u0010\u001a\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bL\u00106R\u0013\u0010\u001b\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bM\u00106R\u0013\u0010\u001c\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bN\u00106R\u0013\u0010\u001d\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bO\u00106R\u0013\u0010\u001e\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bP\u00106R\u0013\u0010\u001f\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bQ\u00106R\u0013\u0010 \u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bR\u00106R\u0013\u0010!\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bS\u00106R\u0013\u0010\"\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bT\u00106R\u0013\u0010#\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bU\u00106R\u0013\u0010$\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bV\u00106R\u0013\u0010%\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bW\u00106R\u0013\u0010&\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bX\u00106R\u0013\u0010'\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bY\u00106R\u0013\u0010(\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\bZ\u00106R\u0013\u0010)\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b[\u00106R\u0013\u0010*\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b\\\u00106R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050,¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010-\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\b_\u00106R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050,¢\u0006\b\n\u0000\u001a\u0004\b`\u0010^R\u0013\u0010/\u001a\u00020\u0005¢\u0006\n\n\u0002\u00107\u001a\u0004\ba\u00106R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050,¢\u0006\b\n\u0000\u001a\u0004\bb\u0010^R\u0011\u0010c\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010g\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\bh\u0010fR\u0011\u0010i\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\bj\u0010fÊ\u0001\u0003\bÉ\u0001¨\u0006È\u0001"}, d2 = {"Lcom/pymcl/android/ui/theme/PyColors;", "", "dark", "", "accent", "Landroidx/compose/ui/graphics/Color;", "accentStrong", "onAccentStrong", "accentText", "accentTint", "accentDeep", "accentLite", "accentSoft", "accentSoft2", "onAccent", "canvas", "paper", "paper2", "side", "chrome", "line", "lineSoft", "hover", "pressed", "ink", "inkSoft", "inkMuted", "inkFaint", "danger", "dangerSoft", "warn", "warnSoft", "info", "infoSoft", SettingsProtocol.EXTRA_OK, "onOk", "scroll", "scrollHover", "mask", "glass", "glassStrong", "glassBorder", "shadow", "banner", "", "onBanner", "logo", "onLogo", "pageWash", "<init>", "(ZJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLjava/util/List;JLjava/util/List;JLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDark", "()Z", "getAccent-0d7_KjU", "()J", "J", "getAccentStrong-0d7_KjU", "getOnAccentStrong-0d7_KjU", "getAccentText-0d7_KjU", "getAccentTint-0d7_KjU", "getAccentDeep-0d7_KjU", "getAccentLite-0d7_KjU", "getAccentSoft-0d7_KjU", "getAccentSoft2-0d7_KjU", "getOnAccent-0d7_KjU", "getCanvas-0d7_KjU", "getPaper-0d7_KjU", "getPaper2-0d7_KjU", "getSide-0d7_KjU", "getChrome-0d7_KjU", "getLine-0d7_KjU", "getLineSoft-0d7_KjU", "getHover-0d7_KjU", "getPressed-0d7_KjU", "getInk-0d7_KjU", "getInkSoft-0d7_KjU", "getInkMuted-0d7_KjU", "getInkFaint-0d7_KjU", "getDanger-0d7_KjU", "getDangerSoft-0d7_KjU", "getWarn-0d7_KjU", "getWarnSoft-0d7_KjU", "getInfo-0d7_KjU", "getInfoSoft-0d7_KjU", "getOk-0d7_KjU", "getOnOk-0d7_KjU", "getScroll-0d7_KjU", "getScrollHover-0d7_KjU", "getMask-0d7_KjU", "getGlass-0d7_KjU", "getGlassStrong-0d7_KjU", "getGlassBorder-0d7_KjU", "getShadow-0d7_KjU", "getBanner", "()Ljava/util/List;", "getOnBanner-0d7_KjU", "getLogo", "getOnLogo-0d7_KjU", "getPageWash", "bannerBrush", "Landroidx/compose/ui/graphics/Brush;", "getBannerBrush", "()Landroidx/compose/ui/graphics/Brush;", "logoBrush", "getLogoBrush", "washBrush", "getWashBrush", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "component8", "component8-0d7_KjU", "component9", "component9-0d7_KjU", "component10", "component10-0d7_KjU", "component11", "component11-0d7_KjU", "component12", "component12-0d7_KjU", "component13", "component13-0d7_KjU", "component14", "component14-0d7_KjU", "component15", "component15-0d7_KjU", "component16", "component16-0d7_KjU", "component17", "component17-0d7_KjU", "component18", "component18-0d7_KjU", "component19", "component19-0d7_KjU", "component20", "component20-0d7_KjU", "component21", "component21-0d7_KjU", "component22", "component22-0d7_KjU", "component23", "component23-0d7_KjU", "component24", "component24-0d7_KjU", "component25", "component25-0d7_KjU", "component26", "component26-0d7_KjU", "component27", "component27-0d7_KjU", "component28", "component28-0d7_KjU", "component29", "component29-0d7_KjU", "component30", "component30-0d7_KjU", "component31", "component31-0d7_KjU", "component32", "component32-0d7_KjU", "component33", "component33-0d7_KjU", "component34", "component34-0d7_KjU", "component35", "component35-0d7_KjU", "component36", "component36-0d7_KjU", "component37", "component37-0d7_KjU", "component38", "component38-0d7_KjU", "component39", "component39-0d7_KjU", "component40", "component41", "component41-0d7_KjU", "component42", "component43", "component43-0d7_KjU", "component44", "copy", "copy-bv-zJcY", "(ZJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLjava/util/List;JLjava/util/List;JLjava/util/List;)Lcom/pymcl/android/ui/theme/PyColors;", "equals", "other", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/Immutable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class PyColors {
    public static final int $stable = 0;
    private final long accent;
    private final long accentDeep;
    private final long accentLite;
    private final long accentSoft;
    private final long accentSoft2;
    private final long accentStrong;
    private final long accentText;
    private final long accentTint;
    private final List<Color> banner;
    private final long canvas;
    private final long chrome;
    private final long danger;
    private final long dangerSoft;
    private final boolean dark;
    private final long glass;
    private final long glassBorder;
    private final long glassStrong;
    private final long hover;
    private final long info;
    private final long infoSoft;
    private final long ink;
    private final long inkFaint;
    private final long inkMuted;
    private final long inkSoft;
    private final long line;
    private final long lineSoft;
    private final List<Color> logo;
    private final long mask;
    private final long ok;
    private final long onAccent;
    private final long onAccentStrong;
    private final long onBanner;
    private final long onLogo;
    private final long onOk;
    private final List<Color> pageWash;
    private final long paper;
    private final long paper2;
    private final long pressed;
    private final long scroll;
    private final long scrollHover;
    private final long shadow;
    private final long side;
    private final long warn;
    private final long warnSoft;

    public /* synthetic */ PyColors(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, List list, long j39, List list2, long j40, List list3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, list, j39, list2, j40, list3);
    }

    /* renamed from: copy-bv-zJcY$default, reason: not valid java name */
    public static /* synthetic */ PyColors m7907copybvzJcY$default(PyColors pyColors, boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, List list, long j39, List list2, long j40, List list3, int i, int i2, Object obj) {
        boolean z2 = (i & 1) != 0 ? pyColors.dark : z;
        long j41 = (i & 2) != 0 ? pyColors.accent : j;
        long j42 = (i & 4) != 0 ? pyColors.accentStrong : j2;
        long j43 = (i & 8) != 0 ? pyColors.onAccentStrong : j3;
        long j44 = (i & 16) != 0 ? pyColors.accentText : j4;
        long j45 = (i & 32) != 0 ? pyColors.accentTint : j5;
        long j46 = (i & 64) != 0 ? pyColors.accentDeep : j6;
        boolean z3 = z2;
        long j47 = j41;
        long j48 = (i & 128) != 0 ? pyColors.accentLite : j7;
        long j49 = (i & 256) != 0 ? pyColors.accentSoft : j8;
        long j50 = (i & 512) != 0 ? pyColors.accentSoft2 : j9;
        long j51 = (i & 1024) != 0 ? pyColors.onAccent : j10;
        long j52 = (i & 2048) != 0 ? pyColors.canvas : j11;
        long j53 = (i & 4096) != 0 ? pyColors.paper : j12;
        long j54 = (i & 8192) != 0 ? pyColors.paper2 : j13;
        long j55 = (i & 16384) != 0 ? pyColors.side : j14;
        long j56 = (32768 & i) != 0 ? pyColors.chrome : j15;
        long j57 = (65536 & i) != 0 ? pyColors.line : j16;
        long j58 = (131072 & i) != 0 ? pyColors.lineSoft : j17;
        long j59 = (262144 & i) != 0 ? pyColors.hover : j18;
        long j60 = (524288 & i) != 0 ? pyColors.pressed : j19;
        long j61 = (1048576 & i) != 0 ? pyColors.ink : j20;
        long j62 = (2097152 & i) != 0 ? pyColors.inkSoft : j21;
        long j63 = (4194304 & i) != 0 ? pyColors.inkMuted : j22;
        long j64 = (8388608 & i) != 0 ? pyColors.inkFaint : j23;
        long j65 = (16777216 & i) != 0 ? pyColors.danger : j24;
        long j66 = (33554432 & i) != 0 ? pyColors.dangerSoft : j25;
        long j67 = (67108864 & i) != 0 ? pyColors.warn : j26;
        long j68 = (134217728 & i) != 0 ? pyColors.warnSoft : j27;
        long j69 = (268435456 & i) != 0 ? pyColors.info : j28;
        long j70 = (536870912 & i) != 0 ? pyColors.infoSoft : j29;
        long j71 = (1073741824 & i) != 0 ? pyColors.ok : j30;
        long j72 = (i & Integer.MIN_VALUE) != 0 ? pyColors.onOk : j31;
        long j73 = (i2 & 1) != 0 ? pyColors.scroll : j32;
        long j74 = (i2 & 2) != 0 ? pyColors.scrollHover : j33;
        long j75 = (i2 & 4) != 0 ? pyColors.mask : j34;
        long j76 = (i2 & 8) != 0 ? pyColors.glass : j35;
        long j77 = (i2 & 16) != 0 ? pyColors.glassStrong : j36;
        long j78 = (i2 & 32) != 0 ? pyColors.glassBorder : j37;
        long j79 = (i2 & 64) != 0 ? pyColors.shadow : j38;
        List list4 = (i2 & 128) != 0 ? pyColors.banner : list;
        long j80 = j79;
        long j81 = (i2 & 256) != 0 ? pyColors.onBanner : j39;
        return pyColors.m7948copybvzJcY(z3, j47, j42, j43, j44, j45, j46, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, j75, j76, j77, j78, j80, list4, j81, (i2 & 512) != 0 ? pyColors.logo : list2, (i2 & 1024) != 0 ? pyColors.onLogo : j40, (i2 & 2048) != 0 ? pyColors.pageWash : list3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDark() {
        return this.dark;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentSoft2() {
        return this.accentSoft2;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnAccent() {
        return this.onAccent;
    }

    /* renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    public final long getCanvas() {
        return this.canvas;
    }

    /* renamed from: component13-0d7_KjU, reason: not valid java name and from getter */
    public final long getPaper() {
        return this.paper;
    }

    /* renamed from: component14-0d7_KjU, reason: not valid java name and from getter */
    public final long getPaper2() {
        return this.paper2;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getSide() {
        return this.side;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getChrome() {
        return this.chrome;
    }

    /* renamed from: component17-0d7_KjU, reason: not valid java name and from getter */
    public final long getLine() {
        return this.line;
    }

    /* renamed from: component18-0d7_KjU, reason: not valid java name and from getter */
    public final long getLineSoft() {
        return this.lineSoft;
    }

    /* renamed from: component19-0d7_KjU, reason: not valid java name and from getter */
    public final long getHover() {
        return this.hover;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccent() {
        return this.accent;
    }

    /* renamed from: component20-0d7_KjU, reason: not valid java name and from getter */
    public final long getPressed() {
        return this.pressed;
    }

    /* renamed from: component21-0d7_KjU, reason: not valid java name and from getter */
    public final long getInk() {
        return this.ink;
    }

    /* renamed from: component22-0d7_KjU, reason: not valid java name and from getter */
    public final long getInkSoft() {
        return this.inkSoft;
    }

    /* renamed from: component23-0d7_KjU, reason: not valid java name and from getter */
    public final long getInkMuted() {
        return this.inkMuted;
    }

    /* renamed from: component24-0d7_KjU, reason: not valid java name and from getter */
    public final long getInkFaint() {
        return this.inkFaint;
    }

    /* renamed from: component25-0d7_KjU, reason: not valid java name and from getter */
    public final long getDanger() {
        return this.danger;
    }

    /* renamed from: component26-0d7_KjU, reason: not valid java name and from getter */
    public final long getDangerSoft() {
        return this.dangerSoft;
    }

    /* renamed from: component27-0d7_KjU, reason: not valid java name and from getter */
    public final long getWarn() {
        return this.warn;
    }

    /* renamed from: component28-0d7_KjU, reason: not valid java name and from getter */
    public final long getWarnSoft() {
        return this.warnSoft;
    }

    /* renamed from: component29-0d7_KjU, reason: not valid java name and from getter */
    public final long getInfo() {
        return this.info;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentStrong() {
        return this.accentStrong;
    }

    /* renamed from: component30-0d7_KjU, reason: not valid java name and from getter */
    public final long getInfoSoft() {
        return this.infoSoft;
    }

    /* renamed from: component31-0d7_KjU, reason: not valid java name and from getter */
    public final long getOk() {
        return this.ok;
    }

    /* renamed from: component32-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnOk() {
        return this.onOk;
    }

    /* renamed from: component33-0d7_KjU, reason: not valid java name and from getter */
    public final long getScroll() {
        return this.scroll;
    }

    /* renamed from: component34-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrollHover() {
        return this.scrollHover;
    }

    /* renamed from: component35-0d7_KjU, reason: not valid java name and from getter */
    public final long getMask() {
        return this.mask;
    }

    /* renamed from: component36-0d7_KjU, reason: not valid java name and from getter */
    public final long getGlass() {
        return this.glass;
    }

    /* renamed from: component37-0d7_KjU, reason: not valid java name and from getter */
    public final long getGlassStrong() {
        return this.glassStrong;
    }

    /* renamed from: component38-0d7_KjU, reason: not valid java name and from getter */
    public final long getGlassBorder() {
        return this.glassBorder;
    }

    /* renamed from: component39-0d7_KjU, reason: not valid java name and from getter */
    public final long getShadow() {
        return this.shadow;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnAccentStrong() {
        return this.onAccentStrong;
    }

    public final List<Color> component40() {
        return this.banner;
    }

    /* renamed from: component41-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBanner() {
        return this.onBanner;
    }

    public final List<Color> component42() {
        return this.logo;
    }

    /* renamed from: component43-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnLogo() {
        return this.onLogo;
    }

    public final List<Color> component44() {
        return this.pageWash;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentText() {
        return this.accentText;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentTint() {
        return this.accentTint;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentDeep() {
        return this.accentDeep;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentLite() {
        return this.accentLite;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentSoft() {
        return this.accentSoft;
    }

    /* renamed from: copy-bv-zJcY, reason: not valid java name */
    public final PyColors m7948copybvzJcY(boolean dark, long accent, long accentStrong, long onAccentStrong, long accentText, long accentTint, long accentDeep, long accentLite, long accentSoft, long accentSoft2, long onAccent, long canvas, long paper, long paper2, long side, long chrome, long line, long lineSoft, long hover, long pressed, long ink, long inkSoft, long inkMuted, long inkFaint, long danger, long dangerSoft, long warn, long warnSoft, long info, long infoSoft, long ok, long onOk, long scroll, long scrollHover, long mask, long glass, long glassStrong, long glassBorder, long shadow, List<Color> banner, long onBanner, List<Color> logo, long onLogo, List<Color> pageWash) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(pageWash, "pageWash");
        return new PyColors(dark, accent, accentStrong, onAccentStrong, accentText, accentTint, accentDeep, accentLite, accentSoft, accentSoft2, onAccent, canvas, paper, paper2, side, chrome, line, lineSoft, hover, pressed, ink, inkSoft, inkMuted, inkFaint, danger, dangerSoft, warn, warnSoft, info, infoSoft, ok, onOk, scroll, scrollHover, mask, glass, glassStrong, glassBorder, shadow, banner, onBanner, logo, onLogo, pageWash, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PyColors)) {
            return false;
        }
        PyColors pyColors = (PyColors) other;
        return this.dark == pyColors.dark && Color.m4391equalsimpl0(this.accent, pyColors.accent) && Color.m4391equalsimpl0(this.accentStrong, pyColors.accentStrong) && Color.m4391equalsimpl0(this.onAccentStrong, pyColors.onAccentStrong) && Color.m4391equalsimpl0(this.accentText, pyColors.accentText) && Color.m4391equalsimpl0(this.accentTint, pyColors.accentTint) && Color.m4391equalsimpl0(this.accentDeep, pyColors.accentDeep) && Color.m4391equalsimpl0(this.accentLite, pyColors.accentLite) && Color.m4391equalsimpl0(this.accentSoft, pyColors.accentSoft) && Color.m4391equalsimpl0(this.accentSoft2, pyColors.accentSoft2) && Color.m4391equalsimpl0(this.onAccent, pyColors.onAccent) && Color.m4391equalsimpl0(this.canvas, pyColors.canvas) && Color.m4391equalsimpl0(this.paper, pyColors.paper) && Color.m4391equalsimpl0(this.paper2, pyColors.paper2) && Color.m4391equalsimpl0(this.side, pyColors.side) && Color.m4391equalsimpl0(this.chrome, pyColors.chrome) && Color.m4391equalsimpl0(this.line, pyColors.line) && Color.m4391equalsimpl0(this.lineSoft, pyColors.lineSoft) && Color.m4391equalsimpl0(this.hover, pyColors.hover) && Color.m4391equalsimpl0(this.pressed, pyColors.pressed) && Color.m4391equalsimpl0(this.ink, pyColors.ink) && Color.m4391equalsimpl0(this.inkSoft, pyColors.inkSoft) && Color.m4391equalsimpl0(this.inkMuted, pyColors.inkMuted) && Color.m4391equalsimpl0(this.inkFaint, pyColors.inkFaint) && Color.m4391equalsimpl0(this.danger, pyColors.danger) && Color.m4391equalsimpl0(this.dangerSoft, pyColors.dangerSoft) && Color.m4391equalsimpl0(this.warn, pyColors.warn) && Color.m4391equalsimpl0(this.warnSoft, pyColors.warnSoft) && Color.m4391equalsimpl0(this.info, pyColors.info) && Color.m4391equalsimpl0(this.infoSoft, pyColors.infoSoft) && Color.m4391equalsimpl0(this.ok, pyColors.ok) && Color.m4391equalsimpl0(this.onOk, pyColors.onOk) && Color.m4391equalsimpl0(this.scroll, pyColors.scroll) && Color.m4391equalsimpl0(this.scrollHover, pyColors.scrollHover) && Color.m4391equalsimpl0(this.mask, pyColors.mask) && Color.m4391equalsimpl0(this.glass, pyColors.glass) && Color.m4391equalsimpl0(this.glassStrong, pyColors.glassStrong) && Color.m4391equalsimpl0(this.glassBorder, pyColors.glassBorder) && Color.m4391equalsimpl0(this.shadow, pyColors.shadow) && Intrinsics.areEqual(this.banner, pyColors.banner) && Color.m4391equalsimpl0(this.onBanner, pyColors.onBanner) && Intrinsics.areEqual(this.logo, pyColors.logo) && Color.m4391equalsimpl0(this.onLogo, pyColors.onLogo) && Intrinsics.areEqual(this.pageWash, pyColors.pageWash);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.dark) * 31) + Color.m4397hashCodeimpl(this.accent)) * 31) + Color.m4397hashCodeimpl(this.accentStrong)) * 31) + Color.m4397hashCodeimpl(this.onAccentStrong)) * 31) + Color.m4397hashCodeimpl(this.accentText)) * 31) + Color.m4397hashCodeimpl(this.accentTint)) * 31) + Color.m4397hashCodeimpl(this.accentDeep)) * 31) + Color.m4397hashCodeimpl(this.accentLite)) * 31) + Color.m4397hashCodeimpl(this.accentSoft)) * 31) + Color.m4397hashCodeimpl(this.accentSoft2)) * 31) + Color.m4397hashCodeimpl(this.onAccent)) * 31) + Color.m4397hashCodeimpl(this.canvas)) * 31) + Color.m4397hashCodeimpl(this.paper)) * 31) + Color.m4397hashCodeimpl(this.paper2)) * 31) + Color.m4397hashCodeimpl(this.side)) * 31) + Color.m4397hashCodeimpl(this.chrome)) * 31) + Color.m4397hashCodeimpl(this.line)) * 31) + Color.m4397hashCodeimpl(this.lineSoft)) * 31) + Color.m4397hashCodeimpl(this.hover)) * 31) + Color.m4397hashCodeimpl(this.pressed)) * 31) + Color.m4397hashCodeimpl(this.ink)) * 31) + Color.m4397hashCodeimpl(this.inkSoft)) * 31) + Color.m4397hashCodeimpl(this.inkMuted)) * 31) + Color.m4397hashCodeimpl(this.inkFaint)) * 31) + Color.m4397hashCodeimpl(this.danger)) * 31) + Color.m4397hashCodeimpl(this.dangerSoft)) * 31) + Color.m4397hashCodeimpl(this.warn)) * 31) + Color.m4397hashCodeimpl(this.warnSoft)) * 31) + Color.m4397hashCodeimpl(this.info)) * 31) + Color.m4397hashCodeimpl(this.infoSoft)) * 31) + Color.m4397hashCodeimpl(this.ok)) * 31) + Color.m4397hashCodeimpl(this.onOk)) * 31) + Color.m4397hashCodeimpl(this.scroll)) * 31) + Color.m4397hashCodeimpl(this.scrollHover)) * 31) + Color.m4397hashCodeimpl(this.mask)) * 31) + Color.m4397hashCodeimpl(this.glass)) * 31) + Color.m4397hashCodeimpl(this.glassStrong)) * 31) + Color.m4397hashCodeimpl(this.glassBorder)) * 31) + Color.m4397hashCodeimpl(this.shadow)) * 31) + this.banner.hashCode()) * 31) + Color.m4397hashCodeimpl(this.onBanner)) * 31) + this.logo.hashCode()) * 31) + Color.m4397hashCodeimpl(this.onLogo)) * 31) + this.pageWash.hashCode();
    }

    public String toString() {
        return "PyColors(dark=" + this.dark + ", accent=" + Color.m4398toStringimpl(this.accent) + ", accentStrong=" + Color.m4398toStringimpl(this.accentStrong) + ", onAccentStrong=" + Color.m4398toStringimpl(this.onAccentStrong) + ", accentText=" + Color.m4398toStringimpl(this.accentText) + ", accentTint=" + Color.m4398toStringimpl(this.accentTint) + ", accentDeep=" + Color.m4398toStringimpl(this.accentDeep) + ", accentLite=" + Color.m4398toStringimpl(this.accentLite) + ", accentSoft=" + Color.m4398toStringimpl(this.accentSoft) + ", accentSoft2=" + Color.m4398toStringimpl(this.accentSoft2) + ", onAccent=" + Color.m4398toStringimpl(this.onAccent) + ", canvas=" + Color.m4398toStringimpl(this.canvas) + ", paper=" + Color.m4398toStringimpl(this.paper) + ", paper2=" + Color.m4398toStringimpl(this.paper2) + ", side=" + Color.m4398toStringimpl(this.side) + ", chrome=" + Color.m4398toStringimpl(this.chrome) + ", line=" + Color.m4398toStringimpl(this.line) + ", lineSoft=" + Color.m4398toStringimpl(this.lineSoft) + ", hover=" + Color.m4398toStringimpl(this.hover) + ", pressed=" + Color.m4398toStringimpl(this.pressed) + ", ink=" + Color.m4398toStringimpl(this.ink) + ", inkSoft=" + Color.m4398toStringimpl(this.inkSoft) + ", inkMuted=" + Color.m4398toStringimpl(this.inkMuted) + ", inkFaint=" + Color.m4398toStringimpl(this.inkFaint) + ", danger=" + Color.m4398toStringimpl(this.danger) + ", dangerSoft=" + Color.m4398toStringimpl(this.dangerSoft) + ", warn=" + Color.m4398toStringimpl(this.warn) + ", warnSoft=" + Color.m4398toStringimpl(this.warnSoft) + ", info=" + Color.m4398toStringimpl(this.info) + ", infoSoft=" + Color.m4398toStringimpl(this.infoSoft) + ", ok=" + Color.m4398toStringimpl(this.ok) + ", onOk=" + Color.m4398toStringimpl(this.onOk) + ", scroll=" + Color.m4398toStringimpl(this.scroll) + ", scrollHover=" + Color.m4398toStringimpl(this.scrollHover) + ", mask=" + Color.m4398toStringimpl(this.mask) + ", glass=" + Color.m4398toStringimpl(this.glass) + ", glassStrong=" + Color.m4398toStringimpl(this.glassStrong) + ", glassBorder=" + Color.m4398toStringimpl(this.glassBorder) + ", shadow=" + Color.m4398toStringimpl(this.shadow) + ", banner=" + this.banner + ", onBanner=" + Color.m4398toStringimpl(this.onBanner) + ", logo=" + this.logo + ", onLogo=" + Color.m4398toStringimpl(this.onLogo) + ", pageWash=" + this.pageWash + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PyColors(boolean dark, long accent, long accentStrong, long onAccentStrong, long accentText, long accentTint, long accentDeep, long accentLite, long accentSoft, long accentSoft2, long onAccent, long canvas, long paper, long paper2, long side, long chrome, long line, long lineSoft, long hover, long pressed, long ink, long inkSoft, long inkMuted, long inkFaint, long danger, long dangerSoft, long warn, long warnSoft, long info, long infoSoft, long ok, long onOk, long scroll, long scrollHover, long mask, long glass, long glassStrong, long glassBorder, long shadow, List<Color> banner, long onBanner, List<Color> logo, long onLogo, List<Color> pageWash) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(pageWash, "pageWash");
        this.dark = dark;
        this.accent = accent;
        this.accentStrong = accentStrong;
        this.onAccentStrong = onAccentStrong;
        this.accentText = accentText;
        this.accentTint = accentTint;
        this.accentDeep = accentDeep;
        this.accentLite = accentLite;
        this.accentSoft = accentSoft;
        this.accentSoft2 = accentSoft2;
        this.onAccent = onAccent;
        this.canvas = canvas;
        this.paper = paper;
        this.paper2 = paper2;
        this.side = side;
        this.chrome = chrome;
        this.line = line;
        this.lineSoft = lineSoft;
        this.hover = hover;
        this.pressed = pressed;
        this.ink = ink;
        this.inkSoft = inkSoft;
        this.inkMuted = inkMuted;
        this.inkFaint = inkFaint;
        this.danger = danger;
        this.dangerSoft = dangerSoft;
        this.warn = warn;
        this.warnSoft = warnSoft;
        this.info = info;
        this.infoSoft = infoSoft;
        this.ok = ok;
        this.onOk = onOk;
        this.scroll = scroll;
        this.scrollHover = scrollHover;
        this.mask = mask;
        this.glass = glass;
        this.glassStrong = glassStrong;
        this.glassBorder = glassBorder;
        this.shadow = shadow;
        this.banner = banner;
        this.onBanner = onBanner;
        this.logo = logo;
        this.onLogo = onLogo;
        this.pageWash = pageWash;
    }

    public final boolean getDark() {
        return this.dark;
    }

    /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
    public final long m7949getAccent0d7_KjU() {
        return this.accent;
    }

    /* renamed from: getAccentStrong-0d7_KjU, reason: not valid java name */
    public final long m7954getAccentStrong0d7_KjU() {
        return this.accentStrong;
    }

    /* renamed from: getAccentText-0d7_KjU, reason: not valid java name */
    public final long m7955getAccentText0d7_KjU() {
        return this.accentText;
    }

    /* renamed from: getAccentTint-0d7_KjU, reason: not valid java name */
    public final long m7956getAccentTint0d7_KjU() {
        return this.accentTint;
    }

    /* renamed from: getOnAccentStrong-0d7_KjU, reason: not valid java name */
    public final long m7976getOnAccentStrong0d7_KjU() {
        return this.onAccentStrong;
    }

    /* renamed from: getAccentDeep-0d7_KjU, reason: not valid java name */
    public final long m7950getAccentDeep0d7_KjU() {
        return this.accentDeep;
    }

    /* renamed from: getAccentLite-0d7_KjU, reason: not valid java name */
    public final long m7951getAccentLite0d7_KjU() {
        return this.accentLite;
    }

    /* renamed from: getAccentSoft-0d7_KjU, reason: not valid java name */
    public final long m7952getAccentSoft0d7_KjU() {
        return this.accentSoft;
    }

    /* renamed from: getAccentSoft2-0d7_KjU, reason: not valid java name */
    public final long m7953getAccentSoft20d7_KjU() {
        return this.accentSoft2;
    }

    /* renamed from: getOnAccent-0d7_KjU, reason: not valid java name */
    public final long m7975getOnAccent0d7_KjU() {
        return this.onAccent;
    }

    /* renamed from: getCanvas-0d7_KjU, reason: not valid java name */
    public final long m7957getCanvas0d7_KjU() {
        return this.canvas;
    }

    /* renamed from: getChrome-0d7_KjU, reason: not valid java name */
    public final long m7958getChrome0d7_KjU() {
        return this.chrome;
    }

    /* renamed from: getPaper-0d7_KjU, reason: not valid java name */
    public final long m7980getPaper0d7_KjU() {
        return this.paper;
    }

    /* renamed from: getPaper2-0d7_KjU, reason: not valid java name */
    public final long m7981getPaper20d7_KjU() {
        return this.paper2;
    }

    /* renamed from: getSide-0d7_KjU, reason: not valid java name */
    public final long m7986getSide0d7_KjU() {
        return this.side;
    }

    /* renamed from: getHover-0d7_KjU, reason: not valid java name */
    public final long m7964getHover0d7_KjU() {
        return this.hover;
    }

    /* renamed from: getLine-0d7_KjU, reason: not valid java name */
    public final long m7971getLine0d7_KjU() {
        return this.line;
    }

    /* renamed from: getLineSoft-0d7_KjU, reason: not valid java name */
    public final long m7972getLineSoft0d7_KjU() {
        return this.lineSoft;
    }

    /* renamed from: getPressed-0d7_KjU, reason: not valid java name */
    public final long m7982getPressed0d7_KjU() {
        return this.pressed;
    }

    /* renamed from: getInk-0d7_KjU, reason: not valid java name */
    public final long m7967getInk0d7_KjU() {
        return this.ink;
    }

    /* renamed from: getInkFaint-0d7_KjU, reason: not valid java name */
    public final long m7968getInkFaint0d7_KjU() {
        return this.inkFaint;
    }

    /* renamed from: getInkMuted-0d7_KjU, reason: not valid java name */
    public final long m7969getInkMuted0d7_KjU() {
        return this.inkMuted;
    }

    /* renamed from: getInkSoft-0d7_KjU, reason: not valid java name */
    public final long m7970getInkSoft0d7_KjU() {
        return this.inkSoft;
    }

    /* renamed from: getDanger-0d7_KjU, reason: not valid java name */
    public final long m7959getDanger0d7_KjU() {
        return this.danger;
    }

    /* renamed from: getDangerSoft-0d7_KjU, reason: not valid java name */
    public final long m7960getDangerSoft0d7_KjU() {
        return this.dangerSoft;
    }

    /* renamed from: getInfo-0d7_KjU, reason: not valid java name */
    public final long m7965getInfo0d7_KjU() {
        return this.info;
    }

    /* renamed from: getInfoSoft-0d7_KjU, reason: not valid java name */
    public final long m7966getInfoSoft0d7_KjU() {
        return this.infoSoft;
    }

    /* renamed from: getWarn-0d7_KjU, reason: not valid java name */
    public final long m7987getWarn0d7_KjU() {
        return this.warn;
    }

    /* renamed from: getWarnSoft-0d7_KjU, reason: not valid java name */
    public final long m7988getWarnSoft0d7_KjU() {
        return this.warnSoft;
    }

    /* renamed from: getOk-0d7_KjU, reason: not valid java name */
    public final long m7974getOk0d7_KjU() {
        return this.ok;
    }

    /* renamed from: getOnOk-0d7_KjU, reason: not valid java name */
    public final long m7979getOnOk0d7_KjU() {
        return this.onOk;
    }

    /* renamed from: getScroll-0d7_KjU, reason: not valid java name */
    public final long m7983getScroll0d7_KjU() {
        return this.scroll;
    }

    /* renamed from: getScrollHover-0d7_KjU, reason: not valid java name */
    public final long m7984getScrollHover0d7_KjU() {
        return this.scrollHover;
    }

    /* renamed from: getGlass-0d7_KjU, reason: not valid java name */
    public final long m7961getGlass0d7_KjU() {
        return this.glass;
    }

    /* renamed from: getGlassBorder-0d7_KjU, reason: not valid java name */
    public final long m7962getGlassBorder0d7_KjU() {
        return this.glassBorder;
    }

    /* renamed from: getGlassStrong-0d7_KjU, reason: not valid java name */
    public final long m7963getGlassStrong0d7_KjU() {
        return this.glassStrong;
    }

    /* renamed from: getMask-0d7_KjU, reason: not valid java name */
    public final long m7973getMask0d7_KjU() {
        return this.mask;
    }

    /* renamed from: getShadow-0d7_KjU, reason: not valid java name */
    public final long m7985getShadow0d7_KjU() {
        return this.shadow;
    }

    public final List<Color> getBanner() {
        return this.banner;
    }

    public final List<Color> getLogo() {
        return this.logo;
    }

    /* renamed from: getOnBanner-0d7_KjU, reason: not valid java name */
    public final long m7977getOnBanner0d7_KjU() {
        return this.onBanner;
    }

    /* renamed from: getOnLogo-0d7_KjU, reason: not valid java name */
    public final long m7978getOnLogo0d7_KjU() {
        return this.onLogo;
    }

    public final List<Color> getPageWash() {
        return this.pageWash;
    }

    public final Brush getBannerBrush() {
        return Brush.INSTANCE.m4352linearGradientmHitzGk((Pair<Float, Color>[]) new Pair[]{TuplesKt.to(Float.valueOf(0.0f), this.banner.get(0)), TuplesKt.to(Float.valueOf(0.52f), this.banner.get(1)), TuplesKt.to(Float.valueOf(1.0f), this.banner.get(2))}, (8 & 2) != 0 ? Offset.INSTANCE.m4165getZeroF1C5BW0() : Offset.INSTANCE.m4165getZeroF1C5BW0(), (8 & 4) != 0 ? Offset.INSTANCE.m4163getInfiniteF1C5BW0() : Offset.INSTANCE.m4163getInfiniteF1C5BW0(), (8 & 8) != 0 ? TileMode.INSTANCE.m4764getClamp3opZhB0() : 0);
    }

    public final Brush getLogoBrush() {
        return Brush.INSTANCE.m4351linearGradientmHitzGk((List<Color>) this.logo, (8 & 2) != 0 ? Offset.INSTANCE.m4165getZeroF1C5BW0() : Offset.INSTANCE.m4165getZeroF1C5BW0(), (8 & 4) != 0 ? Offset.INSTANCE.m4163getInfiniteF1C5BW0() : Offset.INSTANCE.m4163getInfiniteF1C5BW0(), (8 & 8) != 0 ? TileMode.INSTANCE.m4764getClamp3opZhB0() : 0);
    }

    public final Brush getWashBrush() {
        return Brush.INSTANCE.m4352linearGradientmHitzGk((Pair<Float, Color>[]) new Pair[]{TuplesKt.to(Float.valueOf(0.0f), this.pageWash.get(0)), TuplesKt.to(Float.valueOf(0.55f), this.pageWash.get(1)), TuplesKt.to(Float.valueOf(1.0f), this.pageWash.get(2))}, (8 & 2) != 0 ? Offset.INSTANCE.m4165getZeroF1C5BW0() : Offset.INSTANCE.m4165getZeroF1C5BW0(), (8 & 4) != 0 ? Offset.INSTANCE.m4163getInfiniteF1C5BW0() : Offset.INSTANCE.m4163getInfiniteF1C5BW0(), (8 & 8) != 0 ? TileMode.INSTANCE.m4764getClamp3opZhB0() : 0);
    }
}
