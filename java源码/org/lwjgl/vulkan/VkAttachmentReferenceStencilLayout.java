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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayout.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayout.class */
public class VkAttachmentReferenceStencilLayout extends Struct<VkAttachmentReferenceStencilLayout> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STENCILLAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STENCILLAYOUT = layout.offsetof(2);
    }

    protected VkAttachmentReferenceStencilLayout(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentReferenceStencilLayout create(long address, ByteBuffer container) {
        return new VkAttachmentReferenceStencilLayout(address, container);
    }

    public VkAttachmentReferenceStencilLayout(ByteBuffer container) {
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
    public int stencilLayout() {
        return nstencilLayout(address());
    }

    public VkAttachmentReferenceStencilLayout sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAttachmentReferenceStencilLayout sType$Default() {
        return sType(1000241001);
    }

    public VkAttachmentReferenceStencilLayout pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAttachmentReferenceStencilLayout stencilLayout(@NativeType("VkImageLayout") int value) {
        nstencilLayout(address(), value);
        return this;
    }

    public VkAttachmentReferenceStencilLayout set(int sType, long pNext, int stencilLayout) {
        sType(sType);
        pNext(pNext);
        stencilLayout(stencilLayout);
        return this;
    }

    public VkAttachmentReferenceStencilLayout set(VkAttachmentReferenceStencilLayout src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentReferenceStencilLayout malloc() {
        return new VkAttachmentReferenceStencilLayout(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentReferenceStencilLayout calloc() {
        return new VkAttachmentReferenceStencilLayout(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentReferenceStencilLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReferenceStencilLayout(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentReferenceStencilLayout create(long address) {
        return new VkAttachmentReferenceStencilLayout(address, null);
    }

    public static VkAttachmentReferenceStencilLayout createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentReferenceStencilLayout(address, null);
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

    public static VkAttachmentReferenceStencilLayout malloc(MemoryStack stack) {
        return new VkAttachmentReferenceStencilLayout(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentReferenceStencilLayout calloc(MemoryStack stack) {
        return new VkAttachmentReferenceStencilLayout(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstencilLayout(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILLAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstencilLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILLAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayout$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentReferenceStencilLayout$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentReferenceStencilLayout, Buffer> implements NativeResource {
        private static final VkAttachmentReferenceStencilLayout ELEMENT_FACTORY = VkAttachmentReferenceStencilLayout.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentReferenceStencilLayout.SIZEOF);
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
        public VkAttachmentReferenceStencilLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAttachmentReferenceStencilLayout.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAttachmentReferenceStencilLayout.npNext(address());
        }

        @NativeType("VkImageLayout")
        public int stencilLayout() {
            return VkAttachmentReferenceStencilLayout.nstencilLayout(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentReferenceStencilLayout.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000241001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAttachmentReferenceStencilLayout.npNext(address(), value);
            return this;
        }

        public Buffer stencilLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentReferenceStencilLayout.nstencilLayout(address(), value);
            return this;
        }
    }
}
