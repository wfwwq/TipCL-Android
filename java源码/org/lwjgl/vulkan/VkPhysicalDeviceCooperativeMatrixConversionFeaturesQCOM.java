package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.class */
public class VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM extends Struct<VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COOPERATIVEMATRIXCONVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXCONVERSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(ByteBuffer container) {
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
    public boolean cooperativeMatrixConversion() {
        return ncooperativeMatrixConversion(address()) != 0;
    }

    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM sType$Default() {
        return sType(QCOMCooperativeMatrixConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM);
    }

    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM cooperativeMatrixConversion(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixConversion(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM set(int sType, long pNext, boolean cooperativeMatrixConversion) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrixConversion(cooperativeMatrixConversion);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM set(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM malloc() {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM calloc() {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncooperativeMatrixConversion(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXCONVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncooperativeMatrixConversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXCONVERSION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixConversion() {
            return VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.ncooperativeMatrixConversion(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMCooperativeMatrixConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer cooperativeMatrixConversion(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.ncooperativeMatrixConversion(address(), value ? 1 : 0);
            return this;
        }
    }
}
