package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeKHR.class */
public class VkSurfacePresentModeKHR extends Struct<VkSurfacePresentModeKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMODE = layout.offsetof(2);
    }

    protected VkSurfacePresentModeKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfacePresentModeKHR create(long address, ByteBuffer container) {
        return new VkSurfacePresentModeKHR(address, container);
    }

    public VkSurfacePresentModeKHR(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPresentModeKHR")
    public int presentMode() {
        return npresentMode(address());
    }

    public VkSurfacePresentModeKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSurfacePresentModeKHR sType$Default() {
        return sType(1000274000);
    }

    public VkSurfacePresentModeKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSurfacePresentModeKHR presentMode(@NativeType("VkPresentModeKHR") int value) {
        npresentMode(address(), value);
        return this;
    }

    public VkSurfacePresentModeKHR set(int sType, long pNext, int presentMode) {
        sType(sType);
        pNext(pNext);
        presentMode(presentMode);
        return this;
    }

    public VkSurfacePresentModeKHR set(VkSurfacePresentModeKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfacePresentModeKHR malloc() {
        return new VkSurfacePresentModeKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfacePresentModeKHR calloc() {
        return new VkSurfacePresentModeKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfacePresentModeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfacePresentModeKHR create(long address) {
        return new VkSurfacePresentModeKHR(address, null);
    }

    public static VkSurfacePresentModeKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfacePresentModeKHR(address, null);
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

    public static VkSurfacePresentModeKHR malloc(MemoryStack stack) {
        return new VkSurfacePresentModeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfacePresentModeKHR calloc(MemoryStack stack) {
        return new VkSurfacePresentModeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentMode(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTMODE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfacePresentModeKHR, Buffer> implements NativeResource {
        private static final VkSurfacePresentModeKHR ELEMENT_FACTORY = VkSurfacePresentModeKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfacePresentModeKHR.SIZEOF);
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
        public VkSurfacePresentModeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSurfacePresentModeKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSurfacePresentModeKHR.npNext(address());
        }

        @NativeType("VkPresentModeKHR")
        public int presentMode() {
            return VkSurfacePresentModeKHR.npresentMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfacePresentModeKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000274000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfacePresentModeKHR.npNext(address(), value);
            return this;
        }

        public Buffer presentMode(@NativeType("VkPresentModeKHR") int value) {
            VkSurfacePresentModeKHR.npresentMode(address(), value);
            return this;
        }
    }
}
