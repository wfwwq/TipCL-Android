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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeatures.class */
public class VkPhysicalDeviceVulkanMemoryModelFeatures extends Struct<VkPhysicalDeviceVulkanMemoryModelFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VULKANMEMORYMODEL;
    public static final int VULKANMEMORYMODELDEVICESCOPE;
    public static final int VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VULKANMEMORYMODEL = layout.offsetof(2);
        VULKANMEMORYMODELDEVICESCOPE = layout.offsetof(3);
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceVulkanMemoryModelFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkanMemoryModelFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(address, container);
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures(ByteBuffer container) {
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
    public boolean vulkanMemoryModel() {
        return nvulkanMemoryModel(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() {
        return nvulkanMemoryModelDeviceScope(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean vulkanMemoryModelAvailabilityVisibilityChains() {
        return nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures sType$Default() {
        return sType(1000211000);
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModel(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) {
        nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures set(int sType, long pNext, boolean vulkanMemoryModel, boolean vulkanMemoryModelDeviceScope, boolean vulkanMemoryModelAvailabilityVisibilityChains) {
        sType(sType);
        pNext(pNext);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
        vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);
        return this;
    }

    public VkPhysicalDeviceVulkanMemoryModelFeatures set(VkPhysicalDeviceVulkanMemoryModelFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures malloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures calloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures create(long address) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(address, null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(address, null);
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

    public static VkPhysicalDeviceVulkanMemoryModelFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvulkanMemoryModel(long struct) {
        return MemoryUtil.memGetInt(struct + VULKANMEMORYMODEL);
    }

    public static int nvulkanMemoryModelDeviceScope(long struct) {
        return MemoryUtil.memGetInt(struct + VULKANMEMORYMODELDEVICESCOPE);
    }

    public static int nvulkanMemoryModelAvailabilityVisibilityChains(long struct) {
        return MemoryUtil.memGetInt(struct + VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvulkanMemoryModel(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKANMEMORYMODEL, value);
    }

    public static void nvulkanMemoryModelDeviceScope(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKANMEMORYMODELDEVICESCOPE, value);
    }

    public static void nvulkanMemoryModelAvailabilityVisibilityChains(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkanMemoryModelFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkanMemoryModelFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkanMemoryModelFeatures ELEMENT_FACTORY = VkPhysicalDeviceVulkanMemoryModelFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkanMemoryModelFeatures.SIZEOF);
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
        public VkPhysicalDeviceVulkanMemoryModelFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkanMemoryModelFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkanMemoryModelFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean vulkanMemoryModel() {
            return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModel(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() {
            return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelDeviceScope(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean vulkanMemoryModelAvailabilityVisibilityChains() {
            return VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkanMemoryModelFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000211000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkanMemoryModelFeatures.npNext(address(), value);
            return this;
        }

        public Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModel(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0);
            return this;
        }

        public Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkanMemoryModelFeatures.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0);
            return this;
        }
    }
}
