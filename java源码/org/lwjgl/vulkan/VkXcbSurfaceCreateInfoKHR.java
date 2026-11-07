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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXcbSurfaceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXcbSurfaceCreateInfoKHR.class */
public class VkXcbSurfaceCreateInfoKHR extends Struct<VkXcbSurfaceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int CONNECTION;
    public static final int WINDOW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CONNECTION = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
    }

    protected VkXcbSurfaceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkXcbSurfaceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkXcbSurfaceCreateInfoKHR(address, container);
    }

    public VkXcbSurfaceCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkXcbSurfaceCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("xcb_connection_t *")
    public long connection() {
        return nconnection(address());
    }

    @NativeType("xcb_window_t")
    public int window() {
        return nwindow(address());
    }

    public VkXcbSurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkXcbSurfaceCreateInfoKHR sType$Default() {
        return sType(KHRXcbSurface.VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR);
    }

    public VkXcbSurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkXcbSurfaceCreateInfoKHR flags(@NativeType("VkXcbSurfaceCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkXcbSurfaceCreateInfoKHR connection(@NativeType("xcb_connection_t *") long value) {
        nconnection(address(), value);
        return this;
    }

    public VkXcbSurfaceCreateInfoKHR window(@NativeType("xcb_window_t") int value) {
        nwindow(address(), value);
        return this;
    }

    public VkXcbSurfaceCreateInfoKHR set(int sType, long pNext, int flags, long connection, int window) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        connection(connection);
        window(window);
        return this;
    }

    public VkXcbSurfaceCreateInfoKHR set(VkXcbSurfaceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkXcbSurfaceCreateInfoKHR malloc() {
        return new VkXcbSurfaceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkXcbSurfaceCreateInfoKHR calloc() {
        return new VkXcbSurfaceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkXcbSurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkXcbSurfaceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkXcbSurfaceCreateInfoKHR create(long address) {
        return new VkXcbSurfaceCreateInfoKHR(address, null);
    }

    public static VkXcbSurfaceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkXcbSurfaceCreateInfoKHR(address, null);
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

    public static VkXcbSurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkXcbSurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkXcbSurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkXcbSurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nconnection(long struct) {
        return MemoryUtil.memGetAddress(struct + CONNECTION);
    }

    public static int nwindow(long struct) {
        return MemoryUtil.memGetInt(struct + WINDOW);
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

    public static void nconnection(long struct, long value) {
        MemoryUtil.memPutAddress(struct + CONNECTION, value);
    }

    public static void nwindow(long struct, int value) {
        MemoryUtil.memPutInt(struct + WINDOW, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXcbSurfaceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkXcbSurfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkXcbSurfaceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkXcbSurfaceCreateInfoKHR ELEMENT_FACTORY = VkXcbSurfaceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkXcbSurfaceCreateInfoKHR.SIZEOF);
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
        public VkXcbSurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkXcbSurfaceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkXcbSurfaceCreateInfoKHR.npNext(address());
        }

        @NativeType("VkXcbSurfaceCreateFlagsKHR")
        public int flags() {
            return VkXcbSurfaceCreateInfoKHR.nflags(address());
        }

        @NativeType("xcb_connection_t *")
        public long connection() {
            return VkXcbSurfaceCreateInfoKHR.nconnection(address());
        }

        @NativeType("xcb_window_t")
        public int window() {
            return VkXcbSurfaceCreateInfoKHR.nwindow(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkXcbSurfaceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRXcbSurface.VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkXcbSurfaceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkXcbSurfaceCreateFlagsKHR") int value) {
            VkXcbSurfaceCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer connection(@NativeType("xcb_connection_t *") long value) {
            VkXcbSurfaceCreateInfoKHR.nconnection(address(), value);
            return this;
        }

        public Buffer window(@NativeType("xcb_window_t") int value) {
            VkXcbSurfaceCreateInfoKHR.nwindow(address(), value);
            return this;
        }
    }
}
