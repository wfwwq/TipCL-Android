package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateStateCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateStateCreateInfoKHR.class */
public class VkPipelineFragmentShadingRateStateCreateInfoKHR extends Struct<VkPipelineFragmentShadingRateStateCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAGMENTSIZE;
    public static final int COMBINEROPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __array(4, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTSIZE = layout.offsetof(2);
        COMBINEROPS = layout.offsetof(3);
    }

    protected VkPipelineFragmentShadingRateStateCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineFragmentShadingRateStateCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(address, container);
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR(ByteBuffer container) {
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

    public VkExtent2D fragmentSize() {
        return nfragmentSize(address());
    }

    @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
    public IntBuffer combinerOps() {
        return ncombinerOps(address());
    }

    @NativeType("VkFragmentShadingRateCombinerOpKHR")
    public int combinerOps(int index) {
        return ncombinerOps(address(), index);
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR sType$Default() {
        return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize(VkExtent2D value) {
        nfragmentSize(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize(Consumer<VkExtent2D> consumer) {
        consumer.accept(fragmentSize());
        return this;
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) {
        ncombinerOps(address(), value);
        return this;
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) {
        ncombinerOps(address(), index, value);
        return this;
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR set(int sType, long pNext, VkExtent2D fragmentSize, IntBuffer combinerOps) {
        sType(sType);
        pNext(pNext);
        fragmentSize(fragmentSize);
        combinerOps(combinerOps);
        return this;
    }

    public VkPipelineFragmentShadingRateStateCreateInfoKHR set(VkPipelineFragmentShadingRateStateCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR malloc() {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR calloc() {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR create(long address) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(address, null);
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(address, null);
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

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineFragmentShadingRateStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nfragmentSize(long struct) {
        return VkExtent2D.create(struct + FRAGMENTSIZE);
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

    public static void nfragmentSize(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + FRAGMENTSIZE, VkExtent2D.SIZEOF);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateStateCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineFragmentShadingRateStateCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineFragmentShadingRateStateCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkPipelineFragmentShadingRateStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineFragmentShadingRateStateCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineFragmentShadingRateStateCreateInfoKHR.SIZEOF);
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
        public VkPipelineFragmentShadingRateStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineFragmentShadingRateStateCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineFragmentShadingRateStateCreateInfoKHR.npNext(address());
        }

        public VkExtent2D fragmentSize() {
            return VkPipelineFragmentShadingRateStateCreateInfoKHR.nfragmentSize(address());
        }

        @NativeType("VkFragmentShadingRateCombinerOpKHR[2]")
        public IntBuffer combinerOps() {
            return VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address());
        }

        @NativeType("VkFragmentShadingRateCombinerOpKHR")
        public int combinerOps(int index) {
            return VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineFragmentShadingRateStateCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineFragmentShadingRateStateCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer fragmentSize(VkExtent2D value) {
            VkPipelineFragmentShadingRateStateCreateInfoKHR.nfragmentSize(address(), value);
            return this;
        }

        public Buffer fragmentSize(Consumer<VkExtent2D> consumer) {
            consumer.accept(fragmentSize());
            return this;
        }

        public Buffer combinerOps(@NativeType("VkFragmentShadingRateCombinerOpKHR[2]") IntBuffer value) {
            VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address(), value);
            return this;
        }

        public Buffer combinerOps(int index, @NativeType("VkFragmentShadingRateCombinerOpKHR") int value) {
            VkPipelineFragmentShadingRateStateCreateInfoKHR.ncombinerOps(address(), index, value);
            return this;
        }
    }
}
