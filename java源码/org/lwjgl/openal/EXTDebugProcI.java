package org.lwjgl.openal;

import java.lang.invoke.MethodHandles;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.LibFFI;

@FunctionalInterface
@NativeType("ALDEBUGPROCEXT")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-openal.jar:org/lwjgl/openal/EXTDebugProcI.class */
public interface EXTDebugProcI extends CallbackI {
    public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_void, LibFFI.ffi_type_sint32, LibFFI.ffi_type_sint32, LibFFI.ffi_type_uint32, LibFFI.ffi_type_sint32, LibFFI.ffi_type_sint32, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer));

    void invoke(@NativeType("ALenum") int i, @NativeType("ALenum") int i2, @NativeType("ALuint") int i3, @NativeType("ALenum") int i4, @NativeType("ALsizei") int i5, @NativeType("ALchar const *") long j, @NativeType("ALvoid *") long j2);

    @Override // org.lwjgl.system.CallbackI
    default Callback.Descriptor getDescriptor() {
        return DESCRIPTOR;
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long ret, long args) {
        invoke(MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args)), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + POINTER_SIZE)), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (2 * POINTER_SIZE))), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (3 * POINTER_SIZE))), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + (4 * POINTER_SIZE))), MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + (5 * POINTER_SIZE))), MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + (6 * POINTER_SIZE))));
    }
}
