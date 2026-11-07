package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoKHR.class */
public class VkExternalMemoryImageCreateInfoKHR extends VkExternalMemoryImageCreateInfo {
    protected VkExternalMemoryImageCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo, org.lwjgl.system.Struct
    public VkExternalMemoryImageCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkExternalMemoryImageCreateInfoKHR(address, container);
    }

    public VkExternalMemoryImageCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo
    public VkExternalMemoryImageCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo
    public VkExternalMemoryImageCreateInfoKHR sType$Default() {
        return sType(1000072001);
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo
    public VkExternalMemoryImageCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo
    public VkExternalMemoryImageCreateInfoKHR handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo
    public VkExternalMemoryImageCreateInfoKHR set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExternalMemoryImageCreateInfoKHR set(VkExternalMemoryImageCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalMemoryImageCreateInfoKHR malloc() {
        return new VkExternalMemoryImageCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalMemoryImageCreateInfoKHR calloc() {
        return new VkExternalMemoryImageCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalMemoryImageCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryImageCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalMemoryImageCreateInfoKHR create(long address) {
        return new VkExternalMemoryImageCreateInfoKHR(address, null);
    }

    public static VkExternalMemoryImageCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalMemoryImageCreateInfoKHR(address, null);
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

    public static VkExternalMemoryImageCreateInfoKHR malloc(MemoryStack stack) {
        return new VkExternalMemoryImageCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalMemoryImageCreateInfoKHR calloc(MemoryStack stack) {
        return new VkExternalMemoryImageCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkExternalMemoryImageCreateInfo.Buffer {
        private static final VkExternalMemoryImageCreateInfoKHR ELEMENT_FACTORY = VkExternalMemoryImageCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkExternalMemoryImageCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalMemoryImageCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000072001);
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalMemoryImageCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo.Buffer
        public Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
            VkExternalMemoryImageCreateInfoKHR.nhandleTypes(address(), value);
            return this;
        }
    }
}
