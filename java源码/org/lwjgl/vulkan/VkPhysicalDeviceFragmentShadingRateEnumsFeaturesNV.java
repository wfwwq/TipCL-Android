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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.class */
public class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV extends Struct<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAGMENTSHADINGRATEENUMS;
    public static final int SUPERSAMPLEFRAGMENTSHADINGRATES;
    public static final int NOINVOCATIONFRAGMENTSHADINGRATES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTSHADINGRATEENUMS = layout.offsetof(2);
        SUPERSAMPLEFRAGMENTSHADINGRATES = layout.offsetof(3);
        NOINVOCATIONFRAGMENTSHADINGRATES = layout.offsetof(4);
    }

    protected VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(address, container);
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(ByteBuffer container) {
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
    public boolean fragmentShadingRateEnums() {
        return nfragmentShadingRateEnums(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean supersampleFragmentShadingRates() {
        return nsupersampleFragmentShadingRates(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean noInvocationFragmentShadingRates() {
        return nnoInvocationFragmentShadingRates(address()) != 0;
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType$Default() {
        return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnums(@NativeType("VkBool32") boolean value) {
        nfragmentShadingRateEnums(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRates(@NativeType("VkBool32") boolean value) {
        nsupersampleFragmentShadingRates(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRates(@NativeType("VkBool32") boolean value) {
        nnoInvocationFragmentShadingRates(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(int sType, long pNext, boolean fragmentShadingRateEnums, boolean supersampleFragmentShadingRates, boolean noInvocationFragmentShadingRates) {
        sType(sType);
        pNext(pNext);
        fragmentShadingRateEnums(fragmentShadingRateEnums);
        supersampleFragmentShadingRates(supersampleFragmentShadingRates);
        noInvocationFragmentShadingRates(noInvocationFragmentShadingRates);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV set(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV malloc() {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV calloc() {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV create(long address) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(address, null);
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

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nfragmentShadingRateEnums(long struct) {
        return MemoryUtil.memGetInt(struct + FRAGMENTSHADINGRATEENUMS);
    }

    public static int nsupersampleFragmentShadingRates(long struct) {
        return MemoryUtil.memGetInt(struct + SUPERSAMPLEFRAGMENTSHADINGRATES);
    }

    public static int nnoInvocationFragmentShadingRates(long struct) {
        return MemoryUtil.memGetInt(struct + NOINVOCATIONFRAGMENTSHADINGRATES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfragmentShadingRateEnums(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAGMENTSHADINGRATEENUMS, value);
    }

    public static void nsupersampleFragmentShadingRates(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUPERSAMPLEFRAGMENTSHADINGRATES, value);
    }

    public static void nnoInvocationFragmentShadingRates(long struct, int value) {
        MemoryUtil.memPutInt(struct + NOINVOCATIONFRAGMENTSHADINGRATES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean fragmentShadingRateEnums() {
            return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nfragmentShadingRateEnums(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean supersampleFragmentShadingRates() {
            return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsupersampleFragmentShadingRates(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean noInvocationFragmentShadingRates() {
            return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nnoInvocationFragmentShadingRates(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer fragmentShadingRateEnums(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nfragmentShadingRateEnums(address(), value ? 1 : 0);
            return this;
        }

        public Buffer supersampleFragmentShadingRates(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nsupersampleFragmentShadingRates(address(), value ? 1 : 0);
            return this;
        }

        public Buffer noInvocationFragmentShadingRates(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.nnoInvocationFragmentShadingRates(address(), value ? 1 : 0);
            return this;
        }
    }
}
