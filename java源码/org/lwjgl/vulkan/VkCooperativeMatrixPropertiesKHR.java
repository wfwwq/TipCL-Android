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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR.class */
public class VkCooperativeMatrixPropertiesKHR extends Struct<VkCooperativeMatrixPropertiesKHR> implements NativeResource {
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
    public static final int RESULTTYPE;
    public static final int SATURATINGACCUMULATION;
    public static final int SCOPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
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
        RESULTTYPE = layout.offsetof(8);
        SATURATINGACCUMULATION = layout.offsetof(9);
        SCOPE = layout.offsetof(10);
    }

    protected VkCooperativeMatrixPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCooperativeMatrixPropertiesKHR create(long address, ByteBuffer container) {
        return new VkCooperativeMatrixPropertiesKHR(address, container);
    }

    public VkCooperativeMatrixPropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkComponentTypeKHR")
    public int AType() {
        return nAType(address());
    }

    @NativeType("VkComponentTypeKHR")
    public int BType() {
        return nBType(address());
    }

    @NativeType("VkComponentTypeKHR")
    public int CType() {
        return nCType(address());
    }

    @NativeType("VkComponentTypeKHR")
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

    public VkCooperativeMatrixPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCooperativeMatrixPropertiesKHR sType$Default() {
        return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR);
    }

    public VkCooperativeMatrixPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCooperativeMatrixPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkCooperativeMatrixPropertiesKHR set(VkCooperativeMatrixPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCooperativeMatrixPropertiesKHR malloc() {
        return new VkCooperativeMatrixPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCooperativeMatrixPropertiesKHR calloc() {
        return new VkCooperativeMatrixPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCooperativeMatrixPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeMatrixPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCooperativeMatrixPropertiesKHR create(long address) {
        return new VkCooperativeMatrixPropertiesKHR(address, null);
    }

    public static VkCooperativeMatrixPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCooperativeMatrixPropertiesKHR(address, null);
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

    public static VkCooperativeMatrixPropertiesKHR malloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCooperativeMatrixPropertiesKHR calloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nResultType(long struct) {
        return MemoryUtil.memGetInt(struct + RESULTTYPE);
    }

    public static int nsaturatingAccumulation(long struct) {
        return MemoryUtil.memGetInt(struct + SATURATINGACCUMULATION);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkCooperativeMatrixPropertiesKHR, Buffer> implements NativeResource {
        private static final VkCooperativeMatrixPropertiesKHR ELEMENT_FACTORY = VkCooperativeMatrixPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCooperativeMatrixPropertiesKHR.SIZEOF);
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
        public VkCooperativeMatrixPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCooperativeMatrixPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkCooperativeMatrixPropertiesKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int MSize() {
            return VkCooperativeMatrixPropertiesKHR.nMSize(address());
        }

        @NativeType("uint32_t")
        public int NSize() {
            return VkCooperativeMatrixPropertiesKHR.nNSize(address());
        }

        @NativeType("uint32_t")
        public int KSize() {
            return VkCooperativeMatrixPropertiesKHR.nKSize(address());
        }

        @NativeType("VkComponentTypeKHR")
        public int AType() {
            return VkCooperativeMatrixPropertiesKHR.nAType(address());
        }

        @NativeType("VkComponentTypeKHR")
        public int BType() {
            return VkCooperativeMatrixPropertiesKHR.nBType(address());
        }

        @NativeType("VkComponentTypeKHR")
        public int CType() {
            return VkCooperativeMatrixPropertiesKHR.nCType(address());
        }

        @NativeType("VkComponentTypeKHR")
        public int ResultType() {
            return VkCooperativeMatrixPropertiesKHR.nResultType(address());
        }

        @NativeType("VkBool32")
        public boolean saturatingAccumulation() {
            return VkCooperativeMatrixPropertiesKHR.nsaturatingAccumulation(address()) != 0;
        }

        @NativeType("VkScopeKHR")
        public int scope() {
            return VkCooperativeMatrixPropertiesKHR.nscope(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCooperativeMatrixPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkCooperativeMatrixPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
