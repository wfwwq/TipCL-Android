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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatPropertiesANDROID.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatPropertiesANDROID.class */
public class VkAndroidHardwareBufferFormatPropertiesANDROID extends Struct<VkAndroidHardwareBufferFormatPropertiesANDROID> implements NativeResource {
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
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF), __member(4), __member(4), __member(4), __member(4));
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

    protected VkAndroidHardwareBufferFormatPropertiesANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAndroidHardwareBufferFormatPropertiesANDROID create(long address, ByteBuffer container) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(address, container);
    }

    public VkAndroidHardwareBufferFormatPropertiesANDROID(ByteBuffer container) {
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

    @NativeType("VkFormatFeatureFlags")
    public int formatFeatures() {
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

    public VkAndroidHardwareBufferFormatPropertiesANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferFormatPropertiesANDROID sType$Default() {
        return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID);
    }

    public VkAndroidHardwareBufferFormatPropertiesANDROID pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferFormatPropertiesANDROID set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkAndroidHardwareBufferFormatPropertiesANDROID set(VkAndroidHardwareBufferFormatPropertiesANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID malloc() {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID calloc() {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID create(long address) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(address, null);
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(address, null);
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

    public static VkAndroidHardwareBufferFormatPropertiesANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferFormatPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformatFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + FORMATFEATURES);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatPropertiesANDROID$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferFormatPropertiesANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferFormatPropertiesANDROID, Buffer> implements NativeResource {
        private static final VkAndroidHardwareBufferFormatPropertiesANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferFormatPropertiesANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAndroidHardwareBufferFormatPropertiesANDROID.SIZEOF);
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
        public VkAndroidHardwareBufferFormatPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.npNext(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nformat(address());
        }

        @NativeType("uint64_t")
        public long externalFormat() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nexternalFormat(address());
        }

        @NativeType("VkFormatFeatureFlags")
        public int formatFeatures() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nformatFeatures(address());
        }

        public VkComponentMapping samplerYcbcrConversionComponents() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nsamplerYcbcrConversionComponents(address());
        }

        @NativeType("VkSamplerYcbcrModelConversion")
        public int suggestedYcbcrModel() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYcbcrModel(address());
        }

        @NativeType("VkSamplerYcbcrRange")
        public int suggestedYcbcrRange() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYcbcrRange(address());
        }

        @NativeType("VkChromaLocation")
        public int suggestedXChromaOffset() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedXChromaOffset(address());
        }

        @NativeType("VkChromaLocation")
        public int suggestedYChromaOffset() {
            return VkAndroidHardwareBufferFormatPropertiesANDROID.nsuggestedYChromaOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAndroidHardwareBufferFormatPropertiesANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAndroidHardwareBufferFormatPropertiesANDROID.npNext(address(), value);
            return this;
        }
    }
}
