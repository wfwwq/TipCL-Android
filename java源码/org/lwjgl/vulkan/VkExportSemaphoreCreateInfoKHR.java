package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExportSemaphoreCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreCreateInfoKHR.class */
public class VkExportSemaphoreCreateInfoKHR extends VkExportSemaphoreCreateInfo {
    protected VkExportSemaphoreCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo, org.lwjgl.system.Struct
    public VkExportSemaphoreCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkExportSemaphoreCreateInfoKHR(address, container);
    }

    public VkExportSemaphoreCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo
    public VkExportSemaphoreCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo
    public VkExportSemaphoreCreateInfoKHR sType$Default() {
        return sType(1000077000);
    }

    @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo
    public VkExportSemaphoreCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo
    public VkExportSemaphoreCreateInfoKHR handleTypes(@NativeType("VkExternalSemaphoreHandleTypeFlags") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo
    public VkExportSemaphoreCreateInfoKHR set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExportSemaphoreCreateInfoKHR set(VkExportSemaphoreCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportSemaphoreCreateInfoKHR malloc() {
        return new VkExportSemaphoreCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportSemaphoreCreateInfoKHR calloc() {
        return new VkExportSemaphoreCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportSemaphoreCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportSemaphoreCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExportSemaphoreCreateInfoKHR create(long address) {
        return new VkExportSemaphoreCreateInfoKHR(address, null);
    }

    public static VkExportSemaphoreCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportSemaphoreCreateInfoKHR(address, null);
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

    public static VkExportSemaphoreCreateInfoKHR malloc(MemoryStack stack) {
        return new VkExportSemaphoreCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportSemaphoreCreateInfoKHR calloc(MemoryStack stack) {
        return new VkExportSemaphoreCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkExportSemaphoreCreateInfo.Buffer {
        private static final VkExportSemaphoreCreateInfoKHR ELEMENT_FACTORY = VkExportSemaphoreCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkExportSemaphoreCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportSemaphoreCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000077000);
        }

        @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportSemaphoreCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExportSemaphoreCreateInfo.Buffer
        public Buffer handleTypes(@NativeType("VkExternalSemaphoreHandleTypeFlags") int value) {
            VkExportSemaphoreCreateInfoKHR.nhandleTypes(address(), value);
            return this;
        }
    }
}
