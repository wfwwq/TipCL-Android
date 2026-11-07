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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSwapchainCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSwapchainCreateInfoKHR.class */
public class VkDeviceGroupSwapchainCreateInfoKHR extends Struct<VkDeviceGroupSwapchainCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MODES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODES = layout.offsetof(2);
    }

    protected VkDeviceGroupSwapchainCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceGroupSwapchainCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupSwapchainCreateInfoKHR(address, container);
    }

    public VkDeviceGroupSwapchainCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkDeviceGroupPresentModeFlagsKHR")
    public int modes() {
        return nmodes(address());
    }

    public VkDeviceGroupSwapchainCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceGroupSwapchainCreateInfoKHR sType$Default() {
        return sType(1000060012);
    }

    public VkDeviceGroupSwapchainCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceGroupSwapchainCreateInfoKHR modes(@NativeType("VkDeviceGroupPresentModeFlagsKHR") int value) {
        nmodes(address(), value);
        return this;
    }

    public VkDeviceGroupSwapchainCreateInfoKHR set(int sType, long pNext, int modes) {
        sType(sType);
        pNext(pNext);
        modes(modes);
        return this;
    }

    public VkDeviceGroupSwapchainCreateInfoKHR set(VkDeviceGroupSwapchainCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupSwapchainCreateInfoKHR malloc() {
        return new VkDeviceGroupSwapchainCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupSwapchainCreateInfoKHR calloc() {
        return new VkDeviceGroupSwapchainCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupSwapchainCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupSwapchainCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupSwapchainCreateInfoKHR create(long address) {
        return new VkDeviceGroupSwapchainCreateInfoKHR(address, null);
    }

    public static VkDeviceGroupSwapchainCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupSwapchainCreateInfoKHR(address, null);
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

    public static VkDeviceGroupSwapchainCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupSwapchainCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupSwapchainCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupSwapchainCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmodes(long struct) {
        return MemoryUtil.memGetInt(struct + MODES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmodes(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSwapchainCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSwapchainCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceGroupSwapchainCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkDeviceGroupSwapchainCreateInfoKHR ELEMENT_FACTORY = VkDeviceGroupSwapchainCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceGroupSwapchainCreateInfoKHR.SIZEOF);
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
        public VkDeviceGroupSwapchainCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceGroupSwapchainCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceGroupSwapchainCreateInfoKHR.npNext(address());
        }

        @NativeType("VkDeviceGroupPresentModeFlagsKHR")
        public int modes() {
            return VkDeviceGroupSwapchainCreateInfoKHR.nmodes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupSwapchainCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060012);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupSwapchainCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer modes(@NativeType("VkDeviceGroupPresentModeFlagsKHR") int value) {
            VkDeviceGroupSwapchainCreateInfoKHR.nmodes(address(), value);
            return this;
        }
    }
}
