package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct glslang_resource_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangResource.class */
public class GLSLangResource extends Struct<GLSLangResource> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAX_LIGHTS;
    public static final int MAX_CLIP_PLANES;
    public static final int MAX_TEXTURE_UNITS;
    public static final int MAX_TEXTURE_COORDS;
    public static final int MAX_VERTEX_ATTRIBS;
    public static final int MAX_VERTEX_UNIFORM_COMPONENTS;
    public static final int MAX_VARYING_FLOATS;
    public static final int MAX_VERTEX_TEXTURE_IMAGE_UNITS;
    public static final int MAX_COMBINED_TEXTURE_IMAGE_UNITS;
    public static final int MAX_TEXTURE_IMAGE_UNITS;
    public static final int MAX_FRAGMENT_UNIFORM_COMPONENTS;
    public static final int MAX_DRAW_BUFFERS;
    public static final int MAX_VERTEX_UNIFORM_VECTORS;
    public static final int MAX_VARYING_VECTORS;
    public static final int MAX_FRAGMENT_UNIFORM_VECTORS;
    public static final int MAX_VERTEX_OUTPUT_VECTORS;
    public static final int MAX_FRAGMENT_INPUT_VECTORS;
    public static final int MIN_PROGRAM_TEXEL_OFFSET;
    public static final int MAX_PROGRAM_TEXEL_OFFSET;
    public static final int MAX_CLIP_DISTANCES;
    public static final int MAX_COMPUTE_WORK_GROUP_COUNT_X;
    public static final int MAX_COMPUTE_WORK_GROUP_COUNT_Y;
    public static final int MAX_COMPUTE_WORK_GROUP_COUNT_Z;
    public static final int MAX_COMPUTE_WORK_GROUP_SIZE_X;
    public static final int MAX_COMPUTE_WORK_GROUP_SIZE_Y;
    public static final int MAX_COMPUTE_WORK_GROUP_SIZE_Z;
    public static final int MAX_COMPUTE_UNIFORM_COMPONENTS;
    public static final int MAX_COMPUTE_TEXTURE_IMAGE_UNITS;
    public static final int MAX_COMPUTE_IMAGE_UNIFORMS;
    public static final int MAX_COMPUTE_ATOMIC_COUNTERS;
    public static final int MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS;
    public static final int MAX_VARYING_COMPONENTS;
    public static final int MAX_VERTEX_OUTPUT_COMPONENTS;
    public static final int MAX_GEOMETRY_INPUT_COMPONENTS;
    public static final int MAX_GEOMETRY_OUTPUT_COMPONENTS;
    public static final int MAX_FRAGMENT_INPUT_COMPONENTS;
    public static final int MAX_IMAGE_UNITS;
    public static final int MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS;
    public static final int MAX_COMBINED_SHADER_OUTPUT_RESOURCES;
    public static final int MAX_IMAGE_SAMPLES;
    public static final int MAX_VERTEX_IMAGE_UNIFORMS;
    public static final int MAX_TESS_CONTROL_IMAGE_UNIFORMS;
    public static final int MAX_TESS_EVALUATION_IMAGE_UNIFORMS;
    public static final int MAX_GEOMETRY_IMAGE_UNIFORMS;
    public static final int MAX_FRAGMENT_IMAGE_UNIFORMS;
    public static final int MAX_COMBINED_IMAGE_UNIFORMS;
    public static final int MAX_GEOMETRY_TEXTURE_IMAGE_UNITS;
    public static final int MAX_GEOMETRY_OUTPUT_VERTICES;
    public static final int MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS;
    public static final int MAX_GEOMETRY_UNIFORM_COMPONENTS;
    public static final int MAX_GEOMETRY_VARYING_COMPONENTS;
    public static final int MAX_TESS_CONTROL_INPUT_COMPONENTS;
    public static final int MAX_TESS_CONTROL_OUTPUT_COMPONENTS;
    public static final int MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS;
    public static final int MAX_TESS_CONTROL_UNIFORM_COMPONENTS;
    public static final int MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS;
    public static final int MAX_TESS_EVALUATION_INPUT_COMPONENTS;
    public static final int MAX_TESS_EVALUATION_OUTPUT_COMPONENTS;
    public static final int MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS;
    public static final int MAX_TESS_EVALUATION_UNIFORM_COMPONENTS;
    public static final int MAX_TESS_PATCH_COMPONENTS;
    public static final int MAX_PATCH_VERTICES;
    public static final int MAX_TESS_GEN_LEVEL;
    public static final int MAX_VIEWPORTS;
    public static final int MAX_VERTEX_ATOMIC_COUNTERS;
    public static final int MAX_TESS_CONTROL_ATOMIC_COUNTERS;
    public static final int MAX_TESS_EVALUATION_ATOMIC_COUNTERS;
    public static final int MAX_GEOMETRY_ATOMIC_COUNTERS;
    public static final int MAX_FRAGMENT_ATOMIC_COUNTERS;
    public static final int MAX_COMBINED_ATOMIC_COUNTERS;
    public static final int MAX_ATOMIC_COUNTER_BINDINGS;
    public static final int MAX_VERTEX_ATOMIC_COUNTER_BUFFERS;
    public static final int MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS;
    public static final int MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS;
    public static final int MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS;
    public static final int MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS;
    public static final int MAX_COMBINED_ATOMIC_COUNTER_BUFFERS;
    public static final int MAX_ATOMIC_COUNTER_BUFFER_SIZE;
    public static final int MAX_TRANSFORM_FEEDBACK_BUFFERS;
    public static final int MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS;
    public static final int MAX_CULL_DISTANCES;
    public static final int MAX_COMBINED_CLIP_AND_CULL_DISTANCES;
    public static final int MAX_SAMPLES;
    public static final int MAX_MESH_OUTPUT_VERTICES_NV;
    public static final int MAX_MESH_OUTPUT_PRIMITIVES_NV;
    public static final int MAX_MESH_WORK_GROUP_SIZE_X_NV;
    public static final int MAX_MESH_WORK_GROUP_SIZE_Y_NV;
    public static final int MAX_MESH_WORK_GROUP_SIZE_Z_NV;
    public static final int MAX_TASK_WORK_GROUP_SIZE_X_NV;
    public static final int MAX_TASK_WORK_GROUP_SIZE_Y_NV;
    public static final int MAX_TASK_WORK_GROUP_SIZE_Z_NV;
    public static final int MAX_MESH_VIEW_COUNT_NV;
    public static final int MAX_MESH_OUTPUT_VERTICES_EXT;
    public static final int MAX_MESH_OUTPUT_PRIMITIVES_EXT;
    public static final int MAX_MESH_WORK_GROUP_SIZE_X_EXT;
    public static final int MAX_MESH_WORK_GROUP_SIZE_Y_EXT;
    public static final int MAX_MESH_WORK_GROUP_SIZE_Z_EXT;
    public static final int MAX_TASK_WORK_GROUP_SIZE_X_EXT;
    public static final int MAX_TASK_WORK_GROUP_SIZE_Y_EXT;
    public static final int MAX_TASK_WORK_GROUP_SIZE_Z_EXT;
    public static final int MAX_MESH_VIEW_COUNT_EXT;
    public static final int MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT;
    public static final int LIMITS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(GLSLangLimits.SIZEOF, GLSLangLimits.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAX_LIGHTS = layout.offsetof(0);
        MAX_CLIP_PLANES = layout.offsetof(1);
        MAX_TEXTURE_UNITS = layout.offsetof(2);
        MAX_TEXTURE_COORDS = layout.offsetof(3);
        MAX_VERTEX_ATTRIBS = layout.offsetof(4);
        MAX_VERTEX_UNIFORM_COMPONENTS = layout.offsetof(5);
        MAX_VARYING_FLOATS = layout.offsetof(6);
        MAX_VERTEX_TEXTURE_IMAGE_UNITS = layout.offsetof(7);
        MAX_COMBINED_TEXTURE_IMAGE_UNITS = layout.offsetof(8);
        MAX_TEXTURE_IMAGE_UNITS = layout.offsetof(9);
        MAX_FRAGMENT_UNIFORM_COMPONENTS = layout.offsetof(10);
        MAX_DRAW_BUFFERS = layout.offsetof(11);
        MAX_VERTEX_UNIFORM_VECTORS = layout.offsetof(12);
        MAX_VARYING_VECTORS = layout.offsetof(13);
        MAX_FRAGMENT_UNIFORM_VECTORS = layout.offsetof(14);
        MAX_VERTEX_OUTPUT_VECTORS = layout.offsetof(15);
        MAX_FRAGMENT_INPUT_VECTORS = layout.offsetof(16);
        MIN_PROGRAM_TEXEL_OFFSET = layout.offsetof(17);
        MAX_PROGRAM_TEXEL_OFFSET = layout.offsetof(18);
        MAX_CLIP_DISTANCES = layout.offsetof(19);
        MAX_COMPUTE_WORK_GROUP_COUNT_X = layout.offsetof(20);
        MAX_COMPUTE_WORK_GROUP_COUNT_Y = layout.offsetof(21);
        MAX_COMPUTE_WORK_GROUP_COUNT_Z = layout.offsetof(22);
        MAX_COMPUTE_WORK_GROUP_SIZE_X = layout.offsetof(23);
        MAX_COMPUTE_WORK_GROUP_SIZE_Y = layout.offsetof(24);
        MAX_COMPUTE_WORK_GROUP_SIZE_Z = layout.offsetof(25);
        MAX_COMPUTE_UNIFORM_COMPONENTS = layout.offsetof(26);
        MAX_COMPUTE_TEXTURE_IMAGE_UNITS = layout.offsetof(27);
        MAX_COMPUTE_IMAGE_UNIFORMS = layout.offsetof(28);
        MAX_COMPUTE_ATOMIC_COUNTERS = layout.offsetof(29);
        MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = layout.offsetof(30);
        MAX_VARYING_COMPONENTS = layout.offsetof(31);
        MAX_VERTEX_OUTPUT_COMPONENTS = layout.offsetof(32);
        MAX_GEOMETRY_INPUT_COMPONENTS = layout.offsetof(33);
        MAX_GEOMETRY_OUTPUT_COMPONENTS = layout.offsetof(34);
        MAX_FRAGMENT_INPUT_COMPONENTS = layout.offsetof(35);
        MAX_IMAGE_UNITS = layout.offsetof(36);
        MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = layout.offsetof(37);
        MAX_COMBINED_SHADER_OUTPUT_RESOURCES = layout.offsetof(38);
        MAX_IMAGE_SAMPLES = layout.offsetof(39);
        MAX_VERTEX_IMAGE_UNIFORMS = layout.offsetof(40);
        MAX_TESS_CONTROL_IMAGE_UNIFORMS = layout.offsetof(41);
        MAX_TESS_EVALUATION_IMAGE_UNIFORMS = layout.offsetof(42);
        MAX_GEOMETRY_IMAGE_UNIFORMS = layout.offsetof(43);
        MAX_FRAGMENT_IMAGE_UNIFORMS = layout.offsetof(44);
        MAX_COMBINED_IMAGE_UNIFORMS = layout.offsetof(45);
        MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = layout.offsetof(46);
        MAX_GEOMETRY_OUTPUT_VERTICES = layout.offsetof(47);
        MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = layout.offsetof(48);
        MAX_GEOMETRY_UNIFORM_COMPONENTS = layout.offsetof(49);
        MAX_GEOMETRY_VARYING_COMPONENTS = layout.offsetof(50);
        MAX_TESS_CONTROL_INPUT_COMPONENTS = layout.offsetof(51);
        MAX_TESS_CONTROL_OUTPUT_COMPONENTS = layout.offsetof(52);
        MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = layout.offsetof(53);
        MAX_TESS_CONTROL_UNIFORM_COMPONENTS = layout.offsetof(54);
        MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = layout.offsetof(55);
        MAX_TESS_EVALUATION_INPUT_COMPONENTS = layout.offsetof(56);
        MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = layout.offsetof(57);
        MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = layout.offsetof(58);
        MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = layout.offsetof(59);
        MAX_TESS_PATCH_COMPONENTS = layout.offsetof(60);
        MAX_PATCH_VERTICES = layout.offsetof(61);
        MAX_TESS_GEN_LEVEL = layout.offsetof(62);
        MAX_VIEWPORTS = layout.offsetof(63);
        MAX_VERTEX_ATOMIC_COUNTERS = layout.offsetof(64);
        MAX_TESS_CONTROL_ATOMIC_COUNTERS = layout.offsetof(65);
        MAX_TESS_EVALUATION_ATOMIC_COUNTERS = layout.offsetof(66);
        MAX_GEOMETRY_ATOMIC_COUNTERS = layout.offsetof(67);
        MAX_FRAGMENT_ATOMIC_COUNTERS = layout.offsetof(68);
        MAX_COMBINED_ATOMIC_COUNTERS = layout.offsetof(69);
        MAX_ATOMIC_COUNTER_BINDINGS = layout.offsetof(70);
        MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = layout.offsetof(71);
        MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = layout.offsetof(72);
        MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = layout.offsetof(73);
        MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = layout.offsetof(74);
        MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = layout.offsetof(75);
        MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = layout.offsetof(76);
        MAX_ATOMIC_COUNTER_BUFFER_SIZE = layout.offsetof(77);
        MAX_TRANSFORM_FEEDBACK_BUFFERS = layout.offsetof(78);
        MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = layout.offsetof(79);
        MAX_CULL_DISTANCES = layout.offsetof(80);
        MAX_COMBINED_CLIP_AND_CULL_DISTANCES = layout.offsetof(81);
        MAX_SAMPLES = layout.offsetof(82);
        MAX_MESH_OUTPUT_VERTICES_NV = layout.offsetof(83);
        MAX_MESH_OUTPUT_PRIMITIVES_NV = layout.offsetof(84);
        MAX_MESH_WORK_GROUP_SIZE_X_NV = layout.offsetof(85);
        MAX_MESH_WORK_GROUP_SIZE_Y_NV = layout.offsetof(86);
        MAX_MESH_WORK_GROUP_SIZE_Z_NV = layout.offsetof(87);
        MAX_TASK_WORK_GROUP_SIZE_X_NV = layout.offsetof(88);
        MAX_TASK_WORK_GROUP_SIZE_Y_NV = layout.offsetof(89);
        MAX_TASK_WORK_GROUP_SIZE_Z_NV = layout.offsetof(90);
        MAX_MESH_VIEW_COUNT_NV = layout.offsetof(91);
        MAX_MESH_OUTPUT_VERTICES_EXT = layout.offsetof(92);
        MAX_MESH_OUTPUT_PRIMITIVES_EXT = layout.offsetof(93);
        MAX_MESH_WORK_GROUP_SIZE_X_EXT = layout.offsetof(94);
        MAX_MESH_WORK_GROUP_SIZE_Y_EXT = layout.offsetof(95);
        MAX_MESH_WORK_GROUP_SIZE_Z_EXT = layout.offsetof(96);
        MAX_TASK_WORK_GROUP_SIZE_X_EXT = layout.offsetof(97);
        MAX_TASK_WORK_GROUP_SIZE_Y_EXT = layout.offsetof(98);
        MAX_TASK_WORK_GROUP_SIZE_Z_EXT = layout.offsetof(99);
        MAX_MESH_VIEW_COUNT_EXT = layout.offsetof(100);
        MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT = layout.offsetof(101);
        LIMITS = layout.offsetof(102);
    }

    protected GLSLangResource(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLSLangResource create(long address, ByteBuffer container) {
        return new GLSLangResource(address, container);
    }

    public GLSLangResource(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int max_lights() {
        return nmax_lights(address());
    }

    public int max_clip_planes() {
        return nmax_clip_planes(address());
    }

    public int max_texture_units() {
        return nmax_texture_units(address());
    }

    public int max_texture_coords() {
        return nmax_texture_coords(address());
    }

    public int max_vertex_attribs() {
        return nmax_vertex_attribs(address());
    }

    public int max_vertex_uniform_components() {
        return nmax_vertex_uniform_components(address());
    }

    public int max_varying_floats() {
        return nmax_varying_floats(address());
    }

    public int max_vertex_texture_image_units() {
        return nmax_vertex_texture_image_units(address());
    }

    public int max_combined_texture_image_units() {
        return nmax_combined_texture_image_units(address());
    }

    public int max_texture_image_units() {
        return nmax_texture_image_units(address());
    }

    public int max_fragment_uniform_components() {
        return nmax_fragment_uniform_components(address());
    }

    public int max_draw_buffers() {
        return nmax_draw_buffers(address());
    }

    public int max_vertex_uniform_vectors() {
        return nmax_vertex_uniform_vectors(address());
    }

    public int max_varying_vectors() {
        return nmax_varying_vectors(address());
    }

    public int max_fragment_uniform_vectors() {
        return nmax_fragment_uniform_vectors(address());
    }

    public int max_vertex_output_vectors() {
        return nmax_vertex_output_vectors(address());
    }

    public int max_fragment_input_vectors() {
        return nmax_fragment_input_vectors(address());
    }

    public int min_program_texel_offset() {
        return nmin_program_texel_offset(address());
    }

    public int max_program_texel_offset() {
        return nmax_program_texel_offset(address());
    }

    public int max_clip_distances() {
        return nmax_clip_distances(address());
    }

    public int max_compute_work_group_count_x() {
        return nmax_compute_work_group_count_x(address());
    }

    public int max_compute_work_group_count_y() {
        return nmax_compute_work_group_count_y(address());
    }

    public int max_compute_work_group_count_z() {
        return nmax_compute_work_group_count_z(address());
    }

    public int max_compute_work_group_size_x() {
        return nmax_compute_work_group_size_x(address());
    }

    public int max_compute_work_group_size_y() {
        return nmax_compute_work_group_size_y(address());
    }

    public int max_compute_work_group_size_z() {
        return nmax_compute_work_group_size_z(address());
    }

    public int max_compute_uniform_components() {
        return nmax_compute_uniform_components(address());
    }

    public int max_compute_texture_image_units() {
        return nmax_compute_texture_image_units(address());
    }

    public int max_compute_image_uniforms() {
        return nmax_compute_image_uniforms(address());
    }

    public int max_compute_atomic_counters() {
        return nmax_compute_atomic_counters(address());
    }

    public int max_compute_atomic_counter_buffers() {
        return nmax_compute_atomic_counter_buffers(address());
    }

    public int max_varying_components() {
        return nmax_varying_components(address());
    }

    public int max_vertex_output_components() {
        return nmax_vertex_output_components(address());
    }

    public int max_geometry_input_components() {
        return nmax_geometry_input_components(address());
    }

    public int max_geometry_output_components() {
        return nmax_geometry_output_components(address());
    }

    public int max_fragment_input_components() {
        return nmax_fragment_input_components(address());
    }

    public int max_image_units() {
        return nmax_image_units(address());
    }

    public int max_combined_image_units_and_fragment_outputs() {
        return nmax_combined_image_units_and_fragment_outputs(address());
    }

    public int max_combined_shader_output_resources() {
        return nmax_combined_shader_output_resources(address());
    }

    public int max_image_samples() {
        return nmax_image_samples(address());
    }

    public int max_vertex_image_uniforms() {
        return nmax_vertex_image_uniforms(address());
    }

    public int max_tess_control_image_uniforms() {
        return nmax_tess_control_image_uniforms(address());
    }

    public int max_tess_evaluation_image_uniforms() {
        return nmax_tess_evaluation_image_uniforms(address());
    }

    public int max_geometry_image_uniforms() {
        return nmax_geometry_image_uniforms(address());
    }

    public int max_fragment_image_uniforms() {
        return nmax_fragment_image_uniforms(address());
    }

    public int max_combined_image_uniforms() {
        return nmax_combined_image_uniforms(address());
    }

    public int max_geometry_texture_image_units() {
        return nmax_geometry_texture_image_units(address());
    }

    public int max_geometry_output_vertices() {
        return nmax_geometry_output_vertices(address());
    }

    public int max_geometry_total_output_components() {
        return nmax_geometry_total_output_components(address());
    }

    public int max_geometry_uniform_components() {
        return nmax_geometry_uniform_components(address());
    }

    public int max_geometry_varying_components() {
        return nmax_geometry_varying_components(address());
    }

    public int max_tess_control_input_components() {
        return nmax_tess_control_input_components(address());
    }

    public int max_tess_control_output_components() {
        return nmax_tess_control_output_components(address());
    }

    public int max_tess_control_texture_image_units() {
        return nmax_tess_control_texture_image_units(address());
    }

    public int max_tess_control_uniform_components() {
        return nmax_tess_control_uniform_components(address());
    }

    public int max_tess_control_total_output_components() {
        return nmax_tess_control_total_output_components(address());
    }

    public int max_tess_evaluation_input_components() {
        return nmax_tess_evaluation_input_components(address());
    }

    public int max_tess_evaluation_output_components() {
        return nmax_tess_evaluation_output_components(address());
    }

    public int max_tess_evaluation_texture_image_units() {
        return nmax_tess_evaluation_texture_image_units(address());
    }

    public int max_tess_evaluation_uniform_components() {
        return nmax_tess_evaluation_uniform_components(address());
    }

    public int max_tess_patch_components() {
        return nmax_tess_patch_components(address());
    }

    public int max_patch_vertices() {
        return nmax_patch_vertices(address());
    }

    public int max_tess_gen_level() {
        return nmax_tess_gen_level(address());
    }

    public int max_viewports() {
        return nmax_viewports(address());
    }

    public int max_vertex_atomic_counters() {
        return nmax_vertex_atomic_counters(address());
    }

    public int max_tess_control_atomic_counters() {
        return nmax_tess_control_atomic_counters(address());
    }

    public int max_tess_evaluation_atomic_counters() {
        return nmax_tess_evaluation_atomic_counters(address());
    }

    public int max_geometry_atomic_counters() {
        return nmax_geometry_atomic_counters(address());
    }

    public int max_fragment_atomic_counters() {
        return nmax_fragment_atomic_counters(address());
    }

    public int max_combined_atomic_counters() {
        return nmax_combined_atomic_counters(address());
    }

    public int max_atomic_counter_bindings() {
        return nmax_atomic_counter_bindings(address());
    }

    public int max_vertex_atomic_counter_buffers() {
        return nmax_vertex_atomic_counter_buffers(address());
    }

    public int max_tess_control_atomic_counter_buffers() {
        return nmax_tess_control_atomic_counter_buffers(address());
    }

    public int max_tess_evaluation_atomic_counter_buffers() {
        return nmax_tess_evaluation_atomic_counter_buffers(address());
    }

    public int max_geometry_atomic_counter_buffers() {
        return nmax_geometry_atomic_counter_buffers(address());
    }

    public int max_fragment_atomic_counter_buffers() {
        return nmax_fragment_atomic_counter_buffers(address());
    }

    public int max_combined_atomic_counter_buffers() {
        return nmax_combined_atomic_counter_buffers(address());
    }

    public int max_atomic_counter_buffer_size() {
        return nmax_atomic_counter_buffer_size(address());
    }

    public int max_transform_feedback_buffers() {
        return nmax_transform_feedback_buffers(address());
    }

    public int max_transform_feedback_interleaved_components() {
        return nmax_transform_feedback_interleaved_components(address());
    }

    public int max_cull_distances() {
        return nmax_cull_distances(address());
    }

    public int max_combined_clip_and_cull_distances() {
        return nmax_combined_clip_and_cull_distances(address());
    }

    public int max_samples() {
        return nmax_samples(address());
    }

    public int max_mesh_output_vertices_nv() {
        return nmax_mesh_output_vertices_nv(address());
    }

    public int max_mesh_output_primitives_nv() {
        return nmax_mesh_output_primitives_nv(address());
    }

    public int max_mesh_work_group_size_x_nv() {
        return nmax_mesh_work_group_size_x_nv(address());
    }

    public int max_mesh_work_group_size_y_nv() {
        return nmax_mesh_work_group_size_y_nv(address());
    }

    public int max_mesh_work_group_size_z_nv() {
        return nmax_mesh_work_group_size_z_nv(address());
    }

    public int max_task_work_group_size_x_nv() {
        return nmax_task_work_group_size_x_nv(address());
    }

    public int max_task_work_group_size_y_nv() {
        return nmax_task_work_group_size_y_nv(address());
    }

    public int max_task_work_group_size_z_nv() {
        return nmax_task_work_group_size_z_nv(address());
    }

    public int max_mesh_view_count_nv() {
        return nmax_mesh_view_count_nv(address());
    }

    public int max_mesh_output_vertices_ext() {
        return nmax_mesh_output_vertices_ext(address());
    }

    public int max_mesh_output_primitives_ext() {
        return nmax_mesh_output_primitives_ext(address());
    }

    public int max_mesh_work_group_size_x_ext() {
        return nmax_mesh_work_group_size_x_ext(address());
    }

    public int max_mesh_work_group_size_y_ext() {
        return nmax_mesh_work_group_size_y_ext(address());
    }

    public int max_mesh_work_group_size_z_ext() {
        return nmax_mesh_work_group_size_z_ext(address());
    }

    public int max_task_work_group_size_x_ext() {
        return nmax_task_work_group_size_x_ext(address());
    }

    public int max_task_work_group_size_y_ext() {
        return nmax_task_work_group_size_y_ext(address());
    }

    public int max_task_work_group_size_z_ext() {
        return nmax_task_work_group_size_z_ext(address());
    }

    public int max_mesh_view_count_ext() {
        return nmax_mesh_view_count_ext(address());
    }

    public int max_dual_source_draw_buffers_ext() {
        return nmax_dual_source_draw_buffers_ext(address());
    }

    @NativeType("glslang_limits_t")
    public GLSLangLimits limits() {
        return nlimits(address());
    }

    public GLSLangResource max_lights(int value) {
        nmax_lights(address(), value);
        return this;
    }

    public GLSLangResource max_clip_planes(int value) {
        nmax_clip_planes(address(), value);
        return this;
    }

    public GLSLangResource max_texture_units(int value) {
        nmax_texture_units(address(), value);
        return this;
    }

    public GLSLangResource max_texture_coords(int value) {
        nmax_texture_coords(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_attribs(int value) {
        nmax_vertex_attribs(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_uniform_components(int value) {
        nmax_vertex_uniform_components(address(), value);
        return this;
    }

    public GLSLangResource max_varying_floats(int value) {
        nmax_varying_floats(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_texture_image_units(int value) {
        nmax_vertex_texture_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_combined_texture_image_units(int value) {
        nmax_combined_texture_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_texture_image_units(int value) {
        nmax_texture_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_fragment_uniform_components(int value) {
        nmax_fragment_uniform_components(address(), value);
        return this;
    }

    public GLSLangResource max_draw_buffers(int value) {
        nmax_draw_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_uniform_vectors(int value) {
        nmax_vertex_uniform_vectors(address(), value);
        return this;
    }

    public GLSLangResource max_varying_vectors(int value) {
        nmax_varying_vectors(address(), value);
        return this;
    }

    public GLSLangResource max_fragment_uniform_vectors(int value) {
        nmax_fragment_uniform_vectors(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_output_vectors(int value) {
        nmax_vertex_output_vectors(address(), value);
        return this;
    }

    public GLSLangResource max_fragment_input_vectors(int value) {
        nmax_fragment_input_vectors(address(), value);
        return this;
    }

    public GLSLangResource min_program_texel_offset(int value) {
        nmin_program_texel_offset(address(), value);
        return this;
    }

    public GLSLangResource max_program_texel_offset(int value) {
        nmax_program_texel_offset(address(), value);
        return this;
    }

    public GLSLangResource max_clip_distances(int value) {
        nmax_clip_distances(address(), value);
        return this;
    }

    public GLSLangResource max_compute_work_group_count_x(int value) {
        nmax_compute_work_group_count_x(address(), value);
        return this;
    }

    public GLSLangResource max_compute_work_group_count_y(int value) {
        nmax_compute_work_group_count_y(address(), value);
        return this;
    }

    public GLSLangResource max_compute_work_group_count_z(int value) {
        nmax_compute_work_group_count_z(address(), value);
        return this;
    }

    public GLSLangResource max_compute_work_group_size_x(int value) {
        nmax_compute_work_group_size_x(address(), value);
        return this;
    }

    public GLSLangResource max_compute_work_group_size_y(int value) {
        nmax_compute_work_group_size_y(address(), value);
        return this;
    }

    public GLSLangResource max_compute_work_group_size_z(int value) {
        nmax_compute_work_group_size_z(address(), value);
        return this;
    }

    public GLSLangResource max_compute_uniform_components(int value) {
        nmax_compute_uniform_components(address(), value);
        return this;
    }

    public GLSLangResource max_compute_texture_image_units(int value) {
        nmax_compute_texture_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_compute_image_uniforms(int value) {
        nmax_compute_image_uniforms(address(), value);
        return this;
    }

    public GLSLangResource max_compute_atomic_counters(int value) {
        nmax_compute_atomic_counters(address(), value);
        return this;
    }

    public GLSLangResource max_compute_atomic_counter_buffers(int value) {
        nmax_compute_atomic_counter_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_varying_components(int value) {
        nmax_varying_components(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_output_components(int value) {
        nmax_vertex_output_components(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_input_components(int value) {
        nmax_geometry_input_components(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_output_components(int value) {
        nmax_geometry_output_components(address(), value);
        return this;
    }

    public GLSLangResource max_fragment_input_components(int value) {
        nmax_fragment_input_components(address(), value);
        return this;
    }

    public GLSLangResource max_image_units(int value) {
        nmax_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_combined_image_units_and_fragment_outputs(int value) {
        nmax_combined_image_units_and_fragment_outputs(address(), value);
        return this;
    }

    public GLSLangResource max_combined_shader_output_resources(int value) {
        nmax_combined_shader_output_resources(address(), value);
        return this;
    }

    public GLSLangResource max_image_samples(int value) {
        nmax_image_samples(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_image_uniforms(int value) {
        nmax_vertex_image_uniforms(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_image_uniforms(int value) {
        nmax_tess_control_image_uniforms(address(), value);
        return this;
    }

    public GLSLangResource max_tess_evaluation_image_uniforms(int value) {
        nmax_tess_evaluation_image_uniforms(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_image_uniforms(int value) {
        nmax_geometry_image_uniforms(address(), value);
        return this;
    }

    public GLSLangResource max_fragment_image_uniforms(int value) {
        nmax_fragment_image_uniforms(address(), value);
        return this;
    }

    public GLSLangResource max_combined_image_uniforms(int value) {
        nmax_combined_image_uniforms(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_texture_image_units(int value) {
        nmax_geometry_texture_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_output_vertices(int value) {
        nmax_geometry_output_vertices(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_total_output_components(int value) {
        nmax_geometry_total_output_components(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_uniform_components(int value) {
        nmax_geometry_uniform_components(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_varying_components(int value) {
        nmax_geometry_varying_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_input_components(int value) {
        nmax_tess_control_input_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_output_components(int value) {
        nmax_tess_control_output_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_texture_image_units(int value) {
        nmax_tess_control_texture_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_uniform_components(int value) {
        nmax_tess_control_uniform_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_total_output_components(int value) {
        nmax_tess_control_total_output_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_evaluation_input_components(int value) {
        nmax_tess_evaluation_input_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_evaluation_output_components(int value) {
        nmax_tess_evaluation_output_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_evaluation_texture_image_units(int value) {
        nmax_tess_evaluation_texture_image_units(address(), value);
        return this;
    }

    public GLSLangResource max_tess_evaluation_uniform_components(int value) {
        nmax_tess_evaluation_uniform_components(address(), value);
        return this;
    }

    public GLSLangResource max_tess_patch_components(int value) {
        nmax_tess_patch_components(address(), value);
        return this;
    }

    public GLSLangResource max_patch_vertices(int value) {
        nmax_patch_vertices(address(), value);
        return this;
    }

    public GLSLangResource max_tess_gen_level(int value) {
        nmax_tess_gen_level(address(), value);
        return this;
    }

    public GLSLangResource max_viewports(int value) {
        nmax_viewports(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_atomic_counters(int value) {
        nmax_vertex_atomic_counters(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_atomic_counters(int value) {
        nmax_tess_control_atomic_counters(address(), value);
        return this;
    }

    public GLSLangResource max_tess_evaluation_atomic_counters(int value) {
        nmax_tess_evaluation_atomic_counters(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_atomic_counters(int value) {
        nmax_geometry_atomic_counters(address(), value);
        return this;
    }

    public GLSLangResource max_fragment_atomic_counters(int value) {
        nmax_fragment_atomic_counters(address(), value);
        return this;
    }

    public GLSLangResource max_combined_atomic_counters(int value) {
        nmax_combined_atomic_counters(address(), value);
        return this;
    }

    public GLSLangResource max_atomic_counter_bindings(int value) {
        nmax_atomic_counter_bindings(address(), value);
        return this;
    }

    public GLSLangResource max_vertex_atomic_counter_buffers(int value) {
        nmax_vertex_atomic_counter_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_tess_control_atomic_counter_buffers(int value) {
        nmax_tess_control_atomic_counter_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_tess_evaluation_atomic_counter_buffers(int value) {
        nmax_tess_evaluation_atomic_counter_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_geometry_atomic_counter_buffers(int value) {
        nmax_geometry_atomic_counter_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_fragment_atomic_counter_buffers(int value) {
        nmax_fragment_atomic_counter_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_combined_atomic_counter_buffers(int value) {
        nmax_combined_atomic_counter_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_atomic_counter_buffer_size(int value) {
        nmax_atomic_counter_buffer_size(address(), value);
        return this;
    }

    public GLSLangResource max_transform_feedback_buffers(int value) {
        nmax_transform_feedback_buffers(address(), value);
        return this;
    }

    public GLSLangResource max_transform_feedback_interleaved_components(int value) {
        nmax_transform_feedback_interleaved_components(address(), value);
        return this;
    }

    public GLSLangResource max_cull_distances(int value) {
        nmax_cull_distances(address(), value);
        return this;
    }

    public GLSLangResource max_combined_clip_and_cull_distances(int value) {
        nmax_combined_clip_and_cull_distances(address(), value);
        return this;
    }

    public GLSLangResource max_samples(int value) {
        nmax_samples(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_output_vertices_nv(int value) {
        nmax_mesh_output_vertices_nv(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_output_primitives_nv(int value) {
        nmax_mesh_output_primitives_nv(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_work_group_size_x_nv(int value) {
        nmax_mesh_work_group_size_x_nv(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_work_group_size_y_nv(int value) {
        nmax_mesh_work_group_size_y_nv(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_work_group_size_z_nv(int value) {
        nmax_mesh_work_group_size_z_nv(address(), value);
        return this;
    }

    public GLSLangResource max_task_work_group_size_x_nv(int value) {
        nmax_task_work_group_size_x_nv(address(), value);
        return this;
    }

    public GLSLangResource max_task_work_group_size_y_nv(int value) {
        nmax_task_work_group_size_y_nv(address(), value);
        return this;
    }

    public GLSLangResource max_task_work_group_size_z_nv(int value) {
        nmax_task_work_group_size_z_nv(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_view_count_nv(int value) {
        nmax_mesh_view_count_nv(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_output_vertices_ext(int value) {
        nmax_mesh_output_vertices_ext(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_output_primitives_ext(int value) {
        nmax_mesh_output_primitives_ext(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_work_group_size_x_ext(int value) {
        nmax_mesh_work_group_size_x_ext(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_work_group_size_y_ext(int value) {
        nmax_mesh_work_group_size_y_ext(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_work_group_size_z_ext(int value) {
        nmax_mesh_work_group_size_z_ext(address(), value);
        return this;
    }

    public GLSLangResource max_task_work_group_size_x_ext(int value) {
        nmax_task_work_group_size_x_ext(address(), value);
        return this;
    }

    public GLSLangResource max_task_work_group_size_y_ext(int value) {
        nmax_task_work_group_size_y_ext(address(), value);
        return this;
    }

    public GLSLangResource max_task_work_group_size_z_ext(int value) {
        nmax_task_work_group_size_z_ext(address(), value);
        return this;
    }

    public GLSLangResource max_mesh_view_count_ext(int value) {
        nmax_mesh_view_count_ext(address(), value);
        return this;
    }

    public GLSLangResource max_dual_source_draw_buffers_ext(int value) {
        nmax_dual_source_draw_buffers_ext(address(), value);
        return this;
    }

    public GLSLangResource limits(@NativeType("glslang_limits_t") GLSLangLimits value) {
        nlimits(address(), value);
        return this;
    }

    public GLSLangResource limits(Consumer<GLSLangLimits> consumer) {
        consumer.accept(limits());
        return this;
    }

    public GLSLangResource set(int max_lights, int max_clip_planes, int max_texture_units, int max_texture_coords, int max_vertex_attribs, int max_vertex_uniform_components, int max_varying_floats, int max_vertex_texture_image_units, int max_combined_texture_image_units, int max_texture_image_units, int max_fragment_uniform_components, int max_draw_buffers, int max_vertex_uniform_vectors, int max_varying_vectors, int max_fragment_uniform_vectors, int max_vertex_output_vectors, int max_fragment_input_vectors, int min_program_texel_offset, int max_program_texel_offset, int max_clip_distances, int max_compute_work_group_count_x, int max_compute_work_group_count_y, int max_compute_work_group_count_z, int max_compute_work_group_size_x, int max_compute_work_group_size_y, int max_compute_work_group_size_z, int max_compute_uniform_components, int max_compute_texture_image_units, int max_compute_image_uniforms, int max_compute_atomic_counters, int max_compute_atomic_counter_buffers, int max_varying_components, int max_vertex_output_components, int max_geometry_input_components, int max_geometry_output_components, int max_fragment_input_components, int max_image_units, int max_combined_image_units_and_fragment_outputs, int max_combined_shader_output_resources, int max_image_samples, int max_vertex_image_uniforms, int max_tess_control_image_uniforms, int max_tess_evaluation_image_uniforms, int max_geometry_image_uniforms, int max_fragment_image_uniforms, int max_combined_image_uniforms, int max_geometry_texture_image_units, int max_geometry_output_vertices, int max_geometry_total_output_components, int max_geometry_uniform_components, int max_geometry_varying_components, int max_tess_control_input_components, int max_tess_control_output_components, int max_tess_control_texture_image_units, int max_tess_control_uniform_components, int max_tess_control_total_output_components, int max_tess_evaluation_input_components, int max_tess_evaluation_output_components, int max_tess_evaluation_texture_image_units, int max_tess_evaluation_uniform_components, int max_tess_patch_components, int max_patch_vertices, int max_tess_gen_level, int max_viewports, int max_vertex_atomic_counters, int max_tess_control_atomic_counters, int max_tess_evaluation_atomic_counters, int max_geometry_atomic_counters, int max_fragment_atomic_counters, int max_combined_atomic_counters, int max_atomic_counter_bindings, int max_vertex_atomic_counter_buffers, int max_tess_control_atomic_counter_buffers, int max_tess_evaluation_atomic_counter_buffers, int max_geometry_atomic_counter_buffers, int max_fragment_atomic_counter_buffers, int max_combined_atomic_counter_buffers, int max_atomic_counter_buffer_size, int max_transform_feedback_buffers, int max_transform_feedback_interleaved_components, int max_cull_distances, int max_combined_clip_and_cull_distances, int max_samples, int max_mesh_output_vertices_nv, int max_mesh_output_primitives_nv, int max_mesh_work_group_size_x_nv, int max_mesh_work_group_size_y_nv, int max_mesh_work_group_size_z_nv, int max_task_work_group_size_x_nv, int max_task_work_group_size_y_nv, int max_task_work_group_size_z_nv, int max_mesh_view_count_nv, int max_mesh_output_vertices_ext, int max_mesh_output_primitives_ext, int max_mesh_work_group_size_x_ext, int max_mesh_work_group_size_y_ext, int max_mesh_work_group_size_z_ext, int max_task_work_group_size_x_ext, int max_task_work_group_size_y_ext, int max_task_work_group_size_z_ext, int max_mesh_view_count_ext, int max_dual_source_draw_buffers_ext, GLSLangLimits limits) {
        max_lights(max_lights);
        max_clip_planes(max_clip_planes);
        max_texture_units(max_texture_units);
        max_texture_coords(max_texture_coords);
        max_vertex_attribs(max_vertex_attribs);
        max_vertex_uniform_components(max_vertex_uniform_components);
        max_varying_floats(max_varying_floats);
        max_vertex_texture_image_units(max_vertex_texture_image_units);
        max_combined_texture_image_units(max_combined_texture_image_units);
        max_texture_image_units(max_texture_image_units);
        max_fragment_uniform_components(max_fragment_uniform_components);
        max_draw_buffers(max_draw_buffers);
        max_vertex_uniform_vectors(max_vertex_uniform_vectors);
        max_varying_vectors(max_varying_vectors);
        max_fragment_uniform_vectors(max_fragment_uniform_vectors);
        max_vertex_output_vectors(max_vertex_output_vectors);
        max_fragment_input_vectors(max_fragment_input_vectors);
        min_program_texel_offset(min_program_texel_offset);
        max_program_texel_offset(max_program_texel_offset);
        max_clip_distances(max_clip_distances);
        max_compute_work_group_count_x(max_compute_work_group_count_x);
        max_compute_work_group_count_y(max_compute_work_group_count_y);
        max_compute_work_group_count_z(max_compute_work_group_count_z);
        max_compute_work_group_size_x(max_compute_work_group_size_x);
        max_compute_work_group_size_y(max_compute_work_group_size_y);
        max_compute_work_group_size_z(max_compute_work_group_size_z);
        max_compute_uniform_components(max_compute_uniform_components);
        max_compute_texture_image_units(max_compute_texture_image_units);
        max_compute_image_uniforms(max_compute_image_uniforms);
        max_compute_atomic_counters(max_compute_atomic_counters);
        max_compute_atomic_counter_buffers(max_compute_atomic_counter_buffers);
        max_varying_components(max_varying_components);
        max_vertex_output_components(max_vertex_output_components);
        max_geometry_input_components(max_geometry_input_components);
        max_geometry_output_components(max_geometry_output_components);
        max_fragment_input_components(max_fragment_input_components);
        max_image_units(max_image_units);
        max_combined_image_units_and_fragment_outputs(max_combined_image_units_and_fragment_outputs);
        max_combined_shader_output_resources(max_combined_shader_output_resources);
        max_image_samples(max_image_samples);
        max_vertex_image_uniforms(max_vertex_image_uniforms);
        max_tess_control_image_uniforms(max_tess_control_image_uniforms);
        max_tess_evaluation_image_uniforms(max_tess_evaluation_image_uniforms);
        max_geometry_image_uniforms(max_geometry_image_uniforms);
        max_fragment_image_uniforms(max_fragment_image_uniforms);
        max_combined_image_uniforms(max_combined_image_uniforms);
        max_geometry_texture_image_units(max_geometry_texture_image_units);
        max_geometry_output_vertices(max_geometry_output_vertices);
        max_geometry_total_output_components(max_geometry_total_output_components);
        max_geometry_uniform_components(max_geometry_uniform_components);
        max_geometry_varying_components(max_geometry_varying_components);
        max_tess_control_input_components(max_tess_control_input_components);
        max_tess_control_output_components(max_tess_control_output_components);
        max_tess_control_texture_image_units(max_tess_control_texture_image_units);
        max_tess_control_uniform_components(max_tess_control_uniform_components);
        max_tess_control_total_output_components(max_tess_control_total_output_components);
        max_tess_evaluation_input_components(max_tess_evaluation_input_components);
        max_tess_evaluation_output_components(max_tess_evaluation_output_components);
        max_tess_evaluation_texture_image_units(max_tess_evaluation_texture_image_units);
        max_tess_evaluation_uniform_components(max_tess_evaluation_uniform_components);
        max_tess_patch_components(max_tess_patch_components);
        max_patch_vertices(max_patch_vertices);
        max_tess_gen_level(max_tess_gen_level);
        max_viewports(max_viewports);
        max_vertex_atomic_counters(max_vertex_atomic_counters);
        max_tess_control_atomic_counters(max_tess_control_atomic_counters);
        max_tess_evaluation_atomic_counters(max_tess_evaluation_atomic_counters);
        max_geometry_atomic_counters(max_geometry_atomic_counters);
        max_fragment_atomic_counters(max_fragment_atomic_counters);
        max_combined_atomic_counters(max_combined_atomic_counters);
        max_atomic_counter_bindings(max_atomic_counter_bindings);
        max_vertex_atomic_counter_buffers(max_vertex_atomic_counter_buffers);
        max_tess_control_atomic_counter_buffers(max_tess_control_atomic_counter_buffers);
        max_tess_evaluation_atomic_counter_buffers(max_tess_evaluation_atomic_counter_buffers);
        max_geometry_atomic_counter_buffers(max_geometry_atomic_counter_buffers);
        max_fragment_atomic_counter_buffers(max_fragment_atomic_counter_buffers);
        max_combined_atomic_counter_buffers(max_combined_atomic_counter_buffers);
        max_atomic_counter_buffer_size(max_atomic_counter_buffer_size);
        max_transform_feedback_buffers(max_transform_feedback_buffers);
        max_transform_feedback_interleaved_components(max_transform_feedback_interleaved_components);
        max_cull_distances(max_cull_distances);
        max_combined_clip_and_cull_distances(max_combined_clip_and_cull_distances);
        max_samples(max_samples);
        max_mesh_output_vertices_nv(max_mesh_output_vertices_nv);
        max_mesh_output_primitives_nv(max_mesh_output_primitives_nv);
        max_mesh_work_group_size_x_nv(max_mesh_work_group_size_x_nv);
        max_mesh_work_group_size_y_nv(max_mesh_work_group_size_y_nv);
        max_mesh_work_group_size_z_nv(max_mesh_work_group_size_z_nv);
        max_task_work_group_size_x_nv(max_task_work_group_size_x_nv);
        max_task_work_group_size_y_nv(max_task_work_group_size_y_nv);
        max_task_work_group_size_z_nv(max_task_work_group_size_z_nv);
        max_mesh_view_count_nv(max_mesh_view_count_nv);
        max_mesh_output_vertices_ext(max_mesh_output_vertices_ext);
        max_mesh_output_primitives_ext(max_mesh_output_primitives_ext);
        max_mesh_work_group_size_x_ext(max_mesh_work_group_size_x_ext);
        max_mesh_work_group_size_y_ext(max_mesh_work_group_size_y_ext);
        max_mesh_work_group_size_z_ext(max_mesh_work_group_size_z_ext);
        max_task_work_group_size_x_ext(max_task_work_group_size_x_ext);
        max_task_work_group_size_y_ext(max_task_work_group_size_y_ext);
        max_task_work_group_size_z_ext(max_task_work_group_size_z_ext);
        max_mesh_view_count_ext(max_mesh_view_count_ext);
        max_dual_source_draw_buffers_ext(max_dual_source_draw_buffers_ext);
        limits(limits);
        return this;
    }

    public GLSLangResource set(GLSLangResource src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLSLangResource malloc() {
        return new GLSLangResource(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLSLangResource calloc() {
        return new GLSLangResource(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLSLangResource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangResource(MemoryUtil.memAddress(container), container);
    }

    public static GLSLangResource create(long address) {
        return new GLSLangResource(address, null);
    }

    public static GLSLangResource createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLSLangResource(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static GLSLangResource malloc(MemoryStack stack) {
        return new GLSLangResource(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLSLangResource calloc(MemoryStack stack) {
        return new GLSLangResource(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmax_lights(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_LIGHTS);
    }

    public static int nmax_clip_planes(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_CLIP_PLANES);
    }

    public static int nmax_texture_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TEXTURE_UNITS);
    }

    public static int nmax_texture_coords(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TEXTURE_COORDS);
    }

    public static int nmax_vertex_attribs(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_ATTRIBS);
    }

    public static int nmax_vertex_uniform_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_UNIFORM_COMPONENTS);
    }

    public static int nmax_varying_floats(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VARYING_FLOATS);
    }

    public static int nmax_vertex_texture_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_TEXTURE_IMAGE_UNITS);
    }

    public static int nmax_combined_texture_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMBINED_TEXTURE_IMAGE_UNITS);
    }

    public static int nmax_texture_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TEXTURE_IMAGE_UNITS);
    }

    public static int nmax_fragment_uniform_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAGMENT_UNIFORM_COMPONENTS);
    }

    public static int nmax_draw_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_DRAW_BUFFERS);
    }

    public static int nmax_vertex_uniform_vectors(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_UNIFORM_VECTORS);
    }

    public static int nmax_varying_vectors(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VARYING_VECTORS);
    }

    public static int nmax_fragment_uniform_vectors(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAGMENT_UNIFORM_VECTORS);
    }

    public static int nmax_vertex_output_vectors(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_OUTPUT_VECTORS);
    }

    public static int nmax_fragment_input_vectors(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAGMENT_INPUT_VECTORS);
    }

    public static int nmin_program_texel_offset(long struct) {
        return MemoryUtil.memGetInt(struct + MIN_PROGRAM_TEXEL_OFFSET);
    }

    public static int nmax_program_texel_offset(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_PROGRAM_TEXEL_OFFSET);
    }

    public static int nmax_clip_distances(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_CLIP_DISTANCES);
    }

    public static int nmax_compute_work_group_count_x(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_WORK_GROUP_COUNT_X);
    }

    public static int nmax_compute_work_group_count_y(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_WORK_GROUP_COUNT_Y);
    }

    public static int nmax_compute_work_group_count_z(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_WORK_GROUP_COUNT_Z);
    }

    public static int nmax_compute_work_group_size_x(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_WORK_GROUP_SIZE_X);
    }

    public static int nmax_compute_work_group_size_y(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_WORK_GROUP_SIZE_Y);
    }

    public static int nmax_compute_work_group_size_z(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_WORK_GROUP_SIZE_Z);
    }

    public static int nmax_compute_uniform_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_UNIFORM_COMPONENTS);
    }

    public static int nmax_compute_texture_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_TEXTURE_IMAGE_UNITS);
    }

    public static int nmax_compute_image_uniforms(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_IMAGE_UNIFORMS);
    }

    public static int nmax_compute_atomic_counters(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_ATOMIC_COUNTERS);
    }

    public static int nmax_compute_atomic_counter_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS);
    }

    public static int nmax_varying_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VARYING_COMPONENTS);
    }

    public static int nmax_vertex_output_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_OUTPUT_COMPONENTS);
    }

    public static int nmax_geometry_input_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_INPUT_COMPONENTS);
    }

    public static int nmax_geometry_output_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_OUTPUT_COMPONENTS);
    }

    public static int nmax_fragment_input_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAGMENT_INPUT_COMPONENTS);
    }

    public static int nmax_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_IMAGE_UNITS);
    }

    public static int nmax_combined_image_units_and_fragment_outputs(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS);
    }

    public static int nmax_combined_shader_output_resources(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMBINED_SHADER_OUTPUT_RESOURCES);
    }

    public static int nmax_image_samples(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_IMAGE_SAMPLES);
    }

    public static int nmax_vertex_image_uniforms(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_IMAGE_UNIFORMS);
    }

    public static int nmax_tess_control_image_uniforms(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_IMAGE_UNIFORMS);
    }

    public static int nmax_tess_evaluation_image_uniforms(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_EVALUATION_IMAGE_UNIFORMS);
    }

    public static int nmax_geometry_image_uniforms(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_IMAGE_UNIFORMS);
    }

    public static int nmax_fragment_image_uniforms(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAGMENT_IMAGE_UNIFORMS);
    }

    public static int nmax_combined_image_uniforms(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMBINED_IMAGE_UNIFORMS);
    }

    public static int nmax_geometry_texture_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_TEXTURE_IMAGE_UNITS);
    }

    public static int nmax_geometry_output_vertices(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_OUTPUT_VERTICES);
    }

    public static int nmax_geometry_total_output_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS);
    }

    public static int nmax_geometry_uniform_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_UNIFORM_COMPONENTS);
    }

    public static int nmax_geometry_varying_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_VARYING_COMPONENTS);
    }

    public static int nmax_tess_control_input_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_INPUT_COMPONENTS);
    }

    public static int nmax_tess_control_output_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_OUTPUT_COMPONENTS);
    }

    public static int nmax_tess_control_texture_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS);
    }

    public static int nmax_tess_control_uniform_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_UNIFORM_COMPONENTS);
    }

    public static int nmax_tess_control_total_output_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS);
    }

    public static int nmax_tess_evaluation_input_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_EVALUATION_INPUT_COMPONENTS);
    }

    public static int nmax_tess_evaluation_output_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_EVALUATION_OUTPUT_COMPONENTS);
    }

    public static int nmax_tess_evaluation_texture_image_units(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS);
    }

    public static int nmax_tess_evaluation_uniform_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_EVALUATION_UNIFORM_COMPONENTS);
    }

    public static int nmax_tess_patch_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_PATCH_COMPONENTS);
    }

    public static int nmax_patch_vertices(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_PATCH_VERTICES);
    }

    public static int nmax_tess_gen_level(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_GEN_LEVEL);
    }

    public static int nmax_viewports(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VIEWPORTS);
    }

    public static int nmax_vertex_atomic_counters(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_ATOMIC_COUNTERS);
    }

    public static int nmax_tess_control_atomic_counters(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_ATOMIC_COUNTERS);
    }

    public static int nmax_tess_evaluation_atomic_counters(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_EVALUATION_ATOMIC_COUNTERS);
    }

    public static int nmax_geometry_atomic_counters(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_ATOMIC_COUNTERS);
    }

    public static int nmax_fragment_atomic_counters(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAGMENT_ATOMIC_COUNTERS);
    }

    public static int nmax_combined_atomic_counters(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMBINED_ATOMIC_COUNTERS);
    }

    public static int nmax_atomic_counter_bindings(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_ATOMIC_COUNTER_BINDINGS);
    }

    public static int nmax_vertex_atomic_counter_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_VERTEX_ATOMIC_COUNTER_BUFFERS);
    }

    public static int nmax_tess_control_atomic_counter_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS);
    }

    public static int nmax_tess_evaluation_atomic_counter_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS);
    }

    public static int nmax_geometry_atomic_counter_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS);
    }

    public static int nmax_fragment_atomic_counter_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS);
    }

    public static int nmax_combined_atomic_counter_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMBINED_ATOMIC_COUNTER_BUFFERS);
    }

    public static int nmax_atomic_counter_buffer_size(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_ATOMIC_COUNTER_BUFFER_SIZE);
    }

    public static int nmax_transform_feedback_buffers(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TRANSFORM_FEEDBACK_BUFFERS);
    }

    public static int nmax_transform_feedback_interleaved_components(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS);
    }

    public static int nmax_cull_distances(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_CULL_DISTANCES);
    }

    public static int nmax_combined_clip_and_cull_distances(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_COMBINED_CLIP_AND_CULL_DISTANCES);
    }

    public static int nmax_samples(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_SAMPLES);
    }

    public static int nmax_mesh_output_vertices_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_OUTPUT_VERTICES_NV);
    }

    public static int nmax_mesh_output_primitives_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_OUTPUT_PRIMITIVES_NV);
    }

    public static int nmax_mesh_work_group_size_x_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_WORK_GROUP_SIZE_X_NV);
    }

    public static int nmax_mesh_work_group_size_y_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_WORK_GROUP_SIZE_Y_NV);
    }

    public static int nmax_mesh_work_group_size_z_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_WORK_GROUP_SIZE_Z_NV);
    }

    public static int nmax_task_work_group_size_x_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TASK_WORK_GROUP_SIZE_X_NV);
    }

    public static int nmax_task_work_group_size_y_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TASK_WORK_GROUP_SIZE_Y_NV);
    }

    public static int nmax_task_work_group_size_z_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TASK_WORK_GROUP_SIZE_Z_NV);
    }

    public static int nmax_mesh_view_count_nv(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_VIEW_COUNT_NV);
    }

    public static int nmax_mesh_output_vertices_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_OUTPUT_VERTICES_EXT);
    }

    public static int nmax_mesh_output_primitives_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_OUTPUT_PRIMITIVES_EXT);
    }

    public static int nmax_mesh_work_group_size_x_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_WORK_GROUP_SIZE_X_EXT);
    }

    public static int nmax_mesh_work_group_size_y_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_WORK_GROUP_SIZE_Y_EXT);
    }

    public static int nmax_mesh_work_group_size_z_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_WORK_GROUP_SIZE_Z_EXT);
    }

    public static int nmax_task_work_group_size_x_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TASK_WORK_GROUP_SIZE_X_EXT);
    }

    public static int nmax_task_work_group_size_y_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TASK_WORK_GROUP_SIZE_Y_EXT);
    }

    public static int nmax_task_work_group_size_z_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_TASK_WORK_GROUP_SIZE_Z_EXT);
    }

    public static int nmax_mesh_view_count_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_MESH_VIEW_COUNT_EXT);
    }

    public static int nmax_dual_source_draw_buffers_ext(long struct) {
        return MemoryUtil.memGetInt(struct + MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT);
    }

    public static GLSLangLimits nlimits(long struct) {
        return GLSLangLimits.create(struct + LIMITS);
    }

    public static void nmax_lights(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_LIGHTS, value);
    }

    public static void nmax_clip_planes(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_CLIP_PLANES, value);
    }

    public static void nmax_texture_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TEXTURE_UNITS, value);
    }

    public static void nmax_texture_coords(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TEXTURE_COORDS, value);
    }

    public static void nmax_vertex_attribs(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_ATTRIBS, value);
    }

    public static void nmax_vertex_uniform_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_UNIFORM_COMPONENTS, value);
    }

    public static void nmax_varying_floats(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VARYING_FLOATS, value);
    }

    public static void nmax_vertex_texture_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_TEXTURE_IMAGE_UNITS, value);
    }

    public static void nmax_combined_texture_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMBINED_TEXTURE_IMAGE_UNITS, value);
    }

    public static void nmax_texture_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TEXTURE_IMAGE_UNITS, value);
    }

    public static void nmax_fragment_uniform_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_FRAGMENT_UNIFORM_COMPONENTS, value);
    }

    public static void nmax_draw_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_DRAW_BUFFERS, value);
    }

    public static void nmax_vertex_uniform_vectors(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_UNIFORM_VECTORS, value);
    }

    public static void nmax_varying_vectors(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VARYING_VECTORS, value);
    }

    public static void nmax_fragment_uniform_vectors(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_FRAGMENT_UNIFORM_VECTORS, value);
    }

    public static void nmax_vertex_output_vectors(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_OUTPUT_VECTORS, value);
    }

    public static void nmax_fragment_input_vectors(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_FRAGMENT_INPUT_VECTORS, value);
    }

    public static void nmin_program_texel_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIN_PROGRAM_TEXEL_OFFSET, value);
    }

    public static void nmax_program_texel_offset(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_PROGRAM_TEXEL_OFFSET, value);
    }

    public static void nmax_clip_distances(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_CLIP_DISTANCES, value);
    }

    public static void nmax_compute_work_group_count_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_WORK_GROUP_COUNT_X, value);
    }

    public static void nmax_compute_work_group_count_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_WORK_GROUP_COUNT_Y, value);
    }

    public static void nmax_compute_work_group_count_z(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_WORK_GROUP_COUNT_Z, value);
    }

    public static void nmax_compute_work_group_size_x(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_WORK_GROUP_SIZE_X, value);
    }

    public static void nmax_compute_work_group_size_y(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_WORK_GROUP_SIZE_Y, value);
    }

    public static void nmax_compute_work_group_size_z(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_WORK_GROUP_SIZE_Z, value);
    }

    public static void nmax_compute_uniform_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_UNIFORM_COMPONENTS, value);
    }

    public static void nmax_compute_texture_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_TEXTURE_IMAGE_UNITS, value);
    }

    public static void nmax_compute_image_uniforms(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_IMAGE_UNIFORMS, value);
    }

    public static void nmax_compute_atomic_counters(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_ATOMIC_COUNTERS, value);
    }

    public static void nmax_compute_atomic_counter_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS, value);
    }

    public static void nmax_varying_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VARYING_COMPONENTS, value);
    }

    public static void nmax_vertex_output_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_OUTPUT_COMPONENTS, value);
    }

    public static void nmax_geometry_input_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_INPUT_COMPONENTS, value);
    }

    public static void nmax_geometry_output_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_OUTPUT_COMPONENTS, value);
    }

    public static void nmax_fragment_input_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_FRAGMENT_INPUT_COMPONENTS, value);
    }

    public static void nmax_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_IMAGE_UNITS, value);
    }

    public static void nmax_combined_image_units_and_fragment_outputs(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS, value);
    }

    public static void nmax_combined_shader_output_resources(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMBINED_SHADER_OUTPUT_RESOURCES, value);
    }

    public static void nmax_image_samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_IMAGE_SAMPLES, value);
    }

    public static void nmax_vertex_image_uniforms(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_IMAGE_UNIFORMS, value);
    }

    public static void nmax_tess_control_image_uniforms(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_IMAGE_UNIFORMS, value);
    }

    public static void nmax_tess_evaluation_image_uniforms(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_EVALUATION_IMAGE_UNIFORMS, value);
    }

    public static void nmax_geometry_image_uniforms(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_IMAGE_UNIFORMS, value);
    }

    public static void nmax_fragment_image_uniforms(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_FRAGMENT_IMAGE_UNIFORMS, value);
    }

    public static void nmax_combined_image_uniforms(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMBINED_IMAGE_UNIFORMS, value);
    }

    public static void nmax_geometry_texture_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_TEXTURE_IMAGE_UNITS, value);
    }

    public static void nmax_geometry_output_vertices(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_OUTPUT_VERTICES, value);
    }

    public static void nmax_geometry_total_output_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS, value);
    }

    public static void nmax_geometry_uniform_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_UNIFORM_COMPONENTS, value);
    }

    public static void nmax_geometry_varying_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_VARYING_COMPONENTS, value);
    }

    public static void nmax_tess_control_input_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_INPUT_COMPONENTS, value);
    }

    public static void nmax_tess_control_output_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_OUTPUT_COMPONENTS, value);
    }

    public static void nmax_tess_control_texture_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS, value);
    }

    public static void nmax_tess_control_uniform_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_UNIFORM_COMPONENTS, value);
    }

    public static void nmax_tess_control_total_output_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS, value);
    }

    public static void nmax_tess_evaluation_input_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_EVALUATION_INPUT_COMPONENTS, value);
    }

    public static void nmax_tess_evaluation_output_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_EVALUATION_OUTPUT_COMPONENTS, value);
    }

    public static void nmax_tess_evaluation_texture_image_units(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS, value);
    }

    public static void nmax_tess_evaluation_uniform_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_EVALUATION_UNIFORM_COMPONENTS, value);
    }

    public static void nmax_tess_patch_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_PATCH_COMPONENTS, value);
    }

    public static void nmax_patch_vertices(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_PATCH_VERTICES, value);
    }

    public static void nmax_tess_gen_level(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_GEN_LEVEL, value);
    }

    public static void nmax_viewports(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VIEWPORTS, value);
    }

    public static void nmax_vertex_atomic_counters(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_ATOMIC_COUNTERS, value);
    }

    public static void nmax_tess_control_atomic_counters(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_ATOMIC_COUNTERS, value);
    }

    public static void nmax_tess_evaluation_atomic_counters(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_EVALUATION_ATOMIC_COUNTERS, value);
    }

    public static void nmax_geometry_atomic_counters(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_ATOMIC_COUNTERS, value);
    }

    public static void nmax_fragment_atomic_counters(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_FRAGMENT_ATOMIC_COUNTERS, value);
    }

    public static void nmax_combined_atomic_counters(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMBINED_ATOMIC_COUNTERS, value);
    }

    public static void nmax_atomic_counter_bindings(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_ATOMIC_COUNTER_BINDINGS, value);
    }

    public static void nmax_vertex_atomic_counter_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_VERTEX_ATOMIC_COUNTER_BUFFERS, value);
    }

    public static void nmax_tess_control_atomic_counter_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS, value);
    }

    public static void nmax_tess_evaluation_atomic_counter_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS, value);
    }

    public static void nmax_geometry_atomic_counter_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS, value);
    }

    public static void nmax_fragment_atomic_counter_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS, value);
    }

    public static void nmax_combined_atomic_counter_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMBINED_ATOMIC_COUNTER_BUFFERS, value);
    }

    public static void nmax_atomic_counter_buffer_size(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_ATOMIC_COUNTER_BUFFER_SIZE, value);
    }

    public static void nmax_transform_feedback_buffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TRANSFORM_FEEDBACK_BUFFERS, value);
    }

    public static void nmax_transform_feedback_interleaved_components(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS, value);
    }

    public static void nmax_cull_distances(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_CULL_DISTANCES, value);
    }

    public static void nmax_combined_clip_and_cull_distances(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_COMBINED_CLIP_AND_CULL_DISTANCES, value);
    }

    public static void nmax_samples(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_SAMPLES, value);
    }

    public static void nmax_mesh_output_vertices_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_OUTPUT_VERTICES_NV, value);
    }

    public static void nmax_mesh_output_primitives_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_OUTPUT_PRIMITIVES_NV, value);
    }

    public static void nmax_mesh_work_group_size_x_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_WORK_GROUP_SIZE_X_NV, value);
    }

    public static void nmax_mesh_work_group_size_y_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_WORK_GROUP_SIZE_Y_NV, value);
    }

    public static void nmax_mesh_work_group_size_z_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_WORK_GROUP_SIZE_Z_NV, value);
    }

    public static void nmax_task_work_group_size_x_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TASK_WORK_GROUP_SIZE_X_NV, value);
    }

    public static void nmax_task_work_group_size_y_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TASK_WORK_GROUP_SIZE_Y_NV, value);
    }

    public static void nmax_task_work_group_size_z_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TASK_WORK_GROUP_SIZE_Z_NV, value);
    }

    public static void nmax_mesh_view_count_nv(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_VIEW_COUNT_NV, value);
    }

    public static void nmax_mesh_output_vertices_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_OUTPUT_VERTICES_EXT, value);
    }

    public static void nmax_mesh_output_primitives_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_OUTPUT_PRIMITIVES_EXT, value);
    }

    public static void nmax_mesh_work_group_size_x_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_WORK_GROUP_SIZE_X_EXT, value);
    }

    public static void nmax_mesh_work_group_size_y_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_WORK_GROUP_SIZE_Y_EXT, value);
    }

    public static void nmax_mesh_work_group_size_z_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_WORK_GROUP_SIZE_Z_EXT, value);
    }

    public static void nmax_task_work_group_size_x_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TASK_WORK_GROUP_SIZE_X_EXT, value);
    }

    public static void nmax_task_work_group_size_y_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TASK_WORK_GROUP_SIZE_Y_EXT, value);
    }

    public static void nmax_task_work_group_size_z_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_TASK_WORK_GROUP_SIZE_Z_EXT, value);
    }

    public static void nmax_mesh_view_count_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_MESH_VIEW_COUNT_EXT, value);
    }

    public static void nmax_dual_source_draw_buffers_ext(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT, value);
    }

    public static void nlimits(long struct, GLSLangLimits value) {
        MemoryUtil.memCopy(value.address(), struct + LIMITS, GLSLangLimits.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangResource$Buffer.class */
    public static class Buffer extends StructBuffer<GLSLangResource, Buffer> implements NativeResource {
        private static final GLSLangResource ELEMENT_FACTORY = GLSLangResource.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLSLangResource.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public GLSLangResource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int max_lights() {
            return GLSLangResource.nmax_lights(address());
        }

        public int max_clip_planes() {
            return GLSLangResource.nmax_clip_planes(address());
        }

        public int max_texture_units() {
            return GLSLangResource.nmax_texture_units(address());
        }

        public int max_texture_coords() {
            return GLSLangResource.nmax_texture_coords(address());
        }

        public int max_vertex_attribs() {
            return GLSLangResource.nmax_vertex_attribs(address());
        }

        public int max_vertex_uniform_components() {
            return GLSLangResource.nmax_vertex_uniform_components(address());
        }

        public int max_varying_floats() {
            return GLSLangResource.nmax_varying_floats(address());
        }

        public int max_vertex_texture_image_units() {
            return GLSLangResource.nmax_vertex_texture_image_units(address());
        }

        public int max_combined_texture_image_units() {
            return GLSLangResource.nmax_combined_texture_image_units(address());
        }

        public int max_texture_image_units() {
            return GLSLangResource.nmax_texture_image_units(address());
        }

        public int max_fragment_uniform_components() {
            return GLSLangResource.nmax_fragment_uniform_components(address());
        }

        public int max_draw_buffers() {
            return GLSLangResource.nmax_draw_buffers(address());
        }

        public int max_vertex_uniform_vectors() {
            return GLSLangResource.nmax_vertex_uniform_vectors(address());
        }

        public int max_varying_vectors() {
            return GLSLangResource.nmax_varying_vectors(address());
        }

        public int max_fragment_uniform_vectors() {
            return GLSLangResource.nmax_fragment_uniform_vectors(address());
        }

        public int max_vertex_output_vectors() {
            return GLSLangResource.nmax_vertex_output_vectors(address());
        }

        public int max_fragment_input_vectors() {
            return GLSLangResource.nmax_fragment_input_vectors(address());
        }

        public int min_program_texel_offset() {
            return GLSLangResource.nmin_program_texel_offset(address());
        }

        public int max_program_texel_offset() {
            return GLSLangResource.nmax_program_texel_offset(address());
        }

        public int max_clip_distances() {
            return GLSLangResource.nmax_clip_distances(address());
        }

        public int max_compute_work_group_count_x() {
            return GLSLangResource.nmax_compute_work_group_count_x(address());
        }

        public int max_compute_work_group_count_y() {
            return GLSLangResource.nmax_compute_work_group_count_y(address());
        }

        public int max_compute_work_group_count_z() {
            return GLSLangResource.nmax_compute_work_group_count_z(address());
        }

        public int max_compute_work_group_size_x() {
            return GLSLangResource.nmax_compute_work_group_size_x(address());
        }

        public int max_compute_work_group_size_y() {
            return GLSLangResource.nmax_compute_work_group_size_y(address());
        }

        public int max_compute_work_group_size_z() {
            return GLSLangResource.nmax_compute_work_group_size_z(address());
        }

        public int max_compute_uniform_components() {
            return GLSLangResource.nmax_compute_uniform_components(address());
        }

        public int max_compute_texture_image_units() {
            return GLSLangResource.nmax_compute_texture_image_units(address());
        }

        public int max_compute_image_uniforms() {
            return GLSLangResource.nmax_compute_image_uniforms(address());
        }

        public int max_compute_atomic_counters() {
            return GLSLangResource.nmax_compute_atomic_counters(address());
        }

        public int max_compute_atomic_counter_buffers() {
            return GLSLangResource.nmax_compute_atomic_counter_buffers(address());
        }

        public int max_varying_components() {
            return GLSLangResource.nmax_varying_components(address());
        }

        public int max_vertex_output_components() {
            return GLSLangResource.nmax_vertex_output_components(address());
        }

        public int max_geometry_input_components() {
            return GLSLangResource.nmax_geometry_input_components(address());
        }

        public int max_geometry_output_components() {
            return GLSLangResource.nmax_geometry_output_components(address());
        }

        public int max_fragment_input_components() {
            return GLSLangResource.nmax_fragment_input_components(address());
        }

        public int max_image_units() {
            return GLSLangResource.nmax_image_units(address());
        }

        public int max_combined_image_units_and_fragment_outputs() {
            return GLSLangResource.nmax_combined_image_units_and_fragment_outputs(address());
        }

        public int max_combined_shader_output_resources() {
            return GLSLangResource.nmax_combined_shader_output_resources(address());
        }

        public int max_image_samples() {
            return GLSLangResource.nmax_image_samples(address());
        }

        public int max_vertex_image_uniforms() {
            return GLSLangResource.nmax_vertex_image_uniforms(address());
        }

        public int max_tess_control_image_uniforms() {
            return GLSLangResource.nmax_tess_control_image_uniforms(address());
        }

        public int max_tess_evaluation_image_uniforms() {
            return GLSLangResource.nmax_tess_evaluation_image_uniforms(address());
        }

        public int max_geometry_image_uniforms() {
            return GLSLangResource.nmax_geometry_image_uniforms(address());
        }

        public int max_fragment_image_uniforms() {
            return GLSLangResource.nmax_fragment_image_uniforms(address());
        }

        public int max_combined_image_uniforms() {
            return GLSLangResource.nmax_combined_image_uniforms(address());
        }

        public int max_geometry_texture_image_units() {
            return GLSLangResource.nmax_geometry_texture_image_units(address());
        }

        public int max_geometry_output_vertices() {
            return GLSLangResource.nmax_geometry_output_vertices(address());
        }

        public int max_geometry_total_output_components() {
            return GLSLangResource.nmax_geometry_total_output_components(address());
        }

        public int max_geometry_uniform_components() {
            return GLSLangResource.nmax_geometry_uniform_components(address());
        }

        public int max_geometry_varying_components() {
            return GLSLangResource.nmax_geometry_varying_components(address());
        }

        public int max_tess_control_input_components() {
            return GLSLangResource.nmax_tess_control_input_components(address());
        }

        public int max_tess_control_output_components() {
            return GLSLangResource.nmax_tess_control_output_components(address());
        }

        public int max_tess_control_texture_image_units() {
            return GLSLangResource.nmax_tess_control_texture_image_units(address());
        }

        public int max_tess_control_uniform_components() {
            return GLSLangResource.nmax_tess_control_uniform_components(address());
        }

        public int max_tess_control_total_output_components() {
            return GLSLangResource.nmax_tess_control_total_output_components(address());
        }

        public int max_tess_evaluation_input_components() {
            return GLSLangResource.nmax_tess_evaluation_input_components(address());
        }

        public int max_tess_evaluation_output_components() {
            return GLSLangResource.nmax_tess_evaluation_output_components(address());
        }

        public int max_tess_evaluation_texture_image_units() {
            return GLSLangResource.nmax_tess_evaluation_texture_image_units(address());
        }

        public int max_tess_evaluation_uniform_components() {
            return GLSLangResource.nmax_tess_evaluation_uniform_components(address());
        }

        public int max_tess_patch_components() {
            return GLSLangResource.nmax_tess_patch_components(address());
        }

        public int max_patch_vertices() {
            return GLSLangResource.nmax_patch_vertices(address());
        }

        public int max_tess_gen_level() {
            return GLSLangResource.nmax_tess_gen_level(address());
        }

        public int max_viewports() {
            return GLSLangResource.nmax_viewports(address());
        }

        public int max_vertex_atomic_counters() {
            return GLSLangResource.nmax_vertex_atomic_counters(address());
        }

        public int max_tess_control_atomic_counters() {
            return GLSLangResource.nmax_tess_control_atomic_counters(address());
        }

        public int max_tess_evaluation_atomic_counters() {
            return GLSLangResource.nmax_tess_evaluation_atomic_counters(address());
        }

        public int max_geometry_atomic_counters() {
            return GLSLangResource.nmax_geometry_atomic_counters(address());
        }

        public int max_fragment_atomic_counters() {
            return GLSLangResource.nmax_fragment_atomic_counters(address());
        }

        public int max_combined_atomic_counters() {
            return GLSLangResource.nmax_combined_atomic_counters(address());
        }

        public int max_atomic_counter_bindings() {
            return GLSLangResource.nmax_atomic_counter_bindings(address());
        }

        public int max_vertex_atomic_counter_buffers() {
            return GLSLangResource.nmax_vertex_atomic_counter_buffers(address());
        }

        public int max_tess_control_atomic_counter_buffers() {
            return GLSLangResource.nmax_tess_control_atomic_counter_buffers(address());
        }

        public int max_tess_evaluation_atomic_counter_buffers() {
            return GLSLangResource.nmax_tess_evaluation_atomic_counter_buffers(address());
        }

        public int max_geometry_atomic_counter_buffers() {
            return GLSLangResource.nmax_geometry_atomic_counter_buffers(address());
        }

        public int max_fragment_atomic_counter_buffers() {
            return GLSLangResource.nmax_fragment_atomic_counter_buffers(address());
        }

        public int max_combined_atomic_counter_buffers() {
            return GLSLangResource.nmax_combined_atomic_counter_buffers(address());
        }

        public int max_atomic_counter_buffer_size() {
            return GLSLangResource.nmax_atomic_counter_buffer_size(address());
        }

        public int max_transform_feedback_buffers() {
            return GLSLangResource.nmax_transform_feedback_buffers(address());
        }

        public int max_transform_feedback_interleaved_components() {
            return GLSLangResource.nmax_transform_feedback_interleaved_components(address());
        }

        public int max_cull_distances() {
            return GLSLangResource.nmax_cull_distances(address());
        }

        public int max_combined_clip_and_cull_distances() {
            return GLSLangResource.nmax_combined_clip_and_cull_distances(address());
        }

        public int max_samples() {
            return GLSLangResource.nmax_samples(address());
        }

        public int max_mesh_output_vertices_nv() {
            return GLSLangResource.nmax_mesh_output_vertices_nv(address());
        }

        public int max_mesh_output_primitives_nv() {
            return GLSLangResource.nmax_mesh_output_primitives_nv(address());
        }

        public int max_mesh_work_group_size_x_nv() {
            return GLSLangResource.nmax_mesh_work_group_size_x_nv(address());
        }

        public int max_mesh_work_group_size_y_nv() {
            return GLSLangResource.nmax_mesh_work_group_size_y_nv(address());
        }

        public int max_mesh_work_group_size_z_nv() {
            return GLSLangResource.nmax_mesh_work_group_size_z_nv(address());
        }

        public int max_task_work_group_size_x_nv() {
            return GLSLangResource.nmax_task_work_group_size_x_nv(address());
        }

        public int max_task_work_group_size_y_nv() {
            return GLSLangResource.nmax_task_work_group_size_y_nv(address());
        }

        public int max_task_work_group_size_z_nv() {
            return GLSLangResource.nmax_task_work_group_size_z_nv(address());
        }

        public int max_mesh_view_count_nv() {
            return GLSLangResource.nmax_mesh_view_count_nv(address());
        }

        public int max_mesh_output_vertices_ext() {
            return GLSLangResource.nmax_mesh_output_vertices_ext(address());
        }

        public int max_mesh_output_primitives_ext() {
            return GLSLangResource.nmax_mesh_output_primitives_ext(address());
        }

        public int max_mesh_work_group_size_x_ext() {
            return GLSLangResource.nmax_mesh_work_group_size_x_ext(address());
        }

        public int max_mesh_work_group_size_y_ext() {
            return GLSLangResource.nmax_mesh_work_group_size_y_ext(address());
        }

        public int max_mesh_work_group_size_z_ext() {
            return GLSLangResource.nmax_mesh_work_group_size_z_ext(address());
        }

        public int max_task_work_group_size_x_ext() {
            return GLSLangResource.nmax_task_work_group_size_x_ext(address());
        }

        public int max_task_work_group_size_y_ext() {
            return GLSLangResource.nmax_task_work_group_size_y_ext(address());
        }

        public int max_task_work_group_size_z_ext() {
            return GLSLangResource.nmax_task_work_group_size_z_ext(address());
        }

        public int max_mesh_view_count_ext() {
            return GLSLangResource.nmax_mesh_view_count_ext(address());
        }

        public int max_dual_source_draw_buffers_ext() {
            return GLSLangResource.nmax_dual_source_draw_buffers_ext(address());
        }

        @NativeType("glslang_limits_t")
        public GLSLangLimits limits() {
            return GLSLangResource.nlimits(address());
        }

        public Buffer max_lights(int value) {
            GLSLangResource.nmax_lights(address(), value);
            return this;
        }

        public Buffer max_clip_planes(int value) {
            GLSLangResource.nmax_clip_planes(address(), value);
            return this;
        }

        public Buffer max_texture_units(int value) {
            GLSLangResource.nmax_texture_units(address(), value);
            return this;
        }

        public Buffer max_texture_coords(int value) {
            GLSLangResource.nmax_texture_coords(address(), value);
            return this;
        }

        public Buffer max_vertex_attribs(int value) {
            GLSLangResource.nmax_vertex_attribs(address(), value);
            return this;
        }

        public Buffer max_vertex_uniform_components(int value) {
            GLSLangResource.nmax_vertex_uniform_components(address(), value);
            return this;
        }

        public Buffer max_varying_floats(int value) {
            GLSLangResource.nmax_varying_floats(address(), value);
            return this;
        }

        public Buffer max_vertex_texture_image_units(int value) {
            GLSLangResource.nmax_vertex_texture_image_units(address(), value);
            return this;
        }

        public Buffer max_combined_texture_image_units(int value) {
            GLSLangResource.nmax_combined_texture_image_units(address(), value);
            return this;
        }

        public Buffer max_texture_image_units(int value) {
            GLSLangResource.nmax_texture_image_units(address(), value);
            return this;
        }

        public Buffer max_fragment_uniform_components(int value) {
            GLSLangResource.nmax_fragment_uniform_components(address(), value);
            return this;
        }

        public Buffer max_draw_buffers(int value) {
            GLSLangResource.nmax_draw_buffers(address(), value);
            return this;
        }

        public Buffer max_vertex_uniform_vectors(int value) {
            GLSLangResource.nmax_vertex_uniform_vectors(address(), value);
            return this;
        }

        public Buffer max_varying_vectors(int value) {
            GLSLangResource.nmax_varying_vectors(address(), value);
            return this;
        }

        public Buffer max_fragment_uniform_vectors(int value) {
            GLSLangResource.nmax_fragment_uniform_vectors(address(), value);
            return this;
        }

        public Buffer max_vertex_output_vectors(int value) {
            GLSLangResource.nmax_vertex_output_vectors(address(), value);
            return this;
        }

        public Buffer max_fragment_input_vectors(int value) {
            GLSLangResource.nmax_fragment_input_vectors(address(), value);
            return this;
        }

        public Buffer min_program_texel_offset(int value) {
            GLSLangResource.nmin_program_texel_offset(address(), value);
            return this;
        }

        public Buffer max_program_texel_offset(int value) {
            GLSLangResource.nmax_program_texel_offset(address(), value);
            return this;
        }

        public Buffer max_clip_distances(int value) {
            GLSLangResource.nmax_clip_distances(address(), value);
            return this;
        }

        public Buffer max_compute_work_group_count_x(int value) {
            GLSLangResource.nmax_compute_work_group_count_x(address(), value);
            return this;
        }

        public Buffer max_compute_work_group_count_y(int value) {
            GLSLangResource.nmax_compute_work_group_count_y(address(), value);
            return this;
        }

        public Buffer max_compute_work_group_count_z(int value) {
            GLSLangResource.nmax_compute_work_group_count_z(address(), value);
            return this;
        }

        public Buffer max_compute_work_group_size_x(int value) {
            GLSLangResource.nmax_compute_work_group_size_x(address(), value);
            return this;
        }

        public Buffer max_compute_work_group_size_y(int value) {
            GLSLangResource.nmax_compute_work_group_size_y(address(), value);
            return this;
        }

        public Buffer max_compute_work_group_size_z(int value) {
            GLSLangResource.nmax_compute_work_group_size_z(address(), value);
            return this;
        }

        public Buffer max_compute_uniform_components(int value) {
            GLSLangResource.nmax_compute_uniform_components(address(), value);
            return this;
        }

        public Buffer max_compute_texture_image_units(int value) {
            GLSLangResource.nmax_compute_texture_image_units(address(), value);
            return this;
        }

        public Buffer max_compute_image_uniforms(int value) {
            GLSLangResource.nmax_compute_image_uniforms(address(), value);
            return this;
        }

        public Buffer max_compute_atomic_counters(int value) {
            GLSLangResource.nmax_compute_atomic_counters(address(), value);
            return this;
        }

        public Buffer max_compute_atomic_counter_buffers(int value) {
            GLSLangResource.nmax_compute_atomic_counter_buffers(address(), value);
            return this;
        }

        public Buffer max_varying_components(int value) {
            GLSLangResource.nmax_varying_components(address(), value);
            return this;
        }

        public Buffer max_vertex_output_components(int value) {
            GLSLangResource.nmax_vertex_output_components(address(), value);
            return this;
        }

        public Buffer max_geometry_input_components(int value) {
            GLSLangResource.nmax_geometry_input_components(address(), value);
            return this;
        }

        public Buffer max_geometry_output_components(int value) {
            GLSLangResource.nmax_geometry_output_components(address(), value);
            return this;
        }

        public Buffer max_fragment_input_components(int value) {
            GLSLangResource.nmax_fragment_input_components(address(), value);
            return this;
        }

        public Buffer max_image_units(int value) {
            GLSLangResource.nmax_image_units(address(), value);
            return this;
        }

        public Buffer max_combined_image_units_and_fragment_outputs(int value) {
            GLSLangResource.nmax_combined_image_units_and_fragment_outputs(address(), value);
            return this;
        }

        public Buffer max_combined_shader_output_resources(int value) {
            GLSLangResource.nmax_combined_shader_output_resources(address(), value);
            return this;
        }

        public Buffer max_image_samples(int value) {
            GLSLangResource.nmax_image_samples(address(), value);
            return this;
        }

        public Buffer max_vertex_image_uniforms(int value) {
            GLSLangResource.nmax_vertex_image_uniforms(address(), value);
            return this;
        }

        public Buffer max_tess_control_image_uniforms(int value) {
            GLSLangResource.nmax_tess_control_image_uniforms(address(), value);
            return this;
        }

        public Buffer max_tess_evaluation_image_uniforms(int value) {
            GLSLangResource.nmax_tess_evaluation_image_uniforms(address(), value);
            return this;
        }

        public Buffer max_geometry_image_uniforms(int value) {
            GLSLangResource.nmax_geometry_image_uniforms(address(), value);
            return this;
        }

        public Buffer max_fragment_image_uniforms(int value) {
            GLSLangResource.nmax_fragment_image_uniforms(address(), value);
            return this;
        }

        public Buffer max_combined_image_uniforms(int value) {
            GLSLangResource.nmax_combined_image_uniforms(address(), value);
            return this;
        }

        public Buffer max_geometry_texture_image_units(int value) {
            GLSLangResource.nmax_geometry_texture_image_units(address(), value);
            return this;
        }

        public Buffer max_geometry_output_vertices(int value) {
            GLSLangResource.nmax_geometry_output_vertices(address(), value);
            return this;
        }

        public Buffer max_geometry_total_output_components(int value) {
            GLSLangResource.nmax_geometry_total_output_components(address(), value);
            return this;
        }

        public Buffer max_geometry_uniform_components(int value) {
            GLSLangResource.nmax_geometry_uniform_components(address(), value);
            return this;
        }

        public Buffer max_geometry_varying_components(int value) {
            GLSLangResource.nmax_geometry_varying_components(address(), value);
            return this;
        }

        public Buffer max_tess_control_input_components(int value) {
            GLSLangResource.nmax_tess_control_input_components(address(), value);
            return this;
        }

        public Buffer max_tess_control_output_components(int value) {
            GLSLangResource.nmax_tess_control_output_components(address(), value);
            return this;
        }

        public Buffer max_tess_control_texture_image_units(int value) {
            GLSLangResource.nmax_tess_control_texture_image_units(address(), value);
            return this;
        }

        public Buffer max_tess_control_uniform_components(int value) {
            GLSLangResource.nmax_tess_control_uniform_components(address(), value);
            return this;
        }

        public Buffer max_tess_control_total_output_components(int value) {
            GLSLangResource.nmax_tess_control_total_output_components(address(), value);
            return this;
        }

        public Buffer max_tess_evaluation_input_components(int value) {
            GLSLangResource.nmax_tess_evaluation_input_components(address(), value);
            return this;
        }

        public Buffer max_tess_evaluation_output_components(int value) {
            GLSLangResource.nmax_tess_evaluation_output_components(address(), value);
            return this;
        }

        public Buffer max_tess_evaluation_texture_image_units(int value) {
            GLSLangResource.nmax_tess_evaluation_texture_image_units(address(), value);
            return this;
        }

        public Buffer max_tess_evaluation_uniform_components(int value) {
            GLSLangResource.nmax_tess_evaluation_uniform_components(address(), value);
            return this;
        }

        public Buffer max_tess_patch_components(int value) {
            GLSLangResource.nmax_tess_patch_components(address(), value);
            return this;
        }

        public Buffer max_patch_vertices(int value) {
            GLSLangResource.nmax_patch_vertices(address(), value);
            return this;
        }

        public Buffer max_tess_gen_level(int value) {
            GLSLangResource.nmax_tess_gen_level(address(), value);
            return this;
        }

        public Buffer max_viewports(int value) {
            GLSLangResource.nmax_viewports(address(), value);
            return this;
        }

        public Buffer max_vertex_atomic_counters(int value) {
            GLSLangResource.nmax_vertex_atomic_counters(address(), value);
            return this;
        }

        public Buffer max_tess_control_atomic_counters(int value) {
            GLSLangResource.nmax_tess_control_atomic_counters(address(), value);
            return this;
        }

        public Buffer max_tess_evaluation_atomic_counters(int value) {
            GLSLangResource.nmax_tess_evaluation_atomic_counters(address(), value);
            return this;
        }

        public Buffer max_geometry_atomic_counters(int value) {
            GLSLangResource.nmax_geometry_atomic_counters(address(), value);
            return this;
        }

        public Buffer max_fragment_atomic_counters(int value) {
            GLSLangResource.nmax_fragment_atomic_counters(address(), value);
            return this;
        }

        public Buffer max_combined_atomic_counters(int value) {
            GLSLangResource.nmax_combined_atomic_counters(address(), value);
            return this;
        }

        public Buffer max_atomic_counter_bindings(int value) {
            GLSLangResource.nmax_atomic_counter_bindings(address(), value);
            return this;
        }

        public Buffer max_vertex_atomic_counter_buffers(int value) {
            GLSLangResource.nmax_vertex_atomic_counter_buffers(address(), value);
            return this;
        }

        public Buffer max_tess_control_atomic_counter_buffers(int value) {
            GLSLangResource.nmax_tess_control_atomic_counter_buffers(address(), value);
            return this;
        }

        public Buffer max_tess_evaluation_atomic_counter_buffers(int value) {
            GLSLangResource.nmax_tess_evaluation_atomic_counter_buffers(address(), value);
            return this;
        }

        public Buffer max_geometry_atomic_counter_buffers(int value) {
            GLSLangResource.nmax_geometry_atomic_counter_buffers(address(), value);
            return this;
        }

        public Buffer max_fragment_atomic_counter_buffers(int value) {
            GLSLangResource.nmax_fragment_atomic_counter_buffers(address(), value);
            return this;
        }

        public Buffer max_combined_atomic_counter_buffers(int value) {
            GLSLangResource.nmax_combined_atomic_counter_buffers(address(), value);
            return this;
        }

        public Buffer max_atomic_counter_buffer_size(int value) {
            GLSLangResource.nmax_atomic_counter_buffer_size(address(), value);
            return this;
        }

        public Buffer max_transform_feedback_buffers(int value) {
            GLSLangResource.nmax_transform_feedback_buffers(address(), value);
            return this;
        }

        public Buffer max_transform_feedback_interleaved_components(int value) {
            GLSLangResource.nmax_transform_feedback_interleaved_components(address(), value);
            return this;
        }

        public Buffer max_cull_distances(int value) {
            GLSLangResource.nmax_cull_distances(address(), value);
            return this;
        }

        public Buffer max_combined_clip_and_cull_distances(int value) {
            GLSLangResource.nmax_combined_clip_and_cull_distances(address(), value);
            return this;
        }

        public Buffer max_samples(int value) {
            GLSLangResource.nmax_samples(address(), value);
            return this;
        }

        public Buffer max_mesh_output_vertices_nv(int value) {
            GLSLangResource.nmax_mesh_output_vertices_nv(address(), value);
            return this;
        }

        public Buffer max_mesh_output_primitives_nv(int value) {
            GLSLangResource.nmax_mesh_output_primitives_nv(address(), value);
            return this;
        }

        public Buffer max_mesh_work_group_size_x_nv(int value) {
            GLSLangResource.nmax_mesh_work_group_size_x_nv(address(), value);
            return this;
        }

        public Buffer max_mesh_work_group_size_y_nv(int value) {
            GLSLangResource.nmax_mesh_work_group_size_y_nv(address(), value);
            return this;
        }

        public Buffer max_mesh_work_group_size_z_nv(int value) {
            GLSLangResource.nmax_mesh_work_group_size_z_nv(address(), value);
            return this;
        }

        public Buffer max_task_work_group_size_x_nv(int value) {
            GLSLangResource.nmax_task_work_group_size_x_nv(address(), value);
            return this;
        }

        public Buffer max_task_work_group_size_y_nv(int value) {
            GLSLangResource.nmax_task_work_group_size_y_nv(address(), value);
            return this;
        }

        public Buffer max_task_work_group_size_z_nv(int value) {
            GLSLangResource.nmax_task_work_group_size_z_nv(address(), value);
            return this;
        }

        public Buffer max_mesh_view_count_nv(int value) {
            GLSLangResource.nmax_mesh_view_count_nv(address(), value);
            return this;
        }

        public Buffer max_mesh_output_vertices_ext(int value) {
            GLSLangResource.nmax_mesh_output_vertices_ext(address(), value);
            return this;
        }

        public Buffer max_mesh_output_primitives_ext(int value) {
            GLSLangResource.nmax_mesh_output_primitives_ext(address(), value);
            return this;
        }

        public Buffer max_mesh_work_group_size_x_ext(int value) {
            GLSLangResource.nmax_mesh_work_group_size_x_ext(address(), value);
            return this;
        }

        public Buffer max_mesh_work_group_size_y_ext(int value) {
            GLSLangResource.nmax_mesh_work_group_size_y_ext(address(), value);
            return this;
        }

        public Buffer max_mesh_work_group_size_z_ext(int value) {
            GLSLangResource.nmax_mesh_work_group_size_z_ext(address(), value);
            return this;
        }

        public Buffer max_task_work_group_size_x_ext(int value) {
            GLSLangResource.nmax_task_work_group_size_x_ext(address(), value);
            return this;
        }

        public Buffer max_task_work_group_size_y_ext(int value) {
            GLSLangResource.nmax_task_work_group_size_y_ext(address(), value);
            return this;
        }

        public Buffer max_task_work_group_size_z_ext(int value) {
            GLSLangResource.nmax_task_work_group_size_z_ext(address(), value);
            return this;
        }

        public Buffer max_mesh_view_count_ext(int value) {
            GLSLangResource.nmax_mesh_view_count_ext(address(), value);
            return this;
        }

        public Buffer max_dual_source_draw_buffers_ext(int value) {
            GLSLangResource.nmax_dual_source_draw_buffers_ext(address(), value);
            return this;
        }

        public Buffer limits(@NativeType("glslang_limits_t") GLSLangLimits value) {
            GLSLangResource.nlimits(address(), value);
            return this;
        }

        public Buffer limits(Consumer<GLSLangLimits> consumer) {
            consumer.accept(limits());
            return this;
        }
    }
}
