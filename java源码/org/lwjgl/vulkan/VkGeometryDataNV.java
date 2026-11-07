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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryDataNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryDataNV.class */
public class VkGeometryDataNV extends Struct<VkGeometryDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TRIANGLES;
    public static final int AABBS;

    static {
        Struct.Layout layout = __struct(__member(VkGeometryTrianglesNV.SIZEOF, VkGeometryTrianglesNV.ALIGNOF), __member(VkGeometryAABBNV.SIZEOF, VkGeometryAABBNV.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TRIANGLES = layout.offsetof(0);
        AABBS = layout.offsetof(1);
    }

    protected VkGeometryDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeometryDataNV create(long address, ByteBuffer container) {
        return new VkGeometryDataNV(address, container);
    }

    public VkGeometryDataNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkGeometryTrianglesNV triangles() {
        return ntriangles(address());
    }

    public VkGeometryAABBNV aabbs() {
        return naabbs(address());
    }

    public VkGeometryDataNV triangles(VkGeometryTrianglesNV value) {
        ntriangles(address(), value);
        return this;
    }

    public VkGeometryDataNV triangles(Consumer<VkGeometryTrianglesNV> consumer) {
        consumer.accept(triangles());
        return this;
    }

    public VkGeometryDataNV aabbs(VkGeometryAABBNV value) {
        naabbs(address(), value);
        return this;
    }

    public VkGeometryDataNV aabbs(Consumer<VkGeometryAABBNV> consumer) {
        consumer.accept(aabbs());
        return this;
    }

    public VkGeometryDataNV set(VkGeometryTrianglesNV triangles, VkGeometryAABBNV aabbs) {
        triangles(triangles);
        aabbs(aabbs);
        return this;
    }

    public VkGeometryDataNV set(VkGeometryDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeometryDataNV malloc() {
        return new VkGeometryDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeometryDataNV calloc() {
        return new VkGeometryDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeometryDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGeometryDataNV create(long address) {
        return new VkGeometryDataNV(address, null);
    }

    public static VkGeometryDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeometryDataNV(address, null);
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

    public static VkGeometryDataNV malloc(MemoryStack stack) {
        return new VkGeometryDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeometryDataNV calloc(MemoryStack stack) {
        return new VkGeometryDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkGeometryTrianglesNV ntriangles(long struct) {
        return VkGeometryTrianglesNV.create(struct + TRIANGLES);
    }

    public static VkGeometryAABBNV naabbs(long struct) {
        return VkGeometryAABBNV.create(struct + AABBS);
    }

    public static void ntriangles(long struct, VkGeometryTrianglesNV value) {
        MemoryUtil.memCopy(value.address(), struct + TRIANGLES, VkGeometryTrianglesNV.SIZEOF);
    }

    public static void naabbs(long struct, VkGeometryAABBNV value) {
        MemoryUtil.memCopy(value.address(), struct + AABBS, VkGeometryAABBNV.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryDataNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeometryDataNV, Buffer> implements NativeResource {
        private static final VkGeometryDataNV ELEMENT_FACTORY = VkGeometryDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeometryDataNV.SIZEOF);
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
        public VkGeometryDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkGeometryTrianglesNV triangles() {
            return VkGeometryDataNV.ntriangles(address());
        }

        public VkGeometryAABBNV aabbs() {
            return VkGeometryDataNV.naabbs(address());
        }

        public Buffer triangles(VkGeometryTrianglesNV value) {
            VkGeometryDataNV.ntriangles(address(), value);
            return this;
        }

        public Buffer triangles(Consumer<VkGeometryTrianglesNV> consumer) {
            consumer.accept(triangles());
            return this;
        }

        public Buffer aabbs(VkGeometryAABBNV value) {
            VkGeometryDataNV.naabbs(address(), value);
            return this;
        }

        public Buffer aabbs(Consumer<VkGeometryAABBNV> consumer) {
            consumer.accept(aabbs());
            return this;
        }
    }
}
