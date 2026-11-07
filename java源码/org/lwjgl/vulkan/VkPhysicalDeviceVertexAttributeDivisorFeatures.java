package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeatures.class */
public class VkPhysicalDeviceVertexAttributeDivisorFeatures extends Struct<VkPhysicalDeviceVertexAttributeDivisorFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXATTRIBUTEINSTANCERATEDIVISOR;
    public static final int VERTEXATTRIBUTEINSTANCERATEZERODIVISOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXATTRIBUTEINSTANCERATEDIVISOR = layout.offsetof(2);
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = layout.offsetof(3);
    }

    protected VkPhysicalDeviceVertexAttributeDivisorFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVertexAttributeDivisorFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(address, container);
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures(ByteBuffer container) {
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
    public boolean vertexAttributeInstanceRateDivisor() {
        return nvertexAttributeInstanceRateDivisor(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateZeroDivisor() {
        return nvertexAttributeInstanceRateZeroDivisor(address()) != 0;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures sType$Default() {
        return sType(1000190002);
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures set(int sType, long pNext, boolean vertexAttributeInstanceRateDivisor, boolean vertexAttributeInstanceRateZeroDivisor) {
        sType(sType);
        pNext(pNext);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeatures set(VkPhysicalDeviceVertexAttributeDivisorFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(address, null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(address, null);
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

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvertexAttributeInstanceRateDivisor(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXATTRIBUTEINSTANCERATEDIVISOR);
    }

    public static int nvertexAttributeInstanceRateZeroDivisor(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXATTRIBUTEINSTANCERATEZERODIVISOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvertexAttributeInstanceRateDivisor(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXATTRIBUTEINSTANCERATEDIVISOR, value);
    }

    public static void nvertexAttributeInstanceRateZeroDivisor(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVertexAttributeDivisorFeatures ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVertexAttributeDivisorFeatures.SIZEOF);
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
        public VkPhysicalDeviceVertexAttributeDivisorFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVertexAttributeDivisorFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVertexAttributeDivisorFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateDivisor() {
            return VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateDivisor(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateZeroDivisor() {
            return VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateZeroDivisor(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVertexAttributeDivisorFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000190002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVertexAttributeDivisorFeatures.npNext(address(), value);
            return this;
        }

        public Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVertexAttributeDivisorFeatures.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
            return this;
        }
    }
}
