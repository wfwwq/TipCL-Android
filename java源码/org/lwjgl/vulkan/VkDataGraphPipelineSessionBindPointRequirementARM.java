package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineSessionBindPointRequirementARM.class */
public class VkDataGraphPipelineSessionBindPointRequirementARM extends Struct<VkDataGraphPipelineSessionBindPointRequirementARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BINDPOINT;
    public static final int BINDPOINTTYPE;
    public static final int NUMOBJECTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BINDPOINT = layout.offsetof(2);
        BINDPOINTTYPE = layout.offsetof(3);
        NUMOBJECTS = layout.offsetof(4);
    }

    protected VkDataGraphPipelineSessionBindPointRequirementARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineSessionBindPointRequirementARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineSessionBindPointRequirementARM(address, container);
    }

    public VkDataGraphPipelineSessionBindPointRequirementARM(ByteBuffer container) {
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

    @NativeType("VkDataGraphPipelineSessionBindPointARM")
    public int bindPoint() {
        return nbindPoint(address());
    }

    @NativeType("VkDataGraphPipelineSessionBindPointTypeARM")
    public int bindPointType() {
        return nbindPointType(address());
    }

    @NativeType("uint32_t")
    public int numObjects() {
        return nnumObjects(address());
    }

    public VkDataGraphPipelineSessionBindPointRequirementARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionBindPointRequirementARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM);
    }

    public VkDataGraphPipelineSessionBindPointRequirementARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionBindPointRequirementARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDataGraphPipelineSessionBindPointRequirementARM set(VkDataGraphPipelineSessionBindPointRequirementARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineSessionBindPointRequirementARM malloc() {
        return new VkDataGraphPipelineSessionBindPointRequirementARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementARM calloc() {
        return new VkDataGraphPipelineSessionBindPointRequirementARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSessionBindPointRequirementARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementARM create(long address) {
        return new VkDataGraphPipelineSessionBindPointRequirementARM(address, null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineSessionBindPointRequirementARM(address, null);
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

    public static VkDataGraphPipelineSessionBindPointRequirementARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionBindPointRequirementARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionBindPointRequirementARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nbindPoint(long struct) {
        return MemoryUtil.memGetInt(struct + BINDPOINT);
    }

    public static int nbindPointType(long struct) {
        return MemoryUtil.memGetInt(struct + BINDPOINTTYPE);
    }

    public static int nnumObjects(long struct) {
        return MemoryUtil.memGetInt(struct + NUMOBJECTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineSessionBindPointRequirementARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSessionBindPointRequirementARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineSessionBindPointRequirementARM ELEMENT_FACTORY = VkDataGraphPipelineSessionBindPointRequirementARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineSessionBindPointRequirementARM.SIZEOF);
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
        public VkDataGraphPipelineSessionBindPointRequirementARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineSessionBindPointRequirementARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDataGraphPipelineSessionBindPointRequirementARM.npNext(address());
        }

        @NativeType("VkDataGraphPipelineSessionBindPointARM")
        public int bindPoint() {
            return VkDataGraphPipelineSessionBindPointRequirementARM.nbindPoint(address());
        }

        @NativeType("VkDataGraphPipelineSessionBindPointTypeARM")
        public int bindPointType() {
            return VkDataGraphPipelineSessionBindPointRequirementARM.nbindPointType(address());
        }

        @NativeType("uint32_t")
        public int numObjects() {
            return VkDataGraphPipelineSessionBindPointRequirementARM.nnumObjects(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineSessionBindPointRequirementARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENT_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDataGraphPipelineSessionBindPointRequirementARM.npNext(address(), value);
            return this;
        }
    }
}
