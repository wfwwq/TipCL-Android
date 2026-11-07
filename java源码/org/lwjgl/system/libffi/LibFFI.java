package org.lwjgl.system.libffi;

import java.nio.ByteBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/libffi/LibFFI.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/libffi/LibFFI.class */
public class LibFFI {
    public static final String FFI_VERSION_STRING = "3.5.0";
    public static final int FFI_VERSION_NUMBER = 30500;
    public static final short FFI_TYPE_VOID = 0;
    public static final short FFI_TYPE_INT = 1;
    public static final short FFI_TYPE_FLOAT = 2;
    public static final short FFI_TYPE_DOUBLE = 3;
    public static final short FFI_TYPE_LONGDOUBLE;
    public static final short FFI_TYPE_UINT8 = 5;
    public static final short FFI_TYPE_SINT8 = 6;
    public static final short FFI_TYPE_UINT16 = 7;
    public static final short FFI_TYPE_SINT16 = 8;
    public static final short FFI_TYPE_UINT32 = 9;
    public static final short FFI_TYPE_SINT32 = 10;
    public static final short FFI_TYPE_UINT64 = 11;
    public static final short FFI_TYPE_SINT64 = 12;
    public static final short FFI_TYPE_STRUCT = 13;
    public static final short FFI_TYPE_POINTER = 14;
    public static final int FFI_FIRST_ABI;
    public static final int FFI_WIN64;
    public static final int FFI_GNUW64;
    public static final int FFI_UNIX64;
    public static final int FFI_EFI64;
    public static final int FFI_SYSV;
    public static final int FFI_STDCALL;
    public static final int FFI_THISCALL;
    public static final int FFI_FASTCALL;
    public static final int FFI_MS_CDECL;
    public static final int FFI_PASCAL;
    public static final int FFI_REGISTER;
    public static final int FFI_VFP;
    public static final int FFI_LAST_ABI;
    public static final int FFI_DEFAULT_ABI;
    public static final int FFI_OK = 0;
    public static final int FFI_BAD_TYPEDEF = 1;
    public static final int FFI_BAD_ABI = 2;
    public static final int FFI_BAD_ARGTYPE = 3;
    public static final FFIType ffi_type_void;
    public static final FFIType ffi_type_uint8;
    public static final FFIType ffi_type_sint8;
    public static final FFIType ffi_type_uint16;
    public static final FFIType ffi_type_sint16;
    public static final FFIType ffi_type_uint32;
    public static final FFIType ffi_type_sint32;
    public static final FFIType ffi_type_uint64;
    public static final FFIType ffi_type_sint64;
    public static final FFIType ffi_type_uchar;
    public static final FFIType ffi_type_schar;
    public static final FFIType ffi_type_ushort;
    public static final FFIType ffi_type_sshort;
    public static final FFIType ffi_type_uint;
    public static final FFIType ffi_type_sint;
    public static final FFIType ffi_type_ulong;
    public static final FFIType ffi_type_slong;
    public static final FFIType ffi_type_float;
    public static final FFIType ffi_type_double;
    public static final FFIType ffi_type_longdouble;
    public static final FFIType ffi_type_pointer;

    private static native short FFI_TYPE_DOUBLE();

    private static native int FFI_WIN64();

    private static native int FFI_GNUW64();

    private static native int FFI_UNIX64();

    private static native int FFI_EFI64();

    private static native int FFI_SYSV();

    private static native int FFI_STDCALL();

    private static native int FFI_THISCALL();

    private static native int FFI_FASTCALL();

    private static native int FFI_MS_CDECL();

    private static native int FFI_PASCAL();

    private static native int FFI_REGISTER();

    private static native int FFI_VFP();

    private static native int FFI_FIRST_ABI();

    private static native int FFI_LAST_ABI();

    private static native int FFI_DEFAULT_ABI();

    private static native long nffi_type_void();

    private static native long nffi_type_uint8();

    private static native long nffi_type_sint8();

    private static native long nffi_type_uint16();

