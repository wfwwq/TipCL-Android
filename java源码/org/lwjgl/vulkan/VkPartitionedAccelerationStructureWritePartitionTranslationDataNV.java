package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.class */
public class VkPartitionedAccelerationStructureWritePartitionTranslationDataNV extends Struct<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PARTITIONINDEX;
    public static final int PARTITIONTRANSLATION;

    static {
        Struct.Layout layout = __struct(__member(4), __array(4, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PARTITIONINDEX = layout.offsetof(0);
        PARTITIONTRANSLATION = layout.offsetof(1);
    }

    protected VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV create(long address, ByteBuffer container) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(address, container);
    }

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int partitionIndex() {
        return npartitionIndex(address());
    }

    @NativeType("float[3]")
    public FloatBuffer partitionTranslation() {
        return npartitionTranslation(address());
    }

    public float partitionTranslation(int index) {
        return npartitionTranslation(address(), index);
    }

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndex(@NativeType("uint32_t") int value) {
        npartitionIndex(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(@NativeType("float[3]") FloatBuffer value) {
        npartitionTranslation(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(int index, float value) {
        npartitionTranslation(address(), index, value);
        return this;
    }

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV set(int partitionIndex, FloatBuffer partitionTranslation) {
        partitionIndex(partitionIndex);
        partitionTranslation(partitionTranslation);
        return this;
    }

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV set(VkPartitionedAccelerationStructureWritePartitionTranslationDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV malloc() {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV calloc() {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV create(long address) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(address, null);
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(address, null);
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

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int npartitionIndex(long struct) {
        return MemoryUtil.memGetInt(struct + PARTITIONINDEX);
    }

    public static FloatBuffer npartitionTranslation(long struct) {
        return MemoryUtil.memFloatBuffer(struct + PARTITIONTRANSLATION, 3);
    }

    public static float npartitionTranslation(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + PARTITIONTRANSLATION + (Checks.check(index, 3) * 4));
    }

    public static void npartitionIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + PARTITIONINDEX, value);
    }

    public static void npartitionTranslation(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PARTITIONTRANSLATION, value.remaining() * 4);
    }

    public static void npartitionTranslation(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + PARTITIONTRANSLATION + (Checks.check(index, 3) * 4), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureWritePartitionTranslationDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV, Buffer> implements NativeResource {
        private static final VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.SIZEOF);
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
        public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int partitionIndex() {
            return VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionIndex(address());
        }

        @NativeType("float[3]")
        public FloatBuffer partitionTranslation() {
            return VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address());
        }

        public float partitionTranslation(int index) {
            return VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address(), index);
        }

        public Buffer partitionIndex(@NativeType("uint32_t") int value) {
            VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionIndex(address(), value);
            return this;
        }

        public Buffer partitionTranslation(@NativeType("float[3]") FloatBuffer value) {
            VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address(), value);
            return this;
        }

        public Buffer partitionTranslation(int index, float value) {
            VkPartitionedAccelerationStructureWritePartitionTranslationDataNV.npartitionTranslation(address(), index, value);
            return this;
        }
    }
}
