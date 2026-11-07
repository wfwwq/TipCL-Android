package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuLaunchInfoNVX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuLaunchInfoNVX.class */
public class VkCuLaunchInfoNVX extends Struct<VkCuLaunchInfoNVX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FUNCTION;
    public static final int GRIDDIMX;
    public static final int GRIDDIMY;
    public static final int GRIDDIMZ;
    public static final int BLOCKDIMX;
    public static final int BLOCKDIMY;
    public static final int BLOCKDIMZ;
    public static final int SHAREDMEMBYTES;
    public static final int PARAMCOUNT;
    public static final int PPARAMS;
    public static final int EXTRACOUNT;
    public static final int PEXTRAS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FUNCTION = layout.offsetof(2);
        GRIDDIMX = layout.offsetof(3);
        GRIDDIMY = layout.offsetof(4);
        GRIDDIMZ = layout.offsetof(5);
        BLOCKDIMX = layout.offsetof(6);
        BLOCKDIMY = layout.offsetof(7);
        BLOCKDIMZ = layout.offsetof(8);
        SHAREDMEMBYTES = layout.offsetof(9);
        PARAMCOUNT = layout.offsetof(10);
        PPARAMS = layout.offsetof(11);
        EXTRACOUNT = layout.offsetof(12);
        PEXTRAS = layout.offsetof(13);
    }

    protected VkCuLaunchInfoNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCuLaunchInfoNVX create(long address, ByteBuffer container) {
        return new VkCuLaunchInfoNVX(address, container);
    }

    public VkCuLaunchInfoNVX(ByteBuffer container) {
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

    @NativeType("VkCuFunctionNVX")
    public long function() {
        return nfunction(address());
    }

    @NativeType("uint32_t")
    public int gridDimX() {
        return ngridDimX(address());
    }

    @NativeType("uint32_t")
    public int gridDimY() {
        return ngridDimY(address());
    }

    @NativeType("uint32_t")
    public int gridDimZ() {
        return ngridDimZ(address());
    }

    @NativeType("uint32_t")
    public int blockDimX() {
        return nblockDimX(address());
    }

    @NativeType("uint32_t")
    public int blockDimY() {
        return nblockDimY(address());
    }

    @NativeType("uint32_t")
    public int blockDimZ() {
        return nblockDimZ(address());
    }

    @NativeType("uint32_t")
    public int sharedMemBytes() {
        return nsharedMemBytes(address());
    }

    @NativeType("size_t")
    public long paramCount() {
        return nparamCount(address());
    }

    @NativeType("void const * const *")
    public PointerBuffer pParams() {
        return npParams(address());
    }

    @NativeType("size_t")
    public long extraCount() {
        return nextraCount(address());
    }

    @NativeType("void const * const *")
    public PointerBuffer pExtras() {
        return npExtras(address());
    }

    public VkCuLaunchInfoNVX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX sType$Default() {
        return sType(NVXBinaryImport.VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX);
    }

    public VkCuLaunchInfoNVX pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX function(@NativeType("VkCuFunctionNVX") long value) {
        nfunction(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX gridDimX(@NativeType("uint32_t") int value) {
        ngridDimX(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX gridDimY(@NativeType("uint32_t") int value) {
        ngridDimY(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX gridDimZ(@NativeType("uint32_t") int value) {
        ngridDimZ(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX blockDimX(@NativeType("uint32_t") int value) {
        nblockDimX(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX blockDimY(@NativeType("uint32_t") int value) {
        nblockDimY(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX blockDimZ(@NativeType("uint32_t") int value) {
        nblockDimZ(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX sharedMemBytes(@NativeType("uint32_t") int value) {
        nsharedMemBytes(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX pParams(@NativeType("void const * const *") PointerBuffer value) {
        npParams(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX pExtras(@NativeType("void const * const *") PointerBuffer value) {
        npExtras(address(), value);
        return this;
    }

    public VkCuLaunchInfoNVX set(int sType, long pNext, long function, int gridDimX, int gridDimY, int gridDimZ, int blockDimX, int blockDimY, int blockDimZ, int sharedMemBytes, PointerBuffer pParams, PointerBuffer pExtras) {
        sType(sType);
        pNext(pNext);
        function(function);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        pParams(pParams);
        pExtras(pExtras);
        return this;
    }

    public VkCuLaunchInfoNVX set(VkCuLaunchInfoNVX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCuLaunchInfoNVX malloc() {
        return new VkCuLaunchInfoNVX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCuLaunchInfoNVX calloc() {
        return new VkCuLaunchInfoNVX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCuLaunchInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCuLaunchInfoNVX(MemoryUtil.memAddress(container), container);
    }

    public static VkCuLaunchInfoNVX create(long address) {
        return new VkCuLaunchInfoNVX(address, null);
    }

    public static VkCuLaunchInfoNVX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCuLaunchInfoNVX(address, null);
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

    public static VkCuLaunchInfoNVX malloc(MemoryStack stack) {
        return new VkCuLaunchInfoNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCuLaunchInfoNVX calloc(MemoryStack stack) {
        return new VkCuLaunchInfoNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nfunction(long struct) {
        return MemoryUtil.memGetLong(struct + FUNCTION);
    }

    public static int ngridDimX(long struct) {
        return MemoryUtil.memGetInt(struct + GRIDDIMX);
    }

    public static int ngridDimY(long struct) {
        return MemoryUtil.memGetInt(struct + GRIDDIMY);
    }

    public static int ngridDimZ(long struct) {
        return MemoryUtil.memGetInt(struct + GRIDDIMZ);
    }

    public static int nblockDimX(long struct) {
        return MemoryUtil.memGetInt(struct + BLOCKDIMX);
    }

    public static int nblockDimY(long struct) {
        return MemoryUtil.memGetInt(struct + BLOCKDIMY);
    }

    public static int nblockDimZ(long struct) {
        return MemoryUtil.memGetInt(struct + BLOCKDIMZ);
    }

    public static int nsharedMemBytes(long struct) {
        return MemoryUtil.memGetInt(struct + SHAREDMEMBYTES);
    }

    public static long nparamCount(long struct) {
        return MemoryUtil.memGetAddress(struct + PARAMCOUNT);
    }

    public static PointerBuffer npParams(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPARAMS), (int) nparamCount(struct));
    }

    public static long nextraCount(long struct) {
        return MemoryUtil.memGetAddress(struct + EXTRACOUNT);
    }

    public static PointerBuffer npExtras(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PEXTRAS), (int) nextraCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfunction(long struct, long value) {
        MemoryUtil.memPutLong(struct + FUNCTION, value);
    }

    public static void ngridDimX(long struct, int value) {
        MemoryUtil.memPutInt(struct + GRIDDIMX, value);
    }

    public static void ngridDimY(long struct, int value) {
        MemoryUtil.memPutInt(struct + GRIDDIMY, value);
    }

    public static void ngridDimZ(long struct, int value) {
        MemoryUtil.memPutInt(struct + GRIDDIMZ, value);
    }

    public static void nblockDimX(long struct, int value) {
        MemoryUtil.memPutInt(struct + BLOCKDIMX, value);
    }

    public static void nblockDimY(long struct, int value) {
        MemoryUtil.memPutInt(struct + BLOCKDIMY, value);
    }

    public static void nblockDimZ(long struct, int value) {
        MemoryUtil.memPutInt(struct + BLOCKDIMZ, value);
    }

    public static void nsharedMemBytes(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHAREDMEMBYTES, value);
    }

    public static void nparamCount(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PARAMCOUNT, value);
    }

    public static void npParams(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPARAMS, MemoryUtil.memAddressSafe(value));
        nparamCount(struct, value == null ? 0L : value.remaining());
    }

    public static void nextraCount(long struct, long value) {
        MemoryUtil.memPutAddress(struct + EXTRACOUNT, value);
    }

    public static void npExtras(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PEXTRAS, MemoryUtil.memAddressSafe(value));
        nextraCount(struct, value == null ? 0L : value.remaining());
    }

    public static void validate(long struct) {
        if (nparamCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPARAMS));
        }
        if (nextraCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PEXTRAS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuLaunchInfoNVX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCuLaunchInfoNVX$Buffer.class */
    public static class Buffer extends StructBuffer<VkCuLaunchInfoNVX, Buffer> implements NativeResource {
        private static final VkCuLaunchInfoNVX ELEMENT_FACTORY = VkCuLaunchInfoNVX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCuLaunchInfoNVX.SIZEOF);
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
        public VkCuLaunchInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCuLaunchInfoNVX.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCuLaunchInfoNVX.npNext(address());
        }

        @NativeType("VkCuFunctionNVX")
        public long function() {
            return VkCuLaunchInfoNVX.nfunction(address());
        }

        @NativeType("uint32_t")
        public int gridDimX() {
            return VkCuLaunchInfoNVX.ngridDimX(address());
        }

        @NativeType("uint32_t")
        public int gridDimY() {
            return VkCuLaunchInfoNVX.ngridDimY(address());
        }

        @NativeType("uint32_t")
        public int gridDimZ() {
            return VkCuLaunchInfoNVX.ngridDimZ(address());
        }

        @NativeType("uint32_t")
        public int blockDimX() {
            return VkCuLaunchInfoNVX.nblockDimX(address());
        }

        @NativeType("uint32_t")
        public int blockDimY() {
            return VkCuLaunchInfoNVX.nblockDimY(address());
        }

        @NativeType("uint32_t")
        public int blockDimZ() {
            return VkCuLaunchInfoNVX.nblockDimZ(address());
        }

        @NativeType("uint32_t")
        public int sharedMemBytes() {
            return VkCuLaunchInfoNVX.nsharedMemBytes(address());
        }

        @NativeType("size_t")
        public long paramCount() {
            return VkCuLaunchInfoNVX.nparamCount(address());
        }

        @NativeType("void const * const *")
        public PointerBuffer pParams() {
            return VkCuLaunchInfoNVX.npParams(address());
        }

        @NativeType("size_t")
        public long extraCount() {
            return VkCuLaunchInfoNVX.nextraCount(address());
        }

        @NativeType("void const * const *")
        public PointerBuffer pExtras() {
            return VkCuLaunchInfoNVX.npExtras(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCuLaunchInfoNVX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVXBinaryImport.VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCuLaunchInfoNVX.npNext(address(), value);
            return this;
        }

        public Buffer function(@NativeType("VkCuFunctionNVX") long value) {
            VkCuLaunchInfoNVX.nfunction(address(), value);
            return this;
        }

        public Buffer gridDimX(@NativeType("uint32_t") int value) {
            VkCuLaunchInfoNVX.ngridDimX(address(), value);
            return this;
        }

        public Buffer gridDimY(@NativeType("uint32_t") int value) {
            VkCuLaunchInfoNVX.ngridDimY(address(), value);
            return this;
        }

        public Buffer gridDimZ(@NativeType("uint32_t") int value) {
            VkCuLaunchInfoNVX.ngridDimZ(address(), value);
            return this;
        }

        public Buffer blockDimX(@NativeType("uint32_t") int value) {
            VkCuLaunchInfoNVX.nblockDimX(address(), value);
            return this;
        }

        public Buffer blockDimY(@NativeType("uint32_t") int value) {
            VkCuLaunchInfoNVX.nblockDimY(address(), value);
            return this;
        }

        public Buffer blockDimZ(@NativeType("uint32_t") int value) {
            VkCuLaunchInfoNVX.nblockDimZ(address(), value);
            return this;
        }

        public Buffer sharedMemBytes(@NativeType("uint32_t") int value) {
            VkCuLaunchInfoNVX.nsharedMemBytes(address(), value);
            return this;
        }

        public Buffer pParams(@NativeType("void const * const *") PointerBuffer value) {
            VkCuLaunchInfoNVX.npParams(address(), value);
            return this;
        }

        public Buffer pExtras(@NativeType("void const * const *") PointerBuffer value) {
            VkCuLaunchInfoNVX.npExtras(address(), value);
            return this;
        }
    }
}
