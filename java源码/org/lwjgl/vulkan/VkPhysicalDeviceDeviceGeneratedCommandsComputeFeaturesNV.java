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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.class */
public class VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEGENERATEDCOMPUTE;
    public static final int DEVICEGENERATEDCOMPUTEPIPELINES;
    public static final int DEVICEGENERATEDCOMPUTECAPTUREREPLAY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEGENERATEDCOMPUTE = layout.offsetof(2);
        DEVICEGENERATEDCOMPUTEPIPELINES = layout.offsetof(3);
        DEVICEGENERATEDCOMPUTECAPTUREREPLAY = layout.offsetof(4);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(address, container);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkBool32")
    public boolean deviceGeneratedCompute() {
        return ndeviceGeneratedCompute(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean deviceGeneratedComputePipelines() {
        return ndeviceGeneratedComputePipelines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean deviceGeneratedComputeCaptureReplay() {
        return ndeviceGeneratedComputeCaptureReplay(address()) != 0;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV sType$Default() {
        return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedCompute(@NativeType("VkBool32") boolean value) {
        ndeviceGeneratedCompute(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputePipelines(@NativeType("VkBool32") boolean value) {
        ndeviceGeneratedComputePipelines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV deviceGeneratedComputeCaptureReplay(@NativeType("VkBool32") boolean value) {
        ndeviceGeneratedComputeCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV set(int sType, long pNext, boolean deviceGeneratedCompute, boolean deviceGeneratedComputePipelines, boolean deviceGeneratedComputeCaptureReplay) {
        sType(sType);
        pNext(pNext);
        deviceGeneratedCompute(deviceGeneratedCompute);
        deviceGeneratedComputePipelines(deviceGeneratedComputePipelines);
        deviceGeneratedComputeCaptureReplay(deviceGeneratedComputeCaptureReplay);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV set(VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(address, null);
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

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceGeneratedCompute(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEGENERATEDCOMPUTE);
    }

    public static int ndeviceGeneratedComputePipelines(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEGENERATEDCOMPUTEPIPELINES);
    }

    public static int ndeviceGeneratedComputeCaptureReplay(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEGENERATEDCOMPUTECAPTUREREPLAY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceGeneratedCompute(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEGENERATEDCOMPUTE, value);
    }

    public static void ndeviceGeneratedComputePipelines(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEGENERATEDCOMPUTEPIPELINES, value);
    }

    public static void ndeviceGeneratedComputeCaptureReplay(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEGENERATEDCOMPUTECAPTUREREPLAY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean deviceGeneratedCompute() {
            return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedCompute(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean deviceGeneratedComputePipelines() {
            return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputePipelines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean deviceGeneratedComputeCaptureReplay() {
            return VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputeCaptureReplay(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommandsCompute.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer deviceGeneratedCompute(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedCompute(address(), value ? 1 : 0);
            return this;
        }

        public Buffer deviceGeneratedComputePipelines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputePipelines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer deviceGeneratedComputeCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.ndeviceGeneratedComputeCaptureReplay(address(), value ? 1 : 0);
            return this;
        }
    }
}
