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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription.class */
public class VkVertexInputAttributeDescription extends Struct<VkVertexInputAttributeDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LOCATION;
    public static final int BINDING;
    public static final int FORMAT;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LOCATION = layout.offsetof(0);
        BINDING = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        OFFSET = layout.offsetof(3);
    }

    protected VkVertexInputAttributeDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVertexInputAttributeDescription create(long address, ByteBuffer container) {
        return new VkVertexInputAttributeDescription(address, container);
    }

    public VkVertexInputAttributeDescription(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int location() {
        return nlocation(address());
    }

    @NativeType("uint32_t")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("uint32_t")
    public int offset() {
        return noffset(address());
    }

    public VkVertexInputAttributeDescription location(@NativeType("uint32_t") int value) {
        nlocation(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkVertexInputAttributeDescription set(int location, int binding, int format, int offset) {
        location(location);
        binding(binding);
        format(format);
        offset(offset);
        return this;
    }

    public VkVertexInputAttributeDescription set(VkVertexInputAttributeDescription src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVertexInputAttributeDescription malloc() {
        return new VkVertexInputAttributeDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVertexInputAttributeDescription calloc() {
        return new VkVertexInputAttributeDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVertexInputAttributeDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputAttributeDescription(MemoryUtil.memAddress(container), container);
    }

    public static VkVertexInputAttributeDescription create(long address) {
        return new VkVertexInputAttributeDescription(address, null);
    }

    public static VkVertexInputAttributeDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVertexInputAttributeDescription(address, null);
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

    public static VkVertexInputAttributeDescription malloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVertexInputAttributeDescription calloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nlocation(long struct) {
        return MemoryUtil.memGetInt(struct + LOCATION);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static void nlocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCATION, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVertexInputAttributeDescription$Buffer.class */
    public static class Buffer extends StructBuffer<VkVertexInputAttributeDescription, Buffer> implements NativeResource {
        private static final VkVertexInputAttributeDescription ELEMENT_FACTORY = VkVertexInputAttributeDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVertexInputAttributeDescription.SIZEOF);
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
        public VkVertexInputAttributeDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int location() {
            return VkVertexInputAttributeDescription.nlocation(address());
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkVertexInputAttributeDescription.nbinding(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkVertexInputAttributeDescription.nformat(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkVertexInputAttributeDescription.noffset(address());
        }

        public Buffer location(@NativeType("uint32_t") int value) {
            VkVertexInputAttributeDescription.nlocation(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkVertexInputAttributeDescription.nbinding(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkVertexInputAttributeDescription.nformat(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkVertexInputAttributeDescription.noffset(address(), value);
            return this;
        }
    }
}
