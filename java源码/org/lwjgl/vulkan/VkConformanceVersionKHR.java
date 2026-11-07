package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkConformanceVersion;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersionKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersionKHR.class */
public class VkConformanceVersionKHR extends VkConformanceVersion {
    protected VkConformanceVersionKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkConformanceVersion, org.lwjgl.system.Struct
    public VkConformanceVersionKHR create(long address, ByteBuffer container) {
        return new VkConformanceVersionKHR(address, container);
    }

    public VkConformanceVersionKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public VkConformanceVersionKHR major(@NativeType("uint8_t") byte value) {
        nmajor(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public VkConformanceVersionKHR minor(@NativeType("uint8_t") byte value) {
        nminor(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public VkConformanceVersionKHR subminor(@NativeType("uint8_t") byte value) {
        nsubminor(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public VkConformanceVersionKHR patch(@NativeType("uint8_t") byte value) {
        npatch(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkConformanceVersion
    public VkConformanceVersionKHR set(byte major, byte minor, byte subminor, byte patch) {
        major(major);
        minor(minor);
        subminor(subminor);
        patch(patch);
        return this;
    }

    public VkConformanceVersionKHR set(VkConformanceVersionKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkConformanceVersionKHR malloc() {
        return new VkConformanceVersionKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkConformanceVersionKHR calloc() {
        return new VkConformanceVersionKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkConformanceVersionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkConformanceVersionKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkConformanceVersionKHR create(long address) {
        return new VkConformanceVersionKHR(address, null);
    }

    public static VkConformanceVersionKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkConformanceVersionKHR(address, null);
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

    public static VkConformanceVersionKHR malloc(MemoryStack stack) {
        return new VkConformanceVersionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkConformanceVersionKHR calloc(MemoryStack stack) {
        return new VkConformanceVersionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersionKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConformanceVersionKHR$Buffer.class */
    public static class Buffer extends VkConformanceVersion.Buffer {
        private static final VkConformanceVersionKHR ELEMENT_FACTORY = VkConformanceVersionKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer, org.lwjgl.system.StructBuffer
        public VkConformanceVersionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public Buffer major(@NativeType("uint8_t") byte value) {
            VkConformanceVersionKHR.nmajor(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public Buffer minor(@NativeType("uint8_t") byte value) {
            VkConformanceVersionKHR.nminor(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public Buffer subminor(@NativeType("uint8_t") byte value) {
            VkConformanceVersionKHR.nsubminor(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkConformanceVersion.Buffer
        public Buffer patch(@NativeType("uint8_t") byte value) {
            VkConformanceVersionKHR.npatch(address(), value);
            return this;
        }
    }
}
