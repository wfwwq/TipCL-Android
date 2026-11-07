package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageBlit2;
import org.lwjgl.vulkan.VkOffset3D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2KHR.class */
public class VkImageBlit2KHR extends VkImageBlit2 {
    @Override // org.lwjgl.vulkan.VkImageBlit2
    public /* bridge */ /* synthetic */ VkImageBlit2 dstOffsets(int i, Consumer consumer) {
        return dstOffsets(i, (Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public /* bridge */ /* synthetic */ VkImageBlit2 dstOffsets(Consumer consumer) {
        return dstOffsets((Consumer<VkOffset3D.Buffer>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public /* bridge */ /* synthetic */ VkImageBlit2 dstSubresource(Consumer consumer) {
        return dstSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public /* bridge */ /* synthetic */ VkImageBlit2 srcOffsets(int i, Consumer consumer) {
        return srcOffsets(i, (Consumer<VkOffset3D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public /* bridge */ /* synthetic */ VkImageBlit2 srcOffsets(Consumer consumer) {
        return srcOffsets((Consumer<VkOffset3D.Buffer>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public /* bridge */ /* synthetic */ VkImageBlit2 srcSubresource(Consumer consumer) {
        return srcSubresource((Consumer<VkImageSubresourceLayers>) consumer);
    }

    protected VkImageBlit2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageBlit2, org.lwjgl.system.Struct
    public VkImageBlit2KHR create(long address, ByteBuffer container) {
        return new VkImageBlit2KHR(address, container);
    }

    public VkImageBlit2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR sType$Default() {
        return sType(1000337008);
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR srcSubresource(VkImageSubresourceLayers value) {
        nsrcSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(srcSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
        nsrcOffsets(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR srcOffsets(int index, VkOffset3D value) {
        nsrcOffsets(address(), index, value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR srcOffsets(Consumer<VkOffset3D.Buffer> consumer) {
        consumer.accept(srcOffsets());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR srcOffsets(int index, Consumer<VkOffset3D> consumer) {
        consumer.accept(srcOffsets(index));
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR dstSubresource(VkImageSubresourceLayers value) {
        ndstSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(dstSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
        ndstOffsets(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR dstOffsets(int index, VkOffset3D value) {
        ndstOffsets(address(), index, value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR dstOffsets(Consumer<VkOffset3D.Buffer> consumer) {
        consumer.accept(dstOffsets());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR dstOffsets(int index, Consumer<VkOffset3D> consumer) {
        consumer.accept(dstOffsets(index));
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageBlit2
    public VkImageBlit2KHR set(int sType, long pNext, VkImageSubresourceLayers srcSubresource, VkOffset3D.Buffer srcOffsets, VkImageSubresourceLayers dstSubresource, VkOffset3D.Buffer dstOffsets) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffsets(srcOffsets);
        dstSubresource(dstSubresource);
        dstOffsets(dstOffsets);
        return this;
    }

    public VkImageBlit2KHR set(VkImageBlit2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageBlit2KHR malloc() {
        return new VkImageBlit2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageBlit2KHR calloc() {
        return new VkImageBlit2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageBlit2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageBlit2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImageBlit2KHR create(long address) {
        return new VkImageBlit2KHR(address, null);
    }

    public static VkImageBlit2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageBlit2KHR(address, null);
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

    public static VkImageBlit2KHR malloc(MemoryStack stack) {
        return new VkImageBlit2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageBlit2KHR calloc(MemoryStack stack) {
        return new VkImageBlit2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2KHR$Buffer.class */
    public static class Buffer extends VkImageBlit2.Buffer {
        private static final VkImageBlit2KHR ELEMENT_FACTORY = VkImageBlit2KHR.create(-1L);

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public /* bridge */ /* synthetic */ VkImageBlit2.Buffer dstOffsets(int i, Consumer consumer) {
            return dstOffsets(i, (Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public /* bridge */ /* synthetic */ VkImageBlit2.Buffer dstOffsets(Consumer consumer) {
            return dstOffsets((Consumer<VkOffset3D.Buffer>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public /* bridge */ /* synthetic */ VkImageBlit2.Buffer dstSubresource(Consumer consumer) {
            return dstSubresource((Consumer<VkImageSubresourceLayers>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public /* bridge */ /* synthetic */ VkImageBlit2.Buffer srcOffsets(int i, Consumer consumer) {
            return srcOffsets(i, (Consumer<VkOffset3D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public /* bridge */ /* synthetic */ VkImageBlit2.Buffer srcOffsets(Consumer consumer) {
            return srcOffsets((Consumer<VkOffset3D.Buffer>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public /* bridge */ /* synthetic */ VkImageBlit2.Buffer srcSubresource(Consumer consumer) {
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
        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer, org.lwjgl.system.StructBuffer
        public VkImageBlit2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageBlit2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer sType$Default() {
            return sType(1000337008);
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageBlit2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer srcSubresource(VkImageSubresourceLayers value) {
            VkImageBlit2KHR.nsrcSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(srcSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
            VkImageBlit2KHR.nsrcOffsets(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer srcOffsets(int index, VkOffset3D value) {
            VkImageBlit2KHR.nsrcOffsets(address(), index, value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer srcOffsets(Consumer<VkOffset3D.Buffer> consumer) {
            consumer.accept(srcOffsets());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer srcOffsets(int index, Consumer<VkOffset3D> consumer) {
            consumer.accept(srcOffsets(index));
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer dstSubresource(VkImageSubresourceLayers value) {
            VkImageBlit2KHR.ndstSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(dstSubresource());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
            VkImageBlit2KHR.ndstOffsets(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer dstOffsets(int index, VkOffset3D value) {
            VkImageBlit2KHR.ndstOffsets(address(), index, value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer dstOffsets(Consumer<VkOffset3D.Buffer> consumer) {
            consumer.accept(dstOffsets());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageBlit2.Buffer
        public Buffer dstOffsets(int index, Consumer<VkOffset3D> consumer) {
            consumer.accept(dstOffsets(index));
            return this;
        }
    }
}
