package org.lwjgl.util.shaderc;

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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVOptimizer.class */
public class SPVOptimizer {
    private static final SharedLibrary SHADERC = Library.loadNative((Class<?>) SPVOptimizer.class, "org.lwjgl.shaderc", Configuration.SPIRV_TOOLS_OPTIMIZER_LIBRARY_NAME, (Supplier<SharedLibrary>) Shaderc::getLibrary, new String[0]);

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVOptimizer$Functions.class */
    public static final class Functions {
        public static final long OptimizerCreate = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerCreate");
        public static final long OptimizerDestroy = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerDestroy");
        public static final long OptimizerSetMessageConsumer = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerSetMessageConsumer");
        public static final long OptimizerRegisterLegalizationPasses = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerRegisterLegalizationPasses");
        public static final long OptimizerRegisterPerformancePasses = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerRegisterPerformancePasses");
        public static final long OptimizerRegisterSizePasses = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerRegisterSizePasses");
        public static final long OptimizerRegisterPassFromFlag = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerRegisterPassFromFlag");
        public static final long OptimizerRegisterPassesFromFlags = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerRegisterPassesFromFlags");
        public static final long OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface");
        public static final long OptimizerRun = APIUtil.apiGetFunctionAddress(SPVOptimizer.SHADERC, "spvOptimizerRun");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return SHADERC;
    }

    protected SPVOptimizer() {
        throw new UnsupportedOperationException();
    }

    @NativeType("spv_optimizer_t *")
    public static long spvOptimizerCreate(@NativeType("spv_target_env") int env) {
        long __functionAddress = Functions.OptimizerCreate;
        return JNI.invokeP(env, __functionAddress);
    }

    public static void spvOptimizerDestroy(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerDestroy;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        JNI.invokePV(optimizer, __functionAddress);
    }

    public static void nspvOptimizerSetMessageConsumer(long optimizer, long consumer) {
        long __functionAddress = Functions.OptimizerSetMessageConsumer;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        JNI.invokePPV(optimizer, consumer, __functionAddress);
    }

    public static void spvOptimizerSetMessageConsumer(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("spv_message_consumer") SPVMessageConsumerI consumer) {
        nspvOptimizerSetMessageConsumer(optimizer, MemoryUtil.memAddressSafe(consumer));
    }

    public static void spvOptimizerRegisterLegalizationPasses(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerRegisterLegalizationPasses;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        JNI.invokePV(optimizer, __functionAddress);
    }

    public static void spvOptimizerRegisterPerformancePasses(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerRegisterPerformancePasses;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        JNI.invokePV(optimizer, __functionAddress);
    }

    public static void spvOptimizerRegisterSizePasses(@NativeType("spv_optimizer_t *") long optimizer) {
        long __functionAddress = Functions.OptimizerRegisterSizePasses;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        JNI.invokePV(optimizer, __functionAddress);
    }

    public static boolean nspvOptimizerRegisterPassFromFlag(long optimizer, long flag) {
        long __functionAddress = Functions.OptimizerRegisterPassFromFlag;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        return JNI.invokePPZ(optimizer, flag, __functionAddress);
    }

    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassFromFlag(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const *") ByteBuffer flag) {
        if (Checks.CHECKS) {
            Checks.checkNT1(flag);
        }
        return nspvOptimizerRegisterPassFromFlag(optimizer, MemoryUtil.memAddress(flag));
    }

    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassFromFlag(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const *") CharSequence flag) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(flag, true);
            long flagEncoded = stack.getPointerAddress();
            boolean zNspvOptimizerRegisterPassFromFlag = nspvOptimizerRegisterPassFromFlag(optimizer, flagEncoded);
            stack.setPointer(stackPointer);
            return zNspvOptimizerRegisterPassFromFlag;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nspvOptimizerRegisterPassesFromFlags(long optimizer, long flags, long flag_count) {
        long __functionAddress = Functions.OptimizerRegisterPassesFromFlags;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        return JNI.invokePPPZ(optimizer, flags, flag_count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassesFromFlags(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const **") PointerBuffer flags) {
        return nspvOptimizerRegisterPassesFromFlags(optimizer, MemoryUtil.memAddress(flags), flags.remaining());
    }

    public static boolean nspvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(long optimizer, long flags, long flag_count) {
        long __functionAddress = Functions.OptimizerRegisterPassesFromFlagsWhilePreservingTheInterface;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
        }
        return JNI.invokePPPZ(optimizer, flags, flag_count, __functionAddress);
    }

    @NativeType("bool")
    public static boolean spvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("char const **") PointerBuffer flags) {
        return nspvOptimizerRegisterPassesFromFlagsWhilePreservingTheInterface(optimizer, MemoryUtil.memAddress(flags), flags.remaining());
    }

    public static int nspvOptimizerRun(long optimizer, long binary, long word_count, long optimized_binary, long options) {
        long __functionAddress = Functions.OptimizerRun;
        if (Checks.CHECKS) {
            Checks.check(optimizer);
            Checks.check(options);
        }
        return JNI.invokePPPPPI(optimizer, binary, word_count, optimized_binary, options, __functionAddress);
    }

    @NativeType("spv_result_t")
    public static int spvOptimizerRun(@NativeType("spv_optimizer_t *") long optimizer, @NativeType("uint32_t const *") IntBuffer binary, @NativeType("spv_binary *") PointerBuffer optimized_binary, @NativeType("spv_optimizer_options const") long options) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) optimized_binary, 1);
        }
        return nspvOptimizerRun(optimizer, MemoryUtil.memAddress(binary), binary.remaining(), MemoryUtil.memAddress(optimized_binary), options);
    }
}
