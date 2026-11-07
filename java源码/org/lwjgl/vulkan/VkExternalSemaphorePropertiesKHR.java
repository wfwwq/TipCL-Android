package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExternalSemaphoreProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalSemaphorePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalSemaphorePropertiesKHR.class */
public class VkExternalSemaphorePropertiesKHR extends VkExternalSemaphoreProperties {
    protected VkExternalSemaphorePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties, org.lwjgl.system.Struct
    public VkExternalSemaphorePropertiesKHR create(long address, ByteBuffer container) {
        return new VkExternalSemaphorePropertiesKHR(address, container);
    }

    public VkExternalSemaphorePropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties
    public VkExternalSemaphorePropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties
    public VkExternalSemaphorePropertiesKHR sType$Default() {
        return sType(1000076001);
    }

    @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties
    public VkExternalSemaphorePropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties
    public VkExternalSemaphorePropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkExternalSemaphorePropertiesKHR set(VkExternalSemaphorePropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalSemaphorePropertiesKHR malloc() {
        return new VkExternalSemaphorePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalSemaphorePropertiesKHR calloc() {
        return new VkExternalSemaphorePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalSemaphorePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalSemaphorePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalSemaphorePropertiesKHR create(long address) {
        return new VkExternalSemaphorePropertiesKHR(address, null);
    }

    public static VkExternalSemaphorePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalSemaphorePropertiesKHR(address, null);
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

    public static VkExternalSemaphorePropertiesKHR malloc(MemoryStack stack) {
        return new VkExternalSemaphorePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalSemaphorePropertiesKHR calloc(MemoryStack stack) {
        return new VkExternalSemaphorePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalSemaphorePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalSemaphorePropertiesKHR$Buffer.class */
    public static class Buffer extends VkExternalSemaphoreProperties.Buffer {
        private static final VkExternalSemaphorePropertiesKHR ELEMENT_FACTORY = VkExternalSemaphorePropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkExternalSemaphorePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalSemaphorePropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000076001);
        }

        @Override // org.lwjgl.vulkan.VkExternalSemaphoreProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkExternalSemaphorePropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
