package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.class */
public class VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE extends Struct<VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAGMENTDENSITYMAPLAYERED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTDENSITYMAPLAYERED = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(address, container);
    }

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(ByteBuffer container) {
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
    public boolean fragmentDensityMapLayered() {
        return nfragmentDensityMapLayered(address()) != 0;
    }

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sType$Default() {
        return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE);
    }

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE fragmentDensityMapLayered(@NativeType("VkBool32") boolean value) {
        nfragmentDensityMapLayered(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE set(int sType, long pNext, boolean fragmentDensityMapLayered) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapLayered(fragmentDensityMapLayered);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE set(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE malloc() {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE calloc() {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(address, null);
    }

    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(address, null);
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

    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfragmentDensityMapLayered(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTDENSITYMAPLAYERED);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfragmentDensityMapLayered(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAGMENTDENSITYMAPLAYERED, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.SIZEOF);
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
        public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentDensityMapLayered() {
            return VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nfragmentDensityMapLayered(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.npNext(address(), value);
            return this;
        }

        public Buffer fragmentDensityMapLayered(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nfragmentDensityMapLayered(address(), value ? 1 : 0);
            return this;
        }
    }
}
