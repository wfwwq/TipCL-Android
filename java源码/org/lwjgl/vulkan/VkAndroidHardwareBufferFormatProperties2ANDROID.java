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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatProperties2ANDROID.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatProperties2ANDROID.class */
public class VkAndroidHardwareBufferFormatProperties2ANDROID extends Struct<VkAndroidHardwareBufferFormatProperties2ANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMAT;
    public static final int EXTERNALFORMAT;
    public static final int FORMATFEATURES;
    public static final int SAMPLERYCBCRCONVERSIONCOMPONENTS;
    public static final int SUGGESTEDYCBCRMODEL;
    public static final int SUGGESTEDYCBCRRANGE;
    public static final int SUGGESTEDXCHROMAOFFSET;
    public static final int SUGGESTEDYCHROMAOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        EXTERNALFORMAT = layout.offsetof(3);
        FORMATFEATURES = layout.offsetof(4);
        SAMPLERYCBCRCONVERSIONCOMPONENTS = layout.offsetof(5);
        SUGGESTEDYCBCRMODEL = layout.offsetof(6);
        SUGGESTEDYCBCRRANGE = layout.offsetof(7);
        SUGGESTEDXCHROMAOFFSET = layout.offsetof(8);
        SUGGESTEDYCHROMAOFFSET = layout.offsetof(9);
    }

    protected VkAndroidHardwareBufferFormatProperties2ANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAndroidHardwareBufferFormatProperties2ANDROID create(long address, ByteBuffer container) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(address, container);
    }

    public VkAndroidHardwareBufferFormatProperties2ANDROID(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long externalFormat() {
        return nexternalFormat(address());
    }

    @NativeType("VkFormatFeatureFlags2")
    public long formatFeatures() {
        return nformatFeatures(address());
    }

    public VkComponentMapping samplerYcbcrConversionComponents() {
        return nsamplerYcbcrConversionComponents(address());
    }

    @NativeType("VkSamplerYcbcrModelConversion")
    public int suggestedYcbcrModel() {
        return nsuggestedYcbcrModel(address());
    }

    @NativeType("VkSamplerYcbcrRange")
    public int suggestedYcbcrRange() {
        return nsuggestedYcbcrRange(address());
    }

    @NativeType("VkChromaLocation")
    public int suggestedXChromaOffset() {
        return nsuggestedXChromaOffset(address());
    }

    @NativeType("VkChromaLocation")
    public int suggestedYChromaOffset() {
        return nsuggestedYChromaOffset(address());
    }

    public VkAndroidHardwareBufferFormatProperties2ANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferFormatProperties2ANDROID sType$Default() {
        return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID);
    }

    public VkAndroidHardwareBufferFormatProperties2ANDROID pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferFormatProperties2ANDROID set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkAndroidHardwareBufferFormatProperties2ANDROID set(VkAndroidHardwareBufferFormatProperties2ANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAndroidHardwareBufferFormatProperties2ANDROID malloc() {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAndroidHardwareBufferFormatProperties2ANDROID calloc() {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferFormatProperties2ANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkAndroidHardwareBufferFormatProperties2ANDROID create(long address) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(address, null);
    }

    public static VkAndroidHardwareBufferFormatProperties2ANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(address, null);
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

    public static VkAndroidHardwareBufferFormatProperties2ANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferFormatProperties2ANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatProperties2ANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nexternalFormat(long struct) {
        return MemoryUtil.memGetLong(struct + EXTERNALFORMAT);
    }

    public static long nformatFeatures(long struct) {
        return MemoryUtil.memGetLong(struct + FORMATFEATURES);
    }

    public static VkComponentMapping nsamplerYcbcrConversionComponents(long struct) {
        return VkComponentMapping.create(struct + SAMPLERYCBCRCONVERSIONCOMPONENTS);
    }

    public static int nsuggestedYcbcrModel(long struct) {
        return MemoryUtil.memGetInt(struct + SUGGESTEDYCBCRMODEL);
    }

    public static int nsuggestedYcbcrRange(long struct) {
        return MemoryUtil.memGetInt(struct + SUGGESTEDYCBCRRANGE);
    }

    public static int nsuggestedXChromaOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SUGGESTEDXCHROMAOFFSET);
    }

    public static int nsuggestedYChromaOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SUGGESTEDYCHROMAOFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatProperties2ANDROID$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatProperties2ANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferFormatProperties2ANDROID, Buffer> implements NativeResource {
        private static final VkAndroidHardwareBufferFormatProperties2ANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferFormatProperties2ANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAndroidHardwareBufferFormatProperties2ANDROID.SIZEOF);
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
        public VkAndroidHardwareBufferFormatProperties2ANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.npNext(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nformat(address());
        }

        @NativeType("uint64_t")
        public long externalFormat() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nexternalFormat(address());
        }

        @NativeType("VkFormatFeatureFlags2")
        public long formatFeatures() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nformatFeatures(address());
        }

        public VkComponentMapping samplerYcbcrConversionComponents() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nsamplerYcbcrConversionComponents(address());
        }

        @NativeType("VkSamplerYcbcrModelConversion")
        public int suggestedYcbcrModel() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYcbcrModel(address());
        }

        @NativeType("VkSamplerYcbcrRange")
        public int suggestedYcbcrRange() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYcbcrRange(address());
        }

        @NativeType("VkChromaLocation")
        public int suggestedXChromaOffset() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedXChromaOffset(address());
        }

        @NativeType("VkChromaLocation")
        public int suggestedYChromaOffset() {
            return VkAndroidHardwareBufferFormatProperties2ANDROID.nsuggestedYChromaOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAndroidHardwareBufferFormatProperties2ANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAndroidHardwareBufferFormatProperties2ANDROID.npNext(address(), value);
            return this;
        }
    }
}
