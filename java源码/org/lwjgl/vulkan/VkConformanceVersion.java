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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersion.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersion.class */
public class VkConformanceVersion extends Struct<VkConformanceVersion> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAJOR;
    public static final int MINOR;
    public static final int SUBMINOR;
    public static final int PATCH;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(1), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAJOR = layout.offsetof(0);
        MINOR = layout.offsetof(1);
        SUBMINOR = layout.offsetof(2);
        PATCH = layout.offsetof(3);
    }

    protected VkConformanceVersion(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkConformanceVersion create(long address, ByteBuffer container) {
        return new VkConformanceVersion(address, container);
    }

    public VkConformanceVersion(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint8_t")
    public byte major() {
        return nmajor(address());
    }

    @NativeType("uint8_t")
    public byte minor() {
        return nminor(address());
    }

    @NativeType("uint8_t")
    public byte subminor() {
        return nsubminor(address());
    }

    @NativeType("uint8_t")
    public byte patch() {
        return npatch(address());
    }

    public VkConformanceVersion major(@NativeType("uint8_t") byte value) {
        nmajor(address(), value);
        return this;
    }

    public VkConformanceVersion minor(@NativeType("uint8_t") byte value) {
        nminor(address(), value);
        return this;
    }

    public VkConformanceVersion subminor(@NativeType("uint8_t") byte value) {
        nsubminor(address(), value);
        return this;
    }

    public VkConformanceVersion patch(@NativeType("uint8_t") byte value) {
        npatch(address(), value);
        return this;
    }

    public VkConformanceVersion set(byte major, byte minor, byte subminor, byte patch) {
        major(major);
        minor(minor);
        subminor(subminor);
        patch(patch);
        return this;
    }

    public VkConformanceVersion set(VkConformanceVersion src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkConformanceVersion malloc() {
        return new VkConformanceVersion(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkConformanceVersion calloc() {
        return new VkConformanceVersion(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkConformanceVersion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkConformanceVersion(MemoryUtil.memAddress(container), container);
    }

    public static VkConformanceVersion create(long address) {
        return new VkConformanceVersion(address, null);
    }

    public static VkConformanceVersion createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkConformanceVersion(address, null);
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

    public static VkConformanceVersion malloc(MemoryStack stack) {
        return new VkConformanceVersion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkConformanceVersion calloc(MemoryStack stack) {
        return new VkConformanceVersion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nmajor(long struct) {
        return MemoryUtil.memGetByte(struct + MAJOR);
    }

    public static byte nminor(long struct) {
        return MemoryUtil.memGetByte(struct + MINOR);
    }

    public static byte nsubminor(long struct) {
        return MemoryUtil.memGetByte(struct + SUBMINOR);
    }

    public static byte npatch(long struct) {
        return MemoryUtil.memGetByte(struct + PATCH);
    }

    public static void nmajor(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MAJOR, value);
    }

    public static void nminor(long struct, byte value) {
        MemoryUtil.memPutByte(struct + MINOR, value);
    }

    public static void nsubminor(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SUBMINOR, value);
    }

    public static void npatch(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PATCH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersion$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersion$Buffer.class */
    public static class Buffer extends StructBuffer<VkConformanceVersion, Buffer> implements NativeResource {
        private static final VkConformanceVersion ELEMENT_FACTORY = VkConformanceVersion.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkConformanceVersion.SIZEOF);
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
        public VkConformanceVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint8_t")
        public byte major() {
            return VkConformanceVersion.nmajor(address());
        }

        @NativeType("uint8_t")
        public byte minor() {
            return VkConformanceVersion.nminor(address());
        }

        @NativeType("uint8_t")
        public byte subminor() {
            return VkConformanceVersion.nsubminor(address());
        }

        @NativeType("uint8_t")
        public byte patch() {
            return VkConformanceVersion.npatch(address());
        }

        public Buffer major(@NativeType("uint8_t") byte value) {
            VkConformanceVersion.nmajor(address(), value);
            return this;
        }

        public Buffer minor(@NativeType("uint8_t") byte value) {
            VkConformanceVersion.nminor(address(), value);
            return this;
        }

        public Buffer subminor(@NativeType("uint8_t") byte value) {
            VkConformanceVersion.nsubminor(address(), value);
            return this;
        }

        public Buffer patch(@NativeType("uint8_t") byte value) {
            VkConformanceVersion.npatch(address(), value);
            return this;
        }
    }
}
