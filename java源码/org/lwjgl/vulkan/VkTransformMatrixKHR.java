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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixKHR.class */
public class VkTransformMatrixKHR extends Struct<VkTransformMatrixKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MATRIX;

    static {
        Struct.Layout layout = __struct(__array(4, 12));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MATRIX = layout.offsetof(0);
    }

    protected VkTransformMatrixKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTransformMatrixKHR create(long address, ByteBuffer container) {
        return new VkTransformMatrixKHR(address, container);
    }

    public VkTransformMatrixKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float[3][4]")
    public FloatBuffer matrix() {
        return nmatrix(address());
    }

    public float matrix(int index) {
        return nmatrix(address(), index);
    }

    public VkTransformMatrixKHR matrix(@NativeType("float[3][4]") FloatBuffer value) {
        nmatrix(address(), value);
        return this;
    }

    public VkTransformMatrixKHR matrix(int index, float value) {
        nmatrix(address(), index, value);
        return this;
    }

    public VkTransformMatrixKHR set(VkTransformMatrixKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTransformMatrixKHR malloc() {
        return new VkTransformMatrixKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTransformMatrixKHR calloc() {
        return new VkTransformMatrixKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTransformMatrixKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTransformMatrixKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkTransformMatrixKHR create(long address) {
        return new VkTransformMatrixKHR(address, null);
    }

    public static VkTransformMatrixKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTransformMatrixKHR(address, null);
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

    public static VkTransformMatrixKHR malloc(MemoryStack stack) {
        return new VkTransformMatrixKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTransformMatrixKHR calloc(MemoryStack stack) {
        return new VkTransformMatrixKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FloatBuffer nmatrix(long struct) {
        return MemoryUtil.memFloatBuffer(struct + MATRIX, 12);
    }

    public static float nmatrix(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + MATRIX + (Checks.check(index, 12) * 4));
    }

    public static void nmatrix(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 12);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + MATRIX, value.remaining() * 4);
    }

    public static void nmatrix(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + MATRIX + (Checks.check(index, 12) * 4), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkTransformMatrixKHR, Buffer> implements NativeResource {
        private static final VkTransformMatrixKHR ELEMENT_FACTORY = VkTransformMatrixKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTransformMatrixKHR.SIZEOF);
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
        public VkTransformMatrixKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[3][4]")
        public FloatBuffer matrix() {
            return VkTransformMatrixKHR.nmatrix(address());
        }

        public float matrix(int index) {
            return VkTransformMatrixKHR.nmatrix(address(), index);
        }

        public Buffer matrix(@NativeType("float[3][4]") FloatBuffer value) {
            VkTransformMatrixKHR.nmatrix(address(), value);
            return this;
        }

        public Buffer matrix(int index, float value) {
            VkTransformMatrixKHR.nmatrix(address(), index, value);
            return this;
        }
    }
}
