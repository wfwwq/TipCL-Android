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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSurfaceInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSurfaceInfo2KHR.class */
public class VkPhysicalDeviceSurfaceInfo2KHR extends Struct<VkPhysicalDeviceSurfaceInfo2KHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SURFACE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SURFACE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSurfaceInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSurfaceInfo2KHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSurfaceInfo2KHR(address, container);
    }

    public VkPhysicalDeviceSurfaceInfo2KHR(ByteBuffer container) {
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

    @NativeType("VkSurfaceKHR")
    public long surface() {
        return nsurface(address());
    }

    public VkPhysicalDeviceSurfaceInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSurfaceInfo2KHR sType$Default() {
        return sType(KHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR);
    }

    public VkPhysicalDeviceSurfaceInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSurfaceInfo2KHR pNext(VkSurfaceFullScreenExclusiveInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceSurfaceInfo2KHR pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceSurfaceInfo2KHR pNext(VkSurfacePresentModeEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceSurfaceInfo2KHR pNext(VkSurfacePresentModeKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceSurfaceInfo2KHR surface(@NativeType("VkSurfaceKHR") long value) {
        nsurface(address(), value);
        return this;
    }

    public VkPhysicalDeviceSurfaceInfo2KHR set(int sType, long pNext, long surface) {
        sType(sType);
        pNext(pNext);
        surface(surface);
        return this;
    }

    public VkPhysicalDeviceSurfaceInfo2KHR set(VkPhysicalDeviceSurfaceInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR malloc() {
        return new VkPhysicalDeviceSurfaceInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR calloc() {
        return new VkPhysicalDeviceSurfaceInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSurfaceInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR create(long address) {
        return new VkPhysicalDeviceSurfaceInfo2KHR(address, null);
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSurfaceInfo2KHR(address, null);
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

    public static VkPhysicalDeviceSurfaceInfo2KHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSurfaceInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSurfaceInfo2KHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSurfaceInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsurface(long struct) {
        return MemoryUtil.memGetLong(struct + SURFACE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsurface(long struct, long value) {
        MemoryUtil.memPutLong(struct + SURFACE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSurfaceInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSurfaceInfo2KHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSurfaceInfo2KHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSurfaceInfo2KHR ELEMENT_FACTORY = VkPhysicalDeviceSurfaceInfo2KHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSurfaceInfo2KHR.SIZEOF);
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
        public VkPhysicalDeviceSurfaceInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSurfaceInfo2KHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceSurfaceInfo2KHR.npNext(address());
        }

        @NativeType("VkSurfaceKHR")
        public long surface() {
            return VkPhysicalDeviceSurfaceInfo2KHR.nsurface(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSurfaceInfo2KHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceSurfaceInfo2KHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkSurfaceFullScreenExclusiveInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSurfacePresentModeEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSurfacePresentModeKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer surface(@NativeType("VkSurfaceKHR") long value) {
            VkPhysicalDeviceSurfaceInfo2KHR.nsurface(address(), value);
            return this;
        }
    }
}
