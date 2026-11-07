package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.vulkan.VkAabbPositionsKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsNV.class */
public class VkAabbPositionsNV extends VkAabbPositionsKHR {
    protected VkAabbPositionsNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR, org.lwjgl.system.Struct
    public VkAabbPositionsNV create(long address, ByteBuffer container) {
        return new VkAabbPositionsNV(address, container);
    }

    public VkAabbPositionsNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public VkAabbPositionsNV minX(float value) {
        nminX(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public VkAabbPositionsNV minY(float value) {
        nminY(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public VkAabbPositionsNV minZ(float value) {
        nminZ(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public VkAabbPositionsNV maxX(float value) {
        nmaxX(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public VkAabbPositionsNV maxY(float value) {
        nmaxY(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public VkAabbPositionsNV maxZ(float value) {
        nmaxZ(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAabbPositionsKHR
    public VkAabbPositionsNV set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {
        minX(minX);
        minY(minY);
        minZ(minZ);
        maxX(maxX);
        maxY(maxY);
        maxZ(maxZ);
        return this;
    }

    public VkAabbPositionsNV set(VkAabbPositionsNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAabbPositionsNV malloc() {
        return new VkAabbPositionsNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAabbPositionsNV calloc() {
        return new VkAabbPositionsNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAabbPositionsNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAabbPositionsNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAabbPositionsNV create(long address) {
        return new VkAabbPositionsNV(address, null);
    }

    public static VkAabbPositionsNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAabbPositionsNV(address, null);
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

    public static VkAabbPositionsNV malloc(MemoryStack stack) {
        return new VkAabbPositionsNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAabbPositionsNV calloc(MemoryStack stack) {
        return new VkAabbPositionsNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsNV$Buffer.class */
    public static class Buffer extends VkAabbPositionsKHR.Buffer {
        private static final VkAabbPositionsNV ELEMENT_FACTORY = VkAabbPositionsNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkAabbPositionsNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public Buffer minX(float value) {
            VkAabbPositionsNV.nminX(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public Buffer minY(float value) {
            VkAabbPositionsNV.nminY(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public Buffer minZ(float value) {
            VkAabbPositionsNV.nminZ(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public Buffer maxX(float value) {
            VkAabbPositionsNV.nmaxX(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public Buffer maxY(float value) {
            VkAabbPositionsNV.nmaxY(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAabbPositionsKHR.Buffer
        public Buffer maxZ(float value) {
            VkAabbPositionsNV.nmaxZ(address(), value);
            return this;
        }
    }
}
