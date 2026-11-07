package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageModulationStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageModulationStateCreateInfoNV.class */
public class VkPipelineCoverageModulationStateCreateInfoNV extends Struct<VkPipelineCoverageModulationStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int COVERAGEMODULATIONMODE;
    public static final int COVERAGEMODULATIONTABLEENABLE;
    public static final int COVERAGEMODULATIONTABLECOUNT;
    public static final int PCOVERAGEMODULATIONTABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COVERAGEMODULATIONMODE = layout.offsetof(3);
        COVERAGEMODULATIONTABLEENABLE = layout.offsetof(4);
        COVERAGEMODULATIONTABLECOUNT = layout.offsetof(5);
        PCOVERAGEMODULATIONTABLE = layout.offsetof(6);
    }

    protected VkPipelineCoverageModulationStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCoverageModulationStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineCoverageModulationStateCreateInfoNV(address, container);
    }

    public VkPipelineCoverageModulationStateCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkPipelineCoverageModulationStateCreateFlagsNV")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkCoverageModulationModeNV")
    public int coverageModulationMode() {
        return ncoverageModulationMode(address());
    }

    @NativeType("VkBool32")
    public boolean coverageModulationTableEnable() {
        return ncoverageModulationTableEnable(address()) != 0;
    }

    @NativeType("uint32_t")
    public int coverageModulationTableCount() {
        return ncoverageModulationTableCount(address());
    }

    @NativeType("float const *")
    public FloatBuffer pCoverageModulationTable() {
        return npCoverageModulationTable(address());
    }

    public VkPipelineCoverageModulationStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV sType$Default() {
        return sType(NVFramebufferMixedSamples.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
    }

    public VkPipelineCoverageModulationStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV flags(@NativeType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationMode(@NativeType("VkCoverageModulationModeNV") int value) {
        ncoverageModulationMode(address(), value);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnable(@NativeType("VkBool32") boolean value) {
        ncoverageModulationTableEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCount(@NativeType("uint32_t") int value) {
        ncoverageModulationTableCount(address(), value);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTable(@NativeType("float const *") FloatBuffer value) {
        npCoverageModulationTable(address(), value);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV set(int sType, long pNext, int flags, int coverageModulationMode, boolean coverageModulationTableEnable, int coverageModulationTableCount, FloatBuffer pCoverageModulationTable) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageModulationMode(coverageModulationMode);
        coverageModulationTableEnable(coverageModulationTableEnable);
        coverageModulationTableCount(coverageModulationTableCount);
        pCoverageModulationTable(pCoverageModulationTable);
        return this;
    }

    public VkPipelineCoverageModulationStateCreateInfoNV set(VkPipelineCoverageModulationStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV malloc() {
        return new VkPipelineCoverageModulationStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV calloc() {
        return new VkPipelineCoverageModulationStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCoverageModulationStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV create(long address) {
        return new VkPipelineCoverageModulationStateCreateInfoNV(address, null);
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCoverageModulationStateCreateInfoNV(address, null);
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

    public static VkPipelineCoverageModulationStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineCoverageModulationStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCoverageModulationStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineCoverageModulationStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncoverageModulationMode(long struct) {
        return MemoryUtil.memGetInt(struct + COVERAGEMODULATIONMODE);
    }

    public static int ncoverageModulationTableEnable(long struct) {
        return MemoryUtil.memGetInt(struct + COVERAGEMODULATIONTABLEENABLE);
    }

    public static int ncoverageModulationTableCount(long struct) {
        return MemoryUtil.memGetInt(struct + COVERAGEMODULATIONTABLECOUNT);
    }

    public static FloatBuffer npCoverageModulationTable(long struct) {
        return MemoryUtil.memFloatBufferSafe(MemoryUtil.memGetAddress(struct + PCOVERAGEMODULATIONTABLE), ncoverageModulationTableCount(struct));
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

    public static void ncoverageModulationMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + COVERAGEMODULATIONMODE, value);
    }

    public static void ncoverageModulationTableEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + COVERAGEMODULATIONTABLEENABLE, value);
    }

    public static void ncoverageModulationTableCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COVERAGEMODULATIONTABLECOUNT, value);
    }

    public static void npCoverageModulationTable(long struct, FloatBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOVERAGEMODULATIONTABLE, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncoverageModulationTableCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageModulationStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageModulationStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCoverageModulationStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineCoverageModulationStateCreateInfoNV ELEMENT_FACTORY = VkPipelineCoverageModulationStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCoverageModulationStateCreateInfoNV.SIZEOF);
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
        public VkPipelineCoverageModulationStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineCoverageModulationStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineCoverageModulationStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkPipelineCoverageModulationStateCreateFlagsNV")
        public int flags() {
            return VkPipelineCoverageModulationStateCreateInfoNV.nflags(address());
        }

        @NativeType("VkCoverageModulationModeNV")
        public int coverageModulationMode() {
            return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationMode(address());
        }

        @NativeType("VkBool32")
        public boolean coverageModulationTableEnable() {
            return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableEnable(address()) != 0;
        }

        @NativeType("uint32_t")
        public int coverageModulationTableCount() {
            return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableCount(address());
        }

        @NativeType("float const *")
        public FloatBuffer pCoverageModulationTable() {
            return VkPipelineCoverageModulationStateCreateInfoNV.npCoverageModulationTable(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCoverageModulationStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVFramebufferMixedSamples.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCoverageModulationStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) {
            VkPipelineCoverageModulationStateCreateInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer coverageModulationMode(@NativeType("VkCoverageModulationModeNV") int value) {
            VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationMode(address(), value);
            return this;
        }

        public Buffer coverageModulationTableEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer coverageModulationTableCount(@NativeType("uint32_t") int value) {
            VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableCount(address(), value);
            return this;
        }

        public Buffer pCoverageModulationTable(@NativeType("float const *") FloatBuffer value) {
            VkPipelineCoverageModulationStateCreateInfoNV.npCoverageModulationTable(address(), value);
            return this;
        }
    }
}
