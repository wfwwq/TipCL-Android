package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAntiLagFeaturesAMD.class */
public class VkPhysicalDeviceAntiLagFeaturesAMD extends Struct<VkPhysicalDeviceAntiLagFeaturesAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ANTILAG;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ANTILAG = layout.offsetof(2);
    }

    protected VkPhysicalDeviceAntiLagFeaturesAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceAntiLagFeaturesAMD create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(address, container);
    }

    public VkPhysicalDeviceAntiLagFeaturesAMD(ByteBuffer container) {
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
    public boolean antiLag() {
        return nantiLag(address()) != 0;
    }

    public VkPhysicalDeviceAntiLagFeaturesAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceAntiLagFeaturesAMD sType$Default() {
        return sType(AMDAntiLag.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD);
    }

    public VkPhysicalDeviceAntiLagFeaturesAMD pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceAntiLagFeaturesAMD antiLag(@NativeType("VkBool32") boolean value) {
        nantiLag(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceAntiLagFeaturesAMD set(int sType, long pNext, boolean antiLag) {
        sType(sType);
        pNext(pNext);
        antiLag(antiLag);
        return this;
    }

    public VkPhysicalDeviceAntiLagFeaturesAMD set(VkPhysicalDeviceAntiLagFeaturesAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD malloc() {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD calloc() {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAntiLagFeaturesAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD create(long address) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(address, null);
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceAntiLagFeaturesAMD(address, null);
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

    public static VkPhysicalDeviceAntiLagFeaturesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceAntiLagFeaturesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nantiLag(long struct) {
        return MemoryUtil.memGetInt(struct + ANTILAG);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nantiLag(long struct, int value) {
        MemoryUtil.memPutInt(struct + ANTILAG, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAntiLagFeaturesAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAntiLagFeaturesAMD, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceAntiLagFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceAntiLagFeaturesAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceAntiLagFeaturesAMD.SIZEOF);
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
        public VkPhysicalDeviceAntiLagFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceAntiLagFeaturesAMD.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceAntiLagFeaturesAMD.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean antiLag() {
            return VkPhysicalDeviceAntiLagFeaturesAMD.nantiLag(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceAntiLagFeaturesAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDAntiLag.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceAntiLagFeaturesAMD.npNext(address(), value);
            return this;
        }

        public Buffer antiLag(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceAntiLagFeaturesAMD.nantiLag(address(), value ? 1 : 0);
            return this;
        }
    }
}
