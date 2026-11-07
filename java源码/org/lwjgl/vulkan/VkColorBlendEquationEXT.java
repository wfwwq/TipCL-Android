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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendEquationEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendEquationEXT.class */
public class VkColorBlendEquationEXT extends Struct<VkColorBlendEquationEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SRCCOLORBLENDFACTOR;
    public static final int DSTCOLORBLENDFACTOR;
    public static final int COLORBLENDOP;
    public static final int SRCALPHABLENDFACTOR;
    public static final int DSTALPHABLENDFACTOR;
    public static final int ALPHABLENDOP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SRCCOLORBLENDFACTOR = layout.offsetof(0);
        DSTCOLORBLENDFACTOR = layout.offsetof(1);
        COLORBLENDOP = layout.offsetof(2);
        SRCALPHABLENDFACTOR = layout.offsetof(3);
        DSTALPHABLENDFACTOR = layout.offsetof(4);
        ALPHABLENDOP = layout.offsetof(5);
    }

    protected VkColorBlendEquationEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkColorBlendEquationEXT create(long address, ByteBuffer container) {
        return new VkColorBlendEquationEXT(address, container);
    }

    public VkColorBlendEquationEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
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

    public VkColorBlendEquationEXT srcColorBlendFactor(@NativeType("VkBlendFactor") int value) {
        nsrcColorBlendFactor(address(), value);
        return this;
    }

    public VkColorBlendEquationEXT dstColorBlendFactor(@NativeType("VkBlendFactor") int value) {
        ndstColorBlendFactor(address(), value);
        return this;
    }

    public VkColorBlendEquationEXT colorBlendOp(@NativeType("VkBlendOp") int value) {
        ncolorBlendOp(address(), value);
        return this;
    }

    public VkColorBlendEquationEXT srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
        nsrcAlphaBlendFactor(address(), value);
        return this;
    }

    public VkColorBlendEquationEXT dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
        ndstAlphaBlendFactor(address(), value);
        return this;
    }

    public VkColorBlendEquationEXT alphaBlendOp(@NativeType("VkBlendOp") int value) {
        nalphaBlendOp(address(), value);
        return this;
    }

    public VkColorBlendEquationEXT set(int srcColorBlendFactor, int dstColorBlendFactor, int colorBlendOp, int srcAlphaBlendFactor, int dstAlphaBlendFactor, int alphaBlendOp) {
        srcColorBlendFactor(srcColorBlendFactor);
        dstColorBlendFactor(dstColorBlendFactor);
        colorBlendOp(colorBlendOp);
        srcAlphaBlendFactor(srcAlphaBlendFactor);
        dstAlphaBlendFactor(dstAlphaBlendFactor);
        alphaBlendOp(alphaBlendOp);
        return this;
    }

    public VkColorBlendEquationEXT set(VkColorBlendEquationEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkColorBlendEquationEXT malloc() {
        return new VkColorBlendEquationEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkColorBlendEquationEXT calloc() {
        return new VkColorBlendEquationEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkColorBlendEquationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkColorBlendEquationEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkColorBlendEquationEXT create(long address) {
        return new VkColorBlendEquationEXT(address, null);
    }

    public static VkColorBlendEquationEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkColorBlendEquationEXT(address, null);
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

    public static VkColorBlendEquationEXT malloc(MemoryStack stack) {
        return new VkColorBlendEquationEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkColorBlendEquationEXT calloc(MemoryStack stack) {
        return new VkColorBlendEquationEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendEquationEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendEquationEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkColorBlendEquationEXT, Buffer> implements NativeResource {
        private static final VkColorBlendEquationEXT ELEMENT_FACTORY = VkColorBlendEquationEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkColorBlendEquationEXT.SIZEOF);
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
        public VkColorBlendEquationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBlendFactor")
        public int srcColorBlendFactor() {
            return VkColorBlendEquationEXT.nsrcColorBlendFactor(address());
        }

        @NativeType("VkBlendFactor")
        public int dstColorBlendFactor() {
            return VkColorBlendEquationEXT.ndstColorBlendFactor(address());
        }

        @NativeType("VkBlendOp")
        public int colorBlendOp() {
            return VkColorBlendEquationEXT.ncolorBlendOp(address());
        }

        @NativeType("VkBlendFactor")
        public int srcAlphaBlendFactor() {
            return VkColorBlendEquationEXT.nsrcAlphaBlendFactor(address());
        }

        @NativeType("VkBlendFactor")
        public int dstAlphaBlendFactor() {
            return VkColorBlendEquationEXT.ndstAlphaBlendFactor(address());
        }

        @NativeType("VkBlendOp")
        public int alphaBlendOp() {
            return VkColorBlendEquationEXT.nalphaBlendOp(address());
        }

        public Buffer srcColorBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkColorBlendEquationEXT.nsrcColorBlendFactor(address(), value);
            return this;
        }

        public Buffer dstColorBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkColorBlendEquationEXT.ndstColorBlendFactor(address(), value);
            return this;
        }

        public Buffer colorBlendOp(@NativeType("VkBlendOp") int value) {
            VkColorBlendEquationEXT.ncolorBlendOp(address(), value);
            return this;
        }

        public Buffer srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkColorBlendEquationEXT.nsrcAlphaBlendFactor(address(), value);
            return this;
        }

        public Buffer dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) {
            VkColorBlendEquationEXT.ndstAlphaBlendFactor(address(), value);
            return this;
        }

        public Buffer alphaBlendOp(@NativeType("VkBlendOp") int value) {
            VkColorBlendEquationEXT.nalphaBlendOp(address(), value);
            return this;
        }
    }
}
