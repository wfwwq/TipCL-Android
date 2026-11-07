package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSubresourceHostMemcpySize;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceHostMemcpySizeEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceHostMemcpySizeEXT.class */
public class VkSubresourceHostMemcpySizeEXT extends VkSubresourceHostMemcpySize {
    protected VkSubresourceHostMemcpySizeEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize, org.lwjgl.system.Struct
    public VkSubresourceHostMemcpySizeEXT create(long address, ByteBuffer container) {
        return new VkSubresourceHostMemcpySizeEXT(address, container);
    }

    public VkSubresourceHostMemcpySizeEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize
    public VkSubresourceHostMemcpySizeEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize
    public VkSubresourceHostMemcpySizeEXT sType$Default() {
        return sType(1000270008);
    }

    @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize
    public VkSubresourceHostMemcpySizeEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize
    public VkSubresourceHostMemcpySizeEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSubresourceHostMemcpySizeEXT set(VkSubresourceHostMemcpySizeEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubresourceHostMemcpySizeEXT malloc() {
        return new VkSubresourceHostMemcpySizeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubresourceHostMemcpySizeEXT calloc() {
        return new VkSubresourceHostMemcpySizeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubresourceHostMemcpySizeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceHostMemcpySizeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSubresourceHostMemcpySizeEXT create(long address) {
        return new VkSubresourceHostMemcpySizeEXT(address, null);
    }

    public static VkSubresourceHostMemcpySizeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubresourceHostMemcpySizeEXT(address, null);
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

    public static VkSubresourceHostMemcpySizeEXT malloc(MemoryStack stack) {
        return new VkSubresourceHostMemcpySizeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubresourceHostMemcpySizeEXT calloc(MemoryStack stack) {
        return new VkSubresourceHostMemcpySizeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceHostMemcpySizeEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceHostMemcpySizeEXT$Buffer.class */
    public static class Buffer extends VkSubresourceHostMemcpySize.Buffer {
        private static final VkSubresourceHostMemcpySizeEXT ELEMENT_FACTORY = VkSubresourceHostMemcpySizeEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize.Buffer, org.lwjgl.system.StructBuffer
        public VkSubresourceHostMemcpySizeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubresourceHostMemcpySizeEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize.Buffer
        public Buffer sType$Default() {
            return sType(1000270008);
        }

        @Override // org.lwjgl.vulkan.VkSubresourceHostMemcpySize.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkSubresourceHostMemcpySizeEXT.npNext(address(), value);
            return this;
        }
    }
}
