package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkShadingRatePaletteNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportShadingRateImageStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportShadingRateImageStateCreateInfoNV.class */
public class VkPipelineViewportShadingRateImageStateCreateInfoNV extends Struct<VkPipelineViewportShadingRateImageStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADINGRATEIMAGEENABLE;
    public static final int VIEWPORTCOUNT;
    public static final int PSHADINGRATEPALETTES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATEIMAGEENABLE = layout.offsetof(2);
        VIEWPORTCOUNT = layout.offsetof(3);
        PSHADINGRATEPALETTES = layout.offsetof(4);
    }

    protected VkPipelineViewportShadingRateImageStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportShadingRateImageStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(address, container);
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean shadingRateImageEnable() {
        return nshadingRateImageEnable(address()) != 0;
    }

    @NativeType("uint32_t")
    public int viewportCount() {
        return nviewportCount(address());
    }

    @NativeType("VkShadingRatePaletteNV const *")
    public VkShadingRatePaletteNV.Buffer pShadingRatePalettes() {
        return npShadingRatePalettes(address());
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV sType$Default() {
        return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV);
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV shadingRateImageEnable(@NativeType("VkBool32") boolean value) {
        nshadingRateImageEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV viewportCount(@NativeType("uint32_t") int value) {
        nviewportCount(address(), value);
        return this;
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV pShadingRatePalettes(@NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.Buffer value) {
        npShadingRatePalettes(address(), value);
        return this;
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV set(int sType, long pNext, boolean shadingRateImageEnable, int viewportCount, VkShadingRatePaletteNV.Buffer pShadingRatePalettes) {
        sType(sType);
        pNext(pNext);
        shadingRateImageEnable(shadingRateImageEnable);
        viewportCount(viewportCount);
        pShadingRatePalettes(pShadingRatePalettes);
        return this;
    }

    public VkPipelineViewportShadingRateImageStateCreateInfoNV set(VkPipelineViewportShadingRateImageStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV malloc() {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV calloc() {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV create(long address) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(address, null);
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(address, null);
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

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshadingRateImageEnable(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATEIMAGEENABLE);
    }

    public static int nviewportCount(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWPORTCOUNT);
    }

    public static VkShadingRatePaletteNV.Buffer npShadingRatePalettes(long struct) {
        return VkShadingRatePaletteNV.createSafe(MemoryUtil.memGetAddress(struct + PSHADINGRATEPALETTES), nviewportCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshadingRateImageEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADINGRATEIMAGEENABLE, value);
    }

    public static void nviewportCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWPORTCOUNT, value);
    }

    public static void npShadingRatePalettes(long struct, VkShadingRatePaletteNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSHADINGRATEPALETTES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nviewportCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportShadingRateImageStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportShadingRateImageStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportShadingRateImageStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineViewportShadingRateImageStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportShadingRateImageStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportShadingRateImageStateCreateInfoNV.SIZEOF);
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
        public VkPipelineViewportShadingRateImageStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportShadingRateImageStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportShadingRateImageStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shadingRateImageEnable() {
            return VkPipelineViewportShadingRateImageStateCreateInfoNV.nshadingRateImageEnable(address()) != 0;
        }

        @NativeType("uint32_t")
        public int viewportCount() {
            return VkPipelineViewportShadingRateImageStateCreateInfoNV.nviewportCount(address());
        }

        @NativeType("VkShadingRatePaletteNV const *")
        public VkShadingRatePaletteNV.Buffer pShadingRatePalettes() {
            return VkPipelineViewportShadingRateImageStateCreateInfoNV.npShadingRatePalettes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportShadingRateImageStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportShadingRateImageStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer shadingRateImageEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineViewportShadingRateImageStateCreateInfoNV.nshadingRateImageEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer viewportCount(@NativeType("uint32_t") int value) {
            VkPipelineViewportShadingRateImageStateCreateInfoNV.nviewportCount(address(), value);
            return this;
        }

        public Buffer pShadingRatePalettes(@NativeType("VkShadingRatePaletteNV const *") VkShadingRatePaletteNV.Buffer value) {
            VkPipelineViewportShadingRateImageStateCreateInfoNV.npShadingRatePalettes(address(), value);
            return this;
        }
    }
}
