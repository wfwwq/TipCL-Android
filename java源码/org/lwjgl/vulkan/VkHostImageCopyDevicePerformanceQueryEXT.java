package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageCopyDevicePerformanceQueryEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageCopyDevicePerformanceQueryEXT.class */
public class VkHostImageCopyDevicePerformanceQueryEXT extends VkHostImageCopyDevicePerformanceQuery {
    protected VkHostImageCopyDevicePerformanceQueryEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery, org.lwjgl.system.Struct
    public VkHostImageCopyDevicePerformanceQueryEXT create(long address, ByteBuffer container) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(address, container);
    }

    public VkHostImageCopyDevicePerformanceQueryEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery
    public VkHostImageCopyDevicePerformanceQueryEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery
    public VkHostImageCopyDevicePerformanceQueryEXT sType$Default() {
        return sType(1000270009);
    }

    @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery
    public VkHostImageCopyDevicePerformanceQueryEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery
    public VkHostImageCopyDevicePerformanceQueryEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkHostImageCopyDevicePerformanceQueryEXT set(VkHostImageCopyDevicePerformanceQueryEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT malloc() {
        return new VkHostImageCopyDevicePerformanceQueryEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT calloc() {
        return new VkHostImageCopyDevicePerformanceQueryEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageCopyDevicePerformanceQueryEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT create(long address) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(address, null);
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkHostImageCopyDevicePerformanceQueryEXT(address, null);
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

    public static VkHostImageCopyDevicePerformanceQueryEXT malloc(MemoryStack stack) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT calloc(MemoryStack stack) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageCopyDevicePerformanceQueryEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageCopyDevicePerformanceQueryEXT$Buffer.class */
    public static class Buffer extends VkHostImageCopyDevicePerformanceQuery.Buffer {
        private static final VkHostImageCopyDevicePerformanceQueryEXT ELEMENT_FACTORY = VkHostImageCopyDevicePerformanceQueryEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.Buffer, org.lwjgl.system.StructBuffer
        public VkHostImageCopyDevicePerformanceQueryEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkHostImageCopyDevicePerformanceQueryEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.Buffer
        public Buffer sType$Default() {
            return sType(1000270009);
        }

        @Override // org.lwjgl.vulkan.VkHostImageCopyDevicePerformanceQuery.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkHostImageCopyDevicePerformanceQueryEXT.npNext(address(), value);
            return this;
        }
    }
}
