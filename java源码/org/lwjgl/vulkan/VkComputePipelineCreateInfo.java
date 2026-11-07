package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo.class */
public class VkComputePipelineCreateInfo extends Struct<VkComputePipelineCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int STAGE;
    public static final int LAYOUT;
    public static final int BASEPIPELINEHANDLE;
    public static final int BASEPIPELINEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo.ALIGNOF), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        LAYOUT = layout.offsetof(4);
        BASEPIPELINEHANDLE = layout.offsetof(5);
        BASEPIPELINEINDEX = layout.offsetof(6);
    }

    protected VkComputePipelineCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkComputePipelineCreateInfo create(long address, ByteBuffer container) {
        return new VkComputePipelineCreateInfo(address, container);
    }

    public VkComputePipelineCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineCreateFlags")
    public int flags() {
        return nflags(address());
    }

    public VkPipelineShaderStageCreateInfo stage() {
        return nstage(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("VkPipeline")
    public long basePipelineHandle() {
        return nbasePipelineHandle(address());
    }

    @NativeType("int32_t")
    public int basePipelineIndex() {
        return nbasePipelineIndex(address());
    }

    public VkComputePipelineCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkComputePipelineCreateInfo sType$Default() {
        return sType(29);
    }

    public VkComputePipelineCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkComputePipelineCreateInfo pNext(VkComputePipelineIndirectBufferInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineBinaryInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineCompilerControlCreateInfoAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineRobustnessCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkPipelineRobustnessCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo pNext(VkSubpassShadingPipelineCreateInfoHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkComputePipelineCreateInfo flags(@NativeType("VkPipelineCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkComputePipelineCreateInfo stage(VkPipelineShaderStageCreateInfo value) {
        nstage(address(), value);
        return this;
    }

    public VkComputePipelineCreateInfo stage(Consumer<VkPipelineShaderStageCreateInfo> consumer) {
        consumer.accept(stage());
        return this;
    }

    public VkComputePipelineCreateInfo layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkComputePipelineCreateInfo basePipelineHandle(@NativeType("VkPipeline") long value) {
        nbasePipelineHandle(address(), value);
        return this;
    }

    public VkComputePipelineCreateInfo basePipelineIndex(@NativeType("int32_t") int value) {
        nbasePipelineIndex(address(), value);
        return this;
    }

    public VkComputePipelineCreateInfo set(int sType, long pNext, int flags, VkPipelineShaderStageCreateInfo stage, long layout, long basePipelineHandle, int basePipelineIndex) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);
        return this;
    }

    public VkComputePipelineCreateInfo set(VkComputePipelineCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkComputePipelineCreateInfo malloc() {
        return new VkComputePipelineCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkComputePipelineCreateInfo calloc() {
        return new VkComputePipelineCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkComputePipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComputePipelineCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkComputePipelineCreateInfo create(long address) {
        return new VkComputePipelineCreateInfo(address, null);
    }

    public static VkComputePipelineCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkComputePipelineCreateInfo(address, null);
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

    public static VkComputePipelineCreateInfo malloc(MemoryStack stack) {
        return new VkComputePipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkComputePipelineCreateInfo calloc(MemoryStack stack) {
        return new VkComputePipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPipelineShaderStageCreateInfo nstage(long struct) {
        return VkPipelineShaderStageCreateInfo.create(struct + STAGE);
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static long nbasePipelineHandle(long struct) {
        return MemoryUtil.memGetLong(struct + BASEPIPELINEHANDLE);
    }

    public static int nbasePipelineIndex(long struct) {
        return MemoryUtil.memGetInt(struct + BASEPIPELINEINDEX);
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

    public static void nstage(long struct, VkPipelineShaderStageCreateInfo value) {
        MemoryUtil.memCopy(value.address(), struct + STAGE, VkPipelineShaderStageCreateInfo.SIZEOF);
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nbasePipelineHandle(long struct, long value) {
        MemoryUtil.memPutLong(struct + BASEPIPELINEHANDLE, value);
    }

    public static void nbasePipelineIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + BASEPIPELINEINDEX, value);
    }

    public static void validate(long struct) {
        VkPipelineShaderStageCreateInfo.validate(struct + STAGE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkComputePipelineCreateInfo, Buffer> implements NativeResource {
        private static final VkComputePipelineCreateInfo ELEMENT_FACTORY = VkComputePipelineCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkComputePipelineCreateInfo.SIZEOF);
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
        public VkComputePipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkComputePipelineCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkComputePipelineCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineCreateFlags")
        public int flags() {
            return VkComputePipelineCreateInfo.nflags(address());
        }

        public VkPipelineShaderStageCreateInfo stage() {
            return VkComputePipelineCreateInfo.nstage(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkComputePipelineCreateInfo.nlayout(address());
        }

        @NativeType("VkPipeline")
        public long basePipelineHandle() {
            return VkComputePipelineCreateInfo.nbasePipelineHandle(address());
        }

        @NativeType("int32_t")
        public int basePipelineIndex() {
            return VkComputePipelineCreateInfo.nbasePipelineIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkComputePipelineCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(29);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkComputePipelineCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkComputePipelineIndirectBufferInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineBinaryInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreateFlags2CreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubpassShadingPipelineCreateInfoHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineCreateFlags") int value) {
            VkComputePipelineCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer stage(VkPipelineShaderStageCreateInfo value) {
            VkComputePipelineCreateInfo.nstage(address(), value);
            return this;
        }

        public Buffer stage(Consumer<VkPipelineShaderStageCreateInfo> consumer) {
            consumer.accept(stage());
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkComputePipelineCreateInfo.nlayout(address(), value);
            return this;
        }

        public Buffer basePipelineHandle(@NativeType("VkPipeline") long value) {
            VkComputePipelineCreateInfo.nbasePipelineHandle(address(), value);
            return this;
        }

        public Buffer basePipelineIndex(@NativeType("int32_t") int value) {
            VkComputePipelineCreateInfo.nbasePipelineIndex(address(), value);
            return this;
        }
    }
}
