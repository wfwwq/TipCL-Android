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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationMapEntry.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationMapEntry.class */
public class VkSpecializationMapEntry extends Struct<VkSpecializationMapEntry> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CONSTANTID;
    public static final int OFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CONSTANTID = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkSpecializationMapEntry(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSpecializationMapEntry create(long address, ByteBuffer container) {
        return new VkSpecializationMapEntry(address, container);
    }

    public VkSpecializationMapEntry(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int constantID() {
        return nconstantID(address());
    }

    @NativeType("uint32_t")
    public int offset() {
        return noffset(address());
    }

    @NativeType("size_t")
    public long size() {
        return nsize(address());
    }

    public VkSpecializationMapEntry constantID(@NativeType("uint32_t") int value) {
        nconstantID(address(), value);
        return this;
    }

    public VkSpecializationMapEntry offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkSpecializationMapEntry size(@NativeType("size_t") long value) {
        nsize(address(), value);
        return this;
    }

    public VkSpecializationMapEntry set(int constantID, int offset, long size) {
        constantID(constantID);
        offset(offset);
        size(size);
        return this;
    }

    public VkSpecializationMapEntry set(VkSpecializationMapEntry src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSpecializationMapEntry malloc() {
        return new VkSpecializationMapEntry(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSpecializationMapEntry calloc() {
        return new VkSpecializationMapEntry(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSpecializationMapEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSpecializationMapEntry(MemoryUtil.memAddress(container), container);
    }

    public static VkSpecializationMapEntry create(long address) {
        return new VkSpecializationMapEntry(address, null);
    }

    public static VkSpecializationMapEntry createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSpecializationMapEntry(address, null);
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

    public static VkSpecializationMapEntry malloc(MemoryStack stack) {
        return new VkSpecializationMapEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSpecializationMapEntry calloc(MemoryStack stack) {
        return new VkSpecializationMapEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nconstantID(long struct) {
        return MemoryUtil.memGetInt(struct + CONSTANTID);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetAddress(struct + SIZE);
    }

    public static void nconstantID(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSTANTID, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationMapEntry$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationMapEntry$Buffer.class */
    public static class Buffer extends StructBuffer<VkSpecializationMapEntry, Buffer> implements NativeResource {
        private static final VkSpecializationMapEntry ELEMENT_FACTORY = VkSpecializationMapEntry.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSpecializationMapEntry.SIZEOF);
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
        public VkSpecializationMapEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int constantID() {
            return VkSpecializationMapEntry.nconstantID(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkSpecializationMapEntry.noffset(address());
        }

        @NativeType("size_t")
        public long size() {
            return VkSpecializationMapEntry.nsize(address());
        }

        public Buffer constantID(@NativeType("uint32_t") int value) {
            VkSpecializationMapEntry.nconstantID(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkSpecializationMapEntry.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("size_t") long value) {
            VkSpecializationMapEntry.nsize(address(), value);
            return this;
        }
    }
}
