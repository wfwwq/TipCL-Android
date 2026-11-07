package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.Struct;
import org.lwjgl.system.libc.LibCStdlib;
import org.lwjgl.system.macosx.ObjCMethodDescription;
import org.lwjgl.system.macosx.ObjCPropertyAttribute;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/ObjCRuntime.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/ObjCRuntime.class */
public class ObjCRuntime {
    private static final SharedLibrary OBJC = Library.loadNative(ObjCRuntime.class, "org.lwjgl", "objc");
    public static final long nil = 0;
    public static final byte YES = 1;
    public static final byte NO = 0;
    public static final char _C_ID = '@';
    public static final char _C_CLASS = '#';
    public static final char _C_SEL = ':';
    public static final char _C_CHR = 'c';
    public static final char _C_UCHR = 'C';
    public static final char _C_SHT = 's';
    public static final char _C_USHT = 'S';
    public static final char _C_INT = 'i';
    public static final char _C_UINT = 'I';
    public static final char _C_LNG = 'l';
    public static final char _C_ULNG = 'L';
    public static final char _C_LNG_LNG = 'q';
    public static final char _C_ULNG_LNG = 'Q';
    public static final char _C_FLT = 'f';
    public static final char _C_DBL = 'd';
    public static final char _C_BFLD = 'b';
    public static final char _C_BOOL = 'B';
    public static final char _C_VOID = 'v';
    public static final char _C_UNDEF = '?';
    public static final char _C_PTR = '^';
    public static final char _C_CHARPTR = '*';
    public static final char _C_ATOM = '%';
    public static final char _C_ARY_B = '[';
    public static final char _C_ARY_E = ']';
    public static final char _C_UNION_B = '(';
    public static final char _C_UNION_E = ')';
    public static final char _C_STRUCT_B = '{';
    public static final char _C_STRUCT_E = '}';
    public static final char _C_VECTOR = '!';
    public static final char _C_CONST = 'r';
    public static final int OBJC_ASSOCIATION_ASSIGN = 0;
    public static final int OBJC_ASSOCIATION_RETAIN_NONATOMIC = 1;
    public static final int OBJC_ASSOCIATION_COPY_NONATOMIC = 3;
    public static final int OBJC_ASSOCIATION_RETAIN = 1401;
    public static final int OBJC_ASSOCIATION_COPY = 1403;

