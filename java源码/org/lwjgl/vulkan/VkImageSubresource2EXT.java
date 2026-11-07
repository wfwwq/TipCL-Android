package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkImageSubresource2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource2EXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource2EXT.class */
public class VkImageSubresource2EXT extends VkImageSubresource2 {
    @Override // org.lwjgl.vulkan.VkImageSubresource2
    public /* bridge */ /* synthetic */ VkImageSubresource2 imageSubresource(Consumer consumer) {
        return imageSubresource((Consumer<VkImageSubresource>) consumer);
    }

    protected VkImageSubresource2EXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkImageSubresource2, org.lwjgl.system.Struct
    public VkImageSubresource2EXT create(long address, ByteBuffer container) {
        return new VkImageSubresource2EXT(address, container);
    }

    public VkImageSubresource2EXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkImageSubresource2
    public VkImageSubresource2EXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageSubresource2
    public VkImageSubresource2EXT sType$Default() {
        return sType(1000338003);
    }

    @Override // org.lwjgl.vulkan.VkImageSubresource2
    public VkImageSubresource2EXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageSubresource2
    public VkImageSubresource2EXT imageSubresource(VkImageSubresource value) {
        nimageSubresource(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageSubresource2
    public VkImageSubresource2EXT imageSubresource(Consumer<VkImageSubresource> consumer) {
        consumer.accept(imageSubresource());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkImageSubresource2
    public VkImageSubresource2EXT set(int sType, long pNext, VkImageSubresource imageSubresource) {
        sType(sType);
        pNext(pNext);
        imageSubresource(imageSubresource);
        return this;
    }

    public VkImageSubresource2EXT set(VkImageSubresource2EXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageSubresource2EXT malloc() {
        return new VkImageSubresource2EXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageSubresource2EXT calloc() {
        return new VkImageSubresource2EXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageSubresource2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresource2EXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageSubresource2EXT create(long address) {
        return new VkImageSubresource2EXT(address, null);
    }

    public static VkImageSubresource2EXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageSubresource2EXT(address, null);
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

    public static VkImageSubresource2EXT malloc(MemoryStack stack) {
        return new VkImageSubresource2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageSubresource2EXT calloc(MemoryStack stack) {
        return new VkImageSubresource2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource2EXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageSubresource2EXT$Buffer.class */
    public static class Buffer extends VkImageSubresource2.Buffer {
        private static final VkImageSubresource2EXT ELEMENT_FACTORY = VkImageSubresource2EXT.create(-1L);

        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer
        public /* bridge */ /* synthetic */ VkImageSubresource2.Buffer imageSubresource(Consumer consumer) {
            return imageSubresource((Consumer<VkImageSubresource>) consumer);
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
        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer, org.lwjgl.system.StructBuffer
        public VkImageSubresource2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageSubresource2EXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer
        public Buffer sType$Default() {
            return sType(1000338003);
        }

        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkImageSubresource2EXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer
        public Buffer imageSubresource(VkImageSubresource value) {
            VkImageSubresource2EXT.nimageSubresource(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkImageSubresource2.Buffer
        public Buffer imageSubresource(Consumer<VkImageSubresource> consumer) {
            consumer.accept(imageSubresource());
            return this;
        }
    }
}
