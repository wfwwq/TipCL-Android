package org.lwjgl.util.shaderc;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/Shaderc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/Shaderc.class */
public class Shaderc {
    private static final SharedLibrary SHADERC = Library.loadNative((Class<?>) Shaderc.class, "org.lwjgl.shaderc", Configuration.SHADERC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("shaderc")), true);
    public static final int shaderc_target_env_vulkan = 0;
    public static final int shaderc_target_env_opengl = 1;
    public static final int shaderc_target_env_opengl_compat = 2;
    public static final int shaderc_target_env_webgpu = 3;
    public static final int shaderc_target_env_default = 0;
    public static final int shaderc_env_version_vulkan_1_0 = 4194304;
    public static final int shaderc_env_version_vulkan_1_1 = 4198400;
    public static final int shaderc_env_version_vulkan_1_2 = 4202496;
    public static final int shaderc_env_version_vulkan_1_3 = 4206592;
    public static final int shaderc_env_version_vulkan_1_4 = 4210688;
    public static final int shaderc_env_version_opengl_4_5 = 450;
    public static final int shaderc_env_version_webgpu = 451;
    public static final int shaderc_spirv_version_1_0 = 65536;
    public static final int shaderc_spirv_version_1_1 = 65792;
    public static final int shaderc_spirv_version_1_2 = 66048;
    public static final int shaderc_spirv_version_1_3 = 66304;
    public static final int shaderc_spirv_version_1_4 = 66560;
    public static final int shaderc_spirv_version_1_5 = 66816;
    public static final int shaderc_spirv_version_1_6 = 67072;
    public static final int shaderc_compilation_status_success = 0;
    public static final int shaderc_compilation_status_invalid_stage = 1;
    public static final int shaderc_compilation_status_compilation_error = 2;
    public static final int shaderc_compilation_status_internal_error = 3;
    public static final int shaderc_compilation_status_null_result_object = 4;
    public static final int shaderc_compilation_status_invalid_assembly = 5;
    public static final int shaderc_compilation_status_validation_error = 6;
    public static final int shaderc_compilation_status_transformation_error = 7;
    public static final int shaderc_compilation_status_configuration_error = 8;
    public static final int shaderc_source_language_glsl = 0;
    public static final int shaderc_source_language_hlsl = 1;
    public static final int shaderc_vertex_shader = 0;
    public static final int shaderc_fragment_shader = 1;
    public static final int shaderc_compute_shader = 2;
    public static final int shaderc_geometry_shader = 3;
    public static final int shaderc_tess_control_shader = 4;
    public static final int shaderc_tess_evaluation_shader = 5;
    public static final int shaderc_glsl_vertex_shader = 0;
    public static final int shaderc_glsl_fragment_shader = 1;
    public static final int shaderc_glsl_compute_shader = 2;
    public static final int shaderc_glsl_geometry_shader = 3;
    public static final int shaderc_glsl_tess_control_shader = 4;
    public static final int shaderc_glsl_tess_evaluation_shader = 5;
    public static final int shaderc_glsl_infer_from_source = 6;
    public static final int shaderc_glsl_default_vertex_shader = 7;
    public static final int shaderc_glsl_default_fragment_shader = 8;
    public static final int shaderc_glsl_default_compute_shader = 9;
    public static final int shaderc_glsl_default_geometry_shader = 10;
    public static final int shaderc_glsl_default_tess_control_shader = 11;
    public static final int shaderc_glsl_default_tess_evaluation_shader = 12;
    public static final int shaderc_spirv_assembly = 13;
    public static final int shaderc_raygen_shader = 14;
    public static final int shaderc_anyhit_shader = 15;
    public static final int shaderc_closesthit_shader = 16;
    public static final int shaderc_miss_shader = 17;
    public static final int shaderc_intersection_shader = 18;
    public static final int shaderc_callable_shader = 19;
    public static final int shaderc_glsl_raygen_shader = 14;
    public static final int shaderc_glsl_anyhit_shader = 15;
    public static final int shaderc_glsl_closesthit_shader = 16;
    public static final int shaderc_glsl_miss_shader = 17;
    public static final int shaderc_glsl_intersection_shader = 18;
    public static final int shaderc_glsl_callable_shader = 19;
    public static final int shaderc_glsl_default_raygen_shader = 20;
    public static final int shaderc_glsl_default_anyhit_shader = 21;
    public static final int shaderc_glsl_default_closesthit_shader = 22;
    public static final int shaderc_glsl_default_miss_shader = 23;
    public static final int shaderc_glsl_default_intersection_shader = 24;
    public static final int shaderc_glsl_default_callable_shader = 25;
    public static final int shaderc_task_shader = 26;
    public static final int shaderc_mesh_shader = 27;
    public static final int shaderc_glsl_task_shader = 26;
    public static final int shaderc_glsl_mesh_shader = 27;
    public static final int shaderc_glsl_default_task_shader = 28;
    public static final int shaderc_glsl_default_mesh_shader = 29;
    public static final int shaderc_profile_none = 0;
    public static final int shaderc_profile_core = 1;
    public static final int shaderc_profile_compatibility = 2;
    public static final int shaderc_profile_es = 3;
    public static final int shaderc_optimization_level_zero = 0;
    public static final int shaderc_optimization_level_size = 1;
    public static final int shaderc_optimization_level_performance = 2;
    public static final int shaderc_limit_max_lights = 0;
    public static final int shaderc_limit_max_clip_planes = 1;
    public static final int shaderc_limit_max_texture_units = 2;
    public static final int shaderc_limit_max_texture_coords = 3;
    public static final int shaderc_limit_max_vertex_attribs = 4;
    public static final int shaderc_limit_max_vertex_uniform_components = 5;
    public static final int shaderc_limit_max_varying_floats = 6;
    public static final int shaderc_limit_max_vertex_texture_image_units = 7;
    public static final int shaderc_limit_max_combined_texture_image_units = 8;
    public static final int shaderc_limit_max_texture_image_units = 9;
    public static final int shaderc_limit_max_fragment_uniform_components = 10;
    public static final int shaderc_limit_max_draw_buffers = 11;
    public static final int shaderc_limit_max_vertex_uniform_vectors = 12;
    public static final int shaderc_limit_max_varying_vectors = 13;
    public static final int shaderc_limit_max_fragment_uniform_vectors = 14;
    public static final int shaderc_limit_max_vertex_output_vectors = 15;
    public static final int shaderc_limit_max_fragment_input_vectors = 16;
    public static final int shaderc_limit_min_program_texel_offset = 17;
    public static final int shaderc_limit_max_program_texel_offset = 18;
    public static final int shaderc_limit_max_clip_distances = 19;
    public static final int shaderc_limit_max_compute_work_group_count_x = 20;
    public static final int shaderc_limit_max_compute_work_group_count_y = 21;
    public static final int shaderc_limit_max_compute_work_group_count_z = 22;
    public static final int shaderc_limit_max_compute_work_group_size_x = 23;
    public static final int shaderc_limit_max_compute_work_group_size_y = 24;
    public static final int shaderc_limit_max_compute_work_group_size_z = 25;
    public static final int shaderc_limit_max_compute_uniform_components = 26;
    public static final int shaderc_limit_max_compute_texture_image_units = 27;
    public static final int shaderc_limit_max_compute_image_uniforms = 28;
    public static final int shaderc_limit_max_compute_atomic_counters = 29;
    public static final int shaderc_limit_max_compute_atomic_counter_buffers = 30;
    public static final int shaderc_limit_max_varying_components = 31;
    public static final int shaderc_limit_max_vertex_output_components = 32;
    public static final int shaderc_limit_max_geometry_input_components = 33;
    public static final int shaderc_limit_max_geometry_output_components = 34;
    public static final int shaderc_limit_max_fragment_input_components = 35;
    public static final int shaderc_limit_max_image_units = 36;
    public static final int shaderc_limit_max_combined_image_units_and_fragment_outputs = 37;
    public static final int shaderc_limit_max_combined_shader_output_resources = 38;
    public static final int shaderc_limit_max_image_samples = 39;
    public static final int shaderc_limit_max_vertex_image_uniforms = 40;
    public static final int shaderc_limit_max_tess_control_image_uniforms = 41;
    public static final int shaderc_limit_max_tess_evaluation_image_uniforms = 42;
    public static final int shaderc_limit_max_geometry_image_uniforms = 43;
    public static final int shaderc_limit_max_fragment_image_uniforms = 44;
    public static final int shaderc_limit_max_combined_image_uniforms = 45;
    public static final int shaderc_limit_max_geometry_texture_image_units = 46;
    public static final int shaderc_limit_max_geometry_output_vertices = 47;
    public static final int shaderc_limit_max_geometry_total_output_components = 48;
    public static final int shaderc_limit_max_geometry_uniform_components = 49;
    public static final int shaderc_limit_max_geometry_varying_components = 50;
    public static final int shaderc_limit_max_tess_control_input_components = 51;
    public static final int shaderc_limit_max_tess_control_output_components = 52;
    public static final int shaderc_limit_max_tess_control_texture_image_units = 53;
    public static final int shaderc_limit_max_tess_control_uniform_components = 54;
    public static final int shaderc_limit_max_tess_control_total_output_components = 55;
    public static final int shaderc_limit_max_tess_evaluation_input_components = 56;
    public static final int shaderc_limit_max_tess_evaluation_output_components = 57;
    public static final int shaderc_limit_max_tess_evaluation_texture_image_units = 58;
    public static final int shaderc_limit_max_tess_evaluation_uniform_components = 59;
    public static final int shaderc_limit_max_tess_patch_components = 60;
    public static final int shaderc_limit_max_patch_vertices = 61;
    public static final int shaderc_limit_max_tess_gen_level = 62;
    public static final int shaderc_limit_max_viewports = 63;
    public static final int shaderc_limit_max_vertex_atomic_counters = 64;
    public static final int shaderc_limit_max_tess_control_atomic_counters = 65;
    public static final int shaderc_limit_max_tess_evaluation_atomic_counters = 66;
    public static final int shaderc_limit_max_geometry_atomic_counters = 67;
    public static final int shaderc_limit_max_fragment_atomic_counters = 68;
    public static final int shaderc_limit_max_combined_atomic_counters = 69;
    public static final int shaderc_limit_max_atomic_counter_bindings = 70;
    public static final int shaderc_limit_max_vertex_atomic_counter_buffers = 71;
    public static final int shaderc_limit_max_tess_control_atomic_counter_buffers = 72;
    public static final int shaderc_limit_max_tess_evaluation_atomic_counter_buffers = 73;
    public static final int shaderc_limit_max_geometry_atomic_counter_buffers = 74;
    public static final int shaderc_limit_max_fragment_atomic_counter_buffers = 75;
    public static final int shaderc_limit_max_combined_atomic_counter_buffers = 76;
    public static final int shaderc_limit_max_atomic_counter_buffer_size = 77;
    public static final int shaderc_limit_max_transform_feedback_buffers = 78;
    public static final int shaderc_limit_max_transform_feedback_interleaved_components = 79;
    public static final int shaderc_limit_max_cull_distances = 80;
    public static final int shaderc_limit_max_combined_clip_and_cull_distances = 81;
    public static final int shaderc_limit_max_samples = 82;
    public static final int shaderc_limit_max_mesh_output_vertices_nv = 83;
    public static final int shaderc_limit_max_mesh_output_primitives_nv = 84;
    public static final int shaderc_limit_max_mesh_work_group_size_x_nv = 85;
    public static final int shaderc_limit_max_mesh_work_group_size_y_nv = 86;
    public static final int shaderc_limit_max_mesh_work_group_size_z_nv = 87;
    public static final int shaderc_limit_max_task_work_group_size_x_nv = 88;
    public static final int shaderc_limit_max_task_work_group_size_y_nv = 89;
    public static final int shaderc_limit_max_task_work_group_size_z_nv = 90;
    public static final int shaderc_limit_max_mesh_view_count_nv = 91;
    public static final int shaderc_limit_max_mesh_output_vertices_ext = 92;
    public static final int shaderc_limit_max_mesh_output_primitives_ext = 93;
    public static final int shaderc_limit_max_mesh_work_group_size_x_ext = 94;
    public static final int shaderc_limit_max_mesh_work_group_size_y_ext = 95;
    public static final int shaderc_limit_max_mesh_work_group_size_z_ext = 96;
    public static final int shaderc_limit_max_task_work_group_size_x_ext = 97;
    public static final int shaderc_limit_max_task_work_group_size_y_ext = 98;
    public static final int shaderc_limit_max_task_work_group_size_z_ext = 99;
    public static final int shaderc_limit_max_mesh_view_count_ext = 100;
    public static final int shaderc_limit_max_dual_source_draw_buffers_ext = 101;
    public static final int shaderc_uniform_kind_image = 0;
    public static final int shaderc_uniform_kind_sampler = 1;
    public static final int shaderc_uniform_kind_texture = 2;
    public static final int shaderc_uniform_kind_buffer = 3;
    public static final int shaderc_uniform_kind_storage_buffer = 4;
    public static final int shaderc_uniform_kind_unordered_access_view = 5;
    public static final int shaderc_include_type_relative = 0;
    public static final int shaderc_include_type_standard = 1;

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/Shaderc$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/Shaderc$Functions.class */
    public static final class Functions {
        public static final long compiler_initialize = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compiler_initialize");
        public static final long compiler_release = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compiler_release");
        public static final long compile_options_initialize = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_initialize");
        public static final long compile_options_clone = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_clone");
        public static final long compile_options_release = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_release");
        public static final long compile_options_add_macro_definition = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_add_macro_definition");
        public static final long compile_options_set_source_language = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_source_language");
        public static final long compile_options_set_generate_debug_info = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_generate_debug_info");
        public static final long compile_options_set_optimization_level = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_optimization_level");
        public static final long compile_options_set_forced_version_profile = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_forced_version_profile");
        public static final long compile_options_set_include_callbacks = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_include_callbacks");
        public static final long compile_options_set_suppress_warnings = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_suppress_warnings");
        public static final long compile_options_set_target_env = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_target_env");
        public static final long compile_options_set_target_spirv = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_target_spirv");
        public static final long compile_options_set_warnings_as_errors = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_warnings_as_errors");
        public static final long compile_options_set_limit = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_limit");
        public static final long compile_options_set_auto_bind_uniforms = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_auto_bind_uniforms");
        public static final long compile_options_set_auto_combined_image_sampler = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_auto_combined_image_sampler");
        public static final long compile_options_set_hlsl_io_mapping = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_hlsl_io_mapping");
        public static final long compile_options_set_hlsl_offsets = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_hlsl_offsets");
        public static final long compile_options_set_binding_base = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_binding_base");
        public static final long compile_options_set_binding_base_for_stage = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_binding_base_for_stage");
        public static final long compile_options_set_preserve_bindings = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_preserve_bindings");
        public static final long compile_options_set_max_id_bound = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_max_id_bound");
        public static final long compile_options_set_auto_map_locations = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_auto_map_locations");
        public static final long compile_options_set_hlsl_register_set_and_binding_for_stage = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage");
        public static final long compile_options_set_hlsl_register_set_and_binding = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_hlsl_register_set_and_binding");
        public static final long compile_options_set_hlsl_functionality1 = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_hlsl_functionality1");
        public static final long compile_options_set_hlsl_16bit_types = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_hlsl_16bit_types");
        public static final long compile_options_set_vulkan_rules_relaxed = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_vulkan_rules_relaxed");
        public static final long compile_options_set_invert_y = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_invert_y");
        public static final long compile_options_set_nan_clamp = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_options_set_nan_clamp");
        public static final long compile_into_spv = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_into_spv");
        public static final long compile_into_spv_assembly = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_into_spv_assembly");
        public static final long compile_into_preprocessed_text = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_compile_into_preprocessed_text");
        public static final long assemble_into_spv = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_assemble_into_spv");
        public static final long result_release = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_result_release");
        public static final long result_get_length = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_result_get_length");
        public static final long result_get_num_warnings = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_result_get_num_warnings");
        public static final long result_get_num_errors = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_result_get_num_errors");
        public static final long result_get_compilation_status = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_result_get_compilation_status");
        public static final long result_get_bytes = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_result_get_bytes");
        public static final long result_get_error_message = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_result_get_error_message");
        public static final long get_spv_version = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_get_spv_version");
        public static final long parse_version_profile = APIUtil.apiGetFunctionAddress(Shaderc.SHADERC, "shaderc_parse_version_profile");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    protected Shaderc() {
        throw new UnsupportedOperationException();
    }

    @NativeType("shaderc_compiler_t")
    public static long shaderc_compiler_initialize() {
        long __functionAddress = Functions.compiler_initialize;
        return JNI.invokeP(__functionAddress);
    }

    public static void shaderc_compiler_release(@NativeType("shaderc_compiler_t") long compiler) {
        long __functionAddress = Functions.compiler_release;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, __functionAddress);
    }

    @NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_initialize() {
        long __functionAddress = Functions.compile_options_initialize;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("shaderc_compile_options_t")
    public static long shaderc_compile_options_clone(@NativeType("shaderc_compile_options_t const") long options) {
        long __functionAddress = Functions.compile_options_clone;
        return JNI.invokePP(options, __functionAddress);
    }

    public static void shaderc_compile_options_release(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_release;
        JNI.invokePV(options, __functionAddress);
    }

    public static void nshaderc_compile_options_add_macro_definition(long options, long name, long name_length, long value, long value_length) {
        long __functionAddress = Functions.compile_options_add_macro_definition;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePPPPPV(options, name, name_length, value, value_length, __functionAddress);
    }

    public static void shaderc_compile_options_add_macro_definition(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        nshaderc_compile_options_add_macro_definition(options, MemoryUtil.memAddress(name), name.remaining(), MemoryUtil.memAddressSafe(value), Checks.remainingSafe(value));
    }

    public static void shaderc_compile_options_add_macro_definition(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nUTF8(name, false);
            long nameEncoded = stack.getPointerAddress();
            int valueEncodedLength = stack.nUTF8Safe(value, false);
            long valueEncoded = value == null ? 0L : stack.getPointerAddress();
            nshaderc_compile_options_add_macro_definition(options, nameEncoded, nameEncodedLength, valueEncoded, valueEncodedLength);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void shaderc_compile_options_set_source_language(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_source_language") int lang) {
        long __functionAddress = Functions.compile_options_set_source_language;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, lang, __functionAddress);
    }

    public static void shaderc_compile_options_set_generate_debug_info(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_generate_debug_info;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void shaderc_compile_options_set_optimization_level(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_optimization_level") int level) {
        long __functionAddress = Functions.compile_options_set_optimization_level;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, level, __functionAddress);
    }

    public static void shaderc_compile_options_set_forced_version_profile(@NativeType("shaderc_compile_options_t") long options, int version, @NativeType("shaderc_profile") int profile) {
        long __functionAddress = Functions.compile_options_set_forced_version_profile;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, version, profile, __functionAddress);
    }

    public static void nshaderc_compile_options_set_include_callbacks(long options, long resolver, long result_releaser, long user_data) {
        long __functionAddress = Functions.compile_options_set_include_callbacks;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePPPPV(options, resolver, result_releaser, user_data, __functionAddress);
    }

    public static void shaderc_compile_options_set_include_callbacks(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_include_resolve_fn") ShadercIncludeResolveI resolver, @NativeType("shaderc_include_result_release_fn") ShadercIncludeResultReleaseI result_releaser, @NativeType("void *") long user_data) {
        nshaderc_compile_options_set_include_callbacks(options, MemoryUtil.memAddressSafe(resolver), MemoryUtil.memAddressSafe(result_releaser), user_data);
    }

    public static void shaderc_compile_options_set_suppress_warnings(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_suppress_warnings;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void shaderc_compile_options_set_target_env(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_target_env") int target, @NativeType("uint32_t") int version) {
        long __functionAddress = Functions.compile_options_set_target_env;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, target, version, __functionAddress);
    }

    public static void shaderc_compile_options_set_target_spirv(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_spirv_version") int version) {
        long __functionAddress = Functions.compile_options_set_target_spirv;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, version, __functionAddress);
    }

    public static void shaderc_compile_options_set_warnings_as_errors(@NativeType("shaderc_compile_options_t") long options) {
        long __functionAddress = Functions.compile_options_set_warnings_as_errors;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void shaderc_compile_options_set_limit(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_limit") int limit, int value) {
        long __functionAddress = Functions.compile_options_set_limit;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, limit, value, __functionAddress);
    }

    public static void shaderc_compile_options_set_auto_bind_uniforms(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean auto_bind) {
        long __functionAddress = Functions.compile_options_set_auto_bind_uniforms;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, auto_bind, __functionAddress);
    }

    public static void shaderc_compile_options_set_auto_combined_image_sampler(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean upgrade) {
        long __functionAddress = Functions.compile_options_set_auto_combined_image_sampler;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, upgrade, __functionAddress);
    }

    public static void shaderc_compile_options_set_hlsl_io_mapping(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean hlsl_iomap) {
        long __functionAddress = Functions.compile_options_set_hlsl_io_mapping;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, hlsl_iomap, __functionAddress);
    }

    public static void shaderc_compile_options_set_hlsl_offsets(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean hlsl_offsets) {
        long __functionAddress = Functions.compile_options_set_hlsl_offsets;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, hlsl_offsets, __functionAddress);
    }

    public static void shaderc_compile_options_set_binding_base(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_uniform_kind") int kind, @NativeType("uint32_t") int base) {
        long __functionAddress = Functions.compile_options_set_binding_base;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, kind, base, __functionAddress);
    }

    public static void shaderc_compile_options_set_binding_base_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("shaderc_uniform_kind") int kind, @NativeType("uint32_t") int base) {
        long __functionAddress = Functions.compile_options_set_binding_base_for_stage;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, shader_kind, kind, base, __functionAddress);
    }

    public static void shaderc_compile_options_set_preserve_bindings(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean preserve_bindings) {
        long __functionAddress = Functions.compile_options_set_preserve_bindings;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, preserve_bindings, __functionAddress);
    }

    public static void shaderc_compile_options_set_max_id_bound(@NativeType("shaderc_compile_options_t") long options, @NativeType("uint32_t") int max_id_bound) {
        long __functionAddress = Functions.compile_options_set_max_id_bound;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, max_id_bound, __functionAddress);
    }

    public static void shaderc_compile_options_set_auto_map_locations(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean auto_map) {
        long __functionAddress = Functions.compile_options_set_auto_map_locations;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, auto_map, __functionAddress);
    }

    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(long options, int shader_kind, long reg, long set, long binding) {
        long __functionAddress = Functions.compile_options_set_hlsl_register_set_and_binding_for_stage;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePPPPV(options, shader_kind, reg, set, binding, __functionAddress);
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer reg, @NativeType("char const *") ByteBuffer set, @NativeType("char const *") ByteBuffer binding) {
        if (Checks.CHECKS) {
            Checks.checkNT1(reg);
            Checks.checkNT1(set);
            Checks.checkNT1(binding);
        }
        nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(options, shader_kind, MemoryUtil.memAddress(reg), MemoryUtil.memAddress(set), MemoryUtil.memAddress(binding));
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(@NativeType("shaderc_compile_options_t") long options, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence reg, @NativeType("char const *") CharSequence set, @NativeType("char const *") CharSequence binding) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(reg, true);
            long regEncoded = stack.getPointerAddress();
            stack.nUTF8(set, true);
            long setEncoded = stack.getPointerAddress();
            stack.nUTF8(binding, true);
            long bindingEncoded = stack.getPointerAddress();
            nshaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(options, shader_kind, regEncoded, setEncoded, bindingEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nshaderc_compile_options_set_hlsl_register_set_and_binding(long options, long reg, long set, long binding) {
        long __functionAddress = Functions.compile_options_set_hlsl_register_set_and_binding;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePPPPV(options, reg, set, binding, __functionAddress);
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") ByteBuffer reg, @NativeType("char const *") ByteBuffer set, @NativeType("char const *") ByteBuffer binding) {
        if (Checks.CHECKS) {
            Checks.checkNT1(reg);
            Checks.checkNT1(set);
            Checks.checkNT1(binding);
        }
        nshaderc_compile_options_set_hlsl_register_set_and_binding(options, MemoryUtil.memAddress(reg), MemoryUtil.memAddress(set), MemoryUtil.memAddress(binding));
    }

    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(@NativeType("shaderc_compile_options_t") long options, @NativeType("char const *") CharSequence reg, @NativeType("char const *") CharSequence set, @NativeType("char const *") CharSequence binding) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(reg, true);
            long regEncoded = stack.getPointerAddress();
            stack.nUTF8(set, true);
            long setEncoded = stack.getPointerAddress();
            stack.nUTF8(binding, true);
            long bindingEncoded = stack.getPointerAddress();
            nshaderc_compile_options_set_hlsl_register_set_and_binding(options, regEncoded, setEncoded, bindingEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void shaderc_compile_options_set_hlsl_functionality1(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_hlsl_functionality1;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, enable, __functionAddress);
    }

    public static void shaderc_compile_options_set_hlsl_16bit_types(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_hlsl_16bit_types;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, enable, __functionAddress);
    }

    public static void shaderc_compile_options_set_vulkan_rules_relaxed(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_vulkan_rules_relaxed;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, enable, __functionAddress);
    }

    public static void shaderc_compile_options_set_invert_y(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_invert_y;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, enable, __functionAddress);
    }

    public static void shaderc_compile_options_set_nan_clamp(@NativeType("shaderc_compile_options_t") long options, @NativeType("bool") boolean enable) {
        long __functionAddress = Functions.compile_options_set_nan_clamp;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, enable, __functionAddress);
    }

    public static long nshaderc_compile_into_spv(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_spv;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (Checks.CHECKS) {
            Checks.checkNT1(input_file_name);
            Checks.checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_spv(compiler, MemoryUtil.memAddress(source_text), source_text.remaining(), shader_kind, MemoryUtil.memAddress(input_file_name), MemoryUtil.memAddress(entry_point_name), additional_options);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence input_file_name, @NativeType("char const *") CharSequence entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int source_textEncodedLength = stack.nUTF8(source_text, false);
            long source_textEncoded = stack.getPointerAddress();
            stack.nUTF8(input_file_name, true);
            long input_file_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(entry_point_name, true);
            long entry_point_nameEncoded = stack.getPointerAddress();
            long jNshaderc_compile_into_spv = nshaderc_compile_into_spv(compiler, source_textEncoded, source_textEncodedLength, shader_kind, input_file_nameEncoded, entry_point_nameEncoded, additional_options);
            stack.setPointer(stackPointer);
            return jNshaderc_compile_into_spv;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nshaderc_compile_into_spv_assembly(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_spv_assembly;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv_assembly(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (Checks.CHECKS) {
            Checks.checkNT1(input_file_name);
            Checks.checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_spv_assembly(compiler, MemoryUtil.memAddress(source_text), source_text.remaining(), shader_kind, MemoryUtil.memAddress(input_file_name), MemoryUtil.memAddress(entry_point_name), additional_options);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_spv_assembly(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence input_file_name, @NativeType("char const *") CharSequence entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int source_textEncodedLength = stack.nUTF8(source_text, false);
            long source_textEncoded = stack.getPointerAddress();
            stack.nUTF8(input_file_name, true);
            long input_file_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(entry_point_name, true);
            long entry_point_nameEncoded = stack.getPointerAddress();
            long jNshaderc_compile_into_spv_assembly = nshaderc_compile_into_spv_assembly(compiler, source_textEncoded, source_textEncodedLength, shader_kind, input_file_nameEncoded, entry_point_nameEncoded, additional_options);
            stack.setPointer(stackPointer);
            return jNshaderc_compile_into_spv_assembly;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nshaderc_compile_into_preprocessed_text(long compiler, long source_text, long source_text_size, int shader_kind, long input_file_name, long entry_point_name, long additional_options) {
        long __functionAddress = Functions.compile_into_preprocessed_text;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPPPPP(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options, __functionAddress);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_preprocessed_text(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") ByteBuffer input_file_name, @NativeType("char const *") ByteBuffer entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        if (Checks.CHECKS) {
            Checks.checkNT1(input_file_name);
            Checks.checkNT1(entry_point_name);
        }
        return nshaderc_compile_into_preprocessed_text(compiler, MemoryUtil.memAddress(source_text), source_text.remaining(), shader_kind, MemoryUtil.memAddress(input_file_name), MemoryUtil.memAddress(entry_point_name), additional_options);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_compile_into_preprocessed_text(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_text, @NativeType("shaderc_shader_kind") int shader_kind, @NativeType("char const *") CharSequence input_file_name, @NativeType("char const *") CharSequence entry_point_name, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int source_textEncodedLength = stack.nUTF8(source_text, false);
            long source_textEncoded = stack.getPointerAddress();
            stack.nUTF8(input_file_name, true);
            long input_file_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(entry_point_name, true);
            long entry_point_nameEncoded = stack.getPointerAddress();
            long jNshaderc_compile_into_preprocessed_text = nshaderc_compile_into_preprocessed_text(compiler, source_textEncoded, source_textEncodedLength, shader_kind, input_file_nameEncoded, entry_point_nameEncoded, additional_options);
            stack.setPointer(stackPointer);
            return jNshaderc_compile_into_preprocessed_text;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nshaderc_assemble_into_spv(long compiler, long source_assembly, long source_assembly_size, long additional_options) {
        long __functionAddress = Functions.assemble_into_spv;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPPP(compiler, source_assembly, source_assembly_size, additional_options, __functionAddress);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_assemble_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") ByteBuffer source_assembly, @NativeType("shaderc_compile_options_t const") long additional_options) {
        return nshaderc_assemble_into_spv(compiler, MemoryUtil.memAddress(source_assembly), source_assembly.remaining(), additional_options);
    }

    @NativeType("shaderc_compilation_result_t")
    public static long shaderc_assemble_into_spv(@NativeType("shaderc_compiler_t const") long compiler, @NativeType("char const *") CharSequence source_assembly, @NativeType("shaderc_compile_options_t const") long additional_options) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int source_assemblyEncodedLength = stack.nUTF8(source_assembly, false);
            long source_assemblyEncoded = stack.getPointerAddress();
            long jNshaderc_assemble_into_spv = nshaderc_assemble_into_spv(compiler, source_assemblyEncoded, source_assemblyEncodedLength, additional_options);
            stack.setPointer(stackPointer);
            return jNshaderc_assemble_into_spv;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void shaderc_result_release(@NativeType("shaderc_compilation_result_t") long result) {
        long __functionAddress = Functions.result_release;
        if (Checks.CHECKS) {
            Checks.check(result);
        }
        JNI.invokePV(result, __functionAddress);
    }

    @NativeType("size_t")
    public static long shaderc_result_get_length(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_length;
        if (Checks.CHECKS) {
            Checks.check(result);
        }
        return JNI.invokePP(result, __functionAddress);
    }

    @NativeType("size_t")
    public static long shaderc_result_get_num_warnings(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_num_warnings;
        if (Checks.CHECKS) {
            Checks.check(result);
        }
        return JNI.invokePP(result, __functionAddress);
    }

    @NativeType("size_t")
    public static long shaderc_result_get_num_errors(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_num_errors;
        if (Checks.CHECKS) {
            Checks.check(result);
        }
        return JNI.invokePP(result, __functionAddress);
    }

    @NativeType("shaderc_compilation_status")
    public static int shaderc_result_get_compilation_status(@NativeType("shaderc_compilation_result_t const") long result) {
        long __functionAddress = Functions.result_get_compilation_status;
        if (Checks.CHECKS) {
            Checks.check(result);
        }
        return JNI.invokePI(result, __functionAddress);
    }

    public static long nshaderc_result_get_bytes(long result) {
        long __functionAddress = Functions.result_get_bytes;
        if (Checks.CHECKS) {
            Checks.check(result);
        }
        return JNI.invokePP(result, __functionAddress);
    }

    @NativeType("char const *")
    public static ByteBuffer shaderc_result_get_bytes(@NativeType("shaderc_compilation_result_t const") long result) {
        long __result = nshaderc_result_get_bytes(result);
        return MemoryUtil.memByteBufferSafe(__result, (int) shaderc_result_get_length(result));
    }

    @NativeType("char const *")
    public static ByteBuffer shaderc_result_get_bytes(@NativeType("shaderc_compilation_result_t const") long result, long length) {
        long __result = nshaderc_result_get_bytes(result);
        return MemoryUtil.memByteBufferSafe(__result, (int) length);
    }

    public static long nshaderc_result_get_error_message(long result) {
        long __functionAddress = Functions.result_get_error_message;
        if (Checks.CHECKS) {
            Checks.check(result);
        }
        return JNI.invokePP(result, __functionAddress);
    }

    @NativeType("char const *")
    public static String shaderc_result_get_error_message(@NativeType("shaderc_compilation_result_t const") long result) {
        long __result = nshaderc_result_get_error_message(result);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static void nshaderc_get_spv_version(long version, long revision) {
        long __functionAddress = Functions.get_spv_version;
        JNI.invokePPV(version, revision, __functionAddress);
    }

    public static void shaderc_get_spv_version(@NativeType("unsigned int *") IntBuffer version, @NativeType("unsigned int *") IntBuffer revision) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) version, 1);
            Checks.check((Buffer) revision, 1);
        }
        nshaderc_get_spv_version(MemoryUtil.memAddress(version), MemoryUtil.memAddress(revision));
    }

    public static boolean nshaderc_parse_version_profile(long str, long version, long profile) {
        long __functionAddress = Functions.parse_version_profile;
        return JNI.invokePPPZ(str, version, profile, __functionAddress);
    }

    @NativeType("bool")
    public static boolean shaderc_parse_version_profile(@NativeType("char const *") ByteBuffer str, @NativeType("int *") IntBuffer version, @NativeType("shaderc_profile *") IntBuffer profile) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
            Checks.check((Buffer) version, 1);
            Checks.check((Buffer) profile, 1);
        }
        return nshaderc_parse_version_profile(MemoryUtil.memAddress(str), MemoryUtil.memAddress(version), MemoryUtil.memAddress(profile));
    }

    @NativeType("bool")
    public static boolean shaderc_parse_version_profile(@NativeType("char const *") CharSequence str, @NativeType("int *") IntBuffer version, @NativeType("shaderc_profile *") IntBuffer profile) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) version, 1);
            Checks.check((Buffer) profile, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            boolean zNshaderc_parse_version_profile = nshaderc_parse_version_profile(strEncoded, MemoryUtil.memAddress(version), MemoryUtil.memAddress(profile));
            stack.setPointer(stackPointer);
            return zNshaderc_parse_version_profile;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
