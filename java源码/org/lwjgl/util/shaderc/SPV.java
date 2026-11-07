package org.lwjgl.util.shaderc;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Supplier;
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
import org.lwjgl.system.SharedLibrary;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPV.class */
public class SPV {
    private static final SharedLibrary SHADERC = Library.loadNative((Class<?>) SPV.class, "org.lwjgl.shaderc", Configuration.SPIRV_TOOLS_LIBRARY_NAME, (Supplier<SharedLibrary>) Shaderc::getLibrary, new String[0]);
    public static final int SPV_SUCCESS = 0;
    public static final int SPV_UNSUPPORTED = 1;
    public static final int SPV_END_OF_STREAM = 2;
    public static final int SPV_WARNING = 3;
    public static final int SPV_FAILED_MATCH = 4;
    public static final int SPV_REQUESTED_TERMINATION = 5;
    public static final int SPV_ERROR_INTERNAL = -1;
    public static final int SPV_ERROR_OUT_OF_MEMORY = -2;
    public static final int SPV_ERROR_INVALID_POINTER = -3;
    public static final int SPV_ERROR_INVALID_BINARY = -4;
    public static final int SPV_ERROR_INVALID_TEXT = -5;
    public static final int SPV_ERROR_INVALID_TABLE = -6;
    public static final int SPV_ERROR_INVALID_VALUE = -7;
    public static final int SPV_ERROR_INVALID_DIAGNOSTIC = -8;
    public static final int SPV_ERROR_INVALID_LOOKUP = -9;
    public static final int SPV_ERROR_INVALID_ID = -10;
    public static final int SPV_ERROR_INVALID_CFG = -11;
    public static final int SPV_ERROR_INVALID_LAYOUT = -12;
    public static final int SPV_ERROR_INVALID_CAPABILITY = -13;
    public static final int SPV_ERROR_INVALID_DATA = -14;
    public static final int SPV_ERROR_MISSING_EXTENSION = -15;
    public static final int SPV_ERROR_WRONG_VERSION = -16;
    public static final int SPV_ERROR_FNVAR = -17;
    public static final int SPV_MSG_FATAL = 0;
    public static final int SPV_MSG_INTERNAL_ERROR = 1;
    public static final int SPV_MSG_ERROR = 2;
    public static final int SPV_MSG_WARNING = 3;
    public static final int SPV_MSG_INFO = 4;
    public static final int SPV_MSG_DEBUG = 5;
    public static final int SPV_ENDIANNESS_LITTLE = 0;
    public static final int SPV_ENDIANNESS_BIG = 1;
    public static final int SPV_OPERAND_TYPE_NONE = 0;
    public static final int SPV_OPERAND_TYPE_ID = 1;
    public static final int SPV_OPERAND_TYPE_TYPE_ID = 2;
    public static final int SPV_OPERAND_TYPE_RESULT_ID = 3;
    public static final int SPV_OPERAND_TYPE_MEMORY_SEMANTICS_ID = 4;
    public static final int SPV_OPERAND_TYPE_SCOPE_ID = 5;
    public static final int SPV_OPERAND_TYPE_LITERAL_INTEGER = 6;
    public static final int SPV_OPERAND_TYPE_EXTENSION_INSTRUCTION_NUMBER = 7;
    public static final int SPV_OPERAND_TYPE_SPEC_CONSTANT_OP_NUMBER = 8;
    public static final int SPV_OPERAND_TYPE_TYPED_LITERAL_NUMBER = 9;
    public static final int SPV_OPERAND_TYPE_LITERAL_FLOAT = 10;
    public static final int SPV_OPERAND_TYPE_LITERAL_STRING = 11;
    public static final int SPV_OPERAND_TYPE_SOURCE_LANGUAGE = 12;
    public static final int SPV_OPERAND_TYPE_EXECUTION_MODEL = 13;
    public static final int SPV_OPERAND_TYPE_ADDRESSING_MODEL = 14;
    public static final int SPV_OPERAND_TYPE_MEMORY_MODEL = 15;
    public static final int SPV_OPERAND_TYPE_EXECUTION_MODE = 16;
    public static final int SPV_OPERAND_TYPE_STORAGE_CLASS = 17;
    public static final int SPV_OPERAND_TYPE_DIMENSIONALITY = 18;
    public static final int SPV_OPERAND_TYPE_SAMPLER_ADDRESSING_MODE = 19;
    public static final int SPV_OPERAND_TYPE_SAMPLER_FILTER_MODE = 20;
    public static final int SPV_OPERAND_TYPE_SAMPLER_IMAGE_FORMAT = 21;
    public static final int SPV_OPERAND_TYPE_IMAGE_CHANNEL_ORDER = 22;
    public static final int SPV_OPERAND_TYPE_IMAGE_CHANNEL_DATA_TYPE = 23;
    public static final int SPV_OPERAND_TYPE_FP_ROUNDING_MODE = 24;
    public static final int SPV_OPERAND_TYPE_LINKAGE_TYPE = 25;
    public static final int SPV_OPERAND_TYPE_ACCESS_QUALIFIER = 26;
    public static final int SPV_OPERAND_TYPE_FUNCTION_PARAMETER_ATTRIBUTE = 27;
    public static final int SPV_OPERAND_TYPE_DECORATION = 28;
    public static final int SPV_OPERAND_TYPE_BUILT_IN = 29;
    public static final int SPV_OPERAND_TYPE_GROUP_OPERATION = 30;
    public static final int SPV_OPERAND_TYPE_KERNEL_ENQ_FLAGS = 31;
    public static final int SPV_OPERAND_TYPE_KERNEL_PROFILING_INFO = 32;
    public static final int SPV_OPERAND_TYPE_CAPABILITY = 33;
    public static final int SPV_OPERAND_TYPE_FPENCODING = 34;
    public static final int SPV_OPERAND_TYPE_IMAGE = 35;
    public static final int SPV_OPERAND_TYPE_FP_FAST_MATH_MODE = 36;
    public static final int SPV_OPERAND_TYPE_SELECTION_CONTROL = 37;
    public static final int SPV_OPERAND_TYPE_LOOP_CONTROL = 38;
    public static final int SPV_OPERAND_TYPE_FUNCTION_CONTROL = 39;
    public static final int SPV_OPERAND_TYPE_MEMORY_ACCESS = 40;
    public static final int SPV_OPERAND_TYPE_FRAGMENT_SHADING_RATE = 41;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_ID = 42;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_IMAGE = 43;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_MEMORY_ACCESS = 44;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_LITERAL_INTEGER = 45;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_LITERAL_NUMBER = 46;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_TYPED_LITERAL_INTEGER = 47;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_LITERAL_STRING = 48;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_ACCESS_QUALIFIER = 49;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_CIV = 50;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_FPENCODING = 51;
    public static final int SPV_OPERAND_TYPE_VARIABLE_ID = 52;
    public static final int SPV_OPERAND_TYPE_VARIABLE_LITERAL_INTEGER = 53;
    public static final int SPV_OPERAND_TYPE_VARIABLE_LITERAL_INTEGER_ID = 54;
    public static final int SPV_OPERAND_TYPE_VARIABLE_ID_LITERAL_INTEGER = 55;
    public static final int SPV_OPERAND_TYPE_DEBUG_INFO_FLAGS = 56;
    public static final int SPV_OPERAND_TYPE_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 57;
    public static final int SPV_OPERAND_TYPE_DEBUG_COMPOSITE_TYPE = 58;
    public static final int SPV_OPERAND_TYPE_DEBUG_TYPE_QUALIFIER = 59;
    public static final int SPV_OPERAND_TYPE_DEBUG_OPERATION = 60;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_INFO_FLAGS = 61;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 62;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_COMPOSITE_TYPE = 63;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_TYPE_QUALIFIER = 64;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_OPERATION = 65;
    public static final int SPV_OPERAND_TYPE_CLDEBUG100_DEBUG_IMPORTED_ENTITY = 66;
    public static final int SPV_OPERAND_TYPE_FPDENORM_MODE = 67;
    public static final int SPV_OPERAND_TYPE_FPOPERATION_MODE = 68;
    public static final int SPV_OPERAND_TYPE_QUANTIZATION_MODES = 69;
    public static final int SPV_OPERAND_TYPE_OVERFLOW_MODES = 70;
    public static final int SPV_OPERAND_TYPE_RAY_FLAGS = 71;
    public static final int SPV_OPERAND_TYPE_RAY_QUERY_INTERSECTION = 72;
    public static final int SPV_OPERAND_TYPE_RAY_QUERY_COMMITTED_INTERSECTION_TYPE = 73;
    public static final int SPV_OPERAND_TYPE_RAY_QUERY_CANDIDATE_INTERSECTION_TYPE = 74;
    public static final int SPV_OPERAND_TYPE_PACKED_VECTOR_FORMAT = 75;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_PACKED_VECTOR_FORMAT = 76;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_OPERANDS = 77;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_COOPERATIVE_MATRIX_OPERANDS = 78;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_LAYOUT = 79;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_USE = 80;
    public static final int SPV_OPERAND_TYPE_INITIALIZATION_MODE_QUALIFIER = 81;
    public static final int SPV_OPERAND_TYPE_HOST_ACCESS_QUALIFIER = 82;
    public static final int SPV_OPERAND_TYPE_LOAD_CACHE_CONTROL = 83;
    public static final int SPV_OPERAND_TYPE_STORE_CACHE_CONTROL = 84;
    public static final int SPV_OPERAND_TYPE_NAMED_MAXIMUM_NUMBER_OF_REGISTERS = 85;
    public static final int SPV_OPERAND_TYPE_RAW_ACCESS_CHAIN_OPERANDS = 86;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_RAW_ACCESS_CHAIN_OPERANDS = 87;
    public static final int SPV_OPERAND_TYPE_TENSOR_CLAMP_MODE = 88;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_MATRIX_REDUCE = 89;
    public static final int SPV_OPERAND_TYPE_TENSOR_ADDRESSING_OPERANDS = 90;
    public static final int SPV_OPERAND_TYPE_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS = 91;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_MATRIX_MULTIPLY_ACCUMULATE_OPERANDS = 92;
    public static final int SPV_OPERAND_TYPE_COOPERATIVE_VECTOR_MATRIX_LAYOUT = 93;
    public static final int SPV_OPERAND_TYPE_COMPONENT_TYPE = 94;
    public static final int SPV_OPERAND_TYPE_KERNEL_PROPERTY_FLAGS = 95;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_BUILD_IDENTIFIER_FLAGS = 96;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_BASE_TYPE_ATTRIBUTE_ENCODING = 97;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_COMPOSITE_TYPE = 98;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_IMPORTED_ENTITY = 99;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_INFO_FLAGS = 100;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_OPERATION = 101;
    public static final int SPV_OPERAND_TYPE_SHDEBUG100_DEBUG_TYPE_QUALIFIER = 102;
    public static final int SPV_OPERAND_TYPE_TENSOR_OPERANDS = 103;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_TENSOR_OPERANDS = 104;
    public static final int SPV_OPERAND_TYPE_OPTIONAL_CAPABILITY = 105;
    public static final int SPV_OPERAND_TYPE_VARIABLE_CAPABILITY = 106;
    public static final int SPV_OPERAND_TYPE_NUM_OPERAND_TYPES = 107;
    public static final int SPV_EXT_INST_TYPE_NONE = 0;
    public static final int SPV_EXT_INST_TYPE_GLSL_STD_450 = 1;
    public static final int SPV_EXT_INST_TYPE_OPENCL_STD = 2;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER = 3;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_SHADER_TRINARY_MINMAX = 4;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_GCN_SHADER = 5;
    public static final int SPV_EXT_INST_TYPE_SPV_AMD_SHADER_BALLOT = 6;
    public static final int SPV_EXT_INST_TYPE_DEBUGINFO = 7;
    public static final int SPV_EXT_INST_TYPE_OPENCL_DEBUGINFO_100 = 8;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_CLSPVREFLECTION = 9;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_SHADER_DEBUGINFO_100 = 10;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_VKSPREFLECTION = 11;
    public static final int SPV_EXT_INST_TYPE_TOSA_001000_1 = 12;
    public static final int SPV_EXT_INST_TYPE_ARM_MOTION_ENGINE_100 = 13;
    public static final int SPV_EXT_INST_TYPE_NONSEMANTIC_UNKNOWN = 14;
    public static final int SPV_NUMBER_NONE = 0;
    public static final int SPV_NUMBER_UNSIGNED_INT = 1;
    public static final int SPV_NUMBER_SIGNED_INT = 2;
    public static final int SPV_NUMBER_FLOATING = 3;
    public static final int SPV_FP_ENCODING_UNKNOWN = 0;
    public static final int SPV_FP_ENCODING_IEEE754_BINARY16 = 1;
    public static final int SPV_FP_ENCODING_IEEE754_BINARY32 = 2;
    public static final int SPV_FP_ENCODING_IEEE754_BINARY64 = 3;
    public static final int SPV_FP_ENCODING_BFLOAT16 = 4;
    public static final int SPV_FP_ENCODING_FLOAT8_E4M3 = 5;
    public static final int SPV_FP_ENCODING_FLOAT8_E5M2 = 6;
    public static final int SPV_TEXT_TO_BINARY_OPTION_NONE = 1;
    public static final int SPV_TEXT_TO_BINARY_OPTION_PRESERVE_NUMERIC_IDS = 2;
    public static final int SPV_BINARY_TO_TEXT_OPTION_NONE = 1;
    public static final int SPV_BINARY_TO_TEXT_OPTION_PRINT = 2;
    public static final int SPV_BINARY_TO_TEXT_OPTION_COLOR = 4;
    public static final int SPV_BINARY_TO_TEXT_OPTION_INDENT = 8;
    public static final int SPV_BINARY_TO_TEXT_OPTION_SHOW_BYTE_OFFSET = 16;
    public static final int SPV_BINARY_TO_TEXT_OPTION_NO_HEADER = 32;
    public static final int SPV_BINARY_TO_TEXT_OPTION_FRIENDLY_NAMES = 64;
    public static final int SPV_BINARY_TO_TEXT_OPTION_COMMENT = 128;
    public static final int SPV_BINARY_TO_TEXT_OPTION_NESTED_INDENT = 256;
    public static final int SPV_BINARY_TO_TEXT_OPTION_REORDER_BLOCKS = 512;
    public static final int kDefaultMaxIdBound = 4194303;
    public static final int SPV_ENV_UNIVERSAL_1_0 = 0;
    public static final int SPV_ENV_VULKAN_1_0 = 1;
    public static final int SPV_ENV_UNIVERSAL_1_1 = 2;
    public static final int SPV_ENV_OPENCL_2_1 = 3;
    public static final int SPV_ENV_OPENCL_2_2 = 4;
    public static final int SPV_ENV_OPENGL_4_0 = 5;
    public static final int SPV_ENV_OPENGL_4_1 = 6;
    public static final int SPV_ENV_OPENGL_4_2 = 7;
    public static final int SPV_ENV_OPENGL_4_3 = 8;
    public static final int SPV_ENV_OPENGL_4_5 = 9;
    public static final int SPV_ENV_UNIVERSAL_1_2 = 10;
    public static final int SPV_ENV_OPENCL_1_2 = 11;
    public static final int SPV_ENV_OPENCL_EMBEDDED_1_2 = 12;
    public static final int SPV_ENV_OPENCL_2_0 = 13;
    public static final int SPV_ENV_OPENCL_EMBEDDED_2_0 = 14;
    public static final int SPV_ENV_OPENCL_EMBEDDED_2_1 = 15;
    public static final int SPV_ENV_OPENCL_EMBEDDED_2_2 = 16;
    public static final int SPV_ENV_UNIVERSAL_1_3 = 17;
    public static final int SPV_ENV_VULKAN_1_1 = 18;
    public static final int SPV_ENV_WEBGPU_0 = 19;
    public static final int SPV_ENV_UNIVERSAL_1_4 = 20;
    public static final int SPV_ENV_VULKAN_1_1_SPIRV_1_4 = 21;
    public static final int SPV_ENV_UNIVERSAL_1_5 = 22;
    public static final int SPV_ENV_VULKAN_1_2 = 23;
    public static final int SPV_ENV_UNIVERSAL_1_6 = 24;
    public static final int SPV_ENV_VULKAN_1_3 = 25;
    public static final int SPV_ENV_VULKAN_1_4 = 26;
    public static final int spv_validator_limit_max_struct_members = 0;
    public static final int spv_validator_limit_max_struct_depth = 1;
    public static final int spv_validator_limit_max_local_variables = 2;
    public static final int spv_validator_limit_max_global_variables = 3;
    public static final int spv_validator_limit_max_switch_branches = 4;
    public static final int spv_validator_limit_max_function_args = 5;
    public static final int spv_validator_limit_max_control_flow_nesting_depth = 6;
    public static final int spv_validator_limit_max_access_chain_indexes = 7;
    public static final int spv_validator_limit_max_id_bound = 8;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPV$Functions.class */
    public static final class Functions {
        public static final long SoftwareVersionString = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvSoftwareVersionString");
        public static final long SoftwareVersionDetailsString = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvSoftwareVersionDetailsString");
        public static final long TargetEnvDescription = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvTargetEnvDescription");
        public static final long ParseTargetEnv = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvParseTargetEnv");
        public static final long ParseVulkanEnv = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvParseVulkanEnv");
        public static final long ContextCreate = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvContextCreate");
        public static final long ContextDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvContextDestroy");
        public static final long ValidatorOptionsCreate = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsCreate");
        public static final long ValidatorOptionsDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsDestroy");
        public static final long ValidatorOptionsSetUniversalLimit = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetUniversalLimit");
        public static final long ValidatorOptionsSetRelaxStoreStruct = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetRelaxStoreStruct");
        public static final long ValidatorOptionsSetRelaxLogicalPointer = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetRelaxLogicalPointer");
        public static final long ValidatorOptionsSetBeforeHlslLegalization = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetBeforeHlslLegalization");
        public static final long ValidatorOptionsSetRelaxBlockLayout = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetRelaxBlockLayout");
        public static final long ValidatorOptionsSetUniformBufferStandardLayout = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetUniformBufferStandardLayout");
        public static final long ValidatorOptionsSetScalarBlockLayout = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetScalarBlockLayout");
        public static final long ValidatorOptionsSetWorkgroupScalarBlockLayout = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetWorkgroupScalarBlockLayout");
        public static final long ValidatorOptionsSetSkipBlockLayout = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetSkipBlockLayout");
        public static final long ValidatorOptionsSetAllowLocalSizeId = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetAllowLocalSizeId");
        public static final long ValidatorOptionsSetAllowOffsetTextureOperand = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetAllowOffsetTextureOperand");
        public static final long ValidatorOptionsSetAllowVulkan32BitBitwise = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetAllowVulkan32BitBitwise");
        public static final long ValidatorOptionsSetFriendlyNames = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidatorOptionsSetFriendlyNames");
        public static final long OptimizerOptionsCreate = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOptimizerOptionsCreate");
        public static final long OptimizerOptionsDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOptimizerOptionsDestroy");
        public static final long OptimizerOptionsSetRunValidator = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOptimizerOptionsSetRunValidator");
        public static final long OptimizerOptionsSetValidatorOptions = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOptimizerOptionsSetValidatorOptions");
        public static final long OptimizerOptionsSetMaxIdBound = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOptimizerOptionsSetMaxIdBound");
        public static final long OptimizerOptionsSetPreserveBindings = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOptimizerOptionsSetPreserveBindings");
        public static final long OptimizerOptionsSetPreserveSpecConstants = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOptimizerOptionsSetPreserveSpecConstants");
        public static final long ReducerOptionsCreate = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvReducerOptionsCreate");
        public static final long ReducerOptionsDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvReducerOptionsDestroy");
        public static final long ReducerOptionsSetStepLimit = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvReducerOptionsSetStepLimit");
        public static final long ReducerOptionsSetFailOnValidationError = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvReducerOptionsSetFailOnValidationError");
        public static final long ReducerOptionsSetTargetFunction = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvReducerOptionsSetTargetFunction");
        public static final long FuzzerOptionsCreate = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsCreate");
        public static final long FuzzerOptionsDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsDestroy");
        public static final long FuzzerOptionsEnableReplayValidation = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsEnableReplayValidation");
        public static final long FuzzerOptionsSetRandomSeed = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsSetRandomSeed");
        public static final long FuzzerOptionsSetReplayRange = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsSetReplayRange");
        public static final long FuzzerOptionsSetShrinkerStepLimit = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsSetShrinkerStepLimit");
        public static final long FuzzerOptionsEnableFuzzerPassValidation = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsEnableFuzzerPassValidation");
        public static final long FuzzerOptionsEnableAllPasses = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvFuzzerOptionsEnableAllPasses");
        public static final long TextToBinary = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvTextToBinary");
        public static final long TextToBinaryWithOptions = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvTextToBinaryWithOptions");
        public static final long TextDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvTextDestroy");
        public static final long BinaryToText = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvBinaryToText");
        public static final long BinaryDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvBinaryDestroy");
        public static final long Validate = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidate");
        public static final long ValidateWithOptions = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidateWithOptions");
        public static final long ValidateBinary = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvValidateBinary");
        public static final long DiagnosticCreate = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvDiagnosticCreate");
        public static final long DiagnosticDestroy = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvDiagnosticDestroy");
        public static final long DiagnosticPrint = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvDiagnosticPrint");
        public static final long OpcodeString = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvOpcodeString");
        public static final long BinaryParse = APIUtil.apiGetFunctionAddress(SPV.SHADERC, "spvBinaryParse");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    protected SPV() {
        throw new UnsupportedOperationException();
    }

