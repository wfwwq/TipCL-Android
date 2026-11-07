package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV.class */
public class VkAccelerationStructureMotionInstanceDataNV extends Struct<VkAccelerationStructureMotionInstanceDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STATICINSTANCE;
    public static final int MATRIXMOTIONINSTANCE;
    public static final int SRTMOTIONINSTANCE;

    static {
        Struct.Layout layout = __union(__member(VkAccelerationStructureInstanceKHR.SIZEOF, VkAccelerationStructureInstanceKHR.ALIGNOF), __member(VkAccelerationStructureMatrixMotionInstanceNV.SIZEOF, VkAccelerationStructureMatrixMotionInstanceNV.ALIGNOF), __member(VkAccelerationStructureSRTMotionInstanceNV.SIZEOF, VkAccelerationStructureSRTMotionInstanceNV.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STATICINSTANCE = layout.offsetof(0);
        MATRIXMOTIONINSTANCE = layout.offsetof(1);
        SRTMOTIONINSTANCE = layout.offsetof(2);
    }

    protected VkAccelerationStructureMotionInstanceDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureMotionInstanceDataNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureMotionInstanceDataNV(address, container);
    }

    public VkAccelerationStructureMotionInstanceDataNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkAccelerationStructureInstanceKHR staticInstance() {
        return nstaticInstance(address());
    }

    public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
        return nmatrixMotionInstance(address());
    }

    public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
        return nsrtMotionInstance(address());
    }

    public VkAccelerationStructureMotionInstanceDataNV staticInstance(VkAccelerationStructureInstanceKHR value) {
        nstaticInstance(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInstanceDataNV staticInstance(Consumer<VkAccelerationStructureInstanceKHR> consumer) {
        consumer.accept(staticInstance());
        return this;
    }

    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV value) {
        nmatrixMotionInstance(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(Consumer<VkAccelerationStructureMatrixMotionInstanceNV> consumer) {
        consumer.accept(matrixMotionInstance());
        return this;
    }

    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV value) {
        nsrtMotionInstance(address(), value);
        return this;
    }

    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(Consumer<VkAccelerationStructureSRTMotionInstanceNV> consumer) {
        consumer.accept(srtMotionInstance());
        return this;
    }

    public VkAccelerationStructureMotionInstanceDataNV set(VkAccelerationStructureMotionInstanceDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureMotionInstanceDataNV malloc() {
        return new VkAccelerationStructureMotionInstanceDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInstanceDataNV calloc() {
        return new VkAccelerationStructureMotionInstanceDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInstanceDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMotionInstanceDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureMotionInstanceDataNV create(long address) {
        return new VkAccelerationStructureMotionInstanceDataNV(address, null);
    }

    public static VkAccelerationStructureMotionInstanceDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureMotionInstanceDataNV(address, null);
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

    public static VkAccelerationStructureMotionInstanceDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureMotionInstanceDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkAccelerationStructureInstanceKHR nstaticInstance(long struct) {
        return VkAccelerationStructureInstanceKHR.create(struct + STATICINSTANCE);
    }

    public static VkAccelerationStructureMatrixMotionInstanceNV nmatrixMotionInstance(long struct) {
        return VkAccelerationStructureMatrixMotionInstanceNV.create(struct + MATRIXMOTIONINSTANCE);
    }

    public static VkAccelerationStructureSRTMotionInstanceNV nsrtMotionInstance(long struct) {
        return VkAccelerationStructureSRTMotionInstanceNV.create(struct + SRTMOTIONINSTANCE);
    }

    public static void nstaticInstance(long struct, VkAccelerationStructureInstanceKHR value) {
        MemoryUtil.memCopy(value.address(), struct + STATICINSTANCE, VkAccelerationStructureInstanceKHR.SIZEOF);
    }

    public static void nmatrixMotionInstance(long struct, VkAccelerationStructureMatrixMotionInstanceNV value) {
        MemoryUtil.memCopy(value.address(), struct + MATRIXMOTIONINSTANCE, VkAccelerationStructureMatrixMotionInstanceNV.SIZEOF);
    }

    public static void nsrtMotionInstance(long struct, VkAccelerationStructureSRTMotionInstanceNV value) {
        MemoryUtil.memCopy(value.address(), struct + SRTMOTIONINSTANCE, VkAccelerationStructureSRTMotionInstanceNV.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureMotionInstanceDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMotionInstanceDataNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureMotionInstanceDataNV ELEMENT_FACTORY = VkAccelerationStructureMotionInstanceDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureMotionInstanceDataNV.SIZEOF);
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
        public VkAccelerationStructureMotionInstanceDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkAccelerationStructureInstanceKHR staticInstance() {
            return VkAccelerationStructureMotionInstanceDataNV.nstaticInstance(address());
        }

        public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
            return VkAccelerationStructureMotionInstanceDataNV.nmatrixMotionInstance(address());
        }

        public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
            return VkAccelerationStructureMotionInstanceDataNV.nsrtMotionInstance(address());
        }

        public Buffer staticInstance(VkAccelerationStructureInstanceKHR value) {
            VkAccelerationStructureMotionInstanceDataNV.nstaticInstance(address(), value);
            return this;
        }

        public Buffer staticInstance(Consumer<VkAccelerationStructureInstanceKHR> consumer) {
            consumer.accept(staticInstance());
            return this;
        }

        public Buffer matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV value) {
            VkAccelerationStructureMotionInstanceDataNV.nmatrixMotionInstance(address(), value);
            return this;
        }

        public Buffer matrixMotionInstance(Consumer<VkAccelerationStructureMatrixMotionInstanceNV> consumer) {
            consumer.accept(matrixMotionInstance());
            return this;
        }

        public Buffer srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV value) {
            VkAccelerationStructureMotionInstanceDataNV.nsrtMotionInstance(address(), value);
            return this;
        }

        public Buffer srtMotionInstance(Consumer<VkAccelerationStructureSRTMotionInstanceNV> consumer) {
            consumer.accept(srtMotionInstance());
            return this;
        }
    }
}
