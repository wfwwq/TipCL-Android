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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2.class */
public class VkAttachmentReference2 extends Struct<VkAttachmentReference2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ATTACHMENT;
    public static final int LAYOUT;
    public static final int ASPECTMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENT = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        ASPECTMASK = layout.offsetof(4);
    }

    protected VkAttachmentReference2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentReference2 create(long address, ByteBuffer container) {
        return new VkAttachmentReference2(address, container);
    }

    public VkAttachmentReference2(ByteBuffer container) {
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
    public int attachment() {
        return nattachment(address());
    }

    @NativeType("VkImageLayout")
    public int layout() {
        return nlayout(address());
    }

    @NativeType("VkImageAspectFlags")
    public int aspectMask() {
        return naspectMask(address());
    }

    public VkAttachmentReference2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAttachmentReference2 sType$Default() {
        return sType(1000109001);
    }

    public VkAttachmentReference2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAttachmentReference2 pNext(VkAttachmentReferenceStencilLayout value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAttachmentReference2 pNext(VkAttachmentReferenceStencilLayoutKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAttachmentReference2 attachment(@NativeType("uint32_t") int value) {
        nattachment(address(), value);
        return this;
    }

    public VkAttachmentReference2 layout(@NativeType("VkImageLayout") int value) {
        nlayout(address(), value);
        return this;
    }

    public VkAttachmentReference2 aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    public VkAttachmentReference2 set(int sType, long pNext, int attachment, int layout, int aspectMask) {
        sType(sType);
        pNext(pNext);
        attachment(attachment);
        layout(layout);
        aspectMask(aspectMask);
        return this;
    }

    public VkAttachmentReference2 set(VkAttachmentReference2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentReference2 malloc() {
        return new VkAttachmentReference2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentReference2 calloc() {
        return new VkAttachmentReference2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentReference2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReference2(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentReference2 create(long address) {
        return new VkAttachmentReference2(address, null);
    }

    public static VkAttachmentReference2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentReference2(address, null);
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

    public static VkAttachmentReference2 malloc(MemoryStack stack) {
        return new VkAttachmentReference2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentReference2 calloc(MemoryStack stack) {
        return new VkAttachmentReference2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nattachment(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENT);
    }

    public static int nlayout(long struct) {
        return MemoryUtil.memGetInt(struct + LAYOUT);
    }

    public static int naspectMask(long struct) {
        return MemoryUtil.memGetInt(struct + ASPECTMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nattachment(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENT, value);
    }

    public static void nlayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYOUT, value);
    }

    public static void naspectMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + ASPECTMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReference2$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentReference2, Buffer> implements NativeResource {
        private static final VkAttachmentReference2 ELEMENT_FACTORY = VkAttachmentReference2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentReference2.SIZEOF);
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
        public VkAttachmentReference2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAttachmentReference2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAttachmentReference2.npNext(address());
        }

        @NativeType("uint32_t")
        public int attachment() {
            return VkAttachmentReference2.nattachment(address());
        }

        @NativeType("VkImageLayout")
        public int layout() {
            return VkAttachmentReference2.nlayout(address());
        }

        @NativeType("VkImageAspectFlags")
        public int aspectMask() {
            return VkAttachmentReference2.naspectMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentReference2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000109001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAttachmentReference2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAttachmentReferenceStencilLayout value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkAttachmentReferenceStencilLayoutKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer attachment(@NativeType("uint32_t") int value) {
            VkAttachmentReference2.nattachment(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkImageLayout") int value) {
            VkAttachmentReference2.nlayout(address(), value);
            return this;
        }

        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkAttachmentReference2.naspectMask(address(), value);
            return this;
        }
    }
}
