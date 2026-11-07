package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetWithTemplateInfoKHR.class */
public class VkPushDescriptorSetWithTemplateInfoKHR extends VkPushDescriptorSetWithTemplateInfo {
    protected VkPushDescriptorSetWithTemplateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo, org.lwjgl.system.Struct
    public VkPushDescriptorSetWithTemplateInfoKHR create(long address, ByteBuffer container) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(address, container);
    }

    public VkPushDescriptorSetWithTemplateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR sType$Default() {
        return sType(1000545006);
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) {
        ndescriptorUpdateTemplate(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR set(@NativeType("uint32_t") int value) {
        nset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR pData(@NativeType("void const *") long value) {
        npData(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo
    public VkPushDescriptorSetWithTemplateInfoKHR set(int sType, long pNext, long descriptorUpdateTemplate, long layout, int set, long pData) {
        sType(sType);
        pNext(pNext);
        descriptorUpdateTemplate(descriptorUpdateTemplate);
        layout(layout);
        set(set);
        pData(pData);
        return this;
    }

    public VkPushDescriptorSetWithTemplateInfoKHR set(VkPushDescriptorSetWithTemplateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR malloc() {
        return new VkPushDescriptorSetWithTemplateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR calloc() {
        return new VkPushDescriptorSetWithTemplateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetWithTemplateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR create(long address) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(address, null);
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushDescriptorSetWithTemplateInfoKHR(address, null);
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

    public static VkPushDescriptorSetWithTemplateInfoKHR malloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR calloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDescriptorSetWithTemplateInfoKHR$Buffer.class */
    public static class Buffer extends VkPushDescriptorSetWithTemplateInfo.Buffer {
        private static final VkPushDescriptorSetWithTemplateInfoKHR ELEMENT_FACTORY = VkPushDescriptorSetWithTemplateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPushDescriptorSetWithTemplateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushDescriptorSetWithTemplateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000545006);
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushDescriptorSetWithTemplateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer
        public Buffer descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) {
            VkPushDescriptorSetWithTemplateInfoKHR.ndescriptorUpdateTemplate(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer
        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkPushDescriptorSetWithTemplateInfoKHR.nlayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer
        public Buffer set(@NativeType("uint32_t") int value) {
            VkPushDescriptorSetWithTemplateInfoKHR.nset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetWithTemplateInfo.Buffer
        public Buffer pData(@NativeType("void const *") long value) {
            VkPushDescriptorSetWithTemplateInfoKHR.npData(address(), value);
            return this;
        }
    }
}
