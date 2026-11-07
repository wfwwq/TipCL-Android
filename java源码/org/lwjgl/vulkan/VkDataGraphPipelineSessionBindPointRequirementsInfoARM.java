package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineSessionBindPointRequirementsInfoARM.class */
public class VkDataGraphPipelineSessionBindPointRequirementsInfoARM extends Struct<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SESSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
    }

    protected VkDataGraphPipelineSessionBindPointRequirementsInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(address, container);
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM(ByteBuffer container) {
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

    @NativeType("VkDataGraphPipelineSessionARM")
    public long session() {
        return nsession(address());
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM);
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM session(@NativeType("VkDataGraphPipelineSessionARM") long value) {
        nsession(address(), value);
        return this;
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM set(int sType, long pNext, long session) {
        sType(sType);
        pNext(pNext);
        session(session);
        return this;
    }

    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM set(VkDataGraphPipelineSessionBindPointRequirementsInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM malloc() {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM calloc() {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM create(long address) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(address, null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(address, null);
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

    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsession(long struct) {
        return MemoryUtil.memGetLong(struct + SESSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsession(long struct, long value) {
        MemoryUtil.memPutLong(struct + SESSION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineSessionBindPointRequirementsInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSessionBindPointRequirementsInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineSessionBindPointRequirementsInfoARM ELEMENT_FACTORY = VkDataGraphPipelineSessionBindPointRequirementsInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineSessionBindPointRequirementsInfoARM.SIZEOF);
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
        public VkDataGraphPipelineSessionBindPointRequirementsInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineSessionBindPointRequirementsInfoARM.npNext(address());
        }

        @NativeType("VkDataGraphPipelineSessionARM")
        public long session() {
            return VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsession(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineSessionBindPointRequirementsInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer session(@NativeType("VkDataGraphPipelineSessionARM") long value) {
            VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsession(address(), value);
            return this;
        }
    }
}
