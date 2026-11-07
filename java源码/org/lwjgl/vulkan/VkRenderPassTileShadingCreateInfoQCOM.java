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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassTileShadingCreateInfoQCOM.class */
public class VkRenderPassTileShadingCreateInfoQCOM extends Struct<VkRenderPassTileShadingCreateInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int TILEAPRONSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TILEAPRONSIZE = layout.offsetof(3);
    }

    protected VkRenderPassTileShadingCreateInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassTileShadingCreateInfoQCOM create(long address, ByteBuffer container) {
        return new VkRenderPassTileShadingCreateInfoQCOM(address, container);
    }

    public VkRenderPassTileShadingCreateInfoQCOM(ByteBuffer container) {
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

    @NativeType("VkTileShadingRenderPassFlagsQCOM")
    public int flags() {
        return nflags(address());
    }

    public VkExtent2D tileApronSize() {
        return ntileApronSize(address());
    }

    public VkRenderPassTileShadingCreateInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassTileShadingCreateInfoQCOM sType$Default() {
        return sType(QCOMTileShading.VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM);
    }

    public VkRenderPassTileShadingCreateInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassTileShadingCreateInfoQCOM flags(@NativeType("VkTileShadingRenderPassFlagsQCOM") int value) {
        nflags(address(), value);
        return this;
    }

    public VkRenderPassTileShadingCreateInfoQCOM tileApronSize(VkExtent2D value) {
        ntileApronSize(address(), value);
        return this;
    }

    public VkRenderPassTileShadingCreateInfoQCOM tileApronSize(Consumer<VkExtent2D> consumer) {
        consumer.accept(tileApronSize());
        return this;
    }

    public VkRenderPassTileShadingCreateInfoQCOM set(int sType, long pNext, int flags, VkExtent2D tileApronSize) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        tileApronSize(tileApronSize);
        return this;
    }

    public VkRenderPassTileShadingCreateInfoQCOM set(VkRenderPassTileShadingCreateInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassTileShadingCreateInfoQCOM malloc() {
        return new VkRenderPassTileShadingCreateInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassTileShadingCreateInfoQCOM calloc() {
        return new VkRenderPassTileShadingCreateInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassTileShadingCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassTileShadingCreateInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassTileShadingCreateInfoQCOM create(long address) {
        return new VkRenderPassTileShadingCreateInfoQCOM(address, null);
    }

    public static VkRenderPassTileShadingCreateInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassTileShadingCreateInfoQCOM(address, null);
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

    public static VkRenderPassTileShadingCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkRenderPassTileShadingCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassTileShadingCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkRenderPassTileShadingCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D ntileApronSize(long struct) {
        return VkExtent2D.create(struct + TILEAPRONSIZE);
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

    public static void ntileApronSize(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + TILEAPRONSIZE, VkExtent2D.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassTileShadingCreateInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassTileShadingCreateInfoQCOM, Buffer> implements NativeResource {
        private static final VkRenderPassTileShadingCreateInfoQCOM ELEMENT_FACTORY = VkRenderPassTileShadingCreateInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassTileShadingCreateInfoQCOM.SIZEOF);
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
        public VkRenderPassTileShadingCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassTileShadingCreateInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassTileShadingCreateInfoQCOM.npNext(address());
        }

        @NativeType("VkTileShadingRenderPassFlagsQCOM")
        public int flags() {
            return VkRenderPassTileShadingCreateInfoQCOM.nflags(address());
        }

        public VkExtent2D tileApronSize() {
            return VkRenderPassTileShadingCreateInfoQCOM.ntileApronSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassTileShadingCreateInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileShading.VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassTileShadingCreateInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkTileShadingRenderPassFlagsQCOM") int value) {
            VkRenderPassTileShadingCreateInfoQCOM.nflags(address(), value);
            return this;
        }

        public Buffer tileApronSize(VkExtent2D value) {
            VkRenderPassTileShadingCreateInfoQCOM.ntileApronSize(address(), value);
            return this;
        }

        public Buffer tileApronSize(Consumer<VkExtent2D> consumer) {
            consumer.accept(tileApronSize());
            return this;
        }
    }
}
