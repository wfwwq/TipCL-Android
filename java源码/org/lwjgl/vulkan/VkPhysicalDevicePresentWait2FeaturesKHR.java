package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentWait2FeaturesKHR.class */
public class VkPhysicalDevicePresentWait2FeaturesKHR extends Struct<VkPhysicalDevicePresentWait2FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTWAIT2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTWAIT2 = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentWait2FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePresentWait2FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePresentWait2FeaturesKHR(address, container);
    }

    public VkPhysicalDevicePresentWait2FeaturesKHR(ByteBuffer container) {
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
    public boolean presentWait2() {
        return npresentWait2(address()) != 0;
    }

    public VkPhysicalDevicePresentWait2FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentWait2FeaturesKHR sType$Default() {
        return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR);
    }

    public VkPhysicalDevicePresentWait2FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentWait2FeaturesKHR presentWait2(@NativeType("VkBool32") boolean value) {
        npresentWait2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePresentWait2FeaturesKHR set(int sType, long pNext, boolean presentWait2) {
        sType(sType);
        pNext(pNext);
        presentWait2(presentWait2);
        return this;
    }

    public VkPhysicalDevicePresentWait2FeaturesKHR set(VkPhysicalDevicePresentWait2FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePresentWait2FeaturesKHR malloc() {
        return new VkPhysicalDevicePresentWait2FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePresentWait2FeaturesKHR calloc() {
        return new VkPhysicalDevicePresentWait2FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentWait2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentWait2FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePresentWait2FeaturesKHR create(long address) {
        return new VkPhysicalDevicePresentWait2FeaturesKHR(address, null);
    }

    public static VkPhysicalDevicePresentWait2FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePresentWait2FeaturesKHR(address, null);
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

    public static VkPhysicalDevicePresentWait2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentWait2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentWait2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentWait2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentWait2(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTWAIT2);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentWait2(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTWAIT2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentWait2FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentWait2FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePresentWait2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePresentWait2FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePresentWait2FeaturesKHR.SIZEOF);
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
        public VkPhysicalDevicePresentWait2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePresentWait2FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePresentWait2FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentWait2() {
            return VkPhysicalDevicePresentWait2FeaturesKHR.npresentWait2(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePresentWait2FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePresentWait2FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer presentWait2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePresentWait2FeaturesKHR.npresentWait2(address(), value ? 1 : 0);
            return this;
        }
    }
}
