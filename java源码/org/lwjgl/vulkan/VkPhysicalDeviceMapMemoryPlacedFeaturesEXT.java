package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.class */
public class VkPhysicalDeviceMapMemoryPlacedFeaturesEXT extends Struct<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORYMAPPLACED;
    public static final int MEMORYMAPRANGEPLACED;
    public static final int MEMORYUNMAPRESERVE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYMAPPLACED = layout.offsetof(2);
        MEMORYMAPRANGEPLACED = layout.offsetof(3);
        MEMORYUNMAPRESERVE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean memoryMapPlaced() {
        return nmemoryMapPlaced(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean memoryMapRangePlaced() {
        return nmemoryMapRangePlaced(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean memoryUnmapReserve() {
        return nmemoryUnmapReserve(address()) != 0;
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType$Default() {
        return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT);
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlaced(@NativeType("VkBool32") boolean value) {
        nmemoryMapPlaced(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlaced(@NativeType("VkBool32") boolean value) {
        nmemoryMapRangePlaced(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserve(@NativeType("VkBool32") boolean value) {
        nmemoryUnmapReserve(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT set(int sType, long pNext, boolean memoryMapPlaced, boolean memoryMapRangePlaced, boolean memoryUnmapReserve) {
        sType(sType);
        pNext(pNext);
        memoryMapPlaced(memoryMapPlaced);
        memoryMapRangePlaced(memoryMapRangePlaced);
        memoryUnmapReserve(memoryUnmapReserve);
        return this;
    }

    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT set(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT malloc() {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT calloc() {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmemoryMapPlaced(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYMAPPLACED);
    }

    public static int nmemoryMapRangePlaced(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYMAPRANGEPLACED);
    }

    public static int nmemoryUnmapReserve(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYUNMAPRESERVE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemoryMapPlaced(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYMAPPLACED, value);
    }

    public static void nmemoryMapRangePlaced(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYMAPRANGEPLACED, value);
    }

    public static void nmemoryUnmapReserve(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYUNMAPRESERVE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMapMemoryPlacedFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean memoryMapPlaced() {
            return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapPlaced(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean memoryMapRangePlaced() {
            return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapRangePlaced(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean memoryUnmapReserve() {
            return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryUnmapReserve(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer memoryMapPlaced(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapPlaced(address(), value ? 1 : 0);
            return this;
        }

        public Buffer memoryMapRangePlaced(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapRangePlaced(address(), value ? 1 : 0);
            return this;
        }

        public Buffer memoryUnmapReserve(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryUnmapReserve(address(), value ? 1 : 0);
            return this;
        }
    }
}
