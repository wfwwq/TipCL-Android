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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesKHR.class */
public class VkSurfaceCapabilitiesKHR extends Struct<VkSurfaceCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MINIMAGECOUNT;
    public static final int MAXIMAGECOUNT;
    public static final int CURRENTEXTENT;
    public static final int MINIMAGEEXTENT;
    public static final int MAXIMAGEEXTENT;
    public static final int MAXIMAGEARRAYLAYERS;
    public static final int SUPPORTEDTRANSFORMS;
    public static final int CURRENTTRANSFORM;
    public static final int SUPPORTEDCOMPOSITEALPHA;
    public static final int SUPPORTEDUSAGEFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MINIMAGECOUNT = layout.offsetof(0);
        MAXIMAGECOUNT = layout.offsetof(1);
        CURRENTEXTENT = layout.offsetof(2);
        MINIMAGEEXTENT = layout.offsetof(3);
        MAXIMAGEEXTENT = layout.offsetof(4);
        MAXIMAGEARRAYLAYERS = layout.offsetof(5);
        SUPPORTEDTRANSFORMS = layout.offsetof(6);
        CURRENTTRANSFORM = layout.offsetof(7);
        SUPPORTEDCOMPOSITEALPHA = layout.offsetof(8);
        SUPPORTEDUSAGEFLAGS = layout.offsetof(9);
    }

    protected VkSurfaceCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfaceCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkSurfaceCapabilitiesKHR(address, container);
    }

    public VkSurfaceCapabilitiesKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int minImageCount() {
        return nminImageCount(address());
    }

    @NativeType("uint32_t")
    public int maxImageCount() {
        return nmaxImageCount(address());
    }

    public VkExtent2D currentExtent() {
        return ncurrentExtent(address());
    }

    public VkExtent2D minImageExtent() {
        return nminImageExtent(address());
    }

    public VkExtent2D maxImageExtent() {
        return nmaxImageExtent(address());
    }

    @NativeType("uint32_t")
    public int maxImageArrayLayers() {
        return nmaxImageArrayLayers(address());
    }

    @NativeType("VkSurfaceTransformFlagsKHR")
    public int supportedTransforms() {
        return nsupportedTransforms(address());
    }

    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int currentTransform() {
        return ncurrentTransform(address());
    }

    @NativeType("VkCompositeAlphaFlagsKHR")
    public int supportedCompositeAlpha() {
        return nsupportedCompositeAlpha(address());
    }

    @NativeType("VkImageUsageFlags")
    public int supportedUsageFlags() {
        return nsupportedUsageFlags(address());
    }

    public static VkSurfaceCapabilitiesKHR malloc() {
        return new VkSurfaceCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesKHR calloc() {
        return new VkSurfaceCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfaceCapabilitiesKHR create(long address) {
        return new VkSurfaceCapabilitiesKHR(address, null);
    }

    public static VkSurfaceCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfaceCapabilitiesKHR(address, null);
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

    public static VkSurfaceCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfaceCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkSurfaceCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nminImageCount(long struct) {
        return MemoryUtil.memGetInt(struct + MINIMAGECOUNT);
    }

    public static int nmaxImageCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMAGECOUNT);
    }

    public static VkExtent2D ncurrentExtent(long struct) {
        return VkExtent2D.create(struct + CURRENTEXTENT);
    }

    public static VkExtent2D nminImageExtent(long struct) {
        return VkExtent2D.create(struct + MINIMAGEEXTENT);
    }

    public static VkExtent2D nmaxImageExtent(long struct) {
        return VkExtent2D.create(struct + MAXIMAGEEXTENT);
    }

    public static int nmaxImageArrayLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXIMAGEARRAYLAYERS);
    }

    public static int nsupportedTransforms(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDTRANSFORMS);
    }

    public static int ncurrentTransform(long struct) {
        return MemoryUtil.memGetInt(struct + CURRENTTRANSFORM);
    }

    public static int nsupportedCompositeAlpha(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDCOMPOSITEALPHA);
    }

    public static int nsupportedUsageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDUSAGEFLAGS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkSurfaceCapabilitiesKHR ELEMENT_FACTORY = VkSurfaceCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfaceCapabilitiesKHR.SIZEOF);
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
        public VkSurfaceCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int minImageCount() {
            return VkSurfaceCapabilitiesKHR.nminImageCount(address());
        }

        @NativeType("uint32_t")
        public int maxImageCount() {
            return VkSurfaceCapabilitiesKHR.nmaxImageCount(address());
        }

        public VkExtent2D currentExtent() {
            return VkSurfaceCapabilitiesKHR.ncurrentExtent(address());
        }

        public VkExtent2D minImageExtent() {
            return VkSurfaceCapabilitiesKHR.nminImageExtent(address());
        }

        public VkExtent2D maxImageExtent() {
            return VkSurfaceCapabilitiesKHR.nmaxImageExtent(address());
        }

        @NativeType("uint32_t")
        public int maxImageArrayLayers() {
            return VkSurfaceCapabilitiesKHR.nmaxImageArrayLayers(address());
        }

        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() {
            return VkSurfaceCapabilitiesKHR.nsupportedTransforms(address());
        }

        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int currentTransform() {
            return VkSurfaceCapabilitiesKHR.ncurrentTransform(address());
        }

        @NativeType("VkCompositeAlphaFlagsKHR")
        public int supportedCompositeAlpha() {
            return VkSurfaceCapabilitiesKHR.nsupportedCompositeAlpha(address());
        }

        @NativeType("VkImageUsageFlags")
        public int supportedUsageFlags() {
            return VkSurfaceCapabilitiesKHR.nsupportedUsageFlags(address());
        }
    }
}
