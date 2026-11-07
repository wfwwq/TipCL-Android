package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindDescriptorSetsInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDescriptorSetsInfoKHR.class */
public class VkBindDescriptorSetsInfoKHR extends VkBindDescriptorSetsInfo {
    protected VkBindDescriptorSetsInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo, org.lwjgl.system.Struct
    public VkBindDescriptorSetsInfoKHR create(long address, ByteBuffer container) {
        return new VkBindDescriptorSetsInfoKHR(address, container);
    }

    public VkBindDescriptorSetsInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR sType$Default() {
        return sType(1000545003);
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR firstSet(@NativeType("uint32_t") int value) {
        nfirstSet(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) {
        npDescriptorSets(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR dynamicOffsetCount(@NativeType("uint32_t") int value) {
        ndynamicOffsetCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR pDynamicOffsets(@NativeType("uint32_t const *") IntBuffer value) {
        npDynamicOffsets(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public VkBindDescriptorSetsInfoKHR set(int sType, long pNext, int stageFlags, long layout, int firstSet, LongBuffer pDescriptorSets, int dynamicOffsetCount, IntBuffer pDynamicOffsets) {
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

    public VkBindDescriptorSetsInfoKHR set(VkBindDescriptorSetsInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindDescriptorSetsInfoKHR malloc() {
        return new VkBindDescriptorSetsInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindDescriptorSetsInfoKHR calloc() {
        return new VkBindDescriptorSetsInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindDescriptorSetsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDescriptorSetsInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindDescriptorSetsInfoKHR create(long address) {
        return new VkBindDescriptorSetsInfoKHR(address, null);
    }

    public static VkBindDescriptorSetsInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindDescriptorSetsInfoKHR(address, null);
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

    public static VkBindDescriptorSetsInfoKHR malloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindDescriptorSetsInfoKHR calloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDescriptorSetsInfoKHR$Buffer.class */
    public static class Buffer extends VkBindDescriptorSetsInfo.Buffer {
        private static final VkBindDescriptorSetsInfoKHR ELEMENT_FACTORY = VkBindDescriptorSetsInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBindDescriptorSetsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindDescriptorSetsInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000545003);
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindDescriptorSetsInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkBindDescriptorSetsInfoKHR.nstageFlags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkBindDescriptorSetsInfoKHR.nlayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer firstSet(@NativeType("uint32_t") int value) {
            VkBindDescriptorSetsInfoKHR.nfirstSet(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) {
            VkBindDescriptorSetsInfoKHR.npDescriptorSets(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer dynamicOffsetCount(@NativeType("uint32_t") int value) {
            VkBindDescriptorSetsInfoKHR.ndynamicOffsetCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public Buffer pDynamicOffsets(@NativeType("uint32_t const *") IntBuffer value) {
            VkBindDescriptorSetsInfoKHR.npDynamicOffsets(address(), value);
            return this;
        }
    }
}
