package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyDataGraphPropertiesARM.class */
public class VkQueueFamilyDataGraphPropertiesARM extends Struct<VkQueueFamilyDataGraphPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ENGINE;
    public static final int OPERATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkPhysicalDeviceDataGraphProcessingEngineARM.SIZEOF, VkPhysicalDeviceDataGraphProcessingEngineARM.ALIGNOF), __member(VkPhysicalDeviceDataGraphOperationSupportARM.SIZEOF, VkPhysicalDeviceDataGraphOperationSupportARM.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENGINE = layout.offsetof(2);
        OPERATION = layout.offsetof(3);
    }

    protected VkQueueFamilyDataGraphPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyDataGraphPropertiesARM create(long address, ByteBuffer container) {
        return new VkQueueFamilyDataGraphPropertiesARM(address, container);
    }

    public VkQueueFamilyDataGraphPropertiesARM(ByteBuffer container) {
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

    public VkPhysicalDeviceDataGraphProcessingEngineARM engine() {
        return nengine(address());
    }

    public VkPhysicalDeviceDataGraphOperationSupportARM operation() {
        return noperation(address());
    }

    public VkQueueFamilyDataGraphPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueueFamilyDataGraphPropertiesARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM);
    }

    public VkQueueFamilyDataGraphPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueueFamilyDataGraphPropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkQueueFamilyDataGraphPropertiesARM set(VkQueueFamilyDataGraphPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueueFamilyDataGraphPropertiesARM malloc() {
        return new VkQueueFamilyDataGraphPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyDataGraphPropertiesARM calloc() {
        return new VkQueueFamilyDataGraphPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyDataGraphPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyDataGraphPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyDataGraphPropertiesARM create(long address) {
        return new VkQueueFamilyDataGraphPropertiesARM(address, null);
    }

    public static VkQueueFamilyDataGraphPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyDataGraphPropertiesARM(address, null);
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

    public static VkQueueFamilyDataGraphPropertiesARM malloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyDataGraphPropertiesARM calloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPhysicalDeviceDataGraphProcessingEngineARM nengine(long struct) {
        return VkPhysicalDeviceDataGraphProcessingEngineARM.create(struct + ENGINE);
    }

    public static VkPhysicalDeviceDataGraphOperationSupportARM noperation(long struct) {
        return VkPhysicalDeviceDataGraphOperationSupportARM.create(struct + OPERATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyDataGraphPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyDataGraphPropertiesARM, Buffer> implements NativeResource {
        private static final VkQueueFamilyDataGraphPropertiesARM ELEMENT_FACTORY = VkQueueFamilyDataGraphPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyDataGraphPropertiesARM.SIZEOF);
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
        public VkQueueFamilyDataGraphPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueueFamilyDataGraphPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkQueueFamilyDataGraphPropertiesARM.npNext(address());
        }

        public VkPhysicalDeviceDataGraphProcessingEngineARM engine() {
            return VkQueueFamilyDataGraphPropertiesARM.nengine(address());
        }

        public VkPhysicalDeviceDataGraphOperationSupportARM operation() {
            return VkQueueFamilyDataGraphPropertiesARM.noperation(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueueFamilyDataGraphPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkQueueFamilyDataGraphPropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
