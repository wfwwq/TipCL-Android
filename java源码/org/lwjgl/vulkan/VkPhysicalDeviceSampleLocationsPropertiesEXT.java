package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSampleLocationsPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSampleLocationsPropertiesEXT.class */
public class VkPhysicalDeviceSampleLocationsPropertiesEXT extends Struct<VkPhysicalDeviceSampleLocationsPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLELOCATIONSAMPLECOUNTS;
    public static final int MAXSAMPLELOCATIONGRIDSIZE;
    public static final int SAMPLELOCATIONCOORDINATERANGE;
    public static final int SAMPLELOCATIONSUBPIXELBITS;
    public static final int VARIABLESAMPLELOCATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __array(4, 2), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSAMPLECOUNTS = layout.offsetof(2);
        MAXSAMPLELOCATIONGRIDSIZE = layout.offsetof(3);
        SAMPLELOCATIONCOORDINATERANGE = layout.offsetof(4);
        SAMPLELOCATIONSUBPIXELBITS = layout.offsetof(5);
        VARIABLESAMPLELOCATIONS = layout.offsetof(6);
    }

    protected VkPhysicalDeviceSampleLocationsPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSampleLocationsPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT(ByteBuffer container) {
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

    @NativeType("VkSampleCountFlags")
    public int sampleLocationSampleCounts() {
        return nsampleLocationSampleCounts(address());
    }

    public VkExtent2D maxSampleLocationGridSize() {
        return nmaxSampleLocationGridSize(address());
    }

    @NativeType("float[2]")
    public FloatBuffer sampleLocationCoordinateRange() {
        return nsampleLocationCoordinateRange(address());
    }

    public float sampleLocationCoordinateRange(int index) {
        return nsampleLocationCoordinateRange(address(), index);
    }

    @NativeType("uint32_t")
    public int sampleLocationSubPixelBits() {
        return nsampleLocationSubPixelBits(address());
    }

    @NativeType("VkBool32")
    public boolean variableSampleLocations() {
        return nvariableSampleLocations(address()) != 0;
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType$Default() {
        return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(VkPhysicalDeviceSampleLocationsPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT malloc() {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT calloc() {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT create(long address) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsampleLocationSampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLELOCATIONSAMPLECOUNTS);
    }

    public static VkExtent2D nmaxSampleLocationGridSize(long struct) {
        return VkExtent2D.create(struct + MAXSAMPLELOCATIONGRIDSIZE);
    }

    public static FloatBuffer nsampleLocationCoordinateRange(long struct) {
        return MemoryUtil.memFloatBuffer(struct + SAMPLELOCATIONCOORDINATERANGE, 2);
    }

    public static float nsampleLocationCoordinateRange(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + SAMPLELOCATIONCOORDINATERANGE + (Checks.check(index, 2) * 4));
    }

    public static int nsampleLocationSubPixelBits(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLELOCATIONSUBPIXELBITS);
    }

    public static int nvariableSampleLocations(long struct) {
        return MemoryUtil.memGetInt(struct + VARIABLESAMPLELOCATIONS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSampleLocationsPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSampleLocationsPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSampleLocationsPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSampleLocationsPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceSampleLocationsPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSampleLocationsPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceSampleLocationsPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address());
        }

        @NativeType("VkSampleCountFlags")
        public int sampleLocationSampleCounts() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSampleCounts(address());
        }

        public VkExtent2D maxSampleLocationGridSize() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.nmaxSampleLocationGridSize(address());
        }

        @NativeType("float[2]")
        public FloatBuffer sampleLocationCoordinateRange() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address());
        }

        public float sampleLocationCoordinateRange(int index) {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address(), index);
        }

        @NativeType("uint32_t")
        public int sampleLocationSubPixelBits() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSubPixelBits(address());
        }

        @NativeType("VkBool32")
        public boolean variableSampleLocations() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.nvariableSampleLocations(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
