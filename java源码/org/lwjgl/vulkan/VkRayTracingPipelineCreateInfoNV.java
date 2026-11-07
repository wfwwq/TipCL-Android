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
import org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo;
import org.lwjgl.vulkan.VkRayTracingShaderGroupCreateInfoNV;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoNV.class */
public class VkRayTracingPipelineCreateInfoNV extends Struct<VkRayTracingPipelineCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int STAGECOUNT;
    public static final int PSTAGES;
    public static final int GROUPCOUNT;
    public static final int PGROUPS;
    public static final int MAXRECURSIONDEPTH;
    public static final int LAYOUT;
    public static final int BASEPIPELINEHANDLE;
    public static final int BASEPIPELINEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        GROUPCOUNT = layout.offsetof(5);
        PGROUPS = layout.offsetof(6);
        MAXRECURSIONDEPTH = layout.offsetof(7);
        LAYOUT = layout.offsetof(8);
        BASEPIPELINEHANDLE = layout.offsetof(9);
        BASEPIPELINEINDEX = layout.offsetof(10);
    }

    protected VkRayTracingPipelineCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRayTracingPipelineCreateInfoNV create(long address, ByteBuffer container) {
        return new VkRayTracingPipelineCreateInfoNV(address, container);
    }

    public VkRayTracingPipelineCreateInfoNV(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int stageCount() {
        return nstageCount(address());
    }

    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() {
        return npStages(address());
    }

    @NativeType("uint32_t")
    public int groupCount() {
        return ngroupCount(address());
    }

    @NativeType("VkRayTracingShaderGroupCreateInfoNV const *")
    public VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups() {
        return npGroups(address());
    }

    @NativeType("uint32_t")
    public int maxRecursionDepth() {
        return nmaxRecursionDepth(address());
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

    public VkRayTracingPipelineCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV sType$Default() {
        return sType(1000165000);
    }

    public VkRayTracingPipelineCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreateFlags2CreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreateFlags2CreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreationFeedbackCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRayTracingPipelineCreateInfoNV flags(@NativeType("VkPipelineCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
        npStages(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoNV const *") VkRayTracingShaderGroupCreateInfoNV.Buffer value) {
        npGroups(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV maxRecursionDepth(@NativeType("uint32_t") int value) {
        nmaxRecursionDepth(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV basePipelineHandle(@NativeType("VkPipeline") long value) {
        nbasePipelineHandle(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV basePipelineIndex(@NativeType("int32_t") int value) {
        nbasePipelineIndex(address(), value);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV set(int sType, long pNext, int flags, VkPipelineShaderStageCreateInfo.Buffer pStages, VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups, int maxRecursionDepth, long layout, long basePipelineHandle, int basePipelineIndex) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStages(pStages);
        pGroups(pGroups);
        maxRecursionDepth(maxRecursionDepth);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);
        return this;
    }

    public VkRayTracingPipelineCreateInfoNV set(VkRayTracingPipelineCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRayTracingPipelineCreateInfoNV malloc() {
        return new VkRayTracingPipelineCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRayTracingPipelineCreateInfoNV calloc() {
        return new VkRayTracingPipelineCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRayTracingPipelineCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingPipelineCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkRayTracingPipelineCreateInfoNV create(long address) {
        return new VkRayTracingPipelineCreateInfoNV(address, null);
    }

    public static VkRayTracingPipelineCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRayTracingPipelineCreateInfoNV(address, null);
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

    public static VkRayTracingPipelineCreateInfoNV malloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRayTracingPipelineCreateInfoNV calloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstageCount(long struct) {
        return MemoryUtil.memGetInt(struct + STAGECOUNT);
    }

    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) {
        return VkPipelineShaderStageCreateInfo.create(MemoryUtil.memGetAddress(struct + PSTAGES), nstageCount(struct));
    }

    public static int ngroupCount(long struct) {
        return MemoryUtil.memGetInt(struct + GROUPCOUNT);
    }

    public static VkRayTracingShaderGroupCreateInfoNV.Buffer npGroups(long struct) {
        return VkRayTracingShaderGroupCreateInfoNV.create(MemoryUtil.memGetAddress(struct + PGROUPS), ngroupCount(struct));
    }

    public static int nmaxRecursionDepth(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRECURSIONDEPTH);
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

    public static void nstageCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGECOUNT, value);
    }

    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTAGES, value.address());
        nstageCount(struct, value.remaining());
    }

    public static void ngroupCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + GROUPCOUNT, value);
    }

    public static void npGroups(long struct, VkRayTracingShaderGroupCreateInfoNV.Buffer value) {
        MemoryUtil.memPutAddress(struct + PGROUPS, value.address());
        ngroupCount(struct, value.remaining());
    }

    public static void nmaxRecursionDepth(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXRECURSIONDEPTH, value);
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
        int stageCount = nstageCount(struct);
        long pStages = MemoryUtil.memGetAddress(struct + PSTAGES);
        Checks.check(pStages);
        validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        Checks.check(MemoryUtil.memGetAddress(struct + PGROUPS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineCreateInfoNV, Buffer> implements NativeResource {
        private static final VkRayTracingPipelineCreateInfoNV ELEMENT_FACTORY = VkRayTracingPipelineCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRayTracingPipelineCreateInfoNV.SIZEOF);
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
        public VkRayTracingPipelineCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRayTracingPipelineCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRayTracingPipelineCreateInfoNV.npNext(address());
        }

        @NativeType("VkPipelineCreateFlags")
        public int flags() {
            return VkRayTracingPipelineCreateInfoNV.nflags(address());
        }

        @NativeType("uint32_t")
        public int stageCount() {
            return VkRayTracingPipelineCreateInfoNV.nstageCount(address());
        }

        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() {
            return VkRayTracingPipelineCreateInfoNV.npStages(address());
        }

        @NativeType("uint32_t")
        public int groupCount() {
            return VkRayTracingPipelineCreateInfoNV.ngroupCount(address());
        }

        @NativeType("VkRayTracingShaderGroupCreateInfoNV const *")
        public VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups() {
            return VkRayTracingPipelineCreateInfoNV.npGroups(address());
        }

        @NativeType("uint32_t")
        public int maxRecursionDepth() {
            return VkRayTracingPipelineCreateInfoNV.nmaxRecursionDepth(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkRayTracingPipelineCreateInfoNV.nlayout(address());
        }

        @NativeType("VkPipeline")
        public long basePipelineHandle() {
            return VkRayTracingPipelineCreateInfoNV.nbasePipelineHandle(address());
        }

        @NativeType("int32_t")
        public int basePipelineIndex() {
            return VkRayTracingPipelineCreateInfoNV.nbasePipelineIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRayTracingPipelineCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000165000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRayTracingPipelineCreateInfoNV.npNext(address(), value);
            return this;
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

        public Buffer flags(@NativeType("VkPipelineCreateFlags") int value) {
            VkRayTracingPipelineCreateInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) {
            VkRayTracingPipelineCreateInfoNV.npStages(address(), value);
            return this;
        }

        public Buffer pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoNV const *") VkRayTracingShaderGroupCreateInfoNV.Buffer value) {
            VkRayTracingPipelineCreateInfoNV.npGroups(address(), value);
            return this;
        }

        public Buffer maxRecursionDepth(@NativeType("uint32_t") int value) {
            VkRayTracingPipelineCreateInfoNV.nmaxRecursionDepth(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkRayTracingPipelineCreateInfoNV.nlayout(address(), value);
            return this;
        }

        public Buffer basePipelineHandle(@NativeType("VkPipeline") long value) {
            VkRayTracingPipelineCreateInfoNV.nbasePipelineHandle(address(), value);
            return this;
        }

        public Buffer basePipelineIndex(@NativeType("int32_t") int value) {
            VkRayTracingPipelineCreateInfoNV.nbasePipelineIndex(address(), value);
            return this;
        }
    }
}
