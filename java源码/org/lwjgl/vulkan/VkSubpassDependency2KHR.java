package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSubpassDependency2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2KHR.class */
public class VkSubpassDependency2KHR extends VkSubpassDependency2 {
    protected VkSubpassDependency2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubpassDependency2, org.lwjgl.system.Struct
    public VkSubpassDependency2KHR create(long address, ByteBuffer container) {
        return new VkSubpassDependency2KHR(address, container);
    }

    public VkSubpassDependency2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR sType$Default() {
        return sType(1000109003);
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR srcSubpass(@NativeType("uint32_t") int value) {
        nsrcSubpass(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR dstSubpass(@NativeType("uint32_t") int value) {
        ndstSubpass(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR srcStageMask(@NativeType("VkPipelineStageFlags") int value) {
        nsrcStageMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR dstStageMask(@NativeType("VkPipelineStageFlags") int value) {
        ndstStageMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR srcAccessMask(@NativeType("VkAccessFlags") int value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR dstAccessMask(@NativeType("VkAccessFlags") int value) {
        ndstAccessMask(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR dependencyFlags(@NativeType("VkDependencyFlags") int value) {
        ndependencyFlags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR viewOffset(@NativeType("int32_t") int value) {
        nviewOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDependency2
    public VkSubpassDependency2KHR set(int sType, long pNext, int srcSubpass, int dstSubpass, int srcStageMask, int dstStageMask, int srcAccessMask, int dstAccessMask, int dependencyFlags, int viewOffset) {
        sType(sType);
        pNext(pNext);
        srcSubpass(srcSubpass);
        dstSubpass(dstSubpass);
        srcStageMask(srcStageMask);
        dstStageMask(dstStageMask);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        dependencyFlags(dependencyFlags);
        viewOffset(viewOffset);
        return this;
    }

    public VkSubpassDependency2KHR set(VkSubpassDependency2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDependency2KHR malloc() {
        return new VkSubpassDependency2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDependency2KHR calloc() {
        return new VkSubpassDependency2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDependency2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDependency2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDependency2KHR create(long address) {
        return new VkSubpassDependency2KHR(address, null);
    }

    public static VkSubpassDependency2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDependency2KHR(address, null);
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

    public static VkSubpassDependency2KHR malloc(MemoryStack stack) {
        return new VkSubpassDependency2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDependency2KHR calloc(MemoryStack stack) {
        return new VkSubpassDependency2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDependency2KHR$Buffer.class */
    public static class Buffer extends VkSubpassDependency2.Buffer {
        private static final VkSubpassDependency2KHR ELEMENT_FACTORY = VkSubpassDependency2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer, org.lwjgl.system.StructBuffer
        public VkSubpassDependency2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassDependency2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer sType$Default() {
            return sType(1000109003);
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassDependency2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer srcSubpass(@NativeType("uint32_t") int value) {
            VkSubpassDependency2KHR.nsrcSubpass(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer dstSubpass(@NativeType("uint32_t") int value) {
            VkSubpassDependency2KHR.ndstSubpass(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags") int value) {
            VkSubpassDependency2KHR.nsrcStageMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags") int value) {
            VkSubpassDependency2KHR.ndstStageMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) {
            VkSubpassDependency2KHR.nsrcAccessMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) {
            VkSubpassDependency2KHR.ndstAccessMask(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) {
            VkSubpassDependency2KHR.ndependencyFlags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDependency2.Buffer
        public Buffer viewOffset(@NativeType("int32_t") int value) {
            VkSubpassDependency2KHR.nviewOffset(address(), value);
            return this;
        }
    }
}
