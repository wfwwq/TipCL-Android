package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePipelineBinaryInternalCacheControlKHR.class */
public class VkDevicePipelineBinaryInternalCacheControlKHR extends Struct<VkDevicePipelineBinaryInternalCacheControlKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DISABLEINTERNALCACHE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISABLEINTERNALCACHE = layout.offsetof(2);
    }

    protected VkDevicePipelineBinaryInternalCacheControlKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDevicePipelineBinaryInternalCacheControlKHR create(long address, ByteBuffer container) {
        return new VkDevicePipelineBinaryInternalCacheControlKHR(address, container);
    }

    public VkDevicePipelineBinaryInternalCacheControlKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean disableInternalCache() {
        return ndisableInternalCache(address()) != 0;
    }

    public VkDevicePipelineBinaryInternalCacheControlKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDevicePipelineBinaryInternalCacheControlKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR);
    }

    public VkDevicePipelineBinaryInternalCacheControlKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDevicePipelineBinaryInternalCacheControlKHR disableInternalCache(@NativeType("VkBool32") boolean value) {
        ndisableInternalCache(address(), value ? 1 : 0);
        return this;
    }

    public VkDevicePipelineBinaryInternalCacheControlKHR set(int sType, long pNext, boolean disableInternalCache) {
        sType(sType);
        pNext(pNext);
        disableInternalCache(disableInternalCache);
        return this;
    }

    public VkDevicePipelineBinaryInternalCacheControlKHR set(VkDevicePipelineBinaryInternalCacheControlKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDevicePipelineBinaryInternalCacheControlKHR malloc() {
        return new VkDevicePipelineBinaryInternalCacheControlKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDevicePipelineBinaryInternalCacheControlKHR calloc() {
        return new VkDevicePipelineBinaryInternalCacheControlKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDevicePipelineBinaryInternalCacheControlKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDevicePipelineBinaryInternalCacheControlKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDevicePipelineBinaryInternalCacheControlKHR create(long address) {
        return new VkDevicePipelineBinaryInternalCacheControlKHR(address, null);
    }

    public static VkDevicePipelineBinaryInternalCacheControlKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDevicePipelineBinaryInternalCacheControlKHR(address, null);
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

    public static VkDevicePipelineBinaryInternalCacheControlKHR malloc(MemoryStack stack) {
        return new VkDevicePipelineBinaryInternalCacheControlKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDevicePipelineBinaryInternalCacheControlKHR calloc(MemoryStack stack) {
        return new VkDevicePipelineBinaryInternalCacheControlKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndisableInternalCache(long struct) {
        return MemoryUtil.memGetInt(struct + DISABLEINTERNALCACHE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndisableInternalCache(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISABLEINTERNALCACHE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDevicePipelineBinaryInternalCacheControlKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDevicePipelineBinaryInternalCacheControlKHR, Buffer> implements NativeResource {
        private static final VkDevicePipelineBinaryInternalCacheControlKHR ELEMENT_FACTORY = VkDevicePipelineBinaryInternalCacheControlKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDevicePipelineBinaryInternalCacheControlKHR.SIZEOF);
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
        public VkDevicePipelineBinaryInternalCacheControlKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDevicePipelineBinaryInternalCacheControlKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDevicePipelineBinaryInternalCacheControlKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean disableInternalCache() {
            return VkDevicePipelineBinaryInternalCacheControlKHR.ndisableInternalCache(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDevicePipelineBinaryInternalCacheControlKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDevicePipelineBinaryInternalCacheControlKHR.npNext(address(), value);
            return this;
        }

        public Buffer disableInternalCache(@NativeType("VkBool32") boolean value) {
            VkDevicePipelineBinaryInternalCacheControlKHR.ndisableInternalCache(address(), value ? 1 : 0);
            return this;
        }
    }
}
