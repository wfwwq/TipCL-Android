package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkResolveImageModeInfoKHR.class */
public class VkResolveImageModeInfoKHR extends Struct<VkResolveImageModeInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int RESOLVEMODE;
    public static final int STENCILRESOLVEMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RESOLVEMODE = layout.offsetof(3);
        STENCILRESOLVEMODE = layout.offsetof(4);
    }

    protected VkResolveImageModeInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkResolveImageModeInfoKHR create(long address, ByteBuffer container) {
        return new VkResolveImageModeInfoKHR(address, container);
    }

    public VkResolveImageModeInfoKHR(ByteBuffer container) {
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

    @NativeType("VkResolveImageFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkResolveModeFlagBits")
    public int resolveMode() {
        return nresolveMode(address());
    }

    @NativeType("VkResolveModeFlagBits")
    public int stencilResolveMode() {
        return nstencilResolveMode(address());
    }

    public VkResolveImageModeInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkResolveImageModeInfoKHR sType$Default() {
        return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR);
    }

    public VkResolveImageModeInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkResolveImageModeInfoKHR flags(@NativeType("VkResolveImageFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkResolveImageModeInfoKHR resolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        nresolveMode(address(), value);
        return this;
    }

    public VkResolveImageModeInfoKHR stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        nstencilResolveMode(address(), value);
        return this;
    }

    public VkResolveImageModeInfoKHR set(int sType, long pNext, int flags, int resolveMode, int stencilResolveMode) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        resolveMode(resolveMode);
        stencilResolveMode(stencilResolveMode);
        return this;
    }

    public VkResolveImageModeInfoKHR set(VkResolveImageModeInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkResolveImageModeInfoKHR malloc() {
        return new VkResolveImageModeInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkResolveImageModeInfoKHR calloc() {
        return new VkResolveImageModeInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkResolveImageModeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkResolveImageModeInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkResolveImageModeInfoKHR create(long address) {
        return new VkResolveImageModeInfoKHR(address, null);
    }

    public static VkResolveImageModeInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkResolveImageModeInfoKHR(address, null);
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

    public static VkResolveImageModeInfoKHR malloc(MemoryStack stack) {
        return new VkResolveImageModeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkResolveImageModeInfoKHR calloc(MemoryStack stack) {
        return new VkResolveImageModeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nresolveMode(long struct) {
        return MemoryUtil.memGetInt(struct + RESOLVEMODE);
    }

    public static int nstencilResolveMode(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILRESOLVEMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nresolveMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOLVEMODE, value);
    }

    public static void nstencilResolveMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILRESOLVEMODE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkResolveImageModeInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkResolveImageModeInfoKHR, Buffer> implements NativeResource {
        private static final VkResolveImageModeInfoKHR ELEMENT_FACTORY = VkResolveImageModeInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkResolveImageModeInfoKHR.SIZEOF);
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
        public VkResolveImageModeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkResolveImageModeInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkResolveImageModeInfoKHR.npNext(address());
        }

        @NativeType("VkResolveImageFlagsKHR")
        public int flags() {
            return VkResolveImageModeInfoKHR.nflags(address());
        }

        @NativeType("VkResolveModeFlagBits")
        public int resolveMode() {
            return VkResolveImageModeInfoKHR.nresolveMode(address());
        }

        @NativeType("VkResolveModeFlagBits")
        public int stencilResolveMode() {
            return VkResolveImageModeInfoKHR.nstencilResolveMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkResolveImageModeInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkResolveImageModeInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkResolveImageFlagsKHR") int value) {
            VkResolveImageModeInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer resolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkResolveImageModeInfoKHR.nresolveMode(address(), value);
            return this;
        }

        public Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkResolveImageModeInfoKHR.nstencilResolveMode(address(), value);
            return this;
        }
    }
}
