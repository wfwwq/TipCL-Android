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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.class */
public class VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT extends Struct<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMBINEDIMAGESAMPLERDENSITYMAPDESCRIPTORSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMBINEDIMAGESAMPLERDENSITYMAPDESCRIPTORSIZE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(ByteBuffer container) {
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

    @NativeType("size_t")
    public long combinedImageSamplerDensityMapDescriptorSize() {
        return ncombinedImageSamplerDensityMapDescriptorSize(address());
    }

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT set(VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT malloc() {
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT calloc() {
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ncombinedImageSamplerDensityMapDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + COMBINEDIMAGESAMPLERDENSITYMAPDESCRIPTORSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.npNext(address());
        }

        @NativeType("size_t")
        public long combinedImageSamplerDensityMapDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.ncombinedImageSamplerDensityMapDescriptorSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
