package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewFeaturesKHR.class */
public class VkPhysicalDeviceMultiviewFeaturesKHR extends VkPhysicalDeviceMultiviewFeatures {
    protected VkPhysicalDeviceMultiviewFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceMultiviewFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceMultiviewFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures
    public VkPhysicalDeviceMultiviewFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures
    public VkPhysicalDeviceMultiviewFeaturesKHR sType$Default() {
        return sType(1000053001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures
    public VkPhysicalDeviceMultiviewFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures
    public VkPhysicalDeviceMultiviewFeaturesKHR multiview(@NativeType("VkBool32") boolean value) {
        nmultiview(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewGeometryShader(@NativeType("VkBool32") boolean value) {
        nmultiviewGeometryShader(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures
    public VkPhysicalDeviceMultiviewFeaturesKHR multiviewTessellationShader(@NativeType("VkBool32") boolean value) {
        nmultiviewTessellationShader(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures
    public VkPhysicalDeviceMultiviewFeaturesKHR set(int sType, long pNext, boolean multiview, boolean multiviewGeometryShader, boolean multiviewTessellationShader) {
        sType(sType);
        pNext(pNext);
        multiview(multiview);
        multiviewGeometryShader(multiviewGeometryShader);
        multiviewTessellationShader(multiviewTessellationShader);
        return this;
    }

    public VkPhysicalDeviceMultiviewFeaturesKHR set(VkPhysicalDeviceMultiviewFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMultiviewFeaturesKHR malloc() {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewFeaturesKHR calloc() {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiviewFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMultiviewFeaturesKHR create(long address) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceMultiviewFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMultiviewFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceMultiviewFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMultiviewFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiviewFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMultiviewFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceMultiviewFeatures.Buffer {
        private static final VkPhysicalDeviceMultiviewFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMultiviewFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceMultiviewFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMultiviewFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000053001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMultiviewFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer
        public Buffer multiview(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMultiviewFeaturesKHR.nmultiview(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer
        public Buffer multiviewGeometryShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMultiviewFeaturesKHR.nmultiviewGeometryShader(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures.Buffer
        public Buffer multiviewTessellationShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMultiviewFeaturesKHR.nmultiviewTessellationShader(address(), value ? 1 : 0);
            return this;
        }
    }
}
