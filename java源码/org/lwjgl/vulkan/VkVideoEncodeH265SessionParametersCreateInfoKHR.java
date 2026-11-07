package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersCreateInfoKHR.class */
public class VkVideoEncodeH265SessionParametersCreateInfoKHR extends Struct<VkVideoEncodeH265SessionParametersCreateInfoKHR> implements NativeResource {
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

    protected VkVideoEncodeH265SessionParametersCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionParametersCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(address, container);
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *")
    public VkVideoEncodeH265SessionParametersAddInfoKHR pParametersAddInfo() {
        return npParametersAddInfo(address());
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR sType$Default() {
        return sType(1000039001);
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdVPSCount(@NativeType("uint32_t") int value) {
        nmaxStdVPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdSPSCount(@NativeType("uint32_t") int value) {
        nmaxStdSPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdPPSCount(@NativeType("uint32_t") int value) {
        nmaxStdPPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR pParametersAddInfo(@NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *") VkVideoEncodeH265SessionParametersAddInfoKHR value) {
        npParametersAddInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR set(int sType, long pNext, int maxStdVPSCount, int maxStdSPSCount, int maxStdPPSCount, VkVideoEncodeH265SessionParametersAddInfoKHR pParametersAddInfo) {
        sType(sType);
        pNext(pNext);
        maxStdVPSCount(maxStdVPSCount);
        maxStdSPSCount(maxStdSPSCount);
        maxStdPPSCount(maxStdPPSCount);
        pParametersAddInfo(pParametersAddInfo);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoKHR set(VkVideoEncodeH265SessionParametersCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(address, null);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(address, null);
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

    public static VkVideoEncodeH265SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkVideoEncodeH265SessionParametersAddInfoKHR npParametersAddInfo(long struct) {
        return VkVideoEncodeH265SessionParametersAddInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PPARAMETERSADDINFO));
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

    public static void npParametersAddInfo(long struct, VkVideoEncodeH265SessionParametersAddInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PPARAMETERSADDINFO, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionParametersCreateInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionParametersCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265SessionParametersCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxStdVPSCount() {
            return VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdVPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdSPSCount() {
            return VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdSPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdPPSCount() {
            return VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdPPSCount(address());
        }

        @NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *")
        public VkVideoEncodeH265SessionParametersAddInfoKHR pParametersAddInfo() {
            return VkVideoEncodeH265SessionParametersCreateInfoKHR.npParametersAddInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265SessionParametersCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer maxStdVPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdVPSCount(address(), value);
            return this;
        }

        public Buffer maxStdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdSPSCount(address(), value);
            return this;
        }

        public Buffer maxStdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoKHR.nmaxStdPPSCount(address(), value);
            return this;
        }

        public Buffer pParametersAddInfo(@NativeType("VkVideoEncodeH265SessionParametersAddInfoKHR const *") VkVideoEncodeH265SessionParametersAddInfoKHR value) {
            VkVideoEncodeH265SessionParametersCreateInfoKHR.npParametersAddInfo(address(), value);
            return this;
        }
    }
}
