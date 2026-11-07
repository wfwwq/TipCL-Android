package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDivisorDescription.class */
public class VkVertexInputBindingDivisorDescription extends Struct<VkVertexInputBindingDivisorDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BINDING;
    public static final int DIVISOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BINDING = layout.offsetof(0);
        DIVISOR = layout.offsetof(1);
    }

    protected VkVertexInputBindingDivisorDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVertexInputBindingDivisorDescription create(long address, ByteBuffer container) {
        return new VkVertexInputBindingDivisorDescription(address, container);
    }

    public VkVertexInputBindingDivisorDescription(ByteBuffer container) {
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
    public int divisor() {
        return ndivisor(address());
    }

    public VkVertexInputBindingDivisorDescription binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkVertexInputBindingDivisorDescription divisor(@NativeType("uint32_t") int value) {
        ndivisor(address(), value);
        return this;
    }

    public VkVertexInputBindingDivisorDescription set(int binding, int divisor) {
        binding(binding);
        divisor(divisor);
        return this;
    }

    public VkVertexInputBindingDivisorDescription set(VkVertexInputBindingDivisorDescription src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVertexInputBindingDivisorDescription malloc() {
        return new VkVertexInputBindingDivisorDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVertexInputBindingDivisorDescription calloc() {
        return new VkVertexInputBindingDivisorDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVertexInputBindingDivisorDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDivisorDescription(MemoryUtil.memAddress(container), container);
    }

    public static VkVertexInputBindingDivisorDescription create(long address) {
        return new VkVertexInputBindingDivisorDescription(address, null);
    }

    public static VkVertexInputBindingDivisorDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVertexInputBindingDivisorDescription(address, null);
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

    public static VkVertexInputBindingDivisorDescription malloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVertexInputBindingDivisorDescription calloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndivisor(long struct) {
        return MemoryUtil.memGetInt(struct + DIVISOR);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void ndivisor(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIVISOR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputBindingDivisorDescription$Buffer.class */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDivisorDescription, Buffer> implements NativeResource {
        private static final VkVertexInputBindingDivisorDescription ELEMENT_FACTORY = VkVertexInputBindingDivisorDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVertexInputBindingDivisorDescription.SIZEOF);
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
        public VkVertexInputBindingDivisorDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkVertexInputBindingDivisorDescription.nbinding(address());
        }

        @NativeType("uint32_t")
        public int divisor() {
            return VkVertexInputBindingDivisorDescription.ndivisor(address());
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDivisorDescription.nbinding(address(), value);
            return this;
        }

        public Buffer divisor(@NativeType("uint32_t") int value) {
            VkVertexInputBindingDivisorDescription.ndivisor(address(), value);
            return this;
        }
    }
}
