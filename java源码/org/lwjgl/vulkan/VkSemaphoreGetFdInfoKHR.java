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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreGetFdInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreGetFdInfoKHR.class */
public class VkSemaphoreGetFdInfoKHR extends Struct<VkSemaphoreGetFdInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SEMAPHORE;
    public static final int HANDLETYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    protected VkSemaphoreGetFdInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSemaphoreGetFdInfoKHR create(long address, ByteBuffer container) {
        return new VkSemaphoreGetFdInfoKHR(address, container);
    }

    public VkSemaphoreGetFdInfoKHR(ByteBuffer container) {
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

    @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
    public int handleType() {
        return nhandleType(address());
    }

    public VkSemaphoreGetFdInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSemaphoreGetFdInfoKHR sType$Default() {
        return sType(KHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR);
    }

    public VkSemaphoreGetFdInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSemaphoreGetFdInfoKHR semaphore(@NativeType("VkSemaphore") long value) {
        nsemaphore(address(), value);
        return this;
    }

    public VkSemaphoreGetFdInfoKHR handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkSemaphoreGetFdInfoKHR set(int sType, long pNext, long semaphore, int handleType) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        handleType(handleType);
        return this;
    }

    public VkSemaphoreGetFdInfoKHR set(VkSemaphoreGetFdInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreGetFdInfoKHR malloc() {
        return new VkSemaphoreGetFdInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreGetFdInfoKHR calloc() {
        return new VkSemaphoreGetFdInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreGetFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreGetFdInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreGetFdInfoKHR create(long address) {
        return new VkSemaphoreGetFdInfoKHR(address, null);
    }

    public static VkSemaphoreGetFdInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreGetFdInfoKHR(address, null);
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

    public static VkSemaphoreGetFdInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreGetFdInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreGetFdInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreGetFdInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhandleType(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPE);
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

    public static void nhandleType(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreGetFdInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreGetFdInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSemaphoreGetFdInfoKHR, Buffer> implements NativeResource {
        private static final VkSemaphoreGetFdInfoKHR ELEMENT_FACTORY = VkSemaphoreGetFdInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSemaphoreGetFdInfoKHR.SIZEOF);
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
        public VkSemaphoreGetFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSemaphoreGetFdInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSemaphoreGetFdInfoKHR.npNext(address());
        }

        @NativeType("VkSemaphore")
        public long semaphore() {
            return VkSemaphoreGetFdInfoKHR.nsemaphore(address());
        }

        @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
        public int handleType() {
            return VkSemaphoreGetFdInfoKHR.nhandleType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreGetFdInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalSemaphoreFd.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreGetFdInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer semaphore(@NativeType("VkSemaphore") long value) {
            VkSemaphoreGetFdInfoKHR.nsemaphore(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) {
            VkSemaphoreGetFdInfoKHR.nhandleType(address(), value);
            return this;
        }
    }
}
