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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueInfo2.class */
public class VkDeviceQueueInfo2 extends Struct<VkDeviceQueueInfo2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int QUEUEFAMILYINDEX;
    public static final int QUEUEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUEUEFAMILYINDEX = layout.offsetof(3);
        QUEUEINDEX = layout.offsetof(4);
    }

    protected VkDeviceQueueInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceQueueInfo2 create(long address, ByteBuffer container) {
        return new VkDeviceQueueInfo2(address, container);
    }

    public VkDeviceQueueInfo2(ByteBuffer container) {
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

    @NativeType("VkDeviceQueueCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int queueFamilyIndex() {
        return nqueueFamilyIndex(address());
    }

    @NativeType("uint32_t")
    public int queueIndex() {
        return nqueueIndex(address());
    }

    public VkDeviceQueueInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceQueueInfo2 sType$Default() {
        return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2);
    }

    public VkDeviceQueueInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceQueueInfo2 flags(@NativeType("VkDeviceQueueCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDeviceQueueInfo2 queueFamilyIndex(@NativeType("uint32_t") int value) {
        nqueueFamilyIndex(address(), value);
        return this;
    }

    public VkDeviceQueueInfo2 queueIndex(@NativeType("uint32_t") int value) {
        nqueueIndex(address(), value);
        return this;
    }

    public VkDeviceQueueInfo2 set(int sType, long pNext, int flags, int queueFamilyIndex, int queueIndex) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queueFamilyIndex(queueFamilyIndex);
        queueIndex(queueIndex);
        return this;
    }

    public VkDeviceQueueInfo2 set(VkDeviceQueueInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceQueueInfo2 malloc() {
        return new VkDeviceQueueInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceQueueInfo2 calloc() {
        return new VkDeviceQueueInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceQueueInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceQueueInfo2 create(long address) {
        return new VkDeviceQueueInfo2(address, null);
    }

    public static VkDeviceQueueInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceQueueInfo2(address, null);
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

    public static VkDeviceQueueInfo2 malloc(MemoryStack stack) {
        return new VkDeviceQueueInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceQueueInfo2 calloc(MemoryStack stack) {
        return new VkDeviceQueueInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nqueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEX);
    }

    public static int nqueueIndex(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nqueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEX, value);
    }

    public static void nqueueIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEINDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceQueueInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceQueueInfo2, Buffer> implements NativeResource {
        private static final VkDeviceQueueInfo2 ELEMENT_FACTORY = VkDeviceQueueInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceQueueInfo2.SIZEOF);
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
        public VkDeviceQueueInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceQueueInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceQueueInfo2.npNext(address());
        }

        @NativeType("VkDeviceQueueCreateFlags")
        public int flags() {
            return VkDeviceQueueInfo2.nflags(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndex() {
            return VkDeviceQueueInfo2.nqueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int queueIndex() {
            return VkDeviceQueueInfo2.nqueueIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceQueueInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceQueueInfo2.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDeviceQueueCreateFlags") int value) {
            VkDeviceQueueInfo2.nflags(address(), value);
            return this;
        }

        public Buffer queueFamilyIndex(@NativeType("uint32_t") int value) {
            VkDeviceQueueInfo2.nqueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer queueIndex(@NativeType("uint32_t") int value) {
            VkDeviceQueueInfo2.nqueueIndex(address(), value);
            return this;
        }
    }
}
