package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryBudgetPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryBudgetPropertiesEXT.class */
public class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends Struct<VkPhysicalDeviceMemoryBudgetPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HEAPBUDGET;
    public static final int HEAPUSAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(8, 16), __array(8, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HEAPBUDGET = layout.offsetof(2);
        HEAPUSAGE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMemoryBudgetPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(ByteBuffer container) {
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

    @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
    public LongBuffer heapBudget() {
        return nheapBudget(address());
    }

    @NativeType("VkDeviceSize")
    public long heapBudget(int index) {
        return nheapBudget(address(), index);
    }

    @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
    public LongBuffer heapUsage() {
        return nheapUsage(address());
    }

    @NativeType("VkDeviceSize")
    public long heapUsage(int index) {
        return nheapUsage(address(), index);
    }

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT sType$Default() {
        return sType(EXTMemoryBudget.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT set(VkPhysicalDeviceMemoryBudgetPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT malloc() {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT calloc() {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT create(long address) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static LongBuffer nheapBudget(long struct) {
        return MemoryUtil.memLongBuffer(struct + HEAPBUDGET, 16);
    }

    public static long nheapBudget(long struct, int index) {
        return MemoryUtil.memGetLong(struct + HEAPBUDGET + (Checks.check(index, 16) * 8));
    }

    public static LongBuffer nheapUsage(long struct) {
        return MemoryUtil.memLongBuffer(struct + HEAPUSAGE, 16);
    }

    public static long nheapUsage(long struct, int index) {
        return MemoryUtil.memGetLong(struct + HEAPUSAGE + (Checks.check(index, 16) * 8));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryBudgetPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryBudgetPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryBudgetPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMemoryBudgetPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceMemoryBudgetPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMemoryBudgetPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.npNext(address());
        }

        @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
        public LongBuffer heapBudget() {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapBudget(address());
        }

        @NativeType("VkDeviceSize")
        public long heapBudget(int index) {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapBudget(address(), index);
        }

        @NativeType("VkDeviceSize[VK_MAX_MEMORY_HEAPS]")
        public LongBuffer heapUsage() {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapUsage(address());
        }

        @NativeType("VkDeviceSize")
        public long heapUsage(int index) {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.nheapUsage(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMemoryBudgetPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMemoryBudget.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMemoryBudgetPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
