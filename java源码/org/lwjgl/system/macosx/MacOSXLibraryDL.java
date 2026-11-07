package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.SharedLibraryUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/MacOSXLibraryDL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/MacOSXLibraryDL.class */
public class MacOSXLibraryDL extends MacOSXLibrary {
    public MacOSXLibraryDL(String name) {
        this(name, loadLibrary(name));
    }

    public MacOSXLibraryDL(String name, long handle) {
        super(name, handle);
    }

    private static long loadLibrary(String name) {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            long handle = DynamicLinkLoader.dlopen(stack.UTF8(name), 9);
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
