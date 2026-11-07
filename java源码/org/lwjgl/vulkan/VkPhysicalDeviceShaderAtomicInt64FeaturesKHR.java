package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.class */
public class VkPhysicalDeviceShaderAtomicInt64FeaturesKHR extends VkPhysicalDeviceShaderAtomicInt64Features {
    protected VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features, org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR sType$Default() {
        return sType(1000180000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderBufferInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderSharedInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR set(int sType, long pNext, boolean shaderBufferInt64Atomics, boolean shaderSharedInt64Atomics) {
        sType(sType);
        pNext(pNext);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR set(VkPhysicalDeviceShaderAtomicInt64FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicInt64FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicInt64FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64FeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicInt64FeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceShaderAtomicInt64Features.Buffer {
        private static final VkPhysicalDeviceShaderAtomicInt64FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer
        public Buffer sType$Default() {
            return sType(1000180000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer
        public Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderBufferInt64Atomics(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features.Buffer
        public Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicInt64FeaturesKHR.nshaderSharedInt64Atomics(address(), value ? 1 : 0);
            return this;
        }
    }
}
