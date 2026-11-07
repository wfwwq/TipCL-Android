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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfo.class */
public class VkDeviceGroupCommandBufferBeginInfo extends Struct<VkDeviceGroupCommandBufferBeginInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEMASK = layout.offsetof(2);
    }

    protected VkDeviceGroupCommandBufferBeginInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceGroupCommandBufferBeginInfo create(long address, ByteBuffer container) {
        return new VkDeviceGroupCommandBufferBeginInfo(address, container);
    }

    public VkDeviceGroupCommandBufferBeginInfo(ByteBuffer container) {
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
    public int deviceMask() {
        return ndeviceMask(address());
    }

    public VkDeviceGroupCommandBufferBeginInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceGroupCommandBufferBeginInfo sType$Default() {
        return sType(1000060004);
    }

    public VkDeviceGroupCommandBufferBeginInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceGroupCommandBufferBeginInfo deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    public VkDeviceGroupCommandBufferBeginInfo set(int sType, long pNext, int deviceMask) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        return this;
    }

    public VkDeviceGroupCommandBufferBeginInfo set(VkDeviceGroupCommandBufferBeginInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceGroupCommandBufferBeginInfo malloc() {
        return new VkDeviceGroupCommandBufferBeginInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceGroupCommandBufferBeginInfo calloc() {
        return new VkDeviceGroupCommandBufferBeginInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceGroupCommandBufferBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupCommandBufferBeginInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceGroupCommandBufferBeginInfo create(long address) {
        return new VkDeviceGroupCommandBufferBeginInfo(address, null);
    }

    public static VkDeviceGroupCommandBufferBeginInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceGroupCommandBufferBeginInfo(address, null);
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

    public static VkDeviceGroupCommandBufferBeginInfo malloc(MemoryStack stack) {
        return new VkDeviceGroupCommandBufferBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceGroupCommandBufferBeginInfo calloc(MemoryStack stack) {
        return new VkDeviceGroupCommandBufferBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceMask(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceGroupCommandBufferBeginInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceGroupCommandBufferBeginInfo, Buffer> implements NativeResource {
        private static final VkDeviceGroupCommandBufferBeginInfo ELEMENT_FACTORY = VkDeviceGroupCommandBufferBeginInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceGroupCommandBufferBeginInfo.SIZEOF);
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
        public VkDeviceGroupCommandBufferBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceGroupCommandBufferBeginInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceGroupCommandBufferBeginInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int deviceMask() {
            return VkDeviceGroupCommandBufferBeginInfo.ndeviceMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceGroupCommandBufferBeginInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceGroupCommandBufferBeginInfo.npNext(address(), value);
            return this;
        }

        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkDeviceGroupCommandBufferBeginInfo.ndeviceMask(address(), value);
            return this;
        }
    }
}
