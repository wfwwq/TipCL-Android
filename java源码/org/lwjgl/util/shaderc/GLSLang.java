package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Supplier;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLang.class */
public class GLSLang {
    private static final SharedLibrary SHADERC = Library.loadNative((Class<?>) GLSLang.class, "org.lwjgl.shaderc", Configuration.GLSLANG_LIBRARY_NAME, (Supplier<SharedLibrary>) Shaderc::getLibrary, new String[0]);
    public static final int GLSLANG_STAGE_VERTEX = 0;
    public static final int GLSLANG_STAGE_TESSCONTROL = 1;
    public static final int GLSLANG_STAGE_TESSEVALUATION = 2;
    public static final int GLSLANG_STAGE_GEOMETRY = 3;
    public static final int GLSLANG_STAGE_FRAGMENT = 4;
    public static final int GLSLANG_STAGE_COMPUTE = 5;
    public static final int GLSLANG_STAGE_RAYGEN = 6;
    public static final int GLSLANG_STAGE_RAYGEN_NV = 6;
    public static final int GLSLANG_STAGE_INTERSECT = 7;
    public static final int GLSLANG_STAGE_INTERSECT_NV = 7;
    public static final int GLSLANG_STAGE_ANYHIT = 8;
    public static final int GLSLANG_STAGE_ANYHIT_NV = 8;
    public static final int GLSLANG_STAGE_CLOSESTHIT = 9;
    public static final int GLSLANG_STAGE_CLOSESTHIT_NV = 9;
    public static final int GLSLANG_STAGE_MISS = 10;
    public static final int GLSLANG_STAGE_MISS_NV = 10;
    public static final int GLSLANG_STAGE_CALLABLE = 11;
    public static final int GLSLANG_STAGE_CALLABLE_NV = 11;
    public static final int GLSLANG_STAGE_TASK = 12;
    public static final int GLSLANG_STAGE_TASK_NV = 12;
    public static final int GLSLANG_STAGE_MESH = 13;
    public static final int GLSLANG_STAGE_MESH_NV = 13;
    public static final int GLSLANG_STAGE_VERTEX_MASK = 1;
    public static final int GLSLANG_STAGE_TESSCONTROL_MASK = 2;
    public static final int GLSLANG_STAGE_TESSEVALUATION_MASK = 4;
    public static final int GLSLANG_STAGE_GEOMETRY_MASK = 8;
    public static final int GLSLANG_STAGE_FRAGMENT_MASK = 16;
    public static final int GLSLANG_STAGE_COMPUTE_MASK = 32;
    public static final int GLSLANG_STAGE_RAYGEN_MASK = 64;
    public static final int GLSLANG_STAGE_RAYGEN_NV_MASK = 64;
    public static final int GLSLANG_STAGE_INTERSECT_MASK = 128;
    public static final int GLSLANG_STAGE_INTERSECT_NV_MASK = 128;
    public static final int GLSLANG_STAGE_ANYHIT_MASK = 256;
    public static final int GLSLANG_STAGE_ANYHIT_NV_MASK = 256;
    public static final int GLSLANG_STAGE_CLOSESTHIT_MASK = 512;
    public static final int GLSLANG_STAGE_CLOSESTHIT_NV_MASK = 512;
    public static final int GLSLANG_STAGE_MISS_MASK = 1024;
    public static final int GLSLANG_STAGE_MISS_NV_MASK = 1024;
    public static final int GLSLANG_STAGE_CALLABLE_MASK = 2048;
    public static final int GLSLANG_STAGE_CALLABLE_NV_MASK = 2048;
    public static final int GLSLANG_STAGE_TASK_MASK = 4096;
    public static final int GLSLANG_STAGE_TASK_NV_MASK = 4096;
    public static final int GLSLANG_STAGE_MESH_MASK = 8192;
    public static final int GLSLANG_STAGE_MESH_NV_MASK = 8192;
    public static final int GLSLANG_SOURCE_NONE = 0;
    public static final int GLSLANG_SOURCE_GLSL = 1;
    public static final int GLSLANG_SOURCE_HLSL = 2;
    public static final int GLSLANG_CLIENT_NONE = 0;
    public static final int GLSLANG_CLIENT_VULKAN = 1;
    public static final int GLSLANG_CLIENT_OPENGL = 2;
    public static final int GLSLANG_TARGET_NONE = 0;
    public static final int GLSLANG_TARGET_SPV = 1;
    public static final int GLSLANG_TARGET_VULKAN_1_0 = 4194304;
    public static final int GLSLANG_TARGET_VULKAN_1_1 = 4198400;
    public static final int GLSLANG_TARGET_VULKAN_1_2 = 4202496;
    public static final int GLSLANG_TARGET_VULKAN_1_3 = 4206592;
    public static final int GLSLANG_TARGET_VULKAN_1_4 = 4210688;
    public static final int GLSLANG_TARGET_OPENGL_450 = 450;
    public static final int GLSLANG_TARGET_SPV_1_0 = 65536;
    public static final int GLSLANG_TARGET_SPV_1_1 = 65792;
    public static final int GLSLANG_TARGET_SPV_1_2 = 66048;
    public static final int GLSLANG_TARGET_SPV_1_3 = 66304;
    public static final int GLSLANG_TARGET_SPV_1_4 = 66560;
    public static final int GLSLANG_TARGET_SPV_1_5 = 66816;
    public static final int GLSLANG_TARGET_SPV_1_6 = 67072;
    public static final int GLSLANG_EX_VERTEX_FRAGMENT = 0;
    public static final int GLSLANG_EX_FRAGMENT = 1;
    public static final int GLSLANG_OPT_NO_GENERATION = 0;
    public static final int GLSLANG_OPT_NONE = 1;
    public static final int GLSLANG_OPT_SIMPLE = 2;
    public static final int GLSLANG_OPT_FULL = 3;
    public static final int GLSLANG_TEX_SAMP_TRANS_KEEP = 0;
    public static final int GLSLANG_TEX_SAMP_TRANS_UPGRADE_TEXTURE_REMOVE_SAMPLER = 1;
    public static final int GLSLANG_MSG_DEFAULT_BIT = 0;
    public static final int GLSLANG_MSG_RELAXED_ERRORS_BIT = 1;
    public static final int GLSLANG_MSG_SUPPRESS_WARNINGS_BIT = 2;
    public static final int GLSLANG_MSG_AST_BIT = 4;
    public static final int GLSLANG_MSG_SPV_RULES_BIT = 8;
    public static final int GLSLANG_MSG_VULKAN_RULES_BIT = 16;
    public static final int GLSLANG_MSG_ONLY_PREPROCESSOR_BIT = 32;
    public static final int GLSLANG_MSG_READ_HLSL_BIT = 64;
    public static final int GLSLANG_MSG_CASCADING_ERRORS_BIT = 128;
    public static final int GLSLANG_MSG_KEEP_UNCALLED_BIT = 256;
    public static final int GLSLANG_MSG_HLSL_OFFSETS_BIT = 512;
    public static final int GLSLANG_MSG_DEBUG_INFO_BIT = 1024;
    public static final int GLSLANG_MSG_HLSL_ENABLE_16BIT_TYPES_BIT = 2048;
    public static final int GLSLANG_MSG_HLSL_LEGALIZATION_BIT = 4096;
    public static final int GLSLANG_MSG_HLSL_DX9_COMPATIBLE_BIT = 8192;
    public static final int GLSLANG_MSG_BUILTIN_SYMBOL_TABLE_BIT = 16384;
    public static final int GLSLANG_MSG_ENHANCED = 32768;
    public static final int GLSLANG_MSG_ABSOLUTE_PATH = 65536;
    public static final int GLSLANG_MSG_DISPLAY_ERROR_COLUMN = 131072;
    public static final int GLSLANG_MSG_LINK_TIME_OPTIMIZATION_BIT = 262144;
    public static final int GLSLANG_MSG_VALIDATE_CROSS_STAGE_IO_BIT = 524288;
    public static final int GLSLANG_REFLECTION_DEFAULT_BIT = 0;
    public static final int GLSLANG_REFLECTION_STRICT_ARRAY_SUFFIX_BIT = 1;
    public static final int GLSLANG_REFLECTION_BASIC_ARRAY_SUFFIX_BIT = 2;
    public static final int GLSLANG_REFLECTION_INTERMEDIATE_IOO_BIT = 4;
    public static final int GLSLANG_REFLECTION_SEPARATE_BUFFERS_BIT = 8;
    public static final int GLSLANG_REFLECTION_ALL_BLOCK_VARIABLES_BIT = 16;
    public static final int GLSLANG_REFLECTION_UNWRAP_IO_BLOCKS_BIT = 32;
    public static final int GLSLANG_REFLECTION_ALL_IO_VARIABLES_BIT = 64;
    public static final int GLSLANG_REFLECTION_SHARED_STD140_SSBO_BIT = 128;
    public static final int GLSLANG_REFLECTION_SHARED_STD140_UBO_BIT = 256;
    public static final int GLSLANG_BAD_PROFILE = 0;
    public static final int GLSLANG_NO_PROFILE = 1;
    public static final int GLSLANG_CORE_PROFILE = 2;
    public static final int GLSLANG_COMPATIBILITY_PROFILE = 4;
    public static final int GLSLANG_ES_PROFILE = 8;
    public static final int GLSLANG_SHADER_DEFAULT_BIT = 0;
    public static final int GLSLANG_SHADER_AUTO_MAP_BINDINGS = 1;
    public static final int GLSLANG_SHADER_AUTO_MAP_LOCATIONS = 2;
    public static final int GLSLANG_SHADER_VULKAN_RULES_RELAXED = 4;
    public static final int GLSLANG_SHADER_BINDINGS_PER_RESOURCE_TYPE = 8;
    public static final int GLSLANG_RESOURCE_TYPE_SAMPLER = 0;
    public static final int GLSLANG_RESOURCE_TYPE_TEXTURE = 1;
    public static final int GLSLANG_RESOURCE_TYPE_IMAGE = 2;
    public static final int GLSLANG_RESOURCE_TYPE_UBO = 3;
    public static final int GLSLANG_RESOURCE_TYPE_SSBO = 4;
    public static final int GLSLANG_RESOURCE_TYPE_UAV = 5;
    public static final int GLSLANG_RESOURCE_TYPE_COMBINED_SAMPLER = 6;
    public static final int GLSLANG_RESOURCE_TYPE_AS = 7;
    public static final int GLSLANG_RESOURCE_TYPE_TENSOR = 8;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLang$Functions.class */
    public static final class Functions {
        public static final long get_version = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_get_version");
        public static final long initialize_process = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_initialize_process");
        public static final long finalize_process = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_finalize_process");
        public static final long shader_create = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_create");
        public static final long shader_delete = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_delete");
        public static final long shader_set_preamble = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_preamble");
        public static final long shader_set_entry_point = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_entry_point");
        public static final long shader_set_invert_y = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_invert_y");
        public static final long shader_shift_binding = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_shift_binding");
        public static final long shader_shift_binding_for_set = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_shift_binding_for_set");
        public static final long shader_set_options = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_options");
        public static final long shader_set_glsl_version = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_glsl_version");
        public static final long shader_set_default_uniform_block_set_and_binding = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_default_uniform_block_set_and_binding");
        public static final long shader_set_default_uniform_block_name = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_default_uniform_block_name");
        public static final long shader_set_resource_set_binding = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_resource_set_binding");
        public static final long shader_preprocess = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_preprocess");
        public static final long shader_parse = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_parse");
        public static final long shader_get_preprocessed_code = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_get_preprocessed_code");
        public static final long shader_set_preprocessed_code = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_set_preprocessed_code");
        public static final long shader_get_info_log = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_get_info_log");
        public static final long shader_get_info_debug_log = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_shader_get_info_debug_log");
        public static final long program_create = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_create");
        public static final long program_delete = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_delete");
        public static final long program_add_shader = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_add_shader");
        public static final long program_link = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_link");
        public static final long program_add_source_text = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_add_source_text");
        public static final long program_set_source_file = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_set_source_file");
        public static final long program_map_io = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_map_io");
        public static final long program_map_io_with_resolver_and_mapper = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_map_io_with_resolver_and_mapper");
        public static final long program_SPIRV_generate = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_SPIRV_generate");
        public static final long program_SPIRV_generate_with_options = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_SPIRV_generate_with_options");
        public static final long program_SPIRV_get_size = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_SPIRV_get_size");
        public static final long program_SPIRV_get = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_SPIRV_get");
        public static final long program_SPIRV_get_ptr = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_SPIRV_get_ptr");
        public static final long program_SPIRV_get_messages = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_SPIRV_get_messages");
        public static final long program_get_info_log = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_get_info_log");
        public static final long program_get_info_debug_log = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_program_get_info_debug_log");
        public static final long glsl_mapper_create = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_glsl_mapper_create");
        public static final long glsl_mapper_delete = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_glsl_mapper_delete");
        public static final long glsl_resolver_create = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_glsl_resolver_create");
        public static final long glsl_resolver_delete = APIUtil.apiGetFunctionAddress(GLSLang.SHADERC, "glslang_glsl_resolver_delete");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    protected GLSLang() {
        throw new UnsupportedOperationException();
    }

