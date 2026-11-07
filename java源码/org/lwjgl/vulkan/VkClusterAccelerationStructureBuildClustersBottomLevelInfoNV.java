package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.class */
public class VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV extends Struct<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CLUSTERREFERENCESCOUNT;
    public static final int CLUSTERREFERENCESSTRIDE;
    public static final int CLUSTERREFERENCES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CLUSTERREFERENCESCOUNT = layout.offsetof(0);
        CLUSTERREFERENCESSTRIDE = layout.offsetof(1);
        CLUSTERREFERENCES = layout.offsetof(2);
    }

    protected VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(address, container);
    }

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int clusterReferencesCount() {
        return nclusterReferencesCount(address());
    }

    @NativeType("uint32_t")
    public int clusterReferencesStride() {
        return nclusterReferencesStride(address());
    }

    @NativeType("VkDeviceAddress")
    public long clusterReferences() {
        return nclusterReferences(address());
    }

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesCount(@NativeType("uint32_t") int value) {
        nclusterReferencesCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesStride(@NativeType("uint32_t") int value) {
        nclusterReferencesStride(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferences(@NativeType("VkDeviceAddress") long value) {
        nclusterReferences(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV set(int clusterReferencesCount, int clusterReferencesStride, long clusterReferences) {
        clusterReferencesCount(clusterReferencesCount);
        clusterReferencesStride(clusterReferencesStride);
        clusterReferences(clusterReferences);
        return this;
    }

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV set(VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV malloc() {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV calloc() {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV create(long address) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(address, null);
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(address, null);
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

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nclusterReferencesCount(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERREFERENCESCOUNT);
    }

    public static int nclusterReferencesStride(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERREFERENCESSTRIDE);
    }

    public static long nclusterReferences(long struct) {
        return MemoryUtil.memGetLong(struct + CLUSTERREFERENCES);
    }

    public static void nclusterReferencesCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERREFERENCESCOUNT, value);
    }

    public static void nclusterReferencesStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERREFERENCESSTRIDE, value);
    }

    public static void nclusterReferences(long struct, long value) {
        MemoryUtil.memPutLong(struct + CLUSTERREFERENCES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.SIZEOF);
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
        public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int clusterReferencesCount() {
            return VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesCount(address());
        }

        @NativeType("uint32_t")
        public int clusterReferencesStride() {
            return VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesStride(address());
        }

        @NativeType("VkDeviceAddress")
        public long clusterReferences() {
            return VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferences(address());
        }

        public Buffer clusterReferencesCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesCount(address(), value);
            return this;
        }

        public Buffer clusterReferencesStride(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesStride(address(), value);
            return this;
        }

        public Buffer clusterReferences(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferences(address(), value);
            return this;
        }
    }
}
