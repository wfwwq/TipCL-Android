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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalTextureInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalTextureInfoEXT.class */
public class VkExportMetalTextureInfoEXT extends Struct<VkExportMetalTextureInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE;
    public static final int IMAGEVIEW;
    public static final int BUFFERVIEW;
    public static final int PLANE;
    public static final int MTLTEXTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        IMAGEVIEW = layout.offsetof(3);
        BUFFERVIEW = layout.offsetof(4);
        PLANE = layout.offsetof(5);
        MTLTEXTURE = layout.offsetof(6);
    }

    protected VkExportMetalTextureInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportMetalTextureInfoEXT create(long address, ByteBuffer container) {
        return new VkExportMetalTextureInfoEXT(address, container);
    }

    public VkExportMetalTextureInfoEXT(ByteBuffer container) {
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

    @NativeType("VkImageView")
    public long imageView() {
        return nimageView(address());
    }

    @NativeType("VkBufferView")
    public long bufferView() {
        return nbufferView(address());
    }

    @NativeType("VkImageAspectFlagBits")
    public int plane() {
        return nplane(address());
    }

    @NativeType("MTLTexture_id")
    public long mtlTexture() {
        return nmtlTexture(address());
    }

    public VkExportMetalTextureInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportMetalTextureInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT);
    }

    public VkExportMetalTextureInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportMetalTextureInfoEXT image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkExportMetalTextureInfoEXT imageView(@NativeType("VkImageView") long value) {
        nimageView(address(), value);
        return this;
    }

    public VkExportMetalTextureInfoEXT bufferView(@NativeType("VkBufferView") long value) {
        nbufferView(address(), value);
        return this;
    }

    public VkExportMetalTextureInfoEXT plane(@NativeType("VkImageAspectFlagBits") int value) {
        nplane(address(), value);
        return this;
    }

    public VkExportMetalTextureInfoEXT mtlTexture(@NativeType("MTLTexture_id") long value) {
        nmtlTexture(address(), value);
        return this;
    }

    public VkExportMetalTextureInfoEXT set(int sType, long pNext, long image, long imageView, long bufferView, int plane, long mtlTexture) {
        sType(sType);
        pNext(pNext);
        image(image);
        imageView(imageView);
        bufferView(bufferView);
        plane(plane);
        mtlTexture(mtlTexture);
        return this;
    }

    public VkExportMetalTextureInfoEXT set(VkExportMetalTextureInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMetalTextureInfoEXT malloc() {
        return new VkExportMetalTextureInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMetalTextureInfoEXT calloc() {
        return new VkExportMetalTextureInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMetalTextureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalTextureInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMetalTextureInfoEXT create(long address) {
        return new VkExportMetalTextureInfoEXT(address, null);
    }

    public static VkExportMetalTextureInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMetalTextureInfoEXT(address, null);
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

    public static VkExportMetalTextureInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalTextureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMetalTextureInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalTextureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimageView(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGEVIEW);
    }

    public static long nbufferView(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFERVIEW);
    }

    public static int nplane(long struct) {
        return MemoryUtil.memGetInt(struct + PLANE);
    }

    public static long nmtlTexture(long struct) {
        return MemoryUtil.memGetAddress(struct + MTLTEXTURE);
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

    public static void nimageView(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGEVIEW, value);
    }

    public static void nbufferView(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFERVIEW, value);
    }

    public static void nplane(long struct, int value) {
        MemoryUtil.memPutInt(struct + PLANE, value);
    }

    public static void nmtlTexture(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MTLTEXTURE, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + MTLTEXTURE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalTextureInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalTextureInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportMetalTextureInfoEXT, Buffer> implements NativeResource {
        private static final VkExportMetalTextureInfoEXT ELEMENT_FACTORY = VkExportMetalTextureInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportMetalTextureInfoEXT.SIZEOF);
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
        public VkExportMetalTextureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportMetalTextureInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportMetalTextureInfoEXT.npNext(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkExportMetalTextureInfoEXT.nimage(address());
        }

        @NativeType("VkImageView")
        public long imageView() {
            return VkExportMetalTextureInfoEXT.nimageView(address());
        }

        @NativeType("VkBufferView")
        public long bufferView() {
            return VkExportMetalTextureInfoEXT.nbufferView(address());
        }

        @NativeType("VkImageAspectFlagBits")
        public int plane() {
            return VkExportMetalTextureInfoEXT.nplane(address());
        }

        @NativeType("MTLTexture_id")
        public long mtlTexture() {
            return VkExportMetalTextureInfoEXT.nmtlTexture(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMetalTextureInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMetalTextureInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkExportMetalTextureInfoEXT.nimage(address(), value);
            return this;
        }

        public Buffer imageView(@NativeType("VkImageView") long value) {
            VkExportMetalTextureInfoEXT.nimageView(address(), value);
            return this;
        }

        public Buffer bufferView(@NativeType("VkBufferView") long value) {
            VkExportMetalTextureInfoEXT.nbufferView(address(), value);
            return this;
        }

        public Buffer plane(@NativeType("VkImageAspectFlagBits") int value) {
            VkExportMetalTextureInfoEXT.nplane(address(), value);
            return this;
        }

        public Buffer mtlTexture(@NativeType("MTLTexture_id") long value) {
            VkExportMetalTextureInfoEXT.nmtlTexture(address(), value);
            return this;
        }
    }
}
