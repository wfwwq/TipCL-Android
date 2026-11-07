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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties.class */
public class VkImageFormatProperties extends Struct<VkImageFormatProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAXEXTENT;
    public static final int MAXMIPLEVELS;
    public static final int MAXARRAYLAYERS;
    public static final int SAMPLECOUNTS;
    public static final int MAXRESOURCESIZE;

    static {
        Struct.Layout layout = __struct(__member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF), __member(4), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAXEXTENT = layout.offsetof(0);
        MAXMIPLEVELS = layout.offsetof(1);
        MAXARRAYLAYERS = layout.offsetof(2);
        SAMPLECOUNTS = layout.offsetof(3);
        MAXRESOURCESIZE = layout.offsetof(4);
    }

    protected VkImageFormatProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageFormatProperties create(long address, ByteBuffer container) {
        return new VkImageFormatProperties(address, container);
    }

    public VkImageFormatProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkExtent3D maxExtent() {
        return nmaxExtent(address());
    }

    @NativeType("uint32_t")
    public int maxMipLevels() {
        return nmaxMipLevels(address());
    }

    @NativeType("uint32_t")
    public int maxArrayLayers() {
        return nmaxArrayLayers(address());
    }

    @NativeType("VkSampleCountFlags")
    public int sampleCounts() {
        return nsampleCounts(address());
    }

    @NativeType("VkDeviceSize")
    public long maxResourceSize() {
        return nmaxResourceSize(address());
    }

    public static VkImageFormatProperties malloc() {
        return new VkImageFormatProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageFormatProperties calloc() {
        return new VkImageFormatProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageFormatProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkImageFormatProperties create(long address) {
        return new VkImageFormatProperties(address, null);
    }

    public static VkImageFormatProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageFormatProperties(address, null);
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

    public static VkImageFormatProperties malloc(MemoryStack stack) {
        return new VkImageFormatProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageFormatProperties calloc(MemoryStack stack) {
        return new VkImageFormatProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkExtent3D nmaxExtent(long struct) {
        return VkExtent3D.create(struct + MAXEXTENT);
    }

    public static int nmaxMipLevels(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMIPLEVELS);
    }

    public static int nmaxArrayLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXARRAYLAYERS);
    }

    public static int nsampleCounts(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLECOUNTS);
    }

    public static long nmaxResourceSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXRESOURCESIZE);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageFormatProperties, Buffer> implements NativeResource {
        private static final VkImageFormatProperties ELEMENT_FACTORY = VkImageFormatProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageFormatProperties.SIZEOF);
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
        public VkImageFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkExtent3D maxExtent() {
            return VkImageFormatProperties.nmaxExtent(address());
        }

        @NativeType("uint32_t")
        public int maxMipLevels() {
            return VkImageFormatProperties.nmaxMipLevels(address());
        }

        @NativeType("uint32_t")
        public int maxArrayLayers() {
            return VkImageFormatProperties.nmaxArrayLayers(address());
        }

        @NativeType("VkSampleCountFlags")
        public int sampleCounts() {
            return VkImageFormatProperties.nsampleCounts(address());
        }

        @NativeType("VkDeviceSize")
        public long maxResourceSize() {
            return VkImageFormatProperties.nmaxResourceSize(address());
        }
    }
}
