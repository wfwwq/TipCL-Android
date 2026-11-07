package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceValueDataINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceValueDataINTEL.class */
public class VkPerformanceValueDataINTEL extends Struct<VkPerformanceValueDataINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VALUE32;
    public static final int VALUE64;
    public static final int VALUEFLOAT;
    public static final int VALUEBOOL;
    public static final int VALUESTRING;

    static {
        Struct.Layout layout = __union(__member(4), __member(8), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VALUE32 = layout.offsetof(0);
        VALUE64 = layout.offsetof(1);
        VALUEFLOAT = layout.offsetof(2);
        VALUEBOOL = layout.offsetof(3);
        VALUESTRING = layout.offsetof(4);
    }

    protected VkPerformanceValueDataINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceValueDataINTEL create(long address, ByteBuffer container) {
        return new VkPerformanceValueDataINTEL(address, container);
    }

    public VkPerformanceValueDataINTEL(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int value32() {
        return nvalue32(address());
    }

    @NativeType("uint64_t")
    public long value64() {
        return nvalue64(address());
    }

    public float valueFloat() {
        return nvalueFloat(address());
    }

    @NativeType("VkBool32")
    public boolean valueBool() {
        return nvalueBool(address()) != 0;
    }

    @NativeType("char const *")
    public ByteBuffer valueString() {
        return nvalueString(address());
    }

    @NativeType("char const *")
    public String valueStringString() {
        return nvalueStringString(address());
    }

    public VkPerformanceValueDataINTEL value32(@NativeType("uint32_t") int value) {
        nvalue32(address(), value);
        return this;
    }

    public VkPerformanceValueDataINTEL value64(@NativeType("uint64_t") long value) {
        nvalue64(address(), value);
        return this;
    }

    public VkPerformanceValueDataINTEL valueFloat(float value) {
        nvalueFloat(address(), value);
        return this;
    }

    public VkPerformanceValueDataINTEL valueBool(@NativeType("VkBool32") boolean value) {
        nvalueBool(address(), value ? 1 : 0);
        return this;
    }

    public VkPerformanceValueDataINTEL valueString(@NativeType("char const *") ByteBuffer value) {
        nvalueString(address(), value);
        return this;
    }

    public VkPerformanceValueDataINTEL set(VkPerformanceValueDataINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceValueDataINTEL malloc() {
        return new VkPerformanceValueDataINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceValueDataINTEL calloc() {
        return new VkPerformanceValueDataINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceValueDataINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceValueDataINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceValueDataINTEL create(long address) {
        return new VkPerformanceValueDataINTEL(address, null);
    }

    public static VkPerformanceValueDataINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceValueDataINTEL(address, null);
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

    public static VkPerformanceValueDataINTEL malloc(MemoryStack stack) {
        return new VkPerformanceValueDataINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceValueDataINTEL calloc(MemoryStack stack) {
        return new VkPerformanceValueDataINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nvalue32(long struct) {
        return MemoryUtil.memGetInt(struct + VALUE32);
    }

    public static long nvalue64(long struct) {
        return MemoryUtil.memGetLong(struct + VALUE64);
    }

    public static float nvalueFloat(long struct) {
        return MemoryUtil.memGetFloat(struct + VALUEFLOAT);
    }

    public static int nvalueBool(long struct) {
        return MemoryUtil.memGetInt(struct + VALUEBOOL);
    }

    public static ByteBuffer nvalueString(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + VALUESTRING));
    }

    public static String nvalueStringString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + VALUESTRING));
    }

    public static void nvalue32(long struct, int value) {
        MemoryUtil.memPutInt(struct + VALUE32, value);
    }

    public static void nvalue64(long struct, long value) {
        MemoryUtil.memPutLong(struct + VALUE64, value);
    }

    public static void nvalueFloat(long struct, float value) {
        MemoryUtil.memPutFloat(struct + VALUEFLOAT, value);
    }

    public static void nvalueBool(long struct, int value) {
        MemoryUtil.memPutInt(struct + VALUEBOOL, value);
    }

    public static void nvalueString(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + VALUESTRING, MemoryUtil.memAddress(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceValueDataINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceValueDataINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceValueDataINTEL, Buffer> implements NativeResource {
        private static final VkPerformanceValueDataINTEL ELEMENT_FACTORY = VkPerformanceValueDataINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceValueDataINTEL.SIZEOF);
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
        public VkPerformanceValueDataINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int value32() {
            return VkPerformanceValueDataINTEL.nvalue32(address());
        }

        @NativeType("uint64_t")
        public long value64() {
            return VkPerformanceValueDataINTEL.nvalue64(address());
        }

        public float valueFloat() {
            return VkPerformanceValueDataINTEL.nvalueFloat(address());
        }

        @NativeType("VkBool32")
        public boolean valueBool() {
            return VkPerformanceValueDataINTEL.nvalueBool(address()) != 0;
        }

        @NativeType("char const *")
        public ByteBuffer valueString() {
            return VkPerformanceValueDataINTEL.nvalueString(address());
        }

        @NativeType("char const *")
        public String valueStringString() {
            return VkPerformanceValueDataINTEL.nvalueStringString(address());
        }

        public Buffer value32(@NativeType("uint32_t") int value) {
            VkPerformanceValueDataINTEL.nvalue32(address(), value);
            return this;
        }

        public Buffer value64(@NativeType("uint64_t") long value) {
            VkPerformanceValueDataINTEL.nvalue64(address(), value);
            return this;
        }

        public Buffer valueFloat(float value) {
            VkPerformanceValueDataINTEL.nvalueFloat(address(), value);
            return this;
        }

        public Buffer valueBool(@NativeType("VkBool32") boolean value) {
            VkPerformanceValueDataINTEL.nvalueBool(address(), value ? 1 : 0);
            return this;
        }

        public Buffer valueString(@NativeType("char const *") ByteBuffer value) {
            VkPerformanceValueDataINTEL.nvalueString(address(), value);
            return this;
        }
    }
}
