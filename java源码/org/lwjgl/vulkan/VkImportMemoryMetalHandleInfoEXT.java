package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryMetalHandleInfoEXT.class */
public class VkImportMemoryMetalHandleInfoEXT extends Struct<VkImportMemoryMetalHandleInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HANDLETYPE;
    public static final int HANDLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
    }

    protected VkImportMemoryMetalHandleInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportMemoryMetalHandleInfoEXT create(long address, ByteBuffer container) {
        return new VkImportMemoryMetalHandleInfoEXT(address, container);
    }

    public VkImportMemoryMetalHandleInfoEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long handle() {
        return nhandle(address());
    }

    public VkImportMemoryMetalHandleInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportMemoryMetalHandleInfoEXT sType$Default() {
        return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT);
    }

    public VkImportMemoryMetalHandleInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportMemoryMetalHandleInfoEXT handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkImportMemoryMetalHandleInfoEXT handle(@NativeType("void *") long value) {
        nhandle(address(), value);
        return this;
    }

    public VkImportMemoryMetalHandleInfoEXT set(int sType, long pNext, int handleType, long handle) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        handle(handle);
        return this;
    }

    public VkImportMemoryMetalHandleInfoEXT set(VkImportMemoryMetalHandleInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportMemoryMetalHandleInfoEXT malloc() {
        return new VkImportMemoryMetalHandleInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportMemoryMetalHandleInfoEXT calloc() {
        return new VkImportMemoryMetalHandleInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportMemoryMetalHandleInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMemoryMetalHandleInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImportMemoryMetalHandleInfoEXT create(long address) {
        return new VkImportMemoryMetalHandleInfoEXT(address, null);
    }

    public static VkImportMemoryMetalHandleInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportMemoryMetalHandleInfoEXT(address, null);
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

    public static VkImportMemoryMetalHandleInfoEXT malloc(MemoryStack stack) {
        return new VkImportMemoryMetalHandleInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportMemoryMetalHandleInfoEXT calloc(MemoryStack stack) {
        return new VkImportMemoryMetalHandleInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
        MemoryUtil.memPutAddress(struct + HANDLE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryMetalHandleInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportMemoryMetalHandleInfoEXT, Buffer> implements NativeResource {
        private static final VkImportMemoryMetalHandleInfoEXT ELEMENT_FACTORY = VkImportMemoryMetalHandleInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportMemoryMetalHandleInfoEXT.SIZEOF);
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
        public VkImportMemoryMetalHandleInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportMemoryMetalHandleInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportMemoryMetalHandleInfoEXT.npNext(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() {
            return VkImportMemoryMetalHandleInfoEXT.nhandleType(address());
        }

        @NativeType("void *")
        public long handle() {
            return VkImportMemoryMetalHandleInfoEXT.nhandle(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportMemoryMetalHandleInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportMemoryMetalHandleInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkImportMemoryMetalHandleInfoEXT.nhandleType(address(), value);
            return this;
        }

        public Buffer handle(@NativeType("void *") long value) {
            VkImportMemoryMetalHandleInfoEXT.nhandle(address(), value);
            return this;
        }
    }
}
