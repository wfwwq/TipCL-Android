package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRobustnessCreateInfo.class */
public class VkPipelineRobustnessCreateInfo extends Struct<VkPipelineRobustnessCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STORAGEBUFFERS;
    public static final int UNIFORMBUFFERS;
    public static final int VERTEXINPUTS;
    public static final int IMAGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFERS = layout.offsetof(2);
        UNIFORMBUFFERS = layout.offsetof(3);
        VERTEXINPUTS = layout.offsetof(4);
        IMAGES = layout.offsetof(5);
    }

    protected VkPipelineRobustnessCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRobustnessCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineRobustnessCreateInfo(address, container);
    }

    public VkPipelineRobustnessCreateInfo(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int storageBuffers() {
        return nstorageBuffers(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int uniformBuffers() {
        return nuniformBuffers(address());
    }

    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int vertexInputs() {
        return nvertexInputs(address());
    }

    @NativeType("VkPipelineRobustnessImageBehavior")
    public int images() {
        return nimages(address());
    }

    public VkPipelineRobustnessCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRobustnessCreateInfo sType$Default() {
        return sType(1000068000);
    }

    public VkPipelineRobustnessCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRobustnessCreateInfo storageBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) {
        nstorageBuffers(address(), value);
        return this;
    }

    public VkPipelineRobustnessCreateInfo uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) {
        nuniformBuffers(address(), value);
        return this;
    }

    public VkPipelineRobustnessCreateInfo vertexInputs(@NativeType("VkPipelineRobustnessBufferBehavior") int value) {
        nvertexInputs(address(), value);
        return this;
    }

    public VkPipelineRobustnessCreateInfo images(@NativeType("VkPipelineRobustnessImageBehavior") int value) {
        nimages(address(), value);
        return this;
    }

    public VkPipelineRobustnessCreateInfo set(int sType, long pNext, int storageBuffers, int uniformBuffers, int vertexInputs, int images) {
        sType(sType);
        pNext(pNext);
        storageBuffers(storageBuffers);
        uniformBuffers(uniformBuffers);
        vertexInputs(vertexInputs);
        images(images);
        return this;
    }

    public VkPipelineRobustnessCreateInfo set(VkPipelineRobustnessCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRobustnessCreateInfo malloc() {
        return new VkPipelineRobustnessCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRobustnessCreateInfo calloc() {
        return new VkPipelineRobustnessCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRobustnessCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRobustnessCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRobustnessCreateInfo create(long address) {
        return new VkPipelineRobustnessCreateInfo(address, null);
    }

    public static VkPipelineRobustnessCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRobustnessCreateInfo(address, null);
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

    public static VkPipelineRobustnessCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineRobustnessCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRobustnessCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineRobustnessCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstorageBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEBUFFERS);
    }

    public static int nuniformBuffers(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMBUFFERS);
    }

    public static int nvertexInputs(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXINPUTS);
    }

    public static int nimages(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstorageBuffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEBUFFERS, value);
    }

    public static void nuniformBuffers(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFORMBUFFERS, value);
    }

    public static void nvertexInputs(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXINPUTS, value);
    }

    public static void nimages(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRobustnessCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRobustnessCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineRobustnessCreateInfo ELEMENT_FACTORY = VkPipelineRobustnessCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRobustnessCreateInfo.SIZEOF);
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
        public VkPipelineRobustnessCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRobustnessCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRobustnessCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int storageBuffers() {
            return VkPipelineRobustnessCreateInfo.nstorageBuffers(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int uniformBuffers() {
            return VkPipelineRobustnessCreateInfo.nuniformBuffers(address());
        }

        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int vertexInputs() {
            return VkPipelineRobustnessCreateInfo.nvertexInputs(address());
        }

        @NativeType("VkPipelineRobustnessImageBehavior")
        public int images() {
            return VkPipelineRobustnessCreateInfo.nimages(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRobustnessCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000068000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRobustnessCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer storageBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) {
            VkPipelineRobustnessCreateInfo.nstorageBuffers(address(), value);
            return this;
        }

        public Buffer uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) {
            VkPipelineRobustnessCreateInfo.nuniformBuffers(address(), value);
            return this;
        }

        public Buffer vertexInputs(@NativeType("VkPipelineRobustnessBufferBehavior") int value) {
            VkPipelineRobustnessCreateInfo.nvertexInputs(address(), value);
            return this;
        }

        public Buffer images(@NativeType("VkPipelineRobustnessImageBehavior") int value) {
            VkPipelineRobustnessCreateInfo.nimages(address(), value);
            return this;
        }
    }
}
