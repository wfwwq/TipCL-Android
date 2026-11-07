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
import org.lwjgl.vulkan.VkIndirectCommandsStreamNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoNV.class */
public class VkGeneratedCommandsInfoNV extends Struct<VkGeneratedCommandsInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEBINDPOINT;
    public static final int PIPELINE;
    public static final int INDIRECTCOMMANDSLAYOUT;
    public static final int STREAMCOUNT;
    public static final int PSTREAMS;
    public static final int SEQUENCESCOUNT;
    public static final int PREPROCESSBUFFER;
    public static final int PREPROCESSOFFSET;
    public static final int PREPROCESSSIZE;
    public static final int SEQUENCESCOUNTBUFFER;
    public static final int SEQUENCESCOUNTOFFSET;
    public static final int SEQUENCESINDEXBUFFER;
    public static final int SEQUENCESINDEXOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        STREAMCOUNT = layout.offsetof(5);
        PSTREAMS = layout.offsetof(6);
        SEQUENCESCOUNT = layout.offsetof(7);
        PREPROCESSBUFFER = layout.offsetof(8);
        PREPROCESSOFFSET = layout.offsetof(9);
        PREPROCESSSIZE = layout.offsetof(10);
        SEQUENCESCOUNTBUFFER = layout.offsetof(11);
        SEQUENCESCOUNTOFFSET = layout.offsetof(12);
        SEQUENCESINDEXBUFFER = layout.offsetof(13);
        SEQUENCESINDEXOFFSET = layout.offsetof(14);
    }

    protected VkGeneratedCommandsInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeneratedCommandsInfoNV create(long address, ByteBuffer container) {
        return new VkGeneratedCommandsInfoNV(address, container);
    }

    public VkGeneratedCommandsInfoNV(ByteBuffer container) {
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
    public int streamCount() {
        return nstreamCount(address());
    }

    @NativeType("VkIndirectCommandsStreamNV const *")
    public VkIndirectCommandsStreamNV.Buffer pStreams() {
        return npStreams(address());
    }

    @NativeType("uint32_t")
    public int sequencesCount() {
        return nsequencesCount(address());
    }

    @NativeType("VkBuffer")
    public long preprocessBuffer() {
        return npreprocessBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long preprocessOffset() {
        return npreprocessOffset(address());
    }

    @NativeType("VkDeviceSize")
    public long preprocessSize() {
        return npreprocessSize(address());
    }

    @NativeType("VkBuffer")
    public long sequencesCountBuffer() {
        return nsequencesCountBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long sequencesCountOffset() {
        return nsequencesCountOffset(address());
    }

    @NativeType("VkBuffer")
    public long sequencesIndexBuffer() {
        return nsequencesIndexBuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long sequencesIndexOffset() {
        return nsequencesIndexOffset(address());
    }

    public VkGeneratedCommandsInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV sType$Default() {
        return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV);
    }

    public VkGeneratedCommandsInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) {
        nindirectCommandsLayout(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV pStreams(@NativeType("VkIndirectCommandsStreamNV const *") VkIndirectCommandsStreamNV.Buffer value) {
        npStreams(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV sequencesCount(@NativeType("uint32_t") int value) {
        nsequencesCount(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV preprocessBuffer(@NativeType("VkBuffer") long value) {
        npreprocessBuffer(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV preprocessOffset(@NativeType("VkDeviceSize") long value) {
        npreprocessOffset(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV preprocessSize(@NativeType("VkDeviceSize") long value) {
        npreprocessSize(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV sequencesCountBuffer(@NativeType("VkBuffer") long value) {
        nsequencesCountBuffer(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV sequencesCountOffset(@NativeType("VkDeviceSize") long value) {
        nsequencesCountOffset(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV sequencesIndexBuffer(@NativeType("VkBuffer") long value) {
        nsequencesIndexBuffer(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV sequencesIndexOffset(@NativeType("VkDeviceSize") long value) {
        nsequencesIndexOffset(address(), value);
        return this;
    }

    public VkGeneratedCommandsInfoNV set(int sType, long pNext, int pipelineBindPoint, long pipeline, long indirectCommandsLayout, VkIndirectCommandsStreamNV.Buffer pStreams, int sequencesCount, long preprocessBuffer, long preprocessOffset, long preprocessSize, long sequencesCountBuffer, long sequencesCountOffset, long sequencesIndexBuffer, long sequencesIndexOffset) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);
        indirectCommandsLayout(indirectCommandsLayout);
        pStreams(pStreams);
        sequencesCount(sequencesCount);
        preprocessBuffer(preprocessBuffer);
        preprocessOffset(preprocessOffset);
        preprocessSize(preprocessSize);
        sequencesCountBuffer(sequencesCountBuffer);
        sequencesCountOffset(sequencesCountOffset);
        sequencesIndexBuffer(sequencesIndexBuffer);
        sequencesIndexOffset(sequencesIndexOffset);
        return this;
    }

    public VkGeneratedCommandsInfoNV set(VkGeneratedCommandsInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeneratedCommandsInfoNV malloc() {
        return new VkGeneratedCommandsInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeneratedCommandsInfoNV calloc() {
        return new VkGeneratedCommandsInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeneratedCommandsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGeneratedCommandsInfoNV create(long address) {
        return new VkGeneratedCommandsInfoNV(address, null);
    }

    public static VkGeneratedCommandsInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeneratedCommandsInfoNV(address, null);
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

    public static VkGeneratedCommandsInfoNV malloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeneratedCommandsInfoNV calloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstreamCount(long struct) {
        return MemoryUtil.memGetInt(struct + STREAMCOUNT);
    }

    public static VkIndirectCommandsStreamNV.Buffer npStreams(long struct) {
        return VkIndirectCommandsStreamNV.create(MemoryUtil.memGetAddress(struct + PSTREAMS), nstreamCount(struct));
    }

    public static int nsequencesCount(long struct) {
        return MemoryUtil.memGetInt(struct + SEQUENCESCOUNT);
    }

    public static long npreprocessBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + PREPROCESSBUFFER);
    }

    public static long npreprocessOffset(long struct) {
        return MemoryUtil.memGetLong(struct + PREPROCESSOFFSET);
    }

    public static long npreprocessSize(long struct) {
        return MemoryUtil.memGetLong(struct + PREPROCESSSIZE);
    }

    public static long nsequencesCountBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + SEQUENCESCOUNTBUFFER);
    }

    public static long nsequencesCountOffset(long struct) {
        return MemoryUtil.memGetLong(struct + SEQUENCESCOUNTOFFSET);
    }

    public static long nsequencesIndexBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + SEQUENCESINDEXBUFFER);
    }

    public static long nsequencesIndexOffset(long struct) {
        return MemoryUtil.memGetLong(struct + SEQUENCESINDEXOFFSET);
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

    public static void nstreamCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STREAMCOUNT, value);
    }

    public static void npStreams(long struct, VkIndirectCommandsStreamNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTREAMS, value.address());
        nstreamCount(struct, value.remaining());
    }

    public static void nsequencesCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SEQUENCESCOUNT, value);
    }

    public static void npreprocessBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + PREPROCESSBUFFER, value);
    }

    public static void npreprocessOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + PREPROCESSOFFSET, value);
    }

    public static void npreprocessSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + PREPROCESSSIZE, value);
    }

    public static void nsequencesCountBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEQUENCESCOUNTBUFFER, value);
    }

    public static void nsequencesCountOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEQUENCESCOUNTOFFSET, value);
    }

    public static void nsequencesIndexBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEQUENCESINDEXBUFFER, value);
    }

    public static void nsequencesIndexOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + SEQUENCESINDEXOFFSET, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTREAMS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeneratedCommandsInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsInfoNV, Buffer> implements NativeResource {
        private static final VkGeneratedCommandsInfoNV ELEMENT_FACTORY = VkGeneratedCommandsInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeneratedCommandsInfoNV.SIZEOF);
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
        public VkGeneratedCommandsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeneratedCommandsInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGeneratedCommandsInfoNV.npNext(address());
        }

        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
            return VkGeneratedCommandsInfoNV.npipelineBindPoint(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkGeneratedCommandsInfoNV.npipeline(address());
        }

        @NativeType("VkIndirectCommandsLayoutNV")
        public long indirectCommandsLayout() {
            return VkGeneratedCommandsInfoNV.nindirectCommandsLayout(address());
        }

        @NativeType("uint32_t")
        public int streamCount() {
            return VkGeneratedCommandsInfoNV.nstreamCount(address());
        }

        @NativeType("VkIndirectCommandsStreamNV const *")
        public VkIndirectCommandsStreamNV.Buffer pStreams() {
            return VkGeneratedCommandsInfoNV.npStreams(address());
        }

        @NativeType("uint32_t")
        public int sequencesCount() {
            return VkGeneratedCommandsInfoNV.nsequencesCount(address());
        }

        @NativeType("VkBuffer")
        public long preprocessBuffer() {
            return VkGeneratedCommandsInfoNV.npreprocessBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long preprocessOffset() {
            return VkGeneratedCommandsInfoNV.npreprocessOffset(address());
        }

        @NativeType("VkDeviceSize")
        public long preprocessSize() {
            return VkGeneratedCommandsInfoNV.npreprocessSize(address());
        }

        @NativeType("VkBuffer")
        public long sequencesCountBuffer() {
            return VkGeneratedCommandsInfoNV.nsequencesCountBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long sequencesCountOffset() {
            return VkGeneratedCommandsInfoNV.nsequencesCountOffset(address());
        }

        @NativeType("VkBuffer")
        public long sequencesIndexBuffer() {
            return VkGeneratedCommandsInfoNV.nsequencesIndexBuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long sequencesIndexOffset() {
            return VkGeneratedCommandsInfoNV.nsequencesIndexOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeneratedCommandsInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGeneratedCommandsInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkGeneratedCommandsInfoNV.npipelineBindPoint(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkGeneratedCommandsInfoNV.npipeline(address(), value);
            return this;
        }

        public Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) {
            VkGeneratedCommandsInfoNV.nindirectCommandsLayout(address(), value);
            return this;
        }

        public Buffer pStreams(@NativeType("VkIndirectCommandsStreamNV const *") VkIndirectCommandsStreamNV.Buffer value) {
            VkGeneratedCommandsInfoNV.npStreams(address(), value);
            return this;
        }

        public Buffer sequencesCount(@NativeType("uint32_t") int value) {
            VkGeneratedCommandsInfoNV.nsequencesCount(address(), value);
            return this;
        }

        public Buffer preprocessBuffer(@NativeType("VkBuffer") long value) {
            VkGeneratedCommandsInfoNV.npreprocessBuffer(address(), value);
            return this;
        }

        public Buffer preprocessOffset(@NativeType("VkDeviceSize") long value) {
            VkGeneratedCommandsInfoNV.npreprocessOffset(address(), value);
            return this;
        }

        public Buffer preprocessSize(@NativeType("VkDeviceSize") long value) {
            VkGeneratedCommandsInfoNV.npreprocessSize(address(), value);
            return this;
        }

        public Buffer sequencesCountBuffer(@NativeType("VkBuffer") long value) {
            VkGeneratedCommandsInfoNV.nsequencesCountBuffer(address(), value);
            return this;
        }

        public Buffer sequencesCountOffset(@NativeType("VkDeviceSize") long value) {
            VkGeneratedCommandsInfoNV.nsequencesCountOffset(address(), value);
            return this;
        }

        public Buffer sequencesIndexBuffer(@NativeType("VkBuffer") long value) {
            VkGeneratedCommandsInfoNV.nsequencesIndexBuffer(address(), value);
            return this;
        }

        public Buffer sequencesIndexOffset(@NativeType("VkDeviceSize") long value) {
            VkGeneratedCommandsInfoNV.nsequencesIndexOffset(address(), value);
            return this;
        }
    }
}
