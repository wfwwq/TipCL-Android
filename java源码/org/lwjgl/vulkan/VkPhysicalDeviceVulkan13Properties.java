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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Properties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Properties.class */
public class VkPhysicalDeviceVulkan13Properties extends Struct<VkPhysicalDeviceVulkan13Properties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MINSUBGROUPSIZE;
    public static final int MAXSUBGROUPSIZE;
    public static final int MAXCOMPUTEWORKGROUPSUBGROUPS;
    public static final int REQUIREDSUBGROUPSIZESTAGES;
    public static final int MAXINLINEUNIFORMBLOCKSIZE;
    public static final int MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS;
    public static final int MAXDESCRIPTORSETINLINEUNIFORMBLOCKS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS;
    public static final int MAXINLINEUNIFORMTOTALSIZE;
    public static final int INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT8BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT16BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT32BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT64BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED;
    public static final int INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED;
    public static final int STORAGETEXELBUFFEROFFSETALIGNMENTBYTES;
    public static final int STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT;
    public static final int UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES;
    public static final int UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT;
    public static final int MAXBUFFERSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8), __member(4), __member(8), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINSUBGROUPSIZE = layout.offsetof(2);
        MAXSUBGROUPSIZE = layout.offsetof(3);
        MAXCOMPUTEWORKGROUPSUBGROUPS = layout.offsetof(4);
        REQUIREDSUBGROUPSIZESTAGES = layout.offsetof(5);
        MAXINLINEUNIFORMBLOCKSIZE = layout.offsetof(6);
        MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS = layout.offsetof(7);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(8);
        MAXDESCRIPTORSETINLINEUNIFORMBLOCKS = layout.offsetof(9);
        MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS = layout.offsetof(10);
        MAXINLINEUNIFORMTOTALSIZE = layout.offsetof(11);
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED = layout.offsetof(12);
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED = layout.offsetof(13);
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(14);
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(15);
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(16);
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(17);
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED = layout.offsetof(18);
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED = layout.offsetof(19);
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(20);
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED = layout.offsetof(21);
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED = layout.offsetof(22);
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(23);
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED = layout.offsetof(24);
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED = layout.offsetof(25);
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(26);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED = layout.offsetof(27);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED = layout.offsetof(28);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(29);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(30);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(31);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(32);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED = layout.offsetof(33);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED = layout.offsetof(34);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(35);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED = layout.offsetof(36);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED = layout.offsetof(37);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(38);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED = layout.offsetof(39);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED = layout.offsetof(40);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(41);
        STORAGETEXELBUFFEROFFSETALIGNMENTBYTES = layout.offsetof(42);
        STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT = layout.offsetof(43);
        UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES = layout.offsetof(44);
        UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT = layout.offsetof(45);
        MAXBUFFERSIZE = layout.offsetof(46);
    }

    protected VkPhysicalDeviceVulkan13Properties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan13Properties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan13Properties(address, container);
    }

    public VkPhysicalDeviceVulkan13Properties(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int minSubgroupSize() {
        return nminSubgroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxSubgroupSize() {
        return nmaxSubgroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxComputeWorkgroupSubgroups() {
        return nmaxComputeWorkgroupSubgroups(address());
    }

    @NativeType("VkShaderStageFlags")
    public int requiredSubgroupSizeStages() {
        return nrequiredSubgroupSizeStages(address());
    }

    @NativeType("uint32_t")
    public int maxInlineUniformBlockSize() {
        return nmaxInlineUniformBlockSize(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorInlineUniformBlocks() {
        return nmaxPerStageDescriptorInlineUniformBlocks(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {
        return nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetInlineUniformBlocks() {
        return nmaxDescriptorSetInlineUniformBlocks(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {
        return nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address());
    }

    @NativeType("uint32_t")
    public int maxInlineUniformTotalSize() {
        return nmaxInlineUniformTotalSize(address());
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct8BitUnsignedAccelerated() {
        return nintegerDotProduct8BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct8BitSignedAccelerated() {
        return nintegerDotProduct8BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct8BitMixedSignednessAccelerated() {
        return nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() {
        return nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedSignedAccelerated() {
        return nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
        return nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct16BitUnsignedAccelerated() {
        return nintegerDotProduct16BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct16BitSignedAccelerated() {
        return nintegerDotProduct16BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct16BitMixedSignednessAccelerated() {
        return nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct32BitUnsignedAccelerated() {
        return nintegerDotProduct32BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct32BitSignedAccelerated() {
        return nintegerDotProduct32BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct32BitMixedSignednessAccelerated() {
        return nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct64BitUnsignedAccelerated() {
        return nintegerDotProduct64BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct64BitSignedAccelerated() {
        return nintegerDotProduct64BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProduct64BitMixedSignednessAccelerated() {
        return nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
        return nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
        return nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
        return nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
        return nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
        return nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
        return nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0;
    }

    @NativeType("VkDeviceSize")
    public long storageTexelBufferOffsetAlignmentBytes() {
        return nstorageTexelBufferOffsetAlignmentBytes(address());
    }

    @NativeType("VkBool32")
    public boolean storageTexelBufferOffsetSingleTexelAlignment() {
        return nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0;
    }

    @NativeType("VkDeviceSize")
    public long uniformTexelBufferOffsetAlignmentBytes() {
        return nuniformTexelBufferOffsetAlignmentBytes(address());
    }

    @NativeType("VkBool32")
    public boolean uniformTexelBufferOffsetSingleTexelAlignment() {
        return nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0;
    }

    @NativeType("VkDeviceSize")
    public long maxBufferSize() {
        return nmaxBufferSize(address());
    }

    public VkPhysicalDeviceVulkan13Properties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan13Properties sType$Default() {
        return sType(54);
    }

    public VkPhysicalDeviceVulkan13Properties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan13Properties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceVulkan13Properties set(VkPhysicalDeviceVulkan13Properties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan13Properties malloc() {
        return new VkPhysicalDeviceVulkan13Properties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan13Properties calloc() {
        return new VkPhysicalDeviceVulkan13Properties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan13Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan13Properties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan13Properties create(long address) {
        return new VkPhysicalDeviceVulkan13Properties(address, null);
    }

    public static VkPhysicalDeviceVulkan13Properties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan13Properties(address, null);
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

    public static VkPhysicalDeviceVulkan13Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan13Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan13Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nminSubgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + MINSUBGROUPSIZE);
    }

    public static int nmaxSubgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSUBGROUPSIZE);
    }

    public static int nmaxComputeWorkgroupSubgroups(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTEWORKGROUPSUBGROUPS);
    }

    public static int nrequiredSubgroupSizeStages(long struct) {
        return MemoryUtil.memGetInt(struct + REQUIREDSUBGROUPSIZESTAGES);
    }

    public static int nmaxInlineUniformBlockSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINLINEUNIFORMBLOCKSIZE);
    }

    public static int nmaxPerStageDescriptorInlineUniformBlocks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORINLINEUNIFORMBLOCKS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINLINEUNIFORMBLOCKS);
    }

    public static int nmaxDescriptorSetInlineUniformBlocks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETINLINEUNIFORMBLOCKS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDINLINEUNIFORMBLOCKS);
    }

    public static int nmaxInlineUniformTotalSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINLINEUNIFORMTOTALSIZE);
    }

    public static int nintegerDotProduct8BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct8BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT8BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct8BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProduct4x8BitPackedUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct4x8BitPackedSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProduct16BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct16BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT16BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct16BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProduct32BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct32BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT32BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct32BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProduct64BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct64BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT64BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProduct64BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED);
    }

    public static int nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(long struct) {
        return MemoryUtil.memGetInt(struct + INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED);
    }

    public static long nstorageTexelBufferOffsetAlignmentBytes(long struct) {
        return MemoryUtil.memGetLong(struct + STORAGETEXELBUFFEROFFSETALIGNMENTBYTES);
    }

    public static int nstorageTexelBufferOffsetSingleTexelAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGETEXELBUFFEROFFSETSINGLETEXELALIGNMENT);
    }

    public static long nuniformTexelBufferOffsetAlignmentBytes(long struct) {
        return MemoryUtil.memGetLong(struct + UNIFORMTEXELBUFFEROFFSETALIGNMENTBYTES);
    }

    public static int nuniformTexelBufferOffsetSingleTexelAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMTEXELBUFFEROFFSETSINGLETEXELALIGNMENT);
    }

    public static long nmaxBufferSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXBUFFERSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Properties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan13Properties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan13Properties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan13Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan13Properties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan13Properties.SIZEOF);
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
        public VkPhysicalDeviceVulkan13Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan13Properties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan13Properties.npNext(address());
        }

        @NativeType("uint32_t")
        public int minSubgroupSize() {
            return VkPhysicalDeviceVulkan13Properties.nminSubgroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxSubgroupSize() {
            return VkPhysicalDeviceVulkan13Properties.nmaxSubgroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxComputeWorkgroupSubgroups() {
            return VkPhysicalDeviceVulkan13Properties.nmaxComputeWorkgroupSubgroups(address());
        }

        @NativeType("VkShaderStageFlags")
        public int requiredSubgroupSizeStages() {
            return VkPhysicalDeviceVulkan13Properties.nrequiredSubgroupSizeStages(address());
        }

        @NativeType("uint32_t")
        public int maxInlineUniformBlockSize() {
            return VkPhysicalDeviceVulkan13Properties.nmaxInlineUniformBlockSize(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorInlineUniformBlocks() {
            return VkPhysicalDeviceVulkan13Properties.nmaxPerStageDescriptorInlineUniformBlocks(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {
            return VkPhysicalDeviceVulkan13Properties.nmaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetInlineUniformBlocks() {
            return VkPhysicalDeviceVulkan13Properties.nmaxDescriptorSetInlineUniformBlocks(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {
            return VkPhysicalDeviceVulkan13Properties.nmaxDescriptorSetUpdateAfterBindInlineUniformBlocks(address());
        }

        @NativeType("uint32_t")
        public int maxInlineUniformTotalSize() {
            return VkPhysicalDeviceVulkan13Properties.nmaxInlineUniformTotalSize(address());
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceVulkan13Properties.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkDeviceSize")
        public long storageTexelBufferOffsetAlignmentBytes() {
            return VkPhysicalDeviceVulkan13Properties.nstorageTexelBufferOffsetAlignmentBytes(address());
        }

        @NativeType("VkBool32")
        public boolean storageTexelBufferOffsetSingleTexelAlignment() {
            return VkPhysicalDeviceVulkan13Properties.nstorageTexelBufferOffsetSingleTexelAlignment(address()) != 0;
        }

        @NativeType("VkDeviceSize")
        public long uniformTexelBufferOffsetAlignmentBytes() {
            return VkPhysicalDeviceVulkan13Properties.nuniformTexelBufferOffsetAlignmentBytes(address());
        }

        @NativeType("VkBool32")
        public boolean uniformTexelBufferOffsetSingleTexelAlignment() {
            return VkPhysicalDeviceVulkan13Properties.nuniformTexelBufferOffsetSingleTexelAlignment(address()) != 0;
        }

        @NativeType("VkDeviceSize")
        public long maxBufferSize() {
            return VkPhysicalDeviceVulkan13Properties.nmaxBufferSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan13Properties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(54);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan13Properties.npNext(address(), value);
            return this;
        }
    }
}
