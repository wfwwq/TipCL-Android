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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription.class */
public class VkVertexInputBindingDescription extends Struct<VkVertexInputBindingDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BINDING;
    public static final int STRIDE;
    public static final int INPUTRATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BINDING = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        INPUTRATE = layout.offsetof(2);
    }

    protected VkVertexInputBindingDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVertexInputBindingDescription create(long address, ByteBuffer container) {
        return new VkVertexInputBindingDescription(address, container);
    }

    public VkVertexInputBindingDescription(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("uint32_t")
    public int stride() {
        return nstride(address());
    }

    @NativeType("VkVertexInputRate")
    public int inputRate() {
        return ninputRate(address());
    }

    public VkVertexInputBindingDescription binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription stride(@NativeType("uint32_t") int value) {
        nstride(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription inputRate(@NativeType("VkVertexInputRate") int value) {
        ninputRate(address(), value);
        return this;
    }

    public VkVertexInputBindingDescription set(int binding, int stride, int inputRate) {
        binding(binding);
        stride(stride);
        inputRate(inputRate);
        return this;
    }

    public VkVertexInputBindingDescription set(VkVertexInputBindingDescription src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVertexInputBindingDescription malloc() {
        return new VkVertexInputBindingDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVertexInputBindingDescription calloc() {
        return new VkVertexInputBindingDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVertexInputBindingDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDescription(MemoryUtil.memAddress(container), container);
    }

    public static VkVertexInputBindingDescription create(long address) {
        return new VkVertexInputBindingDescription(address, null);
    }

    public static VkVertexInputBindingDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVertexInputBindingDescription(address, null);
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

    public static VkVertexInputBindingDescription malloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVertexInputBindingDescription calloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int nstride(long struct) {
        return MemoryUtil.memGetInt(struct + STRIDE);
    }

    public static int ninputRate(long struct) {
        return MemoryUtil.memGetInt(struct + INPUTRATE);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void nstride(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIDE, value);
    }

    public static void ninputRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUTRATE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDescription$Buffer.class */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDescription, Buffer> implements NativeResource {
        private static final VkVertexInputBindingDescription ELEMENT_FACTORY = VkVertexInputBindingDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVertexInputBindingDescription.SIZEOF);
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
        public VkVertexInputBindingDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkVertexInputBindingDescription.nbinding(address());
        }

        @NativeType("uint32_t")
        public int stride() {
            return VkVertexInputBindingDescription.nstride(address());
        }

        @NativeType("VkVertexInputRate")
        public int inputRate() {
            return VkVertexInputBindingDescription.ninputRate(address());
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDescription.nbinding(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDescription.nstride(address(), value);
            return this;
        }

        public Buffer inputRate(@NativeType("VkVertexInputRate") int value) {
            VkVertexInputBindingDescription.ninputRate(address(), value);
            return this;
        }
    }
}
