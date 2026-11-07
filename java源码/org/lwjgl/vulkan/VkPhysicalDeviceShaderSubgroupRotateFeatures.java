package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupRotateFeatures.class */
public class VkPhysicalDeviceShaderSubgroupRotateFeatures extends Struct<VkPhysicalDeviceShaderSubgroupRotateFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERSUBGROUPROTATE;
    public static final int SHADERSUBGROUPROTATECLUSTERED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSUBGROUPROTATE = layout.offsetof(2);
        SHADERSUBGROUPROTATECLUSTERED = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderSubgroupRotateFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderSubgroupRotateFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(address, container);
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures(ByteBuffer container) {
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
    public boolean shaderSubgroupRotate() {
        return nshaderSubgroupRotate(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSubgroupRotateClustered() {
        return nshaderSubgroupRotateClustered(address()) != 0;
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures sType$Default() {
        return sType(1000416000);
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotate(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupRotate(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) {
        nshaderSubgroupRotateClustered(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures set(int sType, long pNext, boolean shaderSubgroupRotate, boolean shaderSubgroupRotateClustered) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);
        return this;
    }

    public VkPhysicalDeviceShaderSubgroupRotateFeatures set(VkPhysicalDeviceShaderSubgroupRotateFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures malloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures calloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures create(long address) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(address, null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(address, null);
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

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderSubgroupRotate(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPROTATE);
    }

    public static int nshaderSubgroupRotateClustered(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSUBGROUPROTATECLUSTERED);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderSubgroupRotate(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPROTATE, value);
    }

    public static void nshaderSubgroupRotateClustered(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSUBGROUPROTATECLUSTERED, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSubgroupRotateFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupRotateFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderSubgroupRotateFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupRotateFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderSubgroupRotateFeatures.SIZEOF);
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
        public VkPhysicalDeviceShaderSubgroupRotateFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderSubgroupRotateFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderSubgroupRotateFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupRotate() {
            return VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotate(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSubgroupRotateClustered() {
            return VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotateClustered(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderSubgroupRotateFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000416000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderSubgroupRotateFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotate(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSubgroupRotateFeatures.nshaderSubgroupRotateClustered(address(), value ? 1 : 0);
            return this;
        }
    }
}
