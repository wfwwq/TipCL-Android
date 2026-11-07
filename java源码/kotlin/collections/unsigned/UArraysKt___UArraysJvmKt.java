package kotlin.collections.unsigned;

import androidx.autofill.HintConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: _UArraysJvm.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000b¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u0000\u001a\u00020\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0000\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000b¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0000\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000b¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019*\u00020\u0002H\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0019*\u00020\rH\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019*\u00020\u0011H\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019*\u00020\u0015H\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b \u0010!\u001aC\u0010\"\u001a\u00020\u0004*\u00020\u00022\u0006\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b&\u0010'\u001aC\u0010\"\u001a\u00020\u0004*\u00020\r2\u0006\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b(\u0010)\u001aC\u0010\"\u001a\u00020\u0004*\u00020\u00112\u0006\u0010#\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b*\u0010+\u001aC\u0010\"\u001a\u00020\u0004*\u00020\u00152\u0006\u0010#\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0087\u0080\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b,\u0010-\u001aw\u0010.\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b/\u00100\u001aw\u0010.\u001a\u0004\u0018\u00010\f*\u00020\rH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b@\u0010A\u001aw\u0010.\u001a\u0004\u0018\u00010\u0010*\u00020\u0011H\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bB\u0010C\u001aw\u0010.\u001a\u0004\u0018\u00010\u0014*\u00020\u0015H\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bD\u0010E\u001a¢\u0001\u0010F\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\u00022\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(M\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(N\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001a¢\u0001\u0010F\u001a\u0004\u0018\u00010\f\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\r2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(M\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(N\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a¢\u0001\u0010F\u001a\u0004\u0018\u00010\u0010\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\u00112\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(M\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(N\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a¢\u0001\u0010F\u001a\u0004\u0018\u00010\u0014\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\u00152\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(M\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(N\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u0093\u0001\u0010U\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Wj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b([\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(\\\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bY\u0010Z\u001a\u0093\u0001\u0010U\u001a\u0004\u0018\u00010\f*\u00020\r2\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\f0Wj\n\u0012\u0006\b\u0000\u0012\u00020\f`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b([\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(\\\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b]\u0010^\u001a\u0093\u0001\u0010U\u001a\u0004\u0018\u00010\u0010*\u00020\u00112\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00100Wj\n\u0012\u0006\b\u0000\u0012\u00020\u0010`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b([\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(\\\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\b_\u0010`\u001a\u0093\u0001\u0010U\u001a\u0004\u0018\u00010\u0014*\u00020\u00152\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00140Wj\n\u0012\u0006\b\u0000\u0012\u00020\u0014`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b([\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(\\\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\ba\u0010b\u001aw\u0010c\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(e\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(f\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bd\u00100\u001aw\u0010c\u001a\u0004\u0018\u00010\f*\u00020\rH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(e\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(f\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bg\u0010A\u001aw\u0010c\u001a\u0004\u0018\u00010\u0010*\u00020\u0011H\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(e\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(f\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bh\u0010C\u001aw\u0010c\u001a\u0004\u0018\u00010\u0014*\u00020\u0015H\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(e\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(f\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bi\u0010E\u001a¢\u0001\u0010j\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\u00022\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(l\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(m\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bk\u0010L\u001a¢\u0001\u0010j\u001a\u0004\u0018\u00010\f\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\r2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(l\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(m\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bn\u0010P\u001a¢\u0001\u0010j\u001a\u0004\u0018\u00010\u0010\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\u00112\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(l\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(m\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bo\u0010R\u001a¢\u0001\u0010j\u001a\u0004\u0018\u00010\u0014\"\u000e\b\u0000\u0010G*\b\u0012\u0004\u0012\u0002HG0H*\u00020\u00152\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002HG0JH\u0087\u0088\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(l\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(m\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bp\u0010T\u001a\u0093\u0001\u0010q\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Wj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(s\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(t\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\br\u0010Z\u001a\u0093\u0001\u0010q\u001a\u0004\u0018\u00010\f*\u00020\r2\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\f0Wj\n\u0012\u0006\b\u0000\u0012\u00020\f`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(s\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(t\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bu\u0010^\u001a\u0093\u0001\u0010q\u001a\u0004\u0018\u00010\u0010*\u00020\u00112\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00100Wj\n\u0012\u0006\b\u0000\u0012\u00020\u0010`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(s\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(t\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bv\u0010`\u001a\u0093\u0001\u0010q\u001a\u0004\u0018\u00010\u0014*\u00020\u00152\u001a\u0010V\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00140Wj\n\u0012\u0006\b\u0000\u0012\u00020\u0014`XH\u0087\u0080\u0004b*\b1\u0012\b\b2\u0012\u0004\b\b(s\u0012\u001c\b4\u0012\u0018\b\u000bB\u0014\b5\u0012\b\b6\u0012\u0004\b\b(t\u0012\u0006\b8\u0012\u0002\b\fb \b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\b\b<\u0012\u0004\b\b(=\u0012\b\b>\u0012\u0004\b\b(?b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tb\u0002\b\n¢\u0006\u0004\bw\u0010b\u001aT\u0010x\u001a\u00020y*\u00020\u00022\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020y0JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\f\b}\u0012\b\b~\u0012\u0004\b\b(zb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bz\u0010{\u001aT\u0010x\u001a\u00020y*\u00020\r2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020y0JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\f\b}\u0012\b\b~\u0012\u0004\b\b(zb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\bz\u0010\u007f\u001aU\u0010x\u001a\u00020y*\u00020\u00112\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020y0JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\f\b}\u0012\b\b~\u0012\u0004\b\b(zb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0005\bz\u0010\u0080\u0001\u001aU\u0010x\u001a\u00020y*\u00020\u00152\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020y0JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\f\b}\u0012\b\b~\u0012\u0004\b\b(zb\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0005\bz\u0010\u0081\u0001\u001aY\u0010x\u001a\u00030\u0082\u0001*\u00020\u00022\u0013\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0005\u0012\u00030\u0082\u00010JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001b\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001aY\u0010x\u001a\u00030\u0082\u0001*\u00020\r2\u0013\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u0082\u00010JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001b\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0085\u0001\u001aY\u0010x\u001a\u00030\u0082\u0001*\u00020\u00112\u0013\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0005\u0012\u00030\u0082\u00010JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001b\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0086\u0001\u001aY\u0010x\u001a\u00030\u0082\u0001*\u00020\u00152\u0013\u0010I\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0005\u0012\u00030\u0082\u00010JH\u0087\u0088\u0004b\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(;b\u0002\b|b\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001b\u0002\b\nb\u0002\b\u000bø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0087\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0088\u0001"}, d2 = {"elementAt", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "index", "", "elementAt-qFRl0hI", "([II)I", "Lkotlin/SinceKotlin;", "version", "1.3", "Lkotlin/ExperimentalUnsignedTypes;", "Lkotlin/internal/InlineOnly;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "elementAt-r7IrZao", "([JI)J", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "elementAt-PpDY95g", "([BI)B", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "elementAt-nggk6HY", "([SI)S", "asList", "", "asList--ajY-9A", "([I)Ljava/util/List;", "asList-QwZRm1k", "([J)Ljava/util/List;", "asList-GBYM_sE", "([B)Ljava/util/List;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "element", "fromIndex", "toIndex", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-EtDCXyQ", "([SSII)I", "max", "max--ajY-9A", "([I)Lkotlin/UInt;", "Lkotlin/Deprecated;", "message", "Use maxOrNull instead.", "replaceWith", "Lkotlin/ReplaceWith;", "expression", "this.maxOrNull()", "imports", "Lkotlin/DeprecatedSinceKotlin;", "warningSince", "1.4", "errorSince", "1.5", "hiddenSince", "1.6", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "Use maxByOrNull instead.", "this.maxByOrNull(selector)", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "Use maxWithOrNull instead.", "this.maxWithOrNull(comparator)", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min--ajY-9A", "Use minOrNull instead.", "this.minOrNull()", "min-QwZRm1k", "min-GBYM_sE", "min-rL5Bavg", "minBy", "minBy-jgv0xPQ", "Use minByOrNull instead.", "this.minByOrNull(selector)", "minBy-MShoTSo", "minBy-JOV_ifY", "minBy-xTcfx_M", "minWith", "minWith-YmdZ_VM", "Use minWithOrNull instead.", "this.minWithOrNull(comparator)", "minWith-zrEWJaI", "minWith-XMRcp5o", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Lkotlin/OverloadResolutionByLambdaReturnType;", "Lkotlin/jvm/JvmName;", HintConstants.AUTOFILL_HINT_NAME, "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: classes24.dex */
class UArraysKt___UArraysJvmKt {
    /* renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m8602elementAtqFRl0hI(int[] elementAt, int index) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UIntArray.m8271getpVg5ArA(elementAt, index);
    }

    /* renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m8603elementAtr7IrZao(long[] elementAt, int index) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return ULongArray.m8350getsVKNKU(elementAt, index);
    }

    /* renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m8600elementAtPpDY95g(byte[] elementAt, int index) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UByteArray.m8192getw2LRezQ(elementAt, index);
    }

    /* renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m8601elementAtnggk6HY(short[] elementAt, int index) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UShortArray.m8455getMh2AYeg(elementAt, index);
    }

    /* renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<UInt> m8588asListajY9A(int[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m8590asListQwZRm1k(long[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    /* renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m8589asListGBYM_sE(byte[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    /* renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m8591asListrL5Bavg(short[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    /* renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m8593binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m8272getSizeimpl(iArr);
        }
        return UArraysKt.m8592binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    /* renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m8592binarySearch2fe2U9s(int[] binarySearch, int element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UIntArray.m8272getSizeimpl(binarySearch));
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = binarySearch[mid];
            int cmp = UnsignedKt.uintCompare(midVal, element);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m8597binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m8351getSizeimpl(jArr);
        }
        return UArraysKt.m8596binarySearchK6DWlUc(jArr, j, i, i2);
    }

    /* renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m8596binarySearchK6DWlUc(long[] binarySearch, long element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, ULongArray.m8351getSizeimpl(binarySearch));
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = binarySearch[mid];
            int cmp = UnsignedKt.ulongCompare(midVal, element);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m8599binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m8193getSizeimpl(bArr);
        }
        return UArraysKt.m8598binarySearchWpHrYlw(bArr, b, i, i2);
    }

    /* renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m8598binarySearchWpHrYlw(byte[] binarySearch, byte element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UByteArray.m8193getSizeimpl(binarySearch));
        int signedElement = element & UByte.MAX_VALUE;
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = binarySearch[mid];
            int cmp = UnsignedKt.uintCompare(midVal, signedElement);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m8595binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m8456getSizeimpl(sArr);
        }
        return UArraysKt.m8594binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    /* renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m8594binarySearchEtDCXyQ(short[] binarySearch, short element, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, UShortArray.m8456getSizeimpl(binarySearch));
        int signedElement = 65535 & element;
        int low = fromIndex;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = binarySearch[mid];
            int cmp = UnsignedKt.uintCompare(midVal, signedElement);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m8604maxajY9A(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m8999maxOrNullajY9A(max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m8606maxQwZRm1k(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m9001maxOrNullQwZRm1k(max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m8605maxGBYM_sE(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m9000maxOrNullGBYM_sE(max);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m8607maxrL5Bavg(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m9002maxOrNullrL5Bavg(max);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m8610maxByjgv0xPQ(int[] maxBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m8274isEmptyimpl(maxBy)) {
            return null;
        }
        int iM8271getpVg5ArA = UIntArray.m8271getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UInt.m8205boximpl(iM8271getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int iM8271getpVg5ArA2 = UIntArray.m8271getpVg5ArA(maxBy, i);
                    R rInvoke2 = selector.invoke(UInt.m8205boximpl(iM8271getpVg5ArA2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        iM8271getpVg5ArA = iM8271getpVg5ArA2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UInt.m8205boximpl(iM8271getpVg5ArA);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m8609maxByMShoTSo(long[] maxBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m8353isEmptyimpl(maxBy)) {
            return null;
        }
        long jM8350getsVKNKU = ULongArray.m8350getsVKNKU(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(ULong.m8284boximpl(jM8350getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM8350getsVKNKU2 = ULongArray.m8350getsVKNKU(maxBy, i);
                    R rInvoke2 = selector.invoke(ULong.m8284boximpl(jM8350getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        jM8350getsVKNKU = jM8350getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ULong.m8284boximpl(jM8350getsVKNKU);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m8608maxByJOV_ifY(byte[] maxBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m8195isEmptyimpl(maxBy)) {
            return null;
        }
        byte bM8192getw2LRezQ = UByteArray.m8192getw2LRezQ(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UByte.m8128boximpl(bM8192getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM8192getw2LRezQ2 = UByteArray.m8192getw2LRezQ(maxBy, i);
                    R rInvoke2 = selector.invoke(UByte.m8128boximpl(bM8192getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        bM8192getw2LRezQ = bM8192getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UByte.m8128boximpl(bM8192getw2LRezQ);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m8611maxByxTcfx_M(short[] maxBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m8458isEmptyimpl(maxBy)) {
            return null;
        }
        short sM8455getMh2AYeg = UShortArray.m8455getMh2AYeg(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UShort.m8391boximpl(sM8455getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM8455getMh2AYeg2 = UShortArray.m8455getMh2AYeg(maxBy, i);
                    R rInvoke2 = selector.invoke(UShort.m8391boximpl(sM8455getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        sM8455getMh2AYeg = sM8455getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UShort.m8391boximpl(sM8455getMh2AYeg);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m8613maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9008maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m8615maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9010maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m8612maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9007maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m8614maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9009maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m8616minajY9A(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9055minOrNullajY9A(min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m8618minQwZRm1k(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9057minOrNullQwZRm1k(min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m8617minGBYM_sE(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9056minOrNullGBYM_sE(min);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m8619minrL5Bavg(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9058minOrNullrL5Bavg(min);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m8622minByjgv0xPQ(int[] minBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m8274isEmptyimpl(minBy)) {
            return null;
        }
        int iM8271getpVg5ArA = UIntArray.m8271getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UInt.m8205boximpl(iM8271getpVg5ArA));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int iM8271getpVg5ArA2 = UIntArray.m8271getpVg5ArA(minBy, i);
                    R rInvoke2 = selector.invoke(UInt.m8205boximpl(iM8271getpVg5ArA2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        iM8271getpVg5ArA = iM8271getpVg5ArA2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UInt.m8205boximpl(iM8271getpVg5ArA);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m8621minByMShoTSo(long[] minBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m8353isEmptyimpl(minBy)) {
            return null;
        }
        long jM8350getsVKNKU = ULongArray.m8350getsVKNKU(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(ULong.m8284boximpl(jM8350getsVKNKU));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long jM8350getsVKNKU2 = ULongArray.m8350getsVKNKU(minBy, i);
                    R rInvoke2 = selector.invoke(ULong.m8284boximpl(jM8350getsVKNKU2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        jM8350getsVKNKU = jM8350getsVKNKU2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ULong.m8284boximpl(jM8350getsVKNKU);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m8620minByJOV_ifY(byte[] minBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m8195isEmptyimpl(minBy)) {
            return null;
        }
        byte bM8192getw2LRezQ = UByteArray.m8192getw2LRezQ(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UByte.m8128boximpl(bM8192getw2LRezQ));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte bM8192getw2LRezQ2 = UByteArray.m8192getw2LRezQ(minBy, i);
                    R rInvoke2 = selector.invoke(UByte.m8128boximpl(bM8192getw2LRezQ2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        bM8192getw2LRezQ = bM8192getw2LRezQ2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UByte.m8128boximpl(bM8192getw2LRezQ);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m8623minByxTcfx_M(short[] minBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m8458isEmptyimpl(minBy)) {
            return null;
        }
        short sM8455getMh2AYeg = UShortArray.m8455getMh2AYeg(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UShort.m8391boximpl(sM8455getMh2AYeg));
            int i = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short sM8455getMh2AYeg2 = UShortArray.m8455getMh2AYeg(minBy, i);
                    R rInvoke2 = selector.invoke(UShort.m8391boximpl(sM8455getMh2AYeg2));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        sM8455getMh2AYeg = sM8455getMh2AYeg2;
                        rInvoke = rInvoke2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        return UShort.m8391boximpl(sM8455getMh2AYeg);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m8625minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9064minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m8627minWithzrEWJaI(long[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9066minWithOrNullzrEWJaI(minWith, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m8624minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9063minWithOrNullXMRcp5o(minWith, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m8626minWitheOHTfZs(short[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9065minWithOrNulleOHTfZs(minWith, comparator);
    }

    private static final BigDecimal sumOfBigDecimal(int[] sumOf, Function1<? super UInt, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal sum = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8272getSizeimpl = UIntArray.m8272getSizeimpl(sumOf);
        for (int i = 0; i < iM8272getSizeimpl; i++) {
            int element = UIntArray.m8271getpVg5ArA(sumOf, i);
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(UInt.m8205boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    private static final BigDecimal sumOfBigDecimal(long[] sumOf, Function1<? super ULong, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal sum = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8351getSizeimpl = ULongArray.m8351getSizeimpl(sumOf);
        for (int i = 0; i < iM8351getSizeimpl; i++) {
            long element = ULongArray.m8350getsVKNKU(sumOf, i);
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(ULong.m8284boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    private static final BigDecimal sumOfBigDecimal(byte[] sumOf, Function1<? super UByte, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal sum = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8193getSizeimpl = UByteArray.m8193getSizeimpl(sumOf);
        for (int i = 0; i < iM8193getSizeimpl; i++) {
            byte element = UByteArray.m8192getw2LRezQ(sumOf, i);
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(UByte.m8128boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    private static final BigDecimal sumOfBigDecimal(short[] sumOf, Function1<? super UShort, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal sum = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8456getSizeimpl = UShortArray.m8456getSizeimpl(sumOf);
        for (int i = 0; i < iM8456getSizeimpl; i++) {
            short element = UShortArray.m8455getMh2AYeg(sumOf, i);
            BigDecimal bigDecimalAdd = sum.add(selector.invoke(UShort.m8391boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            sum = bigDecimalAdd;
        }
        return sum;
    }

    private static final BigInteger sumOfBigInteger(int[] sumOf, Function1<? super UInt, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger sum = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8272getSizeimpl = UIntArray.m8272getSizeimpl(sumOf);
        for (int i = 0; i < iM8272getSizeimpl; i++) {
            int element = UIntArray.m8271getpVg5ArA(sumOf, i);
            BigInteger bigIntegerAdd = sum.add(selector.invoke(UInt.m8205boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    private static final BigInteger sumOfBigInteger(long[] sumOf, Function1<? super ULong, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger sum = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8351getSizeimpl = ULongArray.m8351getSizeimpl(sumOf);
        for (int i = 0; i < iM8351getSizeimpl; i++) {
            long element = ULongArray.m8350getsVKNKU(sumOf, i);
            BigInteger bigIntegerAdd = sum.add(selector.invoke(ULong.m8284boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    private static final BigInteger sumOfBigInteger(byte[] sumOf, Function1<? super UByte, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger sum = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8193getSizeimpl = UByteArray.m8193getSizeimpl(sumOf);
        for (int i = 0; i < iM8193getSizeimpl; i++) {
            byte element = UByteArray.m8192getw2LRezQ(sumOf, i);
            BigInteger bigIntegerAdd = sum.add(selector.invoke(UByte.m8128boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }

    private static final BigInteger sumOfBigInteger(short[] sumOf, Function1<? super UShort, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger sum = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(sum, "valueOf(...)");
        int iM8456getSizeimpl = UShortArray.m8456getSizeimpl(sumOf);
        for (int i = 0; i < iM8456getSizeimpl; i++) {
            short element = UShortArray.m8455getMh2AYeg(sumOf, i);
            BigInteger bigIntegerAdd = sum.add(selector.invoke(UShort.m8391boximpl(element)));
            Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
            sum = bigIntegerAdd;
        }
        return sum;
    }
}
