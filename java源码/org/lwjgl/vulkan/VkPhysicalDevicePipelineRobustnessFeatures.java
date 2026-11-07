package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessFeatures.class */
public class VkPhysicalDevicePipelineRobustnessFeatures extends Struct<VkPhysicalDevicePipelineRobustnessFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEROBUSTNESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEROBUSTNESS = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineRobustnessFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineRobustnessFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(address, container);
    }

    public VkPhysicalDevicePipelineRobustnessFeatures(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean pipelineRobustness() {
        return npipelineRobustness(address()) != 0;
    }

    public VkPhysicalDevicePipelineRobustnessFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessFeatures sType$Default() {
        return sType(1000068001);
    }

    public VkPhysicalDevicePipelineRobustnessFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessFeatures pipelineRobustness(@NativeType("VkBool32") boolean value) {
        npipelineRobustness(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessFeatures set(int sType, long pNext, boolean pipelineRobustness) {
        sType(sType);
        pNext(pNext);
        pipelineRobustness(pipelineRobustness);
        return this;
    }

    public VkPhysicalDevicePipelineRobustnessFeatures set(VkPhysicalDevicePipelineRobustnessFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineRobustnessFeatures malloc() {
        return new VkPhysicalDevicePipelineRobustnessFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeatures calloc() {
        return new VkPhysicalDevicePipelineRobustnessFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineRobustnessFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineRobustnessFeatures create(long address) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(address, null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineRobustnessFeatures(address, null);
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

    public static VkPhysicalDevicePipelineRobustnessFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineRobustnessFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineRobustness(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEROBUSTNESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineRobustness(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEROBUSTNESS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineRobustnessFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineRobustnessFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePipelineRobustnessFeatures ELEMENT_FACTORY = VkPhysicalDevicePipelineRobustnessFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePipelineRobustnessFeatures.SIZEOF);
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
        public VkPhysicalDevicePipelineRobustnessFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePipelineRobustnessFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePipelineRobustnessFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pipelineRobustness() {
            return VkPhysicalDevicePipelineRobustnessFeatures.npipelineRobustness(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineRobustnessFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000068001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineRobustnessFeatures.npNext(address(), value);
            return this;
        }

        public Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineRobustnessFeatures.npipelineRobustness(address(), value ? 1 : 0);
            return this;
        }
    }
}
