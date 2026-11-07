package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/windows/WindowsLibrary.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/windows/WindowsLibrary.class */
public class WindowsLibrary extends SharedLibrary.Default {
    public static final long HINSTANCE;

    static {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer pi = stack.mallocInt(1);
            HINSTANCE = WinBase.GetModuleHandle(pi, stack.UTF16(Library.JNI_LIBRARY_NAME));
            if (HINSTANCE == 0) {
                WindowsUtil.windowsThrowException("Failed to retrieve LWJGL module handle.", pi);
            }
            if (stack != null) {
                stack.close();
            }
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

    public WindowsLibrary(String name) {
        this(name, loadLibrary(name));
    }

    public WindowsLibrary(String name, long handle) {
        super(name, handle);
    }

    private static long loadLibrary(String name) {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer pi = stack.mallocInt(1);
            long handle = WinBase.LoadLibrary(pi, stack.UTF16(name));
            if (handle == 0) {
                throw new UnsatisfiedLinkError("Failed to load library: " + name + " (error code = " + pi.get(0) + ")");
            }
            if (stack != null) {
                stack.close();
            }
            return handle;
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

    @Override // org.lwjgl.system.SharedLibrary
    public String getPath() {
        int maxLen = 256;
        ByteBuffer buffer = MemoryUtil.memAlloc(256);
        while (true) {
            try {
                MemoryStack stack = MemoryStack.stackPush();
                try {
                    IntBuffer pi = stack.mallocInt(1);
                    int len = WinBase.GetModuleFileName(pi, address(), buffer);
                    int err = pi.get(0);
                    if (stack != null) {
                        stack.close();
                    }
                    if (err == 0) {
                        String strMemUTF16 = len == 0 ? null : MemoryUtil.memUTF16(buffer, len);
                        return strMemUTF16;
                    }
                    if (err == 122) {
                        int i = (maxLen * 3) / 2;
                        maxLen = i;
                        buffer = MemoryUtil.memRealloc(buffer, i);
                    } else {
                        MemoryUtil.memFree(buffer);
                        return null;
                    }
                } finally {
                }
            } finally {
                MemoryUtil.memFree(buffer);
            }
        }
    }

    @Override // org.lwjgl.system.FunctionProvider
    public long getFunctionAddress(ByteBuffer functionName) {
        return WinBase.GetProcAddress((IntBuffer) null, address(), functionName);
    }

    @Override // org.lwjgl.system.NativeResource
    public void free() {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            IntBuffer pi = stack.mallocInt(1);
            if (!WinBase.FreeLibrary(pi, address())) {
                WindowsUtil.windowsThrowException("Failed to unload library: " + getName(), pi);
            }
            if (stack != null) {
                stack.close();
            }
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
