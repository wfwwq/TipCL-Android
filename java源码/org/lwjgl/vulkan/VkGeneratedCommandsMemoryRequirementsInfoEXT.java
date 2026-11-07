package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoEXT.class */
public class VkGeneratedCommandsMemoryRequirementsInfoEXT extends Struct<VkGeneratedCommandsMemoryRequirementsInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INDIRECTEXECUTIONSET;
    public static final int INDIRECTCOMMANDSLAYOUT;
    public static final int MAXSEQUENCECOUNT;
    public static final int MAXDRAWCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDIRECTEXECUTIONSET = layout.offsetof(2);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(3);
        MAXSEQUENCECOUNT = layout.offsetof(4);
        MAXDRAWCOUNT = layout.offsetof(5);
    }

    protected VkGeneratedCommandsMemoryRequirementsInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeneratedCommandsMemoryRequirementsInfoEXT create(long address, ByteBuffer container) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(address, container);
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT(ByteBuffer container) {
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

    @NativeType("VkIndirectExecutionSetEXT")
    public long indirectExecutionSet() {
        return nindirectExecutionSet(address());
    }

    @NativeType("VkIndirectCommandsLayoutEXT")
    public long indirectCommandsLayout() {
        return nindirectCommandsLayout(address());
    }

    @NativeType("uint32_t")
    public int maxSequenceCount() {
        return nmaxSequenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxDrawCount() {
        return nmaxDrawCount(address());
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT);
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(VkGeneratedCommandsPipelineInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(VkGeneratedCommandsShaderInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) {
        nindirectExecutionSet(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) {
        nindirectCommandsLayout(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCount(@NativeType("uint32_t") int value) {
        nmaxSequenceCount(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCount(@NativeType("uint32_t") int value) {
        nmaxDrawCount(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT set(int sType, long pNext, long indirectExecutionSet, long indirectCommandsLayout, int maxSequenceCount, int maxDrawCount) {
        sType(sType);
        pNext(pNext);
        indirectExecutionSet(indirectExecutionSet);
        indirectCommandsLayout(indirectCommandsLayout);
        maxSequenceCount(maxSequenceCount);
        maxDrawCount(maxDrawCount);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoEXT set(VkGeneratedCommandsMemoryRequirementsInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT malloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT calloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT create(long address) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(address, null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(address, null);
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

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nindirectExecutionSet(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTEXECUTIONSET);
    }

    public static long nindirectCommandsLayout(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTCOMMANDSLAYOUT);
    }

    public static int nmaxSequenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSEQUENCECOUNT);
    }

    public static int nmaxDrawCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDRAWCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nindirectExecutionSet(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDIRECTEXECUTIONSET, value);
    }

    public static void nindirectCommandsLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDIRECTCOMMANDSLAYOUT, value);
    }

    public static void nmaxSequenceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSEQUENCECOUNT, value);
    }

    public static void nmaxDrawCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXDRAWCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsMemoryRequirementsInfoEXT, Buffer> implements NativeResource {
        private static final VkGeneratedCommandsMemoryRequirementsInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsMemoryRequirementsInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeneratedCommandsMemoryRequirementsInfoEXT.SIZEOF);
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
        public VkGeneratedCommandsMemoryRequirementsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeneratedCommandsMemoryRequirementsInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGeneratedCommandsMemoryRequirementsInfoEXT.npNext(address());
        }

        @NativeType("VkIndirectExecutionSetEXT")
        public long indirectExecutionSet() {
            return VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectExecutionSet(address());
        }

        @NativeType("VkIndirectCommandsLayoutEXT")
        public long indirectCommandsLayout() {
            return VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectCommandsLayout(address());
        }

        @NativeType("uint32_t")
        public int maxSequenceCount() {
            return VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxSequenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxDrawCount() {
            return VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxDrawCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeneratedCommandsMemoryRequirementsInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGeneratedCommandsMemoryRequirementsInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkGeneratedCommandsPipelineInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkGeneratedCommandsShaderInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) {
            VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectExecutionSet(address(), value);
            return this;
        }

        public Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) {
            VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectCommandsLayout(address(), value);
            return this;
        }

        public Buffer maxSequenceCount(@NativeType("uint32_t") int value) {
            VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxSequenceCount(address(), value);
            return this;
        }

        public Buffer maxDrawCount(@NativeType("uint32_t") int value) {
            VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxDrawCount(address(), value);
            return this;
        }
    }
}
