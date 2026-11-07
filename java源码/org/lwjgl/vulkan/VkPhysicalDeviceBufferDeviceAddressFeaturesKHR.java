package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class */
public class VkPhysicalDeviceBufferDeviceAddressFeaturesKHR extends VkPhysicalDeviceBufferDeviceAddressFeatures {
    protected VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR sType$Default() {
        return sType(1000257000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddress(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR set(int sType, long pNext, boolean bufferDeviceAddress, boolean bufferDeviceAddressCaptureReplay, boolean bufferDeviceAddressMultiDevice) {
        sType(sType);
        pNext(pNext);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);
        return this;
    }

    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR set(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR malloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR calloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create(long address) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferDeviceAddressFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer {
        private static final VkPhysicalDeviceBufferDeviceAddressFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000257000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddress(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer
        public Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
            return this;
        }
    }
}
