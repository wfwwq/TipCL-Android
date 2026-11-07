package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageAlignmentControlCreateInfoMESA.class */
public class VkImageAlignmentControlCreateInfoMESA extends Struct<VkImageAlignmentControlCreateInfoMESA> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXIMUMREQUESTEDALIGNMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXIMUMREQUESTEDALIGNMENT = layout.offsetof(2);
    }

    protected VkImageAlignmentControlCreateInfoMESA(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageAlignmentControlCreateInfoMESA create(long address, ByteBuffer container) {
        return new VkImageAlignmentControlCreateInfoMESA(address, container);
    }

    public VkImageAlignmentControlCreateInfoMESA(ByteBuffer container) {
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
    public int maximumRequestedAlignment() {
        return nmaximumRequestedAlignment(address());
    }

    public VkImageAlignmentControlCreateInfoMESA sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageAlignmentControlCreateInfoMESA sType$Default() {
        return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA);
    }

    public VkImageAlignmentControlCreateInfoMESA pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageAlignmentControlCreateInfoMESA maximumRequestedAlignment(@NativeType("uint32_t") int value) {
        nmaximumRequestedAlignment(address(), value);
        return this;
    }

    public VkImageAlignmentControlCreateInfoMESA set(int sType, long pNext, int maximumRequestedAlignment) {
        sType(sType);
        pNext(pNext);
        maximumRequestedAlignment(maximumRequestedAlignment);
        return this;
    }

    public VkImageAlignmentControlCreateInfoMESA set(VkImageAlignmentControlCreateInfoMESA src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageAlignmentControlCreateInfoMESA malloc() {
        return new VkImageAlignmentControlCreateInfoMESA(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageAlignmentControlCreateInfoMESA calloc() {
        return new VkImageAlignmentControlCreateInfoMESA(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageAlignmentControlCreateInfoMESA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageAlignmentControlCreateInfoMESA(MemoryUtil.memAddress(container), container);
    }

    public static VkImageAlignmentControlCreateInfoMESA create(long address) {
        return new VkImageAlignmentControlCreateInfoMESA(address, null);
    }

    public static VkImageAlignmentControlCreateInfoMESA createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageAlignmentControlCreateInfoMESA(address, null);
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

    public static VkImageAlignmentControlCreateInfoMESA malloc(MemoryStack stack) {
        return new VkImageAlignmentControlCreateInfoMESA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageAlignmentControlCreateInfoMESA calloc(MemoryStack stack) {
        return new VkImageAlignmentControlCreateInfoMESA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaximumRequestedAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMUMREQUESTEDALIGNMENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaximumRequestedAlignment(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXIMUMREQUESTEDALIGNMENT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageAlignmentControlCreateInfoMESA$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageAlignmentControlCreateInfoMESA, Buffer> implements NativeResource {
        private static final VkImageAlignmentControlCreateInfoMESA ELEMENT_FACTORY = VkImageAlignmentControlCreateInfoMESA.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageAlignmentControlCreateInfoMESA.SIZEOF);
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
        public VkImageAlignmentControlCreateInfoMESA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageAlignmentControlCreateInfoMESA.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageAlignmentControlCreateInfoMESA.npNext(address());
        }

        @NativeType("uint32_t")
        public int maximumRequestedAlignment() {
            return VkImageAlignmentControlCreateInfoMESA.nmaximumRequestedAlignment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageAlignmentControlCreateInfoMESA.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageAlignmentControlCreateInfoMESA.npNext(address(), value);
            return this;
        }

        public Buffer maximumRequestedAlignment(@NativeType("uint32_t") int value) {
            VkImageAlignmentControlCreateInfoMESA.nmaximumRequestedAlignment(address(), value);
            return this;
        }
    }
}
