package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersGetInfoKHR.class */
public class VkVideoEncodeH264SessionParametersGetInfoKHR extends Struct<VkVideoEncodeH264SessionParametersGetInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WRITESTDSPS;
    public static final int WRITESTDPPS;
    public static final int STDSPSID;
    public static final int STDPPSID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WRITESTDSPS = layout.offsetof(2);
        WRITESTDPPS = layout.offsetof(3);
        STDSPSID = layout.offsetof(4);
        STDPPSID = layout.offsetof(5);
    }

    protected VkVideoEncodeH264SessionParametersGetInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264SessionParametersGetInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(address, container);
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean writeStdSPS() {
        return nwriteStdSPS(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean writeStdPPS() {
        return nwriteStdPPS(address()) != 0;
    }

    @NativeType("uint32_t")
    public int stdSPSId() {
        return nstdSPSId(address());
    }

    @NativeType("uint32_t")
    public int stdPPSId() {
        return nstdPPSId(address());
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR sType$Default() {
        return sType(1000038012);
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdSPS(@NativeType("VkBool32") boolean value) {
        nwriteStdSPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdPPS(@NativeType("VkBool32") boolean value) {
        nwriteStdPPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR stdSPSId(@NativeType("uint32_t") int value) {
        nstdSPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR stdPPSId(@NativeType("uint32_t") int value) {
        nstdPPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR set(int sType, long pNext, boolean writeStdSPS, boolean writeStdPPS, int stdSPSId, int stdPPSId) {
        sType(sType);
        pNext(pNext);
        writeStdSPS(writeStdSPS);
        writeStdPPS(writeStdPPS);
        stdSPSId(stdSPSId);
        stdPPSId(stdPPSId);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoKHR set(VkVideoEncodeH264SessionParametersGetInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264SessionParametersGetInfoKHR malloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoKHR calloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoKHR create(long address) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(address, null);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(address, null);
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

    public static VkVideoEncodeH264SessionParametersGetInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwriteStdSPS(long struct) {
        return MemoryUtil.memGetInt(struct + WRITESTDSPS);
    }

    public static int nwriteStdPPS(long struct) {
        return MemoryUtil.memGetInt(struct + WRITESTDPPS);
    }

    public static int nstdSPSId(long struct) {
        return MemoryUtil.memGetInt(struct + STDSPSID);
    }

    public static int nstdPPSId(long struct) {
        return MemoryUtil.memGetInt(struct + STDPPSID);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwriteStdSPS(long struct, int value) {
        MemoryUtil.memPutInt(struct + WRITESTDSPS, value);
    }

    public static void nwriteStdPPS(long struct, int value) {
        MemoryUtil.memPutInt(struct + WRITESTDPPS, value);
    }

    public static void nstdSPSId(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDSPSID, value);
    }

    public static void nstdPPSId(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPPSID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersGetInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersGetInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264SessionParametersGetInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersGetInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264SessionParametersGetInfoKHR.SIZEOF);
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
        public VkVideoEncodeH264SessionParametersGetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264SessionParametersGetInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264SessionParametersGetInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean writeStdSPS() {
            return VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdSPS(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean writeStdPPS() {
            return VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdPPS(address()) != 0;
        }

        @NativeType("uint32_t")
        public int stdSPSId() {
            return VkVideoEncodeH264SessionParametersGetInfoKHR.nstdSPSId(address());
        }

        @NativeType("uint32_t")
        public int stdPPSId() {
            return VkVideoEncodeH264SessionParametersGetInfoKHR.nstdPPSId(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264SessionParametersGetInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038012);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264SessionParametersGetInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer writeStdSPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdSPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer writeStdPPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264SessionParametersGetInfoKHR.nwriteStdPPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stdSPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersGetInfoKHR.nstdSPSId(address(), value);
            return this;
        }

        public Buffer stdPPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersGetInfoKHR.nstdPPSId(address(), value);
            return this;
        }
    }
}
