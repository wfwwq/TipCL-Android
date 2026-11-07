package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkOffset2D;
import org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class */
public class VkSubpassFragmentDensityMapOffsetEndInfoQCOM extends VkRenderPassFragmentDensityMapOffsetEndInfoEXT {
    protected VkSubpassFragmentDensityMapOffsetEndInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT, org.lwjgl.system.Struct
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM create(long address, ByteBuffer container) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(address, container);
    }

    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM sType$Default() {
        return sType(1000425002);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM pFragmentDensityOffsets(@NativeType("VkOffset2D const *") VkOffset2D.Buffer value) {
        npFragmentDensityOffsets(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM set(int sType, long pNext, VkOffset2D.Buffer pFragmentDensityOffsets) {
        sType(sType);
        pNext(pNext);
        pFragmentDensityOffsets(pFragmentDensityOffsets);
        return this;
    }

    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM set(VkSubpassFragmentDensityMapOffsetEndInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM malloc() {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM calloc() {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM create(long address) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(address, null);
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(address, null);
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

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM malloc(MemoryStack stack) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM calloc(MemoryStack stack) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassFragmentDensityMapOffsetEndInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassFragmentDensityMapOffsetEndInfoQCOM$Buffer.class */
    public static class Buffer extends VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer {
        private static final VkSubpassFragmentDensityMapOffsetEndInfoQCOM ELEMENT_FACTORY = VkSubpassFragmentDensityMapOffsetEndInfoQCOM.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassFragmentDensityMapOffsetEndInfoQCOM.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000425002);
        }

        @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassFragmentDensityMapOffsetEndInfoEXT.Buffer
        public Buffer pFragmentDensityOffsets(@NativeType("VkOffset2D const *") VkOffset2D.Buffer value) {
            VkSubpassFragmentDensityMapOffsetEndInfoQCOM.npFragmentDensityOffsets(address(), value);
            return this;
        }
    }
}
