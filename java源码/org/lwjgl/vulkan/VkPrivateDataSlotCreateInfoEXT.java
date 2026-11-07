package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfoEXT.class */
public class VkPrivateDataSlotCreateInfoEXT extends VkPrivateDataSlotCreateInfo {
    protected VkPrivateDataSlotCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo, org.lwjgl.system.Struct
    public VkPrivateDataSlotCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPrivateDataSlotCreateInfoEXT(address, container);
    }

    public VkPrivateDataSlotCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo
    public VkPrivateDataSlotCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo
    public VkPrivateDataSlotCreateInfoEXT sType$Default() {
        return sType(1000295002);
    }

    @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo
    public VkPrivateDataSlotCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo
    public VkPrivateDataSlotCreateInfoEXT flags(@NativeType("VkPrivateDataSlotCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo
    public VkPrivateDataSlotCreateInfoEXT set(int sType, long pNext, int flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkPrivateDataSlotCreateInfoEXT set(VkPrivateDataSlotCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPrivateDataSlotCreateInfoEXT malloc() {
        return new VkPrivateDataSlotCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPrivateDataSlotCreateInfoEXT calloc() {
        return new VkPrivateDataSlotCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPrivateDataSlotCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPrivateDataSlotCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPrivateDataSlotCreateInfoEXT create(long address) {
        return new VkPrivateDataSlotCreateInfoEXT(address, null);
    }

    public static VkPrivateDataSlotCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPrivateDataSlotCreateInfoEXT(address, null);
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

    public static VkPrivateDataSlotCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPrivateDataSlotCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPrivateDataSlotCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPrivateDataSlotCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPrivateDataSlotCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkPrivateDataSlotCreateInfo.Buffer {
        private static final VkPrivateDataSlotCreateInfoEXT ELEMENT_FACTORY = VkPrivateDataSlotCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPrivateDataSlotCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPrivateDataSlotCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000295002);
        }

        @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPrivateDataSlotCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPrivateDataSlotCreateInfo.Buffer
        public Buffer flags(@NativeType("VkPrivateDataSlotCreateFlags") int value) {
            VkPrivateDataSlotCreateInfoEXT.nflags(address(), value);
            return this;
        }
    }
}
