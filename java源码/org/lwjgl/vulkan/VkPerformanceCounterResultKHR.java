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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterResultKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterResultKHR.class */
public class VkPerformanceCounterResultKHR extends Struct<VkPerformanceCounterResultKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INT32;
    public static final int INT64;
    public static final int UINT32;
    public static final int UINT64;
    public static final int FLOAT32;
    public static final int FLOAT64;

    static {
        Struct.Layout layout = __union(__member(4), __member(8), __member(4), __member(8), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INT32 = layout.offsetof(0);
        INT64 = layout.offsetof(1);
        UINT32 = layout.offsetof(2);
        UINT64 = layout.offsetof(3);
        FLOAT32 = layout.offsetof(4);
        FLOAT64 = layout.offsetof(5);
    }

    protected VkPerformanceCounterResultKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceCounterResultKHR create(long address, ByteBuffer container) {
        return new VkPerformanceCounterResultKHR(address, container);
    }

    public VkPerformanceCounterResultKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int32_t")
    public int int32() {
        return nint32(address());
    }

    @NativeType("int64_t")
    public long int64() {
        return nint64(address());
    }

    @NativeType("uint32_t")
    public int uint32() {
        return nuint32(address());
    }

    @NativeType("uint64_t")
    public long uint64() {
        return nuint64(address());
    }

    public float float32() {
        return nfloat32(address());
    }

    public double float64() {
        return nfloat64(address());
    }

    public VkPerformanceCounterResultKHR int32(@NativeType("int32_t") int value) {
        nint32(address(), value);
        return this;
    }

    public VkPerformanceCounterResultKHR int64(@NativeType("int64_t") long value) {
        nint64(address(), value);
        return this;
    }

    public VkPerformanceCounterResultKHR uint32(@NativeType("uint32_t") int value) {
        nuint32(address(), value);
        return this;
    }

    public VkPerformanceCounterResultKHR uint64(@NativeType("uint64_t") long value) {
        nuint64(address(), value);
        return this;
    }

    public VkPerformanceCounterResultKHR float32(float value) {
        nfloat32(address(), value);
        return this;
    }

    public VkPerformanceCounterResultKHR float64(double value) {
        nfloat64(address(), value);
        return this;
    }

    public VkPerformanceCounterResultKHR set(VkPerformanceCounterResultKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceCounterResultKHR malloc() {
        return new VkPerformanceCounterResultKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceCounterResultKHR calloc() {
        return new VkPerformanceCounterResultKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceCounterResultKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceCounterResultKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceCounterResultKHR create(long address) {
        return new VkPerformanceCounterResultKHR(address, null);
    }

    public static VkPerformanceCounterResultKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceCounterResultKHR(address, null);
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

    public static VkPerformanceCounterResultKHR malloc(MemoryStack stack) {
        return new VkPerformanceCounterResultKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceCounterResultKHR calloc(MemoryStack stack) {
        return new VkPerformanceCounterResultKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nint32(long struct) {
        return MemoryUtil.memGetInt(struct + INT32);
    }

    public static long nint64(long struct) {
        return MemoryUtil.memGetLong(struct + INT64);
    }

    public static int nuint32(long struct) {
        return MemoryUtil.memGetInt(struct + UINT32);
    }

    public static long nuint64(long struct) {
        return MemoryUtil.memGetLong(struct + UINT64);
    }

    public static float nfloat32(long struct) {
        return MemoryUtil.memGetFloat(struct + FLOAT32);
    }

    public static double nfloat64(long struct) {
        return MemoryUtil.memGetDouble(struct + FLOAT64);
    }

    public static void nint32(long struct, int value) {
        MemoryUtil.memPutInt(struct + INT32, value);
    }

    public static void nint64(long struct, long value) {
        MemoryUtil.memPutLong(struct + INT64, value);
    }

    public static void nuint32(long struct, int value) {
        MemoryUtil.memPutInt(struct + UINT32, value);
    }

    public static void nuint64(long struct, long value) {
        MemoryUtil.memPutLong(struct + UINT64, value);
    }

    public static void nfloat32(long struct, float value) {
        MemoryUtil.memPutFloat(struct + FLOAT32, value);
    }

    public static void nfloat64(long struct, double value) {
        MemoryUtil.memPutDouble(struct + FLOAT64, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterResultKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterResultKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceCounterResultKHR, Buffer> implements NativeResource {
        private static final VkPerformanceCounterResultKHR ELEMENT_FACTORY = VkPerformanceCounterResultKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceCounterResultKHR.SIZEOF);
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
        public VkPerformanceCounterResultKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int32_t")
        public int int32() {
            return VkPerformanceCounterResultKHR.nint32(address());
        }

        @NativeType("int64_t")
        public long int64() {
            return VkPerformanceCounterResultKHR.nint64(address());
        }

        @NativeType("uint32_t")
        public int uint32() {
            return VkPerformanceCounterResultKHR.nuint32(address());
        }

        @NativeType("uint64_t")
        public long uint64() {
            return VkPerformanceCounterResultKHR.nuint64(address());
        }

        public float float32() {
            return VkPerformanceCounterResultKHR.nfloat32(address());
        }

        public double float64() {
            return VkPerformanceCounterResultKHR.nfloat64(address());
        }

        public Buffer int32(@NativeType("int32_t") int value) {
            VkPerformanceCounterResultKHR.nint32(address(), value);
            return this;
        }

        public Buffer int64(@NativeType("int64_t") long value) {
            VkPerformanceCounterResultKHR.nint64(address(), value);
            return this;
        }

        public Buffer uint32(@NativeType("uint32_t") int value) {
            VkPerformanceCounterResultKHR.nuint32(address(), value);
            return this;
        }

        public Buffer uint64(@NativeType("uint64_t") long value) {
            VkPerformanceCounterResultKHR.nuint64(address(), value);
            return this;
        }

        public Buffer float32(float value) {
            VkPerformanceCounterResultKHR.nfloat32(address(), value);
            return this;
        }

        public Buffer float64(double value) {
            VkPerformanceCounterResultKHR.nfloat64(address(), value);
            return this;
        }
    }
}
