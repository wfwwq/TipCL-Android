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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersCreateInfoKHR.class */
public class VkVideoDecodeH265SessionParametersCreateInfoKHR extends Struct<VkVideoDecodeH265SessionParametersCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXSTDVPSCOUNT;
    public static final int MAXSTDSPSCOUNT;
    public static final int MAXSTDPPSCOUNT;
    public static final int PPARAMETERSADDINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXSTDVPSCOUNT = layout.offsetof(2);
        MAXSTDSPSCOUNT = layout.offsetof(3);
        MAXSTDPPSCOUNT = layout.offsetof(4);
        PPARAMETERSADDINFO = layout.offsetof(5);
    }

    protected VkVideoDecodeH265SessionParametersCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH265SessionParametersCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(address, container);
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR(ByteBuffer container) {
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
    public int maxStdVPSCount() {
        return nmaxStdVPSCount(address());
    }

    @NativeType("uint32_t")
    public int maxStdSPSCount() {
        return nmaxStdSPSCount(address());
    }

    @NativeType("uint32_t")
    public int maxStdPPSCount() {
        return nmaxStdPPSCount(address());
    }

    @NativeType("VkVideoDecodeH265SessionParametersAddInfoKHR const *")
    public VkVideoDecodeH265SessionParametersAddInfoKHR pParametersAddInfo() {
        return npParametersAddInfo(address());
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR);
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdVPSCount(@NativeType("uint32_t") int value) {
        nmaxStdVPSCount(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdSPSCount(@NativeType("uint32_t") int value) {
        nmaxStdSPSCount(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR maxStdPPSCount(@NativeType("uint32_t") int value) {
        nmaxStdPPSCount(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR pParametersAddInfo(@NativeType("VkVideoDecodeH265SessionParametersAddInfoKHR const *") VkVideoDecodeH265SessionParametersAddInfoKHR value) {
        npParametersAddInfo(address(), value);
        return this;
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR set(int sType, long pNext, int maxStdVPSCount, int maxStdSPSCount, int maxStdPPSCount, VkVideoDecodeH265SessionParametersAddInfoKHR pParametersAddInfo) {
        sType(sType);
        pNext(pNext);
        maxStdVPSCount(maxStdVPSCount);
        maxStdSPSCount(maxStdSPSCount);
        maxStdPPSCount(maxStdPPSCount);
        pParametersAddInfo(pParametersAddInfo);
        return this;
    }

    public VkVideoDecodeH265SessionParametersCreateInfoKHR set(VkVideoDecodeH265SessionParametersCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR malloc() {
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR calloc() {
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(address, null);
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(address, null);
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

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxStdVPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSTDVPSCOUNT);
    }

    public static int nmaxStdSPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSTDSPSCOUNT);
    }

    public static int nmaxStdPPSCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSTDPPSCOUNT);
    }

    public static VkVideoDecodeH265SessionParametersAddInfoKHR npParametersAddInfo(long struct) {
        return VkVideoDecodeH265SessionParametersAddInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PPARAMETERSADDINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxStdVPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSTDVPSCOUNT, value);
    }

    public static void nmaxStdSPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSTDSPSCOUNT, value);
    }

    public static void nmaxStdPPSCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSTDPPSCOUNT, value);
    }

    public static void npParametersAddInfo(long struct, VkVideoDecodeH265SessionParametersAddInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PPARAMETERSADDINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        long pParametersAddInfo = MemoryUtil.memGetAddress(struct + PPARAMETERSADDINFO);
        if (pParametersAddInfo != 0) {
            VkVideoDecodeH265SessionParametersAddInfoKHR.validate(pParametersAddInfo);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265SessionParametersCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265SessionParametersCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH265SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265SessionParametersCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH265SessionParametersCreateInfoKHR.SIZEOF);
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
        public VkVideoDecodeH265SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH265SessionParametersCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH265SessionParametersCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxStdVPSCount() {
            return VkVideoDecodeH265SessionParametersCreateInfoKHR.nmaxStdVPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdSPSCount() {
            return VkVideoDecodeH265SessionParametersCreateInfoKHR.nmaxStdSPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdPPSCount() {
            return VkVideoDecodeH265SessionParametersCreateInfoKHR.nmaxStdPPSCount(address());
        }

        @NativeType("VkVideoDecodeH265SessionParametersAddInfoKHR const *")
        public VkVideoDecodeH265SessionParametersAddInfoKHR pParametersAddInfo() {
            return VkVideoDecodeH265SessionParametersCreateInfoKHR.npParametersAddInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH265SessionParametersCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH265SessionParametersCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer maxStdVPSCount(@NativeType("uint32_t") int value) {
            VkVideoDecodeH265SessionParametersCreateInfoKHR.nmaxStdVPSCount(address(), value);
            return this;
        }

        public Buffer maxStdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoDecodeH265SessionParametersCreateInfoKHR.nmaxStdSPSCount(address(), value);
            return this;
        }

        public Buffer maxStdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoDecodeH265SessionParametersCreateInfoKHR.nmaxStdPPSCount(address(), value);
            return this;
        }

        public Buffer pParametersAddInfo(@NativeType("VkVideoDecodeH265SessionParametersAddInfoKHR const *") VkVideoDecodeH265SessionParametersAddInfoKHR value) {
            VkVideoDecodeH265SessionParametersCreateInfoKHR.npParametersAddInfo(address(), value);
            return this;
        }
    }
}
