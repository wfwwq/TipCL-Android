package org.lwjgl.system.linux;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/Socket.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/Socket.class */
public class Socket {
    public static final int SHUT_RD = 0;
    public static final int SHUT_WR = 1;
    public static final int SHUT_RDWR = 2;

    public static native int nsocket(long j, int i, int i2, int i3);

    static {
        Library.initialize();
    }

    protected Socket() {
        throw new UnsupportedOperationException();
    }

    public static int socket(@NativeType("int *") IntBuffer _errno, int __domain, int __type, int __protocol) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) _errno, 1);
        }
        return nsocket(MemoryUtil.memAddressSafe(_errno), __domain, __type, __protocol);
    }
}
