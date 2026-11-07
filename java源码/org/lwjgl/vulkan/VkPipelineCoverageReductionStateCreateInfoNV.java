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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageReductionStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageReductionStateCreateInfoNV.class */
public class VkPipelineCoverageReductionStateCreateInfoNV extends Struct<VkPipelineCoverageReductionStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int COVERAGEREDUCTIONMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COVERAGEREDUCTIONMODE = layout.offsetof(3);
    }

    protected VkPipelineCoverageReductionStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCoverageReductionStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineCoverageReductionStateCreateInfoNV(address, container);
    }

    public VkPipelineCoverageReductionStateCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkPipelineCoverageReductionStateCreateFlagsNV")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkCoverageReductionModeNV")
    public int coverageReductionMode() {
        return ncoverageReductionMode(address());
    }

    public VkPipelineCoverageReductionStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineCoverageReductionStateCreateInfoNV sType$Default() {
        return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV);
    }

    public VkPipelineCoverageReductionStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineCoverageReductionStateCreateInfoNV flags(@NativeType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineCoverageReductionStateCreateInfoNV coverageReductionMode(@NativeType("VkCoverageReductionModeNV") int value) {
        ncoverageReductionMode(address(), value);
        return this;
    }

    public VkPipelineCoverageReductionStateCreateInfoNV set(int sType, long pNext, int flags, int coverageReductionMode) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageReductionMode(coverageReductionMode);
        return this;
    }

    public VkPipelineCoverageReductionStateCreateInfoNV set(VkPipelineCoverageReductionStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCoverageReductionStateCreateInfoNV malloc() {
        return new VkPipelineCoverageReductionStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCoverageReductionStateCreateInfoNV calloc() {
        return new VkPipelineCoverageReductionStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCoverageReductionStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCoverageReductionStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCoverageReductionStateCreateInfoNV create(long address) {
        return new VkPipelineCoverageReductionStateCreateInfoNV(address, null);
    }

    public static VkPipelineCoverageReductionStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCoverageReductionStateCreateInfoNV(address, null);
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

    public static VkPipelineCoverageReductionStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineCoverageReductionStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCoverageReductionStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineCoverageReductionStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncoverageReductionMode(long struct) {
        return MemoryUtil.memGetInt(struct + COVERAGEREDUCTIONMODE);
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

    public static void ncoverageReductionMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + COVERAGEREDUCTIONMODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageReductionStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCoverageReductionStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCoverageReductionStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineCoverageReductionStateCreateInfoNV ELEMENT_FACTORY = VkPipelineCoverageReductionStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCoverageReductionStateCreateInfoNV.SIZEOF);
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
        public VkPipelineCoverageReductionStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineCoverageReductionStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineCoverageReductionStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkPipelineCoverageReductionStateCreateFlagsNV")
        public int flags() {
            return VkPipelineCoverageReductionStateCreateInfoNV.nflags(address());
        }

        @NativeType("VkCoverageReductionModeNV")
        public int coverageReductionMode() {
            return VkPipelineCoverageReductionStateCreateInfoNV.ncoverageReductionMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCoverageReductionStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCoverageReductionStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) {
            VkPipelineCoverageReductionStateCreateInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer coverageReductionMode(@NativeType("VkCoverageReductionModeNV") int value) {
            VkPipelineCoverageReductionStateCreateInfoNV.ncoverageReductionMode(address(), value);
            return this;
        }
    }
}
