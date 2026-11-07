package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionCreateInfoKHR.class */
public class VkVideoEncodeH265SessionCreateInfoKHR extends Struct<VkVideoEncodeH265SessionCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USEMAXLEVELIDC;
    public static final int MAXLEVELIDC;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEMAXLEVELIDC = layout.offsetof(2);
        MAXLEVELIDC = layout.offsetof(3);
    }

    protected VkVideoEncodeH265SessionCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265SessionCreateInfoKHR(address, container);
    }

    public VkVideoEncodeH265SessionCreateInfoKHR(ByteBuffer container) {
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
    public boolean useMaxLevelIdc() {
        return nuseMaxLevelIdc(address()) != 0;
    }

    @NativeType("StdVideoH265LevelIdc")
    public int maxLevelIdc() {
        return nmaxLevelIdc(address());
    }

    public VkVideoEncodeH265SessionCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionCreateInfoKHR sType$Default() {
        return sType(1000039011);
    }

    public VkVideoEncodeH265SessionCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionCreateInfoKHR useMaxLevelIdc(@NativeType("VkBool32") boolean value) {
        nuseMaxLevelIdc(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265SessionCreateInfoKHR maxLevelIdc(@NativeType("StdVideoH265LevelIdc") int value) {
        nmaxLevelIdc(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionCreateInfoKHR set(int sType, long pNext, boolean useMaxLevelIdc, int maxLevelIdc) {
        sType(sType);
        pNext(pNext);
        useMaxLevelIdc(useMaxLevelIdc);
        maxLevelIdc(maxLevelIdc);
        return this;
    }

    public VkVideoEncodeH265SessionCreateInfoKHR set(VkVideoEncodeH265SessionCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR malloc() {
        return new VkVideoEncodeH265SessionCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR calloc() {
        return new VkVideoEncodeH265SessionCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionCreateInfoKHR(address, null);
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionCreateInfoKHR(address, null);
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

    public static VkVideoEncodeH265SessionCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nuseMaxLevelIdc(long struct) {
        return MemoryUtil.memGetInt(struct + USEMAXLEVELIDC);
    }

    public static int nmaxLevelIdc(long struct) {
        return MemoryUtil.memGetInt(struct + MAXLEVELIDC);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseMaxLevelIdc(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEMAXLEVELIDC, value);
    }

    public static void nmaxLevelIdc(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXLEVELIDC, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionCreateInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265SessionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265SessionCreateInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxLevelIdc() {
            return VkVideoEncodeH265SessionCreateInfoKHR.nuseMaxLevelIdc(address()) != 0;
        }

        @NativeType("StdVideoH265LevelIdc")
        public int maxLevelIdc() {
            return VkVideoEncodeH265SessionCreateInfoKHR.nmaxLevelIdc(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039011);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265SessionCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer useMaxLevelIdc(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265SessionCreateInfoKHR.nuseMaxLevelIdc(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxLevelIdc(@NativeType("StdVideoH265LevelIdc") int value) {
            VkVideoEncodeH265SessionCreateInfoKHR.nmaxLevelIdc(address(), value);
            return this;
        }
    }
}
