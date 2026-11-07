package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureClustersBottomLevelInputNV.class */
public class VkClusterAccelerationStructureClustersBottomLevelInputNV extends Struct<VkClusterAccelerationStructureClustersBottomLevelInputNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXTOTALCLUSTERCOUNT;
    public static final int MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXTOTALCLUSTERCOUNT = layout.offsetof(2);
        MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE = layout.offsetof(3);
    }

    protected VkClusterAccelerationStructureClustersBottomLevelInputNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureClustersBottomLevelInputNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(address, container);
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int maxTotalClusterCount() {
        return nmaxTotalClusterCount(address());
    }

    @NativeType("uint32_t")
    public int maxClusterCountPerAccelerationStructure() {
        return nmaxClusterCountPerAccelerationStructure(address());
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType$Default() {
        return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV);
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCount(@NativeType("uint32_t") int value) {
        nmaxTotalClusterCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructure(@NativeType("uint32_t") int value) {
        nmaxClusterCountPerAccelerationStructure(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV set(int sType, long pNext, int maxTotalClusterCount, int maxClusterCountPerAccelerationStructure) {
        sType(sType);
        pNext(pNext);
        maxTotalClusterCount(maxTotalClusterCount);
        maxClusterCountPerAccelerationStructure(maxClusterCountPerAccelerationStructure);
        return this;
    }

    public VkClusterAccelerationStructureClustersBottomLevelInputNV set(VkClusterAccelerationStructureClustersBottomLevelInputNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV malloc() {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV calloc() {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV create(long address) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(address, null);
    }

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(address, null);
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

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureClustersBottomLevelInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nmaxTotalClusterCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTOTALCLUSTERCOUNT);
    }

    public static int nmaxClusterCountPerAccelerationStructure(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxTotalClusterCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXTOTALCLUSTERCOUNT, value);
    }

    public static void nmaxClusterCountPerAccelerationStructure(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureClustersBottomLevelInputNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureClustersBottomLevelInputNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureClustersBottomLevelInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureClustersBottomLevelInputNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureClustersBottomLevelInputNV.SIZEOF);
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
        public VkClusterAccelerationStructureClustersBottomLevelInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkClusterAccelerationStructureClustersBottomLevelInputNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkClusterAccelerationStructureClustersBottomLevelInputNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxTotalClusterCount() {
            return VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxTotalClusterCount(address());
        }

        @NativeType("uint32_t")
        public int maxClusterCountPerAccelerationStructure() {
            return VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxClusterCountPerAccelerationStructure(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkClusterAccelerationStructureClustersBottomLevelInputNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkClusterAccelerationStructureClustersBottomLevelInputNV.npNext(address(), value);
            return this;
        }

        public Buffer maxTotalClusterCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxTotalClusterCount(address(), value);
            return this;
        }

        public Buffer maxClusterCountPerAccelerationStructure(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxClusterCountPerAccelerationStructure(address(), value);
            return this;
        }
    }
}
