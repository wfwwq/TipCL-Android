package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInputInfoNV.class */
public class VkClusterAccelerationStructureInputInfoNV extends Struct<VkClusterAccelerationStructureInputInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXACCELERATIONSTRUCTURECOUNT;
    public static final int FLAGS;
    public static final int OPTYPE;
    public static final int OPMODE;
    public static final int OPINPUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(VkClusterAccelerationStructureOpInputNV.SIZEOF, VkClusterAccelerationStructureOpInputNV.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXACCELERATIONSTRUCTURECOUNT = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        OPTYPE = layout.offsetof(4);
        OPMODE = layout.offsetof(5);
        OPINPUT = layout.offsetof(6);
    }

    protected VkClusterAccelerationStructureInputInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureInputInfoNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureInputInfoNV(address, container);
    }

    public VkClusterAccelerationStructureInputInfoNV(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxAccelerationStructureCount() {
        return nmaxAccelerationStructureCount(address());
    }

    @NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkClusterAccelerationStructureOpTypeNV")
    public int opType() {
        return nopType(address());
    }

    @NativeType("VkClusterAccelerationStructureOpModeNV")
    public int opMode() {
        return nopMode(address());
    }

    public VkClusterAccelerationStructureOpInputNV opInput() {
        return nopInput(address());
    }

    public VkClusterAccelerationStructureInputInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV sType$Default() {
        return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV);
    }

    public VkClusterAccelerationStructureInputInfoNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCount(@NativeType("uint32_t") int value) {
        nmaxAccelerationStructureCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV opType(@NativeType("VkClusterAccelerationStructureOpTypeNV") int value) {
        nopType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV opMode(@NativeType("VkClusterAccelerationStructureOpModeNV") int value) {
        nopMode(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV opInput(VkClusterAccelerationStructureOpInputNV value) {
        nopInput(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV opInput(Consumer<VkClusterAccelerationStructureOpInputNV> consumer) {
        consumer.accept(opInput());
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV set(int sType, long pNext, int maxAccelerationStructureCount, int flags, int opType, int opMode, VkClusterAccelerationStructureOpInputNV opInput) {
        sType(sType);
        pNext(pNext);
        maxAccelerationStructureCount(maxAccelerationStructureCount);
        flags(flags);
        opType(opType);
        opMode(opMode);
        opInput(opInput);
        return this;
    }

    public VkClusterAccelerationStructureInputInfoNV set(VkClusterAccelerationStructureInputInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureInputInfoNV malloc() {
        return new VkClusterAccelerationStructureInputInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureInputInfoNV calloc() {
        return new VkClusterAccelerationStructureInputInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureInputInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureInputInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureInputInfoNV create(long address) {
        return new VkClusterAccelerationStructureInputInfoNV(address, null);
    }

    public static VkClusterAccelerationStructureInputInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureInputInfoNV(address, null);
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

    public static VkClusterAccelerationStructureInputInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInputInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureInputInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInputInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxAccelerationStructureCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXACCELERATIONSTRUCTURECOUNT);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nopType(long struct) {
        return MemoryUtil.memGetInt(struct + OPTYPE);
    }

    public static int nopMode(long struct) {
        return MemoryUtil.memGetInt(struct + OPMODE);
    }

    public static VkClusterAccelerationStructureOpInputNV nopInput(long struct) {
        return VkClusterAccelerationStructureOpInputNV.create(struct + OPINPUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxAccelerationStructureCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXACCELERATIONSTRUCTURECOUNT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nopType(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPTYPE, value);
    }

    public static void nopMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPMODE, value);
    }

    public static void nopInput(long struct, VkClusterAccelerationStructureOpInputNV value) {
        MemoryUtil.memCopy(value.address(), struct + OPINPUT, VkClusterAccelerationStructureOpInputNV.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInputInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureInputInfoNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureInputInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureInputInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureInputInfoNV.SIZEOF);
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
        public VkClusterAccelerationStructureInputInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkClusterAccelerationStructureInputInfoNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkClusterAccelerationStructureInputInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxAccelerationStructureCount() {
            return VkClusterAccelerationStructureInputInfoNV.nmaxAccelerationStructureCount(address());
        }

        @NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() {
            return VkClusterAccelerationStructureInputInfoNV.nflags(address());
        }

        @NativeType("VkClusterAccelerationStructureOpTypeNV")
        public int opType() {
            return VkClusterAccelerationStructureInputInfoNV.nopType(address());
        }

        @NativeType("VkClusterAccelerationStructureOpModeNV")
        public int opMode() {
            return VkClusterAccelerationStructureInputInfoNV.nopMode(address());
        }

        public VkClusterAccelerationStructureOpInputNV opInput() {
            return VkClusterAccelerationStructureInputInfoNV.nopInput(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkClusterAccelerationStructureInputInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkClusterAccelerationStructureInputInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer maxAccelerationStructureCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureInputInfoNV.nmaxAccelerationStructureCount(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) {
            VkClusterAccelerationStructureInputInfoNV.nflags(address(), value);
            return this;
        }

        public Buffer opType(@NativeType("VkClusterAccelerationStructureOpTypeNV") int value) {
            VkClusterAccelerationStructureInputInfoNV.nopType(address(), value);
            return this;
        }

        public Buffer opMode(@NativeType("VkClusterAccelerationStructureOpModeNV") int value) {
            VkClusterAccelerationStructureInputInfoNV.nopMode(address(), value);
            return this;
        }

        public Buffer opInput(VkClusterAccelerationStructureOpInputNV value) {
            VkClusterAccelerationStructureInputInfoNV.nopInput(address(), value);
            return this;
        }

        public Buffer opInput(Consumer<VkClusterAccelerationStructureOpInputNV> consumer) {
            consumer.accept(opInput());
            return this;
        }
    }
}
