package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchTileInfoQCOM.class */
public class VkDispatchTileInfoQCOM extends Struct<VkDispatchTileInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkDispatchTileInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDispatchTileInfoQCOM create(long address, ByteBuffer container) {
        return new VkDispatchTileInfoQCOM(address, container);
    }

    public VkDispatchTileInfoQCOM(ByteBuffer container) {
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

    public VkDispatchTileInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDispatchTileInfoQCOM sType$Default() {
        return sType(QCOMTileShading.VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM);
    }

    public VkDispatchTileInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDispatchTileInfoQCOM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDispatchTileInfoQCOM set(VkDispatchTileInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDispatchTileInfoQCOM malloc() {
        return new VkDispatchTileInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDispatchTileInfoQCOM calloc() {
        return new VkDispatchTileInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDispatchTileInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchTileInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkDispatchTileInfoQCOM create(long address) {
        return new VkDispatchTileInfoQCOM(address, null);
    }

    public static VkDispatchTileInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDispatchTileInfoQCOM(address, null);
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

    public static VkDispatchTileInfoQCOM malloc(MemoryStack stack) {
        return new VkDispatchTileInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDispatchTileInfoQCOM calloc(MemoryStack stack) {
        return new VkDispatchTileInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchTileInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDispatchTileInfoQCOM, Buffer> implements NativeResource {
        private static final VkDispatchTileInfoQCOM ELEMENT_FACTORY = VkDispatchTileInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDispatchTileInfoQCOM.SIZEOF);
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
        public VkDispatchTileInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDispatchTileInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDispatchTileInfoQCOM.npNext(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDispatchTileInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileShading.VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDispatchTileInfoQCOM.npNext(address(), value);
            return this;
        }
    }
}