    public static void nglslang_get_version(long version) {
        long __functionAddress = Functions.get_version;
        JNI.invokePV(version, __functionAddress);
    }

    public static void glslang_get_version(@NativeType("glslang_version_t *") GLSLangVersion version) {
        nglslang_get_version(version.address());
    }

    @NativeType("int")
    public static boolean glslang_initialize_process() {
        long __functionAddress = Functions.initialize_process;
        return JNI.invokeI(__functionAddress) != 0;
    }

    public static void glslang_finalize_process() {
        long __functionAddress = Functions.finalize_process;
        JNI.invokeV(__functionAddress);
    }

    public static long nglslang_shader_create(long input) {
        long __functionAddress = Functions.shader_create;
        return JNI.invokePP(input, __functionAddress);
    }

    @NativeType("glslang_shader_t *")
    public static long glslang_shader_create(@NativeType("glslang_input_t const *") GLSLangInput input) {
        return nglslang_shader_create(input.address());
    }

    public static void glslang_shader_delete(@NativeType("glslang_shader_t *") long shader) {
        long __functionAddress = Functions.shader_delete;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePV(shader, __functionAddress);
    }

    public static void nglslang_shader_set_preamble(long shader, long s) {
        long __functionAddress = Functions.shader_set_preamble;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePPV(shader, s, __functionAddress);
    }

