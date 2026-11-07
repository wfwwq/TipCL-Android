package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAttachmentDescription2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription2KHR.class */
public class VkAttachmentDescription2KHR extends VkAttachmentDescription2 {
    protected VkAttachmentDescription2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkAttachmentDescription2, org.lwjgl.system.Struct
    public VkAttachmentDescription2KHR create(long address, ByteBuffer container) {
        return new VkAttachmentDescription2KHR(address, container);
    }

    public VkAttachmentDescription2KHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR sType$Default() {
        return sType(1000109000);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR flags(@NativeType("VkAttachmentDescriptionFlags") int value) {
        nflags(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR samples(@NativeType("VkSampleCountFlagBits") int value) {
        nsamples(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR loadOp(@NativeType("VkAttachmentLoadOp") int value) {
        nloadOp(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR storeOp(@NativeType("VkAttachmentStoreOp") int value) {
        nstoreOp(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) {
        nstencilLoadOp(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) {
        nstencilStoreOp(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR initialLayout(@NativeType("VkImageLayout") int value) {
        ninitialLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR finalLayout(@NativeType("VkImageLayout") int value) {
        nfinalLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescription2
    public VkAttachmentDescription2KHR set(int sType, long pNext, int flags, int format, int samples, int loadOp, int storeOp, int stencilLoadOp, int stencilStoreOp, int initialLayout, int finalLayout) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        format(format);
        samples(samples);
        loadOp(loadOp);
        storeOp(storeOp);
        stencilLoadOp(stencilLoadOp);
        stencilStoreOp(stencilStoreOp);
        initialLayout(initialLayout);
        finalLayout(finalLayout);
        return this;
    }

    public VkAttachmentDescription2KHR set(VkAttachmentDescription2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentDescription2KHR malloc() {
        return new VkAttachmentDescription2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentDescription2KHR calloc() {
        return new VkAttachmentDescription2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentDescription2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentDescription2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentDescription2KHR create(long address) {
        return new VkAttachmentDescription2KHR(address, null);
    }

    public static VkAttachmentDescription2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentDescription2KHR(address, null);
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

    public static VkAttachmentDescription2KHR malloc(MemoryStack stack) {
        return new VkAttachmentDescription2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentDescription2KHR calloc(MemoryStack stack) {
        return new VkAttachmentDescription2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentDescription2KHR$Buffer.class */
    public static class Buffer extends VkAttachmentDescription2.Buffer {
        private static final VkAttachmentDescription2KHR ELEMENT_FACTORY = VkAttachmentDescription2KHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer, org.lwjgl.system.StructBuffer
        public VkAttachmentDescription2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentDescription2KHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer sType$Default() {
            return sType(1000109000);
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkAttachmentDescription2KHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer flags(@NativeType("VkAttachmentDescriptionFlags") int value) {
            VkAttachmentDescription2KHR.nflags(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer format(@NativeType("VkFormat") int value) {
            VkAttachmentDescription2KHR.nformat(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer samples(@NativeType("VkSampleCountFlagBits") int value) {
            VkAttachmentDescription2KHR.nsamples(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) {
            VkAttachmentDescription2KHR.nloadOp(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) {
            VkAttachmentDescription2KHR.nstoreOp(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer stencilLoadOp(@NativeType("VkAttachmentLoadOp") int value) {
            VkAttachmentDescription2KHR.nstencilLoadOp(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer stencilStoreOp(@NativeType("VkAttachmentStoreOp") int value) {
            VkAttachmentDescription2KHR.nstencilStoreOp(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer initialLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescription2KHR.ninitialLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescription2.Buffer
        public Buffer finalLayout(@NativeType("VkImageLayout") int value) {
            VkAttachmentDescription2KHR.nfinalLayout(address(), value);
            return this;
        }
    }
}
