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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo.class */
public class VkQueryPoolCreateInfo extends Struct<VkQueryPoolCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int QUERYTYPE;
    public static final int QUERYCOUNT;
    public static final int PIPELINESTATISTICS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUERYTYPE = layout.offsetof(3);
        QUERYCOUNT = layout.offsetof(4);
        PIPELINESTATISTICS = layout.offsetof(5);
    }

    protected VkQueryPoolCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueryPoolCreateInfo create(long address, ByteBuffer container) {
        return new VkQueryPoolCreateInfo(address, container);
    }

    public VkQueryPoolCreateInfo(ByteBuffer container) {
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

    @NativeType("VkQueryPoolCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkQueryType")
    public int queryType() {
        return nqueryType(address());
    }

    @NativeType("uint32_t")
    public int queryCount() {
        return nqueryCount(address());
    }

    @NativeType("VkQueryPipelineStatisticFlags")
    public int pipelineStatistics() {
        return npipelineStatistics(address());
    }

    public VkQueryPoolCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueryPoolCreateInfo sType$Default() {
        return sType(11);
    }

    public VkQueryPoolCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueryPoolCreateInfo pNext(VkQueryPoolCreateInfoINTEL value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkQueryPoolPerformanceCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkQueryPoolPerformanceQueryCreateInfoINTEL value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkQueryPoolVideoEncodeFeedbackCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoDecodeAV1ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoDecodeH264ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoDecodeH265ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoDecodeUsageInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoDecodeVP9ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoEncodeAV1ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoEncodeH264ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoEncodeH265ProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoEncodeUsageInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo pNext(VkVideoProfileInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkQueryPoolCreateInfo flags(@NativeType("VkQueryPoolCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkQueryPoolCreateInfo queryType(@NativeType("VkQueryType") int value) {
        nqueryType(address(), value);
        return this;
    }

    public VkQueryPoolCreateInfo queryCount(@NativeType("uint32_t") int value) {
        nqueryCount(address(), value);
        return this;
    }

    public VkQueryPoolCreateInfo pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) {
        npipelineStatistics(address(), value);
        return this;
    }

    public VkQueryPoolCreateInfo set(int sType, long pNext, int flags, int queryType, int queryCount, int pipelineStatistics) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queryType(queryType);
        queryCount(queryCount);
        pipelineStatistics(pipelineStatistics);
        return this;
    }

    public VkQueryPoolCreateInfo set(VkQueryPoolCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueryPoolCreateInfo malloc() {
        return new VkQueryPoolCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueryPoolCreateInfo calloc() {
        return new VkQueryPoolCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueryPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryPoolCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkQueryPoolCreateInfo create(long address) {
        return new VkQueryPoolCreateInfo(address, null);
    }

    public static VkQueryPoolCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueryPoolCreateInfo(address, null);
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

    public static VkQueryPoolCreateInfo malloc(MemoryStack stack) {
        return new VkQueryPoolCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueryPoolCreateInfo calloc(MemoryStack stack) {
        return new VkQueryPoolCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueryType(long struct) {
        return MemoryUtil.memGetInt(struct + QUERYTYPE);
    }

    public static int nqueryCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUERYCOUNT);
    }

    public static int npipelineStatistics(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINESTATISTICS);
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

    public static void nqueryType(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUERYTYPE, value);
    }

    public static void nqueryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUERYCOUNT, value);
    }

    public static void npipelineStatistics(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINESTATISTICS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueryPoolCreateInfo, Buffer> implements NativeResource {
        private static final VkQueryPoolCreateInfo ELEMENT_FACTORY = VkQueryPoolCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueryPoolCreateInfo.SIZEOF);
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
        public VkQueryPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueryPoolCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkQueryPoolCreateInfo.npNext(address());
        }

        @NativeType("VkQueryPoolCreateFlags")
        public int flags() {
            return VkQueryPoolCreateInfo.nflags(address());
        }

        @NativeType("VkQueryType")
        public int queryType() {
            return VkQueryPoolCreateInfo.nqueryType(address());
        }

        @NativeType("uint32_t")
        public int queryCount() {
            return VkQueryPoolCreateInfo.nqueryCount(address());
        }

        @NativeType("VkQueryPipelineStatisticFlags")
        public int pipelineStatistics() {
            return VkQueryPoolCreateInfo.npipelineStatistics(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueryPoolCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(11);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkQueryPoolCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkQueryPoolCreateInfoINTEL value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkQueryPoolPerformanceCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkQueryPoolPerformanceQueryCreateInfoINTEL value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkQueryPoolVideoEncodeFeedbackCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeAV1ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH264ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH265ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeUsageInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeVP9ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeAV1ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265ProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeUsageInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoProfileInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkQueryPoolCreateFlags") int value) {
            VkQueryPoolCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer queryType(@NativeType("VkQueryType") int value) {
            VkQueryPoolCreateInfo.nqueryType(address(), value);
            return this;
        }

        public Buffer queryCount(@NativeType("uint32_t") int value) {
            VkQueryPoolCreateInfo.nqueryCount(address(), value);
            return this;
        }

        public Buffer pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) {
            VkQueryPoolCreateInfo.npipelineStatistics(address(), value);
            return this;
        }
    }
}
