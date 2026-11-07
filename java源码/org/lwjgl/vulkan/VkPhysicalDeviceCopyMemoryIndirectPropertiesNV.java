package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.class */
public class VkPhysicalDeviceCopyMemoryIndirectPropertiesNV extends VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR {
    protected VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR, org.lwjgl.system.Struct
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(address, container);
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV sType$Default() {
        return sType(1000426001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV set(VkPhysicalDeviceCopyMemoryIndirectPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV malloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV calloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV create(long address) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(address, null);
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

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectPropertiesNV$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer {
        private static final VkPhysicalDeviceCopyMemoryIndirectPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000426001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
