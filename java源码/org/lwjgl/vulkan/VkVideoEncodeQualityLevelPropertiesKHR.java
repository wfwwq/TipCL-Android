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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQualityLevelPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQualityLevelPropertiesKHR.class */
public class VkVideoEncodeQualityLevelPropertiesKHR extends Struct<VkVideoEncodeQualityLevelPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PREFERREDRATECONTROLMODE;
    public static final int PREFERREDRATECONTROLLAYERCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDRATECONTROLMODE = layout.offsetof(2);
        PREFERREDRATECONTROLLAYERCOUNT = layout.offsetof(3);
    }

    protected VkVideoEncodeQualityLevelPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeQualityLevelPropertiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(address, container);
    }

    public VkVideoEncodeQualityLevelPropertiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
    public int preferredRateControlMode() {
        return npreferredRateControlMode(address());
    }

    @NativeType("uint32_t")
    public int preferredRateControlLayerCount() {
        return npreferredRateControlLayerCount(address());
    }

    public VkVideoEncodeQualityLevelPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeQualityLevelPropertiesKHR sType$Default() {
        return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR);
    }

    public VkVideoEncodeQualityLevelPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeQualityLevelPropertiesKHR pNext(VkVideoEncodeAV1QualityLevelPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeQualityLevelPropertiesKHR pNext(VkVideoEncodeH264QualityLevelPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeQualityLevelPropertiesKHR pNext(VkVideoEncodeH265QualityLevelPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoEncodeQualityLevelPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeQualityLevelPropertiesKHR set(VkVideoEncodeQualityLevelPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR malloc() {
        return new VkVideoEncodeQualityLevelPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR calloc() {
        return new VkVideoEncodeQualityLevelPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeQualityLevelPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR create(long address) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(address, null);
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeQualityLevelPropertiesKHR(address, null);
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

    public static VkVideoEncodeQualityLevelPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeQualityLevelPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npreferredRateControlMode(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDRATECONTROLMODE);
    }

    public static int npreferredRateControlLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERREDRATECONTROLLAYERCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQualityLevelPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQualityLevelPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeQualityLevelPropertiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeQualityLevelPropertiesKHR ELEMENT_FACTORY = VkVideoEncodeQualityLevelPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeQualityLevelPropertiesKHR.SIZEOF);
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
        public VkVideoEncodeQualityLevelPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeQualityLevelPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeQualityLevelPropertiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
        public int preferredRateControlMode() {
            return VkVideoEncodeQualityLevelPropertiesKHR.npreferredRateControlMode(address());
        }

        @NativeType("uint32_t")
        public int preferredRateControlLayerCount() {
            return VkVideoEncodeQualityLevelPropertiesKHR.npreferredRateControlLayerCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeQualityLevelPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeQualityLevelPropertiesKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoEncodeAV1QualityLevelPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264QualityLevelPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265QualityLevelPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
