package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrierAccessFlags3KHR.class */
public class VkMemoryBarrierAccessFlags3KHR extends Struct<VkMemoryBarrierAccessFlags3KHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCACCESSMASK3;
    public static final int DSTACCESSMASK3;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK3 = layout.offsetof(2);
        DSTACCESSMASK3 = layout.offsetof(3);
    }

    protected VkMemoryBarrierAccessFlags3KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryBarrierAccessFlags3KHR create(long address, ByteBuffer container) {
        return new VkMemoryBarrierAccessFlags3KHR(address, container);
    }

    public VkMemoryBarrierAccessFlags3KHR(ByteBuffer container) {
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

    @NativeType("VkAccessFlags3KHR")
    public long srcAccessMask3() {
        return nsrcAccessMask3(address());
    }

    @NativeType("VkAccessFlags3KHR")
    public long dstAccessMask3() {
        return ndstAccessMask3(address());
    }

    public VkMemoryBarrierAccessFlags3KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryBarrierAccessFlags3KHR sType$Default() {
        return sType(KHRMaintenance8.VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR);
    }

    public VkMemoryBarrierAccessFlags3KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryBarrierAccessFlags3KHR srcAccessMask3(@NativeType("VkAccessFlags3KHR") long value) {
        nsrcAccessMask3(address(), value);
        return this;
    }

    public VkMemoryBarrierAccessFlags3KHR dstAccessMask3(@NativeType("VkAccessFlags3KHR") long value) {
        ndstAccessMask3(address(), value);
        return this;
    }

    public VkMemoryBarrierAccessFlags3KHR set(int sType, long pNext, long srcAccessMask3, long dstAccessMask3) {
        sType(sType);
        pNext(pNext);
        srcAccessMask3(srcAccessMask3);
        dstAccessMask3(dstAccessMask3);
        return this;
    }

    public VkMemoryBarrierAccessFlags3KHR set(VkMemoryBarrierAccessFlags3KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryBarrierAccessFlags3KHR malloc() {
        return new VkMemoryBarrierAccessFlags3KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryBarrierAccessFlags3KHR calloc() {
        return new VkMemoryBarrierAccessFlags3KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryBarrierAccessFlags3KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryBarrierAccessFlags3KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryBarrierAccessFlags3KHR create(long address) {
        return new VkMemoryBarrierAccessFlags3KHR(address, null);
    }

    public static VkMemoryBarrierAccessFlags3KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryBarrierAccessFlags3KHR(address, null);
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

    public static VkMemoryBarrierAccessFlags3KHR malloc(MemoryStack stack) {
        return new VkMemoryBarrierAccessFlags3KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryBarrierAccessFlags3KHR calloc(MemoryStack stack) {
        return new VkMemoryBarrierAccessFlags3KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcAccessMask3(long struct) {
        return MemoryUtil.memGetLong(struct + SRCACCESSMASK3);
    }

    public static long ndstAccessMask3(long struct) {
        return MemoryUtil.memGetLong(struct + DSTACCESSMASK3);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcAccessMask3(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCACCESSMASK3, value);
    }

    public static void ndstAccessMask3(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTACCESSMASK3, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrierAccessFlags3KHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryBarrierAccessFlags3KHR, Buffer> implements NativeResource {
        private static final VkMemoryBarrierAccessFlags3KHR ELEMENT_FACTORY = VkMemoryBarrierAccessFlags3KHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryBarrierAccessFlags3KHR.SIZEOF);
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
        public VkMemoryBarrierAccessFlags3KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryBarrierAccessFlags3KHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryBarrierAccessFlags3KHR.npNext(address());
        }

        @NativeType("VkAccessFlags3KHR")
        public long srcAccessMask3() {
            return VkMemoryBarrierAccessFlags3KHR.nsrcAccessMask3(address());
        }

        @NativeType("VkAccessFlags3KHR")
        public long dstAccessMask3() {
            return VkMemoryBarrierAccessFlags3KHR.ndstAccessMask3(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryBarrierAccessFlags3KHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance8.VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryBarrierAccessFlags3KHR.npNext(address(), value);
            return this;
        }

        public Buffer srcAccessMask3(@NativeType("VkAccessFlags3KHR") long value) {
            VkMemoryBarrierAccessFlags3KHR.nsrcAccessMask3(address(), value);
            return this;
        }

        public Buffer dstAccessMask3(@NativeType("VkAccessFlags3KHR") long value) {
            VkMemoryBarrierAccessFlags3KHR.ndstAccessMask3(address(), value);
            return this;
        }
    }
}
