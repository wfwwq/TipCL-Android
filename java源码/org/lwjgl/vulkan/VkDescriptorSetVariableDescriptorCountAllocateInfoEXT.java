package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.class */
public class VkDescriptorSetVariableDescriptorCountAllocateInfoEXT extends VkDescriptorSetVariableDescriptorCountAllocateInfo {
    protected VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo, org.lwjgl.system.Struct
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT create(long address, ByteBuffer container) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(address, container);
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sType$Default() {
        return sType(1000161003);
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pDescriptorCounts(@NativeType("uint32_t const *") IntBuffer value) {
        npDescriptorCounts(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT set(int sType, long pNext, IntBuffer pDescriptorCounts) {
        sType(sType);
        pNext(pNext);
        pDescriptorCounts(pDescriptorCounts);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT set(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT malloc() {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT calloc() {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT create(long address) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(address, null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(address, null);
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

    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountAllocateInfoEXT$Buffer.class */
    public static class Buffer extends VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer {
        private static final VkDescriptorSetVariableDescriptorCountAllocateInfoEXT ELEMENT_FACTORY = VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000161003);
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkDescriptorSetVariableDescriptorCountAllocateInfo.Buffer
        public Buffer pDescriptorCounts(@NativeType("uint32_t const *") IntBuffer value) {
            VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npDescriptorCounts(address(), value);
            return this;
        }
    }
}
