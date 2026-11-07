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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFullScreenExclusiveWin32InfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFullScreenExclusiveWin32InfoEXT.class */
public class VkSurfaceFullScreenExclusiveWin32InfoEXT extends Struct<VkSurfaceFullScreenExclusiveWin32InfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HMONITOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HMONITOR = layout.offsetof(2);
    }

    protected VkSurfaceFullScreenExclusiveWin32InfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSurfaceFullScreenExclusiveWin32InfoEXT create(long address, ByteBuffer container) {
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(address, container);
    }

    public VkSurfaceFullScreenExclusiveWin32InfoEXT(ByteBuffer container) {
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

    @NativeType("HMONITOR")
    public long hmonitor() {
        return nhmonitor(address());
    }

    public VkSurfaceFullScreenExclusiveWin32InfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSurfaceFullScreenExclusiveWin32InfoEXT sType$Default() {
        return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT);
    }

    public VkSurfaceFullScreenExclusiveWin32InfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSurfaceFullScreenExclusiveWin32InfoEXT hmonitor(@NativeType("HMONITOR") long value) {
        nhmonitor(address(), value);
        return this;
    }

    public VkSurfaceFullScreenExclusiveWin32InfoEXT set(int sType, long pNext, long hmonitor) {
        sType(sType);
        pNext(pNext);
        hmonitor(hmonitor);
        return this;
    }

    public VkSurfaceFullScreenExclusiveWin32InfoEXT set(VkSurfaceFullScreenExclusiveWin32InfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT malloc() {
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT calloc() {
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT create(long address) {
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(address, null);
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(address, null);
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

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT malloc(MemoryStack stack) {
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT calloc(MemoryStack stack) {
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nhmonitor(long struct) {
        return MemoryUtil.memGetAddress(struct + HMONITOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nhmonitor(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HMONITOR, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + HMONITOR));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFullScreenExclusiveWin32InfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfaceFullScreenExclusiveWin32InfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSurfaceFullScreenExclusiveWin32InfoEXT, Buffer> implements NativeResource {
        private static final VkSurfaceFullScreenExclusiveWin32InfoEXT ELEMENT_FACTORY = VkSurfaceFullScreenExclusiveWin32InfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSurfaceFullScreenExclusiveWin32InfoEXT.SIZEOF);
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
        public VkSurfaceFullScreenExclusiveWin32InfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSurfaceFullScreenExclusiveWin32InfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSurfaceFullScreenExclusiveWin32InfoEXT.npNext(address());
        }

        @NativeType("HMONITOR")
        public long hmonitor() {
            return VkSurfaceFullScreenExclusiveWin32InfoEXT.nhmonitor(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfaceFullScreenExclusiveWin32InfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSurfaceFullScreenExclusiveWin32InfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer hmonitor(@NativeType("HMONITOR") long value) {
            VkSurfaceFullScreenExclusiveWin32InfoEXT.nhmonitor(address(), value);
            return this;
        }
    }
}
