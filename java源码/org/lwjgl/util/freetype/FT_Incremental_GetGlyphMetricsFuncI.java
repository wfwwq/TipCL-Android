package org.lwjgl.util.freetype;

import java.lang.invoke.MethodHandles;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Callback;
import org.lwjgl.system.CallbackI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.libffi.LibFFI;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphMetricsFuncI.class
 */
@FunctionalInterface
@NativeType("FT_Incremental_GetGlyphMetricsFunc")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Incremental_GetGlyphMetricsFuncI.class */
public interface FT_Incremental_GetGlyphMetricsFuncI extends CallbackI {
    public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_sint32, LibFFI.ffi_type_pointer, LibFFI.ffi_type_uint32, LibFFI.ffi_type_uint8, LibFFI.ffi_type_pointer));

    @NativeType("FT_Error")
    int invoke(@NativeType("FT_Incremental") long j, @NativeType("FT_UInt") int i, @NativeType("FT_Bool") boolean z, @NativeType("FT_Incremental_MetricsRec *") long j2);

    @Override // org.lwjgl.system.CallbackI
    default Callback.Descriptor getDescriptor() {
        return DESCRIPTOR;
    }

    @Override // org.lwjgl.system.CallbackI
    default void callback(long ret, long args) {
        int __result = invoke(MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args)), MemoryUtil.memGetInt(MemoryUtil.memGetAddress(args + POINTER_SIZE)), MemoryUtil.memGetByte(MemoryUtil.memGetAddress(args + ((long) (2 * POINTER_SIZE)))) != 0, MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + (3 * POINTER_SIZE))));
        APIUtil.apiClosureRet(ret, __result);
    }
}
