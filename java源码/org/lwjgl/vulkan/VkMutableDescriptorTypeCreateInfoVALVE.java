package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT;
import org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoVALVE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoVALVE.class */
public class VkMutableDescriptorTypeCreateInfoVALVE extends VkMutableDescriptorTypeCreateInfoEXT {
    protected VkMutableDescriptorTypeCreateInfoVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT, org.lwjgl.system.Struct
    public VkMutableDescriptorTypeCreateInfoVALVE create(long address, ByteBuffer container) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(address, container);
    }

    public VkMutableDescriptorTypeCreateInfoVALVE(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT
    public VkMutableDescriptorTypeCreateInfoVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT
    public VkMutableDescriptorTypeCreateInfoVALVE sType$Default() {
        return sType(1000351002);
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT
    public VkMutableDescriptorTypeCreateInfoVALVE pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT
    public VkMutableDescriptorTypeCreateInfoVALVE pMutableDescriptorTypeLists(@NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) {
        npMutableDescriptorTypeLists(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT
    public VkMutableDescriptorTypeCreateInfoVALVE set(int sType, long pNext, VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists) {
        sType(sType);
        pNext(pNext);
        pMutableDescriptorTypeLists(pMutableDescriptorTypeLists);
        return this;
    }

    public VkMutableDescriptorTypeCreateInfoVALVE set(VkMutableDescriptorTypeCreateInfoVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMutableDescriptorTypeCreateInfoVALVE malloc() {
        return new VkMutableDescriptorTypeCreateInfoVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMutableDescriptorTypeCreateInfoVALVE calloc() {
        return new VkMutableDescriptorTypeCreateInfoVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMutableDescriptorTypeCreateInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMutableDescriptorTypeCreateInfoVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkMutableDescriptorTypeCreateInfoVALVE create(long address) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(address, null);
    }

    public static VkMutableDescriptorTypeCreateInfoVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMutableDescriptorTypeCreateInfoVALVE(address, null);
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

    public static VkMutableDescriptorTypeCreateInfoVALVE malloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMutableDescriptorTypeCreateInfoVALVE calloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoVALVE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoVALVE$Buffer.class */
    public static class Buffer extends VkMutableDescriptorTypeCreateInfoEXT.Buffer {
        private static final VkMutableDescriptorTypeCreateInfoVALVE ELEMENT_FACTORY = VkMutableDescriptorTypeCreateInfoVALVE.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT.Buffer, org.lwjgl.system.StructBuffer
        public VkMutableDescriptorTypeCreateInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMutableDescriptorTypeCreateInfoVALVE.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT.Buffer
        public Buffer sType$Default() {
            return sType(1000351002);
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkMutableDescriptorTypeCreateInfoVALVE.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMutableDescriptorTypeCreateInfoEXT.Buffer
        public Buffer pMutableDescriptorTypeLists(@NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) {
            VkMutableDescriptorTypeCreateInfoVALVE.npMutableDescriptorTypeLists(address(), value);
            return this;
        }
    }
}
