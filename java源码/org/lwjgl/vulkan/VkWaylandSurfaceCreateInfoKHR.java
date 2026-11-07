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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWaylandSurfaceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWaylandSurfaceCreateInfoKHR.class */
public class VkWaylandSurfaceCreateInfoKHR extends Struct<VkWaylandSurfaceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DISPLAY;
    public static final int SURFACE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        SURFACE = layout.offsetof(4);
    }

    protected VkWaylandSurfaceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWaylandSurfaceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkWaylandSurfaceCreateInfoKHR(address, container);
    }

    public VkWaylandSurfaceCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkWaylandSurfaceCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("struct wl_display *")
    public long display() {
        return ndisplay(address());
    }

    @NativeType("struct wl_surface *")
    public long surface() {
        return nsurface(address());
    }

    public VkWaylandSurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWaylandSurfaceCreateInfoKHR sType$Default() {
        return sType(KHRWaylandSurface.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR);
    }

    public VkWaylandSurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWaylandSurfaceCreateInfoKHR flags(@NativeType("VkWaylandSurfaceCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkWaylandSurfaceCreateInfoKHR display(@NativeType("struct wl_display *") long value) {
        ndisplay(address(), value);
        return this;
    }

    public VkWaylandSurfaceCreateInfoKHR surface(@NativeType("struct wl_surface *") long value) {
        nsurface(address(), value);
        return this;
    }

    public VkWaylandSurfaceCreateInfoKHR set(int sType, long pNext, int flags, long display, long surface) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        display(display);
        surface(surface);
        return this;
    }

    public VkWaylandSurfaceCreateInfoKHR set(VkWaylandSurfaceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWaylandSurfaceCreateInfoKHR malloc() {
        return new VkWaylandSurfaceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWaylandSurfaceCreateInfoKHR calloc() {
        return new VkWaylandSurfaceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWaylandSurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWaylandSurfaceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkWaylandSurfaceCreateInfoKHR create(long address) {
        return new VkWaylandSurfaceCreateInfoKHR(address, null);
    }

    public static VkWaylandSurfaceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWaylandSurfaceCreateInfoKHR(address, null);
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

    public static VkWaylandSurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkWaylandSurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWaylandSurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkWaylandSurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long ndisplay(long struct) {
        return MemoryUtil.memGetAddress(struct + DISPLAY);
    }

    public static long nsurface(long struct) {
        return MemoryUtil.memGetAddress(struct + SURFACE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndisplay(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DISPLAY, value);
    }

    public static void nsurface(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SURFACE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWaylandSurfaceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWaylandSurfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkWaylandSurfaceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkWaylandSurfaceCreateInfoKHR ELEMENT_FACTORY = VkWaylandSurfaceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWaylandSurfaceCreateInfoKHR.SIZEOF);
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
        public VkWaylandSurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWaylandSurfaceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWaylandSurfaceCreateInfoKHR.npNext(address());
        }

        @NativeType("VkWaylandSurfaceCreateFlagsKHR")
        public int flags() {
            return VkWaylandSurfaceCreateInfoKHR.nflags(address());
        }

        @NativeType("struct wl_display *")
        public long display() {
            return VkWaylandSurfaceCreateInfoKHR.ndisplay(address());
        }

        @NativeType("struct wl_surface *")
        public long surface() {
            return VkWaylandSurfaceCreateInfoKHR.nsurface(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWaylandSurfaceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRWaylandSurface.VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWaylandSurfaceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkWaylandSurfaceCreateFlagsKHR") int value) {
            VkWaylandSurfaceCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer display(@NativeType("struct wl_display *") long value) {
            VkWaylandSurfaceCreateInfoKHR.ndisplay(address(), value);
            return this;
        }

        public Buffer surface(@NativeType("struct wl_surface *") long value) {
            VkWaylandSurfaceCreateInfoKHR.nsurface(address(), value);
            return this;
        }
    }
}
