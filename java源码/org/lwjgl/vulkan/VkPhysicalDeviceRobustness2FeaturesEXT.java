package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2FeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2FeaturesEXT.class */
public class VkPhysicalDeviceRobustness2FeaturesEXT extends VkPhysicalDeviceRobustness2FeaturesKHR {
    protected VkPhysicalDeviceRobustness2FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR, org.lwjgl.system.Struct
    public VkPhysicalDeviceRobustness2FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR
    public VkPhysicalDeviceRobustness2FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR
    public VkPhysicalDeviceRobustness2FeaturesEXT sType$Default() {
        return sType(1000286000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR
    public VkPhysicalDeviceRobustness2FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR
    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2(@NativeType("VkBool32") boolean value) {
        nrobustBufferAccess2(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR
    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2(@NativeType("VkBool32") boolean value) {
        nrobustImageAccess2(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR
    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptor(@NativeType("VkBool32") boolean value) {
        nnullDescriptor(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR
    public VkPhysicalDeviceRobustness2FeaturesEXT set(int sType, long pNext, boolean robustBufferAccess2, boolean robustImageAccess2, boolean nullDescriptor) {
        sType(sType);
        pNext(pNext);
        robustBufferAccess2(robustBufferAccess2);
        robustImageAccess2(robustImageAccess2);
        nullDescriptor(nullDescriptor);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT set(VkPhysicalDeviceRobustness2FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT malloc() {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT calloc() {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRobustness2FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT create(long address) {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRobustness2FeaturesEXT(address, null);
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

    public static VkPhysicalDeviceRobustness2FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2FeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRobustness2FeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceRobustness2FeaturesKHR.Buffer {
        private static final VkPhysicalDeviceRobustness2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRobustness2FeaturesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceRobustness2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRobustness2FeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000286000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRobustness2FeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer
        public Buffer robustBufferAccess2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRobustness2FeaturesEXT.nrobustBufferAccess2(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer
        public Buffer robustImageAccess2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRobustness2FeaturesEXT.nrobustImageAccess2(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesKHR.Buffer
        public Buffer nullDescriptor(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRobustness2FeaturesEXT.nnullDescriptor(address(), value ? 1 : 0);
            return this;
        }
    }
}
