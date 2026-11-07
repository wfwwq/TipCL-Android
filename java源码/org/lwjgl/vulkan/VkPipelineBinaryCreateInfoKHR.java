package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryCreateInfoKHR.class */
public class VkPipelineBinaryCreateInfoKHR extends Struct<VkPipelineBinaryCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PKEYSANDDATAINFO;
    public static final int PIPELINE;
    public static final int PPIPELINECREATEINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PKEYSANDDATAINFO = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        PPIPELINECREATEINFO = layout.offsetof(4);
    }

    protected VkPipelineBinaryCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineBinaryCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineBinaryCreateInfoKHR(address, container);
    }

    public VkPipelineBinaryCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkPipelineBinaryKeysAndDataKHR const *")
    public VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() {
        return npKeysAndDataInfo(address());
    }

    @NativeType("VkPipeline")
    public long pipeline() {
        return npipeline(address());
    }

    @NativeType("VkPipelineCreateInfoKHR const *")
    public VkPipelineCreateInfoKHR pPipelineCreateInfo() {
        return npPipelineCreateInfo(address());
    }

    public VkPipelineBinaryCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineBinaryCreateInfoKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR);
    }

    public VkPipelineBinaryCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineBinaryCreateInfoKHR pKeysAndDataInfo(@NativeType("VkPipelineBinaryKeysAndDataKHR const *") VkPipelineBinaryKeysAndDataKHR value) {
        npKeysAndDataInfo(address(), value);
        return this;
    }

    public VkPipelineBinaryCreateInfoKHR pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkPipelineBinaryCreateInfoKHR pPipelineCreateInfo(@NativeType("VkPipelineCreateInfoKHR const *") VkPipelineCreateInfoKHR value) {
        npPipelineCreateInfo(address(), value);
        return this;
    }

    public VkPipelineBinaryCreateInfoKHR set(int sType, long pNext, VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo, long pipeline, VkPipelineCreateInfoKHR pPipelineCreateInfo) {
        sType(sType);
        pNext(pNext);
        pKeysAndDataInfo(pKeysAndDataInfo);
        pipeline(pipeline);
        pPipelineCreateInfo(pPipelineCreateInfo);
        return this;
    }

    public VkPipelineBinaryCreateInfoKHR set(VkPipelineBinaryCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineBinaryCreateInfoKHR malloc() {
        return new VkPipelineBinaryCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineBinaryCreateInfoKHR calloc() {
        return new VkPipelineBinaryCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineBinaryCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineBinaryCreateInfoKHR create(long address) {
        return new VkPipelineBinaryCreateInfoKHR(address, null);
    }

    public static VkPipelineBinaryCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineBinaryCreateInfoKHR(address, null);
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

    public static VkPipelineBinaryCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineBinaryCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPipelineBinaryKeysAndDataKHR npKeysAndDataInfo(long struct) {
        return VkPipelineBinaryKeysAndDataKHR.createSafe(MemoryUtil.memGetAddress(struct + PKEYSANDDATAINFO));
    }

    public static long npipeline(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINE);
    }

    public static VkPipelineCreateInfoKHR npPipelineCreateInfo(long struct) {
        return VkPipelineCreateInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PPIPELINECREATEINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npKeysAndDataInfo(long struct, VkPipelineBinaryKeysAndDataKHR value) {
        MemoryUtil.memPutAddress(struct + PKEYSANDDATAINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void npipeline(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINE, value);
    }

    public static void npPipelineCreateInfo(long struct, VkPipelineCreateInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PPIPELINECREATEINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        long pKeysAndDataInfo = MemoryUtil.memGetAddress(struct + PKEYSANDDATAINFO);
        if (pKeysAndDataInfo != 0) {
            VkPipelineBinaryKeysAndDataKHR.validate(pKeysAndDataInfo);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineBinaryCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkPipelineBinaryCreateInfoKHR ELEMENT_FACTORY = VkPipelineBinaryCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineBinaryCreateInfoKHR.SIZEOF);
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
        public VkPipelineBinaryCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineBinaryCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineBinaryCreateInfoKHR.npNext(address());
        }

        @NativeType("VkPipelineBinaryKeysAndDataKHR const *")
        public VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() {
            return VkPipelineBinaryCreateInfoKHR.npKeysAndDataInfo(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkPipelineBinaryCreateInfoKHR.npipeline(address());
        }

        @NativeType("VkPipelineCreateInfoKHR const *")
        public VkPipelineCreateInfoKHR pPipelineCreateInfo() {
            return VkPipelineBinaryCreateInfoKHR.npPipelineCreateInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineBinaryCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineBinaryCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pKeysAndDataInfo(@NativeType("VkPipelineBinaryKeysAndDataKHR const *") VkPipelineBinaryKeysAndDataKHR value) {
            VkPipelineBinaryCreateInfoKHR.npKeysAndDataInfo(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkPipelineBinaryCreateInfoKHR.npipeline(address(), value);
            return this;
        }

        public Buffer pPipelineCreateInfo(@NativeType("VkPipelineCreateInfoKHR const *") VkPipelineCreateInfoKHR value) {
            VkPipelineBinaryCreateInfoKHR.npPipelineCreateInfo(address(), value);
            return this;
        }
    }
}
