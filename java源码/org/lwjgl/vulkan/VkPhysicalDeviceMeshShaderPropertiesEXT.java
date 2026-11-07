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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT.class */
public class VkPhysicalDeviceMeshShaderPropertiesEXT extends Struct<VkPhysicalDeviceMeshShaderPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXTASKWORKGROUPTOTALCOUNT;
    public static final int MAXTASKWORKGROUPCOUNT;
    public static final int MAXTASKWORKGROUPINVOCATIONS;
    public static final int MAXTASKWORKGROUPSIZE;
    public static final int MAXTASKPAYLOADSIZE;
    public static final int MAXTASKSHAREDMEMORYSIZE;
    public static final int MAXTASKPAYLOADANDSHAREDMEMORYSIZE;
    public static final int MAXMESHWORKGROUPTOTALCOUNT;
    public static final int MAXMESHWORKGROUPCOUNT;
    public static final int MAXMESHWORKGROUPINVOCATIONS;
    public static final int MAXMESHWORKGROUPSIZE;
    public static final int MAXMESHSHAREDMEMORYSIZE;
    public static final int MAXMESHPAYLOADANDSHAREDMEMORYSIZE;
    public static final int MAXMESHOUTPUTMEMORYSIZE;
    public static final int MAXMESHPAYLOADANDOUTPUTMEMORYSIZE;
    public static final int MAXMESHOUTPUTCOMPONENTS;
    public static final int MAXMESHOUTPUTVERTICES;
    public static final int MAXMESHOUTPUTPRIMITIVES;
    public static final int MAXMESHOUTPUTLAYERS;
    public static final int MAXMESHMULTIVIEWVIEWCOUNT;
    public static final int MESHOUTPUTPERVERTEXGRANULARITY;
    public static final int MESHOUTPUTPERPRIMITIVEGRANULARITY;
    public static final int MAXPREFERREDTASKWORKGROUPINVOCATIONS;
    public static final int MAXPREFERREDMESHWORKGROUPINVOCATIONS;
    public static final int PREFERSLOCALINVOCATIONVERTEXOUTPUT;
    public static final int PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT;
    public static final int PREFERSCOMPACTVERTEXOUTPUT;
    public static final int PREFERSCOMPACTPRIMITIVEOUTPUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(4, 3), __member(4), __array(4, 3), __member(4), __member(4), __member(4), __member(4), __array(4, 3), __member(4), __array(4, 3), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXTASKWORKGROUPTOTALCOUNT = layout.offsetof(2);
        MAXTASKWORKGROUPCOUNT = layout.offsetof(3);
        MAXTASKWORKGROUPINVOCATIONS = layout.offsetof(4);
        MAXTASKWORKGROUPSIZE = layout.offsetof(5);
        MAXTASKPAYLOADSIZE = layout.offsetof(6);
        MAXTASKSHAREDMEMORYSIZE = layout.offsetof(7);
        MAXTASKPAYLOADANDSHAREDMEMORYSIZE = layout.offsetof(8);
        MAXMESHWORKGROUPTOTALCOUNT = layout.offsetof(9);
        MAXMESHWORKGROUPCOUNT = layout.offsetof(10);
        MAXMESHWORKGROUPINVOCATIONS = layout.offsetof(11);
        MAXMESHWORKGROUPSIZE = layout.offsetof(12);
        MAXMESHSHAREDMEMORYSIZE = layout.offsetof(13);
        MAXMESHPAYLOADANDSHAREDMEMORYSIZE = layout.offsetof(14);
        MAXMESHOUTPUTMEMORYSIZE = layout.offsetof(15);
        MAXMESHPAYLOADANDOUTPUTMEMORYSIZE = layout.offsetof(16);
        MAXMESHOUTPUTCOMPONENTS = layout.offsetof(17);
        MAXMESHOUTPUTVERTICES = layout.offsetof(18);
        MAXMESHOUTPUTPRIMITIVES = layout.offsetof(19);
        MAXMESHOUTPUTLAYERS = layout.offsetof(20);
        MAXMESHMULTIVIEWVIEWCOUNT = layout.offsetof(21);
        MESHOUTPUTPERVERTEXGRANULARITY = layout.offsetof(22);
        MESHOUTPUTPERPRIMITIVEGRANULARITY = layout.offsetof(23);
        MAXPREFERREDTASKWORKGROUPINVOCATIONS = layout.offsetof(24);
        MAXPREFERREDMESHWORKGROUPINVOCATIONS = layout.offsetof(25);
        PREFERSLOCALINVOCATIONVERTEXOUTPUT = layout.offsetof(26);
        PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT = layout.offsetof(27);
        PREFERSCOMPACTVERTEXOUTPUT = layout.offsetof(28);
        PREFERSCOMPACTPRIMITIVEOUTPUT = layout.offsetof(29);
    }

    protected VkPhysicalDeviceMeshShaderPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMeshShaderPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceMeshShaderPropertiesEXT(ByteBuffer container) {
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
    public int maxTaskWorkGroupTotalCount() {
        return nmaxTaskWorkGroupTotalCount(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxTaskWorkGroupCount() {
        return nmaxTaskWorkGroupCount(address());
    }

    @NativeType("uint32_t")
    public int maxTaskWorkGroupCount(int index) {
        return nmaxTaskWorkGroupCount(address(), index);
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
    public int maxTaskPayloadSize() {
        return nmaxTaskPayloadSize(address());
    }

    @NativeType("uint32_t")
    public int maxTaskSharedMemorySize() {
        return nmaxTaskSharedMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxTaskPayloadAndSharedMemorySize() {
        return nmaxTaskPayloadAndSharedMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxMeshWorkGroupTotalCount() {
        return nmaxMeshWorkGroupTotalCount(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxMeshWorkGroupCount() {
        return nmaxMeshWorkGroupCount(address());
    }

    @NativeType("uint32_t")
    public int maxMeshWorkGroupCount(int index) {
        return nmaxMeshWorkGroupCount(address(), index);
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
    public int maxMeshSharedMemorySize() {
        return nmaxMeshSharedMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxMeshPayloadAndSharedMemorySize() {
        return nmaxMeshPayloadAndSharedMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxMeshOutputMemorySize() {
        return nmaxMeshOutputMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxMeshPayloadAndOutputMemorySize() {
        return nmaxMeshPayloadAndOutputMemorySize(address());
    }

    @NativeType("uint32_t")
    public int maxMeshOutputComponents() {
        return nmaxMeshOutputComponents(address());
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
    public int maxMeshOutputLayers() {
        return nmaxMeshOutputLayers(address());
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

    @NativeType("uint32_t")
    public int maxPreferredTaskWorkGroupInvocations() {
        return nmaxPreferredTaskWorkGroupInvocations(address());
    }

    @NativeType("uint32_t")
    public int maxPreferredMeshWorkGroupInvocations() {
        return nmaxPreferredMeshWorkGroupInvocations(address());
    }

    @NativeType("VkBool32")
    public boolean prefersLocalInvocationVertexOutput() {
        return nprefersLocalInvocationVertexOutput(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean prefersLocalInvocationPrimitiveOutput() {
        return nprefersLocalInvocationPrimitiveOutput(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean prefersCompactVertexOutput() {
        return nprefersCompactVertexOutput(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean prefersCompactPrimitiveOutput() {
        return nprefersCompactPrimitiveOutput(address()) != 0;
    }

    public VkPhysicalDeviceMeshShaderPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderPropertiesEXT sType$Default() {
        return sType(1000328001);
    }

    public VkPhysicalDeviceMeshShaderPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMeshShaderPropertiesEXT set(VkPhysicalDeviceMeshShaderPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT malloc() {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT calloc() {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT create(long address) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceMeshShaderPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxTaskWorkGroupTotalCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTASKWORKGROUPTOTALCOUNT);
    }

    public static IntBuffer nmaxTaskWorkGroupCount(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXTASKWORKGROUPCOUNT, 3);
    }

    public static int nmaxTaskWorkGroupCount(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXTASKWORKGROUPCOUNT + (Checks.check(index, 3) * 4));
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

    public static int nmaxTaskPayloadSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTASKPAYLOADSIZE);
    }

    public static int nmaxTaskSharedMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTASKSHAREDMEMORYSIZE);
    }

    public static int nmaxTaskPayloadAndSharedMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTASKPAYLOADANDSHAREDMEMORYSIZE);
    }

    public static int nmaxMeshWorkGroupTotalCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHWORKGROUPTOTALCOUNT);
    }

    public static IntBuffer nmaxMeshWorkGroupCount(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXMESHWORKGROUPCOUNT, 3);
    }

    public static int nmaxMeshWorkGroupCount(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXMESHWORKGROUPCOUNT + (Checks.check(index, 3) * 4));
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

    public static int nmaxMeshSharedMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHSHAREDMEMORYSIZE);
    }

    public static int nmaxMeshPayloadAndSharedMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHPAYLOADANDSHAREDMEMORYSIZE);
    }

    public static int nmaxMeshOutputMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHOUTPUTMEMORYSIZE);
    }

    public static int nmaxMeshPayloadAndOutputMemorySize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHPAYLOADANDOUTPUTMEMORYSIZE);
    }

    public static int nmaxMeshOutputComponents(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHOUTPUTCOMPONENTS);
    }

    public static int nmaxMeshOutputVertices(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHOUTPUTVERTICES);
    }

    public static int nmaxMeshOutputPrimitives(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHOUTPUTPRIMITIVES);
    }

    public static int nmaxMeshOutputLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMESHOUTPUTLAYERS);
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

    public static int nmaxPreferredTaskWorkGroupInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPREFERREDTASKWORKGROUPINVOCATIONS);
    }

    public static int nmaxPreferredMeshWorkGroupInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPREFERREDMESHWORKGROUPINVOCATIONS);
    }

    public static int nprefersLocalInvocationVertexOutput(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERSLOCALINVOCATIONVERTEXOUTPUT);
    }

    public static int nprefersLocalInvocationPrimitiveOutput(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT);
    }

    public static int nprefersCompactVertexOutput(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERSCOMPACTVERTEXOUTPUT);
    }

    public static int nprefersCompactPrimitiveOutput(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERSCOMPACTPRIMITIVEOUTPUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMeshShaderPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceMeshShaderPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxTaskWorkGroupTotalCount() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupTotalCount(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxTaskWorkGroupCount() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupCount(address());
        }

        @NativeType("uint32_t")
        public int maxTaskWorkGroupCount(int index) {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupCount(address(), index);
        }

        @NativeType("uint32_t")
        public int maxTaskWorkGroupInvocations() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupInvocations(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxTaskWorkGroupSize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxTaskWorkGroupSize(int index) {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupSize(address(), index);
        }

        @NativeType("uint32_t")
        public int maxTaskPayloadSize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskPayloadSize(address());
        }

        @NativeType("uint32_t")
        public int maxTaskSharedMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskSharedMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxTaskPayloadAndSharedMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskPayloadAndSharedMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshWorkGroupTotalCount() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupTotalCount(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxMeshWorkGroupCount() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupCount(address());
        }

        @NativeType("uint32_t")
        public int maxMeshWorkGroupCount(int index) {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupCount(address(), index);
        }

        @NativeType("uint32_t")
        public int maxMeshWorkGroupInvocations() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupInvocations(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxMeshWorkGroupSize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshWorkGroupSize(int index) {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupSize(address(), index);
        }

        @NativeType("uint32_t")
        public int maxMeshSharedMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshSharedMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshPayloadAndSharedMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshPayloadAndSharedMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshOutputMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshPayloadAndOutputMemorySize() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshPayloadAndOutputMemorySize(address());
        }

        @NativeType("uint32_t")
        public int maxMeshOutputComponents() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputComponents(address());
        }

        @NativeType("uint32_t")
        public int maxMeshOutputVertices() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputVertices(address());
        }

        @NativeType("uint32_t")
        public int maxMeshOutputPrimitives() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputPrimitives(address());
        }

        @NativeType("uint32_t")
        public int maxMeshOutputLayers() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputLayers(address());
        }

        @NativeType("uint32_t")
        public int maxMeshMultiviewViewCount() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshMultiviewViewCount(address());
        }

        @NativeType("uint32_t")
        public int meshOutputPerVertexGranularity() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmeshOutputPerVertexGranularity(address());
        }

        @NativeType("uint32_t")
        public int meshOutputPerPrimitiveGranularity() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmeshOutputPerPrimitiveGranularity(address());
        }

        @NativeType("uint32_t")
        public int maxPreferredTaskWorkGroupInvocations() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxPreferredTaskWorkGroupInvocations(address());
        }

        @NativeType("uint32_t")
        public int maxPreferredMeshWorkGroupInvocations() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxPreferredMeshWorkGroupInvocations(address());
        }

        @NativeType("VkBool32")
        public boolean prefersLocalInvocationVertexOutput() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersLocalInvocationVertexOutput(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean prefersLocalInvocationPrimitiveOutput() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersLocalInvocationPrimitiveOutput(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean prefersCompactVertexOutput() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersCompactVertexOutput(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean prefersCompactPrimitiveOutput() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersCompactPrimitiveOutput(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMeshShaderPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000328001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMeshShaderPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
