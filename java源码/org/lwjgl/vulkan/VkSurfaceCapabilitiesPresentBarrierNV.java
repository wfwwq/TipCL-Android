package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesPresentBarrierNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesPresentBarrierNV.class */
public class VkSurfaceCapabilitiesPresentBarrierNV extends Struct<VkSurfaceCapabilitiesPresentBarrierNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTBARRIERSUPPORTED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTBARRIERSUPPORTED = layout.offsetof(2);
    }

    protected VkSurfaceCapabilitiesPresentBarrierNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfaceCapabilitiesPresentBarrierNV create(long address, ByteBuffer container) {
        return new VkSurfaceCapabilitiesPresentBarrierNV(address, container);
    }

    public VkSurfaceCapabilitiesPresentBarrierNV(ByteBuffer container) {
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
    public boolean presentBarrierSupported() {
        return npresentBarrierSupported(address()) != 0;
    }

    public VkSurfaceCapabilitiesPresentBarrierNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSurfaceCapabilitiesPresentBarrierNV sType$Default() {
        return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV);
    }

    public VkSurfaceCapabilitiesPresentBarrierNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSurfaceCapabilitiesPresentBarrierNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSurfaceCapabilitiesPresentBarrierNV set(VkSurfaceCapabilitiesPresentBarrierNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfaceCapabilitiesPresentBarrierNV malloc() {
        return new VkSurfaceCapabilitiesPresentBarrierNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesPresentBarrierNV calloc() {
        return new VkSurfaceCapabilitiesPresentBarrierNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesPresentBarrierNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilitiesPresentBarrierNV(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfaceCapabilitiesPresentBarrierNV create(long address) {
        return new VkSurfaceCapabilitiesPresentBarrierNV(address, null);
    }

    public static VkSurfaceCapabilitiesPresentBarrierNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfaceCapabilitiesPresentBarrierNV(address, null);
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

    public static VkSurfaceCapabilitiesPresentBarrierNV malloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentBarrierNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesPresentBarrierNV calloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesPresentBarrierNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentBarrierSupported(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTBARRIERSUPPORTED);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesPresentBarrierNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesPresentBarrierNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesPresentBarrierNV, Buffer> implements NativeResource {
        private static final VkSurfaceCapabilitiesPresentBarrierNV ELEMENT_FACTORY = VkSurfaceCapabilitiesPresentBarrierNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfaceCapabilitiesPresentBarrierNV.SIZEOF);
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
        public VkSurfaceCapabilitiesPresentBarrierNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSurfaceCapabilitiesPresentBarrierNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSurfaceCapabilitiesPresentBarrierNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentBarrierSupported() {
            return VkSurfaceCapabilitiesPresentBarrierNV.npresentBarrierSupported(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfaceCapabilitiesPresentBarrierNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfaceCapabilitiesPresentBarrierNV.npNext(address(), value);
            return this;
        }
    }
}
