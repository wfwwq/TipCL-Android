package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.class */
public class VkPhysicalDeviceTileMemoryHeapFeaturesQCOM extends Struct<VkPhysicalDeviceTileMemoryHeapFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TILEMEMORYHEAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILEMEMORYHEAP = layout.offsetof(2);
    }

    protected VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(ByteBuffer container) {
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
    public boolean tileMemoryHeap() {
        return ntileMemoryHeap(address()) != 0;
    }

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM sType$Default() {
        return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM);
    }

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM tileMemoryHeap(@NativeType("VkBool32") boolean value) {
        ntileMemoryHeap(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM set(int sType, long pNext, boolean tileMemoryHeap) {
        sType(sType);
        pNext(pNext);
        tileMemoryHeap(tileMemoryHeap);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM set(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM malloc() {
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM calloc() {
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntileMemoryHeap(long struct) {
        return MemoryUtil.memGetInt(struct + TILEMEMORYHEAP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntileMemoryHeap(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILEMEMORYHEAP, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileMemoryHeapFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTileMemoryHeapFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTileMemoryHeapFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean tileMemoryHeap() {
            return VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.ntileMemoryHeap(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer tileMemoryHeap(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileMemoryHeapFeaturesQCOM.ntileMemoryHeap(address(), value ? 1 : 0);
            return this;
        }
    }
}
