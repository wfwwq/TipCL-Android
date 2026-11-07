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
import org.lwjgl.vulkan.VkSubresourceLayout;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierExplicitCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierExplicitCreateInfoEXT.class */
public class VkImageDrmFormatModifierExplicitCreateInfoEXT extends Struct<VkImageDrmFormatModifierExplicitCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DRMFORMATMODIFIER;
    public static final int DRMFORMATMODIFIERPLANECOUNT;
    public static final int PPLANELAYOUTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(3);
        PPLANELAYOUTS = layout.offsetof(4);
    }

    protected VkImageDrmFormatModifierExplicitCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageDrmFormatModifierExplicitCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(address, container);
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long drmFormatModifier() {
        return ndrmFormatModifier(address());
    }

    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() {
        return ndrmFormatModifierPlaneCount(address());
    }

    @NativeType("VkSubresourceLayout const *")
    public VkSubresourceLayout.Buffer pPlaneLayouts() {
        return npPlaneLayouts(address());
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType$Default() {
        return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT);
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifier(@NativeType("uint64_t") long value) {
        ndrmFormatModifier(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayouts(@NativeType("VkSubresourceLayout const *") VkSubresourceLayout.Buffer value) {
        npPlaneLayouts(address(), value);
        return this;
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(int sType, long pNext, long drmFormatModifier, VkSubresourceLayout.Buffer pPlaneLayouts) {
        sType(sType);
        pNext(pNext);
        drmFormatModifier(drmFormatModifier);
        pPlaneLayouts(pPlaneLayouts);
        return this;
    }

    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(VkImageDrmFormatModifierExplicitCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT malloc() {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT calloc() {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT create(long address) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(address, null);
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(address, null);
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

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndrmFormatModifierPlaneCount(long struct) {
        return MemoryUtil.memGetInt(struct + DRMFORMATMODIFIERPLANECOUNT);
    }

    public static VkSubresourceLayout.Buffer npPlaneLayouts(long struct) {
        return VkSubresourceLayout.create(MemoryUtil.memGetAddress(struct + PPLANELAYOUTS), ndrmFormatModifierPlaneCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndrmFormatModifier(long struct, long value) {
        MemoryUtil.memPutLong(struct + DRMFORMATMODIFIER, value);
    }

    public static void ndrmFormatModifierPlaneCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DRMFORMATMODIFIERPLANECOUNT, value);
    }

    public static void npPlaneLayouts(long struct, VkSubresourceLayout.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPLANELAYOUTS, value.address());
        ndrmFormatModifierPlaneCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PPLANELAYOUTS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierExplicitCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageDrmFormatModifierExplicitCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageDrmFormatModifierExplicitCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkImageDrmFormatModifierExplicitCreateInfoEXT ELEMENT_FACTORY = VkImageDrmFormatModifierExplicitCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageDrmFormatModifierExplicitCreateInfoEXT.SIZEOF);
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
        public VkImageDrmFormatModifierExplicitCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageDrmFormatModifierExplicitCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageDrmFormatModifierExplicitCreateInfoEXT.npNext(address());
        }

        @NativeType("uint64_t")
        public long drmFormatModifier() {
            return VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifier(address());
        }

        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() {
            return VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifierPlaneCount(address());
        }

        @NativeType("VkSubresourceLayout const *")
        public VkSubresourceLayout.Buffer pPlaneLayouts() {
            return VkImageDrmFormatModifierExplicitCreateInfoEXT.npPlaneLayouts(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageDrmFormatModifierExplicitCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageDrmFormatModifierExplicitCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer drmFormatModifier(@NativeType("uint64_t") long value) {
            VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifier(address(), value);
            return this;
        }

        public Buffer pPlaneLayouts(@NativeType("VkSubresourceLayout const *") VkSubresourceLayout.Buffer value) {
            VkImageDrmFormatModifierExplicitCreateInfoEXT.npPlaneLayouts(address(), value);
            return this;
        }
    }
}
