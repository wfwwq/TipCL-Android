package org.lwjgl.util.vma;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocateDeviceMemoryFunction.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocateDeviceMemoryFunction.class */
public abstract class VmaAllocateDeviceMemoryFunction extends Callback implements VmaAllocateDeviceMemoryFunctionI {
    public static VmaAllocateDeviceMemoryFunction create(long functionPointer) {
        VmaAllocateDeviceMemoryFunctionI instance = (VmaAllocateDeviceMemoryFunctionI) Callback.get(functionPointer);
        if (instance instanceof VmaAllocateDeviceMemoryFunction) {
            return (VmaAllocateDeviceMemoryFunction) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VmaAllocateDeviceMemoryFunction createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VmaAllocateDeviceMemoryFunction create(VmaAllocateDeviceMemoryFunctionI instance) {
        if (instance instanceof VmaAllocateDeviceMemoryFunction) {
            return (VmaAllocateDeviceMemoryFunction) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VmaAllocateDeviceMemoryFunction() {
        super(DESCRIPTOR);
    }

    VmaAllocateDeviceMemoryFunction(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocateDeviceMemoryFunction$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocateDeviceMemoryFunction$Container.class */
    private static final class Container extends VmaAllocateDeviceMemoryFunction {
        private final VmaAllocateDeviceMemoryFunctionI delegate;

        Container(long functionPointer, VmaAllocateDeviceMemoryFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.vma.VmaAllocateDeviceMemoryFunctionI
        public void invoke(long allocator, int memoryType, long memory, long size, long pUserData) {
            this.delegate.invoke(allocator, memoryType, memory, size, pUserData);
        }
    }
}
