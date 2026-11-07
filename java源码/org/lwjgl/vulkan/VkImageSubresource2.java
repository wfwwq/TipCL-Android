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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource2.class */
public class VkImageSubresource2 extends Struct<VkImageSubresource2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGESUBRESOURCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkImageSubresource.SIZEOF, VkImageSubresource.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGESUBRESOURCE = layout.offsetof(2);
    }

    protected VkImageSubresource2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageSubresource2 create(long address, ByteBuffer container) {
        return new VkImageSubresource2(address, container);
    }

    public VkImageSubresource2(ByteBuffer container) {
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

    public VkImageSubresource imageSubresource() {
        return nimageSubresource(address());
    }

    public VkImageSubresource2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageSubresource2 sType$Default() {
        return sType(1000338003);
    }

    public VkImageSubresource2 pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageSubresource2 imageSubresource(VkImageSubresource value) {
        nimageSubresource(address(), value);
        return this;
    }

    public VkImageSubresource2 imageSubresource(Consumer<VkImageSubresource> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    public VkImageSubresource2 set(int sType, long pNext, VkImageSubresource imageSubresource) {
        sType(sType);
        pNext(pNext);
        imageSubresource(imageSubresource);
        return this;
    }

    public VkImageSubresource2 set(VkImageSubresource2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageSubresource2 malloc() {
        return new VkImageSubresource2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageSubresource2 calloc() {
        return new VkImageSubresource2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageSubresource2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresource2(MemoryUtil.memAddress(container), container);
    }

    public static VkImageSubresource2 create(long address) {
        return new VkImageSubresource2(address, null);
    }

    public static VkImageSubresource2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageSubresource2(address, null);
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

    public static VkImageSubresource2 malloc(MemoryStack stack) {
        return new VkImageSubresource2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageSubresource2 calloc(MemoryStack stack) {
        return new VkImageSubresource2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkImageSubresource nimageSubresource(long struct) {
        return VkImageSubresource.create(struct + IMAGESUBRESOURCE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageSubresource(long struct, VkImageSubresource value) {
        MemoryUtil.memCopy(value.address(), struct + IMAGESUBRESOURCE, VkImageSubresource.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource2$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageSubresource2, Buffer> implements NativeResource {
        private static final VkImageSubresource2 ELEMENT_FACTORY = VkImageSubresource2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageSubresource2.SIZEOF);
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
        public VkImageSubresource2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageSubresource2.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkImageSubresource2.npNext(address());
        }

        public VkImageSubresource imageSubresource() {
            return VkImageSubresource2.nimageSubresource(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageSubresource2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000338003);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkImageSubresource2.npNext(address(), value);
            return this;
        }

        public Buffer imageSubresource(VkImageSubresource value) {
            VkImageSubresource2.nimageSubresource(address(), value);
            return this;
        }

        public Buffer imageSubresource(Consumer<VkImageSubresource> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }
    }
}
