package com.tungsten.fclauncher;

import dalvik.annotation.optimization.CriticalNative;

/* loaded from: classes6.dex */
public class CriticalNativeTest {
    @CriticalNative
    public static native void testCriticalNative(int i, int i2);

    public static void invokeTest() {
        testCriticalNative(0, 0);
    }
}
