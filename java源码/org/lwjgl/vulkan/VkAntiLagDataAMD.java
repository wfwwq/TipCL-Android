package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAntiLagDataAMD.class */
public class VkAntiLagDataAMD extends Struct<VkAntiLagDataAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MODE;
    public static final int MAXFPS;
    public static final int PPRESENTATIONINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODE = layout.offsetof(2);
        MAXFPS = layout.offsetof(3);
        PPRESENTATIONINFO = layout.offsetof(4);
    }

    protected VkAntiLagDataAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAntiLagDataAMD create(long address, ByteBuffer container) {
        return new VkAntiLagDataAMD(address, container);
    }

    public VkAntiLagDataAMD(ByteBuffer container) {
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

    @NativeType("VkAntiLagModeAMD")
    public int mode() {
        return nmode(address());
    }

    @NativeType("uint32_t")
    public int maxFPS() {
        return nmaxFPS(address());
    }

    @NativeType("VkAntiLagPresentationInfoAMD const *")
    public VkAntiLagPresentationInfoAMD pPresentationInfo() {
        return npPresentationInfo(address());
    }

    public VkAntiLagDataAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAntiLagDataAMD sType$Default() {
        return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD);
    }

    public VkAntiLagDataAMD pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAntiLagDataAMD mode(@NativeType("VkAntiLagModeAMD") int value) {
        nmode(address(), value);
        return this;
    }

    public VkAntiLagDataAMD maxFPS(@NativeType("uint32_t") int value) {
        nmaxFPS(address(), value);
        return this;
    }

    public VkAntiLagDataAMD pPresentationInfo(@NativeType("VkAntiLagPresentationInfoAMD const *") VkAntiLagPresentationInfoAMD value) {
        npPresentationInfo(address(), value);
        return this;
    }

    public VkAntiLagDataAMD set(int sType, long pNext, int mode, int maxFPS, VkAntiLagPresentationInfoAMD pPresentationInfo) {
        sType(sType);
        pNext(pNext);
        mode(mode);
        maxFPS(maxFPS);
        pPresentationInfo(pPresentationInfo);
        return this;
    }

    public VkAntiLagDataAMD set(VkAntiLagDataAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAntiLagDataAMD malloc() {
        return new VkAntiLagDataAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAntiLagDataAMD calloc() {
        return new VkAntiLagDataAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAntiLagDataAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAntiLagDataAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkAntiLagDataAMD create(long address) {
        return new VkAntiLagDataAMD(address, null);
    }

    public static VkAntiLagDataAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAntiLagDataAMD(address, null);
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

    public static VkAntiLagDataAMD malloc(MemoryStack stack) {
        return new VkAntiLagDataAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAntiLagDataAMD calloc(MemoryStack stack) {
        return new VkAntiLagDataAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmode(long struct) {
        return MemoryUtil.memGetInt(struct + MODE);
    }

    public static int nmaxFPS(long struct) {
        return MemoryUtil.memGetInt(struct + MAXFPS);
    }

    public static VkAntiLagPresentationInfoAMD npPresentationInfo(long struct) {
        return VkAntiLagPresentationInfoAMD.createSafe(MemoryUtil.memGetAddress(struct + PPRESENTATIONINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    public static void nmaxFPS(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXFPS, value);
    }

    public static void npPresentationInfo(long struct, VkAntiLagPresentationInfoAMD value) {
        MemoryUtil.memPutAddress(struct + PPRESENTATIONINFO, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAntiLagDataAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkAntiLagDataAMD, Buffer> implements NativeResource {
        private static final VkAntiLagDataAMD ELEMENT_FACTORY = VkAntiLagDataAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAntiLagDataAMD.SIZEOF);
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
        public VkAntiLagDataAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAntiLagDataAMD.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAntiLagDataAMD.npNext(address());
        }

        @NativeType("VkAntiLagModeAMD")
        public int mode() {
            return VkAntiLagDataAMD.nmode(address());
        }

        @NativeType("uint32_t")
        public int maxFPS() {
            return VkAntiLagDataAMD.nmaxFPS(address());
        }

        @NativeType("VkAntiLagPresentationInfoAMD const *")
        public VkAntiLagPresentationInfoAMD pPresentationInfo() {
            return VkAntiLagDataAMD.npPresentationInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAntiLagDataAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAntiLagDataAMD.npNext(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("VkAntiLagModeAMD") int value) {
            VkAntiLagDataAMD.nmode(address(), value);
            return this;
        }

        public Buffer maxFPS(@NativeType("uint32_t") int value) {
            VkAntiLagDataAMD.nmaxFPS(address(), value);
            return this;
        }

        public Buffer pPresentationInfo(@NativeType("VkAntiLagPresentationInfoAMD const *") VkAntiLagPresentationInfoAMD value) {
            VkAntiLagDataAMD.npPresentationInfo(address(), value);
            return this;
        }
    }
}
