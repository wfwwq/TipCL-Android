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
import org.lwjgl.vulkan.VkIndirectExecutionSetShaderLayoutInfoEXT;
import org.lwjgl.vulkan.VkPushConstantRange;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetShaderInfoEXT.class */
public class VkIndirectExecutionSetShaderInfoEXT extends Struct<VkIndirectExecutionSetShaderInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERCOUNT;
    public static final int PINITIALSHADERS;
    public static final int PSETLAYOUTINFOS;
    public static final int MAXSHADERCOUNT;
    public static final int PUSHCONSTANTRANGECOUNT;
    public static final int PPUSHCONSTANTRANGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOUNT = layout.offsetof(2);
        PINITIALSHADERS = layout.offsetof(3);
        PSETLAYOUTINFOS = layout.offsetof(4);
        MAXSHADERCOUNT = layout.offsetof(5);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(6);
        PPUSHCONSTANTRANGES = layout.offsetof(7);
    }

    protected VkIndirectExecutionSetShaderInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectExecutionSetShaderInfoEXT create(long address, ByteBuffer container) {
        return new VkIndirectExecutionSetShaderInfoEXT(address, container);
    }

    public VkIndirectExecutionSetShaderInfoEXT(ByteBuffer container) {
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
    public int shaderCount() {
        return nshaderCount(address());
    }

    @NativeType("VkShaderEXT const *")
    public LongBuffer pInitialShaders() {
        return npInitialShaders(address());
    }

    @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *")
    public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pSetLayoutInfos() {
        return npSetLayoutInfos(address());
    }

    @NativeType("uint32_t")
    public int maxShaderCount() {
        return nmaxShaderCount(address());
    }

    @NativeType("uint32_t")
    public int pushConstantRangeCount() {
        return npushConstantRangeCount(address());
    }

    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.Buffer pPushConstantRanges() {
        return npPushConstantRanges(address());
    }

    public VkIndirectExecutionSetShaderInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT);
    }

    public VkIndirectExecutionSetShaderInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT shaderCount(@NativeType("uint32_t") int value) {
        nshaderCount(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT pInitialShaders(@NativeType("VkShaderEXT const *") LongBuffer value) {
        npInitialShaders(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfos(@NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *") VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer value) {
        npSetLayoutInfos(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT maxShaderCount(@NativeType("uint32_t") int value) {
        nmaxShaderCount(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) {
        npPushConstantRanges(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT set(int sType, long pNext, int shaderCount, LongBuffer pInitialShaders, VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pSetLayoutInfos, int maxShaderCount, VkPushConstantRange.Buffer pPushConstantRanges) {
        sType(sType);
        pNext(pNext);
        shaderCount(shaderCount);
        pInitialShaders(pInitialShaders);
        pSetLayoutInfos(pSetLayoutInfos);
        maxShaderCount(maxShaderCount);
        pPushConstantRanges(pPushConstantRanges);
        return this;
    }

    public VkIndirectExecutionSetShaderInfoEXT set(VkIndirectExecutionSetShaderInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectExecutionSetShaderInfoEXT malloc() {
        return new VkIndirectExecutionSetShaderInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectExecutionSetShaderInfoEXT calloc() {
        return new VkIndirectExecutionSetShaderInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectExecutionSetShaderInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetShaderInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectExecutionSetShaderInfoEXT create(long address) {
        return new VkIndirectExecutionSetShaderInfoEXT(address, null);
    }

    public static VkIndirectExecutionSetShaderInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectExecutionSetShaderInfoEXT(address, null);
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

    public static VkIndirectExecutionSetShaderInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectExecutionSetShaderInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderCount(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERCOUNT);
    }

    public static LongBuffer npInitialShaders(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PINITIALSHADERS), nshaderCount(struct));
    }

    public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer npSetLayoutInfos(long struct) {
        return VkIndirectExecutionSetShaderLayoutInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PSETLAYOUTINFOS), nshaderCount(struct));
    }

    public static int nmaxShaderCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSHADERCOUNT);
    }

    public static int npushConstantRangeCount(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHCONSTANTRANGECOUNT);
    }

    public static VkPushConstantRange.Buffer npPushConstantRanges(long struct) {
        return VkPushConstantRange.createSafe(MemoryUtil.memGetAddress(struct + PPUSHCONSTANTRANGES), npushConstantRangeCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERCOUNT, value);
    }

    public static void npInitialShaders(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PINITIALSHADERS, MemoryUtil.memAddress(value));
    }

    public static void npSetLayoutInfos(long struct, VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSETLAYOUTINFOS, MemoryUtil.memAddressSafe(value));
    }

    public static void nmaxShaderCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSHADERCOUNT, value);
    }

    public static void npushConstantRangeCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHCONSTANTRANGECOUNT, value);
    }

    public static void npPushConstantRanges(long struct, VkPushConstantRange.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPUSHCONSTANTRANGES, MemoryUtil.memAddressSafe(value));
        npushConstantRangeCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PINITIALSHADERS));
        if (npushConstantRangeCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPUSHCONSTANTRANGES));
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetShaderInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetShaderInfoEXT, Buffer> implements NativeResource {
        private static final VkIndirectExecutionSetShaderInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetShaderInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectExecutionSetShaderInfoEXT.SIZEOF);
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
        public VkIndirectExecutionSetShaderInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectExecutionSetShaderInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectExecutionSetShaderInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int shaderCount() {
            return VkIndirectExecutionSetShaderInfoEXT.nshaderCount(address());
        }

        @NativeType("VkShaderEXT const *")
        public LongBuffer pInitialShaders() {
            return VkIndirectExecutionSetShaderInfoEXT.npInitialShaders(address());
        }

        @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *")
        public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pSetLayoutInfos() {
            return VkIndirectExecutionSetShaderInfoEXT.npSetLayoutInfos(address());
        }

        @NativeType("uint32_t")
        public int maxShaderCount() {
            return VkIndirectExecutionSetShaderInfoEXT.nmaxShaderCount(address());
        }

        @NativeType("uint32_t")
        public int pushConstantRangeCount() {
            return VkIndirectExecutionSetShaderInfoEXT.npushConstantRangeCount(address());
        }

        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.Buffer pPushConstantRanges() {
            return VkIndirectExecutionSetShaderInfoEXT.npPushConstantRanges(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectExecutionSetShaderInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectExecutionSetShaderInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderCount(@NativeType("uint32_t") int value) {
            VkIndirectExecutionSetShaderInfoEXT.nshaderCount(address(), value);
            return this;
        }

        public Buffer pInitialShaders(@NativeType("VkShaderEXT const *") LongBuffer value) {
            VkIndirectExecutionSetShaderInfoEXT.npInitialShaders(address(), value);
            return this;
        }

        public Buffer pSetLayoutInfos(@NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *") VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer value) {
            VkIndirectExecutionSetShaderInfoEXT.npSetLayoutInfos(address(), value);
            return this;
        }

        public Buffer maxShaderCount(@NativeType("uint32_t") int value) {
            VkIndirectExecutionSetShaderInfoEXT.nmaxShaderCount(address(), value);
            return this;
        }

        public Buffer pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.Buffer value) {
            VkIndirectExecutionSetShaderInfoEXT.npPushConstantRanges(address(), value);
            return this;
        }
    }
}
