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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV.class */
public class VkAccelerationStructureSRTMotionInstanceNV extends Struct<VkAccelerationStructureSRTMotionInstanceNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRANSFORMT0;
    public static final int TRANSFORMT1;
    public static final int BITFIELD0;
    public static final int BITFIELD1;
    public static final int ACCELERATIONSTRUCTUREREFERENCE;

    static {
        Struct.Layout layout = __struct(__member(VkSRTDataNV.SIZEOF, VkSRTDataNV.ALIGNOF), __member(VkSRTDataNV.SIZEOF, VkSRTDataNV.ALIGNOF), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRANSFORMT0 = layout.offsetof(0);
        TRANSFORMT1 = layout.offsetof(1);
        BITFIELD0 = layout.offsetof(2);
        BITFIELD1 = layout.offsetof(3);
        ACCELERATIONSTRUCTUREREFERENCE = layout.offsetof(4);
    }

    protected VkAccelerationStructureSRTMotionInstanceNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureSRTMotionInstanceNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureSRTMotionInstanceNV(address, container);
    }

    public VkAccelerationStructureSRTMotionInstanceNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkSRTDataNV transformT0() {
        return ntransformT0(address());
    }

    public VkSRTDataNV transformT1() {
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

    public VkAccelerationStructureSRTMotionInstanceNV transformT0(VkSRTDataNV value) {
        ntransformT0(address(), value);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV transformT0(Consumer<VkSRTDataNV> consumer) {
        consumer.accept(transformT0());
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV transformT1(VkSRTDataNV value) {
        ntransformT1(address(), value);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV transformT1(Consumer<VkSRTDataNV> consumer) {
        consumer.accept(transformT1());
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV instanceCustomIndex(@NativeType("uint32_t") int value) {
        ninstanceCustomIndex(address(), value);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV mask(@NativeType("uint32_t") int value) {
        nmask(address(), value);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
        ninstanceShaderBindingTableRecordOffset(address(), value);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV accelerationStructureReference(@NativeType("uint64_t") long value) {
        naccelerationStructureReference(address(), value);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV set(VkSRTDataNV transformT0, VkSRTDataNV transformT1, int instanceCustomIndex, int mask, int instanceShaderBindingTableRecordOffset, int flags, long accelerationStructureReference) {
        transformT0(transformT0);
        transformT1(transformT1);
        instanceCustomIndex(instanceCustomIndex);
        mask(mask);
        instanceShaderBindingTableRecordOffset(instanceShaderBindingTableRecordOffset);
        flags(flags);
        accelerationStructureReference(accelerationStructureReference);
        return this;
    }

    public VkAccelerationStructureSRTMotionInstanceNV set(VkAccelerationStructureSRTMotionInstanceNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureSRTMotionInstanceNV malloc() {
        return new VkAccelerationStructureSRTMotionInstanceNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureSRTMotionInstanceNV calloc() {
        return new VkAccelerationStructureSRTMotionInstanceNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureSRTMotionInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureSRTMotionInstanceNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureSRTMotionInstanceNV create(long address) {
        return new VkAccelerationStructureSRTMotionInstanceNV(address, null);
    }

    public static VkAccelerationStructureSRTMotionInstanceNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureSRTMotionInstanceNV(address, null);
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

    public static VkAccelerationStructureSRTMotionInstanceNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureSRTMotionInstanceNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureSRTMotionInstanceNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureSRTMotionInstanceNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkSRTDataNV ntransformT0(long struct) {
        return VkSRTDataNV.create(struct + TRANSFORMT0);
    }

    public static VkSRTDataNV ntransformT1(long struct) {
        return VkSRTDataNV.create(struct + TRANSFORMT1);
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

    public static void ntransformT0(long struct, VkSRTDataNV value) {
        MemoryUtil.memCopy(value.address(), struct + TRANSFORMT0, VkSRTDataNV.SIZEOF);
    }

    public static void ntransformT1(long struct, VkSRTDataNV value) {
        MemoryUtil.memCopy(value.address(), struct + TRANSFORMT1, VkSRTDataNV.SIZEOF);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureSRTMotionInstanceNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureSRTMotionInstanceNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureSRTMotionInstanceNV ELEMENT_FACTORY = VkAccelerationStructureSRTMotionInstanceNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureSRTMotionInstanceNV.SIZEOF);
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
        public VkAccelerationStructureSRTMotionInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkSRTDataNV transformT0() {
            return VkAccelerationStructureSRTMotionInstanceNV.ntransformT0(address());
        }

        public VkSRTDataNV transformT1() {
            return VkAccelerationStructureSRTMotionInstanceNV.ntransformT1(address());
        }

        @NativeType("uint32_t")
        public int instanceCustomIndex() {
            return VkAccelerationStructureSRTMotionInstanceNV.ninstanceCustomIndex(address());
        }

        @NativeType("uint32_t")
        public int mask() {
            return VkAccelerationStructureSRTMotionInstanceNV.nmask(address());
        }

        @NativeType("uint32_t")
        public int instanceShaderBindingTableRecordOffset() {
            return VkAccelerationStructureSRTMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address());
        }

        @NativeType("VkGeometryInstanceFlagsKHR")
        public int flags() {
            return VkAccelerationStructureSRTMotionInstanceNV.nflags(address());
        }

        @NativeType("uint64_t")
        public long accelerationStructureReference() {
            return VkAccelerationStructureSRTMotionInstanceNV.naccelerationStructureReference(address());
        }

        public Buffer transformT0(VkSRTDataNV value) {
            VkAccelerationStructureSRTMotionInstanceNV.ntransformT0(address(), value);
            return this;
        }

        public Buffer transformT0(Consumer<VkSRTDataNV> consumer) {
            consumer.accept(transformT0());
            return this;
        }

        public Buffer transformT1(VkSRTDataNV value) {
            VkAccelerationStructureSRTMotionInstanceNV.ntransformT1(address(), value);
            return this;
        }

        public Buffer transformT1(Consumer<VkSRTDataNV> consumer) {
            consumer.accept(transformT1());
            return this;
        }

        public Buffer instanceCustomIndex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureSRTMotionInstanceNV.ninstanceCustomIndex(address(), value);
            return this;
        }

        public Buffer mask(@NativeType("uint32_t") int value) {
            VkAccelerationStructureSRTMotionInstanceNV.nmask(address(), value);
            return this;
        }

        public Buffer instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
            VkAccelerationStructureSRTMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
            VkAccelerationStructureSRTMotionInstanceNV.nflags(address(), value);
            return this;
        }

        public Buffer accelerationStructureReference(@NativeType("uint64_t") long value) {
            VkAccelerationStructureSRTMotionInstanceNV.naccelerationStructureReference(address(), value);
            return this;
        }
    }
}
