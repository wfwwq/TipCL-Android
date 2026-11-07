package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryInfoKHR.class */
public class VkPipelineBinaryInfoKHR extends Struct<VkPipelineBinaryInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BINARYCOUNT;
    public static final int PPIPELINEBINARIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BINARYCOUNT = layout.offsetof(2);
        PPIPELINEBINARIES = layout.offsetof(3);
    }

    protected VkPipelineBinaryInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineBinaryInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineBinaryInfoKHR(address, container);
    }

    public VkPipelineBinaryInfoKHR(ByteBuffer container) {
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
    public int binaryCount() {
        return nbinaryCount(address());
    }

    @NativeType("VkPipelineBinaryKHR const *")
    public LongBuffer pPipelineBinaries() {
        return npPipelineBinaries(address());
    }

    public VkPipelineBinaryInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineBinaryInfoKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR);
    }

    public VkPipelineBinaryInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineBinaryInfoKHR pPipelineBinaries(@NativeType("VkPipelineBinaryKHR const *") LongBuffer value) {
        npPipelineBinaries(address(), value);
        return this;
    }

    public VkPipelineBinaryInfoKHR set(int sType, long pNext, LongBuffer pPipelineBinaries) {
        sType(sType);
        pNext(pNext);
        pPipelineBinaries(pPipelineBinaries);
        return this;
    }

    public VkPipelineBinaryInfoKHR set(VkPipelineBinaryInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineBinaryInfoKHR malloc() {
        return new VkPipelineBinaryInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineBinaryInfoKHR calloc() {
        return new VkPipelineBinaryInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineBinaryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineBinaryInfoKHR create(long address) {
        return new VkPipelineBinaryInfoKHR(address, null);
    }

    public static VkPipelineBinaryInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineBinaryInfoKHR(address, null);
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

    public static VkPipelineBinaryInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineBinaryInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nbinaryCount(long struct) {
        return MemoryUtil.memGetInt(struct + BINARYCOUNT);
    }

    public static LongBuffer npPipelineBinaries(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PPIPELINEBINARIES), nbinaryCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbinaryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINARYCOUNT, value);
    }

    public static void npPipelineBinaries(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PPIPELINEBINARIES, MemoryUtil.memAddressSafe(value));
        nbinaryCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nbinaryCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPIPELINEBINARIES));
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineBinaryInfoKHR, Buffer> implements NativeResource {
        private static final VkPipelineBinaryInfoKHR ELEMENT_FACTORY = VkPipelineBinaryInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineBinaryInfoKHR.SIZEOF);
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
        public VkPipelineBinaryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineBinaryInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineBinaryInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int binaryCount() {
            return VkPipelineBinaryInfoKHR.nbinaryCount(address());
        }

        @NativeType("VkPipelineBinaryKHR const *")
        public LongBuffer pPipelineBinaries() {
            return VkPipelineBinaryInfoKHR.npPipelineBinaries(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineBinaryInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineBinaryInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pPipelineBinaries(@NativeType("VkPipelineBinaryKHR const *") LongBuffer value) {
            VkPipelineBinaryInfoKHR.npPipelineBinaries(address(), value);
            return this;
        }
    }
}
