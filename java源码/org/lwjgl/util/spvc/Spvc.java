package org.lwjgl.util.spvc;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Platform;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/Spvc.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/Spvc.class */
public class Spvc {
    private static final SharedLibrary SPVC = Library.loadNative((Class<?>) Spvc.class, "org.lwjgl.spvc", Configuration.SPVC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("spirv-cross")), true);
    public static final int SPVC_C_API_VERSION_MAJOR = 0;
    public static final int SPVC_C_API_VERSION_MINOR = 68;
    public static final int SPVC_C_API_VERSION_PATCH = 0;
    public static final int SPVC_COMPILER_OPTION_COMMON_BIT = 16777216;
    public static final int SPVC_COMPILER_OPTION_GLSL_BIT = 33554432;
    public static final int SPVC_COMPILER_OPTION_HLSL_BIT = 67108864;
    public static final int SPVC_COMPILER_OPTION_MSL_BIT = 134217728;
    public static final int SPVC_COMPILER_OPTION_LANG_BITS = 251658240;
    public static final int SPVC_COMPILER_OPTION_ENUM_BITS = 16777215;
    public static final int SPVC_MSL_PUSH_CONSTANT_DESC_SET = -1;
    public static final int SPVC_MSL_PUSH_CONSTANT_BINDING = 0;
    public static final int SPVC_MSL_SWIZZLE_BUFFER_BINDING = -2;
    public static final int SPVC_MSL_BUFFER_SIZE_BUFFER_BINDING = -3;
    public static final int SPVC_MSL_ARGUMENT_BUFFER_BINDING = -4;
    public static final int SPVC_MSL_AUX_BUFFER_STRUCT_VERSION = 1;
    public static final int SPVC_SUCCESS = 0;
    public static final int SPVC_ERROR_INVALID_SPIRV = -1;
    public static final int SPVC_ERROR_UNSUPPORTED_SPIRV = -2;
    public static final int SPVC_ERROR_OUT_OF_MEMORY = -3;
    public static final int SPVC_ERROR_INVALID_ARGUMENT = -4;
    public static final int SPVC_CAPTURE_MODE_COPY = 0;
    public static final int SPVC_CAPTURE_MODE_TAKE_OWNERSHIP = 1;
    public static final int SPVC_BACKEND_NONE = 0;
    public static final int SPVC_BACKEND_GLSL = 1;
    public static final int SPVC_BACKEND_HLSL = 2;
    public static final int SPVC_BACKEND_MSL = 3;
    public static final int SPVC_BACKEND_CPP = 4;
    public static final int SPVC_BACKEND_JSON = 5;
    public static final int SPVC_RESOURCE_TYPE_UNKNOWN = 0;
    public static final int SPVC_RESOURCE_TYPE_UNIFORM_BUFFER = 1;
    public static final int SPVC_RESOURCE_TYPE_STORAGE_BUFFER = 2;
    public static final int SPVC_RESOURCE_TYPE_STAGE_INPUT = 3;
    public static final int SPVC_RESOURCE_TYPE_STAGE_OUTPUT = 4;
    public static final int SPVC_RESOURCE_TYPE_SUBPASS_INPUT = 5;
    public static final int SPVC_RESOURCE_TYPE_STORAGE_IMAGE = 6;
    public static final int SPVC_RESOURCE_TYPE_SAMPLED_IMAGE = 7;
    public static final int SPVC_RESOURCE_TYPE_ATOMIC_COUNTER = 8;
    public static final int SPVC_RESOURCE_TYPE_PUSH_CONSTANT = 9;
    public static final int SPVC_RESOURCE_TYPE_SEPARATE_IMAGE = 10;
    public static final int SPVC_RESOURCE_TYPE_SEPARATE_SAMPLERS = 11;
    public static final int SPVC_RESOURCE_TYPE_ACCELERATION_STRUCTURE = 12;
    public static final int SPVC_RESOURCE_TYPE_RAY_QUERY = 13;
    public static final int SPVC_RESOURCE_TYPE_SHADER_RECORD_BUFFER = 14;
    public static final int SPVC_RESOURCE_TYPE_GL_PLAIN_UNIFORM = 15;
    public static final int SPVC_RESOURCE_TYPE_TENSOR = 16;
    public static final int SPVC_BUILTIN_RESOURCE_TYPE_UNKNOWN = 0;
    public static final int SPVC_BUILTIN_RESOURCE_TYPE_STAGE_INPUT = 1;
    public static final int SPVC_BUILTIN_RESOURCE_TYPE_STAGE_OUTPUT = 2;
    public static final int SPVC_BASETYPE_UNKNOWN = 0;
    public static final int SPVC_BASETYPE_VOID = 1;
    public static final int SPVC_BASETYPE_BOOLEAN = 2;
    public static final int SPVC_BASETYPE_INT8 = 3;
    public static final int SPVC_BASETYPE_UINT8 = 4;
    public static final int SPVC_BASETYPE_INT16 = 5;
    public static final int SPVC_BASETYPE_UINT16 = 6;
    public static final int SPVC_BASETYPE_INT32 = 7;
    public static final int SPVC_BASETYPE_UINT32 = 8;
    public static final int SPVC_BASETYPE_INT64 = 9;
    public static final int SPVC_BASETYPE_UINT64 = 10;
    public static final int SPVC_BASETYPE_ATOMIC_COUNTER = 11;
    public static final int SPVC_BASETYPE_FP16 = 12;
    public static final int SPVC_BASETYPE_FP32 = 13;
    public static final int SPVC_BASETYPE_FP64 = 14;
    public static final int SPVC_BASETYPE_STRUCT = 15;
    public static final int SPVC_BASETYPE_IMAGE = 16;
    public static final int SPVC_BASETYPE_SAMPLED_IMAGE = 17;
    public static final int SPVC_BASETYPE_SAMPLER = 18;
    public static final int SPVC_BASETYPE_ACCELERATION_STRUCTURE = 19;
    public static final int SPVC_MSL_PLATFORM_IOS = 0;
    public static final int SPVC_MSL_PLATFORM_MACOS = 1;
    public static final int SPVC_MSL_INDEX_TYPE_NONE = 0;
    public static final int SPVC_MSL_INDEX_TYPE_UINT16 = 1;
    public static final int SPVC_MSL_INDEX_TYPE_UINT32 = 2;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_OTHER = 0;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT8 = 1;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_UINT16 = 2;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY16 = 3;
    public static final int SPVC_MSL_SHADER_VARIABLE_FORMAT_ANY32 = 4;
    public static final int SPVC_MSL_VERTEX_FORMAT_OTHER = 0;
    public static final int SPVC_MSL_VERTEX_FORMAT_UINT8 = 1;
    public static final int SPVC_MSL_VERTEX_FORMAT_UINT16 = 2;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_OTHER = 0;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_UINT8 = 1;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_UINT16 = 2;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_ANY16 = 3;
    public static final int SPVC_MSL_SHADER_INPUT_FORMAT_ANY32 = 4;
    public static final int SPVC_MSL_SHADER_VARIABLE_RATE_PER_VERTEX = 0;
    public static final int SPVC_MSL_SHADER_VARIABLE_RATE_PER_PRIMITIVE = 1;
    public static final int SPVC_MSL_SHADER_VARIABLE_RATE_PER_PATCH = 2;
    public static final int SPVC_MSL_SAMPLER_COORD_NORMALIZED = 0;
    public static final int SPVC_MSL_SAMPLER_COORD_PIXEL = 1;
    public static final int SPVC_MSL_SAMPLER_FILTER_NEAREST = 0;
    public static final int SPVC_MSL_SAMPLER_FILTER_LINEAR = 1;
    public static final int SPVC_MSL_SAMPLER_MIP_FILTER_NONE = 0;
    public static final int SPVC_MSL_SAMPLER_MIP_FILTER_NEAREST = 1;
    public static final int SPVC_MSL_SAMPLER_MIP_FILTER_LINEAR = 2;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_ZERO = 0;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_EDGE = 1;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_CLAMP_TO_BORDER = 2;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_REPEAT = 3;
    public static final int SPVC_MSL_SAMPLER_ADDRESS_MIRRORED_REPEAT = 4;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_NEVER = 0;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS = 1;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_LESS_EQUAL = 2;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER = 3;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_GREATER_EQUAL = 4;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_EQUAL = 5;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_NOT_EQUAL = 6;
    public static final int SPVC_MSL_SAMPLER_COMPARE_FUNC_ALWAYS = 7;
    public static final int SPVC_MSL_SAMPLER_BORDER_COLOR_TRANSPARENT_BLACK = 0;
    public static final int SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_BLACK = 1;
    public static final int SPVC_MSL_SAMPLER_BORDER_COLOR_OPAQUE_WHITE = 2;
    public static final int SPVC_MSL_FORMAT_RESOLUTION_444 = 0;
    public static final int SPVC_MSL_FORMAT_RESOLUTION_422 = 1;
    public static final int SPVC_MSL_FORMAT_RESOLUTION_420 = 2;
    public static final int SPVC_MSL_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int SPVC_MSL_CHROMA_LOCATION_MIDPOINT = 1;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_ONE = 2;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_R = 3;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_G = 4;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_B = 5;
    public static final int SPVC_MSL_COMPONENT_SWIZZLE_A = 6;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_709 = 2;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_601 = 3;
    public static final int SPVC_MSL_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_BT_2020 = 4;
    public static final int SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int SPVC_MSL_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;
    public static final int SPVC_HLSL_BINDING_AUTO_NONE_BIT = 0;
    public static final int SPVC_HLSL_BINDING_AUTO_PUSH_CONSTANT_BIT = 1;
    public static final int SPVC_HLSL_BINDING_AUTO_CBV_BIT = 2;
    public static final int SPVC_HLSL_BINDING_AUTO_SRV_BIT = 4;
    public static final int SPVC_HLSL_BINDING_AUTO_UAV_BIT = 8;
    public static final int SPVC_HLSL_BINDING_AUTO_SAMPLER_BIT = 16;
    public static final int SPVC_HLSL_BINDING_AUTO_ALL = Integer.MAX_VALUE;
    public static final int SPVC_HLSL_PUSH_CONSTANT_DESC_SET = -1;
    public static final int SPVC_HLSL_PUSH_CONSTANT_BINDING = 0;
    public static final int SPVC_COMPILER_OPTION_UNKNOWN = 0;
    public static final int SPVC_COMPILER_OPTION_FORCE_TEMPORARY = 16777217;
    public static final int SPVC_COMPILER_OPTION_FLATTEN_MULTIDIMENSIONAL_ARRAYS = 16777218;
    public static final int SPVC_COMPILER_OPTION_FIXUP_DEPTH_CONVENTION = 16777219;
    public static final int SPVC_COMPILER_OPTION_FLIP_VERTEX_Y = 16777220;
    public static final int SPVC_COMPILER_OPTION_GLSL_SUPPORT_NONZERO_BASE_INSTANCE = 33554437;
    public static final int SPVC_COMPILER_OPTION_GLSL_SEPARATE_SHADER_OBJECTS = 33554438;
    public static final int SPVC_COMPILER_OPTION_GLSL_ENABLE_420PACK_EXTENSION = 33554439;
    public static final int SPVC_COMPILER_OPTION_GLSL_VERSION = 33554440;
    public static final int SPVC_COMPILER_OPTION_GLSL_ES = 33554441;
    public static final int SPVC_COMPILER_OPTION_GLSL_VULKAN_SEMANTICS = 33554442;
    public static final int SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_FLOAT_PRECISION_HIGHP = 33554443;
    public static final int SPVC_COMPILER_OPTION_GLSL_ES_DEFAULT_INT_PRECISION_HIGHP = 33554444;
    public static final int SPVC_COMPILER_OPTION_HLSL_SHADER_MODEL = 67108877;
    public static final int SPVC_COMPILER_OPTION_HLSL_POINT_SIZE_COMPAT = 67108878;
    public static final int SPVC_COMPILER_OPTION_HLSL_POINT_COORD_COMPAT = 67108879;
    public static final int SPVC_COMPILER_OPTION_HLSL_SUPPORT_NONZERO_BASE_VERTEX_BASE_INSTANCE = 67108880;
    public static final int SPVC_COMPILER_OPTION_MSL_VERSION = 134217745;
    public static final int SPVC_COMPILER_OPTION_MSL_TEXEL_BUFFER_TEXTURE_WIDTH = 134217746;
    public static final int SPVC_COMPILER_OPTION_MSL_AUX_BUFFER_INDEX = 134217747;
    public static final int SPVC_COMPILER_OPTION_MSL_SWIZZLE_BUFFER_INDEX = 134217747;
    public static final int SPVC_COMPILER_OPTION_MSL_INDIRECT_PARAMS_BUFFER_INDEX = 134217748;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_OUTPUT_BUFFER_INDEX = 134217749;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_PATCH_OUTPUT_BUFFER_INDEX = 134217750;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_TESS_FACTOR_OUTPUT_BUFFER_INDEX = 134217751;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_WORKGROUP_INDEX = 134217752;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_BUILTIN = 134217753;
    public static final int SPVC_COMPILER_OPTION_MSL_DISABLE_RASTERIZATION = 134217754;
    public static final int SPVC_COMPILER_OPTION_MSL_CAPTURE_OUTPUT_TO_BUFFER = 134217755;
    public static final int SPVC_COMPILER_OPTION_MSL_SWIZZLE_TEXTURE_SAMPLES = 134217756;
    public static final int SPVC_COMPILER_OPTION_MSL_PAD_FRAGMENT_OUTPUT_COMPONENTS = 134217757;
    public static final int SPVC_COMPILER_OPTION_MSL_TESS_DOMAIN_ORIGIN_LOWER_LEFT = 134217758;
    public static final int SPVC_COMPILER_OPTION_MSL_PLATFORM = 134217759;
    public static final int SPVC_COMPILER_OPTION_MSL_ARGUMENT_BUFFERS = 134217760;
    public static final int SPVC_COMPILER_OPTION_GLSL_EMIT_PUSH_CONSTANT_AS_UNIFORM_BUFFER = 33554465;
    public static final int SPVC_COMPILER_OPTION_MSL_TEXTURE_BUFFER_NATIVE = 134217762;
    public static final int SPVC_COMPILER_OPTION_GLSL_EMIT_UNIFORM_BUFFER_AS_PLAIN_UNIFORMS = 33554467;
    public static final int SPVC_COMPILER_OPTION_MSL_BUFFER_SIZE_BUFFER_INDEX = 134217764;
    public static final int SPVC_COMPILER_OPTION_EMIT_LINE_DIRECTIVES = 16777253;
    public static final int SPVC_COMPILER_OPTION_MSL_MULTIVIEW = 134217766;
    public static final int SPVC_COMPILER_OPTION_MSL_VIEW_MASK_BUFFER_INDEX = 134217767;
    public static final int SPVC_COMPILER_OPTION_MSL_DEVICE_INDEX = 134217768;
    public static final int SPVC_COMPILER_OPTION_MSL_VIEW_INDEX_FROM_DEVICE_INDEX = 134217769;
    public static final int SPVC_COMPILER_OPTION_MSL_DISPATCH_BASE = 134217770;
    public static final int SPVC_COMPILER_OPTION_MSL_DYNAMIC_OFFSETS_BUFFER_INDEX = 134217771;
    public static final int SPVC_COMPILER_OPTION_MSL_TEXTURE_1D_AS_2D = 134217772;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_BASE_INDEX_ZERO = 134217773;
    public static final int SPVC_COMPILER_OPTION_MSL_IOS_FRAMEBUFFER_FETCH_SUBPASS = 134217774;
    public static final int SPVC_COMPILER_OPTION_MSL_FRAMEBUFFER_FETCH_SUBPASS = 134217774;
    public static final int SPVC_COMPILER_OPTION_MSL_INVARIANT_FP_MATH = 134217775;
    public static final int SPVC_COMPILER_OPTION_MSL_EMULATE_CUBEMAP_ARRAY = 134217776;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_DECORATION_BINDING = 134217777;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_ACTIVE_ARGUMENT_BUFFER_RESOURCES = 134217778;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_NATIVE_ARRAYS = 134217779;
    public static final int SPVC_COMPILER_OPTION_ENABLE_STORAGE_IMAGE_QUALIFIER_DEDUCTION = 16777268;
    public static final int SPVC_COMPILER_OPTION_HLSL_FORCE_STORAGE_BUFFER_AS_UAV = 67108917;
    public static final int SPVC_COMPILER_OPTION_FORCE_ZERO_INITIALIZED_VARIABLES = 16777270;
    public static final int SPVC_COMPILER_OPTION_HLSL_NONWRITABLE_UAV_TEXTURE_AS_SRV = 67108919;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_OUTPUT_MASK = 134217784;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_DEPTH_BUILTIN = 134217785;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_FRAG_STENCIL_REF_BUILTIN = 134217786;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_CLIP_DISTANCE_USER_VARYING = 134217787;
    public static final int SPVC_COMPILER_OPTION_HLSL_ENABLE_16BIT_TYPES = 67108924;
    public static final int SPVC_COMPILER_OPTION_MSL_MULTI_PATCH_WORKGROUP = 134217789;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_INPUT_BUFFER_INDEX = 134217790;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_INDEX_BUFFER_INDEX = 134217791;
    public static final int SPVC_COMPILER_OPTION_MSL_VERTEX_FOR_TESSELLATION = 134217792;
    public static final int SPVC_COMPILER_OPTION_MSL_VERTEX_INDEX_TYPE = 134217793;
    public static final int SPVC_COMPILER_OPTION_GLSL_FORCE_FLATTENED_IO_BLOCKS = 33554498;
    public static final int SPVC_COMPILER_OPTION_MSL_MULTIVIEW_LAYERED_RENDERING = 134217795;
    public static final int SPVC_COMPILER_OPTION_MSL_ARRAYED_SUBPASS_INPUT = 134217796;
    public static final int SPVC_COMPILER_OPTION_MSL_R32UI_LINEAR_TEXTURE_ALIGNMENT = 134217797;
    public static final int SPVC_COMPILER_OPTION_MSL_R32UI_ALIGNMENT_CONSTANT_ID = 134217798;
    public static final int SPVC_COMPILER_OPTION_HLSL_FLATTEN_MATRIX_VERTEX_INPUT_SEMANTICS = 67108935;
    public static final int SPVC_COMPILER_OPTION_MSL_IOS_USE_SIMDGROUP_FUNCTIONS = 134217800;
    public static final int SPVC_COMPILER_OPTION_MSL_EMULATE_SUBGROUPS = 134217801;
    public static final int SPVC_COMPILER_OPTION_MSL_FIXED_SUBGROUP_SIZE = 134217802;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_SAMPLE_RATE_SHADING = 134217803;
    public static final int SPVC_COMPILER_OPTION_MSL_IOS_SUPPORT_BASE_VERTEX_INSTANCE = 134217804;
    public static final int SPVC_COMPILER_OPTION_GLSL_OVR_MULTIVIEW_VIEW_COUNT = 33554509;
    public static final int SPVC_COMPILER_OPTION_RELAX_NAN_CHECKS = 16777294;
    public static final int SPVC_COMPILER_OPTION_MSL_RAW_BUFFER_TESE_INPUT = 134217807;
    public static final int SPVC_COMPILER_OPTION_MSL_SHADER_PATCH_INPUT_BUFFER_INDEX = 134217808;
    public static final int SPVC_COMPILER_OPTION_MSL_MANUAL_HELPER_INVOCATION_UPDATES = 134217809;
    public static final int SPVC_COMPILER_OPTION_MSL_CHECK_DISCARDED_FRAG_STORES = 134217810;
    public static final int SPVC_COMPILER_OPTION_GLSL_ENABLE_ROW_MAJOR_LOAD_WORKAROUND = 33554515;
    public static final int SPVC_COMPILER_OPTION_MSL_ARGUMENT_BUFFERS_TIER = 134217812;
    public static final int SPVC_COMPILER_OPTION_MSL_SAMPLE_DREF_LOD_ARRAY_AS_GRAD = 134217813;
    public static final int SPVC_COMPILER_OPTION_MSL_READWRITE_TEXTURE_FENCES = 134217814;
    public static final int SPVC_COMPILER_OPTION_MSL_REPLACE_RECURSIVE_INPUTS = 134217815;
    public static final int SPVC_COMPILER_OPTION_MSL_AGX_MANUAL_CUBE_GRAD_FIXUP = 134217816;
    public static final int SPVC_COMPILER_OPTION_MSL_FORCE_FRAGMENT_WITH_SIDE_EFFECTS_EXECUTION = 134217817;
    public static final int SPVC_COMPILER_OPTION_HLSL_USE_ENTRY_POINT_NAME = 67108954;
    public static final int SPVC_COMPILER_OPTION_HLSL_PRESERVE_STRUCTURED_BUFFERS = 67108955;
    public static final int SPVC_COMPILER_OPTION_MSL_AUTO_DISABLE_RASTERIZATION = 134217820;
    public static final int SPVC_COMPILER_OPTION_MSL_ENABLE_POINT_SIZE_DEFAULT = 134217821;
    public static final int SPVC_COMPILER_OPTION_HLSL_USER_SEMANTIC = 67108958;

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/Spvc$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/Spvc$Functions.class */
    public static final class Functions {
        public static final long get_version = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_get_version");
        public static final long get_commit_revision_and_timestamp = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_get_commit_revision_and_timestamp");
        public static final long msl_vertex_attribute_init = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_vertex_attribute_init");
        public static final long msl_shader_interface_var_init = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_shader_interface_var_init");
        public static final long msl_shader_input_init = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_shader_input_init");
        public static final long msl_shader_interface_var_init_2 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_shader_interface_var_init_2");
        public static final long msl_resource_binding_init = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_resource_binding_init");
        public static final long msl_resource_binding_init_2 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_resource_binding_init_2");
        public static final long msl_get_aux_buffer_struct_version = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_get_aux_buffer_struct_version");
        public static final long msl_constexpr_sampler_init = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_constexpr_sampler_init");
        public static final long msl_sampler_ycbcr_conversion_init = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_msl_sampler_ycbcr_conversion_init");
        public static final long hlsl_resource_binding_init = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_hlsl_resource_binding_init");
        public static final long context_create = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_context_create");
        public static final long context_destroy = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_context_destroy");
        public static final long context_release_allocations = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_context_release_allocations");
        public static final long context_get_last_error_string = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_context_get_last_error_string");
        public static final long context_set_error_callback = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_context_set_error_callback");
        public static final long context_parse_spirv = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_context_parse_spirv");
        public static final long context_create_compiler = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_context_create_compiler");
        public static final long compiler_get_current_id_bound = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_current_id_bound");
        public static final long compiler_create_compiler_options = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_create_compiler_options");
        public static final long compiler_options_set_bool = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_options_set_bool");
        public static final long compiler_options_set_uint = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_options_set_uint");
        public static final long compiler_install_compiler_options = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_install_compiler_options");
        public static final long compiler_compile = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_compile");
        public static final long compiler_add_header_line = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_add_header_line");
        public static final long compiler_require_extension = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_require_extension");
        public static final long compiler_get_num_required_extensions = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_num_required_extensions");
        public static final long compiler_get_required_extension = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_required_extension");
        public static final long compiler_flatten_buffer_block = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_flatten_buffer_block");
        public static final long compiler_variable_is_depth_or_compare = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_variable_is_depth_or_compare");
        public static final long compiler_mask_stage_output_by_location = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_mask_stage_output_by_location");
        public static final long compiler_mask_stage_output_by_builtin = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_mask_stage_output_by_builtin");
        public static final long compiler_hlsl_set_root_constants_layout = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_hlsl_set_root_constants_layout");
        public static final long compiler_hlsl_add_vertex_attribute_remap = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_hlsl_add_vertex_attribute_remap");
        public static final long compiler_hlsl_remap_num_workgroups_builtin = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_hlsl_remap_num_workgroups_builtin");
        public static final long compiler_hlsl_set_resource_binding_flags = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_hlsl_set_resource_binding_flags");
        public static final long compiler_hlsl_add_resource_binding = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_hlsl_add_resource_binding");
        public static final long compiler_hlsl_is_resource_used = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_hlsl_is_resource_used");
        public static final long compiler_msl_is_rasterization_disabled = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_is_rasterization_disabled");
        public static final long compiler_msl_needs_swizzle_buffer = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_needs_swizzle_buffer");
        public static final long compiler_msl_needs_buffer_size_buffer = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_needs_buffer_size_buffer");
        public static final long compiler_msl_needs_output_buffer = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_needs_output_buffer");
        public static final long compiler_msl_needs_patch_output_buffer = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_needs_patch_output_buffer");
        public static final long compiler_msl_needs_input_threadgroup_mem = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_needs_input_threadgroup_mem");
        public static final long compiler_msl_add_vertex_attribute = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_vertex_attribute");
        public static final long compiler_msl_add_resource_binding = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_resource_binding");
        public static final long compiler_msl_add_resource_binding_2 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_resource_binding_2");
        public static final long compiler_msl_add_shader_input = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_shader_input");
        public static final long compiler_msl_add_shader_input_2 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_shader_input_2");
        public static final long compiler_msl_add_shader_output = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_shader_output");
        public static final long compiler_msl_add_shader_output_2 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_shader_output_2");
        public static final long compiler_msl_add_discrete_descriptor_set = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_discrete_descriptor_set");
        public static final long compiler_msl_set_argument_buffer_device_address_space = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_set_argument_buffer_device_address_space");
        public static final long compiler_msl_is_vertex_attribute_used = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_is_vertex_attribute_used");
        public static final long compiler_msl_is_shader_input_used = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_is_shader_input_used");
        public static final long compiler_msl_is_shader_output_used = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_is_shader_output_used");
        public static final long compiler_msl_is_resource_used = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_is_resource_used");
        public static final long compiler_msl_remap_constexpr_sampler = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_remap_constexpr_sampler");
        public static final long compiler_msl_remap_constexpr_sampler_by_binding = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_remap_constexpr_sampler_by_binding");
        public static final long compiler_msl_remap_constexpr_sampler_ycbcr = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_remap_constexpr_sampler_ycbcr");
        public static final long compiler_msl_remap_constexpr_sampler_by_binding_ycbcr = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr");
        public static final long compiler_msl_set_fragment_output_components = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_set_fragment_output_components");
        public static final long compiler_msl_get_automatic_resource_binding = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_get_automatic_resource_binding");
        public static final long compiler_msl_get_automatic_resource_binding_secondary = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_get_automatic_resource_binding_secondary");
        public static final long compiler_msl_add_dynamic_buffer = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_dynamic_buffer");
        public static final long compiler_msl_add_inline_uniform_block = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_add_inline_uniform_block");
        public static final long compiler_msl_set_combined_sampler_suffix = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_set_combined_sampler_suffix");
        public static final long compiler_msl_get_combined_sampler_suffix = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_msl_get_combined_sampler_suffix");
        public static final long compiler_get_active_interface_variables = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_active_interface_variables");
        public static final long compiler_set_enabled_interface_variables = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_enabled_interface_variables");
        public static final long compiler_create_shader_resources = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_create_shader_resources");
        public static final long compiler_create_shader_resources_for_active_variables = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_create_shader_resources_for_active_variables");
        public static final long resources_get_resource_list_for_type = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_resources_get_resource_list_for_type");
        public static final long resources_get_builtin_resource_list_for_type = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_resources_get_builtin_resource_list_for_type");
        public static final long compiler_set_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_decoration");
        public static final long compiler_set_decoration_string = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_decoration_string");
        public static final long compiler_set_name = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_name");
        public static final long compiler_set_member_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_member_decoration");
        public static final long compiler_set_member_decoration_string = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_member_decoration_string");
        public static final long compiler_set_member_name = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_member_name");
        public static final long compiler_unset_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_unset_decoration");
        public static final long compiler_unset_member_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_unset_member_decoration");
        public static final long compiler_has_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_has_decoration");
        public static final long compiler_has_member_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_has_member_decoration");
        public static final long compiler_get_name = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_name");
        public static final long compiler_get_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_decoration");
        public static final long compiler_get_decoration_string = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_decoration_string");
        public static final long compiler_get_member_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_member_decoration");
        public static final long compiler_get_member_decoration_string = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_member_decoration_string");
        public static final long compiler_get_member_name = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_member_name");
        public static final long compiler_get_entry_points = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_entry_points");
        public static final long compiler_set_entry_point = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_entry_point");
        public static final long compiler_rename_entry_point = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_rename_entry_point");
        public static final long compiler_get_cleansed_entry_point_name = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_cleansed_entry_point_name");
        public static final long compiler_set_execution_mode = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_execution_mode");
        public static final long compiler_unset_execution_mode = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_unset_execution_mode");
        public static final long compiler_set_execution_mode_with_arguments = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_set_execution_mode_with_arguments");
        public static final long compiler_get_execution_modes = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_execution_modes");
        public static final long compiler_get_execution_mode_argument = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_execution_mode_argument");
        public static final long compiler_get_execution_mode_argument_by_index = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_execution_mode_argument_by_index");
        public static final long compiler_get_execution_model = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_execution_model");
        public static final long compiler_update_active_builtins = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_update_active_builtins");
        public static final long compiler_has_active_builtin = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_has_active_builtin");
        public static final long compiler_get_type_handle = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_type_handle");
        public static final long type_get_base_type_id = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_base_type_id");
        public static final long type_get_basetype = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_basetype");
        public static final long type_get_bit_width = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_bit_width");
        public static final long type_get_vector_size = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_vector_size");
        public static final long type_get_columns = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_columns");
        public static final long type_get_num_array_dimensions = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_num_array_dimensions");
        public static final long type_array_dimension_is_literal = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_array_dimension_is_literal");
        public static final long type_get_array_dimension = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_array_dimension");
        public static final long type_get_num_member_types = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_num_member_types");
        public static final long type_get_member_type = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_member_type");
        public static final long type_get_storage_class = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_storage_class");
        public static final long type_get_image_sampled_type = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_sampled_type");
        public static final long type_get_image_dimension = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_dimension");
        public static final long type_get_image_is_depth = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_is_depth");
        public static final long type_get_image_arrayed = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_arrayed");
        public static final long type_get_image_multisampled = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_multisampled");
        public static final long type_get_image_is_storage = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_is_storage");
        public static final long type_get_image_storage_format = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_storage_format");
        public static final long type_get_image_access_qualifier = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_type_get_image_access_qualifier");
        public static final long compiler_get_declared_struct_size = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_declared_struct_size");
        public static final long compiler_get_declared_struct_size_runtime_array = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_declared_struct_size_runtime_array");
        public static final long compiler_get_declared_struct_member_size = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_declared_struct_member_size");
        public static final long compiler_type_struct_member_offset = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_type_struct_member_offset");
        public static final long compiler_type_struct_member_array_stride = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_type_struct_member_array_stride");
        public static final long compiler_type_struct_member_matrix_stride = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_type_struct_member_matrix_stride");
        public static final long compiler_build_dummy_sampler_for_combined_images = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_build_dummy_sampler_for_combined_images");
        public static final long compiler_build_combined_image_samplers = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_build_combined_image_samplers");
        public static final long compiler_get_combined_image_samplers = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_combined_image_samplers");
        public static final long compiler_get_specialization_constants = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_specialization_constants");
        public static final long compiler_get_constant_handle = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_constant_handle");
        public static final long compiler_get_work_group_size_specialization_constants = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_work_group_size_specialization_constants");
        public static final long compiler_get_active_buffer_ranges = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_active_buffer_ranges");
        public static final long constant_get_scalar_fp16 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_fp16");
        public static final long constant_get_scalar_fp32 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_fp32");
        public static final long constant_get_scalar_fp64 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_fp64");
        public static final long constant_get_scalar_u32 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_u32");
        public static final long constant_get_scalar_i32 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_i32");
        public static final long constant_get_scalar_u16 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_u16");
        public static final long constant_get_scalar_i16 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_i16");
        public static final long constant_get_scalar_u8 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_u8");
        public static final long constant_get_scalar_i8 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_i8");
        public static final long constant_get_subconstants = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_subconstants");
        public static final long constant_get_scalar_u64 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_u64");
        public static final long constant_get_scalar_i64 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_scalar_i64");
        public static final long constant_get_type = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_get_type");
        public static final long constant_set_scalar_fp16 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_fp16");
        public static final long constant_set_scalar_fp32 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_fp32");
        public static final long constant_set_scalar_fp64 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_fp64");
        public static final long constant_set_scalar_u32 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_u32");
        public static final long constant_set_scalar_i32 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_i32");
        public static final long constant_set_scalar_u64 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_u64");
        public static final long constant_set_scalar_i64 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_i64");
        public static final long constant_set_scalar_u16 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_u16");
        public static final long constant_set_scalar_i16 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_i16");
        public static final long constant_set_scalar_u8 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_u8");
        public static final long constant_set_scalar_i8 = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_constant_set_scalar_i8");
        public static final long compiler_get_binary_offset_for_decoration = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_binary_offset_for_decoration");
        public static final long compiler_buffer_is_hlsl_counter_buffer = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_buffer_is_hlsl_counter_buffer");
        public static final long compiler_buffer_get_hlsl_counter_buffer = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_buffer_get_hlsl_counter_buffer");
        public static final long compiler_get_declared_capabilities = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_declared_capabilities");
        public static final long compiler_get_declared_extensions = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_declared_extensions");
        public static final long compiler_get_remapped_declared_block_name = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_remapped_declared_block_name");
        public static final long compiler_get_buffer_block_decorations = APIUtil.apiGetFunctionAddress(Spvc.SPVC, "spvc_compiler_get_buffer_block_decorations");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return SPVC;
    }

    protected Spvc() {
        throw new UnsupportedOperationException();
    }

    public static void nspvc_get_version(long major, long minor, long patch) {
        long __functionAddress = Functions.get_version;
        JNI.invokePPPV(major, minor, patch, __functionAddress);
    }

    public static void spvc_get_version(@NativeType("unsigned int *") IntBuffer major, @NativeType("unsigned int *") IntBuffer minor, @NativeType("unsigned int *") IntBuffer patch) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) major, 1);
            Checks.check((Buffer) minor, 1);
            Checks.check((Buffer) patch, 1);
        }
        nspvc_get_version(MemoryUtil.memAddress(major), MemoryUtil.memAddress(minor), MemoryUtil.memAddress(patch));
    }

    public static long nspvc_get_commit_revision_and_timestamp() {
        long __functionAddress = Functions.get_commit_revision_and_timestamp;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_get_commit_revision_and_timestamp() {
        long __result = nspvc_get_commit_revision_and_timestamp();
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static void nspvc_msl_vertex_attribute_init(long attr) {
        long __functionAddress = Functions.msl_vertex_attribute_init;
        JNI.invokePV(attr, __functionAddress);
    }

    public static void spvc_msl_vertex_attribute_init(@NativeType("spvc_msl_vertex_attribute *") SpvcMslVertexAttribute attr) {
        nspvc_msl_vertex_attribute_init(attr.address());
    }

    public static void nspvc_msl_shader_interface_var_init(long var) {
        long __functionAddress = Functions.msl_shader_interface_var_init;
        JNI.invokePV(var, __functionAddress);
    }

    public static void spvc_msl_shader_interface_var_init(@NativeType("spvc_msl_shader_interface_var *") SpvcMslShaderInterfaceVar var) {
        nspvc_msl_shader_interface_var_init(var.address());
    }

    public static void nspvc_msl_shader_input_init(long input) {
        long __functionAddress = Functions.msl_shader_input_init;
        JNI.invokePV(input, __functionAddress);
    }

    public static void spvc_msl_shader_input_init(@NativeType("spvc_msl_shader_input *") SpvcMslShaderInput input) {
        nspvc_msl_shader_input_init(input.address());
    }

    public static void nspvc_msl_shader_interface_var_init_2(long var) {
        long __functionAddress = Functions.msl_shader_interface_var_init_2;
        JNI.invokePV(var, __functionAddress);
    }

    public static void spvc_msl_shader_interface_var_init_2(@NativeType("spvc_msl_shader_interface_var_2 *") SpvcMslShaderInterfaceVar2 var) {
        nspvc_msl_shader_interface_var_init_2(var.address());
    }

    public static void nspvc_msl_resource_binding_init(long binding) {
        long __functionAddress = Functions.msl_resource_binding_init;
        JNI.invokePV(binding, __functionAddress);
    }

    public static void spvc_msl_resource_binding_init(@NativeType("spvc_msl_resource_binding *") SpvcMslResourceBinding binding) {
        nspvc_msl_resource_binding_init(binding.address());
    }

    public static void nspvc_msl_resource_binding_init_2(long binding) {
        long __functionAddress = Functions.msl_resource_binding_init_2;
        JNI.invokePV(binding, __functionAddress);
    }

    public static void spvc_msl_resource_binding_init_2(@NativeType("spvc_msl_resource_binding_2 *") SpvcMslResourceBinding2 binding) {
        nspvc_msl_resource_binding_init_2(binding.address());
    }

    @NativeType("unsigned int")
    public static int spvc_msl_get_aux_buffer_struct_version() {
        long __functionAddress = Functions.msl_get_aux_buffer_struct_version;
        return JNI.invokeI(__functionAddress);
    }

    public static void nspvc_msl_constexpr_sampler_init(long sampler) {
        long __functionAddress = Functions.msl_constexpr_sampler_init;
        JNI.invokePV(sampler, __functionAddress);
    }

    public static void spvc_msl_constexpr_sampler_init(@NativeType("spvc_msl_constexpr_sampler *") SpvcMslConstexprSampler sampler) {
        nspvc_msl_constexpr_sampler_init(sampler.address());
    }

    public static void nspvc_msl_sampler_ycbcr_conversion_init(long conv) {
        long __functionAddress = Functions.msl_sampler_ycbcr_conversion_init;
        JNI.invokePV(conv, __functionAddress);
    }

    public static void spvc_msl_sampler_ycbcr_conversion_init(@NativeType("spvc_msl_sampler_ycbcr_conversion *") SpvcMslSamplerYcbcrConversion conv) {
        nspvc_msl_sampler_ycbcr_conversion_init(conv.address());
    }

    public static void nspvc_hlsl_resource_binding_init(long binding) {
        long __functionAddress = Functions.hlsl_resource_binding_init;
        JNI.invokePV(binding, __functionAddress);
    }

    public static void spvc_hlsl_resource_binding_init(@NativeType("spvc_hlsl_resource_binding *") SpvcHLSLResourceBinding binding) {
        nspvc_hlsl_resource_binding_init(binding.address());
    }

    public static int nspvc_context_create(long context) {
        long __functionAddress = Functions.context_create;
        return JNI.invokePI(context, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_context_create(@NativeType("spvc_context *") PointerBuffer context) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) context, 1);
        }
        return nspvc_context_create(MemoryUtil.memAddress(context));
    }

    public static void spvc_context_destroy(@NativeType("spvc_context") long context) {
        long __functionAddress = Functions.context_destroy;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        JNI.invokePV(context, __functionAddress);
    }

    public static void spvc_context_release_allocations(@NativeType("spvc_context") long context) {
        long __functionAddress = Functions.context_release_allocations;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        JNI.invokePV(context, __functionAddress);
    }

    public static long nspvc_context_get_last_error_string(long context) {
        long __functionAddress = Functions.context_get_last_error_string;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePP(context, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_context_get_last_error_string(@NativeType("spvc_context") long context) {
        long __result = nspvc_context_get_last_error_string(context);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static void nspvc_context_set_error_callback(long context, long cb, long userdata) {
        long __functionAddress = Functions.context_set_error_callback;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        JNI.invokePPPV(context, cb, userdata, __functionAddress);
    }

    public static void spvc_context_set_error_callback(@NativeType("spvc_context") long context, @NativeType("spvc_error_callback") SpvcErrorCallbackI cb, @NativeType("void *") long userdata) {
        nspvc_context_set_error_callback(context, cb.address(), userdata);
    }

    public static int nspvc_context_parse_spirv(long context, long spirv, long word_count, long parsed_ir) {
        long __functionAddress = Functions.context_parse_spirv;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPPI(context, spirv, word_count, parsed_ir, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_context_parse_spirv(@NativeType("spvc_context") long context, @NativeType("SpvId const *") IntBuffer spirv, @NativeType("size_t") long word_count, @NativeType("spvc_parsed_ir *") PointerBuffer parsed_ir) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) spirv, 1);
            Checks.check((CustomBuffer<?>) parsed_ir, 1);
        }
        return nspvc_context_parse_spirv(context, MemoryUtil.memAddress(spirv), word_count, MemoryUtil.memAddress(parsed_ir));
    }

    public static int nspvc_context_create_compiler(long context, int backend, long parsed_ir, int mode, long compiler) {
        long __functionAddress = Functions.context_create_compiler;
        if (Checks.CHECKS) {
            Checks.check(context);
            Checks.check(parsed_ir);
        }
        return JNI.invokePPPI(context, backend, parsed_ir, mode, compiler, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_context_create_compiler(@NativeType("spvc_context") long context, @NativeType("spvc_backend") int backend, @NativeType("spvc_parsed_ir") long parsed_ir, @NativeType("spvc_capture_mode") int mode, @NativeType("spvc_compiler *") PointerBuffer compiler) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) compiler, 1);
        }
        return nspvc_context_create_compiler(context, backend, parsed_ir, mode, MemoryUtil.memAddress(compiler));
    }

    @NativeType("unsigned int")
    public static int spvc_compiler_get_current_id_bound(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_current_id_bound;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, __functionAddress);
    }

    public static int nspvc_compiler_create_compiler_options(long compiler, long options) {
        long __functionAddress = Functions.compiler_create_compiler_options;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, options, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_create_compiler_options(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_compiler_options *") PointerBuffer options) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) options, 1);
        }
        return nspvc_compiler_create_compiler_options(compiler, MemoryUtil.memAddress(options));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_options_set_bool(@NativeType("spvc_compiler_options") long options, @NativeType("spvc_compiler_option") int option, @NativeType("spvc_bool") boolean value) {
        long __functionAddress = Functions.compiler_options_set_bool;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        return JNI.invokePI(options, option, value, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_options_set_uint(@NativeType("spvc_compiler_options") long options, @NativeType("spvc_compiler_option") int option, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.compiler_options_set_uint;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        return JNI.invokePI(options, option, value, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_install_compiler_options(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_compiler_options") long options) {
        long __functionAddress = Functions.compiler_install_compiler_options;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(options);
        }
        return JNI.invokePPI(compiler, options, __functionAddress);
    }

    public static int nspvc_compiler_compile(long compiler, long source) {
        long __functionAddress = Functions.compiler_compile;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, source, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_compile(@NativeType("spvc_compiler") long compiler, @NativeType("char const **") PointerBuffer source) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) source, 1);
        }
        return nspvc_compiler_compile(compiler, MemoryUtil.memAddress(source));
    }

    public static int nspvc_compiler_add_header_line(long compiler, long line) {
        long __functionAddress = Functions.compiler_add_header_line;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, line, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_add_header_line(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer line) {
        if (Checks.CHECKS) {
            Checks.checkNT1(line);
        }
        return nspvc_compiler_add_header_line(compiler, MemoryUtil.memAddress(line));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_add_header_line(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence line) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(line, true);
            long lineEncoded = stack.getPointerAddress();
            int iNspvc_compiler_add_header_line = nspvc_compiler_add_header_line(compiler, lineEncoded);
            stack.setPointer(stackPointer);
            return iNspvc_compiler_add_header_line;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nspvc_compiler_require_extension(long compiler, long ext) {
        long __functionAddress = Functions.compiler_require_extension;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, ext, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_require_extension(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer ext) {
        if (Checks.CHECKS) {
            Checks.checkNT1(ext);
        }
        return nspvc_compiler_require_extension(compiler, MemoryUtil.memAddress(ext));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_require_extension(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence ext) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ext, true);
            long extEncoded = stack.getPointerAddress();
            int iNspvc_compiler_require_extension = nspvc_compiler_require_extension(compiler, extEncoded);
            stack.setPointer(stackPointer);
            return iNspvc_compiler_require_extension;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("size_t")
    public static long spvc_compiler_get_num_required_extensions(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_num_required_extensions;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, __functionAddress);
    }

    public static long nspvc_compiler_get_required_extension(long compiler, long index) {
        long __functionAddress = Functions.compiler_get_required_extension;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPP(compiler, index, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_required_extension(@NativeType("spvc_compiler") long compiler, @NativeType("size_t") long index) {
        long __result = nspvc_compiler_get_required_extension(compiler, index);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_flatten_buffer_block(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_flatten_buffer_block;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, id, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_variable_is_depth_or_compare(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_variable_is_depth_or_compare;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, id, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_location(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location, @NativeType("unsigned") int component) {
        long __functionAddress = Functions.compiler_mask_stage_output_by_location;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, location, component, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_mask_stage_output_by_builtin(@NativeType("spvc_compiler") long compiler, @NativeType("SpvBuiltIn") int builtin) {
        long __functionAddress = Functions.compiler_mask_stage_output_by_builtin;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, builtin, __functionAddress);
    }

    public static int nspvc_compiler_hlsl_set_root_constants_layout(long compiler, long constant_info, long count) {
        long __functionAddress = Functions.compiler_hlsl_set_root_constants_layout;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, constant_info, count, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_root_constants_layout(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_root_constants const *") SpvcHlslRootConstants constant_info, @NativeType("size_t") long count) {
        return nspvc_compiler_hlsl_set_root_constants_layout(compiler, constant_info.address(), count);
    }

    public static int nspvc_compiler_hlsl_add_vertex_attribute_remap(long compiler, long remap, long remaps) {
        long __functionAddress = Functions.compiler_hlsl_add_vertex_attribute_remap;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            SpvcHlslVertexAttributeRemap.validate(remap);
        }
        return JNI.invokePPPI(compiler, remap, remaps, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_vertex_attribute_remap(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_vertex_attribute_remap const *") SpvcHlslVertexAttributeRemap remap, @NativeType("size_t") long remaps) {
        return nspvc_compiler_hlsl_add_vertex_attribute_remap(compiler, remap.address(), remaps);
    }

    @NativeType("spvc_variable_id")
    public static int spvc_compiler_hlsl_remap_num_workgroups_builtin(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_hlsl_remap_num_workgroups_builtin;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_set_resource_binding_flags(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_binding_flags") int flags) {
        long __functionAddress = Functions.compiler_hlsl_set_resource_binding_flags;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, flags, __functionAddress);
    }

    public static int nspvc_compiler_hlsl_add_resource_binding(long compiler, long binding) {
        long __functionAddress = Functions.compiler_hlsl_add_resource_binding;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, binding, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_hlsl_add_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_hlsl_resource_binding const *") SpvcHLSLResourceBinding binding) {
        return nspvc_compiler_hlsl_add_resource_binding(compiler, binding.address());
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_hlsl_is_resource_used(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionModel") int model, @NativeType("unsigned") int set, @NativeType("unsigned") int binding) {
        long __functionAddress = Functions.compiler_hlsl_is_resource_used;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, model, set, binding, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_rasterization_disabled(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_is_rasterization_disabled;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_swizzle_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_swizzle_buffer;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_buffer_size_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_buffer_size_buffer;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_output_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_output_buffer;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_patch_output_buffer(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_patch_output_buffer;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_needs_input_threadgroup_mem(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_msl_needs_input_threadgroup_mem;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, __functionAddress);
    }

    public static int nspvc_compiler_msl_add_vertex_attribute(long compiler, long attrs) {
        long __functionAddress = Functions.compiler_msl_add_vertex_attribute;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, attrs, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_vertex_attribute(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_vertex_attribute const *") SpvcMslVertexAttribute attrs) {
        return nspvc_compiler_msl_add_vertex_attribute(compiler, attrs.address());
    }

    public static int nspvc_compiler_msl_add_resource_binding(long compiler, long binding) {
        long __functionAddress = Functions.compiler_msl_add_resource_binding;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, binding, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_resource_binding const *") SpvcMslResourceBinding binding) {
        return nspvc_compiler_msl_add_resource_binding(compiler, binding.address());
    }

    public static int nspvc_compiler_msl_add_resource_binding_2(long compiler, long binding) {
        long __functionAddress = Functions.compiler_msl_add_resource_binding_2;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, binding, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_resource_binding_2(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_resource_binding_2 const *") SpvcMslResourceBinding2 binding) {
        return nspvc_compiler_msl_add_resource_binding_2(compiler, binding.address());
    }

    public static int nspvc_compiler_msl_add_shader_input(long compiler, long input) {
        long __functionAddress = Functions.compiler_msl_add_shader_input;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, input, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_input(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var const *") SpvcMslShaderInterfaceVar input) {
        return nspvc_compiler_msl_add_shader_input(compiler, input.address());
    }

    public static int nspvc_compiler_msl_add_shader_input_2(long compiler, long input) {
        long __functionAddress = Functions.compiler_msl_add_shader_input_2;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, input, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_input_2(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var_2 const *") SpvcMslShaderInterfaceVar2 input) {
        return nspvc_compiler_msl_add_shader_input_2(compiler, input.address());
    }

    public static int nspvc_compiler_msl_add_shader_output(long compiler, long output) {
        long __functionAddress = Functions.compiler_msl_add_shader_output;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, output, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_output(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var const *") SpvcMslShaderInterfaceVar output) {
        return nspvc_compiler_msl_add_shader_output(compiler, output.address());
    }

    public static int nspvc_compiler_msl_add_shader_output_2(long compiler, long output) {
        long __functionAddress = Functions.compiler_msl_add_shader_output_2;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, output, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_shader_output_2(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_msl_shader_interface_var_2 const *") SpvcMslShaderInterfaceVar2 output) {
        return nspvc_compiler_msl_add_shader_output_2(compiler, output.address());
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_discrete_descriptor_set(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set) {
        long __functionAddress = Functions.compiler_msl_add_discrete_descriptor_set;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, desc_set, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_argument_buffer_device_address_space(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int desc_set, @NativeType("spvc_bool") boolean device_address) {
        long __functionAddress = Functions.compiler_msl_set_argument_buffer_device_address_space;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, desc_set, device_address, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_vertex_attribute_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int location) {
        long __functionAddress = Functions.compiler_msl_is_vertex_attribute_used;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, location, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_shader_input_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location) {
        long __functionAddress = Functions.compiler_msl_is_shader_input_used;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, location, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_shader_output_used(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned") int location) {
        long __functionAddress = Functions.compiler_msl_is_shader_output_used;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, location, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_msl_is_resource_used(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionModel") int model, @NativeType("unsigned int") int set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.compiler_msl_is_resource_used;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, model, set, binding, __functionAddress);
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler(long compiler, int id, long sampler) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, id, sampler, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler) {
        return nspvc_compiler_msl_remap_constexpr_sampler(compiler, id, sampler.address());
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding(long compiler, int desc_set, int binding, long sampler) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_by_binding;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, desc_set, binding, sampler, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler) {
        return nspvc_compiler_msl_remap_constexpr_sampler_by_binding(compiler, desc_set, binding, sampler.address());
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(long compiler, int id, long sampler, long conv) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_ycbcr;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, id, sampler, conv, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_ycbcr(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler, @NativeType("spvc_msl_sampler_ycbcr_conversion const *") SpvcMslSamplerYcbcrConversion conv) {
        return nspvc_compiler_msl_remap_constexpr_sampler_ycbcr(compiler, id, sampler.address(), conv.address());
    }

    public static int nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(long compiler, int desc_set, int binding, long sampler, long conv) {
        long __functionAddress = Functions.compiler_msl_remap_constexpr_sampler_by_binding_ycbcr;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, desc_set, binding, sampler, conv, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("spvc_msl_constexpr_sampler const *") SpvcMslConstexprSampler sampler, @NativeType("spvc_msl_sampler_ycbcr_conversion const *") SpvcMslSamplerYcbcrConversion conv) {
        return nspvc_compiler_msl_remap_constexpr_sampler_by_binding_ycbcr(compiler, desc_set, binding, sampler.address(), conv.address());
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_fragment_output_components(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int location, @NativeType("unsigned int") int components) {
        long __functionAddress = Functions.compiler_msl_set_fragment_output_components;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, location, components, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_msl_get_automatic_resource_binding;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, id, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_compiler_msl_get_automatic_resource_binding_secondary(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_msl_get_automatic_resource_binding_secondary;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, id, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_dynamic_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.compiler_msl_add_dynamic_buffer;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, desc_set, binding, index, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_add_inline_uniform_block(@NativeType("spvc_compiler") long compiler, @NativeType("unsigned int") int desc_set, @NativeType("unsigned int") int binding) {
        long __functionAddress = Functions.compiler_msl_add_inline_uniform_block;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, desc_set, binding, __functionAddress);
    }

    public static int nspvc_compiler_msl_set_combined_sampler_suffix(long compiler, long suffix) {
        long __functionAddress = Functions.compiler_msl_set_combined_sampler_suffix;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, suffix, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer suffix) {
        if (Checks.CHECKS) {
            Checks.checkNT1(suffix);
        }
        return nspvc_compiler_msl_set_combined_sampler_suffix(compiler, MemoryUtil.memAddress(suffix));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_msl_set_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence suffix) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(suffix, true);
            long suffixEncoded = stack.getPointerAddress();
            int iNspvc_compiler_msl_set_combined_sampler_suffix = nspvc_compiler_msl_set_combined_sampler_suffix(compiler, suffixEncoded);
            stack.setPointer(stackPointer);
            return iNspvc_compiler_msl_set_combined_sampler_suffix;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nspvc_compiler_msl_get_combined_sampler_suffix(long compiler) {
        long __functionAddress = Functions.compiler_msl_get_combined_sampler_suffix;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_msl_get_combined_sampler_suffix(@NativeType("spvc_compiler") long compiler) {
        long __result = nspvc_compiler_msl_get_combined_sampler_suffix(compiler);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static int nspvc_compiler_get_active_interface_variables(long compiler, long set) {
        long __functionAddress = Functions.compiler_get_active_interface_variables;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, set, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_active_interface_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_set *") PointerBuffer set) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) set, 1);
        }
        return nspvc_compiler_get_active_interface_variables(compiler, MemoryUtil.memAddress(set));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_set_enabled_interface_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_set") long set) {
        long __functionAddress = Functions.compiler_set_enabled_interface_variables;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(set);
        }
        return JNI.invokePPI(compiler, set, __functionAddress);
    }

    public static int nspvc_compiler_create_shader_resources(long compiler, long resources) {
        long __functionAddress = Functions.compiler_create_shader_resources;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, resources, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_resources *") PointerBuffer resources) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) resources, 1);
        }
        return nspvc_compiler_create_shader_resources(compiler, MemoryUtil.memAddress(resources));
    }

    public static int nspvc_compiler_create_shader_resources_for_active_variables(long compiler, long resources, long active) {
        long __functionAddress = Functions.compiler_create_shader_resources_for_active_variables;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(active);
        }
        return JNI.invokePPPI(compiler, resources, active, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_create_shader_resources_for_active_variables(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_resources *") PointerBuffer resources, @NativeType("spvc_set") long active) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) resources, 1);
        }
        return nspvc_compiler_create_shader_resources_for_active_variables(compiler, MemoryUtil.memAddress(resources), active);
    }

    public static int nspvc_resources_get_resource_list_for_type(long resources, int type, long resource_list, long resource_size) {
        long __functionAddress = Functions.resources_get_resource_list_for_type;
        if (Checks.CHECKS) {
            Checks.check(resources);
        }
        return JNI.invokePPPI(resources, type, resource_list, resource_size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_resources_get_resource_list_for_type(@NativeType("spvc_resources") long resources, @NativeType("spvc_resource_type") int type, @NativeType("spvc_reflected_resource const **") PointerBuffer resource_list, @NativeType("size_t *") PointerBuffer resource_size) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) resource_list, 1);
            Checks.check((CustomBuffer<?>) resource_size, 1);
        }
        return nspvc_resources_get_resource_list_for_type(resources, type, MemoryUtil.memAddress(resource_list), MemoryUtil.memAddress(resource_size));
    }

    public static int nspvc_resources_get_builtin_resource_list_for_type(long resources, int type, long resource_list, long resource_size) {
        long __functionAddress = Functions.resources_get_builtin_resource_list_for_type;
        if (Checks.CHECKS) {
            Checks.check(resources);
        }
        return JNI.invokePPPI(resources, type, resource_list, resource_size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_resources_get_builtin_resource_list_for_type(@NativeType("spvc_resources") long resources, @NativeType("spvc_builtin_resource_type") int type, @NativeType("spvc_reflected_builtin_resource const **") PointerBuffer resource_list, @NativeType("size_t *") PointerBuffer resource_size) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) resource_list, 1);
            Checks.check((CustomBuffer<?>) resource_size, 1);
        }
        return nspvc_resources_get_builtin_resource_list_for_type(resources, type, MemoryUtil.memAddress(resource_list), MemoryUtil.memAddress(resource_size));
    }

    public static void spvc_compiler_set_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int") int argument) {
        long __functionAddress = Functions.compiler_set_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, id, decoration, argument, __functionAddress);
    }

    public static void nspvc_compiler_set_decoration_string(long compiler, int id, int decoration, long argument) {
        long __functionAddress = Functions.compiler_set_decoration_string;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePPV(compiler, id, decoration, argument, __functionAddress);
    }

    public static void spvc_compiler_set_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") ByteBuffer argument) {
        if (Checks.CHECKS) {
            Checks.checkNT1(argument);
        }
        nspvc_compiler_set_decoration_string(compiler, id, decoration, MemoryUtil.memAddress(argument));
    }

    public static void spvc_compiler_set_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_decoration_string(compiler, id, decoration, argumentEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nspvc_compiler_set_name(long compiler, int id, long argument) {
        long __functionAddress = Functions.compiler_set_name;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePPV(compiler, id, argument, __functionAddress);
    }

    public static void spvc_compiler_set_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("char const *") ByteBuffer argument) {
        if (Checks.CHECKS) {
            Checks.checkNT1(argument);
        }
        nspvc_compiler_set_name(compiler, id, MemoryUtil.memAddress(argument));
    }

    public static void spvc_compiler_set_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_name(compiler, id, argumentEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void spvc_compiler_set_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int") int argument) {
        long __functionAddress = Functions.compiler_set_member_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, id, member_index, decoration, argument, __functionAddress);
    }

    public static void nspvc_compiler_set_member_decoration_string(long compiler, int id, int member_index, int decoration, long argument) {
        long __functionAddress = Functions.compiler_set_member_decoration_string;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePPV(compiler, id, member_index, decoration, argument, __functionAddress);
    }

    public static void spvc_compiler_set_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") ByteBuffer argument) {
        if (Checks.CHECKS) {
            Checks.checkNT1(argument);
        }
        nspvc_compiler_set_member_decoration_string(compiler, id, member_index, decoration, MemoryUtil.memAddress(argument));
    }

    public static void spvc_compiler_set_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_member_decoration_string(compiler, id, member_index, decoration, argumentEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nspvc_compiler_set_member_name(long compiler, int id, int member_index, long argument) {
        long __functionAddress = Functions.compiler_set_member_name;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePPV(compiler, id, member_index, argument, __functionAddress);
    }

    public static void spvc_compiler_set_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("char const *") ByteBuffer argument) {
        if (Checks.CHECKS) {
            Checks.checkNT1(argument);
        }
        nspvc_compiler_set_member_name(compiler, id, member_index, MemoryUtil.memAddress(argument));
    }

    public static void spvc_compiler_set_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("char const *") CharSequence argument) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(argument, true);
            long argumentEncoded = stack.getPointerAddress();
            nspvc_compiler_set_member_name(compiler, id, member_index, argumentEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void spvc_compiler_unset_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_unset_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, id, decoration, __functionAddress);
    }

    public static void spvc_compiler_unset_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_unset_member_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, id, member_index, decoration, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_has_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, id, decoration, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_has_member_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, id, member_index, decoration, __functionAddress);
    }

    public static long nspvc_compiler_get_name(long compiler, int id) {
        long __functionAddress = Functions.compiler_get_name;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, id, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_name(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id) {
        long __result = nspvc_compiler_get_name(compiler, id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("unsigned int")
    public static int spvc_compiler_get_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_get_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, id, decoration, __functionAddress);
    }

    public static long nspvc_compiler_get_decoration_string(long compiler, int id, int decoration) {
        long __functionAddress = Functions.compiler_get_decoration_string;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, id, decoration, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("SpvId") int id, @NativeType("SpvDecoration") int decoration) {
        long __result = nspvc_compiler_get_decoration_string(compiler, id, decoration);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("unsigned int")
    public static int spvc_compiler_get_member_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __functionAddress = Functions.compiler_get_member_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, id, member_index, decoration, __functionAddress);
    }

    public static long nspvc_compiler_get_member_decoration_string(long compiler, int id, int member_index, int decoration) {
        long __functionAddress = Functions.compiler_get_member_decoration_string;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, id, member_index, decoration, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_member_decoration_string(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index, @NativeType("SpvDecoration") int decoration) {
        long __result = nspvc_compiler_get_member_decoration_string(compiler, id, member_index, decoration);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nspvc_compiler_get_member_name(long compiler, int id, int member_index) {
        long __functionAddress = Functions.compiler_get_member_name;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, id, member_index, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_member_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id, @NativeType("unsigned int") int member_index) {
        long __result = nspvc_compiler_get_member_name(compiler, id, member_index);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static int nspvc_compiler_get_entry_points(long compiler, long entry_points, long num_entry_points) {
        long __functionAddress = Functions.compiler_get_entry_points;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, entry_points, num_entry_points, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_entry_points(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_entry_point const **") PointerBuffer entry_points, @NativeType("size_t *") PointerBuffer num_entry_points) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) entry_points, 1);
            Checks.check((CustomBuffer<?>) num_entry_points, 1);
        }
        return nspvc_compiler_get_entry_points(compiler, MemoryUtil.memAddress(entry_points), MemoryUtil.memAddress(num_entry_points));
    }

    public static int nspvc_compiler_set_entry_point(long compiler, long name, int model) {
        long __functionAddress = Functions.compiler_set_entry_point;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, name, model, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_set_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer name, @NativeType("SpvExecutionModel") int model) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nspvc_compiler_set_entry_point(compiler, MemoryUtil.memAddress(name), model);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_set_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence name, @NativeType("SpvExecutionModel") int model) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNspvc_compiler_set_entry_point = nspvc_compiler_set_entry_point(compiler, nameEncoded, model);
            stack.setPointer(stackPointer);
            return iNspvc_compiler_set_entry_point;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nspvc_compiler_rename_entry_point(long compiler, long old_name, long new_name, int model) {
        long __functionAddress = Functions.compiler_rename_entry_point;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, old_name, new_name, model, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_rename_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer old_name, @NativeType("char const *") ByteBuffer new_name, @NativeType("SpvExecutionModel") int model) {
        if (Checks.CHECKS) {
            Checks.checkNT1(old_name);
            Checks.checkNT1(new_name);
        }
        return nspvc_compiler_rename_entry_point(compiler, MemoryUtil.memAddress(old_name), MemoryUtil.memAddress(new_name), model);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_rename_entry_point(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence old_name, @NativeType("char const *") CharSequence new_name, @NativeType("SpvExecutionModel") int model) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(old_name, true);
            long old_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(new_name, true);
            long new_nameEncoded = stack.getPointerAddress();
            int iNspvc_compiler_rename_entry_point = nspvc_compiler_rename_entry_point(compiler, old_nameEncoded, new_nameEncoded, model);
            stack.setPointer(stackPointer);
            return iNspvc_compiler_rename_entry_point;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nspvc_compiler_get_cleansed_entry_point_name(long compiler, long name, int model) {
        long __functionAddress = Functions.compiler_get_cleansed_entry_point_name;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPP(compiler, name, model, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_cleansed_entry_point_name(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") ByteBuffer name, @NativeType("SpvExecutionModel") int model) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        long __result = nspvc_compiler_get_cleansed_entry_point_name(compiler, MemoryUtil.memAddress(name), model);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_cleansed_entry_point_name(@NativeType("spvc_compiler") long compiler, @NativeType("char const *") CharSequence name, @NativeType("SpvExecutionModel") int model) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nspvc_compiler_get_cleansed_entry_point_name(compiler, nameEncoded, model);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void spvc_compiler_set_execution_mode(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_set_execution_mode;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, mode, __functionAddress);
    }

    public static void spvc_compiler_unset_execution_mode(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_unset_execution_mode;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, mode, __functionAddress);
    }

    public static void spvc_compiler_set_execution_mode_with_arguments(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode, @NativeType("unsigned int") int arg0, @NativeType("unsigned int") int arg1, @NativeType("unsigned int") int arg2) {
        long __functionAddress = Functions.compiler_set_execution_mode_with_arguments;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, mode, arg0, arg1, arg2, __functionAddress);
    }

    public static int nspvc_compiler_get_execution_modes(long compiler, long modes, long num_modes) {
        long __functionAddress = Functions.compiler_get_execution_modes;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, modes, num_modes, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_execution_modes(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode const **") PointerBuffer modes, @NativeType("size_t *") PointerBuffer num_modes) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) modes, 1);
            Checks.check((CustomBuffer<?>) num_modes, 1);
        }
        return nspvc_compiler_get_execution_modes(compiler, MemoryUtil.memAddress(modes), MemoryUtil.memAddress(num_modes));
    }

    @NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode) {
        long __functionAddress = Functions.compiler_get_execution_mode_argument;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, mode, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_compiler_get_execution_mode_argument_by_index(@NativeType("spvc_compiler") long compiler, @NativeType("SpvExecutionMode") int mode, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.compiler_get_execution_mode_argument_by_index;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, mode, index, __functionAddress);
    }

    @NativeType("SpvExecutionModel")
    public static int spvc_compiler_get_execution_model(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_get_execution_model;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, __functionAddress);
    }

    public static void spvc_compiler_update_active_builtins(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_update_active_builtins;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        JNI.invokePV(compiler, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_has_active_builtin(@NativeType("spvc_compiler") long compiler, @NativeType("SpvBuiltIn") int builtin, @NativeType("SpvStorageClass") int storage) {
        long __functionAddress = Functions.compiler_has_active_builtin;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, builtin, storage, __functionAddress);
    }

    @NativeType("spvc_type")
    public static long spvc_compiler_get_type_handle(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type_id") int id) {
        long __functionAddress = Functions.compiler_get_type_handle;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, id, __functionAddress);
    }

    @NativeType("spvc_type_id")
    public static int spvc_type_get_base_type_id(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_base_type_id;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("spvc_basetype")
    public static int spvc_type_get_basetype(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_basetype;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_type_get_bit_width(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_bit_width;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_type_get_vector_size(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_vector_size;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_type_get_columns(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_columns;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_type_get_num_array_dimensions(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_num_array_dimensions;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_type_array_dimension_is_literal(@NativeType("spvc_type") long type, @NativeType("unsigned int") int dimension) {
        long __functionAddress = Functions.type_array_dimension_is_literal;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePZ(type, dimension, __functionAddress);
    }

    @NativeType("SpvId")
    public static int spvc_type_get_array_dimension(@NativeType("spvc_type") long type, @NativeType("unsigned int") int dimension) {
        long __functionAddress = Functions.type_get_array_dimension;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, dimension, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_type_get_num_member_types(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_num_member_types;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("spvc_type_id")
    public static int spvc_type_get_member_type(@NativeType("spvc_type") long type, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.type_get_member_type;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, index, __functionAddress);
    }

    @NativeType("SpvStorageClass")
    public static int spvc_type_get_storage_class(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_storage_class;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("spvc_type_id")
    public static int spvc_type_get_image_sampled_type(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_sampled_type;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("SpvDim")
    public static int spvc_type_get_image_dimension(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_dimension;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_depth(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_is_depth;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePZ(type, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_arrayed(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_arrayed;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePZ(type, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_multisampled(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_multisampled;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePZ(type, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_type_get_image_is_storage(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_is_storage;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePZ(type, __functionAddress);
    }

    @NativeType("SpvImageFormat")
    public static int spvc_type_get_image_storage_format(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_storage_format;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    @NativeType("SpvAccessQualifier")
    public static int spvc_type_get_image_access_qualifier(@NativeType("spvc_type") long type) {
        long __functionAddress = Functions.type_get_image_access_qualifier;
        if (Checks.CHECKS) {
            Checks.check(type);
        }
        return JNI.invokePI(type, __functionAddress);
    }

    public static int nspvc_compiler_get_declared_struct_size(long compiler, long struct_type, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_size;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(struct_type);
        }
        return JNI.invokePPPI(compiler, struct_type, size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long struct_type, @NativeType("size_t *") PointerBuffer size) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) size, 1);
        }
        return nspvc_compiler_get_declared_struct_size(compiler, struct_type, MemoryUtil.memAddress(size));
    }

    public static int nspvc_compiler_get_declared_struct_size_runtime_array(long compiler, long struct_type, long array_size, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_size_runtime_array;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(struct_type);
        }
        return JNI.invokePPPPI(compiler, struct_type, array_size, size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_size_runtime_array(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long struct_type, @NativeType("size_t") long array_size, @NativeType("size_t *") PointerBuffer size) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) size, 1);
        }
        return nspvc_compiler_get_declared_struct_size_runtime_array(compiler, struct_type, array_size, MemoryUtil.memAddress(size));
    }

    public static int nspvc_compiler_get_declared_struct_member_size(long compiler, long type, int index, long size) {
        long __functionAddress = Functions.compiler_get_declared_struct_member_size;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(type);
        }
        return JNI.invokePPPI(compiler, type, index, size, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_struct_member_size(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("size_t *") PointerBuffer size) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) size, 1);
        }
        return nspvc_compiler_get_declared_struct_member_size(compiler, type, index, MemoryUtil.memAddress(size));
    }

    public static int nspvc_compiler_type_struct_member_offset(long compiler, long type, int index, long offset) {
        long __functionAddress = Functions.compiler_type_struct_member_offset;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(type);
        }
        return JNI.invokePPPI(compiler, type, index, offset, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_offset(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer offset) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) offset, 1);
        }
        return nspvc_compiler_type_struct_member_offset(compiler, type, index, MemoryUtil.memAddress(offset));
    }

    public static int nspvc_compiler_type_struct_member_array_stride(long compiler, long type, int index, long stride) {
        long __functionAddress = Functions.compiler_type_struct_member_array_stride;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(type);
        }
        return JNI.invokePPPI(compiler, type, index, stride, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_array_stride(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer stride) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) stride, 1);
        }
        return nspvc_compiler_type_struct_member_array_stride(compiler, type, index, MemoryUtil.memAddress(stride));
    }

    public static int nspvc_compiler_type_struct_member_matrix_stride(long compiler, long type, int index, long stride) {
        long __functionAddress = Functions.compiler_type_struct_member_matrix_stride;
        if (Checks.CHECKS) {
            Checks.check(compiler);
            Checks.check(type);
        }
        return JNI.invokePPPI(compiler, type, index, stride, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_type_struct_member_matrix_stride(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_type") long type, @NativeType("unsigned int") int index, @NativeType("unsigned int *") IntBuffer stride) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) stride, 1);
        }
        return nspvc_compiler_type_struct_member_matrix_stride(compiler, type, index, MemoryUtil.memAddress(stride));
    }

    public static int nspvc_compiler_build_dummy_sampler_for_combined_images(long compiler, long id) {
        long __functionAddress = Functions.compiler_build_dummy_sampler_for_combined_images;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPI(compiler, id, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_build_dummy_sampler_for_combined_images(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id *") IntBuffer id) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) id, 1);
        }
        return nspvc_compiler_build_dummy_sampler_for_combined_images(compiler, MemoryUtil.memAddress(id));
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_build_combined_image_samplers(@NativeType("spvc_compiler") long compiler) {
        long __functionAddress = Functions.compiler_build_combined_image_samplers;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePI(compiler, __functionAddress);
    }

    public static int nspvc_compiler_get_combined_image_samplers(long compiler, long samplers, long num_samplers) {
        long __functionAddress = Functions.compiler_get_combined_image_samplers;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, samplers, num_samplers, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_combined_image_samplers(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_combined_image_sampler const **") PointerBuffer samplers, @NativeType("size_t *") PointerBuffer num_samplers) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) samplers, 1);
            Checks.check((CustomBuffer<?>) num_samplers, 1);
        }
        return nspvc_compiler_get_combined_image_samplers(compiler, MemoryUtil.memAddress(samplers), MemoryUtil.memAddress(num_samplers));
    }

    public static int nspvc_compiler_get_specialization_constants(long compiler, long constants, long num_constants) {
        long __functionAddress = Functions.compiler_get_specialization_constants;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, constants, num_constants, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_specialization_constants(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_specialization_constant const **") PointerBuffer constants, @NativeType("size_t *") PointerBuffer num_constants) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) constants, 1);
            Checks.check((CustomBuffer<?>) num_constants, 1);
        }
        return nspvc_compiler_get_specialization_constants(compiler, MemoryUtil.memAddress(constants), MemoryUtil.memAddress(num_constants));
    }

    @NativeType("spvc_constant")
    public static long spvc_compiler_get_constant_handle(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_constant_id") int id) {
        long __functionAddress = Functions.compiler_get_constant_handle;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, id, __functionAddress);
    }

    public static int nspvc_compiler_get_work_group_size_specialization_constants(long compiler, long x, long y, long z) {
        long __functionAddress = Functions.compiler_get_work_group_size_specialization_constants;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPPI(compiler, x, y, z, __functionAddress);
    }

    @NativeType("spvc_constant_id")
    public static int spvc_compiler_get_work_group_size_specialization_constants(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant x, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant y, @NativeType("spvc_specialization_constant *") SpvcSpecializationConstant z) {
        return nspvc_compiler_get_work_group_size_specialization_constants(compiler, x.address(), y.address(), z.address());
    }

    public static int nspvc_compiler_get_active_buffer_ranges(long compiler, int id, long ranges, long num_ranges) {
        long __functionAddress = Functions.compiler_get_active_buffer_ranges;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, id, ranges, num_ranges, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_active_buffer_ranges(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_buffer_range const **") PointerBuffer ranges, @NativeType("size_t *") PointerBuffer num_ranges) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) ranges, 1);
            Checks.check((CustomBuffer<?>) num_ranges, 1);
        }
        return nspvc_compiler_get_active_buffer_ranges(compiler, id, MemoryUtil.memAddress(ranges), MemoryUtil.memAddress(num_ranges));
    }

    public static float spvc_constant_get_scalar_fp16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp16;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePF(constant, column, row, __functionAddress);
    }

    public static float spvc_constant_get_scalar_fp32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp32;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePF(constant, column, row, __functionAddress);
    }

    public static double spvc_constant_get_scalar_fp64(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_fp64;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePD(constant, column, row, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u32;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePI(constant, column, row, __functionAddress);
    }

    public static int spvc_constant_get_scalar_i32(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i32;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePI(constant, column, row, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u16;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePI(constant, column, row, __functionAddress);
    }

    public static int spvc_constant_get_scalar_i16(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i16;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePI(constant, column, row, __functionAddress);
    }

    @NativeType("unsigned int")
    public static int spvc_constant_get_scalar_u8(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_u8;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePI(constant, column, row, __functionAddress);
    }

    public static int spvc_constant_get_scalar_i8(@NativeType("spvc_constant") long constant, @NativeType("unsigned int") int column, @NativeType("unsigned int") int row) {
        long __functionAddress = Functions.constant_get_scalar_i8;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePI(constant, column, row, __functionAddress);
    }

    public static void nspvc_constant_get_subconstants(long constant, long constituents, long count) {
        long __functionAddress = Functions.constant_get_subconstants;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePPPV(constant, constituents, count, __functionAddress);
    }

    public static void spvc_constant_get_subconstants(@NativeType("spvc_constant") long constant, @NativeType("spvc_constant_id const **") PointerBuffer constituents, @NativeType("size_t *") PointerBuffer count) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) constituents, 1);
            Checks.check((CustomBuffer<?>) count, 1);
        }
        nspvc_constant_get_subconstants(constant, MemoryUtil.memAddress(constituents), MemoryUtil.memAddress(count));
    }

    @NativeType("unsigned long long")
    public static long spvc_constant_get_scalar_u64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row) {
        long __functionAddress = Functions.constant_get_scalar_u64;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePJ(constant, column, row, __functionAddress);
    }

    @NativeType("long long")
    public static long spvc_constant_get_scalar_i64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row) {
        long __functionAddress = Functions.constant_get_scalar_i64;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePJ(constant, column, row, __functionAddress);
    }

    @NativeType("spvc_type_id")
    public static int spvc_constant_get_type(@NativeType("spvc_constant") long constant) {
        long __functionAddress = Functions.constant_get_type;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        return JNI.invokePI(constant, __functionAddress);
    }

    public static void spvc_constant_set_scalar_fp16(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned short") short value) {
        long __functionAddress = Functions.constant_set_scalar_fp16;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePCV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_fp32(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, float value) {
        long __functionAddress = Functions.constant_set_scalar_fp32;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_fp64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, double value) {
        long __functionAddress = Functions.constant_set_scalar_fp64;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_u32(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned") int value) {
        long __functionAddress = Functions.constant_set_scalar_u32;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_i32(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, int value) {
        long __functionAddress = Functions.constant_set_scalar_i32;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_u64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned long long") long value) {
        long __functionAddress = Functions.constant_set_scalar_u64;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePJV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_i64(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("long long") long value) {
        long __functionAddress = Functions.constant_set_scalar_i64;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePJV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_u16(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned short") short value) {
        long __functionAddress = Functions.constant_set_scalar_u16;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePCV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_i16(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, short value) {
        long __functionAddress = Functions.constant_set_scalar_i16;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePSV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_u8(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("unsigned char") byte value) {
        long __functionAddress = Functions.constant_set_scalar_u8;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePUV(constant, column, row, value, __functionAddress);
    }

    public static void spvc_constant_set_scalar_i8(@NativeType("spvc_constant") long constant, @NativeType("unsigned") int column, @NativeType("unsigned") int row, @NativeType("char") byte value) {
        long __functionAddress = Functions.constant_set_scalar_i8;
        if (Checks.CHECKS) {
            Checks.check(constant);
        }
        JNI.invokePBV(constant, column, row, value, __functionAddress);
    }

    public static boolean nspvc_compiler_get_binary_offset_for_decoration(long compiler, int id, int decoration, long word_offset) {
        long __functionAddress = Functions.compiler_get_binary_offset_for_decoration;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPZ(compiler, id, decoration, word_offset, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_get_binary_offset_for_decoration(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("SpvDecoration") int decoration, @NativeType("unsigned int *") IntBuffer word_offset) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) word_offset, 1);
        }
        return nspvc_compiler_get_binary_offset_for_decoration(compiler, id, decoration, MemoryUtil.memAddress(word_offset));
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_is_hlsl_counter_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __functionAddress = Functions.compiler_buffer_is_hlsl_counter_buffer;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePZ(compiler, id, __functionAddress);
    }

    public static boolean nspvc_compiler_buffer_get_hlsl_counter_buffer(long compiler, int id, long counter_id) {
        long __functionAddress = Functions.compiler_buffer_get_hlsl_counter_buffer;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPZ(compiler, id, counter_id, __functionAddress);
    }

    @NativeType("spvc_bool")
    public static boolean spvc_compiler_buffer_get_hlsl_counter_buffer(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("spvc_variable_id *") IntBuffer counter_id) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) counter_id, 1);
        }
        return nspvc_compiler_buffer_get_hlsl_counter_buffer(compiler, id, MemoryUtil.memAddress(counter_id));
    }

    public static int nspvc_compiler_get_declared_capabilities(long compiler, long capabilities, long num_capabilities) {
        long __functionAddress = Functions.compiler_get_declared_capabilities;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, capabilities, num_capabilities, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_capabilities(@NativeType("spvc_compiler") long compiler, @NativeType("SpvCapability const **") PointerBuffer capabilities, @NativeType("size_t *") PointerBuffer num_capabilities) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) capabilities, 1);
            Checks.check((CustomBuffer<?>) num_capabilities, 1);
        }
        return nspvc_compiler_get_declared_capabilities(compiler, MemoryUtil.memAddress(capabilities), MemoryUtil.memAddress(num_capabilities));
    }

    public static int nspvc_compiler_get_declared_extensions(long compiler, long extensions, long num_extensions) {
        long __functionAddress = Functions.compiler_get_declared_extensions;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, extensions, num_extensions, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_declared_extensions(@NativeType("spvc_compiler") long compiler, @NativeType("char const ***") PointerBuffer extensions, @NativeType("size_t *") PointerBuffer num_extensions) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) extensions, 1);
            Checks.check((CustomBuffer<?>) num_extensions, 1);
        }
        return nspvc_compiler_get_declared_extensions(compiler, MemoryUtil.memAddress(extensions), MemoryUtil.memAddress(num_extensions));
    }

    public static long nspvc_compiler_get_remapped_declared_block_name(long compiler, int id) {
        long __functionAddress = Functions.compiler_get_remapped_declared_block_name;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePP(compiler, id, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvc_compiler_get_remapped_declared_block_name(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id) {
        long __result = nspvc_compiler_get_remapped_declared_block_name(compiler, id);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static int nspvc_compiler_get_buffer_block_decorations(long compiler, int id, long decorations, long num_decorations) {
        long __functionAddress = Functions.compiler_get_buffer_block_decorations;
        if (Checks.CHECKS) {
            Checks.check(compiler);
        }
        return JNI.invokePPPI(compiler, id, decorations, num_decorations, __functionAddress);
    }

    @NativeType("spvc_result")
    public static int spvc_compiler_get_buffer_block_decorations(@NativeType("spvc_compiler") long compiler, @NativeType("spvc_variable_id") int id, @NativeType("SpvDecoration const **") PointerBuffer decorations, @NativeType("size_t *") PointerBuffer num_decorations) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) decorations, 1);
            Checks.check((CustomBuffer<?>) num_decorations, 1);
        }
        return nspvc_compiler_get_buffer_block_decorations(compiler, id, MemoryUtil.memAddress(decorations), MemoryUtil.memAddress(num_decorations));
    }
}
