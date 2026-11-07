package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfoKHR.class */
public class VkBindImagePlaneMemoryInfoKHR extends VkBindImagePlaneMemoryInfo {
    protected VkBindImagePlaneMemoryInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo, org.lwjgl.system.Struct
    public VkBindImagePlaneMemoryInfoKHR create(long address, ByteBuffer container) {
        return new VkBindImagePlaneMemoryInfoKHR(address, container);
    }

    public VkBindImagePlaneMemoryInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo
    public VkBindImagePlaneMemoryInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo
    public VkBindImagePlaneMemoryInfoKHR sType$Default() {
        return sType(1000156002);
    }

    @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo
    public VkBindImagePlaneMemoryInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo
    public VkBindImagePlaneMemoryInfoKHR planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
        nplaneAspect(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo
    public VkBindImagePlaneMemoryInfoKHR set(int sType, long pNext, int planeAspect) {
        sType(sType);
        pNext(pNext);
        planeAspect(planeAspect);
        return this;
    }

    public VkBindImagePlaneMemoryInfoKHR set(VkBindImagePlaneMemoryInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindImagePlaneMemoryInfoKHR malloc() {
        return new VkBindImagePlaneMemoryInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindImagePlaneMemoryInfoKHR calloc() {
        return new VkBindImagePlaneMemoryInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindImagePlaneMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindImagePlaneMemoryInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindImagePlaneMemoryInfoKHR create(long address) {
        return new VkBindImagePlaneMemoryInfoKHR(address, null);
    }

    public static VkBindImagePlaneMemoryInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindImagePlaneMemoryInfoKHR(address, null);
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

    public static VkBindImagePlaneMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkBindImagePlaneMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindImagePlaneMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkBindImagePlaneMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfoKHR$Buffer.class */
    public static class Buffer extends VkBindImagePlaneMemoryInfo.Buffer {
        private static final VkBindImagePlaneMemoryInfoKHR ELEMENT_FACTORY = VkBindImagePlaneMemoryInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkBindImagePlaneMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindImagePlaneMemoryInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000156002);
        }

        @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindImagePlaneMemoryInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkBindImagePlaneMemoryInfo.Buffer
        public Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
            VkBindImagePlaneMemoryInfoKHR.nplaneAspect(address(), value);
            return this;
        }
    }
}
