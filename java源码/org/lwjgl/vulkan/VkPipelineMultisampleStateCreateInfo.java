package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo.class */
public class VkPipelineMultisampleStateCreateInfo extends Struct<VkPipelineMultisampleStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int RASTERIZATIONSAMPLES;
    public static final int SAMPLESHADINGENABLE;
    public static final int MINSAMPLESHADING;
    public static final int PSAMPLEMASK;
    public static final int ALPHATOCOVERAGEENABLE;
    public static final int ALPHATOONEENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RASTERIZATIONSAMPLES = layout.offsetof(3);
        SAMPLESHADINGENABLE = layout.offsetof(4);
        MINSAMPLESHADING = layout.offsetof(5);
        PSAMPLEMASK = layout.offsetof(6);
        ALPHATOCOVERAGEENABLE = layout.offsetof(7);
        ALPHATOONEENABLE = layout.offsetof(8);
    }

    protected VkPipelineMultisampleStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineMultisampleStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineMultisampleStateCreateInfo(address, container);
    }

    public VkPipelineMultisampleStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineMultisampleStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() {
        return nrasterizationSamples(address());
    }

    @NativeType("VkBool32")
    public boolean sampleShadingEnable() {
        return nsampleShadingEnable(address()) != 0;
    }

    public float minSampleShading() {
        return nminSampleShading(address());
    }

    @NativeType("VkSampleMask const *")
    public IntBuffer pSampleMask(int capacity) {
        return npSampleMask(address(), capacity);
    }

    @NativeType("VkBool32")
    public boolean alphaToCoverageEnable() {
        return nalphaToCoverageEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean alphaToOneEnable() {
        return nalphaToOneEnable(address()) != 0;
    }

    public VkPipelineMultisampleStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo sType$Default() {
        return sType(24);
    }

    public VkPipelineMultisampleStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo pNext(VkPipelineCoverageModulationStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineMultisampleStateCreateInfo pNext(VkPipelineCoverageReductionStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineMultisampleStateCreateInfo pNext(VkPipelineCoverageToColorStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineMultisampleStateCreateInfo pNext(VkPipelineSampleLocationsStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineMultisampleStateCreateInfo flags(@NativeType("VkPipelineMultisampleStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
        nrasterizationSamples(address(), value);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(@NativeType("VkBool32") boolean value) {
        nsampleShadingEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo minSampleShading(float value) {
        nminSampleShading(address(), value);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo pSampleMask(@NativeType("VkSampleMask const *") IntBuffer value) {
        npSampleMask(address(), value);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(@NativeType("VkBool32") boolean value) {
        nalphaToCoverageEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(@NativeType("VkBool32") boolean value) {
        nalphaToOneEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo set(int sType, long pNext, int flags, int rasterizationSamples, boolean sampleShadingEnable, float minSampleShading, IntBuffer pSampleMask, boolean alphaToCoverageEnable, boolean alphaToOneEnable) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rasterizationSamples(rasterizationSamples);
        sampleShadingEnable(sampleShadingEnable);
        minSampleShading(minSampleShading);
        pSampleMask(pSampleMask);
        alphaToCoverageEnable(alphaToCoverageEnable);
        alphaToOneEnable(alphaToOneEnable);
        return this;
    }

    public VkPipelineMultisampleStateCreateInfo set(VkPipelineMultisampleStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineMultisampleStateCreateInfo malloc() {
        return new VkPipelineMultisampleStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineMultisampleStateCreateInfo calloc() {
        return new VkPipelineMultisampleStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineMultisampleStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineMultisampleStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineMultisampleStateCreateInfo create(long address) {
        return new VkPipelineMultisampleStateCreateInfo(address, null);
    }

    public static VkPipelineMultisampleStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineMultisampleStateCreateInfo(address, null);
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

    public static VkPipelineMultisampleStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineMultisampleStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineMultisampleStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineMultisampleStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nrasterizationSamples(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONSAMPLES);
    }

    public static int nsampleShadingEnable(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLESHADINGENABLE);
    }

    public static float nminSampleShading(long struct) {
        return MemoryUtil.memGetFloat(struct + MINSAMPLESHADING);
    }

    public static IntBuffer npSampleMask(long struct, int capacity) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PSAMPLEMASK), capacity);
    }

    public static int nalphaToCoverageEnable(long struct) {
        return MemoryUtil.memGetInt(struct + ALPHATOCOVERAGEENABLE);
    }

    public static int nalphaToOneEnable(long struct) {
        return MemoryUtil.memGetInt(struct + ALPHATOONEENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nrasterizationSamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONSAMPLES, value);
    }

    public static void nsampleShadingEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLESHADINGENABLE, value);
    }

    public static void nminSampleShading(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINSAMPLESHADING, value);
    }

    public static void npSampleMask(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PSAMPLEMASK, MemoryUtil.memAddressSafe(value));
    }

    public static void nalphaToCoverageEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + ALPHATOCOVERAGEENABLE, value);
    }

    public static void nalphaToOneEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + ALPHATOONEENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineMultisampleStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineMultisampleStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineMultisampleStateCreateInfo ELEMENT_FACTORY = VkPipelineMultisampleStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineMultisampleStateCreateInfo.SIZEOF);
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
        public VkPipelineMultisampleStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineMultisampleStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineMultisampleStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineMultisampleStateCreateFlags")
        public int flags() {
            return VkPipelineMultisampleStateCreateInfo.nflags(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() {
            return VkPipelineMultisampleStateCreateInfo.nrasterizationSamples(address());
        }

        @NativeType("VkBool32")
        public boolean sampleShadingEnable() {
            return VkPipelineMultisampleStateCreateInfo.nsampleShadingEnable(address()) != 0;
        }

        public float minSampleShading() {
            return VkPipelineMultisampleStateCreateInfo.nminSampleShading(address());
        }

        @NativeType("VkSampleMask const *")
        public IntBuffer pSampleMask(int capacity) {
            return VkPipelineMultisampleStateCreateInfo.npSampleMask(address(), capacity);
        }

        @NativeType("VkBool32")
        public boolean alphaToCoverageEnable() {
            return VkPipelineMultisampleStateCreateInfo.nalphaToCoverageEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean alphaToOneEnable() {
            return VkPipelineMultisampleStateCreateInfo.nalphaToOneEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineMultisampleStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(24);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineMultisampleStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineCoverageModulationStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCoverageReductionStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCoverageToColorStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineSampleLocationsStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineMultisampleStateCreateFlags") int value) {
            VkPipelineMultisampleStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
            VkPipelineMultisampleStateCreateInfo.nrasterizationSamples(address(), value);
            return this;
        }

        public Buffer sampleShadingEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineMultisampleStateCreateInfo.nsampleShadingEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer minSampleShading(float value) {
            VkPipelineMultisampleStateCreateInfo.nminSampleShading(address(), value);
            return this;
        }

        public Buffer pSampleMask(@NativeType("VkSampleMask const *") IntBuffer value) {
            VkPipelineMultisampleStateCreateInfo.npSampleMask(address(), value);
            return this;
        }

        public Buffer alphaToCoverageEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineMultisampleStateCreateInfo.nalphaToCoverageEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer alphaToOneEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineMultisampleStateCreateInfo.nalphaToOneEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
