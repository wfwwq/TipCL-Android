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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDataInfoEXT.class */
public class VkPushDataInfoEXT extends Struct<VkPushDataInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OFFSET;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkHostAddressRangeConstEXT.SIZEOF, VkHostAddressRangeConstEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VkPushDataInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPushDataInfoEXT create(long address, ByteBuffer container) {
        return new VkPushDataInfoEXT(address, container);
    }

    public VkPushDataInfoEXT(ByteBuffer container) {
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
    public int offset() {
        return noffset(address());
    }

    public VkHostAddressRangeConstEXT data() {
        return ndata(address());
    }

    public VkPushDataInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPushDataInfoEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT);
    }

    public VkPushDataInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPushDataInfoEXT pNext(VkPushConstantBankInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPushDataInfoEXT offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkPushDataInfoEXT data(VkHostAddressRangeConstEXT value) {
        ndata(address(), value);
        return this;
    }

    public VkPushDataInfoEXT data(Consumer<VkHostAddressRangeConstEXT> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkPushDataInfoEXT set(int sType, long pNext, int offset, VkHostAddressRangeConstEXT data) {
        sType(sType);
        pNext(pNext);
        offset(offset);
        data(data);
        return this;
    }

    public VkPushDataInfoEXT set(VkPushDataInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushDataInfoEXT malloc() {
        return new VkPushDataInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushDataInfoEXT calloc() {
        return new VkPushDataInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDataInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPushDataInfoEXT create(long address) {
        return new VkPushDataInfoEXT(address, null);
    }

    public static VkPushDataInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushDataInfoEXT(address, null);
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

    public static VkPushDataInfoEXT malloc(MemoryStack stack) {
        return new VkPushDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushDataInfoEXT calloc(MemoryStack stack) {
        return new VkPushDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static VkHostAddressRangeConstEXT ndata(long struct) {
        return VkHostAddressRangeConstEXT.create(struct + DATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void ndata(long struct, VkHostAddressRangeConstEXT value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkHostAddressRangeConstEXT.SIZEOF);
    }

    public static void validate(long struct) {
        VkHostAddressRangeConstEXT.validate(struct + DATA);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushDataInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPushDataInfoEXT, Buffer> implements NativeResource {
        private static final VkPushDataInfoEXT ELEMENT_FACTORY = VkPushDataInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPushDataInfoEXT.SIZEOF);
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
        public VkPushDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPushDataInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPushDataInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkPushDataInfoEXT.noffset(address());
        }

        public VkHostAddressRangeConstEXT data() {
            return VkPushDataInfoEXT.ndata(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushDataInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PUSH_DATA_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushDataInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPushConstantBankInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkPushDataInfoEXT.noffset(address(), value);
            return this;
        }

        public Buffer data(VkHostAddressRangeConstEXT value) {
            VkPushDataInfoEXT.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkHostAddressRangeConstEXT> consumer) {
            consumer.accept(data());
            return this;
        }
    }
}
