package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCustomBorderColorIndexCreateInfoEXT.class */
public class VkSamplerCustomBorderColorIndexCreateInfoEXT extends Struct<VkSamplerCustomBorderColorIndexCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEX = layout.offsetof(2);
    }

    protected VkSamplerCustomBorderColorIndexCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerCustomBorderColorIndexCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(address, container);
    }

    public VkSamplerCustomBorderColorIndexCreateInfoEXT(ByteBuffer container) {
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
    public int index() {
        return nindex(address());
    }

    public VkSamplerCustomBorderColorIndexCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerCustomBorderColorIndexCreateInfoEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT);
    }

    public VkSamplerCustomBorderColorIndexCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerCustomBorderColorIndexCreateInfoEXT index(@NativeType("uint32_t") int value) {
        nindex(address(), value);
        return this;
    }

    public VkSamplerCustomBorderColorIndexCreateInfoEXT set(int sType, long pNext, int index) {
        sType(sType);
        pNext(pNext);
        index(index);
        return this;
    }

    public VkSamplerCustomBorderColorIndexCreateInfoEXT set(VkSamplerCustomBorderColorIndexCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerCustomBorderColorIndexCreateInfoEXT malloc() {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerCustomBorderColorIndexCreateInfoEXT calloc() {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerCustomBorderColorIndexCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerCustomBorderColorIndexCreateInfoEXT create(long address) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(address, null);
    }

    public static VkSamplerCustomBorderColorIndexCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(address, null);
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

    public static VkSamplerCustomBorderColorIndexCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerCustomBorderColorIndexCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerCustomBorderColorIndexCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nindex(long struct) {
        return MemoryUtil.memGetInt(struct + INDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nindex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCustomBorderColorIndexCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerCustomBorderColorIndexCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkSamplerCustomBorderColorIndexCreateInfoEXT ELEMENT_FACTORY = VkSamplerCustomBorderColorIndexCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerCustomBorderColorIndexCreateInfoEXT.SIZEOF);
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
        public VkSamplerCustomBorderColorIndexCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerCustomBorderColorIndexCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerCustomBorderColorIndexCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int index() {
            return VkSamplerCustomBorderColorIndexCreateInfoEXT.nindex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerCustomBorderColorIndexCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_INDEX_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerCustomBorderColorIndexCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer index(@NativeType("uint32_t") int value) {
            VkSamplerCustomBorderColorIndexCreateInfoEXT.nindex(address(), value);
            return this;
        }
    }
}
