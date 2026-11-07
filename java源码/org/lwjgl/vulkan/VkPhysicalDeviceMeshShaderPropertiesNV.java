package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesNV.class */
public class VkPhysicalDeviceMeshShaderPropertiesNV extends Struct<VkPhysicalDeviceMeshShaderPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXDRAWMESHTASKSCOUNT;
    public static final int MAXTASKWORKGROUPINVOCATIONS;
    public static final int MAXTASKWORKGROUPSIZE;
    public static final int MAXTASKTOTALMEMORYSIZE;
    public static final int MAXTASKOUTPUTCOUNT;
    public static final int MAXMESHWORKGROUPINVOCATIONS;
    public static final int MAXMESHWORKGROUPSIZE;
    public static final int MAXMESHTOTALMEMORYSIZE;
    public static final int MAXMESHOUTPUTVERTICES;
    public static final int MAXMESHOUTPUTPRIMITIVES;
    public static final int MAXMESHMULTIVIEWVIEWCOUNT;
    public static final int MESHOUTPUTPERVERTEXGRANULARITY;
    public static final int MESHOUTPUTPERPRIMITIVEGRANULARITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __array(4, 3), __member(4), __member(4), __member(4), __array(4, 3), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXDRAWMESHTASKSCOUNT = layout.offsetof(2);
        MAXTASKWORKGROUPINVOCATIONS = layout.offsetof(3);
        MAXTASKWORKGROUPSIZE = layout.offsetof(4);
        MAXTASKTOTALMEMORYSIZE = layout.offsetof(5);
        MAXTASKOUTPUTCOUNT = layout.offsetof(6);
        MAXMESHWORKGROUPINVOCATIONS = layout.offsetof(7);
        MAXMESHWORKGROUPSIZE = layout.offsetof(8);
        MAXMESHTOTALMEMORYSIZE = layout.offsetof(9);
        MAXMESHOUTPUTVERTICES = layout.offsetof(10);
        MAXMESHOUTPUTPRIMITIVES = layout.offsetof(11);
        MAXMESHMULTIVIEWVIEWCOUNT = layout.offsetof(12);
        MESHOUTPUTPERVERTEXGRANULARITY = layout.offsetof(13);
        MESHOUTPUTPERPRIMITIVEGRANULARITY = layout.offsetof(14);
    }

    protected VkPhysicalDeviceMeshShaderPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMeshShaderPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMeshShaderPropertiesNV(address, container);
    }

    public VkPhysicalDeviceMeshShaderPropertiesNV(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxDrawMeshTasksCount() {
        return nmaxDrawMeshTasksCount(address());
    }

    @NativeType("uint32_t")
    public int maxTaskWorkGroupInvocations() {
        return nmaxTaskWorkGroupInvocations(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxTaskWorkGroupSize() {
        return nmaxTaskWorkGroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxTaskWorkGroupSize(int index) {
        return nmaxTaskWorkGroupSize(address(), index);
    }

    @NativeType("uint32_t")
    public int maxTaskTotalMemorySize() {
        return nmaxTaskTotalMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxTaskOutputCount() {
        return nmaxTaskOutputCount(address());
    }

    @NativeType("uint32_t")
    public int maxMeshWorkGroupInvocations() {
        return nmaxMeshWorkGroupInvocations(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxMeshWorkGroupSize() {
        return nmaxMeshWorkGroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxMeshWorkGroupSize(int index) {
        return nmaxMeshWorkGroupSize(address(), index);
    }

    @NativeType("uint32_t")
    public int maxMeshTotalMemorySize() {
        return nmaxMeshTotalMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxMeshOutputVertices() {
        return nmaxMeshOutputVertices(address());
    }

    @NativeType("uint32_t")
    public int maxMeshOutputPrimitives() {
        return nmaxMeshOutputPrimitives(address());
    }

    @NativeType("uint32_t")
    public int maxMeshMultiviewViewCount() {
        return nmaxMeshMultiviewViewCount(address());
    }

    @NativeType("uint32_t")
    public int meshOutputPerVertexGranularity() {
        return nmeshOutputPerVertexGranularity(address());
    }

    @NativeType("uint32_t")
    public int meshOutputPerPrimitiveGranularity() {
        return nmeshOutputPerPrimitiveGranularity(address());
    }

    public VkPhysicalDeviceMeshShaderPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderPropertiesNV sType$Default() {
        return sType(NVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
    }

    public VkPhysicalDeviceMeshShaderPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMeshShaderPropertiesNV set(VkPhysicalDeviceMeshShaderPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV malloc() {
        return new VkPhysicalDeviceMeshShaderPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV calloc() {
        return new VkPhysicalDeviceMeshShaderPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMeshShaderPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV create(long address) {
        return new VkPhysicalDeviceMeshShaderPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMeshShaderPropertiesNV(address, null);
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

    public static VkPhysicalDeviceMeshShaderPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxDrawMeshTasksCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDRAWMESHTASKSCOUNT);
    }

    public static int nmaxTaskWorkGroupInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTASKWORKGROUPINVOCATIONS);
    }

    public static IntBuffer nmaxTaskWorkGroupSize(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXTASKWORKGROUPSIZE, 3);
    }

    public static int nmaxTaskWorkGroupSize(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXTASKWORKGROUPSIZE + (Checks.check(index, 3) * 4));
    }

    public static int nmaxTaskTotalMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTASKTOTALMEMORYSIZE);
    }

    public static int nmaxTaskOutputCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTASKOUTPUTCOUNT);
    }

    public static int nmaxMeshWorkGroupInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHWORKGROUPINVOCATIONS);
    }

    public static IntBuffer nmaxMeshWorkGroupSize(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXMESHWORKGROUPSIZE, 3);
    }

    public static int nmaxMeshWorkGroupSize(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXMESHWORKGROUPSIZE + (Checks.check(index, 3) * 4));
    }

    public static int nmaxMeshTotalMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHTOTALMEMORYSIZE);
    }

    public static int nmaxMeshOutputVertices(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHOUTPUTVERTICES);
    }

    public static int nmaxMeshOutputPrimitives(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHOUTPUTPRIMITIVES);
    }

    public static int nmaxMeshMultiviewViewCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHMULTIVIEWVIEWCOUNT);
    }

    public static int nmeshOutputPerVertexGranularity(long struct) {
        return MemoryUtil.memGetInt(struct + MESHOUTPUTPERVERTEXGRANULARITY);
    }

    public static int nmeshOutputPerPrimitiveGranularity(long struct) {
        return MemoryUtil.memGetInt(struct + MESHOUTPUTPERPRIMITIVEGRANULARITY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderPropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMeshShaderPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMeshShaderPropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceMeshShaderPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxDrawMeshTasksCount() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxDrawMeshTasksCount(address());
        }

        @NativeType("uint32_t")
        public int maxTaskWorkGroupInvocations() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupInvocations(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxTaskWorkGroupSize() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxTaskWorkGroupSize(int index) {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupSize(address(), index);
        }

        @NativeType("uint32_t")
        public int maxTaskTotalMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskTotalMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxTaskOutputCount() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskOutputCount(address());
        }

        @NativeType("uint32_t")
        public int maxMeshWorkGroupInvocations() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupInvocations(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxMeshWorkGroupSize() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshWorkGroupSize(int index) {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupSize(address(), index);
        }

        @NativeType("uint32_t")
        public int maxMeshTotalMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshTotalMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshOutputVertices() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshOutputVertices(address());
        }

        @NativeType("uint32_t")
        public int maxMeshOutputPrimitives() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshOutputPrimitives(address());
        }

        @NativeType("uint32_t")
        public int maxMeshMultiviewViewCount() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshMultiviewViewCount(address());
        }

        @NativeType("uint32_t")
        public int meshOutputPerVertexGranularity() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmeshOutputPerVertexGranularity(address());
        }

        @NativeType("uint32_t")
        public int meshOutputPerPrimitiveGranularity() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.nmeshOutputPerPrimitiveGranularity(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMeshShaderPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMeshShaderPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
