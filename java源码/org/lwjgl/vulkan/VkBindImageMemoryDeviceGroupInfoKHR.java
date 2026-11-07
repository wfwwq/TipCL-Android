package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo;
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfoKHR.class */
public class VkBindImageMemoryDeviceGroupInfoKHR extends VkBindImageMemoryDeviceGroupInfo {
    protected VkBindImageMemoryDeviceGroupInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo, org.lwjgl.system.Struct
    public VkBindImageMemoryDeviceGroupInfoKHR create(long address, ByteBuffer container) {
        return new VkBindImageMemoryDeviceGroupInfoKHR(address, container);
    }

    public VkBindImageMemoryDeviceGroupInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo
    public VkBindImageMemoryDeviceGroupInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo
    public VkBindImageMemoryDeviceGroupInfoKHR sType$Default() {
        return sType(1000060014);
    }

    @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo
    public VkBindImageMemoryDeviceGroupInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo
    public VkBindImageMemoryDeviceGroupInfoKHR pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npDeviceIndices(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo
    public VkBindImageMemoryDeviceGroupInfoKHR pSplitInstanceBindRegions(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npSplitInstanceBindRegions(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo
    public VkBindImageMemoryDeviceGroupInfoKHR set(int sType, long pNext, IntBuffer pDeviceIndices, VkRect2D.Buffer pSplitInstanceBindRegions) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);
        pSplitInstanceBindRegions(pSplitInstanceBindRegions);
        return this;
    }

    public VkBindImageMemoryDeviceGroupInfoKHR set(VkBindImageMemoryDeviceGroupInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindImageMemoryDeviceGroupInfoKHR malloc() {
        return new VkBindImageMemoryDeviceGroupInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindImageMemoryDeviceGroupInfoKHR calloc() {
        return new VkBindImageMemoryDeviceGroupInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindImageMemoryDeviceGroupInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindImageMemoryDeviceGroupInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindImageMemoryDeviceGroupInfoKHR create(long address) {
        return new VkBindImageMemoryDeviceGroupInfoKHR(address, null);
    }

    public static VkBindImageMemoryDeviceGroupInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindImageMemoryDeviceGroupInfoKHR(address, null);
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

    public static VkBindImageMemoryDeviceGroupInfoKHR malloc(MemoryStack stack) {
        return new VkBindImageMemoryDeviceGroupInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindImageMemoryDeviceGroupInfoKHR calloc(MemoryStack stack) {
        return new VkBindImageMemoryDeviceGroupInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryDeviceGroupInfoKHR$Buffer.class */
    public static class Buffer extends VkBindImageMemoryDeviceGroupInfo.Buffer {
        private static final VkBindImageMemoryDeviceGroupInfoKHR ELEMENT_FACTORY = VkBindImageMemoryDeviceGroupInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBindImageMemoryDeviceGroupInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindImageMemoryDeviceGroupInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000060014);
        }

        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindImageMemoryDeviceGroupInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer
        public Buffer pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkBindImageMemoryDeviceGroupInfoKHR.npDeviceIndices(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindImageMemoryDeviceGroupInfo.Buffer
        public Buffer pSplitInstanceBindRegions(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkBindImageMemoryDeviceGroupInfoKHR.npSplitInstanceBindRegions(address(), value);
            return this;
        }
    }
}
