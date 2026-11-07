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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetDescriptorBufferOffsetsInfoEXT.class */
public class VkSetDescriptorBufferOffsetsInfoEXT extends Struct<VkSetDescriptorBufferOffsetsInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STAGEFLAGS;
    public static final int LAYOUT;
    public static final int FIRSTSET;
    public static final int SETCOUNT;
    public static final int PBUFFERINDICES;
    public static final int POFFSETS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        FIRSTSET = layout.offsetof(4);
        SETCOUNT = layout.offsetof(5);
        PBUFFERINDICES = layout.offsetof(6);
        POFFSETS = layout.offsetof(7);
    }

    protected VkSetDescriptorBufferOffsetsInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSetDescriptorBufferOffsetsInfoEXT create(long address, ByteBuffer container) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(address, container);
    }

    public VkSetDescriptorBufferOffsetsInfoEXT(ByteBuffer container) {
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
    public int setCount() {
        return nsetCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pBufferIndices() {
        return npBufferIndices(address());
    }

    @NativeType("VkDeviceSize const *")
    public LongBuffer pOffsets() {
        return npOffsets(address());
    }

    public VkSetDescriptorBufferOffsetsInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT sType$Default() {
        return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT);
    }

    public VkSetDescriptorBufferOffsetsInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT pNext(VkPipelineLayoutCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(@NativeType("uint32_t") int value) {
        nfirstSet(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT setCount(@NativeType("uint32_t") int value) {
        nsetCount(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npBufferIndices(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(@NativeType("VkDeviceSize const *") LongBuffer value) {
        npOffsets(address(), value);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT set(int sType, long pNext, int stageFlags, long layout, int firstSet, int setCount, IntBuffer pBufferIndices, LongBuffer pOffsets) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        firstSet(firstSet);
        setCount(setCount);
        pBufferIndices(pBufferIndices);
        pOffsets(pOffsets);
        return this;
    }

    public VkSetDescriptorBufferOffsetsInfoEXT set(VkSetDescriptorBufferOffsetsInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT malloc() {
        return new VkSetDescriptorBufferOffsetsInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT calloc() {
        return new VkSetDescriptorBufferOffsetsInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetDescriptorBufferOffsetsInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT create(long address) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(address, null);
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSetDescriptorBufferOffsetsInfoEXT(address, null);
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

    public static VkSetDescriptorBufferOffsetsInfoEXT malloc(MemoryStack stack) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSetDescriptorBufferOffsetsInfoEXT calloc(MemoryStack stack) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsetCount(long struct) {
        return MemoryUtil.memGetInt(struct + SETCOUNT);
    }

    public static IntBuffer npBufferIndices(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PBUFFERINDICES), nsetCount(struct));
    }

    public static LongBuffer npOffsets(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + POFFSETS), nsetCount(struct));
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

    public static void nsetCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SETCOUNT, value);
    }

    public static void npBufferIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PBUFFERINDICES, MemoryUtil.memAddress(value));
    }

    public static void npOffsets(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + POFFSETS, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PBUFFERINDICES));
        Checks.check(MemoryUtil.memGetAddress(struct + POFFSETS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSetDescriptorBufferOffsetsInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSetDescriptorBufferOffsetsInfoEXT, Buffer> implements NativeResource {
        private static final VkSetDescriptorBufferOffsetsInfoEXT ELEMENT_FACTORY = VkSetDescriptorBufferOffsetsInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSetDescriptorBufferOffsetsInfoEXT.SIZEOF);
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
        public VkSetDescriptorBufferOffsetsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSetDescriptorBufferOffsetsInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSetDescriptorBufferOffsetsInfoEXT.npNext(address());
        }

        @NativeType("VkShaderStageFlags")
        public int stageFlags() {
            return VkSetDescriptorBufferOffsetsInfoEXT.nstageFlags(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkSetDescriptorBufferOffsetsInfoEXT.nlayout(address());
        }

        @NativeType("uint32_t")
        public int firstSet() {
            return VkSetDescriptorBufferOffsetsInfoEXT.nfirstSet(address());
        }

        @NativeType("uint32_t")
        public int setCount() {
            return VkSetDescriptorBufferOffsetsInfoEXT.nsetCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pBufferIndices() {
            return VkSetDescriptorBufferOffsetsInfoEXT.npBufferIndices(address());
        }

        @NativeType("VkDeviceSize const *")
        public LongBuffer pOffsets() {
            return VkSetDescriptorBufferOffsetsInfoEXT.npOffsets(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSetDescriptorBufferOffsetsInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSetDescriptorBufferOffsetsInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineLayoutCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkSetDescriptorBufferOffsetsInfoEXT.nstageFlags(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkSetDescriptorBufferOffsetsInfoEXT.nlayout(address(), value);
            return this;
        }

        public Buffer firstSet(@NativeType("uint32_t") int value) {
            VkSetDescriptorBufferOffsetsInfoEXT.nfirstSet(address(), value);
            return this;
        }

        public Buffer setCount(@NativeType("uint32_t") int value) {
            VkSetDescriptorBufferOffsetsInfoEXT.nsetCount(address(), value);
            return this;
        }

        public Buffer pBufferIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkSetDescriptorBufferOffsetsInfoEXT.npBufferIndices(address(), value);
            return this;
        }

        public Buffer pOffsets(@NativeType("VkDeviceSize const *") LongBuffer value) {
            VkSetDescriptorBufferOffsetsInfoEXT.npOffsets(address(), value);
            return this;
        }
    }
}
