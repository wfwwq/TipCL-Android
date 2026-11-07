package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkOffset3D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit.class */
public class VkImageBlit extends Struct<VkImageBlit> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCSUBRESOURCE;
    public static final int SRCOFFSETS;
    public static final int DSTSUBRESOURCE;
    public static final int DSTOFFSETS;

    static {
        Struct.Layout layout = __struct(__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCSUBRESOURCE = layout.offsetof(0);
        SRCOFFSETS = layout.offsetof(1);
        DSTSUBRESOURCE = layout.offsetof(2);
        DSTOFFSETS = layout.offsetof(3);
    }

    protected VkImageBlit(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageBlit create(long address, ByteBuffer container) {
        return new VkImageBlit(address, container);
    }

    public VkImageBlit(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkImageSubresourceLayers srcSubresource() {
        return nsrcSubresource(address());
    }

    @NativeType("VkOffset3D[2]")
    public VkOffset3D.Buffer srcOffsets() {
        return nsrcOffsets(address());
    }

    public VkOffset3D srcOffsets(int index) {
        return nsrcOffsets(address(), index);
    }

    public VkImageSubresourceLayers dstSubresource() {
        return ndstSubresource(address());
    }

    @NativeType("VkOffset3D[2]")
    public VkOffset3D.Buffer dstOffsets() {
        return ndstOffsets(address());
    }

    public VkOffset3D dstOffsets(int index) {
        return ndstOffsets(address(), index);
    }

    public VkImageBlit srcSubresource(VkImageSubresourceLayers value) {
        nsrcSubresource(address(), value);
        return this;
    }

    public VkImageBlit srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(srcSubresource());
        return this;
    }

    public VkImageBlit srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
        nsrcOffsets(address(), value);
        return this;
    }

    public VkImageBlit srcOffsets(int index, VkOffset3D value) {
        nsrcOffsets(address(), index, value);
        return this;
    }

    public VkImageBlit srcOffsets(Consumer<VkOffset3D.Buffer> consumer) {
        consumer.accept(srcOffsets());
        return this;
    }

    public VkImageBlit srcOffsets(int index, Consumer<VkOffset3D> consumer) {
        consumer.accept(srcOffsets(index));
        return this;
    }

    public VkImageBlit dstSubresource(VkImageSubresourceLayers value) {
        ndstSubresource(address(), value);
        return this;
    }

    public VkImageBlit dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(dstSubresource());
        return this;
    }

    public VkImageBlit dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
        ndstOffsets(address(), value);
        return this;
    }

    public VkImageBlit dstOffsets(int index, VkOffset3D value) {
        ndstOffsets(address(), index, value);
        return this;
    }

    public VkImageBlit dstOffsets(Consumer<VkOffset3D.Buffer> consumer) {
        consumer.accept(dstOffsets());
        return this;
    }

    public VkImageBlit dstOffsets(int index, Consumer<VkOffset3D> consumer) {
        consumer.accept(dstOffsets(index));
        return this;
    }

    public VkImageBlit set(VkImageSubresourceLayers srcSubresource, VkOffset3D.Buffer srcOffsets, VkImageSubresourceLayers dstSubresource, VkOffset3D.Buffer dstOffsets) {
        srcSubresource(srcSubresource);
        srcOffsets(srcOffsets);
        dstSubresource(dstSubresource);
        dstOffsets(dstOffsets);
        return this;
    }

    public VkImageBlit set(VkImageBlit src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageBlit malloc() {
        return new VkImageBlit(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageBlit calloc() {
        return new VkImageBlit(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageBlit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageBlit(MemoryUtil.memAddress(container), container);
    }

    public static VkImageBlit create(long address) {
        return new VkImageBlit(address, null);
    }

    public static VkImageBlit createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageBlit(address, null);
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

    public static VkImageBlit malloc(MemoryStack stack) {
        return new VkImageBlit(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageBlit calloc(MemoryStack stack) {
        return new VkImageBlit(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkImageSubresourceLayers nsrcSubresource(long struct) {
        return VkImageSubresourceLayers.create(struct + SRCSUBRESOURCE);
    }

    public static VkOffset3D.Buffer nsrcOffsets(long struct) {
        return VkOffset3D.create(struct + SRCOFFSETS, 2);
    }

    public static VkOffset3D nsrcOffsets(long struct, int index) {
        return VkOffset3D.create(struct + SRCOFFSETS + (Checks.check(index, 2) * VkOffset3D.SIZEOF));
    }

    public static VkImageSubresourceLayers ndstSubresource(long struct) {
        return VkImageSubresourceLayers.create(struct + DSTSUBRESOURCE);
    }

    public static VkOffset3D.Buffer ndstOffsets(long struct) {
        return VkOffset3D.create(struct + DSTOFFSETS, 2);
    }

    public static VkOffset3D ndstOffsets(long struct, int index) {
        return VkOffset3D.create(struct + DSTOFFSETS + (Checks.check(index, 2) * VkOffset3D.SIZEOF));
    }

    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) {
        MemoryUtil.memCopy(value.address(), struct + SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF);
    }

    public static void nsrcOffsets(long struct, VkOffset3D.Buffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(value.address(), struct + SRCOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
    }

    public static void nsrcOffsets(long struct, int index, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + SRCOFFSETS + (Checks.check(index, 2) * VkOffset3D.SIZEOF), VkOffset3D.SIZEOF);
    }

    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) {
        MemoryUtil.memCopy(value.address(), struct + DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF);
    }

    public static void ndstOffsets(long struct, VkOffset3D.Buffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(value.address(), struct + DSTOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
    }

    public static void ndstOffsets(long struct, int index, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + DSTOFFSETS + (Checks.check(index, 2) * VkOffset3D.SIZEOF), VkOffset3D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageBlit, Buffer> implements NativeResource {
        private static final VkImageBlit ELEMENT_FACTORY = VkImageBlit.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageBlit.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkImageBlit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkImageSubresourceLayers srcSubresource() {
            return VkImageBlit.nsrcSubresource(address());
        }

        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer srcOffsets() {
            return VkImageBlit.nsrcOffsets(address());
        }

        public VkOffset3D srcOffsets(int index) {
            return VkImageBlit.nsrcOffsets(address(), index);
        }

        public VkImageSubresourceLayers dstSubresource() {
            return VkImageBlit.ndstSubresource(address());
        }

        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer dstOffsets() {
            return VkImageBlit.ndstOffsets(address());
        }

        public VkOffset3D dstOffsets(int index) {
            return VkImageBlit.ndstOffsets(address(), index);
        }

        public Buffer srcSubresource(VkImageSubresourceLayers value) {
            VkImageBlit.nsrcSubresource(address(), value);
            return this;
        }

        public Buffer srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(srcSubresource());
            return this;
        }

        public Buffer srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
            VkImageBlit.nsrcOffsets(address(), value);
            return this;
        }

        public Buffer srcOffsets(int index, VkOffset3D value) {
            VkImageBlit.nsrcOffsets(address(), index, value);
            return this;
        }

        public Buffer srcOffsets(Consumer<VkOffset3D.Buffer> consumer) {
            consumer.accept(srcOffsets());
            return this;
        }

        public Buffer srcOffsets(int index, Consumer<VkOffset3D> consumer) {
            consumer.accept(srcOffsets(index));
            return this;
        }

        public Buffer dstSubresource(VkImageSubresourceLayers value) {
            VkImageBlit.ndstSubresource(address(), value);
            return this;
        }

        public Buffer dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(dstSubresource());
            return this;
        }

        public Buffer dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
            VkImageBlit.ndstOffsets(address(), value);
            return this;
        }

        public Buffer dstOffsets(int index, VkOffset3D value) {
            VkImageBlit.ndstOffsets(address(), index, value);
            return this;
        }

        public Buffer dstOffsets(Consumer<VkOffset3D.Buffer> consumer) {
            consumer.accept(dstOffsets());
            return this;
        }

        public Buffer dstOffsets(int index, Consumer<VkOffset3D> consumer) {
            consumer.accept(dstOffsets(index));
            return this;
        }
    }
}
