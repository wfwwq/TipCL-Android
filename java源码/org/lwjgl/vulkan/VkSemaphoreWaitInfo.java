package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo.class */
public class VkSemaphoreWaitInfo extends Struct<VkSemaphoreWaitInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SEMAPHORECOUNT;
    public static final int PSEMAPHORES;
    public static final int PVALUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SEMAPHORECOUNT = layout.offsetof(3);
        PSEMAPHORES = layout.offsetof(4);
        PVALUES = layout.offsetof(5);
    }

    protected VkSemaphoreWaitInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSemaphoreWaitInfo create(long address, ByteBuffer container) {
        return new VkSemaphoreWaitInfo(address, container);
    }

    public VkSemaphoreWaitInfo(ByteBuffer container) {
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

    @NativeType("VkSemaphoreWaitFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int semaphoreCount() {
        return nsemaphoreCount(address());
    }

    @NativeType("VkSemaphore const *")
    public LongBuffer pSemaphores() {
        return npSemaphores(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pValues() {
        return npValues(address());
    }

    public VkSemaphoreWaitInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSemaphoreWaitInfo sType$Default() {
        return sType(1000207004);
    }

    public VkSemaphoreWaitInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSemaphoreWaitInfo flags(@NativeType("VkSemaphoreWaitFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSemaphoreWaitInfo semaphoreCount(@NativeType("uint32_t") int value) {
        nsemaphoreCount(address(), value);
        return this;
    }

    public VkSemaphoreWaitInfo pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
        npSemaphores(address(), value);
        return this;
    }

    public VkSemaphoreWaitInfo pValues(@NativeType("uint64_t const *") LongBuffer value) {
        npValues(address(), value);
        return this;
    }

    public VkSemaphoreWaitInfo set(int sType, long pNext, int flags, int semaphoreCount, LongBuffer pSemaphores, LongBuffer pValues) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        semaphoreCount(semaphoreCount);
        pSemaphores(pSemaphores);
        pValues(pValues);
        return this;
    }

    public VkSemaphoreWaitInfo set(VkSemaphoreWaitInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreWaitInfo malloc() {
        return new VkSemaphoreWaitInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreWaitInfo calloc() {
        return new VkSemaphoreWaitInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreWaitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreWaitInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreWaitInfo create(long address) {
        return new VkSemaphoreWaitInfo(address, null);
    }

    public static VkSemaphoreWaitInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreWaitInfo(address, null);
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

    public static VkSemaphoreWaitInfo malloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreWaitInfo calloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsemaphoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + SEMAPHORECOUNT);
    }

    public static LongBuffer npSemaphores(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PSEMAPHORES), nsemaphoreCount(struct));
    }

    public static LongBuffer npValues(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PVALUES), nsemaphoreCount(struct));
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

    public static void nsemaphoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SEMAPHORECOUNT, value);
    }

    public static void npSemaphores(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSEMAPHORES, MemoryUtil.memAddress(value));
    }

    public static void npValues(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PVALUES, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSEMAPHORES));
        Checks.check(MemoryUtil.memGetAddress(struct + PVALUES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSemaphoreWaitInfo, Buffer> implements NativeResource {
        private static final VkSemaphoreWaitInfo ELEMENT_FACTORY = VkSemaphoreWaitInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSemaphoreWaitInfo.SIZEOF);
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
        public VkSemaphoreWaitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSemaphoreWaitInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSemaphoreWaitInfo.npNext(address());
        }

        @NativeType("VkSemaphoreWaitFlags")
        public int flags() {
            return VkSemaphoreWaitInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int semaphoreCount() {
            return VkSemaphoreWaitInfo.nsemaphoreCount(address());
        }

        @NativeType("VkSemaphore const *")
        public LongBuffer pSemaphores() {
            return VkSemaphoreWaitInfo.npSemaphores(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pValues() {
            return VkSemaphoreWaitInfo.npValues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreWaitInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000207004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreWaitInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkSemaphoreWaitFlags") int value) {
            VkSemaphoreWaitInfo.nflags(address(), value);
            return this;
        }

        public Buffer semaphoreCount(@NativeType("uint32_t") int value) {
            VkSemaphoreWaitInfo.nsemaphoreCount(address(), value);
            return this;
        }

        public Buffer pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) {
            VkSemaphoreWaitInfo.npSemaphores(address(), value);
            return this;
        }

        public Buffer pValues(@NativeType("uint64_t const *") LongBuffer value) {
            VkSemaphoreWaitInfo.npValues(address(), value);
            return this;
        }
    }
}
