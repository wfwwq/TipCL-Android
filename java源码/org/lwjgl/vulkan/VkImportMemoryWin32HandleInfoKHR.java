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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryWin32HandleInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryWin32HandleInfoKHR.class */
public class VkImportMemoryWin32HandleInfoKHR extends Struct<VkImportMemoryWin32HandleInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HANDLETYPE;
    public static final int HANDLE;
    public static final int NAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    protected VkImportMemoryWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportMemoryWin32HandleInfoKHR create(long address, ByteBuffer container) {
        return new VkImportMemoryWin32HandleInfoKHR(address, container);
    }

    public VkImportMemoryWin32HandleInfoKHR(ByteBuffer container) {
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

    @NativeType("VkExternalMemoryHandleTypeFlagBits")
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

    public VkImportMemoryWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportMemoryWin32HandleInfoKHR sType$Default() {
        return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR);
    }

    public VkImportMemoryWin32HandleInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportMemoryWin32HandleInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkImportMemoryWin32HandleInfoKHR handle(@NativeType("HANDLE") long value) {
        nhandle(address(), value);
        return this;
    }

    public VkImportMemoryWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public VkImportMemoryWin32HandleInfoKHR set(int sType, long pNext, int handleType, long handle, ByteBuffer name) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        handle(handle);
        name(name);
        return this;
    }

    public VkImportMemoryWin32HandleInfoKHR set(VkImportMemoryWin32HandleInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportMemoryWin32HandleInfoKHR malloc() {
        return new VkImportMemoryWin32HandleInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportMemoryWin32HandleInfoKHR calloc() {
        return new VkImportMemoryWin32HandleInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportMemoryWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMemoryWin32HandleInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkImportMemoryWin32HandleInfoKHR create(long address) {
        return new VkImportMemoryWin32HandleInfoKHR(address, null);
    }

    public static VkImportMemoryWin32HandleInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportMemoryWin32HandleInfoKHR(address, null);
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

    public static VkImportMemoryWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkImportMemoryWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportMemoryWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkImportMemoryWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryWin32HandleInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryWin32HandleInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportMemoryWin32HandleInfoKHR, Buffer> implements NativeResource {
        private static final VkImportMemoryWin32HandleInfoKHR ELEMENT_FACTORY = VkImportMemoryWin32HandleInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportMemoryWin32HandleInfoKHR.SIZEOF);
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
        public VkImportMemoryWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportMemoryWin32HandleInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportMemoryWin32HandleInfoKHR.npNext(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() {
            return VkImportMemoryWin32HandleInfoKHR.nhandleType(address());
        }

        @NativeType("HANDLE")
        public long handle() {
            return VkImportMemoryWin32HandleInfoKHR.nhandle(address());
        }

        @NativeType("LPCWSTR")
        public ByteBuffer name() {
            return VkImportMemoryWin32HandleInfoKHR.nname(address());
        }

        @NativeType("LPCWSTR")
        public String nameString() {
            return VkImportMemoryWin32HandleInfoKHR.nnameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportMemoryWin32HandleInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportMemoryWin32HandleInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkImportMemoryWin32HandleInfoKHR.nhandleType(address(), value);
            return this;
        }

        public Buffer handle(@NativeType("HANDLE") long value) {
            VkImportMemoryWin32HandleInfoKHR.nhandle(address(), value);
            return this;
        }

        public Buffer name(@NativeType("LPCWSTR") ByteBuffer value) {
            VkImportMemoryWin32HandleInfoKHR.nname(address(), value);
            return this;
        }
    }
}
