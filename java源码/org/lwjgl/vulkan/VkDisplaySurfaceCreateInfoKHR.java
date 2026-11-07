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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR.class */
public class VkDisplaySurfaceCreateInfoKHR extends Struct<VkDisplaySurfaceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DISPLAYMODE;
    public static final int PLANEINDEX;
    public static final int PLANESTACKINDEX;
    public static final int TRANSFORM;
    public static final int GLOBALALPHA;
    public static final int ALPHAMODE;
    public static final int IMAGEEXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISPLAYMODE = layout.offsetof(3);
        PLANEINDEX = layout.offsetof(4);
        PLANESTACKINDEX = layout.offsetof(5);
        TRANSFORM = layout.offsetof(6);
        GLOBALALPHA = layout.offsetof(7);
        ALPHAMODE = layout.offsetof(8);
        IMAGEEXTENT = layout.offsetof(9);
    }

    protected VkDisplaySurfaceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplaySurfaceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkDisplaySurfaceCreateInfoKHR(address, container);
    }

    public VkDisplaySurfaceCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkDisplaySurfaceCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDisplayModeKHR")
    public long displayMode() {
        return ndisplayMode(address());
    }

    @NativeType("uint32_t")
    public int planeIndex() {
        return nplaneIndex(address());
    }

    @NativeType("uint32_t")
    public int planeStackIndex() {
        return nplaneStackIndex(address());
    }

    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() {
        return ntransform(address());
    }

    public float globalAlpha() {
        return nglobalAlpha(address());
    }

    @NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
    public int alphaMode() {
        return nalphaMode(address());
    }

    public VkExtent2D imageExtent() {
        return nimageExtent(address());
    }

    public VkDisplaySurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR sType$Default() {
        return sType(1000002001);
    }

    public VkDisplaySurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR pNext(VkDisplaySurfaceStereoCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDisplaySurfaceCreateInfoKHR flags(@NativeType("VkDisplaySurfaceCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR displayMode(@NativeType("VkDisplayModeKHR") long value) {
        ndisplayMode(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR planeIndex(@NativeType("uint32_t") int value) {
        nplaneIndex(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR planeStackIndex(@NativeType("uint32_t") int value) {
        nplaneStackIndex(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
        ntransform(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR globalAlpha(float value) {
        nglobalAlpha(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR alphaMode(@NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int value) {
        nalphaMode(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR imageExtent(VkExtent2D value) {
        nimageExtent(address(), value);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR imageExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(imageExtent());
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR set(int sType, long pNext, int flags, long displayMode, int planeIndex, int planeStackIndex, int transform, float globalAlpha, int alphaMode, VkExtent2D imageExtent) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        displayMode(displayMode);
        planeIndex(planeIndex);
        planeStackIndex(planeStackIndex);
        transform(transform);
        globalAlpha(globalAlpha);
        alphaMode(alphaMode);
        imageExtent(imageExtent);
        return this;
    }

    public VkDisplaySurfaceCreateInfoKHR set(VkDisplaySurfaceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplaySurfaceCreateInfoKHR malloc() {
        return new VkDisplaySurfaceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplaySurfaceCreateInfoKHR calloc() {
        return new VkDisplaySurfaceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplaySurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplaySurfaceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplaySurfaceCreateInfoKHR create(long address) {
        return new VkDisplaySurfaceCreateInfoKHR(address, null);
    }

    public static VkDisplaySurfaceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplaySurfaceCreateInfoKHR(address, null);
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

    public static VkDisplaySurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDisplaySurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplaySurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDisplaySurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long ndisplayMode(long struct) {
        return MemoryUtil.memGetLong(struct + DISPLAYMODE);
    }

    public static int nplaneIndex(long struct) {
        return MemoryUtil.memGetInt(struct + PLANEINDEX);
    }

    public static int nplaneStackIndex(long struct) {
        return MemoryUtil.memGetInt(struct + PLANESTACKINDEX);
    }

    public static int ntransform(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORM);
    }

    public static float nglobalAlpha(long struct) {
        return MemoryUtil.memGetFloat(struct + GLOBALALPHA);
    }

    public static int nalphaMode(long struct) {
        return MemoryUtil.memGetInt(struct + ALPHAMODE);
    }

    public static VkExtent2D nimageExtent(long struct) {
        return VkExtent2D.create(struct + IMAGEEXTENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndisplayMode(long struct, long value) {
        MemoryUtil.memPutLong(struct + DISPLAYMODE, value);
    }

    public static void nplaneIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + PLANEINDEX, value);
    }

    public static void nplaneStackIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + PLANESTACKINDEX, value);
    }

    public static void ntransform(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRANSFORM, value);
    }

    public static void nglobalAlpha(long struct, float value) {
        MemoryUtil.memPutFloat(struct + GLOBALALPHA, value);
    }

    public static void nalphaMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + ALPHAMODE, value);
    }

    public static void nimageExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + IMAGEEXTENT, VkExtent2D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplaySurfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplaySurfaceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkDisplaySurfaceCreateInfoKHR ELEMENT_FACTORY = VkDisplaySurfaceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplaySurfaceCreateInfoKHR.SIZEOF);
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
        public VkDisplaySurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplaySurfaceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDisplaySurfaceCreateInfoKHR.npNext(address());
        }

        @NativeType("VkDisplaySurfaceCreateFlagsKHR")
        public int flags() {
            return VkDisplaySurfaceCreateInfoKHR.nflags(address());
        }

        @NativeType("VkDisplayModeKHR")
        public long displayMode() {
            return VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address());
        }

        @NativeType("uint32_t")
        public int planeIndex() {
            return VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address());
        }

        @NativeType("uint32_t")
        public int planeStackIndex() {
            return VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address());
        }

        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() {
            return VkDisplaySurfaceCreateInfoKHR.ntransform(address());
        }

        public float globalAlpha() {
            return VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address());
        }

        @NativeType("VkDisplayPlaneAlphaFlagBitsKHR")
        public int alphaMode() {
            return VkDisplaySurfaceCreateInfoKHR.nalphaMode(address());
        }

        public VkExtent2D imageExtent() {
            return VkDisplaySurfaceCreateInfoKHR.nimageExtent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplaySurfaceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000002001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDisplaySurfaceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDisplaySurfaceStereoCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkDisplaySurfaceCreateFlagsKHR") int value) {
            VkDisplaySurfaceCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer displayMode(@NativeType("VkDisplayModeKHR") long value) {
            VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address(), value);
            return this;
        }

        public Buffer planeIndex(@NativeType("uint32_t") int value) {
            VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address(), value);
            return this;
        }

        public Buffer planeStackIndex(@NativeType("uint32_t") int value) {
            VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address(), value);
            return this;
        }

        public Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
            VkDisplaySurfaceCreateInfoKHR.ntransform(address(), value);
            return this;
        }

        public Buffer globalAlpha(float value) {
            VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address(), value);
            return this;
        }

        public Buffer alphaMode(@NativeType("VkDisplayPlaneAlphaFlagBitsKHR") int value) {
            VkDisplaySurfaceCreateInfoKHR.nalphaMode(address(), value);
            return this;
        }

        public Buffer imageExtent(VkExtent2D value) {
            VkDisplaySurfaceCreateInfoKHR.nimageExtent(address(), value);
            return this;
        }

        public Buffer imageExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(imageExtent());
            return this;
        }
    }
}
