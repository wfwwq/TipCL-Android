package org.lwjgl.util.vma;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction.class */
public abstract class VmaFreeDeviceMemoryFunction extends Callback implements VmaFreeDeviceMemoryFunctionI {
    public static VmaFreeDeviceMemoryFunction create(long functionPointer) {
        VmaFreeDeviceMemoryFunctionI instance = (VmaFreeDeviceMemoryFunctionI) Callback.get(functionPointer);
        if (instance instanceof VmaFreeDeviceMemoryFunction) {
            return (VmaFreeDeviceMemoryFunction) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VmaFreeDeviceMemoryFunction createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VmaFreeDeviceMemoryFunction create(VmaFreeDeviceMemoryFunctionI instance) {
        if (instance instanceof VmaFreeDeviceMemoryFunction) {
            return (VmaFreeDeviceMemoryFunction) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VmaFreeDeviceMemoryFunction() {
        super(DESCRIPTOR);
    }

    VmaFreeDeviceMemoryFunction(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaFreeDeviceMemoryFunction$Container.class */
    private static final class Container extends VmaFreeDeviceMemoryFunction {
        private final VmaFreeDeviceMemoryFunctionI delegate;

        Container(long functionPointer, VmaFreeDeviceMemoryFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.vma.VmaFreeDeviceMemoryFunctionI
        public void invoke(long allocator, int memoryType, long memory, long size, long pUserData) {
            this.delegate.invoke(allocator, memoryType, memory, size, pUserData);
        }
    }
}
