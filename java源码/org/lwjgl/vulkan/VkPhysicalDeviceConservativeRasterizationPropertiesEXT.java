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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConservativeRasterizationPropertiesEXT.class */
public class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends Struct<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRIMITIVEOVERESTIMATIONSIZE;
    public static final int MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE;
    public static final int EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY;
    public static final int PRIMITIVEUNDERESTIMATION;
    public static final int CONSERVATIVEPOINTANDLINERASTERIZATION;
    public static final int DEGENERATETRIANGLESRASTERIZED;
    public static final int DEGENERATELINESRASTERIZED;
    public static final int FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE;
    public static final int CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(2);
        MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(3);
        EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY = layout.offsetof(4);
        PRIMITIVEUNDERESTIMATION = layout.offsetof(5);
        CONSERVATIVEPOINTANDLINERASTERIZATION = layout.offsetof(6);
        DEGENERATETRIANGLESRASTERIZED = layout.offsetof(7);
        DEGENERATELINESRASTERIZED = layout.offsetof(8);
        FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE = layout.offsetof(9);
        CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE = layout.offsetof(10);
    }

    protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(ByteBuffer container) {
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

    public float primitiveOverestimationSize() {
        return nprimitiveOverestimationSize(address());
    }

    public float maxExtraPrimitiveOverestimationSize() {
        return nmaxExtraPrimitiveOverestimationSize(address());
    }

    public float extraPrimitiveOverestimationSizeGranularity() {
        return nextraPrimitiveOverestimationSizeGranularity(address());
    }

    @NativeType("VkBool32")
    public boolean primitiveUnderestimation() {
        return nprimitiveUnderestimation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean conservativePointAndLineRasterization() {
        return nconservativePointAndLineRasterization(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean degenerateTrianglesRasterized() {
        return ndegenerateTrianglesRasterized(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean degenerateLinesRasterized() {
        return ndegenerateLinesRasterized(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean fullyCoveredFragmentShaderInputVariable() {
        return nfullyCoveredFragmentShaderInputVariable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean conservativeRasterizationPostDepthCoverage() {
        return nconservativeRasterizationPostDepthCoverage(address()) != 0;
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType$Default() {
        return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(VkPhysicalDeviceConservativeRasterizationPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT malloc() {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT calloc() {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create(long address) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static float nprimitiveOverestimationSize(long struct) {
        return MemoryUtil.memGetFloat(struct + PRIMITIVEOVERESTIMATIONSIZE);
    }

    public static float nmaxExtraPrimitiveOverestimationSize(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE);
    }

    public static float nextraPrimitiveOverestimationSizeGranularity(long struct) {
        return MemoryUtil.memGetFloat(struct + EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY);
    }

    public static int nprimitiveUnderestimation(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVEUNDERESTIMATION);
    }

    public static int nconservativePointAndLineRasterization(long struct) {
        return MemoryUtil.memGetInt(struct + CONSERVATIVEPOINTANDLINERASTERIZATION);
    }

    public static int ndegenerateTrianglesRasterized(long struct) {
        return MemoryUtil.memGetInt(struct + DEGENERATETRIANGLESRASTERIZED);
    }

    public static int ndegenerateLinesRasterized(long struct) {
        return MemoryUtil.memGetInt(struct + DEGENERATELINESRASTERIZED);
    }

    public static int nfullyCoveredFragmentShaderInputVariable(long struct) {
        return MemoryUtil.memGetInt(struct + FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE);
    }

    public static int nconservativeRasterizationPostDepthCoverage(long struct) {
        return MemoryUtil.memGetInt(struct + CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConservativeRasterizationPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceConservativeRasterizationPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceConservativeRasterizationPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceConservativeRasterizationPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceConservativeRasterizationPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceConservativeRasterizationPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address());
        }

        public float primitiveOverestimationSize() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveOverestimationSize(address());
        }

        public float maxExtraPrimitiveOverestimationSize() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nmaxExtraPrimitiveOverestimationSize(address());
        }

        public float extraPrimitiveOverestimationSizeGranularity() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nextraPrimitiveOverestimationSizeGranularity(address());
        }

        @NativeType("VkBool32")
        public boolean primitiveUnderestimation() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveUnderestimation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean conservativePointAndLineRasterization() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativePointAndLineRasterization(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean degenerateTrianglesRasterized() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateTrianglesRasterized(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean degenerateLinesRasterized() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateLinesRasterized(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean fullyCoveredFragmentShaderInputVariable() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nfullyCoveredFragmentShaderInputVariable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean conservativeRasterizationPostDepthCoverage() {
            return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativeRasterizationPostDepthCoverage(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTConservativeRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
