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
import org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsShaderGroupCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsShaderGroupCreateInfoNV.class */
public class VkGraphicsShaderGroupCreateInfoNV extends Struct<VkGraphicsShaderGroupCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STAGECOUNT;
    public static final int PSTAGES;
    public static final int PVERTEXINPUTSTATE;
    public static final int PTESSELLATIONSTATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGECOUNT = layout.offsetof(2);
        PSTAGES = layout.offsetof(3);
        PVERTEXINPUTSTATE = layout.offsetof(4);
        PTESSELLATIONSTATE = layout.offsetof(5);
    }

    protected VkGraphicsShaderGroupCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGraphicsShaderGroupCreateInfoNV create(long address, ByteBuffer container) {
        return new VkGraphicsShaderGroupCreateInfoNV(address, container);
    }

    public VkGraphicsShaderGroupCreateInfoNV(ByteBuffer container) {
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
    public int stageCount() {
        return nstageCount(address());
    }

    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() {
        return npStages(address());
    }

    @NativeType("VkPipelineVertexInputStateCreateInfo const *")
    public VkPipelineVertexInputStateCreateInfo pVertexInputState() {
        return npVertexInputState(address());
    }

    @NativeType("VkPipelineTessellationStateCreateInfo const *")
    public VkPipelineTessellationStateCreateInfo pTessellationState() {
        return npTessellationState(address());
    }

    public VkGraphicsShaderGroupCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGraphicsShaderGroupCreateInfoNV sType$Default() {
        return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV);
    }

    public VkGraphicsShaderGroupCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGraphicsShaderGroupCreateInfoNV pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
        npStages(address(), value);
        return this;
    }

    public VkGraphicsShaderGroupCreateInfoNV pVertexInputState(@NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) {
        npVertexInputState(address(), value);
        return this;
    }

    public VkGraphicsShaderGroupCreateInfoNV pTessellationState(@NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) {
        npTessellationState(address(), value);
        return this;
    }

    public VkGraphicsShaderGroupCreateInfoNV set(int sType, long pNext, VkPipelineShaderStageCreateInfo.Buffer pStages, VkPipelineVertexInputStateCreateInfo pVertexInputState, VkPipelineTessellationStateCreateInfo pTessellationState) {
        sType(sType);
        pNext(pNext);
        pStages(pStages);
        pVertexInputState(pVertexInputState);
        pTessellationState(pTessellationState);
        return this;
    }

    public VkGraphicsShaderGroupCreateInfoNV set(VkGraphicsShaderGroupCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGraphicsShaderGroupCreateInfoNV malloc() {
        return new VkGraphicsShaderGroupCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGraphicsShaderGroupCreateInfoNV calloc() {
        return new VkGraphicsShaderGroupCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGraphicsShaderGroupCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGraphicsShaderGroupCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGraphicsShaderGroupCreateInfoNV create(long address) {
        return new VkGraphicsShaderGroupCreateInfoNV(address, null);
    }

    public static VkGraphicsShaderGroupCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGraphicsShaderGroupCreateInfoNV(address, null);
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

    public static VkGraphicsShaderGroupCreateInfoNV malloc(MemoryStack stack) {
        return new VkGraphicsShaderGroupCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGraphicsShaderGroupCreateInfoNV calloc(MemoryStack stack) {
        return new VkGraphicsShaderGroupCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstageCount(long struct) {
        return MemoryUtil.memGetInt(struct + STAGECOUNT);
    }

    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) {
        return VkPipelineShaderStageCreateInfo.create(MemoryUtil.memGetAddress(struct + PSTAGES), nstageCount(struct));
    }

    public static VkPipelineVertexInputStateCreateInfo npVertexInputState(long struct) {
        return VkPipelineVertexInputStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PVERTEXINPUTSTATE));
    }

    public static VkPipelineTessellationStateCreateInfo npTessellationState(long struct) {
        return VkPipelineTessellationStateCreateInfo.createSafe(MemoryUtil.memGetAddress(struct + PTESSELLATIONSTATE));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstageCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGECOUNT, value);
    }

    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTAGES, value.address());
        nstageCount(struct, value.remaining());
    }

    public static void npVertexInputState(long struct, VkPipelineVertexInputStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PVERTEXINPUTSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void npTessellationState(long struct, VkPipelineTessellationStateCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PTESSELLATIONSTATE, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        long pStages = MemoryUtil.memGetAddress(struct + PSTAGES);
        Checks.check(pStages);
        validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        long pVertexInputState = MemoryUtil.memGetAddress(struct + PVERTEXINPUTSTATE);
        if (pVertexInputState != 0) {
            VkPipelineVertexInputStateCreateInfo.validate(pVertexInputState);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsShaderGroupCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGraphicsShaderGroupCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGraphicsShaderGroupCreateInfoNV, Buffer> implements NativeResource {
        private static final VkGraphicsShaderGroupCreateInfoNV ELEMENT_FACTORY = VkGraphicsShaderGroupCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGraphicsShaderGroupCreateInfoNV.SIZEOF);
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
        public VkGraphicsShaderGroupCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGraphicsShaderGroupCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGraphicsShaderGroupCreateInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int stageCount() {
            return VkGraphicsShaderGroupCreateInfoNV.nstageCount(address());
        }

        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() {
            return VkGraphicsShaderGroupCreateInfoNV.npStages(address());
        }

        @NativeType("VkPipelineVertexInputStateCreateInfo const *")
        public VkPipelineVertexInputStateCreateInfo pVertexInputState() {
            return VkGraphicsShaderGroupCreateInfoNV.npVertexInputState(address());
        }

        @NativeType("VkPipelineTessellationStateCreateInfo const *")
        public VkPipelineTessellationStateCreateInfo pTessellationState() {
            return VkGraphicsShaderGroupCreateInfoNV.npTessellationState(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGraphicsShaderGroupCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGraphicsShaderGroupCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
            VkGraphicsShaderGroupCreateInfoNV.npStages(address(), value);
            return this;
        }

        public Buffer pVertexInputState(@NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) {
            VkGraphicsShaderGroupCreateInfoNV.npVertexInputState(address(), value);
            return this;
        }

        public Buffer pTessellationState(@NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) {
            VkGraphicsShaderGroupCreateInfoNV.npTessellationState(address(), value);
            return this;
        }
    }
}
