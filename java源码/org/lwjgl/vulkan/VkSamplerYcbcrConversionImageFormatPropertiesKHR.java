package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionImageFormatPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionImageFormatPropertiesKHR.class */
public class VkSamplerYcbcrConversionImageFormatPropertiesKHR extends VkSamplerYcbcrConversionImageFormatProperties {
    protected VkSamplerYcbcrConversionImageFormatPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties, org.lwjgl.system.Struct
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR create(long address, ByteBuffer container) {
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(address, container);
    }

    public VkSamplerYcbcrConversionImageFormatPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR sType$Default() {
        return sType(1000156005);
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSamplerYcbcrConversionImageFormatPropertiesKHR set(VkSamplerYcbcrConversionImageFormatPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR malloc() {
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR calloc() {
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR create(long address) {
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(address, null);
    }

    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(address, null);
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

    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionImageFormatPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionImageFormatPropertiesKHR$Buffer.class */
    public static class Buffer extends VkSamplerYcbcrConversionImageFormatProperties.Buffer {
        private static final VkSamplerYcbcrConversionImageFormatPropertiesKHR ELEMENT_FACTORY = VkSamplerYcbcrConversionImageFormatPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkSamplerYcbcrConversionImageFormatPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerYcbcrConversionImageFormatPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000156005);
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionImageFormatProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkSamplerYcbcrConversionImageFormatPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
