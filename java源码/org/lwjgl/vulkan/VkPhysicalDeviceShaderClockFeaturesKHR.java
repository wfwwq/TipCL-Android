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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderClockFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderClockFeaturesKHR.class */
public class VkPhysicalDeviceShaderClockFeaturesKHR extends Struct<VkPhysicalDeviceShaderClockFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERSUBGROUPCLOCK;
    public static final int SHADERDEVICECLOCK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSUBGROUPCLOCK = layout.offsetof(2);
        SHADERDEVICECLOCK = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderClockFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderClockFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR(ByteBuffer container) {
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
    public boolean shaderSubgroupClock() {
        return nshaderSubgroupClock(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDeviceClock() {
        return nshaderDeviceClock(address()) != 0;
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR sType$Default() {
        return sType(KHRShaderClock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR);
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClock(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupClock(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClock(@NativeType("VkBool32") boolean value) {
        nshaderDeviceClock(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR set(int sType, long pNext, boolean shaderSubgroupClock, boolean shaderDeviceClock) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupClock(shaderSubgroupClock);
        shaderDeviceClock(shaderDeviceClock);
        return this;
    }

    public VkPhysicalDeviceShaderClockFeaturesKHR set(VkPhysicalDeviceShaderClockFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderClockFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderClockFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderClockFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderSubgroupClock(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPCLOCK);
    }

    public static int nshaderDeviceClock(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDEVICECLOCK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderSubgroupClock(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPCLOCK, value);
    }

    public static void nshaderDeviceClock(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERDEVICECLOCK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderClockFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderClockFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderClockFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderClockFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderClockFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderClockFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceShaderClockFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderClockFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderClockFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupClock() {
            return VkPhysicalDeviceShaderClockFeaturesKHR.nshaderSubgroupClock(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDeviceClock() {
            return VkPhysicalDeviceShaderClockFeaturesKHR.nshaderDeviceClock(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderClockFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRShaderClock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderClockFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer shaderSubgroupClock(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderClockFeaturesKHR.nshaderSubgroupClock(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderDeviceClock(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderClockFeaturesKHR.nshaderDeviceClock(address(), value ? 1 : 0);
            return this;
        }
    }
}
