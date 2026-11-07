package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryHandlesInfoKHR.class */
public class VkPipelineBinaryHandlesInfoKHR extends Struct<VkPipelineBinaryHandlesInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEBINARYCOUNT;
    public static final int PPIPELINEBINARIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINARYCOUNT = layout.offsetof(2);
        PPIPELINEBINARIES = layout.offsetof(3);
    }

    protected VkPipelineBinaryHandlesInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineBinaryHandlesInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineBinaryHandlesInfoKHR(address, container);
    }

    public VkPipelineBinaryHandlesInfoKHR(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int pipelineBinaryCount() {
        return npipelineBinaryCount(address());
    }

    @NativeType("VkPipelineBinaryKHR *")
    public LongBuffer pPipelineBinaries() {
        return npPipelineBinaries(address());
    }

    public VkPipelineBinaryHandlesInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineBinaryHandlesInfoKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR);
    }

    public VkPipelineBinaryHandlesInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineBinaryHandlesInfoKHR pipelineBinaryCount(@NativeType("uint32_t") int value) {
        npipelineBinaryCount(address(), value);
        return this;
    }

    public VkPipelineBinaryHandlesInfoKHR pPipelineBinaries(@NativeType("VkPipelineBinaryKHR *") LongBuffer value) {
        npPipelineBinaries(address(), value);
        return this;
    }

    public VkPipelineBinaryHandlesInfoKHR set(int sType, long pNext, int pipelineBinaryCount, LongBuffer pPipelineBinaries) {
        sType(sType);
        pNext(pNext);
        pipelineBinaryCount(pipelineBinaryCount);
        pPipelineBinaries(pPipelineBinaries);
        return this;
    }

    public VkPipelineBinaryHandlesInfoKHR set(VkPipelineBinaryHandlesInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineBinaryHandlesInfoKHR malloc() {
        return new VkPipelineBinaryHandlesInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineBinaryHandlesInfoKHR calloc() {
        return new VkPipelineBinaryHandlesInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineBinaryHandlesInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryHandlesInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineBinaryHandlesInfoKHR create(long address) {
        return new VkPipelineBinaryHandlesInfoKHR(address, null);
    }

    public static VkPipelineBinaryHandlesInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineBinaryHandlesInfoKHR(address, null);
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

    public static VkPipelineBinaryHandlesInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryHandlesInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineBinaryHandlesInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryHandlesInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineBinaryCount(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINARYCOUNT);
    }

    public static LongBuffer npPipelineBinaries(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PPIPELINEBINARIES), npipelineBinaryCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineBinaryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEBINARYCOUNT, value);
    }

    public static void npPipelineBinaries(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PPIPELINEBINARIES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            npipelineBinaryCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryHandlesInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineBinaryHandlesInfoKHR, Buffer> implements NativeResource {
        private static final VkPipelineBinaryHandlesInfoKHR ELEMENT_FACTORY = VkPipelineBinaryHandlesInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineBinaryHandlesInfoKHR.SIZEOF);
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
        public VkPipelineBinaryHandlesInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineBinaryHandlesInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineBinaryHandlesInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int pipelineBinaryCount() {
            return VkPipelineBinaryHandlesInfoKHR.npipelineBinaryCount(address());
        }

        @NativeType("VkPipelineBinaryKHR *")
        public LongBuffer pPipelineBinaries() {
            return VkPipelineBinaryHandlesInfoKHR.npPipelineBinaries(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineBinaryHandlesInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineBinaryHandlesInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pipelineBinaryCount(@NativeType("uint32_t") int value) {
            VkPipelineBinaryHandlesInfoKHR.npipelineBinaryCount(address(), value);
            return this;
        }

        public Buffer pPipelineBinaries(@NativeType("VkPipelineBinaryKHR *") LongBuffer value) {
            VkPipelineBinaryHandlesInfoKHR.npPipelineBinaries(address(), value);
            return this;
        }
    }
}
