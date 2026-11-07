package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainLatencyCreateInfoNV.class */
public class VkSwapchainLatencyCreateInfoNV extends Struct<VkSwapchainLatencyCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LATENCYMODEENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LATENCYMODEENABLE = layout.offsetof(2);
    }

    protected VkSwapchainLatencyCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainLatencyCreateInfoNV create(long address, ByteBuffer container) {
        return new VkSwapchainLatencyCreateInfoNV(address, container);
    }

    public VkSwapchainLatencyCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean latencyModeEnable() {
        return nlatencyModeEnable(address()) != 0;
    }

    public VkSwapchainLatencyCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainLatencyCreateInfoNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV);
    }

    public VkSwapchainLatencyCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainLatencyCreateInfoNV latencyModeEnable(@NativeType("VkBool32") boolean value) {
        nlatencyModeEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkSwapchainLatencyCreateInfoNV set(int sType, long pNext, boolean latencyModeEnable) {
        sType(sType);
        pNext(pNext);
        latencyModeEnable(latencyModeEnable);
        return this;
    }

    public VkSwapchainLatencyCreateInfoNV set(VkSwapchainLatencyCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainLatencyCreateInfoNV malloc() {
        return new VkSwapchainLatencyCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainLatencyCreateInfoNV calloc() {
        return new VkSwapchainLatencyCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainLatencyCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainLatencyCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainLatencyCreateInfoNV create(long address) {
        return new VkSwapchainLatencyCreateInfoNV(address, null);
    }

    public static VkSwapchainLatencyCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainLatencyCreateInfoNV(address, null);
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

    public static VkSwapchainLatencyCreateInfoNV malloc(MemoryStack stack) {
        return new VkSwapchainLatencyCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainLatencyCreateInfoNV calloc(MemoryStack stack) {
        return new VkSwapchainLatencyCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlatencyModeEnable(long struct) {
        return MemoryUtil.memGetInt(struct + LATENCYMODEENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlatencyModeEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + LATENCYMODEENABLE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainLatencyCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainLatencyCreateInfoNV, Buffer> implements NativeResource {
        private static final VkSwapchainLatencyCreateInfoNV ELEMENT_FACTORY = VkSwapchainLatencyCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainLatencyCreateInfoNV.SIZEOF);
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
        public VkSwapchainLatencyCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainLatencyCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainLatencyCreateInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean latencyModeEnable() {
            return VkSwapchainLatencyCreateInfoNV.nlatencyModeEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainLatencyCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainLatencyCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer latencyModeEnable(@NativeType("VkBool32") boolean value) {
            VkSwapchainLatencyCreateInfoNV.nlatencyModeEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
