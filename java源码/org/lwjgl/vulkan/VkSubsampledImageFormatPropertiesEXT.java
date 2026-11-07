package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubsampledImageFormatPropertiesEXT.class */
public class VkSubsampledImageFormatPropertiesEXT extends Struct<VkSubsampledImageFormatPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUBSAMPLEDIMAGEDESCRIPTORCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBSAMPLEDIMAGEDESCRIPTORCOUNT = layout.offsetof(2);
    }

    protected VkSubsampledImageFormatPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubsampledImageFormatPropertiesEXT create(long address, ByteBuffer container) {
        return new VkSubsampledImageFormatPropertiesEXT(address, container);
    }

    public VkSubsampledImageFormatPropertiesEXT(ByteBuffer container) {
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
    public int subsampledImageDescriptorCount() {
        return nsubsampledImageDescriptorCount(address());
    }

    public VkSubsampledImageFormatPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubsampledImageFormatPropertiesEXT sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT);
    }

    public VkSubsampledImageFormatPropertiesEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubsampledImageFormatPropertiesEXT subsampledImageDescriptorCount(@NativeType("uint32_t") int value) {
        nsubsampledImageDescriptorCount(address(), value);
        return this;
    }

    public VkSubsampledImageFormatPropertiesEXT set(int sType, long pNext, int subsampledImageDescriptorCount) {
        sType(sType);
        pNext(pNext);
        subsampledImageDescriptorCount(subsampledImageDescriptorCount);
        return this;
    }

    public VkSubsampledImageFormatPropertiesEXT set(VkSubsampledImageFormatPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubsampledImageFormatPropertiesEXT malloc() {
        return new VkSubsampledImageFormatPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubsampledImageFormatPropertiesEXT calloc() {
        return new VkSubsampledImageFormatPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubsampledImageFormatPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubsampledImageFormatPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSubsampledImageFormatPropertiesEXT create(long address) {
        return new VkSubsampledImageFormatPropertiesEXT(address, null);
    }

    public static VkSubsampledImageFormatPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubsampledImageFormatPropertiesEXT(address, null);
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

    public static VkSubsampledImageFormatPropertiesEXT malloc(MemoryStack stack) {
        return new VkSubsampledImageFormatPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubsampledImageFormatPropertiesEXT calloc(MemoryStack stack) {
        return new VkSubsampledImageFormatPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsubsampledImageDescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + SUBSAMPLEDIMAGEDESCRIPTORCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsubsampledImageDescriptorCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBSAMPLEDIMAGEDESCRIPTORCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubsampledImageFormatPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubsampledImageFormatPropertiesEXT, Buffer> implements NativeResource {
        private static final VkSubsampledImageFormatPropertiesEXT ELEMENT_FACTORY = VkSubsampledImageFormatPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubsampledImageFormatPropertiesEXT.SIZEOF);
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
        public VkSubsampledImageFormatPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubsampledImageFormatPropertiesEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubsampledImageFormatPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int subsampledImageDescriptorCount() {
            return VkSubsampledImageFormatPropertiesEXT.nsubsampledImageDescriptorCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubsampledImageFormatPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_SUBSAMPLED_IMAGE_FORMAT_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubsampledImageFormatPropertiesEXT.npNext(address(), value);
            return this;
        }

        public Buffer subsampledImageDescriptorCount(@NativeType("uint32_t") int value) {
            VkSubsampledImageFormatPropertiesEXT.nsubsampledImageDescriptorCount(address(), value);
            return this;
        }
    }
}
