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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsStreamNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsStreamNV.class */
public class VkIndirectCommandsStreamNV extends Struct<VkIndirectCommandsStreamNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BUFFER;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected VkIndirectCommandsStreamNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsStreamNV create(long address, ByteBuffer container) {
        return new VkIndirectCommandsStreamNV(address, container);
    }

    public VkIndirectCommandsStreamNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    public VkIndirectCommandsStreamNV buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkIndirectCommandsStreamNV offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkIndirectCommandsStreamNV set(long buffer, long offset) {
        buffer(buffer);
        offset(offset);
        return this;
    }

    public VkIndirectCommandsStreamNV set(VkIndirectCommandsStreamNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsStreamNV malloc() {
        return new VkIndirectCommandsStreamNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsStreamNV calloc() {
        return new VkIndirectCommandsStreamNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsStreamNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsStreamNV(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsStreamNV create(long address) {
        return new VkIndirectCommandsStreamNV(address, null);
    }

    public static VkIndirectCommandsStreamNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsStreamNV(address, null);
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

    public static VkIndirectCommandsStreamNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsStreamNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsStreamNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsStreamNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsStreamNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsStreamNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsStreamNV, Buffer> implements NativeResource {
        private static final VkIndirectCommandsStreamNV ELEMENT_FACTORY = VkIndirectCommandsStreamNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsStreamNV.SIZEOF);
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
        public VkIndirectCommandsStreamNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkIndirectCommandsStreamNV.nbuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkIndirectCommandsStreamNV.noffset(address());
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkIndirectCommandsStreamNV.nbuffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkIndirectCommandsStreamNV.noffset(address(), value);
            return this;
        }
    }
}
