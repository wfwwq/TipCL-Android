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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageFootprintFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageFootprintFeaturesNV.class */
public class VkPhysicalDeviceShaderImageFootprintFeaturesNV extends Struct<VkPhysicalDeviceShaderImageFootprintFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGEFOOTPRINT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEFOOTPRINT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderImageFootprintFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(address, container);
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(ByteBuffer container) {
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
    public boolean imageFootprint() {
        return nimageFootprint(address()) != 0;
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sType$Default() {
        return sType(NVShaderImageFootprint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV);
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV imageFootprint(@NativeType("VkBool32") boolean value) {
        nimageFootprint(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV set(int sType, long pNext, boolean imageFootprint) {
        sType(sType);
        pNext(pNext);
        imageFootprint(imageFootprint);
        return this;
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV set(VkPhysicalDeviceShaderImageFootprintFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV malloc() {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV calloc() {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV create(long address) {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(address, null);
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

    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageFootprint(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEFOOTPRINT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageFootprint(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEFOOTPRINT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageFootprintFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageFootprintFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderImageFootprintFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderImageFootprintFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceShaderImageFootprintFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderImageFootprintFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceShaderImageFootprintFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderImageFootprintFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderImageFootprintFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean imageFootprint() {
            return VkPhysicalDeviceShaderImageFootprintFeaturesNV.nimageFootprint(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderImageFootprintFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShaderImageFootprint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderImageFootprintFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer imageFootprint(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderImageFootprintFeaturesNV.nimageFootprint(address(), value ? 1 : 0);
            return this;
        }
    }
}
