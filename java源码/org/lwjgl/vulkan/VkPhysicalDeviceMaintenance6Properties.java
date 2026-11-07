package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance6Properties.class */
public class VkPhysicalDeviceMaintenance6Properties extends Struct<VkPhysicalDeviceMaintenance6Properties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS;
    public static final int MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT;
    public static final int FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS = layout.offsetof(2);
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(3);
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceMaintenance6Properties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance6Properties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance6Properties(address, container);
    }

    public VkPhysicalDeviceMaintenance6Properties(ByteBuffer container) {
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
    public boolean blockTexelViewCompatibleMultipleLayers() {
        return nblockTexelViewCompatibleMultipleLayers(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxCombinedImageSamplerDescriptorCount() {
        return nmaxCombinedImageSamplerDescriptorCount(address());
    }

    @NativeType("VkBool32")
    public boolean fragmentShadingRateClampCombinerInputs() {
        return nfragmentShadingRateClampCombinerInputs(address()) != 0;
    }

    public VkPhysicalDeviceMaintenance6Properties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance6Properties sType$Default() {
        return sType(1000545001);
    }

    public VkPhysicalDeviceMaintenance6Properties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance6Properties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMaintenance6Properties set(VkPhysicalDeviceMaintenance6Properties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance6Properties malloc() {
        return new VkPhysicalDeviceMaintenance6Properties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance6Properties calloc() {
        return new VkPhysicalDeviceMaintenance6Properties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance6Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance6Properties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance6Properties create(long address) {
        return new VkPhysicalDeviceMaintenance6Properties(address, null);
    }

    public static VkPhysicalDeviceMaintenance6Properties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance6Properties(address, null);
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

    public static VkPhysicalDeviceMaintenance6Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance6Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nblockTexelViewCompatibleMultipleLayers(long struct) {
        return MemoryUtil.memGetInt(struct + BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS);
    }

    public static int nmaxCombinedImageSamplerDescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT);
    }

    public static int nfragmentShadingRateClampCombinerInputs(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance6Properties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance6Properties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMaintenance6Properties ELEMENT_FACTORY = VkPhysicalDeviceMaintenance6Properties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMaintenance6Properties.SIZEOF);
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
        public VkPhysicalDeviceMaintenance6Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMaintenance6Properties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMaintenance6Properties.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean blockTexelViewCompatibleMultipleLayers() {
            return VkPhysicalDeviceMaintenance6Properties.nblockTexelViewCompatibleMultipleLayers(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxCombinedImageSamplerDescriptorCount() {
            return VkPhysicalDeviceMaintenance6Properties.nmaxCombinedImageSamplerDescriptorCount(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateClampCombinerInputs() {
            return VkPhysicalDeviceMaintenance6Properties.nfragmentShadingRateClampCombinerInputs(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance6Properties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000545001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance6Properties.npNext(address(), value);
            return this;
        }
    }
}
