package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo;
import org.lwjgl.vulkan.VkDescriptorUpdateTemplateEntry;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR.class */
public class VkDescriptorUpdateTemplateCreateInfoKHR extends VkDescriptorUpdateTemplateCreateInfo {
    protected VkDescriptorUpdateTemplateCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo, org.lwjgl.system.Struct
    public VkDescriptorUpdateTemplateCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(address, container);
    }

    public VkDescriptorUpdateTemplateCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR sType$Default() {
        return sType(1000085000);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) {
        npDescriptorUpdateEntries(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) {
        ntemplateType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) {
        ndescriptorSetLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineLayout(@NativeType("VkPipelineLayout") long value) {
        npipelineLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR set(@NativeType("uint32_t") int value) {
        nset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo
    public VkDescriptorUpdateTemplateCreateInfoKHR set(int sType, long pNext, int flags, VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries, int templateType, long descriptorSetLayout, int pipelineBindPoint, long pipelineLayout, int set) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescriptorUpdateEntries(pDescriptorUpdateEntries);
        templateType(templateType);
        descriptorSetLayout(descriptorSetLayout);
        pipelineBindPoint(pipelineBindPoint);
        pipelineLayout(pipelineLayout);
        set(set);
        return this;
    }

    public VkDescriptorUpdateTemplateCreateInfoKHR set(VkDescriptorUpdateTemplateCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorUpdateTemplateCreateInfoKHR malloc() {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateCreateInfoKHR calloc() {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorUpdateTemplateCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorUpdateTemplateCreateInfoKHR create(long address) {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(address, null);
    }

    public static VkDescriptorUpdateTemplateCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplateCreateInfoKHR(address, null);
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

    public static VkDescriptorUpdateTemplateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorUpdateTemplateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorUpdateTemplateCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkDescriptorUpdateTemplateCreateInfo.Buffer {
        private static final VkDescriptorUpdateTemplateCreateInfoKHR ELEMENT_FACTORY = VkDescriptorUpdateTemplateCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDescriptorUpdateTemplateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000085000);
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.npDescriptorUpdateEntries(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.ntemplateType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.ndescriptorSetLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.npipelineBindPoint(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.npipelineLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorUpdateTemplateCreateInfo.Buffer
        public Buffer set(@NativeType("uint32_t") int value) {
            VkDescriptorUpdateTemplateCreateInfoKHR.nset(address(), value);
            return this;
        }
    }
}
