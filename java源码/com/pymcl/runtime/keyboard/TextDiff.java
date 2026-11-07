package com.pymcl.runtime.keyboard;

import com.pymcl.runtime.input.InputSink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: TouchCharInput.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/pymcl/runtime/keyboard/TextDiff;", "", "<init>", "()V", "FILLER_LEN", "", "FILLER", "", "getFILLER", "()Ljava/lang/String;", "diff", "Lcom/pymcl/runtime/keyboard/TextDiff$Result;", "old", "", "new", "apply", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "r", "Result", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TextDiff {
    public static final int FILLER_LEN = 30;
    public static final TextDiff INSTANCE = new TextDiff();
    private static final String FILLER = StringsKt.repeat(StringUtils.SPACE, 30);

    private TextDiff() {
    }

    public final String getFILLER() {
        return FILLER;
    }

    /* compiled from: TouchCharInput.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/pymcl/runtime/keyboard/TextDiff$Result;", "", "backspaces", "", "inserted", "", "<init>", "(ILjava/lang/String;)V", "getBackspaces", "()I", "getInserted", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Result {
        private final int backspaces;
        private final String inserted;

        public static /* synthetic */ Result copy$default(Result result, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = result.backspaces;
            }
            if ((i2 & 2) != 0) {
                str = result.inserted;
            }
            return result.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getBackspaces() {
            return this.backspaces;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInserted() {
            return this.inserted;
        }

        public final Result copy(int backspaces, String inserted) {
            Intrinsics.checkNotNullParameter(inserted, "inserted");
            return new Result(backspaces, inserted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.backspaces == result.backspaces && Intrinsics.areEqual(this.inserted, result.inserted);
        }

        public int hashCode() {
            return (Integer.hashCode(this.backspaces) * 31) + this.inserted.hashCode();
        }

        public String toString() {
            return "Result(backspaces=" + this.backspaces + ", inserted=" + this.inserted + ")";
        }

        public Result(int backspaces, String inserted) {
            Intrinsics.checkNotNullParameter(inserted, "inserted");
            this.backspaces = backspaces;
            this.inserted = inserted;
        }

        public final int getBackspaces() {
            return this.backspaces;
        }

        public final String getInserted() {
            return this.inserted;
        }
    }

    public final Result diff(CharSequence old, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(charSequence, "new");
        int p = 0;
        int n = Math.min(old.length(), charSequence.length());
        while (p < n && old.charAt(p) == charSequence.charAt(p)) {
            p++;
        }
        return new Result(old.length() - p, charSequence.subSequence(p, charSequence.length()).toString());
    }

    public final void apply(InputSink sink, Result r) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(r, "r");
        int backspaces = r.getBackspaces();
        for (int i = 0; i < backspaces; i++) {
            sink.tapKey(14);
        }
        List parts = StringsKt.split$default((CharSequence) r.getInserted(), new char[]{'\n'}, false, 0, 6, (Object) null);
        List $this$forEachIndexed$iv = parts;
        int i2 = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String seg = (String) item$iv;
            if (seg.length() > 0) {
                sink.text(seg);
            }
            if (i2 < parts.size() - 1) {
                sink.tapKey(28);
            }
            i2 = index$iv;
        }
    }
}
