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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfo.class */
public class VkHostImageLayoutTransitionInfo extends Struct<VkHostImageLayoutTransitionInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE;
    public static final int OLDLAYOUT;
    public static final int NEWLAYOUT;
    public static final int SUBRESOURCERANGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        OLDLAYOUT = layout.offsetof(3);
        NEWLAYOUT = layout.offsetof(4);
        SUBRESOURCERANGE = layout.offsetof(5);
    }

    protected VkHostImageLayoutTransitionInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkHostImageLayoutTransitionInfo create(long address, ByteBuffer container) {
        return new VkHostImageLayoutTransitionInfo(address, container);
    }

    public VkHostImageLayoutTransitionInfo(ByteBuffer container) {
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

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    @NativeType("VkImageLayout")
    public int oldLayout() {
        return noldLayout(address());
    }

    @NativeType("VkImageLayout")
    public int newLayout() {
        return nnewLayout(address());
    }

    public VkImageSubresourceRange subresourceRange() {
        return nsubresourceRange(address());
    }

    public VkHostImageLayoutTransitionInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkHostImageLayoutTransitionInfo sType$Default() {
        return sType(1000270006);
    }

    public VkHostImageLayoutTransitionInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkHostImageLayoutTransitionInfo image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkHostImageLayoutTransitionInfo oldLayout(@NativeType("VkImageLayout") int value) {
        noldLayout(address(), value);
        return this;
    }

    public VkHostImageLayoutTransitionInfo newLayout(@NativeType("VkImageLayout") int value) {
        nnewLayout(address(), value);
        return this;
    }

    public VkHostImageLayoutTransitionInfo subresourceRange(VkImageSubresourceRange value) {
        nsubresourceRange(address(), value);
        return this;
    }

    public VkHostImageLayoutTransitionInfo subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
        consumer.accept(subresourceRange());
        return this;
    }

    public VkHostImageLayoutTransitionInfo set(int sType, long pNext, long image, int oldLayout, int newLayout, VkImageSubresourceRange subresourceRange) {
        sType(sType);
        pNext(pNext);
        image(image);
        oldLayout(oldLayout);
        newLayout(newLayout);
        subresourceRange(subresourceRange);
        return this;
    }

    public VkHostImageLayoutTransitionInfo set(VkHostImageLayoutTransitionInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkHostImageLayoutTransitionInfo malloc() {
        return new VkHostImageLayoutTransitionInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkHostImageLayoutTransitionInfo calloc() {
        return new VkHostImageLayoutTransitionInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkHostImageLayoutTransitionInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageLayoutTransitionInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkHostImageLayoutTransitionInfo create(long address) {
        return new VkHostImageLayoutTransitionInfo(address, null);
    }

    public static VkHostImageLayoutTransitionInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkHostImageLayoutTransitionInfo(address, null);
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

    public static VkHostImageLayoutTransitionInfo malloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkHostImageLayoutTransitionInfo calloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
    }

    public static int noldLayout(long struct) {
        return MemoryUtil.memGetInt(struct + OLDLAYOUT);
    }

    public static int nnewLayout(long struct) {
        return MemoryUtil.memGetInt(struct + NEWLAYOUT);
    }

    public static VkImageSubresourceRange nsubresourceRange(long struct) {
        return VkImageSubresourceRange.create(struct + SUBRESOURCERANGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    public static void noldLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + OLDLAYOUT, value);
    }

    public static void nnewLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + NEWLAYOUT, value);
    }

    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) {
        MemoryUtil.memCopy(value.address(), struct + SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkHostImageLayoutTransitionInfo, Buffer> implements NativeResource {
        private static final VkHostImageLayoutTransitionInfo ELEMENT_FACTORY = VkHostImageLayoutTransitionInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkHostImageLayoutTransitionInfo.SIZEOF);
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
        public VkHostImageLayoutTransitionInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkHostImageLayoutTransitionInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkHostImageLayoutTransitionInfo.npNext(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkHostImageLayoutTransitionInfo.nimage(address());
        }

        @NativeType("VkImageLayout")
        public int oldLayout() {
            return VkHostImageLayoutTransitionInfo.noldLayout(address());
        }

        @NativeType("VkImageLayout")
        public int newLayout() {
            return VkHostImageLayoutTransitionInfo.nnewLayout(address());
        }

        public VkImageSubresourceRange subresourceRange() {
            return VkHostImageLayoutTransitionInfo.nsubresourceRange(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkHostImageLayoutTransitionInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000270006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkHostImageLayoutTransitionInfo.npNext(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkHostImageLayoutTransitionInfo.nimage(address(), value);
            return this;
        }

        public Buffer oldLayout(@NativeType("VkImageLayout") int value) {
            VkHostImageLayoutTransitionInfo.noldLayout(address(), value);
            return this;
        }

        public Buffer newLayout(@NativeType("VkImageLayout") int value) {
            VkHostImageLayoutTransitionInfo.nnewLayout(address(), value);
            return this;
        }

        public Buffer subresourceRange(VkImageSubresourceRange value) {
            VkHostImageLayoutTransitionInfo.nsubresourceRange(address(), value);
            return this;
        }

        public Buffer subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
            consumer.accept(subresourceRange());
            return this;
        }
    }
}
