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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class */
public class VkPipelineShaderStageRequiredSubgroupSizeCreateInfo extends Struct<VkPipelineShaderStageRequiredSubgroupSizeCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int REQUIREDSUBGROUPSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REQUIREDSUBGROUPSIZE = layout.offsetof(2);
    }

    protected VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(address, container);
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(ByteBuffer container) {
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
    public int requiredSubgroupSize() {
        return nrequiredSubgroupSize(address());
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo sType$Default() {
        return sType(1000225001);
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo requiredSubgroupSize(@NativeType("uint32_t") int value) {
        nrequiredSubgroupSize(address(), value);
        return this;
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo set(int sType, long pNext, int requiredSubgroupSize) {
        sType(sType);
        pNext(pNext);
        requiredSubgroupSize(requiredSubgroupSize);
        return this;
    }

    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo set(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo malloc() {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo calloc() {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create(long address) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(address, null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(address, null);
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

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrequiredSubgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + REQUIREDSUBGROUPSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrequiredSubgroupSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + REQUIREDSUBGROUPSIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageRequiredSubgroupSizeCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageRequiredSubgroupSizeCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineShaderStageRequiredSubgroupSizeCreateInfo ELEMENT_FACTORY = VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.SIZEOF);
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
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int requiredSubgroupSize() {
            return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nrequiredSubgroupSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000225001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer requiredSubgroupSize(@NativeType("uint32_t") int value) {
            VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nrequiredSubgroupSize(address(), value);
            return this;
        }
    }
}
