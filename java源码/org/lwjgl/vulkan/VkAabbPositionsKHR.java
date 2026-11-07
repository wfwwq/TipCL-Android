package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsKHR.class */
public class VkAabbPositionsKHR extends Struct<VkAabbPositionsKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MINX;
    public static final int MINY;
    public static final int MINZ;
    public static final int MAXX;
    public static final int MAXY;
    public static final int MAXZ;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MINX = layout.offsetof(0);
        MINY = layout.offsetof(1);
        MINZ = layout.offsetof(2);
        MAXX = layout.offsetof(3);
        MAXY = layout.offsetof(4);
        MAXZ = layout.offsetof(5);
    }

    protected VkAabbPositionsKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAabbPositionsKHR create(long address, ByteBuffer container) {
        return new VkAabbPositionsKHR(address, container);
    }

    public VkAabbPositionsKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float minX() {
        return nminX(address());
    }

    public float minY() {
        return nminY(address());
    }

    public float minZ() {
        return nminZ(address());
    }

    public float maxX() {
        return nmaxX(address());
    }

    public float maxY() {
        return nmaxY(address());
    }

    public float maxZ() {
        return nmaxZ(address());
    }

    public VkAabbPositionsKHR minX(float value) {
        nminX(address(), value);
        return this;
    }

    public VkAabbPositionsKHR minY(float value) {
        nminY(address(), value);
        return this;
    }

    public VkAabbPositionsKHR minZ(float value) {
        nminZ(address(), value);
        return this;
    }

    public VkAabbPositionsKHR maxX(float value) {
        nmaxX(address(), value);
        return this;
    }

    public VkAabbPositionsKHR maxY(float value) {
        nmaxY(address(), value);
        return this;
    }

    public VkAabbPositionsKHR maxZ(float value) {
        nmaxZ(address(), value);
        return this;
    }

    public VkAabbPositionsKHR set(float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {
        minX(minX);
        minY(minY);
        minZ(minZ);
        maxX(maxX);
        maxY(maxY);
        maxZ(maxZ);
        return this;
    }

    public VkAabbPositionsKHR set(VkAabbPositionsKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAabbPositionsKHR malloc() {
        return new VkAabbPositionsKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAabbPositionsKHR calloc() {
        return new VkAabbPositionsKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAabbPositionsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAabbPositionsKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAabbPositionsKHR create(long address) {
        return new VkAabbPositionsKHR(address, null);
    }

    public static VkAabbPositionsKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAabbPositionsKHR(address, null);
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

    public static VkAabbPositionsKHR malloc(MemoryStack stack) {
        return new VkAabbPositionsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAabbPositionsKHR calloc(MemoryStack stack) {
        return new VkAabbPositionsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nminX(long struct) {
        return MemoryUtil.memGetFloat(struct + MINX);
    }

    public static float nminY(long struct) {
        return MemoryUtil.memGetFloat(struct + MINY);
    }

    public static float nminZ(long struct) {
        return MemoryUtil.memGetFloat(struct + MINZ);
    }

    public static float nmaxX(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXX);
    }

    public static float nmaxY(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXY);
    }

    public static float nmaxZ(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXZ);
    }

    public static void nminX(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINX, value);
    }

    public static void nminY(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINY, value);
    }

    public static void nminZ(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINZ, value);
    }

    public static void nmaxX(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXX, value);
    }

    public static void nmaxY(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXY, value);
    }

    public static void nmaxZ(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXZ, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAabbPositionsKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAabbPositionsKHR, Buffer> implements NativeResource {
        private static final VkAabbPositionsKHR ELEMENT_FACTORY = VkAabbPositionsKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAabbPositionsKHR.SIZEOF);
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
        public VkAabbPositionsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float minX() {
            return VkAabbPositionsKHR.nminX(address());
        }

        public float minY() {
            return VkAabbPositionsKHR.nminY(address());
        }

        public float minZ() {
            return VkAabbPositionsKHR.nminZ(address());
        }

        public float maxX() {
            return VkAabbPositionsKHR.nmaxX(address());
        }

        public float maxY() {
            return VkAabbPositionsKHR.nmaxY(address());
        }

        public float maxZ() {
            return VkAabbPositionsKHR.nmaxZ(address());
        }

        public Buffer minX(float value) {
            VkAabbPositionsKHR.nminX(address(), value);
            return this;
        }

        public Buffer minY(float value) {
            VkAabbPositionsKHR.nminY(address(), value);
            return this;
        }

        public Buffer minZ(float value) {
            VkAabbPositionsKHR.nminZ(address(), value);
            return this;
        }

        public Buffer maxX(float value) {
            VkAabbPositionsKHR.nmaxX(address(), value);
            return this;
        }

        public Buffer maxY(float value) {
            VkAabbPositionsKHR.nmaxY(address(), value);
            return this;
        }

        public Buffer maxZ(float value) {
            VkAabbPositionsKHR.nmaxZ(address(), value);
            return this;
        }
    }
}
