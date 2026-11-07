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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerProperties.class */
public class VkLayerProperties extends Struct<VkLayerProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LAYERNAME;
    public static final int SPECVERSION;
    public static final int IMPLEMENTATIONVERSION;
    public static final int DESCRIPTION;

    static {
        Struct.Layout layout = __struct(__array(1, 256), __member(4), __member(4), __array(1, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LAYERNAME = layout.offsetof(0);
        SPECVERSION = layout.offsetof(1);
        IMPLEMENTATIONVERSION = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
    }

    protected VkLayerProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLayerProperties create(long address, ByteBuffer container) {
        return new VkLayerProperties(address, container);
    }

    public VkLayerProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer layerName() {
        return nlayerName(address());
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String layerNameString() {
        return nlayerNameString(address());
    }

    @NativeType("uint32_t")
    public int specVersion() {
        return nspecVersion(address());
    }

    @NativeType("uint32_t")
    public int implementationVersion() {
        return nimplementationVersion(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() {
        return ndescription(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() {
        return ndescriptionString(address());
    }

    public static VkLayerProperties malloc() {
        return new VkLayerProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLayerProperties calloc() {
        return new VkLayerProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLayerProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLayerProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkLayerProperties create(long address) {
        return new VkLayerProperties(address, null);
    }

    public static VkLayerProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLayerProperties(address, null);
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

    public static VkLayerProperties malloc(MemoryStack stack) {
        return new VkLayerProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLayerProperties calloc(MemoryStack stack) {
        return new VkLayerProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nlayerName(long struct) {
        return MemoryUtil.memByteBuffer(struct + LAYERNAME, 256);
    }

    public static String nlayerNameString(long struct) {
        return MemoryUtil.memUTF8(struct + LAYERNAME);
    }

    public static int nspecVersion(long struct) {
        return MemoryUtil.memGetInt(struct + SPECVERSION);
    }

    public static int nimplementationVersion(long struct) {
        return MemoryUtil.memGetInt(struct + IMPLEMENTATIONVERSION);
    }

    public static ByteBuffer ndescription(long struct) {
        return MemoryUtil.memByteBuffer(struct + DESCRIPTION, 256);
    }

    public static String ndescriptionString(long struct) {
        return MemoryUtil.memUTF8(struct + DESCRIPTION);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkLayerProperties, Buffer> implements NativeResource {
        private static final VkLayerProperties ELEMENT_FACTORY = VkLayerProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLayerProperties.SIZEOF);
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
        public VkLayerProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer layerName() {
            return VkLayerProperties.nlayerName(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String layerNameString() {
            return VkLayerProperties.nlayerNameString(address());
        }

        @NativeType("uint32_t")
        public int specVersion() {
            return VkLayerProperties.nspecVersion(address());
        }

        @NativeType("uint32_t")
        public int implementationVersion() {
            return VkLayerProperties.nimplementationVersion(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() {
            return VkLayerProperties.ndescription(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() {
            return VkLayerProperties.ndescriptionString(address());
        }
    }
}
