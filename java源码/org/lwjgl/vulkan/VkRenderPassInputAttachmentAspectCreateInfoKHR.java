package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkInputAttachmentAspectReference;
import org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfoKHR.class */
public class VkRenderPassInputAttachmentAspectCreateInfoKHR extends VkRenderPassInputAttachmentAspectCreateInfo {
    protected VkRenderPassInputAttachmentAspectCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo, org.lwjgl.system.Struct
    public VkRenderPassInputAttachmentAspectCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(address, container);
    }

    public VkRenderPassInputAttachmentAspectCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sType$Default() {
        return sType(1000117001);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) {
        npAspectReferences(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo
    public VkRenderPassInputAttachmentAspectCreateInfoKHR set(int sType, long pNext, VkInputAttachmentAspectReference.Buffer pAspectReferences) {
        sType(sType);
        pNext(pNext);
        pAspectReferences(pAspectReferences);
        return this;
    }

    public VkRenderPassInputAttachmentAspectCreateInfoKHR set(VkRenderPassInputAttachmentAspectCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassInputAttachmentAspectCreateInfoKHR malloc() {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfoKHR calloc() {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfoKHR create(long address) {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(address, null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(address, null);
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

    public static VkRenderPassInputAttachmentAspectCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassInputAttachmentAspectCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRenderPassInputAttachmentAspectCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassInputAttachmentAspectCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkRenderPassInputAttachmentAspectCreateInfo.Buffer {
        private static final VkRenderPassInputAttachmentAspectCreateInfoKHR ELEMENT_FACTORY = VkRenderPassInputAttachmentAspectCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderPassInputAttachmentAspectCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassInputAttachmentAspectCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000117001);
        }

        @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassInputAttachmentAspectCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassInputAttachmentAspectCreateInfo.Buffer
        public Buffer pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) {
            VkRenderPassInputAttachmentAspectCreateInfoKHR.npAspectReferences(address(), value);
            return this;
        }
    }
}
