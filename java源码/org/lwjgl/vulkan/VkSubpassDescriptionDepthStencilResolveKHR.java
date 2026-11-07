package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolveKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolveKHR.class */
public class VkSubpassDescriptionDepthStencilResolveKHR extends VkSubpassDescriptionDepthStencilResolve {
    protected VkSubpassDescriptionDepthStencilResolveKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve, org.lwjgl.system.Struct
    public VkSubpassDescriptionDepthStencilResolveKHR create(long address, ByteBuffer container) {
        return new VkSubpassDescriptionDepthStencilResolveKHR(address, container);
    }

    public VkSubpassDescriptionDepthStencilResolveKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
    public VkSubpassDescriptionDepthStencilResolveKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
    public VkSubpassDescriptionDepthStencilResolveKHR sType$Default() {
        return sType(1000199001);
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
    public VkSubpassDescriptionDepthStencilResolveKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
    public VkSubpassDescriptionDepthStencilResolveKHR depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        ndepthResolveMode(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
    public VkSubpassDescriptionDepthStencilResolveKHR stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        nstencilResolveMode(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
    public VkSubpassDescriptionDepthStencilResolveKHR pDepthStencilResolveAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
        npDepthStencilResolveAttachment(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
    public VkSubpassDescriptionDepthStencilResolveKHR set(int sType, long pNext, int depthResolveMode, int stencilResolveMode, VkAttachmentReference2 pDepthStencilResolveAttachment) {
        sType(sType);
        pNext(pNext);
        depthResolveMode(depthResolveMode);
        stencilResolveMode(stencilResolveMode);
        pDepthStencilResolveAttachment(pDepthStencilResolveAttachment);
        return this;
    }

    public VkSubpassDescriptionDepthStencilResolveKHR set(VkSubpassDescriptionDepthStencilResolveKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassDescriptionDepthStencilResolveKHR malloc() {
        return new VkSubpassDescriptionDepthStencilResolveKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassDescriptionDepthStencilResolveKHR calloc() {
        return new VkSubpassDescriptionDepthStencilResolveKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassDescriptionDepthStencilResolveKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescriptionDepthStencilResolveKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassDescriptionDepthStencilResolveKHR create(long address) {
        return new VkSubpassDescriptionDepthStencilResolveKHR(address, null);
    }

    public static VkSubpassDescriptionDepthStencilResolveKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassDescriptionDepthStencilResolveKHR(address, null);
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

    public static VkSubpassDescriptionDepthStencilResolveKHR malloc(MemoryStack stack) {
        return new VkSubpassDescriptionDepthStencilResolveKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassDescriptionDepthStencilResolveKHR calloc(MemoryStack stack) {
        return new VkSubpassDescriptionDepthStencilResolveKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolveKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolveKHR$Buffer.class */
    public static class Buffer extends VkSubpassDescriptionDepthStencilResolve.Buffer {
        private static final VkSubpassDescriptionDepthStencilResolveKHR ELEMENT_FACTORY = VkSubpassDescriptionDepthStencilResolveKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer, org.lwjgl.system.StructBuffer
        public VkSubpassDescriptionDepthStencilResolveKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassDescriptionDepthStencilResolveKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer
        public Buffer sType$Default() {
            return sType(1000199001);
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassDescriptionDepthStencilResolveKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer
        public Buffer depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkSubpassDescriptionDepthStencilResolveKHR.ndepthResolveMode(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer
        public Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkSubpassDescriptionDepthStencilResolveKHR.nstencilResolveMode(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer
        public Buffer pDepthStencilResolveAttachment(@NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) {
            VkSubpassDescriptionDepthStencilResolveKHR.npDepthStencilResolveAttachment(address(), value);
            return this;
        }
    }
}
