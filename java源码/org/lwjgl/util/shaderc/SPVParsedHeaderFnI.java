package org.lwjgl.util.shaderc;

import java.lang.invoke.MethodHandles;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType("spv_parsed_header_fn_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVParsedHeaderFnI.class */
public interface SPVParsedHeaderFnI extends CallbackI {
    public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_uint32, LibFFI.ffi_type_pointer, LibFFI.ffi_type_uint32, LibFFI.ffi_type_uint32, LibFFI.ffi_type_uint32, LibFFI.ffi_type_uint32, LibFFI.ffi_type_uint32, LibFFI.ffi_type_uint32));

    @NativeType("spv_result_t")
    int invoke(@NativeType("void *") long j, @NativeType("spv_endianness_t") int i, @NativeType("uint32_t") int i2, @NativeType("uint32_t") int i3, @NativeType("uint32_t") int i4, @NativeType("uint32_t") int i5, @NativeType("uint32_t") int i6);

    @Override // org.lwjgl.system.CallbackI
    default Callback.Descriptor getDescriptor() {
        return DESCRIPTOR;
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long ret, long args) {
        int __result = invoke(MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args)), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + POINTER_SIZE)), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (2 * POINTER_SIZE))), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (3 * POINTER_SIZE))), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (4 * POINTER_SIZE))), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (5 * POINTER_SIZE))), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (6 * POINTER_SIZE))));
        APIUtil.apiClosureRet(ret, __result);
    }
}
