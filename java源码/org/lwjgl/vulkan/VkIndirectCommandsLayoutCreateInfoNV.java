package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutCreateInfoNV.class */
public class VkIndirectCommandsLayoutCreateInfoNV extends Struct<VkIndirectCommandsLayoutCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PIPELINEBINDPOINT;
    public static final int TOKENCOUNT;
    public static final int PTOKENS;
    public static final int STREAMCOUNT;
    public static final int PSTREAMSTRIDES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PIPELINEBINDPOINT = layout.offsetof(3);
        TOKENCOUNT = layout.offsetof(4);
        PTOKENS = layout.offsetof(5);
        STREAMCOUNT = layout.offsetof(6);
        PSTREAMSTRIDES = layout.offsetof(7);
    }

    protected VkIndirectCommandsLayoutCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsLayoutCreateInfoNV create(long address, ByteBuffer container) {
        return new VkIndirectCommandsLayoutCreateInfoNV(address, container);
    }

    public VkIndirectCommandsLayoutCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkIndirectCommandsLayoutUsageFlagsNV")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() {
        return npipelineBindPoint(address());
    }

    @NativeType("uint32_t")
    public int tokenCount() {
        return ntokenCount(address());
    }

    @NativeType("VkIndirectCommandsLayoutTokenNV const *")
    public VkIndirectCommandsLayoutTokenNV.Buffer pTokens() {
        return npTokens(address());
    }

    @NativeType("uint32_t")
    public int streamCount() {
        return nstreamCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pStreamStrides() {
        return npStreamStrides(address());
    }

    public VkIndirectCommandsLayoutCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoNV sType$Default() {
        return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV);
    }

    public VkIndirectCommandsLayoutCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoNV flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoNV pTokens(@NativeType("VkIndirectCommandsLayoutTokenNV const *") VkIndirectCommandsLayoutTokenNV.Buffer value) {
        npTokens(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoNV pStreamStrides(@NativeType("uint32_t const *") IntBuffer value) {
        npStreamStrides(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoNV set(int sType, long pNext, int flags, int pipelineBindPoint, VkIndirectCommandsLayoutTokenNV.Buffer pTokens, IntBuffer pStreamStrides) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        pTokens(pTokens);
        pStreamStrides(pStreamStrides);
        return this;
    }

    public VkIndirectCommandsLayoutCreateInfoNV set(VkIndirectCommandsLayoutCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsLayoutCreateInfoNV malloc() {
        return new VkIndirectCommandsLayoutCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutCreateInfoNV calloc() {
        return new VkIndirectCommandsLayoutCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsLayoutCreateInfoNV create(long address) {
        return new VkIndirectCommandsLayoutCreateInfoNV(address, null);
    }

    public static VkIndirectCommandsLayoutCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutCreateInfoNV(address, null);
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

    public static VkIndirectCommandsLayoutCreateInfoNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutCreateInfoNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineBindPoint(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINDPOINT);
    }

    public static int ntokenCount(long struct) {
        return MemoryUtil.memGetInt(struct + TOKENCOUNT);
    }

    public static VkIndirectCommandsLayoutTokenNV.Buffer npTokens(long struct) {
        return VkIndirectCommandsLayoutTokenNV.create(MemoryUtil.memGetAddress(struct + PTOKENS), ntokenCount(struct));
    }

    public static int nstreamCount(long struct) {
        return MemoryUtil.memGetInt(struct + STREAMCOUNT);
    }

    public static IntBuffer npStreamStrides(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PSTREAMSTRIDES), nstreamCount(struct));
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

    public static void npipelineBindPoint(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEBINDPOINT, value);
    }

    public static void ntokenCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TOKENCOUNT, value);
    }

    public static void npTokens(long struct, VkIndirectCommandsLayoutTokenNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PTOKENS, value.address());
        ntokenCount(struct, value.remaining());
    }

    public static void nstreamCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STREAMCOUNT, value);
    }

    public static void npStreamStrides(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PSTREAMSTRIDES, MemoryUtil.memAddress(value));
        nstreamCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        int tokenCount = ntokenCount(struct);
        long pTokens = MemoryUtil.memGetAddress(struct + PTOKENS);
        Checks.check(pTokens);
        validate(pTokens, tokenCount, VkIndirectCommandsLayoutTokenNV.SIZEOF, VkIndirectCommandsLayoutTokenNV::validate);
        Checks.check(MemoryUtil.memGetAddress(struct + PSTREAMSTRIDES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutCreateInfoNV, Buffer> implements NativeResource {
        private static final VkIndirectCommandsLayoutCreateInfoNV ELEMENT_FACTORY = VkIndirectCommandsLayoutCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsLayoutCreateInfoNV.SIZEOF);
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
        public VkIndirectCommandsLayoutCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectCommandsLayoutCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectCommandsLayoutCreateInfoNV.npNext(address());
        }

        @NativeType("VkIndirectCommandsLayoutUsageFlagsNV")
        public int flags() {
            return VkIndirectCommandsLayoutCreateInfoNV.nflags(address());
        }

        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
            return VkIndirectCommandsLayoutCreateInfoNV.npipelineBindPoint(address());
        }

        @NativeType("uint32_t")
        public int tokenCount() {
            return VkIndirectCommandsLayoutCreateInfoNV.ntokenCount(address());
        }

        @NativeType("VkIndirectCommandsLayoutTokenNV const *")
        public VkIndirectCommandsLayoutTokenNV.Buffer pTokens() {
            return VkIndirectCommandsLayoutCreateInfoNV.npTokens(address());
        }

        @NativeType("uint32_t")
        public int streamCount() {
            return VkIndirectCommandsLayoutCreateInfoNV.nstreamCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pStreamStrides() {
            return VkIndirectCommandsLayoutCreateInfoNV.npStreamStrides(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectCommandsLayoutCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectCommandsLayoutCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNV") int value) {
            VkIndirectCommandsLayoutCreateInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkIndirectCommandsLayoutCreateInfoNV.npipelineBindPoint(address(), value);
            return this;
        }

        public Buffer pTokens(@NativeType("VkIndirectCommandsLayoutTokenNV const *") VkIndirectCommandsLayoutTokenNV.Buffer value) {
            VkIndirectCommandsLayoutCreateInfoNV.npTokens(address(), value);
            return this;
        }

        public Buffer pStreamStrides(@NativeType("uint32_t const *") IntBuffer value) {
            VkIndirectCommandsLayoutCreateInfoNV.npStreamStrides(address(), value);
            return this;
        }
    }
}
