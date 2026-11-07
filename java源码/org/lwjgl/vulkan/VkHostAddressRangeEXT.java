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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostAddressRangeEXT.class */
public class VkHostAddressRangeEXT extends Struct<VkHostAddressRangeEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADDRESS;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    protected VkHostAddressRangeEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkHostAddressRangeEXT create(long address, ByteBuffer container) {
        return new VkHostAddressRangeEXT(address, container);
    }

    public VkHostAddressRangeEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public ByteBuffer address$() {
        return naddress$(address());
    }

    @NativeType("size_t")
    public long size() {
        return nsize(address());
    }

    public VkHostAddressRangeEXT address$(@NativeType("void *") ByteBuffer value) {
        naddress$(address(), value);
        return this;
    }

    public VkHostAddressRangeEXT set(VkHostAddressRangeEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkHostAddressRangeEXT malloc() {
        return new VkHostAddressRangeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkHostAddressRangeEXT calloc() {
        return new VkHostAddressRangeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkHostAddressRangeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostAddressRangeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkHostAddressRangeEXT create(long address) {
        return new VkHostAddressRangeEXT(address, null);
    }

    public static VkHostAddressRangeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkHostAddressRangeEXT(address, null);
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

    public static VkHostAddressRangeEXT malloc(MemoryStack stack) {
        return new VkHostAddressRangeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkHostAddressRangeEXT calloc(MemoryStack stack) {
        return new VkHostAddressRangeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer naddress$(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + ADDRESS), (int) nsize(struct));
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetAddress(struct + SIZE);
    }

    public static void naddress$(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + ADDRESS, MemoryUtil.memAddress(value));
        nsize(struct, value.remaining());
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SIZE, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + ADDRESS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostAddressRangeEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkHostAddressRangeEXT, Buffer> implements NativeResource {
        private static final VkHostAddressRangeEXT ELEMENT_FACTORY = VkHostAddressRangeEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkHostAddressRangeEXT.SIZEOF);
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
        public VkHostAddressRangeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public ByteBuffer address$() {
            return VkHostAddressRangeEXT.naddress$(address());
        }

        @NativeType("size_t")
        public long size() {
            return VkHostAddressRangeEXT.nsize(address());
        }

        public Buffer address$(@NativeType("void *") ByteBuffer value) {
            VkHostAddressRangeEXT.naddress$(address(), value);
            return this;
        }
    }
}
