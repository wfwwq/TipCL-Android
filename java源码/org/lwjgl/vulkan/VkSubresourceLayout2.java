package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout2.class */
public class VkSubresourceLayout2 extends Struct<VkSubresourceLayout2> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUBRESOURCELAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkSubresourceLayout.SIZEOF, VkSubresourceLayout.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBRESOURCELAYOUT = layout.offsetof(2);
    }

    protected VkSubresourceLayout2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubresourceLayout2 create(long address, ByteBuffer container) {
        return new VkSubresourceLayout2(address, container);
    }

    public VkSubresourceLayout2(ByteBuffer container) {
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

    public VkSubresourceLayout subresourceLayout() {
        return nsubresourceLayout(address());
    }

    public VkSubresourceLayout2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubresourceLayout2 sType$Default() {
        return sType(1000338002);
    }

    public VkSubresourceLayout2 pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubresourceLayout2 pNext(VkImageCompressionPropertiesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubresourceLayout2 pNext(VkSubresourceHostMemcpySize value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubresourceLayout2 pNext(VkSubresourceHostMemcpySizeEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubresourceLayout2 set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSubresourceLayout2 set(VkSubresourceLayout2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubresourceLayout2 malloc() {
        return new VkSubresourceLayout2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubresourceLayout2 calloc() {
        return new VkSubresourceLayout2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubresourceLayout2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout2(MemoryUtil.memAddress(container), container);
    }

    public static VkSubresourceLayout2 create(long address) {
        return new VkSubresourceLayout2(address, null);
    }

    public static VkSubresourceLayout2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubresourceLayout2(address, null);
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

    public static VkSubresourceLayout2 malloc(MemoryStack stack) {
        return new VkSubresourceLayout2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubresourceLayout2 calloc(MemoryStack stack) {
        return new VkSubresourceLayout2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkSubresourceLayout nsubresourceLayout(long struct) {
        return VkSubresourceLayout.create(struct + SUBRESOURCELAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout2$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubresourceLayout2, Buffer> implements NativeResource {
        private static final VkSubresourceLayout2 ELEMENT_FACTORY = VkSubresourceLayout2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubresourceLayout2.SIZEOF);
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
        public VkSubresourceLayout2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubresourceLayout2.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSubresourceLayout2.npNext(address());
        }

        public VkSubresourceLayout subresourceLayout() {
            return VkSubresourceLayout2.nsubresourceLayout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubresourceLayout2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000338002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSubresourceLayout2.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkImageCompressionPropertiesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubresourceHostMemcpySize value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubresourceHostMemcpySizeEXT value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
