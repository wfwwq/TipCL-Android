package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLFreeIncludeResultFunc.class */
public abstract class GLSLFreeIncludeResultFunc extends Callback implements GLSLFreeIncludeResultFuncI {
    public static GLSLFreeIncludeResultFunc create(long functionPointer) {
        GLSLFreeIncludeResultFuncI instance = (GLSLFreeIncludeResultFuncI) Callback.get(functionPointer);
        if (instance instanceof GLSLFreeIncludeResultFunc) {
            return (GLSLFreeIncludeResultFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLSLFreeIncludeResultFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLSLFreeIncludeResultFunc create(GLSLFreeIncludeResultFuncI instance) {
        if (instance instanceof GLSLFreeIncludeResultFunc) {
            return (GLSLFreeIncludeResultFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLSLFreeIncludeResultFunc() {
        super(DESCRIPTOR);
    }

    GLSLFreeIncludeResultFunc(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLFreeIncludeResultFunc$Container.class */
    private static final class Container extends GLSLFreeIncludeResultFunc {
        private final GLSLFreeIncludeResultFuncI delegate;

        Container(long functionPointer, GLSLFreeIncludeResultFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.GLSLFreeIncludeResultFuncI
        public int invoke(long ctx, long result) {
            return this.delegate.invoke(ctx, result);
        }
    }
}
