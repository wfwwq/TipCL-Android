package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkBufferCopy2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyBufferInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyBufferInfo2.class */
public class VkCopyBufferInfo2 extends Struct<VkCopyBufferInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCBUFFER;
    public static final int DSTBUFFER;
    public static final int REGIONCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCBUFFER = layout.offsetof(2);
        DSTBUFFER = layout.offsetof(3);
        REGIONCOUNT = layout.offsetof(4);
        PREGIONS = layout.offsetof(5);
    }

    protected VkCopyBufferInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyBufferInfo2 create(long address, ByteBuffer container) {
        return new VkCopyBufferInfo2(address, container);
    }

    public VkCopyBufferInfo2(ByteBuffer container) {
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

    @NativeType("VkBuffer")
    public long srcBuffer() {
        return nsrcBuffer(address());
    }

    @NativeType("VkBuffer")
    public long dstBuffer() {
        return ndstBuffer(address());
    }

    @NativeType("uint32_t")
    public int regionCount() {
        return nregionCount(address());
    }

    @NativeType("VkBufferCopy2 const *")
    public VkBufferCopy2.Buffer pRegions() {
        return npRegions(address());
    }

    public VkCopyBufferInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyBufferInfo2 sType$Default() {
        return sType(1000337000);
    }

    public VkCopyBufferInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyBufferInfo2 srcBuffer(@NativeType("VkBuffer") long value) {
        nsrcBuffer(address(), value);
        return this;
    }

    public VkCopyBufferInfo2 dstBuffer(@NativeType("VkBuffer") long value) {
        ndstBuffer(address(), value);
        return this;
    }

    public VkCopyBufferInfo2 pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkCopyBufferInfo2 set(int sType, long pNext, long srcBuffer, long dstBuffer, VkBufferCopy2.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        srcBuffer(srcBuffer);
        dstBuffer(dstBuffer);
        pRegions(pRegions);
        return this;
    }

    public VkCopyBufferInfo2 set(VkCopyBufferInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyBufferInfo2 malloc() {
        return new VkCopyBufferInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyBufferInfo2 calloc() {
        return new VkCopyBufferInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyBufferInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyBufferInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyBufferInfo2 create(long address) {
        return new VkCopyBufferInfo2(address, null);
    }

    public static VkCopyBufferInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyBufferInfo2(address, null);
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

    public static VkCopyBufferInfo2 malloc(MemoryStack stack) {
        return new VkCopyBufferInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyBufferInfo2 calloc(MemoryStack stack) {
        return new VkCopyBufferInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + SRCBUFFER);
    }

    public static long ndstBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + DSTBUFFER);
    }

    public static int nregionCount(long struct) {
        return MemoryUtil.memGetInt(struct + REGIONCOUNT);
    }

    public static VkBufferCopy2.Buffer npRegions(long struct) {
        return VkBufferCopy2.create(MemoryUtil.memGetAddress(struct + PREGIONS), nregionCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCBUFFER, value);
    }

    public static void ndstBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTBUFFER, value);
    }

    public static void nregionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + REGIONCOUNT, value);
    }

    public static void npRegions(long struct, VkBufferCopy2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, value.address());
        nregionCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PREGIONS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyBufferInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyBufferInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyBufferInfo2, Buffer> implements NativeResource {
        private static final VkCopyBufferInfo2 ELEMENT_FACTORY = VkCopyBufferInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyBufferInfo2.SIZEOF);
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
        public VkCopyBufferInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyBufferInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyBufferInfo2.npNext(address());
        }

        @NativeType("VkBuffer")
        public long srcBuffer() {
            return VkCopyBufferInfo2.nsrcBuffer(address());
        }

        @NativeType("VkBuffer")
        public long dstBuffer() {
            return VkCopyBufferInfo2.ndstBuffer(address());
        }

        @NativeType("uint32_t")
        public int regionCount() {
            return VkCopyBufferInfo2.nregionCount(address());
        }

        @NativeType("VkBufferCopy2 const *")
        public VkBufferCopy2.Buffer pRegions() {
            return VkCopyBufferInfo2.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyBufferInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000337000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyBufferInfo2.npNext(address(), value);
            return this;
        }

        public Buffer srcBuffer(@NativeType("VkBuffer") long value) {
            VkCopyBufferInfo2.nsrcBuffer(address(), value);
            return this;
        }

        public Buffer dstBuffer(@NativeType("VkBuffer") long value) {
            VkCopyBufferInfo2.ndstBuffer(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) {
            VkCopyBufferInfo2.npRegions(address(), value);
            return this;
        }
    }
}
