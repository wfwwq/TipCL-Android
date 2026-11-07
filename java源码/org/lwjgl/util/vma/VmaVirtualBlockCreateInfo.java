package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkAllocationCallbacks;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualBlockCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualBlockCreateInfo.class */
public class VmaVirtualBlockCreateInfo extends Struct<VmaVirtualBlockCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SIZE;
    public static final int FLAGS;
    public static final int PALLOCATIONCALLBACKS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SIZE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        PALLOCATIONCALLBACKS = layout.offsetof(2);
    }

    protected VmaVirtualBlockCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaVirtualBlockCreateInfo create(long address, ByteBuffer container) {
        return new VmaVirtualBlockCreateInfo(address, container);
    }

    public VmaVirtualBlockCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VmaVirtualBlockCreateFlagBits")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkAllocationCallbacks const *")
    public VkAllocationCallbacks pAllocationCallbacks() {
        return npAllocationCallbacks(address());
    }

    public VmaVirtualBlockCreateInfo size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VmaVirtualBlockCreateInfo flags(@NativeType("VmaVirtualBlockCreateFlagBits") int value) {
        nflags(address(), value);
        return this;
    }

    public VmaVirtualBlockCreateInfo pAllocationCallbacks(@NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) {
        npAllocationCallbacks(address(), value);
        return this;
    }

    public VmaVirtualBlockCreateInfo set(long size, int flags, VkAllocationCallbacks pAllocationCallbacks) {
        size(size);
        flags(flags);
        pAllocationCallbacks(pAllocationCallbacks);
        return this;
    }

    public VmaVirtualBlockCreateInfo set(VmaVirtualBlockCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaVirtualBlockCreateInfo malloc() {
        return new VmaVirtualBlockCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaVirtualBlockCreateInfo calloc() {
        return new VmaVirtualBlockCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaVirtualBlockCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaVirtualBlockCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaVirtualBlockCreateInfo create(long address) {
        return new VmaVirtualBlockCreateInfo(address, null);
    }

    public static VmaVirtualBlockCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaVirtualBlockCreateInfo(address, null);
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

    public static VmaVirtualBlockCreateInfo malloc(MemoryStack stack) {
        return new VmaVirtualBlockCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaVirtualBlockCreateInfo calloc(MemoryStack stack) {
        return new VmaVirtualBlockCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static VkAllocationCallbacks npAllocationCallbacks(long struct) {
        return VkAllocationCallbacks.createSafe(MemoryUtil.memGetAddress(struct + PALLOCATIONCALLBACKS));
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void npAllocationCallbacks(long struct, VkAllocationCallbacks value) {
        MemoryUtil.memPutAddress(struct + PALLOCATIONCALLBACKS, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualBlockCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualBlockCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaVirtualBlockCreateInfo, Buffer> implements NativeResource {
        private static final VmaVirtualBlockCreateInfo ELEMENT_FACTORY = VmaVirtualBlockCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaVirtualBlockCreateInfo.SIZEOF);
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
        public VmaVirtualBlockCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VmaVirtualBlockCreateInfo.nsize(address());
        }

        @NativeType("VmaVirtualBlockCreateFlagBits")
        public int flags() {
            return VmaVirtualBlockCreateInfo.nflags(address());
        }

        @NativeType("VkAllocationCallbacks const *")
        public VkAllocationCallbacks pAllocationCallbacks() {
            return VmaVirtualBlockCreateInfo.npAllocationCallbacks(address());
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VmaVirtualBlockCreateInfo.nsize(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VmaVirtualBlockCreateFlagBits") int value) {
            VmaVirtualBlockCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pAllocationCallbacks(@NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) {
            VmaVirtualBlockCreateInfo.npAllocationCallbacks(address(), value);
            return this;
        }
    }
}
