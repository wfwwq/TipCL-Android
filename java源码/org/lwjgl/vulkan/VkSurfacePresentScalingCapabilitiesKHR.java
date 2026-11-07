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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentScalingCapabilitiesKHR.class */
public class VkSurfacePresentScalingCapabilitiesKHR extends Struct<VkSurfacePresentScalingCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUPPORTEDPRESENTSCALING;
    public static final int SUPPORTEDPRESENTGRAVITYX;
    public static final int SUPPORTEDPRESENTGRAVITYY;
    public static final int MINSCALEDIMAGEEXTENT;
    public static final int MAXSCALEDIMAGEEXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDPRESENTSCALING = layout.offsetof(2);
        SUPPORTEDPRESENTGRAVITYX = layout.offsetof(3);
        SUPPORTEDPRESENTGRAVITYY = layout.offsetof(4);
        MINSCALEDIMAGEEXTENT = layout.offsetof(5);
        MAXSCALEDIMAGEEXTENT = layout.offsetof(6);
    }

    protected VkSurfacePresentScalingCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfacePresentScalingCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkSurfacePresentScalingCapabilitiesKHR(address, container);
    }

    public VkSurfacePresentScalingCapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("VkPresentScalingFlagsKHR")
    public int supportedPresentScaling() {
        return nsupportedPresentScaling(address());
    }

    @NativeType("VkPresentGravityFlagsKHR")
    public int supportedPresentGravityX() {
        return nsupportedPresentGravityX(address());
    }

    @NativeType("VkPresentGravityFlagsKHR")
    public int supportedPresentGravityY() {
        return nsupportedPresentGravityY(address());
    }

    public VkExtent2D minScaledImageExtent() {
        return nminScaledImageExtent(address());
    }

    public VkExtent2D maxScaledImageExtent() {
        return nmaxScaledImageExtent(address());
    }

    public VkSurfacePresentScalingCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR sType$Default() {
        return sType(1000274001);
    }

    public VkSurfacePresentScalingCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) {
        nsupportedPresentScaling(address(), value);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
        nsupportedPresentGravityX(address(), value);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
        nsupportedPresentGravityY(address(), value);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent(VkExtent2D value) {
        nminScaledImageExtent(address(), value);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(minScaledImageExtent());
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent(VkExtent2D value) {
        nmaxScaledImageExtent(address(), value);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(maxScaledImageExtent());
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR set(int sType, long pNext, int supportedPresentScaling, int supportedPresentGravityX, int supportedPresentGravityY, VkExtent2D minScaledImageExtent, VkExtent2D maxScaledImageExtent) {
        sType(sType);
        pNext(pNext);
        supportedPresentScaling(supportedPresentScaling);
        supportedPresentGravityX(supportedPresentGravityX);
        supportedPresentGravityY(supportedPresentGravityY);
        minScaledImageExtent(minScaledImageExtent);
        maxScaledImageExtent(maxScaledImageExtent);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesKHR set(VkSurfacePresentScalingCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfacePresentScalingCapabilitiesKHR malloc() {
        return new VkSurfacePresentScalingCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfacePresentScalingCapabilitiesKHR calloc() {
        return new VkSurfacePresentScalingCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfacePresentScalingCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentScalingCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfacePresentScalingCapabilitiesKHR create(long address) {
        return new VkSurfacePresentScalingCapabilitiesKHR(address, null);
    }

    public static VkSurfacePresentScalingCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfacePresentScalingCapabilitiesKHR(address, null);
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

    public static VkSurfacePresentScalingCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfacePresentScalingCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsupportedPresentScaling(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDPRESENTSCALING);
    }

    public static int nsupportedPresentGravityX(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDPRESENTGRAVITYX);
    }

    public static int nsupportedPresentGravityY(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDPRESENTGRAVITYY);
    }

    public static VkExtent2D nminScaledImageExtent(long struct) {
        return VkExtent2D.create(struct + MINSCALEDIMAGEEXTENT);
    }

    public static VkExtent2D nmaxScaledImageExtent(long struct) {
        return VkExtent2D.create(struct + MAXSCALEDIMAGEEXTENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsupportedPresentScaling(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUPPORTEDPRESENTSCALING, value);
    }

    public static void nsupportedPresentGravityX(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUPPORTEDPRESENTGRAVITYX, value);
    }

    public static void nsupportedPresentGravityY(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUPPORTEDPRESENTGRAVITYY, value);
    }

    public static void nminScaledImageExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + MINSCALEDIMAGEEXTENT, VkExtent2D.SIZEOF);
    }

    public static void nmaxScaledImageExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + MAXSCALEDIMAGEEXTENT, VkExtent2D.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentScalingCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfacePresentScalingCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkSurfacePresentScalingCapabilitiesKHR ELEMENT_FACTORY = VkSurfacePresentScalingCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfacePresentScalingCapabilitiesKHR.SIZEOF);
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
        public VkSurfacePresentScalingCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSurfacePresentScalingCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSurfacePresentScalingCapabilitiesKHR.npNext(address());
        }

        @NativeType("VkPresentScalingFlagsKHR")
        public int supportedPresentScaling() {
            return VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentScaling(address());
        }

        @NativeType("VkPresentGravityFlagsKHR")
        public int supportedPresentGravityX() {
            return VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityX(address());
        }

        @NativeType("VkPresentGravityFlagsKHR")
        public int supportedPresentGravityY() {
            return VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityY(address());
        }

        public VkExtent2D minScaledImageExtent() {
            return VkSurfacePresentScalingCapabilitiesKHR.nminScaledImageExtent(address());
        }

        public VkExtent2D maxScaledImageExtent() {
            return VkSurfacePresentScalingCapabilitiesKHR.nmaxScaledImageExtent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfacePresentScalingCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000274001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfacePresentScalingCapabilitiesKHR.npNext(address(), value);
            return this;
        }

        public Buffer supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) {
            VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentScaling(address(), value);
            return this;
        }

        public Buffer supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityX(address(), value);
            return this;
        }

        public Buffer supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSurfacePresentScalingCapabilitiesKHR.nsupportedPresentGravityY(address(), value);
            return this;
        }

        public Buffer minScaledImageExtent(VkExtent2D value) {
            VkSurfacePresentScalingCapabilitiesKHR.nminScaledImageExtent(address(), value);
            return this;
        }

        public Buffer minScaledImageExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(minScaledImageExtent());
            return this;
        }

        public Buffer maxScaledImageExtent(VkExtent2D value) {
            VkSurfacePresentScalingCapabilitiesKHR.nmaxScaledImageExtent(address(), value);
            return this;
        }

        public Buffer maxScaledImageExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(maxScaledImageExtent());
            return this;
        }
    }
}
