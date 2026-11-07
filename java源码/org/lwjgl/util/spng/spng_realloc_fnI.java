package org.lwjgl.util.spng;

import java.lang.invoke.MethodHandles;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType("spng_realloc_fn")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spng.jar:org/lwjgl/util/spng/spng_realloc_fnI.class */
public interface spng_realloc_fnI extends CallbackI {
    public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer));

    @NativeType("void *")
    long invoke(@NativeType("void *") long j, @NativeType("size_t") long j2);

    @Override // org.lwjgl.system.CallbackI
    default Callback.Descriptor getDescriptor() {
        return DESCRIPTOR;
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long ret, long args) {
        long __result = invoke(MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args)), MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + POINTER_SIZE)));
        APIUtil.apiClosureRetP(ret, __result);
    }
}
