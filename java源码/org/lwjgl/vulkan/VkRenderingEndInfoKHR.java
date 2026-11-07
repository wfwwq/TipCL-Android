package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingEndInfoKHR.class */
public class VkRenderingEndInfoKHR extends Struct<VkRenderingEndInfoKHR> implements NativeResource {
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

    protected VkRenderingEndInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderingEndInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderingEndInfoKHR(address, container);
    }

    public VkRenderingEndInfoKHR(ByteBuffer container) {
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

    public VkRenderingEndInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderingEndInfoKHR sType$Default() {
        return sType(1000619003);
    }

    public VkRenderingEndInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderingEndInfoKHR pNext(VkRenderPassFragmentDensityMapOffsetEndInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingEndInfoKHR pNext(VkSubpassFragmentDensityMapOffsetEndInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkRenderingEndInfoKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkRenderingEndInfoKHR set(VkRenderingEndInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingEndInfoKHR malloc() {
        return new VkRenderingEndInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingEndInfoKHR calloc() {
        return new VkRenderingEndInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingEndInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingEndInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingEndInfoKHR create(long address) {
        return new VkRenderingEndInfoKHR(address, null);
    }

    public static VkRenderingEndInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingEndInfoKHR(address, null);
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

    public static VkRenderingEndInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingEndInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingEndInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingEndInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingEndInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderingEndInfoKHR, Buffer> implements NativeResource {
        private static final VkRenderingEndInfoKHR ELEMENT_FACTORY = VkRenderingEndInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderingEndInfoKHR.SIZEOF);
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
        public VkRenderingEndInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderingEndInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderingEndInfoKHR.npNext(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingEndInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000619003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingEndInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkRenderPassFragmentDensityMapOffsetEndInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubpassFragmentDensityMapOffsetEndInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
