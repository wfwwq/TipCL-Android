package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMemoryToImageCopy;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT.class */
public class VkMemoryToImageCopyEXT extends VkMemoryToImageCopy {
    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public /* bridge */ /* synthetic */ VkMemoryToImageCopy imageExtent(Consumer consumer) {
        return imageExtent((Consumer<VkExtent3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public /* bridge */ /* synthetic */ VkMemoryToImageCopy imageOffset(Consumer consumer) {
        return imageOffset((Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public /* bridge */ /* synthetic */ VkMemoryToImageCopy imageSubresource(Consumer consumer) {
        return imageSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    protected VkMemoryToImageCopyEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy, org.lwjgl.system.Struct
    public VkMemoryToImageCopyEXT create(long address, ByteBuffer container) {
        return new VkMemoryToImageCopyEXT(address, container);
    }

    public VkMemoryToImageCopyEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT sType$Default() {
        return sType(1000270002);
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT pHostPointer(@NativeType("void const *") long value) {
        npHostPointer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT memoryRowLength(@NativeType("uint32_t") int value) {
        nmemoryRowLength(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT memoryImageHeight(@NativeType("uint32_t") int value) {
        nmemoryImageHeight(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT imageSubresource(VkImageSubresourceLayers value) {
        nimageSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT imageOffset(VkOffset3D value) {
        nimageOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT imageOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(imageOffset());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT imageExtent(VkExtent3D value) {
        nimageExtent(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT imageExtent(Consumer<VkExtent3D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryToImageCopy
    public VkMemoryToImageCopyEXT set(int sType, long pNext, long pHostPointer, int memoryRowLength, int memoryImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
        sType(sType);
        pNext(pNext);
        pHostPointer(pHostPointer);
        memoryRowLength(memoryRowLength);
        memoryImageHeight(memoryImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);
        return this;
    }

    public VkMemoryToImageCopyEXT set(VkMemoryToImageCopyEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryToImageCopyEXT malloc() {
        return new VkMemoryToImageCopyEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryToImageCopyEXT calloc() {
        return new VkMemoryToImageCopyEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryToImageCopyEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryToImageCopyEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryToImageCopyEXT create(long address) {
        return new VkMemoryToImageCopyEXT(address, null);
    }

    public static VkMemoryToImageCopyEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryToImageCopyEXT(address, null);
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

    public static VkMemoryToImageCopyEXT malloc(MemoryStack stack) {
        return new VkMemoryToImageCopyEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryToImageCopyEXT calloc(MemoryStack stack) {
        return new VkMemoryToImageCopyEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT$Buffer.class */
    public static class Buffer extends VkMemoryToImageCopy.Buffer {
        private static final VkMemoryToImageCopyEXT ELEMENT_FACTORY = VkMemoryToImageCopyEXT.create(-1L);

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public /* bridge */ /* synthetic */ VkMemoryToImageCopy.Buffer imageExtent(Consumer consumer) {
            return imageExtent((Consumer<VkExtent3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public /* bridge */ /* synthetic */ VkMemoryToImageCopy.Buffer imageOffset(Consumer consumer) {
            return imageOffset((Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public /* bridge */ /* synthetic */ VkMemoryToImageCopy.Buffer imageSubresource(Consumer consumer) {
            return imageSubresource((Consumer<VkImageSubresourceLayers>) consumer);
        }

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
        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer, org.lwjgl.system.StructBuffer
        public VkMemoryToImageCopyEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryToImageCopyEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer sType$Default() {
            return sType(1000270002);
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryToImageCopyEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer pHostPointer(@NativeType("void const *") long value) {
            VkMemoryToImageCopyEXT.npHostPointer(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer memoryRowLength(@NativeType("uint32_t") int value) {
            VkMemoryToImageCopyEXT.nmemoryRowLength(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer memoryImageHeight(@NativeType("uint32_t") int value) {
            VkMemoryToImageCopyEXT.nmemoryImageHeight(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer imageSubresource(VkImageSubresourceLayers value) {
            VkMemoryToImageCopyEXT.nimageSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer imageOffset(VkOffset3D value) {
            VkMemoryToImageCopyEXT.nimageOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer imageOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(imageOffset());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer imageExtent(VkExtent3D value) {
            VkMemoryToImageCopyEXT.nimageExtent(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryToImageCopy.Buffer
        public Buffer imageExtent(Consumer<VkExtent3D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
