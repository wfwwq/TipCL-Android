package com.pymcl.ai;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: Sse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/ai/SseParser;", "", "onData", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "buf", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "has", "", "feed", "line", "flush", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SseParser {
    private final StringBuilder buf;
    private boolean has;
    private final Function1<String, Unit> onData;

    /* JADX WARN: Multi-variable type inference failed */
    public SseParser(Function1<? super String, Unit> onData) {
        Intrinsics.checkNotNullParameter(onData, "onData");
        this.onData = onData;
        this.buf = new StringBuilder();
    }

    public final void feed(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        String l = StringsKt.removeSuffix(line, (CharSequence) StringUtils.CR);
        if (!(l.length() == 0)) {
            if (!StringsKt.startsWith$default(l, ":", false, 2, (Object) null)) {
                if (StringsKt.startsWith$default(l, "data:", false, 2, (Object) null)) {
                    if (this.has) {
                        this.buf.append('\n');
                    }
                    this.buf.append(StringsKt.removePrefix(StringsKt.removePrefix(l, (CharSequence) "data:"), (CharSequence) StringUtils.SPACE));
                    this.has = true;
                    return;
                }
                if (!StringsKt.startsWith$default(l, "{", false, 2, (Object) null) || this.has) {
                    return;
                }
                this.onData.invoke(l);
                return;
            }
            return;
        }
        flush();
    }

    public final void flush() {
        if (this.has) {
            String s = this.buf.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            this.buf.setLength(0);
            this.has = false;
            this.onData.invoke(s);
        }
    }
}
