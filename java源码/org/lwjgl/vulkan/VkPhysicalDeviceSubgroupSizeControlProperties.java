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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlProperties.class */
public class VkPhysicalDeviceSubgroupSizeControlProperties extends Struct<VkPhysicalDeviceSubgroupSizeControlProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MINSUBGROUPSIZE;
    public static final int MAXSUBGROUPSIZE;
    public static final int MAXCOMPUTEWORKGROUPSUBGROUPS;
    public static final int REQUIREDSUBGROUPSIZESTAGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINSUBGROUPSIZE = layout.offsetof(2);
        MAXSUBGROUPSIZE = layout.offsetof(3);
        MAXCOMPUTEWORKGROUPSUBGROUPS = layout.offsetof(4);
        REQUIREDSUBGROUPSIZESTAGES = layout.offsetof(5);
    }

    protected VkPhysicalDeviceSubgroupSizeControlProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSubgroupSizeControlProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(address, container);
    }

    public VkPhysicalDeviceSubgroupSizeControlProperties(ByteBuffer container) {
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
    public int minSubgroupSize() {
        return nminSubgroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxSubgroupSize() {
        return nmaxSubgroupSize(address());
    }

    @NativeType("uint32_t")
    public int maxComputeWorkgroupSubgroups() {
        return nmaxComputeWorkgroupSubgroups(address());
    }

    @NativeType("VkShaderStageFlags")
    public int requiredSubgroupSizeStages() {
        return nrequiredSubgroupSizeStages(address());
    }

    public VkPhysicalDeviceSubgroupSizeControlProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSubgroupSizeControlProperties sType$Default() {
        return sType(1000225000);
    }

    public VkPhysicalDeviceSubgroupSizeControlProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSubgroupSizeControlProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceSubgroupSizeControlProperties set(VkPhysicalDeviceSubgroupSizeControlProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties malloc() {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties calloc() {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubgroupSizeControlProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties create(long address) {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(address, null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSubgroupSizeControlProperties(address, null);
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

    public static VkPhysicalDeviceSubgroupSizeControlProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nminSubgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + MINSUBGROUPSIZE);
    }

    public static int nmaxSubgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSUBGROUPSIZE);
    }

    public static int nmaxComputeWorkgroupSubgroups(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTEWORKGROUPSUBGROUPS);
    }

    public static int nrequiredSubgroupSizeStages(long struct) {
        return MemoryUtil.memGetInt(struct + REQUIREDSUBGROUPSIZESTAGES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSubgroupSizeControlProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupSizeControlProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSubgroupSizeControlProperties ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSubgroupSizeControlProperties.SIZEOF);
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
        public VkPhysicalDeviceSubgroupSizeControlProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int minSubgroupSize() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.nminSubgroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxSubgroupSize() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.nmaxSubgroupSize(address());
        }

        @NativeType("uint32_t")
        public int maxComputeWorkgroupSubgroups() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.nmaxComputeWorkgroupSubgroups(address());
        }

        @NativeType("VkShaderStageFlags")
        public int requiredSubgroupSizeStages() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.nrequiredSubgroupSizeStages(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSubgroupSizeControlProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000225000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSubgroupSizeControlProperties.npNext(address(), value);
            return this;
        }
    }
}
