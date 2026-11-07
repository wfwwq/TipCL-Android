package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2KHR.class */
public class VkImageMemoryRequirementsInfo2KHR extends VkImageMemoryRequirementsInfo2 {
    protected VkImageMemoryRequirementsInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2, org.lwjgl.system.Struct
    public VkImageMemoryRequirementsInfo2KHR create(long address, ByteBuffer container) {
        return new VkImageMemoryRequirementsInfo2KHR(address, container);
    }

    public VkImageMemoryRequirementsInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2
    public VkImageMemoryRequirementsInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2
    public VkImageMemoryRequirementsInfo2KHR sType$Default() {
        return sType(1000146001);
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2
    public VkImageMemoryRequirementsInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2
    public VkImageMemoryRequirementsInfo2KHR image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2
    public VkImageMemoryRequirementsInfo2KHR set(int sType, long pNext, long image) {
        sType(sType);
        pNext(pNext);
        image(image);
        return this;
    }

    public VkImageMemoryRequirementsInfo2KHR set(VkImageMemoryRequirementsInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageMemoryRequirementsInfo2KHR malloc() {
        return new VkImageMemoryRequirementsInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageMemoryRequirementsInfo2KHR calloc() {
        return new VkImageMemoryRequirementsInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageMemoryRequirementsInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageMemoryRequirementsInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImageMemoryRequirementsInfo2KHR create(long address) {
        return new VkImageMemoryRequirementsInfo2KHR(address, null);
    }

    public static VkImageMemoryRequirementsInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageMemoryRequirementsInfo2KHR(address, null);
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

    public static VkImageMemoryRequirementsInfo2KHR malloc(MemoryStack stack) {
        return new VkImageMemoryRequirementsInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageMemoryRequirementsInfo2KHR calloc(MemoryStack stack) {
        return new VkImageMemoryRequirementsInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageMemoryRequirementsInfo2KHR$Buffer.class */
    public static class Buffer extends VkImageMemoryRequirementsInfo2.Buffer {
        private static final VkImageMemoryRequirementsInfo2KHR ELEMENT_FACTORY = VkImageMemoryRequirementsInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkImageMemoryRequirementsInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageMemoryRequirementsInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000146001);
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageMemoryRequirementsInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryRequirementsInfo2.Buffer
        public Buffer image(@NativeType("VkImage") long value) {
            VkImageMemoryRequirementsInfo2KHR.nimage(address(), value);
            return this;
        }
    }
}
