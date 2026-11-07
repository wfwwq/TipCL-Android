package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeVectorPropertiesNV.class */
public class VkPhysicalDeviceCooperativeVectorPropertiesNV extends Struct<VkPhysicalDeviceCooperativeVectorPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COOPERATIVEVECTORSUPPORTEDSTAGES;
    public static final int COOPERATIVEVECTORTRAININGFLOAT16ACCUMULATION;
    public static final int COOPERATIVEVECTORTRAININGFLOAT32ACCUMULATION;
    public static final int MAXCOOPERATIVEVECTORCOMPONENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEVECTORSUPPORTEDSTAGES = layout.offsetof(2);
        COOPERATIVEVECTORTRAININGFLOAT16ACCUMULATION = layout.offsetof(3);
        COOPERATIVEVECTORTRAININGFLOAT32ACCUMULATION = layout.offsetof(4);
        MAXCOOPERATIVEVECTORCOMPONENTS = layout.offsetof(5);
    }

    protected VkPhysicalDeviceCooperativeVectorPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCooperativeVectorPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(address, container);
    }

    public VkPhysicalDeviceCooperativeVectorPropertiesNV(ByteBuffer container) {
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

    @NativeType("VkShaderStageFlags")
    public int cooperativeVectorSupportedStages() {
        return ncooperativeVectorSupportedStages(address());
    }

    @NativeType("VkBool32")
    public boolean cooperativeVectorTrainingFloat16Accumulation() {
        return ncooperativeVectorTrainingFloat16Accumulation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeVectorTrainingFloat32Accumulation() {
        return ncooperativeVectorTrainingFloat32Accumulation(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxCooperativeVectorComponents() {
        return nmaxCooperativeVectorComponents(address());
    }

    public VkPhysicalDeviceCooperativeVectorPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorPropertiesNV sType$Default() {
        return sType(1000491001);
    }

    public VkPhysicalDeviceCooperativeVectorPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorPropertiesNV set(VkPhysicalDeviceCooperativeVectorPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV malloc() {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV calloc() {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV create(long address) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(address, null);
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

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeVectorPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncooperativeVectorSupportedStages(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEVECTORSUPPORTEDSTAGES);
    }

    public static int ncooperativeVectorTrainingFloat16Accumulation(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEVECTORTRAININGFLOAT16ACCUMULATION);
    }

    public static int ncooperativeVectorTrainingFloat32Accumulation(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEVECTORTRAININGFLOAT32ACCUMULATION);
    }

    public static int nmaxCooperativeVectorComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOOPERATIVEVECTORCOMPONENTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeVectorPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeVectorPropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCooperativeVectorPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeVectorPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCooperativeVectorPropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceCooperativeVectorPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCooperativeVectorPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCooperativeVectorPropertiesNV.npNext(address());
        }

        @NativeType("VkShaderStageFlags")
        public int cooperativeVectorSupportedStages() {
            return VkPhysicalDeviceCooperativeVectorPropertiesNV.ncooperativeVectorSupportedStages(address());
        }

        @NativeType("VkBool32")
        public boolean cooperativeVectorTrainingFloat16Accumulation() {
            return VkPhysicalDeviceCooperativeVectorPropertiesNV.ncooperativeVectorTrainingFloat16Accumulation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeVectorTrainingFloat32Accumulation() {
            return VkPhysicalDeviceCooperativeVectorPropertiesNV.ncooperativeVectorTrainingFloat32Accumulation(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxCooperativeVectorComponents() {
            return VkPhysicalDeviceCooperativeVectorPropertiesNV.nmaxCooperativeVectorComponents(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCooperativeVectorPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000491001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCooperativeVectorPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
