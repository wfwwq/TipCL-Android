package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryDataInfoKHR.class */
public class VkPipelineBinaryDataInfoKHR extends Struct<VkPipelineBinaryDataInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEBINARY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINARY = layout.offsetof(2);
    }

    protected VkPipelineBinaryDataInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineBinaryDataInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineBinaryDataInfoKHR(address, container);
    }

    public VkPipelineBinaryDataInfoKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPipelineBinaryKHR")
    public long pipelineBinary() {
        return npipelineBinary(address());
    }

    public VkPipelineBinaryDataInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineBinaryDataInfoKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR);
    }

    public VkPipelineBinaryDataInfoKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineBinaryDataInfoKHR pipelineBinary(@NativeType("VkPipelineBinaryKHR") long value) {
        npipelineBinary(address(), value);
        return this;
    }

    public VkPipelineBinaryDataInfoKHR set(int sType, long pNext, long pipelineBinary) {
        sType(sType);
        pNext(pNext);
        pipelineBinary(pipelineBinary);
        return this;
    }

    public VkPipelineBinaryDataInfoKHR set(VkPipelineBinaryDataInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineBinaryDataInfoKHR malloc() {
        return new VkPipelineBinaryDataInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineBinaryDataInfoKHR calloc() {
        return new VkPipelineBinaryDataInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineBinaryDataInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryDataInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineBinaryDataInfoKHR create(long address) {
        return new VkPipelineBinaryDataInfoKHR(address, null);
    }

    public static VkPipelineBinaryDataInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineBinaryDataInfoKHR(address, null);
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

    public static VkPipelineBinaryDataInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryDataInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineBinaryDataInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryDataInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static long npipelineBinary(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINEBINARY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineBinary(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINEBINARY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryDataInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineBinaryDataInfoKHR, Buffer> implements NativeResource {
        private static final VkPipelineBinaryDataInfoKHR ELEMENT_FACTORY = VkPipelineBinaryDataInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineBinaryDataInfoKHR.SIZEOF);
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
        public VkPipelineBinaryDataInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineBinaryDataInfoKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPipelineBinaryDataInfoKHR.npNext(address());
        }

        @NativeType("VkPipelineBinaryKHR")
        public long pipelineBinary() {
            return VkPipelineBinaryDataInfoKHR.npipelineBinary(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineBinaryDataInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPipelineBinaryDataInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pipelineBinary(@NativeType("VkPipelineBinaryKHR") long value) {
            VkPipelineBinaryDataInfoKHR.npipelineBinary(address(), value);
            return this;
        }
    }
}
