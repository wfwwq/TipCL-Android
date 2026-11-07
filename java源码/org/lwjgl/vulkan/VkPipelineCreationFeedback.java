package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedback.class */
public class VkPipelineCreationFeedback extends Struct<VkPipelineCreationFeedback> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int DURATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        DURATION = layout.offsetof(1);
    }

    protected VkPipelineCreationFeedback(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCreationFeedback create(long address, ByteBuffer container) {
        return new VkPipelineCreationFeedback(address, container);
    }

    public VkPipelineCreationFeedback(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkPipelineCreationFeedbackFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint64_t")
    public long duration() {
        return nduration(address());
    }

    public static VkPipelineCreationFeedback create(long address) {
        return new VkPipelineCreationFeedback(address, null);
    }

    public static VkPipelineCreationFeedback createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCreationFeedback(address, null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nduration(long struct) {
        return MemoryUtil.memGetLong(struct + DURATION);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedback$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedback$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCreationFeedback, Buffer> {
        private static final VkPipelineCreationFeedback ELEMENT_FACTORY = VkPipelineCreationFeedback.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCreationFeedback.SIZEOF);
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
        public VkPipelineCreationFeedback getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkPipelineCreationFeedbackFlags")
        public int flags() {
            return VkPipelineCreationFeedback.nflags(address());
        }

        @NativeType("uint64_t")
        public long duration() {
            return VkPipelineCreationFeedback.nduration(address());
        }
    }
}
