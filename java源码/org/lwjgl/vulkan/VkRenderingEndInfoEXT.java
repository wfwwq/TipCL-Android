package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRenderingEndInfoKHR;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingEndInfoEXT.class */
public class VkRenderingEndInfoEXT extends VkRenderingEndInfoKHR {
    protected VkRenderingEndInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR, org.lwjgl.system.Struct
    public VkRenderingEndInfoEXT create(long address, ByteBuffer container) {
        return new VkRenderingEndInfoEXT(address, container);
    }

    public VkRenderingEndInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR
    public VkRenderingEndInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR
    public VkRenderingEndInfoEXT sType$Default() {
        return sType(1000619003);
    }

    @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR
    public VkRenderingEndInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR
    public VkRenderingEndInfoEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkRenderingEndInfoEXT set(VkRenderingEndInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingEndInfoEXT malloc() {
        return new VkRenderingEndInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingEndInfoEXT calloc() {
        return new VkRenderingEndInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingEndInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingEndInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingEndInfoEXT create(long address) {
        return new VkRenderingEndInfoEXT(address, null);
    }

    public static VkRenderingEndInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingEndInfoEXT(address, null);
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

    public static VkRenderingEndInfoEXT malloc(MemoryStack stack) {
        return new VkRenderingEndInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingEndInfoEXT calloc(MemoryStack stack) {
        return new VkRenderingEndInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingEndInfoEXT$Buffer.class */
    public static class Buffer extends VkRenderingEndInfoKHR.Buffer {
        private static final VkRenderingEndInfoEXT ELEMENT_FACTORY = VkRenderingEndInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderingEndInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingEndInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000619003);
        }

        @Override // org.lwjgl.vulkan.VkRenderingEndInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingEndInfoEXT.npNext(address(), value);
            return this;
        }
    }
}
