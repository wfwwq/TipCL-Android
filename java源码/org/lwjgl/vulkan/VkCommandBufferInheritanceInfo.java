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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo.class */
public class VkCommandBufferInheritanceInfo extends Struct<VkCommandBufferInheritanceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RENDERPASS;
    public static final int SUBPASS;
    public static final int FRAMEBUFFER;
    public static final int OCCLUSIONQUERYENABLE;
    public static final int QUERYFLAGS;
    public static final int PIPELINESTATISTICS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(8), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        SUBPASS = layout.offsetof(3);
        FRAMEBUFFER = layout.offsetof(4);
        OCCLUSIONQUERYENABLE = layout.offsetof(5);
        QUERYFLAGS = layout.offsetof(6);
        PIPELINESTATISTICS = layout.offsetof(7);
    }

    protected VkCommandBufferInheritanceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferInheritanceInfo create(long address, ByteBuffer container) {
        return new VkCommandBufferInheritanceInfo(address, container);
    }

    public VkCommandBufferInheritanceInfo(ByteBuffer container) {
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

    @NativeType("VkRenderPass")
    public long renderPass() {
        return nrenderPass(address());
    }

    @NativeType("uint32_t")
    public int subpass() {
        return nsubpass(address());
    }

    @NativeType("VkFramebuffer")
    public long framebuffer() {
        return nframebuffer(address());
    }

    @NativeType("VkBool32")
    public boolean occlusionQueryEnable() {
        return nocclusionQueryEnable(address()) != 0;
    }

    @NativeType("VkQueryControlFlags")
    public int queryFlags() {
        return nqueryFlags(address());
    }

    @NativeType("VkQueryPipelineStatisticFlags")
    public int pipelineStatistics() {
        return npipelineStatistics(address());
    }

    public VkCommandBufferInheritanceInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceInfo sType$Default() {
        return sType(41);
    }

    public VkCommandBufferInheritanceInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceInfo pNext(VkAttachmentSampleCountInfoAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkAttachmentSampleCountInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceConditionalRenderingInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceDescriptorHeapInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceRenderPassTransformInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceRenderingInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceRenderingInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkCommandBufferInheritanceViewportScissorInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkCustomResolveCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkExternalFormatANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkRenderingAttachmentLocationInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkRenderingAttachmentLocationInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkRenderingInputAttachmentIndexInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkRenderingInputAttachmentIndexInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo pNext(VkTileMemoryBindInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferInheritanceInfo renderPass(@NativeType("VkRenderPass") long value) {
        nrenderPass(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceInfo subpass(@NativeType("uint32_t") int value) {
        nsubpass(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceInfo framebuffer(@NativeType("VkFramebuffer") long value) {
        nframebuffer(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceInfo occlusionQueryEnable(@NativeType("VkBool32") boolean value) {
        nocclusionQueryEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkCommandBufferInheritanceInfo queryFlags(@NativeType("VkQueryControlFlags") int value) {
        nqueryFlags(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceInfo pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) {
        npipelineStatistics(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceInfo set(int sType, long pNext, long renderPass, int subpass, long framebuffer, boolean occlusionQueryEnable, int queryFlags, int pipelineStatistics) {
        sType(sType);
        pNext(pNext);
        renderPass(renderPass);
        subpass(subpass);
        framebuffer(framebuffer);
        occlusionQueryEnable(occlusionQueryEnable);
        queryFlags(queryFlags);
        pipelineStatistics(pipelineStatistics);
        return this;
    }

    public VkCommandBufferInheritanceInfo set(VkCommandBufferInheritanceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferInheritanceInfo malloc() {
        return new VkCommandBufferInheritanceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferInheritanceInfo calloc() {
        return new VkCommandBufferInheritanceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferInheritanceInfo create(long address) {
        return new VkCommandBufferInheritanceInfo(address, null);
    }

    public static VkCommandBufferInheritanceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceInfo(address, null);
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

    public static VkCommandBufferInheritanceInfo malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceInfo calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nrenderPass(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERPASS);
    }

    public static int nsubpass(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASS);
    }

    public static long nframebuffer(long struct) {
        return MemoryUtil.memGetLong(struct + FRAMEBUFFER);
    }

    public static int nocclusionQueryEnable(long struct) {
        return MemoryUtil.memGetInt(struct + OCCLUSIONQUERYENABLE);
    }

    public static int nqueryFlags(long struct) {
        return MemoryUtil.memGetInt(struct + QUERYFLAGS);
    }

    public static int npipelineStatistics(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINESTATISTICS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrenderPass(long struct, long value) {
        MemoryUtil.memPutLong(struct + RENDERPASS, value);
    }

    public static void nsubpass(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASS, value);
    }

    public static void nframebuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + FRAMEBUFFER, value);
    }

    public static void nocclusionQueryEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + OCCLUSIONQUERYENABLE, value);
    }

    public static void nqueryFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUERYFLAGS, value);
    }

    public static void npipelineStatistics(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINESTATISTICS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceInfo, Buffer> implements NativeResource {
        private static final VkCommandBufferInheritanceInfo ELEMENT_FACTORY = VkCommandBufferInheritanceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferInheritanceInfo.SIZEOF);
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
        public VkCommandBufferInheritanceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferInheritanceInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferInheritanceInfo.npNext(address());
        }

        @NativeType("VkRenderPass")
        public long renderPass() {
            return VkCommandBufferInheritanceInfo.nrenderPass(address());
        }

        @NativeType("uint32_t")
        public int subpass() {
            return VkCommandBufferInheritanceInfo.nsubpass(address());
        }

        @NativeType("VkFramebuffer")
        public long framebuffer() {
            return VkCommandBufferInheritanceInfo.nframebuffer(address());
        }

        @NativeType("VkBool32")
        public boolean occlusionQueryEnable() {
            return VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address()) != 0;
        }

        @NativeType("VkQueryControlFlags")
        public int queryFlags() {
            return VkCommandBufferInheritanceInfo.nqueryFlags(address());
        }

        @NativeType("VkQueryPipelineStatisticFlags")
        public int pipelineStatistics() {
            return VkCommandBufferInheritanceInfo.npipelineStatistics(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferInheritanceInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(41);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferInheritanceInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAttachmentSampleCountInfoAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkAttachmentSampleCountInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCommandBufferInheritanceConditionalRenderingInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCommandBufferInheritanceDescriptorHeapInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCommandBufferInheritanceRenderPassTransformInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCommandBufferInheritanceRenderingInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCommandBufferInheritanceRenderingInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCommandBufferInheritanceViewportScissorInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkCustomResolveCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalFormatANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
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

        public Buffer pNext(VkTileMemoryBindInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer renderPass(@NativeType("VkRenderPass") long value) {
            VkCommandBufferInheritanceInfo.nrenderPass(address(), value);
            return this;
        }

        public Buffer subpass(@NativeType("uint32_t") int value) {
            VkCommandBufferInheritanceInfo.nsubpass(address(), value);
            return this;
        }

        public Buffer framebuffer(@NativeType("VkFramebuffer") long value) {
            VkCommandBufferInheritanceInfo.nframebuffer(address(), value);
            return this;
        }

        public Buffer occlusionQueryEnable(@NativeType("VkBool32") boolean value) {
            VkCommandBufferInheritanceInfo.nocclusionQueryEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer queryFlags(@NativeType("VkQueryControlFlags") int value) {
            VkCommandBufferInheritanceInfo.nqueryFlags(address(), value);
            return this;
        }

        public Buffer pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) {
            VkCommandBufferInheritanceInfo.npipelineStatistics(address(), value);
            return this;
        }
    }
}
