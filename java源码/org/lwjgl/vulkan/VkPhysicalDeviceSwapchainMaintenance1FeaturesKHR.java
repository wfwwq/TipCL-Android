package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.class */
public class VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR extends Struct<VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINMAINTENANCE1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINMAINTENANCE1 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(ByteBuffer container) {
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
    public boolean swapchainMaintenance1() {
        return nswapchainMaintenance1(address()) != 0;
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR sType$Default() {
        return sType(1000275000);
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR swapchainMaintenance1(@NativeType("VkBool32") boolean value) {
        nswapchainMaintenance1(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR set(int sType, long pNext, boolean swapchainMaintenance1) {
        sType(sType);
        pNext(pNext);
        swapchainMaintenance1(swapchainMaintenance1);
        return this;
    }

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR set(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR malloc() {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR calloc() {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR create(long address) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nswapchainMaintenance1(long struct) {
        return MemoryUtil.memGetInt(struct + SWAPCHAINMAINTENANCE1);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nswapchainMaintenance1(long struct, int value) {
        MemoryUtil.memPutInt(struct + SWAPCHAINMAINTENANCE1, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean swapchainMaintenance1() {
            return VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.nswapchainMaintenance1(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000275000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchainMaintenance1(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.nswapchainMaintenance1(address(), value ? 1 : 0);
            return this;
        }
    }
}
