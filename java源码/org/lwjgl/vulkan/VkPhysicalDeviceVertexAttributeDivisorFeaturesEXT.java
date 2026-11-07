package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class */
public class VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT extends VkPhysicalDeviceVertexAttributeDivisorFeatures {
    protected VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT sType$Default() {
        return sType(1000190002);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
        nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT set(int sType, long pNext, boolean vertexAttributeInstanceRateDivisor, boolean vertexAttributeInstanceRateZeroDivisor) {
        sType(sType);
        pNext(pNext);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT set(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer {
        private static final VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000190002);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeatures.Buffer
        public Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0);
            return this;
        }
    }
}
