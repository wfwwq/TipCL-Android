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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMatrixMotionInstanceNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMatrixMotionInstanceNV.class */
public class VkAccelerationStructureMatrixMotionInstanceNV extends Struct<VkAccelerationStructureMatrixMotionInstanceNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRANSFORMT0;
    public static final int TRANSFORMT1;
    public static final int BITFIELD0;
    public static final int BITFIELD1;
    public static final int ACCELERATIONSTRUCTUREREFERENCE;

    static {
        Struct.Layout layout = __struct(__member(VkTransformMatrixKHR.SIZEOF, VkTransformMatrixKHR.ALIGNOF), __member(VkTransformMatrixKHR.SIZEOF, VkTransformMatrixKHR.ALIGNOF), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRANSFORMT0 = layout.offsetof(0);
        TRANSFORMT1 = layout.offsetof(1);
        BITFIELD0 = layout.offsetof(2);
        BITFIELD1 = layout.offsetof(3);
        ACCELERATIONSTRUCTUREREFERENCE = layout.offsetof(4);
    }

    protected VkAccelerationStructureMatrixMotionInstanceNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureMatrixMotionInstanceNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(address, container);
    }

    public VkAccelerationStructureMatrixMotionInstanceNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkTransformMatrixKHR transformT0() {
        return ntransformT0(address());
    }

    public VkTransformMatrixKHR transformT1() {
        return ntransformT1(address());
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

    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(VkTransformMatrixKHR value) {
        ntransformT0(address(), value);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(Consumer<VkTransformMatrixKHR> consumer) {
        consumer.accept(transformT0());
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(VkTransformMatrixKHR value) {
        ntransformT1(address(), value);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(Consumer<VkTransformMatrixKHR> consumer) {
        consumer.accept(transformT1());
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV instanceCustomIndex(@NativeType("uint32_t") int value) {
        ninstanceCustomIndex(address(), value);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV mask(@NativeType("uint32_t") int value) {
        nmask(address(), value);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
        ninstanceShaderBindingTableRecordOffset(address(), value);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV accelerationStructureReference(@NativeType("uint64_t") long value) {
        naccelerationStructureReference(address(), value);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV set(VkTransformMatrixKHR transformT0, VkTransformMatrixKHR transformT1, int instanceCustomIndex, int mask, int instanceShaderBindingTableRecordOffset, int flags, long accelerationStructureReference) {
        transformT0(transformT0);
        transformT1(transformT1);
        instanceCustomIndex(instanceCustomIndex);
        mask(mask);
        instanceShaderBindingTableRecordOffset(instanceShaderBindingTableRecordOffset);
        flags(flags);
        accelerationStructureReference(accelerationStructureReference);
        return this;
    }

    public VkAccelerationStructureMatrixMotionInstanceNV set(VkAccelerationStructureMatrixMotionInstanceNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV malloc() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV calloc() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMatrixMotionInstanceNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV create(long address) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(address, null);
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureMatrixMotionInstanceNV(address, null);
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

    public static VkAccelerationStructureMatrixMotionInstanceNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkTransformMatrixKHR ntransformT0(long struct) {
        return VkTransformMatrixKHR.create(struct + TRANSFORMT0);
    }

    public static VkTransformMatrixKHR ntransformT1(long struct) {
        return VkTransformMatrixKHR.create(struct + TRANSFORMT1);
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

    public static void ntransformT0(long struct, VkTransformMatrixKHR value) {
        MemoryUtil.memCopy(value.address(), struct + TRANSFORMT0, VkTransformMatrixKHR.SIZEOF);
    }

    public static void ntransformT1(long struct, VkTransformMatrixKHR value) {
        MemoryUtil.memCopy(value.address(), struct + TRANSFORMT1, VkTransformMatrixKHR.SIZEOF);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMatrixMotionInstanceNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMatrixMotionInstanceNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMatrixMotionInstanceNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureMatrixMotionInstanceNV ELEMENT_FACTORY = VkAccelerationStructureMatrixMotionInstanceNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureMatrixMotionInstanceNV.SIZEOF);
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
        public VkAccelerationStructureMatrixMotionInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkTransformMatrixKHR transformT0() {
            return VkAccelerationStructureMatrixMotionInstanceNV.ntransformT0(address());
        }

        public VkTransformMatrixKHR transformT1() {
            return VkAccelerationStructureMatrixMotionInstanceNV.ntransformT1(address());
        }

        @NativeType("uint32_t")
        public int instanceCustomIndex() {
            return VkAccelerationStructureMatrixMotionInstanceNV.ninstanceCustomIndex(address());
        }

        @NativeType("uint32_t")
        public int mask() {
            return VkAccelerationStructureMatrixMotionInstanceNV.nmask(address());
        }

        @NativeType("uint32_t")
        public int instanceShaderBindingTableRecordOffset() {
            return VkAccelerationStructureMatrixMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address());
        }

        @NativeType("VkGeometryInstanceFlagsKHR")
        public int flags() {
            return VkAccelerationStructureMatrixMotionInstanceNV.nflags(address());
        }

        @NativeType("uint64_t")
        public long accelerationStructureReference() {
            return VkAccelerationStructureMatrixMotionInstanceNV.naccelerationStructureReference(address());
        }

        public Buffer transformT0(VkTransformMatrixKHR value) {
            VkAccelerationStructureMatrixMotionInstanceNV.ntransformT0(address(), value);
            return this;
        }

        public Buffer transformT0(Consumer<VkTransformMatrixKHR> consumer) {
            consumer.accept(transformT0());
            return this;
        }

        public Buffer transformT1(VkTransformMatrixKHR value) {
            VkAccelerationStructureMatrixMotionInstanceNV.ntransformT1(address(), value);
            return this;
        }

        public Buffer transformT1(Consumer<VkTransformMatrixKHR> consumer) {
            consumer.accept(transformT1());
            return this;
        }

        public Buffer instanceCustomIndex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureMatrixMotionInstanceNV.ninstanceCustomIndex(address(), value);
            return this;
        }

        public Buffer mask(@NativeType("uint32_t") int value) {
            VkAccelerationStructureMatrixMotionInstanceNV.nmask(address(), value);
            return this;
        }

        public Buffer instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
            VkAccelerationStructureMatrixMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
            VkAccelerationStructureMatrixMotionInstanceNV.nflags(address(), value);
            return this;
        }

        public Buffer accelerationStructureReference(@NativeType("uint64_t") long value) {
            VkAccelerationStructureMatrixMotionInstanceNV.naccelerationStructureReference(address(), value);
            return this;
        }
    }
}
