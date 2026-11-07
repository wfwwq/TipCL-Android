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
import org.lwjgl.vulkan.VkCoarseSampleOrderCustomNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.class */
public class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends Struct<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLEORDERTYPE;
    public static final int CUSTOMSAMPLEORDERCOUNT;
    public static final int PCUSTOMSAMPLEORDERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLEORDERTYPE = layout.offsetof(2);
        CUSTOMSAMPLEORDERCOUNT = layout.offsetof(3);
        PCUSTOMSAMPLEORDERS = layout.offsetof(4);
    }

    protected VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, container);
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkCoarseSampleOrderTypeNV")
    public int sampleOrderType() {
        return nsampleOrderType(address());
    }

    @NativeType("uint32_t")
    public int customSampleOrderCount() {
        return ncustomSampleOrderCount(address());
    }

    @NativeType("VkCoarseSampleOrderCustomNV const *")
    public VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders() {
        return npCustomSampleOrders(address());
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType$Default() {
        return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV);
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderType(@NativeType("VkCoarseSampleOrderTypeNV") int value) {
        nsampleOrderType(address(), value);
        return this;
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrders(@NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.Buffer value) {
        npCustomSampleOrders(address(), value);
        return this;
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(int sType, long pNext, int sampleOrderType, VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders) {
        sType(sType);
        pNext(pNext);
        sampleOrderType(sampleOrderType);
        pCustomSampleOrders(pCustomSampleOrders);
        return this;
    }

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV set(VkPipelineViewportCoarseSampleOrderStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV malloc() {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV calloc() {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV create(long address) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, null);
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(address, null);
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

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsampleOrderType(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLEORDERTYPE);
    }

    public static int ncustomSampleOrderCount(long struct) {
        return MemoryUtil.memGetInt(struct + CUSTOMSAMPLEORDERCOUNT);
    }

    public static VkCoarseSampleOrderCustomNV.Buffer npCustomSampleOrders(long struct) {
        return VkCoarseSampleOrderCustomNV.createSafe(MemoryUtil.memGetAddress(struct + PCUSTOMSAMPLEORDERS), ncustomSampleOrderCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsampleOrderType(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLEORDERTYPE, value);
    }

    public static void ncustomSampleOrderCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CUSTOMSAMPLEORDERCOUNT, value);
    }

    public static void npCustomSampleOrders(long struct, VkCoarseSampleOrderCustomNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCUSTOMSAMPLEORDERS, MemoryUtil.memAddressSafe(value));
        ncustomSampleOrderCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int customSampleOrderCount = ncustomSampleOrderCount(struct);
        if (customSampleOrderCount != 0) {
            long pCustomSampleOrders = MemoryUtil.memGetAddress(struct + PCUSTOMSAMPLEORDERS);
            Checks.check(pCustomSampleOrders);
            validate(pCustomSampleOrders, customSampleOrderCount, VkCoarseSampleOrderCustomNV.SIZEOF, VkCoarseSampleOrderCustomNV::validate);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportCoarseSampleOrderStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportCoarseSampleOrderStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportCoarseSampleOrderStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.SIZEOF);
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
        public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkCoarseSampleOrderTypeNV")
        public int sampleOrderType() {
            return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsampleOrderType(address());
        }

        @NativeType("uint32_t")
        public int customSampleOrderCount() {
            return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.ncustomSampleOrderCount(address());
        }

        @NativeType("VkCoarseSampleOrderCustomNV const *")
        public VkCoarseSampleOrderCustomNV.Buffer pCustomSampleOrders() {
            return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npCustomSampleOrders(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer sampleOrderType(@NativeType("VkCoarseSampleOrderTypeNV") int value) {
            VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.nsampleOrderType(address(), value);
            return this;
        }

        public Buffer pCustomSampleOrders(@NativeType("VkCoarseSampleOrderCustomNV const *") VkCoarseSampleOrderCustomNV.Buffer value) {
            VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.npCustomSampleOrders(address(), value);
            return this;
        }
    }
}
