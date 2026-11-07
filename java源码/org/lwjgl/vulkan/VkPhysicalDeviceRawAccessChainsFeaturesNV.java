package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRawAccessChainsFeaturesNV.class */
public class VkPhysicalDeviceRawAccessChainsFeaturesNV extends Struct<VkPhysicalDeviceRawAccessChainsFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERRAWACCESSCHAINS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERRAWACCESSCHAINS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRawAccessChainsFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRawAccessChainsFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(address, container);
    }

    public VkPhysicalDeviceRawAccessChainsFeaturesNV(ByteBuffer container) {
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
    public boolean shaderRawAccessChains() {
        return nshaderRawAccessChains(address()) != 0;
    }

    public VkPhysicalDeviceRawAccessChainsFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRawAccessChainsFeaturesNV sType$Default() {
        return sType(NVRawAccessChains.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV);
    }

    public VkPhysicalDeviceRawAccessChainsFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRawAccessChainsFeaturesNV shaderRawAccessChains(@NativeType("VkBool32") boolean value) {
        nshaderRawAccessChains(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRawAccessChainsFeaturesNV set(int sType, long pNext, boolean shaderRawAccessChains) {
        sType(sType);
        pNext(pNext);
        shaderRawAccessChains(shaderRawAccessChains);
        return this;
    }

    public VkPhysicalDeviceRawAccessChainsFeaturesNV set(VkPhysicalDeviceRawAccessChainsFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRawAccessChainsFeaturesNV malloc() {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRawAccessChainsFeaturesNV calloc() {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRawAccessChainsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRawAccessChainsFeaturesNV create(long address) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceRawAccessChainsFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(address, null);
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

    public static VkPhysicalDeviceRawAccessChainsFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRawAccessChainsFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderRawAccessChains(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERRAWACCESSCHAINS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderRawAccessChains(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERRAWACCESSCHAINS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRawAccessChainsFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRawAccessChainsFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRawAccessChainsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRawAccessChainsFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRawAccessChainsFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceRawAccessChainsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRawAccessChainsFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRawAccessChainsFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderRawAccessChains() {
            return VkPhysicalDeviceRawAccessChainsFeaturesNV.nshaderRawAccessChains(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRawAccessChainsFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRawAccessChains.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRawAccessChainsFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer shaderRawAccessChains(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRawAccessChainsFeaturesNV.nshaderRawAccessChains(address(), value ? 1 : 0);
            return this;
        }
    }
}
