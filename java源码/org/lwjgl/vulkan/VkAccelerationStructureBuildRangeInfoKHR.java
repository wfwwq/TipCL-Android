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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildRangeInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildRangeInfoKHR.class */
public class VkAccelerationStructureBuildRangeInfoKHR extends Struct<VkAccelerationStructureBuildRangeInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PRIMITIVECOUNT;
    public static final int PRIMITIVEOFFSET;
    public static final int FIRSTVERTEX;
    public static final int TRANSFORMOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PRIMITIVECOUNT = layout.offsetof(0);
        PRIMITIVEOFFSET = layout.offsetof(1);
        FIRSTVERTEX = layout.offsetof(2);
        TRANSFORMOFFSET = layout.offsetof(3);
    }

    protected VkAccelerationStructureBuildRangeInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureBuildRangeInfoKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureBuildRangeInfoKHR(address, container);
    }

    public VkAccelerationStructureBuildRangeInfoKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int primitiveCount() {
        return nprimitiveCount(address());
    }

    @NativeType("uint32_t")
    public int primitiveOffset() {
        return nprimitiveOffset(address());
    }

    @NativeType("uint32_t")
    public int firstVertex() {
        return nfirstVertex(address());
    }

    @NativeType("uint32_t")
    public int transformOffset() {
        return ntransformOffset(address());
    }

    public VkAccelerationStructureBuildRangeInfoKHR primitiveCount(@NativeType("uint32_t") int value) {
        nprimitiveCount(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffset(@NativeType("uint32_t") int value) {
        nprimitiveOffset(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildRangeInfoKHR firstVertex(@NativeType("uint32_t") int value) {
        nfirstVertex(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(@NativeType("uint32_t") int value) {
        ntransformOffset(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildRangeInfoKHR set(int primitiveCount, int primitiveOffset, int firstVertex, int transformOffset) {
        primitiveCount(primitiveCount);
        primitiveOffset(primitiveOffset);
        firstVertex(firstVertex);
        transformOffset(transformOffset);
        return this;
    }

    public VkAccelerationStructureBuildRangeInfoKHR set(VkAccelerationStructureBuildRangeInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureBuildRangeInfoKHR malloc() {
        return new VkAccelerationStructureBuildRangeInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureBuildRangeInfoKHR calloc() {
        return new VkAccelerationStructureBuildRangeInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureBuildRangeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureBuildRangeInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureBuildRangeInfoKHR create(long address) {
        return new VkAccelerationStructureBuildRangeInfoKHR(address, null);
    }

    public static VkAccelerationStructureBuildRangeInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureBuildRangeInfoKHR(address, null);
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

    public static VkAccelerationStructureBuildRangeInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildRangeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureBuildRangeInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildRangeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nprimitiveCount(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVECOUNT);
    }

    public static int nprimitiveOffset(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVEOFFSET);
    }

    public static int nfirstVertex(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTVERTEX);
    }

    public static int ntransformOffset(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORMOFFSET);
    }

    public static void nprimitiveCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVECOUNT, value);
    }

    public static void nprimitiveOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVEOFFSET, value);
    }

    public static void nfirstVertex(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTVERTEX, value);
    }

    public static void ntransformOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRANSFORMOFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildRangeInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildRangeInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildRangeInfoKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureBuildRangeInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildRangeInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureBuildRangeInfoKHR.SIZEOF);
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
        public VkAccelerationStructureBuildRangeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int primitiveCount() {
            return VkAccelerationStructureBuildRangeInfoKHR.nprimitiveCount(address());
        }

        @NativeType("uint32_t")
        public int primitiveOffset() {
            return VkAccelerationStructureBuildRangeInfoKHR.nprimitiveOffset(address());
        }

        @NativeType("uint32_t")
        public int firstVertex() {
            return VkAccelerationStructureBuildRangeInfoKHR.nfirstVertex(address());
        }

        @NativeType("uint32_t")
        public int transformOffset() {
            return VkAccelerationStructureBuildRangeInfoKHR.ntransformOffset(address());
        }

        public Buffer primitiveCount(@NativeType("uint32_t") int value) {
            VkAccelerationStructureBuildRangeInfoKHR.nprimitiveCount(address(), value);
            return this;
        }

        public Buffer primitiveOffset(@NativeType("uint32_t") int value) {
            VkAccelerationStructureBuildRangeInfoKHR.nprimitiveOffset(address(), value);
            return this;
        }

        public Buffer firstVertex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureBuildRangeInfoKHR.nfirstVertex(address(), value);
            return this;
        }

        public Buffer transformOffset(@NativeType("uint32_t") int value) {
            VkAccelerationStructureBuildRangeInfoKHR.ntransformOffset(address(), value);
            return this;
        }
    }
}
