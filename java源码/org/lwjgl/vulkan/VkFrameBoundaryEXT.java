package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT.class */
public class VkFrameBoundaryEXT extends Struct<VkFrameBoundaryEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int FRAMEID;
    public static final int IMAGECOUNT;
    public static final int PIMAGES;
    public static final int BUFFERCOUNT;
    public static final int PBUFFERS;
    public static final int TAGNAME;
    public static final int TAGSIZE;
    public static final int PTAG;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        FRAMEID = layout.offsetof(3);
        IMAGECOUNT = layout.offsetof(4);
        PIMAGES = layout.offsetof(5);
        BUFFERCOUNT = layout.offsetof(6);
        PBUFFERS = layout.offsetof(7);
        TAGNAME = layout.offsetof(8);
        TAGSIZE = layout.offsetof(9);
        PTAG = layout.offsetof(10);
    }

    protected VkFrameBoundaryEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFrameBoundaryEXT create(long address, ByteBuffer container) {
        return new VkFrameBoundaryEXT(address, container);
    }

    public VkFrameBoundaryEXT(ByteBuffer container) {
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

    @NativeType("VkFrameBoundaryFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint64_t")
    public long frameID() {
        return nframeID(address());
    }

    @NativeType("uint32_t")
    public int imageCount() {
        return nimageCount(address());
    }

    @NativeType("VkImage const *")
    public LongBuffer pImages() {
        return npImages(address());
    }

    @NativeType("uint32_t")
    public int bufferCount() {
        return nbufferCount(address());
    }

    @NativeType("VkBuffer const *")
    public LongBuffer pBuffers() {
        return npBuffers(address());
    }

    @NativeType("uint64_t")
    public long tagName() {
        return ntagName(address());
    }

    @NativeType("size_t")
    public long tagSize() {
        return ntagSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pTag() {
        return npTag(address());
    }

    public VkFrameBoundaryEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT sType$Default() {
        return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT);
    }

    public VkFrameBoundaryEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT flags(@NativeType("VkFrameBoundaryFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT frameID(@NativeType("uint64_t") long value) {
        nframeID(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT imageCount(@NativeType("uint32_t") int value) {
        nimageCount(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT pImages(@NativeType("VkImage const *") LongBuffer value) {
        npImages(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT bufferCount(@NativeType("uint32_t") int value) {
        nbufferCount(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT pBuffers(@NativeType("VkBuffer const *") LongBuffer value) {
        npBuffers(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT tagName(@NativeType("uint64_t") long value) {
        ntagName(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT tagSize(@NativeType("size_t") long value) {
        ntagSize(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT pTag(@NativeType("void const *") ByteBuffer value) {
        npTag(address(), value);
        return this;
    }

    public VkFrameBoundaryEXT set(int sType, long pNext, int flags, long frameID, int imageCount, LongBuffer pImages, int bufferCount, LongBuffer pBuffers, long tagName, long tagSize, ByteBuffer pTag) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        frameID(frameID);
        imageCount(imageCount);
        pImages(pImages);
        bufferCount(bufferCount);
        pBuffers(pBuffers);
        tagName(tagName);
        tagSize(tagSize);
        pTag(pTag);
        return this;
    }

    public VkFrameBoundaryEXT set(VkFrameBoundaryEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFrameBoundaryEXT malloc() {
        return new VkFrameBoundaryEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFrameBoundaryEXT calloc() {
        return new VkFrameBoundaryEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFrameBoundaryEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFrameBoundaryEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkFrameBoundaryEXT create(long address) {
        return new VkFrameBoundaryEXT(address, null);
    }

    public static VkFrameBoundaryEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFrameBoundaryEXT(address, null);
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

    public static VkFrameBoundaryEXT malloc(MemoryStack stack) {
        return new VkFrameBoundaryEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFrameBoundaryEXT calloc(MemoryStack stack) {
        return new VkFrameBoundaryEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nframeID(long struct) {
        return MemoryUtil.memGetLong(struct + FRAMEID);
    }

    public static int nimageCount(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGECOUNT);
    }

    public static LongBuffer npImages(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PIMAGES), nimageCount(struct));
    }

    public static int nbufferCount(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERCOUNT);
    }

    public static LongBuffer npBuffers(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PBUFFERS), nbufferCount(struct));
    }

    public static long ntagName(long struct) {
        return MemoryUtil.memGetLong(struct + TAGNAME);
    }

    public static long ntagSize(long struct) {
        return MemoryUtil.memGetAddress(struct + TAGSIZE);
    }

    public static ByteBuffer npTag(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PTAG), (int) ntagSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nframeID(long struct, long value) {
        MemoryUtil.memPutLong(struct + FRAMEID, value);
    }

    public static void nimageCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGECOUNT, value);
    }

    public static void npImages(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nimageCount(struct, value.remaining());
        }
    }

    public static void nbufferCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERCOUNT, value);
    }

    public static void npBuffers(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PBUFFERS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nbufferCount(struct, value.remaining());
        }
    }

    public static void ntagName(long struct, long value) {
        MemoryUtil.memPutLong(struct + TAGNAME, value);
    }

    public static void ntagSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TAGSIZE, value);
    }

    public static void npTag(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PTAG, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ntagSize(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFrameBoundaryEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkFrameBoundaryEXT, Buffer> implements NativeResource {
        private static final VkFrameBoundaryEXT ELEMENT_FACTORY = VkFrameBoundaryEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFrameBoundaryEXT.SIZEOF);
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
        public VkFrameBoundaryEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFrameBoundaryEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkFrameBoundaryEXT.npNext(address());
        }

        @NativeType("VkFrameBoundaryFlagsEXT")
        public int flags() {
            return VkFrameBoundaryEXT.nflags(address());
        }

        @NativeType("uint64_t")
        public long frameID() {
            return VkFrameBoundaryEXT.nframeID(address());
        }

        @NativeType("uint32_t")
        public int imageCount() {
            return VkFrameBoundaryEXT.nimageCount(address());
        }

        @NativeType("VkImage const *")
        public LongBuffer pImages() {
            return VkFrameBoundaryEXT.npImages(address());
        }

        @NativeType("uint32_t")
        public int bufferCount() {
            return VkFrameBoundaryEXT.nbufferCount(address());
        }

        @NativeType("VkBuffer const *")
        public LongBuffer pBuffers() {
            return VkFrameBoundaryEXT.npBuffers(address());
        }

        @NativeType("uint64_t")
        public long tagName() {
            return VkFrameBoundaryEXT.ntagName(address());
        }

        @NativeType("size_t")
        public long tagSize() {
            return VkFrameBoundaryEXT.ntagSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pTag() {
            return VkFrameBoundaryEXT.npTag(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFrameBoundaryEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkFrameBoundaryEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkFrameBoundaryFlagsEXT") int value) {
            VkFrameBoundaryEXT.nflags(address(), value);
            return this;
        }

        public Buffer frameID(@NativeType("uint64_t") long value) {
            VkFrameBoundaryEXT.nframeID(address(), value);
            return this;
        }

        public Buffer imageCount(@NativeType("uint32_t") int value) {
            VkFrameBoundaryEXT.nimageCount(address(), value);
            return this;
        }

        public Buffer pImages(@NativeType("VkImage const *") LongBuffer value) {
            VkFrameBoundaryEXT.npImages(address(), value);
            return this;
        }

        public Buffer bufferCount(@NativeType("uint32_t") int value) {
            VkFrameBoundaryEXT.nbufferCount(address(), value);
            return this;
        }

        public Buffer pBuffers(@NativeType("VkBuffer const *") LongBuffer value) {
            VkFrameBoundaryEXT.npBuffers(address(), value);
            return this;
        }

        public Buffer tagName(@NativeType("uint64_t") long value) {
            VkFrameBoundaryEXT.ntagName(address(), value);
            return this;
        }

        public Buffer tagSize(@NativeType("size_t") long value) {
            VkFrameBoundaryEXT.ntagSize(address(), value);
            return this;
        }

        public Buffer pTag(@NativeType("void const *") ByteBuffer value) {
            VkFrameBoundaryEXT.npTag(address(), value);
            return this;
        }
    }
}
