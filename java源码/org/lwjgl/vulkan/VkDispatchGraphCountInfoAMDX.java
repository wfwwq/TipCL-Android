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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphCountInfoAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphCountInfoAMDX.class */
public class VkDispatchGraphCountInfoAMDX extends Struct<VkDispatchGraphCountInfoAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COUNT;
    public static final int INFOS;
    public static final int STRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(VkDeviceOrHostAddressConstAMDX.SIZEOF, VkDeviceOrHostAddressConstAMDX.ALIGNOF), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COUNT = layout.offsetof(0);
        INFOS = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
    }

    protected VkDispatchGraphCountInfoAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDispatchGraphCountInfoAMDX create(long address, ByteBuffer container) {
        return new VkDispatchGraphCountInfoAMDX(address, container);
    }

    public VkDispatchGraphCountInfoAMDX(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int count() {
        return ncount(address());
    }

    public VkDeviceOrHostAddressConstAMDX infos() {
        return ninfos(address());
    }

    @NativeType("uint64_t")
    public long stride() {
        return nstride(address());
    }

    public VkDispatchGraphCountInfoAMDX count(@NativeType("uint32_t") int value) {
        ncount(address(), value);
        return this;
    }

    public VkDispatchGraphCountInfoAMDX infos(VkDeviceOrHostAddressConstAMDX value) {
        ninfos(address(), value);
        return this;
    }

    public VkDispatchGraphCountInfoAMDX infos(Consumer<VkDeviceOrHostAddressConstAMDX> consumer) {
        consumer.accept(infos());
        return this;
    }

    public VkDispatchGraphCountInfoAMDX stride(@NativeType("uint64_t") long value) {
        nstride(address(), value);
        return this;
    }

    public VkDispatchGraphCountInfoAMDX set(int count, VkDeviceOrHostAddressConstAMDX infos, long stride) {
        count(count);
        infos(infos);
        stride(stride);
        return this;
    }

    public VkDispatchGraphCountInfoAMDX set(VkDispatchGraphCountInfoAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDispatchGraphCountInfoAMDX malloc() {
        return new VkDispatchGraphCountInfoAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDispatchGraphCountInfoAMDX calloc() {
        return new VkDispatchGraphCountInfoAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDispatchGraphCountInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchGraphCountInfoAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkDispatchGraphCountInfoAMDX create(long address) {
        return new VkDispatchGraphCountInfoAMDX(address, null);
    }

    public static VkDispatchGraphCountInfoAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDispatchGraphCountInfoAMDX(address, null);
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

    public static VkDispatchGraphCountInfoAMDX malloc(MemoryStack stack) {
        return new VkDispatchGraphCountInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDispatchGraphCountInfoAMDX calloc(MemoryStack stack) {
        return new VkDispatchGraphCountInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ncount(long struct) {
        return MemoryUtil.memGetInt(struct + COUNT);
    }

    public static VkDeviceOrHostAddressConstAMDX ninfos(long struct) {
        return VkDeviceOrHostAddressConstAMDX.create(struct + INFOS);
    }

    public static long nstride(long struct) {
        return MemoryUtil.memGetLong(struct + STRIDE);
    }

    public static void ncount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COUNT, value);
    }

    public static void ninfos(long struct, VkDeviceOrHostAddressConstAMDX value) {
        MemoryUtil.memCopy(value.address(), struct + INFOS, VkDeviceOrHostAddressConstAMDX.SIZEOF);
    }

    public static void nstride(long struct, long value) {
        MemoryUtil.memPutLong(struct + STRIDE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphCountInfoAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchGraphCountInfoAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkDispatchGraphCountInfoAMDX, Buffer> implements NativeResource {
        private static final VkDispatchGraphCountInfoAMDX ELEMENT_FACTORY = VkDispatchGraphCountInfoAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDispatchGraphCountInfoAMDX.SIZEOF);
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
        public VkDispatchGraphCountInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int count() {
            return VkDispatchGraphCountInfoAMDX.ncount(address());
        }

        public VkDeviceOrHostAddressConstAMDX infos() {
            return VkDispatchGraphCountInfoAMDX.ninfos(address());
        }

        @NativeType("uint64_t")
        public long stride() {
            return VkDispatchGraphCountInfoAMDX.nstride(address());
        }

        public Buffer count(@NativeType("uint32_t") int value) {
            VkDispatchGraphCountInfoAMDX.ncount(address(), value);
            return this;
        }

        public Buffer infos(VkDeviceOrHostAddressConstAMDX value) {
            VkDispatchGraphCountInfoAMDX.ninfos(address(), value);
            return this;
        }

        public Buffer infos(Consumer<VkDeviceOrHostAddressConstAMDX> consumer) {
            consumer.accept(infos());
            return this;
        }

        public Buffer stride(@NativeType("uint64_t") long value) {
            VkDispatchGraphCountInfoAMDX.nstride(address(), value);
            return this;
        }
    }
}
