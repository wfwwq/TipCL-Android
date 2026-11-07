package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties.class */
public class VkFormatProperties extends Struct<VkFormatProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LINEARTILINGFEATURES;
    public static final int OPTIMALTILINGFEATURES;
    public static final int BUFFERFEATURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LINEARTILINGFEATURES = layout.offsetof(0);
        OPTIMALTILINGFEATURES = layout.offsetof(1);
        BUFFERFEATURES = layout.offsetof(2);
    }

    protected VkFormatProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFormatProperties create(long address, ByteBuffer container) {
        return new VkFormatProperties(address, container);
    }

    public VkFormatProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkFormatFeatureFlags")
    public int linearTilingFeatures() {
        return nlinearTilingFeatures(address());
    }

    @NativeType("VkFormatFeatureFlags")
    public int optimalTilingFeatures() {
        return noptimalTilingFeatures(address());
    }

    @NativeType("VkFormatFeatureFlags")
    public int bufferFeatures() {
        return nbufferFeatures(address());
    }

    public static VkFormatProperties malloc() {
        return new VkFormatProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFormatProperties calloc() {
        return new VkFormatProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFormatProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkFormatProperties create(long address) {
        return new VkFormatProperties(address, null);
    }

    public static VkFormatProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFormatProperties(address, null);
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

    public static VkFormatProperties malloc(MemoryStack stack) {
        return new VkFormatProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFormatProperties calloc(MemoryStack stack) {
        return new VkFormatProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nlinearTilingFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + LINEARTILINGFEATURES);
    }

    public static int noptimalTilingFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + OPTIMALTILINGFEATURES);
    }

    public static int nbufferFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERFEATURES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkFormatProperties, Buffer> implements NativeResource {
        private static final VkFormatProperties ELEMENT_FACTORY = VkFormatProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFormatProperties.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkFormatFeatureFlags")
        public int linearTilingFeatures() {
            return VkFormatProperties.nlinearTilingFeatures(address());
        }

        @NativeType("VkFormatFeatureFlags")
        public int optimalTilingFeatures() {
            return VkFormatProperties.noptimalTilingFeatures(address());
        }

        @NativeType("VkFormatFeatureFlags")
        public int bufferFeatures() {
            return VkFormatProperties.nbufferFeatures(address());
        }
    }
}
