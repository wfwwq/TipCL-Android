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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo.class */
public class VkGraphicsPipelineCreateInfo extends Struct<VkGraphicsPipelineCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int STAGECOUNT;
    public static final int PSTAGES;
    public static final int PVERTEXINPUTSTATE;
    public static final int PINPUTASSEMBLYSTATE;
    public static final int PTESSELLATIONSTATE;
    public static final int PVIEWPORTSTATE;
    public static final int PRASTERIZATIONSTATE;
    public static final int PMULTISAMPLESTATE;
    public static final int PDEPTHSTENCILSTATE;
    public static final int PCOLORBLENDSTATE;
    public static final int PDYNAMICSTATE;
    public static final int LAYOUT;
    public static final int RENDERPASS;
    public static final int SUBPASS;
    public static final int BASEPIPELINEHANDLE;
    public static final int BASEPIPELINEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        PVERTEXINPUTSTATE = layout.offsetof(5);
        PINPUTASSEMBLYSTATE = layout.offsetof(6);
        PTESSELLATIONSTATE = layout.offsetof(7);
        PVIEWPORTSTATE = layout.offsetof(8);
        PRASTERIZATIONSTATE = layout.offsetof(9);
        PMULTISAMPLESTATE = layout.offsetof(10);
        PDEPTHSTENCILSTATE = layout.offsetof(11);
        PCOLORBLENDSTATE = layout.offsetof(12);
        PDYNAMICSTATE = layout.offsetof(13);
        LAYOUT = layout.offsetof(14);
        RENDERPASS = layout.offsetof(15);
        SUBPASS = layout.offsetof(16);
        BASEPIPELINEHANDLE = layout.offsetof(17);
        BASEPIPELINEINDEX = layout.offsetof(18);
    }

    protected VkGraphicsPipelineCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGraphicsPipelineCreateInfo create(long address, ByteBuffer container) {
        return new VkGraphicsPipelineCreateInfo(address, container);
    }

    public VkGraphicsPipelineCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineVertexInputStateCreateInfo const *")
    public VkPipelineVertexInputStateCreateInfo pVertexInputState() {
        return npVertexInputState(address());
    }

    @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
    public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
        return npInputAssemblyState(address());
    }

    @NativeType("VkPipelineTessellationStateCreateInfo const *")
    public VkPipelineTessellationStateCreateInfo pTessellationState() {
        return npTessellationState(address());
    }

    @NativeType("VkPipelineViewportStateCreateInfo const *")
    public VkPipelineViewportStateCreateInfo pViewportState() {
        return npViewportState(address());
    }

    @NativeType("VkPipelineRasterizationStateCreateInfo const *")
    public VkPipelineRasterizationStateCreateInfo pRasterizationState() {
        return npRasterizationState(address());
    }

    @NativeType("VkPipelineMultisampleStateCreateInfo const *")
    public VkPipelineMultisampleStateCreateInfo pMultisampleState() {
        return npMultisampleState(address());
    }

    @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
    public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
        return npDepthStencilState(address());
    }

    @NativeType("VkPipelineColorBlendStateCreateInfo const *")
    public VkPipelineColorBlendStateCreateInfo pColorBlendState() {
        return npColorBlendState(address());
    }

    @NativeType("VkPipelineDynamicStateCreateInfo const *")
    public VkPipelineDynamicStateCreateInfo pDynamicState() {
        return npDynamicState(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("VkRenderPass")
    public long renderPass() {
        return nrenderPass(address());
    }

    @NativeType("uint32_t")
    public int subpass() {
        return nsubpass(address());
    }

    @NativeType("VkPipeline")
    public long basePipelineHandle() {
        return nbasePipelineHandle(address());
    }

    @NativeType("int32_t")
    public int basePipelineIndex() {
        return nbasePipelineIndex(address());
    }

    public VkGraphicsPipelineCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo sType$Default() {
        return sType(28);
    }

    public VkGraphicsPipelineCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pNext(VkAttachmentSampleCountInfoAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkAttachmentSampleCountInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkCustomResolveCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkExternalFormatANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkGraphicsPipelineLibraryCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkGraphicsPipelineShaderGroupsCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineBinaryInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCompilerControlCreateInfoAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineDiscardRectangleStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineFragmentDensityMapLayeredCreateInfoVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineFragmentShadingRateEnumStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineFragmentShadingRateStateCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineLibraryCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRenderingCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRenderingCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRepresentativeFragmentTestStateCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRobustnessCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkPipelineRobustnessCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkRenderingAttachmentLocationInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkRenderingAttachmentLocationInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkRenderingInputAttachmentIndexInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo pNext(VkRenderingInputAttachmentIndexInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGraphicsPipelineCreateInfo flags(@NativeType("VkPipelineCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo stageCount(@NativeType("uint32_t") int value) {
        nstageCount(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
        npStages(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pVertexInputState(@NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) {
        npVertexInputState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pInputAssemblyState(@NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) {
        npInputAssemblyState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pTessellationState(@NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) {
        npTessellationState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pViewportState(@NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) {
        npViewportState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pRasterizationState(@NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) {
        npRasterizationState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pMultisampleState(@NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) {
        npMultisampleState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pDepthStencilState(@NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) {
        npDepthStencilState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pColorBlendState(@NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) {
        npColorBlendState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo pDynamicState(@NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) {
        npDynamicState(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo renderPass(@NativeType("VkRenderPass") long value) {
        nrenderPass(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo subpass(@NativeType("uint32_t") int value) {
        nsubpass(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo basePipelineHandle(@NativeType("VkPipeline") long value) {
        nbasePipelineHandle(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo basePipelineIndex(@NativeType("int32_t") int value) {
        nbasePipelineIndex(address(), value);
        return this;
    }

    public VkGraphicsPipelineCreateInfo set(int sType, long pNext, int flags, int stageCount, VkPipelineShaderStageCreateInfo.Buffer pStages, VkPipelineVertexInputStateCreateInfo pVertexInputState, VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState, VkPipelineTessellationStateCreateInfo pTessellationState, VkPipelineViewportStateCreateInfo pViewportState, VkPipelineRasterizationStateCreateInfo pRasterizationState, VkPipelineMultisampleStateCreateInfo pMultisampleState, VkPipelineDepthStencilStateCreateInfo pDepthStencilState, VkPipelineColorBlendStateCreateInfo pColorBlendState, VkPipelineDynamicStateCreateInfo pDynamicState, long layout, long renderPass, int subpass, long basePipelineHandle, int basePipelineIndex) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stageCount(stageCount);
        pStages(pStages);
        pVertexInputState(pVertexInputState);
        pInputAssemblyState(pInputAssemblyState);
        pTessellationState(pTessellationState);
        pViewportState(pViewportState);
        pRasterizationState(pRasterizationState);
        pMultisampleState(pMultisampleState);
        pDepthStencilState(pDepthStencilState);
        pColorBlendState(pColorBlendState);
        pDynamicState(pDynamicState);
        layout(layout);
        renderPass(renderPass);
        subpass(subpass);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);
        return this;
    }

    public VkGraphicsPipelineCreateInfo set(VkGraphicsPipelineCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGraphicsPipelineCreateInfo malloc() {
        return new VkGraphicsPipelineCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGraphicsPipelineCreateInfo calloc() {
        return new VkGraphicsPipelineCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGraphicsPipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGraphicsPipelineCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkGraphicsPipelineCreateInfo create(long address) {
        return new VkGraphicsPipelineCreateInfo(address, null);
    }

    public static VkGraphicsPipelineCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGraphicsPipelineCreateInfo(address, null);
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

    public static VkGraphicsPipelineCreateInfo malloc(MemoryStack stack) {
        return new VkGraphicsPipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGraphicsPipelineCreateInfo calloc(MemoryStack stack) {
        return new VkGraphicsPipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPipelineVertexInputStateCreateInfo npVertexInputState(long struct) {
        return VkPipelineVertexInputStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PVERTEXINPUTSTATE));
    }

    public static VkPipelineInputAssemblyStateCreateInfo npInputAssemblyState(long struct) {
        return VkPipelineInputAssemblyStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PINPUTASSEMBLYSTATE));
    }

    public static VkPipelineTessellationStateCreateInfo npTessellationState(long struct) {
        return VkPipelineTessellationStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PTESSELLATIONSTATE));
    }

    public static VkPipelineViewportStateCreateInfo npViewportState(long struct) {
        return VkPipelineViewportStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PVIEWPORTSTATE));
    }

    public static VkPipelineRasterizationStateCreateInfo npRasterizationState(long struct) {
        return VkPipelineRasterizationStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PRASTERIZATIONSTATE));
    }

    public static VkPipelineMultisampleStateCreateInfo npMultisampleState(long struct) {
        return VkPipelineMultisampleStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PMULTISAMPLESTATE));
    }

    public static VkPipelineDepthStencilStateCreateInfo npDepthStencilState(long struct) {
        return VkPipelineDepthStencilStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PDEPTHSTENCILSTATE));
    }

    public static VkPipelineColorBlendStateCreateInfo npColorBlendState(long struct) {
        return VkPipelineColorBlendStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PCOLORBLENDSTATE));
    }

    public static VkPipelineDynamicStateCreateInfo npDynamicState(long struct) {
        return VkPipelineDynamicStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PDYNAMICSTATE));
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static long nrenderPass(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERPASS);
    }

    public static int nsubpass(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASS);
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

    public static void npVertexInputState(long struct, VkPipelineVertexInputStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PVERTEXINPUTSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npInputAssemblyState(long struct, VkPipelineInputAssemblyStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PINPUTASSEMBLYSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npTessellationState(long struct, VkPipelineTessellationStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PTESSELLATIONSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npViewportState(long struct, VkPipelineViewportStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PVIEWPORTSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npRasterizationState(long struct, VkPipelineRasterizationStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PRASTERIZATIONSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npMultisampleState(long struct, VkPipelineMultisampleStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PMULTISAMPLESTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npDepthStencilState(long struct, VkPipelineDepthStencilStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PDEPTHSTENCILSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npColorBlendState(long struct, VkPipelineColorBlendStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PCOLORBLENDSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npDynamicState(long struct, VkPipelineDynamicStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PDYNAMICSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nrenderPass(long struct, long value) {
        MemoryUtil.memPutLong(struct + RENDERPASS, value);
    }

    public static void nsubpass(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASS, value);
    }

    public static void nbasePipelineHandle(long struct, long value) {
        MemoryUtil.memPutLong(struct + BASEPIPELINEHANDLE, value);
    }

    public static void nbasePipelineIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEPIPELINEINDEX, value);
    }

    public static void validate(long struct) {
        long pVertexInputState = MemoryUtil.memGetAddress(struct + PVERTEXINPUTSTATE);
        if (pVertexInputState != 0) {
            VkPipelineVertexInputStateCreateInfo.validate(pVertexInputState);
        }
        long pDynamicState = MemoryUtil.memGetAddress(struct + PDYNAMICSTATE);
        if (pDynamicState != 0) {
            VkPipelineDynamicStateCreateInfo.validate(pDynamicState);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsPipelineCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkGraphicsPipelineCreateInfo, Buffer> implements NativeResource {
        private static final VkGraphicsPipelineCreateInfo ELEMENT_FACTORY = VkGraphicsPipelineCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGraphicsPipelineCreateInfo.SIZEOF);
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
        public VkGraphicsPipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGraphicsPipelineCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGraphicsPipelineCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineCreateFlags")
        public int flags() {
            return VkGraphicsPipelineCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int stageCount() {
            return VkGraphicsPipelineCreateInfo.nstageCount(address());
        }

        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() {
            return VkGraphicsPipelineCreateInfo.npStages(address());
        }

        @NativeType("VkPipelineVertexInputStateCreateInfo const *")
        public VkPipelineVertexInputStateCreateInfo pVertexInputState() {
            return VkGraphicsPipelineCreateInfo.npVertexInputState(address());
        }

        @NativeType("VkPipelineInputAssemblyStateCreateInfo const *")
        public VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
            return VkGraphicsPipelineCreateInfo.npInputAssemblyState(address());
        }

        @NativeType("VkPipelineTessellationStateCreateInfo const *")
        public VkPipelineTessellationStateCreateInfo pTessellationState() {
            return VkGraphicsPipelineCreateInfo.npTessellationState(address());
        }

        @NativeType("VkPipelineViewportStateCreateInfo const *")
        public VkPipelineViewportStateCreateInfo pViewportState() {
            return VkGraphicsPipelineCreateInfo.npViewportState(address());
        }

        @NativeType("VkPipelineRasterizationStateCreateInfo const *")
        public VkPipelineRasterizationStateCreateInfo pRasterizationState() {
            return VkGraphicsPipelineCreateInfo.npRasterizationState(address());
        }

        @NativeType("VkPipelineMultisampleStateCreateInfo const *")
        public VkPipelineMultisampleStateCreateInfo pMultisampleState() {
            return VkGraphicsPipelineCreateInfo.npMultisampleState(address());
        }

        @NativeType("VkPipelineDepthStencilStateCreateInfo const *")
        public VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
            return VkGraphicsPipelineCreateInfo.npDepthStencilState(address());
        }

        @NativeType("VkPipelineColorBlendStateCreateInfo const *")
        public VkPipelineColorBlendStateCreateInfo pColorBlendState() {
            return VkGraphicsPipelineCreateInfo.npColorBlendState(address());
        }

        @NativeType("VkPipelineDynamicStateCreateInfo const *")
        public VkPipelineDynamicStateCreateInfo pDynamicState() {
            return VkGraphicsPipelineCreateInfo.npDynamicState(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkGraphicsPipelineCreateInfo.nlayout(address());
        }

        @NativeType("VkRenderPass")
        public long renderPass() {
            return VkGraphicsPipelineCreateInfo.nrenderPass(address());
        }

        @NativeType("uint32_t")
        public int subpass() {
            return VkGraphicsPipelineCreateInfo.nsubpass(address());
        }

        @NativeType("VkPipeline")
        public long basePipelineHandle() {
            return VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address());
        }

        @NativeType("int32_t")
        public int basePipelineIndex() {
            return VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGraphicsPipelineCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(28);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGraphicsPipelineCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAttachmentSampleCountInfoAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkAttachmentSampleCountInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCustomResolveCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalFormatANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkGraphicsPipelineLibraryCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkGraphicsPipelineShaderGroupsCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineBinaryInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) {
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

        public Buffer pNext(VkPipelineDiscardRectangleStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineFragmentDensityMapLayeredCreateInfoVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineFragmentShadingRateEnumStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineFragmentShadingRateStateCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineLibraryCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRenderingCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRenderingCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRepresentativeFragmentTestStateCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderingAttachmentLocationInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderingAttachmentLocationInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderingInputAttachmentIndexInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderingInputAttachmentIndexInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineCreateFlags") int value) {
            VkGraphicsPipelineCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer stageCount(@NativeType("uint32_t") int value) {
            VkGraphicsPipelineCreateInfo.nstageCount(address(), value);
            return this;
        }

        public Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
            VkGraphicsPipelineCreateInfo.npStages(address(), value);
            return this;
        }

        public Buffer pVertexInputState(@NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npVertexInputState(address(), value);
            return this;
        }

        public Buffer pInputAssemblyState(@NativeType("VkPipelineInputAssemblyStateCreateInfo const *") VkPipelineInputAssemblyStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npInputAssemblyState(address(), value);
            return this;
        }

        public Buffer pTessellationState(@NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npTessellationState(address(), value);
            return this;
        }

        public Buffer pViewportState(@NativeType("VkPipelineViewportStateCreateInfo const *") VkPipelineViewportStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npViewportState(address(), value);
            return this;
        }

        public Buffer pRasterizationState(@NativeType("VkPipelineRasterizationStateCreateInfo const *") VkPipelineRasterizationStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npRasterizationState(address(), value);
            return this;
        }

        public Buffer pMultisampleState(@NativeType("VkPipelineMultisampleStateCreateInfo const *") VkPipelineMultisampleStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npMultisampleState(address(), value);
            return this;
        }

        public Buffer pDepthStencilState(@NativeType("VkPipelineDepthStencilStateCreateInfo const *") VkPipelineDepthStencilStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npDepthStencilState(address(), value);
            return this;
        }

        public Buffer pColorBlendState(@NativeType("VkPipelineColorBlendStateCreateInfo const *") VkPipelineColorBlendStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npColorBlendState(address(), value);
            return this;
        }

        public Buffer pDynamicState(@NativeType("VkPipelineDynamicStateCreateInfo const *") VkPipelineDynamicStateCreateInfo value) {
            VkGraphicsPipelineCreateInfo.npDynamicState(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkGraphicsPipelineCreateInfo.nlayout(address(), value);
            return this;
        }

        public Buffer renderPass(@NativeType("VkRenderPass") long value) {
            VkGraphicsPipelineCreateInfo.nrenderPass(address(), value);
            return this;
        }

        public Buffer subpass(@NativeType("uint32_t") int value) {
            VkGraphicsPipelineCreateInfo.nsubpass(address(), value);
            return this;
        }

        public Buffer basePipelineHandle(@NativeType("VkPipeline") long value) {
            VkGraphicsPipelineCreateInfo.nbasePipelineHandle(address(), value);
            return this;
        }

        public Buffer basePipelineIndex(@NativeType("int32_t") int value) {
            VkGraphicsPipelineCreateInfo.nbasePipelineIndex(address(), value);
            return this;
        }
    }
}
