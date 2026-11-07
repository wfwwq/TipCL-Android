package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalComputeQueueCreateInfoNV.class */
public class VkExternalComputeQueueCreateInfoNV extends Struct<VkExternalComputeQueueCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PREFERREDQUEUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDQUEUE = layout.offsetof(2);
    }

    protected VkExternalComputeQueueCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalComputeQueueCreateInfoNV create(long address, ByteBuffer container) {
        return new VkExternalComputeQueueCreateInfoNV(address, container);
    }

    public VkExternalComputeQueueCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkQueue")
    public long preferredQueue() {
        return npreferredQueue(address());
    }

    public VkExternalComputeQueueCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalComputeQueueCreateInfoNV sType$Default() {
        return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV);
    }

    public VkExternalComputeQueueCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalComputeQueueCreateInfoNV preferredQueue(VkQueue value) {
        npreferredQueue(address(), value);
        return this;
    }

    public VkExternalComputeQueueCreateInfoNV set(int sType, long pNext, VkQueue preferredQueue) {
        sType(sType);
        pNext(pNext);
        preferredQueue(preferredQueue);
        return this;
    }

    public VkExternalComputeQueueCreateInfoNV set(VkExternalComputeQueueCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalComputeQueueCreateInfoNV malloc() {
        return new VkExternalComputeQueueCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalComputeQueueCreateInfoNV calloc() {
        return new VkExternalComputeQueueCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalComputeQueueCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalComputeQueueCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalComputeQueueCreateInfoNV create(long address) {
        return new VkExternalComputeQueueCreateInfoNV(address, null);
    }

    public static VkExternalComputeQueueCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalComputeQueueCreateInfoNV(address, null);
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

    public static VkExternalComputeQueueCreateInfoNV malloc(MemoryStack stack) {
        return new VkExternalComputeQueueCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalComputeQueueCreateInfoNV calloc(MemoryStack stack) {
        return new VkExternalComputeQueueCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npreferredQueue(long struct) {
        return MemoryUtil.memGetAddress(struct + PREFERREDQUEUE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npreferredQueue(long struct, VkQueue value) {
        MemoryUtil.memPutAddress(struct + PREFERREDQUEUE, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PREFERREDQUEUE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalComputeQueueCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalComputeQueueCreateInfoNV, Buffer> implements NativeResource {
        private static final VkExternalComputeQueueCreateInfoNV ELEMENT_FACTORY = VkExternalComputeQueueCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalComputeQueueCreateInfoNV.SIZEOF);
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
        public VkExternalComputeQueueCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalComputeQueueCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExternalComputeQueueCreateInfoNV.npNext(address());
        }

        @NativeType("VkQueue")
        public long preferredQueue() {
            return VkExternalComputeQueueCreateInfoNV.npreferredQueue(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalComputeQueueCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalComputeQueueCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer preferredQueue(VkQueue value) {
            VkExternalComputeQueueCreateInfoNV.npreferredQueue(address(), value);
            return this;
        }
    }
}
