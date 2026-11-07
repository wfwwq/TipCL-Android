package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentIdKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentIdKHR.class */
public class VkPresentIdKHR extends Struct<VkPresentIdKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PPRESENTIDS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PPRESENTIDS = layout.offsetof(3);
    }

    protected VkPresentIdKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentIdKHR create(long address, ByteBuffer container) {
        return new VkPresentIdKHR(address, container);
    }

    public VkPresentIdKHR(ByteBuffer container) {
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
    public int swapchainCount() {
        return nswapchainCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pPresentIds() {
        return npPresentIds(address());
    }

    public VkPresentIdKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentIdKHR sType$Default() {
        return sType(KHRPresentId.VK_STRUCTURE_TYPE_PRESENT_ID_KHR);
    }

    public VkPresentIdKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentIdKHR swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    public VkPresentIdKHR pPresentIds(@NativeType("uint64_t const *") LongBuffer value) {
        npPresentIds(address(), value);
        return this;
    }

    public VkPresentIdKHR set(int sType, long pNext, int swapchainCount, LongBuffer pPresentIds) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pPresentIds(pPresentIds);
        return this;
    }

    public VkPresentIdKHR set(VkPresentIdKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentIdKHR malloc() {
        return new VkPresentIdKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentIdKHR calloc() {
        return new VkPresentIdKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentIdKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentIdKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentIdKHR create(long address) {
        return new VkPresentIdKHR(address, null);
    }

    public static VkPresentIdKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentIdKHR(address, null);
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

    public static VkPresentIdKHR malloc(MemoryStack stack) {
        return new VkPresentIdKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentIdKHR calloc(MemoryStack stack) {
        return new VkPresentIdKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nswapchainCount(long struct) {
        return MemoryUtil.memGetInt(struct + SWAPCHAINCOUNT);
    }

    public static LongBuffer npPresentIds(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PPRESENTIDS), nswapchainCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nswapchainCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SWAPCHAINCOUNT, value);
    }

    public static void npPresentIds(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PPRESENTIDS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nswapchainCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentIdKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentIdKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentIdKHR, Buffer> implements NativeResource {
        private static final VkPresentIdKHR ELEMENT_FACTORY = VkPresentIdKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentIdKHR.SIZEOF);
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
        public VkPresentIdKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentIdKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPresentIdKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkPresentIdKHR.nswapchainCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pPresentIds() {
            return VkPresentIdKHR.npPresentIds(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentIdKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPresentId.VK_STRUCTURE_TYPE_PRESENT_ID_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPresentIdKHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkPresentIdKHR.nswapchainCount(address(), value);
            return this;
        }

        public Buffer pPresentIds(@NativeType("uint64_t const *") LongBuffer value) {
            VkPresentIdKHR.npPresentIds(address(), value);
            return this;
        }
    }
}
