package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkRenderingAttachmentInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR.class */
public class VkRenderingAttachmentInfoKHR extends VkRenderingAttachmentInfo {
    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ VkRenderingAttachmentInfo clearValue(Consumer consumer) {
        return clearValue((Consumer<VkClearValue>) consumer);
    }

    protected VkRenderingAttachmentInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo, org.lwjgl.system.Struct
    public VkRenderingAttachmentInfoKHR create(long address, ByteBuffer container) {
        return new VkRenderingAttachmentInfoKHR(address, container);
    }

    public VkRenderingAttachmentInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR sType$Default() {
        return sType(1000044001);
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR imageView(@NativeType("VkImageView") long value) {
        nimageView(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR imageLayout(@NativeType("VkImageLayout") int value) {
        nimageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR resolveMode(@NativeType("VkResolveModeFlagBits") int value) {
        nresolveMode(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR resolveImageView(@NativeType("VkImageView") long value) {
        nresolveImageView(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR resolveImageLayout(@NativeType("VkImageLayout") int value) {
        nresolveImageLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR loadOp(@NativeType("VkAttachmentLoadOp") int value) {
        nloadOp(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR storeOp(@NativeType("VkAttachmentStoreOp") int value) {
        nstoreOp(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR clearValue(VkClearValue value) {
        nclearValue(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR clearValue(Consumer<VkClearValue> consumer) {
        consumer.accept(clearValue());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public VkRenderingAttachmentInfoKHR set(int sType, long pNext, long imageView, int imageLayout, int resolveMode, long resolveImageView, int resolveImageLayout, int loadOp, int storeOp, VkClearValue clearValue) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);
        resolveMode(resolveMode);
        resolveImageView(resolveImageView);
        resolveImageLayout(resolveImageLayout);
        loadOp(loadOp);
        storeOp(storeOp);
        clearValue(clearValue);
        return this;
    }

    public VkRenderingAttachmentInfoKHR set(VkRenderingAttachmentInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderingAttachmentInfoKHR malloc() {
        return new VkRenderingAttachmentInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderingAttachmentInfoKHR calloc() {
        return new VkRenderingAttachmentInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderingAttachmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAttachmentInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderingAttachmentInfoKHR create(long address) {
        return new VkRenderingAttachmentInfoKHR(address, null);
    }

    public static VkRenderingAttachmentInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderingAttachmentInfoKHR(address, null);
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

    public static VkRenderingAttachmentInfoKHR malloc(MemoryStack stack) {
        return new VkRenderingAttachmentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderingAttachmentInfoKHR calloc(MemoryStack stack) {
        return new VkRenderingAttachmentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR$Buffer.class */
    public static class Buffer extends VkRenderingAttachmentInfo.Buffer {
        private static final VkRenderingAttachmentInfoKHR ELEMENT_FACTORY = VkRenderingAttachmentInfoKHR.create(-1L);

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ VkRenderingAttachmentInfo.Buffer clearValue(Consumer consumer) {
            return clearValue((Consumer<VkClearValue>) consumer);
        }

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
        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkRenderingAttachmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderingAttachmentInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000044001);
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderingAttachmentInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer imageView(@NativeType("VkImageView") long value) {
            VkRenderingAttachmentInfoKHR.nimageView(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer imageLayout(@NativeType("VkImageLayout") int value) {
            VkRenderingAttachmentInfoKHR.nimageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer resolveMode(@NativeType("VkResolveModeFlagBits") int value) {
            VkRenderingAttachmentInfoKHR.nresolveMode(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer resolveImageView(@NativeType("VkImageView") long value) {
            VkRenderingAttachmentInfoKHR.nresolveImageView(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer resolveImageLayout(@NativeType("VkImageLayout") int value) {
            VkRenderingAttachmentInfoKHR.nresolveImageLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) {
            VkRenderingAttachmentInfoKHR.nloadOp(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) {
            VkRenderingAttachmentInfoKHR.nstoreOp(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer clearValue(VkClearValue value) {
            VkRenderingAttachmentInfoKHR.nclearValue(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public Buffer clearValue(Consumer<VkClearValue> consumer) {
            consumer.accept(clearValue());
            return this;
        }
    }
}
