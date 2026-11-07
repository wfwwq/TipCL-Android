package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDeviceImageMemoryRequirements;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirementsKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirementsKHR.class */
public class VkDeviceImageMemoryRequirementsKHR extends VkDeviceImageMemoryRequirements {
    protected VkDeviceImageMemoryRequirementsKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements, org.lwjgl.system.Struct
    public VkDeviceImageMemoryRequirementsKHR create(long address, ByteBuffer container) {
        return new VkDeviceImageMemoryRequirementsKHR(address, container);
    }

    public VkDeviceImageMemoryRequirementsKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
    public VkDeviceImageMemoryRequirementsKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
    public VkDeviceImageMemoryRequirementsKHR sType$Default() {
        return sType(1000413003);
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
    public VkDeviceImageMemoryRequirementsKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
    public VkDeviceImageMemoryRequirementsKHR pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
        npCreateInfo(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
    public VkDeviceImageMemoryRequirementsKHR planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
        nplaneAspect(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements
    public VkDeviceImageMemoryRequirementsKHR set(int sType, long pNext, VkImageCreateInfo pCreateInfo, int planeAspect) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        planeAspect(planeAspect);
        return this;
    }

    public VkDeviceImageMemoryRequirementsKHR set(VkDeviceImageMemoryRequirementsKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceImageMemoryRequirementsKHR malloc() {
        return new VkDeviceImageMemoryRequirementsKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceImageMemoryRequirementsKHR calloc() {
        return new VkDeviceImageMemoryRequirementsKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceImageMemoryRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageMemoryRequirementsKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceImageMemoryRequirementsKHR create(long address) {
        return new VkDeviceImageMemoryRequirementsKHR(address, null);
    }

    public static VkDeviceImageMemoryRequirementsKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceImageMemoryRequirementsKHR(address, null);
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

    public static VkDeviceImageMemoryRequirementsKHR malloc(MemoryStack stack) {
        return new VkDeviceImageMemoryRequirementsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceImageMemoryRequirementsKHR calloc(MemoryStack stack) {
        return new VkDeviceImageMemoryRequirementsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirementsKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirementsKHR$Buffer.class */
    public static class Buffer extends VkDeviceImageMemoryRequirements.Buffer {
        private static final VkDeviceImageMemoryRequirementsKHR ELEMENT_FACTORY = VkDeviceImageMemoryRequirementsKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer, org.lwjgl.system.StructBuffer
        public VkDeviceImageMemoryRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceImageMemoryRequirementsKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer
        public Buffer sType$Default() {
            return sType(1000413003);
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceImageMemoryRequirementsKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer
        public Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
            VkDeviceImageMemoryRequirementsKHR.npCreateInfo(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDeviceImageMemoryRequirements.Buffer
        public Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
            VkDeviceImageMemoryRequirementsKHR.nplaneAspect(address(), value);
            return this;
        }
    }
}
