package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearColorValue.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearColorValue.class */
public class VkClearColorValue extends Struct<VkClearColorValue> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLOAT32;
    public static final int INT32;
    public static final int UINT32;

    static {
        Struct.Layout layout = __union(__array(4, 4), __array(4, 4), __array(4, 4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLOAT32 = layout.offsetof(0);
        INT32 = layout.offsetof(1);
        UINT32 = layout.offsetof(2);
    }

    protected VkClearColorValue(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClearColorValue create(long address, ByteBuffer container) {
        return new VkClearColorValue(address, container);
    }

    public VkClearColorValue(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("float[4]")
    public FloatBuffer float32() {
        return nfloat32(address());
    }

    public float float32(int index) {
        return nfloat32(address(), index);
    }

    @NativeType("int32_t[4]")
    public IntBuffer int32() {
        return nint32(address());
    }

    @NativeType("int32_t")
    public int int32(int index) {
        return nint32(address(), index);
    }

    @NativeType("uint32_t[4]")
    public IntBuffer uint32() {
        return nuint32(address());
    }

    @NativeType("uint32_t")
    public int uint32(int index) {
        return nuint32(address(), index);
    }

    public VkClearColorValue float32(@NativeType("float[4]") FloatBuffer value) {
        nfloat32(address(), value);
        return this;
    }

    public VkClearColorValue float32(int index, float value) {
        nfloat32(address(), index, value);
        return this;
    }

    public VkClearColorValue int32(@NativeType("int32_t[4]") IntBuffer value) {
        nint32(address(), value);
        return this;
    }

    public VkClearColorValue int32(int index, @NativeType("int32_t") int value) {
        nint32(address(), index, value);
        return this;
    }

    public VkClearColorValue uint32(@NativeType("uint32_t[4]") IntBuffer value) {
        nuint32(address(), value);
        return this;
    }

    public VkClearColorValue uint32(int index, @NativeType("uint32_t") int value) {
        nuint32(address(), index, value);
        return this;
    }

    public VkClearColorValue set(VkClearColorValue src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClearColorValue malloc() {
        return new VkClearColorValue(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClearColorValue calloc() {
        return new VkClearColorValue(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClearColorValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearColorValue(MemoryUtil.memAddress(container), container);
    }

    public static VkClearColorValue create(long address) {
        return new VkClearColorValue(address, null);
    }

    public static VkClearColorValue createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClearColorValue(address, null);
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

    public static VkClearColorValue malloc(MemoryStack stack) {
        return new VkClearColorValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClearColorValue calloc(MemoryStack stack) {
        return new VkClearColorValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FloatBuffer nfloat32(long struct) {
        return MemoryUtil.memFloatBuffer(struct + FLOAT32, 4);
    }

    public static float nfloat32(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + FLOAT32 + (Checks.check(index, 4) * 4));
    }

    public static IntBuffer nint32(long struct) {
        return MemoryUtil.memIntBuffer(struct + INT32, 4);
    }

    public static int nint32(long struct, int index) {
        return MemoryUtil.memGetInt(struct + INT32 + (Checks.check(index, 4) * 4));
    }

    public static IntBuffer nuint32(long struct) {
        return MemoryUtil.memIntBuffer(struct + UINT32, 4);
    }

    public static int nuint32(long struct, int index) {
        return MemoryUtil.memGetInt(struct + UINT32 + (Checks.check(index, 4) * 4));
    }

    public static void nfloat32(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + FLOAT32, value.remaining() * 4);
    }

    public static void nfloat32(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + FLOAT32 + (Checks.check(index, 4) * 4), value);
    }

    public static void nint32(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + INT32, value.remaining() * 4);
    }

    public static void nint32(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + INT32 + (Checks.check(index, 4) * 4), value);
    }

    public static void nuint32(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + UINT32, value.remaining() * 4);
    }

    public static void nuint32(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + UINT32 + (Checks.check(index, 4) * 4), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearColorValue$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearColorValue$Buffer.class */
    public static class Buffer extends StructBuffer<VkClearColorValue, Buffer> implements NativeResource {
        private static final VkClearColorValue ELEMENT_FACTORY = VkClearColorValue.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClearColorValue.SIZEOF);
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
        public VkClearColorValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("float[4]")
        public FloatBuffer float32() {
            return VkClearColorValue.nfloat32(address());
        }

        public float float32(int index) {
            return VkClearColorValue.nfloat32(address(), index);
        }

        @NativeType("int32_t[4]")
        public IntBuffer int32() {
            return VkClearColorValue.nint32(address());
        }

        @NativeType("int32_t")
        public int int32(int index) {
            return VkClearColorValue.nint32(address(), index);
        }

        @NativeType("uint32_t[4]")
        public IntBuffer uint32() {
            return VkClearColorValue.nuint32(address());
        }

        @NativeType("uint32_t")
        public int uint32(int index) {
            return VkClearColorValue.nuint32(address(), index);
        }

        public Buffer float32(@NativeType("float[4]") FloatBuffer value) {
            VkClearColorValue.nfloat32(address(), value);
            return this;
        }

        public Buffer float32(int index, float value) {
            VkClearColorValue.nfloat32(address(), index, value);
            return this;
        }

        public Buffer int32(@NativeType("int32_t[4]") IntBuffer value) {
            VkClearColorValue.nint32(address(), value);
            return this;
        }

        public Buffer int32(int index, @NativeType("int32_t") int value) {
            VkClearColorValue.nint32(address(), index, value);
            return this;
        }

        public Buffer uint32(@NativeType("uint32_t[4]") IntBuffer value) {
            VkClearColorValue.nuint32(address(), value);
            return this;
        }

        public Buffer uint32(int index, @NativeType("uint32_t") int value) {
            VkClearColorValue.nuint32(address(), index, value);
            return this;
        }
    }
}
