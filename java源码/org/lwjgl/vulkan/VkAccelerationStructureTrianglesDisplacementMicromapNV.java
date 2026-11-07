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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV.class */
public class VkAccelerationStructureTrianglesDisplacementMicromapNV extends Struct<VkAccelerationStructureTrianglesDisplacementMicromapNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DISPLACEMENTBIASANDSCALEFORMAT;
    public static final int DISPLACEMENTVECTORFORMAT;
    public static final int DISPLACEMENTBIASANDSCALEBUFFER;
    public static final int DISPLACEMENTBIASANDSCALESTRIDE;
    public static final int DISPLACEMENTVECTORBUFFER;
    public static final int DISPLACEMENTVECTORSTRIDE;
    public static final int DISPLACEDMICROMAPPRIMITIVEFLAGS;
    public static final int DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE;
    public static final int INDEXTYPE;
    public static final int INDEXBUFFER;
    public static final int INDEXSTRIDE;
    public static final int BASETRIANGLE;
    public static final int USAGECOUNTSCOUNT;
    public static final int PUSAGECOUNTS;
    public static final int PPUSAGECOUNTS;
    public static final int MICROMAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLACEMENTBIASANDSCALEFORMAT = layout.offsetof(2);
        DISPLACEMENTVECTORFORMAT = layout.offsetof(3);
        DISPLACEMENTBIASANDSCALEBUFFER = layout.offsetof(4);
        DISPLACEMENTBIASANDSCALESTRIDE = layout.offsetof(5);
        DISPLACEMENTVECTORBUFFER = layout.offsetof(6);
        DISPLACEMENTVECTORSTRIDE = layout.offsetof(7);
        DISPLACEDMICROMAPPRIMITIVEFLAGS = layout.offsetof(8);
        DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE = layout.offsetof(9);
        INDEXTYPE = layout.offsetof(10);
        INDEXBUFFER = layout.offsetof(11);
        INDEXSTRIDE = layout.offsetof(12);
        BASETRIANGLE = layout.offsetof(13);
        USAGECOUNTSCOUNT = layout.offsetof(14);
        PUSAGECOUNTS = layout.offsetof(15);
        PPUSAGECOUNTS = layout.offsetof(16);
        MICROMAP = layout.offsetof(17);
    }

    protected VkAccelerationStructureTrianglesDisplacementMicromapNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureTrianglesDisplacementMicromapNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(address, container);
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int displacementBiasAndScaleFormat() {
        return ndisplacementBiasAndScaleFormat(address());
    }

    @NativeType("VkFormat")
    public int displacementVectorFormat() {
        return ndisplacementVectorFormat(address());
    }

    public VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() {
        return ndisplacementBiasAndScaleBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long displacementBiasAndScaleStride() {
        return ndisplacementBiasAndScaleStride(address());
    }

    public VkDeviceOrHostAddressConstKHR displacementVectorBuffer() {
        return ndisplacementVectorBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long displacementVectorStride() {
        return ndisplacementVectorStride(address());
    }

    public VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() {
        return ndisplacedMicromapPrimitiveFlags(address());
    }

    @NativeType("VkDeviceSize")
    public long displacedMicromapPrimitiveFlagsStride() {
        return ndisplacedMicromapPrimitiveFlagsStride(address());
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

    public VkAccelerationStructureTrianglesDisplacementMicromapNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV sType$Default() {
        return sType(NVDisplacementMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV);
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleFormat(@NativeType("VkFormat") int value) {
        ndisplacementBiasAndScaleFormat(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorFormat(@NativeType("VkFormat") int value) {
        ndisplacementVectorFormat(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(VkDeviceOrHostAddressConstKHR value) {
        ndisplacementBiasAndScaleBuffer(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(displacementBiasAndScaleBuffer());
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementBiasAndScaleStride(@NativeType("VkDeviceSize") long value) {
        ndisplacementBiasAndScaleStride(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(VkDeviceOrHostAddressConstKHR value) {
        ndisplacementVectorBuffer(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(displacementVectorBuffer());
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacementVectorStride(@NativeType("VkDeviceSize") long value) {
        ndisplacementVectorStride(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(VkDeviceOrHostAddressConstKHR value) {
        ndisplacedMicromapPrimitiveFlags(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlags(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(displacedMicromapPrimitiveFlags());
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV displacedMicromapPrimitiveFlagsStride(@NativeType("VkDeviceSize") long value) {
        ndisplacedMicromapPrimitiveFlagsStride(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexType(@NativeType("VkIndexType") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(VkDeviceOrHostAddressConstKHR value) {
        nindexBuffer(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(indexBuffer());
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV indexStride(@NativeType("VkDeviceSize") long value) {
        nindexStride(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV baseTriangle(@NativeType("uint32_t") int value) {
        nbaseTriangle(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV usageCountsCount(@NativeType("uint32_t") int value) {
        nusageCountsCount(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV pUsageCounts(@NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) {
        npUsageCounts(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV ppUsageCounts(@NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) {
        nppUsageCounts(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV micromap(@NativeType("VkMicromapEXT") long value) {
        nmicromap(address(), value);
        return this;
    }

    public VkAccelerationStructureTrianglesDisplacementMicromapNV set(int sType, long pNext, int displacementBiasAndScaleFormat, int displacementVectorFormat, VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer, long displacementBiasAndScaleStride, VkDeviceOrHostAddressConstKHR displacementVectorBuffer, long displacementVectorStride, VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags, long displacedMicromapPrimitiveFlagsStride, int indexType, VkDeviceOrHostAddressConstKHR indexBuffer, long indexStride, int baseTriangle, int usageCountsCount, VkMicromapUsageEXT.Buffer pUsageCounts, PointerBuffer ppUsageCounts, long micromap) {
        sType(sType);
        pNext(pNext);
        displacementBiasAndScaleFormat(displacementBiasAndScaleFormat);
        displacementVectorFormat(displacementVectorFormat);
        displacementBiasAndScaleBuffer(displacementBiasAndScaleBuffer);
        displacementBiasAndScaleStride(displacementBiasAndScaleStride);
        displacementVectorBuffer(displacementVectorBuffer);
        displacementVectorStride(displacementVectorStride);
        displacedMicromapPrimitiveFlags(displacedMicromapPrimitiveFlags);
        displacedMicromapPrimitiveFlagsStride(displacedMicromapPrimitiveFlagsStride);
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

    public VkAccelerationStructureTrianglesDisplacementMicromapNV set(VkAccelerationStructureTrianglesDisplacementMicromapNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV malloc() {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV calloc() {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV create(long address) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(address, null);
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(address, null);
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

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndisplacementBiasAndScaleFormat(long struct) {
        return MemoryUtil.memGetInt(struct + DISPLACEMENTBIASANDSCALEFORMAT);
    }

    public static int ndisplacementVectorFormat(long struct) {
        return MemoryUtil.memGetInt(struct + DISPLACEMENTVECTORFORMAT);
    }

    public static VkDeviceOrHostAddressConstKHR ndisplacementBiasAndScaleBuffer(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + DISPLACEMENTBIASANDSCALEBUFFER);
    }

    public static long ndisplacementBiasAndScaleStride(long struct) {
        return MemoryUtil.memGetLong(struct + DISPLACEMENTBIASANDSCALESTRIDE);
    }

    public static VkDeviceOrHostAddressConstKHR ndisplacementVectorBuffer(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + DISPLACEMENTVECTORBUFFER);
    }

    public static long ndisplacementVectorStride(long struct) {
        return MemoryUtil.memGetLong(struct + DISPLACEMENTVECTORSTRIDE);
    }

    public static VkDeviceOrHostAddressConstKHR ndisplacedMicromapPrimitiveFlags(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + DISPLACEDMICROMAPPRIMITIVEFLAGS);
    }

    public static long ndisplacedMicromapPrimitiveFlagsStride(long struct) {
        return MemoryUtil.memGetLong(struct + DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE);
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

    public static void ndisplacementBiasAndScaleFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISPLACEMENTBIASANDSCALEFORMAT, value);
    }

    public static void ndisplacementVectorFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISPLACEMENTVECTORFORMAT, value);
    }

    public static void ndisplacementBiasAndScaleBuffer(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DISPLACEMENTBIASANDSCALEBUFFER, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void ndisplacementBiasAndScaleStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + DISPLACEMENTBIASANDSCALESTRIDE, value);
    }

    public static void ndisplacementVectorBuffer(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DISPLACEMENTVECTORBUFFER, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void ndisplacementVectorStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + DISPLACEMENTVECTORSTRIDE, value);
    }

    public static void ndisplacedMicromapPrimitiveFlags(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DISPLACEDMICROMAPPRIMITIVEFLAGS, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void ndisplacedMicromapPrimitiveFlagsStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + DISPLACEDMICROMAPPRIMITIVEFLAGSSTRIDE, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesDisplacementMicromapNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureTrianglesDisplacementMicromapNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureTrianglesDisplacementMicromapNV ELEMENT_FACTORY = VkAccelerationStructureTrianglesDisplacementMicromapNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureTrianglesDisplacementMicromapNV.SIZEOF);
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
        public VkAccelerationStructureTrianglesDisplacementMicromapNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.npNext(address());
        }

        @NativeType("VkFormat")
        public int displacementBiasAndScaleFormat() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleFormat(address());
        }

        @NativeType("VkFormat")
        public int displacementVectorFormat() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorFormat(address());
        }

        public VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long displacementBiasAndScaleStride() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleStride(address());
        }

        public VkDeviceOrHostAddressConstKHR displacementVectorBuffer() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long displacementVectorStride() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorStride(address());
        }

        public VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlags(address());
        }

        @NativeType("VkDeviceSize")
        public long displacedMicromapPrimitiveFlagsStride() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlagsStride(address());
        }

        @NativeType("VkIndexType")
        public int indexType() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexType(address());
        }

        public VkDeviceOrHostAddressConstKHR indexBuffer() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long indexStride() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexStride(address());
        }

        @NativeType("uint32_t")
        public int baseTriangle() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nbaseTriangle(address());
        }

        @NativeType("uint32_t")
        public int usageCountsCount() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nusageCountsCount(address());
        }

        @NativeType("VkMicromapUsageEXT const *")
        public VkMicromapUsageEXT.Buffer pUsageCounts() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.npUsageCounts(address());
        }

        @NativeType("VkMicromapUsageEXT const * const *")
        public PointerBuffer ppUsageCounts() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nppUsageCounts(address());
        }

        @NativeType("VkMicromapEXT")
        public long micromap() {
            return VkAccelerationStructureTrianglesDisplacementMicromapNV.nmicromap(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDisplacementMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.npNext(address(), value);
            return this;
        }

        public Buffer displacementBiasAndScaleFormat(@NativeType("VkFormat") int value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleFormat(address(), value);
            return this;
        }

        public Buffer displacementVectorFormat(@NativeType("VkFormat") int value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorFormat(address(), value);
            return this;
        }

        public Buffer displacementBiasAndScaleBuffer(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleBuffer(address(), value);
            return this;
        }

        public Buffer displacementBiasAndScaleBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(displacementBiasAndScaleBuffer());
            return this;
        }

        public Buffer displacementBiasAndScaleStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementBiasAndScaleStride(address(), value);
            return this;
        }

        public Buffer displacementVectorBuffer(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorBuffer(address(), value);
            return this;
        }

        public Buffer displacementVectorBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(displacementVectorBuffer());
            return this;
        }

        public Buffer displacementVectorStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacementVectorStride(address(), value);
            return this;
        }

        public Buffer displacedMicromapPrimitiveFlags(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlags(address(), value);
            return this;
        }

        public Buffer displacedMicromapPrimitiveFlags(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(displacedMicromapPrimitiveFlags());
            return this;
        }

        public Buffer displacedMicromapPrimitiveFlagsStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.ndisplacedMicromapPrimitiveFlagsStride(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("VkIndexType") int value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexType(address(), value);
            return this;
        }

        public Buffer indexBuffer(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexBuffer(address(), value);
            return this;
        }

        public Buffer indexBuffer(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(indexBuffer());
            return this;
        }

        public Buffer indexStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nindexStride(address(), value);
            return this;
        }

        public Buffer baseTriangle(@NativeType("uint32_t") int value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nbaseTriangle(address(), value);
            return this;
        }

        public Buffer usageCountsCount(@NativeType("uint32_t") int value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nusageCountsCount(address(), value);
            return this;
        }

        public Buffer pUsageCounts(@NativeType("VkMicromapUsageEXT const *") VkMicromapUsageEXT.Buffer value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.npUsageCounts(address(), value);
            return this;
        }

        public Buffer ppUsageCounts(@NativeType("VkMicromapUsageEXT const * const *") PointerBuffer value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nppUsageCounts(address(), value);
            return this;
        }

        public Buffer micromap(@NativeType("VkMicromapEXT") long value) {
            VkAccelerationStructureTrianglesDisplacementMicromapNV.nmicromap(address(), value);
            return this;
        }
    }
}
