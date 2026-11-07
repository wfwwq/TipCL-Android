package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkMemoryDedicatedRequirements;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirementsKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirementsKHR.class */
public class VkMemoryDedicatedRequirementsKHR extends VkMemoryDedicatedRequirements {
    protected VkMemoryDedicatedRequirementsKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements, org.lwjgl.system.Struct
    public VkMemoryDedicatedRequirementsKHR create(long address, ByteBuffer container) {
        return new VkMemoryDedicatedRequirementsKHR(address, container);
    }

    public VkMemoryDedicatedRequirementsKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements
    public VkMemoryDedicatedRequirementsKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements
    public VkMemoryDedicatedRequirementsKHR sType$Default() {
        return sType(1000127000);
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements
    public VkMemoryDedicatedRequirementsKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements
    public VkMemoryDedicatedRequirementsKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkMemoryDedicatedRequirementsKHR set(VkMemoryDedicatedRequirementsKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryDedicatedRequirementsKHR malloc() {
        return new VkMemoryDedicatedRequirementsKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryDedicatedRequirementsKHR calloc() {
        return new VkMemoryDedicatedRequirementsKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryDedicatedRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryDedicatedRequirementsKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryDedicatedRequirementsKHR create(long address) {
        return new VkMemoryDedicatedRequirementsKHR(address, null);
    }

    public static VkMemoryDedicatedRequirementsKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryDedicatedRequirementsKHR(address, null);
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

    public static VkMemoryDedicatedRequirementsKHR malloc(MemoryStack stack) {
        return new VkMemoryDedicatedRequirementsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryDedicatedRequirementsKHR calloc(MemoryStack stack) {
        return new VkMemoryDedicatedRequirementsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirementsKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirementsKHR$Buffer.class */
    public static class Buffer extends VkMemoryDedicatedRequirements.Buffer {
        private static final VkMemoryDedicatedRequirementsKHR ELEMENT_FACTORY = VkMemoryDedicatedRequirementsKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements.Buffer, org.lwjgl.system.StructBuffer
        public VkMemoryDedicatedRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryDedicatedRequirementsKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements.Buffer
        public Buffer sType$Default() {
            return sType(1000127000);
        }

        @Override // org.lwjgl.vulkan.VkMemoryDedicatedRequirements.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkMemoryDedicatedRequirementsKHR.npNext(address(), value);
            return this;
        }
    }
}
