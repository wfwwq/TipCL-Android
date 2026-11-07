package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfo.class */
public class VkRenderPassAttachmentBeginInfo extends Struct<VkRenderPassAttachmentBeginInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ATTACHMENTCOUNT;
    public static final int PATTACHMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTCOUNT = layout.offsetof(2);
        PATTACHMENTS = layout.offsetof(3);
    }

    protected VkRenderPassAttachmentBeginInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassAttachmentBeginInfo create(long address, ByteBuffer container) {
        return new VkRenderPassAttachmentBeginInfo(address, container);
    }

    public VkRenderPassAttachmentBeginInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int attachmentCount() {
        return nattachmentCount(address());
    }

    @NativeType("VkImageView const *")
    public LongBuffer pAttachments() {
        return npAttachments(address());
    }

    public VkRenderPassAttachmentBeginInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassAttachmentBeginInfo sType$Default() {
        return sType(1000108003);
    }

    public VkRenderPassAttachmentBeginInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassAttachmentBeginInfo pAttachments(@NativeType("VkImageView const *") LongBuffer value) {
        npAttachments(address(), value);
        return this;
    }

    public VkRenderPassAttachmentBeginInfo set(int sType, long pNext, LongBuffer pAttachments) {
        sType(sType);
        pNext(pNext);
        pAttachments(pAttachments);
        return this;
    }

    public VkRenderPassAttachmentBeginInfo set(VkRenderPassAttachmentBeginInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassAttachmentBeginInfo malloc() {
        return new VkRenderPassAttachmentBeginInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassAttachmentBeginInfo calloc() {
        return new VkRenderPassAttachmentBeginInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassAttachmentBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassAttachmentBeginInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassAttachmentBeginInfo create(long address) {
        return new VkRenderPassAttachmentBeginInfo(address, null);
    }

    public static VkRenderPassAttachmentBeginInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassAttachmentBeginInfo(address, null);
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

    public static VkRenderPassAttachmentBeginInfo malloc(MemoryStack stack) {
        return new VkRenderPassAttachmentBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassAttachmentBeginInfo calloc(MemoryStack stack) {
        return new VkRenderPassAttachmentBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nattachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTCOUNT);
    }

    public static LongBuffer npAttachments(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PATTACHMENTS), nattachmentCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nattachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTCOUNT, value);
    }

    public static void npAttachments(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PATTACHMENTS, MemoryUtil.memAddressSafe(value));
        nattachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PATTACHMENTS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassAttachmentBeginInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassAttachmentBeginInfo, Buffer> implements NativeResource {
        private static final VkRenderPassAttachmentBeginInfo ELEMENT_FACTORY = VkRenderPassAttachmentBeginInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassAttachmentBeginInfo.SIZEOF);
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
        public VkRenderPassAttachmentBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassAttachmentBeginInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassAttachmentBeginInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int attachmentCount() {
            return VkRenderPassAttachmentBeginInfo.nattachmentCount(address());
        }

        @NativeType("VkImageView const *")
        public LongBuffer pAttachments() {
            return VkRenderPassAttachmentBeginInfo.npAttachments(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassAttachmentBeginInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000108003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassAttachmentBeginInfo.npNext(address(), value);
            return this;
        }

        public Buffer pAttachments(@NativeType("VkImageView const *") LongBuffer value) {
            VkRenderPassAttachmentBeginInfo.npAttachments(address(), value);
            return this;
        }
    }
}
