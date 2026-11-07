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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndexedIndirectCommand.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndexedIndirectCommand.class */
public class VkDrawIndexedIndirectCommand extends Struct<VkDrawIndexedIndirectCommand> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INDEXCOUNT;
    public static final int INSTANCECOUNT;
    public static final int FIRSTINDEX;
    public static final int VERTEXOFFSET;
    public static final int FIRSTINSTANCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INDEXCOUNT = layout.offsetof(0);
        INSTANCECOUNT = layout.offsetof(1);
        FIRSTINDEX = layout.offsetof(2);
        VERTEXOFFSET = layout.offsetof(3);
        FIRSTINSTANCE = layout.offsetof(4);
    }

    protected VkDrawIndexedIndirectCommand(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrawIndexedIndirectCommand create(long address, ByteBuffer container) {
        return new VkDrawIndexedIndirectCommand(address, container);
    }

    public VkDrawIndexedIndirectCommand(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int indexCount() {
        return nindexCount(address());
    }

    @NativeType("uint32_t")
    public int instanceCount() {
        return ninstanceCount(address());
    }

    @NativeType("uint32_t")
    public int firstIndex() {
        return nfirstIndex(address());
    }

    @NativeType("int32_t")
    public int vertexOffset() {
        return nvertexOffset(address());
    }

    @NativeType("uint32_t")
    public int firstInstance() {
        return nfirstInstance(address());
    }

    public VkDrawIndexedIndirectCommand indexCount(@NativeType("uint32_t") int value) {
        nindexCount(address(), value);
        return this;
    }

    public VkDrawIndexedIndirectCommand instanceCount(@NativeType("uint32_t") int value) {
        ninstanceCount(address(), value);
        return this;
    }

    public VkDrawIndexedIndirectCommand firstIndex(@NativeType("uint32_t") int value) {
        nfirstIndex(address(), value);
        return this;
    }

    public VkDrawIndexedIndirectCommand vertexOffset(@NativeType("int32_t") int value) {
        nvertexOffset(address(), value);
        return this;
    }

    public VkDrawIndexedIndirectCommand firstInstance(@NativeType("uint32_t") int value) {
        nfirstInstance(address(), value);
        return this;
    }

    public VkDrawIndexedIndirectCommand set(int indexCount, int instanceCount, int firstIndex, int vertexOffset, int firstInstance) {
        indexCount(indexCount);
        instanceCount(instanceCount);
        firstIndex(firstIndex);
        vertexOffset(vertexOffset);
        firstInstance(firstInstance);
        return this;
    }

    public VkDrawIndexedIndirectCommand set(VkDrawIndexedIndirectCommand src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDrawIndexedIndirectCommand malloc() {
        return new VkDrawIndexedIndirectCommand(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDrawIndexedIndirectCommand calloc() {
        return new VkDrawIndexedIndirectCommand(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDrawIndexedIndirectCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawIndexedIndirectCommand(MemoryUtil.memAddress(container), container);
    }

    public static VkDrawIndexedIndirectCommand create(long address) {
        return new VkDrawIndexedIndirectCommand(address, null);
    }

    public static VkDrawIndexedIndirectCommand createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrawIndexedIndirectCommand(address, null);
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

    public static VkDrawIndexedIndirectCommand malloc(MemoryStack stack) {
        return new VkDrawIndexedIndirectCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDrawIndexedIndirectCommand calloc(MemoryStack stack) {
        return new VkDrawIndexedIndirectCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nindexCount(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXCOUNT);
    }

    public static int ninstanceCount(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCECOUNT);
    }

    public static int nfirstIndex(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTINDEX);
    }

    public static int nvertexOffset(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXOFFSET);
    }

    public static int nfirstInstance(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTINSTANCE);
    }

    public static void nindexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXCOUNT, value);
    }

    public static void ninstanceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCECOUNT, value);
    }

    public static void nfirstIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTINDEX, value);
    }

    public static void nvertexOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXOFFSET, value);
    }

    public static void nfirstInstance(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTINSTANCE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndexedIndirectCommand$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndexedIndirectCommand$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrawIndexedIndirectCommand, Buffer> implements NativeResource {
        private static final VkDrawIndexedIndirectCommand ELEMENT_FACTORY = VkDrawIndexedIndirectCommand.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrawIndexedIndirectCommand.SIZEOF);
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
        public VkDrawIndexedIndirectCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int indexCount() {
            return VkDrawIndexedIndirectCommand.nindexCount(address());
        }

        @NativeType("uint32_t")
        public int instanceCount() {
            return VkDrawIndexedIndirectCommand.ninstanceCount(address());
        }

        @NativeType("uint32_t")
        public int firstIndex() {
            return VkDrawIndexedIndirectCommand.nfirstIndex(address());
        }

        @NativeType("int32_t")
        public int vertexOffset() {
            return VkDrawIndexedIndirectCommand.nvertexOffset(address());
        }

        @NativeType("uint32_t")
        public int firstInstance() {
            return VkDrawIndexedIndirectCommand.nfirstInstance(address());
        }

        public Buffer indexCount(@NativeType("uint32_t") int value) {
            VkDrawIndexedIndirectCommand.nindexCount(address(), value);
            return this;
        }

        public Buffer instanceCount(@NativeType("uint32_t") int value) {
            VkDrawIndexedIndirectCommand.ninstanceCount(address(), value);
            return this;
        }

        public Buffer firstIndex(@NativeType("uint32_t") int value) {
            VkDrawIndexedIndirectCommand.nfirstIndex(address(), value);
            return this;
        }

        public Buffer vertexOffset(@NativeType("int32_t") int value) {
            VkDrawIndexedIndirectCommand.nvertexOffset(address(), value);
            return this;
        }

        public Buffer firstInstance(@NativeType("uint32_t") int value) {
            VkDrawIndexedIndirectCommand.nfirstInstance(address(), value);
            return this;
        }
    }
}
