package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkFormatProperties3;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3KHR.class */
public class VkFormatProperties3KHR extends VkFormatProperties3 {
    protected VkFormatProperties3KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkFormatProperties3, org.lwjgl.system.Struct
    public VkFormatProperties3KHR create(long address, ByteBuffer container) {
        return new VkFormatProperties3KHR(address, container);
    }

    public VkFormatProperties3KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkFormatProperties3
    public VkFormatProperties3KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFormatProperties3
    public VkFormatProperties3KHR sType$Default() {
        return sType(1000360000);
    }

    @Override // org.lwjgl.vulkan.VkFormatProperties3
    public VkFormatProperties3KHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkFormatProperties3
    public VkFormatProperties3KHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkFormatProperties3KHR set(VkFormatProperties3KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFormatProperties3KHR malloc() {
        return new VkFormatProperties3KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFormatProperties3KHR calloc() {
        return new VkFormatProperties3KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFormatProperties3KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFormatProperties3KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkFormatProperties3KHR create(long address) {
        return new VkFormatProperties3KHR(address, null);
    }

    public static VkFormatProperties3KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFormatProperties3KHR(address, null);
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

    public static VkFormatProperties3KHR malloc(MemoryStack stack) {
        return new VkFormatProperties3KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFormatProperties3KHR calloc(MemoryStack stack) {
        return new VkFormatProperties3KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3KHR$Buffer.class */
    public static class Buffer extends VkFormatProperties3.Buffer {
        private static final VkFormatProperties3KHR ELEMENT_FACTORY = VkFormatProperties3KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkFormatProperties3.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkFormatProperties3.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkFormatProperties3.Buffer, org.lwjgl.system.StructBuffer
        public VkFormatProperties3KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkFormatProperties3.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFormatProperties3KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkFormatProperties3.Buffer
        public Buffer sType$Default() {
            return sType(1000360000);
        }

        @Override // org.lwjgl.vulkan.VkFormatProperties3.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkFormatProperties3KHR.npNext(address(), value);
            return this;
        }
    }
}
