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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceKHR.class */
public class VkAccelerationStructureInstanceKHR extends Struct<VkAccelerationStructureInstanceKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRANSFORM;
    public static final int BITFIELD0;
    public static final int BITFIELD1;
    public static final int ACCELERATIONSTRUCTUREREFERENCE;

    static {
        Struct.Layout layout = __struct(__member(VkTransformMatrixKHR.SIZEOF, VkTransformMatrixKHR.ALIGNOF), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRANSFORM = layout.offsetof(0);
        BITFIELD0 = layout.offsetof(1);
        BITFIELD1 = layout.offsetof(2);
        ACCELERATIONSTRUCTUREREFERENCE = layout.offsetof(3);
    }

    protected VkAccelerationStructureInstanceKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureInstanceKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureInstanceKHR(address, container);
    }

    public VkAccelerationStructureInstanceKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkTransformMatrixKHR transform() {
        return ntransform(address());
    }

    @NativeType("uint32_t")
    public int instanceCustomIndex() {
        return ninstanceCustomIndex(address());
    }

    @NativeType("uint32_t")
    public int mask() {
        return nmask(address());
    }

    @NativeType("uint32_t")
    public int instanceShaderBindingTableRecordOffset() {
        return ninstanceShaderBindingTableRecordOffset(address());
    }

    @NativeType("VkGeometryInstanceFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint64_t")
    public long accelerationStructureReference() {
        return naccelerationStructureReference(address());
    }

    public VkAccelerationStructureInstanceKHR transform(VkTransformMatrixKHR value) {
        ntransform(address(), value);
        return this;
    }

    public VkAccelerationStructureInstanceKHR transform(Consumer<VkTransformMatrixKHR> consumer) {
        consumer.accept(transform());
        return this;
    }

    public VkAccelerationStructureInstanceKHR instanceCustomIndex(@NativeType("uint32_t") int value) {
        ninstanceCustomIndex(address(), value);
        return this;
    }

    public VkAccelerationStructureInstanceKHR mask(@NativeType("uint32_t") int value) {
        nmask(address(), value);
        return this;
    }

    public VkAccelerationStructureInstanceKHR instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
        ninstanceShaderBindingTableRecordOffset(address(), value);
        return this;
    }

    public VkAccelerationStructureInstanceKHR flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAccelerationStructureInstanceKHR accelerationStructureReference(@NativeType("uint64_t") long value) {
        naccelerationStructureReference(address(), value);
        return this;
    }

    public VkAccelerationStructureInstanceKHR set(VkTransformMatrixKHR transform, int instanceCustomIndex, int mask, int instanceShaderBindingTableRecordOffset, int flags, long accelerationStructureReference) {
        transform(transform);
        instanceCustomIndex(instanceCustomIndex);
        mask(mask);
        instanceShaderBindingTableRecordOffset(instanceShaderBindingTableRecordOffset);
        flags(flags);
        accelerationStructureReference(accelerationStructureReference);
        return this;
    }

    public VkAccelerationStructureInstanceKHR set(VkAccelerationStructureInstanceKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureInstanceKHR malloc() {
        return new VkAccelerationStructureInstanceKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureInstanceKHR calloc() {
        return new VkAccelerationStructureInstanceKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureInstanceKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureInstanceKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureInstanceKHR create(long address) {
        return new VkAccelerationStructureInstanceKHR(address, null);
    }

    public static VkAccelerationStructureInstanceKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureInstanceKHR(address, null);
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

    public static VkAccelerationStructureInstanceKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureInstanceKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureInstanceKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureInstanceKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkTransformMatrixKHR ntransform(long struct) {
        return VkTransformMatrixKHR.create(struct + TRANSFORM);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int ninstanceCustomIndex(long struct) {
        return nbitfield0(struct) & 16777215;
    }

    public static int nmask(long struct) {
        return nbitfield0(struct) >>> 24;
    }

    public static int nbitfield1(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD1);
    }

    public static int ninstanceShaderBindingTableRecordOffset(long struct) {
        return nbitfield1(struct) & 16777215;
    }

    public static int nflags(long struct) {
        return nbitfield1(struct) >>> 24;
    }

    public static long naccelerationStructureReference(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTUREREFERENCE);
    }

    public static void ntransform(long struct, VkTransformMatrixKHR value) {
        MemoryUtil.memCopy(value.address(), struct + TRANSFORM, VkTransformMatrixKHR.SIZEOF);
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ninstanceCustomIndex(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-16777216)) | (value & 16777215));
    }

    public static void nmask(long struct, int value) {
        nbitfield0(struct, (value << 24) | (nbitfield0(struct) & 16777215));
    }

    public static void nbitfield1(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD1, value);
    }

    public static void ninstanceShaderBindingTableRecordOffset(long struct, int value) {
        nbitfield1(struct, (nbitfield1(struct) & (-16777216)) | (value & 16777215));
    }

    public static void nflags(long struct, int value) {
        nbitfield1(struct, (value << 24) | (nbitfield1(struct) & 16777215));
    }

    public static void naccelerationStructureReference(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTUREREFERENCE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureInstanceKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureInstanceKHR ELEMENT_FACTORY = VkAccelerationStructureInstanceKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureInstanceKHR.SIZEOF);
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
        public VkAccelerationStructureInstanceKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkTransformMatrixKHR transform() {
            return VkAccelerationStructureInstanceKHR.ntransform(address());
        }

        @NativeType("uint32_t")
        public int instanceCustomIndex() {
            return VkAccelerationStructureInstanceKHR.ninstanceCustomIndex(address());
        }

        @NativeType("uint32_t")
        public int mask() {
            return VkAccelerationStructureInstanceKHR.nmask(address());
        }

        @NativeType("uint32_t")
        public int instanceShaderBindingTableRecordOffset() {
            return VkAccelerationStructureInstanceKHR.ninstanceShaderBindingTableRecordOffset(address());
        }

        @NativeType("VkGeometryInstanceFlagsKHR")
        public int flags() {
            return VkAccelerationStructureInstanceKHR.nflags(address());
        }

        @NativeType("uint64_t")
        public long accelerationStructureReference() {
            return VkAccelerationStructureInstanceKHR.naccelerationStructureReference(address());
        }

        public Buffer transform(VkTransformMatrixKHR value) {
            VkAccelerationStructureInstanceKHR.ntransform(address(), value);
            return this;
        }

        public Buffer transform(Consumer<VkTransformMatrixKHR> consumer) {
            consumer.accept(transform());
            return this;
        }

        public Buffer instanceCustomIndex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureInstanceKHR.ninstanceCustomIndex(address(), value);
            return this;
        }

        public Buffer mask(@NativeType("uint32_t") int value) {
            VkAccelerationStructureInstanceKHR.nmask(address(), value);
            return this;
        }

        public Buffer instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
            VkAccelerationStructureInstanceKHR.ninstanceShaderBindingTableRecordOffset(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
            VkAccelerationStructureInstanceKHR.nflags(address(), value);
            return this;
        }

        public Buffer accelerationStructureReference(@NativeType("uint64_t") long value) {
            VkAccelerationStructureInstanceKHR.naccelerationStructureReference(address(), value);
            return this;
        }
    }
}
