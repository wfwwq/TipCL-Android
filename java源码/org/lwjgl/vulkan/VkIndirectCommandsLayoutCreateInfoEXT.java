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
import org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutCreateInfoEXT.class */
public class VkIndirectCommandsLayoutCreateInfoEXT extends Struct<VkIndirectCommandsLayoutCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SHADERSTAGES;
    public static final int INDIRECTSTRIDE;
    public static final int PIPELINELAYOUT;
    public static final int TOKENCOUNT;
    public static final int PTOKENS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SHADERSTAGES = layout.offsetof(3);
        INDIRECTSTRIDE = layout.offsetof(4);
        PIPELINELAYOUT = layout.offsetof(5);
        TOKENCOUNT = layout.offsetof(6);
        PTOKENS = layout.offsetof(7);
    }

    protected VkIndirectCommandsLayoutCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsLayoutCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(address, container);
    }

    public VkIndirectCommandsLayoutCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkIndirectCommandsLayoutUsageFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkShaderStageFlags")
    public int shaderStages() {
        return nshaderStages(address());
    }

    @NativeType("uint32_t")
    public int indirectStride() {
        return nindirectStride(address());
    }

    @NativeType("VkPipelineLayout")
    public long pipelineLayout() {
        return npipelineLayout(address());
    }

    @NativeType("uint32_t")
    public int tokenCount() {
        return ntokenCount(address());
    }

    @NativeType("VkIndirectCommandsLayoutTokenEXT const *")
    public VkIndirectCommandsLayoutTokenEXT.Buffer pTokens() {
        return npTokens(address());
    }

    public VkIndirectCommandsLayoutCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT);
    }

    public VkIndirectCommandsLayoutCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT pNext(VkPipelineLayoutCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkIndirectCommandsLayoutCreateInfoEXT flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT shaderStages(@NativeType("VkShaderStageFlags") int value) {
        nshaderStages(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT indirectStride(@NativeType("uint32_t") int value) {
        nindirectStride(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayout(@NativeType("VkPipelineLayout") long value) {
        npipelineLayout(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT pTokens(@NativeType("VkIndirectCommandsLayoutTokenEXT const *") VkIndirectCommandsLayoutTokenEXT.Buffer value) {
        npTokens(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT set(int sType, long pNext, int flags, int shaderStages, int indirectStride, long pipelineLayout, VkIndirectCommandsLayoutTokenEXT.Buffer pTokens) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        shaderStages(shaderStages);
        indirectStride(indirectStride);
        pipelineLayout(pipelineLayout);
        pTokens(pTokens);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoEXT set(VkIndirectCommandsLayoutCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT malloc() {
        return new VkIndirectCommandsLayoutCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT calloc() {
        return new VkIndirectCommandsLayoutCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT create(long address) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(address, null);
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutCreateInfoEXT(address, null);
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

    public static VkIndirectCommandsLayoutCreateInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutCreateInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nshaderStages(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTAGES);
    }

    public static int nindirectStride(long struct) {
        return MemoryUtil.memGetInt(struct + INDIRECTSTRIDE);
    }

    public static long npipelineLayout(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINELAYOUT);
    }

    public static int ntokenCount(long struct) {
        return MemoryUtil.memGetInt(struct + TOKENCOUNT);
    }

    public static VkIndirectCommandsLayoutTokenEXT.Buffer npTokens(long struct) {
        return VkIndirectCommandsLayoutTokenEXT.create(MemoryUtil.memGetAddress(struct + PTOKENS), ntokenCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nshaderStages(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTAGES, value);
    }

    public static void nindirectStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDIRECTSTRIDE, value);
    }

    public static void npipelineLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINELAYOUT, value);
    }

    public static void ntokenCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TOKENCOUNT, value);
    }

    public static void npTokens(long struct, VkIndirectCommandsLayoutTokenEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PTOKENS, value.address());
        ntokenCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PTOKENS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkIndirectCommandsLayoutCreateInfoEXT ELEMENT_FACTORY = VkIndirectCommandsLayoutCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsLayoutCreateInfoEXT.SIZEOF);
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
        public VkIndirectCommandsLayoutCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectCommandsLayoutCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectCommandsLayoutCreateInfoEXT.npNext(address());
        }

        @NativeType("VkIndirectCommandsLayoutUsageFlagsEXT")
        public int flags() {
            return VkIndirectCommandsLayoutCreateInfoEXT.nflags(address());
        }

        @NativeType("VkShaderStageFlags")
        public int shaderStages() {
            return VkIndirectCommandsLayoutCreateInfoEXT.nshaderStages(address());
        }

        @NativeType("uint32_t")
        public int indirectStride() {
            return VkIndirectCommandsLayoutCreateInfoEXT.nindirectStride(address());
        }

        @NativeType("VkPipelineLayout")
        public long pipelineLayout() {
            return VkIndirectCommandsLayoutCreateInfoEXT.npipelineLayout(address());
        }

        @NativeType("uint32_t")
        public int tokenCount() {
            return VkIndirectCommandsLayoutCreateInfoEXT.ntokenCount(address());
        }

        @NativeType("VkIndirectCommandsLayoutTokenEXT const *")
        public VkIndirectCommandsLayoutTokenEXT.Buffer pTokens() {
            return VkIndirectCommandsLayoutCreateInfoEXT.npTokens(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectCommandsLayoutCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectCommandsLayoutCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineLayoutCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) {
            VkIndirectCommandsLayoutCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) {
            VkIndirectCommandsLayoutCreateInfoEXT.nshaderStages(address(), value);
            return this;
        }

        public Buffer indirectStride(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutCreateInfoEXT.nindirectStride(address(), value);
            return this;
        }

        public Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) {
            VkIndirectCommandsLayoutCreateInfoEXT.npipelineLayout(address(), value);
            return this;
        }

        public Buffer pTokens(@NativeType("VkIndirectCommandsLayoutTokenEXT const *") VkIndirectCommandsLayoutTokenEXT.Buffer value) {
            VkIndirectCommandsLayoutCreateInfoEXT.npTokens(address(), value);
            return this;
        }
    }
}