    public static long nspvSoftwareVersionString() {
        long __functionAddress = Functions.SoftwareVersionString;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String spvSoftwareVersionString() {
        long __result = nspvSoftwareVersionString();
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nspvSoftwareVersionDetailsString() {
        long __functionAddress = Functions.SoftwareVersionDetailsString;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("char const *")
    public static String spvSoftwareVersionDetailsString() {
        long __result = nspvSoftwareVersionDetailsString();
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nspvTargetEnvDescription(int env) {
        long __functionAddress = Functions.TargetEnvDescription;
        return JNI.invokeP(env, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvTargetEnvDescription(@NativeType("spv_target_env") int env) {
        long __result = nspvTargetEnvDescription(env);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static boolean nspvParseTargetEnv(long s, long env) {
        long __functionAddress = Functions.ParseTargetEnv;
        return JNI.invokePPZ(s, env, __functionAddress);
    }

    @NativeType("bool")
    public static boolean spvParseTargetEnv(@NativeType("char const *") ByteBuffer s, @NativeType("spv_target_env *") IntBuffer env) {
        if (Checks.CHECKS) {
            Checks.checkNT1(s);
            Checks.check((Buffer) env, 1);
        }
        return nspvParseTargetEnv(MemoryUtil.memAddress(s), MemoryUtil.memAddress(env));
    }

    @NativeType("bool")
    public static boolean spvParseTargetEnv(@NativeType("char const *") CharSequence s, @NativeType("spv_target_env *") IntBuffer env) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) env, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(s, true);
            long sEncoded = stack.getPointerAddress();
            boolean zNspvParseTargetEnv = nspvParseTargetEnv(sEncoded, MemoryUtil.memAddress(env));
            stack.setPointer(stackPointer);
            return zNspvParseTargetEnv;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nspvParseVulkanEnv(int vulkan_ver, int spirv_ver, long env) {
        long __functionAddress = Functions.ParseVulkanEnv;
        return JNI.invokePZ(vulkan_ver, spirv_ver, env, __functionAddress);
    }

    @NativeType("bool")
    public static boolean spvParseVulkanEnv(@NativeType("uint32_t") int vulkan_ver, @NativeType("uint32_t") int spirv_ver, @NativeType("spv_target_env *") IntBuffer env) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) env, 1);
        }
        return nspvParseVulkanEnv(vulkan_ver, spirv_ver, MemoryUtil.memAddress(env));
    }

    @NativeType("spv_context")
    public static long spvContextCreate(@NativeType("spv_target_env") int env) {
        long __functionAddress = Functions.ContextCreate;
        return JNI.invokeP(env, __functionAddress);
    }

    public static void spvContextDestroy(@NativeType("spv_context") long context) {
        long __functionAddress = Functions.ContextDestroy;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        JNI.invokePV(context, __functionAddress);
    }

    @NativeType("spv_validator_options")
    public static long spvValidatorOptionsCreate() {
        long __functionAddress = Functions.ValidatorOptionsCreate;
        return JNI.invokeP(__functionAddress);
    }

    public static void spvValidatorOptionsDestroy(@NativeType("spv_validator_options") long options) {
        long __functionAddress = Functions.ValidatorOptionsDestroy;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void spvValidatorOptionsSetUniversalLimit(@NativeType("spv_validator_options") long options, @NativeType("spv_validator_limit") int limit_type, @NativeType("uint32_t") int limit) {
        long __functionAddress = Functions.ValidatorOptionsSetUniversalLimit;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, limit_type, limit, __functionAddress);
    }

    public static void spvValidatorOptionsSetRelaxStoreStruct(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetRelaxStoreStruct;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetRelaxLogicalPointer(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetRelaxLogicalPointer;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetBeforeHlslLegalization(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetBeforeHlslLegalization;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetRelaxBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetRelaxBlockLayout;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetUniformBufferStandardLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetUniformBufferStandardLayout;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetScalarBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetScalarBlockLayout;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetWorkgroupScalarBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetWorkgroupScalarBlockLayout;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetSkipBlockLayout(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetSkipBlockLayout;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetAllowLocalSizeId(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetAllowLocalSizeId;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetAllowOffsetTextureOperand(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetAllowOffsetTextureOperand;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetAllowVulkan32BitBitwise(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetAllowVulkan32BitBitwise;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvValidatorOptionsSetFriendlyNames(@NativeType("spv_validator_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.ValidatorOptionsSetFriendlyNames;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    @NativeType("spv_optimizer_options")
    public static long spvOptimizerOptionsCreate() {
        long __functionAddress = Functions.OptimizerOptionsCreate;
        return JNI.invokeP(__functionAddress);
    }

    public static void spvOptimizerOptionsDestroy(@NativeType("spv_optimizer_options") long options) {
        long __functionAddress = Functions.OptimizerOptionsDestroy;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void spvOptimizerOptionsSetRunValidator(@NativeType("spv_optimizer_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.OptimizerOptionsSetRunValidator;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvOptimizerOptionsSetValidatorOptions(@NativeType("spv_optimizer_options") long options, @NativeType("spv_validator_options") long val) {
        long __functionAddress = Functions.OptimizerOptionsSetValidatorOptions;
        if (Checks.CHECKS) {
            Checks.check(options);
            Checks.check(val);
        }
        JNI.invokePPV(options, val, __functionAddress);
    }

    public static void spvOptimizerOptionsSetMaxIdBound(@NativeType("spv_optimizer_options") long options, @NativeType("uint32_t") int val) {
        long __functionAddress = Functions.OptimizerOptionsSetMaxIdBound;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvOptimizerOptionsSetPreserveBindings(@NativeType("spv_optimizer_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.OptimizerOptionsSetPreserveBindings;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    public static void spvOptimizerOptionsSetPreserveSpecConstants(@NativeType("spv_optimizer_options") long options, @NativeType("bool") boolean val) {
        long __functionAddress = Functions.OptimizerOptionsSetPreserveSpecConstants;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, val, __functionAddress);
    }

    @NativeType("spv_reducer_options")
    public static long spvReducerOptionsCreate() {
        long __functionAddress = Functions.ReducerOptionsCreate;
        return JNI.invokeP(__functionAddress);
    }

    public static void spvReducerOptionsDestroy(@NativeType("spv_reducer_options") long options) {
        long __functionAddress = Functions.ReducerOptionsDestroy;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void spvReducerOptionsSetStepLimit(@NativeType("spv_reducer_options") long options, @NativeType("uint32_t") int step_limit) {
        long __functionAddress = Functions.ReducerOptionsSetStepLimit;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, step_limit, __functionAddress);
    }

    public static void spvReducerOptionsSetFailOnValidationError(@NativeType("spv_reducer_options") long options, @NativeType("bool") boolean fail_on_validation_error) {
        long __functionAddress = Functions.ReducerOptionsSetFailOnValidationError;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, fail_on_validation_error, __functionAddress);
    }

    public static void spvReducerOptionsSetTargetFunction(@NativeType("spv_reducer_options") long options, @NativeType("uint32_t") int target_function) {
        long __functionAddress = Functions.ReducerOptionsSetTargetFunction;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, target_function, __functionAddress);
    }

    @NativeType("spv_fuzzer_options")
    public static long spvFuzzerOptionsCreate() {
        long __functionAddress = Functions.FuzzerOptionsCreate;
        return JNI.invokeP(__functionAddress);
    }

    public static void spvFuzzerOptionsDestroy(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsDestroy;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void spvFuzzerOptionsEnableReplayValidation(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsEnableReplayValidation;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void spvFuzzerOptionsSetRandomSeed(@NativeType("spv_fuzzer_options") long options, @NativeType("uint32_t") int seed) {
        long __functionAddress = Functions.FuzzerOptionsSetRandomSeed;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, seed, __functionAddress);
    }

    public static void spvFuzzerOptionsSetReplayRange(@NativeType("spv_fuzzer_options") long options, @NativeType("int32_t") int replay_range) {
        long __functionAddress = Functions.FuzzerOptionsSetReplayRange;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, replay_range, __functionAddress);
    }

    public static void spvFuzzerOptionsSetShrinkerStepLimit(@NativeType("spv_fuzzer_options") long options, @NativeType("uint32_t") int shrinker_step_limit) {
        long __functionAddress = Functions.FuzzerOptionsSetShrinkerStepLimit;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, shrinker_step_limit, __functionAddress);
    }

    public static void spvFuzzerOptionsEnableFuzzerPassValidation(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsEnableFuzzerPassValidation;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static void spvFuzzerOptionsEnableAllPasses(@NativeType("spv_fuzzer_options") long options) {
        long __functionAddress = Functions.FuzzerOptionsEnableAllPasses;
        if (Checks.CHECKS) {
            Checks.check(options);
        }
        JNI.invokePV(options, __functionAddress);
    }

    public static int nspvTextToBinary(long context, long text, long length, long binary, long diagnostic) {
        long __functionAddress = Functions.TextToBinary;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPPPI(context, text, length, binary, diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvTextToBinary(@NativeType("spv_const_context const") long context, @NativeType("char const *") ByteBuffer text, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) binary, 1);
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        return nspvTextToBinary(context, MemoryUtil.memAddress(text), text.remaining(), MemoryUtil.memAddress(binary), MemoryUtil.memAddressSafe(diagnostic));
    }

    @NativeType("spv_result_t")
    public static int spvTextToBinary(@NativeType("spv_const_context const") long context, @NativeType("char const *") CharSequence text, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) binary, 1);
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            int iNspvTextToBinary = nspvTextToBinary(context, textEncoded, textEncodedLength, MemoryUtil.memAddress(binary), MemoryUtil.memAddressSafe(diagnostic));
            stack.setPointer(stackPointer);
            return iNspvTextToBinary;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nspvTextToBinaryWithOptions(long context, long text, long length, int options, long binary, long diagnostic) {
        long __functionAddress = Functions.TextToBinaryWithOptions;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPPPI(context, text, length, options, binary, diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvTextToBinaryWithOptions(@NativeType("spv_const_context const") long context, @NativeType("char const *") ByteBuffer text, @NativeType("uint32_t") int options, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) binary, 1);
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        return nspvTextToBinaryWithOptions(context, MemoryUtil.memAddress(text), text.remaining(), options, MemoryUtil.memAddress(binary), MemoryUtil.memAddressSafe(diagnostic));
    }

    @NativeType("spv_result_t")
    public static int spvTextToBinaryWithOptions(@NativeType("spv_const_context const") long context, @NativeType("char const *") CharSequence text, @NativeType("uint32_t") int options, @NativeType("spv_binary *") PointerBuffer binary, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) binary, 1);
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            int iNspvTextToBinaryWithOptions = nspvTextToBinaryWithOptions(context, textEncoded, textEncodedLength, options, MemoryUtil.memAddress(binary), MemoryUtil.memAddressSafe(diagnostic));
            stack.setPointer(stackPointer);
            return iNspvTextToBinaryWithOptions;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nspvTextDestroy(long text) {
        long __functionAddress = Functions.TextDestroy;
        JNI.invokePV(text, __functionAddress);
    }

    public static void spvTextDestroy(@NativeType("spv_text") SPVText text) {
        nspvTextDestroy(MemoryUtil.memAddressSafe(text));
    }

    public static int nspvBinaryToText(long context, long binary, long word_count, int options, long text, long diagnostic) {
        long __functionAddress = Functions.BinaryToText;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPPPI(context, binary, word_count, options, text, diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvBinaryToText(@NativeType("spv_const_context const") long context, @NativeType("uint32_t const *") IntBuffer binary, @NativeType("uint32_t") int options, @NativeType("spv_text *") PointerBuffer text, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) text, 1);
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        return nspvBinaryToText(context, MemoryUtil.memAddress(binary), binary.remaining(), options, MemoryUtil.memAddress(text), MemoryUtil.memAddressSafe(diagnostic));
    }

    public static void nspvBinaryDestroy(long binary) {
        long __functionAddress = Functions.BinaryDestroy;
        JNI.invokePV(binary, __functionAddress);
    }

    public static void spvBinaryDestroy(@NativeType("spv_binary") SPVBinary binary) {
        nspvBinaryDestroy(binary.address());
    }

    public static int nspvValidate(long context, long binary, long diagnostic) {
        long __functionAddress = Functions.Validate;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPI(context, binary, diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvValidate(@NativeType("spv_const_context const") long context, @NativeType("spv_const_binary const") SPVBinary binary, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        return nspvValidate(context, binary.address(), MemoryUtil.memAddressSafe(diagnostic));
    }

    public static int nspvValidateWithOptions(long context, long options, long binary, long diagnostic) {
        long __functionAddress = Functions.ValidateWithOptions;
        if (Checks.CHECKS) {
            Checks.check(context);
            Checks.check(options);
        }
        return JNI.invokePPPPI(context, options, binary, diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvValidateWithOptions(@NativeType("spv_const_context const") long context, @NativeType("spv_const_validator_options const") long options, @NativeType("spv_const_binary const") SPVBinary binary, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        return nspvValidateWithOptions(context, options, binary.address(), MemoryUtil.memAddressSafe(diagnostic));
    }

    public static int nspvValidateBinary(long context, long words, long num_words, long diagnostic) {
        long __functionAddress = Functions.ValidateBinary;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPPI(context, words, num_words, diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvValidateBinary(@NativeType("spv_const_context const") long context, @NativeType("uint32_t const *") IntBuffer words, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        return nspvValidateBinary(context, MemoryUtil.memAddress(words), words.remaining(), MemoryUtil.memAddressSafe(diagnostic));
    }

    public static long nspvDiagnosticCreate(long position, long message) {
        long __functionAddress = Functions.DiagnosticCreate;
        return JNI.invokePPP(position, message, __functionAddress);
    }

    @NativeType("spv_diagnostic")
    public static SPVDiagnostic spvDiagnosticCreate(@NativeType("spv_position const") SPVPosition position, @NativeType("char const *") ByteBuffer message) {
        if (Checks.CHECKS) {
            Checks.checkNT1(message);
        }
        long __result = nspvDiagnosticCreate(position.address(), MemoryUtil.memAddress(message));
        return SPVDiagnostic.createSafe(__result);
    }

    @NativeType("spv_diagnostic")
    public static SPVDiagnostic spvDiagnosticCreate(@NativeType("spv_position const") SPVPosition position, @NativeType("char const *") CharSequence message) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(message, true);
            long messageEncoded = stack.getPointerAddress();
            long __result = nspvDiagnosticCreate(position.address(), messageEncoded);
            SPVDiagnostic sPVDiagnosticCreateSafe = SPVDiagnostic.createSafe(__result);
            stack.setPointer(stackPointer);
            return sPVDiagnosticCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nspvDiagnosticDestroy(long diagnostic) {
        long __functionAddress = Functions.DiagnosticDestroy;
        JNI.invokePV(diagnostic, __functionAddress);
    }

    public static void spvDiagnosticDestroy(@NativeType("spv_diagnostic") SPVDiagnostic diagnostic) {
        nspvDiagnosticDestroy(diagnostic.address());
    }

    public static int nspvDiagnosticPrint(long diagnostic) {
        long __functionAddress = Functions.DiagnosticPrint;
        return JNI.invokePI(diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvDiagnosticPrint(@NativeType("spv_diagnostic const") SPVDiagnostic diagnostic) {
        return nspvDiagnosticPrint(diagnostic.address());
    }

    public static long nspvOpcodeString(int opcode) {
        long __functionAddress = Functions.OpcodeString;
        return JNI.invokeP(opcode, __functionAddress);
    }

    @NativeType("char const *")
    public static String spvOpcodeString(@NativeType("uint32_t const") int opcode) {
        long __result = nspvOpcodeString(opcode);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static int nspvBinaryParse(long context, long user_data, long words, long num_words, long parse_header, long parse_instruction, long diagnostic) {
        long __functionAddress = Functions.BinaryParse;
        if (Checks.CHECKS) {
            Checks.check(context);
        }
        return JNI.invokePPPPPPPI(context, user_data, words, num_words, parse_header, parse_instruction, diagnostic, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvBinaryParse(@NativeType("spv_const_context const") long context, @NativeType("void *") long user_data, @NativeType("uint32_t const *") IntBuffer words, @NativeType("spv_parsed_header_fn_t") SPVParsedHeaderFnI parse_header, @NativeType("spv_parsed_instruction_fn_t") SPVParsedInstructionFnI parse_instruction, @NativeType("spv_diagnostic *") PointerBuffer diagnostic) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) diagnostic, 1);
        }
        return nspvBinaryParse(context, user_data, MemoryUtil.memAddress(words), words.remaining(), MemoryUtil.memAddressSafe(parse_header), MemoryUtil.memAddressSafe(parse_instruction), MemoryUtil.memAddressSafe(diagnostic));
    }
}
