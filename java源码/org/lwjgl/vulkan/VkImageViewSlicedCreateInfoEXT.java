package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSlicedCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSlicedCreateInfoEXT.class */
public class VkImageViewSlicedCreateInfoEXT extends Struct<VkImageViewSlicedCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SLICEOFFSET;
    public static final int SLICECOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SLICEOFFSET = layout.offsetof(2);
        SLICECOUNT = layout.offsetof(3);
    }

    protected VkImageViewSlicedCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageViewSlicedCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkImageViewSlicedCreateInfoEXT(address, container);
    }

    public VkImageViewSlicedCreateInfoEXT(ByteBuffer container) {
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
    public int sliceOffset() {
        return nsliceOffset(address());
    }

    @NativeType("uint32_t")
    public int sliceCount() {
        return nsliceCount(address());
    }

    public VkImageViewSlicedCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageViewSlicedCreateInfoEXT sType$Default() {
        return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT);
    }

    public VkImageViewSlicedCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageViewSlicedCreateInfoEXT sliceOffset(@NativeType("uint32_t") int value) {
        nsliceOffset(address(), value);
        return this;
    }

    public VkImageViewSlicedCreateInfoEXT sliceCount(@NativeType("uint32_t") int value) {
        nsliceCount(address(), value);
        return this;
    }

    public VkImageViewSlicedCreateInfoEXT set(int sType, long pNext, int sliceOffset, int sliceCount) {
        sType(sType);
        pNext(pNext);
        sliceOffset(sliceOffset);
        sliceCount(sliceCount);
        return this;
    }

    public VkImageViewSlicedCreateInfoEXT set(VkImageViewSlicedCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageViewSlicedCreateInfoEXT malloc() {
        return new VkImageViewSlicedCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageViewSlicedCreateInfoEXT calloc() {
        return new VkImageViewSlicedCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageViewSlicedCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewSlicedCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageViewSlicedCreateInfoEXT create(long address) {
        return new VkImageViewSlicedCreateInfoEXT(address, null);
    }

    public static VkImageViewSlicedCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageViewSlicedCreateInfoEXT(address, null);
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

    public static VkImageViewSlicedCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageViewSlicedCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageViewSlicedCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageViewSlicedCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsliceOffset(long struct) {
        return MemoryUtil.memGetInt(struct + SLICEOFFSET);
    }

    public static int nsliceCount(long struct) {
        return MemoryUtil.memGetInt(struct + SLICECOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsliceOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLICEOFFSET, value);
    }

    public static void nsliceCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SLICECOUNT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSlicedCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageViewSlicedCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageViewSlicedCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkImageViewSlicedCreateInfoEXT ELEMENT_FACTORY = VkImageViewSlicedCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageViewSlicedCreateInfoEXT.SIZEOF);
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
        public VkImageViewSlicedCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageViewSlicedCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageViewSlicedCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int sliceOffset() {
            return VkImageViewSlicedCreateInfoEXT.nsliceOffset(address());
        }

        @NativeType("uint32_t")
        public int sliceCount() {
            return VkImageViewSlicedCreateInfoEXT.nsliceCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageViewSlicedCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageViewSlicedCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer sliceOffset(@NativeType("uint32_t") int value) {
            VkImageViewSlicedCreateInfoEXT.nsliceOffset(address(), value);
            return this;
        }

        public Buffer sliceCount(@NativeType("uint32_t") int value) {
            VkImageViewSlicedCreateInfoEXT.nsliceCount(address(), value);
            return this;
        }
    }
}
