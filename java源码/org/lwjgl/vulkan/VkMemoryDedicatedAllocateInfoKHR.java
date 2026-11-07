package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedAllocateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedAllocateInfoKHR.class */
public class VkMemoryDedicatedAllocateInfoKHR extends VkMemoryDedicatedAllocateInfo {
    protected VkMemoryDedicatedAllocateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo, org.lwjgl.system.Struct
    public VkMemoryDedicatedAllocateInfoKHR create(long address, ByteBuffer container) {
        return new VkMemoryDedicatedAllocateInfoKHR(address, container);
    }

    public VkMemoryDedicatedAllocateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo
    public VkMemoryDedicatedAllocateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo
    public VkMemoryDedicatedAllocateInfoKHR sType$Default() {
        return sType(1000127001);
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo
    public VkMemoryDedicatedAllocateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo
    public VkMemoryDedicatedAllocateInfoKHR image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo
    public VkMemoryDedicatedAllocateInfoKHR buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo
    public VkMemoryDedicatedAllocateInfoKHR set(int sType, long pNext, long image, long buffer) {
        sType(sType);
        pNext(pNext);
        image(image);
        buffer(buffer);
        return this;
    }

    public VkMemoryDedicatedAllocateInfoKHR set(VkMemoryDedicatedAllocateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryDedicatedAllocateInfoKHR malloc() {
        return new VkMemoryDedicatedAllocateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryDedicatedAllocateInfoKHR calloc() {
        return new VkMemoryDedicatedAllocateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryDedicatedAllocateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryDedicatedAllocateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryDedicatedAllocateInfoKHR create(long address) {
        return new VkMemoryDedicatedAllocateInfoKHR(address, null);
    }

    public static VkMemoryDedicatedAllocateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryDedicatedAllocateInfoKHR(address, null);
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

    public static VkMemoryDedicatedAllocateInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryDedicatedAllocateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryDedicatedAllocateInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryDedicatedAllocateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedAllocateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedAllocateInfoKHR$Buffer.class */
    public static class Buffer extends VkMemoryDedicatedAllocateInfo.Buffer {
        private static final VkMemoryDedicatedAllocateInfoKHR ELEMENT_FACTORY = VkMemoryDedicatedAllocateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkMemoryDedicatedAllocateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryDedicatedAllocateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000127001);
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryDedicatedAllocateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer
        public Buffer image(@NativeType("VkImage") long value) {
            VkMemoryDedicatedAllocateInfoKHR.nimage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo.Buffer
        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkMemoryDedicatedAllocateInfoKHR.nbuffer(address(), value);
            return this;
        }
    }
}
