package androidx.core.graphics;

import android.graphics.Rect;

/* loaded from: classes24.dex */
public final class Insets {
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;

    /* renamed from: top, reason: collision with root package name */
    public final int f114top;

    private Insets(int left, int top2, int right, int bottom) {
        this.left = left;
        this.f114top = top2;
        this.right = right;
        this.bottom = bottom;
    }

    public static Insets of(int left, int top2, int right, int bottom) {
        if (left == 0 && top2 == 0 && right == 0 && bottom == 0) {
            return NONE;
        }
        return new Insets(left, top2, right, bottom);
    }

    public static Insets of(Rect r) {
        return of(r.left, r.top, r.right, r.bottom);
    }

    public static Insets add(Insets a, Insets b) {
        return of(a.left + b.left, a.f114top + b.f114top, a.right + b.right, a.bottom + b.bottom);
    }

    public static Insets subtract(Insets a, Insets b) {
        return of(a.left - b.left, a.f114top - b.f114top, a.right - b.right, a.bottom - b.bottom);
    }

    public static Insets max(Insets a, Insets b) {
        return of(Math.max(a.left, b.left), Math.max(a.f114top, b.f114top), Math.max(a.right, b.right), Math.max(a.bottom, b.bottom));
    }

    public static Insets min(Insets a, Insets b) {
        return of(Math.min(a.left, b.left), Math.min(a.f114top, b.f114top), Math.min(a.right, b.right), Math.min(a.bottom, b.bottom));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Insets insets = (Insets) o;
        if (this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.f114top == insets.f114top) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.left;
        return (((((result * 31) + this.f114top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.f114top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    @Deprecated
    public static Insets wrap(android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.of(this.left, this.f114top, this.right, this.bottom);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.graphics.Insets of(int left, int top2, int right, int bottom) {
            return android.graphics.Insets.of(left, top2, right, bottom);
        }
    }
}
