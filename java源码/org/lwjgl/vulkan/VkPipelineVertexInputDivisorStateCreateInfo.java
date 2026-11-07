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
import org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfo.class */
public class VkPipelineVertexInputDivisorStateCreateInfo extends Struct<VkPipelineVertexInputDivisorStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXBINDINGDIVISORCOUNT;
    public static final int PVERTEXBINDINGDIVISORS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXBINDINGDIVISORCOUNT = layout.offsetof(2);
        PVERTEXBINDINGDIVISORS = layout.offsetof(3);
    }

    protected VkPipelineVertexInputDivisorStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineVertexInputDivisorStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(address, container);
    }

    public VkPipelineVertexInputDivisorStateCreateInfo(ByteBuffer container) {
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
    public int vertexBindingDivisorCount() {
        return nvertexBindingDivisorCount(address());
    }

    @NativeType("VkVertexInputBindingDivisorDescription const *")
    public VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors() {
        return npVertexBindingDivisors(address());
    }

    public VkPipelineVertexInputDivisorStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineVertexInputDivisorStateCreateInfo sType$Default() {
        return sType(1000190001);
    }

    public VkPipelineVertexInputDivisorStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) {
        npVertexBindingDivisors(address(), value);
        return this;
    }

    public VkPipelineVertexInputDivisorStateCreateInfo set(int sType, long pNext, VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors) {
        sType(sType);
        pNext(pNext);
        pVertexBindingDivisors(pVertexBindingDivisors);
        return this;
    }

    public VkPipelineVertexInputDivisorStateCreateInfo set(VkPipelineVertexInputDivisorStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo malloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo calloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineVertexInputDivisorStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo create(long address) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(address, null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineVertexInputDivisorStateCreateInfo(address, null);
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

    public static VkPipelineVertexInputDivisorStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvertexBindingDivisorCount(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXBINDINGDIVISORCOUNT);
    }

    public static VkVertexInputBindingDivisorDescription.Buffer npVertexBindingDivisors(long struct) {
        return VkVertexInputBindingDivisorDescription.create(MemoryUtil.memGetAddress(struct + PVERTEXBINDINGDIVISORS), nvertexBindingDivisorCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvertexBindingDivisorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXBINDINGDIVISORCOUNT, value);
    }

    public static void npVertexBindingDivisors(long struct, VkVertexInputBindingDivisorDescription.Buffer value) {
        MemoryUtil.memPutAddress(struct + PVERTEXBINDINGDIVISORS, value.address());
        nvertexBindingDivisorCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVERTEXBINDINGDIVISORS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineVertexInputDivisorStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineVertexInputDivisorStateCreateInfo ELEMENT_FACTORY = VkPipelineVertexInputDivisorStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF);
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
        public VkPipelineVertexInputDivisorStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineVertexInputDivisorStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineVertexInputDivisorStateCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int vertexBindingDivisorCount() {
            return VkPipelineVertexInputDivisorStateCreateInfo.nvertexBindingDivisorCount(address());
        }

        @NativeType("VkVertexInputBindingDivisorDescription const *")
        public VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors() {
            return VkPipelineVertexInputDivisorStateCreateInfo.npVertexBindingDivisors(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineVertexInputDivisorStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000190001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineVertexInputDivisorStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) {
            VkPipelineVertexInputDivisorStateCreateInfo.npVertexBindingDivisors(address(), value);
            return this;
        }
    }
}
