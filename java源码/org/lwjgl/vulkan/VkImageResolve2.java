package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageResolve2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageResolve2.class */
public class VkImageResolve2 extends Struct<VkImageResolve2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSUBRESOURCE;
    public static final int SRCOFFSET;
    public static final int DSTSUBRESOURCE;
    public static final int DSTOFFSET;
    public static final int EXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBRESOURCE = layout.offsetof(2);
        SRCOFFSET = layout.offsetof(3);
        DSTSUBRESOURCE = layout.offsetof(4);
        DSTOFFSET = layout.offsetof(5);
        EXTENT = layout.offsetof(6);
    }

    protected VkImageResolve2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageResolve2 create(long address, ByteBuffer container) {
        return new VkImageResolve2(address, container);
    }

    public VkImageResolve2(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    public VkImageSubresourceLayers srcSubresource() {
        return nsrcSubresource(address());
    }

    public VkOffset3D srcOffset() {
        return nsrcOffset(address());
    }

    public VkImageSubresourceLayers dstSubresource() {
        return ndstSubresource(address());
    }

    public VkOffset3D dstOffset() {
        return ndstOffset(address());
    }

    public VkExtent3D extent() {
        return nextent(address());
    }

    public VkImageResolve2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageResolve2 sType$Default() {
        return sType(1000337010);
    }

    public VkImageResolve2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageResolve2 srcSubresource(VkImageSubresourceLayers value) {
        nsrcSubresource(address(), value);
        return this;
    }

    public VkImageResolve2 srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(srcSubresource());
        return this;
    }

    public VkImageResolve2 srcOffset(VkOffset3D value) {
        nsrcOffset(address(), value);
        return this;
    }

    public VkImageResolve2 srcOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(srcOffset());
        return this;
    }

    public VkImageResolve2 dstSubresource(VkImageSubresourceLayers value) {
        ndstSubresource(address(), value);
        return this;
    }

    public VkImageResolve2 dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(dstSubresource());
        return this;
    }

    public VkImageResolve2 dstOffset(VkOffset3D value) {
        ndstOffset(address(), value);
        return this;
    }

    public VkImageResolve2 dstOffset(Consumer<VkOffset3D> consumer) {
        consumer.accept(dstOffset());
        return this;
    }

    public VkImageResolve2 extent(VkExtent3D value) {
        nextent(address(), value);
        return this;
    }

    public VkImageResolve2 extent(Consumer<VkExtent3D> consumer) {
        consumer.accept(extent());
        return this;
    }

    public VkImageResolve2 set(int sType, long pNext, VkImageSubresourceLayers srcSubresource, VkOffset3D srcOffset, VkImageSubresourceLayers dstSubresource, VkOffset3D dstOffset, VkExtent3D extent) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffset(srcOffset);
        dstSubresource(dstSubresource);
        dstOffset(dstOffset);
        extent(extent);
        return this;
    }

    public VkImageResolve2 set(VkImageResolve2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageResolve2 malloc() {
        return new VkImageResolve2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageResolve2 calloc() {
        return new VkImageResolve2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageResolve2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageResolve2(MemoryUtil.memAddress(container), container);
    }

    public static VkImageResolve2 create(long address) {
        return new VkImageResolve2(address, null);
    }

    public static VkImageResolve2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageResolve2(address, null);
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

    public static VkImageResolve2 malloc(MemoryStack stack) {
        return new VkImageResolve2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageResolve2 calloc(MemoryStack stack) {
        return new VkImageResolve2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static VkImageSubresourceLayers nsrcSubresource(long struct) {
        return VkImageSubresourceLayers.create(struct + SRCSUBRESOURCE);
    }

    public static VkOffset3D nsrcOffset(long struct) {
        return VkOffset3D.create(struct + SRCOFFSET);
    }

    public static VkImageSubresourceLayers ndstSubresource(long struct) {
        return VkImageSubresourceLayers.create(struct + DSTSUBRESOURCE);
    }

    public static VkOffset3D ndstOffset(long struct) {
        return VkOffset3D.create(struct + DSTOFFSET);
    }

    public static VkExtent3D nextent(long struct) {
        return VkExtent3D.create(struct + EXTENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) {
        MemoryUtil.memCopy(value.address(), struct + SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF);
    }

    public static void nsrcOffset(long struct, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + SRCOFFSET, VkOffset3D.SIZEOF);
    }

    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) {
        MemoryUtil.memCopy(value.address(), struct + DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF);
    }

    public static void ndstOffset(long struct, VkOffset3D value) {
        MemoryUtil.memCopy(value.address(), struct + DSTOFFSET, VkOffset3D.SIZEOF);
    }

    public static void nextent(long struct, VkExtent3D value) {
        MemoryUtil.memCopy(value.address(), struct + EXTENT, VkExtent3D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageResolve2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageResolve2$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageResolve2, Buffer> implements NativeResource {
        private static final VkImageResolve2 ELEMENT_FACTORY = VkImageResolve2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageResolve2.SIZEOF);
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
        public VkImageResolve2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageResolve2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageResolve2.npNext(address());
        }

        public VkImageSubresourceLayers srcSubresource() {
            return VkImageResolve2.nsrcSubresource(address());
        }

        public VkOffset3D srcOffset() {
            return VkImageResolve2.nsrcOffset(address());
        }

        public VkImageSubresourceLayers dstSubresource() {
            return VkImageResolve2.ndstSubresource(address());
        }

        public VkOffset3D dstOffset() {
            return VkImageResolve2.ndstOffset(address());
        }

        public VkExtent3D extent() {
            return VkImageResolve2.nextent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageResolve2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000337010);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageResolve2.npNext(address(), value);
            return this;
        }

        public Buffer srcSubresource(VkImageSubresourceLayers value) {
            VkImageResolve2.nsrcSubresource(address(), value);
            return this;
        }

        public Buffer srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(srcSubresource());
            return this;
        }

        public Buffer srcOffset(VkOffset3D value) {
            VkImageResolve2.nsrcOffset(address(), value);
            return this;
        }

        public Buffer srcOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(srcOffset());
            return this;
        }

        public Buffer dstSubresource(VkImageSubresourceLayers value) {
            VkImageResolve2.ndstSubresource(address(), value);
            return this;
        }

        public Buffer dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(dstSubresource());
            return this;
        }

        public Buffer dstOffset(VkOffset3D value) {
            VkImageResolve2.ndstOffset(address(), value);
            return this;
        }

        public Buffer dstOffset(Consumer<VkOffset3D> consumer) {
            consumer.accept(dstOffset());
            return this;
        }

        public Buffer extent(VkExtent3D value) {
            VkImageResolve2.nextent(address(), value);
            return this;
        }

        public Buffer extent(Consumer<VkExtent3D> consumer) {
            consumer.accept(extent());
            return this;
        }
    }
}
