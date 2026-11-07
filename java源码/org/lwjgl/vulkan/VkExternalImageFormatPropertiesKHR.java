package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExternalImageFormatProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesKHR.class */
public class VkExternalImageFormatPropertiesKHR extends VkExternalImageFormatProperties {
    protected VkExternalImageFormatPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties, org.lwjgl.system.Struct
    public VkExternalImageFormatPropertiesKHR create(long address, ByteBuffer container) {
        return new VkExternalImageFormatPropertiesKHR(address, container);
    }

    public VkExternalImageFormatPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties
    public VkExternalImageFormatPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties
    public VkExternalImageFormatPropertiesKHR sType$Default() {
        return sType(1000071001);
    }

    @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties
    public VkExternalImageFormatPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties
    public VkExternalImageFormatPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkExternalImageFormatPropertiesKHR set(VkExternalImageFormatPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalImageFormatPropertiesKHR malloc() {
        return new VkExternalImageFormatPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalImageFormatPropertiesKHR calloc() {
        return new VkExternalImageFormatPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalImageFormatPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalImageFormatPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalImageFormatPropertiesKHR create(long address) {
        return new VkExternalImageFormatPropertiesKHR(address, null);
    }

    public static VkExternalImageFormatPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalImageFormatPropertiesKHR(address, null);
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

    public static VkExternalImageFormatPropertiesKHR malloc(MemoryStack stack) {
        return new VkExternalImageFormatPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalImageFormatPropertiesKHR calloc(MemoryStack stack) {
        return new VkExternalImageFormatPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesKHR$Buffer.class */
    public static class Buffer extends VkExternalImageFormatProperties.Buffer {
        private static final VkExternalImageFormatPropertiesKHR ELEMENT_FACTORY = VkExternalImageFormatPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkExternalImageFormatPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalImageFormatPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000071001);
        }

        @Override // org.lwjgl.vulkan.VkExternalImageFormatProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkExternalImageFormatPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