    public static void glslang_shader_set_preamble(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer s) {
        if (Checks.CHECKS) {
            Checks.checkNT1(s);
        }
        nglslang_shader_set_preamble(shader, MemoryUtil.memAddress(s));
    }

    public static void glslang_shader_set_preamble(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence s) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s, true);
            long sEncoded = stack.getPointerAddress();
            nglslang_shader_set_preamble(shader, sEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nglslang_shader_set_entry_point(long shader, long s) {
        long __functionAddress = Functions.shader_set_entry_point;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePPV(shader, s, __functionAddress);
    }

    public static void glslang_shader_set_entry_point(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer s) {
        if (Checks.CHECKS) {
            Checks.checkNT1(s);
        }
        nglslang_shader_set_entry_point(shader, MemoryUtil.memAddress(s));
    }

    public static void glslang_shader_set_entry_point(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence s) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s, true);
            long sEncoded = stack.getPointerAddress();
            nglslang_shader_set_entry_point(shader, sEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glslang_shader_set_invert_y(@NativeType("glslang_shader_t *") long shader, @NativeType("bool") boolean y) {
        long __functionAddress = Functions.shader_set_invert_y;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePV(shader, y, __functionAddress);
    }

    public static void glslang_shader_shift_binding(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_resource_type_t") int res, @NativeType("unsigned int") int base) {
        long __functionAddress = Functions.shader_shift_binding;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePV(shader, res, base, __functionAddress);
    }

    public static void glslang_shader_shift_binding_for_set(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_resource_type_t") int res, @NativeType("unsigned int") int base, @NativeType("unsigned int") int set) {
        long __functionAddress = Functions.shader_shift_binding_for_set;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePV(shader, res, base, set, __functionAddress);
    }

    public static void glslang_shader_set_options(@NativeType("glslang_shader_t *") long shader, int options) {
        long __functionAddress = Functions.shader_set_options;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePV(shader, options, __functionAddress);
    }

    public static void glslang_shader_set_glsl_version(@NativeType("glslang_shader_t *") long shader, int version) {
        long __functionAddress = Functions.shader_set_glsl_version;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePV(shader, version, __functionAddress);
    }

    public static void glslang_shader_set_default_uniform_block_set_and_binding(@NativeType("glslang_shader_t *") long shader, @NativeType("unsigned int") int set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.shader_set_default_uniform_block_set_and_binding;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePV(shader, set, binding, __functionAddress);
    }

    public static void nglslang_shader_set_default_uniform_block_name(long shader, long name) {
        long __functionAddress = Functions.shader_set_default_uniform_block_name;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePPV(shader, name, __functionAddress);
    }

    public static void glslang_shader_set_default_uniform_block_name(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nglslang_shader_set_default_uniform_block_name(shader, MemoryUtil.memAddress(name));
    }

    public static void glslang_shader_set_default_uniform_block_name(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglslang_shader_set_default_uniform_block_name(shader, nameEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nglslang_shader_set_resource_set_binding(long shader, long bindings, int num_bindings) {
        long __functionAddress = Functions.shader_set_resource_set_binding;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePPV(shader, bindings, num_bindings, __functionAddress);
    }

    public static void glslang_shader_set_resource_set_binding(@NativeType("glslang_shader_t *") long shader, @NativeType("char const * const *") PointerBuffer bindings) {
        nglslang_shader_set_resource_set_binding(shader, MemoryUtil.memAddress(bindings), bindings.remaining());
    }

    public static int nglslang_shader_preprocess(long shader, long input) {
        long __functionAddress = Functions.shader_preprocess;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        return JNI.invokePPI(shader, input, __functionAddress);
    }

    @NativeType("int")
    public static boolean glslang_shader_preprocess(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_input_t const *") GLSLangInput input) {
        return nglslang_shader_preprocess(shader, input.address()) != 0;
    }

    public static int nglslang_shader_parse(long shader, long input) {
        long __functionAddress = Functions.shader_parse;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        return JNI.invokePPI(shader, input, __functionAddress);
    }

    @NativeType("int")
    public static boolean glslang_shader_parse(@NativeType("glslang_shader_t *") long shader, @NativeType("glslang_input_t const *") GLSLangInput input) {
        return nglslang_shader_parse(shader, input.address()) != 0;
    }

    public static long nglslang_shader_get_preprocessed_code(long shader) {
        long __functionAddress = Functions.shader_get_preprocessed_code;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        return JNI.invokePP(shader, __functionAddress);
    }

    @NativeType("char const *")
    public static String glslang_shader_get_preprocessed_code(@NativeType("glslang_shader_t *") long shader) {
        long __result = nglslang_shader_get_preprocessed_code(shader);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static void nglslang_shader_set_preprocessed_code(long shader, long code) {
        long __functionAddress = Functions.shader_set_preprocessed_code;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        JNI.invokePPV(shader, code, __functionAddress);
    }

    public static void glslang_shader_set_preprocessed_code(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") ByteBuffer code) {
        if (Checks.CHECKS) {
            Checks.checkNT1(code);
        }
        nglslang_shader_set_preprocessed_code(shader, MemoryUtil.memAddress(code));
    }

    public static void glslang_shader_set_preprocessed_code(@NativeType("glslang_shader_t *") long shader, @NativeType("char const *") CharSequence code) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(code, true);
            long codeEncoded = stack.getPointerAddress();
            nglslang_shader_set_preprocessed_code(shader, codeEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nglslang_shader_get_info_log(long shader) {
        long __functionAddress = Functions.shader_get_info_log;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        return JNI.invokePP(shader, __functionAddress);
    }

    @NativeType("char const *")
    public static String glslang_shader_get_info_log(@NativeType("glslang_shader_t *") long shader) {
        long __result = nglslang_shader_get_info_log(shader);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nglslang_shader_get_info_debug_log(long shader) {
        long __functionAddress = Functions.shader_get_info_debug_log;
        if (Checks.CHECKS) {
            Checks.check(shader);
        }
        return JNI.invokePP(shader, __functionAddress);
    }

    @NativeType("char const *")
    public static String glslang_shader_get_info_debug_log(@NativeType("glslang_shader_t *") long shader) {
        long __result = nglslang_shader_get_info_debug_log(shader);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("glslang_program_t *")
    public static long glslang_program_create() {
        long __functionAddress = Functions.program_create;
        return JNI.invokeP(__functionAddress);
    }

    public static void glslang_program_delete(@NativeType("glslang_program_t *") long program) {
        long __functionAddress = Functions.program_delete;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        JNI.invokePV(program, __functionAddress);
    }

    public static void glslang_program_add_shader(@NativeType("glslang_program_t *") long program, @NativeType("glslang_shader_t *") long shader) {
        long __functionAddress = Functions.program_add_shader;
        if (Checks.CHECKS) {
            Checks.check(program);
            Checks.check(shader);
        }
        JNI.invokePPV(program, shader, __functionAddress);
    }

    @NativeType("int")
    public static boolean glslang_program_link(@NativeType("glslang_program_t *") long program, int messages) {
        long __functionAddress = Functions.program_link;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePI(program, messages, __functionAddress) != 0;
    }

    public static void nglslang_program_add_source_text(long program, int stage, long text, long len) {
        long __functionAddress = Functions.program_add_source_text;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        JNI.invokePPPV(program, stage, text, len, __functionAddress);
    }

    public static void glslang_program_add_source_text(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") ByteBuffer text) {
        nglslang_program_add_source_text(program, stage, MemoryUtil.memAddress(text), text.remaining());
    }

    public static void glslang_program_add_source_text(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            nglslang_program_add_source_text(program, stage, textEncoded, textEncodedLength);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nglslang_program_set_source_file(long program, int stage, long file) {
        long __functionAddress = Functions.program_set_source_file;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        JNI.invokePPV(program, stage, file, __functionAddress);
    }

    public static void glslang_program_set_source_file(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        nglslang_program_set_source_file(program, stage, MemoryUtil.memAddress(file));
    }

    public static void glslang_program_set_source_file(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            nglslang_program_set_source_file(program, stage, fileEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("int")
    public static boolean glslang_program_map_io(@NativeType("glslang_program_t *") long program) {
        long __functionAddress = Functions.program_map_io;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePI(program, __functionAddress) != 0;
    }

    @NativeType("int")
    public static boolean glslang_program_map_io_with_resolver_and_mapper(@NativeType("glslang_program_t *") long program, @NativeType("glslang_resolver_t *") long resolver, @NativeType("glslang_mapper_t *") long mapper) {
        long __functionAddress = Functions.program_map_io_with_resolver_and_mapper;
        if (Checks.CHECKS) {
            Checks.check(program);
            Checks.check(resolver);
            Checks.check(mapper);
        }
        return JNI.invokePPPI(program, resolver, mapper, __functionAddress) != 0;
    }

    public static void glslang_program_SPIRV_generate(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage) {
        long __functionAddress = Functions.program_SPIRV_generate;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        JNI.invokePV(program, stage, __functionAddress);
    }

    public static void nglslang_program_SPIRV_generate_with_options(long program, int stage, long spv_options) {
        long __functionAddress = Functions.program_SPIRV_generate_with_options;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        JNI.invokePPV(program, stage, spv_options, __functionAddress);
    }

    public static void glslang_program_SPIRV_generate_with_options(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage, @NativeType("glslang_spv_options_t *") GLSLangSPVOptions spv_options) {
        nglslang_program_SPIRV_generate_with_options(program, stage, spv_options.address());
    }

    @NativeType("size_t")
    public static long glslang_program_SPIRV_get_size(@NativeType("glslang_program_t *") long program) {
        long __functionAddress = Functions.program_SPIRV_get_size;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePP(program, __functionAddress);
    }

    public static void nglslang_program_SPIRV_get(long program, long out) {
        long __functionAddress = Functions.program_SPIRV_get;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        JNI.invokePPV(program, out, __functionAddress);
    }

    public static void glslang_program_SPIRV_get(@NativeType("glslang_program_t *") long program, @NativeType("unsigned int *") IntBuffer out) {
        if (Checks.CHECKS && Checks.DEBUG) {
            Checks.check(out, glslang_program_SPIRV_get_size(program));
        }
        nglslang_program_SPIRV_get(program, MemoryUtil.memAddress(out));
    }

    public static long nglslang_program_SPIRV_get_ptr(long program) {
        long __functionAddress = Functions.program_SPIRV_get_ptr;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePP(program, __functionAddress);
    }

    @NativeType("unsigned int *")
    public static IntBuffer glslang_program_SPIRV_get_ptr(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_SPIRV_get_ptr(program);
        return MemoryUtil.memIntBufferSafe(__result, (int) glslang_program_SPIRV_get_size(program));
    }

    @NativeType("unsigned int *")
    public static IntBuffer glslang_program_SPIRV_get_ptr(@NativeType("glslang_program_t *") long program, long length) {
        long __result = nglslang_program_SPIRV_get_ptr(program);
        return MemoryUtil.memIntBufferSafe(__result, (int) length);
    }

    public static long nglslang_program_SPIRV_get_messages(long program) {
        long __functionAddress = Functions.program_SPIRV_get_messages;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePP(program, __functionAddress);
    }

    @NativeType("char const *")
    public static String glslang_program_SPIRV_get_messages(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_SPIRV_get_messages(program);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nglslang_program_get_info_log(long program) {
        long __functionAddress = Functions.program_get_info_log;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePP(program, __functionAddress);
    }

    @NativeType("char const *")
    public static String glslang_program_get_info_log(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_get_info_log(program);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nglslang_program_get_info_debug_log(long program) {
        long __functionAddress = Functions.program_get_info_debug_log;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePP(program, __functionAddress);
    }

    @NativeType("char const *")
    public static String glslang_program_get_info_debug_log(@NativeType("glslang_program_t *") long program) {
        long __result = nglslang_program_get_info_debug_log(program);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("glslang_mapper_t *")
    public static long glslang_glsl_mapper_create() {
        long __functionAddress = Functions.glsl_mapper_create;
        return JNI.invokeP(__functionAddress);
    }

    public static void glslang_glsl_mapper_delete(@NativeType("glslang_mapper_t *") long mapper) {
        long __functionAddress = Functions.glsl_mapper_delete;
        if (Checks.CHECKS) {
            Checks.check(mapper);
        }
        JNI.invokePV(mapper, __functionAddress);
    }

    @NativeType("glslang_resolver_t *")
    public static long glslang_glsl_resolver_create(@NativeType("glslang_program_t *") long program, @NativeType("glslang_stage_t") int stage) {
        long __functionAddress = Functions.glsl_resolver_create;
        if (Checks.CHECKS) {
            Checks.check(program);
        }
        return JNI.invokePP(program, stage, __functionAddress);
    }

    public static void glslang_glsl_resolver_delete(@NativeType("glslang_resolver_t *") long resolver) {
        long __functionAddress = Functions.glsl_resolver_delete;
        if (Checks.CHECKS) {
            Checks.check(resolver);
        }
        JNI.invokePV(resolver, __functionAddress);
    }
}
