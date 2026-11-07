package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.class */
public class VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR extends Struct<VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INTERNALLYSYNCHRONIZEDQUEUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTERNALLYSYNCHRONIZEDQUEUES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(ByteBuffer container) {
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
    public boolean internallySynchronizedQueues() {
        return ninternallySynchronizedQueues(address()) != 0;
    }

    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR sType$Default() {
        return sType(KHRInternallySynchronizedQueues.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INTERNALLY_SYNCHRONIZED_QUEUES_FEATURES_KHR);
    }

    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR internallySynchronizedQueues(@NativeType("VkBool32") boolean value) {
        ninternallySynchronizedQueues(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR set(int sType, long pNext, boolean internallySynchronizedQueues) {
        sType(sType);
        pNext(pNext);
        internallySynchronizedQueues(internallySynchronizedQueues);
        return this;
    }

    public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR set(VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR malloc() {
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR calloc() {
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR create(long address) {
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ninternallySynchronizedQueues(long struct) {
        return MemoryUtil.memGetInt(struct + INTERNALLYSYNCHRONIZEDQUEUES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ninternallySynchronizedQueues(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERNALLYSYNCHRONIZEDQUEUES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean internallySynchronizedQueues() {
            return VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.ninternallySynchronizedQueues(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRInternallySynchronizedQueues.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INTERNALLY_SYNCHRONIZED_QUEUES_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer internallySynchronizedQueues(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceInternallySynchronizedQueuesFeaturesKHR.ninternallySynchronizedQueues(address(), value ? 1 : 0);
            return this;
        }
    }
}
