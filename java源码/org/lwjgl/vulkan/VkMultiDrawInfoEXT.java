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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawInfoEXT.class */
public class VkMultiDrawInfoEXT extends Struct<VkMultiDrawInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FIRSTVERTEX;
    public static final int VERTEXCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FIRSTVERTEX = layout.offsetof(0);
        VERTEXCOUNT = layout.offsetof(1);
    }

    protected VkMultiDrawInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMultiDrawInfoEXT create(long address, ByteBuffer container) {
        return new VkMultiDrawInfoEXT(address, container);
    }

    public VkMultiDrawInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int firstVertex() {
        return nfirstVertex(address());
    }

    @NativeType("uint32_t")
    public int vertexCount() {
        return nvertexCount(address());
    }

    public VkMultiDrawInfoEXT firstVertex(@NativeType("uint32_t") int value) {
        nfirstVertex(address(), value);
        return this;
    }

    public VkMultiDrawInfoEXT vertexCount(@NativeType("uint32_t") int value) {
        nvertexCount(address(), value);
        return this;
    }

    public VkMultiDrawInfoEXT set(int firstVertex, int vertexCount) {
        firstVertex(firstVertex);
        vertexCount(vertexCount);
        return this;
    }

    public VkMultiDrawInfoEXT set(VkMultiDrawInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMultiDrawInfoEXT malloc() {
        return new VkMultiDrawInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMultiDrawInfoEXT calloc() {
        return new VkMultiDrawInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMultiDrawInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultiDrawInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMultiDrawInfoEXT create(long address) {
        return new VkMultiDrawInfoEXT(address, null);
    }

    public static VkMultiDrawInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMultiDrawInfoEXT(address, null);
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

    public static VkMultiDrawInfoEXT malloc(MemoryStack stack) {
        return new VkMultiDrawInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMultiDrawInfoEXT calloc(MemoryStack stack) {
        return new VkMultiDrawInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nfirstVertex(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTVERTEX);
    }

    public static int nvertexCount(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXCOUNT);
    }

    public static void nfirstVertex(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTVERTEX, value);
    }

    public static void nvertexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultiDrawInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMultiDrawInfoEXT, Buffer> implements NativeResource {
        private static final VkMultiDrawInfoEXT ELEMENT_FACTORY = VkMultiDrawInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMultiDrawInfoEXT.SIZEOF);
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
        public VkMultiDrawInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int firstVertex() {
            return VkMultiDrawInfoEXT.nfirstVertex(address());
        }

        @NativeType("uint32_t")
        public int vertexCount() {
            return VkMultiDrawInfoEXT.nvertexCount(address());
        }

        public Buffer firstVertex(@NativeType("uint32_t") int value) {
            VkMultiDrawInfoEXT.nfirstVertex(address(), value);
            return this;
        }

        public Buffer vertexCount(@NativeType("uint32_t") int value) {
            VkMultiDrawInfoEXT.nvertexCount(address(), value);
            return this;
        }
    }
}