    private static native long nffi_type_sint16();

    private static native long nffi_type_uint32();

    private static native long nffi_type_sint32();

    private static native long nffi_type_uint64();

    private static native long nffi_type_sint64();

    private static native long nffi_type_uchar();

    private static native long nffi_type_schar();

    private static native long nffi_type_ushort();

    private static native long nffi_type_sshort();

    private static native long nffi_type_uint();

    private static native long nffi_type_sint();

    private static native long nffi_type_ulong();

    private static native long nffi_type_slong();

    private static native long nffi_type_float();

    private static native long nffi_type_double();

    private static native long nffi_type_longdouble();

    private static native long nffi_type_pointer();

    public static native long nffi_get_version();

    @NativeType("unsigned long")
    public static native long ffi_get_version_number();

    @NativeType("unsigned int")
    public static native int ffi_get_default_abi();

    public static native int nffi_prep_cif(long j, int i, int i2, long j2, long j3);

    public static native int nffi_prep_cif_var(long j, int i, int i2, int i3, long j2, long j3);

    public static native void nffi_call(long j, long j2, long j3, long j4);

    public static native int nffi_get_struct_offsets(int i, long j, long j2);

    @NativeType("size_t")
    public static native long ffi_get_closure_size();

    public static native long nffi_closure_alloc(long j, long j2);

    public static native void nffi_closure_free(long j);

    public static native int nffi_prep_closure_loc(long j, long j2, long j3, long j4, long j5);

    static {
        Library.initialize();
        FFI_TYPE_LONGDOUBLE = FFI_TYPE_DOUBLE();
        FFI_FIRST_ABI = FFI_FIRST_ABI();
        FFI_WIN64 = FFI_WIN64();
        FFI_GNUW64 = FFI_GNUW64();
        FFI_UNIX64 = FFI_UNIX64();
        FFI_EFI64 = FFI_EFI64();
        FFI_SYSV = FFI_SYSV();
        FFI_STDCALL = FFI_STDCALL();
        FFI_THISCALL = FFI_THISCALL();
        FFI_FASTCALL = FFI_FASTCALL();
        FFI_MS_CDECL = FFI_MS_CDECL();
        FFI_PASCAL = FFI_PASCAL();
        FFI_REGISTER = FFI_REGISTER();
        FFI_VFP = FFI_VFP();
        FFI_LAST_ABI = FFI_LAST_ABI();
        FFI_DEFAULT_ABI = FFI_DEFAULT_ABI();
        ffi_type_void = ffi_type_void();
        ffi_type_uint8 = ffi_type_uint8();
        ffi_type_sint8 = ffi_type_sint8();
        ffi_type_uint16 = ffi_type_uint16();
        ffi_type_sint16 = ffi_type_sint16();
        ffi_type_uint32 = ffi_type_uint32();
        ffi_type_sint32 = ffi_type_sint32();
        ffi_type_uint64 = ffi_type_uint64();
        ffi_type_sint64 = ffi_type_sint64();
        ffi_type_uchar = ffi_type_uchar();
        ffi_type_schar = ffi_type_schar();
        ffi_type_ushort = ffi_type_ushort();
        ffi_type_sshort = ffi_type_sshort();
        ffi_type_uint = ffi_type_uint();
        ffi_type_sint = ffi_type_sint();
        ffi_type_ulong = ffi_type_ulong();
        ffi_type_slong = ffi_type_slong();
        ffi_type_float = ffi_type_float();
        ffi_type_double = ffi_type_double();
        ffi_type_longdouble = ffi_type_longdouble();
        ffi_type_pointer = ffi_type_pointer();
    }

