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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilities2EXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilities2EXT.class */
public class VkSurfaceCapabilities2EXT extends Struct<VkSurfaceCapabilities2EXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
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
    public static final int SUPPORTEDSURFACECOUNTERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINIMAGECOUNT = layout.offsetof(2);
        MAXIMAGECOUNT = layout.offsetof(3);
        CURRENTEXTENT = layout.offsetof(4);
        MINIMAGEEXTENT = layout.offsetof(5);
        MAXIMAGEEXTENT = layout.offsetof(6);
        MAXIMAGEARRAYLAYERS = layout.offsetof(7);
        SUPPORTEDTRANSFORMS = layout.offsetof(8);
        CURRENTTRANSFORM = layout.offsetof(9);
        SUPPORTEDCOMPOSITEALPHA = layout.offsetof(10);
        SUPPORTEDUSAGEFLAGS = layout.offsetof(11);
        SUPPORTEDSURFACECOUNTERS = layout.offsetof(12);
    }

    protected VkSurfaceCapabilities2EXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfaceCapabilities2EXT create(long address, ByteBuffer container) {
        return new VkSurfaceCapabilities2EXT(address, container);
    }

    public VkSurfaceCapabilities2EXT(ByteBuffer container) {
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

    @NativeType("VkSurfaceCounterFlagsEXT")
    public int supportedSurfaceCounters() {
        return nsupportedSurfaceCounters(address());
    }

    public VkSurfaceCapabilities2EXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSurfaceCapabilities2EXT sType$Default() {
        return sType(1000090000);
    }

    public VkSurfaceCapabilities2EXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSurfaceCapabilities2EXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSurfaceCapabilities2EXT set(VkSurfaceCapabilities2EXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfaceCapabilities2EXT malloc() {
        return new VkSurfaceCapabilities2EXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfaceCapabilities2EXT calloc() {
        return new VkSurfaceCapabilities2EXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfaceCapabilities2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilities2EXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfaceCapabilities2EXT create(long address) {
        return new VkSurfaceCapabilities2EXT(address, null);
    }

    public static VkSurfaceCapabilities2EXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfaceCapabilities2EXT(address, null);
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

    public static VkSurfaceCapabilities2EXT malloc(MemoryStack stack) {
        return new VkSurfaceCapabilities2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfaceCapabilities2EXT calloc(MemoryStack stack) {
        return new VkSurfaceCapabilities2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsupportedSurfaceCounters(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDSURFACECOUNTERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilities2EXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceCapabilities2EXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilities2EXT, Buffer> implements NativeResource {
        private static final VkSurfaceCapabilities2EXT ELEMENT_FACTORY = VkSurfaceCapabilities2EXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfaceCapabilities2EXT.SIZEOF);
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
        public VkSurfaceCapabilities2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSurfaceCapabilities2EXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSurfaceCapabilities2EXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int minImageCount() {
            return VkSurfaceCapabilities2EXT.nminImageCount(address());
        }

        @NativeType("uint32_t")
        public int maxImageCount() {
            return VkSurfaceCapabilities2EXT.nmaxImageCount(address());
        }

        public VkExtent2D currentExtent() {
            return VkSurfaceCapabilities2EXT.ncurrentExtent(address());
        }

        public VkExtent2D minImageExtent() {
            return VkSurfaceCapabilities2EXT.nminImageExtent(address());
        }

        public VkExtent2D maxImageExtent() {
            return VkSurfaceCapabilities2EXT.nmaxImageExtent(address());
        }

        @NativeType("uint32_t")
        public int maxImageArrayLayers() {
            return VkSurfaceCapabilities2EXT.nmaxImageArrayLayers(address());
        }

        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() {
            return VkSurfaceCapabilities2EXT.nsupportedTransforms(address());
        }

        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int currentTransform() {
            return VkSurfaceCapabilities2EXT.ncurrentTransform(address());
        }

        @NativeType("VkCompositeAlphaFlagsKHR")
        public int supportedCompositeAlpha() {
            return VkSurfaceCapabilities2EXT.nsupportedCompositeAlpha(address());
        }

        @NativeType("VkImageUsageFlags")
        public int supportedUsageFlags() {
            return VkSurfaceCapabilities2EXT.nsupportedUsageFlags(address());
        }

        @NativeType("VkSurfaceCounterFlagsEXT")
        public int supportedSurfaceCounters() {
            return VkSurfaceCapabilities2EXT.nsupportedSurfaceCounters(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfaceCapabilities2EXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000090000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfaceCapabilities2EXT.npNext(address(), value);
            return this;
        }
    }
}
