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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocatorInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocatorInfo.class */
public class VmaAllocatorInfo extends Struct<VmaAllocatorInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INSTANCE;
    public static final int PHYSICALDEVICE;
    public static final int DEVICE;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INSTANCE = layout.offsetof(0);
        PHYSICALDEVICE = layout.offsetof(1);
        DEVICE = layout.offsetof(2);
    }

    protected VmaAllocatorInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaAllocatorInfo create(long address, ByteBuffer container) {
        return new VmaAllocatorInfo(address, container);
    }

    public VmaAllocatorInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkInstance")
    public long instance() {
        return ninstance(address());
    }

    @NativeType("VkPhysicalDevice")
    public long physicalDevice() {
        return nphysicalDevice(address());
    }

    @NativeType("VkDevice")
    public long device() {
        return ndevice(address());
    }

    public static VmaAllocatorInfo malloc() {
        return new VmaAllocatorInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaAllocatorInfo calloc() {
        return new VmaAllocatorInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaAllocatorInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocatorInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaAllocatorInfo create(long address) {
        return new VmaAllocatorInfo(address, null);
    }

    public static VmaAllocatorInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaAllocatorInfo(address, null);
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

    public static VmaAllocatorInfo malloc(MemoryStack stack) {
        return new VmaAllocatorInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaAllocatorInfo calloc(MemoryStack stack) {
        return new VmaAllocatorInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ninstance(long struct) {
        return MemoryUtil.memGetAddress(struct + INSTANCE);
    }

    public static long nphysicalDevice(long struct) {
        return MemoryUtil.memGetAddress(struct + PHYSICALDEVICE);
    }

    public static long ndevice(long struct) {
        return MemoryUtil.memGetAddress(struct + DEVICE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocatorInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocatorInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaAllocatorInfo, Buffer> implements NativeResource {
        private static final VmaAllocatorInfo ELEMENT_FACTORY = VmaAllocatorInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaAllocatorInfo.SIZEOF);
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
        public VmaAllocatorInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkInstance")
        public long instance() {
            return VmaAllocatorInfo.ninstance(address());
        }

        @NativeType("VkPhysicalDevice")
        public long physicalDevice() {
            return VmaAllocatorInfo.nphysicalDevice(address());
        }

        @NativeType("VkDevice")
        public long device() {
            return VmaAllocatorInfo.ndevice(address());
        }
    }
}
