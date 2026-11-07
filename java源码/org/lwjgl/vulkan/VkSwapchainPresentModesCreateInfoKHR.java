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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModesCreateInfoKHR.class */
public class VkSwapchainPresentModesCreateInfoKHR extends Struct<VkSwapchainPresentModesCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTMODECOUNT;
    public static final int PPRESENTMODES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMODECOUNT = layout.offsetof(2);
        PPRESENTMODES = layout.offsetof(3);
    }

    protected VkSwapchainPresentModesCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainPresentModesCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkSwapchainPresentModesCreateInfoKHR(address, container);
    }

    public VkSwapchainPresentModesCreateInfoKHR(ByteBuffer container) {
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
    public int presentModeCount() {
        return npresentModeCount(address());
    }

    @NativeType("VkPresentModeKHR const *")
    public IntBuffer pPresentModes() {
        return npPresentModes(address());
    }

    public VkSwapchainPresentModesCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainPresentModesCreateInfoKHR sType$Default() {
        return sType(1000275002);
    }

    public VkSwapchainPresentModesCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainPresentModesCreateInfoKHR pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
        npPresentModes(address(), value);
        return this;
    }

    public VkSwapchainPresentModesCreateInfoKHR set(int sType, long pNext, IntBuffer pPresentModes) {
        sType(sType);
        pNext(pNext);
        pPresentModes(pPresentModes);
        return this;
    }

    public VkSwapchainPresentModesCreateInfoKHR set(VkSwapchainPresentModesCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentModesCreateInfoKHR malloc() {
        return new VkSwapchainPresentModesCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentModesCreateInfoKHR calloc() {
        return new VkSwapchainPresentModesCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentModesCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentModesCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentModesCreateInfoKHR create(long address) {
        return new VkSwapchainPresentModesCreateInfoKHR(address, null);
    }

    public static VkSwapchainPresentModesCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentModesCreateInfoKHR(address, null);
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

    public static VkSwapchainPresentModesCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainPresentModesCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentModesCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainPresentModesCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentModeCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTMODECOUNT);
    }

    public static IntBuffer npPresentModes(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PPRESENTMODES), npresentModeCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentModeCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTMODECOUNT, value);
    }

    public static void npPresentModes(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PPRESENTMODES, MemoryUtil.memAddress(value));
        npresentModeCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PPRESENTMODES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentModesCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainPresentModesCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkSwapchainPresentModesCreateInfoKHR ELEMENT_FACTORY = VkSwapchainPresentModesCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainPresentModesCreateInfoKHR.SIZEOF);
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
        public VkSwapchainPresentModesCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainPresentModesCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainPresentModesCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int presentModeCount() {
            return VkSwapchainPresentModesCreateInfoKHR.npresentModeCount(address());
        }

        @NativeType("VkPresentModeKHR const *")
        public IntBuffer pPresentModes() {
            return VkSwapchainPresentModesCreateInfoKHR.npPresentModes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentModesCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000275002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentModesCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) {
            VkSwapchainPresentModesCreateInfoKHR.npPresentModes(address(), value);
            return this;
        }
    }
}
