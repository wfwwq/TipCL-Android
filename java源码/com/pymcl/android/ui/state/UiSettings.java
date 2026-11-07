package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.lwjgl.nanovg.OUI;
import org.lwjgl.util.shaderc.SPV;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0003\bª\u0001\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B£\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0007\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0005\u0012\b\b\u0002\u0010,\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\b\u0002\u0010/\u001a\u00020\u0007\u0012\b\b\u0002\u00100\u001a\u00020\u0005\u0012\b\b\u0002\u00101\u001a\u00020\u0007\u0012\b\b\u0002\u00102\u001a\u00020\u0005\u0012\b\b\u0002\u00103\u001a\u00020\u0005\u0012\b\b\u0002\u00104\u001a\u00020\u0005\u0012\b\b\u0002\u00105\u001a\u00020\u0007\u0012\b\b\u0002\u00106\u001a\u00020\u0003\u0012\b\b\u0002\u00107\u001a\u00020\u0007\u0012\b\b\u0002\u00108\u001a\u00020\u0007\u0012\b\b\u0002\u00109\u001a\u00020\u0005\u0012\b\b\u0002\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0007HÆ\u0003J\t\u0010y\u001a\u00020\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0005HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J¦\u0004\u0010¬\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u0003HÆ\u0001J\u0016\u0010\u00ad\u0001\u001a\u00020\u00032\t\u0010®\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\u000b\u0010¯\u0001\u001a\u00020\u0005HÖ\u0081\u0004J\u000b\u0010°\u0001\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010>R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010>R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010>R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010@R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010>R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010@R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u0010BR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u0010BR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010>R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010@R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010@R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010@R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010@R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u0010@R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010@R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010>R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u0010@R\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bY\u0010BR\u0011\u0010\u001f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010BR\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010@R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010@R\u0011\u0010#\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b^\u0010BR\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010@R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010@R\u0011\u0010'\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bb\u0010BR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010>R\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010>R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010>R\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010@R\u0011\u0010,\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010BR\u0011\u0010-\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bh\u0010BR\u0011\u0010.\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bi\u0010BR\u0011\u0010/\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bj\u0010BR\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010@R\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bl\u0010BR\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bm\u0010@R\u0011\u00103\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bn\u0010@R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bo\u0010@R\u0011\u00105\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bp\u0010BR\u0011\u00106\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010>R\u0011\u00107\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\br\u0010BR\u0011\u00108\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bs\u0010BR\u0011\u00109\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bt\u0010@R\u0011\u0010:\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010>Ê\u0001\u000e\b²\u0001\u0012\t\b³\u0001\u0012\u0004\b\u0003\u0010\u0002¨\u0006±\u0001"}, d2 = {"Lcom/pymcl/android/ui/state/UiSettings;", "", "dark", "", "accentIndex", "", "customAccent", "", "background", "windowRadius", "squareCards", "cardRadius", "motion", "flyAnimation", "flyDurationMs", "sidebarFrost", "navStyle", "wallpaperPath", "wallpaperFolder", "wallpaperRandom", "wallpaperInterval", "wallpaperBlur", "wallpaperMask", "surfaceOpacity", "threads", "chunks", "fileSource", "communitySource", "systemProxy", "speedLimit", "curseforgeKey", "gameDir", "memoryMb", "width", "height", "defaultInstance", "isolation", "gc", "windowMode", "jvmArgs", "allowMulti", "sharedLibraries", "sharedAssets", "aiMode", "aiGateway", "aiEndpoint", "aiKey", "aiModel", "aiContext", "aiFallback", "aiPermission", "visibility", "homepage", "customHomepage", "autoUpdate", "updateUrl", "msClientId", "language", "firstRun", "<init>", "(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZ)V", "getDark", "()Z", "getAccentIndex", "()I", "getCustomAccent", "()Ljava/lang/String;", "getBackground", "getWindowRadius", "getSquareCards", "getCardRadius", "getMotion", "getFlyAnimation", "getFlyDurationMs", "getSidebarFrost", "getNavStyle", "getWallpaperPath", "getWallpaperFolder", "getWallpaperRandom", "getWallpaperInterval", "getWallpaperBlur", "getWallpaperMask", "getSurfaceOpacity", "getThreads", "getChunks", "getFileSource", "getCommunitySource", "getSystemProxy", "getSpeedLimit", "getCurseforgeKey", "getGameDir", "getMemoryMb", "getWidth", "getHeight", "getDefaultInstance", "getIsolation", "getGc", "getWindowMode", "getJvmArgs", "getAllowMulti", "getSharedLibraries", "getSharedAssets", "getAiMode", "getAiGateway", "getAiEndpoint", "getAiKey", "getAiModel", "getAiContext", "getAiFallback", "getAiPermission", "getVisibility", "getHomepage", "getCustomHomepage", "getAutoUpdate", "getUpdateUrl", "getMsClientId", "getLanguage", "getFirstRun", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class UiSettings {
    public static final int $stable = 0;
    private final int accentIndex;
    private final int aiContext;
    private final String aiEndpoint;
    private final String aiFallback;
    private final String aiGateway;
    private final String aiKey;
    private final int aiMode;
    private final String aiModel;
    private final int aiPermission;
    private final boolean allowMulti;
    private final boolean autoUpdate;
    private final int background;
    private final int cardRadius;
    private final int chunks;
    private final int communitySource;
    private final String curseforgeKey;
    private final String customAccent;
    private final String customHomepage;
    private final boolean dark;
    private final String defaultInstance;
    private final int fileSource;
    private final boolean firstRun;
    private final boolean flyAnimation;
    private final int flyDurationMs;
    private final String gameDir;
    private final int gc;
    private final int height;
    private final int homepage;
    private final int isolation;
    private final String jvmArgs;
    private final int language;
    private final int memoryMb;
    private final boolean motion;
    private final String msClientId;
    private final int navStyle;
    private final boolean sharedAssets;
    private final boolean sharedLibraries;
    private final boolean sidebarFrost;
    private final int speedLimit;
    private final boolean squareCards;
    private final int surfaceOpacity;
    private final boolean systemProxy;
    private final int threads;
    private final String updateUrl;
    private final int visibility;
    private final int wallpaperBlur;
    private final String wallpaperFolder;
    private final int wallpaperInterval;
    private final int wallpaperMask;
    private final String wallpaperPath;
    private final boolean wallpaperRandom;
    private final int width;
    private final int windowMode;
    private final int windowRadius;

    public UiSettings() {
        this(false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, SPV.kDefaultMaxIdBound, null);
    }

    public static /* synthetic */ UiSettings copy$default(UiSettings uiSettings, boolean z, int i, String str, int i2, int i3, boolean z2, int i4, boolean z3, boolean z4, int i5, boolean z5, int i6, String str2, String str3, boolean z6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, int i15, String str4, String str5, int i16, int i17, int i18, String str6, int i19, int i20, int i21, String str7, boolean z8, boolean z9, boolean z10, int i22, String str8, String str9, String str10, String str11, int i23, String str12, int i24, int i25, int i26, String str13, boolean z11, String str14, String str15, int i27, boolean z12, int i28, int i29, Object obj) {
        boolean z13 = (i28 & 1) != 0 ? uiSettings.dark : z;
        return uiSettings.copy(z13, (i28 & 2) != 0 ? uiSettings.accentIndex : i, (i28 & 4) != 0 ? uiSettings.customAccent : str, (i28 & 8) != 0 ? uiSettings.background : i2, (i28 & 16) != 0 ? uiSettings.windowRadius : i3, (i28 & 32) != 0 ? uiSettings.squareCards : z2, (i28 & 64) != 0 ? uiSettings.cardRadius : i4, (i28 & 128) != 0 ? uiSettings.motion : z3, (i28 & 256) != 0 ? uiSettings.flyAnimation : z4, (i28 & 512) != 0 ? uiSettings.flyDurationMs : i5, (i28 & 1024) != 0 ? uiSettings.sidebarFrost : z5, (i28 & 2048) != 0 ? uiSettings.navStyle : i6, (i28 & 4096) != 0 ? uiSettings.wallpaperPath : str2, (i28 & 8192) != 0 ? uiSettings.wallpaperFolder : str3, (i28 & 16384) != 0 ? uiSettings.wallpaperRandom : z6, (i28 & 32768) != 0 ? uiSettings.wallpaperInterval : i7, (i28 & 65536) != 0 ? uiSettings.wallpaperBlur : i8, (i28 & 131072) != 0 ? uiSettings.wallpaperMask : i9, (i28 & 262144) != 0 ? uiSettings.surfaceOpacity : i10, (i28 & 524288) != 0 ? uiSettings.threads : i11, (i28 & 1048576) != 0 ? uiSettings.chunks : i12, (i28 & 2097152) != 0 ? uiSettings.fileSource : i13, (i28 & 4194304) != 0 ? uiSettings.communitySource : i14, (i28 & 8388608) != 0 ? uiSettings.systemProxy : z7, (i28 & 16777216) != 0 ? uiSettings.speedLimit : i15, (i28 & 33554432) != 0 ? uiSettings.curseforgeKey : str4, (i28 & 67108864) != 0 ? uiSettings.gameDir : str5, (i28 & 134217728) != 0 ? uiSettings.memoryMb : i16, (i28 & 268435456) != 0 ? uiSettings.width : i17, (i28 & 536870912) != 0 ? uiSettings.height : i18, (i28 & 1073741824) != 0 ? uiSettings.defaultInstance : str6, (i28 & Integer.MIN_VALUE) != 0 ? uiSettings.isolation : i19, (i29 & 1) != 0 ? uiSettings.gc : i20, (i29 & 2) != 0 ? uiSettings.windowMode : i21, (i29 & 4) != 0 ? uiSettings.jvmArgs : str7, (i29 & 8) != 0 ? uiSettings.allowMulti : z8, (i29 & 16) != 0 ? uiSettings.sharedLibraries : z9, (i29 & 32) != 0 ? uiSettings.sharedAssets : z10, (i29 & 64) != 0 ? uiSettings.aiMode : i22, (i29 & 128) != 0 ? uiSettings.aiGateway : str8, (i29 & 256) != 0 ? uiSettings.aiEndpoint : str9, (i29 & 512) != 0 ? uiSettings.aiKey : str10, (i29 & 1024) != 0 ? uiSettings.aiModel : str11, (i29 & 2048) != 0 ? uiSettings.aiContext : i23, (i29 & 4096) != 0 ? uiSettings.aiFallback : str12, (i29 & 8192) != 0 ? uiSettings.aiPermission : i24, (i29 & 16384) != 0 ? uiSettings.visibility : i25, (i29 & 32768) != 0 ? uiSettings.homepage : i26, (i29 & 65536) != 0 ? uiSettings.customHomepage : str13, (i29 & 131072) != 0 ? uiSettings.autoUpdate : z11, (i29 & 262144) != 0 ? uiSettings.updateUrl : str14, (i29 & 524288) != 0 ? uiSettings.msClientId : str15, (i29 & 1048576) != 0 ? uiSettings.language : i27, (i29 & 2097152) != 0 ? uiSettings.firstRun : z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDark() {
        return this.dark;
    }

    /* renamed from: component10, reason: from getter */
    public final int getFlyDurationMs() {
        return this.flyDurationMs;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getSidebarFrost() {
        return this.sidebarFrost;
    }

    /* renamed from: component12, reason: from getter */
    public final int getNavStyle() {
        return this.navStyle;
    }

    /* renamed from: component13, reason: from getter */
    public final String getWallpaperPath() {
        return this.wallpaperPath;
    }

    /* renamed from: component14, reason: from getter */
    public final String getWallpaperFolder() {
        return this.wallpaperFolder;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getWallpaperRandom() {
        return this.wallpaperRandom;
    }

    /* renamed from: component16, reason: from getter */
    public final int getWallpaperInterval() {
        return this.wallpaperInterval;
    }

    /* renamed from: component17, reason: from getter */
    public final int getWallpaperBlur() {
        return this.wallpaperBlur;
    }

    /* renamed from: component18, reason: from getter */
    public final int getWallpaperMask() {
        return this.wallpaperMask;
    }

    /* renamed from: component19, reason: from getter */
    public final int getSurfaceOpacity() {
        return this.surfaceOpacity;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAccentIndex() {
        return this.accentIndex;
    }

    /* renamed from: component20, reason: from getter */
    public final int getThreads() {
        return this.threads;
    }

    /* renamed from: component21, reason: from getter */
    public final int getChunks() {
        return this.chunks;
    }

    /* renamed from: component22, reason: from getter */
    public final int getFileSource() {
        return this.fileSource;
    }

    /* renamed from: component23, reason: from getter */
    public final int getCommunitySource() {
        return this.communitySource;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getSystemProxy() {
        return this.systemProxy;
    }

    /* renamed from: component25, reason: from getter */
    public final int getSpeedLimit() {
        return this.speedLimit;
    }

    /* renamed from: component26, reason: from getter */
    public final String getCurseforgeKey() {
        return this.curseforgeKey;
    }

    /* renamed from: component27, reason: from getter */
    public final String getGameDir() {
        return this.gameDir;
    }

    /* renamed from: component28, reason: from getter */
    public final int getMemoryMb() {
        return this.memoryMb;
    }

    /* renamed from: component29, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCustomAccent() {
        return this.customAccent;
    }

    /* renamed from: component30, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component31, reason: from getter */
    public final String getDefaultInstance() {
        return this.defaultInstance;
    }

    /* renamed from: component32, reason: from getter */
    public final int getIsolation() {
        return this.isolation;
    }

    /* renamed from: component33, reason: from getter */
    public final int getGc() {
        return this.gc;
    }

    /* renamed from: component34, reason: from getter */
    public final int getWindowMode() {
        return this.windowMode;
    }

    /* renamed from: component35, reason: from getter */
    public final String getJvmArgs() {
        return this.jvmArgs;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getAllowMulti() {
        return this.allowMulti;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getSharedLibraries() {
        return this.sharedLibraries;
    }

    /* renamed from: component38, reason: from getter */
    public final boolean getSharedAssets() {
        return this.sharedAssets;
    }

    /* renamed from: component39, reason: from getter */
    public final int getAiMode() {
        return this.aiMode;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBackground() {
        return this.background;
    }

    /* renamed from: component40, reason: from getter */
    public final String getAiGateway() {
        return this.aiGateway;
    }

    /* renamed from: component41, reason: from getter */
    public final String getAiEndpoint() {
        return this.aiEndpoint;
    }

    /* renamed from: component42, reason: from getter */
    public final String getAiKey() {
        return this.aiKey;
    }

    /* renamed from: component43, reason: from getter */
    public final String getAiModel() {
        return this.aiModel;
    }

    /* renamed from: component44, reason: from getter */
    public final int getAiContext() {
        return this.aiContext;
    }

    /* renamed from: component45, reason: from getter */
    public final String getAiFallback() {
        return this.aiFallback;
    }

    /* renamed from: component46, reason: from getter */
    public final int getAiPermission() {
        return this.aiPermission;
    }

    /* renamed from: component47, reason: from getter */
    public final int getVisibility() {
        return this.visibility;
    }

    /* renamed from: component48, reason: from getter */
    public final int getHomepage() {
        return this.homepage;
    }

    /* renamed from: component49, reason: from getter */
    public final String getCustomHomepage() {
        return this.customHomepage;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWindowRadius() {
        return this.windowRadius;
    }

    /* renamed from: component50, reason: from getter */
    public final boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    /* renamed from: component51, reason: from getter */
    public final String getUpdateUrl() {
        return this.updateUrl;
    }

    /* renamed from: component52, reason: from getter */
    public final String getMsClientId() {
        return this.msClientId;
    }

    /* renamed from: component53, reason: from getter */
    public final int getLanguage() {
        return this.language;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getFirstRun() {
        return this.firstRun;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSquareCards() {
        return this.squareCards;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCardRadius() {
        return this.cardRadius;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getMotion() {
        return this.motion;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getFlyAnimation() {
        return this.flyAnimation;
    }

    public final UiSettings copy(boolean dark, int accentIndex, String customAccent, int background, int windowRadius, boolean squareCards, int cardRadius, boolean motion, boolean flyAnimation, int flyDurationMs, boolean sidebarFrost, int navStyle, String wallpaperPath, String wallpaperFolder, boolean wallpaperRandom, int wallpaperInterval, int wallpaperBlur, int wallpaperMask, int surfaceOpacity, int threads, int chunks, int fileSource, int communitySource, boolean systemProxy, int speedLimit, String curseforgeKey, String gameDir, int memoryMb, int width, int height, String defaultInstance, int isolation, int gc, int windowMode, String jvmArgs, boolean allowMulti, boolean sharedLibraries, boolean sharedAssets, int aiMode, String aiGateway, String aiEndpoint, String aiKey, String aiModel, int aiContext, String aiFallback, int aiPermission, int visibility, int homepage, String customHomepage, boolean autoUpdate, String updateUrl, String msClientId, int language, boolean firstRun) {
        Intrinsics.checkNotNullParameter(customAccent, "customAccent");
        Intrinsics.checkNotNullParameter(wallpaperPath, "wallpaperPath");
        Intrinsics.checkNotNullParameter(wallpaperFolder, "wallpaperFolder");
        Intrinsics.checkNotNullParameter(curseforgeKey, "curseforgeKey");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(defaultInstance, "defaultInstance");
        Intrinsics.checkNotNullParameter(jvmArgs, "jvmArgs");
        Intrinsics.checkNotNullParameter(aiGateway, "aiGateway");
        Intrinsics.checkNotNullParameter(aiEndpoint, "aiEndpoint");
        Intrinsics.checkNotNullParameter(aiKey, "aiKey");
        Intrinsics.checkNotNullParameter(aiModel, "aiModel");
        Intrinsics.checkNotNullParameter(aiFallback, "aiFallback");
        Intrinsics.checkNotNullParameter(customHomepage, "customHomepage");
        Intrinsics.checkNotNullParameter(updateUrl, "updateUrl");
        Intrinsics.checkNotNullParameter(msClientId, "msClientId");
        return new UiSettings(dark, accentIndex, customAccent, background, windowRadius, squareCards, cardRadius, motion, flyAnimation, flyDurationMs, sidebarFrost, navStyle, wallpaperPath, wallpaperFolder, wallpaperRandom, wallpaperInterval, wallpaperBlur, wallpaperMask, surfaceOpacity, threads, chunks, fileSource, communitySource, systemProxy, speedLimit, curseforgeKey, gameDir, memoryMb, width, height, defaultInstance, isolation, gc, windowMode, jvmArgs, allowMulti, sharedLibraries, sharedAssets, aiMode, aiGateway, aiEndpoint, aiKey, aiModel, aiContext, aiFallback, aiPermission, visibility, homepage, customHomepage, autoUpdate, updateUrl, msClientId, language, firstRun);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiSettings)) {
            return false;
        }
        UiSettings uiSettings = (UiSettings) other;
        return this.dark == uiSettings.dark && this.accentIndex == uiSettings.accentIndex && Intrinsics.areEqual(this.customAccent, uiSettings.customAccent) && this.background == uiSettings.background && this.windowRadius == uiSettings.windowRadius && this.squareCards == uiSettings.squareCards && this.cardRadius == uiSettings.cardRadius && this.motion == uiSettings.motion && this.flyAnimation == uiSettings.flyAnimation && this.flyDurationMs == uiSettings.flyDurationMs && this.sidebarFrost == uiSettings.sidebarFrost && this.navStyle == uiSettings.navStyle && Intrinsics.areEqual(this.wallpaperPath, uiSettings.wallpaperPath) && Intrinsics.areEqual(this.wallpaperFolder, uiSettings.wallpaperFolder) && this.wallpaperRandom == uiSettings.wallpaperRandom && this.wallpaperInterval == uiSettings.wallpaperInterval && this.wallpaperBlur == uiSettings.wallpaperBlur && this.wallpaperMask == uiSettings.wallpaperMask && this.surfaceOpacity == uiSettings.surfaceOpacity && this.threads == uiSettings.threads && this.chunks == uiSettings.chunks && this.fileSource == uiSettings.fileSource && this.communitySource == uiSettings.communitySource && this.systemProxy == uiSettings.systemProxy && this.speedLimit == uiSettings.speedLimit && Intrinsics.areEqual(this.curseforgeKey, uiSettings.curseforgeKey) && Intrinsics.areEqual(this.gameDir, uiSettings.gameDir) && this.memoryMb == uiSettings.memoryMb && this.width == uiSettings.width && this.height == uiSettings.height && Intrinsics.areEqual(this.defaultInstance, uiSettings.defaultInstance) && this.isolation == uiSettings.isolation && this.gc == uiSettings.gc && this.windowMode == uiSettings.windowMode && Intrinsics.areEqual(this.jvmArgs, uiSettings.jvmArgs) && this.allowMulti == uiSettings.allowMulti && this.sharedLibraries == uiSettings.sharedLibraries && this.sharedAssets == uiSettings.sharedAssets && this.aiMode == uiSettings.aiMode && Intrinsics.areEqual(this.aiGateway, uiSettings.aiGateway) && Intrinsics.areEqual(this.aiEndpoint, uiSettings.aiEndpoint) && Intrinsics.areEqual(this.aiKey, uiSettings.aiKey) && Intrinsics.areEqual(this.aiModel, uiSettings.aiModel) && this.aiContext == uiSettings.aiContext && Intrinsics.areEqual(this.aiFallback, uiSettings.aiFallback) && this.aiPermission == uiSettings.aiPermission && this.visibility == uiSettings.visibility && this.homepage == uiSettings.homepage && Intrinsics.areEqual(this.customHomepage, uiSettings.customHomepage) && this.autoUpdate == uiSettings.autoUpdate && Intrinsics.areEqual(this.updateUrl, uiSettings.updateUrl) && Intrinsics.areEqual(this.msClientId, uiSettings.msClientId) && this.language == uiSettings.language && this.firstRun == uiSettings.firstRun;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.dark) * 31) + Integer.hashCode(this.accentIndex)) * 31) + this.customAccent.hashCode()) * 31) + Integer.hashCode(this.background)) * 31) + Integer.hashCode(this.windowRadius)) * 31) + Boolean.hashCode(this.squareCards)) * 31) + Integer.hashCode(this.cardRadius)) * 31) + Boolean.hashCode(this.motion)) * 31) + Boolean.hashCode(this.flyAnimation)) * 31) + Integer.hashCode(this.flyDurationMs)) * 31) + Boolean.hashCode(this.sidebarFrost)) * 31) + Integer.hashCode(this.navStyle)) * 31) + this.wallpaperPath.hashCode()) * 31) + this.wallpaperFolder.hashCode()) * 31) + Boolean.hashCode(this.wallpaperRandom)) * 31) + Integer.hashCode(this.wallpaperInterval)) * 31) + Integer.hashCode(this.wallpaperBlur)) * 31) + Integer.hashCode(this.wallpaperMask)) * 31) + Integer.hashCode(this.surfaceOpacity)) * 31) + Integer.hashCode(this.threads)) * 31) + Integer.hashCode(this.chunks)) * 31) + Integer.hashCode(this.fileSource)) * 31) + Integer.hashCode(this.communitySource)) * 31) + Boolean.hashCode(this.systemProxy)) * 31) + Integer.hashCode(this.speedLimit)) * 31) + this.curseforgeKey.hashCode()) * 31) + this.gameDir.hashCode()) * 31) + Integer.hashCode(this.memoryMb)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.defaultInstance.hashCode()) * 31) + Integer.hashCode(this.isolation)) * 31) + Integer.hashCode(this.gc)) * 31) + Integer.hashCode(this.windowMode)) * 31) + this.jvmArgs.hashCode()) * 31) + Boolean.hashCode(this.allowMulti)) * 31) + Boolean.hashCode(this.sharedLibraries)) * 31) + Boolean.hashCode(this.sharedAssets)) * 31) + Integer.hashCode(this.aiMode)) * 31) + this.aiGateway.hashCode()) * 31) + this.aiEndpoint.hashCode()) * 31) + this.aiKey.hashCode()) * 31) + this.aiModel.hashCode()) * 31) + Integer.hashCode(this.aiContext)) * 31) + this.aiFallback.hashCode()) * 31) + Integer.hashCode(this.aiPermission)) * 31) + Integer.hashCode(this.visibility)) * 31) + Integer.hashCode(this.homepage)) * 31) + this.customHomepage.hashCode()) * 31) + Boolean.hashCode(this.autoUpdate)) * 31) + this.updateUrl.hashCode()) * 31) + this.msClientId.hashCode()) * 31) + Integer.hashCode(this.language)) * 31) + Boolean.hashCode(this.firstRun);
    }

    public String toString() {
        return "UiSettings(dark=" + this.dark + ", accentIndex=" + this.accentIndex + ", customAccent=" + this.customAccent + ", background=" + this.background + ", windowRadius=" + this.windowRadius + ", squareCards=" + this.squareCards + ", cardRadius=" + this.cardRadius + ", motion=" + this.motion + ", flyAnimation=" + this.flyAnimation + ", flyDurationMs=" + this.flyDurationMs + ", sidebarFrost=" + this.sidebarFrost + ", navStyle=" + this.navStyle + ", wallpaperPath=" + this.wallpaperPath + ", wallpaperFolder=" + this.wallpaperFolder + ", wallpaperRandom=" + this.wallpaperRandom + ", wallpaperInterval=" + this.wallpaperInterval + ", wallpaperBlur=" + this.wallpaperBlur + ", wallpaperMask=" + this.wallpaperMask + ", surfaceOpacity=" + this.surfaceOpacity + ", threads=" + this.threads + ", chunks=" + this.chunks + ", fileSource=" + this.fileSource + ", communitySource=" + this.communitySource + ", systemProxy=" + this.systemProxy + ", speedLimit=" + this.speedLimit + ", curseforgeKey=" + this.curseforgeKey + ", gameDir=" + this.gameDir + ", memoryMb=" + this.memoryMb + ", width=" + this.width + ", height=" + this.height + ", defaultInstance=" + this.defaultInstance + ", isolation=" + this.isolation + ", gc=" + this.gc + ", windowMode=" + this.windowMode + ", jvmArgs=" + this.jvmArgs + ", allowMulti=" + this.allowMulti + ", sharedLibraries=" + this.sharedLibraries + ", sharedAssets=" + this.sharedAssets + ", aiMode=" + this.aiMode + ", aiGateway=" + this.aiGateway + ", aiEndpoint=" + this.aiEndpoint + ", aiKey=" + this.aiKey + ", aiModel=" + this.aiModel + ", aiContext=" + this.aiContext + ", aiFallback=" + this.aiFallback + ", aiPermission=" + this.aiPermission + ", visibility=" + this.visibility + ", homepage=" + this.homepage + ", customHomepage=" + this.customHomepage + ", autoUpdate=" + this.autoUpdate + ", updateUrl=" + this.updateUrl + ", msClientId=" + this.msClientId + ", language=" + this.language + ", firstRun=" + this.firstRun + ")";
    }

    public UiSettings(boolean dark, int accentIndex, String customAccent, int background, int windowRadius, boolean squareCards, int cardRadius, boolean motion, boolean flyAnimation, int flyDurationMs, boolean sidebarFrost, int navStyle, String wallpaperPath, String wallpaperFolder, boolean wallpaperRandom, int wallpaperInterval, int wallpaperBlur, int wallpaperMask, int surfaceOpacity, int threads, int chunks, int fileSource, int communitySource, boolean systemProxy, int speedLimit, String curseforgeKey, String gameDir, int memoryMb, int width, int height, String defaultInstance, int isolation, int gc, int windowMode, String jvmArgs, boolean allowMulti, boolean sharedLibraries, boolean sharedAssets, int aiMode, String aiGateway, String aiEndpoint, String aiKey, String aiModel, int aiContext, String aiFallback, int aiPermission, int visibility, int homepage, String customHomepage, boolean autoUpdate, String updateUrl, String msClientId, int language, boolean firstRun) {
        Intrinsics.checkNotNullParameter(customAccent, "customAccent");
        Intrinsics.checkNotNullParameter(wallpaperPath, "wallpaperPath");
        Intrinsics.checkNotNullParameter(wallpaperFolder, "wallpaperFolder");
        Intrinsics.checkNotNullParameter(curseforgeKey, "curseforgeKey");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(defaultInstance, "defaultInstance");
        Intrinsics.checkNotNullParameter(jvmArgs, "jvmArgs");
        Intrinsics.checkNotNullParameter(aiGateway, "aiGateway");
        Intrinsics.checkNotNullParameter(aiEndpoint, "aiEndpoint");
        Intrinsics.checkNotNullParameter(aiKey, "aiKey");
        Intrinsics.checkNotNullParameter(aiModel, "aiModel");
        Intrinsics.checkNotNullParameter(aiFallback, "aiFallback");
        Intrinsics.checkNotNullParameter(customHomepage, "customHomepage");
        Intrinsics.checkNotNullParameter(updateUrl, "updateUrl");
        Intrinsics.checkNotNullParameter(msClientId, "msClientId");
        this.dark = dark;
        this.accentIndex = accentIndex;
        this.customAccent = customAccent;
        this.background = background;
        this.windowRadius = windowRadius;
        this.squareCards = squareCards;
        this.cardRadius = cardRadius;
        this.motion = motion;
        this.flyAnimation = flyAnimation;
        this.flyDurationMs = flyDurationMs;
        this.sidebarFrost = sidebarFrost;
        this.navStyle = navStyle;
        this.wallpaperPath = wallpaperPath;
        this.wallpaperFolder = wallpaperFolder;
        this.wallpaperRandom = wallpaperRandom;
        this.wallpaperInterval = wallpaperInterval;
        this.wallpaperBlur = wallpaperBlur;
        this.wallpaperMask = wallpaperMask;
        this.surfaceOpacity = surfaceOpacity;
        this.threads = threads;
        this.chunks = chunks;
        this.fileSource = fileSource;
        this.communitySource = communitySource;
        this.systemProxy = systemProxy;
        this.speedLimit = speedLimit;
        this.curseforgeKey = curseforgeKey;
        this.gameDir = gameDir;
        this.memoryMb = memoryMb;
        this.width = width;
        this.height = height;
        this.defaultInstance = defaultInstance;
        this.isolation = isolation;
        this.gc = gc;
        this.windowMode = windowMode;
        this.jvmArgs = jvmArgs;
        this.allowMulti = allowMulti;
        this.sharedLibraries = sharedLibraries;
        this.sharedAssets = sharedAssets;
        this.aiMode = aiMode;
        this.aiGateway = aiGateway;
        this.aiEndpoint = aiEndpoint;
        this.aiKey = aiKey;
        this.aiModel = aiModel;
        this.aiContext = aiContext;
        this.aiFallback = aiFallback;
        this.aiPermission = aiPermission;
        this.visibility = visibility;
        this.homepage = homepage;
        this.customHomepage = customHomepage;
        this.autoUpdate = autoUpdate;
        this.updateUrl = updateUrl;
        this.msClientId = msClientId;
        this.language = language;
        this.firstRun = firstRun;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UiSettings(boolean z, int i, String str, int i2, int i3, boolean z2, int i4, boolean z3, boolean z4, int i5, boolean z5, int i6, String str2, String str3, boolean z6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7, int i15, String str4, String str5, int i16, int i17, int i18, String str6, int i19, int i20, int i21, String str7, boolean z8, boolean z9, boolean z10, int i22, String str8, String str9, String str10, String str11, int i23, String str12, int i24, int i25, int i26, String str13, boolean z11, String str14, String str15, int i27, boolean z12, int i28, int i29, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z13 = (i28 & 1) != 0 ? false : z;
        int i30 = (i28 & 2) != 0 ? 0 : i;
        String str16 = (i28 & 4) != 0 ? "" : str;
        int i31 = (i28 & 8) != 0 ? 0 : i2;
        int i32 = (i28 & 16) != 0 ? 10 : i3;
        boolean z14 = (i28 & 32) != 0 ? false : z2;
        int i33 = (i28 & 64) != 0 ? 12 : i4;
        boolean z15 = (i28 & 128) != 0 ? true : z3;
        boolean z16 = (i28 & 256) != 0 ? true : z4;
        int i34 = (i28 & 512) != 0 ? 620 : i5;
        boolean z17 = (i28 & 1024) != 0 ? true : z5;
        int i35 = (i28 & 2048) != 0 ? 0 : i6;
        String str17 = (i28 & 4096) != 0 ? "" : str2;
        boolean z18 = z13;
        String str18 = (i28 & 8192) != 0 ? "" : str3;
        boolean z19 = (i28 & 16384) != 0 ? false : z6;
        int i36 = (i28 & 32768) != 0 ? 10 : i7;
        int i37 = (i28 & 65536) != 0 ? 0 : i8;
        int i38 = (i28 & 131072) != 0 ? 30 : i9;
        int i39 = (i28 & 262144) != 0 ? 100 : i10;
        int i40 = (i28 & 524288) != 0 ? 8 : i11;
        int i41 = (i28 & 1048576) != 0 ? 4 : i12;
        int i42 = (i28 & 2097152) != 0 ? 0 : i13;
        int i43 = (i28 & 4194304) != 0 ? 0 : i14;
        boolean z20 = (i28 & 8388608) != 0 ? true : z7;
        int i44 = (i28 & 16777216) != 0 ? 0 : i15;
        String str19 = (i28 & 33554432) != 0 ? "" : str4;
        String str20 = (i28 & 67108864) != 0 ? "/storage/emulated/0/Android/data/com.pymcl.android/files/.minecraft" : str5;
        int i45 = (i28 & 134217728) != 0 ? 2048 : i16;
        int i46 = (i28 & 268435456) != 0 ? 854 : i17;
        int i47 = (i28 & 536870912) != 0 ? OUI.UI_FILL : i18;
        String str21 = (i28 & 1073741824) != 0 ? "默认" : str6;
        int i48 = (i28 & Integer.MIN_VALUE) != 0 ? 0 : i19;
        int i49 = (i29 & 1) != 0 ? 0 : i20;
        int i50 = (i29 & 2) != 0 ? 0 : i21;
        String str22 = (i29 & 4) != 0 ? "" : str7;
        boolean z21 = (i29 & 8) != 0 ? false : z8;
        boolean z22 = (i29 & 16) != 0 ? true : z9;
        boolean z23 = (i29 & 32) != 0 ? true : z10;
        int i51 = (i29 & 64) != 0 ? 0 : i22;
        int i52 = i48;
        String str23 = (i29 & 128) != 0 ? "" : str8;
        this(z18, i30, str16, i31, i32, z14, i33, z15, z16, i34, z17, i35, str17, str18, z19, i36, i37, i38, i39, i40, i41, i42, i43, z20, i44, str19, str20, i45, i46, i47, str21, i52, i49, i50, str22, z21, z22, z23, i51, str23, (i29 & 256) != 0 ? "" : str9, (i29 & 512) != 0 ? "" : str10, (i29 & 1024) != 0 ? "" : str11, (i29 & 2048) != 0 ? 128000 : i23, (i29 & 4096) != 0 ? "" : str12, (i29 & 8192) != 0 ? 0 : i24, (i29 & 16384) != 0 ? 0 : i25, (i29 & 32768) != 0 ? 0 : i26, (i29 & 65536) != 0 ? "" : str13, (i29 & 131072) != 0 ? true : z11, (i29 & 262144) != 0 ? "" : str14, (i29 & 524288) == 0 ? str15 : "", (i29 & 1048576) != 0 ? 0 : i27, (i29 & 2097152) != 0 ? true : z12);
    }

    public final int getAccentIndex() {
        return this.accentIndex;
    }

    public final int getBackground() {
        return this.background;
    }

    public final String getCustomAccent() {
        return this.customAccent;
    }

    public final boolean getDark() {
        return this.dark;
    }

    public final int getCardRadius() {
        return this.cardRadius;
    }

    public final boolean getSquareCards() {
        return this.squareCards;
    }

    public final int getWindowRadius() {
        return this.windowRadius;
    }

    public final boolean getFlyAnimation() {
        return this.flyAnimation;
    }

    public final int getFlyDurationMs() {
        return this.flyDurationMs;
    }

    public final boolean getMotion() {
        return this.motion;
    }

    public final int getNavStyle() {
        return this.navStyle;
    }

    public final boolean getSidebarFrost() {
        return this.sidebarFrost;
    }

    public final String getWallpaperFolder() {
        return this.wallpaperFolder;
    }

    public final int getWallpaperInterval() {
        return this.wallpaperInterval;
    }

    public final String getWallpaperPath() {
        return this.wallpaperPath;
    }

    public final boolean getWallpaperRandom() {
        return this.wallpaperRandom;
    }

    public final int getSurfaceOpacity() {
        return this.surfaceOpacity;
    }

    public final int getWallpaperBlur() {
        return this.wallpaperBlur;
    }

    public final int getWallpaperMask() {
        return this.wallpaperMask;
    }

    public final int getChunks() {
        return this.chunks;
    }

    public final int getCommunitySource() {
        return this.communitySource;
    }

    public final int getFileSource() {
        return this.fileSource;
    }

    public final boolean getSystemProxy() {
        return this.systemProxy;
    }

    public final int getThreads() {
        return this.threads;
    }

    public final String getCurseforgeKey() {
        return this.curseforgeKey;
    }

    public final int getSpeedLimit() {
        return this.speedLimit;
    }

    public final String getGameDir() {
        return this.gameDir;
    }

    public final int getMemoryMb() {
        return this.memoryMb;
    }

    public final String getDefaultInstance() {
        return this.defaultInstance;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getIsolation() {
        return this.isolation;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean getAllowMulti() {
        return this.allowMulti;
    }

    public final int getGc() {
        return this.gc;
    }

    public final String getJvmArgs() {
        return this.jvmArgs;
    }

    public final int getWindowMode() {
        return this.windowMode;
    }

    public final boolean getSharedAssets() {
        return this.sharedAssets;
    }

    public final boolean getSharedLibraries() {
        return this.sharedLibraries;
    }

    public final String getAiEndpoint() {
        return this.aiEndpoint;
    }

    public final String getAiGateway() {
        return this.aiGateway;
    }

    public final String getAiKey() {
        return this.aiKey;
    }

    public final int getAiMode() {
        return this.aiMode;
    }

    public final String getAiModel() {
        return this.aiModel;
    }

    public final int getAiContext() {
        return this.aiContext;
    }

    public final String getAiFallback() {
        return this.aiFallback;
    }

    public final int getAiPermission() {
        return this.aiPermission;
    }

    public final boolean getAutoUpdate() {
        return this.autoUpdate;
    }

    public final String getCustomHomepage() {
        return this.customHomepage;
    }

    public final int getHomepage() {
        return this.homepage;
    }

    public final int getVisibility() {
        return this.visibility;
    }

    public final int getLanguage() {
        return this.language;
    }

    public final String getMsClientId() {
        return this.msClientId;
    }

    public final String getUpdateUrl() {
        return this.updateUrl;
    }

    public final boolean getFirstRun() {
        return this.firstRun;
    }
}
