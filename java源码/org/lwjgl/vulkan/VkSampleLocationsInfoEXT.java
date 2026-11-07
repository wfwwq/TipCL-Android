package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkSampleLocationEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationsInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationsInfoEXT.class */
public class VkSampleLocationsInfoEXT extends Struct<VkSampleLocationsInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLELOCATIONSPERPIXEL;
    public static final int SAMPLELOCATIONGRIDSIZE;
    public static final int SAMPLELOCATIONSCOUNT;
    public static final int PSAMPLELOCATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSPERPIXEL = layout.offsetof(2);
        SAMPLELOCATIONGRIDSIZE = layout.offsetof(3);
        SAMPLELOCATIONSCOUNT = layout.offsetof(4);
        PSAMPLELOCATIONS = layout.offsetof(5);
    }

    protected VkSampleLocationsInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSampleLocationsInfoEXT create(long address, ByteBuffer container) {
        return new VkSampleLocationsInfoEXT(address, container);
    }

    public VkSampleLocationsInfoEXT(ByteBuffer container) {
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

    @NativeType("VkSampleCountFlagBits")
    public int sampleLocationsPerPixel() {
        return nsampleLocationsPerPixel(address());
    }

    public VkExtent2D sampleLocationGridSize() {
        return nsampleLocationGridSize(address());
    }

    @NativeType("uint32_t")
    public int sampleLocationsCount() {
        return nsampleLocationsCount(address());
    }

    @NativeType("VkSampleLocationEXT const *")
    public VkSampleLocationEXT.Buffer pSampleLocations() {
        return npSampleLocations(address());
    }

    public VkSampleLocationsInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSampleLocationsInfoEXT sType$Default() {
        return sType(1000143000);
    }

    public VkSampleLocationsInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSampleLocationsInfoEXT sampleLocationsPerPixel(@NativeType("VkSampleCountFlagBits") int value) {
        nsampleLocationsPerPixel(address(), value);
        return this;
    }

    public VkSampleLocationsInfoEXT sampleLocationGridSize(VkExtent2D value) {
        nsampleLocationGridSize(address(), value);
        return this;
    }

    public VkSampleLocationsInfoEXT sampleLocationGridSize(Consumer<VkExtent2D> consumer) {
        consumer.accept(sampleLocationGridSize());
        return this;
    }

    public VkSampleLocationsInfoEXT pSampleLocations(@NativeType("VkSampleLocationEXT const *") VkSampleLocationEXT.Buffer value) {
        npSampleLocations(address(), value);
        return this;
    }

    public VkSampleLocationsInfoEXT set(int sType, long pNext, int sampleLocationsPerPixel, VkExtent2D sampleLocationGridSize, VkSampleLocationEXT.Buffer pSampleLocations) {
        sType(sType);
        pNext(pNext);
        sampleLocationsPerPixel(sampleLocationsPerPixel);
        sampleLocationGridSize(sampleLocationGridSize);
        pSampleLocations(pSampleLocations);
        return this;
    }

    public VkSampleLocationsInfoEXT set(VkSampleLocationsInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSampleLocationsInfoEXT malloc() {
        return new VkSampleLocationsInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSampleLocationsInfoEXT calloc() {
        return new VkSampleLocationsInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSampleLocationsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSampleLocationsInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSampleLocationsInfoEXT create(long address) {
        return new VkSampleLocationsInfoEXT(address, null);
    }

    public static VkSampleLocationsInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSampleLocationsInfoEXT(address, null);
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

    public static VkSampleLocationsInfoEXT malloc(MemoryStack stack) {
        return new VkSampleLocationsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSampleLocationsInfoEXT calloc(MemoryStack stack) {
        return new VkSampleLocationsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsampleLocationsPerPixel(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLELOCATIONSPERPIXEL);
    }

    public static VkExtent2D nsampleLocationGridSize(long struct) {
        return VkExtent2D.create(struct + SAMPLELOCATIONGRIDSIZE);
    }

    public static int nsampleLocationsCount(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLELOCATIONSCOUNT);
    }

    public static VkSampleLocationEXT.Buffer npSampleLocations(long struct) {
        return VkSampleLocationEXT.createSafe(MemoryUtil.memGetAddress(struct + PSAMPLELOCATIONS), nsampleLocationsCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsampleLocationsPerPixel(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLELOCATIONSPERPIXEL, value);
    }

    public static void nsampleLocationGridSize(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + SAMPLELOCATIONGRIDSIZE, VkExtent2D.SIZEOF);
    }

    public static void nsampleLocationsCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLELOCATIONSCOUNT, value);
    }

    public static void npSampleLocations(long struct, VkSampleLocationEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSAMPLELOCATIONS, MemoryUtil.memAddressSafe(value));
        nsampleLocationsCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nsampleLocationsCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PSAMPLELOCATIONS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationsInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSampleLocationsInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSampleLocationsInfoEXT, Buffer> implements NativeResource {
        private static final VkSampleLocationsInfoEXT ELEMENT_FACTORY = VkSampleLocationsInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSampleLocationsInfoEXT.SIZEOF);
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
        public VkSampleLocationsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSampleLocationsInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSampleLocationsInfoEXT.npNext(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int sampleLocationsPerPixel() {
            return VkSampleLocationsInfoEXT.nsampleLocationsPerPixel(address());
        }

        public VkExtent2D sampleLocationGridSize() {
            return VkSampleLocationsInfoEXT.nsampleLocationGridSize(address());
        }

        @NativeType("uint32_t")
        public int sampleLocationsCount() {
            return VkSampleLocationsInfoEXT.nsampleLocationsCount(address());
        }

        @NativeType("VkSampleLocationEXT const *")
        public VkSampleLocationEXT.Buffer pSampleLocations() {
            return VkSampleLocationsInfoEXT.npSampleLocations(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSampleLocationsInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000143000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSampleLocationsInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer sampleLocationsPerPixel(@NativeType("VkSampleCountFlagBits") int value) {
            VkSampleLocationsInfoEXT.nsampleLocationsPerPixel(address(), value);
            return this;
        }

        public Buffer sampleLocationGridSize(VkExtent2D value) {
            VkSampleLocationsInfoEXT.nsampleLocationGridSize(address(), value);
            return this;
        }

        public Buffer sampleLocationGridSize(Consumer<VkExtent2D> consumer) {
            consumer.accept(sampleLocationGridSize());
            return this;
        }

        public Buffer pSampleLocations(@NativeType("VkSampleLocationEXT const *") VkSampleLocationEXT.Buffer value) {
            VkSampleLocationsInfoEXT.npSampleLocations(address(), value);
            return this;
        }
    }
}
