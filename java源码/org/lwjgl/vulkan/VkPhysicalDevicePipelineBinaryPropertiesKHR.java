package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineBinaryPropertiesKHR.class */
public class VkPhysicalDevicePipelineBinaryPropertiesKHR extends Struct<VkPhysicalDevicePipelineBinaryPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEBINARYINTERNALCACHE;
    public static final int PIPELINEBINARYINTERNALCACHECONTROL;
    public static final int PIPELINEBINARYPREFERSINTERNALCACHE;
    public static final int PIPELINEBINARYPRECOMPILEDINTERNALCACHE;
    public static final int PIPELINEBINARYCOMPRESSEDDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINARYINTERNALCACHE = layout.offsetof(2);
        PIPELINEBINARYINTERNALCACHECONTROL = layout.offsetof(3);
        PIPELINEBINARYPREFERSINTERNALCACHE = layout.offsetof(4);
        PIPELINEBINARYPRECOMPILEDINTERNALCACHE = layout.offsetof(5);
        PIPELINEBINARYCOMPRESSEDDATA = layout.offsetof(6);
    }

    protected VkPhysicalDevicePipelineBinaryPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineBinaryPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(address, container);
    }

    public VkPhysicalDevicePipelineBinaryPropertiesKHR(ByteBuffer container) {
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
    public boolean pipelineBinaryInternalCache() {
        return npipelineBinaryInternalCache(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineBinaryInternalCacheControl() {
        return npipelineBinaryInternalCacheControl(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineBinaryPrefersInternalCache() {
        return npipelineBinaryPrefersInternalCache(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineBinaryPrecompiledInternalCache() {
        return npipelineBinaryPrecompiledInternalCache(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean pipelineBinaryCompressedData() {
        return npipelineBinaryCompressedData(address()) != 0;
    }

    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR);
    }

    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineBinaryPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePipelineBinaryPropertiesKHR set(VkPhysicalDevicePipelineBinaryPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR malloc() {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR calloc() {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR create(long address) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(address, null);
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(address, null);
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

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineBinaryInternalCache(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINARYINTERNALCACHE);
    }

    public static int npipelineBinaryInternalCacheControl(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINARYINTERNALCACHECONTROL);
    }

    public static int npipelineBinaryPrefersInternalCache(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINARYPREFERSINTERNALCACHE);
    }

    public static int npipelineBinaryPrecompiledInternalCache(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINARYPRECOMPILEDINTERNALCACHE);
    }

    public static int npipelineBinaryCompressedData(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEBINARYCOMPRESSEDDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineBinaryPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineBinaryPropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePipelineBinaryPropertiesKHR ELEMENT_FACTORY = VkPhysicalDevicePipelineBinaryPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePipelineBinaryPropertiesKHR.SIZEOF);
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
        public VkPhysicalDevicePipelineBinaryPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePipelineBinaryPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePipelineBinaryPropertiesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pipelineBinaryInternalCache() {
            return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryInternalCache(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineBinaryInternalCacheControl() {
            return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryInternalCacheControl(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineBinaryPrefersInternalCache() {
            return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryPrefersInternalCache(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineBinaryPrecompiledInternalCache() {
            return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryPrecompiledInternalCache(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean pipelineBinaryCompressedData() {
            return VkPhysicalDevicePipelineBinaryPropertiesKHR.npipelineBinaryCompressedData(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineBinaryPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineBinaryPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
