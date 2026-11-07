package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesPresentWait2KHR.class */
public class VkSurfaceCapabilitiesPresentWait2KHR extends Struct<VkSurfaceCapabilitiesPresentWait2KHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTWAIT2SUPPORTED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTWAIT2SUPPORTED = layout.offsetof(2);
    }

    protected VkSurfaceCapabilitiesPresentWait2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfaceCapabilitiesPresentWait2KHR create(long address, ByteBuffer container) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(address, container);
    }

    public VkSurfaceCapabilitiesPresentWait2KHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean presentWait2Supported() {
        return npresentWait2Supported(address()) != 0;
    }

    public VkSurfaceCapabilitiesPresentWait2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSurfaceCapabilitiesPresentWait2KHR sType$Default() {
        return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR);
    }

    public VkSurfaceCapabilitiesPresentWait2KHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSurfaceCapabilitiesPresentWait2KHR presentWait2Supported(@NativeType("VkBool32") boolean value) {
        npresentWait2Supported(address(), value ? 1 : 0);
        return this;
    }

    public VkSurfaceCapabilitiesPresentWait2KHR set(int sType, long pNext, boolean presentWait2Supported) {
        sType(sType);
        pNext(pNext);
        presentWait2Supported(presentWait2Supported);
        return this;
    }

    public VkSurfaceCapabilitiesPresentWait2KHR set(VkSurfaceCapabilitiesPresentWait2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfaceCapabilitiesPresentWait2KHR malloc() {
        return new VkSurfaceCapabilitiesPresentWait2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesPresentWait2KHR calloc() {
        return new VkSurfaceCapabilitiesPresentWait2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesPresentWait2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilitiesPresentWait2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfaceCapabilitiesPresentWait2KHR create(long address) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(address, null);
    }

    public static VkSurfaceCapabilitiesPresentWait2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfaceCapabilitiesPresentWait2KHR(address, null);
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

    public static VkSurfaceCapabilitiesPresentWait2KHR malloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesPresentWait2KHR calloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentWait2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentWait2Supported(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTWAIT2SUPPORTED);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentWait2Supported(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTWAIT2SUPPORTED, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesPresentWait2KHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesPresentWait2KHR, Buffer> implements NativeResource {
        private static final VkSurfaceCapabilitiesPresentWait2KHR ELEMENT_FACTORY = VkSurfaceCapabilitiesPresentWait2KHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfaceCapabilitiesPresentWait2KHR.SIZEOF);
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
        public VkSurfaceCapabilitiesPresentWait2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSurfaceCapabilitiesPresentWait2KHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSurfaceCapabilitiesPresentWait2KHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentWait2Supported() {
            return VkSurfaceCapabilitiesPresentWait2KHR.npresentWait2Supported(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfaceCapabilitiesPresentWait2KHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfaceCapabilitiesPresentWait2KHR.npNext(address(), value);
            return this;
        }

        public Buffer presentWait2Supported(@NativeType("VkBool32") boolean value) {
            VkSurfaceCapabilitiesPresentWait2KHR.npresentWait2Supported(address(), value ? 1 : 0);
            return this;
        }
    }
}
