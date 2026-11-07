package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class */
public class VkPhysicalDeviceDescriptorIndexingFeaturesEXT extends VkPhysicalDeviceDescriptorIndexingFeatures {
    protected VkPhysicalDeviceDescriptorIndexingFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT sType$Default() {
        return sType(1000161001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingPartiallyBound(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT runtimeDescriptorArray(@NativeType("VkBool32") boolean value) {
        nruntimeDescriptorArray(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(int sType, long pNext, boolean shaderInputAttachmentArrayDynamicIndexing, boolean shaderUniformTexelBufferArrayDynamicIndexing, boolean shaderStorageTexelBufferArrayDynamicIndexing, boolean shaderUniformBufferArrayNonUniformIndexing, boolean shaderSampledImageArrayNonUniformIndexing, boolean shaderStorageBufferArrayNonUniformIndexing, boolean shaderStorageImageArrayNonUniformIndexing, boolean shaderInputAttachmentArrayNonUniformIndexing, boolean shaderUniformTexelBufferArrayNonUniformIndexing, boolean shaderStorageTexelBufferArrayNonUniformIndexing, boolean descriptorBindingUniformBufferUpdateAfterBind, boolean descriptorBindingSampledImageUpdateAfterBind, boolean descriptorBindingStorageImageUpdateAfterBind, boolean descriptorBindingStorageBufferUpdateAfterBind, boolean descriptorBindingUniformTexelBufferUpdateAfterBind, boolean descriptorBindingStorageTexelBufferUpdateAfterBind, boolean descriptorBindingUpdateUnusedWhilePending, boolean descriptorBindingPartiallyBound, boolean descriptorBindingVariableDescriptorCount, boolean runtimeDescriptorArray) {
        sType(sType);
        pNext(pNext);
        shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing);
        shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing);
        shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing);
        shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing);
        shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing);
        shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing);
        shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing);
        shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing);
        shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing);
        shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing);
        descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind);
        descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind);
        descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind);
        descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind);
        descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind);
        descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind);
        descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending);
        descriptorBindingPartiallyBound(descriptorBindingPartiallyBound);
        descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount);
        runtimeDescriptorArray(runtimeDescriptorArray);
        return this;
    }

    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(VkPhysicalDeviceDescriptorIndexingFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT malloc() {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT calloc() {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorIndexingFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceDescriptorIndexingFeatures.Buffer {
        private static final VkPhysicalDeviceDescriptorIndexingFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorIndexingFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000161001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nruntimeDescriptorArray(address(), value ? 1 : 0);
            return this;
        }
    }
}
