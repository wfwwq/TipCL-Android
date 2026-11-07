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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildSizesInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildSizesInfoKHR.class */
public class VkAccelerationStructureBuildSizesInfoKHR extends Struct<VkAccelerationStructureBuildSizesInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACCELERATIONSTRUCTURESIZE;
    public static final int UPDATESCRATCHSIZE;
    public static final int BUILDSCRATCHSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURESIZE = layout.offsetof(2);
        UPDATESCRATCHSIZE = layout.offsetof(3);
        BUILDSCRATCHSIZE = layout.offsetof(4);
    }

    protected VkAccelerationStructureBuildSizesInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureBuildSizesInfoKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureBuildSizesInfoKHR(address, container);
    }

    public VkAccelerationStructureBuildSizesInfoKHR(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long accelerationStructureSize() {
        return naccelerationStructureSize(address());
    }

    @NativeType("VkDeviceSize")
    public long updateScratchSize() {
        return nupdateScratchSize(address());
    }

    @NativeType("VkDeviceSize")
    public long buildScratchSize() {
        return nbuildScratchSize(address());
    }

    public VkAccelerationStructureBuildSizesInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildSizesInfoKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR);
    }

    public VkAccelerationStructureBuildSizesInfoKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureBuildSizesInfoKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkAccelerationStructureBuildSizesInfoKHR set(VkAccelerationStructureBuildSizesInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureBuildSizesInfoKHR malloc() {
        return new VkAccelerationStructureBuildSizesInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureBuildSizesInfoKHR calloc() {
        return new VkAccelerationStructureBuildSizesInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureBuildSizesInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureBuildSizesInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureBuildSizesInfoKHR create(long address) {
        return new VkAccelerationStructureBuildSizesInfoKHR(address, null);
    }

    public static VkAccelerationStructureBuildSizesInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureBuildSizesInfoKHR(address, null);
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

    public static VkAccelerationStructureBuildSizesInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildSizesInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureBuildSizesInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureBuildSizesInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naccelerationStructureSize(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURESIZE);
    }

    public static long nupdateScratchSize(long struct) {
        return MemoryUtil.memGetLong(struct + UPDATESCRATCHSIZE);
    }

    public static long nbuildScratchSize(long struct) {
        return MemoryUtil.memGetLong(struct + BUILDSCRATCHSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildSizesInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureBuildSizesInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildSizesInfoKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureBuildSizesInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildSizesInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureBuildSizesInfoKHR.SIZEOF);
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
        public VkAccelerationStructureBuildSizesInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureBuildSizesInfoKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAccelerationStructureBuildSizesInfoKHR.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long accelerationStructureSize() {
            return VkAccelerationStructureBuildSizesInfoKHR.naccelerationStructureSize(address());
        }

        @NativeType("VkDeviceSize")
        public long updateScratchSize() {
            return VkAccelerationStructureBuildSizesInfoKHR.nupdateScratchSize(address());
        }

        @NativeType("VkDeviceSize")
        public long buildScratchSize() {
            return VkAccelerationStructureBuildSizesInfoKHR.nbuildScratchSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureBuildSizesInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAccelerationStructureBuildSizesInfoKHR.npNext(address(), value);
            return this;
        }
    }
}
