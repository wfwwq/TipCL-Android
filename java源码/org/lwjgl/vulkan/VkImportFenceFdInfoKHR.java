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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceFdInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceFdInfoKHR.class */
public class VkImportFenceFdInfoKHR extends Struct<VkImportFenceFdInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FENCE;
    public static final int FLAGS;
    public static final int HANDLETYPE;
    public static final int FD;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FENCE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        FD = layout.offsetof(5);
    }

    protected VkImportFenceFdInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportFenceFdInfoKHR create(long address, ByteBuffer container) {
        return new VkImportFenceFdInfoKHR(address, container);
    }

    public VkImportFenceFdInfoKHR(ByteBuffer container) {
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

    @NativeType("VkFence")
    public long fence() {
        return nfence(address());
    }

    @NativeType("VkFenceImportFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkExternalFenceHandleTypeFlagBits")
    public int handleType() {
        return nhandleType(address());
    }

    public int fd() {
        return nfd(address());
    }

    public VkImportFenceFdInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportFenceFdInfoKHR sType$Default() {
        return sType(KHRExternalFenceFd.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR);
    }

    public VkImportFenceFdInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportFenceFdInfoKHR fence(@NativeType("VkFence") long value) {
        nfence(address(), value);
        return this;
    }

    public VkImportFenceFdInfoKHR flags(@NativeType("VkFenceImportFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkImportFenceFdInfoKHR handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkImportFenceFdInfoKHR fd(int value) {
        nfd(address(), value);
        return this;
    }

    public VkImportFenceFdInfoKHR set(int sType, long pNext, long fence, int flags, int handleType, int fd) {
        sType(sType);
        pNext(pNext);
        fence(fence);
        flags(flags);
        handleType(handleType);
        fd(fd);
        return this;
    }

    public VkImportFenceFdInfoKHR set(VkImportFenceFdInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportFenceFdInfoKHR malloc() {
        return new VkImportFenceFdInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportFenceFdInfoKHR calloc() {
        return new VkImportFenceFdInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportFenceFdInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportFenceFdInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImportFenceFdInfoKHR create(long address) {
        return new VkImportFenceFdInfoKHR(address, null);
    }

    public static VkImportFenceFdInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportFenceFdInfoKHR(address, null);
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

    public static VkImportFenceFdInfoKHR malloc(MemoryStack stack) {
        return new VkImportFenceFdInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportFenceFdInfoKHR calloc(MemoryStack stack) {
        return new VkImportFenceFdInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nfence(long struct) {
        return MemoryUtil.memGetLong(struct + FENCE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nhandleType(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPE);
    }

    public static int nfd(long struct) {
        return MemoryUtil.memGetInt(struct + FD);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfence(long struct, long value) {
        MemoryUtil.memPutLong(struct + FENCE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nhandleType(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPE, value);
    }

    public static void nfd(long struct, int value) {
        MemoryUtil.memPutInt(struct + FD, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceFdInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceFdInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportFenceFdInfoKHR, Buffer> implements NativeResource {
        private static final VkImportFenceFdInfoKHR ELEMENT_FACTORY = VkImportFenceFdInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportFenceFdInfoKHR.SIZEOF);
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
        public VkImportFenceFdInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportFenceFdInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportFenceFdInfoKHR.npNext(address());
        }

        @NativeType("VkFence")
        public long fence() {
            return VkImportFenceFdInfoKHR.nfence(address());
        }

        @NativeType("VkFenceImportFlags")
        public int flags() {
            return VkImportFenceFdInfoKHR.nflags(address());
        }

        @NativeType("VkExternalFenceHandleTypeFlagBits")
        public int handleType() {
            return VkImportFenceFdInfoKHR.nhandleType(address());
        }

        public int fd() {
            return VkImportFenceFdInfoKHR.nfd(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportFenceFdInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalFenceFd.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportFenceFdInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer fence(@NativeType("VkFence") long value) {
            VkImportFenceFdInfoKHR.nfence(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkFenceImportFlags") int value) {
            VkImportFenceFdInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) {
            VkImportFenceFdInfoKHR.nhandleType(address(), value);
            return this;
        }

        public Buffer fd(int value) {
            VkImportFenceFdInfoKHR.nfd(address(), value);
            return this;
        }
    }
}
