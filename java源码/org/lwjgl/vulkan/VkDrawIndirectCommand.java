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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndirectCommand.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndirectCommand.class */
public class VkDrawIndirectCommand extends Struct<VkDrawIndirectCommand> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERTEXCOUNT;
    public static final int INSTANCECOUNT;
    public static final int FIRSTVERTEX;
    public static final int FIRSTINSTANCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERTEXCOUNT = layout.offsetof(0);
        INSTANCECOUNT = layout.offsetof(1);
        FIRSTVERTEX = layout.offsetof(2);
        FIRSTINSTANCE = layout.offsetof(3);
    }

    protected VkDrawIndirectCommand(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrawIndirectCommand create(long address, ByteBuffer container) {
        return new VkDrawIndirectCommand(address, container);
    }

    public VkDrawIndirectCommand(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int vertexCount() {
        return nvertexCount(address());
    }

    @NativeType("uint32_t")
    public int instanceCount() {
        return ninstanceCount(address());
    }

    @NativeType("uint32_t")
    public int firstVertex() {
        return nfirstVertex(address());
    }

    @NativeType("uint32_t")
    public int firstInstance() {
        return nfirstInstance(address());
    }

    public VkDrawIndirectCommand vertexCount(@NativeType("uint32_t") int value) {
        nvertexCount(address(), value);
        return this;
    }

    public VkDrawIndirectCommand instanceCount(@NativeType("uint32_t") int value) {
        ninstanceCount(address(), value);
        return this;
    }

    public VkDrawIndirectCommand firstVertex(@NativeType("uint32_t") int value) {
        nfirstVertex(address(), value);
        return this;
    }

    public VkDrawIndirectCommand firstInstance(@NativeType("uint32_t") int value) {
        nfirstInstance(address(), value);
        return this;
    }

    public VkDrawIndirectCommand set(int vertexCount, int instanceCount, int firstVertex, int firstInstance) {
        vertexCount(vertexCount);
        instanceCount(instanceCount);
        firstVertex(firstVertex);
        firstInstance(firstInstance);
        return this;
    }

    public VkDrawIndirectCommand set(VkDrawIndirectCommand src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDrawIndirectCommand malloc() {
        return new VkDrawIndirectCommand(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDrawIndirectCommand calloc() {
        return new VkDrawIndirectCommand(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDrawIndirectCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawIndirectCommand(MemoryUtil.memAddress(container), container);
    }

    public static VkDrawIndirectCommand create(long address) {
        return new VkDrawIndirectCommand(address, null);
    }

    public static VkDrawIndirectCommand createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrawIndirectCommand(address, null);
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

    public static VkDrawIndirectCommand malloc(MemoryStack stack) {
        return new VkDrawIndirectCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDrawIndirectCommand calloc(MemoryStack stack) {
        return new VkDrawIndirectCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nvertexCount(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXCOUNT);
    }

    public static int ninstanceCount(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCECOUNT);
    }

    public static int nfirstVertex(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTVERTEX);
    }

    public static int nfirstInstance(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTINSTANCE);
    }

    public static void nvertexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXCOUNT, value);
    }

    public static void ninstanceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCECOUNT, value);
    }

    public static void nfirstVertex(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTVERTEX, value);
    }

    public static void nfirstInstance(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTINSTANCE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndirectCommand$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrawIndirectCommand$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrawIndirectCommand, Buffer> implements NativeResource {
        private static final VkDrawIndirectCommand ELEMENT_FACTORY = VkDrawIndirectCommand.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrawIndirectCommand.SIZEOF);
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
        public VkDrawIndirectCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int vertexCount() {
            return VkDrawIndirectCommand.nvertexCount(address());
        }

        @NativeType("uint32_t")
        public int instanceCount() {
            return VkDrawIndirectCommand.ninstanceCount(address());
        }

        @NativeType("uint32_t")
        public int firstVertex() {
            return VkDrawIndirectCommand.nfirstVertex(address());
        }

        @NativeType("uint32_t")
        public int firstInstance() {
            return VkDrawIndirectCommand.nfirstInstance(address());
        }

        public Buffer vertexCount(@NativeType("uint32_t") int value) {
            VkDrawIndirectCommand.nvertexCount(address(), value);
            return this;
        }

        public Buffer instanceCount(@NativeType("uint32_t") int value) {
            VkDrawIndirectCommand.ninstanceCount(address(), value);
            return this;
        }

        public Buffer firstVertex(@NativeType("uint32_t") int value) {
            VkDrawIndirectCommand.nfirstVertex(address(), value);
            return this;
        }

        public Buffer firstInstance(@NativeType("uint32_t") int value) {
            VkDrawIndirectCommand.nfirstInstance(address(), value);
            return this;
        }
    }
}
