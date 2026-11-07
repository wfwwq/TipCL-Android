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
import org.lwjgl.vulkan.VkMicromapUsageEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT.class */
public class VkAccelerationStructureTrianglesOpacityMicromapEXT extends Struct<VkAccelerationStructureTrianglesOpacityMicromapEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INDEXTYPE;
    public static final int INDEXBUFFER;
    public static final int INDEXSTRIDE;
    public static final int BASETRIANGLE;
    public static final int USAGECOUNTSCOUNT;
    public static final int PUSAGECOUNTS;
    public static final int PPUSAGECOUNTS;
    public static final int MICROMAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEXTYPE = layout.offsetof(2);
        INDEXBUFFER = layout.offsetof(3);
        INDEXSTRIDE = layout.offsetof(4);
        BASETRIANGLE = layout.offsetof(5);
        USAGECOUNTSCOUNT = layout.offsetof(6);
        PUSAGECOUNTS = layout.offsetof(7);
        PPUSAGECOUNTS = layout.offsetof(8);
        MICROMAP = layout.offsetof(9);
    }

    protected VkAccelerationStructureTrianglesOpacityMicromapEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureTrianglesOpacityMicromapEXT create(long address, ByteBuffer container) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(address, container);
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkIndexType")
    public int indexType() {
        return nindexType(address());
    }

    public VkDeviceOrHostAddressConstKHR indexBuffer() {
        return nindexBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long indexStride() {
        return nindexStride(address());
    }

    @NativeType("uint32_t")
    public int baseTriangle() {
        return nbaseTriangle(address());
    }

    @NativeType("uint32_t")
    public int usageCountsCount() {
        return nusageCountsCount(address());
    }

    @NativeType("VkMicromapUsageEXT const *")
    public VkMicromapUsageEXT.Buffer pUsageCounts() {
        return npUsageCounts(address());
    }

    @NativeType("VkMicromapUsageEXT const * const *")
    public PointerBuffer ppUsageCounts() {
        return nppUsageCounts(address());
    }

    @NativeType("VkMicromapEXT")
    public long micromap() {
        return nmicromap(address());
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT sType$Default() {
        return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT);
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexType(@NativeType("VkIndexType") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(VkDeviceOrHostAddressConstKHR value) {
        nindexBuffer(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(indexBuffer());
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT indexStride(@NativeType("VkDeviceSize") long value) {
        nindexStride(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangle(@NativeType("uint32_t") int value) {
        nbaseTriangle(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCount(@NativeType("uint32_t") int value) {
        nusageCountsCount(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCounts(@NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) {
        npUsageCounts(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCounts(@NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) {
        nppUsageCounts(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT micromap(@NativeType("VkMicromapEXT") long value) {
        nmicromap(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT set(int sType, long pNext, int indexType, VkDeviceOrHostAddressConstKHR indexBuffer, long indexStride, int baseTriangle, int usageCountsCount, VkMicromapUsageEXT.Buffer pUsageCounts, PointerBuffer ppUsageCounts, long micromap) {
        sType(sType);
        pNext(pNext);
        indexType(indexType);
        indexBuffer(indexBuffer);
        indexStride(indexStride);
        baseTriangle(baseTriangle);
        usageCountsCount(usageCountsCount);
        pUsageCounts(pUsageCounts);
        ppUsageCounts(ppUsageCounts);
        micromap(micromap);
        return this;
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT set(VkAccelerationStructureTrianglesOpacityMicromapEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT malloc() {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT calloc() {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT create(long address) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(address, null);
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(address, null);
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

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT malloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT calloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nindexType(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPE);
    }

    public static VkDeviceOrHostAddressConstKHR nindexBuffer(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + INDEXBUFFER);
    }

    public static long nindexStride(long struct) {
        return MemoryUtil.memGetLong(struct + INDEXSTRIDE);
    }

    public static int nbaseTriangle(long struct) {
        return MemoryUtil.memGetInt(struct + BASETRIANGLE);
    }

    public static int nusageCountsCount(long struct) {
        return MemoryUtil.memGetInt(struct + USAGECOUNTSCOUNT);
    }

    public static VkMicromapUsageEXT.Buffer npUsageCounts(long struct) {
        return VkMicromapUsageEXT.createSafe(MemoryUtil.memGetAddress(struct + PUSAGECOUNTS), nusageCountsCount(struct));
    }

    public static PointerBuffer nppUsageCounts(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPUSAGECOUNTS), nusageCountsCount(struct));
    }

    public static long nmicromap(long struct) {
        return MemoryUtil.memGetLong(struct + MICROMAP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nindexType(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPE, value);
    }

    public static void nindexBuffer(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + INDEXBUFFER, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void nindexStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDEXSTRIDE, value);
    }

    public static void nbaseTriangle(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASETRIANGLE, value);
    }

    public static void nusageCountsCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGECOUNTSCOUNT, value);
    }

    public static void npUsageCounts(long struct, VkMicromapUsageEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PUSAGECOUNTS, MemoryUtil.memAddressSafe(value));
    }

    public static void nppUsageCounts(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPUSAGECOUNTS, MemoryUtil.memAddressSafe(value));
    }

    public static void nmicromap(long struct, long value) {
        MemoryUtil.memPutLong(struct + MICROMAP, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureTrianglesOpacityMicromapEXT, Buffer> implements NativeResource {
        private static final VkAccelerationStructureTrianglesOpacityMicromapEXT ELEMENT_FACTORY = VkAccelerationStructureTrianglesOpacityMicromapEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF);
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
        public VkAccelerationStructureTrianglesOpacityMicromapEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.npNext(address());
        }

        @NativeType("VkIndexType")
        public int indexType() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexType(address());
        }

        public VkDeviceOrHostAddressConstKHR indexBuffer() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long indexStride() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexStride(address());
        }

        @NativeType("uint32_t")
        public int baseTriangle() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nbaseTriangle(address());
        }

        @NativeType("uint32_t")
        public int usageCountsCount() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nusageCountsCount(address());
        }

        @NativeType("VkMicromapUsageEXT const *")
        public VkMicromapUsageEXT.Buffer pUsageCounts() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.npUsageCounts(address());
        }

        @NativeType("VkMicromapUsageEXT const * const *")
        public PointerBuffer ppUsageCounts() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nppUsageCounts(address());
        }

        @NativeType("VkMicromapEXT")
        public long micromap() {
            return VkAccelerationStructureTrianglesOpacityMicromapEXT.nmicromap(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.npNext(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("VkIndexType") int value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexType(address(), value);
            return this;
        }

        public Buffer indexBuffer(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexBuffer(address(), value);
            return this;
        }

        public Buffer indexBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(indexBuffer());
            return this;
        }

        public Buffer indexStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexStride(address(), value);
            return this;
        }

        public Buffer baseTriangle(@NativeType("uint32_t") int value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nbaseTriangle(address(), value);
            return this;
        }

        public Buffer usageCountsCount(@NativeType("uint32_t") int value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nusageCountsCount(address(), value);
            return this;
        }

        public Buffer pUsageCounts(@NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.npUsageCounts(address(), value);
            return this;
        }

        public Buffer ppUsageCounts(@NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nppUsageCounts(address(), value);
            return this;
        }

        public Buffer micromap(@NativeType("VkMicromapEXT") long value) {
            VkAccelerationStructureTrianglesOpacityMicromapEXT.nmicromap(address(), value);
            return this;
        }
    }
}
