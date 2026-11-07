package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoFormatAV1QuantizationMapPropertiesKHR.class */
public class VkVideoFormatAV1QuantizationMapPropertiesKHR extends Struct<VkVideoFormatAV1QuantizationMapPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMPATIBLESUPERBLOCKSIZES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPATIBLESUPERBLOCKSIZES = layout.offsetof(2);
    }

    protected VkVideoFormatAV1QuantizationMapPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoFormatAV1QuantizationMapPropertiesKHR create(long address, ByteBuffer container) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(address, container);
    }

    public VkVideoFormatAV1QuantizationMapPropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
    public int compatibleSuperblockSizes() {
        return ncompatibleSuperblockSizes(address());
    }

    public VkVideoFormatAV1QuantizationMapPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoFormatAV1QuantizationMapPropertiesKHR sType$Default() {
        return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR);
    }

    public VkVideoFormatAV1QuantizationMapPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoFormatAV1QuantizationMapPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoFormatAV1QuantizationMapPropertiesKHR set(VkVideoFormatAV1QuantizationMapPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoFormatAV1QuantizationMapPropertiesKHR malloc() {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoFormatAV1QuantizationMapPropertiesKHR calloc() {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoFormatAV1QuantizationMapPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoFormatAV1QuantizationMapPropertiesKHR create(long address) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(address, null);
    }

    public static VkVideoFormatAV1QuantizationMapPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(address, null);
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

    public static VkVideoFormatAV1QuantizationMapPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoFormatAV1QuantizationMapPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoFormatAV1QuantizationMapPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncompatibleSuperblockSizes(long struct) {
        return MemoryUtil.memGetInt(struct + COMPATIBLESUPERBLOCKSIZES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoFormatAV1QuantizationMapPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoFormatAV1QuantizationMapPropertiesKHR, Buffer> implements NativeResource {
        private static final VkVideoFormatAV1QuantizationMapPropertiesKHR ELEMENT_FACTORY = VkVideoFormatAV1QuantizationMapPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoFormatAV1QuantizationMapPropertiesKHR.SIZEOF);
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
        public VkVideoFormatAV1QuantizationMapPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoFormatAV1QuantizationMapPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoFormatAV1QuantizationMapPropertiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeAV1SuperblockSizeFlagsKHR")
        public int compatibleSuperblockSizes() {
            return VkVideoFormatAV1QuantizationMapPropertiesKHR.ncompatibleSuperblockSizes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoFormatAV1QuantizationMapPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_FORMAT_AV1_QUANTIZATION_MAP_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoFormatAV1QuantizationMapPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
