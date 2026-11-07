package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineBinaryFeaturesKHR.class */
public class VkPhysicalDevicePipelineBinaryFeaturesKHR extends Struct<VkPhysicalDevicePipelineBinaryFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEBINARIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINARIES = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineBinaryFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineBinaryFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(address, container);
    }

    public VkPhysicalDevicePipelineBinaryFeaturesKHR(ByteBuffer container) {
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
    public boolean pipelineBinaries() {
        return npipelineBinaries(address()) != 0;
    }

    public VkPhysicalDevicePipelineBinaryFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineBinaryFeaturesKHR sType$Default() {
        return sType(1000483000);
    }

    public VkPhysicalDevicePipelineBinaryFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineBinaryFeaturesKHR pipelineBinaries(@NativeType("VkBool32") boolean value) {
        npipelineBinaries(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePipelineBinaryFeaturesKHR set(int sType, long pNext, boolean pipelineBinaries) {
        sType(sType);
        pNext(pNext);
        pipelineBinaries(pipelineBinaries);
        return this;
    }

    public VkPhysicalDevicePipelineBinaryFeaturesKHR set(VkPhysicalDevicePipelineBinaryFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR malloc() {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR calloc() {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR create(long address) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(address, null);
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(address, null);
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

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineBinaries(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINARIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineBinaries(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEBINARIES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineBinaryFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineBinaryFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePipelineBinaryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePipelineBinaryFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePipelineBinaryFeaturesKHR.SIZEOF);
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
        public VkPhysicalDevicePipelineBinaryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePipelineBinaryFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePipelineBinaryFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pipelineBinaries() {
            return VkPhysicalDevicePipelineBinaryFeaturesKHR.npipelineBinaries(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineBinaryFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000483000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineBinaryFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer pipelineBinaries(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineBinaryFeaturesKHR.npipelineBinaries(address(), value ? 1 : 0);
            return this;
        }
    }
}
