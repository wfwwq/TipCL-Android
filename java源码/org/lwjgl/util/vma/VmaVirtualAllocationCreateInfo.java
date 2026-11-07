package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationCreateInfo.class */
public class VmaVirtualAllocationCreateInfo extends Struct<VmaVirtualAllocationCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SIZE;
    public static final int ALIGNMENT;
    public static final int FLAGS;
    public static final int PUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PUSERDATA = layout.offsetof(3);
    }

    protected VmaVirtualAllocationCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaVirtualAllocationCreateInfo create(long address, ByteBuffer container) {
        return new VmaVirtualAllocationCreateInfo(address, container);
    }

    public VmaVirtualAllocationCreateInfo(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long alignment() {
        return nalignment(address());
    }

    @NativeType("VmaVirtualAllocationCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    public VmaVirtualAllocationCreateInfo size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VmaVirtualAllocationCreateInfo alignment(@NativeType("VkDeviceSize") long value) {
        nalignment(address(), value);
        return this;
    }

    public VmaVirtualAllocationCreateInfo flags(@NativeType("VmaVirtualAllocationCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VmaVirtualAllocationCreateInfo pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VmaVirtualAllocationCreateInfo set(long size, long alignment, int flags, long pUserData) {
        size(size);
        alignment(alignment);
        flags(flags);
        pUserData(pUserData);
        return this;
    }

    public VmaVirtualAllocationCreateInfo set(VmaVirtualAllocationCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaVirtualAllocationCreateInfo malloc() {
        return new VmaVirtualAllocationCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaVirtualAllocationCreateInfo calloc() {
        return new VmaVirtualAllocationCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaVirtualAllocationCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaVirtualAllocationCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaVirtualAllocationCreateInfo create(long address) {
        return new VmaVirtualAllocationCreateInfo(address, null);
    }

    public static VmaVirtualAllocationCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaVirtualAllocationCreateInfo(address, null);
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

    public static VmaVirtualAllocationCreateInfo malloc(MemoryStack stack) {
        return new VmaVirtualAllocationCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaVirtualAllocationCreateInfo calloc(MemoryStack stack) {
        return new VmaVirtualAllocationCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nalignment(long struct) {
        return MemoryUtil.memGetLong(struct + ALIGNMENT);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nalignment(long struct, long value) {
        MemoryUtil.memPutLong(struct + ALIGNMENT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaVirtualAllocationCreateInfo, Buffer> implements NativeResource {
        private static final VmaVirtualAllocationCreateInfo ELEMENT_FACTORY = VmaVirtualAllocationCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaVirtualAllocationCreateInfo.SIZEOF);
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
        public VmaVirtualAllocationCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VmaVirtualAllocationCreateInfo.nsize(address());
        }

        @NativeType("VkDeviceSize")
        public long alignment() {
            return VmaVirtualAllocationCreateInfo.nalignment(address());
        }

        @NativeType("VmaVirtualAllocationCreateFlags")
        public int flags() {
            return VmaVirtualAllocationCreateInfo.nflags(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VmaVirtualAllocationCreateInfo.npUserData(address());
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VmaVirtualAllocationCreateInfo.nsize(address(), value);
            return this;
        }

        public Buffer alignment(@NativeType("VkDeviceSize") long value) {
            VmaVirtualAllocationCreateInfo.nalignment(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VmaVirtualAllocationCreateFlags") int value) {
            VmaVirtualAllocationCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VmaVirtualAllocationCreateInfo.npUserData(address(), value);
            return this;
        }
    }
}
