package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.class */
public class VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR extends Struct<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTMODEFIFOLATESTREADY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMODEFIFOLATESTREADY = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(address, container);
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(ByteBuffer container) {
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
    public boolean presentModeFifoLatestReady() {
        return npresentModeFifoLatestReady(address()) != 0;
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR sType$Default() {
        return sType(1000361000);
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR presentModeFifoLatestReady(@NativeType("VkBool32") boolean value) {
        npresentModeFifoLatestReady(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR set(int sType, long pNext, boolean presentModeFifoLatestReady) {
        sType(sType);
        pNext(pNext);
        presentModeFifoLatestReady(presentModeFifoLatestReady);
        return this;
    }

    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR set(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR malloc() {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR calloc() {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR create(long address) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(address, null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(address, null);
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

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentModeFifoLatestReady(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTMODEFIFOLATESTREADY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentModeFifoLatestReady(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTMODEFIFOLATESTREADY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.SIZEOF);
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
        public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentModeFifoLatestReady() {
            return VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npresentModeFifoLatestReady(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000361000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer presentModeFifoLatestReady(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npresentModeFifoLatestReady(address(), value ? 1 : 0);
            return this;
        }
    }
}
