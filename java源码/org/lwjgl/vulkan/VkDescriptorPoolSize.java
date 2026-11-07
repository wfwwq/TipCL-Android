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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolSize.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolSize.class */
public class VkDescriptorPoolSize extends Struct<VkDescriptorPoolSize> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int DESCRIPTORCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        DESCRIPTORCOUNT = layout.offsetof(1);
    }

    protected VkDescriptorPoolSize(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorPoolSize create(long address, ByteBuffer container) {
        return new VkDescriptorPoolSize(address, container);
    }

    public VkDescriptorPoolSize(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDescriptorType")
    public int type() {
        return ntype(address());
    }

    @NativeType("uint32_t")
    public int descriptorCount() {
        return ndescriptorCount(address());
    }

    public VkDescriptorPoolSize type(@NativeType("VkDescriptorType") int value) {
        ntype(address(), value);
        return this;
    }

    public VkDescriptorPoolSize descriptorCount(@NativeType("uint32_t") int value) {
        ndescriptorCount(address(), value);
        return this;
    }

    public VkDescriptorPoolSize set(int type, int descriptorCount) {
        type(type);
        descriptorCount(descriptorCount);
        return this;
    }

    public VkDescriptorPoolSize set(VkDescriptorPoolSize src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorPoolSize malloc() {
        return new VkDescriptorPoolSize(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorPoolSize calloc() {
        return new VkDescriptorPoolSize(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorPoolSize create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorPoolSize(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorPoolSize create(long address) {
        return new VkDescriptorPoolSize(address, null);
    }

    public static VkDescriptorPoolSize createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorPoolSize(address, null);
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

    public static VkDescriptorPoolSize malloc(MemoryStack stack) {
        return new VkDescriptorPoolSize(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorPoolSize calloc(MemoryStack stack) {
        return new VkDescriptorPoolSize(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int ndescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORCOUNT);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ndescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolSize$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolSize$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorPoolSize, Buffer> implements NativeResource {
        private static final VkDescriptorPoolSize ELEMENT_FACTORY = VkDescriptorPoolSize.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorPoolSize.SIZEOF);
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
        public VkDescriptorPoolSize getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDescriptorType")
        public int type() {
            return VkDescriptorPoolSize.ntype(address());
        }

        @NativeType("uint32_t")
        public int descriptorCount() {
            return VkDescriptorPoolSize.ndescriptorCount(address());
        }

        public Buffer type(@NativeType("VkDescriptorType") int value) {
            VkDescriptorPoolSize.ntype(address(), value);
            return this;
        }

        public Buffer descriptorCount(@NativeType("uint32_t") int value) {
            VkDescriptorPoolSize.ndescriptorCount(address(), value);
            return this;
        }
    }
}
