package top.fifthlight.touchcontroller.proxy.message.input;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;", "", "start", "", "length", "<init>", "(II)V", "(I)V", "getStart", "()I", "getLength", "end", "getEnd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextRange EMPTY = new TextRange(0, 0);
    private final int length;
    private final int start;

    public static /* synthetic */ TextRange copy$default(TextRange textRange, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = textRange.start;
        }
        if ((i3 & 2) != 0) {
            i2 = textRange.length;
        }
        return textRange.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    public final TextRange copy(int start, int length) {
        return new TextRange(start, length);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextRange)) {
            return false;
        }
        TextRange textRange = (TextRange) other;
        return this.start == textRange.start && this.length == textRange.length;
    }

    public int hashCode() {
        return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.length);
    }

    public String toString() {
        return "TextRange(start=" + this.start + ", length=" + this.length + ')';
    }

    public TextRange(int start, int length) {
        this.start = start;
        this.length = length;
        if (!(this.start >= 0)) {
            throw new IllegalArgumentException(("Start of TextRange should not be negative: " + this.start).toString());
        }
        if (this.length >= 0) {
        } else {
            throw new IllegalArgumentException(("Length of TextRange should not be negative: " + this.length).toString());
        }
    }

    public final int getStart() {
        return this.start;
    }

    public final int getLength() {
        return this.length;
    }

    public TextRange(int start) {
        this(start, 0);
    }

    public final int getEnd() {
        return this.start + this.length;
    }

    /* compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;", "", "<init>", "()V", "EMPTY", "Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;", "getEMPTY", "()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextRange getEMPTY() {
            return TextRange.EMPTY;
        }
    }
}
