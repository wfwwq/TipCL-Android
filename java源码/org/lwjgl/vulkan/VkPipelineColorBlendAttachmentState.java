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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAttachmentState.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAttachmentState.class */
public class VkPipelineColorBlendAttachmentState extends Struct<VkPipelineColorBlendAttachmentState> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BLENDENABLE;
    public static final int SRCCOLORBLENDFACTOR;
    public static final int DSTCOLORBLENDFACTOR;
    public static final int COLORBLENDOP;
    public static final int SRCALPHABLENDFACTOR;
    public static final int DSTALPHABLENDFACTOR;
    public static final int ALPHABLENDOP;
    public static final int COLORWRITEMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BLENDENABLE = layout.offsetof(0);
        SRCCOLORBLENDFACTOR = layout.offsetof(1);
        DSTCOLORBLENDFACTOR = layout.offsetof(2);
        COLORBLENDOP = layout.offsetof(3);
        SRCALPHABLENDFACTOR = layout.offsetof(4);
        DSTALPHABLENDFACTOR = layout.offsetof(5);
        ALPHABLENDOP = layout.offsetof(6);
        COLORWRITEMASK = layout.offsetof(7);
    }

    protected VkPipelineColorBlendAttachmentState(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineColorBlendAttachmentState create(long address, ByteBuffer container) {
        return new VkPipelineColorBlendAttachmentState(address, container);
    }

    public VkPipelineColorBlendAttachmentState(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkBool32")
    public boolean blendEnable() {
        return nblendEnable(address()) != 0;
    }

    @NativeType("VkBlendFactor")
    public int srcColorBlendFactor() {
        return nsrcColorBlendFactor(address());
    }

    @NativeType("VkBlendFactor")
    public int dstColorBlendFactor() {
        return ndstColorBlendFactor(address());
    }

    @NativeType("VkBlendOp")
    public int colorBlendOp() {
        return ncolorBlendOp(address());
    }

    @NativeType("VkBlendFactor")
    public int srcAlphaBlendFactor() {
        return nsrcAlphaBlendFactor(address());
    }

    @NativeType("VkBlendFactor")
    public int dstAlphaBlendFactor() {
        return ndstAlphaBlendFactor(address());
    }

    @NativeType("VkBlendOp")
    public int alphaBlendOp() {
        return nalphaBlendOp(address());
    }

    @NativeType("VkColorComponentFlags")
    public int colorWriteMask() {
        return ncolorWriteMask(address());
    }

    public VkPipelineColorBlendAttachmentState blendEnable(@NativeType("VkBool32") boolean value) {
        nblendEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineColorBlendAttachmentState srcColorBlendFactor(@NativeType("VkBlendFactor") int value) {
        nsrcColorBlendFactor(address(), value);
        return this;
    }

    public VkPipelineColorBlendAttachmentState dstColorBlendFactor(@NativeType("VkBlendFactor") int value) {
        ndstColorBlendFactor(address(), value);
        return this;
    }

    public VkPipelineColorBlendAttachmentState colorBlendOp(@NativeType("VkBlendOp") int value) {
        ncolorBlendOp(address(), value);
        return this;
    }

    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
        nsrcAlphaBlendFactor(address(), value);
        return this;
    }

    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
        ndstAlphaBlendFactor(address(), value);
        return this;
    }

    public VkPipelineColorBlendAttachmentState alphaBlendOp(@NativeType("VkBlendOp") int value) {
        nalphaBlendOp(address(), value);
        return this;
    }

    public VkPipelineColorBlendAttachmentState colorWriteMask(@NativeType("VkColorComponentFlags") int value) {
        ncolorWriteMask(address(), value);
        return this;
    }

    public VkPipelineColorBlendAttachmentState set(boolean blendEnable, int srcColorBlendFactor, int dstColorBlendFactor, int colorBlendOp, int srcAlphaBlendFactor, int dstAlphaBlendFactor, int alphaBlendOp, int colorWriteMask) {
        blendEnable(blendEnable);
        srcColorBlendFactor(srcColorBlendFactor);
        dstColorBlendFactor(dstColorBlendFactor);
        colorBlendOp(colorBlendOp);
        srcAlphaBlendFactor(srcAlphaBlendFactor);
        dstAlphaBlendFactor(dstAlphaBlendFactor);
        alphaBlendOp(alphaBlendOp);
        colorWriteMask(colorWriteMask);
        return this;
    }

    public VkPipelineColorBlendAttachmentState set(VkPipelineColorBlendAttachmentState src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineColorBlendAttachmentState malloc() {
        return new VkPipelineColorBlendAttachmentState(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineColorBlendAttachmentState calloc() {
        return new VkPipelineColorBlendAttachmentState(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineColorBlendAttachmentState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineColorBlendAttachmentState(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineColorBlendAttachmentState create(long address) {
        return new VkPipelineColorBlendAttachmentState(address, null);
    }

    public static VkPipelineColorBlendAttachmentState createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineColorBlendAttachmentState(address, null);
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

    public static VkPipelineColorBlendAttachmentState malloc(MemoryStack stack) {
        return new VkPipelineColorBlendAttachmentState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineColorBlendAttachmentState calloc(MemoryStack stack) {
        return new VkPipelineColorBlendAttachmentState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nblendEnable(long struct) {
        return MemoryUtil.memGetInt(struct + BLENDENABLE);
    }

    public static int nsrcColorBlendFactor(long struct) {
        return MemoryUtil.memGetInt(struct + SRCCOLORBLENDFACTOR);
    }

    public static int ndstColorBlendFactor(long struct) {
        return MemoryUtil.memGetInt(struct + DSTCOLORBLENDFACTOR);
    }

    public static int ncolorBlendOp(long struct) {
        return MemoryUtil.memGetInt(struct + COLORBLENDOP);
    }

    public static int nsrcAlphaBlendFactor(long struct) {
        return MemoryUtil.memGetInt(struct + SRCALPHABLENDFACTOR);
    }

    public static int ndstAlphaBlendFactor(long struct) {
        return MemoryUtil.memGetInt(struct + DSTALPHABLENDFACTOR);
    }

    public static int nalphaBlendOp(long struct) {
        return MemoryUtil.memGetInt(struct + ALPHABLENDOP);
    }

    public static int ncolorWriteMask(long struct) {
        return MemoryUtil.memGetInt(struct + COLORWRITEMASK);
    }

    public static void nblendEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + BLENDENABLE, value);
    }

    public static void nsrcColorBlendFactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCCOLORBLENDFACTOR, value);
    }

    public static void ndstColorBlendFactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTCOLORBLENDFACTOR, value);
    }

    public static void ncolorBlendOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORBLENDOP, value);
    }

    public static void nsrcAlphaBlendFactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCALPHABLENDFACTOR, value);
    }

    public static void ndstAlphaBlendFactor(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTALPHABLENDFACTOR, value);
    }

    public static void nalphaBlendOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + ALPHABLENDOP, value);
    }

    public static void ncolorWriteMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORWRITEMASK, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAttachmentState$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAttachmentState$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendAttachmentState, Buffer> implements NativeResource {
        private static final VkPipelineColorBlendAttachmentState ELEMENT_FACTORY = VkPipelineColorBlendAttachmentState.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineColorBlendAttachmentState.SIZEOF);
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
        public VkPipelineColorBlendAttachmentState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBool32")
        public boolean blendEnable() {
            return VkPipelineColorBlendAttachmentState.nblendEnable(address()) != 0;
        }

        @NativeType("VkBlendFactor")
        public int srcColorBlendFactor() {
            return VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address());
        }

        @NativeType("VkBlendFactor")
        public int dstColorBlendFactor() {
            return VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address());
        }

        @NativeType("VkBlendOp")
        public int colorBlendOp() {
            return VkPipelineColorBlendAttachmentState.ncolorBlendOp(address());
        }

        @NativeType("VkBlendFactor")
        public int srcAlphaBlendFactor() {
            return VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address());
        }

        @NativeType("VkBlendFactor")
        public int dstAlphaBlendFactor() {
            return VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address());
        }

        @NativeType("VkBlendOp")
        public int alphaBlendOp() {
            return VkPipelineColorBlendAttachmentState.nalphaBlendOp(address());
        }

        @NativeType("VkColorComponentFlags")
        public int colorWriteMask() {
            return VkPipelineColorBlendAttachmentState.ncolorWriteMask(address());
        }

        public Buffer blendEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineColorBlendAttachmentState.nblendEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer srcColorBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address(), value);
            return this;
        }

        public Buffer dstColorBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address(), value);
            return this;
        }

        public Buffer colorBlendOp(@NativeType("VkBlendOp") int value) {
            VkPipelineColorBlendAttachmentState.ncolorBlendOp(address(), value);
            return this;
        }

        public Buffer srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address(), value);
            return this;
        }

        public Buffer dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address(), value);
            return this;
        }

        public Buffer alphaBlendOp(@NativeType("VkBlendOp") int value) {
            VkPipelineColorBlendAttachmentState.nalphaBlendOp(address(), value);
            return this;
        }

        public Buffer colorWriteMask(@NativeType("VkColorComponentFlags") int value) {
            VkPipelineColorBlendAttachmentState.ncolorWriteMask(address(), value);
            return this;
        }
    }
}
