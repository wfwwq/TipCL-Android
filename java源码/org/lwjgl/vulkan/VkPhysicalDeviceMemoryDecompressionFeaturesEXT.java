package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionFeaturesEXT.class */
public class VkPhysicalDeviceMemoryDecompressionFeaturesEXT extends Struct<VkPhysicalDeviceMemoryDecompressionFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORYDECOMPRESSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYDECOMPRESSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMemoryDecompressionFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT(ByteBuffer container) {
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
    public boolean memoryDecompression() {
        return nmemoryDecompression(address()) != 0;
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT sType$Default() {
        return sType(1000427000);
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT memoryDecompression(@NativeType("VkBool32") boolean value) {
        nmemoryDecompression(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT set(int sType, long pNext, boolean memoryDecompression) {
        sType(sType);
        pNext(pNext);
        memoryDecompression(memoryDecompression);
        return this;
    }

    public VkPhysicalDeviceMemoryDecompressionFeaturesEXT set(VkPhysicalDeviceMemoryDecompressionFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT malloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT calloc() {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMemoryDecompressionFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryDecompressionFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmemoryDecompression(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYDECOMPRESSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemoryDecompression(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYDECOMPRESSION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMemoryDecompressionFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryDecompressionFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMemoryDecompressionFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMemoryDecompressionFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMemoryDecompressionFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceMemoryDecompressionFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMemoryDecompressionFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean memoryDecompression() {
            return VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nmemoryDecompression(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000427000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMemoryDecompressionFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer memoryDecompression(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMemoryDecompressionFeaturesEXT.nmemoryDecompression(address(), value ? 1 : 0);
            return this;
        }
    }
}
