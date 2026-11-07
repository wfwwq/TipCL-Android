package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDescriptorBufferEmbeddedSamplersInfoEXT.class */
public class VkBindDescriptorBufferEmbeddedSamplersInfoEXT extends Struct<VkBindDescriptorBufferEmbeddedSamplersInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STAGEFLAGS;
    public static final int LAYOUT;
    public static final int SET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        SET = layout.offsetof(4);
    }

    protected VkBindDescriptorBufferEmbeddedSamplersInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT create(long address, ByteBuffer container) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(address, container);
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT(ByteBuffer container) {
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

    @NativeType("VkShaderStageFlags")
    public int stageFlags() {
        return nstageFlags(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("uint32_t")
    public int set() {
        return nset(address());
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sType$Default() {
        return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT);
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNext(VkPipelineLayoutCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(@NativeType("uint32_t") int value) {
        nset(address(), value);
        return this;
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(int sType, long pNext, int stageFlags, long layout, int set) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        set(set);
        return this;
    }

    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(VkBindDescriptorBufferEmbeddedSamplersInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT malloc() {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT calloc() {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT create(long address) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(address, null);
    }

    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(address, null);
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

    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT malloc(MemoryStack stack) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT calloc(MemoryStack stack) {
        return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STAGEFLAGS);
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static int nset(long struct) {
        return MemoryUtil.memGetInt(struct + SET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstageFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGEFLAGS, value);
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDescriptorBufferEmbeddedSamplersInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindDescriptorBufferEmbeddedSamplersInfoEXT, Buffer> implements NativeResource {
        private static final VkBindDescriptorBufferEmbeddedSamplersInfoEXT ELEMENT_FACTORY = VkBindDescriptorBufferEmbeddedSamplersInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindDescriptorBufferEmbeddedSamplersInfoEXT.SIZEOF);
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
        public VkBindDescriptorBufferEmbeddedSamplersInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.npNext(address());
        }

        @NativeType("VkShaderStageFlags")
        public int stageFlags() {
            return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nstageFlags(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nlayout(address());
        }

        @NativeType("uint32_t")
        public int set() {
            return VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindDescriptorBufferEmbeddedSamplersInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineLayoutCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nstageFlags(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nlayout(address(), value);
            return this;
        }

        public Buffer set(@NativeType("uint32_t") int value) {
            VkBindDescriptorBufferEmbeddedSamplersInfoEXT.nset(address(), value);
            return this;
        }
    }
}
