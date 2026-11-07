package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentWait2InfoKHR.class */
public class VkPresentWait2InfoKHR extends Struct<VkPresentWait2InfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTID;
    public static final int TIMEOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
    }

    protected VkPresentWait2InfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentWait2InfoKHR create(long address, ByteBuffer container) {
        return new VkPresentWait2InfoKHR(address, container);
    }

    public VkPresentWait2InfoKHR(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long presentId() {
        return npresentId(address());
    }

    @NativeType("uint64_t")
    public long timeout() {
        return ntimeout(address());
    }

    public VkPresentWait2InfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentWait2InfoKHR sType$Default() {
        return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR);
    }

    public VkPresentWait2InfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentWait2InfoKHR presentId(@NativeType("uint64_t") long value) {
        npresentId(address(), value);
        return this;
    }

    public VkPresentWait2InfoKHR timeout(@NativeType("uint64_t") long value) {
        ntimeout(address(), value);
        return this;
    }

    public VkPresentWait2InfoKHR set(int sType, long pNext, long presentId, long timeout) {
        sType(sType);
        pNext(pNext);
        presentId(presentId);
        timeout(timeout);
        return this;
    }

    public VkPresentWait2InfoKHR set(VkPresentWait2InfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentWait2InfoKHR malloc() {
        return new VkPresentWait2InfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentWait2InfoKHR calloc() {
        return new VkPresentWait2InfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentWait2InfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentWait2InfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentWait2InfoKHR create(long address) {
        return new VkPresentWait2InfoKHR(address, null);
    }

    public static VkPresentWait2InfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentWait2InfoKHR(address, null);
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

    public static VkPresentWait2InfoKHR malloc(MemoryStack stack) {
        return new VkPresentWait2InfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentWait2InfoKHR calloc(MemoryStack stack) {
        return new VkPresentWait2InfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npresentId(long struct) {
        return MemoryUtil.memGetLong(struct + PRESENTID);
    }

    public static long ntimeout(long struct) {
        return MemoryUtil.memGetLong(struct + TIMEOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentId(long struct, long value) {
        MemoryUtil.memPutLong(struct + PRESENTID, value);
    }

    public static void ntimeout(long struct, long value) {
        MemoryUtil.memPutLong(struct + TIMEOUT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentWait2InfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentWait2InfoKHR, Buffer> implements NativeResource {
        private static final VkPresentWait2InfoKHR ELEMENT_FACTORY = VkPresentWait2InfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentWait2InfoKHR.SIZEOF);
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
        public VkPresentWait2InfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentWait2InfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPresentWait2InfoKHR.npNext(address());
        }

        @NativeType("uint64_t")
        public long presentId() {
            return VkPresentWait2InfoKHR.npresentId(address());
        }

        @NativeType("uint64_t")
        public long timeout() {
            return VkPresentWait2InfoKHR.ntimeout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentWait2InfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPresentWait2InfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer presentId(@NativeType("uint64_t") long value) {
            VkPresentWait2InfoKHR.npresentId(address(), value);
            return this;
        }

        public Buffer timeout(@NativeType("uint64_t") long value) {
            VkPresentWait2InfoKHR.ntimeout(address(), value);
            return this;
        }
    }
}
