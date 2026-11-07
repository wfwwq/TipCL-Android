package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPushDescriptorSetInfo;
import org.lwjgl.vulkan.VkWriteDescriptorSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfoKHR.class */
public class VkPushDescriptorSetInfoKHR extends VkPushDescriptorSetInfo {
    protected VkPushDescriptorSetInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo, org.lwjgl.system.Struct
    public VkPushDescriptorSetInfoKHR create(long address, ByteBuffer container) {
        return new VkPushDescriptorSetInfoKHR(address, container);
    }

    public VkPushDescriptorSetInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR sType$Default() {
        return sType(1000545005);
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR set(@NativeType("uint32_t") int value) {
        nset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) {
        npDescriptorWrites(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public VkPushDescriptorSetInfoKHR set(int sType, long pNext, int stageFlags, long layout, int set, VkWriteDescriptorSet.Buffer pDescriptorWrites) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        set(set);
        pDescriptorWrites(pDescriptorWrites);
        return this;
    }

    public VkPushDescriptorSetInfoKHR set(VkPushDescriptorSetInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushDescriptorSetInfoKHR malloc() {
        return new VkPushDescriptorSetInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushDescriptorSetInfoKHR calloc() {
        return new VkPushDescriptorSetInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushDescriptorSetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPushDescriptorSetInfoKHR create(long address) {
        return new VkPushDescriptorSetInfoKHR(address, null);
    }

    public static VkPushDescriptorSetInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushDescriptorSetInfoKHR(address, null);
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

    public static VkPushDescriptorSetInfoKHR malloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushDescriptorSetInfoKHR calloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfoKHR$Buffer.class */
    public static class Buffer extends VkPushDescriptorSetInfo.Buffer {
        private static final VkPushDescriptorSetInfoKHR ELEMENT_FACTORY = VkPushDescriptorSetInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPushDescriptorSetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushDescriptorSetInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000545005);
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushDescriptorSetInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkPushDescriptorSetInfoKHR.nstageFlags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkPushDescriptorSetInfoKHR.nlayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public Buffer set(@NativeType("uint32_t") int value) {
            VkPushDescriptorSetInfoKHR.nset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public Buffer pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) {
            VkPushDescriptorSetInfoKHR.npDescriptorWrites(address(), value);
            return this;
        }
    }
}
