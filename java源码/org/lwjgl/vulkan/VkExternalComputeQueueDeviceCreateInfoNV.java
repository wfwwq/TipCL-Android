package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalComputeQueueDeviceCreateInfoNV.class */
public class VkExternalComputeQueueDeviceCreateInfoNV extends Struct<VkExternalComputeQueueDeviceCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RESERVEDEXTERNALQUEUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RESERVEDEXTERNALQUEUES = layout.offsetof(2);
    }

    protected VkExternalComputeQueueDeviceCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalComputeQueueDeviceCreateInfoNV create(long address, ByteBuffer container) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(address, container);
    }

    public VkExternalComputeQueueDeviceCreateInfoNV(ByteBuffer container) {
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
    public int reservedExternalQueues() {
        return nreservedExternalQueues(address());
    }

    public VkExternalComputeQueueDeviceCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalComputeQueueDeviceCreateInfoNV sType$Default() {
        return sType(1000556000);
    }

    public VkExternalComputeQueueDeviceCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalComputeQueueDeviceCreateInfoNV reservedExternalQueues(@NativeType("uint32_t") int value) {
        nreservedExternalQueues(address(), value);
        return this;
    }

    public VkExternalComputeQueueDeviceCreateInfoNV set(int sType, long pNext, int reservedExternalQueues) {
        sType(sType);
        pNext(pNext);
        reservedExternalQueues(reservedExternalQueues);
        return this;
    }

    public VkExternalComputeQueueDeviceCreateInfoNV set(VkExternalComputeQueueDeviceCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalComputeQueueDeviceCreateInfoNV malloc() {
        return new VkExternalComputeQueueDeviceCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalComputeQueueDeviceCreateInfoNV calloc() {
        return new VkExternalComputeQueueDeviceCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalComputeQueueDeviceCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalComputeQueueDeviceCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalComputeQueueDeviceCreateInfoNV create(long address) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(address, null);
    }

    public static VkExternalComputeQueueDeviceCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalComputeQueueDeviceCreateInfoNV(address, null);
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

    public static VkExternalComputeQueueDeviceCreateInfoNV malloc(MemoryStack stack) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalComputeQueueDeviceCreateInfoNV calloc(MemoryStack stack) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nreservedExternalQueues(long struct) {
        return MemoryUtil.memGetInt(struct + RESERVEDEXTERNALQUEUES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nreservedExternalQueues(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESERVEDEXTERNALQUEUES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalComputeQueueDeviceCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalComputeQueueDeviceCreateInfoNV, Buffer> implements NativeResource {
        private static final VkExternalComputeQueueDeviceCreateInfoNV ELEMENT_FACTORY = VkExternalComputeQueueDeviceCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalComputeQueueDeviceCreateInfoNV.SIZEOF);
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
        public VkExternalComputeQueueDeviceCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalComputeQueueDeviceCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExternalComputeQueueDeviceCreateInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int reservedExternalQueues() {
            return VkExternalComputeQueueDeviceCreateInfoNV.nreservedExternalQueues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalComputeQueueDeviceCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000556000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalComputeQueueDeviceCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer reservedExternalQueues(@NativeType("uint32_t") int value) {
            VkExternalComputeQueueDeviceCreateInfoNV.nreservedExternalQueues(address(), value);
            return this;
        }
    }
}
