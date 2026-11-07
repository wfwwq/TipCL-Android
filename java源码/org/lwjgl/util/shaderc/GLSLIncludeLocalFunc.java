package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeLocalFunc.class */
public abstract class GLSLIncludeLocalFunc extends Callback implements GLSLIncludeLocalFuncI {
    public static GLSLIncludeLocalFunc create(long functionPointer) {
        GLSLIncludeLocalFuncI instance = (GLSLIncludeLocalFuncI) Callback.get(functionPointer);
        if (instance instanceof GLSLIncludeLocalFunc) {
            return (GLSLIncludeLocalFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLSLIncludeLocalFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLSLIncludeLocalFunc create(GLSLIncludeLocalFuncI instance) {
        if (instance instanceof GLSLIncludeLocalFunc) {
            return (GLSLIncludeLocalFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLSLIncludeLocalFunc() {
        super(DESCRIPTOR);
    }

    GLSLIncludeLocalFunc(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeLocalFunc$Container.class */
    private static final class Container extends GLSLIncludeLocalFunc {
        private final GLSLIncludeLocalFuncI delegate;

        Container(long functionPointer, GLSLIncludeLocalFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.GLSLIncludeLocalFuncI
        public long invoke(long ctx, long header_name, long includer_name, long include_depth) {
            return this.delegate.invoke(ctx, header_name, includer_name, include_depth);
        }
    }
}
