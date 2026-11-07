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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessing2FeaturesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessing2FeaturesQCOM.class */
public class VkPhysicalDeviceImageProcessing2FeaturesQCOM extends Struct<VkPhysicalDeviceImageProcessing2FeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TEXTUREBLOCKMATCH2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TEXTUREBLOCKMATCH2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageProcessing2FeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM(ByteBuffer container) {
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
    public boolean textureBlockMatch2() {
        return ntextureBlockMatch2(address()) != 0;
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM sType$Default() {
        return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM);
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM textureBlockMatch2(@NativeType("VkBool32") boolean value) {
        ntextureBlockMatch2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM set(int sType, long pNext, boolean textureBlockMatch2) {
        sType(sType);
        pNext(pNext);
        textureBlockMatch2(textureBlockMatch2);
        return this;
    }

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM set(VkPhysicalDeviceImageProcessing2FeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntextureBlockMatch2(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTUREBLOCKMATCH2);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntextureBlockMatch2(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTUREBLOCKMATCH2, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessing2FeaturesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessing2FeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessing2FeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageProcessing2FeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessing2FeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageProcessing2FeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceImageProcessing2FeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageProcessing2FeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageProcessing2FeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean textureBlockMatch2() {
            return VkPhysicalDeviceImageProcessing2FeaturesQCOM.ntextureBlockMatch2(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageProcessing2FeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageProcessing2FeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer textureBlockMatch2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageProcessing2FeaturesQCOM.ntextureBlockMatch2(address(), value ? 1 : 0);
            return this;
        }
    }
}
