package org.lwjgl.sdl;

import java.lang.invoke.MethodHandles;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType("bool (*) (void *, Uint8, Uint8, Uint8)")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDescSetLEDCallbackI.class */
public interface SDL_VirtualJoystickDescSetLEDCallbackI extends CallbackI {
    public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_uint8, LibFFI.ffi_type_pointer, LibFFI.ffi_type_uint8, LibFFI.ffi_type_uint8, LibFFI.ffi_type_uint8));

    @NativeType("bool")
    boolean invoke(@NativeType("void *") long j, @NativeType("Uint8") byte b, @NativeType("Uint8") byte b2, @NativeType("Uint8") byte b3);

    @Override // org.lwjgl.system.CallbackI
    default Callback.Descriptor getDescriptor() {
        return DESCRIPTOR;
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long ret, long args) {
        boolean __result = invoke(MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args)), MemoryUtil.memGetByte(MemoryUtil.memGetAddress(args + POINTER_SIZE)), MemoryUtil.memGetByte(MemoryUtil.memGetAddress(args + (2 * POINTER_SIZE))), MemoryUtil.memGetByte(MemoryUtil.memGetAddress(args + (3 * POINTER_SIZE))));
        APIUtil.apiClosureRet(ret, __result);
    }
}
