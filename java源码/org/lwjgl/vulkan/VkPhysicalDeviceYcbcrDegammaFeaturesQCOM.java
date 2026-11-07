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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.class */
public class VkPhysicalDeviceYcbcrDegammaFeaturesQCOM extends Struct<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int YCBCRDEGAMMA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        YCBCRDEGAMMA = layout.offsetof(2);
    }

    protected VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(ByteBuffer container) {
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
    public boolean ycbcrDegamma() {
        return nycbcrDegamma(address()) != 0;
    }

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sType$Default() {
        return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM);
    }

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ycbcrDegamma(@NativeType("VkBool32") boolean value) {
        nycbcrDegamma(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM set(int sType, long pNext, boolean ycbcrDegamma) {
        sType(sType);
        pNext(pNext);
        ycbcrDegamma(ycbcrDegamma);
        return this;
    }

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM set(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM malloc() {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM calloc() {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nycbcrDegamma(long struct) {
        return MemoryUtil.memGetInt(struct + YCBCRDEGAMMA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nycbcrDegamma(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCBCRDEGAMMA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrDegammaFeaturesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceYcbcrDegammaFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean ycbcrDegamma() {
            return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nycbcrDegamma(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer ycbcrDegamma(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nycbcrDegamma(address(), value ? 1 : 0);
            return this;
        }
    }
}
