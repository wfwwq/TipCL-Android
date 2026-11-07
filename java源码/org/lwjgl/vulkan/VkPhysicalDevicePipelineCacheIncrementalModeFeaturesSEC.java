package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.class */
public class VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC extends Struct<VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINECACHEINCREMENTALMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINECACHEINCREMENTALMODE = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(address, container);
    }

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(ByteBuffer container) {
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
    public boolean pipelineCacheIncrementalMode() {
        return npipelineCacheIncrementalMode(address()) != 0;
    }

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC sType$Default() {
        return sType(SECPipelineCacheIncrementalMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC);
    }

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC pipelineCacheIncrementalMode(@NativeType("VkBool32") boolean value) {
        npipelineCacheIncrementalMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC set(int sType, long pNext, boolean pipelineCacheIncrementalMode) {
        sType(sType);
        pNext(pNext);
        pipelineCacheIncrementalMode(pipelineCacheIncrementalMode);
        return this;
    }

    public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC set(VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC malloc() {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC calloc() {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC create(long address) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(address, null);
    }

    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(address, null);
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

    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineCacheIncrementalMode(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINECACHEINCREMENTALMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineCacheIncrementalMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINECACHEINCREMENTALMODE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC ELEMENT_FACTORY = VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.SIZEOF);
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
        public VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pipelineCacheIncrementalMode() {
            return VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npipelineCacheIncrementalMode(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(SECPipelineCacheIncrementalMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npNext(address(), value);
            return this;
        }

        public Buffer pipelineCacheIncrementalMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineCacheIncrementalModeFeaturesSEC.npipelineCacheIncrementalMode(address(), value ? 1 : 0);
            return this;
        }
    }
}
