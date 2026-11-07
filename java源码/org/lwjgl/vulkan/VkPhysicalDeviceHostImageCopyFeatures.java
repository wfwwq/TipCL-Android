package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyFeatures.class */
public class VkPhysicalDeviceHostImageCopyFeatures extends Struct<VkPhysicalDeviceHostImageCopyFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HOSTIMAGECOPY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HOSTIMAGECOPY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceHostImageCopyFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceHostImageCopyFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyFeatures(address, container);
    }

    public VkPhysicalDeviceHostImageCopyFeatures(ByteBuffer container) {
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
    public boolean hostImageCopy() {
        return nhostImageCopy(address()) != 0;
    }

    public VkPhysicalDeviceHostImageCopyFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyFeatures sType$Default() {
        return sType(1000270000);
    }

    public VkPhysicalDeviceHostImageCopyFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyFeatures hostImageCopy(@NativeType("VkBool32") boolean value) {
        nhostImageCopy(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyFeatures set(int sType, long pNext, boolean hostImageCopy) {
        sType(sType);
        pNext(pNext);
        hostImageCopy(hostImageCopy);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyFeatures set(VkPhysicalDeviceHostImageCopyFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceHostImageCopyFeatures malloc() {
        return new VkPhysicalDeviceHostImageCopyFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyFeatures calloc() {
        return new VkPhysicalDeviceHostImageCopyFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceHostImageCopyFeatures create(long address) {
        return new VkPhysicalDeviceHostImageCopyFeatures(address, null);
    }

    public static VkPhysicalDeviceHostImageCopyFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceHostImageCopyFeatures(address, null);
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

    public static VkPhysicalDeviceHostImageCopyFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhostImageCopy(long struct) {
        return MemoryUtil.memGetInt(struct + HOSTIMAGECOPY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nhostImageCopy(long struct, int value) {
        MemoryUtil.memPutInt(struct + HOSTIMAGECOPY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHostImageCopyFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceHostImageCopyFeatures ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceHostImageCopyFeatures.SIZEOF);
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
        public VkPhysicalDeviceHostImageCopyFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceHostImageCopyFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceHostImageCopyFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean hostImageCopy() {
            return VkPhysicalDeviceHostImageCopyFeatures.nhostImageCopy(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceHostImageCopyFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000270000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceHostImageCopyFeatures.npNext(address(), value);
            return this;
        }

        public Buffer hostImageCopy(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceHostImageCopyFeatures.nhostImageCopy(address(), value ? 1 : 0);
            return this;
        }
    }
}
