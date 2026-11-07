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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryRequirements.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryRequirements.class */
public class VkSparseImageMemoryRequirements extends Struct<VkSparseImageMemoryRequirements> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FORMATPROPERTIES;
    public static final int IMAGEMIPTAILFIRSTLOD;
    public static final int IMAGEMIPTAILSIZE;
    public static final int IMAGEMIPTAILOFFSET;
    public static final int IMAGEMIPTAILSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(VkSparseImageFormatProperties.SIZEOF, VkSparseImageFormatProperties.ALIGNOF), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FORMATPROPERTIES = layout.offsetof(0);
        IMAGEMIPTAILFIRSTLOD = layout.offsetof(1);
        IMAGEMIPTAILSIZE = layout.offsetof(2);
        IMAGEMIPTAILOFFSET = layout.offsetof(3);
        IMAGEMIPTAILSTRIDE = layout.offsetof(4);
    }

    protected VkSparseImageMemoryRequirements(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSparseImageMemoryRequirements create(long address, ByteBuffer container) {
        return new VkSparseImageMemoryRequirements(address, container);
    }

    public VkSparseImageMemoryRequirements(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkSparseImageFormatProperties formatProperties() {
        return nformatProperties(address());
    }

    @NativeType("uint32_t")
    public int imageMipTailFirstLod() {
        return nimageMipTailFirstLod(address());
    }

    @NativeType("VkDeviceSize")
    public long imageMipTailSize() {
        return nimageMipTailSize(address());
    }

    @NativeType("VkDeviceSize")
    public long imageMipTailOffset() {
        return nimageMipTailOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long imageMipTailStride() {
        return nimageMipTailStride(address());
    }

    public static VkSparseImageMemoryRequirements malloc() {
        return new VkSparseImageMemoryRequirements(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSparseImageMemoryRequirements calloc() {
        return new VkSparseImageMemoryRequirements(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSparseImageMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageMemoryRequirements(MemoryUtil.memAddress(container), container);
    }

    public static VkSparseImageMemoryRequirements create(long address) {
        return new VkSparseImageMemoryRequirements(address, null);
    }

    public static VkSparseImageMemoryRequirements createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSparseImageMemoryRequirements(address, null);
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

    public static VkSparseImageMemoryRequirements malloc(MemoryStack stack) {
        return new VkSparseImageMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSparseImageMemoryRequirements calloc(MemoryStack stack) {
        return new VkSparseImageMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkSparseImageFormatProperties nformatProperties(long struct) {
        return VkSparseImageFormatProperties.create(struct + FORMATPROPERTIES);
    }

    public static int nimageMipTailFirstLod(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEMIPTAILFIRSTLOD);
    }

    public static long nimageMipTailSize(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEMIPTAILSIZE);
    }

    public static long nimageMipTailOffset(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEMIPTAILOFFSET);
    }

    public static long nimageMipTailStride(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEMIPTAILSTRIDE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryRequirements$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSparseImageMemoryRequirements$Buffer.class */
    public static class Buffer extends StructBuffer<VkSparseImageMemoryRequirements, Buffer> implements NativeResource {
        private static final VkSparseImageMemoryRequirements ELEMENT_FACTORY = VkSparseImageMemoryRequirements.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSparseImageMemoryRequirements.SIZEOF);
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
        public VkSparseImageMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkSparseImageFormatProperties formatProperties() {
            return VkSparseImageMemoryRequirements.nformatProperties(address());
        }

        @NativeType("uint32_t")
        public int imageMipTailFirstLod() {
            return VkSparseImageMemoryRequirements.nimageMipTailFirstLod(address());
        }

        @NativeType("VkDeviceSize")
        public long imageMipTailSize() {
            return VkSparseImageMemoryRequirements.nimageMipTailSize(address());
        }

        @NativeType("VkDeviceSize")
        public long imageMipTailOffset() {
            return VkSparseImageMemoryRequirements.nimageMipTailOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long imageMipTailStride() {
            return VkSparseImageMemoryRequirements.nimageMipTailStride(address());
        }
    }
}
