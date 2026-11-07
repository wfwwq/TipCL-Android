package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExportFenceCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfoKHR.class */
public class VkExportFenceCreateInfoKHR extends VkExportFenceCreateInfo {
    protected VkExportFenceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo, org.lwjgl.system.Struct
    public VkExportFenceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkExportFenceCreateInfoKHR(address, container);
    }

    public VkExportFenceCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo
    public VkExportFenceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo
    public VkExportFenceCreateInfoKHR sType$Default() {
        return sType(1000113000);
    }

    @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo
    public VkExportFenceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo
    public VkExportFenceCreateInfoKHR handleTypes(@NativeType("VkExternalFenceHandleTypeFlags") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo
    public VkExportFenceCreateInfoKHR set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExportFenceCreateInfoKHR set(VkExportFenceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportFenceCreateInfoKHR malloc() {
        return new VkExportFenceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportFenceCreateInfoKHR calloc() {
        return new VkExportFenceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportFenceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportFenceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExportFenceCreateInfoKHR create(long address) {
        return new VkExportFenceCreateInfoKHR(address, null);
    }

    public static VkExportFenceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportFenceCreateInfoKHR(address, null);
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

    public static VkExportFenceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkExportFenceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportFenceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkExportFenceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkExportFenceCreateInfo.Buffer {
        private static final VkExportFenceCreateInfoKHR ELEMENT_FACTORY = VkExportFenceCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkExportFenceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportFenceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000113000);
        }

        @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportFenceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExportFenceCreateInfo.Buffer
        public Buffer handleTypes(@NativeType("VkExternalFenceHandleTypeFlags") int value) {
            VkExportFenceCreateInfoKHR.nhandleTypes(address(), value);
            return this;
        }
    }
}
