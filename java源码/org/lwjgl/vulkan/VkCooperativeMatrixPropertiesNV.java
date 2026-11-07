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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV.class */
public class VkCooperativeMatrixPropertiesNV extends Struct<VkCooperativeMatrixPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MSIZE;
    public static final int NSIZE;
    public static final int KSIZE;
    public static final int ATYPE;
    public static final int BTYPE;
    public static final int CTYPE;
    public static final int DTYPE;
    public static final int SCOPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MSIZE = layout.offsetof(2);
        NSIZE = layout.offsetof(3);
        KSIZE = layout.offsetof(4);
        ATYPE = layout.offsetof(5);
        BTYPE = layout.offsetof(6);
        CTYPE = layout.offsetof(7);
        DTYPE = layout.offsetof(8);
        SCOPE = layout.offsetof(9);
    }

    protected VkCooperativeMatrixPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCooperativeMatrixPropertiesNV create(long address, ByteBuffer container) {
        return new VkCooperativeMatrixPropertiesNV(address, container);
    }

    public VkCooperativeMatrixPropertiesNV(ByteBuffer container) {
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
    public int MSize() {
        return nMSize(address());
    }

    @NativeType("uint32_t")
    public int NSize() {
        return nNSize(address());
    }

    @NativeType("uint32_t")
    public int KSize() {
        return nKSize(address());
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
    public int DType() {
        return nDType(address());
    }

    @NativeType("VkScopeNV")
    public int scope() {
        return nscope(address());
    }

    public VkCooperativeMatrixPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCooperativeMatrixPropertiesNV sType$Default() {
        return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV);
    }

    public VkCooperativeMatrixPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCooperativeMatrixPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkCooperativeMatrixPropertiesNV set(VkCooperativeMatrixPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCooperativeMatrixPropertiesNV malloc() {
        return new VkCooperativeMatrixPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCooperativeMatrixPropertiesNV calloc() {
        return new VkCooperativeMatrixPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCooperativeMatrixPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeMatrixPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCooperativeMatrixPropertiesNV create(long address) {
        return new VkCooperativeMatrixPropertiesNV(address, null);
    }

    public static VkCooperativeMatrixPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCooperativeMatrixPropertiesNV(address, null);
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

    public static VkCooperativeMatrixPropertiesNV malloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCooperativeMatrixPropertiesNV calloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nMSize(long struct) {
        return MemoryUtil.memGetInt(struct + MSIZE);
    }

    public static int nNSize(long struct) {
        return MemoryUtil.memGetInt(struct + NSIZE);
    }

    public static int nKSize(long struct) {
        return MemoryUtil.memGetInt(struct + KSIZE);
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

    public static int nDType(long struct) {
        return MemoryUtil.memGetInt(struct + DTYPE);
    }

    public static int nscope(long struct) {
        return MemoryUtil.memGetInt(struct + SCOPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCooperativeMatrixPropertiesNV, Buffer> implements NativeResource {
        private static final VkCooperativeMatrixPropertiesNV ELEMENT_FACTORY = VkCooperativeMatrixPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCooperativeMatrixPropertiesNV.SIZEOF);
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
        public VkCooperativeMatrixPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCooperativeMatrixPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkCooperativeMatrixPropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int MSize() {
            return VkCooperativeMatrixPropertiesNV.nMSize(address());
        }

        @NativeType("uint32_t")
        public int NSize() {
            return VkCooperativeMatrixPropertiesNV.nNSize(address());
        }

        @NativeType("uint32_t")
        public int KSize() {
            return VkCooperativeMatrixPropertiesNV.nKSize(address());
        }

        @NativeType("VkComponentTypeNV")
        public int AType() {
            return VkCooperativeMatrixPropertiesNV.nAType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int BType() {
            return VkCooperativeMatrixPropertiesNV.nBType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int CType() {
            return VkCooperativeMatrixPropertiesNV.nCType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int DType() {
            return VkCooperativeMatrixPropertiesNV.nDType(address());
        }

        @NativeType("VkScopeNV")
        public int scope() {
            return VkCooperativeMatrixPropertiesNV.nscope(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCooperativeMatrixPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkCooperativeMatrixPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
