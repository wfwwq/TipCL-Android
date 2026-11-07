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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBuildPartitionedAccelerationStructureIndirectCommandNV.class */
public class VkBuildPartitionedAccelerationStructureIndirectCommandNV extends Struct<VkBuildPartitionedAccelerationStructureIndirectCommandNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OPTYPE;
    public static final int ARGCOUNT;
    public static final int ARGDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(VkStridedDeviceAddressNV.SIZEOF, VkStridedDeviceAddressNV.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OPTYPE = layout.offsetof(0);
        ARGCOUNT = layout.offsetof(1);
        ARGDATA = layout.offsetof(2);
    }

    protected VkBuildPartitionedAccelerationStructureIndirectCommandNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV create(long address, ByteBuffer container) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(address, container);
    }

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkPartitionedAccelerationStructureOpTypeNV")
    public int opType() {
        return nopType(address());
    }

    @NativeType("uint32_t")
    public int argCount() {
        return nargCount(address());
    }

    public VkStridedDeviceAddressNV argData() {
        return nargData(address());
    }

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opType(@NativeType("VkPartitionedAccelerationStructureOpTypeNV") int value) {
        nopType(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCount(@NativeType("uint32_t") int value) {
        nargCount(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(VkStridedDeviceAddressNV value) {
        nargData(address(), value);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(Consumer<VkStridedDeviceAddressNV> consumer) {
        consumer.accept(argData());
        return this;
    }

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV set(int opType, int argCount, VkStridedDeviceAddressNV argData) {
        opType(opType);
        argCount(argCount);
        argData(argData);
        return this;
    }

    public VkBuildPartitionedAccelerationStructureIndirectCommandNV set(VkBuildPartitionedAccelerationStructureIndirectCommandNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV malloc() {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV calloc() {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(MemoryUtil.memAddress(container), container);
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV create(long address) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(address, null);
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(address, null);
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

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV malloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV calloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nopType(long struct) {
        return MemoryUtil.memGetInt(struct + OPTYPE);
    }

    public static int nargCount(long struct) {
        return MemoryUtil.memGetInt(struct + ARGCOUNT);
    }

    public static VkStridedDeviceAddressNV nargData(long struct) {
        return VkStridedDeviceAddressNV.create(struct + ARGDATA);
    }

    public static void nopType(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPTYPE, value);
    }

    public static void nargCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ARGCOUNT, value);
    }

    public static void nargData(long struct, VkStridedDeviceAddressNV value) {
        MemoryUtil.memCopy(value.address(), struct + ARGDATA, VkStridedDeviceAddressNV.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBuildPartitionedAccelerationStructureIndirectCommandNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkBuildPartitionedAccelerationStructureIndirectCommandNV, Buffer> implements NativeResource {
        private static final VkBuildPartitionedAccelerationStructureIndirectCommandNV ELEMENT_FACTORY = VkBuildPartitionedAccelerationStructureIndirectCommandNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBuildPartitionedAccelerationStructureIndirectCommandNV.SIZEOF);
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
        public VkBuildPartitionedAccelerationStructureIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkPartitionedAccelerationStructureOpTypeNV")
        public int opType() {
            return VkBuildPartitionedAccelerationStructureIndirectCommandNV.nopType(address());
        }

        @NativeType("uint32_t")
        public int argCount() {
            return VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargCount(address());
        }

        public VkStridedDeviceAddressNV argData() {
            return VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargData(address());
        }

        public Buffer opType(@NativeType("VkPartitionedAccelerationStructureOpTypeNV") int value) {
            VkBuildPartitionedAccelerationStructureIndirectCommandNV.nopType(address(), value);
            return this;
        }

        public Buffer argCount(@NativeType("uint32_t") int value) {
            VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargCount(address(), value);
            return this;
        }

        public Buffer argData(VkStridedDeviceAddressNV value) {
            VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargData(address(), value);
            return this;
        }

        public Buffer argData(Consumer<VkStridedDeviceAddressNV> consumer) {
            consumer.accept(argData());
            return this;
        }
    }
}
