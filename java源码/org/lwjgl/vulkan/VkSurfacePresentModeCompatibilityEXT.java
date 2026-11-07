package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeCompatibilityEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeCompatibilityEXT.class */
public class VkSurfacePresentModeCompatibilityEXT extends VkSurfacePresentModeCompatibilityKHR {
    protected VkSurfacePresentModeCompatibilityEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR, org.lwjgl.system.Struct
    public VkSurfacePresentModeCompatibilityEXT create(long address, ByteBuffer container) {
        return new VkSurfacePresentModeCompatibilityEXT(address, container);
    }

    public VkSurfacePresentModeCompatibilityEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR
    public VkSurfacePresentModeCompatibilityEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR
    public VkSurfacePresentModeCompatibilityEXT sType$Default() {
        return sType(1000274002);
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR
    public VkSurfacePresentModeCompatibilityEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR
    public VkSurfacePresentModeCompatibilityEXT presentModeCount(@NativeType("uint32_t") int value) {
        npresentModeCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR
    public VkSurfacePresentModeCompatibilityEXT pPresentModes(@NativeType("VkPresentModeKHR *") IntBuffer value) {
        npPresentModes(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR
    public VkSurfacePresentModeCompatibilityEXT set(int sType, long pNext, int presentModeCount, IntBuffer pPresentModes) {
        sType(sType);
        pNext(pNext);
        presentModeCount(presentModeCount);
        pPresentModes(pPresentModes);
        return this;
    }

    public VkSurfacePresentModeCompatibilityEXT set(VkSurfacePresentModeCompatibilityEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfacePresentModeCompatibilityEXT malloc() {
        return new VkSurfacePresentModeCompatibilityEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfacePresentModeCompatibilityEXT calloc() {
        return new VkSurfacePresentModeCompatibilityEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfacePresentModeCompatibilityEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeCompatibilityEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfacePresentModeCompatibilityEXT create(long address) {
        return new VkSurfacePresentModeCompatibilityEXT(address, null);
    }

    public static VkSurfacePresentModeCompatibilityEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfacePresentModeCompatibilityEXT(address, null);
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

    public static VkSurfacePresentModeCompatibilityEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfacePresentModeCompatibilityEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeCompatibilityEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentModeCompatibilityEXT$Buffer.class */
    public static class Buffer extends VkSurfacePresentModeCompatibilityKHR.Buffer {
        private static final VkSurfacePresentModeCompatibilityEXT ELEMENT_FACTORY = VkSurfacePresentModeCompatibilityEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkSurfacePresentModeCompatibilityEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfacePresentModeCompatibilityEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000274002);
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfacePresentModeCompatibilityEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer
        public Buffer presentModeCount(@NativeType("uint32_t") int value) {
            VkSurfacePresentModeCompatibilityEXT.npresentModeCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentModeCompatibilityKHR.Buffer
        public Buffer pPresentModes(@NativeType("VkPresentModeKHR *") IntBuffer value) {
            VkSurfacePresentModeCompatibilityEXT.npPresentModes(address(), value);
            return this;
        }
    }
}
