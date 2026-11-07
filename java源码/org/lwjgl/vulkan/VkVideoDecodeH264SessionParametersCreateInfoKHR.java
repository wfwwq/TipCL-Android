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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersCreateInfoKHR.class */
public class VkVideoDecodeH264SessionParametersCreateInfoKHR extends Struct<VkVideoDecodeH264SessionParametersCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXSTDSPSCOUNT;
    public static final int MAXSTDPPSCOUNT;
    public static final int PPARAMETERSADDINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXSTDSPSCOUNT = layout.offsetof(2);
        MAXSTDPPSCOUNT = layout.offsetof(3);
        PPARAMETERSADDINFO = layout.offsetof(4);
    }

    protected VkVideoDecodeH264SessionParametersCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH264SessionParametersCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(address, container);
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR(ByteBuffer container) {
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
    public int maxStdSPSCount() {
        return nmaxStdSPSCount(address());
    }

    @NativeType("uint32_t")
    public int maxStdPPSCount() {
        return nmaxStdPPSCount(address());
    }

    @NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *")
    public VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo() {
        return npParametersAddInfo(address());
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR);
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdSPSCount(@NativeType("uint32_t") int value) {
        nmaxStdSPSCount(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdPPSCount(@NativeType("uint32_t") int value) {
        nmaxStdPPSCount(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR pParametersAddInfo(@NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *") VkVideoDecodeH264SessionParametersAddInfoKHR value) {
        npParametersAddInfo(address(), value);
        return this;
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR set(int sType, long pNext, int maxStdSPSCount, int maxStdPPSCount, VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo) {
        sType(sType);
        pNext(pNext);
        maxStdSPSCount(maxStdSPSCount);
        maxStdPPSCount(maxStdPPSCount);
        pParametersAddInfo(pParametersAddInfo);
        return this;
    }

    public VkVideoDecodeH264SessionParametersCreateInfoKHR set(VkVideoDecodeH264SessionParametersCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH264SessionParametersCreateInfoKHR malloc() {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH264SessionParametersCreateInfoKHR calloc() {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH264SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH264SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(address, null);
    }

    public static VkVideoDecodeH264SessionParametersCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(address, null);
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

    public static VkVideoDecodeH264SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH264SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxStdSPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSTDSPSCOUNT);
    }

    public static int nmaxStdPPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSTDPPSCOUNT);
    }

    public static VkVideoDecodeH264SessionParametersAddInfoKHR npParametersAddInfo(long struct) {
        return VkVideoDecodeH264SessionParametersAddInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PPARAMETERSADDINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxStdSPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSTDSPSCOUNT, value);
    }

    public static void nmaxStdPPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSTDPPSCOUNT, value);
    }

    public static void npParametersAddInfo(long struct, VkVideoDecodeH264SessionParametersAddInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PPARAMETERSADDINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        long pParametersAddInfo = MemoryUtil.memGetAddress(struct + PPARAMETERSADDINFO);
        if (pParametersAddInfo != 0) {
            VkVideoDecodeH264SessionParametersAddInfoKHR.validate(pParametersAddInfo);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264SessionParametersCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264SessionParametersCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH264SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264SessionParametersCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH264SessionParametersCreateInfoKHR.SIZEOF);
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
        public VkVideoDecodeH264SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH264SessionParametersCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH264SessionParametersCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxStdSPSCount() {
            return VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdSPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdPPSCount() {
            return VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdPPSCount(address());
        }

        @NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *")
        public VkVideoDecodeH264SessionParametersAddInfoKHR pParametersAddInfo() {
            return VkVideoDecodeH264SessionParametersCreateInfoKHR.npParametersAddInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH264SessionParametersCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH264.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH264SessionParametersCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer maxStdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdSPSCount(address(), value);
            return this;
        }

        public Buffer maxStdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoDecodeH264SessionParametersCreateInfoKHR.nmaxStdPPSCount(address(), value);
            return this;
        }

        public Buffer pParametersAddInfo(@NativeType("VkVideoDecodeH264SessionParametersAddInfoKHR const *") VkVideoDecodeH264SessionParametersAddInfoKHR value) {
            VkVideoDecodeH264SessionParametersCreateInfoKHR.npParametersAddInfo(address(), value);
            return this;
        }
    }
}
