package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreationFeedbackInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreationFeedbackInfoEXT.class */
public class VkRenderPassCreationFeedbackInfoEXT extends Struct<VkRenderPassCreationFeedbackInfoEXT> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int POSTMERGESUBPASSCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        POSTMERGESUBPASSCOUNT = layout.offsetof(0);
    }

    protected VkRenderPassCreationFeedbackInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassCreationFeedbackInfoEXT create(long address, ByteBuffer container) {
        return new VkRenderPassCreationFeedbackInfoEXT(address, container);
    }

    public VkRenderPassCreationFeedbackInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int postMergeSubpassCount() {
        return npostMergeSubpassCount(address());
    }

    public static VkRenderPassCreationFeedbackInfoEXT create(long address) {
        return new VkRenderPassCreationFeedbackInfoEXT(address, null);
    }

    public static VkRenderPassCreationFeedbackInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassCreationFeedbackInfoEXT(address, null);
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

    public static int npostMergeSubpassCount(long struct) {
        return MemoryUtil.memGetInt(struct + POSTMERGESUBPASSCOUNT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreationFeedbackInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreationFeedbackInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassCreationFeedbackInfoEXT, Buffer> {
        private static final VkRenderPassCreationFeedbackInfoEXT ELEMENT_FACTORY = VkRenderPassCreationFeedbackInfoEXT.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassCreationFeedbackInfoEXT.SIZEOF);
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
        public VkRenderPassCreationFeedbackInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int postMergeSubpassCount() {
            return VkRenderPassCreationFeedbackInfoEXT.npostMergeSubpassCount(address());
        }
    }
}
