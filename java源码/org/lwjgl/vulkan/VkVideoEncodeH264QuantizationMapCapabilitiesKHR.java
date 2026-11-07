package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264QuantizationMapCapabilitiesKHR.class */
public class VkVideoEncodeH264QuantizationMapCapabilitiesKHR extends Struct<VkVideoEncodeH264QuantizationMapCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MINQPDELTA;
    public static final int MAXQPDELTA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINQPDELTA = layout.offsetof(2);
        MAXQPDELTA = layout.offsetof(3);
    }

    protected VkVideoEncodeH264QuantizationMapCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(address, container);
    }

    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR(ByteBuffer container) {
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
    public int minQpDelta() {
        return nminQpDelta(address());
    }

    @NativeType("int32_t")
    public int maxQpDelta() {
        return nmaxQpDelta(address());
    }

    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR sType$Default() {
        return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUANTIZATION_MAP_CAPABILITIES_KHR);
    }

    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH264QuantizationMapCapabilitiesKHR set(VkVideoEncodeH264QuantizationMapCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR malloc() {
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR calloc() {
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR create(long address) {
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(address, null);
    }

    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(address, null);
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

    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264QuantizationMapCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264QuantizationMapCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nminQpDelta(long struct) {
        return MemoryUtil.memGetInt(struct + MINQPDELTA);
    }

    public static int nmaxQpDelta(long struct) {
        return MemoryUtil.memGetInt(struct + MAXQPDELTA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264QuantizationMapCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264QuantizationMapCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264QuantizationMapCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeH264QuantizationMapCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264QuantizationMapCapabilitiesKHR.SIZEOF);
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
        public VkVideoEncodeH264QuantizationMapCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264QuantizationMapCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH264QuantizationMapCapabilitiesKHR.npNext(address());
        }

        @NativeType("int32_t")
        public int minQpDelta() {
            return VkVideoEncodeH264QuantizationMapCapabilitiesKHR.nminQpDelta(address());
        }

        @NativeType("int32_t")
        public int maxQpDelta() {
            return VkVideoEncodeH264QuantizationMapCapabilitiesKHR.nmaxQpDelta(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264QuantizationMapCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUANTIZATION_MAP_CAPABILITIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH264QuantizationMapCapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
