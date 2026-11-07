package org.lwjgl.util.shaderc;

import org.lwjgl.system.Callback;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeSystemFunc.class */
public abstract class GLSLIncludeSystemFunc extends Callback implements GLSLIncludeSystemFuncI {
    public static GLSLIncludeSystemFunc create(long functionPointer) {
        GLSLIncludeSystemFuncI instance = (GLSLIncludeSystemFuncI) Callback.get(functionPointer);
        if (instance instanceof GLSLIncludeSystemFunc) {
            return (GLSLIncludeSystemFunc) instance;
        }
        return new Container(functionPointer, instance);
    }

    public static GLSLIncludeSystemFunc createSafe(long functionPointer) {
        if (functionPointer == 0) {
            return null;
        }
        return create(functionPointer);
    }

    public static GLSLIncludeSystemFunc create(GLSLIncludeSystemFuncI instance) {
        if (instance instanceof GLSLIncludeSystemFunc) {
            return (GLSLIncludeSystemFunc) instance;
        }
        return new Container(instance.address(), instance);
    }

    protected GLSLIncludeSystemFunc() {
        super(DESCRIPTOR);
    }

    GLSLIncludeSystemFunc(long functionPointer) {
        super(functionPointer);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeSystemFunc$Container.class */
    private static final class Container extends GLSLIncludeSystemFunc {
        private final GLSLIncludeSystemFuncI delegate;

        Container(long functionPointer, GLSLIncludeSystemFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override // org.lwjgl.util.shaderc.GLSLIncludeSystemFuncI
        public long invoke(long ctx, long header_name, long includer_name, long include_depth) {
            return this.delegate.invoke(ctx, header_name, includer_name, include_depth);
        }
    }
}
