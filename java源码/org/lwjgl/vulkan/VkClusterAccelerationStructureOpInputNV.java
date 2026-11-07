package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureOpInputNV.class */
public class VkClusterAccelerationStructureOpInputNV extends Struct<VkClusterAccelerationStructureOpInputNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PCLUSTERSBOTTOMLEVEL;
    public static final int PTRIANGLECLUSTERS;
    public static final int PMOVEOBJECTS;

    static {
        Struct.Layout layout = __union(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PCLUSTERSBOTTOMLEVEL = layout.offsetof(0);
        PTRIANGLECLUSTERS = layout.offsetof(1);
        PMOVEOBJECTS = layout.offsetof(2);
    }

    protected VkClusterAccelerationStructureOpInputNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureOpInputNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureOpInputNV(address, container);
    }

    public VkClusterAccelerationStructureOpInputNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *")
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() {
        return npClustersBottomLevel(address());
    }

    @NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *")
    public VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() {
        return npTriangleClusters(address());
    }

    @NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *")
    public VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() {
        return npMoveObjects(address());
    }

    public VkClusterAccelerationStructureOpInputNV pClustersBottomLevel(@NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *") VkClusterAccelerationStructureClustersBottomLevelInputNV value) {
        npClustersBottomLevel(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureOpInputNV pTriangleClusters(@NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *") VkClusterAccelerationStructureTriangleClusterInputNV value) {
        npTriangleClusters(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureOpInputNV pMoveObjects(@NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *") VkClusterAccelerationStructureMoveObjectsInputNV value) {
        npMoveObjects(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureOpInputNV set(VkClusterAccelerationStructureOpInputNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureOpInputNV malloc() {
        return new VkClusterAccelerationStructureOpInputNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureOpInputNV calloc() {
        return new VkClusterAccelerationStructureOpInputNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureOpInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureOpInputNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureOpInputNV create(long address) {
        return new VkClusterAccelerationStructureOpInputNV(address, null);
    }

    public static VkClusterAccelerationStructureOpInputNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureOpInputNV(address, null);
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

    public static VkClusterAccelerationStructureOpInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureOpInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureOpInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureOpInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV npClustersBottomLevel(long struct) {
        return VkClusterAccelerationStructureClustersBottomLevelInputNV.create(MemoryUtil.memGetAddress(struct + PCLUSTERSBOTTOMLEVEL));
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV npTriangleClusters(long struct) {
        return VkClusterAccelerationStructureTriangleClusterInputNV.create(MemoryUtil.memGetAddress(struct + PTRIANGLECLUSTERS));
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV npMoveObjects(long struct) {
        return VkClusterAccelerationStructureMoveObjectsInputNV.create(MemoryUtil.memGetAddress(struct + PMOVEOBJECTS));
    }

    public static void npClustersBottomLevel(long struct, VkClusterAccelerationStructureClustersBottomLevelInputNV value) {
        MemoryUtil.memPutAddress(struct + PCLUSTERSBOTTOMLEVEL, value.address());
    }

    public static void npTriangleClusters(long struct, VkClusterAccelerationStructureTriangleClusterInputNV value) {
        MemoryUtil.memPutAddress(struct + PTRIANGLECLUSTERS, value.address());
    }

    public static void npMoveObjects(long struct, VkClusterAccelerationStructureMoveObjectsInputNV value) {
        MemoryUtil.memPutAddress(struct + PMOVEOBJECTS, value.address());
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureOpInputNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureOpInputNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureOpInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureOpInputNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureOpInputNV.SIZEOF);
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
        public VkClusterAccelerationStructureOpInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *")
        public VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() {
            return VkClusterAccelerationStructureOpInputNV.npClustersBottomLevel(address());
        }

        @NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *")
        public VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() {
            return VkClusterAccelerationStructureOpInputNV.npTriangleClusters(address());
        }

        @NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *")
        public VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() {
            return VkClusterAccelerationStructureOpInputNV.npMoveObjects(address());
        }

        public Buffer pClustersBottomLevel(@NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *") VkClusterAccelerationStructureClustersBottomLevelInputNV value) {
            VkClusterAccelerationStructureOpInputNV.npClustersBottomLevel(address(), value);
            return this;
        }

        public Buffer pTriangleClusters(@NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *") VkClusterAccelerationStructureTriangleClusterInputNV value) {
            VkClusterAccelerationStructureOpInputNV.npTriangleClusters(address(), value);
            return this;
        }

        public Buffer pMoveObjects(@NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *") VkClusterAccelerationStructureMoveObjectsInputNV value) {
            VkClusterAccelerationStructureOpInputNV.npMoveObjects(address(), value);
            return this;
        }
    }
}
