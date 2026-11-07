package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1ProfileInfoKHR.class */
public class VkVideoEncodeAV1ProfileInfoKHR extends Struct<VkVideoEncodeAV1ProfileInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STDPROFILE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILE = layout.offsetof(2);
    }

    protected VkVideoEncodeAV1ProfileInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1ProfileInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1ProfileInfoKHR(address, container);
    }

    public VkVideoEncodeAV1ProfileInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoAV1Profile")
    public int stdProfile() {
        return nstdProfile(address());
    }

    public VkVideoEncodeAV1ProfileInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1ProfileInfoKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR);
    }

    public VkVideoEncodeAV1ProfileInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1ProfileInfoKHR stdProfile(@NativeType("StdVideoAV1Profile") int value) {
        nstdProfile(address(), value);
        return this;
    }

    public VkVideoEncodeAV1ProfileInfoKHR set(int sType, long pNext, int stdProfile) {
        sType(sType);
        pNext(pNext);
        stdProfile(stdProfile);
        return this;
    }

    public VkVideoEncodeAV1ProfileInfoKHR set(VkVideoEncodeAV1ProfileInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1ProfileInfoKHR malloc() {
        return new VkVideoEncodeAV1ProfileInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1ProfileInfoKHR calloc() {
        return new VkVideoEncodeAV1ProfileInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1ProfileInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1ProfileInfoKHR create(long address) {
        return new VkVideoEncodeAV1ProfileInfoKHR(address, null);
    }

    public static VkVideoEncodeAV1ProfileInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1ProfileInfoKHR(address, null);
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

    public static VkVideoEncodeAV1ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstdProfile(long struct) {
        return MemoryUtil.memGetInt(struct + STDPROFILE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstdProfile(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPROFILE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1ProfileInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1ProfileInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1ProfileInfoKHR ELEMENT_FACTORY = VkVideoEncodeAV1ProfileInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1ProfileInfoKHR.SIZEOF);
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
        public VkVideoEncodeAV1ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1ProfileInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeAV1ProfileInfoKHR.npNext(address());
        }

        @NativeType("StdVideoAV1Profile")
        public int stdProfile() {
            return VkVideoEncodeAV1ProfileInfoKHR.nstdProfile(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1ProfileInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeAV1ProfileInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdProfile(@NativeType("StdVideoAV1Profile") int value) {
            VkVideoEncodeAV1ProfileInfoKHR.nstdProfile(address(), value);
            return this;
        }
    }
}
