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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.class */
public class VkPhysicalDeviceImage2DViewOf3DFeaturesEXT extends Struct<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE2DVIEWOF3D;
    public static final int SAMPLER2DVIEWOF3D;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE2DVIEWOF3D = layout.offsetof(2);
        SAMPLER2DVIEWOF3D = layout.offsetof(3);
    }

    protected VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(ByteBuffer container) {
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
    public boolean image2DViewOf3D() {
        return nimage2DViewOf3D(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sampler2DViewOf3D() {
        return nsampler2DViewOf3D(address()) != 0;
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sType$Default() {
        return sType(EXTImage2dViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT);
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT image2DViewOf3D(@NativeType("VkBool32") boolean value) {
        nimage2DViewOf3D(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sampler2DViewOf3D(@NativeType("VkBool32") boolean value) {
        nsampler2DViewOf3D(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT set(int sType, long pNext, boolean image2DViewOf3D, boolean sampler2DViewOf3D) {
        sType(sType);
        pNext(pNext);
        image2DViewOf3D(image2DViewOf3D);
        sampler2DViewOf3D(sampler2DViewOf3D);
        return this;
    }

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT set(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT malloc() {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT calloc() {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimage2DViewOf3D(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGE2DVIEWOF3D);
    }

    public static int nsampler2DViewOf3D(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLER2DVIEWOF3D);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimage2DViewOf3D(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGE2DVIEWOF3D, value);
    }

    public static void nsampler2DViewOf3D(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLER2DVIEWOF3D, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImage2DViewOf3DFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImage2DViewOf3DFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean image2DViewOf3D() {
            return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nimage2DViewOf3D(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sampler2DViewOf3D() {
            return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsampler2DViewOf3D(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImage2dViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer image2DViewOf3D(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nimage2DViewOf3D(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sampler2DViewOf3D(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsampler2DViewOf3D(address(), value ? 1 : 0);
            return this;
        }
    }
}
