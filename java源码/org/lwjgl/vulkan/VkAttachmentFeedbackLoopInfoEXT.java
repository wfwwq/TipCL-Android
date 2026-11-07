package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentFeedbackLoopInfoEXT.class */
public class VkAttachmentFeedbackLoopInfoEXT extends Struct<VkAttachmentFeedbackLoopInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FEEDBACKLOOPENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FEEDBACKLOOPENABLE = layout.offsetof(2);
    }

    protected VkAttachmentFeedbackLoopInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentFeedbackLoopInfoEXT create(long address, ByteBuffer container) {
        return new VkAttachmentFeedbackLoopInfoEXT(address, container);
    }

    public VkAttachmentFeedbackLoopInfoEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean feedbackLoopEnable() {
        return nfeedbackLoopEnable(address()) != 0;
    }

    public VkAttachmentFeedbackLoopInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAttachmentFeedbackLoopInfoEXT sType$Default() {
        return sType(KHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_ATTACHMENT_FEEDBACK_LOOP_INFO_EXT);
    }

    public VkAttachmentFeedbackLoopInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAttachmentFeedbackLoopInfoEXT feedbackLoopEnable(@NativeType("VkBool32") boolean value) {
        nfeedbackLoopEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkAttachmentFeedbackLoopInfoEXT set(int sType, long pNext, boolean feedbackLoopEnable) {
        sType(sType);
        pNext(pNext);
        feedbackLoopEnable(feedbackLoopEnable);
        return this;
    }

    public VkAttachmentFeedbackLoopInfoEXT set(VkAttachmentFeedbackLoopInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentFeedbackLoopInfoEXT malloc() {
        return new VkAttachmentFeedbackLoopInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentFeedbackLoopInfoEXT calloc() {
        return new VkAttachmentFeedbackLoopInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentFeedbackLoopInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentFeedbackLoopInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentFeedbackLoopInfoEXT create(long address) {
        return new VkAttachmentFeedbackLoopInfoEXT(address, null);
    }

    public static VkAttachmentFeedbackLoopInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentFeedbackLoopInfoEXT(address, null);
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

    public static VkAttachmentFeedbackLoopInfoEXT malloc(MemoryStack stack) {
        return new VkAttachmentFeedbackLoopInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentFeedbackLoopInfoEXT calloc(MemoryStack stack) {
        return new VkAttachmentFeedbackLoopInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfeedbackLoopEnable(long struct) {
        return MemoryUtil.memGetInt(struct + FEEDBACKLOOPENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfeedbackLoopEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + FEEDBACKLOOPENABLE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentFeedbackLoopInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentFeedbackLoopInfoEXT, Buffer> implements NativeResource {
        private static final VkAttachmentFeedbackLoopInfoEXT ELEMENT_FACTORY = VkAttachmentFeedbackLoopInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentFeedbackLoopInfoEXT.SIZEOF);
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
        public VkAttachmentFeedbackLoopInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAttachmentFeedbackLoopInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAttachmentFeedbackLoopInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean feedbackLoopEnable() {
            return VkAttachmentFeedbackLoopInfoEXT.nfeedbackLoopEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentFeedbackLoopInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_ATTACHMENT_FEEDBACK_LOOP_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAttachmentFeedbackLoopInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer feedbackLoopEnable(@NativeType("VkBool32") boolean value) {
            VkAttachmentFeedbackLoopInfoEXT.nfeedbackLoopEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
