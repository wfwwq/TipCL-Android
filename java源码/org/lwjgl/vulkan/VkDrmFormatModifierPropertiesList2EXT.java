package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkDrmFormatModifierProperties2EXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesList2EXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesList2EXT.class */
public class VkDrmFormatModifierPropertiesList2EXT extends Struct<VkDrmFormatModifierPropertiesList2EXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DRMFORMATMODIFIERCOUNT;
    public static final int PDRMFORMATMODIFIERPROPERTIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIERCOUNT = layout.offsetof(2);
        PDRMFORMATMODIFIERPROPERTIES = layout.offsetof(3);
    }

    protected VkDrmFormatModifierPropertiesList2EXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrmFormatModifierPropertiesList2EXT create(long address, ByteBuffer container) {
        return new VkDrmFormatModifierPropertiesList2EXT(address, container);
    }

    public VkDrmFormatModifierPropertiesList2EXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int drmFormatModifierCount() {
        return ndrmFormatModifierCount(address());
    }

    @NativeType("VkDrmFormatModifierProperties2EXT *")
    public VkDrmFormatModifierProperties2EXT.Buffer pDrmFormatModifierProperties() {
        return npDrmFormatModifierProperties(address());
    }

    public VkDrmFormatModifierPropertiesList2EXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDrmFormatModifierPropertiesList2EXT sType$Default() {
        return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT);
    }

    public VkDrmFormatModifierPropertiesList2EXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDrmFormatModifierPropertiesList2EXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDrmFormatModifierPropertiesList2EXT set(VkDrmFormatModifierPropertiesList2EXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDrmFormatModifierPropertiesList2EXT malloc() {
        return new VkDrmFormatModifierPropertiesList2EXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDrmFormatModifierPropertiesList2EXT calloc() {
        return new VkDrmFormatModifierPropertiesList2EXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDrmFormatModifierPropertiesList2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrmFormatModifierPropertiesList2EXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDrmFormatModifierPropertiesList2EXT create(long address) {
        return new VkDrmFormatModifierPropertiesList2EXT(address, null);
    }

    public static VkDrmFormatModifierPropertiesList2EXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrmFormatModifierPropertiesList2EXT(address, null);
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

    public static VkDrmFormatModifierPropertiesList2EXT malloc(MemoryStack stack) {
        return new VkDrmFormatModifierPropertiesList2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDrmFormatModifierPropertiesList2EXT calloc(MemoryStack stack) {
        return new VkDrmFormatModifierPropertiesList2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDrmFormatModifierProperties2EXT.Buffer npDrmFormatModifierProperties(long struct) {
        return VkDrmFormatModifierProperties2EXT.createSafe(MemoryUtil.memGetAddress(struct + PDRMFORMATMODIFIERPROPERTIES), ndrmFormatModifierCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesList2EXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesList2EXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierPropertiesList2EXT, Buffer> implements NativeResource {
        private static final VkDrmFormatModifierPropertiesList2EXT ELEMENT_FACTORY = VkDrmFormatModifierPropertiesList2EXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrmFormatModifierPropertiesList2EXT.SIZEOF);
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
        public VkDrmFormatModifierPropertiesList2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDrmFormatModifierPropertiesList2EXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDrmFormatModifierPropertiesList2EXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int drmFormatModifierCount() {
            return VkDrmFormatModifierPropertiesList2EXT.ndrmFormatModifierCount(address());
        }

        @NativeType("VkDrmFormatModifierProperties2EXT *")
        public VkDrmFormatModifierProperties2EXT.Buffer pDrmFormatModifierProperties() {
            return VkDrmFormatModifierPropertiesList2EXT.npDrmFormatModifierProperties(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDrmFormatModifierPropertiesList2EXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDrmFormatModifierPropertiesList2EXT.npNext(address(), value);
            return this;
        }
    }
}
