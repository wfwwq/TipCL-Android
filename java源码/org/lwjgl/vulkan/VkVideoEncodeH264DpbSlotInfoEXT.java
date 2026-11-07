package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoEncodeH264ReferenceInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264DpbSlotInfoEXT.class */
public class VkVideoEncodeH264DpbSlotInfoEXT extends Struct<VkVideoEncodeH264DpbSlotInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDREFERENCEINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDREFERENCEINFO = layout.offsetof(2);
    }

    protected VkVideoEncodeH264DpbSlotInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264DpbSlotInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(address, container);
    }

    public VkVideoEncodeH264DpbSlotInfoEXT(ByteBuffer container) {
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

    @NativeType("StdVideoEncodeH264ReferenceInfo const *")
    public StdVideoEncodeH264ReferenceInfo pStdReferenceInfo() {
        return npStdReferenceInfo(address());
    }

    public VkVideoEncodeH264DpbSlotInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264DpbSlotInfoEXT sType$Default() {
        return sType(1000038004);
    }

    public VkVideoEncodeH264DpbSlotInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264DpbSlotInfoEXT pStdReferenceInfo(@NativeType("StdVideoEncodeH264ReferenceInfo const *") StdVideoEncodeH264ReferenceInfo value) {
        npStdReferenceInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH264DpbSlotInfoEXT set(int sType, long pNext, StdVideoEncodeH264ReferenceInfo pStdReferenceInfo) {
        sType(sType);
        pNext(pNext);
        pStdReferenceInfo(pStdReferenceInfo);
        return this;
    }

    public VkVideoEncodeH264DpbSlotInfoEXT set(VkVideoEncodeH264DpbSlotInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264DpbSlotInfoEXT malloc() {
        return new VkVideoEncodeH264DpbSlotInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264DpbSlotInfoEXT calloc() {
        return new VkVideoEncodeH264DpbSlotInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264DpbSlotInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264DpbSlotInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264DpbSlotInfoEXT create(long address) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264DpbSlotInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264DpbSlotInfoEXT(address, null);
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

    public static VkVideoEncodeH264DpbSlotInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264DpbSlotInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264DpbSlotInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoEncodeH264ReferenceInfo npStdReferenceInfo(long struct) {
        return StdVideoEncodeH264ReferenceInfo.create(MemoryUtil.memGetAddress(struct + PSTDREFERENCEINFO));
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdReferenceInfo(long struct, StdVideoEncodeH264ReferenceInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDREFERENCEINFO, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTDREFERENCEINFO));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264DpbSlotInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264DpbSlotInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264DpbSlotInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264DpbSlotInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264DpbSlotInfoEXT.SIZEOF);
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
        public VkVideoEncodeH264DpbSlotInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264DpbSlotInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264DpbSlotInfoEXT.npNext(address());
        }

        @NativeType("StdVideoEncodeH264ReferenceInfo const *")
        public StdVideoEncodeH264ReferenceInfo pStdReferenceInfo() {
            return VkVideoEncodeH264DpbSlotInfoEXT.npStdReferenceInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264DpbSlotInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264DpbSlotInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pStdReferenceInfo(@NativeType("StdVideoEncodeH264ReferenceInfo const *") StdVideoEncodeH264ReferenceInfo value) {
            VkVideoEncodeH264DpbSlotInfoEXT.npStdReferenceInfo(address(), value);
            return this;
        }
    }
}
