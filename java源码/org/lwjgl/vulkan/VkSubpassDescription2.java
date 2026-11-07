package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkAttachmentReference2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2.class */
public class VkSubpassDescription2 extends Struct<VkSubpassDescription2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PIPELINEBINDPOINT;
    public static final int VIEWMASK;
    public static final int INPUTATTACHMENTCOUNT;
    public static final int PINPUTATTACHMENTS;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTS;
    public static final int PRESOLVEATTACHMENTS;
    public static final int PDEPTHSTENCILATTACHMENT;
    public static final int PRESERVEATTACHMENTCOUNT;
    public static final int PPRESERVEATTACHMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PIPELINEBINDPOINT = layout.offsetof(3);
        VIEWMASK = layout.offsetof(4);
        INPUTATTACHMENTCOUNT = layout.offsetof(5);
        PINPUTATTACHMENTS = layout.offsetof(6);
        COLORATTACHMENTCOUNT = layout.offsetof(7);
        PCOLORATTACHMENTS = layout.offsetof(8);
        PRESOLVEATTACHMENTS = layout.offsetof(9);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(10);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(11);
        PPRESERVEATTACHMENTS = layout.offsetof(12);
    }

    protected VkSubpassDescription2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassDescription2 create(long address, ByteBuffer container) {
        return new VkSubpassDescription2(address, container);
    }

    public VkSubpassDescription2(ByteBuffer container) {
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

    @NativeType("VkSubpassDescriptionFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() {
        return npipelineBindPoint(address());
    }

    @NativeType("uint32_t")
    public int viewMask() {
        return nviewMask(address());
    }

    @NativeType("uint32_t")
    public int inputAttachmentCount() {
        return ninputAttachmentCount(address());
    }

    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.Buffer pInputAttachments() {
        return npInputAttachments(address());
    }

    @NativeType("uint32_t")
    public int colorAttachmentCount() {
        return ncolorAttachmentCount(address());
    }

    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.Buffer pColorAttachments() {
        return npColorAttachments(address());
    }

    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2.Buffer pResolveAttachments() {
        return npResolveAttachments(address());
    }

    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2 pDepthStencilAttachment() {
        return npDepthStencilAttachment(address());
    }

    @NativeType("uint32_t")
    public int preserveAttachmentCount() {
        return npreserveAttachmentCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pPreserveAttachments() {
        return npPreserveAttachments(address());
    }

    public VkSubpassDescription2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubpassDescription2 sType$Default() {
        return sType(1000109002);
    }

    public VkSubpassDescription2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubpassDescription2 pNext(VkFragmentShadingRateAttachmentInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDescription2 pNext(VkMultisampledRenderToSingleSampledInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDescription2 pNext(VkRenderPassCreationControlEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDescription2 pNext(VkRenderPassSubpassFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDescription2 pNext(VkSubpassDescriptionDepthStencilResolve value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDescription2 pNext(VkSubpassDescriptionDepthStencilResolveKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassDescription2 flags(@NativeType("VkSubpassDescriptionFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSubpassDescription2 pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    public VkSubpassDescription2 viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    public VkSubpassDescription2 pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
        npInputAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription2 colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    public VkSubpassDescription2 pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
        npColorAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription2 pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
        npResolveAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription2 pDepthStencilAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
        npDepthStencilAttachment(address(), value);
        return this;
    }

    public VkSubpassDescription2 pPreserveAttachments(@NativeType("uint32_t const *") IntBuffer value) {
        npPreserveAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription2 set(int sType, long pNext, int flags, int pipelineBindPoint, int viewMask, VkAttachmentReference2.Buffer pInputAttachments, int colorAttachmentCount, VkAttachmentReference2.Buffer pColorAttachments, VkAttachmentReference2.Buffer pResolveAttachments, VkAttachmentReference2 pDepthStencilAttachment, IntBuffer pPreserveAttachments) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        viewMask(viewMask);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);
        return this;
    }

    public VkSubpassDescription2 set(VkSubpassDescription2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDescription2 malloc() {
        return new VkSubpassDescription2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDescription2 calloc() {
        return new VkSubpassDescription2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDescription2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescription2(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDescription2 create(long address) {
        return new VkSubpassDescription2(address, null);
    }

    public static VkSubpassDescription2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDescription2(address, null);
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

    public static VkSubpassDescription2 malloc(MemoryStack stack) {
        return new VkSubpassDescription2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDescription2 calloc(MemoryStack stack) {
        return new VkSubpassDescription2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineBindPoint(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINDPOINT);
    }

    public static int nviewMask(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWMASK);
    }

    public static int ninputAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + INPUTATTACHMENTCOUNT);
    }

    public static VkAttachmentReference2.Buffer npInputAttachments(long struct) {
        return VkAttachmentReference2.createSafe(MemoryUtil.memGetAddress(struct + PINPUTATTACHMENTS), ninputAttachmentCount(struct));
    }

    public static int ncolorAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + COLORATTACHMENTCOUNT);
    }

    public static VkAttachmentReference2.Buffer npColorAttachments(long struct) {
        return VkAttachmentReference2.createSafe(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTS), ncolorAttachmentCount(struct));
    }

    public static VkAttachmentReference2.Buffer npResolveAttachments(long struct) {
        return VkAttachmentReference2.createSafe(MemoryUtil.memGetAddress(struct + PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct));
    }

    public static VkAttachmentReference2 npDepthStencilAttachment(long struct) {
        return VkAttachmentReference2.createSafe(MemoryUtil.memGetAddress(struct + PDEPTHSTENCILATTACHMENT));
    }

    public static int npreserveAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRESERVEATTACHMENTCOUNT);
    }

    public static IntBuffer npPreserveAttachments(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct));
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

    public static void npipelineBindPoint(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEBINDPOINT, value);
    }

    public static void nviewMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWMASK, value);
    }

    public static void ninputAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUTATTACHMENTCOUNT, value);
    }

    public static void npInputAttachments(long struct, VkAttachmentReference2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PINPUTATTACHMENTS, MemoryUtil.memAddressSafe(value));
        ninputAttachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ncolorAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENTCOUNT, value);
    }

    public static void npColorAttachments(long struct, VkAttachmentReference2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTS, MemoryUtil.memAddressSafe(value));
    }

    public static void npResolveAttachments(long struct, VkAttachmentReference2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PRESOLVEATTACHMENTS, MemoryUtil.memAddressSafe(value));
    }

    public static void npDepthStencilAttachment(long struct, VkAttachmentReference2 value) {
        MemoryUtil.memPutAddress(struct + PDEPTHSTENCILATTACHMENT, MemoryUtil.memAddressSafe(value));
    }

    public static void npreserveAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESERVEATTACHMENTCOUNT, value);
    }

    public static void npPreserveAttachments(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PPRESERVEATTACHMENTS, MemoryUtil.memAddressSafe(value));
        npreserveAttachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ninputAttachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PINPUTATTACHMENTS));
        }
        if (ncolorAttachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTS));
        }
        if (npreserveAttachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPRESERVEATTACHMENTS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription2$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassDescription2, Buffer> implements NativeResource {
        private static final VkSubpassDescription2 ELEMENT_FACTORY = VkSubpassDescription2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassDescription2.SIZEOF);
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
        public VkSubpassDescription2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubpassDescription2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubpassDescription2.npNext(address());
        }

        @NativeType("VkSubpassDescriptionFlags")
        public int flags() {
            return VkSubpassDescription2.nflags(address());
        }

        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
            return VkSubpassDescription2.npipelineBindPoint(address());
        }

        @NativeType("uint32_t")
        public int viewMask() {
            return VkSubpassDescription2.nviewMask(address());
        }

        @NativeType("uint32_t")
        public int inputAttachmentCount() {
            return VkSubpassDescription2.ninputAttachmentCount(address());
        }

        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.Buffer pInputAttachments() {
            return VkSubpassDescription2.npInputAttachments(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkSubpassDescription2.ncolorAttachmentCount(address());
        }

        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.Buffer pColorAttachments() {
            return VkSubpassDescription2.npColorAttachments(address());
        }

        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2.Buffer pResolveAttachments() {
            return VkSubpassDescription2.npResolveAttachments(address());
        }

        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2 pDepthStencilAttachment() {
            return VkSubpassDescription2.npDepthStencilAttachment(address());
        }

        @NativeType("uint32_t")
        public int preserveAttachmentCount() {
            return VkSubpassDescription2.npreserveAttachmentCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pPreserveAttachments() {
            return VkSubpassDescription2.npPreserveAttachments(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassDescription2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000109002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassDescription2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkFragmentShadingRateAttachmentInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMultisampledRenderToSingleSampledInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassCreationControlEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkRenderPassSubpassFeedbackCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubpassDescriptionDepthStencilResolve value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubpassDescriptionDepthStencilResolveKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) {
            VkSubpassDescription2.nflags(address(), value);
            return this;
        }

        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkSubpassDescription2.npipelineBindPoint(address(), value);
            return this;
        }

        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkSubpassDescription2.nviewMask(address(), value);
            return this;
        }

        public Buffer pInputAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
            VkSubpassDescription2.npInputAttachments(address(), value);
            return this;
        }

        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkSubpassDescription2.ncolorAttachmentCount(address(), value);
            return this;
        }

        public Buffer pColorAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
            VkSubpassDescription2.npColorAttachments(address(), value);
            return this;
        }

        public Buffer pResolveAttachments(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2.Buffer value) {
            VkSubpassDescription2.npResolveAttachments(address(), value);
            return this;
        }

        public Buffer pDepthStencilAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
            VkSubpassDescription2.npDepthStencilAttachment(address(), value);
            return this;
        }

        public Buffer pPreserveAttachments(@NativeType("uint32_t const *") IntBuffer value) {
            VkSubpassDescription2.npPreserveAttachments(address(), value);
            return this;
        }
    }
}
