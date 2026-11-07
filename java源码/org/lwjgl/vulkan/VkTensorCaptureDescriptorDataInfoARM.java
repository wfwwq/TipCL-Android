package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorCaptureDescriptorDataInfoARM.class */
public class VkTensorCaptureDescriptorDataInfoARM extends Struct<VkTensorCaptureDescriptorDataInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSOR = layout.offsetof(2);
    }

    protected VkTensorCaptureDescriptorDataInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorCaptureDescriptorDataInfoARM create(long address, ByteBuffer container) {
        return new VkTensorCaptureDescriptorDataInfoARM(address, container);
    }

    public VkTensorCaptureDescriptorDataInfoARM(ByteBuffer container) {
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

    @NativeType("VkTensorARM")
    public long tensor() {
        return ntensor(address());
    }

    public VkTensorCaptureDescriptorDataInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorCaptureDescriptorDataInfoARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM);
    }

    public VkTensorCaptureDescriptorDataInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorCaptureDescriptorDataInfoARM tensor(@NativeType("VkTensorARM") long value) {
        ntensor(address(), value);
        return this;
    }

    public VkTensorCaptureDescriptorDataInfoARM set(int sType, long pNext, long tensor) {
        sType(sType);
        pNext(pNext);
        tensor(tensor);
        return this;
    }

    public VkTensorCaptureDescriptorDataInfoARM set(VkTensorCaptureDescriptorDataInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorCaptureDescriptorDataInfoARM malloc() {
        return new VkTensorCaptureDescriptorDataInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorCaptureDescriptorDataInfoARM calloc() {
        return new VkTensorCaptureDescriptorDataInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorCaptureDescriptorDataInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorCaptureDescriptorDataInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorCaptureDescriptorDataInfoARM create(long address) {
        return new VkTensorCaptureDescriptorDataInfoARM(address, null);
    }

    public static VkTensorCaptureDescriptorDataInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorCaptureDescriptorDataInfoARM(address, null);
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

    public static VkTensorCaptureDescriptorDataInfoARM malloc(MemoryStack stack) {
        return new VkTensorCaptureDescriptorDataInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorCaptureDescriptorDataInfoARM calloc(MemoryStack stack) {
        return new VkTensorCaptureDescriptorDataInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ntensor(long struct) {
        return MemoryUtil.memGetLong(struct + TENSOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntensor(long struct, long value) {
        MemoryUtil.memPutLong(struct + TENSOR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorCaptureDescriptorDataInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorCaptureDescriptorDataInfoARM, Buffer> implements NativeResource {
        private static final VkTensorCaptureDescriptorDataInfoARM ELEMENT_FACTORY = VkTensorCaptureDescriptorDataInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorCaptureDescriptorDataInfoARM.SIZEOF);
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
        public VkTensorCaptureDescriptorDataInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorCaptureDescriptorDataInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorCaptureDescriptorDataInfoARM.npNext(address());
        }

        @NativeType("VkTensorARM")
        public long tensor() {
            return VkTensorCaptureDescriptorDataInfoARM.ntensor(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorCaptureDescriptorDataInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorCaptureDescriptorDataInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer tensor(@NativeType("VkTensorARM") long value) {
            VkTensorCaptureDescriptorDataInfoARM.ntensor(address(), value);
            return this;
        }
    }
}
