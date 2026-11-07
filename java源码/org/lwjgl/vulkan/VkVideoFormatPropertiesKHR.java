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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoFormatPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoFormatPropertiesKHR.class */
public class VkVideoFormatPropertiesKHR extends Struct<VkVideoFormatPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMAT;
    public static final int COMPONENTMAPPING;
    public static final int IMAGECREATEFLAGS;
    public static final int IMAGETYPE;
    public static final int IMAGETILING;
    public static final int IMAGEUSAGEFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        COMPONENTMAPPING = layout.offsetof(3);
        IMAGECREATEFLAGS = layout.offsetof(4);
        IMAGETYPE = layout.offsetof(5);
        IMAGETILING = layout.offsetof(6);
        IMAGEUSAGEFLAGS = layout.offsetof(7);
    }

    protected VkVideoFormatPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoFormatPropertiesKHR create(long address, ByteBuffer container) {
        return new VkVideoFormatPropertiesKHR(address, container);
    }

    public VkVideoFormatPropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    public VkComponentMapping componentMapping() {
        return ncomponentMapping(address());
    }

    @NativeType("VkImageCreateFlags")
    public int imageCreateFlags() {
        return nimageCreateFlags(address());
    }

    @NativeType("VkImageType")
    public int imageType() {
        return nimageType(address());
    }

    @NativeType("VkImageTiling")
    public int imageTiling() {
        return nimageTiling(address());
    }

    @NativeType("VkImageUsageFlags")
    public int imageUsageFlags() {
        return nimageUsageFlags(address());
    }

    public VkVideoFormatPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoFormatPropertiesKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR);
    }

    public VkVideoFormatPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoFormatPropertiesKHR pNext(VkVideoFormatAV1QuantizationMapPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoFormatPropertiesKHR pNext(VkVideoFormatH265QuantizationMapPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoFormatPropertiesKHR pNext(VkVideoFormatQuantizationMapPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoFormatPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoFormatPropertiesKHR set(VkVideoFormatPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoFormatPropertiesKHR malloc() {
        return new VkVideoFormatPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoFormatPropertiesKHR calloc() {
        return new VkVideoFormatPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoFormatPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoFormatPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoFormatPropertiesKHR create(long address) {
        return new VkVideoFormatPropertiesKHR(address, null);
    }

    public static VkVideoFormatPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoFormatPropertiesKHR(address, null);
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

    public static VkVideoFormatPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoFormatPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoFormatPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoFormatPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static VkComponentMapping ncomponentMapping(long struct) {
        return VkComponentMapping.create(struct + COMPONENTMAPPING);
    }

    public static int nimageCreateFlags(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGECREATEFLAGS);
    }

    public static int nimageType(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGETYPE);
    }

    public static int nimageTiling(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGETILING);
    }

    public static int nimageUsageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEUSAGEFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoFormatPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoFormatPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoFormatPropertiesKHR, Buffer> implements NativeResource {
        private static final VkVideoFormatPropertiesKHR ELEMENT_FACTORY = VkVideoFormatPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoFormatPropertiesKHR.SIZEOF);
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
        public VkVideoFormatPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoFormatPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoFormatPropertiesKHR.npNext(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkVideoFormatPropertiesKHR.nformat(address());
        }

        public VkComponentMapping componentMapping() {
            return VkVideoFormatPropertiesKHR.ncomponentMapping(address());
        }

        @NativeType("VkImageCreateFlags")
        public int imageCreateFlags() {
            return VkVideoFormatPropertiesKHR.nimageCreateFlags(address());
        }

        @NativeType("VkImageType")
        public int imageType() {
            return VkVideoFormatPropertiesKHR.nimageType(address());
        }

        @NativeType("VkImageTiling")
        public int imageTiling() {
            return VkVideoFormatPropertiesKHR.nimageTiling(address());
        }

        @NativeType("VkImageUsageFlags")
        public int imageUsageFlags() {
            return VkVideoFormatPropertiesKHR.nimageUsageFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoFormatPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoFormatPropertiesKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoFormatAV1QuantizationMapPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoFormatH265QuantizationMapPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoFormatQuantizationMapPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
