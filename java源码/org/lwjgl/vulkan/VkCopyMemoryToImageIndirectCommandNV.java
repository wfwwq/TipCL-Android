package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV.class */
public class VkCopyMemoryToImageIndirectCommandNV extends VkCopyMemoryToImageIndirectCommandKHR {
    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public /* bridge */ /* synthetic */ VkCopyMemoryToImageIndirectCommandKHR imageExtent(Consumer consumer) {
        return imageExtent((Consumer<VkExtent3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public /* bridge */ /* synthetic */ VkCopyMemoryToImageIndirectCommandKHR imageOffset(Consumer consumer) {
        return imageOffset((Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public /* bridge */ /* synthetic */ VkCopyMemoryToImageIndirectCommandKHR imageSubresource(Consumer consumer) {
        return imageSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    protected VkCopyMemoryToImageIndirectCommandNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR, org.lwjgl.system.Struct
    public VkCopyMemoryToImageIndirectCommandNV create(long address, ByteBuffer container) {
        return new VkCopyMemoryToImageIndirectCommandNV(address, container);
    }

    public VkCopyMemoryToImageIndirectCommandNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV srcAddress(@NativeType("VkDeviceAddress") long value) {
        nsrcAddress(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV bufferRowLength(@NativeType("uint32_t") int value) {
        nbufferRowLength(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV bufferImageHeight(@NativeType("uint32_t") int value) {
        nbufferImageHeight(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource(VkImageSubresourceLayers value) {
        nimageSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV imageOffset(VkOffset3D value) {
        nimageOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV imageOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(imageOffset());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV imageExtent(VkExtent3D value) {
        nimageExtent(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV imageExtent(Consumer<VkExtent3D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR
    public VkCopyMemoryToImageIndirectCommandNV set(long srcAddress, int bufferRowLength, int bufferImageHeight, VkImageSubresourceLayers imageSubresource, VkOffset3D imageOffset, VkExtent3D imageExtent) {
        srcAddress(srcAddress);
        bufferRowLength(bufferRowLength);
        bufferImageHeight(bufferImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);
        return this;
    }

    public VkCopyMemoryToImageIndirectCommandNV set(VkCopyMemoryToImageIndirectCommandNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryToImageIndirectCommandNV malloc() {
        return new VkCopyMemoryToImageIndirectCommandNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectCommandNV calloc() {
        return new VkCopyMemoryToImageIndirectCommandNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageIndirectCommandNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryToImageIndirectCommandNV create(long address) {
        return new VkCopyMemoryToImageIndirectCommandNV(address, null);
    }

    public static VkCopyMemoryToImageIndirectCommandNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryToImageIndirectCommandNV(address, null);
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

    public static VkCopyMemoryToImageIndirectCommandNV malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectCommandNV calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV$Buffer.class */
    public static class Buffer extends VkCopyMemoryToImageIndirectCommandKHR.Buffer {
        private static final VkCopyMemoryToImageIndirectCommandNV ELEMENT_FACTORY = VkCopyMemoryToImageIndirectCommandNV.create(-1L);

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public /* bridge */ /* synthetic */ VkCopyMemoryToImageIndirectCommandKHR.Buffer imageExtent(Consumer consumer) {
            return imageExtent((Consumer<VkExtent3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public /* bridge */ /* synthetic */ VkCopyMemoryToImageIndirectCommandKHR.Buffer imageOffset(Consumer consumer) {
            return imageOffset((Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public /* bridge */ /* synthetic */ VkCopyMemoryToImageIndirectCommandKHR.Buffer imageSubresource(Consumer consumer) {
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
        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkCopyMemoryToImageIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer srcAddress(@NativeType("VkDeviceAddress") long value) {
            VkCopyMemoryToImageIndirectCommandNV.nsrcAddress(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer bufferRowLength(@NativeType("uint32_t") int value) {
            VkCopyMemoryToImageIndirectCommandNV.nbufferRowLength(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer bufferImageHeight(@NativeType("uint32_t") int value) {
            VkCopyMemoryToImageIndirectCommandNV.nbufferImageHeight(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer imageSubresource(VkImageSubresourceLayers value) {
            VkCopyMemoryToImageIndirectCommandNV.nimageSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer imageOffset(VkOffset3D value) {
            VkCopyMemoryToImageIndirectCommandNV.nimageOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer imageOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(imageOffset());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer imageExtent(VkExtent3D value) {
            VkCopyMemoryToImageIndirectCommandNV.nimageExtent(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandKHR.Buffer
        public Buffer imageExtent(Consumer<VkExtent3D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
