package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo;
import org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR.class */
public class VkRayTracingPipelineCreateInfoKHR extends Struct<VkRayTracingPipelineCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int STAGECOUNT;
    public static final int PSTAGES;
    public static final int GROUPCOUNT;
    public static final int PGROUPS;
    public static final int MAXPIPELINERAYRECURSIONDEPTH;
    public static final int PLIBRARYINFO;
    public static final int PLIBRARYINTERFACE;
    public static final int PDYNAMICSTATE;
    public static final int LAYOUT;
    public static final int BASEPIPELINEHANDLE;
    public static final int BASEPIPELINEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        GROUPCOUNT = layout.offsetof(5);
        PGROUPS = layout.offsetof(6);
        MAXPIPELINERAYRECURSIONDEPTH = layout.offsetof(7);
        PLIBRARYINFO = layout.offsetof(8);
        PLIBRARYINTERFACE = layout.offsetof(9);
        PDYNAMICSTATE = layout.offsetof(10);
        LAYOUT = layout.offsetof(11);
        BASEPIPELINEHANDLE = layout.offsetof(12);
        BASEPIPELINEINDEX = layout.offsetof(13);
    }

    protected VkRayTracingPipelineCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRayTracingPipelineCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkRayTracingPipelineCreateInfoKHR(address, container);
    }

    public VkRayTracingPipelineCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int groupCount() {
        return ngroupCount(address());
    }

    @NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
    public VkRayTracingShaderGroupCreateInfoKHR.Buffer pGroups() {
        return npGroups(address());
    }

    @NativeType("uint32_t")
    public int maxPipelineRayRecursionDepth() {
        return nmaxPipelineRayRecursionDepth(address());
    }

    @NativeType("VkPipelineLibraryCreateInfoKHR const *")
    public VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
        return npLibraryInfo(address());
    }

    @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
    public VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
        return npLibraryInterface(address());
    }

    @NativeType("VkPipelineDynamicStateCreateInfo const *")
    public VkPipelineDynamicStateCreateInfo pDynamicState() {
        return npDynamicState(address());
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

    public VkRayTracingPipelineCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR sType$Default() {
        return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR);
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineBinaryInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreateFlags2CreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreateFlags2CreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreationFeedbackCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineRobustnessCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkPipelineRobustnessCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR pNext(VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoKHR flags(@NativeType("VkPipelineCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
        npStages(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") VkRayTracingShaderGroupCreateInfoKHR.Buffer value) {
        npGroups(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR maxPipelineRayRecursionDepth(@NativeType("uint32_t") int value) {
        nmaxPipelineRayRecursionDepth(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR pLibraryInfo(@NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) {
        npLibraryInfo(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR pLibraryInterface(@NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") VkRayTracingPipelineInterfaceCreateInfoKHR value) {
        npLibraryInterface(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR pDynamicState(@NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) {
        npDynamicState(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR basePipelineHandle(@NativeType("VkPipeline") long value) {
        nbasePipelineHandle(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR basePipelineIndex(@NativeType("int32_t") int value) {
        nbasePipelineIndex(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR set(int sType, long pNext, int flags, VkPipelineShaderStageCreateInfo.Buffer pStages, VkRayTracingShaderGroupCreateInfoKHR.Buffer pGroups, int maxPipelineRayRecursionDepth, VkPipelineLibraryCreateInfoKHR pLibraryInfo, VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface, VkPipelineDynamicStateCreateInfo pDynamicState, long layout, long basePipelineHandle, int basePipelineIndex) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStages(pStages);
        pGroups(pGroups);
        maxPipelineRayRecursionDepth(maxPipelineRayRecursionDepth);
        pLibraryInfo(pLibraryInfo);
        pLibraryInterface(pLibraryInterface);
        pDynamicState(pDynamicState);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);
        return this;
    }

    public VkRayTracingPipelineCreateInfoKHR set(VkRayTracingPipelineCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRayTracingPipelineCreateInfoKHR malloc() {
        return new VkRayTracingPipelineCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRayTracingPipelineCreateInfoKHR calloc() {
        return new VkRayTracingPipelineCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRayTracingPipelineCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingPipelineCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRayTracingPipelineCreateInfoKHR create(long address) {
        return new VkRayTracingPipelineCreateInfoKHR(address, null);
    }

    public static VkRayTracingPipelineCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRayTracingPipelineCreateInfoKHR(address, null);
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

    public static VkRayTracingPipelineCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRayTracingPipelineCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ngroupCount(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNT);
    }

    public static VkRayTracingShaderGroupCreateInfoKHR.Buffer npGroups(long struct) {
        return VkRayTracingShaderGroupCreateInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PGROUPS), ngroupCount(struct));
    }

    public static int nmaxPipelineRayRecursionDepth(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPIPELINERAYRECURSIONDEPTH);
    }

    public static VkPipelineLibraryCreateInfoKHR npLibraryInfo(long struct) {
        return VkPipelineLibraryCreateInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PLIBRARYINFO));
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR npLibraryInterface(long struct) {
        return VkRayTracingPipelineInterfaceCreateInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PLIBRARYINTERFACE));
    }

    public static VkPipelineDynamicStateCreateInfo npDynamicState(long struct) {
        return VkPipelineDynamicStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PDYNAMICSTATE));
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
        nstageCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ngroupCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNT, value);
    }

    public static void npGroups(long struct, VkRayTracingShaderGroupCreateInfoKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PGROUPS, MemoryUtil.memAddressSafe(value));
        ngroupCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nmaxPipelineRayRecursionDepth(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXPIPELINERAYRECURSIONDEPTH, value);
    }

    public static void npLibraryInfo(long struct, VkPipelineLibraryCreateInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PLIBRARYINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void npLibraryInterface(long struct, VkRayTracingPipelineInterfaceCreateInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PLIBRARYINTERFACE, MemoryUtil.memAddressSafe(value));
    }

    public static void npDynamicState(long struct, VkPipelineDynamicStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PDYNAMICSTATE, MemoryUtil.memAddressSafe(value));
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
        int stageCount = nstageCount(struct);
        if (stageCount != 0) {
            long pStages = MemoryUtil.memGetAddress(struct + PSTAGES);
            Checks.check(pStages);
            validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        }
        if (ngroupCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PGROUPS));
        }
        long pLibraryInfo = MemoryUtil.memGetAddress(struct + PLIBRARYINFO);
        if (pLibraryInfo != 0) {
            VkPipelineLibraryCreateInfoKHR.validate(pLibraryInfo);
        }
        long pDynamicState = MemoryUtil.memGetAddress(struct + PDYNAMICSTATE);
        if (pDynamicState != 0) {
            VkPipelineDynamicStateCreateInfo.validate(pDynamicState);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkRayTracingPipelineCreateInfoKHR ELEMENT_FACTORY = VkRayTracingPipelineCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRayTracingPipelineCreateInfoKHR.SIZEOF);
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
        public VkRayTracingPipelineCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRayTracingPipelineCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRayTracingPipelineCreateInfoKHR.npNext(address());
        }

        @NativeType("VkPipelineCreateFlags")
        public int flags() {
            return VkRayTracingPipelineCreateInfoKHR.nflags(address());
        }

        @NativeType("uint32_t")
        public int stageCount() {
            return VkRayTracingPipelineCreateInfoKHR.nstageCount(address());
        }

        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() {
            return VkRayTracingPipelineCreateInfoKHR.npStages(address());
        }

        @NativeType("uint32_t")
        public int groupCount() {
            return VkRayTracingPipelineCreateInfoKHR.ngroupCount(address());
        }

        @NativeType("VkRayTracingShaderGroupCreateInfoKHR const *")
        public VkRayTracingShaderGroupCreateInfoKHR.Buffer pGroups() {
            return VkRayTracingPipelineCreateInfoKHR.npGroups(address());
        }

        @NativeType("uint32_t")
        public int maxPipelineRayRecursionDepth() {
            return VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(address());
        }

        @NativeType("VkPipelineLibraryCreateInfoKHR const *")
        public VkPipelineLibraryCreateInfoKHR pLibraryInfo() {
            return VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(address());
        }

        @NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *")
        public VkRayTracingPipelineInterfaceCreateInfoKHR pLibraryInterface() {
            return VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(address());
        }

        @NativeType("VkPipelineDynamicStateCreateInfo const *")
        public VkPipelineDynamicStateCreateInfo pDynamicState() {
            return VkRayTracingPipelineCreateInfoKHR.npDynamicState(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkRayTracingPipelineCreateInfoKHR.nlayout(address());
        }

        @NativeType("VkPipeline")
        public long basePipelineHandle() {
            return VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(address());
        }

        @NativeType("int32_t")
        public int basePipelineIndex() {
            return VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRayTracingPipelineCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRayTracingPipelineCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineBinaryInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreateFlags2CreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRayTracingPipelineClusterAccelerationStructureCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineCreateFlags") int value) {
            VkRayTracingPipelineCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
            VkRayTracingPipelineCreateInfoKHR.npStages(address(), value);
            return this;
        }

        public Buffer pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoKHR const *") VkRayTracingShaderGroupCreateInfoKHR.Buffer value) {
            VkRayTracingPipelineCreateInfoKHR.npGroups(address(), value);
            return this;
        }

        public Buffer maxPipelineRayRecursionDepth(@NativeType("uint32_t") int value) {
            VkRayTracingPipelineCreateInfoKHR.nmaxPipelineRayRecursionDepth(address(), value);
            return this;
        }

        public Buffer pLibraryInfo(@NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) {
            VkRayTracingPipelineCreateInfoKHR.npLibraryInfo(address(), value);
            return this;
        }

        public Buffer pLibraryInterface(@NativeType("VkRayTracingPipelineInterfaceCreateInfoKHR const *") VkRayTracingPipelineInterfaceCreateInfoKHR value) {
            VkRayTracingPipelineCreateInfoKHR.npLibraryInterface(address(), value);
            return this;
        }

        public Buffer pDynamicState(@NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) {
            VkRayTracingPipelineCreateInfoKHR.npDynamicState(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkRayTracingPipelineCreateInfoKHR.nlayout(address(), value);
            return this;
        }

        public Buffer basePipelineHandle(@NativeType("VkPipeline") long value) {
            VkRayTracingPipelineCreateInfoKHR.nbasePipelineHandle(address(), value);
            return this;
        }

        public Buffer basePipelineIndex(@NativeType("int32_t") int value) {
            VkRayTracingPipelineCreateInfoKHR.nbasePipelineIndex(address(), value);
            return this;
        }
    }
}
