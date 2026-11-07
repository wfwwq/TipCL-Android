package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.class */
public class VkVideoEncodeAV1QuantizationMapCapabilitiesKHR extends Struct<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MINQINDEXDELTA;
    public static final int MAXQINDEXDELTA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINQINDEXDELTA = layout.offsetof(2);
        MAXQINDEXDELTA = layout.offsetof(3);
    }

    protected VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(address, container);
    }

    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("int32_t")
    public int minQIndexDelta() {
        return nminQIndexDelta(address());
    }

    @NativeType("int32_t")
    public int maxQIndexDelta() {
        return nmaxQIndexDelta(address());
    }

    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sType$Default() {
        return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUANTIZATION_MAP_CAPABILITIES_KHR);
    }

    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR set(VkVideoEncodeAV1QuantizationMapCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR malloc() {
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR calloc() {
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR create(long address) {
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(address, null);
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(address, null);
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

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nminQIndexDelta(long struct) {
        return MemoryUtil.memGetInt(struct + MINQINDEXDELTA);
    }

    public static int nmaxQIndexDelta(long struct) {
        return MemoryUtil.memGetInt(struct + MAXQINDEXDELTA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1QuantizationMapCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1QuantizationMapCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1QuantizationMapCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.SIZEOF);
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
        public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.npNext(address());
        }

        @NativeType("int32_t")
        public int minQIndexDelta() {
            return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.nminQIndexDelta(address());
        }

        @NativeType("int32_t")
        public int maxQIndexDelta() {
            return VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.nmaxQIndexDelta(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUANTIZATION_MAP_CAPABILITIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
