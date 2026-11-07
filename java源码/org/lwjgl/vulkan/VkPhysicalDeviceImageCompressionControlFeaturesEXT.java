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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlFeaturesEXT.class */
public class VkPhysicalDeviceImageCompressionControlFeaturesEXT extends Struct<VkPhysicalDeviceImageCompressionControlFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGECOMPRESSIONCONTROL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGECOMPRESSIONCONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageCompressionControlFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT(ByteBuffer container) {
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
    public boolean imageCompressionControl() {
        return nimageCompressionControl(address()) != 0;
    }

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT sType$Default() {
        return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT);
    }

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT imageCompressionControl(@NativeType("VkBool32") boolean value) {
        nimageCompressionControl(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT set(int sType, long pNext, boolean imageCompressionControl) {
        sType(sType);
        pNext(pNext);
        imageCompressionControl(imageCompressionControl);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT set(VkPhysicalDeviceImageCompressionControlFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageCompressionControl(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGECOMPRESSIONCONTROL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageCompressionControl(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGECOMPRESSIONCONTROL, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageCompressionControlFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageCompressionControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageCompressionControlFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageCompressionControlFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceImageCompressionControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageCompressionControlFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageCompressionControlFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean imageCompressionControl() {
            return VkPhysicalDeviceImageCompressionControlFeaturesEXT.nimageCompressionControl(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageCompressionControlFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageCompressionControlFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer imageCompressionControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageCompressionControlFeaturesEXT.nimageCompressionControl(address(), value ? 1 : 0);
            return this;
        }
    }
}
