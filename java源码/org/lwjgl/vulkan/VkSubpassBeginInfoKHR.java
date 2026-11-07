package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSubpassBeginInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfoKHR.class */
public class VkSubpassBeginInfoKHR extends VkSubpassBeginInfo {
    protected VkSubpassBeginInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubpassBeginInfo, org.lwjgl.system.Struct
    public VkSubpassBeginInfoKHR create(long address, ByteBuffer container) {
        return new VkSubpassBeginInfoKHR(address, container);
    }

    public VkSubpassBeginInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubpassBeginInfo
    public VkSubpassBeginInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassBeginInfo
    public VkSubpassBeginInfoKHR sType$Default() {
        return sType(1000109005);
    }

    @Override // org.lwjgl.vulkan.VkSubpassBeginInfo
    public VkSubpassBeginInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassBeginInfo
    public VkSubpassBeginInfoKHR contents(@NativeType("VkSubpassContents") int value) {
        ncontents(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassBeginInfo
    public VkSubpassBeginInfoKHR set(int sType, long pNext, int contents) {
        sType(sType);
        pNext(pNext);
        contents(contents);
        return this;
    }

    public VkSubpassBeginInfoKHR set(VkSubpassBeginInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassBeginInfoKHR malloc() {
        return new VkSubpassBeginInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassBeginInfoKHR calloc() {
        return new VkSubpassBeginInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassBeginInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassBeginInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassBeginInfoKHR create(long address) {
        return new VkSubpassBeginInfoKHR(address, null);
    }

    public static VkSubpassBeginInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassBeginInfoKHR(address, null);
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

    public static VkSubpassBeginInfoKHR malloc(MemoryStack stack) {
        return new VkSubpassBeginInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassBeginInfoKHR calloc(MemoryStack stack) {
        return new VkSubpassBeginInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfoKHR$Buffer.class */
    public static class Buffer extends VkSubpassBeginInfo.Buffer {
        private static final VkSubpassBeginInfoKHR ELEMENT_FACTORY = VkSubpassBeginInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubpassBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassBeginInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassBeginInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSubpassBeginInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubpassBeginInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassBeginInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassBeginInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000109005);
        }

        @Override // org.lwjgl.vulkan.VkSubpassBeginInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassBeginInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassBeginInfo.Buffer
        public Buffer contents(@NativeType("VkSubpassContents") int value) {
            VkSubpassBeginInfoKHR.ncontents(address(), value);
            return this;
        }
    }
}
