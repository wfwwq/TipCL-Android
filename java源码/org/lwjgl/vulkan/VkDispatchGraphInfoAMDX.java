package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphInfoAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphInfoAMDX.class */
public class VkDispatchGraphInfoAMDX extends Struct<VkDispatchGraphInfoAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NODEINDEX;
    public static final int PAYLOADCOUNT;
    public static final int PAYLOADS;
    public static final int PAYLOADSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(VkDeviceOrHostAddressConstAMDX.SIZEOF, VkDeviceOrHostAddressConstAMDX.ALIGNOF), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NODEINDEX = layout.offsetof(0);
        PAYLOADCOUNT = layout.offsetof(1);
        PAYLOADS = layout.offsetof(2);
        PAYLOADSTRIDE = layout.offsetof(3);
    }

    protected VkDispatchGraphInfoAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDispatchGraphInfoAMDX create(long address, ByteBuffer container) {
        return new VkDispatchGraphInfoAMDX(address, container);
    }

    public VkDispatchGraphInfoAMDX(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int nodeIndex() {
        return nnodeIndex(address());
    }

    @NativeType("uint32_t")
    public int payloadCount() {
        return npayloadCount(address());
    }

    public VkDeviceOrHostAddressConstAMDX payloads() {
        return npayloads(address());
    }

    @NativeType("uint64_t")
    public long payloadStride() {
        return npayloadStride(address());
    }

    public VkDispatchGraphInfoAMDX nodeIndex(@NativeType("uint32_t") int value) {
        nnodeIndex(address(), value);
        return this;
    }

    public VkDispatchGraphInfoAMDX payloadCount(@NativeType("uint32_t") int value) {
        npayloadCount(address(), value);
        return this;
    }

    public VkDispatchGraphInfoAMDX payloads(VkDeviceOrHostAddressConstAMDX value) {
        npayloads(address(), value);
        return this;
    }

    public VkDispatchGraphInfoAMDX payloads(Consumer<VkDeviceOrHostAddressConstAMDX> consumer) {
        consumer.accept(payloads());
        return this;
    }

    public VkDispatchGraphInfoAMDX payloadStride(@NativeType("uint64_t") long value) {
        npayloadStride(address(), value);
        return this;
    }

    public VkDispatchGraphInfoAMDX set(int nodeIndex, int payloadCount, VkDeviceOrHostAddressConstAMDX payloads, long payloadStride) {
        nodeIndex(nodeIndex);
        payloadCount(payloadCount);
        payloads(payloads);
        payloadStride(payloadStride);
        return this;
    }

    public VkDispatchGraphInfoAMDX set(VkDispatchGraphInfoAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDispatchGraphInfoAMDX malloc() {
        return new VkDispatchGraphInfoAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDispatchGraphInfoAMDX calloc() {
        return new VkDispatchGraphInfoAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDispatchGraphInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchGraphInfoAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkDispatchGraphInfoAMDX create(long address) {
        return new VkDispatchGraphInfoAMDX(address, null);
    }

    public static VkDispatchGraphInfoAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDispatchGraphInfoAMDX(address, null);
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

    public static VkDispatchGraphInfoAMDX malloc(MemoryStack stack) {
        return new VkDispatchGraphInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDispatchGraphInfoAMDX calloc(MemoryStack stack) {
        return new VkDispatchGraphInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nnodeIndex(long struct) {
        return MemoryUtil.memGetInt(struct + NODEINDEX);
    }

    public static int npayloadCount(long struct) {
        return MemoryUtil.memGetInt(struct + PAYLOADCOUNT);
    }

    public static VkDeviceOrHostAddressConstAMDX npayloads(long struct) {
        return VkDeviceOrHostAddressConstAMDX.create(struct + PAYLOADS);
    }

    public static long npayloadStride(long struct) {
        return MemoryUtil.memGetLong(struct + PAYLOADSTRIDE);
    }

    public static void nnodeIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + NODEINDEX, value);
    }

    public static void npayloadCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PAYLOADCOUNT, value);
    }

    public static void npayloads(long struct, VkDeviceOrHostAddressConstAMDX value) {
        MemoryUtil.memCopy(value.address(), struct + PAYLOADS, VkDeviceOrHostAddressConstAMDX.SIZEOF);
    }

    public static void npayloadStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + PAYLOADSTRIDE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphInfoAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphInfoAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkDispatchGraphInfoAMDX, Buffer> implements NativeResource {
        private static final VkDispatchGraphInfoAMDX ELEMENT_FACTORY = VkDispatchGraphInfoAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDispatchGraphInfoAMDX.SIZEOF);
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
        public VkDispatchGraphInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int nodeIndex() {
            return VkDispatchGraphInfoAMDX.nnodeIndex(address());
        }

        @NativeType("uint32_t")
        public int payloadCount() {
            return VkDispatchGraphInfoAMDX.npayloadCount(address());
        }

        public VkDeviceOrHostAddressConstAMDX payloads() {
            return VkDispatchGraphInfoAMDX.npayloads(address());
        }

        @NativeType("uint64_t")
        public long payloadStride() {
            return VkDispatchGraphInfoAMDX.npayloadStride(address());
        }

        public Buffer nodeIndex(@NativeType("uint32_t") int value) {
            VkDispatchGraphInfoAMDX.nnodeIndex(address(), value);
            return this;
        }

        public Buffer payloadCount(@NativeType("uint32_t") int value) {
            VkDispatchGraphInfoAMDX.npayloadCount(address(), value);
            return this;
        }

        public Buffer payloads(VkDeviceOrHostAddressConstAMDX value) {
            VkDispatchGraphInfoAMDX.npayloads(address(), value);
            return this;
        }

        public Buffer payloads(Consumer<VkDeviceOrHostAddressConstAMDX> consumer) {
            consumer.accept(payloads());
            return this;
        }

        public Buffer payloadStride(@NativeType("uint64_t") long value) {
            VkDispatchGraphInfoAMDX.npayloadStride(address(), value);
            return this;
        }
    }
}
