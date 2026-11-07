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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV.class */
public class VkOpticalFlowSessionCreateInfoNV extends Struct<VkOpticalFlowSessionCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int IMAGEFORMAT;
    public static final int FLOWVECTORFORMAT;
    public static final int COSTFORMAT;
    public static final int OUTPUTGRIDSIZE;
    public static final int HINTGRIDSIZE;
    public static final int PERFORMANCELEVEL;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        IMAGEFORMAT = layout.offsetof(4);
        FLOWVECTORFORMAT = layout.offsetof(5);
        COSTFORMAT = layout.offsetof(6);
        OUTPUTGRIDSIZE = layout.offsetof(7);
        HINTGRIDSIZE = layout.offsetof(8);
        PERFORMANCELEVEL = layout.offsetof(9);
        FLAGS = layout.offsetof(10);
    }

    protected VkOpticalFlowSessionCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOpticalFlowSessionCreateInfoNV create(long address, ByteBuffer container) {
        return new VkOpticalFlowSessionCreateInfoNV(address, container);
    }

    public VkOpticalFlowSessionCreateInfoNV(ByteBuffer container) {
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
    public int width() {
        return nwidth(address());
    }

    @NativeType("uint32_t")
    public int height() {
        return nheight(address());
    }

    @NativeType("VkFormat")
    public int imageFormat() {
        return nimageFormat(address());
    }

    @NativeType("VkFormat")
    public int flowVectorFormat() {
        return nflowVectorFormat(address());
    }

    @NativeType("VkFormat")
    public int costFormat() {
        return ncostFormat(address());
    }

    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int outputGridSize() {
        return noutputGridSize(address());
    }

    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int hintGridSize() {
        return nhintGridSize(address());
    }

    @NativeType("VkOpticalFlowPerformanceLevelNV")
    public int performanceLevel() {
        return nperformanceLevel(address());
    }

    @NativeType("VkOpticalFlowSessionCreateFlagsNV")
    public int flags() {
        return nflags(address());
    }

    public VkOpticalFlowSessionCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV sType$Default() {
        return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV);
    }

    public VkOpticalFlowSessionCreateInfoNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV pNext(VkOpticalFlowSessionCreatePrivateDataInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkOpticalFlowSessionCreateInfoNV width(@NativeType("uint32_t") int value) {
        nwidth(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV height(@NativeType("uint32_t") int value) {
        nheight(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV imageFormat(@NativeType("VkFormat") int value) {
        nimageFormat(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV flowVectorFormat(@NativeType("VkFormat") int value) {
        nflowVectorFormat(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV costFormat(@NativeType("VkFormat") int value) {
        ncostFormat(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV outputGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) {
        noutputGridSize(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV hintGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) {
        nhintGridSize(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV performanceLevel(@NativeType("VkOpticalFlowPerformanceLevelNV") int value) {
        nperformanceLevel(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV flags(@NativeType("VkOpticalFlowSessionCreateFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV set(int sType, long pNext, int width, int height, int imageFormat, int flowVectorFormat, int costFormat, int outputGridSize, int hintGridSize, int performanceLevel, int flags) {
        sType(sType);
        pNext(pNext);
        width(width);
        height(height);
        imageFormat(imageFormat);
        flowVectorFormat(flowVectorFormat);
        costFormat(costFormat);
        outputGridSize(outputGridSize);
        hintGridSize(hintGridSize);
        performanceLevel(performanceLevel);
        flags(flags);
        return this;
    }

    public VkOpticalFlowSessionCreateInfoNV set(VkOpticalFlowSessionCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOpticalFlowSessionCreateInfoNV malloc() {
        return new VkOpticalFlowSessionCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOpticalFlowSessionCreateInfoNV calloc() {
        return new VkOpticalFlowSessionCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOpticalFlowSessionCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowSessionCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkOpticalFlowSessionCreateInfoNV create(long address) {
        return new VkOpticalFlowSessionCreateInfoNV(address, null);
    }

    public static VkOpticalFlowSessionCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOpticalFlowSessionCreateInfoNV(address, null);
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

    public static VkOpticalFlowSessionCreateInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOpticalFlowSessionCreateInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nimageFormat(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEFORMAT);
    }

    public static int nflowVectorFormat(long struct) {
        return MemoryUtil.memGetInt(struct + FLOWVECTORFORMAT);
    }

    public static int ncostFormat(long struct) {
        return MemoryUtil.memGetInt(struct + COSTFORMAT);
    }

    public static int noutputGridSize(long struct) {
        return MemoryUtil.memGetInt(struct + OUTPUTGRIDSIZE);
    }

    public static int nhintGridSize(long struct) {
        return MemoryUtil.memGetInt(struct + HINTGRIDSIZE);
    }

    public static int nperformanceLevel(long struct) {
        return MemoryUtil.memGetInt(struct + PERFORMANCELEVEL);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void nimageFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEFORMAT, value);
    }

    public static void nflowVectorFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLOWVECTORFORMAT, value);
    }

    public static void ncostFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + COSTFORMAT, value);
    }

    public static void noutputGridSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + OUTPUTGRIDSIZE, value);
    }

    public static void nhintGridSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + HINTGRIDSIZE, value);
    }

    public static void nperformanceLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERFORMANCELEVEL, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkOpticalFlowSessionCreateInfoNV, Buffer> implements NativeResource {
        private static final VkOpticalFlowSessionCreateInfoNV ELEMENT_FACTORY = VkOpticalFlowSessionCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOpticalFlowSessionCreateInfoNV.SIZEOF);
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
        public VkOpticalFlowSessionCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkOpticalFlowSessionCreateInfoNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkOpticalFlowSessionCreateInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int width() {
            return VkOpticalFlowSessionCreateInfoNV.nwidth(address());
        }

        @NativeType("uint32_t")
        public int height() {
            return VkOpticalFlowSessionCreateInfoNV.nheight(address());
        }

        @NativeType("VkFormat")
        public int imageFormat() {
            return VkOpticalFlowSessionCreateInfoNV.nimageFormat(address());
        }

        @NativeType("VkFormat")
        public int flowVectorFormat() {
            return VkOpticalFlowSessionCreateInfoNV.nflowVectorFormat(address());
        }

        @NativeType("VkFormat")
        public int costFormat() {
            return VkOpticalFlowSessionCreateInfoNV.ncostFormat(address());
        }

        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int outputGridSize() {
            return VkOpticalFlowSessionCreateInfoNV.noutputGridSize(address());
        }

        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int hintGridSize() {
            return VkOpticalFlowSessionCreateInfoNV.nhintGridSize(address());
        }

        @NativeType("VkOpticalFlowPerformanceLevelNV")
        public int performanceLevel() {
            return VkOpticalFlowSessionCreateInfoNV.nperformanceLevel(address());
        }

        @NativeType("VkOpticalFlowSessionCreateFlagsNV")
        public int flags() {
            return VkOpticalFlowSessionCreateInfoNV.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkOpticalFlowSessionCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkOpticalFlowSessionCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkOpticalFlowSessionCreatePrivateDataInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer width(@NativeType("uint32_t") int value) {
            VkOpticalFlowSessionCreateInfoNV.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("uint32_t") int value) {
            VkOpticalFlowSessionCreateInfoNV.nheight(address(), value);
            return this;
        }

        public Buffer imageFormat(@NativeType("VkFormat") int value) {
            VkOpticalFlowSessionCreateInfoNV.nimageFormat(address(), value);
            return this;
        }

        public Buffer flowVectorFormat(@NativeType("VkFormat") int value) {
            VkOpticalFlowSessionCreateInfoNV.nflowVectorFormat(address(), value);
            return this;
        }

        public Buffer costFormat(@NativeType("VkFormat") int value) {
            VkOpticalFlowSessionCreateInfoNV.ncostFormat(address(), value);
            return this;
        }

        public Buffer outputGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) {
            VkOpticalFlowSessionCreateInfoNV.noutputGridSize(address(), value);
            return this;
        }

        public Buffer hintGridSize(@NativeType("VkOpticalFlowGridSizeFlagsNV") int value) {
            VkOpticalFlowSessionCreateInfoNV.nhintGridSize(address(), value);
            return this;
        }

        public Buffer performanceLevel(@NativeType("VkOpticalFlowPerformanceLevelNV") int value) {
            VkOpticalFlowSessionCreateInfoNV.nperformanceLevel(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkOpticalFlowSessionCreateFlagsNV") int value) {
            VkOpticalFlowSessionCreateInfoNV.nflags(address(), value);
            return this;
        }
    }
}
