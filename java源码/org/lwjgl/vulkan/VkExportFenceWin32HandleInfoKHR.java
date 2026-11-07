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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceWin32HandleInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceWin32HandleInfoKHR.class */
public class VkExportFenceWin32HandleInfoKHR extends Struct<VkExportFenceWin32HandleInfoKHR> implements NativeResource {
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

    protected VkExportFenceWin32HandleInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportFenceWin32HandleInfoKHR create(long address, ByteBuffer container) {
        return new VkExportFenceWin32HandleInfoKHR(address, container);
    }

    public VkExportFenceWin32HandleInfoKHR(ByteBuffer container) {
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

    public VkExportFenceWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportFenceWin32HandleInfoKHR sType$Default() {
        return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR);
    }

    public VkExportFenceWin32HandleInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportFenceWin32HandleInfoKHR pAttributes(@NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) {
        npAttributes(address(), value);
        return this;
    }

    public VkExportFenceWin32HandleInfoKHR dwAccess(@NativeType("DWORD") int value) {
        ndwAccess(address(), value);
        return this;
    }

    public VkExportFenceWin32HandleInfoKHR name(@NativeType("LPCWSTR") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public VkExportFenceWin32HandleInfoKHR set(int sType, long pNext, SECURITY_ATTRIBUTES pAttributes, int dwAccess, ByteBuffer name) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);
        name(name);
        return this;
    }

    public VkExportFenceWin32HandleInfoKHR set(VkExportFenceWin32HandleInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportFenceWin32HandleInfoKHR malloc() {
        return new VkExportFenceWin32HandleInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportFenceWin32HandleInfoKHR calloc() {
        return new VkExportFenceWin32HandleInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportFenceWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportFenceWin32HandleInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkExportFenceWin32HandleInfoKHR create(long address) {
        return new VkExportFenceWin32HandleInfoKHR(address, null);
    }

    public static VkExportFenceWin32HandleInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportFenceWin32HandleInfoKHR(address, null);
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

    public static VkExportFenceWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkExportFenceWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportFenceWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkExportFenceWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceWin32HandleInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceWin32HandleInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportFenceWin32HandleInfoKHR, Buffer> implements NativeResource {
        private static final VkExportFenceWin32HandleInfoKHR ELEMENT_FACTORY = VkExportFenceWin32HandleInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportFenceWin32HandleInfoKHR.SIZEOF);
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
        public VkExportFenceWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportFenceWin32HandleInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportFenceWin32HandleInfoKHR.npNext(address());
        }

        @NativeType("SECURITY_ATTRIBUTES const *")
        public SECURITY_ATTRIBUTES pAttributes() {
            return VkExportFenceWin32HandleInfoKHR.npAttributes(address());
        }

        @NativeType("DWORD")
        public int dwAccess() {
            return VkExportFenceWin32HandleInfoKHR.ndwAccess(address());
        }

        @NativeType("LPCWSTR")
        public ByteBuffer name() {
            return VkExportFenceWin32HandleInfoKHR.nname(address());
        }

        @NativeType("LPCWSTR")
        public String nameString() {
            return VkExportFenceWin32HandleInfoKHR.nnameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportFenceWin32HandleInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRExternalFenceWin32.VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportFenceWin32HandleInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pAttributes(@NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) {
            VkExportFenceWin32HandleInfoKHR.npAttributes(address(), value);
            return this;
        }

        public Buffer dwAccess(@NativeType("DWORD") int value) {
            VkExportFenceWin32HandleInfoKHR.ndwAccess(address(), value);
            return this;
        }

        public Buffer name(@NativeType("LPCWSTR") ByteBuffer value) {
            VkExportFenceWin32HandleInfoKHR.nname(address(), value);
            return this;
        }
    }
}
