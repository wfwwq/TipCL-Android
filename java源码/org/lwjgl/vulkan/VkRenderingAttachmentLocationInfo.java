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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentLocationInfo.class */
public class VkRenderingAttachmentLocationInfo extends Struct<VkRenderingAttachmentLocationInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTLOCATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COLORATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORATTACHMENTLOCATIONS = layout.offsetof(3);
    }

    protected VkRenderingAttachmentLocationInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderingAttachmentLocationInfo create(long address, ByteBuffer container) {
        return new VkRenderingAttachmentLocationInfo(address, container);
    }

    public VkRenderingAttachmentLocationInfo(ByteBuffer container) {
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
    public IntBuffer pColorAttachmentLocations() {
        return npColorAttachmentLocations(address());
    }

    public VkRenderingAttachmentLocationInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderingAttachmentLocationInfo sType$Default() {
        return sType(1000232001);
    }

    public VkRenderingAttachmentLocationInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderingAttachmentLocationInfo colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    public VkRenderingAttachmentLocationInfo pColorAttachmentLocations(@NativeType("uint32_t const *") IntBuffer value) {
        npColorAttachmentLocations(address(), value);
        return this;
    }

    public VkRenderingAttachmentLocationInfo set(int sType, long pNext, int colorAttachmentCount, IntBuffer pColorAttachmentLocations) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentLocations(pColorAttachmentLocations);
        return this;
    }

    public VkRenderingAttachmentLocationInfo set(VkRenderingAttachmentLocationInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingAttachmentLocationInfo malloc() {
        return new VkRenderingAttachmentLocationInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingAttachmentLocationInfo calloc() {
        return new VkRenderingAttachmentLocationInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingAttachmentLocationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAttachmentLocationInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingAttachmentLocationInfo create(long address) {
        return new VkRenderingAttachmentLocationInfo(address, null);
    }

    public static VkRenderingAttachmentLocationInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingAttachmentLocationInfo(address, null);
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

    public static VkRenderingAttachmentLocationInfo malloc(MemoryStack stack) {
        return new VkRenderingAttachmentLocationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingAttachmentLocationInfo calloc(MemoryStack stack) {
        return new VkRenderingAttachmentLocationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static IntBuffer npColorAttachmentLocations(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTLOCATIONS), ncolorAttachmentCount(struct));
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

    public static void npColorAttachmentLocations(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTLOCATIONS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncolorAttachmentCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentLocationInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderingAttachmentLocationInfo, Buffer> implements NativeResource {
        private static final VkRenderingAttachmentLocationInfo ELEMENT_FACTORY = VkRenderingAttachmentLocationInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderingAttachmentLocationInfo.SIZEOF);
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
        public VkRenderingAttachmentLocationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderingAttachmentLocationInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderingAttachmentLocationInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkRenderingAttachmentLocationInfo.ncolorAttachmentCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pColorAttachmentLocations() {
            return VkRenderingAttachmentLocationInfo.npColorAttachmentLocations(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingAttachmentLocationInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000232001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingAttachmentLocationInfo.npNext(address(), value);
            return this;
        }

        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkRenderingAttachmentLocationInfo.ncolorAttachmentCount(address(), value);
            return this;
        }

        public Buffer pColorAttachmentLocations(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderingAttachmentLocationInfo.npColorAttachmentLocations(address(), value);
            return this;
        }
    }
}
