package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceAddressRangeEXT.class */
public class VkDeviceAddressRangeEXT extends Struct<VkDeviceAddressRangeEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADDRESS;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    protected VkDeviceAddressRangeEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceAddressRangeEXT create(long address, ByteBuffer container) {
        return new VkDeviceAddressRangeEXT(address, container);
    }

    public VkDeviceAddressRangeEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long address$() {
        return naddress$(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkDeviceAddressRangeEXT address$(@NativeType("VkDeviceAddress") long value) {
        naddress$(address(), value);
        return this;
    }

    public VkDeviceAddressRangeEXT size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkDeviceAddressRangeEXT set(long address$, long size) {
        address$(address$);
        size(size);
        return this;
    }

    public VkDeviceAddressRangeEXT set(VkDeviceAddressRangeEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceAddressRangeEXT malloc() {
        return new VkDeviceAddressRangeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceAddressRangeEXT calloc() {
        return new VkDeviceAddressRangeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceAddressRangeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceAddressRangeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceAddressRangeEXT create(long address) {
        return new VkDeviceAddressRangeEXT(address, null);
    }

    public static VkDeviceAddressRangeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceAddressRangeEXT(address, null);
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

    public static VkDeviceAddressRangeEXT malloc(MemoryStack stack) {
        return new VkDeviceAddressRangeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceAddressRangeEXT calloc(MemoryStack stack) {
        return new VkDeviceAddressRangeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long naddress$(long struct) {
        return MemoryUtil.memGetLong(struct + ADDRESS);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static void naddress$(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDRESS, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceAddressRangeEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceAddressRangeEXT, Buffer> implements NativeResource {
        private static final VkDeviceAddressRangeEXT ELEMENT_FACTORY = VkDeviceAddressRangeEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceAddressRangeEXT.SIZEOF);
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
        public VkDeviceAddressRangeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long address$() {
            return VkDeviceAddressRangeEXT.naddress$(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkDeviceAddressRangeEXT.nsize(address());
        }

        public Buffer address$(@NativeType("VkDeviceAddress") long value) {
            VkDeviceAddressRangeEXT.naddress$(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkDeviceAddressRangeEXT.nsize(address(), value);
            return this;
        }
    }
}
