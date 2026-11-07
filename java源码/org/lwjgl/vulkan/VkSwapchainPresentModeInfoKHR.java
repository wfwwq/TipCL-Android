package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModeInfoKHR.class */
public class VkSwapchainPresentModeInfoKHR extends Struct<VkSwapchainPresentModeInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PPRESENTMODES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PPRESENTMODES = layout.offsetof(3);
    }

    protected VkSwapchainPresentModeInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainPresentModeInfoKHR create(long address, ByteBuffer container) {
        return new VkSwapchainPresentModeInfoKHR(address, container);
    }

    public VkSwapchainPresentModeInfoKHR(ByteBuffer container) {
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

    @NativeType("VkPresentModeKHR const *")
    public IntBuffer pPresentModes() {
        return npPresentModes(address());
    }

    public VkSwapchainPresentModeInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainPresentModeInfoKHR sType$Default() {
        return sType(1000275003);
    }

    public VkSwapchainPresentModeInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainPresentModeInfoKHR pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
        npPresentModes(address(), value);
        return this;
    }

    public VkSwapchainPresentModeInfoKHR set(int sType, long pNext, IntBuffer pPresentModes) {
        sType(sType);
        pNext(pNext);
        pPresentModes(pPresentModes);
        return this;
    }

    public VkSwapchainPresentModeInfoKHR set(VkSwapchainPresentModeInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentModeInfoKHR malloc() {
        return new VkSwapchainPresentModeInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentModeInfoKHR calloc() {
        return new VkSwapchainPresentModeInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentModeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentModeInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentModeInfoKHR create(long address) {
        return new VkSwapchainPresentModeInfoKHR(address, null);
    }

    public static VkSwapchainPresentModeInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentModeInfoKHR(address, null);
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

    public static VkSwapchainPresentModeInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentModeInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static IntBuffer npPresentModes(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PPRESENTMODES), nswapchainCount(struct));
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

    public static void npPresentModes(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PPRESENTMODES, MemoryUtil.memAddress(value));
        nswapchainCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PPRESENTMODES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModeInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainPresentModeInfoKHR, Buffer> implements NativeResource {
        private static final VkSwapchainPresentModeInfoKHR ELEMENT_FACTORY = VkSwapchainPresentModeInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainPresentModeInfoKHR.SIZEOF);
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
        public VkSwapchainPresentModeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainPresentModeInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainPresentModeInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkSwapchainPresentModeInfoKHR.nswapchainCount(address());
        }

        @NativeType("VkPresentModeKHR const *")
        public IntBuffer pPresentModes() {
            return VkSwapchainPresentModeInfoKHR.npPresentModes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentModeInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000275003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentModeInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
            VkSwapchainPresentModeInfoKHR.npPresentModes(address(), value);
            return this;
        }
    }
}
