package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoKHR.class */
public class VkPipelineRasterizationLineStateCreateInfoKHR extends VkPipelineRasterizationLineStateCreateInfo {
    protected VkPipelineRasterizationLineStateCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo, org.lwjgl.system.Struct
    public VkPipelineRasterizationLineStateCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(address, container);
    }

    public VkPipelineRasterizationLineStateCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR sType$Default() {
        return sType(1000259001);
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) {
        nlineRasterizationMode(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR stippledLineEnable(@NativeType("VkBool32") boolean value) {
        nstippledLineEnable(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR lineStippleFactor(@NativeType("uint32_t") int value) {
        nlineStippleFactor(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR lineStipplePattern(@NativeType("uint16_t") short value) {
        nlineStipplePattern(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoKHR set(int sType, long pNext, int lineRasterizationMode, boolean stippledLineEnable, int lineStippleFactor, short lineStipplePattern) {
        sType(sType);
        pNext(pNext);
        lineRasterizationMode(lineRasterizationMode);
        stippledLineEnable(stippledLineEnable);
        lineStippleFactor(lineStippleFactor);
        lineStipplePattern(lineStipplePattern);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfoKHR set(VkPipelineRasterizationLineStateCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR malloc() {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR calloc() {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationLineStateCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR create(long address) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(address, null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationLineStateCreateInfoKHR(address, null);
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

    public static VkPipelineRasterizationLineStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkPipelineRasterizationLineStateCreateInfo.Buffer {
        private static final VkPipelineRasterizationLineStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineRasterizationLineStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationLineStateCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000259001);
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationLineStateCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) {
            VkPipelineRasterizationLineStateCreateInfoKHR.nlineRasterizationMode(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRasterizationLineStateCreateInfoKHR.nstippledLineEnable(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer lineStippleFactor(@NativeType("uint32_t") int value) {
            VkPipelineRasterizationLineStateCreateInfoKHR.nlineStippleFactor(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer lineStipplePattern(@NativeType("uint16_t") short value) {
            VkPipelineRasterizationLineStateCreateInfoKHR.nlineStipplePattern(address(), value);
            return this;
        }
    }
}
