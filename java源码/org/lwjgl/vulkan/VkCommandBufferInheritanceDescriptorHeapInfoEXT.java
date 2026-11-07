package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceDescriptorHeapInfoEXT.class */
public class VkCommandBufferInheritanceDescriptorHeapInfoEXT extends Struct<VkCommandBufferInheritanceDescriptorHeapInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSAMPLERHEAPBINDINFO;
    public static final int PRESOURCEHEAPBINDINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSAMPLERHEAPBINDINFO = layout.offsetof(2);
        PRESOURCEHEAPBINDINFO = layout.offsetof(3);
    }

    protected VkCommandBufferInheritanceDescriptorHeapInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferInheritanceDescriptorHeapInfoEXT create(long address, ByteBuffer container) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(address, container);
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT(ByteBuffer container) {
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

    @NativeType("VkBindHeapInfoEXT const *")
    public VkBindHeapInfoEXT pSamplerHeapBindInfo() {
        return npSamplerHeapBindInfo(address());
    }

    @NativeType("VkBindHeapInfoEXT const *")
    public VkBindHeapInfoEXT pResourceHeapBindInfo() {
        return npResourceHeapBindInfo(address());
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT);
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT pSamplerHeapBindInfo(@NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) {
        npSamplerHeapBindInfo(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT pResourceHeapBindInfo(@NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) {
        npResourceHeapBindInfo(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT set(int sType, long pNext, VkBindHeapInfoEXT pSamplerHeapBindInfo, VkBindHeapInfoEXT pResourceHeapBindInfo) {
        sType(sType);
        pNext(pNext);
        pSamplerHeapBindInfo(pSamplerHeapBindInfo);
        pResourceHeapBindInfo(pResourceHeapBindInfo);
        return this;
    }

    public VkCommandBufferInheritanceDescriptorHeapInfoEXT set(VkCommandBufferInheritanceDescriptorHeapInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT malloc() {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT calloc() {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT create(long address) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(address, null);
    }

    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(address, null);
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

    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceDescriptorHeapInfoEXT calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceDescriptorHeapInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkBindHeapInfoEXT npSamplerHeapBindInfo(long struct) {
        return VkBindHeapInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PSAMPLERHEAPBINDINFO));
    }

    public static VkBindHeapInfoEXT npResourceHeapBindInfo(long struct) {
        return VkBindHeapInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PRESOURCEHEAPBINDINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npSamplerHeapBindInfo(long struct, VkBindHeapInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PSAMPLERHEAPBINDINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void npResourceHeapBindInfo(long struct, VkBindHeapInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PRESOURCEHEAPBINDINFO, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceDescriptorHeapInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceDescriptorHeapInfoEXT, Buffer> implements NativeResource {
        private static final VkCommandBufferInheritanceDescriptorHeapInfoEXT ELEMENT_FACTORY = VkCommandBufferInheritanceDescriptorHeapInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferInheritanceDescriptorHeapInfoEXT.SIZEOF);
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
        public VkCommandBufferInheritanceDescriptorHeapInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferInheritanceDescriptorHeapInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferInheritanceDescriptorHeapInfoEXT.npNext(address());
        }

        @NativeType("VkBindHeapInfoEXT const *")
        public VkBindHeapInfoEXT pSamplerHeapBindInfo() {
            return VkCommandBufferInheritanceDescriptorHeapInfoEXT.npSamplerHeapBindInfo(address());
        }

        @NativeType("VkBindHeapInfoEXT const *")
        public VkBindHeapInfoEXT pResourceHeapBindInfo() {
            return VkCommandBufferInheritanceDescriptorHeapInfoEXT.npResourceHeapBindInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferInheritanceDescriptorHeapInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_DESCRIPTOR_HEAP_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferInheritanceDescriptorHeapInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pSamplerHeapBindInfo(@NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) {
            VkCommandBufferInheritanceDescriptorHeapInfoEXT.npSamplerHeapBindInfo(address(), value);
            return this;
        }

        public Buffer pResourceHeapBindInfo(@NativeType("VkBindHeapInfoEXT const *") VkBindHeapInfoEXT value) {
            VkCommandBufferInheritanceDescriptorHeapInfoEXT.npResourceHeapBindInfo(address(), value);
            return this;
        }
    }
}
