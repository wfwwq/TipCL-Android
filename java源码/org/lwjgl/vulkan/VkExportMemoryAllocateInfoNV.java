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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoNV.class */
public class VkExportMemoryAllocateInfoNV extends Struct<VkExportMemoryAllocateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HANDLETYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPES = layout.offsetof(2);
    }

    protected VkExportMemoryAllocateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportMemoryAllocateInfoNV create(long address, ByteBuffer container) {
        return new VkExportMemoryAllocateInfoNV(address, container);
    }

    public VkExportMemoryAllocateInfoNV(ByteBuffer container) {
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

    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int handleTypes() {
        return nhandleTypes(address());
    }

    public VkExportMemoryAllocateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportMemoryAllocateInfoNV sType$Default() {
        return sType(NVExternalMemory.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV);
    }

    public VkExportMemoryAllocateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportMemoryAllocateInfoNV handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    public VkExportMemoryAllocateInfoNV set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExportMemoryAllocateInfoNV set(VkExportMemoryAllocateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMemoryAllocateInfoNV malloc() {
        return new VkExportMemoryAllocateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMemoryAllocateInfoNV calloc() {
        return new VkExportMemoryAllocateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMemoryAllocateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMemoryAllocateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMemoryAllocateInfoNV create(long address) {
        return new VkExportMemoryAllocateInfoNV(address, null);
    }

    public static VkExportMemoryAllocateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMemoryAllocateInfoNV(address, null);
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

    public static VkExportMemoryAllocateInfoNV malloc(MemoryStack stack) {
        return new VkExportMemoryAllocateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMemoryAllocateInfoNV calloc(MemoryStack stack) {
        return new VkExportMemoryAllocateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nhandleTypes(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMemoryAllocateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportMemoryAllocateInfoNV, Buffer> implements NativeResource {
        private static final VkExportMemoryAllocateInfoNV ELEMENT_FACTORY = VkExportMemoryAllocateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportMemoryAllocateInfoNV.SIZEOF);
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
        public VkExportMemoryAllocateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportMemoryAllocateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportMemoryAllocateInfoNV.npNext(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int handleTypes() {
            return VkExportMemoryAllocateInfoNV.nhandleTypes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMemoryAllocateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVExternalMemory.VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMemoryAllocateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) {
            VkExportMemoryAllocateInfoNV.nhandleTypes(address(), value);
            return this;
        }
    }
}
