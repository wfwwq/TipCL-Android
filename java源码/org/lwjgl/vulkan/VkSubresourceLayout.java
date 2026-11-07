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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout.class */
public class VkSubresourceLayout extends Struct<VkSubresourceLayout> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int SIZE;
    public static final int ROWPITCH;
    public static final int ARRAYPITCH;
    public static final int DEPTHPITCH;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        ROWPITCH = layout.offsetof(2);
        ARRAYPITCH = layout.offsetof(3);
        DEPTHPITCH = layout.offsetof(4);
    }

    protected VkSubresourceLayout(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubresourceLayout create(long address, ByteBuffer container) {
        return new VkSubresourceLayout(address, container);
    }

    public VkSubresourceLayout(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkDeviceSize")
    public long rowPitch() {
        return nrowPitch(address());
    }

    @NativeType("VkDeviceSize")
    public long arrayPitch() {
        return narrayPitch(address());
    }

    @NativeType("VkDeviceSize")
    public long depthPitch() {
        return ndepthPitch(address());
    }

    public VkSubresourceLayout offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkSubresourceLayout size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkSubresourceLayout rowPitch(@NativeType("VkDeviceSize") long value) {
        nrowPitch(address(), value);
        return this;
    }

    public VkSubresourceLayout arrayPitch(@NativeType("VkDeviceSize") long value) {
        narrayPitch(address(), value);
        return this;
    }

    public VkSubresourceLayout depthPitch(@NativeType("VkDeviceSize") long value) {
        ndepthPitch(address(), value);
        return this;
    }

    public VkSubresourceLayout set(long offset, long size, long rowPitch, long arrayPitch, long depthPitch) {
        offset(offset);
        size(size);
        rowPitch(rowPitch);
        arrayPitch(arrayPitch);
        depthPitch(depthPitch);
        return this;
    }

    public VkSubresourceLayout set(VkSubresourceLayout src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubresourceLayout malloc() {
        return new VkSubresourceLayout(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubresourceLayout calloc() {
        return new VkSubresourceLayout(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubresourceLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout(MemoryUtil.memAddress(container), container);
    }

    public static VkSubresourceLayout create(long address) {
        return new VkSubresourceLayout(address, null);
    }

    public static VkSubresourceLayout createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubresourceLayout(address, null);
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

    public static VkSubresourceLayout malloc(MemoryStack stack) {
        return new VkSubresourceLayout(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubresourceLayout calloc(MemoryStack stack) {
        return new VkSubresourceLayout(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static long nrowPitch(long struct) {
        return MemoryUtil.memGetLong(struct + ROWPITCH);
    }

    public static long narrayPitch(long struct) {
        return MemoryUtil.memGetLong(struct + ARRAYPITCH);
    }

    public static long ndepthPitch(long struct) {
        return MemoryUtil.memGetLong(struct + DEPTHPITCH);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nrowPitch(long struct, long value) {
        MemoryUtil.memPutLong(struct + ROWPITCH, value);
    }

    public static void narrayPitch(long struct, long value) {
        MemoryUtil.memPutLong(struct + ARRAYPITCH, value);
    }

    public static void ndepthPitch(long struct, long value) {
        MemoryUtil.memPutLong(struct + DEPTHPITCH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubresourceLayout, Buffer> implements NativeResource {
        private static final VkSubresourceLayout ELEMENT_FACTORY = VkSubresourceLayout.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubresourceLayout.SIZEOF);
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
        public VkSubresourceLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkSubresourceLayout.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkSubresourceLayout.nsize(address());
        }

        @NativeType("VkDeviceSize")
        public long rowPitch() {
            return VkSubresourceLayout.nrowPitch(address());
        }

        @NativeType("VkDeviceSize")
        public long arrayPitch() {
            return VkSubresourceLayout.narrayPitch(address());
        }

        @NativeType("VkDeviceSize")
        public long depthPitch() {
            return VkSubresourceLayout.ndepthPitch(address());
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkSubresourceLayout.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkSubresourceLayout.nsize(address(), value);
            return this;
        }

        public Buffer rowPitch(@NativeType("VkDeviceSize") long value) {
            VkSubresourceLayout.nrowPitch(address(), value);
            return this;
        }

        public Buffer arrayPitch(@NativeType("VkDeviceSize") long value) {
            VkSubresourceLayout.narrayPitch(address(), value);
            return this;
        }

        public Buffer depthPitch(@NativeType("VkDeviceSize") long value) {
            VkSubresourceLayout.ndepthPitch(address(), value);
            return this;
        }
    }
}
