package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.class */
public class VkPipelineFragmentShadingRateEnumStateCreateInfoNV extends Struct<VkPipelineFragmentShadingRateEnumStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADINGRATETYPE;
    public static final int SHADINGRATE;
    public static final int COMBINEROPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __array(4, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATETYPE = layout.offsetof(2);
        SHADINGRATE = layout.offsetof(3);
        COMBINEROPS = layout.offsetof(4);
    }

    protected VkPipelineFragmentShadingRateEnumStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(address, container);
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkFragmentShadingRateTypeNV")
    public int shadingRateType() {
        return nshadingRateType(address());
    }

    @NativeType("VkFragmentShadingRateNV")
    public int shadingRate() {
        return nshadingRate(address());
    }

    @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
    public IntBuffer combinerOps() {
        return ncombinerOps(address());
    }

    @NativeType("VkFragmentShadingRateCombinerOpKHR")
    public int combinerOps(int index) {
        return ncombinerOps(address(), index);
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV sType$Default() {
        return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRateType(@NativeType("VkFragmentShadingRateTypeNV") int value) {
        nshadingRateType(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV shadingRate(@NativeType("VkFragmentShadingRateNV") int value) {
        nshadingRate(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) {
        ncombinerOps(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) {
        ncombinerOps(address(), index, value);
        return this;
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(int sType, long pNext, int shadingRateType, int shadingRate, IntBuffer combinerOps) {
        sType(sType);
        pNext(pNext);
        shadingRateType(shadingRateType);
        shadingRate(shadingRate);
        combinerOps(combinerOps);
        return this;
    }

    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV set(VkPipelineFragmentShadingRateEnumStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV malloc() {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV calloc() {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV create(long address) {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(address, null);
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(address, null);
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

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshadingRateType(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATETYPE);
    }

    public static int nshadingRate(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATE);
    }

    public static IntBuffer ncombinerOps(long struct) {
        return MemoryUtil.memIntBuffer(struct + COMBINEROPS, 2);
    }

    public static int ncombinerOps(long struct, int index) {
        return MemoryUtil.memGetInt(struct + COMBINEROPS + (Checks.check(index, 2) * 4));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshadingRateType(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADINGRATETYPE, value);
    }

    public static void nshadingRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADINGRATE, value);
    }

    public static void ncombinerOps(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + COMBINEROPS, value.remaining() * 4);
    }

    public static void ncombinerOps(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + COMBINEROPS + (Checks.check(index, 2) * 4), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateEnumStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineFragmentShadingRateEnumStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineFragmentShadingRateEnumStateCreateInfoNV ELEMENT_FACTORY = VkPipelineFragmentShadingRateEnumStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineFragmentShadingRateEnumStateCreateInfoNV.SIZEOF);
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
        public VkPipelineFragmentShadingRateEnumStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkFragmentShadingRateTypeNV")
        public int shadingRateType() {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRateType(address());
        }

        @NativeType("VkFragmentShadingRateNV")
        public int shadingRate() {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRate(address());
        }

        @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
        public IntBuffer combinerOps() {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address());
        }

        @NativeType("VkFragmentShadingRateCombinerOpKHR")
        public int combinerOps(int index) {
            return VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineFragmentShadingRateEnumStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer shadingRateType(@NativeType("VkFragmentShadingRateTypeNV") int value) {
            VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRateType(address(), value);
            return this;
        }

        public Buffer shadingRate(@NativeType("VkFragmentShadingRateNV") int value) {
            VkPipelineFragmentShadingRateEnumStateCreateInfoNV.nshadingRate(address(), value);
            return this;
        }

        public Buffer combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) {
            VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address(), value);
            return this;
        }

        public Buffer combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) {
            VkPipelineFragmentShadingRateEnumStateCreateInfoNV.ncombinerOps(address(), index, value);
            return this;
        }
    }
}
