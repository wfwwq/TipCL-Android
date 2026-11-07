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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationMemoryAllocateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationMemoryAllocateInfoNV.class */
public class VkDedicatedAllocationMemoryAllocateInfoNV extends Struct<VkDedicatedAllocationMemoryAllocateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE;
    public static final int BUFFER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
    }

    protected VkDedicatedAllocationMemoryAllocateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDedicatedAllocationMemoryAllocateInfoNV create(long address, ByteBuffer container) {
        return new VkDedicatedAllocationMemoryAllocateInfoNV(address, container);
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV(ByteBuffer container) {
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

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV sType$Default() {
        return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV);
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV set(int sType, long pNext, long image, long buffer) {
        sType(sType);
        pNext(pNext);
        image(image);
        buffer(buffer);
        return this;
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV set(VkDedicatedAllocationMemoryAllocateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDedicatedAllocationMemoryAllocateInfoNV malloc() {
        return new VkDedicatedAllocationMemoryAllocateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDedicatedAllocationMemoryAllocateInfoNV calloc() {
        return new VkDedicatedAllocationMemoryAllocateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDedicatedAllocationMemoryAllocateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDedicatedAllocationMemoryAllocateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkDedicatedAllocationMemoryAllocateInfoNV create(long address) {
        return new VkDedicatedAllocationMemoryAllocateInfoNV(address, null);
    }

    public static VkDedicatedAllocationMemoryAllocateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDedicatedAllocationMemoryAllocateInfoNV(address, null);
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

    public static VkDedicatedAllocationMemoryAllocateInfoNV malloc(MemoryStack stack) {
        return new VkDedicatedAllocationMemoryAllocateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDedicatedAllocationMemoryAllocateInfoNV calloc(MemoryStack stack) {
        return new VkDedicatedAllocationMemoryAllocateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
    }

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationMemoryAllocateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationMemoryAllocateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkDedicatedAllocationMemoryAllocateInfoNV, Buffer> implements NativeResource {
        private static final VkDedicatedAllocationMemoryAllocateInfoNV ELEMENT_FACTORY = VkDedicatedAllocationMemoryAllocateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDedicatedAllocationMemoryAllocateInfoNV.SIZEOF);
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
        public VkDedicatedAllocationMemoryAllocateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDedicatedAllocationMemoryAllocateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDedicatedAllocationMemoryAllocateInfoNV.npNext(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkDedicatedAllocationMemoryAllocateInfoNV.nimage(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkDedicatedAllocationMemoryAllocateInfoNV.nbuffer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDedicatedAllocationMemoryAllocateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDedicatedAllocationMemoryAllocateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkDedicatedAllocationMemoryAllocateInfoNV.nimage(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkDedicatedAllocationMemoryAllocateInfoNV.nbuffer(address(), value);
            return this;
        }
    }
}
