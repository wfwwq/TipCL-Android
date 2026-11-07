package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkAccelerationStructureGeometryKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR.class */
public class VkAccelerationStructureBuildGeometryInfoKHR extends Struct<VkAccelerationStructureBuildGeometryInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int FLAGS;
    public static final int MODE;
    public static final int SRCACCELERATIONSTRUCTURE;
    public static final int DSTACCELERATIONSTRUCTURE;
    public static final int GEOMETRYCOUNT;
    public static final int PGEOMETRIES;
    public static final int PPGEOMETRIES;
    public static final int SCRATCHDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(8), __member(8), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        MODE = layout.offsetof(4);
        SRCACCELERATIONSTRUCTURE = layout.offsetof(5);
        DSTACCELERATIONSTRUCTURE = layout.offsetof(6);
        GEOMETRYCOUNT = layout.offsetof(7);
        PGEOMETRIES = layout.offsetof(8);
        PPGEOMETRIES = layout.offsetof(9);
        SCRATCHDATA = layout.offsetof(10);
    }

    protected VkAccelerationStructureBuildGeometryInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureBuildGeometryInfoKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(address, container);
    }

    public VkAccelerationStructureBuildGeometryInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAccelerationStructureTypeKHR")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBuildAccelerationStructureModeKHR")
    public int mode() {
        return nmode(address());
    }

    @NativeType("VkAccelerationStructureKHR")
    public long srcAccelerationStructure() {
        return nsrcAccelerationStructure(address());
    }

    @NativeType("VkAccelerationStructureKHR")
    public long dstAccelerationStructure() {
        return ndstAccelerationStructure(address());
    }

    @NativeType("uint32_t")
    public int geometryCount() {
        return ngeometryCount(address());
    }

    @NativeType("VkAccelerationStructureGeometryKHR const *")
    public VkAccelerationStructureGeometryKHR.Buffer pGeometries() {
        return npGeometries(address());
    }

    @NativeType("VkAccelerationStructureGeometryKHR const * const *")
    public PointerBuffer ppGeometries() {
        return nppGeometries(address());
    }

    public VkDeviceOrHostAddressKHR scratchData() {
        return nscratchData(address());
    }

    public VkAccelerationStructureBuildGeometryInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR sType$Default() {
        return sType(1000150000);
    }

    public VkAccelerationStructureBuildGeometryInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR type(@NativeType("VkAccelerationStructureTypeKHR") int value) {
        ntype(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR mode(@NativeType("VkBuildAccelerationStructureModeKHR") int value) {
        nmode(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
        nsrcAccelerationStructure(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
        ndstAccelerationStructure(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR geometryCount(@NativeType("uint32_t") int value) {
        ngeometryCount(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR pGeometries(@NativeType("VkAccelerationStructureGeometryKHR const *") VkAccelerationStructureGeometryKHR.Buffer value) {
        npGeometries(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(@NativeType("VkAccelerationStructureGeometryKHR const * const *") PointerBuffer value) {
        nppGeometries(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(VkDeviceOrHostAddressKHR value) {
        nscratchData(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
        consumer.accept(scratchData());
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR set(int sType, long pNext, int type, int flags, int mode, long srcAccelerationStructure, long dstAccelerationStructure, int geometryCount, VkAccelerationStructureGeometryKHR.Buffer pGeometries, PointerBuffer ppGeometries, VkDeviceOrHostAddressKHR scratchData) {
        sType(sType);
        pNext(pNext);
        type(type);
        flags(flags);
        mode(mode);
        srcAccelerationStructure(srcAccelerationStructure);
        dstAccelerationStructure(dstAccelerationStructure);
        geometryCount(geometryCount);
        pGeometries(pGeometries);
        ppGeometries(ppGeometries);
        scratchData(scratchData);
        return this;
    }

    public VkAccelerationStructureBuildGeometryInfoKHR set(VkAccelerationStructureBuildGeometryInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR malloc() {
        return new VkAccelerationStructureBuildGeometryInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR calloc() {
        return new VkAccelerationStructureBuildGeometryInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureBuildGeometryInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR create(long address) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(address, null);
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureBuildGeometryInfoKHR(address, null);
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

    public static VkAccelerationStructureBuildGeometryInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nmode(long struct) {
        return MemoryUtil.memGetInt(struct + MODE);
    }

    public static long nsrcAccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + SRCACCELERATIONSTRUCTURE);
    }

    public static long ndstAccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + DSTACCELERATIONSTRUCTURE);
    }

    public static int ngeometryCount(long struct) {
        return MemoryUtil.memGetInt(struct + GEOMETRYCOUNT);
    }

    public static VkAccelerationStructureGeometryKHR.Buffer npGeometries(long struct) {
        return VkAccelerationStructureGeometryKHR.createSafe(MemoryUtil.memGetAddress(struct + PGEOMETRIES), ngeometryCount(struct));
    }

    public static PointerBuffer nppGeometries(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPGEOMETRIES), ngeometryCount(struct));
    }

    public static VkDeviceOrHostAddressKHR nscratchData(long struct) {
        return VkDeviceOrHostAddressKHR.create(struct + SCRATCHDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    public static void nsrcAccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCACCELERATIONSTRUCTURE, value);
    }

    public static void ndstAccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTACCELERATIONSTRUCTURE, value);
    }

    public static void ngeometryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + GEOMETRYCOUNT, value);
    }

    public static void npGeometries(long struct, VkAccelerationStructureGeometryKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PGEOMETRIES, MemoryUtil.memAddressSafe(value));
    }

    public static void nppGeometries(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPGEOMETRIES, MemoryUtil.memAddressSafe(value));
    }

    public static void nscratchData(long struct, VkDeviceOrHostAddressKHR value) {
        MemoryUtil.memCopy(value.address(), struct + SCRATCHDATA, VkDeviceOrHostAddressKHR.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildGeometryInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildGeometryInfoKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureBuildGeometryInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildGeometryInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureBuildGeometryInfoKHR.SIZEOF);
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
        public VkAccelerationStructureBuildGeometryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureBuildGeometryInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureBuildGeometryInfoKHR.npNext(address());
        }

        @NativeType("VkAccelerationStructureTypeKHR")
        public int type() {
            return VkAccelerationStructureBuildGeometryInfoKHR.ntype(address());
        }

        @NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() {
            return VkAccelerationStructureBuildGeometryInfoKHR.nflags(address());
        }

        @NativeType("VkBuildAccelerationStructureModeKHR")
        public int mode() {
            return VkAccelerationStructureBuildGeometryInfoKHR.nmode(address());
        }

        @NativeType("VkAccelerationStructureKHR")
        public long srcAccelerationStructure() {
            return VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(address());
        }

        @NativeType("VkAccelerationStructureKHR")
        public long dstAccelerationStructure() {
            return VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(address());
        }

        @NativeType("uint32_t")
        public int geometryCount() {
            return VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(address());
        }

        @NativeType("VkAccelerationStructureGeometryKHR const *")
        public VkAccelerationStructureGeometryKHR.Buffer pGeometries() {
            return VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(address());
        }

        @NativeType("VkAccelerationStructureGeometryKHR const * const *")
        public PointerBuffer ppGeometries() {
            return VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(address());
        }

        public VkDeviceOrHostAddressKHR scratchData() {
            return VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureBuildGeometryInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000150000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureBuildGeometryInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkAccelerationStructureTypeKHR") int value) {
            VkAccelerationStructureBuildGeometryInfoKHR.ntype(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) {
            VkAccelerationStructureBuildGeometryInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("VkBuildAccelerationStructureModeKHR") int value) {
            VkAccelerationStructureBuildGeometryInfoKHR.nmode(address(), value);
            return this;
        }

        public Buffer srcAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
            VkAccelerationStructureBuildGeometryInfoKHR.nsrcAccelerationStructure(address(), value);
            return this;
        }

        public Buffer dstAccelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
            VkAccelerationStructureBuildGeometryInfoKHR.ndstAccelerationStructure(address(), value);
            return this;
        }

        public Buffer geometryCount(@NativeType("uint32_t") int value) {
            VkAccelerationStructureBuildGeometryInfoKHR.ngeometryCount(address(), value);
            return this;
        }

        public Buffer pGeometries(@NativeType("VkAccelerationStructureGeometryKHR const *") VkAccelerationStructureGeometryKHR.Buffer value) {
            VkAccelerationStructureBuildGeometryInfoKHR.npGeometries(address(), value);
            return this;
        }

        public Buffer ppGeometries(@NativeType("VkAccelerationStructureGeometryKHR const * const *") PointerBuffer value) {
            VkAccelerationStructureBuildGeometryInfoKHR.nppGeometries(address(), value);
            return this;
        }

        public Buffer scratchData(VkDeviceOrHostAddressKHR value) {
            VkAccelerationStructureBuildGeometryInfoKHR.nscratchData(address(), value);
            return this;
        }

        public Buffer scratchData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
            consumer.accept(scratchData());
            return this;
        }
    }
}
