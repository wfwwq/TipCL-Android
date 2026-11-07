package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassFragmentDensityMapCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassFragmentDensityMapCreateInfoEXT.class */
public class VkRenderPassFragmentDensityMapCreateInfoEXT extends Struct<VkRenderPassFragmentDensityMapCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FRAGMENTDENSITYMAPATTACHMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkAttachmentReference.SIZEOF, VkAttachmentReference.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTDENSITYMAPATTACHMENT = layout.offsetof(2);
    }

    protected VkRenderPassFragmentDensityMapCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassFragmentDensityMapCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(address, container);
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT(ByteBuffer container) {
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

    public VkAttachmentReference fragmentDensityMapAttachment() {
        return nfragmentDensityMapAttachment(address());
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT sType$Default() {
        return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment(VkAttachmentReference value) {
        nfragmentDensityMapAttachment(address(), value);
        return this;
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment(Consumer<VkAttachmentReference> consumer) {
        consumer.accept(fragmentDensityMapAttachment());
        return this;
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT set(int sType, long pNext, VkAttachmentReference fragmentDensityMapAttachment) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapAttachment(fragmentDensityMapAttachment);
        return this;
    }

    public VkRenderPassFragmentDensityMapCreateInfoEXT set(VkRenderPassFragmentDensityMapCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT malloc() {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT calloc() {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT create(long address) {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(address, null);
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(address, null);
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

    public static VkRenderPassFragmentDensityMapCreateInfoEXT malloc(MemoryStack stack) {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT calloc(MemoryStack stack) {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkAttachmentReference nfragmentDensityMapAttachment(long struct) {
        return VkAttachmentReference.create(struct + FRAGMENTDENSITYMAPATTACHMENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfragmentDensityMapAttachment(long struct, VkAttachmentReference value) {
        MemoryUtil.memCopy(value.address(), struct + FRAGMENTDENSITYMAPATTACHMENT, VkAttachmentReference.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassFragmentDensityMapCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassFragmentDensityMapCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassFragmentDensityMapCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkRenderPassFragmentDensityMapCreateInfoEXT ELEMENT_FACTORY = VkRenderPassFragmentDensityMapCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassFragmentDensityMapCreateInfoEXT.SIZEOF);
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
        public VkRenderPassFragmentDensityMapCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassFragmentDensityMapCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassFragmentDensityMapCreateInfoEXT.npNext(address());
        }

        public VkAttachmentReference fragmentDensityMapAttachment() {
            return VkRenderPassFragmentDensityMapCreateInfoEXT.nfragmentDensityMapAttachment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassFragmentDensityMapCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassFragmentDensityMapCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer fragmentDensityMapAttachment(VkAttachmentReference value) {
            VkRenderPassFragmentDensityMapCreateInfoEXT.nfragmentDensityMapAttachment(address(), value);
            return this;
        }

        public Buffer fragmentDensityMapAttachment(Consumer<VkAttachmentReference> consumer) {
            consumer.accept(fragmentDensityMapAttachment());
            return this;
        }
    }
}
