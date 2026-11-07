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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAdvancedStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAdvancedStateCreateInfoEXT.class */
public class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends Struct<VkPipelineColorBlendAdvancedStateCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCPREMULTIPLIED;
    public static final int DSTPREMULTIPLIED;
    public static final int BLENDOVERLAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCPREMULTIPLIED = layout.offsetof(2);
        DSTPREMULTIPLIED = layout.offsetof(3);
        BLENDOVERLAP = layout.offsetof(4);
    }

    protected VkPipelineColorBlendAdvancedStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(address, container);
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(ByteBuffer container) {
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

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType$Default() {
        return sType(1000148002);
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultiplied(@NativeType("VkBool32") boolean value) {
        nsrcPremultiplied(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultiplied(@NativeType("VkBool32") boolean value) {
        ndstPremultiplied(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlap(@NativeType("VkBlendOverlapEXT") int value) {
        nblendOverlap(address(), value);
        return this;
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(int sType, long pNext, boolean srcPremultiplied, boolean dstPremultiplied, int blendOverlap) {
        sType(sType);
        pNext(pNext);
        srcPremultiplied(srcPremultiplied);
        dstPremultiplied(dstPremultiplied);
        blendOverlap(blendOverlap);
        return this;
    }

    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(VkPipelineColorBlendAdvancedStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT malloc() {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT calloc() {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT create(long address) {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(address, null);
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(address, null);
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

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsrcPremultiplied(long struct) {
        return MemoryUtil.memGetInt(struct + SRCPREMULTIPLIED);
    }

    public static int ndstPremultiplied(long struct) {
        return MemoryUtil.memGetInt(struct + DSTPREMULTIPLIED);
    }

    public static int nblendOverlap(long struct) {
        return MemoryUtil.memGetInt(struct + BLENDOVERLAP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAdvancedStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendAdvancedStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendAdvancedStateCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineColorBlendAdvancedStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineColorBlendAdvancedStateCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineColorBlendAdvancedStateCreateInfoEXT.SIZEOF);
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
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineColorBlendAdvancedStateCreateInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean srcPremultiplied() {
            return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsrcPremultiplied(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean dstPremultiplied() {
            return VkPipelineColorBlendAdvancedStateCreateInfoEXT.ndstPremultiplied(address()) != 0;
        }

        @NativeType("VkBlendOverlapEXT")
        public int blendOverlap() {
            return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nblendOverlap(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000148002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineColorBlendAdvancedStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer srcPremultiplied(@NativeType("VkBool32") boolean value) {
            VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsrcPremultiplied(address(), value ? 1 : 0);
            return this;
        }

        public Buffer dstPremultiplied(@NativeType("VkBool32") boolean value) {
            VkPipelineColorBlendAdvancedStateCreateInfoEXT.ndstPremultiplied(address(), value ? 1 : 0);
            return this;
        }

        public Buffer blendOverlap(@NativeType("VkBlendOverlapEXT") int value) {
            VkPipelineColorBlendAdvancedStateCreateInfoEXT.nblendOverlap(address(), value);
            return this;
        }
    }
}
