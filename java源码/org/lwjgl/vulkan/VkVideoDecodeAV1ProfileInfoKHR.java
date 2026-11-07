package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1ProfileInfoKHR.class */
public class VkVideoDecodeAV1ProfileInfoKHR extends Struct<VkVideoDecodeAV1ProfileInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STDPROFILE;
    public static final int FILMGRAINSUPPORT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILE = layout.offsetof(2);
        FILMGRAINSUPPORT = layout.offsetof(3);
    }

    protected VkVideoDecodeAV1ProfileInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeAV1ProfileInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeAV1ProfileInfoKHR(address, container);
    }

    public VkVideoDecodeAV1ProfileInfoKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean filmGrainSupport() {
        return nfilmGrainSupport(address()) != 0;
    }

    public VkVideoDecodeAV1ProfileInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeAV1ProfileInfoKHR sType$Default() {
        return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PROFILE_INFO_KHR);
    }

    public VkVideoDecodeAV1ProfileInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeAV1ProfileInfoKHR stdProfile(@NativeType("StdVideoAV1Profile") int value) {
        nstdProfile(address(), value);
        return this;
    }

    public VkVideoDecodeAV1ProfileInfoKHR filmGrainSupport(@NativeType("VkBool32") boolean value) {
        nfilmGrainSupport(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoDecodeAV1ProfileInfoKHR set(int sType, long pNext, int stdProfile, boolean filmGrainSupport) {
        sType(sType);
        pNext(pNext);
        stdProfile(stdProfile);
        filmGrainSupport(filmGrainSupport);
        return this;
    }

    public VkVideoDecodeAV1ProfileInfoKHR set(VkVideoDecodeAV1ProfileInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeAV1ProfileInfoKHR malloc() {
        return new VkVideoDecodeAV1ProfileInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeAV1ProfileInfoKHR calloc() {
        return new VkVideoDecodeAV1ProfileInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeAV1ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1ProfileInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeAV1ProfileInfoKHR create(long address) {
        return new VkVideoDecodeAV1ProfileInfoKHR(address, null);
    }

    public static VkVideoDecodeAV1ProfileInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeAV1ProfileInfoKHR(address, null);
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

    public static VkVideoDecodeAV1ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeAV1ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfilmGrainSupport(long struct) {
        return MemoryUtil.memGetInt(struct + FILMGRAINSUPPORT);
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

    public static void nfilmGrainSupport(long struct, int value) {
        MemoryUtil.memPutInt(struct + FILMGRAINSUPPORT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1ProfileInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1ProfileInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeAV1ProfileInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1ProfileInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeAV1ProfileInfoKHR.SIZEOF);
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
        public VkVideoDecodeAV1ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeAV1ProfileInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeAV1ProfileInfoKHR.npNext(address());
        }

        @NativeType("StdVideoAV1Profile")
        public int stdProfile() {
            return VkVideoDecodeAV1ProfileInfoKHR.nstdProfile(address());
        }

        @NativeType("VkBool32")
        public boolean filmGrainSupport() {
            return VkVideoDecodeAV1ProfileInfoKHR.nfilmGrainSupport(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeAV1ProfileInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PROFILE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeAV1ProfileInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdProfile(@NativeType("StdVideoAV1Profile") int value) {
            VkVideoDecodeAV1ProfileInfoKHR.nstdProfile(address(), value);
            return this;
        }

        public Buffer filmGrainSupport(@NativeType("VkBool32") boolean value) {
            VkVideoDecodeAV1ProfileInfoKHR.nfilmGrainSupport(address(), value ? 1 : 0);
            return this;
        }
    }
}
