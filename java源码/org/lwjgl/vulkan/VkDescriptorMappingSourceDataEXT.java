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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceDataEXT.class */
public class VkDescriptorMappingSourceDataEXT extends Struct<VkDescriptorMappingSourceDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CONSTANTOFFSET;
    public static final int PUSHINDEX;
    public static final int INDIRECTINDEX;
    public static final int INDIRECTINDEXARRAY;
    public static final int HEAPDATA;
    public static final int PUSHDATAOFFSET;
    public static final int PUSHADDRESSOFFSET;
    public static final int INDIRECTADDRESS;
    public static final int SHADERRECORDINDEX;
    public static final int SHADERRECORDDATAOFFSET;
    public static final int SHADERRECORDADDRESSOFFSET;

    static {
        Struct.Layout layout = __union(__member(VkDescriptorMappingSourceConstantOffsetEXT.SIZEOF, VkDescriptorMappingSourceConstantOffsetEXT.ALIGNOF), __member(VkDescriptorMappingSourcePushIndexEXT.SIZEOF, VkDescriptorMappingSourcePushIndexEXT.ALIGNOF), __member(VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF, VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF), __member(VkDescriptorMappingSourceIndirectIndexArrayEXT.SIZEOF, VkDescriptorMappingSourceIndirectIndexArrayEXT.ALIGNOF), __member(VkDescriptorMappingSourceHeapDataEXT.SIZEOF, VkDescriptorMappingSourceHeapDataEXT.ALIGNOF), __member(4), __member(4), __member(VkDescriptorMappingSourceIndirectAddressEXT.SIZEOF, VkDescriptorMappingSourceIndirectAddressEXT.ALIGNOF), __member(VkDescriptorMappingSourceShaderRecordIndexEXT.SIZEOF, VkDescriptorMappingSourceShaderRecordIndexEXT.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CONSTANTOFFSET = layout.offsetof(0);
        PUSHINDEX = layout.offsetof(1);
        INDIRECTINDEX = layout.offsetof(2);
        INDIRECTINDEXARRAY = layout.offsetof(3);
        HEAPDATA = layout.offsetof(4);
        PUSHDATAOFFSET = layout.offsetof(5);
        PUSHADDRESSOFFSET = layout.offsetof(6);
        INDIRECTADDRESS = layout.offsetof(7);
        SHADERRECORDINDEX = layout.offsetof(8);
        SHADERRECORDDATAOFFSET = layout.offsetof(9);
        SHADERRECORDADDRESSOFFSET = layout.offsetof(10);
    }

    protected VkDescriptorMappingSourceDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorMappingSourceDataEXT create(long address, ByteBuffer container) {
        return new VkDescriptorMappingSourceDataEXT(address, container);
    }

    public VkDescriptorMappingSourceDataEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkDescriptorMappingSourceConstantOffsetEXT constantOffset() {
        return nconstantOffset(address());
    }

    public VkDescriptorMappingSourcePushIndexEXT pushIndex() {
        return npushIndex(address());
    }

    public VkDescriptorMappingSourceIndirectIndexEXT indirectIndex() {
        return nindirectIndex(address());
    }

    public VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray() {
        return nindirectIndexArray(address());
    }

    public VkDescriptorMappingSourceHeapDataEXT heapData() {
        return nheapData(address());
    }

    @NativeType("uint32_t")
    public int pushDataOffset() {
        return npushDataOffset(address());
    }

    @NativeType("uint32_t")
    public int pushAddressOffset() {
        return npushAddressOffset(address());
    }

    public VkDescriptorMappingSourceIndirectAddressEXT indirectAddress() {
        return nindirectAddress(address());
    }

    public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex() {
        return nshaderRecordIndex(address());
    }

    @NativeType("uint32_t")
    public int shaderRecordDataOffset() {
        return nshaderRecordDataOffset(address());
    }

    @NativeType("uint32_t")
    public int shaderRecordAddressOffset() {
        return nshaderRecordAddressOffset(address());
    }

    public VkDescriptorMappingSourceDataEXT constantOffset(VkDescriptorMappingSourceConstantOffsetEXT value) {
        nconstantOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT constantOffset(Consumer<VkDescriptorMappingSourceConstantOffsetEXT> consumer) {
        consumer.accept(constantOffset());
        return this;
    }

    public VkDescriptorMappingSourceDataEXT pushIndex(VkDescriptorMappingSourcePushIndexEXT value) {
        npushIndex(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT pushIndex(Consumer<VkDescriptorMappingSourcePushIndexEXT> consumer) {
        consumer.accept(pushIndex());
        return this;
    }

    public VkDescriptorMappingSourceDataEXT indirectIndex(VkDescriptorMappingSourceIndirectIndexEXT value) {
        nindirectIndex(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT indirectIndex(Consumer<VkDescriptorMappingSourceIndirectIndexEXT> consumer) {
        consumer.accept(indirectIndex());
        return this;
    }

    public VkDescriptorMappingSourceDataEXT indirectIndexArray(VkDescriptorMappingSourceIndirectIndexArrayEXT value) {
        nindirectIndexArray(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT indirectIndexArray(Consumer<VkDescriptorMappingSourceIndirectIndexArrayEXT> consumer) {
        consumer.accept(indirectIndexArray());
        return this;
    }

    public VkDescriptorMappingSourceDataEXT heapData(VkDescriptorMappingSourceHeapDataEXT value) {
        nheapData(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT heapData(Consumer<VkDescriptorMappingSourceHeapDataEXT> consumer) {
        consumer.accept(heapData());
        return this;
    }

    public VkDescriptorMappingSourceDataEXT pushDataOffset(@NativeType("uint32_t") int value) {
        npushDataOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT pushAddressOffset(@NativeType("uint32_t") int value) {
        npushAddressOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT indirectAddress(VkDescriptorMappingSourceIndirectAddressEXT value) {
        nindirectAddress(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT indirectAddress(Consumer<VkDescriptorMappingSourceIndirectAddressEXT> consumer) {
        consumer.accept(indirectAddress());
        return this;
    }

    public VkDescriptorMappingSourceDataEXT shaderRecordIndex(VkDescriptorMappingSourceShaderRecordIndexEXT value) {
        nshaderRecordIndex(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT shaderRecordIndex(Consumer<VkDescriptorMappingSourceShaderRecordIndexEXT> consumer) {
        consumer.accept(shaderRecordIndex());
        return this;
    }

    public VkDescriptorMappingSourceDataEXT shaderRecordDataOffset(@NativeType("uint32_t") int value) {
        nshaderRecordDataOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT shaderRecordAddressOffset(@NativeType("uint32_t") int value) {
        nshaderRecordAddressOffset(address(), value);
        return this;
    }

    public VkDescriptorMappingSourceDataEXT set(VkDescriptorMappingSourceDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorMappingSourceDataEXT malloc() {
        return new VkDescriptorMappingSourceDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorMappingSourceDataEXT calloc() {
        return new VkDescriptorMappingSourceDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorMappingSourceDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorMappingSourceDataEXT create(long address) {
        return new VkDescriptorMappingSourceDataEXT(address, null);
    }

    public static VkDescriptorMappingSourceDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorMappingSourceDataEXT(address, null);
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

    public static VkDescriptorMappingSourceDataEXT malloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorMappingSourceDataEXT calloc(MemoryStack stack) {
        return new VkDescriptorMappingSourceDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkDescriptorMappingSourceConstantOffsetEXT nconstantOffset(long struct) {
        return VkDescriptorMappingSourceConstantOffsetEXT.create(struct + CONSTANTOFFSET);
    }

    public static VkDescriptorMappingSourcePushIndexEXT npushIndex(long struct) {
        return VkDescriptorMappingSourcePushIndexEXT.create(struct + PUSHINDEX);
    }

    public static VkDescriptorMappingSourceIndirectIndexEXT nindirectIndex(long struct) {
        return VkDescriptorMappingSourceIndirectIndexEXT.create(struct + INDIRECTINDEX);
    }

    public static VkDescriptorMappingSourceIndirectIndexArrayEXT nindirectIndexArray(long struct) {
        return VkDescriptorMappingSourceIndirectIndexArrayEXT.create(struct + INDIRECTINDEXARRAY);
    }

    public static VkDescriptorMappingSourceHeapDataEXT nheapData(long struct) {
        return VkDescriptorMappingSourceHeapDataEXT.create(struct + HEAPDATA);
    }

    public static int npushDataOffset(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHDATAOFFSET);
    }

    public static int npushAddressOffset(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHADDRESSOFFSET);
    }

    public static VkDescriptorMappingSourceIndirectAddressEXT nindirectAddress(long struct) {
        return VkDescriptorMappingSourceIndirectAddressEXT.create(struct + INDIRECTADDRESS);
    }

    public static VkDescriptorMappingSourceShaderRecordIndexEXT nshaderRecordIndex(long struct) {
        return VkDescriptorMappingSourceShaderRecordIndexEXT.create(struct + SHADERRECORDINDEX);
    }

    public static int nshaderRecordDataOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERRECORDDATAOFFSET);
    }

    public static int nshaderRecordAddressOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERRECORDADDRESSOFFSET);
    }

    public static void nconstantOffset(long struct, VkDescriptorMappingSourceConstantOffsetEXT value) {
        MemoryUtil.memCopy(value.address(), struct + CONSTANTOFFSET, VkDescriptorMappingSourceConstantOffsetEXT.SIZEOF);
    }

    public static void npushIndex(long struct, VkDescriptorMappingSourcePushIndexEXT value) {
        MemoryUtil.memCopy(value.address(), struct + PUSHINDEX, VkDescriptorMappingSourcePushIndexEXT.SIZEOF);
    }

    public static void nindirectIndex(long struct, VkDescriptorMappingSourceIndirectIndexEXT value) {
        MemoryUtil.memCopy(value.address(), struct + INDIRECTINDEX, VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF);
    }

    public static void nindirectIndexArray(long struct, VkDescriptorMappingSourceIndirectIndexArrayEXT value) {
        MemoryUtil.memCopy(value.address(), struct + INDIRECTINDEXARRAY, VkDescriptorMappingSourceIndirectIndexArrayEXT.SIZEOF);
    }

    public static void nheapData(long struct, VkDescriptorMappingSourceHeapDataEXT value) {
        MemoryUtil.memCopy(value.address(), struct + HEAPDATA, VkDescriptorMappingSourceHeapDataEXT.SIZEOF);
    }

    public static void npushDataOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHDATAOFFSET, value);
    }

    public static void npushAddressOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHADDRESSOFFSET, value);
    }

    public static void nindirectAddress(long struct, VkDescriptorMappingSourceIndirectAddressEXT value) {
        MemoryUtil.memCopy(value.address(), struct + INDIRECTADDRESS, VkDescriptorMappingSourceIndirectAddressEXT.SIZEOF);
    }

    public static void nshaderRecordIndex(long struct, VkDescriptorMappingSourceShaderRecordIndexEXT value) {
        MemoryUtil.memCopy(value.address(), struct + SHADERRECORDINDEX, VkDescriptorMappingSourceShaderRecordIndexEXT.SIZEOF);
    }

    public static void nshaderRecordDataOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERRECORDDATAOFFSET, value);
    }

    public static void nshaderRecordAddressOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERRECORDADDRESSOFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorMappingSourceDataEXT, Buffer> implements NativeResource {
        private static final VkDescriptorMappingSourceDataEXT ELEMENT_FACTORY = VkDescriptorMappingSourceDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorMappingSourceDataEXT.SIZEOF);
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
        public VkDescriptorMappingSourceDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkDescriptorMappingSourceConstantOffsetEXT constantOffset() {
            return VkDescriptorMappingSourceDataEXT.nconstantOffset(address());
        }

        public VkDescriptorMappingSourcePushIndexEXT pushIndex() {
            return VkDescriptorMappingSourceDataEXT.npushIndex(address());
        }

        public VkDescriptorMappingSourceIndirectIndexEXT indirectIndex() {
            return VkDescriptorMappingSourceDataEXT.nindirectIndex(address());
        }

        public VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray() {
            return VkDescriptorMappingSourceDataEXT.nindirectIndexArray(address());
        }

        public VkDescriptorMappingSourceHeapDataEXT heapData() {
            return VkDescriptorMappingSourceDataEXT.nheapData(address());
        }

        @NativeType("uint32_t")
        public int pushDataOffset() {
            return VkDescriptorMappingSourceDataEXT.npushDataOffset(address());
        }

        @NativeType("uint32_t")
        public int pushAddressOffset() {
            return VkDescriptorMappingSourceDataEXT.npushAddressOffset(address());
        }

        public VkDescriptorMappingSourceIndirectAddressEXT indirectAddress() {
            return VkDescriptorMappingSourceDataEXT.nindirectAddress(address());
        }

        public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex() {
            return VkDescriptorMappingSourceDataEXT.nshaderRecordIndex(address());
        }

        @NativeType("uint32_t")
        public int shaderRecordDataOffset() {
            return VkDescriptorMappingSourceDataEXT.nshaderRecordDataOffset(address());
        }

        @NativeType("uint32_t")
        public int shaderRecordAddressOffset() {
            return VkDescriptorMappingSourceDataEXT.nshaderRecordAddressOffset(address());
        }

        public Buffer constantOffset(VkDescriptorMappingSourceConstantOffsetEXT value) {
            VkDescriptorMappingSourceDataEXT.nconstantOffset(address(), value);
            return this;
        }

        public Buffer constantOffset(Consumer<VkDescriptorMappingSourceConstantOffsetEXT> consumer) {
            consumer.accept(constantOffset());
            return this;
        }

        public Buffer pushIndex(VkDescriptorMappingSourcePushIndexEXT value) {
            VkDescriptorMappingSourceDataEXT.npushIndex(address(), value);
            return this;
        }

        public Buffer pushIndex(Consumer<VkDescriptorMappingSourcePushIndexEXT> consumer) {
            consumer.accept(pushIndex());
            return this;
        }

        public Buffer indirectIndex(VkDescriptorMappingSourceIndirectIndexEXT value) {
            VkDescriptorMappingSourceDataEXT.nindirectIndex(address(), value);
            return this;
        }

        public Buffer indirectIndex(Consumer<VkDescriptorMappingSourceIndirectIndexEXT> consumer) {
            consumer.accept(indirectIndex());
            return this;
        }

        public Buffer indirectIndexArray(VkDescriptorMappingSourceIndirectIndexArrayEXT value) {
            VkDescriptorMappingSourceDataEXT.nindirectIndexArray(address(), value);
            return this;
        }

        public Buffer indirectIndexArray(Consumer<VkDescriptorMappingSourceIndirectIndexArrayEXT> consumer) {
            consumer.accept(indirectIndexArray());
            return this;
        }

        public Buffer heapData(VkDescriptorMappingSourceHeapDataEXT value) {
            VkDescriptorMappingSourceDataEXT.nheapData(address(), value);
            return this;
        }

        public Buffer heapData(Consumer<VkDescriptorMappingSourceHeapDataEXT> consumer) {
            consumer.accept(heapData());
            return this;
        }

        public Buffer pushDataOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceDataEXT.npushDataOffset(address(), value);
            return this;
        }

        public Buffer pushAddressOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceDataEXT.npushAddressOffset(address(), value);
            return this;
        }

        public Buffer indirectAddress(VkDescriptorMappingSourceIndirectAddressEXT value) {
            VkDescriptorMappingSourceDataEXT.nindirectAddress(address(), value);
            return this;
        }

        public Buffer indirectAddress(Consumer<VkDescriptorMappingSourceIndirectAddressEXT> consumer) {
            consumer.accept(indirectAddress());
            return this;
        }

        public Buffer shaderRecordIndex(VkDescriptorMappingSourceShaderRecordIndexEXT value) {
            VkDescriptorMappingSourceDataEXT.nshaderRecordIndex(address(), value);
            return this;
        }

        public Buffer shaderRecordIndex(Consumer<VkDescriptorMappingSourceShaderRecordIndexEXT> consumer) {
            consumer.accept(shaderRecordIndex());
            return this;
        }

        public Buffer shaderRecordDataOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceDataEXT.nshaderRecordDataOffset(address(), value);
            return this;
        }

        public Buffer shaderRecordAddressOffset(@NativeType("uint32_t") int value) {
            VkDescriptorMappingSourceDataEXT.nshaderRecordAddressOffset(address(), value);
            return this;
        }
    }
}
