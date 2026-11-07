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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreProperties2AMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreProperties2AMD.class */
public class VkPhysicalDeviceShaderCoreProperties2AMD extends Struct<VkPhysicalDeviceShaderCoreProperties2AMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERCOREFEATURES;
    public static final int ACTIVECOMPUTEUNITCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOREFEATURES = layout.offsetof(2);
        ACTIVECOMPUTEUNITCOUNT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderCoreProperties2AMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderCoreProperties2AMD create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderCoreProperties2AMD(address, container);
    }

    public VkPhysicalDeviceShaderCoreProperties2AMD(ByteBuffer container) {
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

    @NativeType("VkShaderCorePropertiesFlagsAMD")
    public int shaderCoreFeatures() {
        return nshaderCoreFeatures(address());
    }

    @NativeType("uint32_t")
    public int activeComputeUnitCount() {
        return nactiveComputeUnitCount(address());
    }

    public VkPhysicalDeviceShaderCoreProperties2AMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderCoreProperties2AMD sType$Default() {
        return sType(AMDShaderCoreProperties2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD);
    }

    public VkPhysicalDeviceShaderCoreProperties2AMD pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderCoreProperties2AMD set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderCoreProperties2AMD set(VkPhysicalDeviceShaderCoreProperties2AMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD malloc() {
        return new VkPhysicalDeviceShaderCoreProperties2AMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD calloc() {
        return new VkPhysicalDeviceShaderCoreProperties2AMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderCoreProperties2AMD(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD create(long address) {
        return new VkPhysicalDeviceShaderCoreProperties2AMD(address, null);
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderCoreProperties2AMD(address, null);
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

    public static VkPhysicalDeviceShaderCoreProperties2AMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreProperties2AMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCoreProperties2AMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreProperties2AMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderCoreFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERCOREFEATURES);
    }

    public static int nactiveComputeUnitCount(long struct) {
        return MemoryUtil.memGetInt(struct + ACTIVECOMPUTEUNITCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreProperties2AMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreProperties2AMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCoreProperties2AMD, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderCoreProperties2AMD ELEMENT_FACTORY = VkPhysicalDeviceShaderCoreProperties2AMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderCoreProperties2AMD.SIZEOF);
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
        public VkPhysicalDeviceShaderCoreProperties2AMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderCoreProperties2AMD.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderCoreProperties2AMD.npNext(address());
        }

        @NativeType("VkShaderCorePropertiesFlagsAMD")
        public int shaderCoreFeatures() {
            return VkPhysicalDeviceShaderCoreProperties2AMD.nshaderCoreFeatures(address());
        }

        @NativeType("uint32_t")
        public int activeComputeUnitCount() {
            return VkPhysicalDeviceShaderCoreProperties2AMD.nactiveComputeUnitCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderCoreProperties2AMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDShaderCoreProperties2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderCoreProperties2AMD.npNext(address(), value);
            return this;
        }
    }
}
