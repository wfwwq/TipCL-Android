package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDescriptorSetsInfo.class */
public class VkBindDescriptorSetsInfo extends Struct<VkBindDescriptorSetsInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STAGEFLAGS;
    public static final int LAYOUT;
    public static final int FIRSTSET;
    public static final int DESCRIPTORSETCOUNT;
    public static final int PDESCRIPTORSETS;
    public static final int DYNAMICOFFSETCOUNT;
    public static final int PDYNAMICOFFSETS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        FIRSTSET = layout.offsetof(4);
        DESCRIPTORSETCOUNT = layout.offsetof(5);
        PDESCRIPTORSETS = layout.offsetof(6);
        DYNAMICOFFSETCOUNT = layout.offsetof(7);
        PDYNAMICOFFSETS = layout.offsetof(8);
    }

    protected VkBindDescriptorSetsInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindDescriptorSetsInfo create(long address, ByteBuffer container) {
        return new VkBindDescriptorSetsInfo(address, container);
    }

    public VkBindDescriptorSetsInfo(ByteBuffer container) {
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

    @NativeType("VkShaderStageFlags")
    public int stageFlags() {
        return nstageFlags(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("uint32_t")
    public int firstSet() {
        return nfirstSet(address());
    }

    @NativeType("uint32_t")
    public int descriptorSetCount() {
        return ndescriptorSetCount(address());
    }

    @NativeType("VkDescriptorSet const *")
    public LongBuffer pDescriptorSets() {
        return npDescriptorSets(address());
    }

    @NativeType("uint32_t")
    public int dynamicOffsetCount() {
        return ndynamicOffsetCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pDynamicOffsets() {
        return npDynamicOffsets(address());
    }

    public VkBindDescriptorSetsInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo sType$Default() {
        return sType(1000545003);
    }

    public VkBindDescriptorSetsInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo pNext(VkPipelineLayoutCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindDescriptorSetsInfo stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo firstSet(@NativeType("uint32_t") int value) {
        nfirstSet(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) {
        npDescriptorSets(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo dynamicOffsetCount(@NativeType("uint32_t") int value) {
        ndynamicOffsetCount(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo pDynamicOffsets(@NativeType("uint32_t const *") IntBuffer value) {
        npDynamicOffsets(address(), value);
        return this;
    }

    public VkBindDescriptorSetsInfo set(int sType, long pNext, int stageFlags, long layout, int firstSet, LongBuffer pDescriptorSets, int dynamicOffsetCount, IntBuffer pDynamicOffsets) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        firstSet(firstSet);
        pDescriptorSets(pDescriptorSets);
        dynamicOffsetCount(dynamicOffsetCount);
        pDynamicOffsets(pDynamicOffsets);
        return this;
    }

    public VkBindDescriptorSetsInfo set(VkBindDescriptorSetsInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindDescriptorSetsInfo malloc() {
        return new VkBindDescriptorSetsInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindDescriptorSetsInfo calloc() {
        return new VkBindDescriptorSetsInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindDescriptorSetsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDescriptorSetsInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBindDescriptorSetsInfo create(long address) {
        return new VkBindDescriptorSetsInfo(address, null);
    }

    public static VkBindDescriptorSetsInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindDescriptorSetsInfo(address, null);
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

    public static VkBindDescriptorSetsInfo malloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindDescriptorSetsInfo calloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STAGEFLAGS);
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static int nfirstSet(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTSET);
    }

    public static int ndescriptorSetCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORSETCOUNT);
    }

    public static LongBuffer npDescriptorSets(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PDESCRIPTORSETS), ndescriptorSetCount(struct));
    }

    public static int ndynamicOffsetCount(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICOFFSETCOUNT);
    }

    public static IntBuffer npDynamicOffsets(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDYNAMICOFFSETS), ndynamicOffsetCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstageFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGEFLAGS, value);
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nfirstSet(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTSET, value);
    }

    public static void ndescriptorSetCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORSETCOUNT, value);
    }

    public static void npDescriptorSets(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PDESCRIPTORSETS, MemoryUtil.memAddress(value));
        ndescriptorSetCount(struct, value.remaining());
    }

    public static void ndynamicOffsetCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICOFFSETCOUNT, value);
    }

    public static void npDynamicOffsets(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDYNAMICOFFSETS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ndynamicOffsetCount(struct, value.remaining());
        }
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDESCRIPTORSETS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDescriptorSetsInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindDescriptorSetsInfo, Buffer> implements NativeResource {
        private static final VkBindDescriptorSetsInfo ELEMENT_FACTORY = VkBindDescriptorSetsInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindDescriptorSetsInfo.SIZEOF);
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
        public VkBindDescriptorSetsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindDescriptorSetsInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindDescriptorSetsInfo.npNext(address());
        }

        @NativeType("VkShaderStageFlags")
        public int stageFlags() {
            return VkBindDescriptorSetsInfo.nstageFlags(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkBindDescriptorSetsInfo.nlayout(address());
        }

        @NativeType("uint32_t")
        public int firstSet() {
            return VkBindDescriptorSetsInfo.nfirstSet(address());
        }

        @NativeType("uint32_t")
        public int descriptorSetCount() {
            return VkBindDescriptorSetsInfo.ndescriptorSetCount(address());
        }

        @NativeType("VkDescriptorSet const *")
        public LongBuffer pDescriptorSets() {
            return VkBindDescriptorSetsInfo.npDescriptorSets(address());
        }

        @NativeType("uint32_t")
        public int dynamicOffsetCount() {
            return VkBindDescriptorSetsInfo.ndynamicOffsetCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pDynamicOffsets() {
            return VkBindDescriptorSetsInfo.npDynamicOffsets(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindDescriptorSetsInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000545003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindDescriptorSetsInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineLayoutCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkBindDescriptorSetsInfo.nstageFlags(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkBindDescriptorSetsInfo.nlayout(address(), value);
            return this;
        }

        public Buffer firstSet(@NativeType("uint32_t") int value) {
            VkBindDescriptorSetsInfo.nfirstSet(address(), value);
            return this;
        }

        public Buffer pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) {
            VkBindDescriptorSetsInfo.npDescriptorSets(address(), value);
            return this;
        }

        public Buffer dynamicOffsetCount(@NativeType("uint32_t") int value) {
            VkBindDescriptorSetsInfo.ndynamicOffsetCount(address(), value);
            return this;
        }

        public Buffer pDynamicOffsets(@NativeType("uint32_t const *") IntBuffer value) {
            VkBindDescriptorSetsInfo.npDynamicOffsets(address(), value);
            return this;
        }
    }
}
