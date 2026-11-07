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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCoherentMemoryFeaturesAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCoherentMemoryFeaturesAMD.class */
public class VkPhysicalDeviceCoherentMemoryFeaturesAMD extends Struct<VkPhysicalDeviceCoherentMemoryFeaturesAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICECOHERENTMEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICECOHERENTMEMORY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCoherentMemoryFeaturesAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(address, container);
    }

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD(ByteBuffer container) {
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
    public boolean deviceCoherentMemory() {
        return ndeviceCoherentMemory(address()) != 0;
    }

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sType$Default() {
        return sType(AMDDeviceCoherentMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD);
    }

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD deviceCoherentMemory(@NativeType("VkBool32") boolean value) {
        ndeviceCoherentMemory(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD set(int sType, long pNext, boolean deviceCoherentMemory) {
        sType(sType);
        pNext(pNext);
        deviceCoherentMemory(deviceCoherentMemory);
        return this;
    }

    public VkPhysicalDeviceCoherentMemoryFeaturesAMD set(VkPhysicalDeviceCoherentMemoryFeaturesAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD malloc() {
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD calloc() {
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD create(long address) {
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(address, null);
    }

    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(address, null);
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

    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCoherentMemoryFeaturesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceCoherentMemory(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICECOHERENTMEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceCoherentMemory(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICECOHERENTMEMORY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCoherentMemoryFeaturesAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCoherentMemoryFeaturesAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCoherentMemoryFeaturesAMD, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCoherentMemoryFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceCoherentMemoryFeaturesAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCoherentMemoryFeaturesAMD.SIZEOF);
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
        public VkPhysicalDeviceCoherentMemoryFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCoherentMemoryFeaturesAMD.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCoherentMemoryFeaturesAMD.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean deviceCoherentMemory() {
            return VkPhysicalDeviceCoherentMemoryFeaturesAMD.ndeviceCoherentMemory(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCoherentMemoryFeaturesAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDDeviceCoherentMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCoherentMemoryFeaturesAMD.npNext(address(), value);
            return this;
        }

        public Buffer deviceCoherentMemory(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCoherentMemoryFeaturesAMD.ndeviceCoherentMemory(address(), value ? 1 : 0);
            return this;
        }
    }
}
