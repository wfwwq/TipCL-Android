package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSparseMemoryRequirementsInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSparseMemoryRequirementsInfo2KHR.class */
public class VkImageSparseMemoryRequirementsInfo2KHR extends VkImageSparseMemoryRequirementsInfo2 {
    protected VkImageSparseMemoryRequirementsInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2, org.lwjgl.system.Struct
    public VkImageSparseMemoryRequirementsInfo2KHR create(long address, ByteBuffer container) {
        return new VkImageSparseMemoryRequirementsInfo2KHR(address, container);
    }

    public VkImageSparseMemoryRequirementsInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2
    public VkImageSparseMemoryRequirementsInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2
    public VkImageSparseMemoryRequirementsInfo2KHR sType$Default() {
        return sType(1000146002);
    }

    @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2
    public VkImageSparseMemoryRequirementsInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2
    public VkImageSparseMemoryRequirementsInfo2KHR image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2
    public VkImageSparseMemoryRequirementsInfo2KHR set(int sType, long pNext, long image) {
        sType(sType);
        pNext(pNext);
        image(image);
        return this;
    }

    public VkImageSparseMemoryRequirementsInfo2KHR set(VkImageSparseMemoryRequirementsInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageSparseMemoryRequirementsInfo2KHR malloc() {
        return new VkImageSparseMemoryRequirementsInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageSparseMemoryRequirementsInfo2KHR calloc() {
        return new VkImageSparseMemoryRequirementsInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageSparseMemoryRequirementsInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSparseMemoryRequirementsInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImageSparseMemoryRequirementsInfo2KHR create(long address) {
        return new VkImageSparseMemoryRequirementsInfo2KHR(address, null);
    }

    public static VkImageSparseMemoryRequirementsInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageSparseMemoryRequirementsInfo2KHR(address, null);
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

    public static VkImageSparseMemoryRequirementsInfo2KHR malloc(MemoryStack stack) {
        return new VkImageSparseMemoryRequirementsInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageSparseMemoryRequirementsInfo2KHR calloc(MemoryStack stack) {
        return new VkImageSparseMemoryRequirementsInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSparseMemoryRequirementsInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSparseMemoryRequirementsInfo2KHR$Buffer.class */
    public static class Buffer extends VkImageSparseMemoryRequirementsInfo2.Buffer {
        private static final VkImageSparseMemoryRequirementsInfo2KHR ELEMENT_FACTORY = VkImageSparseMemoryRequirementsInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkImageSparseMemoryRequirementsInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageSparseMemoryRequirementsInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000146002);
        }

        @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageSparseMemoryRequirementsInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageSparseMemoryRequirementsInfo2.Buffer
        public Buffer image(@NativeType("VkImage") long value) {
            VkImageSparseMemoryRequirementsInfo2KHR.nimage(address(), value);
            return this;
        }
    }
}
