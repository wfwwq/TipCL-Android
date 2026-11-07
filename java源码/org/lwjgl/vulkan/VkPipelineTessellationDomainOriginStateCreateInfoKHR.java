package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfoKHR.class */
public class VkPipelineTessellationDomainOriginStateCreateInfoKHR extends VkPipelineTessellationDomainOriginStateCreateInfo {
    protected VkPipelineTessellationDomainOriginStateCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo, org.lwjgl.system.Struct
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(address, container);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR sType$Default() {
        return sType(1000117003);
    }

    @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR domainOrigin(@NativeType("VkTessellationDomainOrigin") int value) {
        ndomainOrigin(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR set(int sType, long pNext, int domainOrigin) {
        sType(sType);
        pNext(pNext);
        domainOrigin(domainOrigin);
        return this;
    }

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR set(VkPipelineTessellationDomainOriginStateCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR malloc() {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR calloc() {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR create(long address) {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(address, null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(address, null);
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

    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkPipelineTessellationDomainOriginStateCreateInfo.Buffer {
        private static final VkPipelineTessellationDomainOriginStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineTessellationDomainOriginStateCreateInfoKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineTessellationDomainOriginStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineTessellationDomainOriginStateCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000117003);
        }

        @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineTessellationDomainOriginStateCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineTessellationDomainOriginStateCreateInfo.Buffer
        public Buffer domainOrigin(@NativeType("VkTessellationDomainOrigin") int value) {
            VkPipelineTessellationDomainOriginStateCreateInfoKHR.ndomainOrigin(address(), value);
            return this;
        }
    }
}
