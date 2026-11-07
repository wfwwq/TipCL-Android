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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceWin32HandleInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceWin32HandleInfoKHR.class */
public class VkImportFenceWin32HandleInfoKHR extends Struct<VkImportFenceWin32HandleInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FENCE;
    public static final int FLAGS;
    public static final int HANDLETYPE;
    public static final int HANDLE;
    public static final int NAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FENCE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        HANDLE = layout.offsetof(5);
        NAME = layout.offsetof(6);
    }

    protected VkImportFenceWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportFenceWin32HandleInfoKHR create(long address, ByteBuffer container) {
        return new VkImportFenceWin32HandleInfoKHR(address, container);
    }

    public VkImportFenceWin32HandleInfoKHR(ByteBuffer container) {
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

    @NativeType("HANDLE")
    public long handle() {
        return nhandle(address());
    }

    @NativeType("LPCWSTR")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("LPCWSTR")
    public String nameString() {
        return nnameString(address());
    }

    public VkImportFenceWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR sType$Default() {
        return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR);
    }

    public VkImportFenceWin32HandleInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR fence(@NativeType("VkFence") long value) {
        nfence(address(), value);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR flags(@NativeType("VkFenceImportFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR handle(@NativeType("HANDLE") long value) {
        nhandle(address(), value);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR set(int sType, long pNext, long fence, int flags, int handleType, long handle, ByteBuffer name) {
        sType(sType);
        pNext(pNext);
        fence(fence);
        flags(flags);
        handleType(handleType);
        handle(handle);
        name(name);
        return this;
    }

    public VkImportFenceWin32HandleInfoKHR set(VkImportFenceWin32HandleInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportFenceWin32HandleInfoKHR malloc() {
        return new VkImportFenceWin32HandleInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportFenceWin32HandleInfoKHR calloc() {
        return new VkImportFenceWin32HandleInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportFenceWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportFenceWin32HandleInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImportFenceWin32HandleInfoKHR create(long address) {
        return new VkImportFenceWin32HandleInfoKHR(address, null);
    }

    public static VkImportFenceWin32HandleInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportFenceWin32HandleInfoKHR(address, null);
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

    public static VkImportFenceWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkImportFenceWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportFenceWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkImportFenceWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nhandle(long struct) {
        return MemoryUtil.memGetAddress(struct + HANDLE);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT2(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF16(MemoryUtil.memGetAddress(struct + NAME));
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

    public static void nhandle(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HANDLE, Checks.check(value));
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2(value);
        }
        MemoryUtil.memPutAddress(struct + NAME, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + HANDLE));
        Checks.check(MemoryUtil.memGetAddress(struct + NAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceWin32HandleInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportFenceWin32HandleInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportFenceWin32HandleInfoKHR, Buffer> implements NativeResource {
        private static final VkImportFenceWin32HandleInfoKHR ELEMENT_FACTORY = VkImportFenceWin32HandleInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportFenceWin32HandleInfoKHR.SIZEOF);
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
        public VkImportFenceWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportFenceWin32HandleInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportFenceWin32HandleInfoKHR.npNext(address());
        }

        @NativeType("VkFence")
        public long fence() {
            return VkImportFenceWin32HandleInfoKHR.nfence(address());
        }

        @NativeType("VkFenceImportFlags")
        public int flags() {
            return VkImportFenceWin32HandleInfoKHR.nflags(address());
        }

        @NativeType("VkExternalFenceHandleTypeFlagBits")
        public int handleType() {
            return VkImportFenceWin32HandleInfoKHR.nhandleType(address());
        }

        @NativeType("HANDLE")
        public long handle() {
            return VkImportFenceWin32HandleInfoKHR.nhandle(address());
        }

        @NativeType("LPCWSTR")
        public ByteBuffer name() {
            return VkImportFenceWin32HandleInfoKHR.nname(address());
        }

        @NativeType("LPCWSTR")
        public String nameString() {
            return VkImportFenceWin32HandleInfoKHR.nnameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportFenceWin32HandleInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportFenceWin32HandleInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer fence(@NativeType("VkFence") long value) {
            VkImportFenceWin32HandleInfoKHR.nfence(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkFenceImportFlags") int value) {
            VkImportFenceWin32HandleInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) {
            VkImportFenceWin32HandleInfoKHR.nhandleType(address(), value);
            return this;
        }

        public Buffer handle(@NativeType("HANDLE") long value) {
            VkImportFenceWin32HandleInfoKHR.nhandle(address(), value);
            return this;
        }

        public Buffer name(@NativeType("LPCWSTR") ByteBuffer value) {
            VkImportFenceWin32HandleInfoKHR.nname(address(), value);
            return this;
        }
    }
}
