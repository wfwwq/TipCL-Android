package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCudaFunctionCreateInfoNV.class */
public class VkCudaFunctionCreateInfoNV extends Struct<VkCudaFunctionCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MODULE;
    public static final int PNAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODULE = layout.offsetof(2);
        PNAME = layout.offsetof(3);
    }

    protected VkCudaFunctionCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCudaFunctionCreateInfoNV create(long address, ByteBuffer container) {
        return new VkCudaFunctionCreateInfoNV(address, container);
    }

    public VkCudaFunctionCreateInfoNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkCudaModuleNV")
    public long module() {
        return nmodule(address());
    }

    @NativeType("char const *")
    public ByteBuffer pName() {
        return npName(address());
    }

    @NativeType("char const *")
    public String pNameString() {
        return npNameString(address());
    }

    public VkCudaFunctionCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCudaFunctionCreateInfoNV sType$Default() {
        return sType(1000307001);
    }

    public VkCudaFunctionCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCudaFunctionCreateInfoNV module(@NativeType("VkCudaModuleNV") long value) {
        nmodule(address(), value);
        return this;
    }

    public VkCudaFunctionCreateInfoNV pName(@NativeType("char const *") ByteBuffer value) {
        npName(address(), value);
        return this;
    }

    public VkCudaFunctionCreateInfoNV set(int sType, long pNext, long module, ByteBuffer pName) {
        sType(sType);
        pNext(pNext);
        module(module);
        pName(pName);
        return this;
    }

    public VkCudaFunctionCreateInfoNV set(VkCudaFunctionCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCudaFunctionCreateInfoNV malloc() {
        return new VkCudaFunctionCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCudaFunctionCreateInfoNV calloc() {
        return new VkCudaFunctionCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCudaFunctionCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCudaFunctionCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCudaFunctionCreateInfoNV create(long address) {
        return new VkCudaFunctionCreateInfoNV(address, null);
    }

    public static VkCudaFunctionCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCudaFunctionCreateInfoNV(address, null);
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

    public static VkCudaFunctionCreateInfoNV malloc(MemoryStack stack) {
        return new VkCudaFunctionCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCudaFunctionCreateInfoNV calloc(MemoryStack stack) {
        return new VkCudaFunctionCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static long nmodule(long struct) {
        return MemoryUtil.memGetLong(struct + MODULE);
    }

    public static ByteBuffer npName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static String npNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmodule(long struct, long value) {
        MemoryUtil.memPutLong(struct + MODULE, value);
    }

    public static void npName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PNAME, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PNAME));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCudaFunctionCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCudaFunctionCreateInfoNV, Buffer> implements NativeResource {
        private static final VkCudaFunctionCreateInfoNV ELEMENT_FACTORY = VkCudaFunctionCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCudaFunctionCreateInfoNV.SIZEOF);
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
        public VkCudaFunctionCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCudaFunctionCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCudaFunctionCreateInfoNV.npNext(address());
        }

        @NativeType("VkCudaModuleNV")
        public long module() {
            return VkCudaFunctionCreateInfoNV.nmodule(address());
        }

        @NativeType("char const *")
        public ByteBuffer pName() {
            return VkCudaFunctionCreateInfoNV.npName(address());
        }

        @NativeType("char const *")
        public String pNameString() {
            return VkCudaFunctionCreateInfoNV.npNameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCudaFunctionCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000307001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCudaFunctionCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer module(@NativeType("VkCudaModuleNV") long value) {
            VkCudaFunctionCreateInfoNV.nmodule(address(), value);
            return this;
        }

        public Buffer pName(@NativeType("char const *") ByteBuffer value) {
            VkCudaFunctionCreateInfoNV.npName(address(), value);
            return this;
        }
    }
}
