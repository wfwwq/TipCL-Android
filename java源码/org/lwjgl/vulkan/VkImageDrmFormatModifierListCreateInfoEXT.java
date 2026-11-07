package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierListCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierListCreateInfoEXT.class */
public class VkImageDrmFormatModifierListCreateInfoEXT extends Struct<VkImageDrmFormatModifierListCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DRMFORMATMODIFIERCOUNT;
    public static final int PDRMFORMATMODIFIERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIERCOUNT = layout.offsetof(2);
        PDRMFORMATMODIFIERS = layout.offsetof(3);
    }

    protected VkImageDrmFormatModifierListCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageDrmFormatModifierListCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkImageDrmFormatModifierListCreateInfoEXT(address, container);
    }

    public VkImageDrmFormatModifierListCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int drmFormatModifierCount() {
        return ndrmFormatModifierCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pDrmFormatModifiers() {
        return npDrmFormatModifiers(address());
    }

    public VkImageDrmFormatModifierListCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierListCreateInfoEXT sType$Default() {
        return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
    }

    public VkImageDrmFormatModifierListCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiers(@NativeType("uint64_t const *") LongBuffer value) {
        npDrmFormatModifiers(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierListCreateInfoEXT set(int sType, long pNext, LongBuffer pDrmFormatModifiers) {
        sType(sType);
        pNext(pNext);
        pDrmFormatModifiers(pDrmFormatModifiers);
        return this;
    }

    public VkImageDrmFormatModifierListCreateInfoEXT set(VkImageDrmFormatModifierListCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT malloc() {
        return new VkImageDrmFormatModifierListCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT calloc() {
        return new VkImageDrmFormatModifierListCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageDrmFormatModifierListCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT create(long address) {
        return new VkImageDrmFormatModifierListCreateInfoEXT(address, null);
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageDrmFormatModifierListCreateInfoEXT(address, null);
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

    public static VkImageDrmFormatModifierListCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierListCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierListCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndrmFormatModifierCount(long struct) {
        return MemoryUtil.memGetInt(struct + DRMFORMATMODIFIERCOUNT);
    }

    public static LongBuffer npDrmFormatModifiers(long struct) {
        return MemoryUtil.memLongBuffer(MemoryUtil.memGetAddress(struct + PDRMFORMATMODIFIERS), ndrmFormatModifierCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndrmFormatModifierCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DRMFORMATMODIFIERCOUNT, value);
    }

    public static void npDrmFormatModifiers(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PDRMFORMATMODIFIERS, MemoryUtil.memAddress(value));
        ndrmFormatModifierCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDRMFORMATMODIFIERS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierListCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierListCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageDrmFormatModifierListCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkImageDrmFormatModifierListCreateInfoEXT ELEMENT_FACTORY = VkImageDrmFormatModifierListCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageDrmFormatModifierListCreateInfoEXT.SIZEOF);
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
        public VkImageDrmFormatModifierListCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageDrmFormatModifierListCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageDrmFormatModifierListCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int drmFormatModifierCount() {
            return VkImageDrmFormatModifierListCreateInfoEXT.ndrmFormatModifierCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pDrmFormatModifiers() {
            return VkImageDrmFormatModifierListCreateInfoEXT.npDrmFormatModifiers(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageDrmFormatModifierListCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageDrmFormatModifierListCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pDrmFormatModifiers(@NativeType("uint64_t const *") LongBuffer value) {
            VkImageDrmFormatModifierListCreateInfoEXT.npDrmFormatModifiers(address(), value);
            return this;
        }
    }
}
