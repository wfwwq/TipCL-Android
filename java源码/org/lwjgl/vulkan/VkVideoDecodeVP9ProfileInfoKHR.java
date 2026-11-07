package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeVP9ProfileInfoKHR.class */
public class VkVideoDecodeVP9ProfileInfoKHR extends Struct<VkVideoDecodeVP9ProfileInfoKHR> implements NativeResource {
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

    protected VkVideoDecodeVP9ProfileInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeVP9ProfileInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeVP9ProfileInfoKHR(address, container);
    }

    public VkVideoDecodeVP9ProfileInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoVP9Profile")
    public int stdProfile() {
        return nstdProfile(address());
    }

    public VkVideoDecodeVP9ProfileInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeVP9ProfileInfoKHR sType$Default() {
        return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PROFILE_INFO_KHR);
    }

    public VkVideoDecodeVP9ProfileInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeVP9ProfileInfoKHR stdProfile(@NativeType("StdVideoVP9Profile") int value) {
        nstdProfile(address(), value);
        return this;
    }

    public VkVideoDecodeVP9ProfileInfoKHR set(int sType, long pNext, int stdProfile) {
        sType(sType);
        pNext(pNext);
        stdProfile(stdProfile);
        return this;
    }

    public VkVideoDecodeVP9ProfileInfoKHR set(VkVideoDecodeVP9ProfileInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeVP9ProfileInfoKHR malloc() {
        return new VkVideoDecodeVP9ProfileInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeVP9ProfileInfoKHR calloc() {
        return new VkVideoDecodeVP9ProfileInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeVP9ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeVP9ProfileInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeVP9ProfileInfoKHR create(long address) {
        return new VkVideoDecodeVP9ProfileInfoKHR(address, null);
    }

    public static VkVideoDecodeVP9ProfileInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeVP9ProfileInfoKHR(address, null);
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

    public static VkVideoDecodeVP9ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeVP9ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeVP9ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeVP9ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeVP9ProfileInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeVP9ProfileInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeVP9ProfileInfoKHR ELEMENT_FACTORY = VkVideoDecodeVP9ProfileInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeVP9ProfileInfoKHR.SIZEOF);
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
        public VkVideoDecodeVP9ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeVP9ProfileInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeVP9ProfileInfoKHR.npNext(address());
        }

        @NativeType("StdVideoVP9Profile")
        public int stdProfile() {
            return VkVideoDecodeVP9ProfileInfoKHR.nstdProfile(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeVP9ProfileInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_VIDEO_DECODE_VP9_PROFILE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeVP9ProfileInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdProfile(@NativeType("StdVideoVP9Profile") int value) {
            VkVideoDecodeVP9ProfileInfoKHR.nstdProfile(address(), value);
            return this;
        }
    }
}
