package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.class */
public class VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT extends Struct<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LEGACYVERTEXATTRIBUTES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LEGACYVERTEXATTRIBUTES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean legacyVertexAttributes() {
        return nlegacyVertexAttributes(address()) != 0;
    }

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT sType$Default() {
        return sType(EXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT);
    }

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT legacyVertexAttributes(@NativeType("VkBool32") boolean value) {
        nlegacyVertexAttributes(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT set(int sType, long pNext, boolean legacyVertexAttributes) {
        sType(sType);
        pNext(pNext);
        legacyVertexAttributes(legacyVertexAttributes);
        return this;
    }

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT set(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT malloc() {
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT calloc() {
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT create(long address) {
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlegacyVertexAttributes(long struct) {
        return MemoryUtil.memGetInt(struct + LEGACYVERTEXATTRIBUTES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlegacyVertexAttributes(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEGACYVERTEXATTRIBUTES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean legacyVertexAttributes() {
            return VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.nlegacyVertexAttributes(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer legacyVertexAttributes(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT.nlegacyVertexAttributes(address(), value ? 1 : 0);
            return this;
        }
    }
}
