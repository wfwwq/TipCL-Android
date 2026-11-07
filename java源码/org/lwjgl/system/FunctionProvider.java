package org.lwjgl.system;

import java.nio.ByteBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/FunctionProvider.class
 */
@FunctionalInterface
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/FunctionProvider.class */
public interface FunctionProvider {
    long getFunctionAddress(ByteBuffer byteBuffer);

    default long getFunctionAddress(CharSequence functionName) {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            long functionAddress = getFunctionAddress(stack.ASCII(functionName));
            if (stack != null) {
                stack.close();
            }
            return functionAddress;
        } catch (Throwable th) {
            if (stack != null) {
                try {
                    stack.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
