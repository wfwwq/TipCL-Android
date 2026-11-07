package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirementsKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirementsKHR.class */
public class VkDeviceBufferMemoryRequirementsKHR extends VkDeviceBufferMemoryRequirements {
    protected VkDeviceBufferMemoryRequirementsKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements, org.lwjgl.system.Struct
    public VkDeviceBufferMemoryRequirementsKHR create(long address, ByteBuffer container) {
        return new VkDeviceBufferMemoryRequirementsKHR(address, container);
    }

    public VkDeviceBufferMemoryRequirementsKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements
    public VkDeviceBufferMemoryRequirementsKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements
    public VkDeviceBufferMemoryRequirementsKHR sType$Default() {
        return sType(1000413002);
    }

    @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements
    public VkDeviceBufferMemoryRequirementsKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements
    public VkDeviceBufferMemoryRequirementsKHR pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) {
        npCreateInfo(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements
    public VkDeviceBufferMemoryRequirementsKHR set(int sType, long pNext, VkBufferCreateInfo pCreateInfo) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        return this;
    }

    public VkDeviceBufferMemoryRequirementsKHR set(VkDeviceBufferMemoryRequirementsKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceBufferMemoryRequirementsKHR malloc() {
        return new VkDeviceBufferMemoryRequirementsKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceBufferMemoryRequirementsKHR calloc() {
        return new VkDeviceBufferMemoryRequirementsKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceBufferMemoryRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceBufferMemoryRequirementsKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceBufferMemoryRequirementsKHR create(long address) {
        return new VkDeviceBufferMemoryRequirementsKHR(address, null);
    }

    public static VkDeviceBufferMemoryRequirementsKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceBufferMemoryRequirementsKHR(address, null);
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

    public static VkDeviceBufferMemoryRequirementsKHR malloc(MemoryStack stack) {
        return new VkDeviceBufferMemoryRequirementsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceBufferMemoryRequirementsKHR calloc(MemoryStack stack) {
        return new VkDeviceBufferMemoryRequirementsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirementsKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirementsKHR$Buffer.class */
    public static class Buffer extends VkDeviceBufferMemoryRequirements.Buffer {
        private static final VkDeviceBufferMemoryRequirementsKHR ELEMENT_FACTORY = VkDeviceBufferMemoryRequirementsKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceBufferMemoryRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceBufferMemoryRequirementsKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.Buffer
        public Buffer sType$Default() {
            return sType(1000413002);
        }

        @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceBufferMemoryRequirementsKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceBufferMemoryRequirements.Buffer
        public Buffer pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) {
            VkDeviceBufferMemoryRequirementsKHR.npCreateInfo(address(), value);
            return this;
        }
    }
}
