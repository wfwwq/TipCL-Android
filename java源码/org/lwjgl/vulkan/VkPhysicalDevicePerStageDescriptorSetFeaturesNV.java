package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerStageDescriptorSetFeaturesNV.class */
public class VkPhysicalDevicePerStageDescriptorSetFeaturesNV extends Struct<VkPhysicalDevicePerStageDescriptorSetFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PERSTAGEDESCRIPTORSET;
    public static final int DYNAMICPIPELINELAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERSTAGEDESCRIPTORSET = layout.offsetof(2);
        DYNAMICPIPELINELAYOUT = layout.offsetof(3);
    }

    protected VkPhysicalDevicePerStageDescriptorSetFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(address, container);
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(ByteBuffer container) {
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
    public boolean perStageDescriptorSet() {
        return nperStageDescriptorSet(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dynamicPipelineLayout() {
        return ndynamicPipelineLayout(address()) != 0;
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType$Default() {
        return sType(NVPerStageDescriptorSet.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV);
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSet(@NativeType("VkBool32") boolean value) {
        nperStageDescriptorSet(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayout(@NativeType("VkBool32") boolean value) {
        ndynamicPipelineLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV set(int sType, long pNext, boolean perStageDescriptorSet, boolean dynamicPipelineLayout) {
        sType(sType);
        pNext(pNext);
        perStageDescriptorSet(perStageDescriptorSet);
        dynamicPipelineLayout(dynamicPipelineLayout);
        return this;
    }

    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV set(VkPhysicalDevicePerStageDescriptorSetFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV malloc() {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV calloc() {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV create(long address) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(address, null);
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(address, null);
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

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nperStageDescriptorSet(long struct) {
        return MemoryUtil.memGetInt(struct + PERSTAGEDESCRIPTORSET);
    }

    public static int ndynamicPipelineLayout(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICPIPELINELAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nperStageDescriptorSet(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERSTAGEDESCRIPTORSET, value);
    }

    public static void ndynamicPipelineLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICPIPELINELAYOUT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePerStageDescriptorSetFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerStageDescriptorSetFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePerStageDescriptorSetFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePerStageDescriptorSetFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePerStageDescriptorSetFeaturesNV.SIZEOF);
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
        public VkPhysicalDevicePerStageDescriptorSetFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean perStageDescriptorSet() {
            return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nperStageDescriptorSet(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dynamicPipelineLayout() {
            return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.ndynamicPipelineLayout(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPerStageDescriptorSet.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PER_STAGE_DESCRIPTOR_SET_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePerStageDescriptorSetFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer perStageDescriptorSet(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePerStageDescriptorSetFeaturesNV.nperStageDescriptorSet(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dynamicPipelineLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePerStageDescriptorSetFeaturesNV.ndynamicPipelineLayout(address(), value ? 1 : 0);
            return this;
        }
    }
}
