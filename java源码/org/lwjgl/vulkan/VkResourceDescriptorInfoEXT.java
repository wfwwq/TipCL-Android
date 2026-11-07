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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkResourceDescriptorInfoEXT.class */
public class VkResourceDescriptorInfoEXT extends Struct<VkResourceDescriptorInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkResourceDescriptorDataEXT.SIZEOF, VkResourceDescriptorDataEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VkResourceDescriptorInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkResourceDescriptorInfoEXT create(long address, ByteBuffer container) {
        return new VkResourceDescriptorInfoEXT(address, container);
    }

    public VkResourceDescriptorInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDescriptorType")
    public int type() {
        return ntype(address());
    }

    public VkResourceDescriptorDataEXT data() {
        return ndata(address());
    }

    public VkResourceDescriptorInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkResourceDescriptorInfoEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT);
    }

    public VkResourceDescriptorInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkResourceDescriptorInfoEXT pNext(VkDebugUtilsObjectNameInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkResourceDescriptorInfoEXT type(@NativeType("VkDescriptorType") int value) {
        ntype(address(), value);
        return this;
    }

    public VkResourceDescriptorInfoEXT data(VkResourceDescriptorDataEXT value) {
        ndata(address(), value);
        return this;
    }

    public VkResourceDescriptorInfoEXT data(Consumer<VkResourceDescriptorDataEXT> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkResourceDescriptorInfoEXT set(int sType, long pNext, int type, VkResourceDescriptorDataEXT data) {
        sType(sType);
        pNext(pNext);
        type(type);
        data(data);
        return this;
    }

    public VkResourceDescriptorInfoEXT set(VkResourceDescriptorInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkResourceDescriptorInfoEXT malloc() {
        return new VkResourceDescriptorInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkResourceDescriptorInfoEXT calloc() {
        return new VkResourceDescriptorInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkResourceDescriptorInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkResourceDescriptorInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkResourceDescriptorInfoEXT create(long address) {
        return new VkResourceDescriptorInfoEXT(address, null);
    }

    public static VkResourceDescriptorInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkResourceDescriptorInfoEXT(address, null);
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

    public static VkResourceDescriptorInfoEXT malloc(MemoryStack stack) {
        return new VkResourceDescriptorInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkResourceDescriptorInfoEXT calloc(MemoryStack stack) {
        return new VkResourceDescriptorInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static VkResourceDescriptorDataEXT ndata(long struct) {
        return VkResourceDescriptorDataEXT.create(struct + DATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ndata(long struct, VkResourceDescriptorDataEXT value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkResourceDescriptorDataEXT.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkResourceDescriptorInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkResourceDescriptorInfoEXT, Buffer> implements NativeResource {
        private static final VkResourceDescriptorInfoEXT ELEMENT_FACTORY = VkResourceDescriptorInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkResourceDescriptorInfoEXT.SIZEOF);
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
        public VkResourceDescriptorInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkResourceDescriptorInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkResourceDescriptorInfoEXT.npNext(address());
        }

        @NativeType("VkDescriptorType")
        public int type() {
            return VkResourceDescriptorInfoEXT.ntype(address());
        }

        public VkResourceDescriptorDataEXT data() {
            return VkResourceDescriptorInfoEXT.ndata(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkResourceDescriptorInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_RESOURCE_DESCRIPTOR_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkResourceDescriptorInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDebugUtilsObjectNameInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer type(@NativeType("VkDescriptorType") int value) {
            VkResourceDescriptorInfoEXT.ntype(address(), value);
            return this;
        }

        public Buffer data(VkResourceDescriptorDataEXT value) {
            VkResourceDescriptorInfoEXT.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkResourceDescriptorDataEXT> consumer) {
            consumer.accept(data());
            return this;
        }
    }
}
