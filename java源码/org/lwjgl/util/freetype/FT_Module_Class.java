package org.lwjgl.util.freetype;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Class.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Class.class */
public class FT_Module_Class extends Struct<FT_Module_Class> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MODULE_FLAGS;
    public static final int MODULE_SIZE;
    public static final int MODULE_NAME;
    public static final int MODULE_VERSION;
    public static final int MODULE_REQUIRES;
    public static final int MODULE_INTERFACE;
    public static final int MODULE_INIT;
    public static final int MODULE_DONE;
    public static final int GET_INTERFACE;

    static {
        Struct.Layout layout = __struct(__member(CLONG_SIZE), __member(CLONG_SIZE), __member(POINTER_SIZE), __member(CLONG_SIZE), __member(CLONG_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MODULE_FLAGS = layout.offsetof(0);
        MODULE_SIZE = layout.offsetof(1);
        MODULE_NAME = layout.offsetof(2);
        MODULE_VERSION = layout.offsetof(3);
        MODULE_REQUIRES = layout.offsetof(4);
        MODULE_INTERFACE = layout.offsetof(5);
        MODULE_INIT = layout.offsetof(6);
        MODULE_DONE = layout.offsetof(7);
        GET_INTERFACE = layout.offsetof(8);
    }

    protected FT_Module_Class(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public FT_Module_Class create(long address, ByteBuffer container) {
        return new FT_Module_Class(address, container);
    }

    public FT_Module_Class(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("FT_ULong")
    public long module_flags() {
        return nmodule_flags(address());
    }

    @NativeType("FT_Long")
    public long module_size() {
        return nmodule_size(address());
    }

    @NativeType("FT_String const *")
    public ByteBuffer module_name() {
        return nmodule_name(address());
    }

    @NativeType("FT_String const *")
    public String module_nameString() {
        return nmodule_nameString(address());
    }

    @NativeType("FT_Fixed")
    public long module_version() {
        return nmodule_version(address());
    }

    @NativeType("FT_Fixed")
    public long module_requires() {
        return nmodule_requires(address());
    }

    @NativeType("void const *")
    public ByteBuffer module_interface(int capacity) {
        return nmodule_interface(address(), capacity);
    }

    public FT_Module_Constructor module_init() {
        return nmodule_init(address());
    }

    public FT_Module_Destructor module_done() {
        return nmodule_done(address());
    }

    public FT_Module_Requester get_interface() {
        return nget_interface(address());
    }

    public FT_Module_Class module_flags(@NativeType("FT_ULong") long value) {
        nmodule_flags(address(), value);
        return this;
    }

    public FT_Module_Class module_size(@NativeType("FT_Long") long value) {
        nmodule_size(address(), value);
        return this;
    }

    public FT_Module_Class module_name(@NativeType("FT_String const *") ByteBuffer value) {
        nmodule_name(address(), value);
        return this;
    }

    public FT_Module_Class module_version(@NativeType("FT_Fixed") long value) {
        nmodule_version(address(), value);
        return this;
    }

    public FT_Module_Class module_requires(@NativeType("FT_Fixed") long value) {
        nmodule_requires(address(), value);
        return this;
    }

    public FT_Module_Class module_interface(@NativeType("void const *") ByteBuffer value) {
        nmodule_interface(address(), value);
        return this;
    }

    public FT_Module_Class module_init(@NativeType("FT_Module_Constructor") FT_Module_ConstructorI value) {
        nmodule_init(address(), value);
        return this;
    }

    public FT_Module_Class module_done(@NativeType("FT_Module_Destructor") FT_Module_DestructorI value) {
        nmodule_done(address(), value);
        return this;
    }

    public FT_Module_Class get_interface(@NativeType("FT_Module_Requester") FT_Module_RequesterI value) {
        nget_interface(address(), value);
        return this;
    }

    public FT_Module_Class set(long module_flags, long module_size, ByteBuffer module_name, long module_version, long module_requires, ByteBuffer module_interface, FT_Module_ConstructorI module_init, FT_Module_DestructorI module_done, FT_Module_RequesterI get_interface) {
        module_flags(module_flags);
        module_size(module_size);
        module_name(module_name);
        module_version(module_version);
        module_requires(module_requires);
        module_interface(module_interface);
        module_init(module_init);
        module_done(module_done);
        get_interface(get_interface);
        return this;
    }

    public FT_Module_Class set(FT_Module_Class src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static FT_Module_Class malloc() {
        return new FT_Module_Class(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static FT_Module_Class calloc() {
        return new FT_Module_Class(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static FT_Module_Class create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Module_Class(MemoryUtil.memAddress(container), container);
    }

    public static FT_Module_Class create(long address) {
        return new FT_Module_Class(address, null);
    }

    public static FT_Module_Class createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new FT_Module_Class(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static FT_Module_Class malloc(MemoryStack stack) {
        return new FT_Module_Class(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static FT_Module_Class calloc(MemoryStack stack) {
        return new FT_Module_Class(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nmodule_flags(long struct) {
        return MemoryUtil.memGetCLong(struct + MODULE_FLAGS);
    }

    public static long nmodule_size(long struct) {
        return MemoryUtil.memGetCLong(struct + MODULE_SIZE);
    }

    public static ByteBuffer nmodule_name(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + MODULE_NAME));
    }

    public static String nmodule_nameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + MODULE_NAME));
    }

    public static long nmodule_version(long struct) {
        return MemoryUtil.memGetCLong(struct + MODULE_VERSION);
    }

    public static long nmodule_requires(long struct) {
        return MemoryUtil.memGetCLong(struct + MODULE_REQUIRES);
    }

    public static ByteBuffer nmodule_interface(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + MODULE_INTERFACE), capacity);
    }

    public static FT_Module_Constructor nmodule_init(long struct) {
        return FT_Module_Constructor.createSafe(MemoryUtil.memGetAddress(struct + MODULE_INIT));
    }

    public static FT_Module_Destructor nmodule_done(long struct) {
        return FT_Module_Destructor.createSafe(MemoryUtil.memGetAddress(struct + MODULE_DONE));
    }

    public static FT_Module_Requester nget_interface(long struct) {
        return FT_Module_Requester.createSafe(MemoryUtil.memGetAddress(struct + GET_INTERFACE));
    }

    public static void nmodule_flags(long struct, long value) {
        MemoryUtil.memPutCLong(struct + MODULE_FLAGS, value);
    }

    public static void nmodule_size(long struct, long value) {
        MemoryUtil.memPutCLong(struct + MODULE_SIZE, value);
    }

    public static void nmodule_name(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + MODULE_NAME, MemoryUtil.memAddress(value));
    }

    public static void nmodule_version(long struct, long value) {
        MemoryUtil.memPutCLong(struct + MODULE_VERSION, value);
    }

    public static void nmodule_requires(long struct, long value) {
        MemoryUtil.memPutCLong(struct + MODULE_REQUIRES, value);
    }

    public static void nmodule_interface(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + MODULE_INTERFACE, MemoryUtil.memAddressSafe(value));
    }

    public static void nmodule_init(long struct, FT_Module_ConstructorI value) {
        MemoryUtil.memPutAddress(struct + MODULE_INIT, MemoryUtil.memAddressSafe(value));
    }

    public static void nmodule_done(long struct, FT_Module_DestructorI value) {
        MemoryUtil.memPutAddress(struct + MODULE_DONE, MemoryUtil.memAddressSafe(value));
    }

    public static void nget_interface(long struct, FT_Module_RequesterI value) {
        MemoryUtil.memPutAddress(struct + GET_INTERFACE, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + MODULE_NAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Class$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-freetype.jar:org/lwjgl/util/freetype/FT_Module_Class$Buffer.class */
    public static class Buffer extends StructBuffer<FT_Module_Class, Buffer> implements NativeResource {
        private static final FT_Module_Class ELEMENT_FACTORY = FT_Module_Class.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / FT_Module_Class.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public FT_Module_Class getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("FT_ULong")
        public long module_flags() {
            return FT_Module_Class.nmodule_flags(address());
        }

        @NativeType("FT_Long")
        public long module_size() {
            return FT_Module_Class.nmodule_size(address());
        }

        @NativeType("FT_String const *")
        public ByteBuffer module_name() {
            return FT_Module_Class.nmodule_name(address());
        }

        @NativeType("FT_String const *")
        public String module_nameString() {
            return FT_Module_Class.nmodule_nameString(address());
        }

        @NativeType("FT_Fixed")
        public long module_version() {
            return FT_Module_Class.nmodule_version(address());
        }

        @NativeType("FT_Fixed")
        public long module_requires() {
            return FT_Module_Class.nmodule_requires(address());
        }

        @NativeType("void const *")
        public ByteBuffer module_interface(int capacity) {
            return FT_Module_Class.nmodule_interface(address(), capacity);
        }

        public FT_Module_Constructor module_init() {
            return FT_Module_Class.nmodule_init(address());
        }

        public FT_Module_Destructor module_done() {
            return FT_Module_Class.nmodule_done(address());
        }

        public FT_Module_Requester get_interface() {
            return FT_Module_Class.nget_interface(address());
        }

        public Buffer module_flags(@NativeType("FT_ULong") long value) {
            FT_Module_Class.nmodule_flags(address(), value);
            return this;
        }

        public Buffer module_size(@NativeType("FT_Long") long value) {
            FT_Module_Class.nmodule_size(address(), value);
            return this;
        }

        public Buffer module_name(@NativeType("FT_String const *") ByteBuffer value) {
            FT_Module_Class.nmodule_name(address(), value);
            return this;
        }

        public Buffer module_version(@NativeType("FT_Fixed") long value) {
            FT_Module_Class.nmodule_version(address(), value);
            return this;
        }

        public Buffer module_requires(@NativeType("FT_Fixed") long value) {
            FT_Module_Class.nmodule_requires(address(), value);
            return this;
        }

        public Buffer module_interface(@NativeType("void const *") ByteBuffer value) {
            FT_Module_Class.nmodule_interface(address(), value);
            return this;
        }

        public Buffer module_init(@NativeType("FT_Module_Constructor") FT_Module_ConstructorI value) {
            FT_Module_Class.nmodule_init(address(), value);
            return this;
        }

        public Buffer module_done(@NativeType("FT_Module_Destructor") FT_Module_DestructorI value) {
            FT_Module_Class.nmodule_done(address(), value);
            return this;
        }

        public Buffer get_interface(@NativeType("FT_Module_Requester") FT_Module_RequesterI value) {
            FT_Module_Class.nget_interface(address(), value);
            return this;
        }
    }
}
