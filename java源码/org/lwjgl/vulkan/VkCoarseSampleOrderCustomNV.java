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
import org.lwjgl.vulkan.VkCoarseSampleLocationNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCoarseSampleOrderCustomNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCoarseSampleOrderCustomNV.class */
public class VkCoarseSampleOrderCustomNV extends Struct<VkCoarseSampleOrderCustomNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SHADINGRATE;
    public static final int SAMPLECOUNT;
    public static final int SAMPLELOCATIONCOUNT;
    public static final int PSAMPLELOCATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SHADINGRATE = layout.offsetof(0);
        SAMPLECOUNT = layout.offsetof(1);
        SAMPLELOCATIONCOUNT = layout.offsetof(2);
        PSAMPLELOCATIONS = layout.offsetof(3);
    }

    protected VkCoarseSampleOrderCustomNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCoarseSampleOrderCustomNV create(long address, ByteBuffer container) {
        return new VkCoarseSampleOrderCustomNV(address, container);
    }

    public VkCoarseSampleOrderCustomNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkShadingRatePaletteEntryNV")
    public int shadingRate() {
        return nshadingRate(address());
    }

    @NativeType("uint32_t")
    public int sampleCount() {
        return nsampleCount(address());
    }

    @NativeType("uint32_t")
    public int sampleLocationCount() {
        return nsampleLocationCount(address());
    }

    @NativeType("VkCoarseSampleLocationNV const *")
    public VkCoarseSampleLocationNV.Buffer pSampleLocations() {
        return npSampleLocations(address());
    }

    public VkCoarseSampleOrderCustomNV shadingRate(@NativeType("VkShadingRatePaletteEntryNV") int value) {
        nshadingRate(address(), value);
        return this;
    }

    public VkCoarseSampleOrderCustomNV sampleCount(@NativeType("uint32_t") int value) {
        nsampleCount(address(), value);
        return this;
    }

    public VkCoarseSampleOrderCustomNV pSampleLocations(@NativeType("VkCoarseSampleLocationNV const *") VkCoarseSampleLocationNV.Buffer value) {
        npSampleLocations(address(), value);
        return this;
    }

    public VkCoarseSampleOrderCustomNV set(int shadingRate, int sampleCount, VkCoarseSampleLocationNV.Buffer pSampleLocations) {
        shadingRate(shadingRate);
        sampleCount(sampleCount);
        pSampleLocations(pSampleLocations);
        return this;
    }

    public VkCoarseSampleOrderCustomNV set(VkCoarseSampleOrderCustomNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCoarseSampleOrderCustomNV malloc() {
        return new VkCoarseSampleOrderCustomNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCoarseSampleOrderCustomNV calloc() {
        return new VkCoarseSampleOrderCustomNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCoarseSampleOrderCustomNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCoarseSampleOrderCustomNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCoarseSampleOrderCustomNV create(long address) {
        return new VkCoarseSampleOrderCustomNV(address, null);
    }

    public static VkCoarseSampleOrderCustomNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCoarseSampleOrderCustomNV(address, null);
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

    public static VkCoarseSampleOrderCustomNV malloc(MemoryStack stack) {
        return new VkCoarseSampleOrderCustomNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCoarseSampleOrderCustomNV calloc(MemoryStack stack) {
        return new VkCoarseSampleOrderCustomNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nshadingRate(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATE);
    }

    public static int nsampleCount(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLECOUNT);
    }

    public static int nsampleLocationCount(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLELOCATIONCOUNT);
    }

    public static VkCoarseSampleLocationNV.Buffer npSampleLocations(long struct) {
        return VkCoarseSampleLocationNV.create(MemoryUtil.memGetAddress(struct + PSAMPLELOCATIONS), nsampleLocationCount(struct));
    }

    public static void nshadingRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADINGRATE, value);
    }

    public static void nsampleCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLECOUNT, value);
    }

    public static void nsampleLocationCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLELOCATIONCOUNT, value);
    }

    public static void npSampleLocations(long struct, VkCoarseSampleLocationNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSAMPLELOCATIONS, value.address());
        nsampleLocationCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSAMPLELOCATIONS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCoarseSampleOrderCustomNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCoarseSampleOrderCustomNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCoarseSampleOrderCustomNV, Buffer> implements NativeResource {
        private static final VkCoarseSampleOrderCustomNV ELEMENT_FACTORY = VkCoarseSampleOrderCustomNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCoarseSampleOrderCustomNV.SIZEOF);
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
        public VkCoarseSampleOrderCustomNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkShadingRatePaletteEntryNV")
        public int shadingRate() {
            return VkCoarseSampleOrderCustomNV.nshadingRate(address());
        }

        @NativeType("uint32_t")
        public int sampleCount() {
            return VkCoarseSampleOrderCustomNV.nsampleCount(address());
        }

        @NativeType("uint32_t")
        public int sampleLocationCount() {
            return VkCoarseSampleOrderCustomNV.nsampleLocationCount(address());
        }

        @NativeType("VkCoarseSampleLocationNV const *")
        public VkCoarseSampleLocationNV.Buffer pSampleLocations() {
            return VkCoarseSampleOrderCustomNV.npSampleLocations(address());
        }

        public Buffer shadingRate(@NativeType("VkShadingRatePaletteEntryNV") int value) {
            VkCoarseSampleOrderCustomNV.nshadingRate(address(), value);
            return this;
        }

        public Buffer sampleCount(@NativeType("uint32_t") int value) {
            VkCoarseSampleOrderCustomNV.nsampleCount(address(), value);
            return this;
        }

        public Buffer pSampleLocations(@NativeType("VkCoarseSampleLocationNV const *") VkCoarseSampleLocationNV.Buffer value) {
            VkCoarseSampleOrderCustomNV.npSampleLocations(address(), value);
            return this;
        }
    }
}
