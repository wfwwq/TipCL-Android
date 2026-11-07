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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewAddressPropertiesNVX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewAddressPropertiesNVX.class */
public class VkImageViewAddressPropertiesNVX extends Struct<VkImageViewAddressPropertiesNVX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEADDRESS;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEADDRESS = layout.offsetof(2);
        SIZE = layout.offsetof(3);
    }

    protected VkImageViewAddressPropertiesNVX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageViewAddressPropertiesNVX create(long address, ByteBuffer container) {
        return new VkImageViewAddressPropertiesNVX(address, container);
    }

    public VkImageViewAddressPropertiesNVX(ByteBuffer container) {
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

    @NativeType("VkDeviceAddress")
    public long deviceAddress() {
        return ndeviceAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkImageViewAddressPropertiesNVX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageViewAddressPropertiesNVX sType$Default() {
        return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX);
    }

    public VkImageViewAddressPropertiesNVX pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageViewAddressPropertiesNVX set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkImageViewAddressPropertiesNVX set(VkImageViewAddressPropertiesNVX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewAddressPropertiesNVX malloc() {
        return new VkImageViewAddressPropertiesNVX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewAddressPropertiesNVX calloc() {
        return new VkImageViewAddressPropertiesNVX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewAddressPropertiesNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewAddressPropertiesNVX(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewAddressPropertiesNVX create(long address) {
        return new VkImageViewAddressPropertiesNVX(address, null);
    }

    public static VkImageViewAddressPropertiesNVX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewAddressPropertiesNVX(address, null);
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

    public static VkImageViewAddressPropertiesNVX malloc(MemoryStack stack) {
        return new VkImageViewAddressPropertiesNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewAddressPropertiesNVX calloc(MemoryStack stack) {
        return new VkImageViewAddressPropertiesNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndeviceAddress(long struct) {
        return MemoryUtil.memGetLong(struct + DEVICEADDRESS);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewAddressPropertiesNVX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewAddressPropertiesNVX$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageViewAddressPropertiesNVX, Buffer> implements NativeResource {
        private static final VkImageViewAddressPropertiesNVX ELEMENT_FACTORY = VkImageViewAddressPropertiesNVX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageViewAddressPropertiesNVX.SIZEOF);
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
        public VkImageViewAddressPropertiesNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageViewAddressPropertiesNVX.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkImageViewAddressPropertiesNVX.npNext(address());
        }

        @NativeType("VkDeviceAddress")
        public long deviceAddress() {
            return VkImageViewAddressPropertiesNVX.ndeviceAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkImageViewAddressPropertiesNVX.nsize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewAddressPropertiesNVX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkImageViewAddressPropertiesNVX.npNext(address(), value);
            return this;
        }
    }
}
