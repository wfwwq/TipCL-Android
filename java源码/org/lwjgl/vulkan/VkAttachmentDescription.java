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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription.class */
public class VkAttachmentDescription extends Struct<VkAttachmentDescription> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int FORMAT;
    public static final int SAMPLES;
    public static final int LOADOP;
    public static final int STOREOP;
    public static final int STENCILLOADOP;
    public static final int STENCILSTOREOP;
    public static final int INITIALLAYOUT;
    public static final int FINALLAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        SAMPLES = layout.offsetof(2);
        LOADOP = layout.offsetof(3);
        STOREOP = layout.offsetof(4);
        STENCILLOADOP = layout.offsetof(5);
        STENCILSTOREOP = layout.offsetof(6);
        INITIALLAYOUT = layout.offsetof(7);
        FINALLAYOUT = layout.offsetof(8);
    }

    protected VkAttachmentDescription(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentDescription create(long address, ByteBuffer container) {
        return new VkAttachmentDescription(address, container);
    }

    public VkAttachmentDescription(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkAttachmentDescriptionFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    @NativeType("VkSampleCountFlagBits")
    public int samples() {
        return nsamples(address());
    }

    @NativeType("VkAttachmentLoadOp")
    public int loadOp() {
        return nloadOp(address());
    }

    @NativeType("VkAttachmentStoreOp")
    public int storeOp() {
        return nstoreOp(address());
    }

    @NativeType("VkAttachmentLoadOp")
    public int stencilLoadOp() {
        return nstencilLoadOp(address());
    }

    @NativeType("VkAttachmentStoreOp")
    public int stencilStoreOp() {
        return nstencilStoreOp(address());
    }

    @NativeType("VkImageLayout")
    public int initialLayout() {
        return ninitialLayout(address());
    }

    @NativeType("VkImageLayout")
    public int finalLayout() {
        return nfinalLayout(address());
    }

    public VkAttachmentDescription flags(@NativeType("VkAttachmentDescriptionFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAttachmentDescription format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkAttachmentDescription samples(@NativeType("VkSampleCountFlagBits") int value) {
        nsamples(address(), value);
        return this;
    }

    public VkAttachmentDescription loadOp(@NativeType("VkAttachmentLoadOp") int value) {
        nloadOp(address(), value);
        return this;
    }

    public VkAttachmentDescription storeOp(@NativeType("VkAttachmentStoreOp") int value) {
        nstoreOp(address(), value);
        return this;
    }

    public VkAttachmentDescription stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) {
        nstencilLoadOp(address(), value);
        return this;
    }

    public VkAttachmentDescription stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) {
        nstencilStoreOp(address(), value);
        return this;
    }

    public VkAttachmentDescription initialLayout(@NativeType("VkImageLayout") int value) {
        ninitialLayout(address(), value);
        return this;
    }

    public VkAttachmentDescription finalLayout(@NativeType("VkImageLayout") int value) {
        nfinalLayout(address(), value);
        return this;
    }

    public VkAttachmentDescription set(int flags, int format, int samples, int loadOp, int storeOp, int stencilLoadOp, int stencilStoreOp, int initialLayout, int finalLayout) {
        flags(flags);
        format(format);
        samples(samples);
        loadOp(loadOp);
        storeOp(storeOp);
        stencilLoadOp(stencilLoadOp);
        stencilStoreOp(stencilStoreOp);
        initialLayout(initialLayout);
        finalLayout(finalLayout);
        return this;
    }

    public VkAttachmentDescription set(VkAttachmentDescription src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentDescription malloc() {
        return new VkAttachmentDescription(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentDescription calloc() {
        return new VkAttachmentDescription(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentDescription(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentDescription create(long address) {
        return new VkAttachmentDescription(address, null);
    }

    public static VkAttachmentDescription createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentDescription(address, null);
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

    public static VkAttachmentDescription malloc(MemoryStack stack) {
        return new VkAttachmentDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentDescription calloc(MemoryStack stack) {
        return new VkAttachmentDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static int nsamples(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLES);
    }

    public static int nloadOp(long struct) {
        return MemoryUtil.memGetInt(struct + LOADOP);
    }

    public static int nstoreOp(long struct) {
        return MemoryUtil.memGetInt(struct + STOREOP);
    }

    public static int nstencilLoadOp(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILLOADOP);
    }

    public static int nstencilStoreOp(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILSTOREOP);
    }

    public static int ninitialLayout(long struct) {
        return MemoryUtil.memGetInt(struct + INITIALLAYOUT);
    }

    public static int nfinalLayout(long struct) {
        return MemoryUtil.memGetInt(struct + FINALLAYOUT);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    public static void nsamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLES, value);
    }

    public static void nloadOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOADOP, value);
    }

    public static void nstoreOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + STOREOP, value);
    }

    public static void nstencilLoadOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILLOADOP, value);
    }

    public static void nstencilStoreOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILSTOREOP, value);
    }

    public static void ninitialLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + INITIALLAYOUT, value);
    }

    public static void nfinalLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + FINALLAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentDescription, Buffer> implements NativeResource {
        private static final VkAttachmentDescription ELEMENT_FACTORY = VkAttachmentDescription.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentDescription.SIZEOF);
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
        public VkAttachmentDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkAttachmentDescriptionFlags")
        public int flags() {
            return VkAttachmentDescription.nflags(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkAttachmentDescription.nformat(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int samples() {
            return VkAttachmentDescription.nsamples(address());
        }

        @NativeType("VkAttachmentLoadOp")
        public int loadOp() {
            return VkAttachmentDescription.nloadOp(address());
        }

        @NativeType("VkAttachmentStoreOp")
        public int storeOp() {
            return VkAttachmentDescription.nstoreOp(address());
        }

        @NativeType("VkAttachmentLoadOp")
        public int stencilLoadOp() {
            return VkAttachmentDescription.nstencilLoadOp(address());
        }

        @NativeType("VkAttachmentStoreOp")
        public int stencilStoreOp() {
            return VkAttachmentDescription.nstencilStoreOp(address());
        }

        @NativeType("VkImageLayout")
        public int initialLayout() {
            return VkAttachmentDescription.ninitialLayout(address());
        }

        @NativeType("VkImageLayout")
        public int finalLayout() {
            return VkAttachmentDescription.nfinalLayout(address());
        }

        public Buffer flags(@NativeType("VkAttachmentDescriptionFlags") int value) {
            VkAttachmentDescription.nflags(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkAttachmentDescription.nformat(address(), value);
            return this;
        }

        public Buffer samples(@NativeType("VkSampleCountFlagBits") int value) {
            VkAttachmentDescription.nsamples(address(), value);
            return this;
        }

        public Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) {
            VkAttachmentDescription.nloadOp(address(), value);
            return this;
        }

        public Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) {
            VkAttachmentDescription.nstoreOp(address(), value);
            return this;
        }

        public Buffer stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) {
            VkAttachmentDescription.nstencilLoadOp(address(), value);
            return this;
        }

        public Buffer stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) {
            VkAttachmentDescription.nstencilStoreOp(address(), value);
            return this;
        }

        public Buffer initialLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescription.ninitialLayout(address(), value);
            return this;
        }

        public Buffer finalLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescription.nfinalLayout(address(), value);
            return this;
        }
    }
}
