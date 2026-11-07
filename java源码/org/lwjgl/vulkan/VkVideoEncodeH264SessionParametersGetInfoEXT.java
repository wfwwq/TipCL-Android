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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersGetInfoEXT.class */
public class VkVideoEncodeH264SessionParametersGetInfoEXT extends Struct<VkVideoEncodeH264SessionParametersGetInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH264SessionParametersGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264SessionParametersGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(address, container);
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT(ByteBuffer container) {
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

    public VkVideoEncodeH264SessionParametersGetInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT sType$Default() {
        return sType(1000038012);
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT writeStdSPS(@NativeType("VkBool32") boolean value) {
        nwriteStdSPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT writeStdPPS(@NativeType("VkBool32") boolean value) {
        nwriteStdPPS(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT stdSPSId(@NativeType("uint32_t") int value) {
        nstdSPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT stdPPSId(@NativeType("uint32_t") int value) {
        nstdPPSId(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT set(int sType, long pNext, boolean writeStdSPS, boolean writeStdPPS, int stdSPSId, int stdPPSId) {
        sType(sType);
        pNext(pNext);
        writeStdSPS(writeStdSPS);
        writeStdPPS(writeStdPPS);
        stdSPSId(stdSPSId);
        stdPPSId(stdPPSId);
        return this;
    }

    public VkVideoEncodeH264SessionParametersGetInfoEXT set(VkVideoEncodeH264SessionParametersGetInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264SessionParametersGetInfoEXT malloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoEXT calloc() {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoEXT create(long address) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264SessionParametersGetInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(address, null);
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

    public static VkVideoEncodeH264SessionParametersGetInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersGetInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nwriteStdSPS(long struct) {
        return UNSAFE.getInt((Object) null, struct + WRITESTDSPS);
    }

    public static int nwriteStdPPS(long struct) {
        return UNSAFE.getInt((Object) null, struct + WRITESTDPPS);
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

    public static void nwriteStdSPS(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + WRITESTDSPS, value);
    }

    public static void nwriteStdPPS(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + WRITESTDPPS, value);
    }

    public static void nstdSPSId(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDSPSID, value);
    }

    public static void nstdPPSId(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STDPPSID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersGetInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersGetInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264SessionParametersGetInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersGetInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264SessionParametersGetInfoEXT.SIZEOF);
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
        public VkVideoEncodeH264SessionParametersGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264SessionParametersGetInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264SessionParametersGetInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean writeStdSPS() {
            return VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdSPS(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean writeStdPPS() {
            return VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdPPS(address()) != 0;
        }

        @NativeType("uint32_t")
        public int stdSPSId() {
            return VkVideoEncodeH264SessionParametersGetInfoEXT.nstdSPSId(address());
        }

        @NativeType("uint32_t")
        public int stdPPSId() {
            return VkVideoEncodeH264SessionParametersGetInfoEXT.nstdPPSId(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264SessionParametersGetInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038012);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264SessionParametersGetInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer writeStdSPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdSPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer writeStdPPS(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264SessionParametersGetInfoEXT.nwriteStdPPS(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stdSPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersGetInfoEXT.nstdSPSId(address(), value);
            return this;
        }

        public Buffer stdPPSId(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersGetInfoEXT.nstdPPSId(address(), value);
            return this;
        }
    }
}
