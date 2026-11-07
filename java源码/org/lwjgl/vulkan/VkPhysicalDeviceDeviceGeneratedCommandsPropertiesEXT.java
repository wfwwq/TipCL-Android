package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.class */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXINDIRECTPIPELINECOUNT;
    public static final int MAXINDIRECTSHADEROBJECTCOUNT;
    public static final int MAXINDIRECTSEQUENCECOUNT;
    public static final int MAXINDIRECTCOMMANDSTOKENCOUNT;
    public static final int MAXINDIRECTCOMMANDSTOKENOFFSET;
    public static final int MAXINDIRECTCOMMANDSINDIRECTSTRIDE;
    public static final int SUPPORTEDINDIRECTCOMMANDSINPUTMODES;
    public static final int SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES;
    public static final int SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING;
    public static final int SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING;
    public static final int DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK;
    public static final int DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXINDIRECTPIPELINECOUNT = layout.offsetof(2);
        MAXINDIRECTSHADEROBJECTCOUNT = layout.offsetof(3);
        MAXINDIRECTSEQUENCECOUNT = layout.offsetof(4);
        MAXINDIRECTCOMMANDSTOKENCOUNT = layout.offsetof(5);
        MAXINDIRECTCOMMANDSTOKENOFFSET = layout.offsetof(6);
        MAXINDIRECTCOMMANDSINDIRECTSTRIDE = layout.offsetof(7);
        SUPPORTEDINDIRECTCOMMANDSINPUTMODES = layout.offsetof(8);
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES = layout.offsetof(9);
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING = layout.offsetof(10);
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING = layout.offsetof(11);
        DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK = layout.offsetof(12);
        DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT = layout.offsetof(13);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectPipelineCount() {
        return nmaxIndirectPipelineCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectShaderObjectCount() {
        return nmaxIndirectShaderObjectCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectSequenceCount() {
        return nmaxIndirectSequenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenCount() {
        return nmaxIndirectCommandsTokenCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenOffset() {
        return nmaxIndirectCommandsTokenOffset(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectCommandsIndirectStride() {
        return nmaxIndirectCommandsIndirectStride(address());
    }

    @NativeType("VkIndirectCommandsInputModeFlagsEXT")
    public int supportedIndirectCommandsInputModes() {
        return nsupportedIndirectCommandsInputModes(address());
    }

    @NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStages() {
        return nsupportedIndirectCommandsShaderStages(address());
    }

    @NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStagesPipelineBinding() {
        return nsupportedIndirectCommandsShaderStagesPipelineBinding(address());
    }

    @NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStagesShaderBinding() {
        return nsupportedIndirectCommandsShaderStagesShaderBinding(address());
    }

    @NativeType("VkBool32")
    public boolean deviceGeneratedCommandsTransformFeedback() {
        return ndeviceGeneratedCommandsTransformFeedback(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean deviceGeneratedCommandsMultiDrawIndirectCount() {
        return ndeviceGeneratedCommandsMultiDrawIndirectCount(address()) != 0;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType$Default() {
        return sType(1000572001);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxIndirectPipelineCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTPIPELINECOUNT);
    }

    public static int nmaxIndirectShaderObjectCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTSHADEROBJECTCOUNT);
    }

    public static int nmaxIndirectSequenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTSEQUENCECOUNT);
    }

    public static int nmaxIndirectCommandsTokenCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTCOMMANDSTOKENCOUNT);
    }

    public static int nmaxIndirectCommandsTokenOffset(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTCOMMANDSTOKENOFFSET);
    }

    public static int nmaxIndirectCommandsIndirectStride(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTCOMMANDSINDIRECTSTRIDE);
    }

    public static int nsupportedIndirectCommandsInputModes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDINDIRECTCOMMANDSINPUTMODES);
    }

    public static int nsupportedIndirectCommandsShaderStages(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES);
    }

    public static int nsupportedIndirectCommandsShaderStagesPipelineBinding(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING);
    }

    public static int nsupportedIndirectCommandsShaderStagesShaderBinding(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING);
    }

    public static int ndeviceGeneratedCommandsTransformFeedback(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK);
    }

    public static int ndeviceGeneratedCommandsMultiDrawIndirectCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectPipelineCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectPipelineCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectShaderObjectCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectShaderObjectCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectSequenceCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectSequenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsTokenCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenOffset() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsTokenOffset(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectCommandsIndirectStride() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsIndirectStride(address());
        }

        @NativeType("VkIndirectCommandsInputModeFlagsEXT")
        public int supportedIndirectCommandsInputModes() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsInputModes(address());
        }

        @NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStages() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStages(address());
        }

        @NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStagesPipelineBinding() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStagesPipelineBinding(address());
        }

        @NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStagesShaderBinding() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStagesShaderBinding(address());
        }

        @NativeType("VkBool32")
        public boolean deviceGeneratedCommandsTransformFeedback() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ndeviceGeneratedCommandsTransformFeedback(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean deviceGeneratedCommandsMultiDrawIndirectCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ndeviceGeneratedCommandsMultiDrawIndirectCount(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000572001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
