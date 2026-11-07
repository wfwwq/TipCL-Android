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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationDepthClipStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationDepthClipStateCreateInfoEXT.class */
public class VkPipelineRasterizationDepthClipStateCreateInfoEXT extends Struct<VkPipelineRasterizationDepthClipStateCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DEPTHCLIPENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEPTHCLIPENABLE = layout.offsetof(3);
    }

    protected VkPipelineRasterizationDepthClipStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(address, container);
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBool32")
    public boolean depthClipEnable() {
        return ndepthClipEnable(address()) != 0;
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sType$Default() {
        return sType(EXTDepthClipEnable.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT);
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT flags(@NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT depthClipEnable(@NativeType("VkBool32") boolean value) {
        ndepthClipEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT set(int sType, long pNext, int flags, boolean depthClipEnable) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        depthClipEnable(depthClipEnable);
        return this;
    }

    public VkPipelineRasterizationDepthClipStateCreateInfoEXT set(VkPipelineRasterizationDepthClipStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT malloc() {
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT calloc() {
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT create(long address) {
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(address, null);
    }

    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(address, null);
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

    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ndepthClipEnable(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHCLIPENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndepthClipEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHCLIPENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationDepthClipStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationDepthClipStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationDepthClipStateCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineRasterizationDepthClipStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationDepthClipStateCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRasterizationDepthClipStateCreateInfoEXT.SIZEOF);
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
        public VkPipelineRasterizationDepthClipStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRasterizationDepthClipStateCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRasterizationDepthClipStateCreateInfoEXT.npNext(address());
        }

        @NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT")
        public int flags() {
            return VkPipelineRasterizationDepthClipStateCreateInfoEXT.nflags(address());
        }

        @NativeType("VkBool32")
        public boolean depthClipEnable() {
            return VkPipelineRasterizationDepthClipStateCreateInfoEXT.ndepthClipEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationDepthClipStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDepthClipEnable.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationDepthClipStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) {
            VkPipelineRasterizationDepthClipStateCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer depthClipEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRasterizationDepthClipStateCreateInfoEXT.ndepthClipEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
