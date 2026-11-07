package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearAttachment.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearAttachment.class */
public class VkClearAttachment extends Struct<VkClearAttachment> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ASPECTMASK;
    public static final int COLORATTACHMENT;
    public static final int CLEARVALUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(VkClearValue.SIZEOF, VkClearValue.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ASPECTMASK = layout.offsetof(0);
        COLORATTACHMENT = layout.offsetof(1);
        CLEARVALUE = layout.offsetof(2);
    }

    protected VkClearAttachment(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClearAttachment create(long address, ByteBuffer container) {
        return new VkClearAttachment(address, container);
    }

    public VkClearAttachment(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkImageAspectFlags")
    public int aspectMask() {
        return naspectMask(address());
    }

    @NativeType("uint32_t")
    public int colorAttachment() {
        return ncolorAttachment(address());
    }

    public VkClearValue clearValue() {
        return nclearValue(address());
    }

    public VkClearAttachment aspectMask(@NativeType("VkImageAspectFlags") int value) {
        naspectMask(address(), value);
        return this;
    }

    public VkClearAttachment colorAttachment(@NativeType("uint32_t") int value) {
        ncolorAttachment(address(), value);
        return this;
    }

    public VkClearAttachment clearValue(VkClearValue value) {
        nclearValue(address(), value);
        return this;
    }

    public VkClearAttachment clearValue(Consumer<VkClearValue> consumer) {
        consumer.accept(clearValue());
        return this;
    }

    public VkClearAttachment set(int aspectMask, int colorAttachment, VkClearValue clearValue) {
        aspectMask(aspectMask);
        colorAttachment(colorAttachment);
        clearValue(clearValue);
        return this;
    }

    public VkClearAttachment set(VkClearAttachment src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClearAttachment malloc() {
        return new VkClearAttachment(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClearAttachment calloc() {
        return new VkClearAttachment(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClearAttachment create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearAttachment(MemoryUtil.memAddress(container), container);
    }

    public static VkClearAttachment create(long address) {
        return new VkClearAttachment(address, null);
    }

    public static VkClearAttachment createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClearAttachment(address, null);
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

    public static VkClearAttachment malloc(MemoryStack stack) {
        return new VkClearAttachment(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClearAttachment calloc(MemoryStack stack) {
        return new VkClearAttachment(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int naspectMask(long struct) {
        return MemoryUtil.memGetInt(struct + ASPECTMASK);
    }

    public static int ncolorAttachment(long struct) {
        return MemoryUtil.memGetInt(struct + COLORATTACHMENT);
    }

    public static VkClearValue nclearValue(long struct) {
        return VkClearValue.create(struct + CLEARVALUE);
    }

    public static void naspectMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + ASPECTMASK, value);
    }

    public static void ncolorAttachment(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENT, value);
    }

    public static void nclearValue(long struct, VkClearValue value) {
        MemoryUtil.memCopy(value.address(), struct + CLEARVALUE, VkClearValue.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearAttachment$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearAttachment$Buffer.class */
    public static class Buffer extends StructBuffer<VkClearAttachment, Buffer> implements NativeResource {
        private static final VkClearAttachment ELEMENT_FACTORY = VkClearAttachment.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClearAttachment.SIZEOF);
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
        public VkClearAttachment getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkImageAspectFlags")
        public int aspectMask() {
            return VkClearAttachment.naspectMask(address());
        }

        @NativeType("uint32_t")
        public int colorAttachment() {
            return VkClearAttachment.ncolorAttachment(address());
        }

        public VkClearValue clearValue() {
            return VkClearAttachment.nclearValue(address());
        }

        public Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) {
            VkClearAttachment.naspectMask(address(), value);
            return this;
        }

        public Buffer colorAttachment(@NativeType("uint32_t") int value) {
            VkClearAttachment.ncolorAttachment(address(), value);
            return this;
        }

        public Buffer clearValue(VkClearValue value) {
            VkClearAttachment.nclearValue(address(), value);
            return this;
        }

        public Buffer clearValue(Consumer<VkClearValue> consumer) {
            consumer.accept(clearValue());
            return this;
        }
    }
}
