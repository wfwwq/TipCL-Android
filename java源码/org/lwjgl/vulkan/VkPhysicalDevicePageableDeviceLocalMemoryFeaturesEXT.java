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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class */
public class VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT extends Struct<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PAGEABLEDEVICELOCALMEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PAGEABLEDEVICELOCALMEMORY = layout.offsetof(2);
    }

    protected VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(address, container);
    }

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(ByteBuffer container) {
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
    public boolean pageableDeviceLocalMemory() {
        return npageableDeviceLocalMemory(address()) != 0;
    }

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType$Default() {
        return sType(EXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT);
    }

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pageableDeviceLocalMemory(@NativeType("VkBool32") boolean value) {
        npageableDeviceLocalMemory(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT set(int sType, long pNext, boolean pageableDeviceLocalMemory) {
        sType(sType);
        pNext(pNext);
        pageableDeviceLocalMemory(pageableDeviceLocalMemory);
        return this;
    }

    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT set(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT malloc() {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT calloc() {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create(long address) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(address, null);
    }

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(address, null);
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

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npageableDeviceLocalMemory(long struct) {
        return MemoryUtil.memGetInt(struct + PAGEABLEDEVICELOCALMEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npageableDeviceLocalMemory(long struct, int value) {
        MemoryUtil.memPutInt(struct + PAGEABLEDEVICELOCALMEMORY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.SIZEOF);
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
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pageableDeviceLocalMemory() {
            return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npageableDeviceLocalMemory(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer pageableDeviceLocalMemory(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npageableDeviceLocalMemory(address(), value ? 1 : 0);
            return this;
        }
    }
}
