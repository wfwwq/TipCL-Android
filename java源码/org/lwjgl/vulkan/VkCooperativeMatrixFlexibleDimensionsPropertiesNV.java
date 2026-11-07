package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixFlexibleDimensionsPropertiesNV.class */
public class VkCooperativeMatrixFlexibleDimensionsPropertiesNV extends Struct<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MGRANULARITY;
    public static final int NGRANULARITY;
    public static final int KGRANULARITY;
    public static final int ATYPE;
    public static final int BTYPE;
    public static final int CTYPE;
    public static final int RESULTTYPE;
    public static final int SATURATINGACCUMULATION;
    public static final int SCOPE;
    public static final int WORKGROUPINVOCATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MGRANULARITY = layout.offsetof(2);
        NGRANULARITY = layout.offsetof(3);
        KGRANULARITY = layout.offsetof(4);
        ATYPE = layout.offsetof(5);
        BTYPE = layout.offsetof(6);
        CTYPE = layout.offsetof(7);
        RESULTTYPE = layout.offsetof(8);
        SATURATINGACCUMULATION = layout.offsetof(9);
        SCOPE = layout.offsetof(10);
        WORKGROUPINVOCATIONS = layout.offsetof(11);
    }

    protected VkCooperativeMatrixFlexibleDimensionsPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV create(long address, ByteBuffer container) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(address, container);
    }

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV(ByteBuffer container) {
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
    public int MGranularity() {
        return nMGranularity(address());
    }

    @NativeType("uint32_t")
    public int NGranularity() {
        return nNGranularity(address());
    }

    @NativeType("uint32_t")
    public int KGranularity() {
        return nKGranularity(address());
    }

    @NativeType("VkComponentTypeNV")
    public int AType() {
        return nAType(address());
    }

    @NativeType("VkComponentTypeNV")
    public int BType() {
        return nBType(address());
    }

    @NativeType("VkComponentTypeNV")
    public int CType() {
        return nCType(address());
    }

    @NativeType("VkComponentTypeNV")
    public int ResultType() {
        return nResultType(address());
    }

    @NativeType("VkBool32")
    public boolean saturatingAccumulation() {
        return nsaturatingAccumulation(address()) != 0;
    }

    @NativeType("VkScopeKHR")
    public int scope() {
        return nscope(address());
    }

    @NativeType("uint32_t")
    public int workgroupInvocations() {
        return nworkgroupInvocations(address());
    }

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV sType$Default() {
        return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV);
    }

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV set(VkCooperativeMatrixFlexibleDimensionsPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV malloc() {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV calloc() {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV create(long address) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(address, null);
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(address, null);
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

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV malloc(MemoryStack stack) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV calloc(MemoryStack stack) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nMGranularity(long struct) {
        return MemoryUtil.memGetInt(struct + MGRANULARITY);
    }

    public static int nNGranularity(long struct) {
        return MemoryUtil.memGetInt(struct + NGRANULARITY);
    }

    public static int nKGranularity(long struct) {
        return MemoryUtil.memGetInt(struct + KGRANULARITY);
    }

    public static int nAType(long struct) {
        return MemoryUtil.memGetInt(struct + ATYPE);
    }

    public static int nBType(long struct) {
        return MemoryUtil.memGetInt(struct + BTYPE);
    }

    public static int nCType(long struct) {
        return MemoryUtil.memGetInt(struct + CTYPE);
    }

    public static int nResultType(long struct) {
        return MemoryUtil.memGetInt(struct + RESULTTYPE);
    }

    public static int nsaturatingAccumulation(long struct) {
        return MemoryUtil.memGetInt(struct + SATURATINGACCUMULATION);
    }

    public static int nscope(long struct) {
        return MemoryUtil.memGetInt(struct + SCOPE);
    }

    public static int nworkgroupInvocations(long struct) {
        return MemoryUtil.memGetInt(struct + WORKGROUPINVOCATIONS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixFlexibleDimensionsPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCooperativeMatrixFlexibleDimensionsPropertiesNV, Buffer> implements NativeResource {
        private static final VkCooperativeMatrixFlexibleDimensionsPropertiesNV ELEMENT_FACTORY = VkCooperativeMatrixFlexibleDimensionsPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCooperativeMatrixFlexibleDimensionsPropertiesNV.SIZEOF);
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
        public VkCooperativeMatrixFlexibleDimensionsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int MGranularity() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nMGranularity(address());
        }

        @NativeType("uint32_t")
        public int NGranularity() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nNGranularity(address());
        }

        @NativeType("uint32_t")
        public int KGranularity() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nKGranularity(address());
        }

        @NativeType("VkComponentTypeNV")
        public int AType() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nAType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int BType() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nBType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int CType() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nCType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int ResultType() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nResultType(address());
        }

        @NativeType("VkBool32")
        public boolean saturatingAccumulation() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nsaturatingAccumulation(address()) != 0;
        }

        @NativeType("VkScopeKHR")
        public int scope() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nscope(address());
        }

        @NativeType("uint32_t")
        public int workgroupInvocations() {
            return VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nworkgroupInvocations(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCooperativeMatrixFlexibleDimensionsPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkCooperativeMatrixFlexibleDimensionsPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
