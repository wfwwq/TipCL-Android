package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportWScalingNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportWScalingNV.class */
public class VkViewportWScalingNV extends Struct<VkViewportWScalingNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XCOEFF;
    public static final int YCOEFF;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XCOEFF = layout.offsetof(0);
        YCOEFF = layout.offsetof(1);
    }

    protected VkViewportWScalingNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkViewportWScalingNV create(long address, ByteBuffer container) {
        return new VkViewportWScalingNV(address, container);
    }

    public VkViewportWScalingNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float xcoeff() {
        return nxcoeff(address());
    }

    public float ycoeff() {
        return nycoeff(address());
    }

    public VkViewportWScalingNV xcoeff(float value) {
        nxcoeff(address(), value);
        return this;
    }

    public VkViewportWScalingNV ycoeff(float value) {
        nycoeff(address(), value);
        return this;
    }

    public VkViewportWScalingNV set(float xcoeff, float ycoeff) {
        xcoeff(xcoeff);
        ycoeff(ycoeff);
        return this;
    }

    public VkViewportWScalingNV set(VkViewportWScalingNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkViewportWScalingNV malloc() {
        return new VkViewportWScalingNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkViewportWScalingNV calloc() {
        return new VkViewportWScalingNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkViewportWScalingNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkViewportWScalingNV(MemoryUtil.memAddress(container), container);
    }

    public static VkViewportWScalingNV create(long address) {
        return new VkViewportWScalingNV(address, null);
    }

    public static VkViewportWScalingNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkViewportWScalingNV(address, null);
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

    public static VkViewportWScalingNV malloc(MemoryStack stack) {
        return new VkViewportWScalingNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkViewportWScalingNV calloc(MemoryStack stack) {
        return new VkViewportWScalingNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nxcoeff(long struct) {
        return MemoryUtil.memGetFloat(struct + XCOEFF);
    }

    public static float nycoeff(long struct) {
        return MemoryUtil.memGetFloat(struct + YCOEFF);
    }

    public static void nxcoeff(long struct, float value) {
        MemoryUtil.memPutFloat(struct + XCOEFF, value);
    }

    public static void nycoeff(long struct, float value) {
        MemoryUtil.memPutFloat(struct + YCOEFF, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportWScalingNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkViewportWScalingNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkViewportWScalingNV, Buffer> implements NativeResource {
        private static final VkViewportWScalingNV ELEMENT_FACTORY = VkViewportWScalingNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkViewportWScalingNV.SIZEOF);
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
        public VkViewportWScalingNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float xcoeff() {
            return VkViewportWScalingNV.nxcoeff(address());
        }

        public float ycoeff() {
            return VkViewportWScalingNV.nycoeff(address());
        }

        public Buffer xcoeff(float value) {
            VkViewportWScalingNV.nxcoeff(address(), value);
            return this;
        }

        public Buffer ycoeff(float value) {
            VkViewportWScalingNV.nycoeff(address(), value);
            return this;
        }
    }
}
