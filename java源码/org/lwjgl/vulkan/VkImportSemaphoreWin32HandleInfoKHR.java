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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportSemaphoreWin32HandleInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportSemaphoreWin32HandleInfoKHR.class */
public class VkImportSemaphoreWin32HandleInfoKHR extends Struct<VkImportSemaphoreWin32HandleInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SEMAPHORE;
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
        SEMAPHORE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
        HANDLE = layout.offsetof(5);
        NAME = layout.offsetof(6);
    }

    protected VkImportSemaphoreWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportSemaphoreWin32HandleInfoKHR create(long address, ByteBuffer container) {
        return new VkImportSemaphoreWin32HandleInfoKHR(address, container);
    }

    public VkImportSemaphoreWin32HandleInfoKHR(ByteBuffer container) {
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

    @NativeType("VkSemaphoreImportFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
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

    public VkImportSemaphoreWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR sType$Default() {
        return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR);
    }

    public VkImportSemaphoreWin32HandleInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR semaphore(@NativeType("VkSemaphore") long value) {
        nsemaphore(address(), value);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR flags(@NativeType("VkSemaphoreImportFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR handle(@NativeType("HANDLE") long value) {
        nhandle(address(), value);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR set(int sType, long pNext, long semaphore, int flags, int handleType, long handle, ByteBuffer name) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        flags(flags);
        handleType(handleType);
        handle(handle);
        name(name);
        return this;
    }

    public VkImportSemaphoreWin32HandleInfoKHR set(VkImportSemaphoreWin32HandleInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportSemaphoreWin32HandleInfoKHR malloc() {
        return new VkImportSemaphoreWin32HandleInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportSemaphoreWin32HandleInfoKHR calloc() {
        return new VkImportSemaphoreWin32HandleInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportSemaphoreWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportSemaphoreWin32HandleInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImportSemaphoreWin32HandleInfoKHR create(long address) {
        return new VkImportSemaphoreWin32HandleInfoKHR(address, null);
    }

    public static VkImportSemaphoreWin32HandleInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportSemaphoreWin32HandleInfoKHR(address, null);
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

    public static VkImportSemaphoreWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkImportSemaphoreWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportSemaphoreWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkImportSemaphoreWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsemaphore(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEMAPHORE, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportSemaphoreWin32HandleInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportSemaphoreWin32HandleInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportSemaphoreWin32HandleInfoKHR, Buffer> implements NativeResource {
        private static final VkImportSemaphoreWin32HandleInfoKHR ELEMENT_FACTORY = VkImportSemaphoreWin32HandleInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportSemaphoreWin32HandleInfoKHR.SIZEOF);
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
        public VkImportSemaphoreWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportSemaphoreWin32HandleInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportSemaphoreWin32HandleInfoKHR.npNext(address());
        }

        @NativeType("VkSemaphore")
        public long semaphore() {
            return VkImportSemaphoreWin32HandleInfoKHR.nsemaphore(address());
        }

        @NativeType("VkSemaphoreImportFlags")
        public int flags() {
            return VkImportSemaphoreWin32HandleInfoKHR.nflags(address());
        }

        @NativeType("VkExternalSemaphoreHandleTypeFlagBits")
        public int handleType() {
            return VkImportSemaphoreWin32HandleInfoKHR.nhandleType(address());
        }

        @NativeType("HANDLE")
        public long handle() {
            return VkImportSemaphoreWin32HandleInfoKHR.nhandle(address());
        }

        @NativeType("LPCWSTR")
        public ByteBuffer name() {
            return VkImportSemaphoreWin32HandleInfoKHR.nname(address());
        }

        @NativeType("LPCWSTR")
        public String nameString() {
            return VkImportSemaphoreWin32HandleInfoKHR.nnameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportSemaphoreWin32HandleInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportSemaphoreWin32HandleInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer semaphore(@NativeType("VkSemaphore") long value) {
            VkImportSemaphoreWin32HandleInfoKHR.nsemaphore(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkSemaphoreImportFlags") int value) {
            VkImportSemaphoreWin32HandleInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalSemaphoreHandleTypeFlagBits") int value) {
            VkImportSemaphoreWin32HandleInfoKHR.nhandleType(address(), value);
            return this;
        }

        public Buffer handle(@NativeType("HANDLE") long value) {
            VkImportSemaphoreWin32HandleInfoKHR.nhandle(address(), value);
            return this;
        }

        public Buffer name(@NativeType("LPCWSTR") ByteBuffer value) {
            VkImportSemaphoreWin32HandleInfoKHR.nname(address(), value);
            return this;
        }
    }
}
