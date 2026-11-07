package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyDataGraphProcessingEnginePropertiesARM.class */
public class VkQueueFamilyDataGraphProcessingEnginePropertiesARM extends Struct<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FOREIGNSEMAPHOREHANDLETYPES;
    public static final int FOREIGNMEMORYHANDLETYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FOREIGNSEMAPHOREHANDLETYPES = layout.offsetof(2);
        FOREIGNMEMORYHANDLETYPES = layout.offsetof(3);
    }

    protected VkQueueFamilyDataGraphProcessingEnginePropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM create(long address, ByteBuffer container) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(address, container);
    }

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM(ByteBuffer container) {
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

    @NativeType("VkExternalSemaphoreHandleTypeFlags")
    public int foreignSemaphoreHandleTypes() {
        return nforeignSemaphoreHandleTypes(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int foreignMemoryHandleTypes() {
        return nforeignMemoryHandleTypes(address());
    }

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM);
    }

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM set(VkQueueFamilyDataGraphProcessingEnginePropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM malloc() {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM calloc() {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM create(long address) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(address, null);
    }

    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(address, null);
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

    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM malloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM calloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nforeignSemaphoreHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + FOREIGNSEMAPHOREHANDLETYPES);
    }

    public static int nforeignMemoryHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + FOREIGNMEMORYHANDLETYPES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyDataGraphProcessingEnginePropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyDataGraphProcessingEnginePropertiesARM, Buffer> implements NativeResource {
        private static final VkQueueFamilyDataGraphProcessingEnginePropertiesARM ELEMENT_FACTORY = VkQueueFamilyDataGraphProcessingEnginePropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyDataGraphProcessingEnginePropertiesARM.SIZEOF);
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
        public VkQueueFamilyDataGraphProcessingEnginePropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.npNext(address());
        }

        @NativeType("VkExternalSemaphoreHandleTypeFlags")
        public int foreignSemaphoreHandleTypes() {
            return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nforeignSemaphoreHandleTypes(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int foreignMemoryHandleTypes() {
            return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nforeignMemoryHandleTypes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkQueueFamilyDataGraphProcessingEnginePropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
