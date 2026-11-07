package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferAddressFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferAddressFeaturesEXT.class */
public class VkPhysicalDeviceBufferAddressFeaturesEXT extends VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {
    protected VkPhysicalDeviceBufferAddressFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT, org.lwjgl.system.Struct
    public VkPhysicalDeviceBufferAddressFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceBufferAddressFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
    public VkPhysicalDeviceBufferAddressFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
    public VkPhysicalDeviceBufferAddressFeaturesEXT sType$Default() {
        return sType(1000244000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
    public VkPhysicalDeviceBufferAddressFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddress(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
        nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
    public VkPhysicalDeviceBufferAddressFeaturesEXT set(int sType, long pNext, boolean bufferDeviceAddress, boolean bufferDeviceAddressCaptureReplay, boolean bufferDeviceAddressMultiDevice) {
        sType(sType);
        pNext(pNext);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);
        return this;
    }

    public VkPhysicalDeviceBufferAddressFeaturesEXT set(VkPhysicalDeviceBufferAddressFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceBufferAddressFeaturesEXT malloc() {
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferAddressFeaturesEXT calloc() {
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferAddressFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceBufferAddressFeaturesEXT create(long address) {
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceBufferAddressFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceBufferAddressFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceBufferAddressFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferAddressFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferAddressFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBufferAddressFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer {
        private static final VkPhysicalDeviceBufferAddressFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBufferAddressFeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceBufferAddressFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceBufferAddressFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000244000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceBufferAddressFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer
        public Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferAddressFeaturesEXT.nbufferDeviceAddress(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer
        public Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferAddressFeaturesEXT.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer
        public Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceBufferAddressFeaturesEXT.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0);
            return this;
        }
    }
}
