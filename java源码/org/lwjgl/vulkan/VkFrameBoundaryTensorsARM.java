package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFrameBoundaryTensorsARM.class */
public class VkFrameBoundaryTensorsARM extends Struct<VkFrameBoundaryTensorsARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSORCOUNT;
    public static final int PTENSORS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORCOUNT = layout.offsetof(2);
        PTENSORS = layout.offsetof(3);
    }

    protected VkFrameBoundaryTensorsARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFrameBoundaryTensorsARM create(long address, ByteBuffer container) {
        return new VkFrameBoundaryTensorsARM(address, container);
    }

    public VkFrameBoundaryTensorsARM(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int tensorCount() {
        return ntensorCount(address());
    }

    @NativeType("VkTensorARM const *")
    public LongBuffer pTensors() {
        return npTensors(address());
    }

    public VkFrameBoundaryTensorsARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFrameBoundaryTensorsARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM);
    }

    public VkFrameBoundaryTensorsARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFrameBoundaryTensorsARM pTensors(@NativeType("VkTensorARM const *") LongBuffer value) {
        npTensors(address(), value);
        return this;
    }

    public VkFrameBoundaryTensorsARM set(int sType, long pNext, LongBuffer pTensors) {
        sType(sType);
        pNext(pNext);
        pTensors(pTensors);
        return this;
    }

    public VkFrameBoundaryTensorsARM set(VkFrameBoundaryTensorsARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFrameBoundaryTensorsARM malloc() {
        return new VkFrameBoundaryTensorsARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFrameBoundaryTensorsARM calloc() {
        return new VkFrameBoundaryTensorsARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFrameBoundaryTensorsARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFrameBoundaryTensorsARM(MemoryUtil.memAddress(container), container);
    }

    public static VkFrameBoundaryTensorsARM create(long address) {
        return new VkFrameBoundaryTensorsARM(address, null);
    }

    public static VkFrameBoundaryTensorsARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFrameBoundaryTensorsARM(address, null);
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

    public static VkFrameBoundaryTensorsARM malloc(MemoryStack stack) {
        return new VkFrameBoundaryTensorsARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFrameBoundaryTensorsARM calloc(MemoryStack stack) {
        return new VkFrameBoundaryTensorsARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntensorCount(long struct) {
        return MemoryUtil.memGetInt(struct + TENSORCOUNT);
    }

    public static LongBuffer npTensors(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PTENSORS), ntensorCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntensorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TENSORCOUNT, value);
    }

    public static void npTensors(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PTENSORS, MemoryUtil.memAddress(value));
        ntensorCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PTENSORS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFrameBoundaryTensorsARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkFrameBoundaryTensorsARM, Buffer> implements NativeResource {
        private static final VkFrameBoundaryTensorsARM ELEMENT_FACTORY = VkFrameBoundaryTensorsARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFrameBoundaryTensorsARM.SIZEOF);
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
        public VkFrameBoundaryTensorsARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFrameBoundaryTensorsARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkFrameBoundaryTensorsARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int tensorCount() {
            return VkFrameBoundaryTensorsARM.ntensorCount(address());
        }

        @NativeType("VkTensorARM const *")
        public LongBuffer pTensors() {
            return VkFrameBoundaryTensorsARM.npTensors(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFrameBoundaryTensorsARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkFrameBoundaryTensorsARM.npNext(address(), value);
            return this;
        }

        public Buffer pTensors(@NativeType("VkTensorARM const *") LongBuffer value) {
            VkFrameBoundaryTensorsARM.npTensors(address(), value);
            return this;
        }
    }
}
