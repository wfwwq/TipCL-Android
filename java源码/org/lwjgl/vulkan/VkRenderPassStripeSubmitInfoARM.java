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
import org.lwjgl.vulkan.VkSemaphoreSubmitInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassStripeSubmitInfoARM.class */
public class VkRenderPassStripeSubmitInfoARM extends Struct<VkRenderPassStripeSubmitInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STRIPESEMAPHOREINFOCOUNT;
    public static final int PSTRIPESEMAPHOREINFOS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STRIPESEMAPHOREINFOCOUNT = layout.offsetof(2);
        PSTRIPESEMAPHOREINFOS = layout.offsetof(3);
    }

    protected VkRenderPassStripeSubmitInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassStripeSubmitInfoARM create(long address, ByteBuffer container) {
        return new VkRenderPassStripeSubmitInfoARM(address, container);
    }

    public VkRenderPassStripeSubmitInfoARM(ByteBuffer container) {
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
    public int stripeSemaphoreInfoCount() {
        return nstripeSemaphoreInfoCount(address());
    }

    @NativeType("VkSemaphoreSubmitInfo const *")
    public VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos() {
        return npStripeSemaphoreInfos(address());
    }

    public VkRenderPassStripeSubmitInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassStripeSubmitInfoARM sType$Default() {
        return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM);
    }

    public VkRenderPassStripeSubmitInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
        npStripeSemaphoreInfos(address(), value);
        return this;
    }

    public VkRenderPassStripeSubmitInfoARM set(int sType, long pNext, VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos) {
        sType(sType);
        pNext(pNext);
        pStripeSemaphoreInfos(pStripeSemaphoreInfos);
        return this;
    }

    public VkRenderPassStripeSubmitInfoARM set(VkRenderPassStripeSubmitInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassStripeSubmitInfoARM malloc() {
        return new VkRenderPassStripeSubmitInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassStripeSubmitInfoARM calloc() {
        return new VkRenderPassStripeSubmitInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassStripeSubmitInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassStripeSubmitInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassStripeSubmitInfoARM create(long address) {
        return new VkRenderPassStripeSubmitInfoARM(address, null);
    }

    public static VkRenderPassStripeSubmitInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassStripeSubmitInfoARM(address, null);
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

    public static VkRenderPassStripeSubmitInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassStripeSubmitInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassStripeSubmitInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassStripeSubmitInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstripeSemaphoreInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + STRIPESEMAPHOREINFOCOUNT);
    }

    public static VkSemaphoreSubmitInfo.Buffer npStripeSemaphoreInfos(long struct) {
        return VkSemaphoreSubmitInfo.create(MemoryUtil.memGetAddress(struct + PSTRIPESEMAPHOREINFOS), nstripeSemaphoreInfoCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstripeSemaphoreInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIPESEMAPHOREINFOCOUNT, value);
    }

    public static void npStripeSemaphoreInfos(long struct, VkSemaphoreSubmitInfo.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTRIPESEMAPHOREINFOS, value.address());
        nstripeSemaphoreInfoCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTRIPESEMAPHOREINFOS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassStripeSubmitInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassStripeSubmitInfoARM, Buffer> implements NativeResource {
        private static final VkRenderPassStripeSubmitInfoARM ELEMENT_FACTORY = VkRenderPassStripeSubmitInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassStripeSubmitInfoARM.SIZEOF);
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
        public VkRenderPassStripeSubmitInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassStripeSubmitInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassStripeSubmitInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int stripeSemaphoreInfoCount() {
            return VkRenderPassStripeSubmitInfoARM.nstripeSemaphoreInfoCount(address());
        }

        @NativeType("VkSemaphoreSubmitInfo const *")
        public VkSemaphoreSubmitInfo.Buffer pStripeSemaphoreInfos() {
            return VkRenderPassStripeSubmitInfoARM.npStripeSemaphoreInfos(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassStripeSubmitInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassStripeSubmitInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pStripeSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) {
            VkRenderPassStripeSubmitInfoARM.npStripeSemaphoreInfos(address(), value);
            return this;
        }
    }
}
