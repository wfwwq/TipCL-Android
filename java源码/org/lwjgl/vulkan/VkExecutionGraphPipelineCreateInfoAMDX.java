package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineCreateInfoAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineCreateInfoAMDX.class */
public class VkExecutionGraphPipelineCreateInfoAMDX extends Struct<VkExecutionGraphPipelineCreateInfoAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int STAGECOUNT;
    public static final int PSTAGES;
    public static final int PLIBRARYINFO;
    public static final int LAYOUT;
    public static final int BASEPIPELINEHANDLE;
    public static final int BASEPIPELINEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        PLIBRARYINFO = layout.offsetof(5);
        LAYOUT = layout.offsetof(6);
        BASEPIPELINEHANDLE = layout.offsetof(7);
        BASEPIPELINEINDEX = layout.offsetof(8);
    }

    protected VkExecutionGraphPipelineCreateInfoAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExecutionGraphPipelineCreateInfoAMDX create(long address, ByteBuffer container) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(address, container);
    }

    public VkExecutionGraphPipelineCreateInfoAMDX(ByteBuffer container) {
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

    @NativeType("VkPipelineCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int stageCount() {
        return nstageCount(address());
    }

    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() {
        return npStages(address());
    }

    @NativeType("VkPipelineLibraryCreateInfoKHR const *")
    public VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
        return npLibraryInfo(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("VkPipeline")
    public long basePipelineHandle() {
        return nbasePipelineHandle(address());
    }

    @NativeType("int32_t")
    public int basePipelineIndex() {
        return nbasePipelineIndex(address());
    }

    public VkExecutionGraphPipelineCreateInfoAMDX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX sType$Default() {
        return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX);
    }

    public VkExecutionGraphPipelineCreateInfoAMDX pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCompilerControlCreateInfoAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCreationFeedbackCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkExecutionGraphPipelineCreateInfoAMDX flags(@NativeType("VkPipelineCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX stageCount(@NativeType("uint32_t") int value) {
        nstageCount(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
        npStages(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX pLibraryInfo(@NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) {
        npLibraryInfo(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineHandle(@NativeType("VkPipeline") long value) {
        nbasePipelineHandle(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineIndex(@NativeType("int32_t") int value) {
        nbasePipelineIndex(address(), value);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX set(int sType, long pNext, int flags, int stageCount, VkPipelineShaderStageCreateInfo.Buffer pStages, VkPipelineLibraryCreateInfoKHR pLibraryInfo, long layout, long basePipelineHandle, int basePipelineIndex) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stageCount(stageCount);
        pStages(pStages);
        pLibraryInfo(pLibraryInfo);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);
        return this;
    }

    public VkExecutionGraphPipelineCreateInfoAMDX set(VkExecutionGraphPipelineCreateInfoAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX malloc() {
        return new VkExecutionGraphPipelineCreateInfoAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX calloc() {
        return new VkExecutionGraphPipelineCreateInfoAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExecutionGraphPipelineCreateInfoAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX create(long address) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(address, null);
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExecutionGraphPipelineCreateInfoAMDX(address, null);
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

    public static VkExecutionGraphPipelineCreateInfoAMDX malloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExecutionGraphPipelineCreateInfoAMDX calloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstageCount(long struct) {
        return MemoryUtil.memGetInt(struct + STAGECOUNT);
    }

    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) {
        return VkPipelineShaderStageCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PSTAGES), nstageCount(struct));
    }

    public static VkPipelineLibraryCreateInfoKHR npLibraryInfo(long struct) {
        return VkPipelineLibraryCreateInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PLIBRARYINFO));
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static long nbasePipelineHandle(long struct) {
        return MemoryUtil.memGetLong(struct + BASEPIPELINEHANDLE);
    }

    public static int nbasePipelineIndex(long struct) {
        return MemoryUtil.memGetInt(struct + BASEPIPELINEINDEX);
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

    public static void nstageCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGECOUNT, value);
    }

    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTAGES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nstageCount(struct, value.remaining());
        }
    }

    public static void npLibraryInfo(long struct, VkPipelineLibraryCreateInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PLIBRARYINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nbasePipelineHandle(long struct, long value) {
        MemoryUtil.memPutLong(struct + BASEPIPELINEHANDLE, value);
    }

    public static void nbasePipelineIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEPIPELINEINDEX, value);
    }

    public static void validate(long struct) {
        long pLibraryInfo = MemoryUtil.memGetAddress(struct + PLIBRARYINFO);
        if (pLibraryInfo != 0) {
            VkPipelineLibraryCreateInfoKHR.validate(pLibraryInfo);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineCreateInfoAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExecutionGraphPipelineCreateInfoAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkExecutionGraphPipelineCreateInfoAMDX, Buffer> implements NativeResource {
        private static final VkExecutionGraphPipelineCreateInfoAMDX ELEMENT_FACTORY = VkExecutionGraphPipelineCreateInfoAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExecutionGraphPipelineCreateInfoAMDX.SIZEOF);
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
        public VkExecutionGraphPipelineCreateInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExecutionGraphPipelineCreateInfoAMDX.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExecutionGraphPipelineCreateInfoAMDX.npNext(address());
        }

        @NativeType("VkPipelineCreateFlags")
        public int flags() {
            return VkExecutionGraphPipelineCreateInfoAMDX.nflags(address());
        }

        @NativeType("uint32_t")
        public int stageCount() {
            return VkExecutionGraphPipelineCreateInfoAMDX.nstageCount(address());
        }

        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() {
            return VkExecutionGraphPipelineCreateInfoAMDX.npStages(address());
        }

        @NativeType("VkPipelineLibraryCreateInfoKHR const *")
        public VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
            return VkExecutionGraphPipelineCreateInfoAMDX.npLibraryInfo(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkExecutionGraphPipelineCreateInfoAMDX.nlayout(address());
        }

        @NativeType("VkPipeline")
        public long basePipelineHandle() {
            return VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineHandle(address());
        }

        @NativeType("int32_t")
        public int basePipelineIndex() {
            return VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExecutionGraphPipelineCreateInfoAMDX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExecutionGraphPipelineCreateInfoAMDX.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineCreateFlags") int value) {
            VkExecutionGraphPipelineCreateInfoAMDX.nflags(address(), value);
            return this;
        }

        public Buffer stageCount(@NativeType("uint32_t") int value) {
            VkExecutionGraphPipelineCreateInfoAMDX.nstageCount(address(), value);
            return this;
        }

        public Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
            VkExecutionGraphPipelineCreateInfoAMDX.npStages(address(), value);
            return this;
        }

        public Buffer pLibraryInfo(@NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) {
            VkExecutionGraphPipelineCreateInfoAMDX.npLibraryInfo(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkExecutionGraphPipelineCreateInfoAMDX.nlayout(address(), value);
            return this;
        }

        public Buffer basePipelineHandle(@NativeType("VkPipeline") long value) {
            VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineHandle(address(), value);
            return this;
        }

        public Buffer basePipelineIndex(@NativeType("int32_t") int value) {
            VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineIndex(address(), value);
            return this;
        }
    }
}
