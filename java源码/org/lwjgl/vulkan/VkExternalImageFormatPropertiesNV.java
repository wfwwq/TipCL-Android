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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesNV.class */
public class VkExternalImageFormatPropertiesNV extends Struct<VkExternalImageFormatPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int IMAGEFORMATPROPERTIES;
    public static final int EXTERNALMEMORYFEATURES;
    public static final int EXPORTFROMIMPORTEDHANDLETYPES;
    public static final int COMPATIBLEHANDLETYPES;

    static {
        Struct.Layout layout = __struct(__member(VkImageFormatProperties.SIZEOF, VkImageFormatProperties.ALIGNOF), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        IMAGEFORMATPROPERTIES = layout.offsetof(0);
        EXTERNALMEMORYFEATURES = layout.offsetof(1);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(2);
        COMPATIBLEHANDLETYPES = layout.offsetof(3);
    }

    protected VkExternalImageFormatPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalImageFormatPropertiesNV create(long address, ByteBuffer container) {
        return new VkExternalImageFormatPropertiesNV(address, container);
    }

    public VkExternalImageFormatPropertiesNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkImageFormatProperties imageFormatProperties() {
        return nimageFormatProperties(address());
    }

    @NativeType("VkExternalMemoryFeatureFlagsNV")
    public int externalMemoryFeatures() {
        return nexternalMemoryFeatures(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int exportFromImportedHandleTypes() {
        return nexportFromImportedHandleTypes(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlagsNV")
    public int compatibleHandleTypes() {
        return ncompatibleHandleTypes(address());
    }

    public static VkExternalImageFormatPropertiesNV malloc() {
        return new VkExternalImageFormatPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalImageFormatPropertiesNV calloc() {
        return new VkExternalImageFormatPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalImageFormatPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalImageFormatPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalImageFormatPropertiesNV create(long address) {
        return new VkExternalImageFormatPropertiesNV(address, null);
    }

    public static VkExternalImageFormatPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalImageFormatPropertiesNV(address, null);
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

    public static VkExternalImageFormatPropertiesNV malloc(MemoryStack stack) {
        return new VkExternalImageFormatPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalImageFormatPropertiesNV calloc(MemoryStack stack) {
        return new VkExternalImageFormatPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkImageFormatProperties nimageFormatProperties(long struct) {
        return VkImageFormatProperties.create(struct + IMAGEFORMATPROPERTIES);
    }

    public static int nexternalMemoryFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + EXTERNALMEMORYFEATURES);
    }

    public static int nexportFromImportedHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + EXPORTFROMIMPORTEDHANDLETYPES);
    }

    public static int ncompatibleHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + COMPATIBLEHANDLETYPES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalImageFormatPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalImageFormatPropertiesNV, Buffer> implements NativeResource {
        private static final VkExternalImageFormatPropertiesNV ELEMENT_FACTORY = VkExternalImageFormatPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalImageFormatPropertiesNV.SIZEOF);
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
        public VkExternalImageFormatPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkImageFormatProperties imageFormatProperties() {
            return VkExternalImageFormatPropertiesNV.nimageFormatProperties(address());
        }

        @NativeType("VkExternalMemoryFeatureFlagsNV")
        public int externalMemoryFeatures() {
            return VkExternalImageFormatPropertiesNV.nexternalMemoryFeatures(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int exportFromImportedHandleTypes() {
            return VkExternalImageFormatPropertiesNV.nexportFromImportedHandleTypes(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagsNV")
        public int compatibleHandleTypes() {
            return VkExternalImageFormatPropertiesNV.ncompatibleHandleTypes(address());
        }
    }
}
