package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfoEXT.class */
public class VkDevicePrivateDataCreateInfoEXT extends VkDevicePrivateDataCreateInfo {
    protected VkDevicePrivateDataCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo, org.lwjgl.system.Struct
    public VkDevicePrivateDataCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkDevicePrivateDataCreateInfoEXT(address, container);
    }

    public VkDevicePrivateDataCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo
    public VkDevicePrivateDataCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo
    public VkDevicePrivateDataCreateInfoEXT sType$Default() {
        return sType(1000295001);
    }

    @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo
    public VkDevicePrivateDataCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo
    public VkDevicePrivateDataCreateInfoEXT privateDataSlotRequestCount(@NativeType("uint32_t") int value) {
        nprivateDataSlotRequestCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo
    public VkDevicePrivateDataCreateInfoEXT set(int sType, long pNext, int privateDataSlotRequestCount) {
        sType(sType);
        pNext(pNext);
        privateDataSlotRequestCount(privateDataSlotRequestCount);
        return this;
    }

    public VkDevicePrivateDataCreateInfoEXT set(VkDevicePrivateDataCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDevicePrivateDataCreateInfoEXT malloc() {
        return new VkDevicePrivateDataCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDevicePrivateDataCreateInfoEXT calloc() {
        return new VkDevicePrivateDataCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDevicePrivateDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDevicePrivateDataCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDevicePrivateDataCreateInfoEXT create(long address) {
        return new VkDevicePrivateDataCreateInfoEXT(address, null);
    }

    public static VkDevicePrivateDataCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDevicePrivateDataCreateInfoEXT(address, null);
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

    public static VkDevicePrivateDataCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDevicePrivateDataCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDevicePrivateDataCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDevicePrivateDataCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePrivateDataCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkDevicePrivateDataCreateInfo.Buffer {
        private static final VkDevicePrivateDataCreateInfoEXT ELEMENT_FACTORY = VkDevicePrivateDataCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDevicePrivateDataCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDevicePrivateDataCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000295001);
        }

        @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDevicePrivateDataCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo.Buffer
        public Buffer privateDataSlotRequestCount(@NativeType("uint32_t") int value) {
            VkDevicePrivateDataCreateInfoEXT.nprivateDataSlotRequestCount(address(), value);
            return this;
        }
    }
}
