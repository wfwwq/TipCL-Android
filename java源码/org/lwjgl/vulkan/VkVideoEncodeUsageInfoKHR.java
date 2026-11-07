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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeUsageInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeUsageInfoKHR.class */
public class VkVideoEncodeUsageInfoKHR extends Struct<VkVideoEncodeUsageInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOUSAGEHINTS;
    public static final int VIDEOCONTENTHINTS;
    public static final int TUNINGMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOUSAGEHINTS = layout.offsetof(2);
        VIDEOCONTENTHINTS = layout.offsetof(3);
        TUNINGMODE = layout.offsetof(4);
    }

    protected VkVideoEncodeUsageInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeUsageInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeUsageInfoKHR(address, container);
    }

    public VkVideoEncodeUsageInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeUsageFlagsKHR")
    public int videoUsageHints() {
        return nvideoUsageHints(address());
    }

    @NativeType("VkVideoEncodeContentFlagsKHR")
    public int videoContentHints() {
        return nvideoContentHints(address());
    }

    @NativeType("VkVideoEncodeTuningModeKHR")
    public int tuningMode() {
        return ntuningMode(address());
    }

    public VkVideoEncodeUsageInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeUsageInfoKHR sType$Default() {
        return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR);
    }

    public VkVideoEncodeUsageInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeUsageInfoKHR videoUsageHints(@NativeType("VkVideoEncodeUsageFlagsKHR") int value) {
        nvideoUsageHints(address(), value);
        return this;
    }

    public VkVideoEncodeUsageInfoKHR videoContentHints(@NativeType("VkVideoEncodeContentFlagsKHR") int value) {
        nvideoContentHints(address(), value);
        return this;
    }

    public VkVideoEncodeUsageInfoKHR tuningMode(@NativeType("VkVideoEncodeTuningModeKHR") int value) {
        ntuningMode(address(), value);
        return this;
    }

    public VkVideoEncodeUsageInfoKHR set(int sType, long pNext, int videoUsageHints, int videoContentHints, int tuningMode) {
        sType(sType);
        pNext(pNext);
        videoUsageHints(videoUsageHints);
        videoContentHints(videoContentHints);
        tuningMode(tuningMode);
        return this;
    }

    public VkVideoEncodeUsageInfoKHR set(VkVideoEncodeUsageInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeUsageInfoKHR malloc() {
        return new VkVideoEncodeUsageInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeUsageInfoKHR calloc() {
        return new VkVideoEncodeUsageInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeUsageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeUsageInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeUsageInfoKHR create(long address) {
        return new VkVideoEncodeUsageInfoKHR(address, null);
    }

    public static VkVideoEncodeUsageInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeUsageInfoKHR(address, null);
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

    public static VkVideoEncodeUsageInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeUsageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeUsageInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeUsageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoUsageHints(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOUSAGEHINTS);
    }

    public static int nvideoContentHints(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOCONTENTHINTS);
    }

    public static int ntuningMode(long struct) {
        return MemoryUtil.memGetInt(struct + TUNINGMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoUsageHints(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOUSAGEHINTS, value);
    }

    public static void nvideoContentHints(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOCONTENTHINTS, value);
    }

    public static void ntuningMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + TUNINGMODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeUsageInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeUsageInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeUsageInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeUsageInfoKHR ELEMENT_FACTORY = VkVideoEncodeUsageInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeUsageInfoKHR.SIZEOF);
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
        public VkVideoEncodeUsageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeUsageInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeUsageInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeUsageFlagsKHR")
        public int videoUsageHints() {
            return VkVideoEncodeUsageInfoKHR.nvideoUsageHints(address());
        }

        @NativeType("VkVideoEncodeContentFlagsKHR")
        public int videoContentHints() {
            return VkVideoEncodeUsageInfoKHR.nvideoContentHints(address());
        }

        @NativeType("VkVideoEncodeTuningModeKHR")
        public int tuningMode() {
            return VkVideoEncodeUsageInfoKHR.ntuningMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeUsageInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeUsageInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer videoUsageHints(@NativeType("VkVideoEncodeUsageFlagsKHR") int value) {
            VkVideoEncodeUsageInfoKHR.nvideoUsageHints(address(), value);
            return this;
        }

        public Buffer videoContentHints(@NativeType("VkVideoEncodeContentFlagsKHR") int value) {
            VkVideoEncodeUsageInfoKHR.nvideoContentHints(address(), value);
            return this;
        }

        public Buffer tuningMode(@NativeType("VkVideoEncodeTuningModeKHR") int value) {
            VkVideoEncodeUsageInfoKHR.ntuningMode(address(), value);
            return this;
        }
    }
}
