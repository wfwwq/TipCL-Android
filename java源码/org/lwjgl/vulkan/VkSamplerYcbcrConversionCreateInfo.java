package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo.class */
public class VkSamplerYcbcrConversionCreateInfo extends Struct<VkSamplerYcbcrConversionCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMAT;
    public static final int YCBCRMODEL;
    public static final int YCBCRRANGE;
    public static final int COMPONENTS;
    public static final int XCHROMAOFFSET;
    public static final int YCHROMAOFFSET;
    public static final int CHROMAFILTER;
    public static final int FORCEEXPLICITRECONSTRUCTION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        YCBCRMODEL = layout.offsetof(3);
        YCBCRRANGE = layout.offsetof(4);
        COMPONENTS = layout.offsetof(5);
        XCHROMAOFFSET = layout.offsetof(6);
        YCHROMAOFFSET = layout.offsetof(7);
        CHROMAFILTER = layout.offsetof(8);
        FORCEEXPLICITRECONSTRUCTION = layout.offsetof(9);
    }

    protected VkSamplerYcbcrConversionCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerYcbcrConversionCreateInfo create(long address, ByteBuffer container) {
        return new VkSamplerYcbcrConversionCreateInfo(address, container);
    }

    public VkSamplerYcbcrConversionCreateInfo(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("VkSamplerYcbcrModelConversion")
    public int ycbcrModel() {
        return nycbcrModel(address());
    }

    @NativeType("VkSamplerYcbcrRange")
    public int ycbcrRange() {
        return nycbcrRange(address());
    }

    public VkComponentMapping components() {
        return ncomponents(address());
    }

    @NativeType("VkChromaLocation")
    public int xChromaOffset() {
        return nxChromaOffset(address());
    }

    @NativeType("VkChromaLocation")
    public int yChromaOffset() {
        return nyChromaOffset(address());
    }

    @NativeType("VkFilter")
    public int chromaFilter() {
        return nchromaFilter(address());
    }

    @NativeType("VkBool32")
    public boolean forceExplicitReconstruction() {
        return nforceExplicitReconstruction(address()) != 0;
    }

    public VkSamplerYcbcrConversionCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo sType$Default() {
        return sType(1000156000);
    }

    public VkSamplerYcbcrConversionCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo pNext(VkExternalFormatANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerYcbcrConversionCreateInfo pNext(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerYcbcrConversionCreateInfo format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) {
        nycbcrModel(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) {
        nycbcrRange(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo components(VkComponentMapping value) {
        ncomponents(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo components(Consumer<VkComponentMapping> consumer) {
        consumer.accept(components());
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(@NativeType("VkChromaLocation") int value) {
        nxChromaOffset(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(@NativeType("VkChromaLocation") int value) {
        nyChromaOffset(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo chromaFilter(@NativeType("VkFilter") int value) {
        nchromaFilter(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(@NativeType("VkBool32") boolean value) {
        nforceExplicitReconstruction(address(), value ? 1 : 0);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo set(int sType, long pNext, int format, int ycbcrModel, int ycbcrRange, VkComponentMapping components, int xChromaOffset, int yChromaOffset, int chromaFilter, boolean forceExplicitReconstruction) {
        sType(sType);
        pNext(pNext);
        format(format);
        ycbcrModel(ycbcrModel);
        ycbcrRange(ycbcrRange);
        components(components);
        xChromaOffset(xChromaOffset);
        yChromaOffset(yChromaOffset);
        chromaFilter(chromaFilter);
        forceExplicitReconstruction(forceExplicitReconstruction);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfo set(VkSamplerYcbcrConversionCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerYcbcrConversionCreateInfo malloc() {
        return new VkSamplerYcbcrConversionCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionCreateInfo calloc() {
        return new VkSamplerYcbcrConversionCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerYcbcrConversionCreateInfo create(long address) {
        return new VkSamplerYcbcrConversionCreateInfo(address, null);
    }

    public static VkSamplerYcbcrConversionCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversionCreateInfo(address, null);
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

    public static VkSamplerYcbcrConversionCreateInfo malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionCreateInfo calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nycbcrModel(long struct) {
        return MemoryUtil.memGetInt(struct + YCBCRMODEL);
    }

    public static int nycbcrRange(long struct) {
        return MemoryUtil.memGetInt(struct + YCBCRRANGE);
    }

    public static VkComponentMapping ncomponents(long struct) {
        return VkComponentMapping.create(struct + COMPONENTS);
    }

    public static int nxChromaOffset(long struct) {
        return MemoryUtil.memGetInt(struct + XCHROMAOFFSET);
    }

    public static int nyChromaOffset(long struct) {
        return MemoryUtil.memGetInt(struct + YCHROMAOFFSET);
    }

    public static int nchromaFilter(long struct) {
        return MemoryUtil.memGetInt(struct + CHROMAFILTER);
    }

    public static int nforceExplicitReconstruction(long struct) {
        return MemoryUtil.memGetInt(struct + FORCEEXPLICITRECONSTRUCTION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nycbcrModel(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCBCRMODEL, value);
    }

    public static void nycbcrRange(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCBCRRANGE, value);
    }

    public static void ncomponents(long struct, VkComponentMapping value) {
        MemoryUtil.memCopy(value.address(), struct + COMPONENTS, VkComponentMapping.SIZEOF);
    }

    public static void nxChromaOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + XCHROMAOFFSET, value);
    }

    public static void nyChromaOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCHROMAOFFSET, value);
    }

    public static void nchromaFilter(long struct, int value) {
        MemoryUtil.memPutInt(struct + CHROMAFILTER, value);
    }

    public static void nforceExplicitReconstruction(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORCEEXPLICITRECONSTRUCTION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionCreateInfo, Buffer> implements NativeResource {
        private static final VkSamplerYcbcrConversionCreateInfo ELEMENT_FACTORY = VkSamplerYcbcrConversionCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerYcbcrConversionCreateInfo.SIZEOF);
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
        public VkSamplerYcbcrConversionCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerYcbcrConversionCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerYcbcrConversionCreateInfo.npNext(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkSamplerYcbcrConversionCreateInfo.nformat(address());
        }

        @NativeType("VkSamplerYcbcrModelConversion")
        public int ycbcrModel() {
            return VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address());
        }

        @NativeType("VkSamplerYcbcrRange")
        public int ycbcrRange() {
            return VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address());
        }

        public VkComponentMapping components() {
            return VkSamplerYcbcrConversionCreateInfo.ncomponents(address());
        }

        @NativeType("VkChromaLocation")
        public int xChromaOffset() {
            return VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address());
        }

        @NativeType("VkChromaLocation")
        public int yChromaOffset() {
            return VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address());
        }

        @NativeType("VkFilter")
        public int chromaFilter() {
            return VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address());
        }

        @NativeType("VkBool32")
        public boolean forceExplicitReconstruction() {
            return VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerYcbcrConversionCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000156000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerYcbcrConversionCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExternalFormatANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkSamplerYcbcrConversionCreateInfo.nformat(address(), value);
            return this;
        }

        public Buffer ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) {
            VkSamplerYcbcrConversionCreateInfo.nycbcrModel(address(), value);
            return this;
        }

        public Buffer ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) {
            VkSamplerYcbcrConversionCreateInfo.nycbcrRange(address(), value);
            return this;
        }

        public Buffer components(VkComponentMapping value) {
            VkSamplerYcbcrConversionCreateInfo.ncomponents(address(), value);
            return this;
        }

        public Buffer components(Consumer<VkComponentMapping> consumer) {
            consumer.accept(components());
            return this;
        }

        public Buffer xChromaOffset(@NativeType("VkChromaLocation") int value) {
            VkSamplerYcbcrConversionCreateInfo.nxChromaOffset(address(), value);
            return this;
        }

        public Buffer yChromaOffset(@NativeType("VkChromaLocation") int value) {
            VkSamplerYcbcrConversionCreateInfo.nyChromaOffset(address(), value);
            return this;
        }

        public Buffer chromaFilter(@NativeType("VkFilter") int value) {
            VkSamplerYcbcrConversionCreateInfo.nchromaFilter(address(), value);
            return this;
        }

        public Buffer forceExplicitReconstruction(@NativeType("VkBool32") boolean value) {
            VkSamplerYcbcrConversionCreateInfo.nforceExplicitReconstruction(address(), value ? 1 : 0);
            return this;
        }
    }
}
