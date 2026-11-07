package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfoKHR.class */
public class VkSamplerYcbcrConversionInfoKHR extends VkSamplerYcbcrConversionInfo {
    protected VkSamplerYcbcrConversionInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo, org.lwjgl.system.Struct
    public VkSamplerYcbcrConversionInfoKHR create(long address, ByteBuffer container) {
        return new VkSamplerYcbcrConversionInfoKHR(address, container);
    }

    public VkSamplerYcbcrConversionInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo
    public VkSamplerYcbcrConversionInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo
    public VkSamplerYcbcrConversionInfoKHR sType$Default() {
        return sType(1000156001);
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo
    public VkSamplerYcbcrConversionInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo
    public VkSamplerYcbcrConversionInfoKHR conversion(@NativeType("VkSamplerYcbcrConversion") long value) {
        nconversion(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo
    public VkSamplerYcbcrConversionInfoKHR set(int sType, long pNext, long conversion) {
        sType(sType);
        pNext(pNext);
        conversion(conversion);
        return this;
    }

    public VkSamplerYcbcrConversionInfoKHR set(VkSamplerYcbcrConversionInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerYcbcrConversionInfoKHR malloc() {
        return new VkSamplerYcbcrConversionInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionInfoKHR calloc() {
        return new VkSamplerYcbcrConversionInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerYcbcrConversionInfoKHR create(long address) {
        return new VkSamplerYcbcrConversionInfoKHR(address, null);
    }

    public static VkSamplerYcbcrConversionInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversionInfoKHR(address, null);
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

    public static VkSamplerYcbcrConversionInfoKHR malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionInfoKHR calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionInfoKHR$Buffer.class */
    public static class Buffer extends VkSamplerYcbcrConversionInfo.Buffer {
        private static final VkSamplerYcbcrConversionInfoKHR ELEMENT_FACTORY = VkSamplerYcbcrConversionInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSamplerYcbcrConversionInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerYcbcrConversionInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000156001);
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerYcbcrConversionInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionInfo.Buffer
        public Buffer conversion(@NativeType("VkSamplerYcbcrConversion") long value) {
            VkSamplerYcbcrConversionInfoKHR.nconversion(address(), value);
            return this;
        }
    }
}
