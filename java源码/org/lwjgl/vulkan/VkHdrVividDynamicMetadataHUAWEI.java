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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHdrVividDynamicMetadataHUAWEI.class */
public class VkHdrVividDynamicMetadataHUAWEI extends Struct<VkHdrVividDynamicMetadataHUAWEI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DYNAMICMETADATASIZE;
    public static final int PDYNAMICMETADATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DYNAMICMETADATASIZE = layout.offsetof(2);
        PDYNAMICMETADATA = layout.offsetof(3);
    }

    protected VkHdrVividDynamicMetadataHUAWEI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkHdrVividDynamicMetadataHUAWEI create(long address, ByteBuffer container) {
        return new VkHdrVividDynamicMetadataHUAWEI(address, container);
    }

    public VkHdrVividDynamicMetadataHUAWEI(ByteBuffer container) {
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

    @NativeType("size_t")
    public long dynamicMetadataSize() {
        return ndynamicMetadataSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pDynamicMetadata() {
        return npDynamicMetadata(address());
    }

    public VkHdrVividDynamicMetadataHUAWEI sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkHdrVividDynamicMetadataHUAWEI sType$Default() {
        return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI);
    }

    public VkHdrVividDynamicMetadataHUAWEI pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadata(@NativeType("void const *") ByteBuffer value) {
        npDynamicMetadata(address(), value);
        return this;
    }

    public VkHdrVividDynamicMetadataHUAWEI set(int sType, long pNext, ByteBuffer pDynamicMetadata) {
        sType(sType);
        pNext(pNext);
        pDynamicMetadata(pDynamicMetadata);
        return this;
    }

    public VkHdrVividDynamicMetadataHUAWEI set(VkHdrVividDynamicMetadataHUAWEI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkHdrVividDynamicMetadataHUAWEI malloc() {
        return new VkHdrVividDynamicMetadataHUAWEI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkHdrVividDynamicMetadataHUAWEI calloc() {
        return new VkHdrVividDynamicMetadataHUAWEI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkHdrVividDynamicMetadataHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHdrVividDynamicMetadataHUAWEI(MemoryUtil.memAddress(container), container);
    }

    public static VkHdrVividDynamicMetadataHUAWEI create(long address) {
        return new VkHdrVividDynamicMetadataHUAWEI(address, null);
    }

    public static VkHdrVividDynamicMetadataHUAWEI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkHdrVividDynamicMetadataHUAWEI(address, null);
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

    public static VkHdrVividDynamicMetadataHUAWEI malloc(MemoryStack stack) {
        return new VkHdrVividDynamicMetadataHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkHdrVividDynamicMetadataHUAWEI calloc(MemoryStack stack) {
        return new VkHdrVividDynamicMetadataHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndynamicMetadataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + DYNAMICMETADATASIZE);
    }

    public static ByteBuffer npDynamicMetadata(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PDYNAMICMETADATA), (int) ndynamicMetadataSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndynamicMetadataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DYNAMICMETADATASIZE, value);
    }

    public static void npDynamicMetadata(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PDYNAMICMETADATA, MemoryUtil.memAddress(value));
        ndynamicMetadataSize(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDYNAMICMETADATA));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHdrVividDynamicMetadataHUAWEI$Buffer.class */
    public static class Buffer extends StructBuffer<VkHdrVividDynamicMetadataHUAWEI, Buffer> implements NativeResource {
        private static final VkHdrVividDynamicMetadataHUAWEI ELEMENT_FACTORY = VkHdrVividDynamicMetadataHUAWEI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkHdrVividDynamicMetadataHUAWEI.SIZEOF);
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
        public VkHdrVividDynamicMetadataHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkHdrVividDynamicMetadataHUAWEI.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkHdrVividDynamicMetadataHUAWEI.npNext(address());
        }

        @NativeType("size_t")
        public long dynamicMetadataSize() {
            return VkHdrVividDynamicMetadataHUAWEI.ndynamicMetadataSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pDynamicMetadata() {
            return VkHdrVividDynamicMetadataHUAWEI.npDynamicMetadata(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkHdrVividDynamicMetadataHUAWEI.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkHdrVividDynamicMetadataHUAWEI.npNext(address(), value);
            return this;
        }

        public Buffer pDynamicMetadata(@NativeType("void const *") ByteBuffer value) {
            VkHdrVividDynamicMetadataHUAWEI.npDynamicMetadata(address(), value);
            return this;
        }
    }
}
