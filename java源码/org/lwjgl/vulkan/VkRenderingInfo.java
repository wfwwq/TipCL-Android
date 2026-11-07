package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkRenderingAttachmentInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfo.class */
public class VkRenderingInfo extends Struct<VkRenderingInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int RENDERAREA;
    public static final int LAYERCOUNT;
    public static final int VIEWMASK;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTS;
    public static final int PDEPTHATTACHMENT;
    public static final int PSTENCILATTACHMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RENDERAREA = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
        VIEWMASK = layout.offsetof(5);
        COLORATTACHMENTCOUNT = layout.offsetof(6);
        PCOLORATTACHMENTS = layout.offsetof(7);
        PDEPTHATTACHMENT = layout.offsetof(8);
        PSTENCILATTACHMENT = layout.offsetof(9);
    }

    protected VkRenderingInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderingInfo create(long address, ByteBuffer container) {
        return new VkRenderingInfo(address, container);
    }

    public VkRenderingInfo(ByteBuffer container) {
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

    @NativeType("VkRenderingFlags")
    public int flags() {
        return nflags(address());
    }

    public VkRect2D renderArea() {
        return nrenderArea(address());
    }

    @NativeType("uint32_t")
    public int layerCount() {
        return nlayerCount(address());
    }

    @NativeType("uint32_t")
    public int viewMask() {
        return nviewMask(address());
    }

    @NativeType("uint32_t")
    public int colorAttachmentCount() {
        return ncolorAttachmentCount(address());
    }

    @NativeType("VkRenderingAttachmentInfo const *")
    public VkRenderingAttachmentInfo.Buffer pColorAttachments() {
        return npColorAttachments(address());
    }

    @NativeType("VkRenderingAttachmentInfo const *")
    public VkRenderingAttachmentInfo pDepthAttachment() {
        return npDepthAttachment(address());
    }

    @NativeType("VkRenderingAttachmentInfo const *")
    public VkRenderingAttachmentInfo pStencilAttachment() {
        return npStencilAttachment(address());
    }

    public VkRenderingInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderingInfo sType$Default() {
        return sType(1000044000);
    }

    public VkRenderingInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderingInfo pNext(VkDeviceGroupRenderPassBeginInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkDeviceGroupRenderPassBeginInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkMultisampledRenderToSingleSampledInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkMultiviewPerViewAttributesInfoNVX value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkRenderPassPerformanceCountersByRegionBeginInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkRenderPassStripeBeginInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkRenderingFragmentDensityMapAttachmentInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkRenderingFragmentShadingRateAttachmentInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo pNext(VkTileMemorySizeInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingInfo flags(@NativeType("VkRenderingFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkRenderingInfo renderArea(VkRect2D value) {
        nrenderArea(address(), value);
        return this;
    }

    public VkRenderingInfo renderArea(Consumer<VkRect2D> consumer) {
        consumer.accept(renderArea());
        return this;
    }

    public VkRenderingInfo layerCount(@NativeType("uint32_t") int value) {
        nlayerCount(address(), value);
        return this;
    }

    public VkRenderingInfo viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    public VkRenderingInfo pColorAttachments(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) {
        npColorAttachments(address(), value);
        return this;
    }

    public VkRenderingInfo pDepthAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
        npDepthAttachment(address(), value);
        return this;
    }

    public VkRenderingInfo pStencilAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
        npStencilAttachment(address(), value);
        return this;
    }

    public VkRenderingInfo set(int sType, long pNext, int flags, VkRect2D renderArea, int layerCount, int viewMask, VkRenderingAttachmentInfo.Buffer pColorAttachments, VkRenderingAttachmentInfo pDepthAttachment, VkRenderingAttachmentInfo pStencilAttachment) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderArea(renderArea);
        layerCount(layerCount);
        viewMask(viewMask);
        pColorAttachments(pColorAttachments);
        pDepthAttachment(pDepthAttachment);
        pStencilAttachment(pStencilAttachment);
        return this;
    }

    public VkRenderingInfo set(VkRenderingInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingInfo malloc() {
        return new VkRenderingInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingInfo calloc() {
        return new VkRenderingInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingInfo create(long address) {
        return new VkRenderingInfo(address, null);
    }

    public static VkRenderingInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingInfo(address, null);
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

    public static VkRenderingInfo malloc(MemoryStack stack) {
        return new VkRenderingInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingInfo calloc(MemoryStack stack) {
        return new VkRenderingInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkRect2D nrenderArea(long struct) {
        return VkRect2D.create(struct + RENDERAREA);
    }

    public static int nlayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + LAYERCOUNT);
    }

    public static int nviewMask(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWMASK);
    }

    public static int ncolorAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + COLORATTACHMENTCOUNT);
    }

    public static VkRenderingAttachmentInfo.Buffer npColorAttachments(long struct) {
        return VkRenderingAttachmentInfo.createSafe(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTS), ncolorAttachmentCount(struct));
    }

    public static VkRenderingAttachmentInfo npDepthAttachment(long struct) {
        return VkRenderingAttachmentInfo.createSafe(MemoryUtil.memGetAddress(struct + PDEPTHATTACHMENT));
    }

    public static VkRenderingAttachmentInfo npStencilAttachment(long struct) {
        return VkRenderingAttachmentInfo.createSafe(MemoryUtil.memGetAddress(struct + PSTENCILATTACHMENT));
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

    public static void nrenderArea(long struct, VkRect2D value) {
        MemoryUtil.memCopy(value.address(), struct + RENDERAREA, VkRect2D.SIZEOF);
    }

    public static void nlayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYERCOUNT, value);
    }

    public static void nviewMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWMASK, value);
    }

    public static void ncolorAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENTCOUNT, value);
    }

    public static void npColorAttachments(long struct, VkRenderingAttachmentInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTS, MemoryUtil.memAddressSafe(value));
        ncolorAttachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void npDepthAttachment(long struct, VkRenderingAttachmentInfo value) {
        MemoryUtil.memPutAddress(struct + PDEPTHATTACHMENT, MemoryUtil.memAddressSafe(value));
    }

    public static void npStencilAttachment(long struct, VkRenderingAttachmentInfo value) {
        MemoryUtil.memPutAddress(struct + PSTENCILATTACHMENT, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        if (ncolorAttachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderingInfo, Buffer> implements NativeResource {
        private static final VkRenderingInfo ELEMENT_FACTORY = VkRenderingInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderingInfo.SIZEOF);
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
        public VkRenderingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderingInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderingInfo.npNext(address());
        }

        @NativeType("VkRenderingFlags")
        public int flags() {
            return VkRenderingInfo.nflags(address());
        }

        public VkRect2D renderArea() {
            return VkRenderingInfo.nrenderArea(address());
        }

        @NativeType("uint32_t")
        public int layerCount() {
            return VkRenderingInfo.nlayerCount(address());
        }

        @NativeType("uint32_t")
        public int viewMask() {
            return VkRenderingInfo.nviewMask(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkRenderingInfo.ncolorAttachmentCount(address());
        }

        @NativeType("VkRenderingAttachmentInfo const *")
        public VkRenderingAttachmentInfo.Buffer pColorAttachments() {
            return VkRenderingInfo.npColorAttachments(address());
        }

        @NativeType("VkRenderingAttachmentInfo const *")
        public VkRenderingAttachmentInfo pDepthAttachment() {
            return VkRenderingInfo.npDepthAttachment(address());
        }

        @NativeType("VkRenderingAttachmentInfo const *")
        public VkRenderingAttachmentInfo pStencilAttachment() {
            return VkRenderingInfo.npStencilAttachment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000044000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceGroupRenderPassBeginInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDeviceGroupRenderPassBeginInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMultisampledRenderToSingleSampledInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMultiviewPerViewAttributesInfoNVX value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassPerformanceCountersByRegionBeginInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassStripeBeginInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassTileShadingCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderingFragmentDensityMapAttachmentInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderingFragmentShadingRateAttachmentInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTileMemorySizeInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkRenderingFlags") int value) {
            VkRenderingInfo.nflags(address(), value);
            return this;
        }

        public Buffer renderArea(VkRect2D value) {
            VkRenderingInfo.nrenderArea(address(), value);
            return this;
        }

        public Buffer renderArea(Consumer<VkRect2D> consumer) {
            consumer.accept(renderArea());
            return this;
        }

        public Buffer layerCount(@NativeType("uint32_t") int value) {
            VkRenderingInfo.nlayerCount(address(), value);
            return this;
        }

        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkRenderingInfo.nviewMask(address(), value);
            return this;
        }

        public Buffer pColorAttachments(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) {
            VkRenderingInfo.npColorAttachments(address(), value);
            return this;
        }

        public Buffer pDepthAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
            VkRenderingInfo.npDepthAttachment(address(), value);
            return this;
        }

        public Buffer pStencilAttachment(@NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) {
            VkRenderingInfo.npStencilAttachment(address(), value);
            return this;
        }
    }
}
