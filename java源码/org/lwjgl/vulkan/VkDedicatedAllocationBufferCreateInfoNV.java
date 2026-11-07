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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationBufferCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationBufferCreateInfoNV.class */
public class VkDedicatedAllocationBufferCreateInfoNV extends Struct<VkDedicatedAllocationBufferCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEDICATEDALLOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEDICATEDALLOCATION = layout.offsetof(2);
    }

    protected VkDedicatedAllocationBufferCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDedicatedAllocationBufferCreateInfoNV create(long address, ByteBuffer container) {
        return new VkDedicatedAllocationBufferCreateInfoNV(address, container);
    }

    public VkDedicatedAllocationBufferCreateInfoNV(ByteBuffer container) {
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
    public boolean dedicatedAllocation() {
        return ndedicatedAllocation(address()) != 0;
    }

    public VkDedicatedAllocationBufferCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDedicatedAllocationBufferCreateInfoNV sType$Default() {
        return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV);
    }

    public VkDedicatedAllocationBufferCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDedicatedAllocationBufferCreateInfoNV dedicatedAllocation(@NativeType("VkBool32") boolean value) {
        ndedicatedAllocation(address(), value ? 1 : 0);
        return this;
    }

    public VkDedicatedAllocationBufferCreateInfoNV set(int sType, long pNext, boolean dedicatedAllocation) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocation(dedicatedAllocation);
        return this;
    }

    public VkDedicatedAllocationBufferCreateInfoNV set(VkDedicatedAllocationBufferCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDedicatedAllocationBufferCreateInfoNV malloc() {
        return new VkDedicatedAllocationBufferCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDedicatedAllocationBufferCreateInfoNV calloc() {
        return new VkDedicatedAllocationBufferCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDedicatedAllocationBufferCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDedicatedAllocationBufferCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkDedicatedAllocationBufferCreateInfoNV create(long address) {
        return new VkDedicatedAllocationBufferCreateInfoNV(address, null);
    }

    public static VkDedicatedAllocationBufferCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDedicatedAllocationBufferCreateInfoNV(address, null);
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

    public static VkDedicatedAllocationBufferCreateInfoNV malloc(MemoryStack stack) {
        return new VkDedicatedAllocationBufferCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDedicatedAllocationBufferCreateInfoNV calloc(MemoryStack stack) {
        return new VkDedicatedAllocationBufferCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndedicatedAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + DEDICATEDALLOCATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndedicatedAllocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEDICATEDALLOCATION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationBufferCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationBufferCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkDedicatedAllocationBufferCreateInfoNV, Buffer> implements NativeResource {
        private static final VkDedicatedAllocationBufferCreateInfoNV ELEMENT_FACTORY = VkDedicatedAllocationBufferCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDedicatedAllocationBufferCreateInfoNV.SIZEOF);
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
        public VkDedicatedAllocationBufferCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDedicatedAllocationBufferCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDedicatedAllocationBufferCreateInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean dedicatedAllocation() {
            return VkDedicatedAllocationBufferCreateInfoNV.ndedicatedAllocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDedicatedAllocationBufferCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDedicatedAllocationBufferCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer dedicatedAllocation(@NativeType("VkBool32") boolean value) {
            VkDedicatedAllocationBufferCreateInfoNV.ndedicatedAllocation(address(), value ? 1 : 0);
            return this;
        }
    }
}
