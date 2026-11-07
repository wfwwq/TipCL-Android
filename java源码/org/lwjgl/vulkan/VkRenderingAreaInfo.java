package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAreaInfo.class */
public class VkRenderingAreaInfo extends Struct<VkRenderingAreaInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIEWMASK;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTFORMATS;
    public static final int DEPTHATTACHMENTFORMAT;
    public static final int STENCILATTACHMENTFORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIEWMASK = layout.offsetof(2);
        COLORATTACHMENTCOUNT = layout.offsetof(3);
        PCOLORATTACHMENTFORMATS = layout.offsetof(4);
        DEPTHATTACHMENTFORMAT = layout.offsetof(5);
        STENCILATTACHMENTFORMAT = layout.offsetof(6);
    }

    protected VkRenderingAreaInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderingAreaInfo create(long address, ByteBuffer container) {
        return new VkRenderingAreaInfo(address, container);
    }

    public VkRenderingAreaInfo(ByteBuffer container) {
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
    public int viewMask() {
        return nviewMask(address());
    }

    @NativeType("uint32_t")
    public int colorAttachmentCount() {
        return ncolorAttachmentCount(address());
    }

    @NativeType("VkFormat const *")
    public IntBuffer pColorAttachmentFormats() {
        return npColorAttachmentFormats(address());
    }

    @NativeType("VkFormat")
    public int depthAttachmentFormat() {
        return ndepthAttachmentFormat(address());
    }

    @NativeType("VkFormat")
    public int stencilAttachmentFormat() {
        return nstencilAttachmentFormat(address());
    }

    public VkRenderingAreaInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderingAreaInfo sType$Default() {
        return sType(1000470003);
    }

    public VkRenderingAreaInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderingAreaInfo viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    public VkRenderingAreaInfo colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    public VkRenderingAreaInfo pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npColorAttachmentFormats(address(), value);
        return this;
    }

    public VkRenderingAreaInfo depthAttachmentFormat(@NativeType("VkFormat") int value) {
        ndepthAttachmentFormat(address(), value);
        return this;
    }

    public VkRenderingAreaInfo stencilAttachmentFormat(@NativeType("VkFormat") int value) {
        nstencilAttachmentFormat(address(), value);
        return this;
    }

    public VkRenderingAreaInfo set(int sType, long pNext, int viewMask, int colorAttachmentCount, IntBuffer pColorAttachmentFormats, int depthAttachmentFormat, int stencilAttachmentFormat) {
        sType(sType);
        pNext(pNext);
        viewMask(viewMask);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        return this;
    }

    public VkRenderingAreaInfo set(VkRenderingAreaInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingAreaInfo malloc() {
        return new VkRenderingAreaInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingAreaInfo calloc() {
        return new VkRenderingAreaInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingAreaInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAreaInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingAreaInfo create(long address) {
        return new VkRenderingAreaInfo(address, null);
    }

    public static VkRenderingAreaInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingAreaInfo(address, null);
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

    public static VkRenderingAreaInfo malloc(MemoryStack stack) {
        return new VkRenderingAreaInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingAreaInfo calloc(MemoryStack stack) {
        return new VkRenderingAreaInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nviewMask(long struct) {
        return MemoryUtil.memGetInt(struct + VIEWMASK);
    }

    public static int ncolorAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + COLORATTACHMENTCOUNT);
    }

    public static IntBuffer npColorAttachmentFormats(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTFORMATS), ncolorAttachmentCount(struct));
    }

    public static int ndepthAttachmentFormat(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHATTACHMENTFORMAT);
    }

    public static int nstencilAttachmentFormat(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILATTACHMENTFORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nviewMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWMASK, value);
    }

    public static void ncolorAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENTCOUNT, value);
    }

    public static void npColorAttachmentFormats(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTFORMATS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncolorAttachmentCount(struct, value.remaining());
        }
    }

    public static void ndepthAttachmentFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHATTACHMENTFORMAT, value);
    }

    public static void nstencilAttachmentFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILATTACHMENTFORMAT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAreaInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderingAreaInfo, Buffer> implements NativeResource {
        private static final VkRenderingAreaInfo ELEMENT_FACTORY = VkRenderingAreaInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderingAreaInfo.SIZEOF);
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
        public VkRenderingAreaInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderingAreaInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderingAreaInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int viewMask() {
            return VkRenderingAreaInfo.nviewMask(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkRenderingAreaInfo.ncolorAttachmentCount(address());
        }

        @NativeType("VkFormat const *")
        public IntBuffer pColorAttachmentFormats() {
            return VkRenderingAreaInfo.npColorAttachmentFormats(address());
        }

        @NativeType("VkFormat")
        public int depthAttachmentFormat() {
            return VkRenderingAreaInfo.ndepthAttachmentFormat(address());
        }

        @NativeType("VkFormat")
        public int stencilAttachmentFormat() {
            return VkRenderingAreaInfo.nstencilAttachmentFormat(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingAreaInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000470003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingAreaInfo.npNext(address(), value);
            return this;
        }

        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkRenderingAreaInfo.nviewMask(address(), value);
            return this;
        }

        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkRenderingAreaInfo.ncolorAttachmentCount(address(), value);
            return this;
        }

        public Buffer pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkRenderingAreaInfo.npColorAttachmentFormats(address(), value);
            return this;
        }

        public Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) {
            VkRenderingAreaInfo.ndepthAttachmentFormat(address(), value);
            return this;
        }

        public Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) {
            VkRenderingAreaInfo.nstencilAttachmentFormat(address(), value);
            return this;
        }
    }
}
