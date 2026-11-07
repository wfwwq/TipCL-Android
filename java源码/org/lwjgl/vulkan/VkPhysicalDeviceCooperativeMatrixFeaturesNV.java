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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrixFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrixFeaturesNV.class */
public class VkPhysicalDeviceCooperativeMatrixFeaturesNV extends Struct<VkPhysicalDeviceCooperativeMatrixFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COOPERATIVEMATRIX;
    public static final int COOPERATIVEMATRIXROBUSTBUFFERACCESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIX = layout.offsetof(2);
        COOPERATIVEMATRIXROBUSTBUFFERACCESS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceCooperativeMatrixFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(address, container);
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean cooperativeMatrix() {
        return ncooperativeMatrix(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean cooperativeMatrixRobustBufferAccess() {
        return ncooperativeMatrixRobustBufferAccess(address()) != 0;
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV sType$Default() {
        return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV);
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrix(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrix(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrixRobustBufferAccess(@NativeType("VkBool32") boolean value) {
        ncooperativeMatrixRobustBufferAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV set(int sType, long pNext, boolean cooperativeMatrix, boolean cooperativeMatrixRobustBufferAccess) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrix(cooperativeMatrix);
        cooperativeMatrixRobustBufferAccess(cooperativeMatrixRobustBufferAccess);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrixFeaturesNV set(VkPhysicalDeviceCooperativeMatrixFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV malloc() {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV calloc() {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV create(long address) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(address, null);
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

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncooperativeMatrix(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIX);
    }

    public static int ncooperativeMatrixRobustBufferAccess(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXROBUSTBUFFERACCESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncooperativeMatrix(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIX, value);
    }

    public static void ncooperativeMatrixRobustBufferAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + COOPERATIVEMATRIXROBUSTBUFFERACCESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrixFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrixFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCooperativeMatrixFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCooperativeMatrixFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceCooperativeMatrixFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCooperativeMatrixFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCooperativeMatrixFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrix() {
            return VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrix(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean cooperativeMatrixRobustBufferAccess() {
            return VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrixRobustBufferAccess(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCooperativeMatrixFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCooperativeMatrixFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer cooperativeMatrix(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrix(address(), value ? 1 : 0);
            return this;
        }

        public Buffer cooperativeMatrixRobustBufferAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrixRobustBufferAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
