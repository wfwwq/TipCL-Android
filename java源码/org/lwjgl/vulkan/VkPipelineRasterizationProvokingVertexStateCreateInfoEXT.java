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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.class */
public class VkPipelineRasterizationProvokingVertexStateCreateInfoEXT extends Struct<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROVOKINGVERTEXMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROVOKINGVERTEXMODE = layout.offsetof(2);
    }

    protected VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(address, container);
    }

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkProvokingVertexModeEXT")
    public int provokingVertexMode() {
        return nprovokingVertexMode(address());
    }

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType$Default() {
        return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT);
    }

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT provokingVertexMode(@NativeType("VkProvokingVertexModeEXT") int value) {
        nprovokingVertexMode(address(), value);
        return this;
    }

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(int sType, long pNext, int provokingVertexMode) {
        sType(sType);
        pNext(pNext);
        provokingVertexMode(provokingVertexMode);
        return this;
    }

    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT malloc() {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT calloc() {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create(long address) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(address, null);
    }

    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(address, null);
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

    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprovokingVertexMode(long struct) {
        return MemoryUtil.memGetInt(struct + PROVOKINGVERTEXMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprovokingVertexMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROVOKINGVERTEXMODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationProvokingVertexStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationProvokingVertexStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineRasterizationProvokingVertexStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.SIZEOF);
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
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.npNext(address());
        }

        @NativeType("VkProvokingVertexModeEXT")
        public int provokingVertexMode() {
            return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nprovokingVertexMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer provokingVertexMode(@NativeType("VkProvokingVertexModeEXT") int value) {
            VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nprovokingVertexMode(address(), value);
            return this;
        }
    }
}
