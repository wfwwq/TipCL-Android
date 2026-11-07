package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoEXT.class */
public class VkPipelineRasterizationLineStateCreateInfoEXT extends VkPipelineRasterizationLineStateCreateInfo {
    protected VkPipelineRasterizationLineStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo, org.lwjgl.system.Struct
    public VkPipelineRasterizationLineStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(address, container);
    }

    public VkPipelineRasterizationLineStateCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT sType$Default() {
        return sType(1000259001);
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) {
        nlineRasterizationMode(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT stippledLineEnable(@NativeType("VkBool32") boolean value) {
        nstippledLineEnable(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT lineStippleFactor(@NativeType("uint32_t") int value) {
        nlineStippleFactor(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT lineStipplePattern(@NativeType("uint16_t") short value) {
        nlineStipplePattern(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
    public VkPipelineRasterizationLineStateCreateInfoEXT set(int sType, long pNext, int lineRasterizationMode, boolean stippledLineEnable, int lineStippleFactor, short lineStipplePattern) {
        sType(sType);
        pNext(pNext);
        lineRasterizationMode(lineRasterizationMode);
        stippledLineEnable(stippledLineEnable);
        lineStippleFactor(lineStippleFactor);
        lineStipplePattern(lineStipplePattern);
        return this;
    }

    public VkPipelineRasterizationLineStateCreateInfoEXT set(VkPipelineRasterizationLineStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRasterizationLineStateCreateInfoEXT malloc() {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoEXT calloc() {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationLineStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRasterizationLineStateCreateInfoEXT create(long address) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(address, null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRasterizationLineStateCreateInfoEXT(address, null);
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

    public static VkPipelineRasterizationLineStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRasterizationLineStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkPipelineRasterizationLineStateCreateInfo.Buffer {
        private static final VkPipelineRasterizationLineStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfoEXT.create(-1L);

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
        public VkPipelineRasterizationLineStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRasterizationLineStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000259001);
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRasterizationLineStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) {
            VkPipelineRasterizationLineStateCreateInfoEXT.nlineRasterizationMode(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRasterizationLineStateCreateInfoEXT.nstippledLineEnable(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer lineStippleFactor(@NativeType("uint32_t") int value) {
            VkPipelineRasterizationLineStateCreateInfoEXT.nlineStippleFactor(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer
        public Buffer lineStipplePattern(@NativeType("uint16_t") short value) {
            VkPipelineRasterizationLineStateCreateInfoEXT.nlineStipplePattern(address(), value);
            return this;
        }
    }
}
