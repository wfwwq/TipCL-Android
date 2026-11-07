package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSubresourceLayout2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout2EXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout2EXT.class */
public class VkSubresourceLayout2EXT extends VkSubresourceLayout2 {
    protected VkSubresourceLayout2EXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubresourceLayout2, org.lwjgl.system.Struct
    public VkSubresourceLayout2EXT create(long address, ByteBuffer container) {
        return new VkSubresourceLayout2EXT(address, container);
    }

    public VkSubresourceLayout2EXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubresourceLayout2
    public VkSubresourceLayout2EXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubresourceLayout2
    public VkSubresourceLayout2EXT sType$Default() {
        return sType(1000338002);
    }

    @Override // org.lwjgl.vulkan.VkSubresourceLayout2
    public VkSubresourceLayout2EXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubresourceLayout2
    public VkSubresourceLayout2EXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSubresourceLayout2EXT set(VkSubresourceLayout2EXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubresourceLayout2EXT malloc() {
        return new VkSubresourceLayout2EXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubresourceLayout2EXT calloc() {
        return new VkSubresourceLayout2EXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubresourceLayout2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout2EXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSubresourceLayout2EXT create(long address) {
        return new VkSubresourceLayout2EXT(address, null);
    }

    public static VkSubresourceLayout2EXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubresourceLayout2EXT(address, null);
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

    public static VkSubresourceLayout2EXT malloc(MemoryStack stack) {
        return new VkSubresourceLayout2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubresourceLayout2EXT calloc(MemoryStack stack) {
        return new VkSubresourceLayout2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout2EXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubresourceLayout2EXT$Buffer.class */
    public static class Buffer extends VkSubresourceLayout2.Buffer {
        private static final VkSubresourceLayout2EXT ELEMENT_FACTORY = VkSubresourceLayout2EXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubresourceLayout2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubresourceLayout2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubresourceLayout2.Buffer, org.lwjgl.system.StructBuffer
        public VkSubresourceLayout2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubresourceLayout2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubresourceLayout2EXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubresourceLayout2.Buffer
        public Buffer sType$Default() {
            return sType(1000338002);
        }

        @Override // org.lwjgl.vulkan.VkSubresourceLayout2.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkSubresourceLayout2EXT.npNext(address(), value);
            return this;
        }
    }
}
