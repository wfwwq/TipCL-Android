package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindAccelerationStructureMemoryInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindAccelerationStructureMemoryInfoNV.class */
public class VkBindAccelerationStructureMemoryInfoNV extends Struct<VkBindAccelerationStructureMemoryInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACCELERATIONSTRUCTURE;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;
    public static final int DEVICEINDEXCOUNT;
    public static final int PDEVICEINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        DEVICEINDEXCOUNT = layout.offsetof(5);
        PDEVICEINDICES = layout.offsetof(6);
    }

    protected VkBindAccelerationStructureMemoryInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindAccelerationStructureMemoryInfoNV create(long address, ByteBuffer container) {
        return new VkBindAccelerationStructureMemoryInfoNV(address, container);
    }

    public VkBindAccelerationStructureMemoryInfoNV(ByteBuffer container) {
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

    @NativeType("VkAccelerationStructureNV")
    public long accelerationStructure() {
        return naccelerationStructure(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long memoryOffset() {
        return nmemoryOffset(address());
    }

    @NativeType("uint32_t")
    public int deviceIndexCount() {
        return ndeviceIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() {
        return npDeviceIndices(address());
    }

    public VkBindAccelerationStructureMemoryInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindAccelerationStructureMemoryInfoNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV);
    }

    public VkBindAccelerationStructureMemoryInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindAccelerationStructureMemoryInfoNV accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) {
        naccelerationStructure(address(), value);
        return this;
    }

    public VkBindAccelerationStructureMemoryInfoNV memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkBindAccelerationStructureMemoryInfoNV memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npDeviceIndices(address(), value);
        return this;
    }

    public VkBindAccelerationStructureMemoryInfoNV set(int sType, long pNext, long accelerationStructure, long memory, long memoryOffset, IntBuffer pDeviceIndices) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        memory(memory);
        memoryOffset(memoryOffset);
        pDeviceIndices(pDeviceIndices);
        return this;
    }

    public VkBindAccelerationStructureMemoryInfoNV set(VkBindAccelerationStructureMemoryInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindAccelerationStructureMemoryInfoNV malloc() {
        return new VkBindAccelerationStructureMemoryInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindAccelerationStructureMemoryInfoNV calloc() {
        return new VkBindAccelerationStructureMemoryInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindAccelerationStructureMemoryInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindAccelerationStructureMemoryInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkBindAccelerationStructureMemoryInfoNV create(long address) {
        return new VkBindAccelerationStructureMemoryInfoNV(address, null);
    }

    public static VkBindAccelerationStructureMemoryInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindAccelerationStructureMemoryInfoNV(address, null);
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

    public static VkBindAccelerationStructureMemoryInfoNV malloc(MemoryStack stack) {
        return new VkBindAccelerationStructureMemoryInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindAccelerationStructureMemoryInfoNV calloc(MemoryStack stack) {
        return new VkBindAccelerationStructureMemoryInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURE);
    }

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static long nmemoryOffset(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORYOFFSET);
    }

    public static int ndeviceIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEINDEXCOUNT);
    }

    public static IntBuffer npDeviceIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDEVICEINDICES), ndeviceIndexCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURE, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nmemoryOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYOFFSET, value);
    }

    public static void ndeviceIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEINDEXCOUNT, value);
    }

    public static void npDeviceIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDEVICEINDICES, MemoryUtil.memAddressSafe(value));
        ndeviceIndexCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDEVICEINDICES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindAccelerationStructureMemoryInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindAccelerationStructureMemoryInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindAccelerationStructureMemoryInfoNV, Buffer> implements NativeResource {
        private static final VkBindAccelerationStructureMemoryInfoNV ELEMENT_FACTORY = VkBindAccelerationStructureMemoryInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindAccelerationStructureMemoryInfoNV.SIZEOF);
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
        public VkBindAccelerationStructureMemoryInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindAccelerationStructureMemoryInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindAccelerationStructureMemoryInfoNV.npNext(address());
        }

        @NativeType("VkAccelerationStructureNV")
        public long accelerationStructure() {
            return VkBindAccelerationStructureMemoryInfoNV.naccelerationStructure(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkBindAccelerationStructureMemoryInfoNV.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkBindAccelerationStructureMemoryInfoNV.nmemoryOffset(address());
        }

        @NativeType("uint32_t")
        public int deviceIndexCount() {
            return VkBindAccelerationStructureMemoryInfoNV.ndeviceIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() {
            return VkBindAccelerationStructureMemoryInfoNV.npDeviceIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindAccelerationStructureMemoryInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindAccelerationStructureMemoryInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) {
            VkBindAccelerationStructureMemoryInfoNV.naccelerationStructure(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkBindAccelerationStructureMemoryInfoNV.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkBindAccelerationStructureMemoryInfoNV.nmemoryOffset(address(), value);
            return this;
        }

        public Buffer pDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkBindAccelerationStructureMemoryInfoNV.npDeviceIndices(address(), value);
            return this;
        }
    }
}
