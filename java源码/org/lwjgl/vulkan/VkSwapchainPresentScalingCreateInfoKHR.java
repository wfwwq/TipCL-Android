package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentScalingCreateInfoKHR.class */
public class VkSwapchainPresentScalingCreateInfoKHR extends Struct<VkSwapchainPresentScalingCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SCALINGBEHAVIOR;
    public static final int PRESENTGRAVITYX;
    public static final int PRESENTGRAVITYY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCALINGBEHAVIOR = layout.offsetof(2);
        PRESENTGRAVITYX = layout.offsetof(3);
        PRESENTGRAVITYY = layout.offsetof(4);
    }

    protected VkSwapchainPresentScalingCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainPresentScalingCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkSwapchainPresentScalingCreateInfoKHR(address, container);
    }

    public VkSwapchainPresentScalingCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkPresentScalingFlagsKHR")
    public int scalingBehavior() {
        return nscalingBehavior(address());
    }

    @NativeType("VkPresentGravityFlagsKHR")
    public int presentGravityX() {
        return npresentGravityX(address());
    }

    @NativeType("VkPresentGravityFlagsKHR")
    public int presentGravityY() {
        return npresentGravityY(address());
    }

    public VkSwapchainPresentScalingCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainPresentScalingCreateInfoKHR sType$Default() {
        return sType(1000275004);
    }

    public VkSwapchainPresentScalingCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainPresentScalingCreateInfoKHR scalingBehavior(@NativeType("VkPresentScalingFlagsKHR") int value) {
        nscalingBehavior(address(), value);
        return this;
    }

    public VkSwapchainPresentScalingCreateInfoKHR presentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
        npresentGravityX(address(), value);
        return this;
    }

    public VkSwapchainPresentScalingCreateInfoKHR presentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
        npresentGravityY(address(), value);
        return this;
    }

    public VkSwapchainPresentScalingCreateInfoKHR set(int sType, long pNext, int scalingBehavior, int presentGravityX, int presentGravityY) {
        sType(sType);
        pNext(pNext);
        scalingBehavior(scalingBehavior);
        presentGravityX(presentGravityX);
        presentGravityY(presentGravityY);
        return this;
    }

    public VkSwapchainPresentScalingCreateInfoKHR set(VkSwapchainPresentScalingCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentScalingCreateInfoKHR malloc() {
        return new VkSwapchainPresentScalingCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentScalingCreateInfoKHR calloc() {
        return new VkSwapchainPresentScalingCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentScalingCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentScalingCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentScalingCreateInfoKHR create(long address) {
        return new VkSwapchainPresentScalingCreateInfoKHR(address, null);
    }

    public static VkSwapchainPresentScalingCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentScalingCreateInfoKHR(address, null);
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

    public static VkSwapchainPresentScalingCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentScalingCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nscalingBehavior(long struct) {
        return MemoryUtil.memGetInt(struct + SCALINGBEHAVIOR);
    }

    public static int npresentGravityX(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTGRAVITYX);
    }

    public static int npresentGravityY(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTGRAVITYY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nscalingBehavior(long struct, int value) {
        MemoryUtil.memPutInt(struct + SCALINGBEHAVIOR, value);
    }

    public static void npresentGravityX(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTGRAVITYX, value);
    }

    public static void npresentGravityY(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTGRAVITYY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentScalingCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainPresentScalingCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkSwapchainPresentScalingCreateInfoKHR ELEMENT_FACTORY = VkSwapchainPresentScalingCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainPresentScalingCreateInfoKHR.SIZEOF);
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
        public VkSwapchainPresentScalingCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainPresentScalingCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainPresentScalingCreateInfoKHR.npNext(address());
        }

        @NativeType("VkPresentScalingFlagsKHR")
        public int scalingBehavior() {
            return VkSwapchainPresentScalingCreateInfoKHR.nscalingBehavior(address());
        }

        @NativeType("VkPresentGravityFlagsKHR")
        public int presentGravityX() {
            return VkSwapchainPresentScalingCreateInfoKHR.npresentGravityX(address());
        }

        @NativeType("VkPresentGravityFlagsKHR")
        public int presentGravityY() {
            return VkSwapchainPresentScalingCreateInfoKHR.npresentGravityY(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentScalingCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000275004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentScalingCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer scalingBehavior(@NativeType("VkPresentScalingFlagsKHR") int value) {
            VkSwapchainPresentScalingCreateInfoKHR.nscalingBehavior(address(), value);
            return this;
        }

        public Buffer presentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSwapchainPresentScalingCreateInfoKHR.npresentGravityX(address(), value);
            return this;
        }

        public Buffer presentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSwapchainPresentScalingCreateInfoKHR.npresentGravityY(address(), value);
            return this;
        }
    }
}
