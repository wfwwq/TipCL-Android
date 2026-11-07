package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessProperties.class */
public class VkPhysicalDevicePipelineRobustnessProperties extends Struct<VkPhysicalDevicePipelineRobustnessProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEFAULTROBUSTNESSSTORAGEBUFFERS;
    public static final int DEFAULTROBUSTNESSUNIFORMBUFFERS;
    public static final int DEFAULTROBUSTNESSVERTEXINPUTS;
    public static final int DEFAULTROBUSTNESSIMAGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEFAULTROBUSTNESSSTORAGEBUFFERS = layout.offsetof(2);
        DEFAULTROBUSTNESSUNIFORMBUFFERS = layout.offsetof(3);
        DEFAULTROBUSTNESSVERTEXINPUTS = layout.offsetof(4);
        DEFAULTROBUSTNESSIMAGES = layout.offsetof(5);
    }

    protected VkPhysicalDevicePipelineRobustnessProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineRobustnessProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineRobustnessProperties(address, container);
    }

    public VkPhysicalDevicePipelineRobustnessProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessStorageBuffers() {
        return ndefaultRobustnessStorageBuffers(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessUniformBuffers() {
        return ndefaultRobustnessUniformBuffers(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessVertexInputs() {
        return ndefaultRobustnessVertexInputs(address());
    }

    @NativeType("VkPipelineRobustnessImageBehavior")
    public int defaultRobustnessImages() {
        return ndefaultRobustnessImages(address());
    }

    public VkPhysicalDevicePipelineRobustnessProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessProperties sType$Default() {
        return sType(1000068002);
    }

    public VkPhysicalDevicePipelineRobustnessProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessProperties set(VkPhysicalDevicePipelineRobustnessProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineRobustnessProperties malloc() {
        return new VkPhysicalDevicePipelineRobustnessProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessProperties calloc() {
        return new VkPhysicalDevicePipelineRobustnessProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineRobustnessProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineRobustnessProperties create(long address) {
        return new VkPhysicalDevicePipelineRobustnessProperties(address, null);
    }

    public static VkPhysicalDevicePipelineRobustnessProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineRobustnessProperties(address, null);
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

    public static VkPhysicalDevicePipelineRobustnessProperties malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessProperties calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int ndefaultRobustnessStorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSSTORAGEBUFFERS);
    }

    public static int ndefaultRobustnessUniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSUNIFORMBUFFERS);
    }

    public static int ndefaultRobustnessVertexInputs(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSVERTEXINPUTS);
    }

    public static int ndefaultRobustnessImages(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTROBUSTNESSIMAGES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineRobustnessProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePipelineRobustnessProperties ELEMENT_FACTORY = VkPhysicalDevicePipelineRobustnessProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePipelineRobustnessProperties.SIZEOF);
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
        public VkPhysicalDevicePipelineRobustnessProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePipelineRobustnessProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePipelineRobustnessProperties.npNext(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessStorageBuffers() {
            return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessStorageBuffers(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessUniformBuffers() {
            return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessUniformBuffers(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessVertexInputs() {
            return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessVertexInputs(address());
        }

        @NativeType("VkPipelineRobustnessImageBehavior")
        public int defaultRobustnessImages() {
            return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessImages(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineRobustnessProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000068002);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineRobustnessProperties.npNext(address(), value);
            return this;
        }
    }
}
