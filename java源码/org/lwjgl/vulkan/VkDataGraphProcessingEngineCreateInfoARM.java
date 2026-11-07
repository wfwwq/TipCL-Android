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
import org.lwjgl.vulkan.VkPhysicalDeviceDataGraphProcessingEngineARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphProcessingEngineCreateInfoARM.class */
public class VkDataGraphProcessingEngineCreateInfoARM extends Struct<VkDataGraphProcessingEngineCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROCESSINGENGINECOUNT;
    public static final int PPROCESSINGENGINES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROCESSINGENGINECOUNT = layout.offsetof(2);
        PPROCESSINGENGINES = layout.offsetof(3);
    }

    protected VkDataGraphProcessingEngineCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphProcessingEngineCreateInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphProcessingEngineCreateInfoARM(address, container);
    }

    public VkDataGraphProcessingEngineCreateInfoARM(ByteBuffer container) {
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
    public int processingEngineCount() {
        return nprocessingEngineCount(address());
    }

    @NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *")
    public VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer pProcessingEngines() {
        return npProcessingEngines(address());
    }

    public VkDataGraphProcessingEngineCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphProcessingEngineCreateInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM);
    }

    public VkDataGraphProcessingEngineCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphProcessingEngineCreateInfoARM pProcessingEngines(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *") VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer value) {
        npProcessingEngines(address(), value);
        return this;
    }

    public VkDataGraphProcessingEngineCreateInfoARM set(int sType, long pNext, VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer pProcessingEngines) {
        sType(sType);
        pNext(pNext);
        pProcessingEngines(pProcessingEngines);
        return this;
    }

    public VkDataGraphProcessingEngineCreateInfoARM set(VkDataGraphProcessingEngineCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphProcessingEngineCreateInfoARM malloc() {
        return new VkDataGraphProcessingEngineCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphProcessingEngineCreateInfoARM calloc() {
        return new VkDataGraphProcessingEngineCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphProcessingEngineCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphProcessingEngineCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphProcessingEngineCreateInfoARM create(long address) {
        return new VkDataGraphProcessingEngineCreateInfoARM(address, null);
    }

    public static VkDataGraphProcessingEngineCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphProcessingEngineCreateInfoARM(address, null);
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

    public static VkDataGraphProcessingEngineCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphProcessingEngineCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphProcessingEngineCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphProcessingEngineCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprocessingEngineCount(long struct) {
        return MemoryUtil.memGetInt(struct + PROCESSINGENGINECOUNT);
    }

    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer npProcessingEngines(long struct) {
        return VkPhysicalDeviceDataGraphProcessingEngineARM.create(MemoryUtil.memGetAddress(struct + PPROCESSINGENGINES), nprocessingEngineCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprocessingEngineCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROCESSINGENGINECOUNT, value);
    }

    public static void npProcessingEngines(long struct, VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPROCESSINGENGINES, value.address());
        nprocessingEngineCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PPROCESSINGENGINES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphProcessingEngineCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphProcessingEngineCreateInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphProcessingEngineCreateInfoARM ELEMENT_FACTORY = VkDataGraphProcessingEngineCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphProcessingEngineCreateInfoARM.SIZEOF);
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
        public VkDataGraphProcessingEngineCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphProcessingEngineCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphProcessingEngineCreateInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int processingEngineCount() {
            return VkDataGraphProcessingEngineCreateInfoARM.nprocessingEngineCount(address());
        }

        @NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *")
        public VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer pProcessingEngines() {
            return VkDataGraphProcessingEngineCreateInfoARM.npProcessingEngines(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphProcessingEngineCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphProcessingEngineCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pProcessingEngines(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *") VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer value) {
            VkDataGraphProcessingEngineCreateInfoARM.npProcessingEngines(address(), value);
            return this;
        }
    }
}
