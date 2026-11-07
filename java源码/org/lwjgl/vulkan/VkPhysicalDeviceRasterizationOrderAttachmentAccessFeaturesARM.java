package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.class */
public class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM extends VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {
    protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT, org.lwjgl.system.Struct
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(address, container);
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType$Default() {
        return sType(1000342000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) {
        nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) {
        nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) {
        nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(int sType, long pNext, boolean rasterizationOrderColorAttachmentAccess, boolean rasterizationOrderDepthAttachmentAccess, boolean rasterizationOrderStencilAttachmentAccess) {
        sType(sType);
        pNext(pNext);
        rasterizationOrderColorAttachmentAccess(rasterizationOrderColorAttachmentAccess);
        rasterizationOrderDepthAttachmentAccess(rasterizationOrderDepthAttachmentAccess);
        rasterizationOrderStencilAttachmentAccess(rasterizationOrderStencilAttachmentAccess);
        return this;
    }

    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create(long address) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(address, null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(address, null);
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

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer {
        private static final VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000342000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public Buffer rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public Buffer rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer
        public Buffer rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
