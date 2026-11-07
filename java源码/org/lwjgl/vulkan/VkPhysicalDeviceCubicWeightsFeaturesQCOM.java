package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCubicWeightsFeaturesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCubicWeightsFeaturesQCOM.class */
public class VkPhysicalDeviceCubicWeightsFeaturesQCOM extends Struct<VkPhysicalDeviceCubicWeightsFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SELECTABLECUBICWEIGHTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SELECTABLECUBICWEIGHTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCubicWeightsFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM(ByteBuffer container) {
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
    public boolean selectableCubicWeights() {
        return nselectableCubicWeights(address()) != 0;
    }

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM sType$Default() {
        return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM);
    }

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM selectableCubicWeights(@NativeType("VkBool32") boolean value) {
        nselectableCubicWeights(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM set(int sType, long pNext, boolean selectableCubicWeights) {
        sType(sType);
        pNext(pNext);
        selectableCubicWeights(selectableCubicWeights);
        return this;
    }

    public VkPhysicalDeviceCubicWeightsFeaturesQCOM set(VkPhysicalDeviceCubicWeightsFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM malloc() {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM calloc() {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nselectableCubicWeights(long struct) {
        return MemoryUtil.memGetInt(struct + SELECTABLECUBICWEIGHTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nselectableCubicWeights(long struct, int value) {
        MemoryUtil.memPutInt(struct + SELECTABLECUBICWEIGHTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCubicWeightsFeaturesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCubicWeightsFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCubicWeightsFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCubicWeightsFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceCubicWeightsFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCubicWeightsFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceCubicWeightsFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCubicWeightsFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCubicWeightsFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean selectableCubicWeights() {
            return VkPhysicalDeviceCubicWeightsFeaturesQCOM.nselectableCubicWeights(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCubicWeightsFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCubicWeightsFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer selectableCubicWeights(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCubicWeightsFeaturesQCOM.nselectableCubicWeights(address(), value ? 1 : 0);
            return this;
        }
    }
}
