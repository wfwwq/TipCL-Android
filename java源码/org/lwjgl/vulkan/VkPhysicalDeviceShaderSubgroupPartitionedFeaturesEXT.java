package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.class */
public class VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT extends Struct<VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERSUBGROUPPARTITIONED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSUBGROUPPARTITIONED = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(ByteBuffer container) {
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
    public boolean shaderSubgroupPartitioned() {
        return nshaderSubgroupPartitioned(address()) != 0;
    }

    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT sType$Default() {
        return sType(EXTShaderSubgroupPartitioned.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_PARTITIONED_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT shaderSubgroupPartitioned(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupPartitioned(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT set(int sType, long pNext, boolean shaderSubgroupPartitioned) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupPartitioned(shaderSubgroupPartitioned);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT set(VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderSubgroupPartitioned(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPPARTITIONED);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderSubgroupPartitioned(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPPARTITIONED, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupPartitioned() {
            return VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.nshaderSubgroupPartitioned(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderSubgroupPartitioned.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_PARTITIONED_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderSubgroupPartitioned(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSubgroupPartitionedFeaturesEXT.nshaderSubgroupPartitioned(address(), value ? 1 : 0);
            return this;
        }
    }
}
