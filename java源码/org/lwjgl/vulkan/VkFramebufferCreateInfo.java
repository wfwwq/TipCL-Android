package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferCreateInfo.class */
public class VkFramebufferCreateInfo extends Struct<VkFramebufferCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int RENDERPASS;
    public static final int ATTACHMENTCOUNT;
    public static final int PATTACHMENTS;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int LAYERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RENDERPASS = layout.offsetof(3);
        ATTACHMENTCOUNT = layout.offsetof(4);
        PATTACHMENTS = layout.offsetof(5);
        WIDTH = layout.offsetof(6);
        HEIGHT = layout.offsetof(7);
        LAYERS = layout.offsetof(8);
    }

    protected VkFramebufferCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFramebufferCreateInfo create(long address, ByteBuffer container) {
        return new VkFramebufferCreateInfo(address, container);
    }

    public VkFramebufferCreateInfo(ByteBuffer container) {
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

    @NativeType("VkFramebufferCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkRenderPass")
    public long renderPass() {
        return nrenderPass(address());
    }

    @NativeType("uint32_t")
    public int attachmentCount() {
        return nattachmentCount(address());
    }

    @NativeType("VkImageView const *")
    public LongBuffer pAttachments() {
        return npAttachments(address());
    }

    @NativeType("uint32_t")
    public int width() {
        return nwidth(address());
    }

    @NativeType("uint32_t")
    public int height() {
        return nheight(address());
    }

    @NativeType("uint32_t")
    public int layers() {
        return nlayers(address());
    }

    public VkFramebufferCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo sType$Default() {
        return sType(37);
    }

    public VkFramebufferCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo pNext(VkFramebufferAttachmentsCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkFramebufferCreateInfo pNext(VkFramebufferAttachmentsCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkFramebufferCreateInfo flags(@NativeType("VkFramebufferCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo renderPass(@NativeType("VkRenderPass") long value) {
        nrenderPass(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo attachmentCount(@NativeType("uint32_t") int value) {
        nattachmentCount(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo pAttachments(@NativeType("VkImageView const *") LongBuffer value) {
        npAttachments(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo width(@NativeType("uint32_t") int value) {
        nwidth(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo height(@NativeType("uint32_t") int value) {
        nheight(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo layers(@NativeType("uint32_t") int value) {
        nlayers(address(), value);
        return this;
    }

    public VkFramebufferCreateInfo set(int sType, long pNext, int flags, long renderPass, int attachmentCount, LongBuffer pAttachments, int width, int height, int layers) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderPass(renderPass);
        attachmentCount(attachmentCount);
        pAttachments(pAttachments);
        width(width);
        height(height);
        layers(layers);
        return this;
    }

    public VkFramebufferCreateInfo set(VkFramebufferCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFramebufferCreateInfo malloc() {
        return new VkFramebufferCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFramebufferCreateInfo calloc() {
        return new VkFramebufferCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFramebufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkFramebufferCreateInfo create(long address) {
        return new VkFramebufferCreateInfo(address, null);
    }

    public static VkFramebufferCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFramebufferCreateInfo(address, null);
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

    public static VkFramebufferCreateInfo malloc(MemoryStack stack) {
        return new VkFramebufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFramebufferCreateInfo calloc(MemoryStack stack) {
        return new VkFramebufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nrenderPass(long struct) {
        return MemoryUtil.memGetLong(struct + RENDERPASS);
    }

    public static int nattachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTCOUNT);
    }

    public static LongBuffer npAttachments(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PATTACHMENTS), nattachmentCount(struct));
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nlayers(long struct) {
        return MemoryUtil.memGetInt(struct + LAYERS);
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

    public static void nrenderPass(long struct, long value) {
        MemoryUtil.memPutLong(struct + RENDERPASS, value);
    }

    public static void nattachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTCOUNT, value);
    }

    public static void npAttachments(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PATTACHMENTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nattachmentCount(struct, value.remaining());
        }
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void nlayers(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYERS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkFramebufferCreateInfo, Buffer> implements NativeResource {
        private static final VkFramebufferCreateInfo ELEMENT_FACTORY = VkFramebufferCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFramebufferCreateInfo.SIZEOF);
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
        public VkFramebufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFramebufferCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkFramebufferCreateInfo.npNext(address());
        }

        @NativeType("VkFramebufferCreateFlags")
        public int flags() {
            return VkFramebufferCreateInfo.nflags(address());
        }

        @NativeType("VkRenderPass")
        public long renderPass() {
            return VkFramebufferCreateInfo.nrenderPass(address());
        }

        @NativeType("uint32_t")
        public int attachmentCount() {
            return VkFramebufferCreateInfo.nattachmentCount(address());
        }

        @NativeType("VkImageView const *")
        public LongBuffer pAttachments() {
            return VkFramebufferCreateInfo.npAttachments(address());
        }

        @NativeType("uint32_t")
        public int width() {
            return VkFramebufferCreateInfo.nwidth(address());
        }

        @NativeType("uint32_t")
        public int height() {
            return VkFramebufferCreateInfo.nheight(address());
        }

        @NativeType("uint32_t")
        public int layers() {
            return VkFramebufferCreateInfo.nlayers(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFramebufferCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(37);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkFramebufferCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkFramebufferAttachmentsCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkFramebufferAttachmentsCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkFramebufferCreateFlags") int value) {
            VkFramebufferCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer renderPass(@NativeType("VkRenderPass") long value) {
            VkFramebufferCreateInfo.nrenderPass(address(), value);
            return this;
        }

        public Buffer attachmentCount(@NativeType("uint32_t") int value) {
            VkFramebufferCreateInfo.nattachmentCount(address(), value);
            return this;
        }

        public Buffer pAttachments(@NativeType("VkImageView const *") LongBuffer value) {
            VkFramebufferCreateInfo.npAttachments(address(), value);
            return this;
        }

        public Buffer width(@NativeType("uint32_t") int value) {
            VkFramebufferCreateInfo.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("uint32_t") int value) {
            VkFramebufferCreateInfo.nheight(address(), value);
            return this;
        }

        public Buffer layers(@NativeType("uint32_t") int value) {
            VkFramebufferCreateInfo.nlayers(address(), value);
            return this;
        }
    }
}
