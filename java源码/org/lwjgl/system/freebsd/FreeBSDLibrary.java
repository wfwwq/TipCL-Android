package org.lwjgl.system.freebsd;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.SharedLibraryUtil;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/freebsd/FreeBSDLibrary.class */
public class FreeBSDLibrary extends SharedLibrary.Default {
    public FreeBSDLibrary(String name) {
        this(name, loadLibrary(name));
    }

    public FreeBSDLibrary(String name, long handle) {
        super(name, handle);
    }

    private static long loadLibrary(String name) {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            long handle = DynamicLinkLoader.dlopen(stack.UTF8(name), 1);
            if (stack != null) {
                stack.close();
            }
            if (handle == 0) {
                throw new UnsatisfiedLinkError("Failed to dynamically load library: " + name + "(error = " + DynamicLinkLoader.dlerror() + ")");
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
        return SharedLibraryUtil.getLibraryPath(address());
    }

    @Override // org.lwjgl.system.FunctionProvider
    public long getFunctionAddress(ByteBuffer functionName) {
        return DynamicLinkLoader.dlsym(address(), functionName);
    }

    @Override // org.lwjgl.system.NativeResource
    public void free() {
        DynamicLinkLoader.dlclose(address());
    }
}
