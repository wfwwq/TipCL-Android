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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExtensionProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExtensionProperties.class */
public class VkExtensionProperties extends Struct<VkExtensionProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int EXTENSIONNAME;
    public static final int SPECVERSION;

    static {
        Struct.Layout layout = __struct(__array(1, 256), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        EXTENSIONNAME = layout.offsetof(0);
        SPECVERSION = layout.offsetof(1);
    }

    protected VkExtensionProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExtensionProperties create(long address, ByteBuffer container) {
        return new VkExtensionProperties(address, container);
    }

    public VkExtensionProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer extensionName() {
        return nextensionName(address());
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String extensionNameString() {
        return nextensionNameString(address());
    }

    @NativeType("uint32_t")
    public int specVersion() {
        return nspecVersion(address());
    }

    public static VkExtensionProperties malloc() {
        return new VkExtensionProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExtensionProperties calloc() {
        return new VkExtensionProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExtensionProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExtensionProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkExtensionProperties create(long address) {
        return new VkExtensionProperties(address, null);
    }

    public static VkExtensionProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExtensionProperties(address, null);
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

    public static VkExtensionProperties malloc(MemoryStack stack) {
        return new VkExtensionProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExtensionProperties calloc(MemoryStack stack) {
        return new VkExtensionProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nextensionName(long struct) {
        return MemoryUtil.memByteBuffer(struct + EXTENSIONNAME, 256);
    }

    public static String nextensionNameString(long struct) {
        return MemoryUtil.memUTF8(struct + EXTENSIONNAME);
    }

    public static int nspecVersion(long struct) {
        return MemoryUtil.memGetInt(struct + SPECVERSION);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExtensionProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExtensionProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkExtensionProperties, Buffer> implements NativeResource {
        private static final VkExtensionProperties ELEMENT_FACTORY = VkExtensionProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExtensionProperties.SIZEOF);
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
        public VkExtensionProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer extensionName() {
            return VkExtensionProperties.nextensionName(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String extensionNameString() {
            return VkExtensionProperties.nextensionNameString(address());
        }

        @NativeType("uint32_t")
        public int specVersion() {
            return VkExtensionProperties.nspecVersion(address());
        }
    }
}
