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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInputAttachmentIndexInfo.class */
public class VkRenderingInputAttachmentIndexInfo extends Struct<VkRenderingInputAttachmentIndexInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTINPUTINDICES;
    public static final int PDEPTHINPUTATTACHMENTINDEX;
    public static final int PSTENCILINPUTATTACHMENTINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COLORATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORATTACHMENTINPUTINDICES = layout.offsetof(3);
        PDEPTHINPUTATTACHMENTINDEX = layout.offsetof(4);
        PSTENCILINPUTATTACHMENTINDEX = layout.offsetof(5);
    }

    protected VkRenderingInputAttachmentIndexInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderingInputAttachmentIndexInfo create(long address, ByteBuffer container) {
        return new VkRenderingInputAttachmentIndexInfo(address, container);
    }

    public VkRenderingInputAttachmentIndexInfo(ByteBuffer container) {
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
    public int colorAttachmentCount() {
        return ncolorAttachmentCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pColorAttachmentInputIndices() {
        return npColorAttachmentInputIndices(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pDepthInputAttachmentIndex(int capacity) {
        return npDepthInputAttachmentIndex(address(), capacity);
    }

    @NativeType("uint32_t const *")
    public IntBuffer pStencilInputAttachmentIndex(int capacity) {
        return npStencilInputAttachmentIndex(address(), capacity);
    }

    public VkRenderingInputAttachmentIndexInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfo sType$Default() {
        return sType(1000232002);
    }

    public VkRenderingInputAttachmentIndexInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfo colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npColorAttachmentInputIndices(address(), value);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
        npDepthInputAttachmentIndex(address(), value);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
        npStencilInputAttachmentIndex(address(), value);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfo set(int sType, long pNext, int colorAttachmentCount, IntBuffer pColorAttachmentInputIndices, IntBuffer pDepthInputAttachmentIndex, IntBuffer pStencilInputAttachmentIndex) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentInputIndices(pColorAttachmentInputIndices);
        pDepthInputAttachmentIndex(pDepthInputAttachmentIndex);
        pStencilInputAttachmentIndex(pStencilInputAttachmentIndex);
        return this;
    }

    public VkRenderingInputAttachmentIndexInfo set(VkRenderingInputAttachmentIndexInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingInputAttachmentIndexInfo malloc() {
        return new VkRenderingInputAttachmentIndexInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingInputAttachmentIndexInfo calloc() {
        return new VkRenderingInputAttachmentIndexInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingInputAttachmentIndexInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInputAttachmentIndexInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingInputAttachmentIndexInfo create(long address) {
        return new VkRenderingInputAttachmentIndexInfo(address, null);
    }

    public static VkRenderingInputAttachmentIndexInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingInputAttachmentIndexInfo(address, null);
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

    public static VkRenderingInputAttachmentIndexInfo malloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingInputAttachmentIndexInfo calloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncolorAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + COLORATTACHMENTCOUNT);
    }

    public static IntBuffer npColorAttachmentInputIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTINPUTINDICES), ncolorAttachmentCount(struct));
    }

    public static IntBuffer npDepthInputAttachmentIndex(long struct, int capacity) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDEPTHINPUTATTACHMENTINDEX), capacity);
    }

    public static IntBuffer npStencilInputAttachmentIndex(long struct, int capacity) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PSTENCILINPUTATTACHMENTINDEX), capacity);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncolorAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENTCOUNT, value);
    }

    public static void npColorAttachmentInputIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTINPUTINDICES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncolorAttachmentCount(struct, value.remaining());
        }
    }

    public static void npDepthInputAttachmentIndex(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDEPTHINPUTATTACHMENTINDEX, MemoryUtil.memAddressSafe(value));
    }

    public static void npStencilInputAttachmentIndex(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PSTENCILINPUTATTACHMENTINDEX, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingInputAttachmentIndexInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderingInputAttachmentIndexInfo, Buffer> implements NativeResource {
        private static final VkRenderingInputAttachmentIndexInfo ELEMENT_FACTORY = VkRenderingInputAttachmentIndexInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderingInputAttachmentIndexInfo.SIZEOF);
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
        public VkRenderingInputAttachmentIndexInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderingInputAttachmentIndexInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderingInputAttachmentIndexInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkRenderingInputAttachmentIndexInfo.ncolorAttachmentCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pColorAttachmentInputIndices() {
            return VkRenderingInputAttachmentIndexInfo.npColorAttachmentInputIndices(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pDepthInputAttachmentIndex(int capacity) {
            return VkRenderingInputAttachmentIndexInfo.npDepthInputAttachmentIndex(address(), capacity);
        }

        @NativeType("uint32_t const *")
        public IntBuffer pStencilInputAttachmentIndex(int capacity) {
            return VkRenderingInputAttachmentIndexInfo.npStencilInputAttachmentIndex(address(), capacity);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingInputAttachmentIndexInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000232002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingInputAttachmentIndexInfo.npNext(address(), value);
            return this;
        }

        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkRenderingInputAttachmentIndexInfo.ncolorAttachmentCount(address(), value);
            return this;
        }

        public Buffer pColorAttachmentInputIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingInputAttachmentIndexInfo.npColorAttachmentInputIndices(address(), value);
            return this;
        }

        public Buffer pDepthInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingInputAttachmentIndexInfo.npDepthInputAttachmentIndex(address(), value);
            return this;
        }

        public Buffer pStencilInputAttachmentIndex(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingInputAttachmentIndexInfo.npStencilInputAttachmentIndex(address(), value);
            return this;
        }
    }
}
