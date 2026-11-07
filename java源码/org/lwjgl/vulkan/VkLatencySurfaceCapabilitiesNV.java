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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySurfaceCapabilitiesNV.class */
public class VkLatencySurfaceCapabilitiesNV extends Struct<VkLatencySurfaceCapabilitiesNV> implements NativeResource {
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

    protected VkLatencySurfaceCapabilitiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLatencySurfaceCapabilitiesNV create(long address, ByteBuffer container) {
        return new VkLatencySurfaceCapabilitiesNV(address, container);
    }

    public VkLatencySurfaceCapabilitiesNV(ByteBuffer container) {
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

    @NativeType("VkPresentModeKHR *")
    public IntBuffer pPresentModes() {
        return npPresentModes(address());
    }

    public VkLatencySurfaceCapabilitiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkLatencySurfaceCapabilitiesNV sType$Default() {
        return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV);
    }

    public VkLatencySurfaceCapabilitiesNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkLatencySurfaceCapabilitiesNV presentModeCount(@NativeType("uint32_t") int value) {
        npresentModeCount(address(), value);
        return this;
    }

    public VkLatencySurfaceCapabilitiesNV pPresentModes(@NativeType("VkPresentModeKHR *") IntBuffer value) {
        npPresentModes(address(), value);
        return this;
    }

    public VkLatencySurfaceCapabilitiesNV set(int sType, long pNext, int presentModeCount, IntBuffer pPresentModes) {
        sType(sType);
        pNext(pNext);
        presentModeCount(presentModeCount);
        pPresentModes(pPresentModes);
        return this;
    }

    public VkLatencySurfaceCapabilitiesNV set(VkLatencySurfaceCapabilitiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkLatencySurfaceCapabilitiesNV malloc() {
        return new VkLatencySurfaceCapabilitiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLatencySurfaceCapabilitiesNV calloc() {
        return new VkLatencySurfaceCapabilitiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLatencySurfaceCapabilitiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySurfaceCapabilitiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkLatencySurfaceCapabilitiesNV create(long address) {
        return new VkLatencySurfaceCapabilitiesNV(address, null);
    }

    public static VkLatencySurfaceCapabilitiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLatencySurfaceCapabilitiesNV(address, null);
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

    public static VkLatencySurfaceCapabilitiesNV malloc(MemoryStack stack) {
        return new VkLatencySurfaceCapabilitiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLatencySurfaceCapabilitiesNV calloc(MemoryStack stack) {
        return new VkLatencySurfaceCapabilitiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLatencySurfaceCapabilitiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkLatencySurfaceCapabilitiesNV, Buffer> implements NativeResource {
        private static final VkLatencySurfaceCapabilitiesNV ELEMENT_FACTORY = VkLatencySurfaceCapabilitiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLatencySurfaceCapabilitiesNV.SIZEOF);
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
        public VkLatencySurfaceCapabilitiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkLatencySurfaceCapabilitiesNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkLatencySurfaceCapabilitiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int presentModeCount() {
            return VkLatencySurfaceCapabilitiesNV.npresentModeCount(address());
        }

        @NativeType("VkPresentModeKHR *")
        public IntBuffer pPresentModes() {
            return VkLatencySurfaceCapabilitiesNV.npPresentModes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkLatencySurfaceCapabilitiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkLatencySurfaceCapabilitiesNV.npNext(address(), value);
            return this;
        }

        public Buffer presentModeCount(@NativeType("uint32_t") int value) {
            VkLatencySurfaceCapabilitiesNV.npresentModeCount(address(), value);
            return this;
        }

        public Buffer pPresentModes(@NativeType("VkPresentModeKHR *") IntBuffer value) {
            VkLatencySurfaceCapabilitiesNV.npPresentModes(address(), value);
            return this;
        }
    }
}
