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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfo.class */
public class VkSemaphoreSignalInfo extends Struct<VkSemaphoreSignalInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SEMAPHORE;
    public static final int VALUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
    }

    protected VkSemaphoreSignalInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSemaphoreSignalInfo create(long address, ByteBuffer container) {
        return new VkSemaphoreSignalInfo(address, container);
    }

    public VkSemaphoreSignalInfo(ByteBuffer container) {
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

    @NativeType("VkSemaphore")
    public long semaphore() {
        return nsemaphore(address());
    }

    @NativeType("uint64_t")
    public long value() {
        return nvalue(address());
    }

    public VkSemaphoreSignalInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSemaphoreSignalInfo sType$Default() {
        return sType(1000207005);
    }

    public VkSemaphoreSignalInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSemaphoreSignalInfo semaphore(@NativeType("VkSemaphore") long value) {
        nsemaphore(address(), value);
        return this;
    }

    public VkSemaphoreSignalInfo value(@NativeType("uint64_t") long value) {
        nvalue(address(), value);
        return this;
    }

    public VkSemaphoreSignalInfo set(int sType, long pNext, long semaphore, long value) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);
        return this;
    }

    public VkSemaphoreSignalInfo set(VkSemaphoreSignalInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreSignalInfo malloc() {
        return new VkSemaphoreSignalInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreSignalInfo calloc() {
        return new VkSemaphoreSignalInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreSignalInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreSignalInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreSignalInfo create(long address) {
        return new VkSemaphoreSignalInfo(address, null);
    }

    public static VkSemaphoreSignalInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreSignalInfo(address, null);
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

    public static VkSemaphoreSignalInfo malloc(MemoryStack stack) {
        return new VkSemaphoreSignalInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreSignalInfo calloc(MemoryStack stack) {
        return new VkSemaphoreSignalInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsemaphore(long struct) {
        return MemoryUtil.memGetLong(struct + SEMAPHORE);
    }

    public static long nvalue(long struct) {
        return MemoryUtil.memGetLong(struct + VALUE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsemaphore(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEMAPHORE, value);
    }

    public static void nvalue(long struct, long value) {
        MemoryUtil.memPutLong(struct + VALUE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreSignalInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSemaphoreSignalInfo, Buffer> implements NativeResource {
        private static final VkSemaphoreSignalInfo ELEMENT_FACTORY = VkSemaphoreSignalInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSemaphoreSignalInfo.SIZEOF);
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
        public VkSemaphoreSignalInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSemaphoreSignalInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSemaphoreSignalInfo.npNext(address());
        }

        @NativeType("VkSemaphore")
        public long semaphore() {
            return VkSemaphoreSignalInfo.nsemaphore(address());
        }

        @NativeType("uint64_t")
        public long value() {
            return VkSemaphoreSignalInfo.nvalue(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreSignalInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000207005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreSignalInfo.npNext(address(), value);
            return this;
        }

        public Buffer semaphore(@NativeType("VkSemaphore") long value) {
            VkSemaphoreSignalInfo.nsemaphore(address(), value);
            return this;
        }

        public Buffer value(@NativeType("uint64_t") long value) {
            VkSemaphoreSignalInfo.nvalue(address(), value);
            return this;
        }
    }
}
