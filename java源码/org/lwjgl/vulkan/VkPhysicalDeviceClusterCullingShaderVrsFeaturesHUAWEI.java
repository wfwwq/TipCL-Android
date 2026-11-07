package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.class */
public class VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI extends Struct<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CLUSTERSHADINGRATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CLUSTERSHADINGRATE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(address, container);
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean clusterShadingRate() {
        return nclusterShadingRate(address()) != 0;
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sType$Default() {
        return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI);
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI clusterShadingRate(@NativeType("VkBool32") boolean value) {
        nclusterShadingRate(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI set(int sType, long pNext, boolean clusterShadingRate) {
        sType(sType);
        pNext(pNext);
        clusterShadingRate(clusterShadingRate);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI set(VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI malloc() {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI calloc() {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI create(long address) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(address, null);
    }

    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(address, null);
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

    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nclusterShadingRate(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERSHADINGRATE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nclusterShadingRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERSHADINGRATE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.SIZEOF);
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
        public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean clusterShadingRate() {
            return VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nclusterShadingRate(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_VRS_FEATURES_HUAWEI);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.npNext(address(), value);
            return this;
        }

        public Buffer clusterShadingRate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI.nclusterShadingRate(address(), value ? 1 : 0);
            return this;
        }
    }
}
