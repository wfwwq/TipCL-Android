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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfo.class */
public class VkDeviceGroupSubmitInfo extends Struct<VkDeviceGroupSubmitInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WAITSEMAPHORECOUNT;
    public static final int PWAITSEMAPHOREDEVICEINDICES;
    public static final int COMMANDBUFFERCOUNT;
    public static final int PCOMMANDBUFFERDEVICEMASKS;
    public static final int SIGNALSEMAPHORECOUNT;
    public static final int PSIGNALSEMAPHOREDEVICEINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHOREDEVICEINDICES = layout.offsetof(3);
        COMMANDBUFFERCOUNT = layout.offsetof(4);
        PCOMMANDBUFFERDEVICEMASKS = layout.offsetof(5);
        SIGNALSEMAPHORECOUNT = layout.offsetof(6);
        PSIGNALSEMAPHOREDEVICEINDICES = layout.offsetof(7);
    }

    protected VkDeviceGroupSubmitInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceGroupSubmitInfo create(long address, ByteBuffer container) {
        return new VkDeviceGroupSubmitInfo(address, container);
    }

    public VkDeviceGroupSubmitInfo(ByteBuffer container) {
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
    public int waitSemaphoreCount() {
        return nwaitSemaphoreCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pWaitSemaphoreDeviceIndices() {
        return npWaitSemaphoreDeviceIndices(address());
    }

    @NativeType("uint32_t")
    public int commandBufferCount() {
        return ncommandBufferCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pCommandBufferDeviceMasks() {
        return npCommandBufferDeviceMasks(address());
    }

    @NativeType("uint32_t")
    public int signalSemaphoreCount() {
        return nsignalSemaphoreCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pSignalSemaphoreDeviceIndices() {
        return npSignalSemaphoreDeviceIndices(address());
    }

    public VkDeviceGroupSubmitInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceGroupSubmitInfo sType$Default() {
        return sType(1000060005);
    }

    public VkDeviceGroupSubmitInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npWaitSemaphoreDeviceIndices(address(), value);
        return this;
    }

    public VkDeviceGroupSubmitInfo pCommandBufferDeviceMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npCommandBufferDeviceMasks(address(), value);
        return this;
    }

    public VkDeviceGroupSubmitInfo pSignalSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npSignalSemaphoreDeviceIndices(address(), value);
        return this;
    }

    public VkDeviceGroupSubmitInfo set(int sType, long pNext, IntBuffer pWaitSemaphoreDeviceIndices, IntBuffer pCommandBufferDeviceMasks, IntBuffer pSignalSemaphoreDeviceIndices) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices);
        pCommandBufferDeviceMasks(pCommandBufferDeviceMasks);
        pSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices);
        return this;
    }

    public VkDeviceGroupSubmitInfo set(VkDeviceGroupSubmitInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupSubmitInfo malloc() {
        return new VkDeviceGroupSubmitInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupSubmitInfo calloc() {
        return new VkDeviceGroupSubmitInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupSubmitInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupSubmitInfo create(long address) {
        return new VkDeviceGroupSubmitInfo(address, null);
    }

    public static VkDeviceGroupSubmitInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupSubmitInfo(address, null);
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

    public static VkDeviceGroupSubmitInfo malloc(MemoryStack stack) {
        return new VkDeviceGroupSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupSubmitInfo calloc(MemoryStack stack) {
        return new VkDeviceGroupSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwaitSemaphoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + WAITSEMAPHORECOUNT);
    }

    public static IntBuffer npWaitSemaphoreDeviceIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PWAITSEMAPHOREDEVICEINDICES), nwaitSemaphoreCount(struct));
    }

    public static int ncommandBufferCount(long struct) {
        return MemoryUtil.memGetInt(struct + COMMANDBUFFERCOUNT);
    }

    public static IntBuffer npCommandBufferDeviceMasks(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOMMANDBUFFERDEVICEMASKS), ncommandBufferCount(struct));
    }

    public static int nsignalSemaphoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + SIGNALSEMAPHORECOUNT);
    }

    public static IntBuffer npSignalSemaphoreDeviceIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHOREDEVICEINDICES), nsignalSemaphoreCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwaitSemaphoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAITSEMAPHORECOUNT, value);
    }

    public static void npWaitSemaphoreDeviceIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PWAITSEMAPHOREDEVICEINDICES, MemoryUtil.memAddressSafe(value));
        nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ncommandBufferCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMMANDBUFFERCOUNT, value);
    }

    public static void npCommandBufferDeviceMasks(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOMMANDBUFFERDEVICEMASKS, MemoryUtil.memAddressSafe(value));
        ncommandBufferCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nsignalSemaphoreCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIGNALSEMAPHORECOUNT, value);
    }

    public static void npSignalSemaphoreDeviceIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PSIGNALSEMAPHOREDEVICEINDICES, MemoryUtil.memAddressSafe(value));
        nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PWAITSEMAPHOREDEVICEINDICES));
        }
        if (ncommandBufferCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCOMMANDBUFFERDEVICEMASKS));
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PSIGNALSEMAPHOREDEVICEINDICES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupSubmitInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceGroupSubmitInfo, Buffer> implements NativeResource {
        private static final VkDeviceGroupSubmitInfo ELEMENT_FACTORY = VkDeviceGroupSubmitInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceGroupSubmitInfo.SIZEOF);
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
        public VkDeviceGroupSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceGroupSubmitInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceGroupSubmitInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int waitSemaphoreCount() {
            return VkDeviceGroupSubmitInfo.nwaitSemaphoreCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pWaitSemaphoreDeviceIndices() {
            return VkDeviceGroupSubmitInfo.npWaitSemaphoreDeviceIndices(address());
        }

        @NativeType("uint32_t")
        public int commandBufferCount() {
            return VkDeviceGroupSubmitInfo.ncommandBufferCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pCommandBufferDeviceMasks() {
            return VkDeviceGroupSubmitInfo.npCommandBufferDeviceMasks(address());
        }

        @NativeType("uint32_t")
        public int signalSemaphoreCount() {
            return VkDeviceGroupSubmitInfo.nsignalSemaphoreCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pSignalSemaphoreDeviceIndices() {
            return VkDeviceGroupSubmitInfo.npSignalSemaphoreDeviceIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupSubmitInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupSubmitInfo.npNext(address(), value);
            return this;
        }

        public Buffer pWaitSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkDeviceGroupSubmitInfo.npWaitSemaphoreDeviceIndices(address(), value);
            return this;
        }

        public Buffer pCommandBufferDeviceMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkDeviceGroupSubmitInfo.npCommandBufferDeviceMasks(address(), value);
            return this;
        }

        public Buffer pSignalSemaphoreDeviceIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkDeviceGroupSubmitInfo.npSignalSemaphoreDeviceIndices(address(), value);
            return this;
        }
    }
}
