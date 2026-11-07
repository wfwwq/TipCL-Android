package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayout.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayout.class */
public class VkAttachmentDescriptionStencilLayout extends Struct<VkAttachmentDescriptionStencilLayout> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STENCILINITIALLAYOUT;
    public static final int STENCILFINALLAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STENCILINITIALLAYOUT = layout.offsetof(2);
        STENCILFINALLAYOUT = layout.offsetof(3);
    }

    protected VkAttachmentDescriptionStencilLayout(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentDescriptionStencilLayout create(long address, ByteBuffer container) {
        return new VkAttachmentDescriptionStencilLayout(address, container);
    }

    public VkAttachmentDescriptionStencilLayout(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkImageLayout")
    public int stencilInitialLayout() {
        return nstencilInitialLayout(address());
    }

    @NativeType("VkImageLayout")
    public int stencilFinalLayout() {
        return nstencilFinalLayout(address());
    }

    public VkAttachmentDescriptionStencilLayout sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAttachmentDescriptionStencilLayout sType$Default() {
        return sType(1000241002);
    }

    public VkAttachmentDescriptionStencilLayout pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAttachmentDescriptionStencilLayout stencilInitialLayout(@NativeType("VkImageLayout") int value) {
        nstencilInitialLayout(address(), value);
        return this;
    }

    public VkAttachmentDescriptionStencilLayout stencilFinalLayout(@NativeType("VkImageLayout") int value) {
        nstencilFinalLayout(address(), value);
        return this;
    }

    public VkAttachmentDescriptionStencilLayout set(int sType, long pNext, int stencilInitialLayout, int stencilFinalLayout) {
        sType(sType);
        pNext(pNext);
        stencilInitialLayout(stencilInitialLayout);
        stencilFinalLayout(stencilFinalLayout);
        return this;
    }

    public VkAttachmentDescriptionStencilLayout set(VkAttachmentDescriptionStencilLayout src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentDescriptionStencilLayout malloc() {
        return new VkAttachmentDescriptionStencilLayout(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentDescriptionStencilLayout calloc() {
        return new VkAttachmentDescriptionStencilLayout(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentDescriptionStencilLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentDescriptionStencilLayout(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentDescriptionStencilLayout create(long address) {
        return new VkAttachmentDescriptionStencilLayout(address, null);
    }

    public static VkAttachmentDescriptionStencilLayout createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentDescriptionStencilLayout(address, null);
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

    public static VkAttachmentDescriptionStencilLayout malloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayout(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentDescriptionStencilLayout calloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayout(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstencilInitialLayout(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILINITIALLAYOUT);
    }

    public static int nstencilFinalLayout(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILFINALLAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstencilInitialLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILINITIALLAYOUT, value);
    }

    public static void nstencilFinalLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILFINALLAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayout$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayout$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentDescriptionStencilLayout, Buffer> implements NativeResource {
        private static final VkAttachmentDescriptionStencilLayout ELEMENT_FACTORY = VkAttachmentDescriptionStencilLayout.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentDescriptionStencilLayout.SIZEOF);
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
        public VkAttachmentDescriptionStencilLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAttachmentDescriptionStencilLayout.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAttachmentDescriptionStencilLayout.npNext(address());
        }

        @NativeType("VkImageLayout")
        public int stencilInitialLayout() {
            return VkAttachmentDescriptionStencilLayout.nstencilInitialLayout(address());
        }

        @NativeType("VkImageLayout")
        public int stencilFinalLayout() {
            return VkAttachmentDescriptionStencilLayout.nstencilFinalLayout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentDescriptionStencilLayout.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000241002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAttachmentDescriptionStencilLayout.npNext(address(), value);
            return this;
        }

        public Buffer stencilInitialLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescriptionStencilLayout.nstencilInitialLayout(address(), value);
            return this;
        }

        public Buffer stencilFinalLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescriptionStencilLayout.nstencilFinalLayout(address(), value);
            return this;
        }
    }
}
