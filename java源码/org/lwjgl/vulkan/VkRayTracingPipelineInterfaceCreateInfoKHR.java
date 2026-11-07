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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineInterfaceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineInterfaceCreateInfoKHR.class */
public class VkRayTracingPipelineInterfaceCreateInfoKHR extends Struct<VkRayTracingPipelineInterfaceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXPIPELINERAYPAYLOADSIZE;
    public static final int MAXPIPELINERAYHITATTRIBUTESIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXPIPELINERAYPAYLOADSIZE = layout.offsetof(2);
        MAXPIPELINERAYHITATTRIBUTESIZE = layout.offsetof(3);
    }

    protected VkRayTracingPipelineInterfaceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRayTracingPipelineInterfaceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(address, container);
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxPipelineRayPayloadSize() {
        return nmaxPipelineRayPayloadSize(address());
    }

    @NativeType("uint32_t")
    public int maxPipelineRayHitAttributeSize() {
        return nmaxPipelineRayHitAttributeSize(address());
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR sType$Default() {
        return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSize(@NativeType("uint32_t") int value) {
        nmaxPipelineRayPayloadSize(address(), value);
        return this;
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSize(@NativeType("uint32_t") int value) {
        nmaxPipelineRayHitAttributeSize(address(), value);
        return this;
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR set(int sType, long pNext, int maxPipelineRayPayloadSize, int maxPipelineRayHitAttributeSize) {
        sType(sType);
        pNext(pNext);
        maxPipelineRayPayloadSize(maxPipelineRayPayloadSize);
        maxPipelineRayHitAttributeSize(maxPipelineRayHitAttributeSize);
        return this;
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR set(VkRayTracingPipelineInterfaceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR malloc() {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR calloc() {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR create(long address) {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(address, null);
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(address, null);
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

    public static VkRayTracingPipelineInterfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxPipelineRayPayloadSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPIPELINERAYPAYLOADSIZE);
    }

    public static int nmaxPipelineRayHitAttributeSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPIPELINERAYHITATTRIBUTESIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxPipelineRayPayloadSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXPIPELINERAYPAYLOADSIZE, value);
    }

    public static void nmaxPipelineRayHitAttributeSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXPIPELINERAYHITATTRIBUTESIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineInterfaceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingPipelineInterfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineInterfaceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkRayTracingPipelineInterfaceCreateInfoKHR ELEMENT_FACTORY = VkRayTracingPipelineInterfaceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRayTracingPipelineInterfaceCreateInfoKHR.SIZEOF);
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
        public VkRayTracingPipelineInterfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRayTracingPipelineInterfaceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRayTracingPipelineInterfaceCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxPipelineRayPayloadSize() {
            return VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayPayloadSize(address());
        }

        @NativeType("uint32_t")
        public int maxPipelineRayHitAttributeSize() {
            return VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayHitAttributeSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRayTracingPipelineInterfaceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRayTracingPipelineInterfaceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer maxPipelineRayPayloadSize(@NativeType("uint32_t") int value) {
            VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayPayloadSize(address(), value);
            return this;
        }

        public Buffer maxPipelineRayHitAttributeSize(@NativeType("uint32_t") int value) {
            VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayHitAttributeSize(address(), value);
            return this;
        }
    }
}
