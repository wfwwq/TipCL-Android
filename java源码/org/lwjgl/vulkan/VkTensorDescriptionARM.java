package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorDescriptionARM.class */
public class VkTensorDescriptionARM extends Struct<VkTensorDescriptionARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TILING;
    public static final int FORMAT;
    public static final int DIMENSIONCOUNT;
    public static final int PDIMENSIONS;
    public static final int PSTRIDES;
    public static final int USAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILING = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        DIMENSIONCOUNT = layout.offsetof(4);
        PDIMENSIONS = layout.offsetof(5);
        PSTRIDES = layout.offsetof(6);
        USAGE = layout.offsetof(7);
    }

    protected VkTensorDescriptionARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorDescriptionARM create(long address, ByteBuffer container) {
        return new VkTensorDescriptionARM(address, container);
    }

    public VkTensorDescriptionARM(ByteBuffer container) {
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

    @NativeType("VkTensorTilingARM")
    public int tiling() {
        return ntiling(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("uint32_t")
    public int dimensionCount() {
        return ndimensionCount(address());
    }

    @NativeType("int64_t const *")
    public LongBuffer pDimensions() {
        return npDimensions(address());
    }

    @NativeType("int64_t const *")
    public LongBuffer pStrides() {
        return npStrides(address());
    }

    @NativeType("VkTensorUsageFlagsARM")
    public long usage() {
        return nusage(address());
    }

    public VkTensorDescriptionARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorDescriptionARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM);
    }

    public VkTensorDescriptionARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorDescriptionARM tiling(@NativeType("VkTensorTilingARM") int value) {
        ntiling(address(), value);
        return this;
    }

    public VkTensorDescriptionARM format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkTensorDescriptionARM dimensionCount(@NativeType("uint32_t") int value) {
        ndimensionCount(address(), value);
        return this;
    }

    public VkTensorDescriptionARM pDimensions(@NativeType("int64_t const *") LongBuffer value) {
        npDimensions(address(), value);
        return this;
    }

    public VkTensorDescriptionARM pStrides(@NativeType("int64_t const *") LongBuffer value) {
        npStrides(address(), value);
        return this;
    }

    public VkTensorDescriptionARM usage(@NativeType("VkTensorUsageFlagsARM") long value) {
        nusage(address(), value);
        return this;
    }

    public VkTensorDescriptionARM set(int sType, long pNext, int tiling, int format, int dimensionCount, LongBuffer pDimensions, LongBuffer pStrides, long usage) {
        sType(sType);
        pNext(pNext);
        tiling(tiling);
        format(format);
        dimensionCount(dimensionCount);
        pDimensions(pDimensions);
        pStrides(pStrides);
        usage(usage);
        return this;
    }

    public VkTensorDescriptionARM set(VkTensorDescriptionARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorDescriptionARM malloc() {
        return new VkTensorDescriptionARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorDescriptionARM calloc() {
        return new VkTensorDescriptionARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorDescriptionARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorDescriptionARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorDescriptionARM create(long address) {
        return new VkTensorDescriptionARM(address, null);
    }

    public static VkTensorDescriptionARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorDescriptionARM(address, null);
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

    public static VkTensorDescriptionARM malloc(MemoryStack stack) {
        return new VkTensorDescriptionARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorDescriptionARM calloc(MemoryStack stack) {
        return new VkTensorDescriptionARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntiling(long struct) {
        return MemoryUtil.memGetInt(struct + TILING);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int ndimensionCount(long struct) {
        return MemoryUtil.memGetInt(struct + DIMENSIONCOUNT);
    }

    public static LongBuffer npDimensions(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PDIMENSIONS), ndimensionCount(struct));
    }

    public static LongBuffer npStrides(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSTRIDES), ndimensionCount(struct));
    }

    public static long nusage(long struct) {
        return MemoryUtil.memGetLong(struct + USAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntiling(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILING, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void ndimensionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIMENSIONCOUNT, value);
    }

    public static void npDimensions(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PDIMENSIONS, MemoryUtil.memAddress(value));
    }

    public static void npStrides(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSTRIDES, MemoryUtil.memAddressSafe(value));
    }

    public static void nusage(long struct, long value) {
        MemoryUtil.memPutLong(struct + USAGE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDIMENSIONS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorDescriptionARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorDescriptionARM, Buffer> implements NativeResource {
        private static final VkTensorDescriptionARM ELEMENT_FACTORY = VkTensorDescriptionARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorDescriptionARM.SIZEOF);
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
        public VkTensorDescriptionARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorDescriptionARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorDescriptionARM.npNext(address());
        }

        @NativeType("VkTensorTilingARM")
        public int tiling() {
            return VkTensorDescriptionARM.ntiling(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkTensorDescriptionARM.nformat(address());
        }

        @NativeType("uint32_t")
        public int dimensionCount() {
            return VkTensorDescriptionARM.ndimensionCount(address());
        }

        @NativeType("int64_t const *")
        public LongBuffer pDimensions() {
            return VkTensorDescriptionARM.npDimensions(address());
        }

        @NativeType("int64_t const *")
        public LongBuffer pStrides() {
            return VkTensorDescriptionARM.npStrides(address());
        }

        @NativeType("VkTensorUsageFlagsARM")
        public long usage() {
            return VkTensorDescriptionARM.nusage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorDescriptionARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorDescriptionARM.npNext(address(), value);
            return this;
        }

        public Buffer tiling(@NativeType("VkTensorTilingARM") int value) {
            VkTensorDescriptionARM.ntiling(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkTensorDescriptionARM.nformat(address(), value);
            return this;
        }

        public Buffer dimensionCount(@NativeType("uint32_t") int value) {
            VkTensorDescriptionARM.ndimensionCount(address(), value);
            return this;
        }

        public Buffer pDimensions(@NativeType("int64_t const *") LongBuffer value) {
            VkTensorDescriptionARM.npDimensions(address(), value);
            return this;
        }

        public Buffer pStrides(@NativeType("int64_t const *") LongBuffer value) {
            VkTensorDescriptionARM.npStrides(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkTensorUsageFlagsARM") long value) {
            VkTensorDescriptionARM.nusage(address(), value);
            return this;
        }
    }
}
