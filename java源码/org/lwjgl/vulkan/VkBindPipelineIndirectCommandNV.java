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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindPipelineIndirectCommandNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindPipelineIndirectCommandNV.class */
public class VkBindPipelineIndirectCommandNV extends Struct<VkBindPipelineIndirectCommandNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PIPELINEADDRESS;

    static {
        Struct.Layout layout = __struct(__member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PIPELINEADDRESS = layout.offsetof(0);
    }

    protected VkBindPipelineIndirectCommandNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindPipelineIndirectCommandNV create(long address, ByteBuffer container) {
        return new VkBindPipelineIndirectCommandNV(address, container);
    }

    public VkBindPipelineIndirectCommandNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceAddress")
    public long pipelineAddress() {
        return npipelineAddress(address());
    }

    public VkBindPipelineIndirectCommandNV pipelineAddress(@NativeType("VkDeviceAddress") long value) {
        npipelineAddress(address(), value);
        return this;
    }

    public VkBindPipelineIndirectCommandNV set(VkBindPipelineIndirectCommandNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindPipelineIndirectCommandNV malloc() {
        return new VkBindPipelineIndirectCommandNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindPipelineIndirectCommandNV calloc() {
        return new VkBindPipelineIndirectCommandNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindPipelineIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindPipelineIndirectCommandNV(MemoryUtil.memAddress(container), container);
    }

    public static VkBindPipelineIndirectCommandNV create(long address) {
        return new VkBindPipelineIndirectCommandNV(address, null);
    }

    public static VkBindPipelineIndirectCommandNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindPipelineIndirectCommandNV(address, null);
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

    public static VkBindPipelineIndirectCommandNV malloc(MemoryStack stack) {
        return new VkBindPipelineIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindPipelineIndirectCommandNV calloc(MemoryStack stack) {
        return new VkBindPipelineIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long npipelineAddress(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINEADDRESS);
    }

    public static void npipelineAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINEADDRESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindPipelineIndirectCommandNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindPipelineIndirectCommandNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindPipelineIndirectCommandNV, Buffer> implements NativeResource {
        private static final VkBindPipelineIndirectCommandNV ELEMENT_FACTORY = VkBindPipelineIndirectCommandNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindPipelineIndirectCommandNV.SIZEOF);
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
        public VkBindPipelineIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceAddress")
        public long pipelineAddress() {
            return VkBindPipelineIndirectCommandNV.npipelineAddress(address());
        }

        public Buffer pipelineAddress(@NativeType("VkDeviceAddress") long value) {
            VkBindPipelineIndirectCommandNV.npipelineAddress(address(), value);
            return this;
        }
    }
}
