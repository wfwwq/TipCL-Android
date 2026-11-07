package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackInfoEXT.class */
public class VkRenderPassSubpassFeedbackInfoEXT extends Struct<VkRenderPassSubpassFeedbackInfoEXT> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SUBPASSMERGESTATUS;
    public static final int DESCRIPTION;
    public static final int POSTMERGEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __array(1, 256), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SUBPASSMERGESTATUS = layout.offsetof(0);
        DESCRIPTION = layout.offsetof(1);
        POSTMERGEINDEX = layout.offsetof(2);
    }

    protected VkRenderPassSubpassFeedbackInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassSubpassFeedbackInfoEXT create(long address, ByteBuffer container) {
        return new VkRenderPassSubpassFeedbackInfoEXT(address, container);
    }

    public VkRenderPassSubpassFeedbackInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkSubpassMergeStatusEXT")
    public int subpassMergeStatus() {
        return nsubpassMergeStatus(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() {
        return ndescription(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() {
        return ndescriptionString(address());
    }

    @NativeType("uint32_t")
    public int postMergeIndex() {
        return npostMergeIndex(address());
    }

    public static VkRenderPassSubpassFeedbackInfoEXT create(long address) {
        return new VkRenderPassSubpassFeedbackInfoEXT(address, null);
    }

    public static VkRenderPassSubpassFeedbackInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassSubpassFeedbackInfoEXT(address, null);
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

    public static int nsubpassMergeStatus(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASSMERGESTATUS);
    }

    public static ByteBuffer ndescription(long struct) {
        return MemoryUtil.memByteBuffer(struct + DESCRIPTION, 256);
    }

    public static String ndescriptionString(long struct) {
        return MemoryUtil.memUTF8(struct + DESCRIPTION);
    }

    public static int npostMergeIndex(long struct) {
        return MemoryUtil.memGetInt(struct + POSTMERGEINDEX);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassSubpassFeedbackInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassSubpassFeedbackInfoEXT, Buffer> {
        private static final VkRenderPassSubpassFeedbackInfoEXT ELEMENT_FACTORY = VkRenderPassSubpassFeedbackInfoEXT.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassSubpassFeedbackInfoEXT.SIZEOF);
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
        public VkRenderPassSubpassFeedbackInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkSubpassMergeStatusEXT")
        public int subpassMergeStatus() {
            return VkRenderPassSubpassFeedbackInfoEXT.nsubpassMergeStatus(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() {
            return VkRenderPassSubpassFeedbackInfoEXT.ndescription(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() {
            return VkRenderPassSubpassFeedbackInfoEXT.ndescriptionString(address());
        }

        @NativeType("uint32_t")
        public int postMergeIndex() {
            return VkRenderPassSubpassFeedbackInfoEXT.npostMergeIndex(address());
        }
    }
}
