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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireProfilingLockInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireProfilingLockInfoKHR.class */
public class VkAcquireProfilingLockInfoKHR extends Struct<VkAcquireProfilingLockInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int TIMEOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
    }

    protected VkAcquireProfilingLockInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAcquireProfilingLockInfoKHR create(long address, ByteBuffer container) {
        return new VkAcquireProfilingLockInfoKHR(address, container);
    }

    public VkAcquireProfilingLockInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAcquireProfilingLockFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint64_t")
    public long timeout() {
        return ntimeout(address());
    }

    public VkAcquireProfilingLockInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAcquireProfilingLockInfoKHR sType$Default() {
        return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR);
    }

    public VkAcquireProfilingLockInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAcquireProfilingLockInfoKHR flags(@NativeType("VkAcquireProfilingLockFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAcquireProfilingLockInfoKHR timeout(@NativeType("uint64_t") long value) {
        ntimeout(address(), value);
        return this;
    }

    public VkAcquireProfilingLockInfoKHR set(int sType, long pNext, int flags, long timeout) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        timeout(timeout);
        return this;
    }

    public VkAcquireProfilingLockInfoKHR set(VkAcquireProfilingLockInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAcquireProfilingLockInfoKHR malloc() {
        return new VkAcquireProfilingLockInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAcquireProfilingLockInfoKHR calloc() {
        return new VkAcquireProfilingLockInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAcquireProfilingLockInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAcquireProfilingLockInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAcquireProfilingLockInfoKHR create(long address) {
        return new VkAcquireProfilingLockInfoKHR(address, null);
    }

    public static VkAcquireProfilingLockInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAcquireProfilingLockInfoKHR(address, null);
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

    public static VkAcquireProfilingLockInfoKHR malloc(MemoryStack stack) {
        return new VkAcquireProfilingLockInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAcquireProfilingLockInfoKHR calloc(MemoryStack stack) {
        return new VkAcquireProfilingLockInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ntimeout(long struct) {
        return MemoryUtil.memGetLong(struct + TIMEOUT);
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

    public static void ntimeout(long struct, long value) {
        MemoryUtil.memPutLong(struct + TIMEOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireProfilingLockInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAcquireProfilingLockInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAcquireProfilingLockInfoKHR, Buffer> implements NativeResource {
        private static final VkAcquireProfilingLockInfoKHR ELEMENT_FACTORY = VkAcquireProfilingLockInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAcquireProfilingLockInfoKHR.SIZEOF);
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
        public VkAcquireProfilingLockInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAcquireProfilingLockInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAcquireProfilingLockInfoKHR.npNext(address());
        }

        @NativeType("VkAcquireProfilingLockFlagsKHR")
        public int flags() {
            return VkAcquireProfilingLockInfoKHR.nflags(address());
        }

        @NativeType("uint64_t")
        public long timeout() {
            return VkAcquireProfilingLockInfoKHR.ntimeout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAcquireProfilingLockInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAcquireProfilingLockInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkAcquireProfilingLockFlagsKHR") int value) {
            VkAcquireProfilingLockInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer timeout(@NativeType("uint64_t") long value) {
            VkAcquireProfilingLockInfoKHR.ntimeout(address(), value);
            return this;
        }
    }
}
