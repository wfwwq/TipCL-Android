package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainTimingPropertiesEXT.class */
public class VkSwapchainTimingPropertiesEXT extends Struct<VkSwapchainTimingPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int REFRESHDURATION;
    public static final int REFRESHINTERVAL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REFRESHDURATION = layout.offsetof(2);
        REFRESHINTERVAL = layout.offsetof(3);
    }

    protected VkSwapchainTimingPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainTimingPropertiesEXT create(long address, ByteBuffer container) {
        return new VkSwapchainTimingPropertiesEXT(address, container);
    }

    public VkSwapchainTimingPropertiesEXT(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long refreshDuration() {
        return nrefreshDuration(address());
    }

    @NativeType("uint64_t")
    public long refreshInterval() {
        return nrefreshInterval(address());
    }

    public VkSwapchainTimingPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainTimingPropertiesEXT sType$Default() {
        return sType(1000208001);
    }

    public VkSwapchainTimingPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainTimingPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSwapchainTimingPropertiesEXT set(VkSwapchainTimingPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainTimingPropertiesEXT malloc() {
        return new VkSwapchainTimingPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainTimingPropertiesEXT calloc() {
        return new VkSwapchainTimingPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainTimingPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainTimingPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainTimingPropertiesEXT create(long address) {
        return new VkSwapchainTimingPropertiesEXT(address, null);
    }

    public static VkSwapchainTimingPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainTimingPropertiesEXT(address, null);
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

    public static VkSwapchainTimingPropertiesEXT malloc(MemoryStack stack) {
        return new VkSwapchainTimingPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainTimingPropertiesEXT calloc(MemoryStack stack) {
        return new VkSwapchainTimingPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nrefreshDuration(long struct) {
        return MemoryUtil.memGetLong(struct + REFRESHDURATION);
    }

    public static long nrefreshInterval(long struct) {
        return MemoryUtil.memGetLong(struct + REFRESHINTERVAL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainTimingPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainTimingPropertiesEXT, Buffer> implements NativeResource {
        private static final VkSwapchainTimingPropertiesEXT ELEMENT_FACTORY = VkSwapchainTimingPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainTimingPropertiesEXT.SIZEOF);
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
        public VkSwapchainTimingPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainTimingPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSwapchainTimingPropertiesEXT.npNext(address());
        }

        @NativeType("uint64_t")
        public long refreshDuration() {
            return VkSwapchainTimingPropertiesEXT.nrefreshDuration(address());
        }

        @NativeType("uint64_t")
        public long refreshInterval() {
            return VkSwapchainTimingPropertiesEXT.nrefreshInterval(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainTimingPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000208001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSwapchainTimingPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
