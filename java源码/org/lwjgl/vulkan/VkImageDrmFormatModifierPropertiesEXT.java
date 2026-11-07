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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierPropertiesEXT.class */
public class VkImageDrmFormatModifierPropertiesEXT extends Struct<VkImageDrmFormatModifierPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DRMFORMATMODIFIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
    }

    protected VkImageDrmFormatModifierPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageDrmFormatModifierPropertiesEXT create(long address, ByteBuffer container) {
        return new VkImageDrmFormatModifierPropertiesEXT(address, container);
    }

    public VkImageDrmFormatModifierPropertiesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint64_t")
    public long drmFormatModifier() {
        return ndrmFormatModifier(address());
    }

    public VkImageDrmFormatModifierPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierPropertiesEXT sType$Default() {
        return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT);
    }

    public VkImageDrmFormatModifierPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkImageDrmFormatModifierPropertiesEXT set(VkImageDrmFormatModifierPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageDrmFormatModifierPropertiesEXT malloc() {
        return new VkImageDrmFormatModifierPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageDrmFormatModifierPropertiesEXT calloc() {
        return new VkImageDrmFormatModifierPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageDrmFormatModifierPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageDrmFormatModifierPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageDrmFormatModifierPropertiesEXT create(long address) {
        return new VkImageDrmFormatModifierPropertiesEXT(address, null);
    }

    public static VkImageDrmFormatModifierPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageDrmFormatModifierPropertiesEXT(address, null);
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

    public static VkImageDrmFormatModifierPropertiesEXT malloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageDrmFormatModifierPropertiesEXT calloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndrmFormatModifier(long struct) {
        return MemoryUtil.memGetLong(struct + DRMFORMATMODIFIER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageDrmFormatModifierPropertiesEXT, Buffer> implements NativeResource {
        private static final VkImageDrmFormatModifierPropertiesEXT ELEMENT_FACTORY = VkImageDrmFormatModifierPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageDrmFormatModifierPropertiesEXT.SIZEOF);
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
        public VkImageDrmFormatModifierPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageDrmFormatModifierPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkImageDrmFormatModifierPropertiesEXT.npNext(address());
        }

        @NativeType("uint64_t")
        public long drmFormatModifier() {
            return VkImageDrmFormatModifierPropertiesEXT.ndrmFormatModifier(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageDrmFormatModifierPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkImageDrmFormatModifierPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
