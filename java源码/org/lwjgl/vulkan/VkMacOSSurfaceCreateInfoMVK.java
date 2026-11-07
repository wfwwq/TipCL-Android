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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMacOSSurfaceCreateInfoMVK.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMacOSSurfaceCreateInfoMVK.class */
public class VkMacOSSurfaceCreateInfoMVK extends Struct<VkMacOSSurfaceCreateInfoMVK> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PVIEW;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PVIEW = layout.offsetof(3);
    }

    protected VkMacOSSurfaceCreateInfoMVK(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMacOSSurfaceCreateInfoMVK create(long address, ByteBuffer container) {
        return new VkMacOSSurfaceCreateInfoMVK(address, container);
    }

    public VkMacOSSurfaceCreateInfoMVK(ByteBuffer container) {
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

    @NativeType("VkMacOSSurfaceCreateFlagsMVK")
    public int flags() {
        return nflags(address());
    }

    @NativeType("void const *")
    public long pView() {
        return npView(address());
    }

    public VkMacOSSurfaceCreateInfoMVK sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMacOSSurfaceCreateInfoMVK sType$Default() {
        return sType(MVKMacosSurface.VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK);
    }

    public VkMacOSSurfaceCreateInfoMVK pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMacOSSurfaceCreateInfoMVK flags(@NativeType("VkMacOSSurfaceCreateFlagsMVK") int value) {
        nflags(address(), value);
        return this;
    }

    public VkMacOSSurfaceCreateInfoMVK pView(@NativeType("void const *") long value) {
        npView(address(), value);
        return this;
    }

    public VkMacOSSurfaceCreateInfoMVK set(int sType, long pNext, int flags, long pView) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pView(pView);
        return this;
    }

    public VkMacOSSurfaceCreateInfoMVK set(VkMacOSSurfaceCreateInfoMVK src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMacOSSurfaceCreateInfoMVK malloc() {
        return new VkMacOSSurfaceCreateInfoMVK(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMacOSSurfaceCreateInfoMVK calloc() {
        return new VkMacOSSurfaceCreateInfoMVK(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMacOSSurfaceCreateInfoMVK create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMacOSSurfaceCreateInfoMVK(MemoryUtil.memAddress(container), container);
    }

    public static VkMacOSSurfaceCreateInfoMVK create(long address) {
        return new VkMacOSSurfaceCreateInfoMVK(address, null);
    }

    public static VkMacOSSurfaceCreateInfoMVK createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMacOSSurfaceCreateInfoMVK(address, null);
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

    public static VkMacOSSurfaceCreateInfoMVK malloc(MemoryStack stack) {
        return new VkMacOSSurfaceCreateInfoMVK(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMacOSSurfaceCreateInfoMVK calloc(MemoryStack stack) {
        return new VkMacOSSurfaceCreateInfoMVK(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npView(long struct) {
        return MemoryUtil.memGetAddress(struct + PVIEW);
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

    public static void npView(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PVIEW, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMacOSSurfaceCreateInfoMVK$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMacOSSurfaceCreateInfoMVK$Buffer.class */
    public static class Buffer extends StructBuffer<VkMacOSSurfaceCreateInfoMVK, Buffer> implements NativeResource {
        private static final VkMacOSSurfaceCreateInfoMVK ELEMENT_FACTORY = VkMacOSSurfaceCreateInfoMVK.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMacOSSurfaceCreateInfoMVK.SIZEOF);
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
        public VkMacOSSurfaceCreateInfoMVK getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMacOSSurfaceCreateInfoMVK.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMacOSSurfaceCreateInfoMVK.npNext(address());
        }

        @NativeType("VkMacOSSurfaceCreateFlagsMVK")
        public int flags() {
            return VkMacOSSurfaceCreateInfoMVK.nflags(address());
        }

        @NativeType("void const *")
        public long pView() {
            return VkMacOSSurfaceCreateInfoMVK.npView(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMacOSSurfaceCreateInfoMVK.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(MVKMacosSurface.VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMacOSSurfaceCreateInfoMVK.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkMacOSSurfaceCreateFlagsMVK") int value) {
            VkMacOSSurfaceCreateInfoMVK.nflags(address(), value);
            return this;
        }

        public Buffer pView(@NativeType("void const *") long value) {
            VkMacOSSurfaceCreateInfoMVK.npView(address(), value);
            return this;
        }
    }
}
