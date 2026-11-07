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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.class */
public class VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT extends Struct<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGESLICEDVIEWOF3D;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGESLICEDVIEWOF3D = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(ByteBuffer container) {
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
    public boolean imageSlicedViewOf3D() {
        return nimageSlicedViewOf3D(address()) != 0;
    }

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType$Default() {
        return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
    }

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3D(@NativeType("VkBool32") boolean value) {
        nimageSlicedViewOf3D(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT set(int sType, long pNext, boolean imageSlicedViewOf3D) {
        sType(sType);
        pNext(pNext);
        imageSlicedViewOf3D(imageSlicedViewOf3D);
        return this;
    }

    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT set(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageSlicedViewOf3D(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGESLICEDVIEWOF3D);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageSlicedViewOf3D(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGESLICEDVIEWOF3D, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean imageSlicedViewOf3D() {
            return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nimageSlicedViewOf3D(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer imageSlicedViewOf3D(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nimageSlicedViewOf3D(address(), value ? 1 : 0);
            return this;
        }
    }
}
