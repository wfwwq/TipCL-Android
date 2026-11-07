package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDataGraphOperationSupportARM.class */
public class VkPhysicalDeviceDataGraphOperationSupportARM extends Struct<VkPhysicalDeviceDataGraphOperationSupportARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OPERATIONTYPE;
    public static final int NAME;
    public static final int VERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __array(1, 128), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OPERATIONTYPE = layout.offsetof(0);
        NAME = layout.offsetof(1);
        VERSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDataGraphOperationSupportARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDataGraphOperationSupportARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(address, container);
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkPhysicalDeviceDataGraphOperationTypeARM")
    public int operationType() {
        return noperationType(address());
    }

    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("uint32_t")
    public int version() {
        return nversion(address());
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM operationType(@NativeType("VkPhysicalDeviceDataGraphOperationTypeARM") int value) {
        noperationType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM name(@NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM version(@NativeType("uint32_t") int value) {
        nversion(address(), value);
        return this;
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM set(int operationType, ByteBuffer name, int version) {
        operationType(operationType);
        name(name);
        version(version);
        return this;
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM set(VkPhysicalDeviceDataGraphOperationSupportARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDataGraphOperationSupportARM malloc() {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphOperationSupportARM calloc() {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphOperationSupportARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphOperationSupportARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDataGraphOperationSupportARM create(long address) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(address, null);
    }

    public static VkPhysicalDeviceDataGraphOperationSupportARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDataGraphOperationSupportARM(address, null);
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

    public static VkPhysicalDeviceDataGraphOperationSupportARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphOperationSupportARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int noperationType(long struct) {
        return MemoryUtil.memGetInt(struct + OPERATIONTYPE);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBuffer(struct + NAME, 128);
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(struct + NAME);
    }

    public static int nversion(long struct) {
        return MemoryUtil.memGetInt(struct + VERSION);
    }

    public static void noperationType(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPERATIONTYPE, value);
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
            Checks.checkGT(value, 128);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + NAME, value.remaining());
    }

    public static void nversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERSION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDataGraphOperationSupportARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphOperationSupportARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDataGraphOperationSupportARM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphOperationSupportARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDataGraphOperationSupportARM.SIZEOF);
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
        public VkPhysicalDeviceDataGraphOperationSupportARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkPhysicalDeviceDataGraphOperationTypeARM")
        public int operationType() {
            return VkPhysicalDeviceDataGraphOperationSupportARM.noperationType(address());
        }

        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
        public ByteBuffer name() {
            return VkPhysicalDeviceDataGraphOperationSupportARM.nname(address());
        }

        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
        public String nameString() {
            return VkPhysicalDeviceDataGraphOperationSupportARM.nnameString(address());
        }

        @NativeType("uint32_t")
        public int version() {
            return VkPhysicalDeviceDataGraphOperationSupportARM.nversion(address());
        }

        public Buffer operationType(@NativeType("VkPhysicalDeviceDataGraphOperationTypeARM") int value) {
            VkPhysicalDeviceDataGraphOperationSupportARM.noperationType(address(), value);
            return this;
        }

        public Buffer name(@NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]") ByteBuffer value) {
            VkPhysicalDeviceDataGraphOperationSupportARM.nname(address(), value);
            return this;
        }

        public Buffer version(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceDataGraphOperationSupportARM.nversion(address(), value);
            return this;
        }
    }
}
