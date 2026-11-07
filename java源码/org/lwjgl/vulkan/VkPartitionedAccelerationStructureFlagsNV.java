package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureFlagsNV.class */
public class VkPartitionedAccelerationStructureFlagsNV extends Struct<VkPartitionedAccelerationStructureFlagsNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ENABLEPARTITIONTRANSLATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENABLEPARTITIONTRANSLATION = layout.offsetof(2);
    }

    protected VkPartitionedAccelerationStructureFlagsNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPartitionedAccelerationStructureFlagsNV create(long address, ByteBuffer container) {
        return new VkPartitionedAccelerationStructureFlagsNV(address, container);
    }

    public VkPartitionedAccelerationStructureFlagsNV(ByteBuffer container) {
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
    public boolean enablePartitionTranslation() {
        return nenablePartitionTranslation(address()) != 0;
    }

    public VkPartitionedAccelerationStructureFlagsNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureFlagsNV sType$Default() {
        return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV);
    }

    public VkPartitionedAccelerationStructureFlagsNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPartitionedAccelerationStructureFlagsNV enablePartitionTranslation(@NativeType("VkBool32") boolean value) {
        nenablePartitionTranslation(address(), value ? 1 : 0);
        return this;
    }

    public VkPartitionedAccelerationStructureFlagsNV set(int sType, long pNext, boolean enablePartitionTranslation) {
        sType(sType);
        pNext(pNext);
        enablePartitionTranslation(enablePartitionTranslation);
        return this;
    }

    public VkPartitionedAccelerationStructureFlagsNV set(VkPartitionedAccelerationStructureFlagsNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPartitionedAccelerationStructureFlagsNV malloc() {
        return new VkPartitionedAccelerationStructureFlagsNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureFlagsNV calloc() {
        return new VkPartitionedAccelerationStructureFlagsNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureFlagsNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureFlagsNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPartitionedAccelerationStructureFlagsNV create(long address) {
        return new VkPartitionedAccelerationStructureFlagsNV(address, null);
    }

    public static VkPartitionedAccelerationStructureFlagsNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPartitionedAccelerationStructureFlagsNV(address, null);
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

    public static VkPartitionedAccelerationStructureFlagsNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureFlagsNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPartitionedAccelerationStructureFlagsNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureFlagsNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nenablePartitionTranslation(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLEPARTITIONTRANSLATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nenablePartitionTranslation(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLEPARTITIONTRANSLATION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPartitionedAccelerationStructureFlagsNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureFlagsNV, Buffer> implements NativeResource {
        private static final VkPartitionedAccelerationStructureFlagsNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureFlagsNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPartitionedAccelerationStructureFlagsNV.SIZEOF);
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
        public VkPartitionedAccelerationStructureFlagsNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPartitionedAccelerationStructureFlagsNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPartitionedAccelerationStructureFlagsNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean enablePartitionTranslation() {
            return VkPartitionedAccelerationStructureFlagsNV.nenablePartitionTranslation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPartitionedAccelerationStructureFlagsNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_FLAGS_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPartitionedAccelerationStructureFlagsNV.npNext(address(), value);
            return this;
        }

        public Buffer enablePartitionTranslation(@NativeType("VkBool32") boolean value) {
            VkPartitionedAccelerationStructureFlagsNV.nenablePartitionTranslation(address(), value ? 1 : 0);
            return this;
        }
    }
}
