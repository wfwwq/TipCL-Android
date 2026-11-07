package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfo.class */
public class VkCommandBufferSubmitInfo extends Struct<VkCommandBufferSubmitInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMMANDBUFFER;
    public static final int DEVICEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMMANDBUFFER = layout.offsetof(2);
        DEVICEMASK = layout.offsetof(3);
    }

    protected VkCommandBufferSubmitInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferSubmitInfo create(long address, ByteBuffer container) {
        return new VkCommandBufferSubmitInfo(address, container);
    }

    public VkCommandBufferSubmitInfo(ByteBuffer container) {
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

    @NativeType("VkCommandBuffer")
    public long commandBuffer() {
        return ncommandBuffer(address());
    }

    @NativeType("uint32_t")
    public int deviceMask() {
        return ndeviceMask(address());
    }

    public VkCommandBufferSubmitInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferSubmitInfo sType$Default() {
        return sType(1000314006);
    }

    public VkCommandBufferSubmitInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferSubmitInfo pNext(VkRenderPassStripeSubmitInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandBufferSubmitInfo commandBuffer(VkCommandBuffer value) {
        ncommandBuffer(address(), value);
        return this;
    }

    public VkCommandBufferSubmitInfo deviceMask(@NativeType("uint32_t") int value) {
        ndeviceMask(address(), value);
        return this;
    }

    public VkCommandBufferSubmitInfo set(int sType, long pNext, VkCommandBuffer commandBuffer, int deviceMask) {
        sType(sType);
        pNext(pNext);
        commandBuffer(commandBuffer);
        deviceMask(deviceMask);
        return this;
    }

    public VkCommandBufferSubmitInfo set(VkCommandBufferSubmitInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferSubmitInfo malloc() {
        return new VkCommandBufferSubmitInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferSubmitInfo calloc() {
        return new VkCommandBufferSubmitInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferSubmitInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferSubmitInfo create(long address) {
        return new VkCommandBufferSubmitInfo(address, null);
    }

    public static VkCommandBufferSubmitInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferSubmitInfo(address, null);
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

    public static VkCommandBufferSubmitInfo malloc(MemoryStack stack) {
        return new VkCommandBufferSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferSubmitInfo calloc(MemoryStack stack) {
        return new VkCommandBufferSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ncommandBuffer(long struct) {
        return MemoryUtil.memGetAddress(struct + COMMANDBUFFER);
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

    public static void ncommandBuffer(long struct, VkCommandBuffer value) {
        MemoryUtil.memPutAddress(struct + COMMANDBUFFER, value.address());
    }

    public static void ndeviceMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEMASK, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + COMMANDBUFFER));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferSubmitInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferSubmitInfo, Buffer> implements NativeResource {
        private static final VkCommandBufferSubmitInfo ELEMENT_FACTORY = VkCommandBufferSubmitInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferSubmitInfo.SIZEOF);
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
        public VkCommandBufferSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferSubmitInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferSubmitInfo.npNext(address());
        }

        @NativeType("VkCommandBuffer")
        public long commandBuffer() {
            return VkCommandBufferSubmitInfo.ncommandBuffer(address());
        }

        @NativeType("uint32_t")
        public int deviceMask() {
            return VkCommandBufferSubmitInfo.ndeviceMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferSubmitInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000314006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferSubmitInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkRenderPassStripeSubmitInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer commandBuffer(VkCommandBuffer value) {
            VkCommandBufferSubmitInfo.ncommandBuffer(address(), value);
            return this;
        }

        public Buffer deviceMask(@NativeType("uint32_t") int value) {
            VkCommandBufferSubmitInfo.ndeviceMask(address(), value);
            return this;
        }
    }
}
