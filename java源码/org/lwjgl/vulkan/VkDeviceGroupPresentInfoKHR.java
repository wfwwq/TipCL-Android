package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentInfoKHR.class */
public class VkDeviceGroupPresentInfoKHR extends Struct<VkDeviceGroupPresentInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PDEVICEMASKS;
    public static final int MODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PDEVICEMASKS = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    protected VkDeviceGroupPresentInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceGroupPresentInfoKHR create(long address, ByteBuffer container) {
        return new VkDeviceGroupPresentInfoKHR(address, container);
    }

    public VkDeviceGroupPresentInfoKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int swapchainCount() {
        return nswapchainCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pDeviceMasks() {
        return npDeviceMasks(address());
    }

    @NativeType("VkDeviceGroupPresentModeFlagBitsKHR")
    public int mode() {
        return nmode(address());
    }

    public VkDeviceGroupPresentInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceGroupPresentInfoKHR sType$Default() {
        return sType(1000060011);
    }

    public VkDeviceGroupPresentInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceGroupPresentInfoKHR pDeviceMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npDeviceMasks(address(), value);
        return this;
    }

    public VkDeviceGroupPresentInfoKHR mode(@NativeType("VkDeviceGroupPresentModeFlagBitsKHR") int value) {
        nmode(address(), value);
        return this;
    }

    public VkDeviceGroupPresentInfoKHR set(int sType, long pNext, IntBuffer pDeviceMasks, int mode) {
        sType(sType);
        pNext(pNext);
        pDeviceMasks(pDeviceMasks);
        mode(mode);
        return this;
    }

    public VkDeviceGroupPresentInfoKHR set(VkDeviceGroupPresentInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupPresentInfoKHR malloc() {
        return new VkDeviceGroupPresentInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupPresentInfoKHR calloc() {
        return new VkDeviceGroupPresentInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupPresentInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupPresentInfoKHR create(long address) {
        return new VkDeviceGroupPresentInfoKHR(address, null);
    }

    public static VkDeviceGroupPresentInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupPresentInfoKHR(address, null);
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

    public static VkDeviceGroupPresentInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupPresentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupPresentInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupPresentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nswapchainCount(long struct) {
        return MemoryUtil.memGetInt(struct + SWAPCHAINCOUNT);
    }

    public static IntBuffer npDeviceMasks(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDEVICEMASKS), nswapchainCount(struct));
    }

    public static int nmode(long struct) {
        return MemoryUtil.memGetInt(struct + MODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nswapchainCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SWAPCHAINCOUNT, value);
    }

    public static void npDeviceMasks(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDEVICEMASKS, MemoryUtil.memAddressSafe(value));
        nswapchainCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    public static void validate(long struct) {
        if (nswapchainCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDEVICEMASKS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupPresentInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceGroupPresentInfoKHR, Buffer> implements NativeResource {
        private static final VkDeviceGroupPresentInfoKHR ELEMENT_FACTORY = VkDeviceGroupPresentInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceGroupPresentInfoKHR.SIZEOF);
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
        public VkDeviceGroupPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceGroupPresentInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceGroupPresentInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkDeviceGroupPresentInfoKHR.nswapchainCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pDeviceMasks() {
            return VkDeviceGroupPresentInfoKHR.npDeviceMasks(address());
        }

        @NativeType("VkDeviceGroupPresentModeFlagBitsKHR")
        public int mode() {
            return VkDeviceGroupPresentInfoKHR.nmode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupPresentInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060011);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupPresentInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pDeviceMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkDeviceGroupPresentInfoKHR.npDeviceMasks(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("VkDeviceGroupPresentModeFlagBitsKHR") int value) {
            VkDeviceGroupPresentInfoKHR.nmode(address(), value);
            return this;
        }
    }
}
