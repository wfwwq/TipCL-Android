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
import org.lwjgl.system.windows.SECURITY_ATTRIBUTES;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreWin32HandleInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreWin32HandleInfoKHR.class */
public class VkExportSemaphoreWin32HandleInfoKHR extends Struct<VkExportSemaphoreWin32HandleInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PATTRIBUTES;
    public static final int DWACCESS;
    public static final int NAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PATTRIBUTES = layout.offsetof(2);
        DWACCESS = layout.offsetof(3);
        NAME = layout.offsetof(4);
    }

    protected VkExportSemaphoreWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportSemaphoreWin32HandleInfoKHR create(long address, ByteBuffer container) {
        return new VkExportSemaphoreWin32HandleInfoKHR(address, container);
    }

    public VkExportSemaphoreWin32HandleInfoKHR(ByteBuffer container) {
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

    @NativeType("SECURITY_ATTRIBUTES const *")
    public SECURITY_ATTRIBUTES pAttributes() {
        return npAttributes(address());
    }

    @NativeType("DWORD")
    public int dwAccess() {
        return ndwAccess(address());
    }

    @NativeType("LPCWSTR")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("LPCWSTR")
    public String nameString() {
        return nnameString(address());
    }

    public VkExportSemaphoreWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportSemaphoreWin32HandleInfoKHR sType$Default() {
        return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR);
    }

    public VkExportSemaphoreWin32HandleInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportSemaphoreWin32HandleInfoKHR pAttributes(@NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) {
        npAttributes(address(), value);
        return this;
    }

    public VkExportSemaphoreWin32HandleInfoKHR dwAccess(@NativeType("DWORD") int value) {
        ndwAccess(address(), value);
        return this;
    }

    public VkExportSemaphoreWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public VkExportSemaphoreWin32HandleInfoKHR set(int sType, long pNext, SECURITY_ATTRIBUTES pAttributes, int dwAccess, ByteBuffer name) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);
        name(name);
        return this;
    }

    public VkExportSemaphoreWin32HandleInfoKHR set(VkExportSemaphoreWin32HandleInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportSemaphoreWin32HandleInfoKHR malloc() {
        return new VkExportSemaphoreWin32HandleInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportSemaphoreWin32HandleInfoKHR calloc() {
        return new VkExportSemaphoreWin32HandleInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportSemaphoreWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportSemaphoreWin32HandleInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExportSemaphoreWin32HandleInfoKHR create(long address) {
        return new VkExportSemaphoreWin32HandleInfoKHR(address, null);
    }

    public static VkExportSemaphoreWin32HandleInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportSemaphoreWin32HandleInfoKHR(address, null);
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

    public static VkExportSemaphoreWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkExportSemaphoreWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportSemaphoreWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkExportSemaphoreWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static SECURITY_ATTRIBUTES npAttributes(long struct) {
        return SECURITY_ATTRIBUTES.createSafe(MemoryUtil.memGetAddress(struct + PATTRIBUTES));
    }

    public static int ndwAccess(long struct) {
        return MemoryUtil.memGetInt(struct + DWACCESS);
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

    public static void npAttributes(long struct, SECURITY_ATTRIBUTES value) {
        MemoryUtil.memPutAddress(struct + PATTRIBUTES, MemoryUtil.memAddressSafe(value));
    }

    public static void ndwAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + DWACCESS, value);
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT2(value);
        }
        MemoryUtil.memPutAddress(struct + NAME, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        long pAttributes = MemoryUtil.memGetAddress(struct + PATTRIBUTES);
        if (pAttributes != 0) {
            SECURITY_ATTRIBUTES.validate(pAttributes);
        }
        Checks.check(MemoryUtil.memGetAddress(struct + NAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreWin32HandleInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportSemaphoreWin32HandleInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportSemaphoreWin32HandleInfoKHR, Buffer> implements NativeResource {
        private static final VkExportSemaphoreWin32HandleInfoKHR ELEMENT_FACTORY = VkExportSemaphoreWin32HandleInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportSemaphoreWin32HandleInfoKHR.SIZEOF);
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
        public VkExportSemaphoreWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportSemaphoreWin32HandleInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportSemaphoreWin32HandleInfoKHR.npNext(address());
        }

        @NativeType("SECURITY_ATTRIBUTES const *")
        public SECURITY_ATTRIBUTES pAttributes() {
            return VkExportSemaphoreWin32HandleInfoKHR.npAttributes(address());
        }

        @NativeType("DWORD")
        public int dwAccess() {
            return VkExportSemaphoreWin32HandleInfoKHR.ndwAccess(address());
        }

        @NativeType("LPCWSTR")
        public ByteBuffer name() {
            return VkExportSemaphoreWin32HandleInfoKHR.nname(address());
        }

        @NativeType("LPCWSTR")
        public String nameString() {
            return VkExportSemaphoreWin32HandleInfoKHR.nnameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportSemaphoreWin32HandleInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalSemaphoreWin32.VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportSemaphoreWin32HandleInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pAttributes(@NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) {
            VkExportSemaphoreWin32HandleInfoKHR.npAttributes(address(), value);
            return this;
        }

        public Buffer dwAccess(@NativeType("DWORD") int value) {
            VkExportSemaphoreWin32HandleInfoKHR.ndwAccess(address(), value);
            return this;
        }

        public Buffer name(@NativeType("LPCWSTR") ByteBuffer value) {
            VkExportSemaphoreWin32HandleInfoKHR.nname(address(), value);
            return this;
        }
    }
}
