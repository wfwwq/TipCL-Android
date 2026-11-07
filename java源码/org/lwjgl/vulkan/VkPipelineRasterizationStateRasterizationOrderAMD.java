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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateRasterizationOrderAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateRasterizationOrderAMD.class */
public class VkPipelineRasterizationStateRasterizationOrderAMD extends Struct<VkPipelineRasterizationStateRasterizationOrderAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RASTERIZATIONORDER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RASTERIZATIONORDER = layout.offsetof(2);
    }

    protected VkPipelineRasterizationStateRasterizationOrderAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRasterizationStateRasterizationOrderAMD create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(address, container);
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD(ByteBuffer container) {
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

    @NativeType("VkRasterizationOrderAMD")
    public int rasterizationOrder() {
        return nrasterizationOrder(address());
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD sType$Default() {
        return sType(AMDRasterizationOrder.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD);
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrder(@NativeType("VkRasterizationOrderAMD") int value) {
        nrasterizationOrder(address(), value);
        return this;
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD set(int sType, long pNext, int rasterizationOrder) {
        sType(sType);
        pNext(pNext);
        rasterizationOrder(rasterizationOrder);
        return this;
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD set(VkPipelineRasterizationStateRasterizationOrderAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD malloc() {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD calloc() {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationStateRasterizationOrderAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD create(long address) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(address, null);
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationStateRasterizationOrderAMD(address, null);
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

    public static VkPipelineRasterizationStateRasterizationOrderAMD malloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD calloc(MemoryStack stack) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrasterizationOrder(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONORDER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrasterizationOrder(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONORDER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateRasterizationOrderAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateRasterizationOrderAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationStateRasterizationOrderAMD, Buffer> implements NativeResource {
        private static final VkPipelineRasterizationStateRasterizationOrderAMD ELEMENT_FACTORY = VkPipelineRasterizationStateRasterizationOrderAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRasterizationStateRasterizationOrderAMD.SIZEOF);
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
        public VkPipelineRasterizationStateRasterizationOrderAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRasterizationStateRasterizationOrderAMD.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRasterizationStateRasterizationOrderAMD.npNext(address());
        }

        @NativeType("VkRasterizationOrderAMD")
        public int rasterizationOrder() {
            return VkPipelineRasterizationStateRasterizationOrderAMD.nrasterizationOrder(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationStateRasterizationOrderAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDRasterizationOrder.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationStateRasterizationOrderAMD.npNext(address(), value);
            return this;
        }

        public Buffer rasterizationOrder(@NativeType("VkRasterizationOrderAMD") int value) {
            VkPipelineRasterizationStateRasterizationOrderAMD.nrasterizationOrder(address(), value);
            return this;
        }
    }
}
