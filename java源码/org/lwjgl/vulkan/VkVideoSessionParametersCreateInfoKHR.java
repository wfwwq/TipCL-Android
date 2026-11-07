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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionParametersCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionParametersCreateInfoKHR.class */
public class VkVideoSessionParametersCreateInfoKHR extends Struct<VkVideoSessionParametersCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int VIDEOSESSIONPARAMETERSTEMPLATE;
    public static final int VIDEOSESSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VIDEOSESSIONPARAMETERSTEMPLATE = layout.offsetof(3);
        VIDEOSESSION = layout.offsetof(4);
    }

    protected VkVideoSessionParametersCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoSessionParametersCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoSessionParametersCreateInfoKHR(address, container);
    }

    public VkVideoSessionParametersCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoSessionParametersCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkVideoSessionParametersKHR")
    public long videoSessionParametersTemplate() {
        return nvideoSessionParametersTemplate(address());
    }

    @NativeType("VkVideoSessionKHR")
    public long videoSession() {
        return nvideoSession(address());
    }

    public VkVideoSessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoSessionParametersCreateInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR);
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeAV1SessionParametersCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH264SessionParametersCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoDecodeH265SessionParametersCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeAV1SessionParametersCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH264SessionParametersCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeH265SessionParametersCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeQualityLevelInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR pNext(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionParametersCreateInfoKHR flags(@NativeType("VkVideoSessionParametersCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoSessionParametersCreateInfoKHR videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) {
        nvideoSessionParametersTemplate(address(), value);
        return this;
    }

    public VkVideoSessionParametersCreateInfoKHR videoSession(@NativeType("VkVideoSessionKHR") long value) {
        nvideoSession(address(), value);
        return this;
    }

    public VkVideoSessionParametersCreateInfoKHR set(int sType, long pNext, int flags, long videoSessionParametersTemplate, long videoSession) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        videoSessionParametersTemplate(videoSessionParametersTemplate);
        videoSession(videoSession);
        return this;
    }

    public VkVideoSessionParametersCreateInfoKHR set(VkVideoSessionParametersCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoSessionParametersCreateInfoKHR malloc() {
        return new VkVideoSessionParametersCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoSessionParametersCreateInfoKHR calloc() {
        return new VkVideoSessionParametersCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoSessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionParametersCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoSessionParametersCreateInfoKHR create(long address) {
        return new VkVideoSessionParametersCreateInfoKHR(address, null);
    }

    public static VkVideoSessionParametersCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoSessionParametersCreateInfoKHR(address, null);
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

    public static VkVideoSessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoSessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoSessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoSessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nvideoSessionParametersTemplate(long struct) {
        return MemoryUtil.memGetLong(struct + VIDEOSESSIONPARAMETERSTEMPLATE);
    }

    public static long nvideoSession(long struct) {
        return MemoryUtil.memGetLong(struct + VIDEOSESSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nvideoSessionParametersTemplate(long struct, long value) {
        MemoryUtil.memPutLong(struct + VIDEOSESSIONPARAMETERSTEMPLATE, value);
    }

    public static void nvideoSession(long struct, long value) {
        MemoryUtil.memPutLong(struct + VIDEOSESSION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionParametersCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionParametersCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoSessionParametersCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoSessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoSessionParametersCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoSessionParametersCreateInfoKHR.SIZEOF);
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
        public VkVideoSessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoSessionParametersCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoSessionParametersCreateInfoKHR.npNext(address());
        }

        @NativeType("VkVideoSessionParametersCreateFlagsKHR")
        public int flags() {
            return VkVideoSessionParametersCreateInfoKHR.nflags(address());
        }

        @NativeType("VkVideoSessionParametersKHR")
        public long videoSessionParametersTemplate() {
            return VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address());
        }

        @NativeType("VkVideoSessionKHR")
        public long videoSession() {
            return VkVideoSessionParametersCreateInfoKHR.nvideoSession(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoSessionParametersCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoSessionParametersCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoDecodeAV1SessionParametersCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH264SessionParametersCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoDecodeH265SessionParametersCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeAV1SessionParametersCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264SessionParametersCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265SessionParametersCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeQualityLevelInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkVideoSessionParametersCreateFlagsKHR") int value) {
            VkVideoSessionParametersCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer videoSessionParametersTemplate(@NativeType("VkVideoSessionParametersKHR") long value) {
            VkVideoSessionParametersCreateInfoKHR.nvideoSessionParametersTemplate(address(), value);
            return this;
        }

        public Buffer videoSession(@NativeType("VkVideoSessionKHR") long value) {
            VkVideoSessionParametersCreateInfoKHR.nvideoSession(address(), value);
            return this;
        }
    }
}
