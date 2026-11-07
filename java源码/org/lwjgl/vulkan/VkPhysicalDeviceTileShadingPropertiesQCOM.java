package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileShadingPropertiesQCOM.class */
public class VkPhysicalDeviceTileShadingPropertiesQCOM extends Struct<VkPhysicalDeviceTileShadingPropertiesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXAPRONSIZE;
    public static final int PREFERNONCOHERENT;
    public static final int TILEGRANULARITY;
    public static final int MAXTILESHADINGRATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXAPRONSIZE = layout.offsetof(2);
        PREFERNONCOHERENT = layout.offsetof(3);
        TILEGRANULARITY = layout.offsetof(4);
        MAXTILESHADINGRATE = layout.offsetof(5);
    }

    protected VkPhysicalDeviceTileShadingPropertiesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTileShadingPropertiesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(address, container);
    }

    public VkPhysicalDeviceTileShadingPropertiesQCOM(ByteBuffer container) {
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
    public int maxApronSize() {
        return nmaxApronSize(address());
    }

    @NativeType("VkBool32")
    public boolean preferNonCoherent() {
        return npreferNonCoherent(address()) != 0;
    }

    public VkExtent2D tileGranularity() {
        return ntileGranularity(address());
    }

    public VkExtent2D maxTileShadingRate() {
        return nmaxTileShadingRate(address());
    }

    public VkPhysicalDeviceTileShadingPropertiesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileShadingPropertiesQCOM sType$Default() {
        return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM);
    }

    public VkPhysicalDeviceTileShadingPropertiesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileShadingPropertiesQCOM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceTileShadingPropertiesQCOM set(VkPhysicalDeviceTileShadingPropertiesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM malloc() {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM calloc() {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM create(long address) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(address, null);
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(address, null);
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

    public static VkPhysicalDeviceTileShadingPropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileShadingPropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxApronSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXAPRONSIZE);
    }

    public static int npreferNonCoherent(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERNONCOHERENT);
    }

    public static VkExtent2D ntileGranularity(long struct) {
        return VkExtent2D.create(struct + TILEGRANULARITY);
    }

    public static VkExtent2D nmaxTileShadingRate(long struct) {
        return VkExtent2D.create(struct + MAXTILESHADINGRATE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileShadingPropertiesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTileShadingPropertiesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTileShadingPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTileShadingPropertiesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTileShadingPropertiesQCOM.SIZEOF);
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
        public VkPhysicalDeviceTileShadingPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTileShadingPropertiesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTileShadingPropertiesQCOM.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxApronSize() {
            return VkPhysicalDeviceTileShadingPropertiesQCOM.nmaxApronSize(address());
        }

        @NativeType("VkBool32")
        public boolean preferNonCoherent() {
            return VkPhysicalDeviceTileShadingPropertiesQCOM.npreferNonCoherent(address()) != 0;
        }

        public VkExtent2D tileGranularity() {
            return VkPhysicalDeviceTileShadingPropertiesQCOM.ntileGranularity(address());
        }

        public VkExtent2D maxTileShadingRate() {
            return VkPhysicalDeviceTileShadingPropertiesQCOM.nmaxTileShadingRate(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTileShadingPropertiesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTileShadingPropertiesQCOM.npNext(address(), value);
            return this;
        }
    }
}
