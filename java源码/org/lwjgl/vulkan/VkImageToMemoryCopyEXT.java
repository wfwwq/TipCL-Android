package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageToMemoryCopy;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageToMemoryCopyEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageToMemoryCopyEXT.class */
public class VkImageToMemoryCopyEXT extends VkImageToMemoryCopy {
    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public /* bridge */ /* synthetic */ VkImageToMemoryCopy imageExtent(Consumer consumer) {
        return imageExtent((Consumer<VkExtent3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public /* bridge */ /* synthetic */ VkImageToMemoryCopy imageOffset(Consumer consumer) {
        return imageOffset((Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public /* bridge */ /* synthetic */ VkImageToMemoryCopy imageSubresource(Consumer consumer) {
        return imageSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    protected VkImageToMemoryCopyEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy, org.lwjgl.system.Struct
    public VkImageToMemoryCopyEXT create(long address, ByteBuffer container) {
        return new VkImageToMemoryCopyEXT(address, container);
    }

    public VkImageToMemoryCopyEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT sType$Default() {
        return sType(1000270003);
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT pHostPointer(@NativeType("void *") long value) {
        npHostPointer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT memoryRowLength(@NativeType("uint32_t") int value) {
        nmemoryRowLength(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT memoryImageHeight(@NativeType("uint32_t") int value) {
        nmemoryImageHeight(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT imageSubresource(VkImageSubresourceLayers value) {
        nimageSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT imageOffset(VkOffset3D value) {
        nimageOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT imageOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(imageOffset());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT imageExtent(VkExtent3D value) {
        nimageExtent(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT imageExtent(Consumer<VkExtent3D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageToMemoryCopy
    public VkImageToMemoryCopyEXT set(int sType, long pNext, long pHostPointer, int memoryRowLength, int memoryImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
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

    public VkImageToMemoryCopyEXT set(VkImageToMemoryCopyEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageToMemoryCopyEXT malloc() {
        return new VkImageToMemoryCopyEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageToMemoryCopyEXT calloc() {
        return new VkImageToMemoryCopyEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageToMemoryCopyEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageToMemoryCopyEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageToMemoryCopyEXT create(long address) {
        return new VkImageToMemoryCopyEXT(address, null);
    }

    public static VkImageToMemoryCopyEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageToMemoryCopyEXT(address, null);
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

    public static VkImageToMemoryCopyEXT malloc(MemoryStack stack) {
        return new VkImageToMemoryCopyEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageToMemoryCopyEXT calloc(MemoryStack stack) {
        return new VkImageToMemoryCopyEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageToMemoryCopyEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageToMemoryCopyEXT$Buffer.class */
    public static class Buffer extends VkImageToMemoryCopy.Buffer {
        private static final VkImageToMemoryCopyEXT ELEMENT_FACTORY = VkImageToMemoryCopyEXT.create(-1L);

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public /* bridge */ /* synthetic */ VkImageToMemoryCopy.Buffer imageExtent(Consumer consumer) {
            return imageExtent((Consumer<VkExtent3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public /* bridge */ /* synthetic */ VkImageToMemoryCopy.Buffer imageOffset(Consumer consumer) {
            return imageOffset((Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public /* bridge */ /* synthetic */ VkImageToMemoryCopy.Buffer imageSubresource(Consumer consumer) {
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
        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer, org.lwjgl.system.StructBuffer
        public VkImageToMemoryCopyEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageToMemoryCopyEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer sType$Default() {
            return sType(1000270003);
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageToMemoryCopyEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer pHostPointer(@NativeType("void *") long value) {
            VkImageToMemoryCopyEXT.npHostPointer(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer memoryRowLength(@NativeType("uint32_t") int value) {
            VkImageToMemoryCopyEXT.nmemoryRowLength(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer memoryImageHeight(@NativeType("uint32_t") int value) {
            VkImageToMemoryCopyEXT.nmemoryImageHeight(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer imageSubresource(VkImageSubresourceLayers value) {
            VkImageToMemoryCopyEXT.nimageSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer imageOffset(VkOffset3D value) {
            VkImageToMemoryCopyEXT.nimageOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer imageOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(imageOffset());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer imageExtent(VkExtent3D value) {
            VkImageToMemoryCopyEXT.nimageExtent(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageToMemoryCopy.Buffer
        public Buffer imageExtent(Consumer<VkExtent3D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
