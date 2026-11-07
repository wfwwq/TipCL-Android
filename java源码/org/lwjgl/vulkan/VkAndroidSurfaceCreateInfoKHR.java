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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidSurfaceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidSurfaceCreateInfoKHR.class */
public class VkAndroidSurfaceCreateInfoKHR extends Struct<VkAndroidSurfaceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int WINDOW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        WINDOW = layout.offsetof(3);
    }

    protected VkAndroidSurfaceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAndroidSurfaceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkAndroidSurfaceCreateInfoKHR(address, container);
    }

    public VkAndroidSurfaceCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAndroidSurfaceCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("ANativeWindow *")
    public long window() {
        return nwindow(address());
    }

    public VkAndroidSurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAndroidSurfaceCreateInfoKHR sType$Default() {
        return sType(KHRAndroidSurface.VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR);
    }

    public VkAndroidSurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAndroidSurfaceCreateInfoKHR flags(@NativeType("VkAndroidSurfaceCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkAndroidSurfaceCreateInfoKHR window(@NativeType("ANativeWindow *") long value) {
        nwindow(address(), value);
        return this;
    }

    public VkAndroidSurfaceCreateInfoKHR set(int sType, long pNext, int flags, long window) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        window(window);
        return this;
    }

    public VkAndroidSurfaceCreateInfoKHR set(VkAndroidSurfaceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAndroidSurfaceCreateInfoKHR malloc() {
        return new VkAndroidSurfaceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAndroidSurfaceCreateInfoKHR calloc() {
        return new VkAndroidSurfaceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAndroidSurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidSurfaceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAndroidSurfaceCreateInfoKHR create(long address) {
        return new VkAndroidSurfaceCreateInfoKHR(address, null);
    }

    public static VkAndroidSurfaceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAndroidSurfaceCreateInfoKHR(address, null);
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

    public static VkAndroidSurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkAndroidSurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAndroidSurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkAndroidSurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nwindow(long struct) {
        return MemoryUtil.memGetAddress(struct + WINDOW);
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

    public static void nwindow(long struct, long value) {
        MemoryUtil.memPutAddress(struct + WINDOW, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidSurfaceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidSurfaceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAndroidSurfaceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkAndroidSurfaceCreateInfoKHR ELEMENT_FACTORY = VkAndroidSurfaceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAndroidSurfaceCreateInfoKHR.SIZEOF);
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
        public VkAndroidSurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAndroidSurfaceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAndroidSurfaceCreateInfoKHR.npNext(address());
        }

        @NativeType("VkAndroidSurfaceCreateFlagsKHR")
        public int flags() {
            return VkAndroidSurfaceCreateInfoKHR.nflags(address());
        }

        @NativeType("ANativeWindow *")
        public long window() {
            return VkAndroidSurfaceCreateInfoKHR.nwindow(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAndroidSurfaceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAndroidSurface.VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAndroidSurfaceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkAndroidSurfaceCreateFlagsKHR") int value) {
            VkAndroidSurfaceCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer window(@NativeType("ANativeWindow *") long value) {
            VkAndroidSurfaceCreateInfoKHR.nwindow(address(), value);
            return this;
        }
    }
}
