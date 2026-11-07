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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryHostPointerInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryHostPointerInfoEXT.class */
public class VkImportMemoryHostPointerInfoEXT extends Struct<VkImportMemoryHostPointerInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HANDLETYPE;
    public static final int PHOSTPOINTER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
        PHOSTPOINTER = layout.offsetof(3);
    }

    protected VkImportMemoryHostPointerInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportMemoryHostPointerInfoEXT create(long address, ByteBuffer container) {
        return new VkImportMemoryHostPointerInfoEXT(address, container);
    }

    public VkImportMemoryHostPointerInfoEXT(ByteBuffer container) {
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
    public long pHostPointer() {
        return npHostPointer(address());
    }

    public VkImportMemoryHostPointerInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportMemoryHostPointerInfoEXT sType$Default() {
        return sType(EXTExternalMemoryHost.VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT);
    }

    public VkImportMemoryHostPointerInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportMemoryHostPointerInfoEXT handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkImportMemoryHostPointerInfoEXT pHostPointer(@NativeType("void *") long value) {
        npHostPointer(address(), value);
        return this;
    }

    public VkImportMemoryHostPointerInfoEXT set(int sType, long pNext, int handleType, long pHostPointer) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        pHostPointer(pHostPointer);
        return this;
    }

    public VkImportMemoryHostPointerInfoEXT set(VkImportMemoryHostPointerInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportMemoryHostPointerInfoEXT malloc() {
        return new VkImportMemoryHostPointerInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportMemoryHostPointerInfoEXT calloc() {
        return new VkImportMemoryHostPointerInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportMemoryHostPointerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMemoryHostPointerInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImportMemoryHostPointerInfoEXT create(long address) {
        return new VkImportMemoryHostPointerInfoEXT(address, null);
    }

    public static VkImportMemoryHostPointerInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportMemoryHostPointerInfoEXT(address, null);
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

    public static VkImportMemoryHostPointerInfoEXT malloc(MemoryStack stack) {
        return new VkImportMemoryHostPointerInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportMemoryHostPointerInfoEXT calloc(MemoryStack stack) {
        return new VkImportMemoryHostPointerInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npHostPointer(long struct) {
        return MemoryUtil.memGetAddress(struct + PHOSTPOINTER);
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

    public static void npHostPointer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PHOSTPOINTER, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PHOSTPOINTER));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryHostPointerInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMemoryHostPointerInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportMemoryHostPointerInfoEXT, Buffer> implements NativeResource {
        private static final VkImportMemoryHostPointerInfoEXT ELEMENT_FACTORY = VkImportMemoryHostPointerInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportMemoryHostPointerInfoEXT.SIZEOF);
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
        public VkImportMemoryHostPointerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportMemoryHostPointerInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportMemoryHostPointerInfoEXT.npNext(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() {
            return VkImportMemoryHostPointerInfoEXT.nhandleType(address());
        }

        @NativeType("void *")
        public long pHostPointer() {
            return VkImportMemoryHostPointerInfoEXT.npHostPointer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportMemoryHostPointerInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTExternalMemoryHost.VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportMemoryHostPointerInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkImportMemoryHostPointerInfoEXT.nhandleType(address(), value);
            return this;
        }

        public Buffer pHostPointer(@NativeType("void *") long value) {
            VkImportMemoryHostPointerInfoEXT.npHostPointer(address(), value);
            return this;
        }
    }
}
