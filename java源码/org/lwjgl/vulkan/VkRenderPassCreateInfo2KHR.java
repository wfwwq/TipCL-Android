package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAttachmentDescription2;
import org.lwjgl.vulkan.VkRenderPassCreateInfo2;
import org.lwjgl.vulkan.VkSubpassDependency2;
import org.lwjgl.vulkan.VkSubpassDescription2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2KHR.class */
public class VkRenderPassCreateInfo2KHR extends VkRenderPassCreateInfo2 {
    protected VkRenderPassCreateInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2, org.lwjgl.system.Struct
    public VkRenderPassCreateInfo2KHR create(long address, ByteBuffer container) {
        return new VkRenderPassCreateInfo2KHR(address, container);
    }

    public VkRenderPassCreateInfo2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR sType$Default() {
        return sType(1000109004);
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR flags(@NativeType("VkRenderPassCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) {
        npAttachments(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) {
        npSubpasses(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) {
        npDependencies(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR pCorrelatedViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
        npCorrelatedViewMasks(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2
    public VkRenderPassCreateInfo2KHR set(int sType, long pNext, int flags, VkAttachmentDescription2.Buffer pAttachments, VkSubpassDescription2.Buffer pSubpasses, VkSubpassDependency2.Buffer pDependencies, IntBuffer pCorrelatedViewMasks) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pAttachments(pAttachments);
        pSubpasses(pSubpasses);
        pDependencies(pDependencies);
        pCorrelatedViewMasks(pCorrelatedViewMasks);
        return this;
    }

    public VkRenderPassCreateInfo2KHR set(VkRenderPassCreateInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassCreateInfo2KHR malloc() {
        return new VkRenderPassCreateInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassCreateInfo2KHR calloc() {
        return new VkRenderPassCreateInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassCreateInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreateInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassCreateInfo2KHR create(long address) {
        return new VkRenderPassCreateInfo2KHR(address, null);
    }

    public static VkRenderPassCreateInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassCreateInfo2KHR(address, null);
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

    public static VkRenderPassCreateInfo2KHR malloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassCreateInfo2KHR calloc(MemoryStack stack) {
        return new VkRenderPassCreateInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2KHR$Buffer.class */
    public static class Buffer extends VkRenderPassCreateInfo2.Buffer {
        private static final VkRenderPassCreateInfo2KHR ELEMENT_FACTORY = VkRenderPassCreateInfo2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderPassCreateInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassCreateInfo2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer sType$Default() {
            return sType(1000109004);
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassCreateInfo2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer flags(@NativeType("VkRenderPassCreateFlags") int value) {
            VkRenderPassCreateInfo2KHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer pAttachments(@NativeType("VkAttachmentDescription2 const *") VkAttachmentDescription2.Buffer value) {
            VkRenderPassCreateInfo2KHR.npAttachments(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer pSubpasses(@NativeType("VkSubpassDescription2 const *") VkSubpassDescription2.Buffer value) {
            VkRenderPassCreateInfo2KHR.npSubpasses(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer pDependencies(@NativeType("VkSubpassDependency2 const *") VkSubpassDependency2.Buffer value) {
            VkRenderPassCreateInfo2KHR.npDependencies(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer
        public Buffer pCorrelatedViewMasks(@NativeType("uint32_t const *") IntBuffer value) {
            VkRenderPassCreateInfo2KHR.npCorrelatedViewMasks(address(), value);
            return this;
        }
    }
}
