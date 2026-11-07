package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV.class */
public class VkAccelerationStructureInstanceNV extends VkAccelerationStructureInstanceKHR {
    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public /* bridge */ /* synthetic */ VkAccelerationStructureInstanceKHR transform(Consumer consumer) {
        return transform((Consumer<VkTransformMatrixKHR>) consumer);
    }

    protected VkAccelerationStructureInstanceNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR, org.lwjgl.system.Struct
    public VkAccelerationStructureInstanceNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureInstanceNV(address, container);
    }

    public VkAccelerationStructureInstanceNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV transform(VkTransformMatrixKHR value) {
        ntransform(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV transform(Consumer<VkTransformMatrixKHR> consumer) {
        consumer.accept(transform());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV instanceCustomIndex(@NativeType("uint32_t") int value) {
        ninstanceCustomIndex(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV mask(@NativeType("uint32_t") int value) {
        nmask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
        ninstanceShaderBindingTableRecordOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV accelerationStructureReference(@NativeType("uint64_t") long value) {
        naccelerationStructureReference(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR
    public VkAccelerationStructureInstanceNV set(VkTransformMatrixKHR transform, int instanceCustomIndex, int mask, int instanceShaderBindingTableRecordOffset, int flags, long accelerationStructureReference) {
        transform(transform);
        instanceCustomIndex(instanceCustomIndex);
        mask(mask);
        instanceShaderBindingTableRecordOffset(instanceShaderBindingTableRecordOffset);
        flags(flags);
        accelerationStructureReference(accelerationStructureReference);
        return this;
    }

    public VkAccelerationStructureInstanceNV set(VkAccelerationStructureInstanceNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureInstanceNV malloc() {
        return new VkAccelerationStructureInstanceNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureInstanceNV calloc() {
        return new VkAccelerationStructureInstanceNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureInstanceNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureInstanceNV create(long address) {
        return new VkAccelerationStructureInstanceNV(address, null);
    }

    public static VkAccelerationStructureInstanceNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureInstanceNV(address, null);
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

    public static VkAccelerationStructureInstanceNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureInstanceNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureInstanceNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureInstanceNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureInstanceNV$Buffer.class */
    public static class Buffer extends VkAccelerationStructureInstanceKHR.Buffer {
        private static final VkAccelerationStructureInstanceNV ELEMENT_FACTORY = VkAccelerationStructureInstanceNV.create(-1L);

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public /* bridge */ /* synthetic */ VkAccelerationStructureInstanceKHR.Buffer transform(Consumer consumer) {
            return transform((Consumer<VkTransformMatrixKHR>) consumer);
        }

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkAccelerationStructureInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public Buffer transform(VkTransformMatrixKHR value) {
            VkAccelerationStructureInstanceNV.ntransform(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public Buffer transform(Consumer<VkTransformMatrixKHR> consumer) {
            consumer.accept(transform());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public Buffer instanceCustomIndex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureInstanceNV.ninstanceCustomIndex(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public Buffer mask(@NativeType("uint32_t") int value) {
            VkAccelerationStructureInstanceNV.nmask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public Buffer instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) {
            VkAccelerationStructureInstanceNV.ninstanceShaderBindingTableRecordOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public Buffer flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) {
            VkAccelerationStructureInstanceNV.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAccelerationStructureInstanceKHR.Buffer
        public Buffer accelerationStructureReference(@NativeType("uint64_t") long value) {
            VkAccelerationStructureInstanceNV.naccelerationStructureReference(address(), value);
            return this;
        }
    }
}
