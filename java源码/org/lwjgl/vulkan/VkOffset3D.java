package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOffset3D.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOffset3D.class */
public class VkOffset3D extends Struct<VkOffset3D> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int Z;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
    }

    protected VkOffset3D(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOffset3D create(long address, ByteBuffer container) {
        return new VkOffset3D(address, container);
    }

    public VkOffset3D(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int32_t")
    public int x() {
        return nx(address());
    }

    @NativeType("int32_t")
    public int y() {
        return ny(address());
    }

    @NativeType("int32_t")
    public int z() {
        return nz(address());
    }

    public VkOffset3D x(@NativeType("int32_t") int value) {
        nx(address(), value);
        return this;
    }

    public VkOffset3D y(@NativeType("int32_t") int value) {
        ny(address(), value);
        return this;
    }

    public VkOffset3D z(@NativeType("int32_t") int value) {
        nz(address(), value);
        return this;
    }

    public VkOffset3D set(int x, int y, int z) {
        x(x);
        y(y);
        z(z);
        return this;
    }

    public VkOffset3D set(VkOffset3D src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOffset3D malloc() {
        return new VkOffset3D(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOffset3D calloc() {
        return new VkOffset3D(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOffset3D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOffset3D(MemoryUtil.memAddress(container), container);
    }

    public static VkOffset3D create(long address) {
        return new VkOffset3D(address, null);
    }

    public static VkOffset3D createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOffset3D(address, null);
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

    public static VkOffset3D malloc(MemoryStack stack) {
        return new VkOffset3D(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOffset3D calloc(MemoryStack stack) {
        return new VkOffset3D(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static int nz(long struct) {
        return MemoryUtil.memGetInt(struct + Z);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nz(long struct, int value) {
        MemoryUtil.memPutInt(struct + Z, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOffset3D$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOffset3D$Buffer.class */
    public static class Buffer extends StructBuffer<VkOffset3D, Buffer> implements NativeResource {
        private static final VkOffset3D ELEMENT_FACTORY = VkOffset3D.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOffset3D.SIZEOF);
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
        public VkOffset3D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int32_t")
        public int x() {
            return VkOffset3D.nx(address());
        }

        @NativeType("int32_t")
        public int y() {
            return VkOffset3D.ny(address());
        }

        @NativeType("int32_t")
        public int z() {
            return VkOffset3D.nz(address());
        }

        public Buffer x(@NativeType("int32_t") int value) {
            VkOffset3D.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("int32_t") int value) {
            VkOffset3D.ny(address(), value);
            return this;
        }

        public Buffer z(@NativeType("int32_t") int value) {
            VkOffset3D.nz(address(), value);
            return this;
        }
    }
}
