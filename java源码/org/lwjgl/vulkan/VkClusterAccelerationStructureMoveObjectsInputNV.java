package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureMoveObjectsInputNV.class */
public class VkClusterAccelerationStructureMoveObjectsInputNV extends Struct<VkClusterAccelerationStructureMoveObjectsInputNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int NOMOVEOVERLAP;
    public static final int MAXMOVEDBYTES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        NOMOVEOVERLAP = layout.offsetof(3);
        MAXMOVEDBYTES = layout.offsetof(4);
    }

    protected VkClusterAccelerationStructureMoveObjectsInputNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureMoveObjectsInputNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(address, container);
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV(ByteBuffer container) {
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

    @NativeType("VkClusterAccelerationStructureTypeNV")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkBool32")
    public boolean noMoveOverlap() {
        return nnoMoveOverlap(address()) != 0;
    }

    @NativeType("VkDeviceSize")
    public long maxMovedBytes() {
        return nmaxMovedBytes(address());
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV sType$Default() {
        return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV);
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV type(@NativeType("VkClusterAccelerationStructureTypeNV") int value) {
        ntype(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV noMoveOverlap(@NativeType("VkBool32") boolean value) {
        nnoMoveOverlap(address(), value ? 1 : 0);
        return this;
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV maxMovedBytes(@NativeType("VkDeviceSize") long value) {
        nmaxMovedBytes(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV set(int sType, long pNext, int type, boolean noMoveOverlap, long maxMovedBytes) {
        sType(sType);
        pNext(pNext);
        type(type);
        noMoveOverlap(noMoveOverlap);
        maxMovedBytes(maxMovedBytes);
        return this;
    }

    public VkClusterAccelerationStructureMoveObjectsInputNV set(VkClusterAccelerationStructureMoveObjectsInputNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV malloc() {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV calloc() {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureMoveObjectsInputNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV create(long address) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(address, null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureMoveObjectsInputNV(address, null);
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

    public static VkClusterAccelerationStructureMoveObjectsInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureMoveObjectsInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nnoMoveOverlap(long struct) {
        return MemoryUtil.memGetInt(struct + NOMOVEOVERLAP);
    }

    public static long nmaxMovedBytes(long struct) {
        return MemoryUtil.memGetLong(struct + MAXMOVEDBYTES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nnoMoveOverlap(long struct, int value) {
        MemoryUtil.memPutInt(struct + NOMOVEOVERLAP, value);
    }

    public static void nmaxMovedBytes(long struct, long value) {
        MemoryUtil.memPutLong(struct + MAXMOVEDBYTES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureMoveObjectsInputNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureMoveObjectsInputNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureMoveObjectsInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureMoveObjectsInputNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureMoveObjectsInputNV.SIZEOF);
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
        public VkClusterAccelerationStructureMoveObjectsInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkClusterAccelerationStructureMoveObjectsInputNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkClusterAccelerationStructureMoveObjectsInputNV.npNext(address());
        }

        @NativeType("VkClusterAccelerationStructureTypeNV")
        public int type() {
            return VkClusterAccelerationStructureMoveObjectsInputNV.ntype(address());
        }

        @NativeType("VkBool32")
        public boolean noMoveOverlap() {
            return VkClusterAccelerationStructureMoveObjectsInputNV.nnoMoveOverlap(address()) != 0;
        }

        @NativeType("VkDeviceSize")
        public long maxMovedBytes() {
            return VkClusterAccelerationStructureMoveObjectsInputNV.nmaxMovedBytes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkClusterAccelerationStructureMoveObjectsInputNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkClusterAccelerationStructureMoveObjectsInputNV.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkClusterAccelerationStructureTypeNV") int value) {
            VkClusterAccelerationStructureMoveObjectsInputNV.ntype(address(), value);
            return this;
        }

        public Buffer noMoveOverlap(@NativeType("VkBool32") boolean value) {
            VkClusterAccelerationStructureMoveObjectsInputNV.nnoMoveOverlap(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxMovedBytes(@NativeType("VkDeviceSize") long value) {
            VkClusterAccelerationStructureMoveObjectsInputNV.nmaxMovedBytes(address(), value);
            return this;
        }
    }
}
