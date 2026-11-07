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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class */
public class VkPhysicalDeviceSubpassShadingFeaturesHUAWEI extends Struct<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUBPASSSHADING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBPASSSHADING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(address, container);
    }

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(ByteBuffer container) {
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
    public boolean subpassShading() {
        return nsubpassShading(address()) != 0;
    }

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sType$Default() {
        return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI);
    }

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI subpassShading(@NativeType("VkBool32") boolean value) {
        nsubpassShading(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI set(int sType, long pNext, boolean subpassShading) {
        sType(sType);
        pNext(pNext);
        subpassShading(subpassShading);
        return this;
    }

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI set(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI malloc() {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI calloc() {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create(long address) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(address, null);
    }

    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(address, null);
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

    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsubpassShading(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASSSHADING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsubpassShading(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASSSHADING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubpassShadingFeaturesHUAWEI$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubpassShadingFeaturesHUAWEI$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSubpassShadingFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.SIZEOF);
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
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean subpassShading() {
            return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsubpassShading(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.npNext(address(), value);
            return this;
        }

        public Buffer subpassShading(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsubpassShading(address(), value ? 1 : 0);
            return this;
        }
    }
}
