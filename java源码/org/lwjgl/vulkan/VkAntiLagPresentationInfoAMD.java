package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAntiLagPresentationInfoAMD.class */
public class VkAntiLagPresentationInfoAMD extends Struct<VkAntiLagPresentationInfoAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STAGE;
    public static final int FRAMEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGE = layout.offsetof(2);
        FRAMEINDEX = layout.offsetof(3);
    }

    protected VkAntiLagPresentationInfoAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAntiLagPresentationInfoAMD create(long address, ByteBuffer container) {
        return new VkAntiLagPresentationInfoAMD(address, container);
    }

    public VkAntiLagPresentationInfoAMD(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkAntiLagStageAMD")
    public int stage() {
        return nstage(address());
    }

    @NativeType("uint64_t")
    public long frameIndex() {
        return nframeIndex(address());
    }

    public VkAntiLagPresentationInfoAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAntiLagPresentationInfoAMD sType$Default() {
        return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD);
    }

    public VkAntiLagPresentationInfoAMD pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAntiLagPresentationInfoAMD stage(@NativeType("VkAntiLagStageAMD") int value) {
        nstage(address(), value);
        return this;
    }

    public VkAntiLagPresentationInfoAMD frameIndex(@NativeType("uint64_t") long value) {
        nframeIndex(address(), value);
        return this;
    }

    public VkAntiLagPresentationInfoAMD set(int sType, long pNext, int stage, long frameIndex) {
        sType(sType);
        pNext(pNext);
        stage(stage);
        frameIndex(frameIndex);
        return this;
    }

    public VkAntiLagPresentationInfoAMD set(VkAntiLagPresentationInfoAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAntiLagPresentationInfoAMD malloc() {
        return new VkAntiLagPresentationInfoAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAntiLagPresentationInfoAMD calloc() {
        return new VkAntiLagPresentationInfoAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAntiLagPresentationInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAntiLagPresentationInfoAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkAntiLagPresentationInfoAMD create(long address) {
        return new VkAntiLagPresentationInfoAMD(address, null);
    }

    public static VkAntiLagPresentationInfoAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAntiLagPresentationInfoAMD(address, null);
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

    public static VkAntiLagPresentationInfoAMD malloc(MemoryStack stack) {
        return new VkAntiLagPresentationInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAntiLagPresentationInfoAMD calloc(MemoryStack stack) {
        return new VkAntiLagPresentationInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstage(long struct) {
        return MemoryUtil.memGetInt(struct + STAGE);
    }

    public static long nframeIndex(long struct) {
        return MemoryUtil.memGetLong(struct + FRAMEINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstage(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGE, value);
    }

    public static void nframeIndex(long struct, long value) {
        MemoryUtil.memPutLong(struct + FRAMEINDEX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAntiLagPresentationInfoAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkAntiLagPresentationInfoAMD, Buffer> implements NativeResource {
        private static final VkAntiLagPresentationInfoAMD ELEMENT_FACTORY = VkAntiLagPresentationInfoAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAntiLagPresentationInfoAMD.SIZEOF);
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
        public VkAntiLagPresentationInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAntiLagPresentationInfoAMD.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAntiLagPresentationInfoAMD.npNext(address());
        }

        @NativeType("VkAntiLagStageAMD")
        public int stage() {
            return VkAntiLagPresentationInfoAMD.nstage(address());
        }

        @NativeType("uint64_t")
        public long frameIndex() {
            return VkAntiLagPresentationInfoAMD.nframeIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAntiLagPresentationInfoAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDAntiLag.VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAntiLagPresentationInfoAMD.npNext(address(), value);
            return this;
        }

        public Buffer stage(@NativeType("VkAntiLagStageAMD") int value) {
            VkAntiLagPresentationInfoAMD.nstage(address(), value);
            return this;
        }

        public Buffer frameIndex(@NativeType("uint64_t") long value) {
            VkAntiLagPresentationInfoAMD.nframeIndex(address(), value);
            return this;
        }
    }
}
