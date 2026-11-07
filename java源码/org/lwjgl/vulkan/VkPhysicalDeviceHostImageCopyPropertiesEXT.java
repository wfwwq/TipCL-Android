package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyPropertiesEXT.class */
public class VkPhysicalDeviceHostImageCopyPropertiesEXT extends VkPhysicalDeviceHostImageCopyProperties {
    protected VkPhysicalDeviceHostImageCopyPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties, org.lwjgl.system.Struct
    public VkPhysicalDeviceHostImageCopyPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceHostImageCopyPropertiesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sType$Default() {
        return sType(1000270001);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copySrcLayoutCount(@NativeType("uint32_t") int value) {
        ncopySrcLayoutCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopySrcLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
        npCopySrcLayouts(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copyDstLayoutCount(@NativeType("uint32_t") int value) {
        ncopyDstLayoutCount(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopyDstLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
        npCopyDstLayouts(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
        noptimalTilingLayoutUUID(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) {
        noptimalTilingLayoutUUID(address(), index, value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) {
        nidenticalMemoryTypeRequirements(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties
    public VkPhysicalDeviceHostImageCopyPropertiesEXT set(int sType, long pNext, int copySrcLayoutCount, IntBuffer pCopySrcLayouts, int copyDstLayoutCount, IntBuffer pCopyDstLayouts, ByteBuffer optimalTilingLayoutUUID, boolean identicalMemoryTypeRequirements) {
        sType(sType);
        pNext(pNext);
        copySrcLayoutCount(copySrcLayoutCount);
        pCopySrcLayouts(pCopySrcLayouts);
        copyDstLayoutCount(copyDstLayoutCount);
        pCopyDstLayouts(pCopyDstLayouts);
        optimalTilingLayoutUUID(optimalTilingLayoutUUID);
        identicalMemoryTypeRequirements(identicalMemoryTypeRequirements);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyPropertiesEXT set(VkPhysicalDeviceHostImageCopyPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT malloc() {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT calloc() {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT create(long address) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyPropertiesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceHostImageCopyProperties.Buffer {
        private static final VkPhysicalDeviceHostImageCopyPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyPropertiesEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceHostImageCopyPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer sType$Default() {
            return sType(1000270001);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer copySrcLayoutCount(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopySrcLayoutCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer pCopySrcLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopySrcLayouts(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer copyDstLayoutCount(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopyDstLayoutCount(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer pCopyDstLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopyDstLayouts(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address(), index, value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyProperties.Buffer
        public Buffer identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceHostImageCopyPropertiesEXT.nidenticalMemoryTypeRequirements(address(), value ? 1 : 0);
            return this;
        }
    }
}
