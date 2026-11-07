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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryPriorityFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryPriorityFeaturesEXT.class */
public class VkPhysicalDeviceMemoryPriorityFeaturesEXT extends Struct<VkPhysicalDeviceMemoryPriorityFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORYPRIORITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYPRIORITY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMemoryPriorityFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT(ByteBuffer container) {
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
    public boolean memoryPriority() {
        return nmemoryPriority(address()) != 0;
    }

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sType$Default() {
        return sType(EXTMemoryPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT);
    }

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT memoryPriority(@NativeType("VkBool32") boolean value) {
        nmemoryPriority(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT set(int sType, long pNext, boolean memoryPriority) {
        sType(sType);
        pNext(pNext);
        memoryPriority(memoryPriority);
        return this;
    }

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT set(VkPhysicalDeviceMemoryPriorityFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT malloc() {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT calloc() {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmemoryPriority(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYPRIORITY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemoryPriority(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYPRIORITY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryPriorityFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryPriorityFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryPriorityFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMemoryPriorityFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMemoryPriorityFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMemoryPriorityFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceMemoryPriorityFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMemoryPriorityFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMemoryPriorityFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean memoryPriority() {
            return VkPhysicalDeviceMemoryPriorityFeaturesEXT.nmemoryPriority(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMemoryPriorityFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMemoryPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMemoryPriorityFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer memoryPriority(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMemoryPriorityFeaturesEXT.nmemoryPriority(address(), value ? 1 : 0);
            return this;
        }
    }
}
