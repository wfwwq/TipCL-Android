package org.lwjgl.system;

import android.R;
import androidx.collection.ScatterMapKt;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MathUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MathUtil.class */
public final class MathUtil {
    private MathUtil() {
    }

    public static boolean mathIsPoT(int value) {
        return Integer.bitCount(value) == 1;
    }

    public static int mathRoundPoT(int value) {
        return 1 << (32 - Integer.numberOfLeadingZeros(value - 1));
    }

    public static boolean mathHasZeroByte(int value) {
        return (((value - R.attr.cacheColorHint) & (value ^ (-1))) & (-2139062144)) != 0;
    }

    public static boolean mathHasZeroByte(long value) {
        return (((value - ScatterMapKt.BitmaskLsb) & (value ^ (-1))) & (-9187201950435737472L)) != 0;
    }

    public static boolean mathHasZeroShort(int value) {
        return (((value - 65537) & (value ^ (-1))) & (-2147450880)) != 0;
    }

    public static boolean mathHasZeroShort(long value) {
        return (((value - 281479271743489L) & (value ^ (-1))) & (-9223231297218904064L)) != 0;
    }
}
