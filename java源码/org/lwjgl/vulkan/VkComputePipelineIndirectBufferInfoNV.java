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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineIndirectBufferInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineIndirectBufferInfoNV.class */
public class VkComputePipelineIndirectBufferInfoNV extends Struct<VkComputePipelineIndirectBufferInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEADDRESS;
    public static final int SIZE;
    public static final int PIPELINEDEVICEADDRESSCAPTUREREPLAY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEADDRESS = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        PIPELINEDEVICEADDRESSCAPTUREREPLAY = layout.offsetof(4);
    }

    protected VkComputePipelineIndirectBufferInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkComputePipelineIndirectBufferInfoNV create(long address, ByteBuffer container) {
        return new VkComputePipelineIndirectBufferInfoNV(address, container);
    }

    public VkComputePipelineIndirectBufferInfoNV(ByteBuffer container) {
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

    @NativeType("VkDeviceAddress")
    public long deviceAddress() {
        return ndeviceAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkDeviceAddress")
    public long pipelineDeviceAddressCaptureReplay() {
        return npipelineDeviceAddressCaptureReplay(address());
    }

    public VkComputePipelineIndirectBufferInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkComputePipelineIndirectBufferInfoNV sType$Default() {
        return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV);
    }

    public VkComputePipelineIndirectBufferInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkComputePipelineIndirectBufferInfoNV deviceAddress(@NativeType("VkDeviceAddress") long value) {
        ndeviceAddress(address(), value);
        return this;
    }

    public VkComputePipelineIndirectBufferInfoNV size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkComputePipelineIndirectBufferInfoNV pipelineDeviceAddressCaptureReplay(@NativeType("VkDeviceAddress") long value) {
        npipelineDeviceAddressCaptureReplay(address(), value);
        return this;
    }

    public VkComputePipelineIndirectBufferInfoNV set(int sType, long pNext, long deviceAddress, long size, long pipelineDeviceAddressCaptureReplay) {
        sType(sType);
        pNext(pNext);
        deviceAddress(deviceAddress);
        size(size);
        pipelineDeviceAddressCaptureReplay(pipelineDeviceAddressCaptureReplay);
        return this;
    }

    public VkComputePipelineIndirectBufferInfoNV set(VkComputePipelineIndirectBufferInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkComputePipelineIndirectBufferInfoNV malloc() {
        return new VkComputePipelineIndirectBufferInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkComputePipelineIndirectBufferInfoNV calloc() {
        return new VkComputePipelineIndirectBufferInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkComputePipelineIndirectBufferInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComputePipelineIndirectBufferInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkComputePipelineIndirectBufferInfoNV create(long address) {
        return new VkComputePipelineIndirectBufferInfoNV(address, null);
    }

    public static VkComputePipelineIndirectBufferInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkComputePipelineIndirectBufferInfoNV(address, null);
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

    public static VkComputePipelineIndirectBufferInfoNV malloc(MemoryStack stack) {
        return new VkComputePipelineIndirectBufferInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkComputePipelineIndirectBufferInfoNV calloc(MemoryStack stack) {
        return new VkComputePipelineIndirectBufferInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndeviceAddress(long struct) {
        return MemoryUtil.memGetLong(struct + DEVICEADDRESS);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static long npipelineDeviceAddressCaptureReplay(long struct) {
        return MemoryUtil.memGetLong(struct + PIPELINEDEVICEADDRESSCAPTUREREPLAY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + DEVICEADDRESS, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void npipelineDeviceAddressCaptureReplay(long struct, long value) {
        MemoryUtil.memPutLong(struct + PIPELINEDEVICEADDRESSCAPTUREREPLAY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineIndirectBufferInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputePipelineIndirectBufferInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkComputePipelineIndirectBufferInfoNV, Buffer> implements NativeResource {
        private static final VkComputePipelineIndirectBufferInfoNV ELEMENT_FACTORY = VkComputePipelineIndirectBufferInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkComputePipelineIndirectBufferInfoNV.SIZEOF);
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
        public VkComputePipelineIndirectBufferInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkComputePipelineIndirectBufferInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkComputePipelineIndirectBufferInfoNV.npNext(address());
        }

        @NativeType("VkDeviceAddress")
        public long deviceAddress() {
            return VkComputePipelineIndirectBufferInfoNV.ndeviceAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkComputePipelineIndirectBufferInfoNV.nsize(address());
        }

        @NativeType("VkDeviceAddress")
        public long pipelineDeviceAddressCaptureReplay() {
            return VkComputePipelineIndirectBufferInfoNV.npipelineDeviceAddressCaptureReplay(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkComputePipelineIndirectBufferInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkComputePipelineIndirectBufferInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) {
            VkComputePipelineIndirectBufferInfoNV.ndeviceAddress(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkComputePipelineIndirectBufferInfoNV.nsize(address(), value);
            return this;
        }

        public Buffer pipelineDeviceAddressCaptureReplay(@NativeType("VkDeviceAddress") long value) {
            VkComputePipelineIndirectBufferInfoNV.npipelineDeviceAddressCaptureReplay(address(), value);
            return this;
        }
    }
}
