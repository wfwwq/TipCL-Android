package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkDescriptorSetAndBindingMappingEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderDescriptorSetAndBindingMappingInfoEXT.class */
public class VkShaderDescriptorSetAndBindingMappingInfoEXT extends Struct<VkShaderDescriptorSetAndBindingMappingInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAPPINGCOUNT;
    public static final int PMAPPINGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAPPINGCOUNT = layout.offsetof(2);
        PMAPPINGS = layout.offsetof(3);
    }

    protected VkShaderDescriptorSetAndBindingMappingInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkShaderDescriptorSetAndBindingMappingInfoEXT create(long address, ByteBuffer container) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(address, container);
    }

    public VkShaderDescriptorSetAndBindingMappingInfoEXT(ByteBuffer container) {
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
    public int mappingCount() {
        return nmappingCount(address());
    }

    @NativeType("VkDescriptorSetAndBindingMappingEXT const *")
    public VkDescriptorSetAndBindingMappingEXT.Buffer pMappings() {
        return npMappings(address());
    }

    public VkShaderDescriptorSetAndBindingMappingInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkShaderDescriptorSetAndBindingMappingInfoEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT);
    }

    public VkShaderDescriptorSetAndBindingMappingInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkShaderDescriptorSetAndBindingMappingInfoEXT pMappings(@NativeType("VkDescriptorSetAndBindingMappingEXT const *") VkDescriptorSetAndBindingMappingEXT.Buffer value) {
        npMappings(address(), value);
        return this;
    }

    public VkShaderDescriptorSetAndBindingMappingInfoEXT set(int sType, long pNext, VkDescriptorSetAndBindingMappingEXT.Buffer pMappings) {
        sType(sType);
        pNext(pNext);
        pMappings(pMappings);
        return this;
    }

    public VkShaderDescriptorSetAndBindingMappingInfoEXT set(VkShaderDescriptorSetAndBindingMappingInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkShaderDescriptorSetAndBindingMappingInfoEXT malloc() {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkShaderDescriptorSetAndBindingMappingInfoEXT calloc() {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkShaderDescriptorSetAndBindingMappingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkShaderDescriptorSetAndBindingMappingInfoEXT create(long address) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(address, null);
    }

    public static VkShaderDescriptorSetAndBindingMappingInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(address, null);
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

    public static VkShaderDescriptorSetAndBindingMappingInfoEXT malloc(MemoryStack stack) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkShaderDescriptorSetAndBindingMappingInfoEXT calloc(MemoryStack stack) {
        return new VkShaderDescriptorSetAndBindingMappingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmappingCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAPPINGCOUNT);
    }

    public static VkDescriptorSetAndBindingMappingEXT.Buffer npMappings(long struct) {
        return VkDescriptorSetAndBindingMappingEXT.createSafe(MemoryUtil.memGetAddress(struct + PMAPPINGS), nmappingCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmappingCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAPPINGCOUNT, value);
    }

    public static void npMappings(long struct, VkDescriptorSetAndBindingMappingEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PMAPPINGS, MemoryUtil.memAddressSafe(value));
        nmappingCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nmappingCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PMAPPINGS));
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderDescriptorSetAndBindingMappingInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkShaderDescriptorSetAndBindingMappingInfoEXT, Buffer> implements NativeResource {
        private static final VkShaderDescriptorSetAndBindingMappingInfoEXT ELEMENT_FACTORY = VkShaderDescriptorSetAndBindingMappingInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkShaderDescriptorSetAndBindingMappingInfoEXT.SIZEOF);
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
        public VkShaderDescriptorSetAndBindingMappingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkShaderDescriptorSetAndBindingMappingInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkShaderDescriptorSetAndBindingMappingInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int mappingCount() {
            return VkShaderDescriptorSetAndBindingMappingInfoEXT.nmappingCount(address());
        }

        @NativeType("VkDescriptorSetAndBindingMappingEXT const *")
        public VkDescriptorSetAndBindingMappingEXT.Buffer pMappings() {
            return VkShaderDescriptorSetAndBindingMappingInfoEXT.npMappings(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkShaderDescriptorSetAndBindingMappingInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SHADER_DESCRIPTOR_SET_AND_BINDING_MAPPING_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkShaderDescriptorSetAndBindingMappingInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pMappings(@NativeType("VkDescriptorSetAndBindingMappingEXT const *") VkDescriptorSetAndBindingMappingEXT.Buffer value) {
            VkShaderDescriptorSetAndBindingMappingInfoEXT.npMappings(address(), value);
            return this;
        }
    }
}
