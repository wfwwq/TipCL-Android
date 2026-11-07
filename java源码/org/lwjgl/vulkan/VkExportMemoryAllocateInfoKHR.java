package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkExportMemoryAllocateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoKHR.class */
public class VkExportMemoryAllocateInfoKHR extends VkExportMemoryAllocateInfo {
    protected VkExportMemoryAllocateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo, org.lwjgl.system.Struct
    public VkExportMemoryAllocateInfoKHR create(long address, ByteBuffer container) {
        return new VkExportMemoryAllocateInfoKHR(address, container);
    }

    public VkExportMemoryAllocateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo
    public VkExportMemoryAllocateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo
    public VkExportMemoryAllocateInfoKHR sType$Default() {
        return sType(1000072002);
    }

    @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo
    public VkExportMemoryAllocateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo
    public VkExportMemoryAllocateInfoKHR handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo
    public VkExportMemoryAllocateInfoKHR set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExportMemoryAllocateInfoKHR set(VkExportMemoryAllocateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMemoryAllocateInfoKHR malloc() {
        return new VkExportMemoryAllocateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMemoryAllocateInfoKHR calloc() {
        return new VkExportMemoryAllocateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMemoryAllocateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMemoryAllocateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMemoryAllocateInfoKHR create(long address) {
        return new VkExportMemoryAllocateInfoKHR(address, null);
    }

    public static VkExportMemoryAllocateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMemoryAllocateInfoKHR(address, null);
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

    public static VkExportMemoryAllocateInfoKHR malloc(MemoryStack stack) {
        return new VkExportMemoryAllocateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMemoryAllocateInfoKHR calloc(MemoryStack stack) {
        return new VkExportMemoryAllocateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoKHR$Buffer.class */
    public static class Buffer extends VkExportMemoryAllocateInfo.Buffer {
        private static final VkExportMemoryAllocateInfoKHR ELEMENT_FACTORY = VkExportMemoryAllocateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkExportMemoryAllocateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMemoryAllocateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000072002);
        }

        @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMemoryAllocateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkExportMemoryAllocateInfo.Buffer
        public Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
            VkExportMemoryAllocateInfoKHR.nhandleTypes(address(), value);
            return this;
        }
    }
}
