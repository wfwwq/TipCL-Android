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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.class */
public class VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI extends Struct<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CLUSTERCULLINGSHADER;
    public static final int MULTIVIEWCLUSTERCULLINGSHADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CLUSTERCULLINGSHADER = layout.offsetof(2);
        MULTIVIEWCLUSTERCULLINGSHADER = layout.offsetof(3);
    }

    protected VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(address, container);
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(ByteBuffer container) {
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
    public boolean clustercullingShader() {
        return nclustercullingShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multiviewClusterCullingShader() {
        return nmultiviewClusterCullingShader(address()) != 0;
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sType$Default() {
        return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI);
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI pNext(VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI clustercullingShader(@NativeType("VkBool32") boolean value) {
        nclustercullingShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI multiviewClusterCullingShader(@NativeType("VkBool32") boolean value) {
        nmultiviewClusterCullingShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI set(int sType, long pNext, boolean clustercullingShader, boolean multiviewClusterCullingShader) {
        sType(sType);
        pNext(pNext);
        clustercullingShader(clustercullingShader);
        multiviewClusterCullingShader(multiviewClusterCullingShader);
        return this;
    }

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI set(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI malloc() {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI calloc() {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI create(long address) {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(address, null);
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(address, null);
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

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nclustercullingShader(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERCULLINGSHADER);
    }

    public static int nmultiviewClusterCullingShader(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEWCLUSTERCULLINGSHADER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nclustercullingShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERCULLINGSHADER, value);
    }

    public static void nmultiviewClusterCullingShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEWCLUSTERCULLINGSHADER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.SIZEOF);
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
        public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean clustercullingShader() {
            return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nclustercullingShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multiviewClusterCullingShader() {
            return VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nmultiviewClusterCullingShader(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer clustercullingShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nclustercullingShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multiviewClusterCullingShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.nmultiviewClusterCullingShader(address(), value ? 1 : 0);
            return this;
        }
    }
}
