package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryDataKHR.class */
public class VkPipelineBinaryDataKHR extends Struct<VkPipelineBinaryDataKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DATASIZE;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DATASIZE = layout.offsetof(0);
        PDATA = layout.offsetof(1);
    }

    protected VkPipelineBinaryDataKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineBinaryDataKHR create(long address, ByteBuffer container) {
        return new VkPipelineBinaryDataKHR(address, container);
    }

    public VkPipelineBinaryDataKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("size_t")
    public long dataSize() {
        return ndataSize(address());
    }

    @NativeType("void *")
    public ByteBuffer pData() {
        return npData(address());
    }

    public VkPipelineBinaryDataKHR pData(@NativeType("void *") ByteBuffer value) {
        npData(address(), value);
        return this;
    }

    public VkPipelineBinaryDataKHR set(VkPipelineBinaryDataKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineBinaryDataKHR malloc() {
        return new VkPipelineBinaryDataKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineBinaryDataKHR calloc() {
        return new VkPipelineBinaryDataKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineBinaryDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryDataKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineBinaryDataKHR create(long address) {
        return new VkPipelineBinaryDataKHR(address, null);
    }

    public static VkPipelineBinaryDataKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineBinaryDataKHR(address, null);
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

    public static VkPipelineBinaryDataKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineBinaryDataKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ndataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + DATASIZE);
    }

    public static ByteBuffer npData(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PDATA), (int) ndataSize(struct));
    }

    public static void ndataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATASIZE, value);
    }

    public static void npData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PDATA, MemoryUtil.memAddress(value));
        ndataSize(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryDataKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineBinaryDataKHR, Buffer> implements NativeResource {
        private static final VkPipelineBinaryDataKHR ELEMENT_FACTORY = VkPipelineBinaryDataKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineBinaryDataKHR.SIZEOF);
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
        public VkPipelineBinaryDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("size_t")
        public long dataSize() {
            return VkPipelineBinaryDataKHR.ndataSize(address());
        }

        @NativeType("void *")
        public ByteBuffer pData() {
            return VkPipelineBinaryDataKHR.npData(address());
        }

        public Buffer pData(@NativeType("void *") ByteBuffer value) {
            VkPipelineBinaryDataKHR.npData(address(), value);
            return this;
        }
    }
}
