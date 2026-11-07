package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfoKHR.class */
public class VkRenderPassMultiviewCreateInfoKHR extends VkRenderPassMultiviewCreateInfo {
    protected VkRenderPassMultiviewCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo, org.lwjgl.system.Struct
    public VkRenderPassMultiviewCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderPassMultiviewCreateInfoKHR(address, container);
    }

    public VkRenderPassMultiviewCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo
    public VkRenderPassMultiviewCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo
    public VkRenderPassMultiviewCreateInfoKHR sType$Default() {
        return sType(1000053000);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo
    public VkRenderPassMultiviewCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo
    public VkRenderPassMultiviewCreateInfoKHR pViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npViewMasks(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo
    public VkRenderPassMultiviewCreateInfoKHR pViewOffsets(@NativeType("int32_t const *") IntBuffer value) {
        npViewOffsets(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo
    public VkRenderPassMultiviewCreateInfoKHR pCorrelationMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npCorrelationMasks(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo
    public VkRenderPassMultiviewCreateInfoKHR set(int sType, long pNext, IntBuffer pViewMasks, IntBuffer pViewOffsets, IntBuffer pCorrelationMasks) {
        sType(sType);
        pNext(pNext);
        pViewMasks(pViewMasks);
        pViewOffsets(pViewOffsets);
        pCorrelationMasks(pCorrelationMasks);
        return this;
    }

    public VkRenderPassMultiviewCreateInfoKHR set(VkRenderPassMultiviewCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassMultiviewCreateInfoKHR malloc() {
        return new VkRenderPassMultiviewCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassMultiviewCreateInfoKHR calloc() {
        return new VkRenderPassMultiviewCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassMultiviewCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassMultiviewCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassMultiviewCreateInfoKHR create(long address) {
        return new VkRenderPassMultiviewCreateInfoKHR(address, null);
    }

    public static VkRenderPassMultiviewCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassMultiviewCreateInfoKHR(address, null);
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

    public static VkRenderPassMultiviewCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassMultiviewCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRenderPassMultiviewCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassMultiviewCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkRenderPassMultiviewCreateInfo.Buffer {
        private static final VkRenderPassMultiviewCreateInfoKHR ELEMENT_FACTORY = VkRenderPassMultiviewCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderPassMultiviewCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassMultiviewCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000053000);
        }

        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassMultiviewCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer
        public Buffer pViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderPassMultiviewCreateInfoKHR.npViewMasks(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer
        public Buffer pViewOffsets(@NativeType("int32_t const *") IntBuffer value) {
            VkRenderPassMultiviewCreateInfoKHR.npViewOffsets(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassMultiviewCreateInfo.Buffer
        public Buffer pCorrelationMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderPassMultiviewCreateInfoKHR.npCorrelationMasks(address(), value);
            return this;
        }
    }
}
