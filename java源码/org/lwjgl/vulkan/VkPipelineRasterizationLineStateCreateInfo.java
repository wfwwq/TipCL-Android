package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfo.class */
public class VkPipelineRasterizationLineStateCreateInfo extends Struct<VkPipelineRasterizationLineStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LINERASTERIZATIONMODE;
    public static final int STIPPLEDLINEENABLE;
    public static final int LINESTIPPLEFACTOR;
    public static final int LINESTIPPLEPATTERN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LINERASTERIZATIONMODE = layout.offsetof(2);
        STIPPLEDLINEENABLE = layout.offsetof(3);
        LINESTIPPLEFACTOR = layout.offsetof(4);
        LINESTIPPLEPATTERN = layout.offsetof(5);
    }

    protected VkPipelineRasterizationLineStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRasterizationLineStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationLineStateCreateInfo(address, container);
    }

    public VkPipelineRasterizationLineStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkLineRasterizationMode")
    public int lineRasterizationMode() {
        return nlineRasterizationMode(address());
    }

    @NativeType("VkBool32")
    public boolean stippledLineEnable() {
        return nstippledLineEnable(address()) != 0;
    }

    @NativeType("uint32_t")
    public int lineStippleFactor() {
        return nlineStippleFactor(address());
    }

    @NativeType("uint16_t")
    public short lineStipplePattern() {
        return nlineStipplePattern(address());
    }

    public VkPipelineRasterizationLineStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfo sType$Default() {
        return sType(1000259001);
    }

    public VkPipelineRasterizationLineStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) {
        nlineRasterizationMode(address(), value);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(@NativeType("VkBool32") boolean value) {
        nstippledLineEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(@NativeType("uint32_t") int value) {
        nlineStippleFactor(address(), value);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(@NativeType("uint16_t") short value) {
        nlineStipplePattern(address(), value);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfo set(int sType, long pNext, int lineRasterizationMode, boolean stippledLineEnable, int lineStippleFactor, short lineStipplePattern) {
        sType(sType);
        pNext(pNext);
        lineRasterizationMode(lineRasterizationMode);
        stippledLineEnable(stippledLineEnable);
        lineStippleFactor(lineStippleFactor);
        lineStipplePattern(lineStipplePattern);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfo set(VkPipelineRasterizationLineStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationLineStateCreateInfo malloc() {
        return new VkPipelineRasterizationLineStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfo calloc() {
        return new VkPipelineRasterizationLineStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationLineStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationLineStateCreateInfo create(long address) {
        return new VkPipelineRasterizationLineStateCreateInfo(address, null);
    }

    public static VkPipelineRasterizationLineStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationLineStateCreateInfo(address, null);
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

    public static VkPipelineRasterizationLineStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlineRasterizationMode(long struct) {
        return MemoryUtil.memGetInt(struct + LINERASTERIZATIONMODE);
    }

    public static int nstippledLineEnable(long struct) {
        return MemoryUtil.memGetInt(struct + STIPPLEDLINEENABLE);
    }

    public static int nlineStippleFactor(long struct) {
        return MemoryUtil.memGetInt(struct + LINESTIPPLEFACTOR);
    }

    public static short nlineStipplePattern(long struct) {
        return MemoryUtil.memGetShort(struct + LINESTIPPLEPATTERN);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlineRasterizationMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + LINERASTERIZATIONMODE, value);
    }

    public static void nstippledLineEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + STIPPLEDLINEENABLE, value);
    }

    public static void nlineStippleFactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + LINESTIPPLEFACTOR, value);
    }

    public static void nlineStipplePattern(long struct, short value) {
        MemoryUtil.memPutShort(struct + LINESTIPPLEPATTERN, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationLineStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineRasterizationLineStateCreateInfo ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRasterizationLineStateCreateInfo.SIZEOF);
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
        public VkPipelineRasterizationLineStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRasterizationLineStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRasterizationLineStateCreateInfo.npNext(address());
        }

        @NativeType("VkLineRasterizationMode")
        public int lineRasterizationMode() {
            return VkPipelineRasterizationLineStateCreateInfo.nlineRasterizationMode(address());
        }

        @NativeType("VkBool32")
        public boolean stippledLineEnable() {
            return VkPipelineRasterizationLineStateCreateInfo.nstippledLineEnable(address()) != 0;
        }

        @NativeType("uint32_t")
        public int lineStippleFactor() {
            return VkPipelineRasterizationLineStateCreateInfo.nlineStippleFactor(address());
        }

        @NativeType("uint16_t")
        public short lineStipplePattern() {
            return VkPipelineRasterizationLineStateCreateInfo.nlineStipplePattern(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationLineStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000259001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationLineStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) {
            VkPipelineRasterizationLineStateCreateInfo.nlineRasterizationMode(address(), value);
            return this;
        }

        public Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRasterizationLineStateCreateInfo.nstippledLineEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer lineStippleFactor(@NativeType("uint32_t") int value) {
            VkPipelineRasterizationLineStateCreateInfo.nlineStippleFactor(address(), value);
            return this;
        }

        public Buffer lineStipplePattern(@NativeType("uint16_t") short value) {
            VkPipelineRasterizationLineStateCreateInfo.nlineStipplePattern(address(), value);
            return this;
        }
    }
}
