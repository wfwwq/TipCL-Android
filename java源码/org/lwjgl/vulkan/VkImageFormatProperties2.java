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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties2.class */
public class VkImageFormatProperties2 extends Struct<VkImageFormatProperties2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGEFORMATPROPERTIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkImageFormatProperties.SIZEOF, VkImageFormatProperties.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEFORMATPROPERTIES = layout.offsetof(2);
    }

    protected VkImageFormatProperties2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageFormatProperties2 create(long address, ByteBuffer container) {
        return new VkImageFormatProperties2(address, container);
    }

    public VkImageFormatProperties2(ByteBuffer container) {
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

    public VkImageFormatProperties imageFormatProperties() {
        return nimageFormatProperties(address());
    }

    public VkImageFormatProperties2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageFormatProperties2 sType$Default() {
        return sType(1000059003);
    }

    public VkImageFormatProperties2 pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageFormatProperties2 pNext(VkAndroidHardwareBufferUsageANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkExternalImageFormatProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkExternalImageFormatPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkFilterCubicImageViewImageFormatPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkHostImageCopyDevicePerformanceQuery value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkHostImageCopyDevicePerformanceQueryEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkImageCompressionPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkSamplerYcbcrConversionImageFormatProperties value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkSamplerYcbcrConversionImageFormatPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkSubsampledImageFormatPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 pNext(VkTextureLODGatherFormatPropertiesAMD value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkImageFormatProperties2 set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkImageFormatProperties2 set(VkImageFormatProperties2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageFormatProperties2 malloc() {
        return new VkImageFormatProperties2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageFormatProperties2 calloc() {
        return new VkImageFormatProperties2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageFormatProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageFormatProperties2(MemoryUtil.memAddress(container), container);
    }

    public static VkImageFormatProperties2 create(long address) {
        return new VkImageFormatProperties2(address, null);
    }

    public static VkImageFormatProperties2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageFormatProperties2(address, null);
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

    public static VkImageFormatProperties2 malloc(MemoryStack stack) {
        return new VkImageFormatProperties2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageFormatProperties2 calloc(MemoryStack stack) {
        return new VkImageFormatProperties2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkImageFormatProperties nimageFormatProperties(long struct) {
        return VkImageFormatProperties.create(struct + IMAGEFORMATPROPERTIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties2$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageFormatProperties2, Buffer> implements NativeResource {
        private static final VkImageFormatProperties2 ELEMENT_FACTORY = VkImageFormatProperties2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageFormatProperties2.SIZEOF);
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
        public VkImageFormatProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageFormatProperties2.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkImageFormatProperties2.npNext(address());
        }

        public VkImageFormatProperties imageFormatProperties() {
            return VkImageFormatProperties2.nimageFormatProperties(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageFormatProperties2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000059003);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkImageFormatProperties2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAndroidHardwareBufferUsageANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalImageFormatProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalImageFormatPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkFilterCubicImageViewImageFormatPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkHostImageCopyDevicePerformanceQuery value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkHostImageCopyDevicePerformanceQueryEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImageCompressionPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerYcbcrConversionImageFormatProperties value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerYcbcrConversionImageFormatPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubsampledImageFormatPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTextureLODGatherFormatPropertiesAMD value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
