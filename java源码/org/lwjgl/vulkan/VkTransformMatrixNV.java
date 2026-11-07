package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkTransformMatrixKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixNV.class */
public class VkTransformMatrixNV extends VkTransformMatrixKHR {
    protected VkTransformMatrixNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkTransformMatrixKHR, org.lwjgl.system.Struct
    public VkTransformMatrixNV create(long address, ByteBuffer container) {
        return new VkTransformMatrixNV(address, container);
    }

    public VkTransformMatrixNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkTransformMatrixKHR
    public VkTransformMatrixNV matrix(@NativeType("float[3][4]") FloatBuffer value) {
        nmatrix(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkTransformMatrixKHR
    public VkTransformMatrixNV matrix(int index, float value) {
        nmatrix(address(), index, value);
        return this;
    }

    public VkTransformMatrixNV set(VkTransformMatrixNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTransformMatrixNV malloc() {
        return new VkTransformMatrixNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTransformMatrixNV calloc() {
        return new VkTransformMatrixNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTransformMatrixNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTransformMatrixNV(MemoryUtil.memAddress(container), container);
    }

    public static VkTransformMatrixNV create(long address) {
        return new VkTransformMatrixNV(address, null);
    }

    public static VkTransformMatrixNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTransformMatrixNV(address, null);
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

    public static VkTransformMatrixNV malloc(MemoryStack stack) {
        return new VkTransformMatrixNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTransformMatrixNV calloc(MemoryStack stack) {
        return new VkTransformMatrixNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTransformMatrixNV$Buffer.class */
    public static class Buffer extends VkTransformMatrixKHR.Buffer {
        private static final VkTransformMatrixNV ELEMENT_FACTORY = VkTransformMatrixNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkTransformMatrixKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkTransformMatrixKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkTransformMatrixKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkTransformMatrixNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkTransformMatrixKHR.Buffer
        public Buffer matrix(@NativeType("float[3][4]") FloatBuffer value) {
            VkTransformMatrixNV.nmatrix(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkTransformMatrixKHR.Buffer
        public Buffer matrix(int index, float value) {
            VkTransformMatrixNV.nmatrix(address(), index, value);
            return this;
        }
    }
}
