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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve.class */
public class VkSubpassDescriptionDepthStencilResolve extends Struct<VkSubpassDescriptionDepthStencilResolve> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEPTHRESOLVEMODE;
    public static final int STENCILRESOLVEMODE;
    public static final int PDEPTHSTENCILRESOLVEATTACHMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHRESOLVEMODE = layout.offsetof(2);
        STENCILRESOLVEMODE = layout.offsetof(3);
        PDEPTHSTENCILRESOLVEATTACHMENT = layout.offsetof(4);
    }

    protected VkSubpassDescriptionDepthStencilResolve(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassDescriptionDepthStencilResolve create(long address, ByteBuffer container) {
        return new VkSubpassDescriptionDepthStencilResolve(address, container);
    }

    public VkSubpassDescriptionDepthStencilResolve(ByteBuffer container) {
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

    @NativeType("VkResolveModeFlagBits")
    public int depthResolveMode() {
        return ndepthResolveMode(address());
    }

    @NativeType("VkResolveModeFlagBits")
    public int stencilResolveMode() {
        return nstencilResolveMode(address());
    }

    @NativeType("VkAttachmentReference2 const *")
    public VkAttachmentReference2 pDepthStencilResolveAttachment() {
        return npDepthStencilResolveAttachment(address());
    }

    public VkSubpassDescriptionDepthStencilResolve sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubpassDescriptionDepthStencilResolve sType$Default() {
        return sType(1000199001);
    }

    public VkSubpassDescriptionDepthStencilResolve pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubpassDescriptionDepthStencilResolve depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        ndepthResolveMode(address(), value);
        return this;
    }

    public VkSubpassDescriptionDepthStencilResolve stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        nstencilResolveMode(address(), value);
        return this;
    }

    public VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
        npDepthStencilResolveAttachment(address(), value);
        return this;
    }

    public VkSubpassDescriptionDepthStencilResolve set(int sType, long pNext, int depthResolveMode, int stencilResolveMode, VkAttachmentReference2 pDepthStencilResolveAttachment) {
        sType(sType);
        pNext(pNext);
        depthResolveMode(depthResolveMode);
        stencilResolveMode(stencilResolveMode);
        pDepthStencilResolveAttachment(pDepthStencilResolveAttachment);
        return this;
    }

    public VkSubpassDescriptionDepthStencilResolve set(VkSubpassDescriptionDepthStencilResolve src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDescriptionDepthStencilResolve malloc() {
        return new VkSubpassDescriptionDepthStencilResolve(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDescriptionDepthStencilResolve calloc() {
        return new VkSubpassDescriptionDepthStencilResolve(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDescriptionDepthStencilResolve create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescriptionDepthStencilResolve(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDescriptionDepthStencilResolve create(long address) {
        return new VkSubpassDescriptionDepthStencilResolve(address, null);
    }

    public static VkSubpassDescriptionDepthStencilResolve createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDescriptionDepthStencilResolve(address, null);
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

    public static VkSubpassDescriptionDepthStencilResolve malloc(MemoryStack stack) {
        return new VkSubpassDescriptionDepthStencilResolve(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDescriptionDepthStencilResolve calloc(MemoryStack stack) {
        return new VkSubpassDescriptionDepthStencilResolve(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndepthResolveMode(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHRESOLVEMODE);
    }

    public static int nstencilResolveMode(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILRESOLVEMODE);
    }

    public static VkAttachmentReference2 npDepthStencilResolveAttachment(long struct) {
        return VkAttachmentReference2.createSafe(MemoryUtil.memGetAddress(struct + PDEPTHSTENCILRESOLVEATTACHMENT));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndepthResolveMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHRESOLVEMODE, value);
    }

    public static void nstencilResolveMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILRESOLVEMODE, value);
    }

    public static void npDepthStencilResolveAttachment(long struct, VkAttachmentReference2 value) {
        MemoryUtil.memPutAddress(struct + PDEPTHSTENCILRESOLVEATTACHMENT, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassDescriptionDepthStencilResolve, Buffer> implements NativeResource {
        private static final VkSubpassDescriptionDepthStencilResolve ELEMENT_FACTORY = VkSubpassDescriptionDepthStencilResolve.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassDescriptionDepthStencilResolve.SIZEOF);
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
        public VkSubpassDescriptionDepthStencilResolve getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubpassDescriptionDepthStencilResolve.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubpassDescriptionDepthStencilResolve.npNext(address());
        }

        @NativeType("VkResolveModeFlagBits")
        public int depthResolveMode() {
            return VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(address());
        }

        @NativeType("VkResolveModeFlagBits")
        public int stencilResolveMode() {
            return VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(address());
        }

        @NativeType("VkAttachmentReference2 const *")
        public VkAttachmentReference2 pDepthStencilResolveAttachment() {
            return VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassDescriptionDepthStencilResolve.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000199001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassDescriptionDepthStencilResolve.npNext(address(), value);
            return this;
        }

        public Buffer depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(address(), value);
            return this;
        }

        public Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(address(), value);
            return this;
        }

        public Buffer pDepthStencilResolveAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
            VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(address(), value);
            return this;
        }
    }
}
