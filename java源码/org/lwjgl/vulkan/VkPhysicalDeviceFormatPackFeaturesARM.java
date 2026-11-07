package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFormatPackFeaturesARM.class */
public class VkPhysicalDeviceFormatPackFeaturesARM extends Struct<VkPhysicalDeviceFormatPackFeaturesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMATPACK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMATPACK = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFormatPackFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFormatPackFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(address, container);
    }

    public VkPhysicalDeviceFormatPackFeaturesARM(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean formatPack() {
        return nformatPack(address()) != 0;
    }

    public VkPhysicalDeviceFormatPackFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFormatPackFeaturesARM sType$Default() {
        return sType(1000609000);
    }

    public VkPhysicalDeviceFormatPackFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFormatPackFeaturesARM formatPack(@NativeType("VkBool32") boolean value) {
        nformatPack(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFormatPackFeaturesARM set(int sType, long pNext, boolean formatPack) {
        sType(sType);
        pNext(pNext);
        formatPack(formatPack);
        return this;
    }

    public VkPhysicalDeviceFormatPackFeaturesARM set(VkPhysicalDeviceFormatPackFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFormatPackFeaturesARM malloc() {
        return new VkPhysicalDeviceFormatPackFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFormatPackFeaturesARM calloc() {
        return new VkPhysicalDeviceFormatPackFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFormatPackFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFormatPackFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFormatPackFeaturesARM create(long address) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(address, null);
    }

    public static VkPhysicalDeviceFormatPackFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFormatPackFeaturesARM(address, null);
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

    public static VkPhysicalDeviceFormatPackFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFormatPackFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformatPack(long struct) {
        return MemoryUtil.memGetInt(struct + FORMATPACK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nformatPack(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMATPACK, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFormatPackFeaturesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFormatPackFeaturesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFormatPackFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceFormatPackFeaturesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFormatPackFeaturesARM.SIZEOF);
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
        public VkPhysicalDeviceFormatPackFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFormatPackFeaturesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFormatPackFeaturesARM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean formatPack() {
            return VkPhysicalDeviceFormatPackFeaturesARM.nformatPack(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFormatPackFeaturesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000609000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFormatPackFeaturesARM.npNext(address(), value);
            return this;
        }

        public Buffer formatPack(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFormatPackFeaturesARM.nformatPack(address(), value ? 1 : 0);
            return this;
        }
    }
}
