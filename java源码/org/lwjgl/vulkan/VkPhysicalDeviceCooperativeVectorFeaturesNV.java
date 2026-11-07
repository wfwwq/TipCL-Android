package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeVectorFeaturesNV.class */
public class VkPhysicalDeviceCooperativeVectorFeaturesNV extends Struct<VkPhysicalDeviceCooperativeVectorFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COOPERATIVEVECTOR;
    public static final int COOPERATIVEVECTORTRAINING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEVECTOR = layout.offsetof(2);
        COOPERATIVEVECTORTRAINING = layout.offsetof(3);
    }

    protected VkPhysicalDeviceCooperativeVectorFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCooperativeVectorFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(address, container);
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV(ByteBuffer container) {
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
    public boolean cooperativeVector() {
        return ncooperativeVector(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeVectorTraining() {
        return ncooperativeVectorTraining(address()) != 0;
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV sType$Default() {
        return sType(1000491000);
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVector(@NativeType("VkBool32") boolean value) {
        ncooperativeVector(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorTraining(@NativeType("VkBool32") boolean value) {
        ncooperativeVectorTraining(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV set(int sType, long pNext, boolean cooperativeVector, boolean cooperativeVectorTraining) {
        sType(sType);
        pNext(pNext);
        cooperativeVector(cooperativeVector);
        cooperativeVectorTraining(cooperativeVectorTraining);
        return this;
    }

    public VkPhysicalDeviceCooperativeVectorFeaturesNV set(VkPhysicalDeviceCooperativeVectorFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV malloc() {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV calloc() {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV create(long address) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(address, null);
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

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeVectorFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncooperativeVector(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEVECTOR);
    }

    public static int ncooperativeVectorTraining(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEVECTORTRAINING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncooperativeVector(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEVECTOR, value);
    }

    public static void ncooperativeVectorTraining(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEVECTORTRAINING, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeVectorFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeVectorFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCooperativeVectorFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeVectorFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCooperativeVectorFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceCooperativeVectorFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCooperativeVectorFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCooperativeVectorFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean cooperativeVector() {
            return VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVector(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeVectorTraining() {
            return VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVectorTraining(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCooperativeVectorFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000491000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCooperativeVectorFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer cooperativeVector(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVector(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeVectorTraining(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVectorTraining(address(), value ? 1 : 0);
            return this;
        }
    }
}
