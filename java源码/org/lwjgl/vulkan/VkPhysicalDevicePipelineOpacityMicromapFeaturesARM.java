package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.class */
public class VkPhysicalDevicePipelineOpacityMicromapFeaturesARM extends Struct<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEOPACITYMICROMAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEOPACITYMICROMAP = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(address, container);
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(ByteBuffer container) {
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
    public boolean pipelineOpacityMicromap() {
        return npipelineOpacityMicromap(address()) != 0;
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM sType$Default() {
        return sType(ARMPipelineOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM);
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pipelineOpacityMicromap(@NativeType("VkBool32") boolean value) {
        npipelineOpacityMicromap(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM set(int sType, long pNext, boolean pipelineOpacityMicromap) {
        sType(sType);
        pNext(pNext);
        pipelineOpacityMicromap(pipelineOpacityMicromap);
        return this;
    }

    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM set(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM malloc() {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM calloc() {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM create(long address) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(address, null);
    }

    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(address, null);
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

    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineOpacityMicromap(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEOPACITYMICROMAP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineOpacityMicromap(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEOPACITYMICROMAP, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineOpacityMicromapFeaturesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePipelineOpacityMicromapFeaturesARM ELEMENT_FACTORY = VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.SIZEOF);
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
        public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pipelineOpacityMicromap() {
            return VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npipelineOpacityMicromap(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMPipelineOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npNext(address(), value);
            return this;
        }

        public Buffer pipelineOpacityMicromap(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npipelineOpacityMicromap(address(), value ? 1 : 0);
            return this;
        }
    }
}
