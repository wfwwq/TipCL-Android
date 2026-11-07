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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalIOSurfaceInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalIOSurfaceInfoEXT.class */
public class VkImportMetalIOSurfaceInfoEXT extends Struct<VkImportMetalIOSurfaceInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IOSURFACE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IOSURFACE = layout.offsetof(2);
    }

    protected VkImportMetalIOSurfaceInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportMetalIOSurfaceInfoEXT create(long address, ByteBuffer container) {
        return new VkImportMetalIOSurfaceInfoEXT(address, container);
    }

    public VkImportMetalIOSurfaceInfoEXT(ByteBuffer container) {
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

    @NativeType("IOSurfaceRef")
    public long ioSurface() {
        return nioSurface(address());
    }

    public VkImportMetalIOSurfaceInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportMetalIOSurfaceInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT);
    }

    public VkImportMetalIOSurfaceInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportMetalIOSurfaceInfoEXT ioSurface(@NativeType("IOSurfaceRef") long value) {
        nioSurface(address(), value);
        return this;
    }

    public VkImportMetalIOSurfaceInfoEXT set(int sType, long pNext, long ioSurface) {
        sType(sType);
        pNext(pNext);
        ioSurface(ioSurface);
        return this;
    }

    public VkImportMetalIOSurfaceInfoEXT set(VkImportMetalIOSurfaceInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportMetalIOSurfaceInfoEXT malloc() {
        return new VkImportMetalIOSurfaceInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportMetalIOSurfaceInfoEXT calloc() {
        return new VkImportMetalIOSurfaceInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportMetalIOSurfaceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMetalIOSurfaceInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImportMetalIOSurfaceInfoEXT create(long address) {
        return new VkImportMetalIOSurfaceInfoEXT(address, null);
    }

    public static VkImportMetalIOSurfaceInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportMetalIOSurfaceInfoEXT(address, null);
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

    public static VkImportMetalIOSurfaceInfoEXT malloc(MemoryStack stack) {
        return new VkImportMetalIOSurfaceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportMetalIOSurfaceInfoEXT calloc(MemoryStack stack) {
        return new VkImportMetalIOSurfaceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nioSurface(long struct) {
        return MemoryUtil.memGetAddress(struct + IOSURFACE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nioSurface(long struct, long value) {
        MemoryUtil.memPutAddress(struct + IOSURFACE, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + IOSURFACE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalIOSurfaceInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalIOSurfaceInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportMetalIOSurfaceInfoEXT, Buffer> implements NativeResource {
        private static final VkImportMetalIOSurfaceInfoEXT ELEMENT_FACTORY = VkImportMetalIOSurfaceInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportMetalIOSurfaceInfoEXT.SIZEOF);
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
        public VkImportMetalIOSurfaceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportMetalIOSurfaceInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportMetalIOSurfaceInfoEXT.npNext(address());
        }

        @NativeType("IOSurfaceRef")
        public long ioSurface() {
            return VkImportMetalIOSurfaceInfoEXT.nioSurface(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportMetalIOSurfaceInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportMetalIOSurfaceInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer ioSurface(@NativeType("IOSurfaceRef") long value) {
            VkImportMetalIOSurfaceInfoEXT.nioSurface(address(), value);
            return this;
        }
    }
}
