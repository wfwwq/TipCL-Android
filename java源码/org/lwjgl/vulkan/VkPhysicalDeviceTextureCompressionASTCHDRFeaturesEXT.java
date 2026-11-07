package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class */
public class VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT extends VkPhysicalDeviceTextureCompressionASTCHDRFeatures {
    protected VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT sType$Default() {
        return sType(1000066000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) {
        ntextureCompressionASTC_HDR(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT set(int sType, long pNext, boolean textureCompressionASTC_HDR) {
        sType(sType);
        pNext(pNext);
        textureCompressionASTC_HDR(textureCompressionASTC_HDR);
        return this;
    }

    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT set(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT malloc() {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT calloc() {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT create(long address) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer {
        private static final VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000066000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer
        public Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.ntextureCompressionASTC_HDR(address(), value ? 1 : 0);
            return this;
        }
    }
}
