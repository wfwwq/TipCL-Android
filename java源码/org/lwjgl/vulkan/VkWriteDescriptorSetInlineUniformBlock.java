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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlock.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlock.class */
public class VkWriteDescriptorSetInlineUniformBlock extends Struct<VkWriteDescriptorSetInlineUniformBlock> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DATASIZE;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    protected VkWriteDescriptorSetInlineUniformBlock(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWriteDescriptorSetInlineUniformBlock create(long address, ByteBuffer container) {
        return new VkWriteDescriptorSetInlineUniformBlock(address, container);
    }

    public VkWriteDescriptorSetInlineUniformBlock(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int dataSize() {
        return ndataSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pData() {
        return npData(address());
    }

    public VkWriteDescriptorSetInlineUniformBlock sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWriteDescriptorSetInlineUniformBlock sType$Default() {
        return sType(1000138002);
    }

    public VkWriteDescriptorSetInlineUniformBlock pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWriteDescriptorSetInlineUniformBlock pData(@NativeType("void const *") ByteBuffer value) {
        npData(address(), value);
        return this;
    }

    public VkWriteDescriptorSetInlineUniformBlock set(int sType, long pNext, ByteBuffer pData) {
        sType(sType);
        pNext(pNext);
        pData(pData);
        return this;
    }

    public VkWriteDescriptorSetInlineUniformBlock set(VkWriteDescriptorSetInlineUniformBlock src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteDescriptorSetInlineUniformBlock malloc() {
        return new VkWriteDescriptorSetInlineUniformBlock(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteDescriptorSetInlineUniformBlock calloc() {
        return new VkWriteDescriptorSetInlineUniformBlock(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteDescriptorSetInlineUniformBlock create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetInlineUniformBlock(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteDescriptorSetInlineUniformBlock create(long address) {
        return new VkWriteDescriptorSetInlineUniformBlock(address, null);
    }

    public static VkWriteDescriptorSetInlineUniformBlock createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteDescriptorSetInlineUniformBlock(address, null);
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

    public static VkWriteDescriptorSetInlineUniformBlock malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetInlineUniformBlock(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteDescriptorSetInlineUniformBlock calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetInlineUniformBlock(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndataSize(long struct) {
        return MemoryUtil.memGetInt(struct + DATASIZE);
    }

    public static ByteBuffer npData(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PDATA), ndataSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndataSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + DATASIZE, value);
    }

    public static void npData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PDATA, MemoryUtil.memAddress(value));
        ndataSize(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDATA));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlock$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetInlineUniformBlock$Buffer.class */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetInlineUniformBlock, Buffer> implements NativeResource {
        private static final VkWriteDescriptorSetInlineUniformBlock ELEMENT_FACTORY = VkWriteDescriptorSetInlineUniformBlock.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWriteDescriptorSetInlineUniformBlock.SIZEOF);
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
        public VkWriteDescriptorSetInlineUniformBlock getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWriteDescriptorSetInlineUniformBlock.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWriteDescriptorSetInlineUniformBlock.npNext(address());
        }

        @NativeType("uint32_t")
        public int dataSize() {
            return VkWriteDescriptorSetInlineUniformBlock.ndataSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pData() {
            return VkWriteDescriptorSetInlineUniformBlock.npData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteDescriptorSetInlineUniformBlock.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000138002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWriteDescriptorSetInlineUniformBlock.npNext(address(), value);
            return this;
        }

        public Buffer pData(@NativeType("void const *") ByteBuffer value) {
            VkWriteDescriptorSetInlineUniformBlock.npData(address(), value);
            return this;
        }
    }
}
