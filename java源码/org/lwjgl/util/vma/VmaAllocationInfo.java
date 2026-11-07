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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationInfo.class */
public class VmaAllocationInfo extends Struct<VmaAllocationInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MEMORYTYPE;
    public static final int DEVICEMEMORY;
    public static final int OFFSET;
    public static final int SIZE;
    public static final int PMAPPEDDATA;
    public static final int PUSERDATA;
    public static final int PNAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(8), __member(8), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MEMORYTYPE = layout.offsetof(0);
        DEVICEMEMORY = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        PMAPPEDDATA = layout.offsetof(4);
        PUSERDATA = layout.offsetof(5);
        PNAME = layout.offsetof(6);
    }

    protected VmaAllocationInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaAllocationInfo create(long address, ByteBuffer container) {
        return new VmaAllocationInfo(address, container);
    }

    public VmaAllocationInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int memoryType() {
        return nmemoryType(address());
    }

    @NativeType("VkDeviceMemory")
    public long deviceMemory() {
        return ndeviceMemory(address());
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
    public long pMappedData() {
        return npMappedData(address());
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    @NativeType("char const *")
    public ByteBuffer pName() {
        return npName(address());
    }

    @NativeType("char const *")
    public String pNameString() {
        return npNameString(address());
    }

    public static VmaAllocationInfo malloc() {
        return new VmaAllocationInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaAllocationInfo calloc() {
        return new VmaAllocationInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaAllocationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocationInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaAllocationInfo create(long address) {
        return new VmaAllocationInfo(address, null);
    }

    public static VmaAllocationInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaAllocationInfo(address, null);
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

    public static VmaAllocationInfo malloc(MemoryStack stack) {
        return new VmaAllocationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaAllocationInfo calloc(MemoryStack stack) {
        return new VmaAllocationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmemoryType(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPE);
    }

    public static long ndeviceMemory(long struct) {
        return MemoryUtil.memGetLong(struct + DEVICEMEMORY);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static long npMappedData(long struct) {
        return MemoryUtil.memGetAddress(struct + PMAPPEDDATA);
    }

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
    }

    public static ByteBuffer npName(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static String npNameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PNAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocationInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaAllocationInfo, Buffer> implements NativeResource {
        private static final VmaAllocationInfo ELEMENT_FACTORY = VmaAllocationInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaAllocationInfo.SIZEOF);
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
        public VmaAllocationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int memoryType() {
            return VmaAllocationInfo.nmemoryType(address());
        }

        @NativeType("VkDeviceMemory")
        public long deviceMemory() {
            return VmaAllocationInfo.ndeviceMemory(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VmaAllocationInfo.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VmaAllocationInfo.nsize(address());
        }

        @NativeType("void *")
        public long pMappedData() {
            return VmaAllocationInfo.npMappedData(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VmaAllocationInfo.npUserData(address());
        }

        @NativeType("char const *")
        public ByteBuffer pName() {
            return VmaAllocationInfo.npName(address());
        }

        @NativeType("char const *")
        public String pNameString() {
            return VmaAllocationInfo.npNameString(address());
        }
    }
}