    public static native void nprotocol_getMethodDescription(long j, long j2, boolean z, boolean z2, long j3, long j4);

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/ObjCRuntime$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/ObjCRuntime$Functions.class */
    public static final class Functions {
        public static final long object_copy = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_copy");
        public static final long object_dispose = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_dispose");
        public static final long object_getClass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_getClass");
        public static final long object_setClass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_setClass");
        public static final long object_getClassName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_getClassName");
        public static final long object_getIndexedIvars = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_getIndexedIvars");
        public static final long object_getIvar = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_getIvar");
        public static final long object_setIvar = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_setIvar");
        public static final long object_setInstanceVariable = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_setInstanceVariable");
        public static final long object_getInstanceVariable = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "object_getInstanceVariable");
        public static final long objc_getClass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_getClass");
        public static final long objc_getMetaClass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_getMetaClass");
        public static final long objc_lookUpClass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_lookUpClass");
        public static final long objc_getRequiredClass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_getRequiredClass");
        public static final long objc_getClassList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_getClassList");
        public static final long objc_copyClassList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_copyClassList");
        public static final long class_getName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getName");
        public static final long class_isMetaClass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_isMetaClass");
        public static final long class_getSuperclass = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getSuperclass");
        public static final long class_getVersion = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getVersion");
        public static final long class_setVersion = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_setVersion");
        public static final long class_getInstanceSize = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getInstanceSize");
        public static final long class_getInstanceVariable = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getInstanceVariable");
        public static final long class_getClassVariable = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getClassVariable");
        public static final long class_copyIvarList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_copyIvarList");
        public static final long class_getInstanceMethod = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getInstanceMethod");
        public static final long class_getClassMethod = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getClassMethod");
        public static final long class_getMethodImplementation = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getMethodImplementation");
        public static final long class_respondsToSelector = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_respondsToSelector");
        public static final long class_copyMethodList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_copyMethodList");
        public static final long class_conformsToProtocol = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_conformsToProtocol");
        public static final long class_copyProtocolList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_copyProtocolList");
        public static final long class_getProperty = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getProperty");
        public static final long class_copyPropertyList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_copyPropertyList");
        public static final long class_getIvarLayout = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getIvarLayout");
        public static final long class_getWeakIvarLayout = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getWeakIvarLayout");
        public static final long class_addMethod = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_addMethod");
        public static final long class_replaceMethod = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_replaceMethod");
        public static final long class_addIvar = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_addIvar");
        public static final long class_addProtocol = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_addProtocol");
        public static final long class_addProperty = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_addProperty");
        public static final long class_replaceProperty = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_replaceProperty");
        public static final long class_setIvarLayout = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_setIvarLayout");
        public static final long class_setWeakIvarLayout = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_setWeakIvarLayout");
        public static final long class_createInstance = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_createInstance");
        public static final long objc_constructInstance = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_constructInstance");
        public static final long objc_destructInstance = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_destructInstance");
        public static final long objc_allocateClassPair = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_allocateClassPair");
        public static final long objc_registerClassPair = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_registerClassPair");
        public static final long objc_disposeClassPair = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_disposeClassPair");
        public static final long method_getName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_getName");
        public static final long method_getImplementation = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_getImplementation");
        public static final long method_getTypeEncoding = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_getTypeEncoding");
        public static final long method_getNumberOfArguments = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_getNumberOfArguments");
        public static final long method_copyReturnType = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_copyReturnType");
        public static final long method_copyArgumentType = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_copyArgumentType");
        public static final long method_getReturnType = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_getReturnType");
        public static final long method_getArgumentType = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_getArgumentType");
        public static final long method_setImplementation = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_setImplementation");
        public static final long method_exchangeImplementations = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "method_exchangeImplementations");
        public static final long ivar_getName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "ivar_getName");
        public static final long ivar_getTypeEncoding = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "ivar_getTypeEncoding");
        public static final long ivar_getOffset = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "ivar_getOffset");
        public static final long property_getName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "property_getName");
        public static final long property_getAttributes = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "property_getAttributes");
        public static final long property_copyAttributeList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "property_copyAttributeList");
        public static final long property_copyAttributeValue = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "property_copyAttributeValue");
        public static final long objc_getProtocol = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_getProtocol");
        public static final long objc_copyProtocolList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_copyProtocolList");
        public static final long protocol_conformsToProtocol = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_conformsToProtocol");
        public static final long protocol_isEqual = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_isEqual");
        public static final long protocol_getName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_getName");
        public static final long protocol_getMethodDescription = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_getMethodDescription");
        public static final long protocol_copyMethodDescriptionList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_copyMethodDescriptionList");
        public static final long protocol_getProperty = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_getProperty");
        public static final long protocol_copyPropertyList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_copyPropertyList");
        public static final long protocol_copyProtocolList = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_copyProtocolList");
        public static final long objc_allocateProtocol = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_allocateProtocol");
        public static final long objc_registerProtocol = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_registerProtocol");
        public static final long protocol_addMethodDescription = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_addMethodDescription");
        public static final long protocol_addProtocol = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_addProtocol");
        public static final long protocol_addProperty = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "protocol_addProperty");
        public static final long objc_copyImageNames = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_copyImageNames");
        public static final long class_getImageName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "class_getImageName");
        public static final long objc_copyClassNamesForImage = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_copyClassNamesForImage");
        public static final long sel_getName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "sel_getName");
        public static final long sel_getUid = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "sel_getUid");
        public static final long sel_registerName = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "sel_registerName");
        public static final long sel_isEqual = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "sel_isEqual");
        public static final long objc_enumerationMutation = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_enumerationMutation");
        public static final long objc_setEnumerationMutationHandler = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_setEnumerationMutationHandler");
        public static final long imp_implementationWithBlock = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "imp_implementationWithBlock");
        public static final long imp_getBlock = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "imp_getBlock");
        public static final long imp_removeBlock = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "imp_removeBlock");
        public static final long objc_loadWeak = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_loadWeak");
        public static final long objc_storeWeak = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_storeWeak");
        public static final long objc_setAssociatedObject = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_setAssociatedObject");
        public static final long objc_getAssociatedObject = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_getAssociatedObject");
        public static final long objc_removeAssociatedObjects = APIUtil.apiGetFunctionAddress(ObjCRuntime.OBJC, "objc_removeAssociatedObjects");

        private Functions() {
        }
    }

    public static SharedLibrary getLibrary() {
        return OBJC;
    }

    protected ObjCRuntime() {
        throw new UnsupportedOperationException();
    }

    @NativeType("id")
    public static long object_copy(@NativeType("id") long obj, @NativeType("size_t") long size) {
        long __functionAddress = Functions.object_copy;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        return JNI.invokePPP(obj, size, __functionAddress);
    }

    @NativeType("id")
    public static long object_dispose(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_dispose;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        return JNI.invokePP(obj, __functionAddress);
    }

    @NativeType("Class")
    public static long object_getClass(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_getClass;
        return JNI.invokePP(obj, __functionAddress);
    }

    @NativeType("Class")
    public static long object_setClass(@NativeType("id") long obj, @NativeType("Class") long cls) {
        long __functionAddress = Functions.object_setClass;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePPP(obj, cls, __functionAddress);
    }

    public static long nobject_getClassName(long obj) {
        long __functionAddress = Functions.object_getClassName;
        return JNI.invokePP(obj, __functionAddress);
    }

    @NativeType("char const *")
    public static String object_getClassName(@NativeType("id") long obj) {
        long __result = nobject_getClassName(obj);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("void *")
    public static long object_getIndexedIvars(@NativeType("id") long obj) {
        long __functionAddress = Functions.object_getIndexedIvars;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        return JNI.invokePP(obj, __functionAddress);
    }

    @NativeType("id")
    public static long object_getIvar(@NativeType("id") long obj, @NativeType("Ivar") long ivar) {
        long __functionAddress = Functions.object_getIvar;
        if (Checks.CHECKS) {
            Checks.check(ivar);
        }
        return JNI.invokePPP(obj, ivar, __functionAddress);
    }

    public static void object_setIvar(@NativeType("id") long obj, @NativeType("Ivar") long ivar, @NativeType("id") long value) {
        long __functionAddress = Functions.object_setIvar;
        if (Checks.CHECKS) {
            Checks.check(obj);
            Checks.check(ivar);
            Checks.check(value);
        }
        JNI.invokePPPV(obj, ivar, value, __functionAddress);
    }

    public static long nobject_setInstanceVariable(long obj, long name, long value) {
        long __functionAddress = Functions.object_setInstanceVariable;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        return JNI.invokePPPP(obj, name, value, __functionAddress);
    }

    @NativeType("Ivar")
    public static long object_setInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") ByteBuffer name, @NativeType("void *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobject_setInstanceVariable(obj, MemoryUtil.memAddress(name), MemoryUtil.memAddress(value));
    }

    @NativeType("Ivar")
    public static long object_setInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") CharSequence name, @NativeType("void *") ByteBuffer value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobject_setInstanceVariable = nobject_setInstanceVariable(obj, nameEncoded, MemoryUtil.memAddress(value));
            stack.setPointer(stackPointer);
            return jNobject_setInstanceVariable;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobject_getInstanceVariable(long obj, long name, long outValue) {
        long __functionAddress = Functions.object_getInstanceVariable;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        return JNI.invokePPPP(obj, name, outValue, __functionAddress);
    }

    @NativeType("Ivar")
    public static long object_getInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") ByteBuffer name, @NativeType("void **") PointerBuffer outValue) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.check((CustomBuffer<?>) outValue, 1);
        }
        return nobject_getInstanceVariable(obj, MemoryUtil.memAddress(name), MemoryUtil.memAddress(outValue));
    }

    @NativeType("Ivar")
    public static long object_getInstanceVariable(@NativeType("id") long obj, @NativeType("char const *") CharSequence name, @NativeType("void **") PointerBuffer outValue) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) outValue, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobject_getInstanceVariable = nobject_getInstanceVariable(obj, nameEncoded, MemoryUtil.memAddress(outValue));
            stack.setPointer(stackPointer);
            return jNobject_getInstanceVariable;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_getClass(long name) {
        long __functionAddress = Functions.objc_getClass;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("Class")
    public static long objc_getClass(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobjc_getClass(MemoryUtil.memAddress(name));
    }

    @NativeType("Class")
    public static long objc_getClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobjc_getClass = nobjc_getClass(nameEncoded);
            stack.setPointer(stackPointer);
            return jNobjc_getClass;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_getMetaClass(long name) {
        long __functionAddress = Functions.objc_getMetaClass;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("Class")
    public static long objc_getMetaClass(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobjc_getMetaClass(MemoryUtil.memAddress(name));
    }

    @NativeType("Class")
    public static long objc_getMetaClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobjc_getMetaClass = nobjc_getMetaClass(nameEncoded);
            stack.setPointer(stackPointer);
            return jNobjc_getMetaClass;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_lookUpClass(long name) {
        long __functionAddress = Functions.objc_lookUpClass;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("Class")
    public static long objc_lookUpClass(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobjc_lookUpClass(MemoryUtil.memAddress(name));
    }

    @NativeType("Class")
    public static long objc_lookUpClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobjc_lookUpClass = nobjc_lookUpClass(nameEncoded);
            stack.setPointer(stackPointer);
            return jNobjc_lookUpClass;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_getRequiredClass(long name) {
        long __functionAddress = Functions.objc_getRequiredClass;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("Class")
    public static long objc_getRequiredClass(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobjc_getRequiredClass(MemoryUtil.memAddress(name));
    }

    @NativeType("Class")
    public static long objc_getRequiredClass(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobjc_getRequiredClass = nobjc_getRequiredClass(nameEncoded);
            stack.setPointer(stackPointer);
            return jNobjc_getRequiredClass;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nobjc_getClassList(long buffer, int bufferCount) {
        long __functionAddress = Functions.objc_getClassList;
        return JNI.invokePI(buffer, bufferCount, __functionAddress);
    }

    public static int objc_getClassList(@NativeType("Class *") PointerBuffer buffer) {
        return nobjc_getClassList(MemoryUtil.memAddressSafe(buffer), Checks.remainingSafe(buffer));
    }

    public static long nobjc_copyClassList(long outCount) {
        long __functionAddress = Functions.objc_copyClassList;
        return JNI.invokePP(outCount, __functionAddress);
    }

    @NativeType("Class *")
    public static PointerBuffer objc_copyClassList() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyClassList(MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_getName(long cls) {
        long __functionAddress = Functions.class_getName;
        return JNI.invokePP(cls, __functionAddress);
    }

    @NativeType("char const *")
    public static String class_getName(@NativeType("Class") long cls) {
        long __result = nclass_getName(cls);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("BOOL")
    public static boolean class_isMetaClass(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_isMetaClass;
        return JNI.invokePZ(cls, __functionAddress);
    }

    @NativeType("Class")
    public static long class_getSuperclass(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getSuperclass;
        return JNI.invokePP(cls, __functionAddress);
    }

    public static int class_getVersion(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getVersion;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePI(cls, __functionAddress);
    }

    public static void class_setVersion(@NativeType("Class") long cls, int version) {
        long __functionAddress = Functions.class_setVersion;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        JNI.invokePV(cls, version, __functionAddress);
    }

    @NativeType("size_t")
    public static long class_getInstanceSize(@NativeType("Class") long cls) {
        long __functionAddress = Functions.class_getInstanceSize;
        return JNI.invokePP(cls, __functionAddress);
    }

    public static long nclass_getInstanceVariable(long cls, long name) {
        long __functionAddress = Functions.class_getInstanceVariable;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePPP(cls, name, __functionAddress);
    }

    @NativeType("Ivar")
    public static long class_getInstanceVariable(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nclass_getInstanceVariable(cls, MemoryUtil.memAddress(name));
    }

    @NativeType("Ivar")
    public static long class_getInstanceVariable(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNclass_getInstanceVariable = nclass_getInstanceVariable(cls, nameEncoded);
            stack.setPointer(stackPointer);
            return jNclass_getInstanceVariable;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_getClassVariable(long cls, long name) {
        long __functionAddress = Functions.class_getClassVariable;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePPP(cls, name, __functionAddress);
    }

    @NativeType("Ivar")
    public static long class_getClassVariable(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nclass_getClassVariable(cls, MemoryUtil.memAddress(name));
    }

    @NativeType("Ivar")
    public static long class_getClassVariable(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNclass_getClassVariable = nclass_getClassVariable(cls, nameEncoded);
            stack.setPointer(stackPointer);
            return jNclass_getClassVariable;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_copyIvarList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyIvarList;
        return JNI.invokePPP(cls, outCount, __functionAddress);
    }

    @NativeType("Ivar *")
    public static PointerBuffer class_copyIvarList(@NativeType("Class") long cls) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyIvarList(cls, MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("Method")
    public static long class_getInstanceMethod(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_getInstanceMethod;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Checks.check(name);
        }
        return JNI.invokePPP(cls, name, __functionAddress);
    }

    @NativeType("Method")
    public static long class_getClassMethod(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_getClassMethod;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Checks.check(name);
        }
        return JNI.invokePPP(cls, name, __functionAddress);
    }

    @NativeType("IMP")
    public static long class_getMethodImplementation(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_getMethodImplementation;
        if (Checks.CHECKS) {
            Checks.check(name);
        }
        return JNI.invokePPP(cls, name, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean class_respondsToSelector(@NativeType("Class") long cls, @NativeType("SEL") long name) {
        long __functionAddress = Functions.class_respondsToSelector;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Checks.check(name);
        }
        return JNI.invokePPZ(cls, name, __functionAddress);
    }

    public static long nclass_copyMethodList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyMethodList;
        return JNI.invokePPP(cls, outCount, __functionAddress);
    }

    @NativeType("Method *")
    public static PointerBuffer class_copyMethodList(@NativeType("Class") long cls) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyMethodList(cls, MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("BOOL")
    public static boolean class_conformsToProtocol(@NativeType("Class") long cls, @NativeType("Protocol *") long protocol) {
        long __functionAddress = Functions.class_conformsToProtocol;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Checks.check(protocol);
        }
        return JNI.invokePPZ(cls, protocol, __functionAddress);
    }

    public static long nclass_copyProtocolList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyProtocolList;
        return JNI.invokePPP(cls, outCount, __functionAddress);
    }

    @NativeType("Protocol **")
    public static PointerBuffer class_copyProtocolList(@NativeType("Class") long cls) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyProtocolList(cls, MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_getProperty(long cls, long name) {
        long __functionAddress = Functions.class_getProperty;
        return JNI.invokePPP(cls, name, __functionAddress);
    }

    @NativeType("objc_property_t")
    public static long class_getProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nclass_getProperty(cls, MemoryUtil.memAddress(name));
    }

    @NativeType("objc_property_t")
    public static long class_getProperty(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNclass_getProperty = nclass_getProperty(cls, nameEncoded);
            stack.setPointer(stackPointer);
            return jNclass_getProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_copyPropertyList(long cls, long outCount) {
        long __functionAddress = Functions.class_copyPropertyList;
        return JNI.invokePPP(cls, outCount, __functionAddress);
    }

    @NativeType("objc_property_t *")
    public static PointerBuffer class_copyPropertyList(@NativeType("Class") long cls) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nclass_copyPropertyList(cls, MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_getIvarLayout(long cls) {
        long __functionAddress = Functions.class_getIvarLayout;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePP(cls, __functionAddress);
    }

    @NativeType("uint8_t const *")
    public static String class_getIvarLayout(@NativeType("Class") long cls) {
        long __result = nclass_getIvarLayout(cls);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static long nclass_getWeakIvarLayout(long cls) {
        long __functionAddress = Functions.class_getWeakIvarLayout;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePP(cls, __functionAddress);
    }

    @NativeType("uint8_t const *")
    public static String class_getWeakIvarLayout(@NativeType("Class") long cls) {
        long __result = nclass_getWeakIvarLayout(cls);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static boolean nclass_addMethod(long cls, long name, long imp, long types) {
        long __functionAddress = Functions.class_addMethod;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Checks.check(name);
            Checks.check(imp);
        }
        return JNI.invokePPPPZ(cls, name, imp, types, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean class_addMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") ByteBuffer types) {
        if (Checks.CHECKS) {
            Checks.checkNT1(types);
        }
        return nclass_addMethod(cls, name, imp, MemoryUtil.memAddress(types));
    }

    @NativeType("BOOL")
    public static boolean class_addMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") CharSequence types) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            boolean zNclass_addMethod = nclass_addMethod(cls, name, imp, typesEncoded);
            stack.setPointer(stackPointer);
            return zNclass_addMethod;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_replaceMethod(long cls, long name, long imp, long types) {
        long __functionAddress = Functions.class_replaceMethod;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Checks.check(name);
            Checks.check(imp);
        }
        return JNI.invokePPPPP(cls, name, imp, types, __functionAddress);
    }

    @NativeType("IMP")
    public static long class_replaceMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") ByteBuffer types) {
        if (Checks.CHECKS) {
            Checks.checkNT1(types);
        }
        return nclass_replaceMethod(cls, name, imp, MemoryUtil.memAddress(types));
    }

    @NativeType("IMP")
    public static long class_replaceMethod(@NativeType("Class") long cls, @NativeType("SEL") long name, @NativeType("IMP") long imp, @NativeType("char const *") CharSequence types) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            long jNclass_replaceMethod = nclass_replaceMethod(cls, name, imp, typesEncoded);
            stack.setPointer(stackPointer);
            return jNclass_replaceMethod;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nclass_addIvar(long cls, long name, long size, byte alignment, long types) {
        long __functionAddress = Functions.class_addIvar;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePPPUPZ(cls, name, size, alignment, types, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean class_addIvar(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("size_t") long size, @NativeType("uint8_t") byte alignment, @NativeType("char const *") ByteBuffer types) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.checkNT1(types);
        }
        return nclass_addIvar(cls, MemoryUtil.memAddress(name), size, alignment, MemoryUtil.memAddress(types));
    }

    @NativeType("BOOL")
    public static boolean class_addIvar(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name, @NativeType("size_t") long size, @NativeType("uint8_t") byte alignment, @NativeType("char const *") CharSequence types) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            boolean zNclass_addIvar = nclass_addIvar(cls, nameEncoded, size, alignment, typesEncoded);
            stack.setPointer(stackPointer);
            return zNclass_addIvar;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("BOOL")
    public static boolean class_addProtocol(@NativeType("Class") long cls, @NativeType("Protocol *") long protocol) {
        long __functionAddress = Functions.class_addProtocol;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Checks.check(protocol);
        }
        return JNI.invokePPZ(cls, protocol, __functionAddress);
    }

    public static boolean nclass_addProperty(long cls, long name, long attributes, int attributeCount) {
        long __functionAddress = Functions.class_addProperty;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        return JNI.invokePPPZ(cls, name, attributes, attributeCount, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean class_addProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nclass_addProperty(cls, MemoryUtil.memAddress(name), attributes.address(), attributes.remaining());
    }

    @NativeType("BOOL")
    public static boolean class_addProperty(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNclass_addProperty = nclass_addProperty(cls, nameEncoded, attributes.address(), attributes.remaining());
            stack.setPointer(stackPointer);
            return zNclass_addProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nclass_replaceProperty(long cls, long name, long attributes, int attributeCount) {
        long __functionAddress = Functions.class_replaceProperty;
        if (Checks.CHECKS) {
            Checks.check(cls);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        JNI.invokePPPV(cls, name, attributes, attributeCount, __functionAddress);
    }

    public static void class_replaceProperty(@NativeType("Class") long cls, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nclass_replaceProperty(cls, MemoryUtil.memAddress(name), attributes.address(), attributes.remaining());
    }

    public static void class_replaceProperty(@NativeType("Class") long cls, @NativeType("char const *") CharSequence name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nclass_replaceProperty(cls, nameEncoded, attributes.address(), attributes.remaining());
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nclass_setIvarLayout(long cls, long layout) {
        long __functionAddress = Functions.class_setIvarLayout;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        JNI.invokePPV(cls, layout, __functionAddress);
    }

    public static void class_setIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") ByteBuffer layout) {
        if (Checks.CHECKS) {
            Checks.checkNT1(layout);
        }
        nclass_setIvarLayout(cls, MemoryUtil.memAddress(layout));
    }

    public static void class_setIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") CharSequence layout) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(layout, true);
            long layoutEncoded = stack.getPointerAddress();
            nclass_setIvarLayout(cls, layoutEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nclass_setWeakIvarLayout(long cls, long layout) {
        long __functionAddress = Functions.class_setWeakIvarLayout;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        JNI.invokePPV(cls, layout, __functionAddress);
    }

    public static void class_setWeakIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") ByteBuffer layout) {
        if (Checks.CHECKS) {
            Checks.checkNT1(layout);
        }
        nclass_setWeakIvarLayout(cls, MemoryUtil.memAddress(layout));
    }

    public static void class_setWeakIvarLayout(@NativeType("Class") long cls, @NativeType("uint8_t const *") CharSequence layout) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(layout, true);
            long layoutEncoded = stack.getPointerAddress();
            nclass_setWeakIvarLayout(cls, layoutEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("id")
    public static long class_createInstance(@NativeType("Class") long cls, @NativeType("size_t") long extraBytes) {
        long __functionAddress = Functions.class_createInstance;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePPP(cls, extraBytes, __functionAddress);
    }

    public static long nobjc_constructInstance(long cls, long bytes) {
        long __functionAddress = Functions.objc_constructInstance;
        return JNI.invokePPP(cls, bytes, __functionAddress);
    }

    @NativeType("id")
    public static long objc_constructInstance(@NativeType("Class") long cls, @NativeType("void *") ByteBuffer bytes) {
        if (Checks.CHECKS && Checks.DEBUG) {
            Checks.checkSafe(bytes, class_getInstanceSize(cls));
        }
        return nobjc_constructInstance(cls, MemoryUtil.memAddressSafe(bytes));
    }

    @NativeType("void *")
    public static long objc_destructInstance(@NativeType("id") long obj) {
        long __functionAddress = Functions.objc_destructInstance;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        return JNI.invokePP(obj, __functionAddress);
    }

    public static long nobjc_allocateClassPair(long superclass, long name, long extraBytes) {
        long __functionAddress = Functions.objc_allocateClassPair;
        return JNI.invokePPPP(superclass, name, extraBytes, __functionAddress);
    }

    @NativeType("Class")
    public static long objc_allocateClassPair(@NativeType("Class") long superclass, @NativeType("char const *") ByteBuffer name, @NativeType("size_t") long extraBytes) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobjc_allocateClassPair(superclass, MemoryUtil.memAddress(name), extraBytes);
    }

    @NativeType("Class")
    public static long objc_allocateClassPair(@NativeType("Class") long superclass, @NativeType("char const *") CharSequence name, @NativeType("size_t") long extraBytes) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobjc_allocateClassPair = nobjc_allocateClassPair(superclass, nameEncoded, extraBytes);
            stack.setPointer(stackPointer);
            return jNobjc_allocateClassPair;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void objc_registerClassPair(@NativeType("Class") long cls) {
        long __functionAddress = Functions.objc_registerClassPair;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        JNI.invokePV(cls, __functionAddress);
    }

    public static void objc_disposeClassPair(@NativeType("Class") long cls) {
        long __functionAddress = Functions.objc_disposeClassPair;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        JNI.invokePV(cls, __functionAddress);
    }

    @NativeType("SEL")
    public static long method_getName(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getName;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        return JNI.invokePP(m, __functionAddress);
    }

    @NativeType("IMP")
    public static long method_getImplementation(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getImplementation;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        return JNI.invokePP(m, __functionAddress);
    }

    public static long nmethod_getTypeEncoding(long m) {
        long __functionAddress = Functions.method_getTypeEncoding;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        return JNI.invokePP(m, __functionAddress);
    }

    @NativeType("char const *")
    public static String method_getTypeEncoding(@NativeType("Method") long m) {
        long __result = nmethod_getTypeEncoding(m);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("unsigned int")
    public static int method_getNumberOfArguments(@NativeType("Method") long m) {
        long __functionAddress = Functions.method_getNumberOfArguments;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        return JNI.invokePI(m, __functionAddress);
    }

    public static long nmethod_copyReturnType(long m) {
        long __functionAddress = Functions.method_copyReturnType;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        return JNI.invokePP(m, __functionAddress);
    }

    @NativeType("char *")
    public static String method_copyReturnType(@NativeType("Method") long m) {
        long __result = nmethod_copyReturnType(m);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nmethod_copyArgumentType(long m, int index) {
        long __functionAddress = Functions.method_copyArgumentType;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        return JNI.invokePP(m, index, __functionAddress);
    }

    @NativeType("char *")
    public static String method_copyArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index) {
        long __result = 0;
        try {
            __result = nmethod_copyArgumentType(m, index);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            if (__result != 0) {
                LibCStdlib.nfree(__result);
            }
            return strMemUTF8Safe;
        } catch (Throwable th) {
            if (__result != 0) {
                LibCStdlib.nfree(__result);
            }
            throw th;
        }
    }

    public static void nmethod_getReturnType(long m, long dst, long dst_len) {
        long __functionAddress = Functions.method_getReturnType;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        JNI.invokePPPV(m, dst, dst_len, __functionAddress);
    }

    public static void method_getReturnType(@NativeType("Method") long m, @NativeType("char *") ByteBuffer dst) {
        nmethod_getReturnType(m, MemoryUtil.memAddress(dst), dst.remaining());
    }

    @NativeType("void")
    public static String method_getReturnType(@NativeType("Method") long m, @NativeType("size_t") long dst_len) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            ByteBuffer dst = stack.malloc((int) dst_len);
            nmethod_getReturnType(m, MemoryUtil.memAddress(dst), dst_len);
            String strMemUTF8 = MemoryUtil.memUTF8(MemoryUtil.memByteBufferNT1(MemoryUtil.memAddress(dst), (int) dst_len));
            stack.setPointer(stackPointer);
            return strMemUTF8;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nmethod_getArgumentType(long m, int index, long dst, long dst_len) {
        long __functionAddress = Functions.method_getArgumentType;
        if (Checks.CHECKS) {
            Checks.check(m);
        }
        JNI.invokePPPV(m, index, dst, dst_len, __functionAddress);
    }

    public static void method_getArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index, @NativeType("char *") ByteBuffer dst) {
        nmethod_getArgumentType(m, index, MemoryUtil.memAddress(dst), dst.remaining());
    }

    @NativeType("void")
    public static String method_getArgumentType(@NativeType("Method") long m, @NativeType("unsigned int") int index, @NativeType("size_t") long dst_len) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            ByteBuffer dst = stack.malloc((int) dst_len);
            nmethod_getArgumentType(m, index, MemoryUtil.memAddress(dst), dst_len);
            String strMemUTF8 = MemoryUtil.memUTF8(MemoryUtil.memByteBufferNT1(MemoryUtil.memAddress(dst), (int) dst_len));
            stack.setPointer(stackPointer);
            return strMemUTF8;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("IMP")
    public static long method_setImplementation(@NativeType("Method") long m, @NativeType("IMP") long imp) {
        long __functionAddress = Functions.method_setImplementation;
        if (Checks.CHECKS) {
            Checks.check(m);
            Checks.check(imp);
        }
        return JNI.invokePPP(m, imp, __functionAddress);
    }

    public static void method_exchangeImplementations(@NativeType("Method") long m1, @NativeType("Method") long m2) {
        long __functionAddress = Functions.method_exchangeImplementations;
        if (Checks.CHECKS) {
            Checks.check(m1);
            Checks.check(m2);
        }
        JNI.invokePPV(m1, m2, __functionAddress);
    }

    public static long nivar_getName(long v) {
        long __functionAddress = Functions.ivar_getName;
        if (Checks.CHECKS) {
            Checks.check(v);
        }
        return JNI.invokePP(v, __functionAddress);
    }

    @NativeType("char const *")
    public static String ivar_getName(@NativeType("Ivar") long v) {
        long __result = nivar_getName(v);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nivar_getTypeEncoding(long v) {
        long __functionAddress = Functions.ivar_getTypeEncoding;
        if (Checks.CHECKS) {
            Checks.check(v);
        }
        return JNI.invokePP(v, __functionAddress);
    }

    @NativeType("char const *")
    public static String ivar_getTypeEncoding(@NativeType("Ivar") long v) {
        long __result = nivar_getTypeEncoding(v);
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("ptrdiff_t")
    public static long ivar_getOffset(@NativeType("Ivar") long v) {
        long __functionAddress = Functions.ivar_getOffset;
        if (Checks.CHECKS) {
            Checks.check(v);
        }
        return JNI.invokePP(v, __functionAddress);
    }

    public static long nproperty_getName(long property) {
        long __functionAddress = Functions.property_getName;
        if (Checks.CHECKS) {
            Checks.check(property);
        }
        return JNI.invokePP(property, __functionAddress);
    }

    @NativeType("char const *")
    public static String property_getName(@NativeType("objc_property_t") long property) {
        long __result = nproperty_getName(property);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nproperty_getAttributes(long property) {
        long __functionAddress = Functions.property_getAttributes;
        if (Checks.CHECKS) {
            Checks.check(property);
        }
        return JNI.invokePP(property, __functionAddress);
    }

    @NativeType("char const *")
    public static String property_getAttributes(@NativeType("objc_property_t") long property) {
        long __result = nproperty_getAttributes(property);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nproperty_copyAttributeList(long property, long outCount) {
        long __functionAddress = Functions.property_copyAttributeList;
        if (Checks.CHECKS) {
            Checks.check(property);
        }
        return JNI.invokePPP(property, outCount, __functionAddress);
    }

    @NativeType("objc_property_attribute_t *")
    public static ObjCPropertyAttribute.Buffer property_copyAttributeList(@NativeType("objc_property_t") long property) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nproperty_copyAttributeList(property, MemoryUtil.memAddress(outCount));
            ObjCPropertyAttribute.Buffer bufferCreateSafe = ObjCPropertyAttribute.createSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return bufferCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nproperty_copyAttributeValue(long property, long attributeName) {
        long __functionAddress = Functions.property_copyAttributeValue;
        if (Checks.CHECKS) {
            Checks.check(property);
        }
        return JNI.invokePPP(property, attributeName, __functionAddress);
    }

    @NativeType("char *")
    public static String property_copyAttributeValue(@NativeType("objc_property_t") long property, @NativeType("char const *") ByteBuffer attributeName) {
        if (Checks.CHECKS) {
            Checks.checkNT1(attributeName);
        }
        long __result = 0;
        try {
            __result = nproperty_copyAttributeValue(property, MemoryUtil.memAddress(attributeName));
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            if (__result != 0) {
                LibCStdlib.nfree(__result);
            }
            return strMemUTF8Safe;
        } catch (Throwable th) {
            if (__result != 0) {
                LibCStdlib.nfree(__result);
            }
            throw th;
        }
    }

    @NativeType("char *")
    public static String property_copyAttributeValue(@NativeType("objc_property_t") long property, @NativeType("char const *") CharSequence attributeName) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        long __result = 0;
        try {
            stack.nUTF8(attributeName, true);
            long attributeNameEncoded = stack.getPointerAddress();
            __result = nproperty_copyAttributeValue(property, attributeNameEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            if (__result != 0) {
                LibCStdlib.nfree(__result);
            }
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            if (__result != 0) {
                LibCStdlib.nfree(__result);
            }
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_getProtocol(long name) {
        long __functionAddress = Functions.objc_getProtocol;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("Protocol *")
    public static long objc_getProtocol(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobjc_getProtocol(MemoryUtil.memAddress(name));
    }

    @NativeType("Protocol *")
    public static long objc_getProtocol(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobjc_getProtocol = nobjc_getProtocol(nameEncoded);
            stack.setPointer(stackPointer);
            return jNobjc_getProtocol;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_copyProtocolList(long outCount) {
        long __functionAddress = Functions.objc_copyProtocolList;
        return JNI.invokePP(outCount, __functionAddress);
    }

    @NativeType("Protocol **")
    public static PointerBuffer objc_copyProtocolList() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyProtocolList(MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("BOOL")
    public static boolean protocol_conformsToProtocol(@NativeType("Protocol *") long proto, @NativeType("Protocol *") long other) {
        long __functionAddress = Functions.protocol_conformsToProtocol;
        if (Checks.CHECKS) {
            Checks.check(proto);
            Checks.check(other);
        }
        return JNI.invokePPZ(proto, other, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean protocol_isEqual(@NativeType("Protocol *") long proto, @NativeType("Protocol *") long other) {
        long __functionAddress = Functions.protocol_isEqual;
        if (Checks.CHECKS) {
            Checks.check(proto);
            Checks.check(other);
        }
        return JNI.invokePPZ(proto, other, __functionAddress);
    }

    public static long nprotocol_getName(long p) {
        long __functionAddress = Functions.protocol_getName;
        if (Checks.CHECKS) {
            Checks.check(p);
        }
        return JNI.invokePP(p, __functionAddress);
    }

    @NativeType("char const *")
    public static String protocol_getName(@NativeType("Protocol *") long p) {
        long __result = nprotocol_getName(p);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static void nprotocol_getMethodDescription(long p, long aSel, boolean isRequiredMethod, boolean isInstanceMethod, long __result) {
        long __functionAddress = Functions.protocol_getMethodDescription;
        if (Checks.CHECKS) {
            Checks.check(p);
            Checks.check(aSel);
        }
        nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, __functionAddress, __result);
    }

    @NativeType("struct objc_method_description")
    public static ObjCMethodDescription protocol_getMethodDescription(@NativeType("Protocol *") long p, @NativeType("SEL") long aSel, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod, @NativeType("struct objc_method_description") ObjCMethodDescription __result) {
        nprotocol_getMethodDescription(p, aSel, isRequiredMethod, isInstanceMethod, __result.address());
        return __result;
    }

    public static long nprotocol_copyMethodDescriptionList(long p, boolean isRequiredMethod, boolean isInstanceMethod, long outCount) {
        long __functionAddress = Functions.protocol_copyMethodDescriptionList;
        if (Checks.CHECKS) {
            Checks.check(p);
        }
        return JNI.invokePPP(p, isRequiredMethod, isInstanceMethod, outCount, __functionAddress);
    }

    @NativeType("struct objc_method_description *")
    public static ObjCMethodDescription.Buffer protocol_copyMethodDescriptionList(@NativeType("Protocol *") long p, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nprotocol_copyMethodDescriptionList(p, isRequiredMethod, isInstanceMethod, MemoryUtil.memAddress(outCount));
            ObjCMethodDescription.Buffer bufferCreateSafe = ObjCMethodDescription.createSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return bufferCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nprotocol_getProperty(long proto, long name, boolean isRequiredProperty, boolean isInstanceProperty) {
        long __functionAddress = Functions.protocol_getProperty;
        if (Checks.CHECKS) {
            Checks.check(proto);
        }
        return JNI.invokePPP(proto, name, isRequiredProperty, isInstanceProperty, __functionAddress);
    }

    @NativeType("objc_property_t")
    public static long protocol_getProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") ByteBuffer name, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nprotocol_getProperty(proto, MemoryUtil.memAddress(name), isRequiredProperty, isInstanceProperty);
    }

    @NativeType("objc_property_t")
    public static long protocol_getProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") CharSequence name, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNprotocol_getProperty = nprotocol_getProperty(proto, nameEncoded, isRequiredProperty, isInstanceProperty);
            stack.setPointer(stackPointer);
            return jNprotocol_getProperty;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nprotocol_copyPropertyList(long proto, long outCount) {
        long __functionAddress = Functions.protocol_copyPropertyList;
        if (Checks.CHECKS) {
            Checks.check(proto);
        }
        return JNI.invokePPP(proto, outCount, __functionAddress);
    }

    @NativeType("objc_property_t *")
    public static PointerBuffer protocol_copyPropertyList(@NativeType("Protocol *") long proto) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nprotocol_copyPropertyList(proto, MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nprotocol_copyProtocolList(long proto, long outCount) {
        long __functionAddress = Functions.protocol_copyProtocolList;
        if (Checks.CHECKS) {
            Checks.check(proto);
        }
        return JNI.invokePPP(proto, outCount, __functionAddress);
    }

    @NativeType("Protocol **")
    public static PointerBuffer protocol_copyProtocolList(@NativeType("Protocol *") long proto) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nprotocol_copyProtocolList(proto, MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_allocateProtocol(long name) {
        long __functionAddress = Functions.objc_allocateProtocol;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("Protocol *")
    public static long objc_allocateProtocol(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nobjc_allocateProtocol(MemoryUtil.memAddress(name));
    }

    @NativeType("Protocol *")
    public static long objc_allocateProtocol(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long jNobjc_allocateProtocol = nobjc_allocateProtocol(nameEncoded);
            stack.setPointer(stackPointer);
            return jNobjc_allocateProtocol;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void objc_registerProtocol(@NativeType("Protocol *") long proto) {
        long __functionAddress = Functions.objc_registerProtocol;
        if (Checks.CHECKS) {
            Checks.check(proto);
        }
        JNI.invokePV(proto, __functionAddress);
    }

    public static void nprotocol_addMethodDescription(long proto, long name, long types, boolean isRequiredMethod, boolean isInstanceMethod) {
        long __functionAddress = Functions.protocol_addMethodDescription;
        if (Checks.CHECKS) {
            Checks.check(proto);
            Checks.check(name);
        }
        JNI.invokePPPV(proto, name, types, isRequiredMethod, isInstanceMethod, __functionAddress);
    }

    public static void protocol_addMethodDescription(@NativeType("Protocol *") long proto, @NativeType("SEL") long name, @NativeType("char const *") ByteBuffer types, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
        if (Checks.CHECKS) {
            Checks.checkNT1(types);
        }
        nprotocol_addMethodDescription(proto, name, MemoryUtil.memAddress(types), isRequiredMethod, isInstanceMethod);
    }

    public static void protocol_addMethodDescription(@NativeType("Protocol *") long proto, @NativeType("SEL") long name, @NativeType("char const *") CharSequence types, @NativeType("BOOL") boolean isRequiredMethod, @NativeType("BOOL") boolean isInstanceMethod) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(types, true);
            long typesEncoded = stack.getPointerAddress();
            nprotocol_addMethodDescription(proto, name, typesEncoded, isRequiredMethod, isInstanceMethod);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void protocol_addProtocol(@NativeType("Protocol *") long proto, @NativeType("Protocol *") long addition) {
        long __functionAddress = Functions.protocol_addProtocol;
        if (Checks.CHECKS) {
            Checks.check(proto);
            Checks.check(addition);
        }
        JNI.invokePPV(proto, addition, __functionAddress);
    }

    public static void nprotocol_addProperty(long proto, long name, long attributes, int attributeCount, boolean isRequiredProperty, boolean isInstanceProperty) {
        long __functionAddress = Functions.protocol_addProperty;
        if (Checks.CHECKS) {
            Checks.check(proto);
            Struct.validate(attributes, attributeCount, ObjCPropertyAttribute.SIZEOF, ObjCPropertyAttribute::validate);
        }
        JNI.invokePPPV(proto, name, attributes, attributeCount, isRequiredProperty, isInstanceProperty, __functionAddress);
    }

    public static void protocol_addProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") ByteBuffer name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nprotocol_addProperty(proto, MemoryUtil.memAddress(name), attributes.address(), attributes.remaining(), isRequiredProperty, isInstanceProperty);
    }

    public static void protocol_addProperty(@NativeType("Protocol *") long proto, @NativeType("char const *") CharSequence name, @NativeType("objc_property_attribute_t const *") ObjCPropertyAttribute.Buffer attributes, @NativeType("BOOL") boolean isRequiredProperty, @NativeType("BOOL") boolean isInstanceProperty) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nprotocol_addProperty(proto, nameEncoded, attributes.address(), attributes.remaining(), isRequiredProperty, isInstanceProperty);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nobjc_copyImageNames(long outCount) {
        long __functionAddress = Functions.objc_copyImageNames;
        return JNI.invokePP(outCount, __functionAddress);
    }

    @NativeType("char const **")
    public static PointerBuffer objc_copyImageNames() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyImageNames(MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nclass_getImageName(long cls) {
        long __functionAddress = Functions.class_getImageName;
        if (Checks.CHECKS) {
            Checks.check(cls);
        }
        return JNI.invokePP(cls, __functionAddress);
    }

    @NativeType("char const *")
    public static String class_getImageName(@NativeType("Class") long cls) {
        long __result = nclass_getImageName(cls);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nobjc_copyClassNamesForImage(long image, long outCount) {
        long __functionAddress = Functions.objc_copyClassNamesForImage;
        return JNI.invokePPP(image, outCount, __functionAddress);
    }

    @NativeType("char const **")
    public static PointerBuffer objc_copyClassNamesForImage(@NativeType("char const *") ByteBuffer image) {
        if (Checks.CHECKS) {
            Checks.checkNT1(image);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer outCount = stack.callocInt(1);
        try {
            long __result = nobjc_copyClassNamesForImage(MemoryUtil.memAddress(image), MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("char const **")
    public static PointerBuffer objc_copyClassNamesForImage(@NativeType("char const *") CharSequence image) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer outCount = stack.callocInt(1);
            stack.nUTF8(image, true);
            long imageEncoded = stack.getPointerAddress();
            long __result = nobjc_copyClassNamesForImage(imageEncoded, MemoryUtil.memAddress(outCount));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, outCount.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nsel_getName(long sel) {
        long __functionAddress = Functions.sel_getName;
        if (Checks.CHECKS) {
            Checks.check(sel);
        }
        return JNI.invokePP(sel, __functionAddress);
    }

    @NativeType("char const *")
    public static String sel_getName(@NativeType("SEL") long sel) {
        long __result = nsel_getName(sel);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static long nsel_getUid(long str) {
        long __functionAddress = Functions.sel_getUid;
        return JNI.invokePP(str, __functionAddress);
    }

    @NativeType("SEL")
    public static long sel_getUid(@NativeType("char const *") ByteBuffer str) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
        }
        return nsel_getUid(MemoryUtil.memAddress(str));
    }

    @NativeType("SEL")
    public static long sel_getUid(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            long jNsel_getUid = nsel_getUid(strEncoded);
            stack.setPointer(stackPointer);
            return jNsel_getUid;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nsel_registerName(long str) {
        long __functionAddress = Functions.sel_registerName;
        return JNI.invokePP(str, __functionAddress);
    }

    @NativeType("SEL")
    public static long sel_registerName(@NativeType("char const *") ByteBuffer str) {
        if (Checks.CHECKS) {
            Checks.checkNT1(str);
        }
        return nsel_registerName(MemoryUtil.memAddress(str));
    }

    @NativeType("SEL")
    public static long sel_registerName(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            long jNsel_registerName = nsel_registerName(strEncoded);
            stack.setPointer(stackPointer);
            return jNsel_registerName;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("BOOL")
    public static boolean sel_isEqual(@NativeType("SEL") long lhs, @NativeType("SEL") long rhs) {
        long __functionAddress = Functions.sel_isEqual;
        if (Checks.CHECKS) {
            Checks.check(lhs);
            Checks.check(rhs);
        }
        return JNI.invokePPZ(lhs, rhs, __functionAddress);
    }

    public static void objc_enumerationMutation(@NativeType("id") long obj) {
        long __functionAddress = Functions.objc_enumerationMutation;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        JNI.invokePV(obj, __functionAddress);
    }

    public static void nobjc_setEnumerationMutationHandler(long handler) {
        long __functionAddress = Functions.objc_setEnumerationMutationHandler;
        JNI.invokePV(handler, __functionAddress);
    }

    public static void objc_setEnumerationMutationHandler(@NativeType("EnumerationMutationHandler") EnumerationMutationHandlerI handler) {
        nobjc_setEnumerationMutationHandler(handler.address());
    }

    @NativeType("IMP")
    public static long imp_implementationWithBlock(@NativeType("id") long block) {
        long __functionAddress = Functions.imp_implementationWithBlock;
        if (Checks.CHECKS) {
            Checks.check(block);
        }
        return JNI.invokePP(block, __functionAddress);
    }

    @NativeType("id")
    public static long imp_getBlock(@NativeType("IMP") long anImp) {
        long __functionAddress = Functions.imp_getBlock;
        if (Checks.CHECKS) {
            Checks.check(anImp);
        }
        return JNI.invokePP(anImp, __functionAddress);
    }

    @NativeType("BOOL")
    public static boolean imp_removeBlock(@NativeType("IMP") long anImp) {
        long __functionAddress = Functions.imp_removeBlock;
        if (Checks.CHECKS) {
            Checks.check(anImp);
        }
        return JNI.invokePZ(anImp, __functionAddress);
    }

    public static long nobjc_loadWeak(long location) {
        long __functionAddress = Functions.objc_loadWeak;
        return JNI.invokePP(location, __functionAddress);
    }

    @NativeType("id")
    public static long objc_loadWeak(@NativeType("id *") PointerBuffer location) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) location, 1);
        }
        return nobjc_loadWeak(MemoryUtil.memAddressSafe(location));
    }

    public static long nobjc_storeWeak(long location, long obj) {
        long __functionAddress = Functions.objc_storeWeak;
        if (Checks.CHECKS) {
            Checks.check(obj);
        }
        return JNI.invokePPP(location, obj, __functionAddress);
    }

    @NativeType("id")
    public static long objc_storeWeak(@NativeType("id *") PointerBuffer location, @NativeType("id") long obj) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) location, 1);
        }
        return nobjc_storeWeak(MemoryUtil.memAddress(location), obj);
    }

    public static void objc_setAssociatedObject(@NativeType("id") long object, @NativeType("void const *") long key, @NativeType("id") long value, @NativeType("objc_AssociationPolicy") long policy) {
        long __functionAddress = Functions.objc_setAssociatedObject;
        if (Checks.CHECKS) {
            Checks.check(object);
            Checks.check(key);
            Checks.check(value);
        }
        JNI.invokePPPPV(object, key, value, policy, __functionAddress);
    }

    @NativeType("id")
    public static long objc_getAssociatedObject(@NativeType("id") long object, @NativeType("void const *") long key) {
        long __functionAddress = Functions.objc_getAssociatedObject;
        if (Checks.CHECKS) {
            Checks.check(object);
            Checks.check(key);
        }
        return JNI.invokePPP(object, key, __functionAddress);
    }

    public static void objc_removeAssociatedObjects(@NativeType("id") long object) {
        long __functionAddress = Functions.objc_removeAssociatedObjects;
        if (Checks.CHECKS) {
            Checks.check(object);
        }
        JNI.invokePV(object, __functionAddress);
    }
}
