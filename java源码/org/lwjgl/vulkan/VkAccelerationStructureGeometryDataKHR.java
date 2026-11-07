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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR.class */
public class VkAccelerationStructureGeometryDataKHR extends Struct<VkAccelerationStructureGeometryDataKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRIANGLES;
    public static final int AABBS;
    public static final int INSTANCES;

    static {
        Struct.Layout layout = __union(__member(VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF, VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF), __member(VkAccelerationStructureGeometryAabbsDataKHR.SIZEOF, VkAccelerationStructureGeometryAabbsDataKHR.ALIGNOF), __member(VkAccelerationStructureGeometryInstancesDataKHR.SIZEOF, VkAccelerationStructureGeometryInstancesDataKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRIANGLES = layout.offsetof(0);
        AABBS = layout.offsetof(1);
        INSTANCES = layout.offsetof(2);
    }

    protected VkAccelerationStructureGeometryDataKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureGeometryDataKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureGeometryDataKHR(address, container);
    }

    public VkAccelerationStructureGeometryDataKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
        return ntriangles(address());
    }

    public VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
        return naabbs(address());
    }

    public VkAccelerationStructureGeometryInstancesDataKHR instances() {
        return ninstances(address());
    }

    public VkAccelerationStructureGeometryDataKHR triangles(VkAccelerationStructureGeometryTrianglesDataKHR value) {
        ntriangles(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryDataKHR triangles(Consumer<VkAccelerationStructureGeometryTrianglesDataKHR> consumer) {
        consumer.accept(triangles());
        return this;
    }

    public VkAccelerationStructureGeometryDataKHR aabbs(VkAccelerationStructureGeometryAabbsDataKHR value) {
        naabbs(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryDataKHR aabbs(Consumer<VkAccelerationStructureGeometryAabbsDataKHR> consumer) {
        consumer.accept(aabbs());
        return this;
    }

    public VkAccelerationStructureGeometryDataKHR instances(VkAccelerationStructureGeometryInstancesDataKHR value) {
        ninstances(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryDataKHR instances(Consumer<VkAccelerationStructureGeometryInstancesDataKHR> consumer) {
        consumer.accept(instances());
        return this;
    }

    public VkAccelerationStructureGeometryDataKHR set(VkAccelerationStructureGeometryDataKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureGeometryDataKHR malloc() {
        return new VkAccelerationStructureGeometryDataKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryDataKHR calloc() {
        return new VkAccelerationStructureGeometryDataKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryDataKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureGeometryDataKHR create(long address) {
        return new VkAccelerationStructureGeometryDataKHR(address, null);
    }

    public static VkAccelerationStructureGeometryDataKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryDataKHR(address, null);
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

    public static VkAccelerationStructureGeometryDataKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryDataKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR ntriangles(long struct) {
        return VkAccelerationStructureGeometryTrianglesDataKHR.create(struct + TRIANGLES);
    }

    public static VkAccelerationStructureGeometryAabbsDataKHR naabbs(long struct) {
        return VkAccelerationStructureGeometryAabbsDataKHR.create(struct + AABBS);
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR ninstances(long struct) {
        return VkAccelerationStructureGeometryInstancesDataKHR.create(struct + INSTANCES);
    }

    public static void ntriangles(long struct, VkAccelerationStructureGeometryTrianglesDataKHR value) {
        MemoryUtil.memCopy(value.address(), struct + TRIANGLES, VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF);
    }

    public static void naabbs(long struct, VkAccelerationStructureGeometryAabbsDataKHR value) {
        MemoryUtil.memCopy(value.address(), struct + AABBS, VkAccelerationStructureGeometryAabbsDataKHR.SIZEOF);
    }

    public static void ninstances(long struct, VkAccelerationStructureGeometryInstancesDataKHR value) {
        MemoryUtil.memCopy(value.address(), struct + INSTANCES, VkAccelerationStructureGeometryInstancesDataKHR.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryDataKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureGeometryDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryDataKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureGeometryDataKHR.SIZEOF);
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
        public VkAccelerationStructureGeometryDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
            return VkAccelerationStructureGeometryDataKHR.ntriangles(address());
        }

        public VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
            return VkAccelerationStructureGeometryDataKHR.naabbs(address());
        }

        public VkAccelerationStructureGeometryInstancesDataKHR instances() {
            return VkAccelerationStructureGeometryDataKHR.ninstances(address());
        }

        public Buffer triangles(VkAccelerationStructureGeometryTrianglesDataKHR value) {
            VkAccelerationStructureGeometryDataKHR.ntriangles(address(), value);
            return this;
        }

        public Buffer triangles(Consumer<VkAccelerationStructureGeometryTrianglesDataKHR> consumer) {
            consumer.accept(triangles());
            return this;
        }

        public Buffer aabbs(VkAccelerationStructureGeometryAabbsDataKHR value) {
            VkAccelerationStructureGeometryDataKHR.naabbs(address(), value);
            return this;
        }

        public Buffer aabbs(Consumer<VkAccelerationStructureGeometryAabbsDataKHR> consumer) {
            consumer.accept(aabbs());
            return this;
        }

        public Buffer instances(VkAccelerationStructureGeometryInstancesDataKHR value) {
            VkAccelerationStructureGeometryDataKHR.ninstances(address(), value);
            return this;
        }

        public Buffer instances(Consumer<VkAccelerationStructureGeometryInstancesDataKHR> consumer) {
            consumer.accept(instances());
            return this;
        }
    }
}
