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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfo.class */
public class VkCommandBufferInheritanceRenderingInfo extends Struct<VkCommandBufferInheritanceRenderingInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int VIEWMASK;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTFORMATS;
    public static final int DEPTHATTACHMENTFORMAT;
    public static final int STENCILATTACHMENTFORMAT;
    public static final int RASTERIZATIONSAMPLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIEWMASK = layout.offsetof(3);
        COLORATTACHMENTCOUNT = layout.offsetof(4);
        PCOLORATTACHMENTFORMATS = layout.offsetof(5);
        DEPTHATTACHMENTFORMAT = layout.offsetof(6);
        STENCILATTACHMENTFORMAT = layout.offsetof(7);
        RASTERIZATIONSAMPLES = layout.offsetof(8);
    }

    protected VkCommandBufferInheritanceRenderingInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferInheritanceRenderingInfo create(long address, ByteBuffer container) {
        return new VkCommandBufferInheritanceRenderingInfo(address, container);
    }

    public VkCommandBufferInheritanceRenderingInfo(ByteBuffer container) {
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

    @NativeType("VkRenderingFlags")
    public int flags() {
        return nflags(address());
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

    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() {
        return nrasterizationSamples(address());
    }

    public VkCommandBufferInheritanceRenderingInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo sType$Default() {
        return sType(1000044004);
    }

    public VkCommandBufferInheritanceRenderingInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo flags(@NativeType("VkRenderingFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo viewMask(@NativeType("uint32_t") int value) {
        nviewMask(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npColorAttachmentFormats(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo depthAttachmentFormat(@NativeType("VkFormat") int value) {
        ndepthAttachmentFormat(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo stencilAttachmentFormat(@NativeType("VkFormat") int value) {
        nstencilAttachmentFormat(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
        nrasterizationSamples(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo set(int sType, long pNext, int flags, int viewMask, IntBuffer pColorAttachmentFormats, int depthAttachmentFormat, int stencilAttachmentFormat, int rasterizationSamples) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewMask(viewMask);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        rasterizationSamples(rasterizationSamples);
        return this;
    }

    public VkCommandBufferInheritanceRenderingInfo set(VkCommandBufferInheritanceRenderingInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferInheritanceRenderingInfo malloc() {
        return new VkCommandBufferInheritanceRenderingInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderingInfo calloc() {
        return new VkCommandBufferInheritanceRenderingInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderingInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceRenderingInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferInheritanceRenderingInfo create(long address) {
        return new VkCommandBufferInheritanceRenderingInfo(address, null);
    }

    public static VkCommandBufferInheritanceRenderingInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceRenderingInfo(address, null);
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

    public static VkCommandBufferInheritanceRenderingInfo malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderingInfo calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrasterizationSamples(long struct) {
        return MemoryUtil.memGetInt(struct + RASTERIZATIONSAMPLES);
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

    public static void nviewMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIEWMASK, value);
    }

    public static void ncolorAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENTCOUNT, value);
    }

    public static void npColorAttachmentFormats(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTFORMATS, MemoryUtil.memAddressSafe(value));
        ncolorAttachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ndepthAttachmentFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHATTACHMENTFORMAT, value);
    }

    public static void nstencilAttachmentFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILATTACHMENTFORMAT, value);
    }

    public static void nrasterizationSamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + RASTERIZATIONSAMPLES, value);
    }

    public static void validate(long struct) {
        if (ncolorAttachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTFORMATS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceRenderingInfo, Buffer> implements NativeResource {
        private static final VkCommandBufferInheritanceRenderingInfo ELEMENT_FACTORY = VkCommandBufferInheritanceRenderingInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferInheritanceRenderingInfo.SIZEOF);
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
        public VkCommandBufferInheritanceRenderingInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferInheritanceRenderingInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferInheritanceRenderingInfo.npNext(address());
        }

        @NativeType("VkRenderingFlags")
        public int flags() {
            return VkCommandBufferInheritanceRenderingInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int viewMask() {
            return VkCommandBufferInheritanceRenderingInfo.nviewMask(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkCommandBufferInheritanceRenderingInfo.ncolorAttachmentCount(address());
        }

        @NativeType("VkFormat const *")
        public IntBuffer pColorAttachmentFormats() {
            return VkCommandBufferInheritanceRenderingInfo.npColorAttachmentFormats(address());
        }

        @NativeType("VkFormat")
        public int depthAttachmentFormat() {
            return VkCommandBufferInheritanceRenderingInfo.ndepthAttachmentFormat(address());
        }

        @NativeType("VkFormat")
        public int stencilAttachmentFormat() {
            return VkCommandBufferInheritanceRenderingInfo.nstencilAttachmentFormat(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() {
            return VkCommandBufferInheritanceRenderingInfo.nrasterizationSamples(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferInheritanceRenderingInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000044004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferInheritanceRenderingInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkRenderingFlags") int value) {
            VkCommandBufferInheritanceRenderingInfo.nflags(address(), value);
            return this;
        }

        public Buffer viewMask(@NativeType("uint32_t") int value) {
            VkCommandBufferInheritanceRenderingInfo.nviewMask(address(), value);
            return this;
        }

        public Buffer pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkCommandBufferInheritanceRenderingInfo.npColorAttachmentFormats(address(), value);
            return this;
        }

        public Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) {
            VkCommandBufferInheritanceRenderingInfo.ndepthAttachmentFormat(address(), value);
            return this;
        }

        public Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) {
            VkCommandBufferInheritanceRenderingInfo.nstencilAttachmentFormat(address(), value);
            return this;
        }

        public Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) {
            VkCommandBufferInheritanceRenderingInfo.nrasterizationSamples(address(), value);
            return this;
        }
    }
}
