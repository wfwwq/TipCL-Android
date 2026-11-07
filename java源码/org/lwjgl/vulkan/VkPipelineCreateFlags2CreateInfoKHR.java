package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreateFlags2CreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreateFlags2CreateInfoKHR.class */
public class VkPipelineCreateFlags2CreateInfoKHR extends VkPipelineCreateFlags2CreateInfo {
    protected VkPipelineCreateFlags2CreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo, org.lwjgl.system.Struct
    public VkPipelineCreateFlags2CreateInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineCreateFlags2CreateInfoKHR(address, container);
    }

    public VkPipelineCreateFlags2CreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo
    public VkPipelineCreateFlags2CreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo
    public VkPipelineCreateFlags2CreateInfoKHR sType$Default() {
        return sType(1000470005);
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo
    public VkPipelineCreateFlags2CreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo
    public VkPipelineCreateFlags2CreateInfoKHR flags(@NativeType("VkPipelineCreateFlags2") long value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo
    public VkPipelineCreateFlags2CreateInfoKHR set(int sType, long pNext, long flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkPipelineCreateFlags2CreateInfoKHR set(VkPipelineCreateFlags2CreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCreateFlags2CreateInfoKHR malloc() {
        return new VkPipelineCreateFlags2CreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCreateFlags2CreateInfoKHR calloc() {
        return new VkPipelineCreateFlags2CreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCreateFlags2CreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCreateFlags2CreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCreateFlags2CreateInfoKHR create(long address) {
        return new VkPipelineCreateFlags2CreateInfoKHR(address, null);
    }

    public static VkPipelineCreateFlags2CreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCreateFlags2CreateInfoKHR(address, null);
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

    public static VkPipelineCreateFlags2CreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineCreateFlags2CreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCreateFlags2CreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineCreateFlags2CreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreateFlags2CreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCreateFlags2CreateInfoKHR$Buffer.class */
    public static class Buffer extends VkPipelineCreateFlags2CreateInfo.Buffer {
        private static final VkPipelineCreateFlags2CreateInfoKHR ELEMENT_FACTORY = VkPipelineCreateFlags2CreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineCreateFlags2CreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCreateFlags2CreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000470005);
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCreateFlags2CreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineCreateFlags2CreateInfo.Buffer
        public Buffer flags(@NativeType("VkPipelineCreateFlags2") long value) {
            VkPipelineCreateFlags2CreateInfoKHR.nflags(address(), value);
            return this;
        }
    }
}
