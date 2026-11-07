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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComponentMapping.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComponentMapping.class */
public class VkComponentMapping extends Struct<VkComponentMapping> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int R;
    public static final int G;
    public static final int B;
    public static final int A;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    protected VkComponentMapping(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkComponentMapping create(long address, ByteBuffer container) {
        return new VkComponentMapping(address, container);
    }

    public VkComponentMapping(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkComponentSwizzle")
    public int r() {
        return nr(address());
    }

    @NativeType("VkComponentSwizzle")
    public int g() {
        return ng(address());
    }

    @NativeType("VkComponentSwizzle")
    public int b() {
        return nb(address());
    }

    @NativeType("VkComponentSwizzle")
    public int a() {
        return na(address());
    }

    public VkComponentMapping r(@NativeType("VkComponentSwizzle") int value) {
        nr(address(), value);
        return this;
    }

    public VkComponentMapping g(@NativeType("VkComponentSwizzle") int value) {
        ng(address(), value);
        return this;
    }

    public VkComponentMapping b(@NativeType("VkComponentSwizzle") int value) {
        nb(address(), value);
        return this;
    }

    public VkComponentMapping a(@NativeType("VkComponentSwizzle") int value) {
        na(address(), value);
        return this;
    }

    public VkComponentMapping set(int r, int g, int b, int a) {
        r(r);
        g(g);
        b(b);
        a(a);
        return this;
    }

    public VkComponentMapping set(VkComponentMapping src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkComponentMapping malloc() {
        return new VkComponentMapping(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkComponentMapping calloc() {
        return new VkComponentMapping(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkComponentMapping create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComponentMapping(MemoryUtil.memAddress(container), container);
    }

    public static VkComponentMapping create(long address) {
        return new VkComponentMapping(address, null);
    }

    public static VkComponentMapping createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkComponentMapping(address, null);
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

    public static VkComponentMapping malloc(MemoryStack stack) {
        return new VkComponentMapping(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkComponentMapping calloc(MemoryStack stack) {
        return new VkComponentMapping(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nr(long struct) {
        return MemoryUtil.memGetInt(struct + R);
    }

    public static int ng(long struct) {
        return MemoryUtil.memGetInt(struct + G);
    }

    public static int nb(long struct) {
        return MemoryUtil.memGetInt(struct + B);
    }

    public static int na(long struct) {
        return MemoryUtil.memGetInt(struct + A);
    }

    public static void nr(long struct, int value) {
        MemoryUtil.memPutInt(struct + R, value);
    }

    public static void ng(long struct, int value) {
        MemoryUtil.memPutInt(struct + G, value);
    }

    public static void nb(long struct, int value) {
        MemoryUtil.memPutInt(struct + B, value);
    }

    public static void na(long struct, int value) {
        MemoryUtil.memPutInt(struct + A, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComponentMapping$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComponentMapping$Buffer.class */
    public static class Buffer extends StructBuffer<VkComponentMapping, Buffer> implements NativeResource {
        private static final VkComponentMapping ELEMENT_FACTORY = VkComponentMapping.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkComponentMapping.SIZEOF);
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
        public VkComponentMapping getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkComponentSwizzle")
        public int r() {
            return VkComponentMapping.nr(address());
        }

        @NativeType("VkComponentSwizzle")
        public int g() {
            return VkComponentMapping.ng(address());
        }

        @NativeType("VkComponentSwizzle")
        public int b() {
            return VkComponentMapping.nb(address());
        }

        @NativeType("VkComponentSwizzle")
        public int a() {
            return VkComponentMapping.na(address());
        }

        public Buffer r(@NativeType("VkComponentSwizzle") int value) {
            VkComponentMapping.nr(address(), value);
            return this;
        }

        public Buffer g(@NativeType("VkComponentSwizzle") int value) {
            VkComponentMapping.ng(address(), value);
            return this;
        }

        public Buffer b(@NativeType("VkComponentSwizzle") int value) {
            VkComponentMapping.nb(address(), value);
            return this;
        }

        public Buffer a(@NativeType("VkComponentSwizzle") int value) {
            VkComponentMapping.na(address(), value);
            return this;
        }
    }
}
