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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties.class */
public class VkPhysicalDeviceShaderIntegerDotProductProperties extends Struct<VkPhysicalDeviceShaderIntegerDotProductProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
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

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTEGERDOTPRODUCT8BITUNSIGNEDACCELERATED = layout.offsetof(2);
        INTEGERDOTPRODUCT8BITSIGNEDACCELERATED = layout.offsetof(3);
        INTEGERDOTPRODUCT8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(4);
        INTEGERDOTPRODUCT4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(5);
        INTEGERDOTPRODUCT4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(6);
        INTEGERDOTPRODUCT4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(7);
        INTEGERDOTPRODUCT16BITUNSIGNEDACCELERATED = layout.offsetof(8);
        INTEGERDOTPRODUCT16BITSIGNEDACCELERATED = layout.offsetof(9);
        INTEGERDOTPRODUCT16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(10);
        INTEGERDOTPRODUCT32BITUNSIGNEDACCELERATED = layout.offsetof(11);
        INTEGERDOTPRODUCT32BITSIGNEDACCELERATED = layout.offsetof(12);
        INTEGERDOTPRODUCT32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(13);
        INTEGERDOTPRODUCT64BITUNSIGNEDACCELERATED = layout.offsetof(14);
        INTEGERDOTPRODUCT64BITSIGNEDACCELERATED = layout.offsetof(15);
        INTEGERDOTPRODUCT64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(16);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITUNSIGNEDACCELERATED = layout.offsetof(17);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITSIGNEDACCELERATED = layout.offsetof(18);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING8BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(19);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDUNSIGNEDACCELERATED = layout.offsetof(20);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDSIGNEDACCELERATED = layout.offsetof(21);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING4X8BITPACKEDMIXEDSIGNEDNESSACCELERATED = layout.offsetof(22);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITUNSIGNEDACCELERATED = layout.offsetof(23);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITSIGNEDACCELERATED = layout.offsetof(24);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING16BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(25);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITUNSIGNEDACCELERATED = layout.offsetof(26);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITSIGNEDACCELERATED = layout.offsetof(27);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING32BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(28);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITUNSIGNEDACCELERATED = layout.offsetof(29);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITSIGNEDACCELERATED = layout.offsetof(30);
        INTEGERDOTPRODUCTACCUMULATINGSATURATING64BITMIXEDSIGNEDNESSACCELERATED = layout.offsetof(31);
    }

    protected VkPhysicalDeviceShaderIntegerDotProductProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderIntegerDotProductProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(address, container);
    }

    public VkPhysicalDeviceShaderIntegerDotProductProperties(ByteBuffer container) {
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

    public VkPhysicalDeviceShaderIntegerDotProductProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductProperties sType$Default() {
        return sType(1000280001);
    }

    public VkPhysicalDeviceShaderIntegerDotProductProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductProperties set(VkPhysicalDeviceShaderIntegerDotProductProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties malloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties calloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties create(long address) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(address, null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(address, null);
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

    public static VkPhysicalDeviceShaderIntegerDotProductProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerDotProductProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderIntegerDotProductProperties ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderIntegerDotProductProperties.SIZEOF);
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
        public VkPhysicalDeviceShaderIntegerDotProductProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct8BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct8BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct8BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct8BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct4x8BitPackedMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct16BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct16BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct16BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct16BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct32BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct32BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct32BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct32BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct64BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct64BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProduct64BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProduct64BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitUnsignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitSignedAccelerated(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
            return VkPhysicalDeviceShaderIntegerDotProductProperties.nintegerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderIntegerDotProductProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000280001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderIntegerDotProductProperties.npNext(address(), value);
            return this;
        }
    }
}
