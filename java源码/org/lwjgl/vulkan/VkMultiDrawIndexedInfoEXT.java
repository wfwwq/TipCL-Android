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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT.class */
public class VkMultiDrawIndexedInfoEXT extends Struct<VkMultiDrawIndexedInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FIRSTINDEX;
    public static final int INDEXCOUNT;
    public static final int VERTEXOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FIRSTINDEX = layout.offsetof(0);
        INDEXCOUNT = layout.offsetof(1);
        VERTEXOFFSET = layout.offsetof(2);
    }

    protected VkMultiDrawIndexedInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMultiDrawIndexedInfoEXT create(long address, ByteBuffer container) {
        return new VkMultiDrawIndexedInfoEXT(address, container);
    }

    public VkMultiDrawIndexedInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int firstIndex() {
        return nfirstIndex(address());
    }

    @NativeType("uint32_t")
    public int indexCount() {
        return nindexCount(address());
    }

    @NativeType("int32_t")
    public int vertexOffset() {
        return nvertexOffset(address());
    }

    public VkMultiDrawIndexedInfoEXT firstIndex(@NativeType("uint32_t") int value) {
        nfirstIndex(address(), value);
        return this;
    }

    public VkMultiDrawIndexedInfoEXT indexCount(@NativeType("uint32_t") int value) {
        nindexCount(address(), value);
        return this;
    }

    public VkMultiDrawIndexedInfoEXT vertexOffset(@NativeType("int32_t") int value) {
        nvertexOffset(address(), value);
        return this;
    }

    public VkMultiDrawIndexedInfoEXT set(int firstIndex, int indexCount, int vertexOffset) {
        firstIndex(firstIndex);
        indexCount(indexCount);
        vertexOffset(vertexOffset);
        return this;
    }

    public VkMultiDrawIndexedInfoEXT set(VkMultiDrawIndexedInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMultiDrawIndexedInfoEXT malloc() {
        return new VkMultiDrawIndexedInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMultiDrawIndexedInfoEXT calloc() {
        return new VkMultiDrawIndexedInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMultiDrawIndexedInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultiDrawIndexedInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMultiDrawIndexedInfoEXT create(long address) {
        return new VkMultiDrawIndexedInfoEXT(address, null);
    }

    public static VkMultiDrawIndexedInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMultiDrawIndexedInfoEXT(address, null);
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

    public static VkMultiDrawIndexedInfoEXT malloc(MemoryStack stack) {
        return new VkMultiDrawIndexedInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMultiDrawIndexedInfoEXT calloc(MemoryStack stack) {
        return new VkMultiDrawIndexedInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nfirstIndex(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTINDEX);
    }

    public static int nindexCount(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXCOUNT);
    }

    public static int nvertexOffset(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXOFFSET);
    }

    public static void nfirstIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTINDEX, value);
    }

    public static void nindexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXCOUNT, value);
    }

    public static void nvertexOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXOFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawIndexedInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMultiDrawIndexedInfoEXT, Buffer> implements NativeResource {
        private static final VkMultiDrawIndexedInfoEXT ELEMENT_FACTORY = VkMultiDrawIndexedInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMultiDrawIndexedInfoEXT.SIZEOF);
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
        public VkMultiDrawIndexedInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int firstIndex() {
            return VkMultiDrawIndexedInfoEXT.nfirstIndex(address());
        }

        @NativeType("uint32_t")
        public int indexCount() {
            return VkMultiDrawIndexedInfoEXT.nindexCount(address());
        }

        @NativeType("int32_t")
        public int vertexOffset() {
            return VkMultiDrawIndexedInfoEXT.nvertexOffset(address());
        }

        public Buffer firstIndex(@NativeType("uint32_t") int value) {
            VkMultiDrawIndexedInfoEXT.nfirstIndex(address(), value);
            return this;
        }

        public Buffer indexCount(@NativeType("uint32_t") int value) {
            VkMultiDrawIndexedInfoEXT.nindexCount(address(), value);
            return this;
        }

        public Buffer vertexOffset(@NativeType("int32_t") int value) {
            VkMultiDrawIndexedInfoEXT.nvertexOffset(address(), value);
            return this;
        }
    }
}
