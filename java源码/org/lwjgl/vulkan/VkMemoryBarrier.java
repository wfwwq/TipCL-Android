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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier.class */
public class VkMemoryBarrier extends Struct<VkMemoryBarrier> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCACCESSMASK;
    public static final int DSTACCESSMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
    }

    protected VkMemoryBarrier(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryBarrier create(long address, ByteBuffer container) {
        return new VkMemoryBarrier(address, container);
    }

    public VkMemoryBarrier(ByteBuffer container) {
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

    @NativeType("VkAccessFlags")
    public int srcAccessMask() {
        return nsrcAccessMask(address());
    }

    @NativeType("VkAccessFlags")
    public int dstAccessMask() {
        return ndstAccessMask(address());
    }

    public VkMemoryBarrier sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryBarrier sType$Default() {
        return sType(46);
    }

    public VkMemoryBarrier pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkMemoryBarrier set(int sType, long pNext, int srcAccessMask, int dstAccessMask) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        return this;
    }

    public VkMemoryBarrier set(VkMemoryBarrier src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryBarrier malloc() {
        return new VkMemoryBarrier(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryBarrier calloc() {
        return new VkMemoryBarrier(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryBarrier create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryBarrier(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryBarrier create(long address) {
        return new VkMemoryBarrier(address, null);
    }

    public static VkMemoryBarrier createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryBarrier(address, null);
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

    public static VkMemoryBarrier malloc(MemoryStack stack) {
        return new VkMemoryBarrier(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryBarrier calloc(MemoryStack stack) {
        return new VkMemoryBarrier(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsrcAccessMask(long struct) {
        return MemoryUtil.memGetInt(struct + SRCACCESSMASK);
    }

    public static int ndstAccessMask(long struct) {
        return MemoryUtil.memGetInt(struct + DSTACCESSMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCACCESSMASK, value);
    }

    public static void ndstAccessMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTACCESSMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryBarrier$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryBarrier, Buffer> implements NativeResource {
        private static final VkMemoryBarrier ELEMENT_FACTORY = VkMemoryBarrier.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryBarrier.SIZEOF);
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
        public VkMemoryBarrier getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryBarrier.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryBarrier.npNext(address());
        }

        @NativeType("VkAccessFlags")
        public int srcAccessMask() {
            return VkMemoryBarrier.nsrcAccessMask(address());
        }

        @NativeType("VkAccessFlags")
        public int dstAccessMask() {
            return VkMemoryBarrier.ndstAccessMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryBarrier.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(46);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryBarrier.npNext(address(), value);
            return this;
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) {
            VkMemoryBarrier.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) {
            VkMemoryBarrier.ndstAccessMask(address(), value);
            return this;
        }
    }
}
