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
import org.lwjgl.vulkan.VkRenderPassStripeInfoARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassStripeBeginInfoARM.class */
public class VkRenderPassStripeBeginInfoARM extends Struct<VkRenderPassStripeBeginInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STRIPEINFOCOUNT;
    public static final int PSTRIPEINFOS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STRIPEINFOCOUNT = layout.offsetof(2);
        PSTRIPEINFOS = layout.offsetof(3);
    }

    protected VkRenderPassStripeBeginInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassStripeBeginInfoARM create(long address, ByteBuffer container) {
        return new VkRenderPassStripeBeginInfoARM(address, container);
    }

    public VkRenderPassStripeBeginInfoARM(ByteBuffer container) {
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
    public int stripeInfoCount() {
        return nstripeInfoCount(address());
    }

    @NativeType("VkRenderPassStripeInfoARM const *")
    public VkRenderPassStripeInfoARM.Buffer pStripeInfos() {
        return npStripeInfos(address());
    }

    public VkRenderPassStripeBeginInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassStripeBeginInfoARM sType$Default() {
        return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM);
    }

    public VkRenderPassStripeBeginInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassStripeBeginInfoARM pStripeInfos(@NativeType("VkRenderPassStripeInfoARM const *") VkRenderPassStripeInfoARM.Buffer value) {
        npStripeInfos(address(), value);
        return this;
    }

    public VkRenderPassStripeBeginInfoARM set(int sType, long pNext, VkRenderPassStripeInfoARM.Buffer pStripeInfos) {
        sType(sType);
        pNext(pNext);
        pStripeInfos(pStripeInfos);
        return this;
    }

    public VkRenderPassStripeBeginInfoARM set(VkRenderPassStripeBeginInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassStripeBeginInfoARM malloc() {
        return new VkRenderPassStripeBeginInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassStripeBeginInfoARM calloc() {
        return new VkRenderPassStripeBeginInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassStripeBeginInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassStripeBeginInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassStripeBeginInfoARM create(long address) {
        return new VkRenderPassStripeBeginInfoARM(address, null);
    }

    public static VkRenderPassStripeBeginInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassStripeBeginInfoARM(address, null);
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

    public static VkRenderPassStripeBeginInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassStripeBeginInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassStripeBeginInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassStripeBeginInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstripeInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + STRIPEINFOCOUNT);
    }

    public static VkRenderPassStripeInfoARM.Buffer npStripeInfos(long struct) {
        return VkRenderPassStripeInfoARM.create(MemoryUtil.memGetAddress(struct + PSTRIPEINFOS), nstripeInfoCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstripeInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIPEINFOCOUNT, value);
    }

    public static void npStripeInfos(long struct, VkRenderPassStripeInfoARM.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSTRIPEINFOS, value.address());
        nstripeInfoCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTRIPEINFOS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassStripeBeginInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassStripeBeginInfoARM, Buffer> implements NativeResource {
        private static final VkRenderPassStripeBeginInfoARM ELEMENT_FACTORY = VkRenderPassStripeBeginInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassStripeBeginInfoARM.SIZEOF);
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
        public VkRenderPassStripeBeginInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassStripeBeginInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassStripeBeginInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int stripeInfoCount() {
            return VkRenderPassStripeBeginInfoARM.nstripeInfoCount(address());
        }

        @NativeType("VkRenderPassStripeInfoARM const *")
        public VkRenderPassStripeInfoARM.Buffer pStripeInfos() {
            return VkRenderPassStripeBeginInfoARM.npStripeInfos(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassStripeBeginInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassStripeBeginInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pStripeInfos(@NativeType("VkRenderPassStripeInfoARM const *") VkRenderPassStripeInfoARM.Buffer value) {
            VkRenderPassStripeBeginInfoARM.npStripeInfos(address(), value);
            return this;
        }
    }
}
