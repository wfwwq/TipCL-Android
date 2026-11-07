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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingPropertiesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingPropertiesQCOM.class */
public class VkPhysicalDeviceImageProcessingPropertiesQCOM extends Struct<VkPhysicalDeviceImageProcessingPropertiesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXWEIGHTFILTERPHASES;
    public static final int MAXWEIGHTFILTERDIMENSION;
    public static final int MAXBLOCKMATCHREGION;
    public static final int MAXBOXFILTERBLOCKSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXWEIGHTFILTERPHASES = layout.offsetof(2);
        MAXWEIGHTFILTERDIMENSION = layout.offsetof(3);
        MAXBLOCKMATCHREGION = layout.offsetof(4);
        MAXBOXFILTERBLOCKSIZE = layout.offsetof(5);
    }

    protected VkPhysicalDeviceImageProcessingPropertiesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageProcessingPropertiesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(address, container);
    }

    public VkPhysicalDeviceImageProcessingPropertiesQCOM(ByteBuffer container) {
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
    public int maxWeightFilterPhases() {
        return nmaxWeightFilterPhases(address());
    }

    public VkExtent2D maxWeightFilterDimension() {
        return nmaxWeightFilterDimension(address());
    }

    public VkExtent2D maxBlockMatchRegion() {
        return nmaxBlockMatchRegion(address());
    }

    public VkExtent2D maxBoxFilterBlockSize() {
        return nmaxBoxFilterBlockSize(address());
    }

    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageProcessingPropertiesQCOM sType$Default() {
        return sType(1000440001);
    }

    public VkPhysicalDeviceImageProcessingPropertiesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageProcessingPropertiesQCOM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceImageProcessingPropertiesQCOM set(VkPhysicalDeviceImageProcessingPropertiesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(address, null);
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(address, null);
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

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessingPropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingPropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxWeightFilterPhases(long struct) {
        return MemoryUtil.memGetInt(struct + MAXWEIGHTFILTERPHASES);
    }

    public static VkExtent2D nmaxWeightFilterDimension(long struct) {
        return VkExtent2D.create(struct + MAXWEIGHTFILTERDIMENSION);
    }

    public static VkExtent2D nmaxBlockMatchRegion(long struct) {
        return VkExtent2D.create(struct + MAXBLOCKMATCHREGION);
    }

    public static VkExtent2D nmaxBoxFilterBlockSize(long struct) {
        return VkExtent2D.create(struct + MAXBOXFILTERBLOCKSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingPropertiesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingPropertiesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessingPropertiesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageProcessingPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessingPropertiesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageProcessingPropertiesQCOM.SIZEOF);
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
        public VkPhysicalDeviceImageProcessingPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageProcessingPropertiesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageProcessingPropertiesQCOM.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxWeightFilterPhases() {
            return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxWeightFilterPhases(address());
        }

        public VkExtent2D maxWeightFilterDimension() {
            return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxWeightFilterDimension(address());
        }

        public VkExtent2D maxBlockMatchRegion() {
            return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxBlockMatchRegion(address());
        }

        public VkExtent2D maxBoxFilterBlockSize() {
            return VkPhysicalDeviceImageProcessingPropertiesQCOM.nmaxBoxFilterBlockSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageProcessingPropertiesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000440001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageProcessingPropertiesQCOM.npNext(address(), value);
            return this;
        }
    }
}
