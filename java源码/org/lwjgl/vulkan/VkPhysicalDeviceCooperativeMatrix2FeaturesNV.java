package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrix2FeaturesNV.class */
public class VkPhysicalDeviceCooperativeMatrix2FeaturesNV extends Struct<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COOPERATIVEMATRIXWORKGROUPSCOPE;
    public static final int COOPERATIVEMATRIXFLEXIBLEDIMENSIONS;
    public static final int COOPERATIVEMATRIXREDUCTIONS;
    public static final int COOPERATIVEMATRIXCONVERSIONS;
    public static final int COOPERATIVEMATRIXPERELEMENTOPERATIONS;
    public static final int COOPERATIVEMATRIXTENSORADDRESSING;
    public static final int COOPERATIVEMATRIXBLOCKLOADS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXWORKGROUPSCOPE = layout.offsetof(2);
        COOPERATIVEMATRIXFLEXIBLEDIMENSIONS = layout.offsetof(3);
        COOPERATIVEMATRIXREDUCTIONS = layout.offsetof(4);
        COOPERATIVEMATRIXCONVERSIONS = layout.offsetof(5);
        COOPERATIVEMATRIXPERELEMENTOPERATIONS = layout.offsetof(6);
        COOPERATIVEMATRIXTENSORADDRESSING = layout.offsetof(7);
        COOPERATIVEMATRIXBLOCKLOADS = layout.offsetof(8);
    }

    protected VkPhysicalDeviceCooperativeMatrix2FeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(address, container);
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV(ByteBuffer container) {
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
    public boolean cooperativeMatrixWorkgroupScope() {
        return ncooperativeMatrixWorkgroupScope(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeMatrixFlexibleDimensions() {
        return ncooperativeMatrixFlexibleDimensions(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeMatrixReductions() {
        return ncooperativeMatrixReductions(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeMatrixConversions() {
        return ncooperativeMatrixConversions(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeMatrixPerElementOperations() {
        return ncooperativeMatrixPerElementOperations(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeMatrixTensorAddressing() {
        return ncooperativeMatrixTensorAddressing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeMatrixBlockLoads() {
        return ncooperativeMatrixBlockLoads(address()) != 0;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType$Default() {
        return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV);
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixWorkgroupScope(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixWorkgroupScope(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixFlexibleDimensions(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixFlexibleDimensions(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixReductions(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixReductions(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixConversions(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixConversions(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixPerElementOperations(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixPerElementOperations(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixTensorAddressing(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixTensorAddressing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixBlockLoads(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixBlockLoads(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV set(int sType, long pNext, boolean cooperativeMatrixWorkgroupScope, boolean cooperativeMatrixFlexibleDimensions, boolean cooperativeMatrixReductions, boolean cooperativeMatrixConversions, boolean cooperativeMatrixPerElementOperations, boolean cooperativeMatrixTensorAddressing, boolean cooperativeMatrixBlockLoads) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope);
        cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions);
        cooperativeMatrixReductions(cooperativeMatrixReductions);
        cooperativeMatrixConversions(cooperativeMatrixConversions);
        cooperativeMatrixPerElementOperations(cooperativeMatrixPerElementOperations);
        cooperativeMatrixTensorAddressing(cooperativeMatrixTensorAddressing);
        cooperativeMatrixBlockLoads(cooperativeMatrixBlockLoads);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV set(VkPhysicalDeviceCooperativeMatrix2FeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV malloc() {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV calloc() {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV create(long address) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(address, null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(address, null);
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

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncooperativeMatrixWorkgroupScope(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXWORKGROUPSCOPE);
    }

    public static int ncooperativeMatrixFlexibleDimensions(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXFLEXIBLEDIMENSIONS);
    }

    public static int ncooperativeMatrixReductions(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXREDUCTIONS);
    }

    public static int ncooperativeMatrixConversions(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXCONVERSIONS);
    }

    public static int ncooperativeMatrixPerElementOperations(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXPERELEMENTOPERATIONS);
    }

    public static int ncooperativeMatrixTensorAddressing(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXTENSORADDRESSING);
    }

    public static int ncooperativeMatrixBlockLoads(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXBLOCKLOADS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncooperativeMatrixWorkgroupScope(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXWORKGROUPSCOPE, value);
    }

    public static void ncooperativeMatrixFlexibleDimensions(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXFLEXIBLEDIMENSIONS, value);
    }

    public static void ncooperativeMatrixReductions(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXREDUCTIONS, value);
    }

    public static void ncooperativeMatrixConversions(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXCONVERSIONS, value);
    }

    public static void ncooperativeMatrixPerElementOperations(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXPERELEMENTOPERATIONS, value);
    }

    public static void ncooperativeMatrixTensorAddressing(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXTENSORADDRESSING, value);
    }

    public static void ncooperativeMatrixBlockLoads(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXBLOCKLOADS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrix2FeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrix2FeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCooperativeMatrix2FeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrix2FeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCooperativeMatrix2FeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixWorkgroupScope() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixWorkgroupScope(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixFlexibleDimensions() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixFlexibleDimensions(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixReductions() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixReductions(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixConversions() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixConversions(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixPerElementOperations() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixPerElementOperations(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixTensorAddressing() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixTensorAddressing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixBlockLoads() {
            return VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixBlockLoads(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer cooperativeMatrixWorkgroupScope(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixWorkgroupScope(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeMatrixFlexibleDimensions(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixFlexibleDimensions(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeMatrixReductions(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixReductions(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeMatrixConversions(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixConversions(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeMatrixPerElementOperations(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixPerElementOperations(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeMatrixTensorAddressing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixTensorAddressing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeMatrixBlockLoads(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrix2FeaturesNV.ncooperativeMatrixBlockLoads(address(), value ? 1 : 0);
            return this;
        }
    }
}
