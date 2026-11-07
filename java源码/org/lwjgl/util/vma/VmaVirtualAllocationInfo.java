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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationInfo.class */
public class VmaVirtualAllocationInfo extends Struct<VmaVirtualAllocationInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OFFSET;
    public static final int SIZE;
    public static final int PUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        PUSERDATA = layout.offsetof(2);
    }

    protected VmaVirtualAllocationInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaVirtualAllocationInfo create(long address, ByteBuffer container) {
        return new VmaVirtualAllocationInfo(address, container);
    }

    public VmaVirtualAllocationInfo(ByteBuffer container) {
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

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    public static VmaVirtualAllocationInfo malloc() {
        return new VmaVirtualAllocationInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaVirtualAllocationInfo calloc() {
        return new VmaVirtualAllocationInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaVirtualAllocationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaVirtualAllocationInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaVirtualAllocationInfo create(long address) {
        return new VmaVirtualAllocationInfo(address, null);
    }

    public static VmaVirtualAllocationInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaVirtualAllocationInfo(address, null);
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

    public static VmaVirtualAllocationInfo malloc(MemoryStack stack) {
        return new VmaVirtualAllocationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaVirtualAllocationInfo calloc(MemoryStack stack) {
        return new VmaVirtualAllocationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVirtualAllocationInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaVirtualAllocationInfo, Buffer> implements NativeResource {
        private static final VmaVirtualAllocationInfo ELEMENT_FACTORY = VmaVirtualAllocationInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaVirtualAllocationInfo.SIZEOF);
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
        public VmaVirtualAllocationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VmaVirtualAllocationInfo.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VmaVirtualAllocationInfo.nsize(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VmaVirtualAllocationInfo.npUserData(address());
        }
    }
}
