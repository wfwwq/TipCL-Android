package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1SessionCreateInfoKHR.class */
public class VkVideoEncodeAV1SessionCreateInfoKHR extends Struct<VkVideoEncodeAV1SessionCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USEMAXLEVEL;
    public static final int MAXLEVEL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEMAXLEVEL = layout.offsetof(2);
        MAXLEVEL = layout.offsetof(3);
    }

    protected VkVideoEncodeAV1SessionCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1SessionCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1SessionCreateInfoKHR(address, container);
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean useMaxLevel() {
        return nuseMaxLevel(address()) != 0;
    }

    @NativeType("StdVideoAV1Level")
    public int maxLevel() {
        return nmaxLevel(address());
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR);
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR useMaxLevel(@NativeType("VkBool32") boolean value) {
        nuseMaxLevel(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR maxLevel(@NativeType("StdVideoAV1Level") int value) {
        nmaxLevel(address(), value);
        return this;
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR set(int sType, long pNext, boolean useMaxLevel, int maxLevel) {
        sType(sType);
        pNext(pNext);
        useMaxLevel(useMaxLevel);
        maxLevel(maxLevel);
        return this;
    }

    public VkVideoEncodeAV1SessionCreateInfoKHR set(VkVideoEncodeAV1SessionCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR malloc() {
        return new VkVideoEncodeAV1SessionCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR calloc() {
        return new VkVideoEncodeAV1SessionCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1SessionCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR create(long address) {
        return new VkVideoEncodeAV1SessionCreateInfoKHR(address, null);
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1SessionCreateInfoKHR(address, null);
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

    public static VkVideoEncodeAV1SessionCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1SessionCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1SessionCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nuseMaxLevel(long struct) {
        return MemoryUtil.memGetInt(struct + USEMAXLEVEL);
    }

    public static int nmaxLevel(long struct) {
        return MemoryUtil.memGetInt(struct + MAXLEVEL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseMaxLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMAXLEVEL, value);
    }

    public static void nmaxLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXLEVEL, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1SessionCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1SessionCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1SessionCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1SessionCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1SessionCreateInfoKHR.SIZEOF);
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
        public VkVideoEncodeAV1SessionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1SessionCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeAV1SessionCreateInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxLevel() {
            return VkVideoEncodeAV1SessionCreateInfoKHR.nuseMaxLevel(address()) != 0;
        }

        @NativeType("StdVideoAV1Level")
        public int maxLevel() {
            return VkVideoEncodeAV1SessionCreateInfoKHR.nmaxLevel(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1SessionCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeAV1SessionCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer useMaxLevel(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeAV1SessionCreateInfoKHR.nuseMaxLevel(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxLevel(@NativeType("StdVideoAV1Level") int value) {
            VkVideoEncodeAV1SessionCreateInfoKHR.nmaxLevel(address(), value);
            return this;
        }
    }
}
