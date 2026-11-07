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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoNV.class */
public class VkExternalMemoryImageCreateInfoNV extends Struct<VkExternalMemoryImageCreateInfoNV> implements NativeResource {
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

    protected VkExternalMemoryImageCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalMemoryImageCreateInfoNV create(long address, ByteBuffer container) {
        return new VkExternalMemoryImageCreateInfoNV(address, container);
    }

    public VkExternalMemoryImageCreateInfoNV(ByteBuffer container) {
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

    public VkExternalMemoryImageCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalMemoryImageCreateInfoNV sType$Default() {
        return sType(NVExternalMemory.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV);
    }

    public VkExternalMemoryImageCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalMemoryImageCreateInfoNV handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    public VkExternalMemoryImageCreateInfoNV set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExternalMemoryImageCreateInfoNV set(VkExternalMemoryImageCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalMemoryImageCreateInfoNV malloc() {
        return new VkExternalMemoryImageCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalMemoryImageCreateInfoNV calloc() {
        return new VkExternalMemoryImageCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalMemoryImageCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryImageCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalMemoryImageCreateInfoNV create(long address) {
        return new VkExternalMemoryImageCreateInfoNV(address, null);
    }

    public static VkExternalMemoryImageCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalMemoryImageCreateInfoNV(address, null);
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

    public static VkExternalMemoryImageCreateInfoNV malloc(MemoryStack stack) {
        return new VkExternalMemoryImageCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalMemoryImageCreateInfoNV calloc(MemoryStack stack) {
        return new VkExternalMemoryImageCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryImageCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalMemoryImageCreateInfoNV, Buffer> implements NativeResource {
        private static final VkExternalMemoryImageCreateInfoNV ELEMENT_FACTORY = VkExternalMemoryImageCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalMemoryImageCreateInfoNV.SIZEOF);
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
        public VkExternalMemoryImageCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalMemoryImageCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExternalMemoryImageCreateInfoNV.npNext(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int handleTypes() {
            return VkExternalMemoryImageCreateInfoNV.nhandleTypes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalMemoryImageCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVExternalMemory.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalMemoryImageCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsNV") int value) {
            VkExternalMemoryImageCreateInfoNV.nhandleTypes(address(), value);
            return this;
        }
    }
}
