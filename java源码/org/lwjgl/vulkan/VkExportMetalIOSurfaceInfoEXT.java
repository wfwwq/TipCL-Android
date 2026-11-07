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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalIOSurfaceInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalIOSurfaceInfoEXT.class */
public class VkExportMetalIOSurfaceInfoEXT extends Struct<VkExportMetalIOSurfaceInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE;
    public static final int IOSURFACE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        IOSURFACE = layout.offsetof(3);
    }

    protected VkExportMetalIOSurfaceInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportMetalIOSurfaceInfoEXT create(long address, ByteBuffer container) {
        return new VkExportMetalIOSurfaceInfoEXT(address, container);
    }

    public VkExportMetalIOSurfaceInfoEXT(ByteBuffer container) {
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

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    @NativeType("IOSurfaceRef")
    public long ioSurface() {
        return nioSurface(address());
    }

    public VkExportMetalIOSurfaceInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportMetalIOSurfaceInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT);
    }

    public VkExportMetalIOSurfaceInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportMetalIOSurfaceInfoEXT image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkExportMetalIOSurfaceInfoEXT ioSurface(@NativeType("IOSurfaceRef") long value) {
        nioSurface(address(), value);
        return this;
    }

    public VkExportMetalIOSurfaceInfoEXT set(int sType, long pNext, long image, long ioSurface) {
        sType(sType);
        pNext(pNext);
        image(image);
        ioSurface(ioSurface);
        return this;
    }

    public VkExportMetalIOSurfaceInfoEXT set(VkExportMetalIOSurfaceInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMetalIOSurfaceInfoEXT malloc() {
        return new VkExportMetalIOSurfaceInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMetalIOSurfaceInfoEXT calloc() {
        return new VkExportMetalIOSurfaceInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMetalIOSurfaceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalIOSurfaceInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMetalIOSurfaceInfoEXT create(long address) {
        return new VkExportMetalIOSurfaceInfoEXT(address, null);
    }

    public static VkExportMetalIOSurfaceInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMetalIOSurfaceInfoEXT(address, null);
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

    public static VkExportMetalIOSurfaceInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalIOSurfaceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMetalIOSurfaceInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalIOSurfaceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
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

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    public static void nioSurface(long struct, long value) {
        MemoryUtil.memPutAddress(struct + IOSURFACE, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + IOSURFACE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalIOSurfaceInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalIOSurfaceInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportMetalIOSurfaceInfoEXT, Buffer> implements NativeResource {
        private static final VkExportMetalIOSurfaceInfoEXT ELEMENT_FACTORY = VkExportMetalIOSurfaceInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportMetalIOSurfaceInfoEXT.SIZEOF);
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
        public VkExportMetalIOSurfaceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportMetalIOSurfaceInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportMetalIOSurfaceInfoEXT.npNext(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkExportMetalIOSurfaceInfoEXT.nimage(address());
        }

        @NativeType("IOSurfaceRef")
        public long ioSurface() {
            return VkExportMetalIOSurfaceInfoEXT.nioSurface(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMetalIOSurfaceInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMetalIOSurfaceInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkExportMetalIOSurfaceInfoEXT.nimage(address(), value);
            return this;
        }

        public Buffer ioSurface(@NativeType("IOSurfaceRef") long value) {
            VkExportMetalIOSurfaceInfoEXT.nioSurface(address(), value);
            return this;
        }
    }
}
