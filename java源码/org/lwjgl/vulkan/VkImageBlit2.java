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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2.class */
public class VkImageBlit2 extends Struct<VkImageBlit2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSUBRESOURCE;
    public static final int SRCOFFSETS;
    public static final int DSTSUBRESOURCE;
    public static final int DSTOFFSETS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2), __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF), __array(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBRESOURCE = layout.offsetof(2);
        SRCOFFSETS = layout.offsetof(3);
        DSTSUBRESOURCE = layout.offsetof(4);
        DSTOFFSETS = layout.offsetof(5);
    }

    protected VkImageBlit2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageBlit2 create(long address, ByteBuffer container) {
        return new VkImageBlit2(address, container);
    }

    public VkImageBlit2(ByteBuffer container) {
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

    public VkImageBlit2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageBlit2 sType$Default() {
        return sType(1000337008);
    }

    public VkImageBlit2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageBlit2 pNext(VkCopyCommandTransformInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageBlit2 srcSubresource(VkImageSubresourceLayers value) {
        nsrcSubresource(address(), value);
        return this;
    }

    public VkImageBlit2 srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(srcSubresource());
        return this;
    }

    public VkImageBlit2 srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
        nsrcOffsets(address(), value);
        return this;
    }

    public VkImageBlit2 srcOffsets(int index, VkOffset3D value) {
        nsrcOffsets(address(), index, value);
        return this;
    }

    public VkImageBlit2 srcOffsets(Consumer<VkOffset3D.Buffer> consumer) {
        consumer.accept(srcOffsets());
        return this;
    }

    public VkImageBlit2 srcOffsets(int index, Consumer<VkOffset3D> consumer) {
        consumer.accept(srcOffsets(index));
        return this;
    }

    public VkImageBlit2 dstSubresource(VkImageSubresourceLayers value) {
        ndstSubresource(address(), value);
        return this;
    }

    public VkImageBlit2 dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
        consumer.accept(dstSubresource());
        return this;
    }

    public VkImageBlit2 dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
        ndstOffsets(address(), value);
        return this;
    }

    public VkImageBlit2 dstOffsets(int index, VkOffset3D value) {
        ndstOffsets(address(), index, value);
        return this;
    }

    public VkImageBlit2 dstOffsets(Consumer<VkOffset3D.Buffer> consumer) {
        consumer.accept(dstOffsets());
        return this;
    }

    public VkImageBlit2 dstOffsets(int index, Consumer<VkOffset3D> consumer) {
        consumer.accept(dstOffsets(index));
        return this;
    }

    public VkImageBlit2 set(int sType, long pNext, VkImageSubresourceLayers srcSubresource, VkOffset3D.Buffer srcOffsets, VkImageSubresourceLayers dstSubresource, VkOffset3D.Buffer dstOffsets) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffsets(srcOffsets);
        dstSubresource(dstSubresource);
        dstOffsets(dstOffsets);
        return this;
    }

    public VkImageBlit2 set(VkImageBlit2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageBlit2 malloc() {
        return new VkImageBlit2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageBlit2 calloc() {
        return new VkImageBlit2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageBlit2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageBlit2(MemoryUtil.memAddress(container), container);
    }

    public static VkImageBlit2 create(long address) {
        return new VkImageBlit2(address, null);
    }

    public static VkImageBlit2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageBlit2(address, null);
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

    public static VkImageBlit2 malloc(MemoryStack stack) {
        return new VkImageBlit2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageBlit2 calloc(MemoryStack stack) {
        return new VkImageBlit2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageBlit2$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageBlit2, Buffer> implements NativeResource {
        private static final VkImageBlit2 ELEMENT_FACTORY = VkImageBlit2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageBlit2.SIZEOF);
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
        public VkImageBlit2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageBlit2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageBlit2.npNext(address());
        }

        public VkImageSubresourceLayers srcSubresource() {
            return VkImageBlit2.nsrcSubresource(address());
        }

        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer srcOffsets() {
            return VkImageBlit2.nsrcOffsets(address());
        }

        public VkOffset3D srcOffsets(int index) {
            return VkImageBlit2.nsrcOffsets(address(), index);
        }

        public VkImageSubresourceLayers dstSubresource() {
            return VkImageBlit2.ndstSubresource(address());
        }

        @NativeType("VkOffset3D[2]")
        public VkOffset3D.Buffer dstOffsets() {
            return VkImageBlit2.ndstOffsets(address());
        }

        public VkOffset3D dstOffsets(int index) {
            return VkImageBlit2.ndstOffsets(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageBlit2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000337008);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageBlit2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkCopyCommandTransformInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer srcSubresource(VkImageSubresourceLayers value) {
            VkImageBlit2.nsrcSubresource(address(), value);
            return this;
        }

        public Buffer srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(srcSubresource());
            return this;
        }

        public Buffer srcOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
            VkImageBlit2.nsrcOffsets(address(), value);
            return this;
        }

        public Buffer srcOffsets(int index, VkOffset3D value) {
            VkImageBlit2.nsrcOffsets(address(), index, value);
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
            VkImageBlit2.ndstSubresource(address(), value);
            return this;
        }

        public Buffer dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
            consumer.accept(dstSubresource());
            return this;
        }

        public Buffer dstOffsets(@NativeType("VkOffset3D[2]") VkOffset3D.Buffer value) {
            VkImageBlit2.ndstOffsets(address(), value);
            return this;
        }

        public Buffer dstOffsets(int index, VkOffset3D value) {
            VkImageBlit2.ndstOffsets(address(), index, value);
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
