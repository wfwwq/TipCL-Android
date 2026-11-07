package org.lwjgl.util.vma;

import org.lwjgl.system.Callback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaCheckDefragmentationBreakFunction.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaCheckDefragmentationBreakFunction.class */
public abstract class VmaCheckDefragmentationBreakFunction extends Callback implements VmaCheckDefragmentationBreakFunctionI {
    public static VmaCheckDefragmentationBreakFunction create(long functionPointer) {
        VmaCheckDefragmentationBreakFunctionI instance = (VmaCheckDefragmentationBreakFunctionI) Callback.get(functionPointer);
        if (instance instanceof VmaCheckDefragmentationBreakFunction) {
            return (VmaCheckDefragmentationBreakFunction) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static VmaCheckDefragmentationBreakFunction createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static VmaCheckDefragmentationBreakFunction create(VmaCheckDefragmentationBreakFunctionI instance) {
        if (instance instanceof VmaCheckDefragmentationBreakFunction) {
            return (VmaCheckDefragmentationBreakFunction) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected VmaCheckDefragmentationBreakFunction() {
        super(DESCRIPTOR);
    }

    VmaCheckDefragmentationBreakFunction(long functionPointer) {
        super(functionPointer);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaCheckDefragmentationBreakFunction$Container.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaCheckDefragmentationBreakFunction$Container.class */
    private static final class Container extends VmaCheckDefragmentationBreakFunction {
        private final VmaCheckDefragmentationBreakFunctionI delegate;

        Container(long functionPointer, VmaCheckDefragmentationBreakFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.vma.VmaCheckDefragmentationBreakFunctionI
        public int invoke(long pUserData) {
            return this.delegate.invoke(pUserData);
        }
    }
}
