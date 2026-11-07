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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.class */
public class VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE extends Struct<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORSETHOSTMAPPING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORSETHOSTMAPPING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(address, container);
    }

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(ByteBuffer container) {
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
    public boolean descriptorSetHostMapping() {
        return ndescriptorSetHostMapping(address()) != 0;
    }

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sType$Default() {
        return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE);
    }

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE descriptorSetHostMapping(@NativeType("VkBool32") boolean value) {
        ndescriptorSetHostMapping(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE set(int sType, long pNext, boolean descriptorSetHostMapping) {
        sType(sType);
        pNext(pNext);
        descriptorSetHostMapping(descriptorSetHostMapping);
        return this;
    }

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE set(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE malloc() {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE calloc() {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(address, null);
    }

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(address, null);
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

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndescriptorSetHostMapping(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORSETHOSTMAPPING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorSetHostMapping(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORSETHOSTMAPPING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.SIZEOF);
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
        public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean descriptorSetHostMapping() {
            return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.ndescriptorSetHostMapping(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.npNext(address(), value);
            return this;
        }

        public Buffer descriptorSetHostMapping(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.ndescriptorSetHostMapping(address(), value ? 1 : 0);
            return this;
        }
    }
}
