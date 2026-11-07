package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.class */
public class VkPhysicalDeviceDepthClampZeroOneFeaturesKHR extends Struct<VkPhysicalDeviceDepthClampZeroOneFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEPTHCLAMPZEROONE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHCLAMPZEROONE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(ByteBuffer container) {
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
    public boolean depthClampZeroOne() {
        return ndepthClampZeroOne(address()) != 0;
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR sType$Default() {
        return sType(1000421000);
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR depthClampZeroOne(@NativeType("VkBool32") boolean value) {
        ndepthClampZeroOne(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR set(int sType, long pNext, boolean depthClampZeroOne) {
        sType(sType);
        pNext(pNext);
        depthClampZeroOne(depthClampZeroOne);
        return this;
    }

    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR set(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR malloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR calloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR create(long address) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndepthClampZeroOne(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHCLAMPZEROONE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndepthClampZeroOne(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHCLAMPZEROONE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthClampZeroOneFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthClampZeroOneFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDepthClampZeroOneFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean depthClampZeroOne() {
            return VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.ndepthClampZeroOne(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000421000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer depthClampZeroOne(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.ndepthClampZeroOne(address(), value ? 1 : 0);
            return this;
        }
    }
}
