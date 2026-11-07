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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineIndirectDeviceAddressInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineIndirectDeviceAddressInfoNV.class */
public class VkPipelineIndirectDeviceAddressInfoNV extends Struct<VkPipelineIndirectDeviceAddressInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEBINDPOINT;
    public static final int PIPELINE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
    }

    protected VkPipelineIndirectDeviceAddressInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineIndirectDeviceAddressInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineIndirectDeviceAddressInfoNV(address, container);
    }

    public VkPipelineIndirectDeviceAddressInfoNV(ByteBuffer container) {
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

    public VkPipelineIndirectDeviceAddressInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineIndirectDeviceAddressInfoNV sType$Default() {
        return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV);
    }

    public VkPipelineIndirectDeviceAddressInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineIndirectDeviceAddressInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
        npipelineBindPoint(address(), value);
        return this;
    }

    public VkPipelineIndirectDeviceAddressInfoNV pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    public VkPipelineIndirectDeviceAddressInfoNV set(int sType, long pNext, int pipelineBindPoint, long pipeline) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);
        return this;
    }

    public VkPipelineIndirectDeviceAddressInfoNV set(VkPipelineIndirectDeviceAddressInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineIndirectDeviceAddressInfoNV malloc() {
        return new VkPipelineIndirectDeviceAddressInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineIndirectDeviceAddressInfoNV calloc() {
        return new VkPipelineIndirectDeviceAddressInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineIndirectDeviceAddressInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineIndirectDeviceAddressInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineIndirectDeviceAddressInfoNV create(long address) {
        return new VkPipelineIndirectDeviceAddressInfoNV(address, null);
    }

    public static VkPipelineIndirectDeviceAddressInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineIndirectDeviceAddressInfoNV(address, null);
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

    public static VkPipelineIndirectDeviceAddressInfoNV malloc(MemoryStack stack) {
        return new VkPipelineIndirectDeviceAddressInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineIndirectDeviceAddressInfoNV calloc(MemoryStack stack) {
        return new VkPipelineIndirectDeviceAddressInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineIndirectDeviceAddressInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineIndirectDeviceAddressInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineIndirectDeviceAddressInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineIndirectDeviceAddressInfoNV ELEMENT_FACTORY = VkPipelineIndirectDeviceAddressInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineIndirectDeviceAddressInfoNV.SIZEOF);
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
        public VkPipelineIndirectDeviceAddressInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineIndirectDeviceAddressInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineIndirectDeviceAddressInfoNV.npNext(address());
        }

        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() {
            return VkPipelineIndirectDeviceAddressInfoNV.npipelineBindPoint(address());
        }

        @NativeType("VkPipeline")
        public long pipeline() {
            return VkPipelineIndirectDeviceAddressInfoNV.npipeline(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineIndirectDeviceAddressInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineIndirectDeviceAddressInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) {
            VkPipelineIndirectDeviceAddressInfoNV.npipelineBindPoint(address(), value);
            return this;
        }

        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkPipelineIndirectDeviceAddressInfoNV.npipeline(address(), value);
            return this;
        }
    }
}
