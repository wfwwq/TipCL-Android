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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupProperties.class */
public class VkPhysicalDeviceSubgroupProperties extends Struct<VkPhysicalDeviceSubgroupProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUBGROUPSIZE;
    public static final int SUPPORTEDSTAGES;
    public static final int SUPPORTEDOPERATIONS;
    public static final int QUADOPERATIONSINALLSTAGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBGROUPSIZE = layout.offsetof(2);
        SUPPORTEDSTAGES = layout.offsetof(3);
        SUPPORTEDOPERATIONS = layout.offsetof(4);
        QUADOPERATIONSINALLSTAGES = layout.offsetof(5);
    }

    protected VkPhysicalDeviceSubgroupProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSubgroupProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSubgroupProperties(address, container);
    }

    public VkPhysicalDeviceSubgroupProperties(ByteBuffer container) {
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
    public int subgroupSize() {
        return nsubgroupSize(address());
    }

    @NativeType("VkShaderStageFlags")
    public int supportedStages() {
        return nsupportedStages(address());
    }

    @NativeType("VkSubgroupFeatureFlags")
    public int supportedOperations() {
        return nsupportedOperations(address());
    }

    @NativeType("VkBool32")
    public boolean quadOperationsInAllStages() {
        return nquadOperationsInAllStages(address()) != 0;
    }

    public VkPhysicalDeviceSubgroupProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSubgroupProperties sType$Default() {
        return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES);
    }

    public VkPhysicalDeviceSubgroupProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSubgroupProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceSubgroupProperties set(VkPhysicalDeviceSubgroupProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSubgroupProperties malloc() {
        return new VkPhysicalDeviceSubgroupProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupProperties calloc() {
        return new VkPhysicalDeviceSubgroupProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubgroupProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSubgroupProperties create(long address) {
        return new VkPhysicalDeviceSubgroupProperties(address, null);
    }

    public static VkPhysicalDeviceSubgroupProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSubgroupProperties(address, null);
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

    public static VkPhysicalDeviceSubgroupProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsubgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + SUBGROUPSIZE);
    }

    public static int nsupportedStages(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDSTAGES);
    }

    public static int nsupportedOperations(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDOPERATIONS);
    }

    public static int nquadOperationsInAllStages(long struct) {
        return MemoryUtil.memGetInt(struct + QUADOPERATIONSINALLSTAGES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSubgroupProperties ELEMENT_FACTORY = VkPhysicalDeviceSubgroupProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSubgroupProperties.SIZEOF);
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
        public VkPhysicalDeviceSubgroupProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSubgroupProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSubgroupProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int subgroupSize() {
            return VkPhysicalDeviceSubgroupProperties.nsubgroupSize(address());
        }

        @NativeType("VkShaderStageFlags")
        public int supportedStages() {
            return VkPhysicalDeviceSubgroupProperties.nsupportedStages(address());
        }

        @NativeType("VkSubgroupFeatureFlags")
        public int supportedOperations() {
            return VkPhysicalDeviceSubgroupProperties.nsupportedOperations(address());
        }

        @NativeType("VkBool32")
        public boolean quadOperationsInAllStages() {
            return VkPhysicalDeviceSubgroupProperties.nquadOperationsInAllStages(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSubgroupProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSubgroupProperties.npNext(address(), value);
            return this;
        }
    }
}
