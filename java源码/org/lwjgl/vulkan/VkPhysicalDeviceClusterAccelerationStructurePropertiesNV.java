package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.class */
public class VkPhysicalDeviceClusterAccelerationStructurePropertiesNV extends Struct<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXVERTICESPERCLUSTER;
    public static final int MAXTRIANGLESPERCLUSTER;
    public static final int CLUSTERSCRATCHBYTEALIGNMENT;
    public static final int CLUSTERBYTEALIGNMENT;
    public static final int CLUSTERTEMPLATEBYTEALIGNMENT;
    public static final int CLUSTERBOTTOMLEVELBYTEALIGNMENT;
    public static final int CLUSTERTEMPLATEBOUNDSBYTEALIGNMENT;
    public static final int MAXCLUSTERGEOMETRYINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXVERTICESPERCLUSTER = layout.offsetof(2);
        MAXTRIANGLESPERCLUSTER = layout.offsetof(3);
        CLUSTERSCRATCHBYTEALIGNMENT = layout.offsetof(4);
        CLUSTERBYTEALIGNMENT = layout.offsetof(5);
        CLUSTERTEMPLATEBYTEALIGNMENT = layout.offsetof(6);
        CLUSTERBOTTOMLEVELBYTEALIGNMENT = layout.offsetof(7);
        CLUSTERTEMPLATEBOUNDSBYTEALIGNMENT = layout.offsetof(8);
        MAXCLUSTERGEOMETRYINDEX = layout.offsetof(9);
    }

    protected VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(address, container);
    }

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(ByteBuffer container) {
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
    public int maxVerticesPerCluster() {
        return nmaxVerticesPerCluster(address());
    }

    @NativeType("uint32_t")
    public int maxTrianglesPerCluster() {
        return nmaxTrianglesPerCluster(address());
    }

    @NativeType("uint32_t")
    public int clusterScratchByteAlignment() {
        return nclusterScratchByteAlignment(address());
    }

    @NativeType("uint32_t")
    public int clusterByteAlignment() {
        return nclusterByteAlignment(address());
    }

    @NativeType("uint32_t")
    public int clusterTemplateByteAlignment() {
        return nclusterTemplateByteAlignment(address());
    }

    @NativeType("uint32_t")
    public int clusterBottomLevelByteAlignment() {
        return nclusterBottomLevelByteAlignment(address());
    }

    @NativeType("uint32_t")
    public int clusterTemplateBoundsByteAlignment() {
        return nclusterTemplateBoundsByteAlignment(address());
    }

    @NativeType("uint32_t")
    public int maxClusterGeometryIndex() {
        return nmaxClusterGeometryIndex(address());
    }

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sType$Default() {
        return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV);
    }

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV set(VkPhysicalDeviceClusterAccelerationStructurePropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV malloc() {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV calloc() {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV create(long address) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(address, null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(address, null);
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

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxVerticesPerCluster(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTICESPERCLUSTER);
    }

    public static int nmaxTrianglesPerCluster(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTRIANGLESPERCLUSTER);
    }

    public static int nclusterScratchByteAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERSCRATCHBYTEALIGNMENT);
    }

    public static int nclusterByteAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERBYTEALIGNMENT);
    }

    public static int nclusterTemplateByteAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERTEMPLATEBYTEALIGNMENT);
    }

    public static int nclusterBottomLevelByteAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERBOTTOMLEVELBYTEALIGNMENT);
    }

    public static int nclusterTemplateBoundsByteAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERTEMPLATEBOUNDSBYTEALIGNMENT);
    }

    public static int nmaxClusterGeometryIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCLUSTERGEOMETRYINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterAccelerationStructurePropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxVerticesPerCluster() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nmaxVerticesPerCluster(address());
        }

        @NativeType("uint32_t")
        public int maxTrianglesPerCluster() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nmaxTrianglesPerCluster(address());
        }

        @NativeType("uint32_t")
        public int clusterScratchByteAlignment() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterScratchByteAlignment(address());
        }

        @NativeType("uint32_t")
        public int clusterByteAlignment() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterByteAlignment(address());
        }

        @NativeType("uint32_t")
        public int clusterTemplateByteAlignment() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterTemplateByteAlignment(address());
        }

        @NativeType("uint32_t")
        public int clusterBottomLevelByteAlignment() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterBottomLevelByteAlignment(address());
        }

        @NativeType("uint32_t")
        public int clusterTemplateBoundsByteAlignment() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nclusterTemplateBoundsByteAlignment(address());
        }

        @NativeType("uint32_t")
        public int maxClusterGeometryIndex() {
            return VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nmaxClusterGeometryIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
