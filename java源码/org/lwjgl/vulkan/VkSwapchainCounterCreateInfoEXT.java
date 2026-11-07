package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCounterCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCounterCreateInfoEXT.class */
public class VkSwapchainCounterCreateInfoEXT extends Struct<VkSwapchainCounterCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SURFACECOUNTERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SURFACECOUNTERS = layout.offsetof(2);
    }

    protected VkSwapchainCounterCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainCounterCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkSwapchainCounterCreateInfoEXT(address, container);
    }

    public VkSwapchainCounterCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkSurfaceCounterFlagsEXT")
    public int surfaceCounters() {
        return nsurfaceCounters(address());
    }

    public VkSwapchainCounterCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainCounterCreateInfoEXT sType$Default() {
        return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT);
    }

    public VkSwapchainCounterCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainCounterCreateInfoEXT surfaceCounters(@NativeType("VkSurfaceCounterFlagsEXT") int value) {
        nsurfaceCounters(address(), value);
        return this;
    }

    public VkSwapchainCounterCreateInfoEXT set(int sType, long pNext, int surfaceCounters) {
        sType(sType);
        pNext(pNext);
        surfaceCounters(surfaceCounters);
        return this;
    }

    public VkSwapchainCounterCreateInfoEXT set(VkSwapchainCounterCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainCounterCreateInfoEXT malloc() {
        return new VkSwapchainCounterCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainCounterCreateInfoEXT calloc() {
        return new VkSwapchainCounterCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainCounterCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainCounterCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainCounterCreateInfoEXT create(long address) {
        return new VkSwapchainCounterCreateInfoEXT(address, null);
    }

    public static VkSwapchainCounterCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainCounterCreateInfoEXT(address, null);
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

    public static VkSwapchainCounterCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainCounterCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainCounterCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainCounterCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsurfaceCounters(long struct) {
        return MemoryUtil.memGetInt(struct + SURFACECOUNTERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsurfaceCounters(long struct, int value) {
        MemoryUtil.memPutInt(struct + SURFACECOUNTERS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCounterCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCounterCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainCounterCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkSwapchainCounterCreateInfoEXT ELEMENT_FACTORY = VkSwapchainCounterCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainCounterCreateInfoEXT.SIZEOF);
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
        public VkSwapchainCounterCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainCounterCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainCounterCreateInfoEXT.npNext(address());
        }

        @NativeType("VkSurfaceCounterFlagsEXT")
        public int surfaceCounters() {
            return VkSwapchainCounterCreateInfoEXT.nsurfaceCounters(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainCounterCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainCounterCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer surfaceCounters(@NativeType("VkSurfaceCounterFlagsEXT") int value) {
            VkSwapchainCounterCreateInfoEXT.nsurfaceCounters(address(), value);
            return this;
        }
    }
}
