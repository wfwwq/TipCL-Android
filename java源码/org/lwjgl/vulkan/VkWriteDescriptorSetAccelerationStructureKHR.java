package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetAccelerationStructureKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetAccelerationStructureKHR.class */
public class VkWriteDescriptorSetAccelerationStructureKHR extends Struct<VkWriteDescriptorSetAccelerationStructureKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACCELERATIONSTRUCTURECOUNT;
    public static final int PACCELERATIONSTRUCTURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURECOUNT = layout.offsetof(2);
        PACCELERATIONSTRUCTURES = layout.offsetof(3);
    }

    protected VkWriteDescriptorSetAccelerationStructureKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWriteDescriptorSetAccelerationStructureKHR create(long address, ByteBuffer container) {
        return new VkWriteDescriptorSetAccelerationStructureKHR(address, container);
    }

    public VkWriteDescriptorSetAccelerationStructureKHR(ByteBuffer container) {
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
    public int accelerationStructureCount() {
        return naccelerationStructureCount(address());
    }

    @NativeType("VkAccelerationStructureKHR const *")
    public LongBuffer pAccelerationStructures() {
        return npAccelerationStructures(address());
    }

    public VkWriteDescriptorSetAccelerationStructureKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWriteDescriptorSetAccelerationStructureKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR);
    }

    public VkWriteDescriptorSetAccelerationStructureKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWriteDescriptorSetAccelerationStructureKHR accelerationStructureCount(@NativeType("uint32_t") int value) {
        naccelerationStructureCount(address(), value);
        return this;
    }

    public VkWriteDescriptorSetAccelerationStructureKHR pAccelerationStructures(@NativeType("VkAccelerationStructureKHR const *") LongBuffer value) {
        npAccelerationStructures(address(), value);
        return this;
    }

    public VkWriteDescriptorSetAccelerationStructureKHR set(int sType, long pNext, int accelerationStructureCount, LongBuffer pAccelerationStructures) {
        sType(sType);
        pNext(pNext);
        accelerationStructureCount(accelerationStructureCount);
        pAccelerationStructures(pAccelerationStructures);
        return this;
    }

    public VkWriteDescriptorSetAccelerationStructureKHR set(VkWriteDescriptorSetAccelerationStructureKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR malloc() {
        return new VkWriteDescriptorSetAccelerationStructureKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR calloc() {
        return new VkWriteDescriptorSetAccelerationStructureKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetAccelerationStructureKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR create(long address) {
        return new VkWriteDescriptorSetAccelerationStructureKHR(address, null);
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteDescriptorSetAccelerationStructureKHR(address, null);
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

    public static VkWriteDescriptorSetAccelerationStructureKHR malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetAccelerationStructureKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteDescriptorSetAccelerationStructureKHR calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetAccelerationStructureKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int naccelerationStructureCount(long struct) {
        return MemoryUtil.memGetInt(struct + ACCELERATIONSTRUCTURECOUNT);
    }

    public static LongBuffer npAccelerationStructures(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PACCELERATIONSTRUCTURES), naccelerationStructureCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naccelerationStructureCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACCELERATIONSTRUCTURECOUNT, value);
    }

    public static void npAccelerationStructures(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PACCELERATIONSTRUCTURES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            naccelerationStructureCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetAccelerationStructureKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetAccelerationStructureKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetAccelerationStructureKHR, Buffer> implements NativeResource {
        private static final VkWriteDescriptorSetAccelerationStructureKHR ELEMENT_FACTORY = VkWriteDescriptorSetAccelerationStructureKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWriteDescriptorSetAccelerationStructureKHR.SIZEOF);
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
        public VkWriteDescriptorSetAccelerationStructureKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWriteDescriptorSetAccelerationStructureKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWriteDescriptorSetAccelerationStructureKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int accelerationStructureCount() {
            return VkWriteDescriptorSetAccelerationStructureKHR.naccelerationStructureCount(address());
        }

        @NativeType("VkAccelerationStructureKHR const *")
        public LongBuffer pAccelerationStructures() {
            return VkWriteDescriptorSetAccelerationStructureKHR.npAccelerationStructures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteDescriptorSetAccelerationStructureKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWriteDescriptorSetAccelerationStructureKHR.npNext(address(), value);
            return this;
        }

        public Buffer accelerationStructureCount(@NativeType("uint32_t") int value) {
            VkWriteDescriptorSetAccelerationStructureKHR.naccelerationStructureCount(address(), value);
            return this;
        }

        public Buffer pAccelerationStructures(@NativeType("VkAccelerationStructureKHR const *") LongBuffer value) {
            VkWriteDescriptorSetAccelerationStructureKHR.npAccelerationStructures(address(), value);
            return this;
        }
    }
}
