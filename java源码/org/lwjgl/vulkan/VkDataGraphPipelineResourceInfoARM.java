package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineResourceInfoARM.class */
public class VkDataGraphPipelineResourceInfoARM extends Struct<VkDataGraphPipelineResourceInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORSET;
    public static final int BINDING;
    public static final int ARRAYELEMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSET = layout.offsetof(2);
        BINDING = layout.offsetof(3);
        ARRAYELEMENT = layout.offsetof(4);
    }

    protected VkDataGraphPipelineResourceInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineResourceInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineResourceInfoARM(address, container);
    }

    public VkDataGraphPipelineResourceInfoARM(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int descriptorSet() {
        return ndescriptorSet(address());
    }

    @NativeType("uint32_t")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("uint32_t")
    public int arrayElement() {
        return narrayElement(address());
    }

    public VkDataGraphPipelineResourceInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineResourceInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM);
    }

    public VkDataGraphPipelineResourceInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineResourceInfoARM pNext(VkTensorDescriptionARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineResourceInfoARM descriptorSet(@NativeType("uint32_t") int value) {
        ndescriptorSet(address(), value);
        return this;
    }

    public VkDataGraphPipelineResourceInfoARM binding(@NativeType("uint32_t") int value) {
        nbinding(address(), value);
        return this;
    }

    public VkDataGraphPipelineResourceInfoARM arrayElement(@NativeType("uint32_t") int value) {
        narrayElement(address(), value);
        return this;
    }

    public VkDataGraphPipelineResourceInfoARM set(int sType, long pNext, int descriptorSet, int binding, int arrayElement) {
        sType(sType);
        pNext(pNext);
        descriptorSet(descriptorSet);
        binding(binding);
        arrayElement(arrayElement);
        return this;
    }

    public VkDataGraphPipelineResourceInfoARM set(VkDataGraphPipelineResourceInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineResourceInfoARM malloc() {
        return new VkDataGraphPipelineResourceInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineResourceInfoARM calloc() {
        return new VkDataGraphPipelineResourceInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineResourceInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineResourceInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineResourceInfoARM create(long address) {
        return new VkDataGraphPipelineResourceInfoARM(address, null);
    }

    public static VkDataGraphPipelineResourceInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineResourceInfoARM(address, null);
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

    public static VkDataGraphPipelineResourceInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineResourceInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineResourceInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineResourceInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndescriptorSet(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORSET);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static int narrayElement(long struct) {
        return MemoryUtil.memGetInt(struct + ARRAYELEMENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorSet(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORSET, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void narrayElement(long struct, int value) {
        MemoryUtil.memPutInt(struct + ARRAYELEMENT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineResourceInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineResourceInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineResourceInfoARM ELEMENT_FACTORY = VkDataGraphPipelineResourceInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineResourceInfoARM.SIZEOF);
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
        public VkDataGraphPipelineResourceInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineResourceInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineResourceInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int descriptorSet() {
            return VkDataGraphPipelineResourceInfoARM.ndescriptorSet(address());
        }

        @NativeType("uint32_t")
        public int binding() {
            return VkDataGraphPipelineResourceInfoARM.nbinding(address());
        }

        @NativeType("uint32_t")
        public int arrayElement() {
            return VkDataGraphPipelineResourceInfoARM.narrayElement(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineResourceInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_RESOURCE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineResourceInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkTensorDescriptionARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer descriptorSet(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineResourceInfoARM.ndescriptorSet(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineResourceInfoARM.nbinding(address(), value);
            return this;
        }

        public Buffer arrayElement(@NativeType("uint32_t") int value) {
            VkDataGraphPipelineResourceInfoARM.narrayElement(address(), value);
            return this;
        }
    }
}
