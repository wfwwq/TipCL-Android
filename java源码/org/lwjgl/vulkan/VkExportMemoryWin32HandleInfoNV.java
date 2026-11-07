package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.system.windows.SECURITY_ATTRIBUTES;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryWin32HandleInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryWin32HandleInfoNV.class */
public class VkExportMemoryWin32HandleInfoNV extends Struct<VkExportMemoryWin32HandleInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PATTRIBUTES;
    public static final int DWACCESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PATTRIBUTES = layout.offsetof(2);
        DWACCESS = layout.offsetof(3);
    }

    protected VkExportMemoryWin32HandleInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportMemoryWin32HandleInfoNV create(long address, ByteBuffer container) {
        return new VkExportMemoryWin32HandleInfoNV(address, container);
    }

    public VkExportMemoryWin32HandleInfoNV(ByteBuffer container) {
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

    public VkExportMemoryWin32HandleInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportMemoryWin32HandleInfoNV sType$Default() {
        return sType(NVExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV);
    }

    public VkExportMemoryWin32HandleInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportMemoryWin32HandleInfoNV pAttributes(@NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) {
        npAttributes(address(), value);
        return this;
    }

    public VkExportMemoryWin32HandleInfoNV dwAccess(@NativeType("DWORD") int value) {
        ndwAccess(address(), value);
        return this;
    }

    public VkExportMemoryWin32HandleInfoNV set(int sType, long pNext, SECURITY_ATTRIBUTES pAttributes, int dwAccess) {
        sType(sType);
        pNext(pNext);
        pAttributes(pAttributes);
        dwAccess(dwAccess);
        return this;
    }

    public VkExportMemoryWin32HandleInfoNV set(VkExportMemoryWin32HandleInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMemoryWin32HandleInfoNV malloc() {
        return new VkExportMemoryWin32HandleInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMemoryWin32HandleInfoNV calloc() {
        return new VkExportMemoryWin32HandleInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMemoryWin32HandleInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMemoryWin32HandleInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMemoryWin32HandleInfoNV create(long address) {
        return new VkExportMemoryWin32HandleInfoNV(address, null);
    }

    public static VkExportMemoryWin32HandleInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMemoryWin32HandleInfoNV(address, null);
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

    public static VkExportMemoryWin32HandleInfoNV malloc(MemoryStack stack) {
        return new VkExportMemoryWin32HandleInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMemoryWin32HandleInfoNV calloc(MemoryStack stack) {
        return new VkExportMemoryWin32HandleInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void validate(long struct) {
        long pAttributes = MemoryUtil.memGetAddress(struct + PATTRIBUTES);
        if (pAttributes != 0) {
            SECURITY_ATTRIBUTES.validate(pAttributes);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryWin32HandleInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryWin32HandleInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportMemoryWin32HandleInfoNV, Buffer> implements NativeResource {
        private static final VkExportMemoryWin32HandleInfoNV ELEMENT_FACTORY = VkExportMemoryWin32HandleInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportMemoryWin32HandleInfoNV.SIZEOF);
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
        public VkExportMemoryWin32HandleInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportMemoryWin32HandleInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportMemoryWin32HandleInfoNV.npNext(address());
        }

        @NativeType("SECURITY_ATTRIBUTES const *")
        public SECURITY_ATTRIBUTES pAttributes() {
            return VkExportMemoryWin32HandleInfoNV.npAttributes(address());
        }

        @NativeType("DWORD")
        public int dwAccess() {
            return VkExportMemoryWin32HandleInfoNV.ndwAccess(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMemoryWin32HandleInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVExternalMemoryWin32.VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMemoryWin32HandleInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pAttributes(@NativeType("SECURITY_ATTRIBUTES const *") SECURITY_ATTRIBUTES value) {
            VkExportMemoryWin32HandleInfoNV.npAttributes(address(), value);
            return this;
        }

        public Buffer dwAccess(@NativeType("DWORD") int value) {
            VkExportMemoryWin32HandleInfoNV.ndwAccess(address(), value);
            return this;
        }
    }
}
