package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetAndBindingMappingEXT.class */
public class VkDescriptorSetAndBindingMappingEXT extends Struct<VkDescriptorSetAndBindingMappingEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORSET;
    public static final int FIRSTBINDING;
    public static final int BINDINGCOUNT;
    public static final int RESOURCEMASK;
    public static final int SOURCE;
    public static final int SOURCEDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(VkDescriptorMappingSourceDataEXT.SIZEOF, VkDescriptorMappingSourceDataEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSET = layout.offsetof(2);
        FIRSTBINDING = layout.offsetof(3);
        BINDINGCOUNT = layout.offsetof(4);
        RESOURCEMASK = layout.offsetof(5);
        SOURCE = layout.offsetof(6);
        SOURCEDATA = layout.offsetof(7);
    }

    protected VkDescriptorSetAndBindingMappingEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetAndBindingMappingEXT create(long address, ByteBuffer container) {
        return new VkDescriptorSetAndBindingMappingEXT(address, container);
    }

    public VkDescriptorSetAndBindingMappingEXT(ByteBuffer container) {
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
    public int firstBinding() {
        return nfirstBinding(address());
    }

    @NativeType("uint32_t")
    public int bindingCount() {
        return nbindingCount(address());
    }

    @NativeType("VkSpirvResourceTypeFlagsEXT")
    public int resourceMask() {
        return nresourceMask(address());
    }

    @NativeType("VkDescriptorMappingSourceEXT")
    public int source() {
        return nsource(address());
    }

    public VkDescriptorMappingSourceDataEXT sourceData() {
        return nsourceData(address());
    }

    public VkDescriptorSetAndBindingMappingEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT);
    }

    public VkDescriptorSetAndBindingMappingEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT pNext(VkPushConstantBankInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetAndBindingMappingEXT descriptorSet(@NativeType("uint32_t") int value) {
        ndescriptorSet(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT firstBinding(@NativeType("uint32_t") int value) {
        nfirstBinding(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT bindingCount(@NativeType("uint32_t") int value) {
        nbindingCount(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT resourceMask(@NativeType("VkSpirvResourceTypeFlagsEXT") int value) {
        nresourceMask(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT source(@NativeType("VkDescriptorMappingSourceEXT") int value) {
        nsource(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT sourceData(VkDescriptorMappingSourceDataEXT value) {
        nsourceData(address(), value);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT sourceData(Consumer<VkDescriptorMappingSourceDataEXT> consumer) {
        consumer.accept(sourceData());
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT set(int sType, long pNext, int descriptorSet, int firstBinding, int bindingCount, int resourceMask, int source, VkDescriptorMappingSourceDataEXT sourceData) {
        sType(sType);
        pNext(pNext);
        descriptorSet(descriptorSet);
        firstBinding(firstBinding);
        bindingCount(bindingCount);
        resourceMask(resourceMask);
        source(source);
        sourceData(sourceData);
        return this;
    }

    public VkDescriptorSetAndBindingMappingEXT set(VkDescriptorSetAndBindingMappingEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetAndBindingMappingEXT malloc() {
        return new VkDescriptorSetAndBindingMappingEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetAndBindingMappingEXT calloc() {
        return new VkDescriptorSetAndBindingMappingEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetAndBindingMappingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetAndBindingMappingEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetAndBindingMappingEXT create(long address) {
        return new VkDescriptorSetAndBindingMappingEXT(address, null);
    }

    public static VkDescriptorSetAndBindingMappingEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetAndBindingMappingEXT(address, null);
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

    public static VkDescriptorSetAndBindingMappingEXT malloc(MemoryStack stack) {
        return new VkDescriptorSetAndBindingMappingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetAndBindingMappingEXT calloc(MemoryStack stack) {
        return new VkDescriptorSetAndBindingMappingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfirstBinding(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTBINDING);
    }

    public static int nbindingCount(long struct) {
        return MemoryUtil.memGetInt(struct + BINDINGCOUNT);
    }

    public static int nresourceMask(long struct) {
        return MemoryUtil.memGetInt(struct + RESOURCEMASK);
    }

    public static int nsource(long struct) {
        return MemoryUtil.memGetInt(struct + SOURCE);
    }

    public static VkDescriptorMappingSourceDataEXT nsourceData(long struct) {
        return VkDescriptorMappingSourceDataEXT.create(struct + SOURCEDATA);
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

    public static void nfirstBinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTBINDING, value);
    }

    public static void nbindingCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDINGCOUNT, value);
    }

    public static void nresourceMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOURCEMASK, value);
    }

    public static void nsource(long struct, int value) {
        MemoryUtil.memPutInt(struct + SOURCE, value);
    }

    public static void nsourceData(long struct, VkDescriptorMappingSourceDataEXT value) {
        MemoryUtil.memCopy(value.address(), struct + SOURCEDATA, VkDescriptorMappingSourceDataEXT.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetAndBindingMappingEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetAndBindingMappingEXT, Buffer> implements NativeResource {
        private static final VkDescriptorSetAndBindingMappingEXT ELEMENT_FACTORY = VkDescriptorSetAndBindingMappingEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetAndBindingMappingEXT.SIZEOF);
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
        public VkDescriptorSetAndBindingMappingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetAndBindingMappingEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorSetAndBindingMappingEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int descriptorSet() {
            return VkDescriptorSetAndBindingMappingEXT.ndescriptorSet(address());
        }

        @NativeType("uint32_t")
        public int firstBinding() {
            return VkDescriptorSetAndBindingMappingEXT.nfirstBinding(address());
        }

        @NativeType("uint32_t")
        public int bindingCount() {
            return VkDescriptorSetAndBindingMappingEXT.nbindingCount(address());
        }

        @NativeType("VkSpirvResourceTypeFlagsEXT")
        public int resourceMask() {
            return VkDescriptorSetAndBindingMappingEXT.nresourceMask(address());
        }

        @NativeType("VkDescriptorMappingSourceEXT")
        public int source() {
            return VkDescriptorSetAndBindingMappingEXT.nsource(address());
        }

        public VkDescriptorMappingSourceDataEXT sourceData() {
            return VkDescriptorSetAndBindingMappingEXT.nsourceData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetAndBindingMappingEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_AND_BINDING_MAPPING_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetAndBindingMappingEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPushConstantBankInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer descriptorSet(@NativeType("uint32_t") int value) {
            VkDescriptorSetAndBindingMappingEXT.ndescriptorSet(address(), value);
            return this;
        }

        public Buffer firstBinding(@NativeType("uint32_t") int value) {
            VkDescriptorSetAndBindingMappingEXT.nfirstBinding(address(), value);
            return this;
        }

        public Buffer bindingCount(@NativeType("uint32_t") int value) {
            VkDescriptorSetAndBindingMappingEXT.nbindingCount(address(), value);
            return this;
        }

        public Buffer resourceMask(@NativeType("VkSpirvResourceTypeFlagsEXT") int value) {
            VkDescriptorSetAndBindingMappingEXT.nresourceMask(address(), value);
            return this;
        }

        public Buffer source(@NativeType("VkDescriptorMappingSourceEXT") int value) {
            VkDescriptorSetAndBindingMappingEXT.nsource(address(), value);
            return this;
        }

        public Buffer sourceData(VkDescriptorMappingSourceDataEXT value) {
            VkDescriptorSetAndBindingMappingEXT.nsourceData(address(), value);
            return this;
        }

        public Buffer sourceData(Consumer<VkDescriptorMappingSourceDataEXT> consumer) {
            consumer.accept(sourceData());
            return this;
        }
    }
}
