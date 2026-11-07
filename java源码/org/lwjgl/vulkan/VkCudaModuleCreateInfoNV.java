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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCudaModuleCreateInfoNV.class */
public class VkCudaModuleCreateInfoNV extends Struct<VkCudaModuleCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DATASIZE;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    protected VkCudaModuleCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCudaModuleCreateInfoNV create(long address, ByteBuffer container) {
        return new VkCudaModuleCreateInfoNV(address, container);
    }

    public VkCudaModuleCreateInfoNV(ByteBuffer container) {
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

    @NativeType("size_t")
    public long dataSize() {
        return ndataSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pData() {
        return npData(address());
    }

    public VkCudaModuleCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCudaModuleCreateInfoNV sType$Default() {
        return sType(1000307000);
    }

    public VkCudaModuleCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCudaModuleCreateInfoNV pData(@NativeType("void const *") ByteBuffer value) {
        npData(address(), value);
        return this;
    }

    public VkCudaModuleCreateInfoNV set(int sType, long pNext, ByteBuffer pData) {
        sType(sType);
        pNext(pNext);
        pData(pData);
        return this;
    }

    public VkCudaModuleCreateInfoNV set(VkCudaModuleCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCudaModuleCreateInfoNV malloc() {
        return new VkCudaModuleCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCudaModuleCreateInfoNV calloc() {
        return new VkCudaModuleCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCudaModuleCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCudaModuleCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCudaModuleCreateInfoNV create(long address) {
        return new VkCudaModuleCreateInfoNV(address, null);
    }

    public static VkCudaModuleCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCudaModuleCreateInfoNV(address, null);
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

    public static VkCudaModuleCreateInfoNV malloc(MemoryStack stack) {
        return new VkCudaModuleCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCudaModuleCreateInfoNV calloc(MemoryStack stack) {
        return new VkCudaModuleCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + DATASIZE);
    }

    public static ByteBuffer npData(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PDATA), (int) ndataSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATASIZE, value);
    }

    public static void npData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PDATA, MemoryUtil.memAddress(value));
        ndataSize(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCudaModuleCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCudaModuleCreateInfoNV, Buffer> implements NativeResource {
        private static final VkCudaModuleCreateInfoNV ELEMENT_FACTORY = VkCudaModuleCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCudaModuleCreateInfoNV.SIZEOF);
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
        public VkCudaModuleCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCudaModuleCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCudaModuleCreateInfoNV.npNext(address());
        }

        @NativeType("size_t")
        public long dataSize() {
            return VkCudaModuleCreateInfoNV.ndataSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pData() {
            return VkCudaModuleCreateInfoNV.npData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCudaModuleCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000307000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCudaModuleCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pData(@NativeType("void const *") ByteBuffer value) {
            VkCudaModuleCreateInfoNV.npData(address(), value);
            return this;
        }
    }
}
