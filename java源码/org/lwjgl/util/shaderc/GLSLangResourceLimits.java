package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import java.util.function.Supplier;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangResourceLimits.class */
public class GLSLangResourceLimits {
    private static final SharedLibrary SHADERC = Library.loadNative((Class<?>) GLSLangResourceLimits.class, "org.lwjgl.shaderc", Configuration.GLSLANG_RESOURCE_LIBRARY_NAME, (Supplier<SharedLibrary>) Shaderc::getLibrary, new String[0]);

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangResourceLimits$Functions.class */
    public static final class Functions {
        public static final long resource = APIUtil.apiGetFunctionAddress(GLSLangResourceLimits.SHADERC, "glslang_resource");
        public static final long default_resource = APIUtil.apiGetFunctionAddress(GLSLangResourceLimits.SHADERC, "glslang_default_resource");
        public static final long default_resource_string = APIUtil.apiGetFunctionAddress(GLSLangResourceLimits.SHADERC, "glslang_default_resource_string");
        public static final long decode_resource_limits = APIUtil.apiGetFunctionAddress(GLSLangResourceLimits.SHADERC, "glslang_decode_resource_limits");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    protected GLSLangResourceLimits() {
        throw new UnsupportedOperationException();
    }

    public static long nglslang_resource() {
        long __functionAddress = Functions.resource;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("glslang_resource_t *")
    public static GLSLangResource glslang_resource() {
        long __result = nglslang_resource();
        return GLSLangResource.createSafe(__result);
    }

    public static long nglslang_default_resource() {
        long __functionAddress = Functions.default_resource;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("glslang_resource_t const *")
    public static GLSLangResource glslang_default_resource() {
        long __result = nglslang_default_resource();
        return GLSLangResource.createSafe(__result);
    }

    @NativeType("const char *")
    public static long glslang_default_resource_string() {
        long __functionAddress = Functions.default_resource_string;
        return JNI.invokeP(__functionAddress);
    }

    public static void nglslang_decode_resource_limits(long resources, long config) {
        long __functionAddress = Functions.decode_resource_limits;
        JNI.invokePPV(resources, config, __functionAddress);
    }

    public static void glslang_decode_resource_limits(@NativeType("glslang_resource_t *") GLSLangResource resources, @NativeType("char *") ByteBuffer config) {
        if (Checks.CHECKS) {
            Checks.checkNT1(config);
        }
        nglslang_decode_resource_limits(resources.address(), MemoryUtil.memAddress(config));
    }
}
