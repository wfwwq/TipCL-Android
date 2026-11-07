package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersGetInfoEXT.class */
public class VkVideoEncodeH265SessionParametersGetInfoEXT extends Struct<VkVideoEncodeH265SessionParametersGetInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH265SessionParametersGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionParametersGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(address, container);
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT(ByteBuffer container) {
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

    public VkVideoEncodeH265SessionParametersGetInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT sType$Default() {
        return sType(1000039013);
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT writeStdVPS(@NativeType("VkBool32") boolean value) {
        nwriteStdVPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT writeStdSPS(@NativeType("VkBool32") boolean value) {
        nwriteStdSPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT writeStdPPS(@NativeType("VkBool32") boolean value) {
        nwriteStdPPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT stdVPSId(@NativeType("uint32_t") int value) {
        nstdVPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT stdSPSId(@NativeType("uint32_t") int value) {
        nstdSPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT stdPPSId(@NativeType("uint32_t") int value) {
        nstdPPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersGetInfoEXT set(int sType, long pNext, boolean writeStdVPS, boolean writeStdSPS, boolean writeStdPPS, int stdVPSId, int stdSPSId, int stdPPSId) {
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

    public VkVideoEncodeH265SessionParametersGetInfoEXT set(VkVideoEncodeH265SessionParametersGetInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionParametersGetInfoEXT malloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoEXT calloc() {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoEXT create(long address) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265SessionParametersGetInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersGetInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nwriteStdVPS(long struct) {
        return UNSAFE.getInt((Object) null, struct + WRITESTDVPS);
    }

    public static int nwriteStdSPS(long struct) {
        return UNSAFE.getInt((Object) null, struct + WRITESTDSPS);
    }

    public static int nwriteStdPPS(long struct) {
        return UNSAFE.getInt((Object) null, struct + WRITESTDPPS);
    }

    public static int nstdVPSId(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDVPSID);
    }

    public static int nstdSPSId(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDSPSID);
    }

    public static int nstdPPSId(long struct) {
        return UNSAFE.getInt((Object) null, struct + STDPPSID);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwriteStdVPS(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + WRITESTDVPS, value);
    }

    public static void nwriteStdSPS(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + WRITESTDSPS, value);
    }

    public static void nwriteStdPPS(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + WRITESTDPPS, value);
    }

    public static void nstdVPSId(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDVPSID, value);
    }

    public static void nstdSPSId(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDSPSID, value);
    }

    public static void nstdPPSId(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDPPSID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersGetInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersGetInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionParametersGetInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersGetInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionParametersGetInfoEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH265SessionParametersGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean writeStdVPS() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdVPS(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean writeStdSPS() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdSPS(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean writeStdPPS() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdPPS(address()) != 0;
        }

        @NativeType("uint32_t")
        public int stdVPSId() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.nstdVPSId(address());
        }

        @NativeType("uint32_t")
        public int stdSPSId() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.nstdSPSId(address());
        }

        @NativeType("uint32_t")
        public int stdPPSId() {
            return VkVideoEncodeH265SessionParametersGetInfoEXT.nstdPPSId(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039013);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer writeStdVPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdVPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer writeStdSPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdSPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer writeStdPPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.nwriteStdPPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stdVPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.nstdVPSId(address(), value);
            return this;
        }

        public Buffer stdSPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.nstdSPSId(address(), value);
            return this;
        }

        public Buffer stdPPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersGetInfoEXT.nstdPPSId(address(), value);
            return this;
        }
    }
}
