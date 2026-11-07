package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryTensorCreateInfoARM.class */
public class VkExternalMemoryTensorCreateInfoARM extends Struct<VkExternalMemoryTensorCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HANDLETYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPES = layout.offsetof(2);
    }

    protected VkExternalMemoryTensorCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalMemoryTensorCreateInfoARM create(long address, ByteBuffer container) {
        return new VkExternalMemoryTensorCreateInfoARM(address, container);
    }

    public VkExternalMemoryTensorCreateInfoARM(ByteBuffer container) {
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

    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int handleTypes() {
        return nhandleTypes(address());
    }

    public VkExternalMemoryTensorCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalMemoryTensorCreateInfoARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM);
    }

    public VkExternalMemoryTensorCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalMemoryTensorCreateInfoARM handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    public VkExternalMemoryTensorCreateInfoARM set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExternalMemoryTensorCreateInfoARM set(VkExternalMemoryTensorCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalMemoryTensorCreateInfoARM malloc() {
        return new VkExternalMemoryTensorCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalMemoryTensorCreateInfoARM calloc() {
        return new VkExternalMemoryTensorCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalMemoryTensorCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryTensorCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalMemoryTensorCreateInfoARM create(long address) {
        return new VkExternalMemoryTensorCreateInfoARM(address, null);
    }

    public static VkExternalMemoryTensorCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalMemoryTensorCreateInfoARM(address, null);
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

    public static VkExternalMemoryTensorCreateInfoARM malloc(MemoryStack stack) {
        return new VkExternalMemoryTensorCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalMemoryTensorCreateInfoARM calloc(MemoryStack stack) {
        return new VkExternalMemoryTensorCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nhandleTypes(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryTensorCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalMemoryTensorCreateInfoARM, Buffer> implements NativeResource {
        private static final VkExternalMemoryTensorCreateInfoARM ELEMENT_FACTORY = VkExternalMemoryTensorCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalMemoryTensorCreateInfoARM.SIZEOF);
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
        public VkExternalMemoryTensorCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalMemoryTensorCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExternalMemoryTensorCreateInfoARM.npNext(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int handleTypes() {
            return VkExternalMemoryTensorCreateInfoARM.nhandleTypes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalMemoryTensorCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalMemoryTensorCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) {
            VkExternalMemoryTensorCreateInfoARM.nhandleTypes(address(), value);
            return this;
        }
    }
}
