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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoNV.class */
public class VkGeneratedCommandsMemoryRequirementsInfoNV extends Struct<VkGeneratedCommandsMemoryRequirementsInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEBINDPOINT;
    public static final int PIPELINE;
    public static final int INDIRECTCOMMANDSLAYOUT;
    public static final int MAXSEQUENCESCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        MAXSEQUENCESCOUNT = layout.offsetof(5);
    }

    protected VkGeneratedCommandsMemoryRequirementsInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeneratedCommandsMemoryRequirementsInfoNV create(long address, ByteBuffer container) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(address, container);
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV(ByteBuffer container) {
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

    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() {
        return npipelineBindPoint(address());
    }

    @NativeType("VkPipeline")
    public long pipeline() {
        return npipeline(address());
    }

    @NativeType("VkIndirectCommandsLayoutNV")
    public long indirectCommandsLayout() {
        return nindirectCommandsLayout(address());
    }

    @NativeType("uint32_t")
    public int maxSequencesCount() {
        return nmaxSequencesCount(address());
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV sType$Default() {
        return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV);
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) {
        nindirectCommandsLayout(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV maxSequencesCount(@NativeType("uint32_t") int value) {
        nmaxSequencesCount(address(), value);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV set(int sType, long pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, int maxSequencesCount) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);
        indirectCommandsLayout(indirectCommandsLayout);
        maxSequencesCount(maxSequencesCount);
        return this;
    }

    public VkGeneratedCommandsMemoryRequirementsInfoNV set(VkGeneratedCommandsMemoryRequirementsInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV malloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV calloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV create(long address) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(address, null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(address, null);
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

    public static VkGeneratedCommandsMemoryRequirementsInfoNV malloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeneratedCommandsMemoryRequirementsInfoNV calloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineBindPoint(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINDPOINT);
    }

    public static long npipeline(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINE);
    }

    public static long nindirectCommandsLayout(long struct) {
        return MemoryUtil.memGetLong(struct + INDIRECTCOMMANDSLAYOUT);
    }

    public static int nmaxSequencesCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSEQUENCESCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineBindPoint(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEBINDPOINT, value);
    }

    public static void npipeline(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINE, value);
    }

    public static void nindirectCommandsLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDIRECTCOMMANDSLAYOUT, value);
    }

    public static void nmaxSequencesCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSEQUENCESCOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsMemoryRequirementsInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsMemoryRequirementsInfoNV, Buffer> implements NativeResource {
        private static final VkGeneratedCommandsMemoryRequirementsInfoNV ELEMENT_FACTORY = VkGeneratedCommandsMemoryRequirementsInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeneratedCommandsMemoryRequirementsInfoNV.SIZEOF);
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
        public VkGeneratedCommandsMemoryRequirementsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeneratedCommandsMemoryRequirementsInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGeneratedCommandsMemoryRequirementsInfoNV.npNext(address());
        }

        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
            return VkGeneratedCommandsMemoryRequirementsInfoNV.npipelineBindPoint(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkGeneratedCommandsMemoryRequirementsInfoNV.npipeline(address());
        }

        @NativeType("VkIndirectCommandsLayoutNV")
        public long indirectCommandsLayout() {
            return VkGeneratedCommandsMemoryRequirementsInfoNV.nindirectCommandsLayout(address());
        }

        @NativeType("uint32_t")
        public int maxSequencesCount() {
            return VkGeneratedCommandsMemoryRequirementsInfoNV.nmaxSequencesCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeneratedCommandsMemoryRequirementsInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGeneratedCommandsMemoryRequirementsInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkGeneratedCommandsMemoryRequirementsInfoNV.npipelineBindPoint(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkGeneratedCommandsMemoryRequirementsInfoNV.npipeline(address(), value);
            return this;
        }

        public Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) {
            VkGeneratedCommandsMemoryRequirementsInfoNV.nindirectCommandsLayout(address(), value);
            return this;
        }

        public Buffer maxSequencesCount(@NativeType("uint32_t") int value) {
            VkGeneratedCommandsMemoryRequirementsInfoNV.nmaxSequencesCount(address(), value);
            return this;
        }
    }
}
