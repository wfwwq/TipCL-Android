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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportSwizzleNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportSwizzleNV.class */
public class VkViewportSwizzleNV extends Struct<VkViewportSwizzleNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int Z;
    public static final int W;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
        W = layout.offsetof(3);
    }

    protected VkViewportSwizzleNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkViewportSwizzleNV create(long address, ByteBuffer container) {
        return new VkViewportSwizzleNV(address, container);
    }

    public VkViewportSwizzleNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkViewportCoordinateSwizzleNV")
    public int x() {
        return nx(address());
    }

    @NativeType("VkViewportCoordinateSwizzleNV")
    public int y() {
        return ny(address());
    }

    @NativeType("VkViewportCoordinateSwizzleNV")
    public int z() {
        return nz(address());
    }

    @NativeType("VkViewportCoordinateSwizzleNV")
    public int w() {
        return nw(address());
    }

    public VkViewportSwizzleNV x(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
        nx(address(), value);
        return this;
    }

    public VkViewportSwizzleNV y(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
        ny(address(), value);
        return this;
    }

    public VkViewportSwizzleNV z(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
        nz(address(), value);
        return this;
    }

    public VkViewportSwizzleNV w(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
        nw(address(), value);
        return this;
    }

    public VkViewportSwizzleNV set(int x, int y, int z, int w) {
        x(x);
        y(y);
        z(z);
        w(w);
        return this;
    }

    public VkViewportSwizzleNV set(VkViewportSwizzleNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkViewportSwizzleNV malloc() {
        return new VkViewportSwizzleNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkViewportSwizzleNV calloc() {
        return new VkViewportSwizzleNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkViewportSwizzleNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkViewportSwizzleNV(MemoryUtil.memAddress(container), container);
    }

    public static VkViewportSwizzleNV create(long address) {
        return new VkViewportSwizzleNV(address, null);
    }

    public static VkViewportSwizzleNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkViewportSwizzleNV(address, null);
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

    public static VkViewportSwizzleNV malloc(MemoryStack stack) {
        return new VkViewportSwizzleNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkViewportSwizzleNV calloc(MemoryStack stack) {
        return new VkViewportSwizzleNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nw(long struct) {
        return MemoryUtil.memGetInt(struct + W);
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

    public static void nw(long struct, int value) {
        MemoryUtil.memPutInt(struct + W, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportSwizzleNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportSwizzleNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkViewportSwizzleNV, Buffer> implements NativeResource {
        private static final VkViewportSwizzleNV ELEMENT_FACTORY = VkViewportSwizzleNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkViewportSwizzleNV.SIZEOF);
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
        public VkViewportSwizzleNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkViewportCoordinateSwizzleNV")
        public int x() {
            return VkViewportSwizzleNV.nx(address());
        }

        @NativeType("VkViewportCoordinateSwizzleNV")
        public int y() {
            return VkViewportSwizzleNV.ny(address());
        }

        @NativeType("VkViewportCoordinateSwizzleNV")
        public int z() {
            return VkViewportSwizzleNV.nz(address());
        }

        @NativeType("VkViewportCoordinateSwizzleNV")
        public int w() {
            return VkViewportSwizzleNV.nw(address());
        }

        public Buffer x(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
            VkViewportSwizzleNV.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
            VkViewportSwizzleNV.ny(address(), value);
            return this;
        }

        public Buffer z(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
            VkViewportSwizzleNV.nz(address(), value);
            return this;
        }

        public Buffer w(@NativeType("VkViewportCoordinateSwizzleNV") int value) {
            VkViewportSwizzleNV.nw(address(), value);
            return this;
        }
    }
}
