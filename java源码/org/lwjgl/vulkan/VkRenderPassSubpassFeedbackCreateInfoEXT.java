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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackCreateInfoEXT.class */
public class VkRenderPassSubpassFeedbackCreateInfoEXT extends Struct<VkRenderPassSubpassFeedbackCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSUBPASSFEEDBACK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSUBPASSFEEDBACK = layout.offsetof(2);
    }

    protected VkRenderPassSubpassFeedbackCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassSubpassFeedbackCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(address, container);
    }

    public VkRenderPassSubpassFeedbackCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkRenderPassSubpassFeedbackInfoEXT *")
    public VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback() {
        return npSubpassFeedback(address());
    }

    public VkRenderPassSubpassFeedbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassSubpassFeedbackCreateInfoEXT sType$Default() {
        return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT);
    }

    public VkRenderPassSubpassFeedbackCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassSubpassFeedbackCreateInfoEXT pSubpassFeedback(@NativeType("VkRenderPassSubpassFeedbackInfoEXT *") VkRenderPassSubpassFeedbackInfoEXT value) {
        npSubpassFeedback(address(), value);
        return this;
    }

    public VkRenderPassSubpassFeedbackCreateInfoEXT set(int sType, long pNext, VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback) {
        sType(sType);
        pNext(pNext);
        pSubpassFeedback(pSubpassFeedback);
        return this;
    }

    public VkRenderPassSubpassFeedbackCreateInfoEXT set(VkRenderPassSubpassFeedbackCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassSubpassFeedbackCreateInfoEXT malloc() {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassSubpassFeedbackCreateInfoEXT calloc() {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassSubpassFeedbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassSubpassFeedbackCreateInfoEXT create(long address) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(address, null);
    }

    public static VkRenderPassSubpassFeedbackCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(address, null);
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

    public static VkRenderPassSubpassFeedbackCreateInfoEXT malloc(MemoryStack stack) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassSubpassFeedbackCreateInfoEXT calloc(MemoryStack stack) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkRenderPassSubpassFeedbackInfoEXT npSubpassFeedback(long struct) {
        return VkRenderPassSubpassFeedbackInfoEXT.create(MemoryUtil.memGetAddress(struct + PSUBPASSFEEDBACK));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npSubpassFeedback(long struct, VkRenderPassSubpassFeedbackInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PSUBPASSFEEDBACK, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSUBPASSFEEDBACK));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassSubpassFeedbackCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkRenderPassSubpassFeedbackCreateInfoEXT ELEMENT_FACTORY = VkRenderPassSubpassFeedbackCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassSubpassFeedbackCreateInfoEXT.SIZEOF);
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
        public VkRenderPassSubpassFeedbackCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassSubpassFeedbackCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassSubpassFeedbackCreateInfoEXT.npNext(address());
        }

        @NativeType("VkRenderPassSubpassFeedbackInfoEXT *")
        public VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback() {
            return VkRenderPassSubpassFeedbackCreateInfoEXT.npSubpassFeedback(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassSubpassFeedbackCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassSubpassFeedbackCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pSubpassFeedback(@NativeType("VkRenderPassSubpassFeedbackInfoEXT *") VkRenderPassSubpassFeedbackInfoEXT value) {
            VkRenderPassSubpassFeedbackCreateInfoEXT.npSubpassFeedback(address(), value);
            return this;
        }
    }
}
