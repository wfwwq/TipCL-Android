package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32SurfaceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32SurfaceCreateInfoKHR.class */
public class VkWin32SurfaceCreateInfoKHR extends Struct<VkWin32SurfaceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int HINSTANCE;
    public static final int HWND;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        HINSTANCE = layout.offsetof(3);
        HWND = layout.offsetof(4);
    }

    protected VkWin32SurfaceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWin32SurfaceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkWin32SurfaceCreateInfoKHR(address, container);
    }

    public VkWin32SurfaceCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkWin32SurfaceCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("HINSTANCE")
    public long hinstance() {
        return nhinstance(address());
    }

    @NativeType("HWND")
    public long hwnd() {
        return nhwnd(address());
    }

    public VkWin32SurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWin32SurfaceCreateInfoKHR sType$Default() {
        return sType(KHRWin32Surface.VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR);
    }

    public VkWin32SurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWin32SurfaceCreateInfoKHR flags(@NativeType("VkWin32SurfaceCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkWin32SurfaceCreateInfoKHR hinstance(@NativeType("HINSTANCE") long value) {
        nhinstance(address(), value);
        return this;
    }

    public VkWin32SurfaceCreateInfoKHR hwnd(@NativeType("HWND") long value) {
        nhwnd(address(), value);
        return this;
    }

    public VkWin32SurfaceCreateInfoKHR set(int sType, long pNext, int flags, long hinstance, long hwnd) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        hinstance(hinstance);
        hwnd(hwnd);
        return this;
    }

    public VkWin32SurfaceCreateInfoKHR set(VkWin32SurfaceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWin32SurfaceCreateInfoKHR malloc() {
        return new VkWin32SurfaceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWin32SurfaceCreateInfoKHR calloc() {
        return new VkWin32SurfaceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWin32SurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWin32SurfaceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkWin32SurfaceCreateInfoKHR create(long address) {
        return new VkWin32SurfaceCreateInfoKHR(address, null);
    }

    public static VkWin32SurfaceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWin32SurfaceCreateInfoKHR(address, null);
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

    public static VkWin32SurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkWin32SurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWin32SurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkWin32SurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nhinstance(long struct) {
        return MemoryUtil.memGetAddress(struct + HINSTANCE);
    }

    public static long nhwnd(long struct) {
        return MemoryUtil.memGetAddress(struct + HWND);
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

    public static void nhinstance(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HINSTANCE, Checks.check(value));
    }

    public static void nhwnd(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HWND, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + HINSTANCE));
        Checks.check(MemoryUtil.memGetAddress(struct + HWND));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32SurfaceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWin32SurfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkWin32SurfaceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkWin32SurfaceCreateInfoKHR ELEMENT_FACTORY = VkWin32SurfaceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWin32SurfaceCreateInfoKHR.SIZEOF);
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
        public VkWin32SurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWin32SurfaceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWin32SurfaceCreateInfoKHR.npNext(address());
        }

        @NativeType("VkWin32SurfaceCreateFlagsKHR")
        public int flags() {
            return VkWin32SurfaceCreateInfoKHR.nflags(address());
        }

        @NativeType("HINSTANCE")
        public long hinstance() {
            return VkWin32SurfaceCreateInfoKHR.nhinstance(address());
        }

        @NativeType("HWND")
        public long hwnd() {
            return VkWin32SurfaceCreateInfoKHR.nhwnd(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWin32SurfaceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRWin32Surface.VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWin32SurfaceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkWin32SurfaceCreateFlagsKHR") int value) {
            VkWin32SurfaceCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer hinstance(@NativeType("HINSTANCE") long value) {
            VkWin32SurfaceCreateInfoKHR.nhinstance(address(), value);
            return this;
        }

        public Buffer hwnd(@NativeType("HWND") long value) {
            VkWin32SurfaceCreateInfoKHR.nhwnd(address(), value);
            return this;
        }
    }
}
