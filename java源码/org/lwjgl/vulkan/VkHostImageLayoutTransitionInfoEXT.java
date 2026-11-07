package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfoEXT.class */
public class VkHostImageLayoutTransitionInfoEXT extends VkHostImageLayoutTransitionInfo {
    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public /* bridge */ /* synthetic */ VkHostImageLayoutTransitionInfo subresourceRange(Consumer consumer) {
        return subresourceRange((Consumer<VkImageSubresourceRange>) consumer);
    }

    protected VkHostImageLayoutTransitionInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo, org.lwjgl.system.Struct
    public VkHostImageLayoutTransitionInfoEXT create(long address, ByteBuffer container) {
        return new VkHostImageLayoutTransitionInfoEXT(address, container);
    }

    public VkHostImageLayoutTransitionInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT sType$Default() {
        return sType(1000270006);
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT oldLayout(@NativeType("VkImageLayout") int value) {
        noldLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT newLayout(@NativeType("VkImageLayout") int value) {
        nnewLayout(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT subresourceRange(VkImageSubresourceRange value) {
        nsubresourceRange(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
        consumer.accept(subresourceRange());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
    public VkHostImageLayoutTransitionInfoEXT set(int sType, long pNext, long image, int oldLayout, int newLayout, VkImageSubresourceRange subresourceRange) {
        sType(sType);
        pNext(pNext);
        image(image);
        oldLayout(oldLayout);
        newLayout(newLayout);
        subresourceRange(subresourceRange);
        return this;
    }

    public VkHostImageLayoutTransitionInfoEXT set(VkHostImageLayoutTransitionInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkHostImageLayoutTransitionInfoEXT malloc() {
        return new VkHostImageLayoutTransitionInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkHostImageLayoutTransitionInfoEXT calloc() {
        return new VkHostImageLayoutTransitionInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkHostImageLayoutTransitionInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageLayoutTransitionInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkHostImageLayoutTransitionInfoEXT create(long address) {
        return new VkHostImageLayoutTransitionInfoEXT(address, null);
    }

    public static VkHostImageLayoutTransitionInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkHostImageLayoutTransitionInfoEXT(address, null);
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

    public static VkHostImageLayoutTransitionInfoEXT malloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkHostImageLayoutTransitionInfoEXT calloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfoEXT$Buffer.class */
    public static class Buffer extends VkHostImageLayoutTransitionInfo.Buffer {
        private static final VkHostImageLayoutTransitionInfoEXT ELEMENT_FACTORY = VkHostImageLayoutTransitionInfoEXT.create(-1L);

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public /* bridge */ /* synthetic */ VkHostImageLayoutTransitionInfo.Buffer subresourceRange(Consumer consumer) {
            return subresourceRange((Consumer<VkImageSubresourceRange>) consumer);
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
        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkHostImageLayoutTransitionInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkHostImageLayoutTransitionInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000270006);
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkHostImageLayoutTransitionInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer image(@NativeType("VkImage") long value) {
            VkHostImageLayoutTransitionInfoEXT.nimage(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer oldLayout(@NativeType("VkImageLayout") int value) {
            VkHostImageLayoutTransitionInfoEXT.noldLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer newLayout(@NativeType("VkImageLayout") int value) {
            VkHostImageLayoutTransitionInfoEXT.nnewLayout(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer subresourceRange(VkImageSubresourceRange value) {
            VkHostImageLayoutTransitionInfoEXT.nsubresourceRange(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer
        public Buffer subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
            consumer.accept(subresourceRange());
            return this;
        }
    }
}
