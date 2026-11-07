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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalTextureInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalTextureInfoEXT.class */
public class VkImportMetalTextureInfoEXT extends Struct<VkImportMetalTextureInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PLANE;
    public static final int MTLTEXTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PLANE = layout.offsetof(2);
        MTLTEXTURE = layout.offsetof(3);
    }

    protected VkImportMetalTextureInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportMetalTextureInfoEXT create(long address, ByteBuffer container) {
        return new VkImportMetalTextureInfoEXT(address, container);
    }

    public VkImportMetalTextureInfoEXT(ByteBuffer container) {
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

    @NativeType("VkImageAspectFlagBits")
    public int plane() {
        return nplane(address());
    }

    @NativeType("MTLTexture_id")
    public long mtlTexture() {
        return nmtlTexture(address());
    }

    public VkImportMetalTextureInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportMetalTextureInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT);
    }

    public VkImportMetalTextureInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportMetalTextureInfoEXT plane(@NativeType("VkImageAspectFlagBits") int value) {
        nplane(address(), value);
        return this;
    }

    public VkImportMetalTextureInfoEXT mtlTexture(@NativeType("MTLTexture_id") long value) {
        nmtlTexture(address(), value);
        return this;
    }

    public VkImportMetalTextureInfoEXT set(int sType, long pNext, int plane, long mtlTexture) {
        sType(sType);
        pNext(pNext);
        plane(plane);
        mtlTexture(mtlTexture);
        return this;
    }

    public VkImportMetalTextureInfoEXT set(VkImportMetalTextureInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportMetalTextureInfoEXT malloc() {
        return new VkImportMetalTextureInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportMetalTextureInfoEXT calloc() {
        return new VkImportMetalTextureInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportMetalTextureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMetalTextureInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImportMetalTextureInfoEXT create(long address) {
        return new VkImportMetalTextureInfoEXT(address, null);
    }

    public static VkImportMetalTextureInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportMetalTextureInfoEXT(address, null);
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

    public static VkImportMetalTextureInfoEXT malloc(MemoryStack stack) {
        return new VkImportMetalTextureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportMetalTextureInfoEXT calloc(MemoryStack stack) {
        return new VkImportMetalTextureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalTextureInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalTextureInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportMetalTextureInfoEXT, Buffer> implements NativeResource {
        private static final VkImportMetalTextureInfoEXT ELEMENT_FACTORY = VkImportMetalTextureInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportMetalTextureInfoEXT.SIZEOF);
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
        public VkImportMetalTextureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportMetalTextureInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportMetalTextureInfoEXT.npNext(address());
        }

        @NativeType("VkImageAspectFlagBits")
        public int plane() {
            return VkImportMetalTextureInfoEXT.nplane(address());
        }

        @NativeType("MTLTexture_id")
        public long mtlTexture() {
            return VkImportMetalTextureInfoEXT.nmtlTexture(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportMetalTextureInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportMetalTextureInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer plane(@NativeType("VkImageAspectFlagBits") int value) {
            VkImportMetalTextureInfoEXT.nplane(address(), value);
            return this;
        }

        public Buffer mtlTexture(@NativeType("MTLTexture_id") long value) {
            VkImportMetalTextureInfoEXT.nmtlTexture(address(), value);
            return this;
        }
    }
}
