package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassStripeInfoARM.class */
public class VkRenderPassStripeInfoARM extends Struct<VkRenderPassStripeInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STRIPEAREA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STRIPEAREA = layout.offsetof(2);
    }

    protected VkRenderPassStripeInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassStripeInfoARM create(long address, ByteBuffer container) {
        return new VkRenderPassStripeInfoARM(address, container);
    }

    public VkRenderPassStripeInfoARM(ByteBuffer container) {
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

    public VkRect2D stripeArea() {
        return nstripeArea(address());
    }

    public VkRenderPassStripeInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassStripeInfoARM sType$Default() {
        return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM);
    }

    public VkRenderPassStripeInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassStripeInfoARM stripeArea(VkRect2D value) {
        nstripeArea(address(), value);
        return this;
    }

    public VkRenderPassStripeInfoARM stripeArea(Consumer<VkRect2D> consumer) {
        consumer.accept(stripeArea());
        return this;
    }

    public VkRenderPassStripeInfoARM set(int sType, long pNext, VkRect2D stripeArea) {
        sType(sType);
        pNext(pNext);
        stripeArea(stripeArea);
        return this;
    }

    public VkRenderPassStripeInfoARM set(VkRenderPassStripeInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassStripeInfoARM malloc() {
        return new VkRenderPassStripeInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassStripeInfoARM calloc() {
        return new VkRenderPassStripeInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassStripeInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassStripeInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassStripeInfoARM create(long address) {
        return new VkRenderPassStripeInfoARM(address, null);
    }

    public static VkRenderPassStripeInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassStripeInfoARM(address, null);
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

    public static VkRenderPassStripeInfoARM malloc(MemoryStack stack) {
        return new VkRenderPassStripeInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassStripeInfoARM calloc(MemoryStack stack) {
        return new VkRenderPassStripeInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkRect2D nstripeArea(long struct) {
        return VkRect2D.create(struct + STRIPEAREA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstripeArea(long struct, VkRect2D value) {
        MemoryUtil.memCopy(value.address(), struct + STRIPEAREA, VkRect2D.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassStripeInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassStripeInfoARM, Buffer> implements NativeResource {
        private static final VkRenderPassStripeInfoARM ELEMENT_FACTORY = VkRenderPassStripeInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassStripeInfoARM.SIZEOF);
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
        public VkRenderPassStripeInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassStripeInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassStripeInfoARM.npNext(address());
        }

        public VkRect2D stripeArea() {
            return VkRenderPassStripeInfoARM.nstripeArea(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassStripeInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassStripeInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer stripeArea(VkRect2D value) {
            VkRenderPassStripeInfoARM.nstripeArea(address(), value);
            return this;
        }

        public Buffer stripeArea(Consumer<VkRect2D> consumer) {
            consumer.accept(stripeArea());
            return this;
        }
    }
}
