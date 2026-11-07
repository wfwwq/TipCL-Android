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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265ProfileInfoEXT.class */
public class VkVideoEncodeH265ProfileInfoEXT extends Struct<VkVideoEncodeH265ProfileInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STDPROFILEIDC;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILEIDC = layout.offsetof(2);
    }

    protected VkVideoEncodeH265ProfileInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265ProfileInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265ProfileInfoEXT(address, container);
    }

    public VkVideoEncodeH265ProfileInfoEXT(ByteBuffer container) {
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

    @NativeType("StdVideoH265ProfileIdc")
    public int stdProfileIdc() {
        return nstdProfileIdc(address());
    }

    public VkVideoEncodeH265ProfileInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265ProfileInfoEXT sType$Default() {
        return sType(1000039007);
    }

    public VkVideoEncodeH265ProfileInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265ProfileInfoEXT stdProfileIdc(@NativeType("StdVideoH265ProfileIdc") int value) {
        nstdProfileIdc(address(), value);
        return this;
    }

    public VkVideoEncodeH265ProfileInfoEXT set(int sType, long pNext, int stdProfileIdc) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);
        return this;
    }

    public VkVideoEncodeH265ProfileInfoEXT set(VkVideoEncodeH265ProfileInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265ProfileInfoEXT malloc() {
        return new VkVideoEncodeH265ProfileInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265ProfileInfoEXT calloc() {
        return new VkVideoEncodeH265ProfileInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265ProfileInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265ProfileInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265ProfileInfoEXT create(long address) {
        return new VkVideoEncodeH265ProfileInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265ProfileInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265ProfileInfoEXT(address, null);
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

    public static VkVideoEncodeH265ProfileInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265ProfileInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265ProfileInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265ProfileInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstdProfileIdc(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDPROFILEIDC);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstdProfileIdc(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDPROFILEIDC, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265ProfileInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265ProfileInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265ProfileInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265ProfileInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265ProfileInfoEXT.SIZEOF);
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
        public VkVideoEncodeH265ProfileInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265ProfileInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265ProfileInfoEXT.npNext(address());
        }

        @NativeType("StdVideoH265ProfileIdc")
        public int stdProfileIdc() {
            return VkVideoEncodeH265ProfileInfoEXT.nstdProfileIdc(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265ProfileInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039007);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265ProfileInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer stdProfileIdc(@NativeType("StdVideoH265ProfileIdc") int value) {
            VkVideoEncodeH265ProfileInfoEXT.nstdProfileIdc(address(), value);
            return this;
        }
    }
}
