package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerTileBeginInfoQCOM.class */
public class VkPerTileBeginInfoQCOM extends Struct<VkPerTileBeginInfoQCOM> implements NativeResource {
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

    protected VkPerTileBeginInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerTileBeginInfoQCOM create(long address, ByteBuffer container) {
        return new VkPerTileBeginInfoQCOM(address, container);
    }

    public VkPerTileBeginInfoQCOM(ByteBuffer container) {
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

    public VkPerTileBeginInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerTileBeginInfoQCOM sType$Default() {
        return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM);
    }

    public VkPerTileBeginInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerTileBeginInfoQCOM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPerTileBeginInfoQCOM set(VkPerTileBeginInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerTileBeginInfoQCOM malloc() {
        return new VkPerTileBeginInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerTileBeginInfoQCOM calloc() {
        return new VkPerTileBeginInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerTileBeginInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerTileBeginInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPerTileBeginInfoQCOM create(long address) {
        return new VkPerTileBeginInfoQCOM(address, null);
    }

    public static VkPerTileBeginInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerTileBeginInfoQCOM(address, null);
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

    public static VkPerTileBeginInfoQCOM malloc(MemoryStack stack) {
        return new VkPerTileBeginInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerTileBeginInfoQCOM calloc(MemoryStack stack) {
        return new VkPerTileBeginInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerTileBeginInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerTileBeginInfoQCOM, Buffer> implements NativeResource {
        private static final VkPerTileBeginInfoQCOM ELEMENT_FACTORY = VkPerTileBeginInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerTileBeginInfoQCOM.SIZEOF);
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
        public VkPerTileBeginInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerTileBeginInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPerTileBeginInfoQCOM.npNext(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerTileBeginInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPerTileBeginInfoQCOM.npNext(address(), value);
            return this;
        }
    }
}
