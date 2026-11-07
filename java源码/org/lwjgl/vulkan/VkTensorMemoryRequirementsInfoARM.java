package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorMemoryRequirementsInfoARM.class */
public class VkTensorMemoryRequirementsInfoARM extends Struct<VkTensorMemoryRequirementsInfoARM> implements NativeResource {
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

    protected VkTensorMemoryRequirementsInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorMemoryRequirementsInfoARM create(long address, ByteBuffer container) {
        return new VkTensorMemoryRequirementsInfoARM(address, container);
    }

    public VkTensorMemoryRequirementsInfoARM(ByteBuffer container) {
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

    public VkTensorMemoryRequirementsInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorMemoryRequirementsInfoARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM);
    }

    public VkTensorMemoryRequirementsInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorMemoryRequirementsInfoARM tensor(@NativeType("VkTensorARM") long value) {
        ntensor(address(), value);
        return this;
    }

    public VkTensorMemoryRequirementsInfoARM set(int sType, long pNext, long tensor) {
        sType(sType);
        pNext(pNext);
        tensor(tensor);
        return this;
    }

    public VkTensorMemoryRequirementsInfoARM set(VkTensorMemoryRequirementsInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorMemoryRequirementsInfoARM malloc() {
        return new VkTensorMemoryRequirementsInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorMemoryRequirementsInfoARM calloc() {
        return new VkTensorMemoryRequirementsInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorMemoryRequirementsInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorMemoryRequirementsInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorMemoryRequirementsInfoARM create(long address) {
        return new VkTensorMemoryRequirementsInfoARM(address, null);
    }

    public static VkTensorMemoryRequirementsInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorMemoryRequirementsInfoARM(address, null);
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

    public static VkTensorMemoryRequirementsInfoARM malloc(MemoryStack stack) {
        return new VkTensorMemoryRequirementsInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorMemoryRequirementsInfoARM calloc(MemoryStack stack) {
        return new VkTensorMemoryRequirementsInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorMemoryRequirementsInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorMemoryRequirementsInfoARM, Buffer> implements NativeResource {
        private static final VkTensorMemoryRequirementsInfoARM ELEMENT_FACTORY = VkTensorMemoryRequirementsInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorMemoryRequirementsInfoARM.SIZEOF);
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
        public VkTensorMemoryRequirementsInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorMemoryRequirementsInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorMemoryRequirementsInfoARM.npNext(address());
        }

        @NativeType("VkTensorARM")
        public long tensor() {
            return VkTensorMemoryRequirementsInfoARM.ntensor(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorMemoryRequirementsInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorMemoryRequirementsInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer tensor(@NativeType("VkTensorARM") long value) {
            VkTensorMemoryRequirementsInfoARM.ntensor(address(), value);
            return this;
        }
    }
}
