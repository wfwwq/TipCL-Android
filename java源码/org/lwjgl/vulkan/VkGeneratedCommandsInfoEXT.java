package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoEXT.class */
public class VkGeneratedCommandsInfoEXT extends Struct<VkGeneratedCommandsInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERSTAGES;
    public static final int INDIRECTEXECUTIONSET;
    public static final int INDIRECTCOMMANDSLAYOUT;
    public static final int INDIRECTADDRESS;
    public static final int INDIRECTADDRESSSIZE;
    public static final int PREPROCESSADDRESS;
    public static final int PREPROCESSSIZE;
    public static final int MAXSEQUENCECOUNT;
    public static final int SEQUENCECOUNTADDRESS;
    public static final int MAXDRAWCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(4), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSTAGES = layout.offsetof(2);
        INDIRECTEXECUTIONSET = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        INDIRECTADDRESS = layout.offsetof(5);
        INDIRECTADDRESSSIZE = layout.offsetof(6);
        PREPROCESSADDRESS = layout.offsetof(7);
        PREPROCESSSIZE = layout.offsetof(8);
        MAXSEQUENCECOUNT = layout.offsetof(9);
        SEQUENCECOUNTADDRESS = layout.offsetof(10);
        MAXDRAWCOUNT = layout.offsetof(11);
    }

    protected VkGeneratedCommandsInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeneratedCommandsInfoEXT create(long address, ByteBuffer container) {
        return new VkGeneratedCommandsInfoEXT(address, container);
    }

    public VkGeneratedCommandsInfoEXT(ByteBuffer container) {
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

    @NativeType("VkShaderStageFlags")
    public int shaderStages() {
        return nshaderStages(address());
    }

    @NativeType("VkIndirectExecutionSetEXT")
    public long indirectExecutionSet() {
        return nindirectExecutionSet(address());
    }

    @NativeType("VkIndirectCommandsLayoutEXT")
    public long indirectCommandsLayout() {
        return nindirectCommandsLayout(address());
    }

    @NativeType("VkDeviceAddress")
    public long indirectAddress() {
        return nindirectAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long indirectAddressSize() {
        return nindirectAddressSize(address());
    }

    @NativeType("VkDeviceAddress")
    public long preprocessAddress() {
        return npreprocessAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long preprocessSize() {
        return npreprocessSize(address());
    }

    @NativeType("uint32_t")
    public int maxSequenceCount() {
        return nmaxSequenceCount(address());
    }

    @NativeType("VkDeviceAddress")
    public long sequenceCountAddress() {
        return nsequenceCountAddress(address());
    }

    @NativeType("uint32_t")
    public int maxDrawCount() {
        return nmaxDrawCount(address());
    }

    public VkGeneratedCommandsInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT);
    }

    public VkGeneratedCommandsInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT pNext(VkGeneratedCommandsPipelineInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGeneratedCommandsInfoEXT pNext(VkGeneratedCommandsShaderInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkGeneratedCommandsInfoEXT shaderStages(@NativeType("VkShaderStageFlags") int value) {
        nshaderStages(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) {
        nindirectExecutionSet(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) {
        nindirectCommandsLayout(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT indirectAddress(@NativeType("VkDeviceAddress") long value) {
        nindirectAddress(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT indirectAddressSize(@NativeType("VkDeviceSize") long value) {
        nindirectAddressSize(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT preprocessAddress(@NativeType("VkDeviceAddress") long value) {
        npreprocessAddress(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT preprocessSize(@NativeType("VkDeviceSize") long value) {
        npreprocessSize(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT maxSequenceCount(@NativeType("uint32_t") int value) {
        nmaxSequenceCount(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT sequenceCountAddress(@NativeType("VkDeviceAddress") long value) {
        nsequenceCountAddress(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT maxDrawCount(@NativeType("uint32_t") int value) {
        nmaxDrawCount(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoEXT set(int sType, long pNext, int shaderStages, long indirectExecutionSet, long indirectCommandsLayout, long indirectAddress, long indirectAddressSize, long preprocessAddress, long preprocessSize, int maxSequenceCount, long sequenceCountAddress, int maxDrawCount) {
        sType(sType);
        pNext(pNext);
        shaderStages(shaderStages);
        indirectExecutionSet(indirectExecutionSet);
        indirectCommandsLayout(indirectCommandsLayout);
        indirectAddress(indirectAddress);
        indirectAddressSize(indirectAddressSize);
        preprocessAddress(preprocessAddress);
        preprocessSize(preprocessSize);
        maxSequenceCount(maxSequenceCount);
        sequenceCountAddress(sequenceCountAddress);
        maxDrawCount(maxDrawCount);
        return this;
    }

    public VkGeneratedCommandsInfoEXT set(VkGeneratedCommandsInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeneratedCommandsInfoEXT malloc() {
        return new VkGeneratedCommandsInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeneratedCommandsInfoEXT calloc() {
        return new VkGeneratedCommandsInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeneratedCommandsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkGeneratedCommandsInfoEXT create(long address) {
        return new VkGeneratedCommandsInfoEXT(address, null);
    }

    public static VkGeneratedCommandsInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeneratedCommandsInfoEXT(address, null);
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

    public static VkGeneratedCommandsInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeneratedCommandsInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderStages(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTAGES);
    }

    public static long nindirectExecutionSet(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTEXECUTIONSET);
    }

    public static long nindirectCommandsLayout(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTCOMMANDSLAYOUT);
    }

    public static long nindirectAddress(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTADDRESS);
    }

    public static long nindirectAddressSize(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTADDRESSSIZE);
    }

    public static long npreprocessAddress(long struct) {
        return MemoryUtil.memGetLong(struct + PREPROCESSADDRESS);
    }

    public static long npreprocessSize(long struct) {
        return MemoryUtil.memGetLong(struct + PREPROCESSSIZE);
    }

    public static int nmaxSequenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSEQUENCECOUNT);
    }

    public static long nsequenceCountAddress(long struct) {
        return MemoryUtil.memGetLong(struct + SEQUENCECOUNTADDRESS);
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

    public static void nshaderStages(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTAGES, value);
    }

    public static void nindirectExecutionSet(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDIRECTEXECUTIONSET, value);
    }

    public static void nindirectCommandsLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDIRECTCOMMANDSLAYOUT, value);
    }

    public static void nindirectAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDIRECTADDRESS, value);
    }

    public static void nindirectAddressSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDIRECTADDRESSSIZE, value);
    }

    public static void npreprocessAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + PREPROCESSADDRESS, value);
    }

    public static void npreprocessSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + PREPROCESSSIZE, value);
    }

    public static void nmaxSequenceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSEQUENCECOUNT, value);
    }

    public static void nsequenceCountAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEQUENCECOUNTADDRESS, value);
    }

    public static void nmaxDrawCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXDRAWCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsInfoEXT, Buffer> implements NativeResource {
        private static final VkGeneratedCommandsInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeneratedCommandsInfoEXT.SIZEOF);
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
        public VkGeneratedCommandsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeneratedCommandsInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGeneratedCommandsInfoEXT.npNext(address());
        }

        @NativeType("VkShaderStageFlags")
        public int shaderStages() {
            return VkGeneratedCommandsInfoEXT.nshaderStages(address());
        }

        @NativeType("VkIndirectExecutionSetEXT")
        public long indirectExecutionSet() {
            return VkGeneratedCommandsInfoEXT.nindirectExecutionSet(address());
        }

        @NativeType("VkIndirectCommandsLayoutEXT")
        public long indirectCommandsLayout() {
            return VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(address());
        }

        @NativeType("VkDeviceAddress")
        public long indirectAddress() {
            return VkGeneratedCommandsInfoEXT.nindirectAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long indirectAddressSize() {
            return VkGeneratedCommandsInfoEXT.nindirectAddressSize(address());
        }

        @NativeType("VkDeviceAddress")
        public long preprocessAddress() {
            return VkGeneratedCommandsInfoEXT.npreprocessAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long preprocessSize() {
            return VkGeneratedCommandsInfoEXT.npreprocessSize(address());
        }

        @NativeType("uint32_t")
        public int maxSequenceCount() {
            return VkGeneratedCommandsInfoEXT.nmaxSequenceCount(address());
        }

        @NativeType("VkDeviceAddress")
        public long sequenceCountAddress() {
            return VkGeneratedCommandsInfoEXT.nsequenceCountAddress(address());
        }

        @NativeType("uint32_t")
        public int maxDrawCount() {
            return VkGeneratedCommandsInfoEXT.nmaxDrawCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeneratedCommandsInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGeneratedCommandsInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkGeneratedCommandsPipelineInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkGeneratedCommandsShaderInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) {
            VkGeneratedCommandsInfoEXT.nshaderStages(address(), value);
            return this;
        }

        public Buffer indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) {
            VkGeneratedCommandsInfoEXT.nindirectExecutionSet(address(), value);
            return this;
        }

        public Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) {
            VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(address(), value);
            return this;
        }

        public Buffer indirectAddress(@NativeType("VkDeviceAddress") long value) {
            VkGeneratedCommandsInfoEXT.nindirectAddress(address(), value);
            return this;
        }

        public Buffer indirectAddressSize(@NativeType("VkDeviceSize") long value) {
            VkGeneratedCommandsInfoEXT.nindirectAddressSize(address(), value);
            return this;
        }

        public Buffer preprocessAddress(@NativeType("VkDeviceAddress") long value) {
            VkGeneratedCommandsInfoEXT.npreprocessAddress(address(), value);
            return this;
        }

        public Buffer preprocessSize(@NativeType("VkDeviceSize") long value) {
            VkGeneratedCommandsInfoEXT.npreprocessSize(address(), value);
            return this;
        }

        public Buffer maxSequenceCount(@NativeType("uint32_t") int value) {
            VkGeneratedCommandsInfoEXT.nmaxSequenceCount(address(), value);
            return this;
        }

        public Buffer sequenceCountAddress(@NativeType("VkDeviceAddress") long value) {
            VkGeneratedCommandsInfoEXT.nsequenceCountAddress(address(), value);
            return this;
        }

        public Buffer maxDrawCount(@NativeType("uint32_t") int value) {
            VkGeneratedCommandsInfoEXT.nmaxDrawCount(address(), value);
            return this;
        }
    }
}
