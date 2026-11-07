package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkDescriptorBufferInfo;
import org.lwjgl.vulkan.VkDescriptorImageInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSet.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSet.class */
public class VkWriteDescriptorSet extends Struct<VkWriteDescriptorSet> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DSTSET;
    public static final int DSTBINDING;
    public static final int DSTARRAYELEMENT;
    public static final int DESCRIPTORCOUNT;
    public static final int DESCRIPTORTYPE;
    public static final int PIMAGEINFO;
    public static final int PBUFFERINFO;
    public static final int PTEXELBUFFERVIEW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DSTSET = layout.offsetof(2);
        DSTBINDING = layout.offsetof(3);
        DSTARRAYELEMENT = layout.offsetof(4);
        DESCRIPTORCOUNT = layout.offsetof(5);
        DESCRIPTORTYPE = layout.offsetof(6);
        PIMAGEINFO = layout.offsetof(7);
        PBUFFERINFO = layout.offsetof(8);
        PTEXELBUFFERVIEW = layout.offsetof(9);
    }

    protected VkWriteDescriptorSet(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWriteDescriptorSet create(long address, ByteBuffer container) {
        return new VkWriteDescriptorSet(address, container);
    }

    public VkWriteDescriptorSet(ByteBuffer container) {
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

    @NativeType("VkDescriptorSet")
    public long dstSet() {
        return ndstSet(address());
    }

    @NativeType("uint32_t")
    public int dstBinding() {
        return ndstBinding(address());
    }

    @NativeType("uint32_t")
    public int dstArrayElement() {
        return ndstArrayElement(address());
    }

    @NativeType("uint32_t")
    public int descriptorCount() {
        return ndescriptorCount(address());
    }

    @NativeType("VkDescriptorType")
    public int descriptorType() {
        return ndescriptorType(address());
    }

    @NativeType("VkDescriptorImageInfo const *")
    public VkDescriptorImageInfo.Buffer pImageInfo() {
        return npImageInfo(address());
    }

    @NativeType("VkDescriptorBufferInfo const *")
    public VkDescriptorBufferInfo.Buffer pBufferInfo() {
        return npBufferInfo(address());
    }

    @NativeType("VkBufferView const *")
    public LongBuffer pTexelBufferView() {
        return npTexelBufferView(address());
    }

    public VkWriteDescriptorSet sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWriteDescriptorSet sType$Default() {
        return sType(35);
    }

    public VkWriteDescriptorSet pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetAccelerationStructureKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetAccelerationStructureNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetInlineUniformBlock value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetInlineUniformBlockEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetPartitionedAccelerationStructureNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkWriteDescriptorSet pNext(VkWriteDescriptorSetTensorARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkWriteDescriptorSet dstSet(@NativeType("VkDescriptorSet") long value) {
        ndstSet(address(), value);
        return this;
    }

    public VkWriteDescriptorSet dstBinding(@NativeType("uint32_t") int value) {
        ndstBinding(address(), value);
        return this;
    }

    public VkWriteDescriptorSet dstArrayElement(@NativeType("uint32_t") int value) {
        ndstArrayElement(address(), value);
        return this;
    }

    public VkWriteDescriptorSet descriptorCount(@NativeType("uint32_t") int value) {
        ndescriptorCount(address(), value);
        return this;
    }

    public VkWriteDescriptorSet descriptorType(@NativeType("VkDescriptorType") int value) {
        ndescriptorType(address(), value);
        return this;
    }

    public VkWriteDescriptorSet pImageInfo(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo.Buffer value) {
        npImageInfo(address(), value);
        return this;
    }

    public VkWriteDescriptorSet pBufferInfo(@NativeType("VkDescriptorBufferInfo const *") VkDescriptorBufferInfo.Buffer value) {
        npBufferInfo(address(), value);
        return this;
    }

    public VkWriteDescriptorSet pTexelBufferView(@NativeType("VkBufferView const *") LongBuffer value) {
        npTexelBufferView(address(), value);
        return this;
    }

    public VkWriteDescriptorSet set(int sType, long pNext, long dstSet, int dstBinding, int dstArrayElement, int descriptorCount, int descriptorType, VkDescriptorImageInfo.Buffer pImageInfo, VkDescriptorBufferInfo.Buffer pBufferInfo, LongBuffer pTexelBufferView) {
        sType(sType);
        pNext(pNext);
        dstSet(dstSet);
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);
        descriptorType(descriptorType);
        pImageInfo(pImageInfo);
        pBufferInfo(pBufferInfo);
        pTexelBufferView(pTexelBufferView);
        return this;
    }

    public VkWriteDescriptorSet set(VkWriteDescriptorSet src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteDescriptorSet malloc() {
        return new VkWriteDescriptorSet(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteDescriptorSet calloc() {
        return new VkWriteDescriptorSet(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteDescriptorSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSet(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteDescriptorSet create(long address) {
        return new VkWriteDescriptorSet(address, null);
    }

    public static VkWriteDescriptorSet createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteDescriptorSet(address, null);
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

    public static VkWriteDescriptorSet malloc(MemoryStack stack) {
        return new VkWriteDescriptorSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteDescriptorSet calloc(MemoryStack stack) {
        return new VkWriteDescriptorSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndstSet(long struct) {
        return MemoryUtil.memGetLong(struct + DSTSET);
    }

    public static int ndstBinding(long struct) {
        return MemoryUtil.memGetInt(struct + DSTBINDING);
    }

    public static int ndstArrayElement(long struct) {
        return MemoryUtil.memGetInt(struct + DSTARRAYELEMENT);
    }

    public static int ndescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORCOUNT);
    }

    public static int ndescriptorType(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORTYPE);
    }

    public static VkDescriptorImageInfo.Buffer npImageInfo(long struct) {
        return VkDescriptorImageInfo.createSafe(MemoryUtil.memGetAddress(struct + PIMAGEINFO), ndescriptorCount(struct));
    }

    public static VkDescriptorBufferInfo.Buffer npBufferInfo(long struct) {
        return VkDescriptorBufferInfo.createSafe(MemoryUtil.memGetAddress(struct + PBUFFERINFO), ndescriptorCount(struct));
    }

    public static LongBuffer npTexelBufferView(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PTEXELBUFFERVIEW), ndescriptorCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndstSet(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTSET, value);
    }

    public static void ndstBinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTBINDING, value);
    }

    public static void ndstArrayElement(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTARRAYELEMENT, value);
    }

    public static void ndescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORCOUNT, value);
    }

    public static void ndescriptorType(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORTYPE, value);
    }

    public static void npImageInfo(long struct, VkDescriptorImageInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGEINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void npBufferInfo(long struct, VkDescriptorBufferInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PBUFFERINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void npTexelBufferView(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PTEXELBUFFERVIEW, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSet$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSet$Buffer.class */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSet, Buffer> implements NativeResource {
        private static final VkWriteDescriptorSet ELEMENT_FACTORY = VkWriteDescriptorSet.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWriteDescriptorSet.SIZEOF);
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
        public VkWriteDescriptorSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWriteDescriptorSet.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWriteDescriptorSet.npNext(address());
        }

        @NativeType("VkDescriptorSet")
        public long dstSet() {
            return VkWriteDescriptorSet.ndstSet(address());
        }

        @NativeType("uint32_t")
        public int dstBinding() {
            return VkWriteDescriptorSet.ndstBinding(address());
        }

        @NativeType("uint32_t")
        public int dstArrayElement() {
            return VkWriteDescriptorSet.ndstArrayElement(address());
        }

        @NativeType("uint32_t")
        public int descriptorCount() {
            return VkWriteDescriptorSet.ndescriptorCount(address());
        }

        @NativeType("VkDescriptorType")
        public int descriptorType() {
            return VkWriteDescriptorSet.ndescriptorType(address());
        }

        @NativeType("VkDescriptorImageInfo const *")
        public VkDescriptorImageInfo.Buffer pImageInfo() {
            return VkWriteDescriptorSet.npImageInfo(address());
        }

        @NativeType("VkDescriptorBufferInfo const *")
        public VkDescriptorBufferInfo.Buffer pBufferInfo() {
            return VkWriteDescriptorSet.npBufferInfo(address());
        }

        @NativeType("VkBufferView const *")
        public LongBuffer pTexelBufferView() {
            return VkWriteDescriptorSet.npTexelBufferView(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteDescriptorSet.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(35);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWriteDescriptorSet.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkWriteDescriptorSetAccelerationStructureKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWriteDescriptorSetAccelerationStructureNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWriteDescriptorSetInlineUniformBlock value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWriteDescriptorSetInlineUniformBlockEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWriteDescriptorSetPartitionedAccelerationStructureNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkWriteDescriptorSetTensorARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer dstSet(@NativeType("VkDescriptorSet") long value) {
            VkWriteDescriptorSet.ndstSet(address(), value);
            return this;
        }

        public Buffer dstBinding(@NativeType("uint32_t") int value) {
            VkWriteDescriptorSet.ndstBinding(address(), value);
            return this;
        }

        public Buffer dstArrayElement(@NativeType("uint32_t") int value) {
            VkWriteDescriptorSet.ndstArrayElement(address(), value);
            return this;
        }

        public Buffer descriptorCount(@NativeType("uint32_t") int value) {
            VkWriteDescriptorSet.ndescriptorCount(address(), value);
            return this;
        }

        public Buffer descriptorType(@NativeType("VkDescriptorType") int value) {
            VkWriteDescriptorSet.ndescriptorType(address(), value);
            return this;
        }

        public Buffer pImageInfo(@NativeType("VkDescriptorImageInfo const *") VkDescriptorImageInfo.Buffer value) {
            VkWriteDescriptorSet.npImageInfo(address(), value);
            return this;
        }

        public Buffer pBufferInfo(@NativeType("VkDescriptorBufferInfo const *") VkDescriptorBufferInfo.Buffer value) {
            VkWriteDescriptorSet.npBufferInfo(address(), value);
            return this;
        }

        public Buffer pTexelBufferView(@NativeType("VkBufferView const *") LongBuffer value) {
            VkWriteDescriptorSet.npTexelBufferView(address(), value);
            return this;
        }
    }
}
