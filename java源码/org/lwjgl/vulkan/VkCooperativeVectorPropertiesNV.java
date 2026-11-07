package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeVectorPropertiesNV.class */
public class VkCooperativeVectorPropertiesNV extends Struct<VkCooperativeVectorPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INPUTTYPE;
    public static final int INPUTINTERPRETATION;
    public static final int MATRIXINTERPRETATION;
    public static final int BIASINTERPRETATION;
    public static final int RESULTTYPE;
    public static final int TRANSPOSE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INPUTTYPE = layout.offsetof(2);
        INPUTINTERPRETATION = layout.offsetof(3);
        MATRIXINTERPRETATION = layout.offsetof(4);
        BIASINTERPRETATION = layout.offsetof(5);
        RESULTTYPE = layout.offsetof(6);
        TRANSPOSE = layout.offsetof(7);
    }

    protected VkCooperativeVectorPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCooperativeVectorPropertiesNV create(long address, ByteBuffer container) {
        return new VkCooperativeVectorPropertiesNV(address, container);
    }

    public VkCooperativeVectorPropertiesNV(ByteBuffer container) {
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

    @NativeType("VkComponentTypeNV")
    public int inputType() {
        return ninputType(address());
    }

    @NativeType("VkComponentTypeNV")
    public int inputInterpretation() {
        return ninputInterpretation(address());
    }

    @NativeType("VkComponentTypeNV")
    public int matrixInterpretation() {
        return nmatrixInterpretation(address());
    }

    @NativeType("VkComponentTypeNV")
    public int biasInterpretation() {
        return nbiasInterpretation(address());
    }

    @NativeType("VkComponentTypeNV")
    public int resultType() {
        return nresultType(address());
    }

    @NativeType("VkBool32")
    public boolean transpose() {
        return ntranspose(address()) != 0;
    }

    public VkCooperativeVectorPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCooperativeVectorPropertiesNV sType$Default() {
        return sType(1000491002);
    }

    public VkCooperativeVectorPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCooperativeVectorPropertiesNV inputType(@NativeType("VkComponentTypeNV") int value) {
        ninputType(address(), value);
        return this;
    }

    public VkCooperativeVectorPropertiesNV inputInterpretation(@NativeType("VkComponentTypeNV") int value) {
        ninputInterpretation(address(), value);
        return this;
    }

    public VkCooperativeVectorPropertiesNV matrixInterpretation(@NativeType("VkComponentTypeNV") int value) {
        nmatrixInterpretation(address(), value);
        return this;
    }

    public VkCooperativeVectorPropertiesNV biasInterpretation(@NativeType("VkComponentTypeNV") int value) {
        nbiasInterpretation(address(), value);
        return this;
    }

    public VkCooperativeVectorPropertiesNV resultType(@NativeType("VkComponentTypeNV") int value) {
        nresultType(address(), value);
        return this;
    }

    public VkCooperativeVectorPropertiesNV transpose(@NativeType("VkBool32") boolean value) {
        ntranspose(address(), value ? 1 : 0);
        return this;
    }

    public VkCooperativeVectorPropertiesNV set(int sType, long pNext, int inputType, int inputInterpretation, int matrixInterpretation, int biasInterpretation, int resultType, boolean transpose) {
        sType(sType);
        pNext(pNext);
        inputType(inputType);
        inputInterpretation(inputInterpretation);
        matrixInterpretation(matrixInterpretation);
        biasInterpretation(biasInterpretation);
        resultType(resultType);
        transpose(transpose);
        return this;
    }

    public VkCooperativeVectorPropertiesNV set(VkCooperativeVectorPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCooperativeVectorPropertiesNV malloc() {
        return new VkCooperativeVectorPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCooperativeVectorPropertiesNV calloc() {
        return new VkCooperativeVectorPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCooperativeVectorPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeVectorPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkCooperativeVectorPropertiesNV create(long address) {
        return new VkCooperativeVectorPropertiesNV(address, null);
    }

    public static VkCooperativeVectorPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCooperativeVectorPropertiesNV(address, null);
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

    public static VkCooperativeVectorPropertiesNV malloc(MemoryStack stack) {
        return new VkCooperativeVectorPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCooperativeVectorPropertiesNV calloc(MemoryStack stack) {
        return new VkCooperativeVectorPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ninputType(long struct) {
        return MemoryUtil.memGetInt(struct + INPUTTYPE);
    }

    public static int ninputInterpretation(long struct) {
        return MemoryUtil.memGetInt(struct + INPUTINTERPRETATION);
    }

    public static int nmatrixInterpretation(long struct) {
        return MemoryUtil.memGetInt(struct + MATRIXINTERPRETATION);
    }

    public static int nbiasInterpretation(long struct) {
        return MemoryUtil.memGetInt(struct + BIASINTERPRETATION);
    }

    public static int nresultType(long struct) {
        return MemoryUtil.memGetInt(struct + RESULTTYPE);
    }

    public static int ntranspose(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSPOSE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ninputType(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUTTYPE, value);
    }

    public static void ninputInterpretation(long struct, int value) {
        MemoryUtil.memPutInt(struct + INPUTINTERPRETATION, value);
    }

    public static void nmatrixInterpretation(long struct, int value) {
        MemoryUtil.memPutInt(struct + MATRIXINTERPRETATION, value);
    }

    public static void nbiasInterpretation(long struct, int value) {
        MemoryUtil.memPutInt(struct + BIASINTERPRETATION, value);
    }

    public static void nresultType(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESULTTYPE, value);
    }

    public static void ntranspose(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRANSPOSE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCooperativeVectorPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCooperativeVectorPropertiesNV, Buffer> implements NativeResource {
        private static final VkCooperativeVectorPropertiesNV ELEMENT_FACTORY = VkCooperativeVectorPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCooperativeVectorPropertiesNV.SIZEOF);
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
        public VkCooperativeVectorPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCooperativeVectorPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkCooperativeVectorPropertiesNV.npNext(address());
        }

        @NativeType("VkComponentTypeNV")
        public int inputType() {
            return VkCooperativeVectorPropertiesNV.ninputType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int inputInterpretation() {
            return VkCooperativeVectorPropertiesNV.ninputInterpretation(address());
        }

        @NativeType("VkComponentTypeNV")
        public int matrixInterpretation() {
            return VkCooperativeVectorPropertiesNV.nmatrixInterpretation(address());
        }

        @NativeType("VkComponentTypeNV")
        public int biasInterpretation() {
            return VkCooperativeVectorPropertiesNV.nbiasInterpretation(address());
        }

        @NativeType("VkComponentTypeNV")
        public int resultType() {
            return VkCooperativeVectorPropertiesNV.nresultType(address());
        }

        @NativeType("VkBool32")
        public boolean transpose() {
            return VkCooperativeVectorPropertiesNV.ntranspose(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCooperativeVectorPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000491002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkCooperativeVectorPropertiesNV.npNext(address(), value);
            return this;
        }

        public Buffer inputType(@NativeType("VkComponentTypeNV") int value) {
            VkCooperativeVectorPropertiesNV.ninputType(address(), value);
            return this;
        }

        public Buffer inputInterpretation(@NativeType("VkComponentTypeNV") int value) {
            VkCooperativeVectorPropertiesNV.ninputInterpretation(address(), value);
            return this;
        }

        public Buffer matrixInterpretation(@NativeType("VkComponentTypeNV") int value) {
            VkCooperativeVectorPropertiesNV.nmatrixInterpretation(address(), value);
            return this;
        }

        public Buffer biasInterpretation(@NativeType("VkComponentTypeNV") int value) {
            VkCooperativeVectorPropertiesNV.nbiasInterpretation(address(), value);
            return this;
        }

        public Buffer resultType(@NativeType("VkComponentTypeNV") int value) {
            VkCooperativeVectorPropertiesNV.nresultType(address(), value);
            return this;
        }

        public Buffer transpose(@NativeType("VkBool32") boolean value) {
            VkCooperativeVectorPropertiesNV.ntranspose(address(), value ? 1 : 0);
            return this;
        }
    }
}
