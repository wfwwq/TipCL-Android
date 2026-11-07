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
import org.lwjgl.vulkan.VkAttachmentReference;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription.class */
public class VkSubpassDescription extends Struct<VkSubpassDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PIPELINEBINDPOINT;
    public static final int INPUTATTACHMENTCOUNT;
    public static final int PINPUTATTACHMENTS;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTS;
    public static final int PRESOLVEATTACHMENTS;
    public static final int PDEPTHSTENCILATTACHMENT;
    public static final int PRESERVEATTACHMENTCOUNT;
    public static final int PPRESERVEATTACHMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PIPELINEBINDPOINT = layout.offsetof(1);
        INPUTATTACHMENTCOUNT = layout.offsetof(2);
        PINPUTATTACHMENTS = layout.offsetof(3);
        COLORATTACHMENTCOUNT = layout.offsetof(4);
        PCOLORATTACHMENTS = layout.offsetof(5);
        PRESOLVEATTACHMENTS = layout.offsetof(6);
        PDEPTHSTENCILATTACHMENT = layout.offsetof(7);
        PRESERVEATTACHMENTCOUNT = layout.offsetof(8);
        PPRESERVEATTACHMENTS = layout.offsetof(9);
    }

    protected VkSubpassDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassDescription create(long address, ByteBuffer container) {
        return new VkSubpassDescription(address, container);
    }

    public VkSubpassDescription(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
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
    public int inputAttachmentCount() {
        return ninputAttachmentCount(address());
    }

    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pInputAttachments() {
        return npInputAttachments(address());
    }

    @NativeType("uint32_t")
    public int colorAttachmentCount() {
        return ncolorAttachmentCount(address());
    }

    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pColorAttachments() {
        return npColorAttachments(address());
    }

    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference.Buffer pResolveAttachments() {
        return npResolveAttachments(address());
    }

    @NativeType("VkAttachmentReference const *")
    public VkAttachmentReference pDepthStencilAttachment() {
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

    public VkSubpassDescription flags(@NativeType("VkSubpassDescriptionFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSubpassDescription pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    public VkSubpassDescription pInputAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) {
        npInputAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    public VkSubpassDescription pColorAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) {
        npColorAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription pResolveAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) {
        npResolveAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription pDepthStencilAttachment(@NativeType("VkAttachmentReference const *") VkAttachmentReference value) {
        npDepthStencilAttachment(address(), value);
        return this;
    }

    public VkSubpassDescription pPreserveAttachments(@NativeType("uint32_t const *") IntBuffer value) {
        npPreserveAttachments(address(), value);
        return this;
    }

    public VkSubpassDescription set(int flags, int pipelineBindPoint, VkAttachmentReference.Buffer pInputAttachments, int colorAttachmentCount, VkAttachmentReference.Buffer pColorAttachments, VkAttachmentReference.Buffer pResolveAttachments, VkAttachmentReference pDepthStencilAttachment, IntBuffer pPreserveAttachments) {
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        pInputAttachments(pInputAttachments);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachments(pColorAttachments);
        pResolveAttachments(pResolveAttachments);
        pDepthStencilAttachment(pDepthStencilAttachment);
        pPreserveAttachments(pPreserveAttachments);
        return this;
    }

    public VkSubpassDescription set(VkSubpassDescription src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDescription malloc() {
        return new VkSubpassDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDescription calloc() {
        return new VkSubpassDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescription(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDescription create(long address) {
        return new VkSubpassDescription(address, null);
    }

    public static VkSubpassDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDescription(address, null);
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

    public static VkSubpassDescription malloc(MemoryStack stack) {
        return new VkSubpassDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDescription calloc(MemoryStack stack) {
        return new VkSubpassDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int npipelineBindPoint(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINDPOINT);
    }

    public static int ninputAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + INPUTATTACHMENTCOUNT);
    }

    public static VkAttachmentReference.Buffer npInputAttachments(long struct) {
        return VkAttachmentReference.createSafe(MemoryUtil.memGetAddress(struct + PINPUTATTACHMENTS), ninputAttachmentCount(struct));
    }

    public static int ncolorAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + COLORATTACHMENTCOUNT);
    }

    public static VkAttachmentReference.Buffer npColorAttachments(long struct) {
        return VkAttachmentReference.createSafe(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTS), ncolorAttachmentCount(struct));
    }

    public static VkAttachmentReference.Buffer npResolveAttachments(long struct) {
        return VkAttachmentReference.createSafe(MemoryUtil.memGetAddress(struct + PRESOLVEATTACHMENTS), ncolorAttachmentCount(struct));
    }

    public static VkAttachmentReference npDepthStencilAttachment(long struct) {
        return VkAttachmentReference.createSafe(MemoryUtil.memGetAddress(struct + PDEPTHSTENCILATTACHMENT));
    }

    public static int npreserveAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRESERVEATTACHMENTCOUNT);
    }

    public static IntBuffer npPreserveAttachments(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PPRESERVEATTACHMENTS), npreserveAttachmentCount(struct));
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void npipelineBindPoint(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEBINDPOINT, value);
    }

    public static void ninputAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUTATTACHMENTCOUNT, value);
    }

    public static void npInputAttachments(long struct, VkAttachmentReference.Buffer value) {
        MemoryUtil.memPutAddress(struct + PINPUTATTACHMENTS, MemoryUtil.memAddressSafe(value));
        ninputAttachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ncolorAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENTCOUNT, value);
    }

    public static void npColorAttachments(long struct, VkAttachmentReference.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTS, MemoryUtil.memAddressSafe(value));
    }

    public static void npResolveAttachments(long struct, VkAttachmentReference.Buffer value) {
        MemoryUtil.memPutAddress(struct + PRESOLVEATTACHMENTS, MemoryUtil.memAddressSafe(value));
    }

    public static void npDepthStencilAttachment(long struct, VkAttachmentReference value) {
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescription$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassDescription, Buffer> implements NativeResource {
        private static final VkSubpassDescription ELEMENT_FACTORY = VkSubpassDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassDescription.SIZEOF);
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
        public VkSubpassDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkSubpassDescriptionFlags")
        public int flags() {
            return VkSubpassDescription.nflags(address());
        }

        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
            return VkSubpassDescription.npipelineBindPoint(address());
        }

        @NativeType("uint32_t")
        public int inputAttachmentCount() {
            return VkSubpassDescription.ninputAttachmentCount(address());
        }

        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pInputAttachments() {
            return VkSubpassDescription.npInputAttachments(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkSubpassDescription.ncolorAttachmentCount(address());
        }

        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pColorAttachments() {
            return VkSubpassDescription.npColorAttachments(address());
        }

        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference.Buffer pResolveAttachments() {
            return VkSubpassDescription.npResolveAttachments(address());
        }

        @NativeType("VkAttachmentReference const *")
        public VkAttachmentReference pDepthStencilAttachment() {
            return VkSubpassDescription.npDepthStencilAttachment(address());
        }

        @NativeType("uint32_t")
        public int preserveAttachmentCount() {
            return VkSubpassDescription.npreserveAttachmentCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pPreserveAttachments() {
            return VkSubpassDescription.npPreserveAttachments(address());
        }

        public Buffer flags(@NativeType("VkSubpassDescriptionFlags") int value) {
            VkSubpassDescription.nflags(address(), value);
            return this;
        }

        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkSubpassDescription.npipelineBindPoint(address(), value);
            return this;
        }

        public Buffer pInputAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) {
            VkSubpassDescription.npInputAttachments(address(), value);
            return this;
        }

        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkSubpassDescription.ncolorAttachmentCount(address(), value);
            return this;
        }

        public Buffer pColorAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) {
            VkSubpassDescription.npColorAttachments(address(), value);
            return this;
        }

        public Buffer pResolveAttachments(@NativeType("VkAttachmentReference const *") VkAttachmentReference.Buffer value) {
            VkSubpassDescription.npResolveAttachments(address(), value);
            return this;
        }

        public Buffer pDepthStencilAttachment(@NativeType("VkAttachmentReference const *") VkAttachmentReference value) {
            VkSubpassDescription.npDepthStencilAttachment(address(), value);
            return this;
        }

        public Buffer pPreserveAttachments(@NativeType("uint32_t const *") IntBuffer value) {
            VkSubpassDescription.npPreserveAttachments(address(), value);
            return this;
        }
    }
}
