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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationImageCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationImageCreateInfoNV.class */
public class VkDedicatedAllocationImageCreateInfoNV extends Struct<VkDedicatedAllocationImageCreateInfoNV> implements NativeResource {
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

    protected VkDedicatedAllocationImageCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDedicatedAllocationImageCreateInfoNV create(long address, ByteBuffer container) {
        return new VkDedicatedAllocationImageCreateInfoNV(address, container);
    }

    public VkDedicatedAllocationImageCreateInfoNV(ByteBuffer container) {
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

    public VkDedicatedAllocationImageCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDedicatedAllocationImageCreateInfoNV sType$Default() {
        return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV);
    }

    public VkDedicatedAllocationImageCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDedicatedAllocationImageCreateInfoNV dedicatedAllocation(@NativeType("VkBool32") boolean value) {
        ndedicatedAllocation(address(), value ? 1 : 0);
        return this;
    }

    public VkDedicatedAllocationImageCreateInfoNV set(int sType, long pNext, boolean dedicatedAllocation) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocation(dedicatedAllocation);
        return this;
    }

    public VkDedicatedAllocationImageCreateInfoNV set(VkDedicatedAllocationImageCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDedicatedAllocationImageCreateInfoNV malloc() {
        return new VkDedicatedAllocationImageCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDedicatedAllocationImageCreateInfoNV calloc() {
        return new VkDedicatedAllocationImageCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDedicatedAllocationImageCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDedicatedAllocationImageCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkDedicatedAllocationImageCreateInfoNV create(long address) {
        return new VkDedicatedAllocationImageCreateInfoNV(address, null);
    }

    public static VkDedicatedAllocationImageCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDedicatedAllocationImageCreateInfoNV(address, null);
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

    public static VkDedicatedAllocationImageCreateInfoNV malloc(MemoryStack stack) {
        return new VkDedicatedAllocationImageCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDedicatedAllocationImageCreateInfoNV calloc(MemoryStack stack) {
        return new VkDedicatedAllocationImageCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationImageCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDedicatedAllocationImageCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkDedicatedAllocationImageCreateInfoNV, Buffer> implements NativeResource {
        private static final VkDedicatedAllocationImageCreateInfoNV ELEMENT_FACTORY = VkDedicatedAllocationImageCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDedicatedAllocationImageCreateInfoNV.SIZEOF);
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
        public VkDedicatedAllocationImageCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDedicatedAllocationImageCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDedicatedAllocationImageCreateInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean dedicatedAllocation() {
            return VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDedicatedAllocationImageCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDedicatedAllocationImageCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer dedicatedAllocation(@NativeType("VkBool32") boolean value) {
            VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address(), value ? 1 : 0);
            return this;
        }
    }
}
