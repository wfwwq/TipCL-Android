package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV.class */
public class VkAttachmentSampleCountInfoNV extends VkAttachmentSampleCountInfoAMD {
    protected VkAttachmentSampleCountInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD, org.lwjgl.system.Struct
    public VkAttachmentSampleCountInfoNV create(long address, ByteBuffer container) {
        return new VkAttachmentSampleCountInfoNV(address, container);
    }

    public VkAttachmentSampleCountInfoNV(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public VkAttachmentSampleCountInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public VkAttachmentSampleCountInfoNV sType$Default() {
        return sType(1000044008);
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public VkAttachmentSampleCountInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public VkAttachmentSampleCountInfoNV colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public VkAttachmentSampleCountInfoNV pColorAttachmentSamples(@NativeType("VkSampleCountFlagBits const *") IntBuffer value) {
        npColorAttachmentSamples(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public VkAttachmentSampleCountInfoNV depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) {
        ndepthStencilAttachmentSamples(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD
    public VkAttachmentSampleCountInfoNV set(int sType, long pNext, int colorAttachmentCount, IntBuffer pColorAttachmentSamples, int depthStencilAttachmentSamples) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentSamples(pColorAttachmentSamples);
        depthStencilAttachmentSamples(depthStencilAttachmentSamples);
        return this;
    }

    public VkAttachmentSampleCountInfoNV set(VkAttachmentSampleCountInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentSampleCountInfoNV malloc() {
        return new VkAttachmentSampleCountInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentSampleCountInfoNV calloc() {
        return new VkAttachmentSampleCountInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentSampleCountInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentSampleCountInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentSampleCountInfoNV create(long address) {
        return new VkAttachmentSampleCountInfoNV(address, null);
    }

    public static VkAttachmentSampleCountInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentSampleCountInfoNV(address, null);
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

    public static VkAttachmentSampleCountInfoNV malloc(MemoryStack stack) {
        return new VkAttachmentSampleCountInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentSampleCountInfoNV calloc(MemoryStack stack) {
        return new VkAttachmentSampleCountInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoNV$Buffer.class */
    public static class Buffer extends VkAttachmentSampleCountInfoAMD.Buffer {
        private static final VkAttachmentSampleCountInfoNV ELEMENT_FACTORY = VkAttachmentSampleCountInfoNV.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer, org.lwjgl.system.StructBuffer
        public VkAttachmentSampleCountInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentSampleCountInfoNV.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public Buffer sType$Default() {
            return sType(1000044008);
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkAttachmentSampleCountInfoNV.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkAttachmentSampleCountInfoNV.ncolorAttachmentCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public Buffer pColorAttachmentSamples(@NativeType("VkSampleCountFlagBits const *") IntBuffer value) {
            VkAttachmentSampleCountInfoNV.npColorAttachmentSamples(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD.Buffer
        public Buffer depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) {
            VkAttachmentSampleCountInfoNV.ndepthStencilAttachmentSamples(address(), value);
            return this;
        }
    }
}
