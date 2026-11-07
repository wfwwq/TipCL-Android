package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapPlacedInfoEXT.class */
public class VkMemoryMapPlacedInfoEXT extends Struct<VkMemoryMapPlacedInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PPLACEDADDRESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PPLACEDADDRESS = layout.offsetof(2);
    }

    protected VkMemoryMapPlacedInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryMapPlacedInfoEXT create(long address, ByteBuffer container) {
        return new VkMemoryMapPlacedInfoEXT(address, container);
    }

    public VkMemoryMapPlacedInfoEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pPlacedAddress() {
        return npPlacedAddress(address());
    }

    public VkMemoryMapPlacedInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryMapPlacedInfoEXT sType$Default() {
        return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT);
    }

    public VkMemoryMapPlacedInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryMapPlacedInfoEXT pPlacedAddress(@NativeType("void *") long value) {
        npPlacedAddress(address(), value);
        return this;
    }

    public VkMemoryMapPlacedInfoEXT set(int sType, long pNext, long pPlacedAddress) {
        sType(sType);
        pNext(pNext);
        pPlacedAddress(pPlacedAddress);
        return this;
    }

    public VkMemoryMapPlacedInfoEXT set(VkMemoryMapPlacedInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryMapPlacedInfoEXT malloc() {
        return new VkMemoryMapPlacedInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryMapPlacedInfoEXT calloc() {
        return new VkMemoryMapPlacedInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryMapPlacedInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMapPlacedInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryMapPlacedInfoEXT create(long address) {
        return new VkMemoryMapPlacedInfoEXT(address, null);
    }

    public static VkMemoryMapPlacedInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryMapPlacedInfoEXT(address, null);
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

    public static VkMemoryMapPlacedInfoEXT malloc(MemoryStack stack) {
        return new VkMemoryMapPlacedInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryMapPlacedInfoEXT calloc(MemoryStack stack) {
        return new VkMemoryMapPlacedInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npPlacedAddress(long struct) {
        return MemoryUtil.memGetAddress(struct + PPLACEDADDRESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npPlacedAddress(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PPLACEDADDRESS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapPlacedInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryMapPlacedInfoEXT, Buffer> implements NativeResource {
        private static final VkMemoryMapPlacedInfoEXT ELEMENT_FACTORY = VkMemoryMapPlacedInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryMapPlacedInfoEXT.SIZEOF);
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
        public VkMemoryMapPlacedInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryMapPlacedInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryMapPlacedInfoEXT.npNext(address());
        }

        @NativeType("void *")
        public long pPlacedAddress() {
            return VkMemoryMapPlacedInfoEXT.npPlacedAddress(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryMapPlacedInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryMapPlacedInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pPlacedAddress(@NativeType("void *") long value) {
            VkMemoryMapPlacedInfoEXT.npPlacedAddress(address(), value);
            return this;
        }
    }
}
