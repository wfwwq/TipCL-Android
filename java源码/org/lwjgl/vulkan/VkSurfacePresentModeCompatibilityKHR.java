package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeCompatibilityKHR.class */
public class VkSurfacePresentModeCompatibilityKHR extends Struct<VkSurfacePresentModeCompatibilityKHR> implements NativeResource {
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

    protected VkSurfacePresentModeCompatibilityKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfacePresentModeCompatibilityKHR create(long address, ByteBuffer container) {
        return new VkSurfacePresentModeCompatibilityKHR(address, container);
    }

    public VkSurfacePresentModeCompatibilityKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int presentModeCount() {
        return npresentModeCount(address());
    }

    @NativeType("VkPresentModeKHR *")
    public IntBuffer pPresentModes() {
        return npPresentModes(address());
    }

    public VkSurfacePresentModeCompatibilityKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSurfacePresentModeCompatibilityKHR sType$Default() {
        return sType(1000274002);
    }

    public VkSurfacePresentModeCompatibilityKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSurfacePresentModeCompatibilityKHR presentModeCount(@NativeType("uint32_t") int value) {
        npresentModeCount(address(), value);
        return this;
    }

    public VkSurfacePresentModeCompatibilityKHR pPresentModes(@NativeType("VkPresentModeKHR *") IntBuffer value) {
        npPresentModes(address(), value);
        return this;
    }

    public VkSurfacePresentModeCompatibilityKHR set(int sType, long pNext, int presentModeCount, IntBuffer pPresentModes) {
        sType(sType);
        pNext(pNext);
        presentModeCount(presentModeCount);
        pPresentModes(pPresentModes);
        return this;
    }

    public VkSurfacePresentModeCompatibilityKHR set(VkSurfacePresentModeCompatibilityKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfacePresentModeCompatibilityKHR malloc() {
        return new VkSurfacePresentModeCompatibilityKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfacePresentModeCompatibilityKHR calloc() {
        return new VkSurfacePresentModeCompatibilityKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfacePresentModeCompatibilityKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeCompatibilityKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfacePresentModeCompatibilityKHR create(long address) {
        return new VkSurfacePresentModeCompatibilityKHR(address, null);
    }

    public static VkSurfacePresentModeCompatibilityKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfacePresentModeCompatibilityKHR(address, null);
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

    public static VkSurfacePresentModeCompatibilityKHR malloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfacePresentModeCompatibilityKHR calloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PPRESENTMODES), npresentModeCount(struct));
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
        MemoryUtil.memPutAddress(struct + PPRESENTMODES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            npresentModeCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeCompatibilityKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfacePresentModeCompatibilityKHR, Buffer> implements NativeResource {
        private static final VkSurfacePresentModeCompatibilityKHR ELEMENT_FACTORY = VkSurfacePresentModeCompatibilityKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfacePresentModeCompatibilityKHR.SIZEOF);
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
        public VkSurfacePresentModeCompatibilityKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSurfacePresentModeCompatibilityKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSurfacePresentModeCompatibilityKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int presentModeCount() {
            return VkSurfacePresentModeCompatibilityKHR.npresentModeCount(address());
        }

        @NativeType("VkPresentModeKHR *")
        public IntBuffer pPresentModes() {
            return VkSurfacePresentModeCompatibilityKHR.npPresentModes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfacePresentModeCompatibilityKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000274002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfacePresentModeCompatibilityKHR.npNext(address(), value);
            return this;
        }

        public Buffer presentModeCount(@NativeType("uint32_t") int value) {
            VkSurfacePresentModeCompatibilityKHR.npresentModeCount(address(), value);
            return this;
        }

        public Buffer pPresentModes(@NativeType("VkPresentModeKHR *") IntBuffer value) {
            VkSurfacePresentModeCompatibilityKHR.npPresentModes(address(), value);
            return this;
        }
    }
}
