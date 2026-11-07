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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXlibSurfaceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXlibSurfaceCreateInfoKHR.class */
public class VkXlibSurfaceCreateInfoKHR extends Struct<VkXlibSurfaceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DPY;
    public static final int WINDOW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(CLONG_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DPY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
    }

    protected VkXlibSurfaceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkXlibSurfaceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkXlibSurfaceCreateInfoKHR(address, container);
    }

    public VkXlibSurfaceCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkXlibSurfaceCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("Display *")
    public long dpy() {
        return ndpy(address());
    }

    @NativeType("Window")
    public long window() {
        return nwindow(address());
    }

    public VkXlibSurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkXlibSurfaceCreateInfoKHR sType$Default() {
        return sType(KHRXlibSurface.VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR);
    }

    public VkXlibSurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkXlibSurfaceCreateInfoKHR flags(@NativeType("VkXlibSurfaceCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkXlibSurfaceCreateInfoKHR dpy(@NativeType("Display *") long value) {
        ndpy(address(), value);
        return this;
    }

    public VkXlibSurfaceCreateInfoKHR window(@NativeType("Window") long value) {
        nwindow(address(), value);
        return this;
    }

    public VkXlibSurfaceCreateInfoKHR set(int sType, long pNext, int flags, long dpy, long window) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dpy(dpy);
        window(window);
        return this;
    }

    public VkXlibSurfaceCreateInfoKHR set(VkXlibSurfaceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkXlibSurfaceCreateInfoKHR malloc() {
        return new VkXlibSurfaceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkXlibSurfaceCreateInfoKHR calloc() {
        return new VkXlibSurfaceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkXlibSurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkXlibSurfaceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkXlibSurfaceCreateInfoKHR create(long address) {
        return new VkXlibSurfaceCreateInfoKHR(address, null);
    }

    public static VkXlibSurfaceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkXlibSurfaceCreateInfoKHR(address, null);
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

    public static VkXlibSurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkXlibSurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkXlibSurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkXlibSurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndpy(long struct) {
        return MemoryUtil.memGetAddress(struct + DPY);
    }

    public static long nwindow(long struct) {
        return MemoryUtil.memGetCLong(struct + WINDOW);
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

    public static void ndpy(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DPY, value);
    }

    public static void nwindow(long struct, long value) {
        MemoryUtil.memPutCLong(struct + WINDOW, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXlibSurfaceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXlibSurfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkXlibSurfaceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkXlibSurfaceCreateInfoKHR ELEMENT_FACTORY = VkXlibSurfaceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkXlibSurfaceCreateInfoKHR.SIZEOF);
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
        public VkXlibSurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkXlibSurfaceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkXlibSurfaceCreateInfoKHR.npNext(address());
        }

        @NativeType("VkXlibSurfaceCreateFlagsKHR")
        public int flags() {
            return VkXlibSurfaceCreateInfoKHR.nflags(address());
        }

        @NativeType("Display *")
        public long dpy() {
            return VkXlibSurfaceCreateInfoKHR.ndpy(address());
        }

        @NativeType("Window")
        public long window() {
            return VkXlibSurfaceCreateInfoKHR.nwindow(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkXlibSurfaceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRXlibSurface.VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkXlibSurfaceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkXlibSurfaceCreateFlagsKHR") int value) {
            VkXlibSurfaceCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer dpy(@NativeType("Display *") long value) {
            VkXlibSurfaceCreateInfoKHR.ndpy(address(), value);
            return this;
        }

        public Buffer window(@NativeType("Window") long value) {
            VkXlibSurfaceCreateInfoKHR.nwindow(address(), value);
            return this;
        }
    }
}
