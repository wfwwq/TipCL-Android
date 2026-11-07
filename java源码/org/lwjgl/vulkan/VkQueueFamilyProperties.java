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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyProperties.class */
public class VkQueueFamilyProperties extends Struct<VkQueueFamilyProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int QUEUEFLAGS;
    public static final int QUEUECOUNT;
    public static final int TIMESTAMPVALIDBITS;
    public static final int MINIMAGETRANSFERGRANULARITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        QUEUEFLAGS = layout.offsetof(0);
        QUEUECOUNT = layout.offsetof(1);
        TIMESTAMPVALIDBITS = layout.offsetof(2);
        MINIMAGETRANSFERGRANULARITY = layout.offsetof(3);
    }

    protected VkQueueFamilyProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyProperties create(long address, ByteBuffer container) {
        return new VkQueueFamilyProperties(address, container);
    }

    public VkQueueFamilyProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkQueueFlags")
    public int queueFlags() {
        return nqueueFlags(address());
    }

    @NativeType("uint32_t")
    public int queueCount() {
        return nqueueCount(address());
    }

    @NativeType("uint32_t")
    public int timestampValidBits() {
        return ntimestampValidBits(address());
    }

    public VkExtent3D minImageTransferGranularity() {
        return nminImageTransferGranularity(address());
    }

    public static VkQueueFamilyProperties malloc() {
        return new VkQueueFamilyProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyProperties calloc() {
        return new VkQueueFamilyProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyProperties create(long address) {
        return new VkQueueFamilyProperties(address, null);
    }

    public static VkQueueFamilyProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyProperties(address, null);
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

    public static VkQueueFamilyProperties malloc(MemoryStack stack) {
        return new VkQueueFamilyProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyProperties calloc(MemoryStack stack) {
        return new VkQueueFamilyProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nqueueFlags(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFLAGS);
    }

    public static int nqueueCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUECOUNT);
    }

    public static int ntimestampValidBits(long struct) {
        return MemoryUtil.memGetInt(struct + TIMESTAMPVALIDBITS);
    }

    public static VkExtent3D nminImageTransferGranularity(long struct) {
        return VkExtent3D.create(struct + MINIMAGETRANSFERGRANULARITY);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyProperties, Buffer> implements NativeResource {
        private static final VkQueueFamilyProperties ELEMENT_FACTORY = VkQueueFamilyProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyProperties.SIZEOF);
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
        public VkQueueFamilyProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkQueueFlags")
        public int queueFlags() {
            return VkQueueFamilyProperties.nqueueFlags(address());
        }

        @NativeType("uint32_t")
        public int queueCount() {
            return VkQueueFamilyProperties.nqueueCount(address());
        }

        @NativeType("uint32_t")
        public int timestampValidBits() {
            return VkQueueFamilyProperties.ntimestampValidBits(address());
        }

        public VkExtent3D minImageTransferGranularity() {
            return VkQueueFamilyProperties.nminImageTransferGranularity(address());
        }
    }
}
