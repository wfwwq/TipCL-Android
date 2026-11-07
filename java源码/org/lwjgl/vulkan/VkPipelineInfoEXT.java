package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPipelineInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInfoEXT.class */
public class VkPipelineInfoEXT extends VkPipelineInfoKHR {
    protected VkPipelineInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPipelineInfoKHR, org.lwjgl.system.Struct
    public VkPipelineInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineInfoEXT(address, container);
    }

    public VkPipelineInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPipelineInfoKHR
    public VkPipelineInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineInfoKHR
    public VkPipelineInfoEXT sType$Default() {
        return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR);
    }

    @Override // org.lwjgl.vulkan.VkPipelineInfoKHR
    public VkPipelineInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineInfoKHR
    public VkPipelineInfoEXT pipeline(@NativeType("VkPipeline") long value) {
        npipeline(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPipelineInfoKHR
    public VkPipelineInfoEXT set(int sType, long pNext, long pipeline) {
        sType(sType);
        pNext(pNext);
        pipeline(pipeline);
        return this;
    }

    public VkPipelineInfoEXT set(VkPipelineInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineInfoEXT malloc() {
        return new VkPipelineInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineInfoEXT calloc() {
        return new VkPipelineInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineInfoEXT create(long address) {
        return new VkPipelineInfoEXT(address, null);
    }

    public static VkPipelineInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineInfoEXT(address, null);
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

    public static VkPipelineInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInfoEXT$Buffer.class */
    public static class Buffer extends VkPipelineInfoKHR.Buffer {
        private static final VkPipelineInfoEXT ELEMENT_FACTORY = VkPipelineInfoEXT.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPipelineInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPipelineInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkPipelineInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPipelineInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR);
        }

        @Override // org.lwjgl.vulkan.VkPipelineInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPipelineInfoKHR.Buffer
        public Buffer pipeline(@NativeType("VkPipeline") long value) {
            VkPipelineInfoEXT.npipeline(address(), value);
            return this;
        }
    }
}
