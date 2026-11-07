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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR.class */
public class VkPhysicalDevicePortabilitySubsetFeaturesKHR extends Struct<VkPhysicalDevicePortabilitySubsetFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CONSTANTALPHACOLORBLENDFACTORS;
    public static final int EVENTS;
    public static final int IMAGEVIEWFORMATREINTERPRETATION;
    public static final int IMAGEVIEWFORMATSWIZZLE;
    public static final int IMAGEVIEW2DON3DIMAGE;
    public static final int MULTISAMPLEARRAYIMAGE;
    public static final int MUTABLECOMPARISONSAMPLERS;
    public static final int POINTPOLYGONS;
    public static final int SAMPLERMIPLODBIAS;
    public static final int SEPARATESTENCILMASKREF;
    public static final int SHADERSAMPLERATEINTERPOLATIONFUNCTIONS;
    public static final int TESSELLATIONISOLINES;
    public static final int TESSELLATIONPOINTMODE;
    public static final int TRIANGLEFANS;
    public static final int VERTEXATTRIBUTEACCESSBEYONDSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONSTANTALPHACOLORBLENDFACTORS = layout.offsetof(2);
        EVENTS = layout.offsetof(3);
        IMAGEVIEWFORMATREINTERPRETATION = layout.offsetof(4);
        IMAGEVIEWFORMATSWIZZLE = layout.offsetof(5);
        IMAGEVIEW2DON3DIMAGE = layout.offsetof(6);
        MULTISAMPLEARRAYIMAGE = layout.offsetof(7);
        MUTABLECOMPARISONSAMPLERS = layout.offsetof(8);
        POINTPOLYGONS = layout.offsetof(9);
        SAMPLERMIPLODBIAS = layout.offsetof(10);
        SEPARATESTENCILMASKREF = layout.offsetof(11);
        SHADERSAMPLERATEINTERPOLATIONFUNCTIONS = layout.offsetof(12);
        TESSELLATIONISOLINES = layout.offsetof(13);
        TESSELLATIONPOINTMODE = layout.offsetof(14);
        TRIANGLEFANS = layout.offsetof(15);
        VERTEXATTRIBUTEACCESSBEYONDSTRIDE = layout.offsetof(16);
    }

    protected VkPhysicalDevicePortabilitySubsetFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePortabilitySubsetFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(address, container);
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR(ByteBuffer container) {
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
    public boolean constantAlphaColorBlendFactors() {
        return nconstantAlphaColorBlendFactors(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean events() {
        return nevents(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean imageViewFormatReinterpretation() {
        return nimageViewFormatReinterpretation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean imageViewFormatSwizzle() {
        return nimageViewFormatSwizzle(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean imageView2DOn3DImage() {
        return nimageView2DOn3DImage(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multisampleArrayImage() {
        return nmultisampleArrayImage(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean mutableComparisonSamplers() {
        return nmutableComparisonSamplers(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pointPolygons() {
        return npointPolygons(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean samplerMipLodBias() {
        return nsamplerMipLodBias(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean separateStencilMaskRef() {
        return nseparateStencilMaskRef(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSampleRateInterpolationFunctions() {
        return nshaderSampleRateInterpolationFunctions(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tessellationIsolines() {
        return ntessellationIsolines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tessellationPointMode() {
        return ntessellationPointMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean triangleFans() {
        return ntriangleFans(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vertexAttributeAccessBeyondStride() {
        return nvertexAttributeAccessBeyondStride(address()) != 0;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR sType$Default() {
        return sType(KHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR);
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR constantAlphaColorBlendFactors(@NativeType("VkBool32") boolean value) {
        nconstantAlphaColorBlendFactors(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR events(@NativeType("VkBool32") boolean value) {
        nevents(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatReinterpretation(@NativeType("VkBool32") boolean value) {
        nimageViewFormatReinterpretation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageViewFormatSwizzle(@NativeType("VkBool32") boolean value) {
        nimageViewFormatSwizzle(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR imageView2DOn3DImage(@NativeType("VkBool32") boolean value) {
        nimageView2DOn3DImage(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR multisampleArrayImage(@NativeType("VkBool32") boolean value) {
        nmultisampleArrayImage(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR mutableComparisonSamplers(@NativeType("VkBool32") boolean value) {
        nmutableComparisonSamplers(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR pointPolygons(@NativeType("VkBool32") boolean value) {
        npointPolygons(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR samplerMipLodBias(@NativeType("VkBool32") boolean value) {
        nsamplerMipLodBias(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR separateStencilMaskRef(@NativeType("VkBool32") boolean value) {
        nseparateStencilMaskRef(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR shaderSampleRateInterpolationFunctions(@NativeType("VkBool32") boolean value) {
        nshaderSampleRateInterpolationFunctions(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationIsolines(@NativeType("VkBool32") boolean value) {
        ntessellationIsolines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR tessellationPointMode(@NativeType("VkBool32") boolean value) {
        ntessellationPointMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR triangleFans(@NativeType("VkBool32") boolean value) {
        ntriangleFans(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR vertexAttributeAccessBeyondStride(@NativeType("VkBool32") boolean value) {
        nvertexAttributeAccessBeyondStride(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR set(int sType, long pNext, boolean constantAlphaColorBlendFactors, boolean events, boolean imageViewFormatReinterpretation, boolean imageViewFormatSwizzle, boolean imageView2DOn3DImage, boolean multisampleArrayImage, boolean mutableComparisonSamplers, boolean pointPolygons, boolean samplerMipLodBias, boolean separateStencilMaskRef, boolean shaderSampleRateInterpolationFunctions, boolean tessellationIsolines, boolean tessellationPointMode, boolean triangleFans, boolean vertexAttributeAccessBeyondStride) {
        sType(sType);
        pNext(pNext);
        constantAlphaColorBlendFactors(constantAlphaColorBlendFactors);
        events(events);
        imageViewFormatReinterpretation(imageViewFormatReinterpretation);
        imageViewFormatSwizzle(imageViewFormatSwizzle);
        imageView2DOn3DImage(imageView2DOn3DImage);
        multisampleArrayImage(multisampleArrayImage);
        mutableComparisonSamplers(mutableComparisonSamplers);
        pointPolygons(pointPolygons);
        samplerMipLodBias(samplerMipLodBias);
        separateStencilMaskRef(separateStencilMaskRef);
        shaderSampleRateInterpolationFunctions(shaderSampleRateInterpolationFunctions);
        tessellationIsolines(tessellationIsolines);
        tessellationPointMode(tessellationPointMode);
        triangleFans(triangleFans);
        vertexAttributeAccessBeyondStride(vertexAttributeAccessBeyondStride);
        return this;
    }

    public VkPhysicalDevicePortabilitySubsetFeaturesKHR set(VkPhysicalDevicePortabilitySubsetFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR malloc() {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR calloc() {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR create(long address) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(address, null);
    }

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(address, null);
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

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePortabilitySubsetFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePortabilitySubsetFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nconstantAlphaColorBlendFactors(long struct) {
        return MemoryUtil.memGetInt(struct + CONSTANTALPHACOLORBLENDFACTORS);
    }

    public static int nevents(long struct) {
        return MemoryUtil.memGetInt(struct + EVENTS);
    }

    public static int nimageViewFormatReinterpretation(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEVIEWFORMATREINTERPRETATION);
    }

    public static int nimageViewFormatSwizzle(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEVIEWFORMATSWIZZLE);
    }

    public static int nimageView2DOn3DImage(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEVIEW2DON3DIMAGE);
    }

    public static int nmultisampleArrayImage(long struct) {
        return MemoryUtil.memGetInt(struct + MULTISAMPLEARRAYIMAGE);
    }

    public static int nmutableComparisonSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MUTABLECOMPARISONSAMPLERS);
    }

    public static int npointPolygons(long struct) {
        return MemoryUtil.memGetInt(struct + POINTPOLYGONS);
    }

    public static int nsamplerMipLodBias(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERMIPLODBIAS);
    }

    public static int nseparateStencilMaskRef(long struct) {
        return MemoryUtil.memGetInt(struct + SEPARATESTENCILMASKREF);
    }

    public static int nshaderSampleRateInterpolationFunctions(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSAMPLERATEINTERPOLATIONFUNCTIONS);
    }

    public static int ntessellationIsolines(long struct) {
        return MemoryUtil.memGetInt(struct + TESSELLATIONISOLINES);
    }

    public static int ntessellationPointMode(long struct) {
        return MemoryUtil.memGetInt(struct + TESSELLATIONPOINTMODE);
    }

    public static int ntriangleFans(long struct) {
        return MemoryUtil.memGetInt(struct + TRIANGLEFANS);
    }

    public static int nvertexAttributeAccessBeyondStride(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXATTRIBUTEACCESSBEYONDSTRIDE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nconstantAlphaColorBlendFactors(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSTANTALPHACOLORBLENDFACTORS, value);
    }

    public static void nevents(long struct, int value) {
        MemoryUtil.memPutInt(struct + EVENTS, value);
    }

    public static void nimageViewFormatReinterpretation(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEVIEWFORMATREINTERPRETATION, value);
    }

    public static void nimageViewFormatSwizzle(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEVIEWFORMATSWIZZLE, value);
    }

    public static void nimageView2DOn3DImage(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEVIEW2DON3DIMAGE, value);
    }

    public static void nmultisampleArrayImage(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTISAMPLEARRAYIMAGE, value);
    }

    public static void nmutableComparisonSamplers(long struct, int value) {
        MemoryUtil.memPutInt(struct + MUTABLECOMPARISONSAMPLERS, value);
    }

    public static void npointPolygons(long struct, int value) {
        MemoryUtil.memPutInt(struct + POINTPOLYGONS, value);
    }

    public static void nsamplerMipLodBias(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERMIPLODBIAS, value);
    }

    public static void nseparateStencilMaskRef(long struct, int value) {
        MemoryUtil.memPutInt(struct + SEPARATESTENCILMASKREF, value);
    }

    public static void nshaderSampleRateInterpolationFunctions(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSAMPLERATEINTERPOLATIONFUNCTIONS, value);
    }

    public static void ntessellationIsolines(long struct, int value) {
        MemoryUtil.memPutInt(struct + TESSELLATIONISOLINES, value);
    }

    public static void ntessellationPointMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + TESSELLATIONPOINTMODE, value);
    }

    public static void ntriangleFans(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRIANGLEFANS, value);
    }

    public static void nvertexAttributeAccessBeyondStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXATTRIBUTEACCESSBEYONDSTRIDE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePortabilitySubsetFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePortabilitySubsetFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePortabilitySubsetFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePortabilitySubsetFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePortabilitySubsetFeaturesKHR.SIZEOF);
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
        public VkPhysicalDevicePortabilitySubsetFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean constantAlphaColorBlendFactors() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nconstantAlphaColorBlendFactors(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean events() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nevents(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean imageViewFormatReinterpretation() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatReinterpretation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean imageViewFormatSwizzle() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatSwizzle(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean imageView2DOn3DImage() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageView2DOn3DImage(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multisampleArrayImage() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmultisampleArrayImage(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean mutableComparisonSamplers() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmutableComparisonSamplers(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pointPolygons() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.npointPolygons(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean samplerMipLodBias() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsamplerMipLodBias(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean separateStencilMaskRef() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nseparateStencilMaskRef(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSampleRateInterpolationFunctions() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nshaderSampleRateInterpolationFunctions(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tessellationIsolines() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationIsolines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tessellationPointMode() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationPointMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean triangleFans() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntriangleFans(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vertexAttributeAccessBeyondStride() {
            return VkPhysicalDevicePortabilitySubsetFeaturesKHR.nvertexAttributeAccessBeyondStride(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPortabilitySubset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer constantAlphaColorBlendFactors(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nconstantAlphaColorBlendFactors(address(), value ? 1 : 0);
            return this;
        }

        public Buffer events(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nevents(address(), value ? 1 : 0);
            return this;
        }

        public Buffer imageViewFormatReinterpretation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatReinterpretation(address(), value ? 1 : 0);
            return this;
        }

        public Buffer imageViewFormatSwizzle(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageViewFormatSwizzle(address(), value ? 1 : 0);
            return this;
        }

        public Buffer imageView2DOn3DImage(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nimageView2DOn3DImage(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multisampleArrayImage(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmultisampleArrayImage(address(), value ? 1 : 0);
            return this;
        }

        public Buffer mutableComparisonSamplers(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nmutableComparisonSamplers(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pointPolygons(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.npointPolygons(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerMipLodBias(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nsamplerMipLodBias(address(), value ? 1 : 0);
            return this;
        }

        public Buffer separateStencilMaskRef(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nseparateStencilMaskRef(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSampleRateInterpolationFunctions(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nshaderSampleRateInterpolationFunctions(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tessellationIsolines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationIsolines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tessellationPointMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntessellationPointMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer triangleFans(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.ntriangleFans(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vertexAttributeAccessBeyondStride(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePortabilitySubsetFeaturesKHR.nvertexAttributeAccessBeyondStride(address(), value ? 1 : 0);
            return this;
        }
    }
}
