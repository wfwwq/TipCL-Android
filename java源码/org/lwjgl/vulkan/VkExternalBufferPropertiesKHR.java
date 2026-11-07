package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExternalBufferProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalBufferPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalBufferPropertiesKHR.class */
public class VkExternalBufferPropertiesKHR extends VkExternalBufferProperties {
    protected VkExternalBufferPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExternalBufferProperties, org.lwjgl.system.Struct
    public VkExternalBufferPropertiesKHR create(long address, ByteBuffer container) {
        return new VkExternalBufferPropertiesKHR(address, container);
    }

    public VkExternalBufferPropertiesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExternalBufferProperties
    public VkExternalBufferPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalBufferProperties
    public VkExternalBufferPropertiesKHR sType$Default() {
        return sType(1000071003);
    }

    @Override // org.lwjgl.vulkan.VkExternalBufferProperties
    public VkExternalBufferPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalBufferProperties
    public VkExternalBufferPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkExternalBufferPropertiesKHR set(VkExternalBufferPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalBufferPropertiesKHR malloc() {
        return new VkExternalBufferPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalBufferPropertiesKHR calloc() {
        return new VkExternalBufferPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalBufferPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalBufferPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalBufferPropertiesKHR create(long address) {
        return new VkExternalBufferPropertiesKHR(address, null);
    }

    public static VkExternalBufferPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalBufferPropertiesKHR(address, null);
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

    public static VkExternalBufferPropertiesKHR malloc(MemoryStack stack) {
        return new VkExternalBufferPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalBufferPropertiesKHR calloc(MemoryStack stack) {
        return new VkExternalBufferPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalBufferPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalBufferPropertiesKHR$Buffer.class */
    public static class Buffer extends VkExternalBufferProperties.Buffer {
        private static final VkExternalBufferPropertiesKHR ELEMENT_FACTORY = VkExternalBufferPropertiesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExternalBufferProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalBufferProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalBufferProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkExternalBufferPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExternalBufferProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalBufferPropertiesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalBufferProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000071003);
        }

        @Override // org.lwjgl.vulkan.VkExternalBufferProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkExternalBufferPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
