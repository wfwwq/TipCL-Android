package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExternalFenceProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFencePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFencePropertiesKHR.class */
public class VkExternalFencePropertiesKHR extends VkExternalFenceProperties {
    protected VkExternalFencePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExternalFenceProperties, org.lwjgl.system.Struct
    public VkExternalFencePropertiesKHR create(long address, ByteBuffer container) {
        return new VkExternalFencePropertiesKHR(address, container);
    }

    public VkExternalFencePropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExternalFenceProperties
    public VkExternalFencePropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalFenceProperties
    public VkExternalFencePropertiesKHR sType$Default() {
        return sType(1000112001);
    }

    @Override // org.lwjgl.vulkan.VkExternalFenceProperties
    public VkExternalFencePropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalFenceProperties
    public VkExternalFencePropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkExternalFencePropertiesKHR set(VkExternalFencePropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalFencePropertiesKHR malloc() {
        return new VkExternalFencePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalFencePropertiesKHR calloc() {
        return new VkExternalFencePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalFencePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalFencePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalFencePropertiesKHR create(long address) {
        return new VkExternalFencePropertiesKHR(address, null);
    }

    public static VkExternalFencePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalFencePropertiesKHR(address, null);
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

    public static VkExternalFencePropertiesKHR malloc(MemoryStack stack) {
        return new VkExternalFencePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalFencePropertiesKHR calloc(MemoryStack stack) {
        return new VkExternalFencePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFencePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFencePropertiesKHR$Buffer.class */
    public static class Buffer extends VkExternalFenceProperties.Buffer {
        private static final VkExternalFencePropertiesKHR ELEMENT_FACTORY = VkExternalFencePropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExternalFenceProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalFenceProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalFenceProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkExternalFencePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExternalFenceProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalFencePropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalFenceProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000112001);
        }

        @Override // org.lwjgl.vulkan.VkExternalFenceProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkExternalFencePropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
