package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPushConstantsInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantsInfoKHR.class */
public class VkPushConstantsInfoKHR extends VkPushConstantsInfo {
    protected VkPushConstantsInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPushConstantsInfo, org.lwjgl.system.Struct
    public VkPushConstantsInfoKHR create(long address, ByteBuffer container) {
        return new VkPushConstantsInfoKHR(address, container);
    }

    public VkPushConstantsInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR sType$Default() {
        return sType(1000545004);
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR pValues(@NativeType("void const *") ByteBuffer value) {
        npValues(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public VkPushConstantsInfoKHR set(int sType, long pNext, long layout, int stageFlags, int offset, ByteBuffer pValues) {
        sType(sType);
        pNext(pNext);
        layout(layout);
        stageFlags(stageFlags);
        offset(offset);
        pValues(pValues);
        return this;
    }

    public VkPushConstantsInfoKHR set(VkPushConstantsInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushConstantsInfoKHR malloc() {
        return new VkPushConstantsInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushConstantsInfoKHR calloc() {
        return new VkPushConstantsInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushConstantsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantsInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPushConstantsInfoKHR create(long address) {
        return new VkPushConstantsInfoKHR(address, null);
    }

    public static VkPushConstantsInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushConstantsInfoKHR(address, null);
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

    public static VkPushConstantsInfoKHR malloc(MemoryStack stack) {
        return new VkPushConstantsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushConstantsInfoKHR calloc(MemoryStack stack) {
        return new VkPushConstantsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantsInfoKHR$Buffer.class */
    public static class Buffer extends VkPushConstantsInfo.Buffer {
        private static final VkPushConstantsInfoKHR ELEMENT_FACTORY = VkPushConstantsInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPushConstantsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushConstantsInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000545004);
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushConstantsInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkPushConstantsInfoKHR.nlayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkPushConstantsInfoKHR.nstageFlags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public Buffer offset(@NativeType("uint32_t") int value) {
            VkPushConstantsInfoKHR.noffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public Buffer pValues(@NativeType("void const *") ByteBuffer value) {
            VkPushConstantsInfoKHR.npValues(address(), value);
            return this;
        }
    }
}
