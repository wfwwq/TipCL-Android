package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionCreateInfoEXT.class */
public class VkVideoEncodeH264SessionCreateInfoEXT extends Struct<VkVideoEncodeH264SessionCreateInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH264SessionCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264SessionCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionCreateInfoEXT(address, container);
    }

    public VkVideoEncodeH264SessionCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("StdVideoH264LevelIdc")
    public int maxLevelIdc() {
        return nmaxLevelIdc(address());
    }

    public VkVideoEncodeH264SessionCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionCreateInfoEXT sType$Default() {
        return sType(1000038010);
    }

    public VkVideoEncodeH264SessionCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionCreateInfoEXT useMaxLevelIdc(@NativeType("VkBool32") boolean value) {
        nuseMaxLevelIdc(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264SessionCreateInfoEXT maxLevelIdc(@NativeType("StdVideoH264LevelIdc") int value) {
        nmaxLevelIdc(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionCreateInfoEXT set(int sType, long pNext, boolean useMaxLevelIdc, int maxLevelIdc) {
        sType(sType);
        pNext(pNext);
        useMaxLevelIdc(useMaxLevelIdc);
        maxLevelIdc(maxLevelIdc);
        return this;
    }

    public VkVideoEncodeH264SessionCreateInfoEXT set(VkVideoEncodeH264SessionCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264SessionCreateInfoEXT malloc() {
        return new VkVideoEncodeH264SessionCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionCreateInfoEXT calloc() {
        return new VkVideoEncodeH264SessionCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264SessionCreateInfoEXT create(long address) {
        return new VkVideoEncodeH264SessionCreateInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264SessionCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264SessionCreateInfoEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH264SessionCreateInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionCreateInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nuseMaxLevelIdc(long struct) {
        return UNSAFE.getInt((Object) null, struct + USEMAXLEVELIDC);
    }

    public static int nmaxLevelIdc(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXLEVELIDC);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseMaxLevelIdc(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + USEMAXLEVELIDC, value);
    }

    public static void nmaxLevelIdc(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + MAXLEVELIDC, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264SessionCreateInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264SessionCreateInfoEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH264SessionCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264SessionCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264SessionCreateInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useMaxLevelIdc() {
            return VkVideoEncodeH264SessionCreateInfoEXT.nuseMaxLevelIdc(address()) != 0;
        }

        @NativeType("StdVideoH264LevelIdc")
        public int maxLevelIdc() {
            return VkVideoEncodeH264SessionCreateInfoEXT.nmaxLevelIdc(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264SessionCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038010);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264SessionCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer useMaxLevelIdc(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264SessionCreateInfoEXT.nuseMaxLevelIdc(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxLevelIdc(@NativeType("StdVideoH264LevelIdc") int value) {
            VkVideoEncodeH264SessionCreateInfoEXT.nmaxLevelIdc(address(), value);
            return this;
        }
    }
}