    protected LibFFI() {
        throw new UnsupportedOperationException();
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_void() {
        long __result = nffi_type_void();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint8() {
        long __result = nffi_type_uint8();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint8() {
        long __result = nffi_type_sint8();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint16() {
        long __result = nffi_type_uint16();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint16() {
        long __result = nffi_type_sint16();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint32() {
        long __result = nffi_type_uint32();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint32() {
        long __result = nffi_type_sint32();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint64() {
        long __result = nffi_type_uint64();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint64() {
        long __result = nffi_type_sint64();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uchar() {
        long __result = nffi_type_uchar();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_schar() {
        long __result = nffi_type_schar();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_ushort() {
        long __result = nffi_type_ushort();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sshort() {
        long __result = nffi_type_sshort();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_uint() {
        long __result = nffi_type_uint();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_sint() {
        long __result = nffi_type_sint();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_ulong() {
        long __result = nffi_type_ulong();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_slong() {
        long __result = nffi_type_slong();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_float() {
        long __result = nffi_type_float();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_double() {
        long __result = nffi_type_double();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_longdouble() {
        long __result = nffi_type_longdouble();
        return FFIType.create(__result);
    }

    @NativeType("ffi_type *")
    private static FFIType ffi_type_pointer() {
        long __result = nffi_type_pointer();
        return FFIType.create(__result);
    }

    @NativeType("char const *")
    public static String ffi_get_version() {
        long __result = nffi_get_version();
        return MemoryUtil.memASCIISafe(__result);
    }

    @NativeType("ffi_status")
    public static int ffi_prep_cif(@NativeType("ffi_cif *") FFICIF cif, @NativeType("ffi_abi") int abi, @NativeType("ffi_type *") FFIType rtype, @NativeType("ffi_type **") PointerBuffer atypes) {
        return nffi_prep_cif(cif.address(), abi, Checks.remainingSafe(atypes), rtype.address(), MemoryUtil.memAddressSafe(atypes));
    }

    @NativeType("ffi_status")
    public static int ffi_prep_cif_var(@NativeType("ffi_cif *") FFICIF cif, @NativeType("ffi_abi") int abi, @NativeType("unsigned int") int nfixedargs, @NativeType("ffi_type *") FFIType rtype, @NativeType("ffi_type **") PointerBuffer atypes) {
        return nffi_prep_cif_var(cif.address(), abi, nfixedargs, atypes.remaining(), rtype.address(), MemoryUtil.memAddress(atypes));
    }

    public static void ffi_call(@NativeType("ffi_cif *") FFICIF cif, @NativeType("FFI_FN_TYPE") long fn, @NativeType("void *") ByteBuffer rvalue, @NativeType("void **") PointerBuffer avalues) {
        if (Checks.CHECKS) {
            Checks.check(fn);
        }
        nffi_call(cif.address(), fn, MemoryUtil.memAddressSafe(rvalue), MemoryUtil.memAddressSafe(avalues));
    }

    @NativeType("ffi_status")
    public static int ffi_get_struct_offsets(@NativeType("ffi_abi") int abi, @NativeType("ffi_type *") FFIType struct_type, @NativeType("size_t *") PointerBuffer offsets) {
        return nffi_get_struct_offsets(abi, struct_type.address(), MemoryUtil.memAddressSafe(offsets));
    }

    @NativeType("ffi_closure *")
    public static FFIClosure ffi_closure_alloc(@NativeType("size_t") long size, @NativeType("void **") PointerBuffer code) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) code, 1);
        }
        long __result = nffi_closure_alloc(size, MemoryUtil.memAddress(code));
        return FFIClosure.createSafe(__result);
    }

    public static void ffi_closure_free(@NativeType("ffi_closure *") FFIClosure writable) {
        nffi_closure_free(writable.address());
    }

    @NativeType("ffi_status")
    public static int ffi_prep_closure_loc(@NativeType("ffi_closure *") FFIClosure closure, @NativeType("ffi_cif *") FFICIF cif, @NativeType("FFI_CLOSURE_FUN") long fun, @NativeType("void *") long user_data, @NativeType("void *") long codeloc) {
        if (Checks.CHECKS) {
            Checks.check(fun);
            Checks.check(codeloc);
        }
        return nffi_prep_closure_loc(closure.address(), cif.address(), fun, user_data, codeloc);
    }
}
