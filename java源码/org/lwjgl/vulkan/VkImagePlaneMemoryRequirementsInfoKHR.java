package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImagePlaneMemoryRequirementsInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImagePlaneMemoryRequirementsInfoKHR.class */
public class VkImagePlaneMemoryRequirementsInfoKHR extends VkImagePlaneMemoryRequirementsInfo {
    protected VkImagePlaneMemoryRequirementsInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo, org.lwjgl.system.Struct
    public VkImagePlaneMemoryRequirementsInfoKHR create(long address, ByteBuffer container) {
        return new VkImagePlaneMemoryRequirementsInfoKHR(address, container);
    }

    public VkImagePlaneMemoryRequirementsInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo
    public VkImagePlaneMemoryRequirementsInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo
    public VkImagePlaneMemoryRequirementsInfoKHR sType$Default() {
        return sType(1000156003);
    }

    @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo
    public VkImagePlaneMemoryRequirementsInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo
    public VkImagePlaneMemoryRequirementsInfoKHR planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
        nplaneAspect(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo
    public VkImagePlaneMemoryRequirementsInfoKHR set(int sType, long pNext, int planeAspect) {
        sType(sType);
        pNext(pNext);
        planeAspect(planeAspect);
        return this;
    }

    public VkImagePlaneMemoryRequirementsInfoKHR set(VkImagePlaneMemoryRequirementsInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImagePlaneMemoryRequirementsInfoKHR malloc() {
        return new VkImagePlaneMemoryRequirementsInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImagePlaneMemoryRequirementsInfoKHR calloc() {
        return new VkImagePlaneMemoryRequirementsInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImagePlaneMemoryRequirementsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImagePlaneMemoryRequirementsInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImagePlaneMemoryRequirementsInfoKHR create(long address) {
        return new VkImagePlaneMemoryRequirementsInfoKHR(address, null);
    }

    public static VkImagePlaneMemoryRequirementsInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImagePlaneMemoryRequirementsInfoKHR(address, null);
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

    public static VkImagePlaneMemoryRequirementsInfoKHR malloc(MemoryStack stack) {
        return new VkImagePlaneMemoryRequirementsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImagePlaneMemoryRequirementsInfoKHR calloc(MemoryStack stack) {
        return new VkImagePlaneMemoryRequirementsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImagePlaneMemoryRequirementsInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImagePlaneMemoryRequirementsInfoKHR$Buffer.class */
    public static class Buffer extends VkImagePlaneMemoryRequirementsInfo.Buffer {
        private static final VkImagePlaneMemoryRequirementsInfoKHR ELEMENT_FACTORY = VkImagePlaneMemoryRequirementsInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkImagePlaneMemoryRequirementsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImagePlaneMemoryRequirementsInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000156003);
        }

        @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImagePlaneMemoryRequirementsInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImagePlaneMemoryRequirementsInfo.Buffer
        public Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
            VkImagePlaneMemoryRequirementsInfoKHR.nplaneAspect(address(), value);
            return this;
        }
    }
}
