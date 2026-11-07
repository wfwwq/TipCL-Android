package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageCopy2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy2KHR.class */
public class VkImageCopy2KHR extends VkImageCopy2 {
    @Override // org.lwjgl.vulkan.VkImageCopy2
    public /* bridge */ /* synthetic */ VkImageCopy2 extent(Consumer consumer) {
        return extent((Consumer<VkExtent3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public /* bridge */ /* synthetic */ VkImageCopy2 dstOffset(Consumer consumer) {
        return dstOffset((Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public /* bridge */ /* synthetic */ VkImageCopy2 dstSubresource(Consumer consumer) {
        return dstSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public /* bridge */ /* synthetic */ VkImageCopy2 srcOffset(Consumer consumer) {
        return srcOffset((Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public /* bridge */ /* synthetic */ VkImageCopy2 srcSubresource(Consumer consumer) {
        return srcSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    protected VkImageCopy2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageCopy2, org.lwjgl.system.Struct
    public VkImageCopy2KHR create(long address, ByteBuffer container) {
        return new VkImageCopy2KHR(address, container);
    }

    public VkImageCopy2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR sType$Default() {
        return sType(1000337007);
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR srcSubresource(VkImageSubresourceLayers value) {
        nsrcSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(srcSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR srcOffset(VkOffset3D value) {
        nsrcOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR srcOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(srcOffset());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR dstSubresource(VkImageSubresourceLayers value) {
        ndstSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(dstSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR dstOffset(VkOffset3D value) {
        ndstOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR dstOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(dstOffset());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR extent(VkExtent3D value) {
        nextent(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR extent(Consumer<VkExtent3D> consumer) {
        consumer.accept(extent());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageCopy2
    public VkImageCopy2KHR set(int sType, long pNext, VkImageSubresourceLayers srcSubresource, VkOffset3D srcOffset, VkImageSubresourceLayers dstSubresource, VkOffset3D dstOffset, VkExtent3D extent) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffset(srcOffset);
        dstSubresource(dstSubresource);
        dstOffset(dstOffset);
        extent(extent);
        return this;
    }

    public VkImageCopy2KHR set(VkImageCopy2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageCopy2KHR malloc() {
        return new VkImageCopy2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageCopy2KHR calloc() {
        return new VkImageCopy2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageCopy2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCopy2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImageCopy2KHR create(long address) {
        return new VkImageCopy2KHR(address, null);
    }

    public static VkImageCopy2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageCopy2KHR(address, null);
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

    public static VkImageCopy2KHR malloc(MemoryStack stack) {
        return new VkImageCopy2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageCopy2KHR calloc(MemoryStack stack) {
        return new VkImageCopy2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCopy2KHR$Buffer.class */
    public static class Buffer extends VkImageCopy2.Buffer {
        private static final VkImageCopy2KHR ELEMENT_FACTORY = VkImageCopy2KHR.create(-1L);

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkImageCopy2.Buffer extent(Consumer consumer) {
            return extent((Consumer<VkExtent3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkImageCopy2.Buffer dstOffset(Consumer consumer) {
            return dstOffset((Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkImageCopy2.Buffer dstSubresource(Consumer consumer) {
            return dstSubresource((Consumer<VkImageSubresourceLayers>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkImageCopy2.Buffer srcOffset(Consumer consumer) {
            return srcOffset((Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public /* bridge */ /* synthetic */ VkImageCopy2.Buffer srcSubresource(Consumer consumer) {
            return srcSubresource((Consumer<VkImageSubresourceLayers>) consumer);
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
        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer, org.lwjgl.system.StructBuffer
        public VkImageCopy2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageCopy2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer sType$Default() {
            return sType(1000337007);
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageCopy2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer srcSubresource(VkImageSubresourceLayers value) {
            VkImageCopy2KHR.nsrcSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(srcSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer srcOffset(VkOffset3D value) {
            VkImageCopy2KHR.nsrcOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer srcOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(srcOffset());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer dstSubresource(VkImageSubresourceLayers value) {
            VkImageCopy2KHR.ndstSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(dstSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer dstOffset(VkOffset3D value) {
            VkImageCopy2KHR.ndstOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer dstOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(dstOffset());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer extent(VkExtent3D value) {
            VkImageCopy2KHR.nextent(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageCopy2.Buffer
        public Buffer extent(Consumer<VkExtent3D> consumer) {
            consumer.accept(extent());
            return this;
        }
    }
}
