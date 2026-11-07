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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfo.class */
public class VkImageFormatListCreateInfo extends Struct<VkImageFormatListCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIEWFORMATCOUNT;
    public static final int PVIEWFORMATS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWFORMATCOUNT = layout.offsetof(2);
        PVIEWFORMATS = layout.offsetof(3);
    }

    protected VkImageFormatListCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageFormatListCreateInfo create(long address, ByteBuffer container) {
        return new VkImageFormatListCreateInfo(address, container);
    }

    public VkImageFormatListCreateInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int viewFormatCount() {
        return nviewFormatCount(address());
    }

    @NativeType("VkFormat const *")
    public IntBuffer pViewFormats() {
        return npViewFormats(address());
    }

    public VkImageFormatListCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageFormatListCreateInfo sType$Default() {
        return sType(1000147000);
    }

    public VkImageFormatListCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageFormatListCreateInfo pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npViewFormats(address(), value);
        return this;
    }

    public VkImageFormatListCreateInfo set(int sType, long pNext, IntBuffer pViewFormats) {
        sType(sType);
        pNext(pNext);
        pViewFormats(pViewFormats);
        return this;
    }

    public VkImageFormatListCreateInfo set(VkImageFormatListCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageFormatListCreateInfo malloc() {
        return new VkImageFormatListCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageFormatListCreateInfo calloc() {
        return new VkImageFormatListCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageFormatListCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageFormatListCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkImageFormatListCreateInfo create(long address) {
        return new VkImageFormatListCreateInfo(address, null);
    }

    public static VkImageFormatListCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageFormatListCreateInfo(address, null);
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

    public static VkImageFormatListCreateInfo malloc(MemoryStack stack) {
        return new VkImageFormatListCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageFormatListCreateInfo calloc(MemoryStack stack) {
        return new VkImageFormatListCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageFormatListCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageFormatListCreateInfo, Buffer> implements NativeResource {
        private static final VkImageFormatListCreateInfo ELEMENT_FACTORY = VkImageFormatListCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageFormatListCreateInfo.SIZEOF);
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
        public VkImageFormatListCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageFormatListCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageFormatListCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int viewFormatCount() {
            return VkImageFormatListCreateInfo.nviewFormatCount(address());
        }

        @NativeType("VkFormat const *")
        public IntBuffer pViewFormats() {
            return VkImageFormatListCreateInfo.npViewFormats(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageFormatListCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000147000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageFormatListCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pViewFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkImageFormatListCreateInfo.npViewFormats(address(), value);
            return this;
        }
    }
}
