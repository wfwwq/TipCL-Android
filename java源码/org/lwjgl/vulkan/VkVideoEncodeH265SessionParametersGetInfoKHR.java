package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersGetInfoKHR.class */
public class VkVideoEncodeH265SessionParametersGetInfoKHR extends Struct<VkVideoEncodeH265SessionParametersGetInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WRITESTDVPS;
    public static final int WRITESTDSPS;
    public static final int WRITESTDPPS;
    public static final int STDVPSID;
    public static final int STDSPSID;
    public static final int STDPPSID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WRITESTDVPS = layout.offsetof(2);
        WRITESTDSPS = layout.offsetof(3);
        WRITESTDPPS = layout.offsetof(4);
        STDVPSID = layout.offsetof(5);
        STDSPSID = layout.offsetof(6);
        STDPPSID = layout.offsetof(7);
    }

    protected VkVideoEncodeH265SessionParametersGetInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionParametersGetInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(address, container);
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR(ByteBuffer container) {
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
    public boolean writeStdVPS() {
        return nwriteStdVPS(address()) != 0;
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
    public int stdVPSId() {
        return nstdVPSId(address());
    }

    @NativeType("uint32_t")
    public int stdSPSId() {
        return nstdSPSId(address());
    }

    @NativeType("uint32_t")
    public int stdPPSId() {
        return nstdPPSId(address());
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR sType$Default() {
        return sType(1000039013);
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdVPS(@NativeType("VkBool32") boolean value) {
        nwriteStdVPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdSPS(@NativeType("VkBool32") boolean value) {
        nwriteStdSPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR writeStdPPS(@NativeType("VkBool32") boolean value) {
        nwriteStdPPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR stdVPSId(@NativeType("uint32_t") int value) {
        nstdVPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR stdSPSId(@NativeType("uint32_t") int value) {
        nstdSPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR stdPPSId(@NativeType("uint32_t") int value) {
        nstdPPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR set(int sType, long pNext, boolean writeStdVPS, boolean writeStdSPS, boolean writeStdPPS, int stdVPSId, int stdSPSId, int stdPPSId) {
        sType(sType);
        pNext(pNext);
        writeStdVPS(writeStdVPS);
        writeStdSPS(writeStdSPS);
        writeStdPPS(writeStdPPS);
        stdVPSId(stdVPSId);
        stdSPSId(stdSPSId);
        stdPPSId(stdPPSId);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoKHR set(VkVideoEncodeH265SessionParametersGetInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(address, null);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(address, null);
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

    public static VkVideoEncodeH265SessionParametersGetInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwriteStdVPS(long struct) {
        return MemoryUtil.memGetInt(struct + WRITESTDVPS);
    }

    public static int nwriteStdSPS(long struct) {
        return MemoryUtil.memGetInt(struct + WRITESTDSPS);
    }

    public static int nwriteStdPPS(long struct) {
        return MemoryUtil.memGetInt(struct + WRITESTDPPS);
    }

    public static int nstdVPSId(long struct) {
        return MemoryUtil.memGetInt(struct + STDVPSID);
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

    public static void nwriteStdVPS(long struct, int value) {
        MemoryUtil.memPutInt(struct + WRITESTDVPS, value);
    }

    public static void nwriteStdSPS(long struct, int value) {
        MemoryUtil.memPutInt(struct + WRITESTDSPS, value);
    }

    public static void nwriteStdPPS(long struct, int value) {
        MemoryUtil.memPutInt(struct + WRITESTDPPS, value);
    }

    public static void nstdVPSId(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDVPSID, value);
    }

    public static void nstdSPSId(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDSPSID, value);
    }

    public static void nstdPPSId(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPPSID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersGetInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersGetInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionParametersGetInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersGetInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionParametersGetInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265SessionParametersGetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean writeStdVPS() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdVPS(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean writeStdSPS() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdSPS(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean writeStdPPS() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdPPS(address()) != 0;
        }

        @NativeType("uint32_t")
        public int stdVPSId() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.nstdVPSId(address());
        }

        @NativeType("uint32_t")
        public int stdSPSId() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.nstdSPSId(address());
        }

        @NativeType("uint32_t")
        public int stdPPSId() {
            return VkVideoEncodeH265SessionParametersGetInfoKHR.nstdPPSId(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039013);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer writeStdVPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdVPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer writeStdSPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdSPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer writeStdPPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.nwriteStdPPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stdVPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.nstdVPSId(address(), value);
            return this;
        }

        public Buffer stdSPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.nstdSPSId(address(), value);
            return this;
        }

        public Buffer stdPPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersGetInfoKHR.nstdPPSId(address(), value);
            return this;
        }
    }
}
