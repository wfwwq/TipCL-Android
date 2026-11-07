package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo.class */
public class VkFramebufferAttachmentImageInfo extends Struct<VkFramebufferAttachmentImageInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int USAGE;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int LAYERCOUNT;
    public static final int VIEWFORMATCOUNT;
    public static final int PVIEWFORMATS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        USAGE = layout.offsetof(3);
        WIDTH = layout.offsetof(4);
        HEIGHT = layout.offsetof(5);
        LAYERCOUNT = layout.offsetof(6);
        VIEWFORMATCOUNT = layout.offsetof(7);
        PVIEWFORMATS = layout.offsetof(8);
    }

    protected VkFramebufferAttachmentImageInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFramebufferAttachmentImageInfo create(long address, ByteBuffer container) {
        return new VkFramebufferAttachmentImageInfo(address, container);
    }

    public VkFramebufferAttachmentImageInfo(ByteBuffer container) {
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

    @NativeType("VkImageCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkImageUsageFlags")
    public int usage() {
        return nusage(address());
    }

    @NativeType("uint32_t")
    public int width() {
        return nwidth(address());
    }

    @NativeType("uint32_t")
    public int height() {
        return nheight(address());
    }

    @NativeType("uint32_t")
    public int layerCount() {
        return nlayerCount(address());
    }

    @NativeType("uint32_t")
    public int viewFormatCount() {
        return nviewFormatCount(address());
    }

    @NativeType("VkFormat const *")
    public IntBuffer pViewFormats() {
        return npViewFormats(address());
    }

    public VkFramebufferAttachmentImageInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo sType$Default() {
        return sType(1000108002);
    }

    public VkFramebufferAttachmentImageInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo flags(@NativeType("VkImageCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo usage(@NativeType("VkImageUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo width(@NativeType("uint32_t") int value) {
        nwidth(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo height(@NativeType("uint32_t") int value) {
        nheight(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo layerCount(@NativeType("uint32_t") int value) {
        nlayerCount(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npViewFormats(address(), value);
        return this;
    }

    public VkFramebufferAttachmentImageInfo set(int sType, long pNext, int flags, int usage, int width, int height, int layerCount, IntBuffer pViewFormats) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        width(width);
        height(height);
        layerCount(layerCount);
        pViewFormats(pViewFormats);
        return this;
    }

    public VkFramebufferAttachmentImageInfo set(VkFramebufferAttachmentImageInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFramebufferAttachmentImageInfo malloc() {
        return new VkFramebufferAttachmentImageInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFramebufferAttachmentImageInfo calloc() {
        return new VkFramebufferAttachmentImageInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFramebufferAttachmentImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferAttachmentImageInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkFramebufferAttachmentImageInfo create(long address) {
        return new VkFramebufferAttachmentImageInfo(address, null);
    }

    public static VkFramebufferAttachmentImageInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFramebufferAttachmentImageInfo(address, null);
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

    public static VkFramebufferAttachmentImageInfo malloc(MemoryStack stack) {
        return new VkFramebufferAttachmentImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFramebufferAttachmentImageInfo calloc(MemoryStack stack) {
        return new VkFramebufferAttachmentImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
    }

    public static int nwidth(long struct) {
        return MemoryUtil.memGetInt(struct + WIDTH);
    }

    public static int nheight(long struct) {
        return MemoryUtil.memGetInt(struct + HEIGHT);
    }

    public static int nlayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + LAYERCOUNT);
    }

    public static int nviewFormatCount(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWFORMATCOUNT);
    }

    public static IntBuffer npViewFormats(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PVIEWFORMATS), nviewFormatCount(struct));
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

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
    }

    public static void nwidth(long struct, int value) {
        MemoryUtil.memPutInt(struct + WIDTH, value);
    }

    public static void nheight(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEIGHT, value);
    }

    public static void nlayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + LAYERCOUNT, value);
    }

    public static void nviewFormatCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWFORMATCOUNT, value);
    }

    public static void npViewFormats(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PVIEWFORMATS, MemoryUtil.memAddressSafe(value));
        nviewFormatCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nviewFormatCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PVIEWFORMATS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkFramebufferAttachmentImageInfo, Buffer> implements NativeResource {
        private static final VkFramebufferAttachmentImageInfo ELEMENT_FACTORY = VkFramebufferAttachmentImageInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFramebufferAttachmentImageInfo.SIZEOF);
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
        public VkFramebufferAttachmentImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFramebufferAttachmentImageInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkFramebufferAttachmentImageInfo.npNext(address());
        }

        @NativeType("VkImageCreateFlags")
        public int flags() {
            return VkFramebufferAttachmentImageInfo.nflags(address());
        }

        @NativeType("VkImageUsageFlags")
        public int usage() {
            return VkFramebufferAttachmentImageInfo.nusage(address());
        }

        @NativeType("uint32_t")
        public int width() {
            return VkFramebufferAttachmentImageInfo.nwidth(address());
        }

        @NativeType("uint32_t")
        public int height() {
            return VkFramebufferAttachmentImageInfo.nheight(address());
        }

        @NativeType("uint32_t")
        public int layerCount() {
            return VkFramebufferAttachmentImageInfo.nlayerCount(address());
        }

        @NativeType("uint32_t")
        public int viewFormatCount() {
            return VkFramebufferAttachmentImageInfo.nviewFormatCount(address());
        }

        @NativeType("VkFormat const *")
        public IntBuffer pViewFormats() {
            return VkFramebufferAttachmentImageInfo.npViewFormats(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFramebufferAttachmentImageInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000108002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkFramebufferAttachmentImageInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkImageCreateFlags") int value) {
            VkFramebufferAttachmentImageInfo.nflags(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkImageUsageFlags") int value) {
            VkFramebufferAttachmentImageInfo.nusage(address(), value);
            return this;
        }

        public Buffer width(@NativeType("uint32_t") int value) {
            VkFramebufferAttachmentImageInfo.nwidth(address(), value);
            return this;
        }

        public Buffer height(@NativeType("uint32_t") int value) {
            VkFramebufferAttachmentImageInfo.nheight(address(), value);
            return this;
        }

        public Buffer layerCount(@NativeType("uint32_t") int value) {
            VkFramebufferAttachmentImageInfo.nlayerCount(address(), value);
            return this;
        }

        public Buffer pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkFramebufferAttachmentImageInfo.npViewFormats(address(), value);
            return this;
        }
    }
}
