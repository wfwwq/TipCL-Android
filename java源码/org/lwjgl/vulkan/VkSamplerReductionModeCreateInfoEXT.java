package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfoEXT.class */
public class VkSamplerReductionModeCreateInfoEXT extends VkSamplerReductionModeCreateInfo {
    protected VkSamplerReductionModeCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo, org.lwjgl.system.Struct
    public VkSamplerReductionModeCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkSamplerReductionModeCreateInfoEXT(address, container);
    }

    public VkSamplerReductionModeCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo
    public VkSamplerReductionModeCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo
    public VkSamplerReductionModeCreateInfoEXT sType$Default() {
        return sType(1000130001);
    }

    @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo
    public VkSamplerReductionModeCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo
    public VkSamplerReductionModeCreateInfoEXT reductionMode(@NativeType("VkSamplerReductionMode") int value) {
        nreductionMode(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo
    public VkSamplerReductionModeCreateInfoEXT set(int sType, long pNext, int reductionMode) {
        sType(sType);
        pNext(pNext);
        reductionMode(reductionMode);
        return this;
    }

    public VkSamplerReductionModeCreateInfoEXT set(VkSamplerReductionModeCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerReductionModeCreateInfoEXT malloc() {
        return new VkSamplerReductionModeCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerReductionModeCreateInfoEXT calloc() {
        return new VkSamplerReductionModeCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerReductionModeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerReductionModeCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerReductionModeCreateInfoEXT create(long address) {
        return new VkSamplerReductionModeCreateInfoEXT(address, null);
    }

    public static VkSamplerReductionModeCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerReductionModeCreateInfoEXT(address, null);
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

    public static VkSamplerReductionModeCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSamplerReductionModeCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerReductionModeCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSamplerReductionModeCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfoEXT$Buffer.class */
    public static class Buffer extends VkSamplerReductionModeCreateInfo.Buffer {
        private static final VkSamplerReductionModeCreateInfoEXT ELEMENT_FACTORY = VkSamplerReductionModeCreateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSamplerReductionModeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerReductionModeCreateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000130001);
        }

        @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerReductionModeCreateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerReductionModeCreateInfo.Buffer
        public Buffer reductionMode(@NativeType("VkSamplerReductionMode") int value) {
            VkSamplerReductionModeCreateInfoEXT.nreductionMode(address(), value);
            return this;
        }
    }
}
