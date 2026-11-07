package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2.class */
public class VkPhysicalDeviceSparseImageFormatInfo2 extends Struct<VkPhysicalDeviceSparseImageFormatInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMAT;
    public static final int TYPE;
    public static final int SAMPLES;
    public static final int USAGE;
    public static final int TILING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        SAMPLES = layout.offsetof(4);
        USAGE = layout.offsetof(5);
        TILING = layout.offsetof(6);
    }

    protected VkPhysicalDeviceSparseImageFormatInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSparseImageFormatInfo2 create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSparseImageFormatInfo2(address, container);
    }

    public VkPhysicalDeviceSparseImageFormatInfo2(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("VkImageType")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkSampleCountFlagBits")
    public int samples() {
        return nsamples(address());
    }

    @NativeType("VkImageUsageFlags")
    public int usage() {
        return nusage(address());
    }

    @NativeType("VkImageTiling")
    public int tiling() {
        return ntiling(address());
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 sType$Default() {
        return sType(1000059008);
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 type(@NativeType("VkImageType") int value) {
        ntype(address(), value);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 samples(@NativeType("VkSampleCountFlagBits") int value) {
        nsamples(address(), value);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 tiling(@NativeType("VkImageTiling") int value) {
        ntiling(address(), value);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 set(int sType, long pNext, int format, int type, int samples, int usage, int tiling) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        samples(samples);
        usage(usage);
        tiling(tiling);
        return this;
    }

    public VkPhysicalDeviceSparseImageFormatInfo2 set(VkPhysicalDeviceSparseImageFormatInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2 malloc() {
        return new VkPhysicalDeviceSparseImageFormatInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2 calloc() {
        return new VkPhysicalDeviceSparseImageFormatInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSparseImageFormatInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2 create(long address) {
        return new VkPhysicalDeviceSparseImageFormatInfo2(address, null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSparseImageFormatInfo2(address, null);
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

    public static VkPhysicalDeviceSparseImageFormatInfo2 malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSparseImageFormatInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSparseImageFormatInfo2 calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSparseImageFormatInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nsamples(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLES);
    }

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int ntiling(long struct) {
        return MemoryUtil.memGetInt(struct + TILING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nsamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLES, value);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void ntiling(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseImageFormatInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSparseImageFormatInfo2, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSparseImageFormatInfo2 ELEMENT_FACTORY = VkPhysicalDeviceSparseImageFormatInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSparseImageFormatInfo2.SIZEOF);
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
        public VkPhysicalDeviceSparseImageFormatInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSparseImageFormatInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceSparseImageFormatInfo2.npNext(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkPhysicalDeviceSparseImageFormatInfo2.nformat(address());
        }

        @NativeType("VkImageType")
        public int type() {
            return VkPhysicalDeviceSparseImageFormatInfo2.ntype(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int samples() {
            return VkPhysicalDeviceSparseImageFormatInfo2.nsamples(address());
        }

        @NativeType("VkImageUsageFlags")
        public int usage() {
            return VkPhysicalDeviceSparseImageFormatInfo2.nusage(address());
        }

        @NativeType("VkImageTiling")
        public int tiling() {
            return VkPhysicalDeviceSparseImageFormatInfo2.ntiling(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000059008);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceSparseImageFormatInfo2.npNext(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2.nformat(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkImageType") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2.ntype(address(), value);
            return this;
        }

        public Buffer samples(@NativeType("VkSampleCountFlagBits") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2.nsamples(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2.nusage(address(), value);
            return this;
        }

        public Buffer tiling(@NativeType("VkImageTiling") int value) {
            VkPhysicalDeviceSparseImageFormatInfo2.ntiling(address(), value);
            return this;
        }
    }
}
