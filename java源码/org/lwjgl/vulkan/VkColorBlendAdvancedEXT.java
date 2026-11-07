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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendAdvancedEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendAdvancedEXT.class */
public class VkColorBlendAdvancedEXT extends Struct<VkColorBlendAdvancedEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ADVANCEDBLENDOP;
    public static final int SRCPREMULTIPLIED;
    public static final int DSTPREMULTIPLIED;
    public static final int BLENDOVERLAP;
    public static final int CLAMPRESULTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ADVANCEDBLENDOP = layout.offsetof(0);
        SRCPREMULTIPLIED = layout.offsetof(1);
        DSTPREMULTIPLIED = layout.offsetof(2);
        BLENDOVERLAP = layout.offsetof(3);
        CLAMPRESULTS = layout.offsetof(4);
    }

    protected VkColorBlendAdvancedEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkColorBlendAdvancedEXT create(long address, ByteBuffer container) {
        return new VkColorBlendAdvancedEXT(address, container);
    }

    public VkColorBlendAdvancedEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkBlendOp")
    public int advancedBlendOp() {
        return nadvancedBlendOp(address());
    }

    @NativeType("VkBool32")
    public boolean srcPremultiplied() {
        return nsrcPremultiplied(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean dstPremultiplied() {
        return ndstPremultiplied(address()) != 0;
    }

    @NativeType("VkBlendOverlapEXT")
    public int blendOverlap() {
        return nblendOverlap(address());
    }

    @NativeType("VkBool32")
    public boolean clampResults() {
        return nclampResults(address()) != 0;
    }

    public VkColorBlendAdvancedEXT advancedBlendOp(@NativeType("VkBlendOp") int value) {
        nadvancedBlendOp(address(), value);
        return this;
    }

    public VkColorBlendAdvancedEXT srcPremultiplied(@NativeType("VkBool32") boolean value) {
        nsrcPremultiplied(address(), value ? 1 : 0);
        return this;
    }

    public VkColorBlendAdvancedEXT dstPremultiplied(@NativeType("VkBool32") boolean value) {
        ndstPremultiplied(address(), value ? 1 : 0);
        return this;
    }

    public VkColorBlendAdvancedEXT blendOverlap(@NativeType("VkBlendOverlapEXT") int value) {
        nblendOverlap(address(), value);
        return this;
    }

    public VkColorBlendAdvancedEXT clampResults(@NativeType("VkBool32") boolean value) {
        nclampResults(address(), value ? 1 : 0);
        return this;
    }

    public VkColorBlendAdvancedEXT set(int advancedBlendOp, boolean srcPremultiplied, boolean dstPremultiplied, int blendOverlap, boolean clampResults) {
        advancedBlendOp(advancedBlendOp);
        srcPremultiplied(srcPremultiplied);
        dstPremultiplied(dstPremultiplied);
        blendOverlap(blendOverlap);
        clampResults(clampResults);
        return this;
    }

    public VkColorBlendAdvancedEXT set(VkColorBlendAdvancedEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkColorBlendAdvancedEXT malloc() {
        return new VkColorBlendAdvancedEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkColorBlendAdvancedEXT calloc() {
        return new VkColorBlendAdvancedEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkColorBlendAdvancedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkColorBlendAdvancedEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkColorBlendAdvancedEXT create(long address) {
        return new VkColorBlendAdvancedEXT(address, null);
    }

    public static VkColorBlendAdvancedEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkColorBlendAdvancedEXT(address, null);
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

    public static VkColorBlendAdvancedEXT malloc(MemoryStack stack) {
        return new VkColorBlendAdvancedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkColorBlendAdvancedEXT calloc(MemoryStack stack) {
        return new VkColorBlendAdvancedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nadvancedBlendOp(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCEDBLENDOP);
    }

    public static int nsrcPremultiplied(long struct) {
        return MemoryUtil.memGetInt(struct + SRCPREMULTIPLIED);
    }

    public static int ndstPremultiplied(long struct) {
        return MemoryUtil.memGetInt(struct + DSTPREMULTIPLIED);
    }

    public static int nblendOverlap(long struct) {
        return MemoryUtil.memGetInt(struct + BLENDOVERLAP);
    }

    public static int nclampResults(long struct) {
        return MemoryUtil.memGetInt(struct + CLAMPRESULTS);
    }

    public static void nadvancedBlendOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADVANCEDBLENDOP, value);
    }

    public static void nsrcPremultiplied(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCPREMULTIPLIED, value);
    }

    public static void ndstPremultiplied(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTPREMULTIPLIED, value);
    }

    public static void nblendOverlap(long struct, int value) {
        MemoryUtil.memPutInt(struct + BLENDOVERLAP, value);
    }

    public static void nclampResults(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLAMPRESULTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendAdvancedEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkColorBlendAdvancedEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkColorBlendAdvancedEXT, Buffer> implements NativeResource {
        private static final VkColorBlendAdvancedEXT ELEMENT_FACTORY = VkColorBlendAdvancedEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkColorBlendAdvancedEXT.SIZEOF);
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
        public VkColorBlendAdvancedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBlendOp")
        public int advancedBlendOp() {
            return VkColorBlendAdvancedEXT.nadvancedBlendOp(address());
        }

        @NativeType("VkBool32")
        public boolean srcPremultiplied() {
            return VkColorBlendAdvancedEXT.nsrcPremultiplied(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dstPremultiplied() {
            return VkColorBlendAdvancedEXT.ndstPremultiplied(address()) != 0;
        }

        @NativeType("VkBlendOverlapEXT")
        public int blendOverlap() {
            return VkColorBlendAdvancedEXT.nblendOverlap(address());
        }

        @NativeType("VkBool32")
        public boolean clampResults() {
            return VkColorBlendAdvancedEXT.nclampResults(address()) != 0;
        }

        public Buffer advancedBlendOp(@NativeType("VkBlendOp") int value) {
            VkColorBlendAdvancedEXT.nadvancedBlendOp(address(), value);
            return this;
        }

        public Buffer srcPremultiplied(@NativeType("VkBool32") boolean value) {
            VkColorBlendAdvancedEXT.nsrcPremultiplied(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dstPremultiplied(@NativeType("VkBool32") boolean value) {
            VkColorBlendAdvancedEXT.ndstPremultiplied(address(), value ? 1 : 0);
            return this;
        }

        public Buffer blendOverlap(@NativeType("VkBlendOverlapEXT") int value) {
            VkColorBlendAdvancedEXT.nblendOverlap(address(), value);
            return this;
        }

        public Buffer clampResults(@NativeType("VkBool32") boolean value) {
            VkColorBlendAdvancedEXT.nclampResults(address(), value ? 1 : 0);
            return this;
        }
    }
}
