package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Features.class */
public class VkPhysicalDeviceVulkan14Features extends Struct<VkPhysicalDeviceVulkan14Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int GLOBALPRIORITYQUERY;
    public static final int SHADERSUBGROUPROTATE;
    public static final int SHADERSUBGROUPROTATECLUSTERED;
    public static final int SHADERFLOATCONTROLS2;
    public static final int SHADEREXPECTASSUME;
    public static final int RECTANGULARLINES;
    public static final int BRESENHAMLINES;
    public static final int SMOOTHLINES;
    public static final int STIPPLEDRECTANGULARLINES;
    public static final int STIPPLEDBRESENHAMLINES;
    public static final int STIPPLEDSMOOTHLINES;
    public static final int VERTEXATTRIBUTEINSTANCERATEDIVISOR;
    public static final int VERTEXATTRIBUTEINSTANCERATEZERODIVISOR;
    public static final int INDEXTYPEUINT8;
    public static final int DYNAMICRENDERINGLOCALREAD;
    public static final int MAINTENANCE5;
    public static final int MAINTENANCE6;
    public static final int PIPELINEPROTECTEDACCESS;
    public static final int PIPELINEROBUSTNESS;
    public static final int HOSTIMAGECOPY;
    public static final int PUSHDESCRIPTOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GLOBALPRIORITYQUERY = layout.offsetof(2);
        SHADERSUBGROUPROTATE = layout.offsetof(3);
        SHADERSUBGROUPROTATECLUSTERED = layout.offsetof(4);
        SHADERFLOATCONTROLS2 = layout.offsetof(5);
        SHADEREXPECTASSUME = layout.offsetof(6);
        RECTANGULARLINES = layout.offsetof(7);
        BRESENHAMLINES = layout.offsetof(8);
        SMOOTHLINES = layout.offsetof(9);
        STIPPLEDRECTANGULARLINES = layout.offsetof(10);
        STIPPLEDBRESENHAMLINES = layout.offsetof(11);
        STIPPLEDSMOOTHLINES = layout.offsetof(12);
        VERTEXATTRIBUTEINSTANCERATEDIVISOR = layout.offsetof(13);
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = layout.offsetof(14);
        INDEXTYPEUINT8 = layout.offsetof(15);
        DYNAMICRENDERINGLOCALREAD = layout.offsetof(16);
        MAINTENANCE5 = layout.offsetof(17);
        MAINTENANCE6 = layout.offsetof(18);
        PIPELINEPROTECTEDACCESS = layout.offsetof(19);
        PIPELINEROBUSTNESS = layout.offsetof(20);
        HOSTIMAGECOPY = layout.offsetof(21);
        PUSHDESCRIPTOR = layout.offsetof(22);
    }

    protected VkPhysicalDeviceVulkan14Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan14Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan14Features(address, container);
    }

    public VkPhysicalDeviceVulkan14Features(ByteBuffer container) {
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
    public boolean globalPriorityQuery() {
        return nglobalPriorityQuery(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSubgroupRotate() {
        return nshaderSubgroupRotate(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSubgroupRotateClustered() {
        return nshaderSubgroupRotateClustered(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderFloatControls2() {
        return nshaderFloatControls2(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderExpectAssume() {
        return nshaderExpectAssume(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean rectangularLines() {
        return nrectangularLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bresenhamLines() {
        return nbresenhamLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean smoothLines() {
        return nsmoothLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean stippledRectangularLines() {
        return nstippledRectangularLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean stippledBresenhamLines() {
        return nstippledBresenhamLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean stippledSmoothLines() {
        return nstippledSmoothLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateDivisor() {
        return nvertexAttributeInstanceRateDivisor(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateZeroDivisor() {
        return nvertexAttributeInstanceRateZeroDivisor(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean indexTypeUint8() {
        return nindexTypeUint8(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalRead() {
        return ndynamicRenderingLocalRead(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean maintenance5() {
        return nmaintenance5(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean maintenance6() {
        return nmaintenance6(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineProtectedAccess() {
        return npipelineProtectedAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineRobustness() {
        return npipelineRobustness(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean hostImageCopy() {
        return nhostImageCopy(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pushDescriptor() {
        return npushDescriptor(address()) != 0;
    }

    public VkPhysicalDeviceVulkan14Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features sType$Default() {
        return sType(55);
    }

    public VkPhysicalDeviceVulkan14Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features globalPriorityQuery(@NativeType("VkBool32") boolean value) {
        nglobalPriorityQuery(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupRotate(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupRotateClustered(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features shaderFloatControls2(@NativeType("VkBool32") boolean value) {
        nshaderFloatControls2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features shaderExpectAssume(@NativeType("VkBool32") boolean value) {
        nshaderExpectAssume(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features rectangularLines(@NativeType("VkBool32") boolean value) {
        nrectangularLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features bresenhamLines(@NativeType("VkBool32") boolean value) {
        nbresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features smoothLines(@NativeType("VkBool32") boolean value) {
        nsmoothLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features stippledRectangularLines(@NativeType("VkBool32") boolean value) {
        nstippledRectangularLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
        nstippledBresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features stippledSmoothLines(@NativeType("VkBool32") boolean value) {
        nstippledSmoothLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features indexTypeUint8(@NativeType("VkBool32") boolean value) {
        nindexTypeUint8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) {
        ndynamicRenderingLocalRead(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features maintenance5(@NativeType("VkBool32") boolean value) {
        nmaintenance5(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features maintenance6(@NativeType("VkBool32") boolean value) {
        nmaintenance6(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(@NativeType("VkBool32") boolean value) {
        npipelineProtectedAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features pipelineRobustness(@NativeType("VkBool32") boolean value) {
        npipelineRobustness(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features hostImageCopy(@NativeType("VkBool32") boolean value) {
        nhostImageCopy(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features pushDescriptor(@NativeType("VkBool32") boolean value) {
        npushDescriptor(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features set(int sType, long pNext, boolean globalPriorityQuery, boolean shaderSubgroupRotate, boolean shaderSubgroupRotateClustered, boolean shaderFloatControls2, boolean shaderExpectAssume, boolean rectangularLines, boolean bresenhamLines, boolean smoothLines, boolean stippledRectangularLines, boolean stippledBresenhamLines, boolean stippledSmoothLines, boolean vertexAttributeInstanceRateDivisor, boolean vertexAttributeInstanceRateZeroDivisor, boolean indexTypeUint8, boolean dynamicRenderingLocalRead, boolean maintenance5, boolean maintenance6, boolean pipelineProtectedAccess, boolean pipelineRobustness, boolean hostImageCopy, boolean pushDescriptor) {
        sType(sType);
        pNext(pNext);
        globalPriorityQuery(globalPriorityQuery);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);
        shaderFloatControls2(shaderFloatControls2);
        shaderExpectAssume(shaderExpectAssume);
        rectangularLines(rectangularLines);
        bresenhamLines(bresenhamLines);
        smoothLines(smoothLines);
        stippledRectangularLines(stippledRectangularLines);
        stippledBresenhamLines(stippledBresenhamLines);
        stippledSmoothLines(stippledSmoothLines);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);
        indexTypeUint8(indexTypeUint8);
        dynamicRenderingLocalRead(dynamicRenderingLocalRead);
        maintenance5(maintenance5);
        maintenance6(maintenance6);
        pipelineProtectedAccess(pipelineProtectedAccess);
        pipelineRobustness(pipelineRobustness);
        hostImageCopy(hostImageCopy);
        pushDescriptor(pushDescriptor);
        return this;
    }

    public VkPhysicalDeviceVulkan14Features set(VkPhysicalDeviceVulkan14Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan14Features malloc() {
        return new VkPhysicalDeviceVulkan14Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan14Features calloc() {
        return new VkPhysicalDeviceVulkan14Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan14Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan14Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan14Features create(long address) {
        return new VkPhysicalDeviceVulkan14Features(address, null);
    }

    public static VkPhysicalDeviceVulkan14Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan14Features(address, null);
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

    public static VkPhysicalDeviceVulkan14Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan14Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nglobalPriorityQuery(long struct) {
        return MemoryUtil.memGetInt(struct + GLOBALPRIORITYQUERY);
    }

    public static int nshaderSubgroupRotate(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPROTATE);
    }

    public static int nshaderSubgroupRotateClustered(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPROTATECLUSTERED);
    }

    public static int nshaderFloatControls2(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOATCONTROLS2);
    }

    public static int nshaderExpectAssume(long struct) {
        return MemoryUtil.memGetInt(struct + SHADEREXPECTASSUME);
    }

    public static int nrectangularLines(long struct) {
        return MemoryUtil.memGetInt(struct + RECTANGULARLINES);
    }

    public static int nbresenhamLines(long struct) {
        return MemoryUtil.memGetInt(struct + BRESENHAMLINES);
    }

    public static int nsmoothLines(long struct) {
        return MemoryUtil.memGetInt(struct + SMOOTHLINES);
    }

    public static int nstippledRectangularLines(long struct) {
        return MemoryUtil.memGetInt(struct + STIPPLEDRECTANGULARLINES);
    }

    public static int nstippledBresenhamLines(long struct) {
        return MemoryUtil.memGetInt(struct + STIPPLEDBRESENHAMLINES);
    }

    public static int nstippledSmoothLines(long struct) {
        return MemoryUtil.memGetInt(struct + STIPPLEDSMOOTHLINES);
    }

    public static int nvertexAttributeInstanceRateDivisor(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXATTRIBUTEINSTANCERATEDIVISOR);
    }

    public static int nvertexAttributeInstanceRateZeroDivisor(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXATTRIBUTEINSTANCERATEZERODIVISOR);
    }

    public static int nindexTypeUint8(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPEUINT8);
    }

    public static int ndynamicRenderingLocalRead(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICRENDERINGLOCALREAD);
    }

    public static int nmaintenance5(long struct) {
        return MemoryUtil.memGetInt(struct + MAINTENANCE5);
    }

    public static int nmaintenance6(long struct) {
        return MemoryUtil.memGetInt(struct + MAINTENANCE6);
    }

    public static int npipelineProtectedAccess(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEPROTECTEDACCESS);
    }

    public static int npipelineRobustness(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEROBUSTNESS);
    }

    public static int nhostImageCopy(long struct) {
        return MemoryUtil.memGetInt(struct + HOSTIMAGECOPY);
    }

    public static int npushDescriptor(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHDESCRIPTOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nglobalPriorityQuery(long struct, int value) {
        MemoryUtil.memPutInt(struct + GLOBALPRIORITYQUERY, value);
    }

    public static void nshaderSubgroupRotate(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPROTATE, value);
    }

    public static void nshaderSubgroupRotateClustered(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPROTATECLUSTERED, value);
    }

    public static void nshaderFloatControls2(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOATCONTROLS2, value);
    }

    public static void nshaderExpectAssume(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADEREXPECTASSUME, value);
    }

    public static void nrectangularLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + RECTANGULARLINES, value);
    }

    public static void nbresenhamLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + BRESENHAMLINES, value);
    }

    public static void nsmoothLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + SMOOTHLINES, value);
    }

    public static void nstippledRectangularLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + STIPPLEDRECTANGULARLINES, value);
    }

    public static void nstippledBresenhamLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + STIPPLEDBRESENHAMLINES, value);
    }

    public static void nstippledSmoothLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + STIPPLEDSMOOTHLINES, value);
    }

    public static void nvertexAttributeInstanceRateDivisor(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXATTRIBUTEINSTANCERATEDIVISOR, value);
    }

    public static void nvertexAttributeInstanceRateZeroDivisor(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, value);
    }

    public static void nindexTypeUint8(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPEUINT8, value);
    }

    public static void ndynamicRenderingLocalRead(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICRENDERINGLOCALREAD, value);
    }

    public static void nmaintenance5(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAINTENANCE5, value);
    }

    public static void nmaintenance6(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAINTENANCE6, value);
    }

    public static void npipelineProtectedAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEPROTECTEDACCESS, value);
    }

    public static void npipelineRobustness(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEROBUSTNESS, value);
    }

    public static void nhostImageCopy(long struct, int value) {
        MemoryUtil.memPutInt(struct + HOSTIMAGECOPY, value);
    }

    public static void npushDescriptor(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHDESCRIPTOR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan14Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan14Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan14Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan14Features.SIZEOF);
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
        public VkPhysicalDeviceVulkan14Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan14Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan14Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean globalPriorityQuery() {
            return VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupRotate() {
            return VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupRotateClustered() {
            return VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderFloatControls2() {
            return VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderExpectAssume() {
            return VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean rectangularLines() {
            return VkPhysicalDeviceVulkan14Features.nrectangularLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bresenhamLines() {
            return VkPhysicalDeviceVulkan14Features.nbresenhamLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean smoothLines() {
            return VkPhysicalDeviceVulkan14Features.nsmoothLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean stippledRectangularLines() {
            return VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean stippledBresenhamLines() {
            return VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean stippledSmoothLines() {
            return VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateDivisor() {
            return VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateZeroDivisor() {
            return VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean indexTypeUint8() {
            return VkPhysicalDeviceVulkan14Features.nindexTypeUint8(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalRead() {
            return VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean maintenance5() {
            return VkPhysicalDeviceVulkan14Features.nmaintenance5(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean maintenance6() {
            return VkPhysicalDeviceVulkan14Features.nmaintenance6(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineProtectedAccess() {
            return VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineRobustness() {
            return VkPhysicalDeviceVulkan14Features.npipelineRobustness(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean hostImageCopy() {
            return VkPhysicalDeviceVulkan14Features.nhostImageCopy(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pushDescriptor() {
            return VkPhysicalDeviceVulkan14Features.npushDescriptor(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan14Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(55);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan14Features.npNext(address(), value);
            return this;
        }

        public Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nglobalPriorityQuery(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotate(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nshaderSubgroupRotateClustered(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderFloatControls2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nshaderFloatControls2(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderExpectAssume(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nshaderExpectAssume(address(), value ? 1 : 0);
            return this;
        }

        public Buffer rectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nrectangularLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nbresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer smoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nsmoothLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nstippledRectangularLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nstippledBresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nstippledSmoothLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
            return this;
        }

        public Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nindexTypeUint8(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dynamicRenderingLocalRead(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.ndynamicRenderingLocalRead(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maintenance5(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nmaintenance5(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maintenance6(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nmaintenance6(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pipelineProtectedAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.npipelineProtectedAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.npipelineRobustness(address(), value ? 1 : 0);
            return this;
        }

        public Buffer hostImageCopy(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.nhostImageCopy(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pushDescriptor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan14Features.npushDescriptor(address(), value ? 1 : 0);
            return this;
        }
    }
}
