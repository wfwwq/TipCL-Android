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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCustomResolveCreateInfoEXT.class */
public class VkCustomResolveCreateInfoEXT extends Struct<VkCustomResolveCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CUSTOMRESOLVE;
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
        CUSTOMRESOLVE = layout.offsetof(2);
        COLORATTACHMENTCOUNT = layout.offsetof(3);
        PCOLORATTACHMENTFORMATS = layout.offsetof(4);
        DEPTHATTACHMENTFORMAT = layout.offsetof(5);
        STENCILATTACHMENTFORMAT = layout.offsetof(6);
    }

    protected VkCustomResolveCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCustomResolveCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkCustomResolveCreateInfoEXT(address, container);
    }

    public VkCustomResolveCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean customResolve() {
        return ncustomResolve(address()) != 0;
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

    public VkCustomResolveCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCustomResolveCreateInfoEXT sType$Default() {
        return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT);
    }

    public VkCustomResolveCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCustomResolveCreateInfoEXT customResolve(@NativeType("VkBool32") boolean value) {
        ncustomResolve(address(), value ? 1 : 0);
        return this;
    }

    public VkCustomResolveCreateInfoEXT colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    public VkCustomResolveCreateInfoEXT pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
        npColorAttachmentFormats(address(), value);
        return this;
    }

    public VkCustomResolveCreateInfoEXT depthAttachmentFormat(@NativeType("VkFormat") int value) {
        ndepthAttachmentFormat(address(), value);
        return this;
    }

    public VkCustomResolveCreateInfoEXT stencilAttachmentFormat(@NativeType("VkFormat") int value) {
        nstencilAttachmentFormat(address(), value);
        return this;
    }

    public VkCustomResolveCreateInfoEXT set(int sType, long pNext, boolean customResolve, int colorAttachmentCount, IntBuffer pColorAttachmentFormats, int depthAttachmentFormat, int stencilAttachmentFormat) {
        sType(sType);
        pNext(pNext);
        customResolve(customResolve);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        return this;
    }

    public VkCustomResolveCreateInfoEXT set(VkCustomResolveCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCustomResolveCreateInfoEXT malloc() {
        return new VkCustomResolveCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCustomResolveCreateInfoEXT calloc() {
        return new VkCustomResolveCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCustomResolveCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCustomResolveCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkCustomResolveCreateInfoEXT create(long address) {
        return new VkCustomResolveCreateInfoEXT(address, null);
    }

    public static VkCustomResolveCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCustomResolveCreateInfoEXT(address, null);
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

    public static VkCustomResolveCreateInfoEXT malloc(MemoryStack stack) {
        return new VkCustomResolveCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCustomResolveCreateInfoEXT calloc(MemoryStack stack) {
        return new VkCustomResolveCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncustomResolve(long struct) {
        return MemoryUtil.memGetInt(struct + CUSTOMRESOLVE);
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

    public static void ncustomResolve(long struct, int value) {
        MemoryUtil.memPutInt(struct + CUSTOMRESOLVE, value);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCustomResolveCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkCustomResolveCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkCustomResolveCreateInfoEXT ELEMENT_FACTORY = VkCustomResolveCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCustomResolveCreateInfoEXT.SIZEOF);
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
        public VkCustomResolveCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCustomResolveCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCustomResolveCreateInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean customResolve() {
            return VkCustomResolveCreateInfoEXT.ncustomResolve(address()) != 0;
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkCustomResolveCreateInfoEXT.ncolorAttachmentCount(address());
        }

        @NativeType("VkFormat const *")
        public IntBuffer pColorAttachmentFormats() {
            return VkCustomResolveCreateInfoEXT.npColorAttachmentFormats(address());
        }

        @NativeType("VkFormat")
        public int depthAttachmentFormat() {
            return VkCustomResolveCreateInfoEXT.ndepthAttachmentFormat(address());
        }

        @NativeType("VkFormat")
        public int stencilAttachmentFormat() {
            return VkCustomResolveCreateInfoEXT.nstencilAttachmentFormat(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCustomResolveCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTCustomResolve.VK_STRUCTURE_TYPE_CUSTOM_RESOLVE_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCustomResolveCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer customResolve(@NativeType("VkBool32") boolean value) {
            VkCustomResolveCreateInfoEXT.ncustomResolve(address(), value ? 1 : 0);
            return this;
        }

        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkCustomResolveCreateInfoEXT.ncolorAttachmentCount(address(), value);
            return this;
        }

        public Buffer pColorAttachmentFormats(@NativeType("VkFormat const *") IntBuffer value) {
            VkCustomResolveCreateInfoEXT.npColorAttachmentFormats(address(), value);
            return this;
        }

        public Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) {
            VkCustomResolveCreateInfoEXT.ndepthAttachmentFormat(address(), value);
            return this;
        }

        public Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) {
            VkCustomResolveCreateInfoEXT.nstencilAttachmentFormat(address(), value);
            return this;
        }
    }
}
