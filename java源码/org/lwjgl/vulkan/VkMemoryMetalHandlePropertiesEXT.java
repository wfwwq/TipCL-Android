package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMetalHandlePropertiesEXT.class */
public class VkMemoryMetalHandlePropertiesEXT extends Struct<VkMemoryMetalHandlePropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORYTYPEBITS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    protected VkMemoryMetalHandlePropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryMetalHandlePropertiesEXT create(long address, ByteBuffer container) {
        return new VkMemoryMetalHandlePropertiesEXT(address, container);
    }

    public VkMemoryMetalHandlePropertiesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int memoryTypeBits() {
        return nmemoryTypeBits(address());
    }

    public VkMemoryMetalHandlePropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryMetalHandlePropertiesEXT sType$Default() {
        return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT);
    }

    public VkMemoryMetalHandlePropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryMetalHandlePropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkMemoryMetalHandlePropertiesEXT set(VkMemoryMetalHandlePropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryMetalHandlePropertiesEXT malloc() {
        return new VkMemoryMetalHandlePropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryMetalHandlePropertiesEXT calloc() {
        return new VkMemoryMetalHandlePropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryMetalHandlePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMetalHandlePropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryMetalHandlePropertiesEXT create(long address) {
        return new VkMemoryMetalHandlePropertiesEXT(address, null);
    }

    public static VkMemoryMetalHandlePropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryMetalHandlePropertiesEXT(address, null);
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

    public static VkMemoryMetalHandlePropertiesEXT malloc(MemoryStack stack) {
        return new VkMemoryMetalHandlePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryMetalHandlePropertiesEXT calloc(MemoryStack stack) {
        return new VkMemoryMetalHandlePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmemoryTypeBits(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPEBITS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMetalHandlePropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryMetalHandlePropertiesEXT, Buffer> implements NativeResource {
        private static final VkMemoryMetalHandlePropertiesEXT ELEMENT_FACTORY = VkMemoryMetalHandlePropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryMetalHandlePropertiesEXT.SIZEOF);
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
        public VkMemoryMetalHandlePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryMetalHandlePropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkMemoryMetalHandlePropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int memoryTypeBits() {
            return VkMemoryMetalHandlePropertiesEXT.nmemoryTypeBits(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryMetalHandlePropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkMemoryMetalHandlePropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
