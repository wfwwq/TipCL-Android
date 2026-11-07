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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInfoKHR.class */
public class VkPipelineExecutableInfoKHR extends Struct<VkPipelineExecutableInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINE;
    public static final int EXECUTABLEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINE = layout.offsetof(2);
        EXECUTABLEINDEX = layout.offsetof(3);
    }

    protected VkPipelineExecutableInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineExecutableInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineExecutableInfoKHR(address, container);
    }

    public VkPipelineExecutableInfoKHR(ByteBuffer container) {
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

    @NativeType("VkPipeline")
    public long pipeline() {
        return npipeline(address());
    }

    @NativeType("uint32_t")
    public int executableIndex() {
        return nexecutableIndex(address());
    }

    public VkPipelineExecutableInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineExecutableInfoKHR sType$Default() {
        return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR);
    }

    public VkPipelineExecutableInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineExecutableInfoKHR pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkPipelineExecutableInfoKHR executableIndex(@NativeType("uint32_t") int value) {
        nexecutableIndex(address(), value);
        return this;
    }

    public VkPipelineExecutableInfoKHR set(int sType, long pNext, long pipeline, int executableIndex) {
        sType(sType);
        pNext(pNext);
        pipeline(pipeline);
        executableIndex(executableIndex);
        return this;
    }

    public VkPipelineExecutableInfoKHR set(VkPipelineExecutableInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineExecutableInfoKHR malloc() {
        return new VkPipelineExecutableInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineExecutableInfoKHR calloc() {
        return new VkPipelineExecutableInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineExecutableInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineExecutableInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineExecutableInfoKHR create(long address) {
        return new VkPipelineExecutableInfoKHR(address, null);
    }

    public static VkPipelineExecutableInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineExecutableInfoKHR(address, null);
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

    public static VkPipelineExecutableInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineExecutableInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineExecutableInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineExecutableInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npipeline(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINE);
    }

    public static int nexecutableIndex(long struct) {
        return MemoryUtil.memGetInt(struct + EXECUTABLEINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipeline(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINE, value);
    }

    public static void nexecutableIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXECUTABLEINDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineExecutableInfoKHR, Buffer> implements NativeResource {
        private static final VkPipelineExecutableInfoKHR ELEMENT_FACTORY = VkPipelineExecutableInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineExecutableInfoKHR.SIZEOF);
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
        public VkPipelineExecutableInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineExecutableInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineExecutableInfoKHR.npNext(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkPipelineExecutableInfoKHR.npipeline(address());
        }

        @NativeType("uint32_t")
        public int executableIndex() {
            return VkPipelineExecutableInfoKHR.nexecutableIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineExecutableInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineExecutableInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkPipelineExecutableInfoKHR.npipeline(address(), value);
            return this;
        }

        public Buffer executableIndex(@NativeType("uint32_t") int value) {
            VkPipelineExecutableInfoKHR.nexecutableIndex(address(), value);
            return this;
        }
    }
}
