package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSubpassEndInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfoKHR.class */
public class VkSubpassEndInfoKHR extends VkSubpassEndInfo {
    protected VkSubpassEndInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubpassEndInfo, org.lwjgl.system.Struct
    public VkSubpassEndInfoKHR create(long address, ByteBuffer container) {
        return new VkSubpassEndInfoKHR(address, container);
    }

    public VkSubpassEndInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubpassEndInfo
    public VkSubpassEndInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassEndInfo
    public VkSubpassEndInfoKHR sType$Default() {
        return sType(1000109006);
    }

    @Override // org.lwjgl.vulkan.VkSubpassEndInfo
    public VkSubpassEndInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassEndInfo
    public VkSubpassEndInfoKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSubpassEndInfoKHR set(VkSubpassEndInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassEndInfoKHR malloc() {
        return new VkSubpassEndInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassEndInfoKHR calloc() {
        return new VkSubpassEndInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassEndInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassEndInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassEndInfoKHR create(long address) {
        return new VkSubpassEndInfoKHR(address, null);
    }

    public static VkSubpassEndInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassEndInfoKHR(address, null);
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

    public static VkSubpassEndInfoKHR malloc(MemoryStack stack) {
        return new VkSubpassEndInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassEndInfoKHR calloc(MemoryStack stack) {
        return new VkSubpassEndInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfoKHR$Buffer.class */
    public static class Buffer extends VkSubpassEndInfo.Buffer {
        private static final VkSubpassEndInfoKHR ELEMENT_FACTORY = VkSubpassEndInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubpassEndInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassEndInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassEndInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSubpassEndInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubpassEndInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassEndInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassEndInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000109006);
        }

        @Override // org.lwjgl.vulkan.VkSubpassEndInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassEndInfoKHR.npNext(address(), value);
            return this;
        }
    }
}
