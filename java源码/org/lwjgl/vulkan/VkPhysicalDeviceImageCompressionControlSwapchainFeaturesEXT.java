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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.class */
public class VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT extends Struct<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGECOMPRESSIONCONTROLSWAPCHAIN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGECOMPRESSIONCONTROLSWAPCHAIN = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(ByteBuffer container) {
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
    public boolean imageCompressionControlSwapchain() {
        return nimageCompressionControlSwapchain(address()) != 0;
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType$Default() {
        return sType(EXTImageCompressionControlSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT);
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchain(@NativeType("VkBool32") boolean value) {
        nimageCompressionControlSwapchain(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT set(int sType, long pNext, boolean imageCompressionControlSwapchain) {
        sType(sType);
        pNext(pNext);
        imageCompressionControlSwapchain(imageCompressionControlSwapchain);
        return this;
    }

    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT set(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageCompressionControlSwapchain(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGECOMPRESSIONCONTROLSWAPCHAIN);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageCompressionControlSwapchain(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGECOMPRESSIONCONTROLSWAPCHAIN, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean imageCompressionControlSwapchain() {
            return VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nimageCompressionControlSwapchain(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageCompressionControlSwapchain.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_SWAPCHAIN_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer imageCompressionControlSwapchain(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT.nimageCompressionControlSwapchain(address(), value ? 1 : 0);
            return this;
        }
    }
}
