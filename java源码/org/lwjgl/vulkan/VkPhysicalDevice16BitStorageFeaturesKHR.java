package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeaturesKHR.class */
public class VkPhysicalDevice16BitStorageFeaturesKHR extends VkPhysicalDevice16BitStorageFeatures {
    protected VkPhysicalDevice16BitStorageFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures, org.lwjgl.system.Struct
    public VkPhysicalDevice16BitStorageFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(address, container);
    }

    public VkPhysicalDevice16BitStorageFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR sType$Default() {
        return sType(1000083000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
        nstorageBuffer16BitAccess(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
        nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR storagePushConstant16(@NativeType("VkBool32") boolean value) {
        nstoragePushConstant16(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR storageInputOutput16(@NativeType("VkBool32") boolean value) {
        nstorageInputOutput16(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures
    public VkPhysicalDevice16BitStorageFeaturesKHR set(int sType, long pNext, boolean storageBuffer16BitAccess, boolean uniformAndStorageBuffer16BitAccess, boolean storagePushConstant16, boolean storageInputOutput16) {
        sType(sType);
        pNext(pNext);
        storageBuffer16BitAccess(storageBuffer16BitAccess);
        uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        storagePushConstant16(storagePushConstant16);
        storageInputOutput16(storageInputOutput16);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeaturesKHR set(VkPhysicalDevice16BitStorageFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevice16BitStorageFeaturesKHR malloc() {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevice16BitStorageFeaturesKHR calloc() {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevice16BitStorageFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevice16BitStorageFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevice16BitStorageFeaturesKHR create(long address) {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(address, null);
    }

    public static VkPhysicalDevice16BitStorageFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevice16BitStorageFeaturesKHR(address, null);
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

    public static VkPhysicalDevice16BitStorageFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevice16BitStorageFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDevice16BitStorageFeatures.Buffer {
        private static final VkPhysicalDevice16BitStorageFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevice16BitStorageFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDevice16BitStorageFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevice16BitStorageFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000083000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevice16BitStorageFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer
        public Buffer storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeaturesKHR.nstorageBuffer16BitAccess(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer
        public Buffer uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeaturesKHR.nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer
        public Buffer storagePushConstant16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeaturesKHR.nstoragePushConstant16(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures.Buffer
        public Buffer storageInputOutput16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeaturesKHR.nstorageInputOutput16(address(), value ? 1 : 0);
            return this;
        }
    }
}
