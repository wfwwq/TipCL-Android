package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentScalingCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentScalingCreateInfoEXT.class */
public class VkSwapchainPresentScalingCreateInfoEXT extends VkSwapchainPresentScalingCreateInfoKHR {
    protected VkSwapchainPresentScalingCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR, org.lwjgl.system.Struct
    public VkSwapchainPresentScalingCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkSwapchainPresentScalingCreateInfoEXT(address, container);
    }

    public VkSwapchainPresentScalingCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR
    public VkSwapchainPresentScalingCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR
    public VkSwapchainPresentScalingCreateInfoEXT sType$Default() {
        return sType(1000275004);
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR
    public VkSwapchainPresentScalingCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehavior(@NativeType("VkPresentScalingFlagsKHR") int value) {
        nscalingBehavior(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
        npresentGravityX(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
        npresentGravityY(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR
    public VkSwapchainPresentScalingCreateInfoEXT set(int sType, long pNext, int scalingBehavior, int presentGravityX, int presentGravityY) {
        sType(sType);
        pNext(pNext);
        scalingBehavior(scalingBehavior);
        presentGravityX(presentGravityX);
        presentGravityY(presentGravityY);
        return this;
    }

    public VkSwapchainPresentScalingCreateInfoEXT set(VkSwapchainPresentScalingCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT malloc() {
        return new VkSwapchainPresentScalingCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentScalingCreateInfoEXT calloc() {
        return new VkSwapchainPresentScalingCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentScalingCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentScalingCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentScalingCreateInfoEXT create(long address) {
        return new VkSwapchainPresentScalingCreateInfoEXT(address, null);
    }

    public static VkSwapchainPresentScalingCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentScalingCreateInfoEXT(address, null);
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

    public static VkSwapchainPresentScalingCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentScalingCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentScalingCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentScalingCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkSwapchainPresentScalingCreateInfoKHR.Buffer {
        private static final VkSwapchainPresentScalingCreateInfoEXT ELEMENT_FACTORY = VkSwapchainPresentScalingCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkSwapchainPresentScalingCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentScalingCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000275004);
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentScalingCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer
        public Buffer scalingBehavior(@NativeType("VkPresentScalingFlagsKHR") int value) {
            VkSwapchainPresentScalingCreateInfoEXT.nscalingBehavior(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer
        public Buffer presentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSwapchainPresentScalingCreateInfoEXT.npresentGravityX(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoKHR.Buffer
        public Buffer presentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSwapchainPresentScalingCreateInfoEXT.npresentGravityY(address(), value);
            return this;
        }
    }
}
