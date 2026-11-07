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
import org.lwjgl.vulkan.VkPipelineCreationFeedback;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfo.class */
public class VkPipelineCreationFeedbackCreateInfo extends Struct<VkPipelineCreationFeedbackCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PPIPELINECREATIONFEEDBACK;
    public static final int PIPELINESTAGECREATIONFEEDBACKCOUNT;
    public static final int PPIPELINESTAGECREATIONFEEDBACKS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PPIPELINECREATIONFEEDBACK = layout.offsetof(2);
        PIPELINESTAGECREATIONFEEDBACKCOUNT = layout.offsetof(3);
        PPIPELINESTAGECREATIONFEEDBACKS = layout.offsetof(4);
    }

    protected VkPipelineCreationFeedbackCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCreationFeedbackCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineCreationFeedbackCreateInfo(address, container);
    }

    public VkPipelineCreationFeedbackCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineCreationFeedback *")
    public VkPipelineCreationFeedback pPipelineCreationFeedback() {
        return npPipelineCreationFeedback(address());
    }

    @NativeType("uint32_t")
    public int pipelineStageCreationFeedbackCount() {
        return npipelineStageCreationFeedbackCount(address());
    }

    @NativeType("VkPipelineCreationFeedback *")
    public VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks() {
        return npPipelineStageCreationFeedbacks(address());
    }

    public VkPipelineCreationFeedbackCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineCreationFeedbackCreateInfo sType$Default() {
        return sType(1000192000);
    }

    public VkPipelineCreationFeedbackCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineCreationFeedbackCreateInfo pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) {
        npPipelineCreationFeedback(address(), value);
        return this;
    }

    public VkPipelineCreationFeedbackCreateInfo pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) {
        npPipelineStageCreationFeedbacks(address(), value);
        return this;
    }

    public VkPipelineCreationFeedbackCreateInfo set(int sType, long pNext, VkPipelineCreationFeedback pPipelineCreationFeedback, VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks) {
        sType(sType);
        pNext(pNext);
        pPipelineCreationFeedback(pPipelineCreationFeedback);
        pPipelineStageCreationFeedbacks(pPipelineStageCreationFeedbacks);
        return this;
    }

    public VkPipelineCreationFeedbackCreateInfo set(VkPipelineCreationFeedbackCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCreationFeedbackCreateInfo malloc() {
        return new VkPipelineCreationFeedbackCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCreationFeedbackCreateInfo calloc() {
        return new VkPipelineCreationFeedbackCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCreationFeedbackCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCreationFeedbackCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCreationFeedbackCreateInfo create(long address) {
        return new VkPipelineCreationFeedbackCreateInfo(address, null);
    }

    public static VkPipelineCreationFeedbackCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCreationFeedbackCreateInfo(address, null);
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

    public static VkPipelineCreationFeedbackCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineCreationFeedbackCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCreationFeedbackCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineCreationFeedbackCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPipelineCreationFeedback npPipelineCreationFeedback(long struct) {
        return VkPipelineCreationFeedback.create(MemoryUtil.memGetAddress(struct + PPIPELINECREATIONFEEDBACK));
    }

    public static int npipelineStageCreationFeedbackCount(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINESTAGECREATIONFEEDBACKCOUNT);
    }

    public static VkPipelineCreationFeedback.Buffer npPipelineStageCreationFeedbacks(long struct) {
        return VkPipelineCreationFeedback.createSafe(MemoryUtil.memGetAddress(struct + PPIPELINESTAGECREATIONFEEDBACKS), npipelineStageCreationFeedbackCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npPipelineCreationFeedback(long struct, VkPipelineCreationFeedback value) {
        MemoryUtil.memPutAddress(struct + PPIPELINECREATIONFEEDBACK, value.address());
    }

    public static void npipelineStageCreationFeedbackCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINESTAGECREATIONFEEDBACKCOUNT, value);
    }

    public static void npPipelineStageCreationFeedbacks(long struct, VkPipelineCreationFeedback.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPIPELINESTAGECREATIONFEEDBACKS, MemoryUtil.memAddressSafe(value));
        npipelineStageCreationFeedbackCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PPIPELINECREATIONFEEDBACK));
        if (npipelineStageCreationFeedbackCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPIPELINESTAGECREATIONFEEDBACKS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreationFeedbackCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCreationFeedbackCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineCreationFeedbackCreateInfo ELEMENT_FACTORY = VkPipelineCreationFeedbackCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCreationFeedbackCreateInfo.SIZEOF);
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
        public VkPipelineCreationFeedbackCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineCreationFeedbackCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineCreationFeedbackCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineCreationFeedback *")
        public VkPipelineCreationFeedback pPipelineCreationFeedback() {
            return VkPipelineCreationFeedbackCreateInfo.npPipelineCreationFeedback(address());
        }

        @NativeType("uint32_t")
        public int pipelineStageCreationFeedbackCount() {
            return VkPipelineCreationFeedbackCreateInfo.npipelineStageCreationFeedbackCount(address());
        }

        @NativeType("VkPipelineCreationFeedback *")
        public VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks() {
            return VkPipelineCreationFeedbackCreateInfo.npPipelineStageCreationFeedbacks(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCreationFeedbackCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000192000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCreationFeedbackCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) {
            VkPipelineCreationFeedbackCreateInfo.npPipelineCreationFeedback(address(), value);
            return this;
        }

        public Buffer pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) {
            VkPipelineCreationFeedbackCreateInfo.npPipelineStageCreationFeedbacks(address(), value);
            return this;
        }
    }
}
